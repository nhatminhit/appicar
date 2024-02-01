package gf;

import fh.g;
import fh.h;
import xe.w;
import zd.h1;
import zd.j2;
import zd.k;
import zd.r;
import zd.t;
import zd.y2;

@h1(version = "1.5")
@y2(markerClass = {t.class})
public final class b0 extends z implements h<j2>, s<j2> {
    @g
    public static final a S = new a((w) null);
    @g
    public static final b0 T = new b0(-1, 0, (w) null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @g
        public final b0 a() {
            return b0.T;
        }
    }

    public b0(long j10, long j11) {
        super(j10, j11, 1, (w) null);
    }

    public /* synthetic */ b0(long j10, long j11, w wVar) {
        this(j10, j11);
    }

    @h1(version = "1.7")
    @r
    @k(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void r() {
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return p(((j2) comparable).l0());
    }

    public /* bridge */ /* synthetic */ Comparable c() {
        return j2.b(t());
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof b0) {
            if (!isEmpty() || !((b0) obj).isEmpty()) {
                b0 b0Var = (b0) obj;
                if (!(l() == b0Var.l() && m() == b0Var.m())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Comparable f() {
        return j2.b(q());
    }

    public /* bridge */ /* synthetic */ Comparable h() {
        return j2.b(s());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) j2.l(l() ^ j2.l(l() >>> 32))) * 31) + ((int) j2.l(m() ^ j2.l(m() >>> 32)));
    }

    public boolean isEmpty() {
        return Long.compare(l() ^ Long.MIN_VALUE, m() ^ Long.MIN_VALUE) > 0;
    }

    public boolean p(long j10) {
        return Long.compare(l() ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) <= 0 && Long.compare(j10 ^ Long.MIN_VALUE, m() ^ Long.MIN_VALUE) <= 0;
    }

    public long q() {
        if (m() != -1) {
            return j2.l(m() + j2.l(((long) 1) & 4294967295L));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    public long s() {
        return m();
    }

    public long t() {
        return l();
    }

    @g
    public String toString() {
        return j2.g0(l()) + ".." + j2.g0(m());
    }
}
