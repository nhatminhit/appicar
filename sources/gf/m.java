package gf;

import fh.g;
import fh.h;
import xe.w;
import zd.h1;
import zd.k;
import zd.r;

public final class m extends k implements h<Integer>, s<Integer> {
    @g
    public static final a S = new a((w) null);
    @g
    public static final m T = new m(1, 0);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @g
        public final m a() {
            return m.T;
        }
    }

    public m(int i10, int i11) {
        super(i10, i11, 1);
    }

    @h1(version = "1.7")
    @r
    @k(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void s() {
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return q(((Number) comparable).intValue());
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof m) {
            if (!isEmpty() || !((m) obj).isEmpty()) {
                m mVar = (m) obj;
                if (!(l() == mVar.l() && m() == mVar.m())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (l() * 31) + m();
    }

    public boolean isEmpty() {
        return l() > m();
    }

    public boolean q(int i10) {
        return l() <= i10 && i10 <= m();
    }

    @g
    /* renamed from: r */
    public Integer f() {
        if (m() != Integer.MAX_VALUE) {
            return Integer.valueOf(m() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @g
    /* renamed from: t */
    public Integer h() {
        return Integer.valueOf(m());
    }

    @g
    public String toString() {
        return l() + ".." + m();
    }

    @g
    /* renamed from: u */
    public Integer c() {
        return Integer.valueOf(l());
    }
}
