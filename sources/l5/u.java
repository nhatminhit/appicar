package l5;

import i5.d;
import i5.g;
import i5.j;
import i5.k;
import i5.l;
import i5.p;
import i5.q;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import m5.z;
import q5.h;
import q5.i;
import u5.f;

public class u implements Serializable {
    public static final long V = 1;
    public final d O;
    public final h P;
    public final boolean Q;
    public final j R;
    public k<Object> S;
    public final f T;
    public final p U;

    public static class a extends z.a {

        /* renamed from: c  reason: collision with root package name */
        public final u f10188c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f10189d;

        /* renamed from: e  reason: collision with root package name */
        public final String f10190e;

        public a(u uVar, w wVar, Class<?> cls, Object obj, String str) {
            super(wVar, cls);
            this.f10188c = uVar;
            this.f10189d = obj;
            this.f10190e = str;
        }

        public void c(Object obj, Object obj2) throws IOException {
            if (d(obj)) {
                this.f10188c.j(this.f10189d, this.f10190e, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
        }
    }

    @Deprecated
    public u(d dVar, h hVar, j jVar, k<Object> kVar, f fVar) {
        this(dVar, hVar, jVar, (p) null, kVar, fVar);
    }

    public u(d dVar, h hVar, j jVar, p pVar, k<Object> kVar, f fVar) {
        this.O = dVar;
        this.P = hVar;
        this.R = jVar;
        this.S = kVar;
        this.T = fVar;
        this.U = pVar;
        this.Q = hVar instanceof q5.f;
    }

    public void a(Exception exc, Object obj, Object obj2) throws IOException {
        if (exc instanceof IllegalArgumentException) {
            String h10 = a6.h.h(obj2);
            StringBuilder sb2 = new StringBuilder("Problem deserializing \"any\" property '");
            sb2.append(obj);
            sb2.append("' of class " + e() + " (expected type: ");
            sb2.append(this.R);
            sb2.append("; actual type: ");
            sb2.append(h10);
            sb2.append(")");
            String o10 = a6.h.o(exc);
            if (o10 != null) {
                sb2.append(", problem: ");
            } else {
                o10 = " (no error message provided)";
            }
            sb2.append(o10);
            throw new l((Closeable) null, sb2.toString(), (Throwable) exc);
        }
        a6.h.p0(exc);
        a6.h.q0(exc);
        Throwable M = a6.h.M(exc);
        throw new l((Closeable) null, a6.h.o(M), M);
    }

    public Object b(w4.l lVar, g gVar) throws IOException {
        if (lVar.q2(w4.p.VALUE_NULL)) {
            return this.S.d(gVar);
        }
        f fVar = this.T;
        return fVar != null ? this.S.h(lVar, gVar, fVar) : this.S.f(lVar, gVar);
    }

    public final void c(w4.l lVar, g gVar, Object obj, String str) throws IOException {
        try {
            p pVar = this.U;
            j(obj, pVar == null ? str : pVar.a(str, gVar), b(lVar, gVar));
        } catch (w e10) {
            if (this.S.q() != null) {
                e10.A().a(new a(this, e10, this.R.g(), obj, str));
                return;
            }
            throw l.o(lVar, "Unresolved forward reference but no identity info.", e10);
        }
    }

    public void d(i5.f fVar) {
        this.P.l(fVar.T(q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public final String e() {
        return this.P.n().getName();
    }

    public d f() {
        return this.O;
    }

    public j g() {
        return this.R;
    }

    public boolean h() {
        return this.S != null;
    }

    public Object i() {
        h hVar = this.P;
        if (hVar != null && hVar.c() != null) {
            return this;
        }
        throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
    }

    public void j(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            if (this.Q) {
                Map map = (Map) ((q5.f) this.P).r(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                    return;
                }
                return;
            }
            ((i) this.P).H(obj, obj2, obj3);
        } catch (Exception e10) {
            a(e10, obj2, obj3);
        }
    }

    public u k(k<Object> kVar) {
        return new u(this.O, this.P, this.R, this.U, kVar, this.T);
    }

    public String toString() {
        return "[any property on class " + e() + "]";
    }
}
