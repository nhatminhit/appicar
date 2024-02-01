package com.fasterxml.jackson.databind.ser;

import a6.s;
import i5.e0;
import i5.j;
import i5.o;
import java.io.IOException;
import java.util.Set;
import x5.b;
import x5.i;
import x5.t;
import y5.d;

public class e extends d {

    /* renamed from: b0  reason: collision with root package name */
    public static final long f5040b0 = 29;

    public e(j jVar, f fVar, d[] dVarArr, d[] dVarArr2) {
        super(jVar, fVar, dVarArr, dVarArr2);
    }

    public e(d dVar) {
        super(dVar);
    }

    public e(d dVar, Set<String> set) {
        super(dVar, set);
    }

    public e(d dVar, i iVar) {
        super(dVar, iVar);
    }

    public e(d dVar, i iVar, Object obj) {
        super(dVar, iVar, obj);
    }

    public e(d dVar, d[] dVarArr, d[] dVarArr2) {
        super(dVar, dVarArr, dVarArr2);
    }

    @Deprecated
    public static e b0(j jVar) {
        return new e(jVar, (f) null, d.f15520a0, (d[]) null);
    }

    public static e c0(j jVar, f fVar) {
        return new e(jVar, fVar, d.f15520a0, (d[]) null);
    }

    public d R() {
        return (this.X == null && this.U == null && this.V == null) ? new b(this) : this;
    }

    /* renamed from: W */
    public d q(Object obj) {
        return new e((d) this, this.X, obj);
    }

    public d X(Set<String> set) {
        return new e((d) this, set);
    }

    public d Z(i iVar) {
        return new e((d) this, iVar, this.V);
    }

    public d a0(d[] dVarArr, d[] dVarArr2) {
        return new e((d) this, dVarArr, dVarArr2);
    }

    public final void m(Object obj, w4.i iVar, e0 e0Var) throws IOException {
        if (this.X != null) {
            iVar.A1(obj);
            P(obj, iVar, e0Var, true);
            return;
        }
        iVar.W2(obj);
        if (this.V != null) {
            V(obj, iVar, e0Var);
        } else {
            U(obj, iVar, e0Var);
        }
        iVar.g2();
    }

    public o<Object> o(s sVar) {
        return new t((d) this, sVar);
    }

    public String toString() {
        return "BeanSerializer for " + g().getName();
    }
}
