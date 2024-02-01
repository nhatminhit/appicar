package p000if;

import fh.g;
import fh.h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import we.l;
import xe.l0;

/* renamed from: if.j  reason: invalid package */
public final class j<T> implements m<T> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final we.a<T> f19711a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final l<T, T> f19712b;

    /* renamed from: if.j$a */
    public static final class a implements Iterator<T>, ye.a {
        @h
        public T O;
        public int P = -2;
        public final /* synthetic */ j<T> Q;

        public a(j<T> jVar) {
            this.Q = jVar;
        }

        public final void a() {
            T t10;
            if (this.P == -2) {
                t10 = this.Q.f19711a.n();
            } else {
                l d10 = this.Q.f19712b;
                T t11 = this.O;
                l0.m(t11);
                t10 = d10.A(t11);
            }
            this.O = t10;
            this.P = t10 == null ? 0 : 1;
        }

        @h
        public final T b() {
            return this.O;
        }

        public final int c() {
            return this.P;
        }

        public final void d(@h T t10) {
            this.O = t10;
        }

        public final void e(int i10) {
            this.P = i10;
        }

        public boolean hasNext() {
            if (this.P < 0) {
                a();
            }
            return this.P == 1;
        }

        @g
        public T next() {
            if (this.P < 0) {
                a();
            }
            if (this.P != 0) {
                T t10 = this.O;
                l0.n(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.P = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j(@g we.a<? extends T> aVar, @g l<? super T, ? extends T> lVar) {
        l0.p(aVar, "getInitialValue");
        l0.p(lVar, "getNextValue");
        this.f19711a = aVar;
        this.f19712b = lVar;
    }

    @g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
