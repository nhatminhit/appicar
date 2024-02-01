package com.google.android.gms.internal.common;

public final class e0 extends h0 {
    public final /* synthetic */ f0 V;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, i0 i0Var, CharSequence charSequence) {
        super(i0Var, charSequence);
        this.V = f0Var;
    }

    public final int c(int i10) {
        return i10 + 1;
    }

    public final int d(int i10) {
        z zVar = this.V.f5836a;
        CharSequence charSequence = this.Q;
        int length = charSequence.length();
        d0.b(i10, length, "index");
        while (i10 < length) {
            if (zVar.a(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
