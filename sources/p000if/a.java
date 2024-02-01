package p000if;

import fh.g;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import xe.l0;

/* renamed from: if.a  reason: invalid package */
public final class a<T> implements m<T> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<m<T>> f19697a;

    public a(@g m<? extends T> mVar) {
        l0.p(mVar, "sequence");
        this.f19697a = new AtomicReference<>(mVar);
    }

    @g
    public Iterator<T> iterator() {
        m andSet = this.f19697a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
