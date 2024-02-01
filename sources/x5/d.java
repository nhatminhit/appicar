package x5;

import a6.s;
import i5.e0;
import i5.o;
import java.io.Serializable;
import s5.l;
import w4.i;

public abstract class d {

    public static final class a extends com.fasterxml.jackson.databind.ser.d implements Serializable {

        /* renamed from: n0  reason: collision with root package name */
        public static final long f15080n0 = 1;

        /* renamed from: l0  reason: collision with root package name */
        public final com.fasterxml.jackson.databind.ser.d f15081l0;

        /* renamed from: m0  reason: collision with root package name */
        public final Class<?>[] f15082m0;

        public a(com.fasterxml.jackson.databind.ser.d dVar, Class<?>[] clsArr) {
            super(dVar);
            this.f15081l0 = dVar;
            this.f15082m0 = clsArr;
        }

        public final boolean W(Class<?> cls) {
            if (cls == null) {
                return true;
            }
            for (Class<?> isAssignableFrom : this.f15082m0) {
                if (isAssignableFrom.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: X */
        public a Q(s sVar) {
            return new a(this.f15081l0.Q(sVar), this.f15082m0);
        }

        public void b(l lVar, e0 e0Var) throws i5.l {
            if (W(e0Var.n())) {
                super.b(lVar, e0Var);
            }
        }

        public void g(Object obj, i iVar, e0 e0Var) throws Exception {
            if (W(e0Var.n())) {
                this.f15081l0.g(obj, iVar, e0Var);
            } else {
                this.f15081l0.s(obj, iVar, e0Var);
            }
        }

        public void h(Object obj, i iVar, e0 e0Var) throws Exception {
            if (W(e0Var.n())) {
                this.f15081l0.h(obj, iVar, e0Var);
            } else {
                this.f15081l0.r(obj, iVar, e0Var);
            }
        }

        public void x(o<Object> oVar) {
            this.f15081l0.x(oVar);
        }

        public void y(o<Object> oVar) {
            this.f15081l0.y(oVar);
        }
    }

    public static final class b extends com.fasterxml.jackson.databind.ser.d implements Serializable {

        /* renamed from: n0  reason: collision with root package name */
        public static final long f15083n0 = 1;

        /* renamed from: l0  reason: collision with root package name */
        public final com.fasterxml.jackson.databind.ser.d f15084l0;

        /* renamed from: m0  reason: collision with root package name */
        public final Class<?> f15085m0;

        public b(com.fasterxml.jackson.databind.ser.d dVar, Class<?> cls) {
            super(dVar);
            this.f15084l0 = dVar;
            this.f15085m0 = cls;
        }

        /* renamed from: W */
        public b Q(s sVar) {
            return new b(this.f15084l0.Q(sVar), this.f15085m0);
        }

        public void b(l lVar, e0 e0Var) throws i5.l {
            Class<?> n10 = e0Var.n();
            if (n10 == null || this.f15085m0.isAssignableFrom(n10)) {
                super.b(lVar, e0Var);
            }
        }

        public void g(Object obj, i iVar, e0 e0Var) throws Exception {
            Class<?> n10 = e0Var.n();
            if (n10 == null || this.f15085m0.isAssignableFrom(n10)) {
                this.f15084l0.g(obj, iVar, e0Var);
            } else {
                this.f15084l0.s(obj, iVar, e0Var);
            }
        }

        public void h(Object obj, i iVar, e0 e0Var) throws Exception {
            Class<?> n10 = e0Var.n();
            if (n10 == null || this.f15085m0.isAssignableFrom(n10)) {
                this.f15084l0.h(obj, iVar, e0Var);
            } else {
                this.f15084l0.r(obj, iVar, e0Var);
            }
        }

        public void x(o<Object> oVar) {
            this.f15084l0.x(oVar);
        }

        public void y(o<Object> oVar) {
            this.f15084l0.y(oVar);
        }
    }

    public static com.fasterxml.jackson.databind.ser.d a(com.fasterxml.jackson.databind.ser.d dVar, Class<?>[] clsArr) {
        return clsArr.length == 1 ? new b(dVar, clsArr[0]) : new a(dVar, clsArr);
    }
}
