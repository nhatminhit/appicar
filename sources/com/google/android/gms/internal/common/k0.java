package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class k0 extends l {
    public final int O;
    public int P;

    public k0(int i10, int i11) {
        d0.b(i11, i10, "index");
        this.O = i10;
        this.P = i11;
    }

    public abstract Object a(int i10);

    public final boolean hasNext() {
        return this.P < this.O;
    }

    public final boolean hasPrevious() {
        return this.P > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.P;
            this.P = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.P;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.P - 1;
            this.P = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.P - 1;
    }
}
