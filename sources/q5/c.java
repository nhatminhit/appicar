package q5;

import a6.b;
import a6.h;
import i5.j;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k5.i;
import q5.t;
import z5.m;

public class c {

    /* renamed from: i  reason: collision with root package name */
    public static final b f11946i = n.d();

    /* renamed from: j  reason: collision with root package name */
    public static final Class<?> f11947j = Object.class;

    /* renamed from: k  reason: collision with root package name */
    public static final Class<?> f11948k = Enum.class;

    /* renamed from: l  reason: collision with root package name */
    public static final Class<?> f11949l = List.class;

    /* renamed from: m  reason: collision with root package name */
    public static final Class<?> f11950m = Map.class;

    /* renamed from: a  reason: collision with root package name */
    public final i<?> f11951a;

    /* renamed from: b  reason: collision with root package name */
    public final i5.b f11952b;

    /* renamed from: c  reason: collision with root package name */
    public final t.a f11953c;

    /* renamed from: d  reason: collision with root package name */
    public final m f11954d;

    /* renamed from: e  reason: collision with root package name */
    public final j f11955e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f11956f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f11957g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11958h;

    public c(i<?> iVar, j jVar, t.a aVar) {
        this.f11951a = iVar;
        this.f11955e = jVar;
        Class<?> g10 = jVar.g();
        this.f11956f = g10;
        this.f11953c = aVar;
        this.f11954d = jVar.F();
        Class<?> cls = null;
        i5.b m10 = iVar.S() ? iVar.m() : null;
        this.f11952b = m10;
        this.f11957g = aVar != null ? aVar.b(g10) : cls;
        this.f11958h = m10 != null && (!h.W(g10) || !jVar.o());
    }

    public c(i<?> iVar, Class<?> cls, t.a aVar) {
        this.f11951a = iVar;
        Class<?> cls2 = null;
        this.f11955e = null;
        this.f11956f = cls;
        this.f11953c = aVar;
        this.f11954d = m.h();
        if (iVar == null) {
            this.f11952b = null;
        } else {
            this.f11952b = iVar.S() ? iVar.m() : null;
            if (aVar != null) {
                cls2 = aVar.b(cls);
            }
        }
        this.f11957g = cls2;
        this.f11958h = this.f11952b != null;
    }

    public static void d(j jVar, List<j> list, boolean z10) {
        Class<?> g10 = jVar.g();
        if (z10) {
            if (!f(list, g10)) {
                list.add(jVar);
                if (g10 == f11949l || g10 == f11950m) {
                    return;
                }
            } else {
                return;
            }
        }
        for (j d10 : jVar.N()) {
            d(d10, list, true);
        }
    }

    public static void e(j jVar, List<j> list, boolean z10) {
        Class<?> g10 = jVar.g();
        if (g10 != f11947j && g10 != f11948k) {
            if (z10) {
                if (!f(list, g10)) {
                    list.add(jVar);
                } else {
                    return;
                }
            }
            for (j d10 : jVar.N()) {
                d(d10, list, true);
            }
            j Q = jVar.Q();
            if (Q != null) {
                e(Q, list, true);
            }
        }
    }

    public static boolean f(List<j> list, Class<?> cls) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).g() == cls) {
                return true;
            }
        }
        return false;
    }

    public static b g(i<?> iVar, Class<?> cls) {
        return new b(cls);
    }

    public static b h(Class<?> cls) {
        return new b(cls);
    }

    public static b i(i<?> iVar, j jVar, t.a aVar) {
        return (!jVar.l() || !p(iVar, jVar.g())) ? new c(iVar, jVar, aVar).k() : g(iVar, jVar.g());
    }

    public static b m(i<?> iVar, j jVar, t.a aVar) {
        return (!jVar.l() || !p(iVar, jVar.g())) ? new c(iVar, jVar, aVar).l() : g(iVar, jVar.g());
    }

    public static b n(i<?> iVar, Class<?> cls) {
        return o(iVar, cls, iVar);
    }

    public static b o(i<?> iVar, Class<?> cls, t.a aVar) {
        return (!cls.isArray() || !p(iVar, cls)) ? new c(iVar, cls, aVar).l() : g(iVar, cls);
    }

    public static boolean p(i<?> iVar, Class<?> cls) {
        return iVar == null || iVar.b(cls) == null;
    }

    public final n a(n nVar, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!nVar.h(annotation)) {
                    nVar = nVar.a(annotation);
                    if (this.f11952b.D0(annotation)) {
                        nVar = c(nVar, annotation);
                    }
                }
            }
        }
        return nVar;
    }

    public final n b(n nVar, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            nVar = a(nVar, h.p(cls2));
            for (Class<?> p10 : h.x(cls2, cls, false)) {
                nVar = a(nVar, h.p(p10));
            }
        }
        return nVar;
    }

    public final n c(n nVar, Annotation annotation) {
        for (Annotation annotation2 : h.p(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !nVar.h(annotation2)) {
                nVar = nVar.a(annotation2);
                if (this.f11952b.D0(annotation2)) {
                    nVar = c(nVar, annotation2);
                }
            }
        }
        return nVar;
    }

    public final b j(List<j> list) {
        Class<Object> cls = Object.class;
        if (this.f11952b == null) {
            return f11946i;
        }
        t.a aVar = this.f11953c;
        boolean z10 = aVar != null && (!(aVar instanceof c0) || ((c0) aVar).e());
        if (!z10 && !this.f11958h) {
            return f11946i;
        }
        n e10 = n.e();
        Class<?> cls2 = this.f11957g;
        if (cls2 != null) {
            e10 = b(e10, this.f11956f, cls2);
        }
        if (this.f11958h) {
            e10 = a(e10, h.p(this.f11956f));
        }
        for (j next : list) {
            if (z10) {
                Class<?> g10 = next.g();
                e10 = b(e10, g10, this.f11953c.b(g10));
            }
            if (this.f11958h) {
                e10 = a(e10, h.p(next.g()));
            }
        }
        if (z10) {
            e10 = b(e10, cls, this.f11953c.b(cls));
        }
        return e10.c();
    }

    public b k() {
        ArrayList arrayList = new ArrayList(8);
        if (!this.f11955e.j(Object.class)) {
            if (this.f11955e.s()) {
                d(this.f11955e, arrayList, false);
            } else {
                e(this.f11955e, arrayList, false);
            }
        }
        return new b(this.f11955e, this.f11956f, arrayList, this.f11957g, j(arrayList), this.f11954d, this.f11952b, this.f11953c, this.f11951a.M(), this.f11958h);
    }

    public b l() {
        List emptyList = Collections.emptyList();
        return new b((j) null, this.f11956f, emptyList, this.f11957g, j(emptyList), this.f11954d, this.f11952b, this.f11953c, this.f11951a.M(), this.f11958h);
    }
}
