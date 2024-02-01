package p000if;

import fh.g;
import java.util.Iterator;
import we.l;
import xe.l0;

/* renamed from: if.z  reason: invalid package */
public final class z<T, R> implements m<R> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f19748a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f19749b;

    /* renamed from: if.z$a */
    public static final class a implements Iterator<R>, ye.a {
        @g
        public final Iterator<T> O;
        public final /* synthetic */ z<T, R> P;

        public a(z<T, R> zVar) {
            this.P = zVar;
            this.O = zVar.f19748a.iterator();
        }

        @g
        public final Iterator<T> a() {
            return this.O;
        }

        public boolean hasNext() {
            return this.O.hasNext();
        }

        public R next() {
            return this.P.f19749b.A(this.O.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(@g m<? extends T> mVar, @g l<? super T, ? extends R> lVar) {
        l0.p(mVar, "sequence");
        l0.p(lVar, "transformer");
        this.f19748a = mVar;
        this.f19749b = lVar;
    }

    @g
    public final <E> m<E> e(@g l<? super R, ? extends Iterator<? extends E>> lVar) {
        l0.p(lVar, "iterator");
        return new i(this.f19748a, this.f19749b, lVar);
    }

    @g
    public Iterator<R> iterator() {
        return new a(this);
    }
}
