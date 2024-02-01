package a6;

import i5.j;
import p7.a;

public class d0 {

    /* renamed from: a  reason: collision with root package name */
    public int f240a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f241b;

    /* renamed from: c  reason: collision with root package name */
    public j f242c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f243d;

    public d0() {
    }

    public d0(d0 d0Var) {
        this.f240a = d0Var.f240a;
        this.f241b = d0Var.f241b;
        this.f242c = d0Var.f242c;
        this.f243d = d0Var.f243d;
    }

    public d0(j jVar, boolean z10) {
        this.f242c = jVar;
        this.f241b = null;
        this.f243d = z10;
        this.f240a = z10 ? h(jVar) : j(jVar);
    }

    public d0(Class<?> cls, boolean z10) {
        this.f241b = cls;
        this.f242c = null;
        this.f243d = z10;
        this.f240a = z10 ? i(cls) : k(cls);
    }

    public static final int h(j jVar) {
        return jVar.hashCode() - 2;
    }

    public static final int i(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int j(j jVar) {
        return jVar.hashCode() - 1;
    }

    public static final int k(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public Class<?> a() {
        return this.f241b;
    }

    public j b() {
        return this.f242c;
    }

    public boolean c() {
        return this.f243d;
    }

    public final void d(j jVar) {
        this.f242c = jVar;
        this.f241b = null;
        this.f243d = true;
        this.f240a = h(jVar);
    }

    public final void e(Class<?> cls) {
        this.f242c = null;
        this.f241b = cls;
        this.f243d = true;
        this.f240a = i(cls);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (d0Var.f243d != this.f243d) {
            return false;
        }
        Class<?> cls = this.f241b;
        return cls != null ? d0Var.f241b == cls : this.f242c.equals(d0Var.f242c);
    }

    public final void f(j jVar) {
        this.f242c = jVar;
        this.f241b = null;
        this.f243d = false;
        this.f240a = j(jVar);
    }

    public final void g(Class<?> cls) {
        this.f242c = null;
        this.f241b = cls;
        this.f243d = false;
        this.f240a = k(cls);
    }

    public final int hashCode() {
        return this.f240a;
    }

    public final String toString() {
        StringBuilder sb2;
        if (this.f241b != null) {
            sb2 = new StringBuilder();
            sb2.append("{class: ");
            sb2.append(this.f241b.getName());
        } else {
            sb2 = new StringBuilder();
            sb2.append("{type: ");
            sb2.append(this.f242c);
        }
        sb2.append(", typed? ");
        sb2.append(this.f243d);
        sb2.append(a.f11639j);
        return sb2.toString();
    }
}
