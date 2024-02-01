package r2;

import d.m0;
import d.o0;
import d.t0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

@t0(19)
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12073a = 8;

    /* renamed from: b  reason: collision with root package name */
    public static final int f12074b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f12075c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f12076d = 4;

    public static int a(int i10) {
        return (((i10 + 8) - 1) & -8) / 8;
    }

    public static byte[] b(@m0 byte[] bArr) throws IOException {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
        throw th;
    }

    @m0
    public static RuntimeException c(@o0 String str) {
        return new IllegalStateException(str);
    }

    @m0
    public static byte[] d(@m0 InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                throw c("Not enough bytes to read: " + i10);
            }
        }
        return bArr;
    }

    @m0
    public static byte[] e(@m0 InputStream inputStream, int i10, int i11) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int i13 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int read = inputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i13 += inflater.inflate(bArr, i13, i11 - i13);
                    i12 += read;
                } else {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
            }
            if (i12 != i10) {
                throw c("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw c("Inflater did not finish");
            }
        } catch (DataFormatException e10) {
            throw c(e10.getMessage());
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    @m0
    public static String f(InputStream inputStream, int i10) throws IOException {
        return new String(d(inputStream, i10), StandardCharsets.UTF_8);
    }

    public static long g(@m0 InputStream inputStream, int i10) throws IOException {
        byte[] d10 = d(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (d10[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    public static int h(@m0 InputStream inputStream) throws IOException {
        return (int) g(inputStream, 2);
    }

    public static long i(@m0 InputStream inputStream) throws IOException {
        return g(inputStream, 4);
    }

    public static int j(@m0 InputStream inputStream) throws IOException {
        return (int) g(inputStream, 1);
    }

    public static int k(@m0 String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void l(@m0 InputStream inputStream, @m0 OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void m(@m0 OutputStream outputStream, byte[] bArr) throws IOException {
        q(outputStream, (long) bArr.length);
        byte[] b10 = b(bArr);
        q(outputStream, (long) b10.length);
        outputStream.write(b10);
    }

    public static void n(@m0 OutputStream outputStream, @m0 String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void o(@m0 OutputStream outputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((int) ((j10 >> (i11 * 8)) & 255));
        }
        outputStream.write(bArr);
    }

    public static void p(@m0 OutputStream outputStream, int i10) throws IOException {
        o(outputStream, (long) i10, 2);
    }

    public static void q(@m0 OutputStream outputStream, long j10) throws IOException {
        o(outputStream, j10, 4);
    }

    public static void r(@m0 OutputStream outputStream, int i10) throws IOException {
        o(outputStream, (long) i10, 1);
    }
}
