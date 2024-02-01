package p000if;

import fh.g;
import fh.h;
import ie.d;
import ie.i;
import java.util.Iterator;
import java.util.NoSuchElementException;
import xe.l0;
import ye.a;
import zd.d1;
import zd.e1;
import zd.u2;

/* renamed from: if.n  reason: invalid package */
public final class n<T> extends o<T> implements Iterator<T>, d<u2>, a {
    public int O;
    @h
    public T P;
    @h
    public Iterator<? extends T> Q;
    @h
    public d<? super u2> R;

    @h
    public Object a(T t10, @g d<? super u2> dVar) {
        this.P = t10;
        this.O = 3;
        this.R = dVar;
        Object h10 = ke.d.h();
        if (h10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return h10 == ke.d.h() ? h10 : u2.f25116a;
    }

    @g
    public ie.g e() {
        return i.O;
    }

    @h
    public Object h(@g Iterator<? extends T> it, @g d<? super u2> dVar) {
        if (!it.hasNext()) {
            return u2.f25116a;
        }
        this.Q = it;
        this.O = 2;
        this.R = dVar;
        Object h10 = ke.d.h();
        if (h10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return h10 == ke.d.h() ? h10 : u2.f25116a;
    }

    public boolean hasNext() {
        while (true) {
            int i10 = this.O;
            if (i10 != 0) {
                if (i10 == 1) {
                    Iterator<? extends T> it = this.Q;
                    l0.m(it);
                    if (it.hasNext()) {
                        this.O = 2;
                        return true;
                    }
                    this.Q = null;
                } else if (i10 == 2 || i10 == 3) {
                    return true;
                } else {
                    if (i10 == 4) {
                        return false;
                    }
                    throw k();
                }
            }
            this.O = 5;
            d<? super u2> dVar = this.R;
            l0.m(dVar);
            this.R = null;
            d1.a aVar = d1.P;
            dVar.x(d1.b(u2.f25116a));
        }
    }

    public final Throwable k() {
        int i10 = this.O;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.O);
    }

    @h
    public final d<u2> l() {
        return this.R;
    }

    public final T n() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public T next() {
        int i10 = this.O;
        if (i10 == 0 || i10 == 1) {
            return n();
        }
        if (i10 == 2) {
            this.O = 1;
            Iterator<? extends T> it = this.Q;
            l0.m(it);
            return it.next();
        } else if (i10 == 3) {
            this.O = 0;
            T t10 = this.P;
            this.P = null;
            return t10;
        } else {
            throw k();
        }
    }

    public final void o(@h d<? super u2> dVar) {
        this.R = dVar;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void x(@g Object obj) {
        e1.n(obj);
        this.O = 4;
    }
}
