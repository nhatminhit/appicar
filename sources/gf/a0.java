package gf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import xe.w;
import ye.a;
import zd.h1;
import zd.j2;

@h1(version = "1.3")
public final class a0 implements Iterator<j2>, a {
    public final long O;
    public boolean P;
    public final long Q;
    public long R;

    public a0(long j10, long j11, long j12) {
        this.O = j11;
        boolean z10 = true;
        if (j12 <= 0 ? Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 : Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0) {
            z10 = false;
        }
        this.P = z10;
        this.Q = j2.l(j12);
        this.R = !this.P ? j11 : j10;
    }

    public /* synthetic */ a0(long j10, long j11, long j12, w wVar) {
        this(j10, j11, j12);
    }

    public long a() {
        long j10 = this.R;
        if (j10 != this.O) {
            this.R = j2.l(this.Q + j10);
        } else if (this.P) {
            this.P = false;
        } else {
            throw new NoSuchElementException();
        }
        return j10;
    }

    public boolean hasNext() {
        return this.P;
    }

    public /* bridge */ /* synthetic */ Object next() {
        return j2.b(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
