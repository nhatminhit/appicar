package androidx.activity;

import d.j0;
import d.m0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f625a;

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArrayList<a> f626b = new CopyOnWriteArrayList<>();

    public b(boolean z10) {
        this.f625a = z10;
    }

    public void a(@m0 a aVar) {
        this.f626b.add(aVar);
    }

    @j0
    public abstract void b();

    @j0
    public final boolean c() {
        return this.f625a;
    }

    @j0
    public final void d() {
        Iterator<a> it = this.f626b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void e(@m0 a aVar) {
        this.f626b.remove(aVar);
    }

    @j0
    public final void f(boolean z10) {
        this.f625a = z10;
    }
}
