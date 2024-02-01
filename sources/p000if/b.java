package p000if;

import b4.a;
import fh.g;
import java.util.HashSet;
import java.util.Iterator;
import we.l;
import xe.l0;

/* renamed from: if.b  reason: invalid package */
public final class b<T, K> extends be.b<T> {
    @g
    public final Iterator<T> Q;
    @g
    public final l<T, K> R;
    @g
    public final HashSet<K> S = new HashSet<>();

    public b(@g Iterator<? extends T> it, @g l<? super T, ? extends K> lVar) {
        l0.p(it, a.P);
        l0.p(lVar, "keySelector");
        this.Q = it;
        this.R = lVar;
    }

    public void a() {
        while (this.Q.hasNext()) {
            T next = this.Q.next();
            if (this.S.add(this.R.A(next))) {
                c(next);
                return;
            }
        }
        b();
    }
}
