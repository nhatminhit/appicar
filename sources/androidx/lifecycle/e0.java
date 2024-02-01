package androidx.lifecycle;

import d.i;
import d.j0;
import d.m0;
import d.o0;
import java.util.Iterator;
import java.util.Map;
import o.b;

public class e0<T> extends g0<T> {

    /* renamed from: m  reason: collision with root package name */
    public b<LiveData<?>, a<?>> f2794m = new b<>();

    public static class a<V> implements h0<V> {

        /* renamed from: a  reason: collision with root package name */
        public final LiveData<V> f2795a;

        /* renamed from: b  reason: collision with root package name */
        public final h0<? super V> f2796b;

        /* renamed from: c  reason: collision with root package name */
        public int f2797c = -1;

        public a(LiveData<V> liveData, h0<? super V> h0Var) {
            this.f2795a = liveData;
            this.f2796b = h0Var;
        }

        public void a() {
            this.f2795a.l(this);
        }

        public void b() {
            this.f2795a.p(this);
        }

        public void f(@o0 V v10) {
            if (this.f2797c != this.f2795a.g()) {
                this.f2797c = this.f2795a.g();
                this.f2796b.f(v10);
            }
        }
    }

    public e0() {
    }

    public e0(T t10) {
        super(t10);
    }

    @i
    public void m() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f2794m.iterator();
        while (it.hasNext()) {
            ((a) it.next().getValue()).a();
        }
    }

    @i
    public void n() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f2794m.iterator();
        while (it.hasNext()) {
            ((a) it.next().getValue()).b();
        }
    }

    @j0
    public <S> void s(@m0 LiveData<S> liveData, @m0 h0<? super S> h0Var) {
        if (liveData != null) {
            a aVar = new a(liveData, h0Var);
            a i10 = this.f2794m.i(liveData, aVar);
            if (i10 != null && i10.f2796b != h0Var) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (i10 == null && h()) {
                aVar.a();
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }

    @j0
    public <S> void t(@m0 LiveData<S> liveData) {
        a j10 = this.f2794m.j(liveData);
        if (j10 != null) {
            j10.b();
        }
    }
}
