package w8;

import android.util.Base64;
import d.m0;
import e8.a;

@a
public final class c {
    @a
    @m0
    public static byte[] a(@m0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @a
    @m0
    public static byte[] b(@m0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @a
    @m0
    public static byte[] c(@m0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @a
    @m0
    public static String d(@m0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @a
    @m0
    public static String e(@m0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @a
    @m0
    public static String f(@m0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
