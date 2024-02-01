package gf;

import fh.g;
import fh.h;
import xe.w;
import zd.h1;
import zd.k;
import zd.r;

public final class p extends n implements h<Long>, s<Long> {
    @g
    public static final a S = new a((w) null);
    @g
    public static final p T = new p(1, 0);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @g
        public final p a() {
            return p.T;
        }
    }

    public p(long j10, long j11) {
        super(j10, j11, 1);
    }

    @h1(version = "1.7")
    @r
    @k(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void s() {
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return q(((Number) comparable).longValue());
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof p) {
            if (!isEmpty() || !((p) obj).isEmpty()) {
                p pVar = (p) obj;
                if (!(l() == pVar.l() && m() == pVar.m())) {
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
        return (int) ((((long) 31) * (l() ^ (l() >>> 32))) + (m() ^ (m() >>> 32)));
    }

    public boolean isEmpty() {
        return l() > m();
    }

    public boolean q(long j10) {
        return l() <= j10 && j10 <= m();
    }

    @g
    /* renamed from: r */
    public Long f() {
        if (m() != Long.MAX_VALUE) {
            return Long.valueOf(m() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @g
    /* renamed from: t */
    public Long h() {
        return Long.valueOf(m());
    }

    @g
    public String toString() {
        return l() + ".." + m();
    }

    @g
    /* renamed from: u */
    public Long c() {
        return Long.valueOf(l());
    }
}
