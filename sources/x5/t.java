package x5;

import a6.s;
import i5.d0;
import i5.e0;
import i5.o;
import java.io.IOException;
import java.io.Serializable;
import java.util.Set;
import w4.i;
import y5.d;

public class t extends d implements Serializable {

    /* renamed from: c0  reason: collision with root package name */
    public static final long f15122c0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public final s f15123b0;

    public t(t tVar, Set<String> set) {
        super((d) tVar, set);
        this.f15123b0 = tVar.f15123b0;
    }

    public t(t tVar, i iVar) {
        super((d) tVar, iVar);
        this.f15123b0 = tVar.f15123b0;
    }

    public t(t tVar, i iVar, Object obj) {
        super((d) tVar, iVar, obj);
        this.f15123b0 = tVar.f15123b0;
    }

    public t(t tVar, com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.ser.d[] dVarArr2) {
        super((d) tVar, dVarArr, dVarArr2);
        this.f15123b0 = tVar.f15123b0;
    }

    public t(d dVar, s sVar) {
        super(dVar, sVar);
        this.f15123b0 = sVar;
    }

    public d R() {
        return this;
    }

    /* renamed from: W */
    public d q(Object obj) {
        return new t(this, this.X, obj);
    }

    public d X(Set<String> set) {
        return new t(this, set);
    }

    public d Z(i iVar) {
        return new t(this, iVar);
    }

    public d a0(com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.ser.d[] dVarArr2) {
        return new t(this, dVarArr, dVarArr2);
    }

    public boolean j() {
        return true;
    }

    public final void m(Object obj, i iVar, e0 e0Var) throws IOException {
        iVar.A1(obj);
        if (this.X != null) {
            P(obj, iVar, e0Var, false);
        } else if (this.V != null) {
            V(obj, iVar, e0Var);
        } else {
            U(obj, iVar, e0Var);
        }
    }

    public void n(Object obj, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        if (e0Var.w0(d0.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            e0Var.A(g(), "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        iVar.A1(obj);
        if (this.X != null) {
            O(obj, iVar, e0Var, iVar2);
        } else if (this.V != null) {
            V(obj, iVar, e0Var);
        } else {
            U(obj, iVar, e0Var);
        }
    }

    public o<Object> o(s sVar) {
        return new t((d) this, sVar);
    }

    public String toString() {
        return "UnwrappingBeanSerializer for " + g().getName();
    }
}
