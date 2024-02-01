package j0;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import d.m0;
import d.o0;
import d.t0;
import d.y0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d {

    @t0(28)
    public static class a {
        @o0
        public static Signature[] a(@m0 SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @o0
        public static Signature[] b(@m0 SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        public static boolean c(@m0 SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        public static boolean d(@m0 PackageManager packageManager, @m0 String str, @m0 byte[] bArr, int i10) {
            return packageManager.hasSigningCertificate(str, bArr, i10);
        }
    }

    public static boolean a(@m0 byte[][] bArr, @m0 byte[] bArr2) {
        for (byte[] equals : bArr) {
            if (Arrays.equals(bArr2, equals)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e10);
        }
    }

    public static long c(@m0 PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode;
    }

    @m0
    public static List<Signature> d(@m0 PackageManager packageManager, @m0 String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            signatureArr = a.c(signingInfo) ? a.a(signingInfo) : a.b(signingInfo);
        } else {
            signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        }
        return signatureArr == null ? Collections.emptyList() : Arrays.asList(signatureArr);
    }

    public static boolean e(@m0 PackageManager packageManager, @m0 String str, @m0 @y0(min = 1) Map<byte[], Integer> map, boolean z10) throws PackageManager.NameNotFoundException {
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> keySet = map.keySet();
        for (byte[] next : keySet) {
            if (next != null) {
                Integer num = map.get(next);
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue != 0 && intValue != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
                    }
                } else {
                    throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
                }
            } else {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
        }
        List<Signature> d10 = d(packageManager, str);
        if (z10 || Build.VERSION.SDK_INT < 28) {
            if (d10.size() != 0 && map.size() <= d10.size() && (!z10 || map.size() == d10.size())) {
                byte[][] bArr = null;
                if (map.containsValue(1)) {
                    bArr = new byte[d10.size()][];
                    for (int i10 = 0; i10 < d10.size(); i10++) {
                        bArr[i10] = b(d10.get(i10).toByteArray());
                    }
                }
                Iterator<byte[]> it = keySet.iterator();
                if (it.hasNext()) {
                    byte[] next2 = it.next();
                    Integer num2 = map.get(next2);
                    int intValue2 = num2.intValue();
                    if (intValue2 != 0) {
                        if (intValue2 != 1) {
                            throw new IllegalArgumentException("Unsupported certificate type " + num2);
                        } else if (!a(bArr, next2)) {
                            return false;
                        }
                    } else if (!d10.contains(new Signature(next2))) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        for (byte[] next3 : keySet) {
            if (!a.d(packageManager, str, next3, map.get(next3).intValue())) {
                return false;
            }
        }
        return true;
    }
}
