package ed;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

public class a {
    public static String a(int i10, int i11) {
        String valueOf = String.valueOf(i10);
        StringBuilder sb2 = new StringBuilder();
        if (valueOf.length() < i11) {
            for (int i12 = 0; i12 < i11 - valueOf.length(); i12++) {
                sb2.append("0");
            }
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    public static String b(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        if (str.length() < i10) {
            for (int i11 = 0; i11 < i10 - str.length(); i11++) {
                sb2.append("0");
            }
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static boolean c(String str) {
        return Pattern.compile(".*[a-zA-Z]+.*").matcher(str).matches();
    }

    public static boolean d(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean e(String str) {
        return str.matches(".*\\d.*");
    }

    public static boolean f(String str) {
        return Pattern.compile("[^a-z0-9 ]", 2).matcher(str).find();
    }

    public static String g(String str) {
        if (str.isEmpty() || str.length() <= 1) {
            return str;
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public static final String h(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                String hexString = Integer.toHexString(b10 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String i(String str) {
        if (str.isEmpty() || str.length() <= 1) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
