package t4;

import androidx.collection.a;
import androidx.collection.i;

public final class b<K, V> extends a<K, V> {

    /* renamed from: b0  reason: collision with root package name */
    public int f12942b0;

    public void clear() {
        this.f12942b0 = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f12942b0 == 0) {
            this.f12942b0 = super.hashCode();
        }
        return this.f12942b0;
    }

    public void n(i<? extends K, ? extends V> iVar) {
        this.f12942b0 = 0;
        super.n(iVar);
    }

    public V o(int i10) {
        this.f12942b0 = 0;
        return super.o(i10);
    }

    public V p(int i10, V v10) {
        this.f12942b0 = 0;
        return super.p(i10, v10);
    }

    public V put(K k10, V v10) {
        this.f12942b0 = 0;
        return super.put(k10, v10);
    }
}
