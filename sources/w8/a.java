package w8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import d.m0;
import d.o0;
import j8.w;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import y8.e;

@e8.a
@w
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f14890a = -1;

    @e8.a
    @o0
    @Deprecated
    public static byte[] a(@m0 Context context, @m0 String str) throws PackageManager.NameNotFoundException {
        MessageDigest b10;
        PackageInfo f10 = e.a(context).f(str, 64);
        Signature[] signatureArr = f10.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b10 = b("SHA1")) == null) {
            return null;
        }
        return b10.digest(f10.signatures[0].toByteArray());
    }

    @o0
    public static MessageDigest b(@m0 String str) {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
