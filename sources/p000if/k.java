package p000if;

import be.p0;
import be.w;
import fh.g;
import java.util.Iterator;
import xe.l0;

/* renamed from: if.k  reason: invalid package */
public final class k<T> implements m<p0<? extends T>> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f19713a;

    /* renamed from: if.k$a */
    public static final class a implements Iterator<p0<? extends T>>, ye.a {
        @g
        public final Iterator<T> O;
        public int P;

        public a(k<T> kVar) {
            this.O = kVar.f19713a.iterator();
        }

        public final int a() {
            return this.P;
        }

        @g
        public final Iterator<T> b() {
            return this.O;
        }

        @g
        /* renamed from: c */
        public p0<T> next() {
            int i10 = this.P;
            this.P = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            return new p0<>(i10, this.O.next());
        }

        public final void d(int i10) {
            this.P = i10;
        }

        public boolean hasNext() {
            return this.O.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public k(@g m<? extends T> mVar) {
        l0.p(mVar, "sequence");
        this.f19713a = mVar;
    }

    @g
    public Iterator<p0<T>> iterator() {
        return new a(this);
    }
}
