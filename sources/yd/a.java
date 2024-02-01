package yd;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static char[] f24765a;

    /* renamed from: b  reason: collision with root package name */
    public static int f24766b;

    /* renamed from: c  reason: collision with root package name */
    public static int f24767c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static String f24768d;

    /* renamed from: e  reason: collision with root package name */
    public static Map<Character, Integer> f24769e = new HashMap(f24766b);

    static {
        char[] charArray = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_".toCharArray();
        f24765a = charArray;
        f24766b = charArray.length;
        for (int i10 = 0; i10 < f24766b; i10++) {
            f24769e.put(Character.valueOf(f24765a[i10]), Integer.valueOf(i10));
        }
    }

    public static long a(String str) {
        long j10 = 0;
        for (char valueOf : str.toCharArray()) {
            j10 = (j10 * ((long) f24766b)) + ((long) f24769e.get(Character.valueOf(valueOf)).intValue());
        }
        return j10;
    }

    public static String b(long j10) {
        StringBuilder sb2 = new StringBuilder();
        do {
            sb2.insert(0, f24765a[(int) (j10 % ((long) f24766b))]);
            j10 /= (long) f24766b;
        } while (j10 > 0);
        return sb2.toString();
    }

    public static String c() {
        String b10 = b(new Date().getTime());
        if (!b10.equals(f24768d)) {
            f24767c = 0;
            f24768d = b10;
            return b10;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b10);
        sb2.append(".");
        int i10 = f24767c;
        f24767c = i10 + 1;
        sb2.append(b((long) i10));
        return sb2.toString();
    }
}
