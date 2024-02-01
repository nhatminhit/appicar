package p000if;

import be.w;
import fh.g;
import java.util.Iterator;
import we.p;
import xe.l0;

/* renamed from: if.y  reason: invalid package */
public final class y<T, R> implements m<R> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f19746a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final p<Integer, T, R> f19747b;

    /* renamed from: if.y$a */
    public static final class a implements Iterator<R>, ye.a {
        @g
        public final Iterator<T> O;
        public int P;
        public final /* synthetic */ y<T, R> Q;

        public a(y<T, R> yVar) {
            this.Q = yVar;
            this.O = yVar.f19746a.iterator();
        }

        public final int a() {
            return this.P;
        }

        @g
        public final Iterator<T> b() {
            return this.O;
        }

        public final void c(int i10) {
            this.P = i10;
        }

        public boolean hasNext() {
            return this.O.hasNext();
        }

        public R next() {
            p d10 = this.Q.f19747b;
            int i10 = this.P;
            this.P = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            return d10.g0(Integer.valueOf(i10), this.O.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y(@g m<? extends T> mVar, @g p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(mVar, "sequence");
        l0.p(pVar, "transformer");
        this.f19746a = mVar;
        this.f19747b = pVar;
    }

    @g
    public Iterator<R> iterator() {
        return new a(this);
    }
}
