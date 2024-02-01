package p000if;

import fh.g;
import fh.h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import we.l;
import xe.l0;

/* renamed from: if.i  reason: invalid package */
public final class i<T, R, E> implements m<E> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f19708a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f19709b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final l<R, Iterator<E>> f19710c;

    /* renamed from: if.i$a */
    public static final class a implements Iterator<E>, ye.a {
        @g
        public final Iterator<T> O;
        @h
        public Iterator<? extends E> P;
        public final /* synthetic */ i<T, R, E> Q;

        public a(i<T, R, E> iVar) {
            this.Q = iVar;
            this.O = iVar.f19708a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it = this.P;
            if (it != null && !it.hasNext()) {
                this.P = null;
            }
            while (true) {
                if (this.P == null) {
                    if (this.O.hasNext()) {
                        Iterator<? extends E> it2 = (Iterator) this.Q.f19710c.A(this.Q.f19709b.A(this.O.next()));
                        if (it2.hasNext()) {
                            this.P = it2;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        @h
        public final Iterator<E> b() {
            return this.P;
        }

        @g
        public final Iterator<T> c() {
            return this.O;
        }

        public final void d(@h Iterator<? extends E> it) {
            this.P = it;
        }

        public boolean hasNext() {
            return a();
        }

        public E next() {
            if (a()) {
                Iterator<? extends E> it = this.P;
                l0.m(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i(@g m<? extends T> mVar, @g l<? super T, ? extends R> lVar, @g l<? super R, ? extends Iterator<? extends E>> lVar2) {
        l0.p(mVar, "sequence");
        l0.p(lVar, "transformer");
        l0.p(lVar2, "iterator");
        this.f19708a = mVar;
        this.f19709b = lVar;
        this.f19710c = lVar2;
    }

    @g
    public Iterator<E> iterator() {
        return new a(this);
    }
}
