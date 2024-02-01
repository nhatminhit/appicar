package n0;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import y0.f;
import zb.r;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class e1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10708a = "TypefaceCompatUtil";

    /* renamed from: b  reason: collision with root package name */
    public static final String f10709b = ".font";

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @t0(19)
    @o0
    public static ByteBuffer b(Context context, Resources resources, int i10) {
        File e10 = e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (!c(e10, resources, i10)) {
                return null;
            }
            ByteBuffer g10 = g(e10);
            e10.delete();
            return g10;
        } finally {
            e10.delete();
        }
    }

    public static boolean c(File file, Resources resources, int i10) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i10);
            try {
                boolean d10 = d(file, inputStream);
                a(inputStream);
                return d10;
            } catch (Throwable th2) {
                th = th2;
                a(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            a(inputStream);
            throw th;
        }
    }

    public static boolean d(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        a(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e10) {
                e = e10;
                fileOutputStream = fileOutputStream2;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error copying resource contents to temp file: ");
                    sb2.append(e.getMessage());
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                a(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Error copying resource contents to temp file: ");
            sb22.append(e.getMessage());
            a(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    @o0
    public static File e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = f10709b + Process.myPid() + "-" + Process.myTid() + "-";
        int i10 = 0;
        while (i10 < 100) {
            File file = new File(cacheDir, str + i10);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i10++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @t0(19)
    @o0
    public static ByteBuffer f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        FileInputStream fileInputStream;
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, r.f25096b, cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } catch (Throwable th2) {
                openFileDescriptor.close();
                throw th2;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    @t0(19)
    @o0
    public static ByteBuffer g(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    @t0(19)
    @m0
    @x0({x0.a.LIBRARY})
    public static Map<Uri, ByteBuffer> h(@m0 Context context, @m0 f.c[] cVarArr, @o0 CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f.c cVar : cVarArr) {
            if (cVar.b() == 0) {
                Uri d10 = cVar.d();
                if (!hashMap.containsKey(d10)) {
                    hashMap.put(d10, f(context, cancellationSignal, d10));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
