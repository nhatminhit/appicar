package p000if;

import fh.g;
import java.util.Iterator;
import we.p;
import xe.l0;

/* renamed from: if.l  reason: invalid package */
public final class l<T1, T2, V> implements m<V> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final m<T1> f19714a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final m<T2> f19715b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final p<T1, T2, V> f19716c;

    /* renamed from: if.l$a */
    public static final class a implements Iterator<V>, ye.a {
        @g
        public final Iterator<T1> O;
        @g
        public final Iterator<T2> P;
        public final /* synthetic */ l<T1, T2, V> Q;

        public a(l<T1, T2, V> lVar) {
            this.Q = lVar;
            this.O = lVar.f19714a.iterator();
            this.P = lVar.f19715b.iterator();
        }

        @g
        public final Iterator<T1> a() {
            return this.O;
        }

        @g
        public final Iterator<T2> b() {
            return this.P;
        }

        public boolean hasNext() {
            return this.O.hasNext() && this.P.hasNext();
        }

        public V next() {
            return this.Q.f19716c.g0(this.O.next(), this.P.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(@g m<? extends T1> mVar, @g m<? extends T2> mVar2, @g p<? super T1, ? super T2, ? extends V> pVar) {
        l0.p(mVar, "sequence1");
        l0.p(mVar2, "sequence2");
        l0.p(pVar, "transform");
        this.f19714a = mVar;
        this.f19715b = mVar2;
        this.f19716c = pVar;
    }

    @g
    public Iterator<V> iterator() {
        return new a(this);
    }
}
