package gc;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

public final class j0 {
    public static final String A = "removed";
    public static final String B = "delivered";
    public static final String C = "replaying";
    public static final String D = "completed";
    public static final String E = "errored";
    public static final String F = "paused";
    public static final String G = "resumed";
    public static final int H = 12;
    public static final String I = "RIFF";
    public static final String J = "WEBP";

    /* renamed from: a  reason: collision with root package name */
    public static final String f19072a = "Picasso-";

    /* renamed from: b  reason: collision with root package name */
    public static final String f19073b = "Picasso-Idle";

    /* renamed from: c  reason: collision with root package name */
    public static final int f19074c = 20000;

    /* renamed from: d  reason: collision with root package name */
    public static final int f19075d = 20000;

    /* renamed from: e  reason: collision with root package name */
    public static final int f19076e = 15000;

    /* renamed from: f  reason: collision with root package name */
    public static final String f19077f = "picasso-cache";

    /* renamed from: g  reason: collision with root package name */
    public static final int f19078g = 50;

    /* renamed from: h  reason: collision with root package name */
    public static final int f19079h = 5242880;

    /* renamed from: i  reason: collision with root package name */
    public static final int f19080i = 52428800;

    /* renamed from: j  reason: collision with root package name */
    public static final int f19081j = 1000;

    /* renamed from: k  reason: collision with root package name */
    public static final char f19082k = '\n';

    /* renamed from: l  reason: collision with root package name */
    public static final StringBuilder f19083l = new StringBuilder();

    /* renamed from: m  reason: collision with root package name */
    public static final String f19084m = "Main";

    /* renamed from: n  reason: collision with root package name */
    public static final String f19085n = "Dispatcher";

    /* renamed from: o  reason: collision with root package name */
    public static final String f19086o = "Hunter";

    /* renamed from: p  reason: collision with root package name */
    public static final String f19087p = "created";

    /* renamed from: q  reason: collision with root package name */
    public static final String f19088q = "changed";

    /* renamed from: r  reason: collision with root package name */
    public static final String f19089r = "ignored";

    /* renamed from: s  reason: collision with root package name */
    public static final String f19090s = "enqueued";

    /* renamed from: t  reason: collision with root package name */
    public static final String f19091t = "canceled";

    /* renamed from: u  reason: collision with root package name */
    public static final String f19092u = "batched";

    /* renamed from: v  reason: collision with root package name */
    public static final String f19093v = "retrying";

    /* renamed from: w  reason: collision with root package name */
    public static final String f19094w = "executing";

    /* renamed from: x  reason: collision with root package name */
    public static final String f19095x = "decoded";

    /* renamed from: y  reason: collision with root package name */
    public static final String f19096y = "transformed";

    /* renamed from: z  reason: collision with root package name */
    public static final String f19097z = "joined";

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000);
        }
    }

    @TargetApi(11)
    public static class b {
        public static int a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    @TargetApi(12)
    public static class c {
        public static int a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    public static class d {
        public static j a(Context context) {
            return new u(context);
        }
    }

    public static class e extends Thread {
        public e(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    public static class f implements ThreadFactory {
        public Thread newThread(Runnable runnable) {
            return new e(runnable);
        }
    }

    public static long a(File file) {
        long j10;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j10 = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j10 = 5242880;
        }
        return Math.max(Math.min(j10, 52428800), u7.b.f13766l);
    }

    public static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) q(context, androidx.appcompat.widget.c.f1244r);
        boolean z10 = (context.getApplicationInfo().flags & 1048576) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z10) {
            memoryClass = b.a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    public static void c() {
        if (!t()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    public static void d() {
        if (t()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    public static <T> T e(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void f(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static File g(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), f19077f);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static j h(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return d.a(context);
        } catch (ClassNotFoundException unused) {
            return new i0(context);
        }
    }

    public static String i(z zVar) {
        StringBuilder sb2 = f19083l;
        String j10 = j(zVar, sb2);
        sb2.setLength(0);
        return j10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String j(gc.z r4, java.lang.StringBuilder r5) {
        /*
            java.lang.String r0 = r4.f19167f
            r1 = 50
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.String r0 = r4.f19167f
        L_0x0010:
            r5.append(r0)
            goto L_0x002d
        L_0x0014:
            android.net.Uri r0 = r4.f19165d
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
            goto L_0x0010
        L_0x0025:
            r5.ensureCapacity(r1)
            int r0 = r4.f19166e
            r5.append(r0)
        L_0x002d:
            r0 = 10
            r5.append(r0)
            float r1 = r4.f19174m
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r2 = 120(0x78, float:1.68E-43)
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "rotation:"
            r5.append(r1)
            float r1 = r4.f19174m
            r5.append(r1)
            boolean r1 = r4.f19177p
            if (r1 == 0) goto L_0x005b
            r1 = 64
            r5.append(r1)
            float r1 = r4.f19175n
            r5.append(r1)
            r5.append(r2)
            float r1 = r4.f19176o
            r5.append(r1)
        L_0x005b:
            r5.append(r0)
        L_0x005e:
            boolean r1 = r4.d()
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = "resize:"
            r5.append(r1)
            int r1 = r4.f19169h
            r5.append(r1)
            r5.append(r2)
            int r1 = r4.f19170i
            r5.append(r1)
            r5.append(r0)
        L_0x0079:
            boolean r1 = r4.f19171j
            if (r1 == 0) goto L_0x0086
            java.lang.String r1 = "centerCrop"
        L_0x007f:
            r5.append(r1)
            r5.append(r0)
            goto L_0x008d
        L_0x0086:
            boolean r1 = r4.f19172k
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = "centerInside"
            goto L_0x007f
        L_0x008d:
            java.util.List<gc.h0> r1 = r4.f19168g
            if (r1 == 0) goto L_0x00ad
            r2 = 0
            int r1 = r1.size()
        L_0x0096:
            if (r2 >= r1) goto L_0x00ad
            java.util.List<gc.h0> r3 = r4.f19168g
            java.lang.Object r3 = r3.get(r2)
            gc.h0 r3 = (gc.h0) r3
            java.lang.String r3 = r3.a()
            r5.append(r3)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x0096
        L_0x00ad:
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.j0.j(gc.z, java.lang.StringBuilder):java.lang.String");
    }

    public static void k(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000);
    }

    public static int l(Bitmap bitmap) {
        int a10 = c.a(bitmap);
        if (a10 >= 0) {
            return a10;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String m(c cVar) {
        return n(cVar, "");
    }

    public static String n(c cVar, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        a h10 = cVar.h();
        if (h10 != null) {
            sb2.append(h10.f18946b.e());
        }
        List<a> i10 = cVar.i();
        if (i10 != null) {
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 > 0 || h10 != null) {
                    sb2.append(", ");
                }
                sb2.append(i10.get(i11).f18946b.e());
            }
        }
        return sb2.toString();
    }

    public static int o(Resources resources, z zVar) throws FileNotFoundException {
        Uri uri;
        int i10 = zVar.f19166e;
        if (i10 != 0 || (uri = zVar.f19165d) == null) {
            return i10;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            List<String> pathSegments = zVar.f19165d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException("No path segments: " + zVar.f19165d);
            } else if (pathSegments.size() == 1) {
                try {
                    return Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Last path segment is not a resource ID: " + zVar.f19165d);
                }
            } else if (pathSegments.size() == 2) {
                return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + zVar.f19165d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + zVar.f19165d);
        }
    }

    public static Resources p(Context context, z zVar) throws FileNotFoundException {
        Uri uri;
        if (zVar.f19166e != 0 || (uri = zVar.f19165d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException("Unable to obtain resources for package: " + zVar.f19165d);
            }
        } else {
            throw new FileNotFoundException("No package provided: " + zVar.f19165d);
        }
    }

    public static <T> T q(Context context, String str) {
        return context.getSystemService(str);
    }

    public static boolean r(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean s(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public static boolean t() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean u(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        return inputStream.read(bArr, 0, 12) == 12 && I.equals(new String(bArr, 0, 4, b6.c.f4237k)) && J.equals(new String(bArr, 8, 4, b6.c.f4237k));
    }

    public static void v(String str, String str2, String str3) {
        w(str, str2, str3, "");
    }

    public static void w(String str, String str2, String str3, String str4) {
        String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4});
    }

    public static boolean x(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            return "CONDITIONAL_CACHE".equals(split[0]) && Integer.parseInt(split[1]) == 304;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static byte[] y(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
