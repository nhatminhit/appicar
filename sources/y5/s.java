package y5;

import com.fasterxml.jackson.databind.ser.j;
import i5.d;
import i5.e0;
import i5.l;
import i5.o;
import i5.q;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import q5.h;
import s5.e;
import s5.m;
import t5.c;
import u5.g;
import u5.i;
import v4.f0;
import w4.p;

@j5.a
public class s extends m0<Object> implements j, e, c {
    public final h R;
    public final o<Object> S;
    public final d T;
    public final boolean U;

    public static class a extends i {

        /* renamed from: a  reason: collision with root package name */
        public final i f15525a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f15526b;

        public a(i iVar, Object obj) {
            this.f15525a = iVar;
            this.f15526b = obj;
        }

        public i b(d dVar) {
            throw new UnsupportedOperationException();
        }

        public String c() {
            return this.f15525a.c();
        }

        public g d() {
            return this.f15525a.d();
        }

        public f0.a e() {
            return this.f15525a.e();
        }

        @Deprecated
        public void i(Object obj, w4.i iVar, String str) throws IOException {
            this.f15525a.i(this.f15526b, iVar, str);
        }

        @Deprecated
        public void j(Object obj, w4.i iVar, String str) throws IOException {
            this.f15525a.j(this.f15526b, iVar, str);
        }

        @Deprecated
        public void k(Object obj, w4.i iVar, String str) throws IOException {
            this.f15525a.k(this.f15526b, iVar, str);
        }

        @Deprecated
        public void l(Object obj, w4.i iVar, String str) throws IOException {
            this.f15525a.l(this.f15526b, iVar, str);
        }

        @Deprecated
        public void m(Object obj, w4.i iVar, String str) throws IOException {
            this.f15525a.m(this.f15526b, iVar, str);
        }

        @Deprecated
        public void n(Object obj, w4.i iVar, String str) throws IOException {
            this.f15525a.n(this.f15526b, iVar, str);
        }

        public g5.c o(w4.i iVar, g5.c cVar) throws IOException {
            cVar.f8039a = this.f15526b;
            return this.f15525a.o(iVar, cVar);
        }

        @Deprecated
        public void p(Object obj, w4.i iVar) throws IOException {
            this.f15525a.p(this.f15526b, iVar);
        }

        @Deprecated
        public void q(Object obj, w4.i iVar, Class<?> cls) throws IOException {
            this.f15525a.q(this.f15526b, iVar, cls);
        }

        @Deprecated
        public void r(Object obj, w4.i iVar) throws IOException {
            this.f15525a.r(this.f15526b, iVar);
        }

        @Deprecated
        public void s(Object obj, w4.i iVar, Class<?> cls) throws IOException {
            this.f15525a.s(this.f15526b, iVar, cls);
        }

        @Deprecated
        public void t(Object obj, w4.i iVar) throws IOException {
            this.f15525a.t(this.f15526b, iVar);
        }

        @Deprecated
        public void u(Object obj, w4.i iVar, Class<?> cls) throws IOException {
            this.f15525a.u(this.f15526b, iVar, cls);
        }

        public g5.c v(w4.i iVar, g5.c cVar) throws IOException {
            return this.f15525a.v(iVar, cVar);
        }

        @Deprecated
        public void w(Object obj, w4.i iVar) throws IOException {
            this.f15525a.w(this.f15526b, iVar);
        }

        @Deprecated
        public void x(Object obj, w4.i iVar) throws IOException {
            this.f15525a.x(this.f15526b, iVar);
        }

        @Deprecated
        public void y(Object obj, w4.i iVar) throws IOException {
            this.f15525a.y(this.f15526b, iVar);
        }
    }

    public s(h hVar, o<?> oVar) {
        super(hVar.h());
        this.R = hVar;
        this.S = oVar;
        this.T = null;
        this.U = true;
    }

    public s(s sVar, d dVar, o<?> oVar, boolean z10) {
        super(N(sVar.g()));
        this.R = sVar.R;
        this.S = oVar;
        this.T = dVar;
        this.U = z10;
    }

    public static final Class<Object> N(Class<?> cls) {
        return cls == null ? Object.class : cls;
    }

    public boolean M(s5.g gVar, i5.j jVar, Class<?> cls) throws l {
        m e10 = gVar.e(jVar);
        if (e10 == null) {
            return true;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = enumConstants[i10];
            try {
                linkedHashSet.add(String.valueOf(this.R.r(obj)));
                i10++;
            } catch (Exception e11) {
                e = e11;
                while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                    e = e.getCause();
                }
                a6.h.o0(e);
                throw l.y(e, obj, this.R.f() + "()");
            }
        }
        e10.b(linkedHashSet);
        return true;
    }

    public boolean O(Class<?> cls, o<?> oVar) {
        if (cls.isPrimitive()) {
            if (!(cls == Integer.TYPE || cls == Boolean.TYPE || cls == Double.TYPE)) {
                return false;
            }
        } else if (!(cls == String.class || cls == Integer.class || cls == Boolean.class || cls == Double.class)) {
            return false;
        }
        return C(oVar);
    }

    public s P(d dVar, o<?> oVar, boolean z10) {
        return (this.T == dVar && this.S == oVar && z10 == this.U) ? this : new s(this, dVar, oVar, z10);
    }

    public i5.m a(e0 e0Var, Type type) throws l {
        o<Object> oVar = this.S;
        return oVar instanceof c ? ((c) oVar).a(e0Var, (Type) null) : t5.a.a();
    }

    public o<?> d(e0 e0Var, d dVar) throws l {
        o r02;
        boolean z10;
        o oVar = this.S;
        if (oVar == null) {
            i5.j h10 = this.R.h();
            if (!e0Var.w(q.USE_STATIC_TYPING) && !h10.q()) {
                return this;
            }
            r02 = e0Var.a0(h10, dVar);
            z10 = O(h10.g(), r02);
        } else {
            r02 = e0Var.r0(oVar, dVar);
            z10 = this.U;
        }
        return P(dVar, r02, z10);
    }

    public void e(s5.g gVar, i5.j jVar) throws l {
        i5.j h10 = this.R.h();
        Class<?> n10 = this.R.n();
        if (n10 == null || !a6.h.V(n10) || !M(gVar, jVar, n10)) {
            o<Object> oVar = this.S;
            if (oVar == null && (oVar = gVar.c().d0(h10, false, this.T)) == null) {
                gVar.q(jVar);
            } else {
                oVar.e(gVar, h10);
            }
        }
    }

    public void m(Object obj, w4.i iVar, e0 e0Var) throws IOException {
        try {
            Object r10 = this.R.r(obj);
            if (r10 == null) {
                e0Var.R(iVar);
                return;
            }
            o<Object> oVar = this.S;
            if (oVar == null) {
                oVar = e0Var.e0(r10.getClass(), true, this.T);
            }
            oVar.m(r10, iVar, e0Var);
        } catch (Exception e10) {
            L(e0Var, e10, obj, this.R.f() + "()");
        }
    }

    public void n(Object obj, w4.i iVar, e0 e0Var, i iVar2) throws IOException {
        try {
            Object r10 = this.R.r(obj);
            if (r10 == null) {
                e0Var.R(iVar);
                return;
            }
            o<Object> oVar = this.S;
            if (oVar == null) {
                oVar = e0Var.i0(r10.getClass(), this.T);
            } else if (this.U) {
                g5.c o10 = iVar2.o(iVar, iVar2.g(obj, p.VALUE_STRING));
                oVar.m(r10, iVar, e0Var);
                iVar2.v(iVar, o10);
                return;
            }
            oVar.n(r10, iVar, e0Var, new a(iVar2, obj));
        } catch (Exception e10) {
            L(e0Var, e10, obj, this.R.f() + "()");
        }
    }

    public String toString() {
        return "(@JsonValue serializer for method " + this.R.n() + "#" + this.R.f() + ")";
    }
}
