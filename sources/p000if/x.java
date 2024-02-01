package p000if;

import fh.g;
import fh.h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import we.l;
import xe.l0;

/* renamed from: if.x  reason: invalid package */
public final class x<T> implements m<T> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f19744a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final l<T, Boolean> f19745b;

    /* renamed from: if.x$a */
    public static final class a implements Iterator<T>, ye.a {
        @g
        public final Iterator<T> O;
        public int P = -1;
        @h
        public T Q;
        public final /* synthetic */ x<T> R;

        public a(x<T> xVar) {
            this.R = xVar;
            this.O = xVar.f19744a.iterator();
        }

        public final void a() {
            if (this.O.hasNext()) {
                T next = this.O.next();
                if (((Boolean) this.R.f19745b.A(next)).booleanValue()) {
                    this.P = 1;
                    this.Q = next;
                    return;
                }
            }
            this.P = 0;
        }

        @g
        public final Iterator<T> b() {
            return this.O;
        }

        @h
        public final T c() {
            return this.Q;
        }

        public final int d() {
            return this.P;
        }

        public final void e(@h T t10) {
            this.Q = t10;
        }

        public final void f(int i10) {
            this.P = i10;
        }

        public boolean hasNext() {
            if (this.P == -1) {
                a();
            }
            return this.P == 1;
        }

        public T next() {
            if (this.P == -1) {
                a();
            }
            if (this.P != 0) {
                T t10 = this.Q;
                this.Q = null;
                this.P = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x(@g m<? extends T> mVar, @g l<? super T, Boolean> lVar) {
        l0.p(mVar, "sequence");
        l0.p(lVar, "predicate");
        this.f19744a = mVar;
        this.f19745b = lVar;
    }

    @g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
