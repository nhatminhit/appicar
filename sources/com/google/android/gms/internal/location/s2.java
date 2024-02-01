package com.google.android.gms.internal.location;

public final class s2 extends r2 {
    public static final r2 S = new s2(new Object[0], 0);
    public final transient Object[] Q;
    public final transient int R;

    public s2(Object[] objArr, int i10) {
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
        l2.a(i10, this.R, "index");
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
