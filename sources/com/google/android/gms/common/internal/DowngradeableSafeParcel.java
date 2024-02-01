package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d.m0;
import d.o0;
import e8.a;

@a
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Object P = new Object();
    public boolean O = false;

    @a
    public static boolean X0(@m0 String str) {
        synchronized (P) {
        }
        return true;
    }

    @a
    @o0
    public static Integer Z0() {
        synchronized (P) {
        }
        return null;
    }

    @a
    public abstract boolean f1(int i10);

    @a
    public void g1(boolean z10) {
        this.O = z10;
    }

    @a
    public boolean h1() {
        return this.O;
    }
}
