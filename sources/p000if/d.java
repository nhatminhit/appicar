package p000if;

import fh.g;
import java.util.Iterator;
import xe.l0;

/* renamed from: if.d  reason: invalid package */
public final class d<T> implements m<T>, e<T> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f19700a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19701b;

    /* renamed from: if.d$a */
    public static final class a implements Iterator<T>, ye.a {
        @g
        public final Iterator<T> O;
        public int P;

        public a(d<T> dVar) {
            this.O = dVar.f19700a.iterator();
            this.P = dVar.f19701b;
        }

        public final void a() {
            while (this.P > 0 && this.O.hasNext()) {
                this.O.next();
                this.P--;
            }
        }

        @g
        public final Iterator<T> b() {
            return this.O;
        }

        public final int c() {
            return this.P;
        }

        public final void d(int i10) {
            this.P = i10;
        }

        public boolean hasNext() {
            a();
            return this.O.hasNext();
        }

        public T next() {
            a();
            return this.O.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(@g m<? extends T> mVar, int i10) {
        l0.p(mVar, "sequence");
        this.f19700a = mVar;
        this.f19701b = i10;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
    }

    @g
    public m<T> a(int i10) {
        int i11 = this.f19701b;
        int i12 = i11 + i10;
        return i12 < 0 ? new w(this, i10) : new v(this.f19700a, i11, i12);
    }

    @g
    public m<T> b(int i10) {
        int i11 = this.f19701b + i10;
        return i11 < 0 ? new d(this, i10) : new d(this.f19700a, i11);
    }

    @g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
