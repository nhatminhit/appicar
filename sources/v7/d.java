package v7;

public final class d {
    public static long a(String str) {
        long j10 = 0;
        if (str == null) {
            return 0;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            long charAt = j10 ^ ((long) str.charAt(i10));
            j10 = charAt + (charAt << 1) + (charAt << 4) + (charAt << 5) + (charAt << 7) + (charAt << 8) + (charAt << 40);
        }
        return j10;
    }
}
