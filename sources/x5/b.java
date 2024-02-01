package x5;

import a6.s;
import g5.c;
import i5.d0;
import i5.e0;
import i5.l;
import i5.o;
import java.io.IOException;
import java.util.Set;
import w4.i;
import w4.p;
import y5.d;

public class b extends d {

    /* renamed from: c0  reason: collision with root package name */
    public static final long f15078c0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public final d f15079b0;

    public b(d dVar) {
        super(dVar, (i) null);
        this.f15079b0 = dVar;
    }

    public b(d dVar, Set<String> set) {
        super(dVar, set);
        this.f15079b0 = dVar;
    }

    public b(d dVar, i iVar, Object obj) {
        super(dVar, iVar, obj);
        this.f15079b0 = dVar;
    }

    public d R() {
        return this;
    }

    /* renamed from: W */
    public d q(Object obj) {
        return new b(this, this.X, obj);
    }

    public d Z(i iVar) {
        return this.f15079b0.Z(iVar);
    }

    public d a0(com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.ser.d[] dVarArr2) {
        return this;
    }

    public final boolean b0(e0 e0Var) {
        return ((this.T == null || e0Var.n() == null) ? this.S : this.T).length == 1;
    }

    public final void c0(Object obj, i iVar, e0 e0Var) throws IOException {
        String str = "[anySetter]";
        com.fasterxml.jackson.databind.ser.d[] dVarArr = (this.T == null || e0Var.n() == null) ? this.S : this.T;
        try {
            for (com.fasterxml.jackson.databind.ser.d dVar : dVarArr) {
                if (dVar == null) {
                    iVar.k2();
                } else {
                    dVar.g(obj, iVar, e0Var);
                }
            }
        } catch (Exception e10) {
            if (0 != dVarArr.length) {
                str = dVarArr[0].getName();
            }
            L(e0Var, e10, obj, str);
        } catch (StackOverflowError e11) {
            l m10 = l.m(iVar, "Infinite recursion (StackOverflowError)", e11);
            if (0 != dVarArr.length) {
                str = dVarArr[0].getName();
            }
            m10.t(new l.a(obj, str));
            throw m10;
        }
    }

    /* renamed from: d0 */
    public b X(Set<String> set) {
        return new b(this, set);
    }

    public boolean j() {
        return false;
    }

    public final void m(Object obj, i iVar, e0 e0Var) throws IOException {
        if (!e0Var.w0(d0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || !b0(e0Var)) {
            iVar.T2(obj);
            c0(obj, iVar, e0Var);
            iVar.f2();
            return;
        }
        c0(obj, iVar, e0Var);
    }

    public void n(Object obj, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        if (this.X != null) {
            O(obj, iVar, e0Var, iVar2);
            return;
        }
        c Q = Q(iVar2, obj, p.START_ARRAY);
        iVar2.o(iVar, Q);
        iVar.A1(obj);
        c0(obj, iVar, e0Var);
        iVar2.v(iVar, Q);
    }

    public o<Object> o(s sVar) {
        return this.f15079b0.o(sVar);
    }

    public String toString() {
        return "BeanAsArraySerializer for " + g().getName();
    }
}
