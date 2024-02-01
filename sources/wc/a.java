package wc;

import hh.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import og.b0;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f24026a = "UTF-8";

    /* renamed from: b  reason: collision with root package name */
    public static final String f24027b = "ISO-8859-1";

    public static byte[] a(String str) {
        return b(str, "UTF-8");
    }

    public static byte[] b(String str, String str2) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(str2));
            gZIPOutputStream.close();
        } catch (IOException unused) {
        }
        System.out.println("gzip compress error");
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean c(b0 b0Var) {
        for (String next : b0Var.i()) {
            if ((next.equalsIgnoreCase("Accept-Encoding") && b0Var.d(next).contains("gzip")) || (next.equalsIgnoreCase(c.f19570c) && b0Var.d(next).contains("gzip"))) {
                return true;
            }
        }
        return false;
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            byte[] bArr2 = new byte[256];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException unused) {
            System.out.println("gzip uncompress error.");
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String e(byte[] bArr) {
        return f(bArr, "UTF-8");
    }

    public static String f(byte[] bArr, String str) {
        if (!(bArr == null || bArr.length == 0)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                byte[] bArr2 = new byte[256];
                while (true) {
                    int read = gZIPInputStream.read(bArr2);
                    if (read < 0) {
                        return byteArrayOutputStream.toString(str);
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
            } catch (IOException unused) {
                System.out.println("gzip uncompress to string error");
            }
        }
        return null;
    }
}
