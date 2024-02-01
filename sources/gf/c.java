package gf;

import fh.g;
import fh.h;
import xe.l0;
import xe.w;
import zd.h1;
import zd.k;
import zd.r;

public final class c extends a implements h<Character>, s<Character> {
    @g
    public static final a S = new a((w) null);
    @g
    public static final c T = new c(1, 0);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @g
        public final c a() {
            return c.T;
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    @h1(version = "1.7")
    @r
    @k(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void s() {
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return q(((Character) comparable).charValue());
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(l() == cVar.l() && m() == cVar.m())) {
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
        return l0.t(l(), m()) > 0;
    }

    public boolean q(char c10) {
        return l0.t(l(), c10) <= 0 && l0.t(c10, m()) <= 0;
    }

    @g
    /* renamed from: r */
    public Character f() {
        if (m() != 65535) {
            return Character.valueOf((char) (m() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @g
    /* renamed from: t */
    public Character h() {
        return Character.valueOf(m());
    }

    @g
    public String toString() {
        return l() + ".." + m();
    }

    @g
    /* renamed from: u */
    public Character c() {
        return Character.valueOf(l());
    }
}
