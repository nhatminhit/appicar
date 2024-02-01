package p000if;

import fh.g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import xe.l0;

/* renamed from: if.v  reason: invalid package */
public final class v<T> implements m<T>, e<T> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f19739a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19740b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19741c;

    /* renamed from: if.v$a */
    public static final class a implements Iterator<T>, ye.a {
        @g
        public final Iterator<T> O;
        public int P;
        public final /* synthetic */ v<T> Q;

        public a(v<T> vVar) {
            this.Q = vVar;
            this.O = vVar.f19739a.iterator();
        }

        public final void a() {
            while (this.P < this.Q.f19740b && this.O.hasNext()) {
                this.O.next();
                this.P++;
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
            return this.P < this.Q.f19741c && this.O.hasNext();
        }

        public T next() {
            a();
            if (this.P < this.Q.f19741c) {
                this.P++;
                return this.O.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public v(@g m<? extends T> mVar, int i10, int i11) {
        l0.p(mVar, "sequence");
        this.f19739a = mVar;
        this.f19740b = i10;
        this.f19741c = i11;
        boolean z10 = true;
        if (i10 >= 0) {
            if (i11 >= 0) {
                if (!(i11 < i10 ? false : z10)) {
                    throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
    }

    @g
    public m<T> a(int i10) {
        if (i10 >= f()) {
            return this;
        }
        m<T> mVar = this.f19739a;
        int i11 = this.f19740b;
        return new v(mVar, i11, i10 + i11);
    }

    @g
    public m<T> b(int i10) {
        return i10 >= f() ? s.g() : new v(this.f19739a, this.f19740b + i10, this.f19741c);
    }

    public final int f() {
        return this.f19741c - this.f19740b;
    }

    @g
    public Iterator<T> iterator() {
        return new a(this);
    }
}
