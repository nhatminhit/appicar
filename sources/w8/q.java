package w8;

import android.os.ParcelFileDescriptor;
import d.m0;
import e8.a;
import j8.s;
import j8.w;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@a
@w
@Deprecated
public final class q {
    @a
    public static void a(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @a
    public static void b(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @a
    @Deprecated
    public static long c(@m0 InputStream inputStream, @m0 OutputStream outputStream) throws IOException {
        return d(inputStream, outputStream, false, 1024);
    }

    @a
    @Deprecated
    public static long d(@m0 InputStream inputStream, @m0 OutputStream outputStream, boolean z10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        long j10 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i10);
                if (read == -1) {
                    break;
                }
                j10 += (long) read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th2) {
                if (z10) {
                    b(inputStream);
                    b(outputStream);
                }
                throw th2;
            }
        }
        if (z10) {
            b(inputStream);
            b(outputStream);
        }
        return j10;
    }

    @a
    public static boolean e(@m0 byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @a
    @m0
    @Deprecated
    public static byte[] f(@m0 InputStream inputStream) throws IOException {
        return g(inputStream, true);
    }

    @a
    @m0
    @Deprecated
    public static byte[] g(@m0 InputStream inputStream, boolean z10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d(inputStream, byteArrayOutputStream, z10, 1024);
        return byteArrayOutputStream.toByteArray();
    }

    @a
    @m0
    @Deprecated
    public static byte[] h(@m0 InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        s.l(inputStream);
        s.l(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
