package com.google.android.gms.internal.location;

import java.util.List;
import javax.annotation.CheckForNull;

public final class q2 extends r2 {
    public final transient int Q;
    public final transient int R;
    public final /* synthetic */ r2 S;

    public q2(r2 r2Var, int i10, int i11) {
        this.S = r2Var;
        this.Q = i10;
        this.R = i11;
    }

    public final int c() {
        return this.S.e() + this.Q + this.R;
    }

    public final int e() {
        return this.S.e() + this.Q;
    }

    public final Object get(int i10) {
        l2.a(i10, this.R, "index");
        return this.S.get(i10 + this.Q);
    }

    public final boolean i() {
        return true;
    }

    @CheckForNull
    public final Object[] j() {
        return this.S.j();
    }

    public final r2 l(int i10, int i11) {
        l2.c(i10, i11, this.R);
        r2 r2Var = this.S;
        int i12 = this.Q;
        return r2Var.subList(i10 + i12, i11 + i12);
    }

    public final int size() {
        return this.R;
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
