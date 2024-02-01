package h6;

import h6.c;

public abstract class c<T extends c<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final a<T> f8857a;

    /* renamed from: b  reason: collision with root package name */
    public int f8858b = 0;

    public interface a<T extends c<T>> {
        void a(T t10);
    }

    public c(a<T> aVar) {
        this.f8857a = aVar;
    }

    public void a() {
        this.f8858b++;
    }

    public void b() {
        int i10 = this.f8858b - 1;
        this.f8858b = i10;
        if (i10 == 0) {
            this.f8857a.a(this);
        } else if (i10 < 0) {
            throw new IllegalStateException("Illegal release of resource.");
        }
    }
}
