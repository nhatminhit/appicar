package p000if;

import fh.g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import xe.l0;

/* renamed from: if.w  reason: invalid package */
public final class w<T> implements m<T>, e<T> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f19742a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19743b;

    /* renamed from: if.w$a */
    public static final class a implements Iterator<T>, ye.a {
        public int O;
        @g
        public final Iterator<T> P;

        public a(w<T> wVar) {
            this.O = wVar.f19743b;
            this.P = wVar.f19742a.iterator();
        }

        @g
        public final Iterator<T> a() {
            return this.P;
        }

        public final int b() {
            return this.O;
        }

        public final void c(int i10) {
            this.O = i10;
        }

        public boolean hasNext() {
            return this.O > 0 && this.P.hasNext();
        }

        public T next() {
            int i10 = this.O;
            if (i10 != 0) {
                this.O = i10 - 1;
                return this.P.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public w(@g m<? extends T> mVar, int i10) {
        l0.p(mVar, "sequence");
        this.f19742a = mVar;
        this.f19743b = i10;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
    }

    @g
    public m<T> a(int i10) {
        return i10 >= this.f19743b ? this : new w(this.f19742a, i10);
    }

    @g
    public m<T> b(int i10) {
        int i11 = this.f19743b;
        return i10 >= i11 ? s.g() : new v(this.f19742a, i10, i11);
    }

    @g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
