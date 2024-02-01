package x5;

import i5.e0;
import java.io.IOException;
import v4.l0;
import w4.i;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final l0<?> f15124a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15125b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15126c = false;

    public u(l0<?> l0Var) {
        this.f15124a = l0Var;
    }

    public Object a(Object obj) {
        if (this.f15125b == null) {
            this.f15125b = this.f15124a.c(obj);
        }
        return this.f15125b;
    }

    public void b(i iVar, e0 e0Var, i iVar2) throws IOException {
        this.f15126c = true;
        if (iVar.t()) {
            Object obj = this.f15125b;
            iVar.E2(obj == null ? null : String.valueOf(obj));
            return;
        }
        w4.u uVar = iVar2.f15091b;
        if (uVar != null) {
            iVar.j2(uVar);
            iVar2.f15093d.m(this.f15125b, iVar, e0Var);
        }
    }

    public boolean c(i iVar, e0 e0Var, i iVar2) throws IOException {
        if (this.f15125b == null) {
            return false;
        }
        if (!this.f15126c && !iVar2.f15094e) {
            return false;
        }
        if (iVar.t()) {
            iVar.F2(String.valueOf(this.f15125b));
            return true;
        }
        iVar2.f15093d.m(this.f15125b, iVar, e0Var);
        return true;
    }
}
