package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

public final class g0 implements Iterable {
    public final /* synthetic */ CharSequence O;
    public final /* synthetic */ i0 P;

    public g0(i0 i0Var, CharSequence charSequence) {
        this.P = i0Var;
        this.O = charSequence;
    }

    public final Iterator iterator() {
        return this.P.h(this.O);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                CharSequence a10 = b0.a(it.next(), ", ");
                while (true) {
                    sb2.append(a10);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append(", ");
                    a10 = b0.a(it.next(), ", ");
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
