package com.fasterxml.jackson.databind.ser;

import a6.d0;
import i5.e0;
import i5.j;
import i5.o;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import x5.l;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<d0, o<Object>> f5063a = new HashMap<>(64);

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<l> f5064b = new AtomicReference<>();

    public final synchronized l a() {
        l lVar;
        lVar = this.f5064b.get();
        if (lVar == null) {
            lVar = l.b(this.f5063a);
            this.f5064b.set(lVar);
        }
        return lVar;
    }

    public void b(j jVar, o<Object> oVar, e0 e0Var) throws i5.l {
        synchronized (this) {
            if (this.f5063a.put(new d0(jVar, false), oVar) == null) {
                this.f5064b.set((Object) null);
            }
            if (oVar instanceof p) {
                ((p) oVar).b(e0Var);
            }
        }
    }

    public void c(Class<?> cls, j jVar, o<Object> oVar, e0 e0Var) throws i5.l {
        synchronized (this) {
            o<Object> put = this.f5063a.put(new d0(cls, false), oVar);
            o<Object> put2 = this.f5063a.put(new d0(jVar, false), oVar);
            if (put == null || put2 == null) {
                this.f5064b.set((Object) null);
            }
            if (oVar instanceof p) {
                ((p) oVar).b(e0Var);
            }
        }
    }

    public void d(Class<?> cls, o<Object> oVar, e0 e0Var) throws i5.l {
        synchronized (this) {
            if (this.f5063a.put(new d0(cls, false), oVar) == null) {
                this.f5064b.set((Object) null);
            }
            if (oVar instanceof p) {
                ((p) oVar).b(e0Var);
            }
        }
    }

    public void e(j jVar, o<Object> oVar) {
        synchronized (this) {
            if (this.f5063a.put(new d0(jVar, true), oVar) == null) {
                this.f5064b.set((Object) null);
            }
        }
    }

    public void f(Class<?> cls, o<Object> oVar) {
        synchronized (this) {
            if (this.f5063a.put(new d0(cls, true), oVar) == null) {
                this.f5064b.set((Object) null);
            }
        }
    }

    public synchronized void g() {
        this.f5063a.clear();
    }

    public l h() {
        l lVar = this.f5064b.get();
        return lVar != null ? lVar : a();
    }

    public synchronized int i() {
        return this.f5063a.size();
    }

    public o<Object> j(j jVar) {
        o<Object> oVar;
        synchronized (this) {
            oVar = this.f5063a.get(new d0(jVar, true));
        }
        return oVar;
    }

    public o<Object> k(Class<?> cls) {
        o<Object> oVar;
        synchronized (this) {
            oVar = this.f5063a.get(new d0(cls, true));
        }
        return oVar;
    }

    public o<Object> l(j jVar) {
        o<Object> oVar;
        synchronized (this) {
            oVar = this.f5063a.get(new d0(jVar, false));
        }
        return oVar;
    }

    public o<Object> m(Class<?> cls) {
        o<Object> oVar;
        synchronized (this) {
            oVar = this.f5063a.get(new d0(cls, false));
        }
        return oVar;
    }
}
