package p000if;

import b4.a;
import fh.g;
import java.util.Iterator;
import we.l;
import xe.l0;

/* renamed from: if.c  reason: invalid package */
public final class c<T, K> implements m<T> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final m<T> f19698a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final l<T, K> f19699b;

    public c(@g m<? extends T> mVar, @g l<? super T, ? extends K> lVar) {
        l0.p(mVar, a.P);
        l0.p(lVar, "keySelector");
        this.f19698a = mVar;
        this.f19699b = lVar;
    }

    @g
    public Iterator<T> iterator() {
        return new b(this.f19698a.iterator(), this.f19699b);
    }
}
