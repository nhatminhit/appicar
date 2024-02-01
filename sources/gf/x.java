package gf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import xe.w;
import ye.a;
import zd.e2;
import zd.h1;

@h1(version = "1.3")
public final class x implements Iterator<e2>, a {
    public final int O;
    public boolean P;
    public final int Q;
    public int R;

    public x(int i10, int i11, int i12) {
        this.O = i11;
        boolean z10 = true;
        if (i12 <= 0 ? Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0 : Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0) {
            z10 = false;
        }
        this.P = z10;
        this.Q = e2.l(i12);
        this.R = !this.P ? i11 : i10;
    }

    public /* synthetic */ x(int i10, int i11, int i12, w wVar) {
        this(i10, i11, i12);
    }

    public int a() {
        int i10 = this.R;
        if (i10 != this.O) {
            this.R = e2.l(this.Q + i10);
        } else if (this.P) {
            this.P = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }

    public boolean hasNext() {
        return this.P;
    }

    public /* bridge */ /* synthetic */ Object next() {
        return e2.b(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
