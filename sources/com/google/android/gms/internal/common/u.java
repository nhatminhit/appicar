package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class u implements Iterator {
    @CheckForNull
    public Object O;
    public int P = 2;

    @CheckForNull
    public abstract Object a();

    @CheckForNull
    @CanIgnoreReturnValue
    public final Object b() {
        this.P = 3;
        return null;
    }

    public final boolean hasNext() {
        int i10 = this.P;
        if (i10 != 4) {
            int i11 = i10 - 1;
            if (i10 == 0) {
                throw null;
            } else if (i11 == 0) {
                return true;
            } else {
                if (i11 != 2) {
                    this.P = 4;
                    this.O = a();
                    if (this.P != 3) {
                        this.P = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.P = 2;
            Object obj = this.O;
            this.O = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
