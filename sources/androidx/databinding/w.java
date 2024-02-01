package androidx.databinding;

import androidx.collection.a;
import androidx.databinding.z;
import java.util.Collection;

public class w<K, V> extends a<K, V> implements z<K, V> {

    /* renamed from: b0  reason: collision with root package name */
    public transient t f2374b0;

    public void a(z.a<? extends z<K, V>, K, V> aVar) {
        if (this.f2374b0 == null) {
            this.f2374b0 = new t();
        }
        this.f2374b0.a(aVar);
    }

    public void clear() {
        if (!isEmpty()) {
            super.clear();
            v((Object) null);
        }
    }

    public void d(z.a<? extends z<K, V>, K, V> aVar) {
        t tVar = this.f2374b0;
        if (tVar != null) {
            tVar.t(aVar);
        }
    }

    public V o(int i10) {
        Object m10 = m(i10);
        V o10 = super.o(i10);
        if (o10 != null) {
            v(m10);
        }
        return o10;
    }

    public V p(int i10, V v10) {
        Object m10 = m(i10);
        V p10 = super.p(i10, v10);
        v(m10);
        return p10;
    }

    public V put(K k10, V v10) {
        super.put(k10, v10);
        v(k10);
        return v10;
    }

    public boolean t(Collection<?> collection) {
        boolean z10 = false;
        for (Object h10 : collection) {
            int h11 = h(h10);
            if (h11 >= 0) {
                z10 = true;
                o(h11);
            }
        }
        return z10;
    }

    public boolean u(Collection<?> collection) {
        boolean z10 = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(m(size))) {
                o(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void v(Object obj) {
        t tVar = this.f2374b0;
        if (tVar != null) {
            tVar.n(this, 0, obj);
        }
    }
}
