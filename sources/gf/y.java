package gf;

import fh.g;
import fh.h;
import xe.w;
import zd.e2;
import zd.h1;
import zd.k;
import zd.r;
import zd.t;
import zd.y2;

@h1(version = "1.5")
@y2(markerClass = {t.class})
public final class y extends w implements h<e2>, s<e2> {
    @g
    public static final a S = new a((w) null);
    @g
    public static final y T = new y(-1, 0, (w) null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @g
        public final y a() {
            return y.T;
        }
    }

    public y(int i10, int i11) {
        super(i10, i11, 1, (w) null);
    }

    public /* synthetic */ y(int i10, int i11, w wVar) {
        this(i10, i11);
    }

    @h1(version = "1.7")
    @r
    @k(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void r() {
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return p(((e2) comparable).l0());
    }

    public /* bridge */ /* synthetic */ Comparable c() {
        return e2.b(t());
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof y) {
            if (!isEmpty() || !((y) obj).isEmpty()) {
                y yVar = (y) obj;
                if (!(l() == yVar.l() && m() == yVar.m())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Comparable f() {
        return e2.b(q());
    }

    public /* bridge */ /* synthetic */ Comparable h() {
        return e2.b(s());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (l() * 31) + m();
    }

    public boolean isEmpty() {
        return Integer.compare(l() ^ Integer.MIN_VALUE, m() ^ Integer.MIN_VALUE) > 0;
    }

    public boolean p(int i10) {
        return Integer.compare(l() ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) <= 0 && Integer.compare(i10 ^ Integer.MIN_VALUE, m() ^ Integer.MIN_VALUE) <= 0;
    }

    public int q() {
        if (m() != -1) {
            return e2.l(m() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    public int s() {
        return m();
    }

    public int t() {
        return l();
    }

    @g
    public String toString() {
        return e2.g0(l()) + ".." + e2.g0(m());
    }
}
