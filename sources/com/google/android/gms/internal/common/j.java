package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

@NullMarked
public final class j extends h {
    public static final h S = new j(new Object[0], 0);
    public final transient Object[] Q;
    public final transient int R;

    public j(Object[] objArr, int i10) {
        this.Q = objArr;
        this.R = i10;
    }

    public final int b(Object[] objArr, int i10) {
        System.arraycopy(this.Q, 0, objArr, 0, this.R);
        return this.R;
    }

    public final int c() {
        return this.R;
    }

    public final int e() {
        return 0;
    }

    public final Object get(int i10) {
        d0.a(i10, this.R, "index");
        Object obj = this.Q[i10];
        obj.getClass();
        return obj;
    }

    public final boolean i() {
        return false;
    }

    public final Object[] j() {
        return this.Q;
    }

    public final int size() {
        return this.R;
    }
}
