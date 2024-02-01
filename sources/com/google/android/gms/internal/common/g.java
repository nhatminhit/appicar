package com.google.android.gms.internal.common;

import java.util.List;
import javax.annotation.CheckForNull;

public final class g extends h {
    public final transient int Q;
    public final transient int R;
    public final /* synthetic */ h S;

    public g(h hVar, int i10, int i11) {
        this.S = hVar;
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
        d0.a(i10, this.R, "index");
        return this.S.get(i10 + this.Q);
    }

    public final boolean i() {
        return true;
    }

    @CheckForNull
    public final Object[] j() {
        return this.S.j();
    }

    public final h l(int i10, int i11) {
        d0.c(i10, i11, this.R);
        h hVar = this.S;
        int i12 = this.Q;
        return hVar.subList(i10 + i12, i11 + i12);
    }

    public final int size() {
        return this.R;
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
