package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

public class f0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f3430a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<a<T>> f3431b = new SparseArray<>(10);

    /* renamed from: c  reason: collision with root package name */
    public a<T> f3432c;

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T[] f3433a;

        /* renamed from: b  reason: collision with root package name */
        public int f3434b;

        /* renamed from: c  reason: collision with root package name */
        public int f3435c;

        /* renamed from: d  reason: collision with root package name */
        public a<T> f3436d;

        public a(Class<T> cls, int i10) {
            this.f3433a = (Object[]) Array.newInstance(cls, i10);
        }

        public boolean a(int i10) {
            int i11 = this.f3434b;
            return i11 <= i10 && i10 < i11 + this.f3435c;
        }

        public T b(int i10) {
            return this.f3433a[i10 - this.f3434b];
        }
    }

    public f0(int i10) {
        this.f3430a = i10;
    }

    public a<T> a(a<T> aVar) {
        int indexOfKey = this.f3431b.indexOfKey(aVar.f3434b);
        if (indexOfKey < 0) {
            this.f3431b.put(aVar.f3434b, aVar);
            return null;
        }
        a<T> valueAt = this.f3431b.valueAt(indexOfKey);
        this.f3431b.setValueAt(indexOfKey, aVar);
        if (this.f3432c == valueAt) {
            this.f3432c = aVar;
        }
        return valueAt;
    }

    public void b() {
        this.f3431b.clear();
    }

    public a<T> c(int i10) {
        return this.f3431b.valueAt(i10);
    }

    public T d(int i10) {
        a<T> aVar = this.f3432c;
        if (aVar == null || !aVar.a(i10)) {
            int indexOfKey = this.f3431b.indexOfKey(i10 - (i10 % this.f3430a));
            if (indexOfKey < 0) {
                return null;
            }
            this.f3432c = this.f3431b.valueAt(indexOfKey);
        }
        return this.f3432c.b(i10);
    }

    public a<T> e(int i10) {
        a<T> aVar = this.f3431b.get(i10);
        if (this.f3432c == aVar) {
            this.f3432c = null;
        }
        this.f3431b.delete(i10);
        return aVar;
    }

    public int f() {
        return this.f3431b.size();
    }
}
