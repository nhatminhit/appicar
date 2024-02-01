package be;

import fh.g;
import gf.v;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import xe.l0;

public final class i1<T> extends c<T> implements RandomAccess {
    @g
    public final Object[] P;
    public final int Q;
    public int R;
    public int S;

    public static final class a extends b<T> {
        public int Q;
        public int R;
        public final /* synthetic */ i1<T> S;

        public a(i1<T> i1Var) {
            this.S = i1Var;
            this.Q = i1Var.size();
            this.R = i1Var.R;
        }

        public void a() {
            if (this.Q == 0) {
                b();
                return;
            }
            c(this.S.P[this.R]);
            this.R = (this.R + 1) % this.S.Q;
            this.Q--;
        }
    }

    public i1(int i10) {
        this(new Object[i10], 0);
    }

    public i1(@g Object[] objArr, int i10) {
        l0.p(objArr, "buffer");
        this.P = objArr;
        boolean z10 = true;
        if (i10 >= 0) {
            if (i10 > objArr.length ? false : z10) {
                this.Q = objArr.length;
                this.S = i10;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
    }

    public int b() {
        return this.S;
    }

    public T get(int i10) {
        c.O.b(i10, size());
        return this.P[(this.R + i10) % this.Q];
    }

    public final void h(T t10) {
        if (!n()) {
            this.P[(this.R + size()) % this.Q] = t10;
            this.S = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    @g
    public Iterator<T> iterator() {
        return new a(this);
    }

    @g
    public final i1<T> l(int i10) {
        Object[] objArr;
        int i11 = this.Q;
        int B = v.B(i11 + (i11 >> 1) + 1, i10);
        if (this.R == 0) {
            objArr = Arrays.copyOf(this.P, B);
            l0.o(objArr, "copyOf(this, newSize)");
        } else {
            objArr = toArray(new Object[B]);
        }
        return new i1<>(objArr, size());
    }

    public final int m(int i10, int i11) {
        return (i10 + i11) % this.Q;
    }

    public final boolean n() {
        return size() == this.Q;
    }

    public final void o(int i10) {
        boolean z10 = true;
        if (i10 >= 0) {
            if (i10 > size()) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
            } else if (i10 > 0) {
                int i11 = this.R;
                int e10 = (i11 + i10) % this.Q;
                if (i11 > e10) {
                    o.n2(this.P, null, i11, this.Q);
                    o.n2(this.P, null, 0, e10);
                } else {
                    o.n2(this.P, null, i11, e10);
                }
                this.R = e10;
                this.S = size() - i10;
            }
        } else {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
    }

    @g
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @g
    public <T> T[] toArray(@g T[] tArr) {
        l0.p(tArr, "array");
        if (tArr.length < size()) {
            tArr = Arrays.copyOf(tArr, size());
            l0.o(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i10 = this.R;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size && i10 < this.Q) {
            tArr[i12] = this.P[i10];
            i12++;
            i10++;
        }
        while (i12 < size) {
            tArr[i12] = this.P[i11];
            i12++;
            i11++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }
}
