package zd;

public final /* synthetic */ class z1 {
    public static /* synthetic */ long a(long j10, long j11) {
        if (j11 < 0) {
            return (j10 ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE) ? 0 : 1;
        }
        if (j10 >= 0) {
            return j10 / j11;
        }
        int i10 = 1;
        long j12 = ((j10 >>> 1) / j11) << 1;
        if (((j10 - (j12 * j11)) ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE)) {
            i10 = 0;
        }
        return j12 + ((long) i10);
    }
}
