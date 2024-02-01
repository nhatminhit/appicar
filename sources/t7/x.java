package t7;

import b6.c;
import b6.j0;
import java.io.FileNotFoundException;
import java.io.IOException;
import t7.e0;
import t7.h0;

public class x implements g0 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f13249b = 3;

    /* renamed from: c  reason: collision with root package name */
    public static final int f13250c = 6;

    /* renamed from: d  reason: collision with root package name */
    public static final long f13251d = 60000;

    /* renamed from: e  reason: collision with root package name */
    public static final int f13252e = -1;

    /* renamed from: a  reason: collision with root package name */
    public final int f13253a;

    public x() {
        this(-1);
    }

    public x(int i10) {
        this.f13253a = i10;
    }

    public long a(int i10, long j10, IOException iOException, int i11) {
        return ((iOException instanceof j0) || (iOException instanceof FileNotFoundException) || (iOException instanceof h0.h)) ? c.f4201b : (long) Math.min((i11 - 1) * 1000, 5000);
    }

    public long b(int i10, long j10, IOException iOException, int i11) {
        if (!(iOException instanceof e0.e)) {
            return c.f4201b;
        }
        int i12 = ((e0.e) iOException).T;
        if (i12 == 404 || i12 == 410) {
            return 60000;
        }
        return c.f4201b;
    }

    public int c(int i10) {
        int i11 = this.f13253a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }
}
