package me;

import be.p;
import fh.g;
import fh.h;
import java.io.Serializable;
import java.lang.Enum;
import we.a;
import xe.l0;
import zd.h1;
import zd.r;

@h1(version = "1.8")
@r
public final class c<T extends Enum<T>> extends be.c<T> implements a<T>, Serializable {
    @g
    public final a<T[]> P;
    @h
    public volatile T[] Q;

    public c(@g a<T[]> aVar) {
        l0.p(aVar, "entriesProvider");
        this.P = aVar;
    }

    public int b() {
        return f().length;
    }

    public boolean c(@g T t10) {
        l0.p(t10, "element");
        return ((Enum) p.qf(f(), t10.ordinal())) == t10;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return c((Enum) obj);
    }

    @g
    /* renamed from: e */
    public T get(int i10) {
        T[] f10 = f();
        be.c.O.b(i10, f10.length);
        return f10[i10];
    }

    public final T[] f() {
        T[] tArr = this.Q;
        if (tArr != null) {
            return tArr;
        }
        T[] tArr2 = (Enum[]) this.P.n();
        this.Q = tArr2;
        return tArr2;
    }

    public int h(@g T t10) {
        l0.p(t10, "element");
        int ordinal = t10.ordinal();
        if (((Enum) p.qf(f(), ordinal)) == t10) {
            return ordinal;
        }
        return -1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return h((Enum) obj);
    }

    public int l(@g T t10) {
        l0.p(t10, "element");
        return indexOf(t10);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return l((Enum) obj);
    }

    public final Object m() {
        return new d(f());
    }
}
