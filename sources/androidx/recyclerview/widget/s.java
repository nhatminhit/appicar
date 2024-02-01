package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import d.m0;
import d.o0;
import java.util.List;

public abstract class s<T, VH extends RecyclerView.e0> extends RecyclerView.g<VH> {

    /* renamed from: c  reason: collision with root package name */
    public final d<T> f3695c;

    /* renamed from: d  reason: collision with root package name */
    public final d.b<T> f3696d;

    public class a implements d.b<T> {
        public a() {
        }

        public void a(@m0 List<T> list, @m0 List<T> list2) {
            s.this.H(list, list2);
        }
    }

    public s(@m0 c<T> cVar) {
        a aVar = new a();
        this.f3696d = aVar;
        d<T> dVar = new d<>((t) new b(this), cVar);
        this.f3695c = dVar;
        dVar.a(aVar);
    }

    public s(@m0 i.d<T> dVar) {
        a aVar = new a();
        this.f3696d = aVar;
        d<T> dVar2 = new d<>((t) new b(this), new c.a(dVar).a());
        this.f3695c = dVar2;
        dVar2.a(aVar);
    }

    @m0
    public List<T> F() {
        return this.f3695c.b();
    }

    public T G(int i10) {
        return this.f3695c.b().get(i10);
    }

    public void H(@m0 List<T> list, @m0 List<T> list2) {
    }

    public void I(@o0 List<T> list) {
        this.f3695c.f(list);
    }

    public void J(@o0 List<T> list, @o0 Runnable runnable) {
        this.f3695c.g(list, runnable);
    }

    public int e() {
        return this.f3695c.b().size();
    }
}
