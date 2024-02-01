package lf;

import fh.g;
import fh.h;
import gf.m;
import xe.l0;

public final class j {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final String f20833a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final m f20834b;

    public j(@g String str, @g m mVar) {
        l0.p(str, "value");
        l0.p(mVar, "range");
        this.f20833a = str;
        this.f20834b = mVar;
    }

    public static /* synthetic */ j d(j jVar, String str, m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jVar.f20833a;
        }
        if ((i10 & 2) != 0) {
            mVar = jVar.f20834b;
        }
        return jVar.c(str, mVar);
    }

    @g
    public final String a() {
        return this.f20833a;
    }

    @g
    public final m b() {
        return this.f20834b;
    }

    @g
    public final j c(@g String str, @g m mVar) {
        l0.p(str, "value");
        l0.p(mVar, "range");
        return new j(str, mVar);
    }

    @g
    public final m e() {
        return this.f20834b;
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l0.g(this.f20833a, jVar.f20833a) && l0.g(this.f20834b, jVar.f20834b);
    }

    @g
    public final String f() {
        return this.f20833a;
    }

    public int hashCode() {
        return (this.f20833a.hashCode() * 31) + this.f20834b.hashCode();
    }

    @g
    public String toString() {
        return "MatchGroup(value=" + this.f20833a + ", range=" + this.f20834b + ')';
    }
}
