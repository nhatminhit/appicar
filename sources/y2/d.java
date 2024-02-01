package y2;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.savedstate.Recreator;
import d.j0;
import fh.g;
import fh.h;
import kotlin.Metadata;
import ve.m;
import xe.l0;
import xe.w;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0017"}, d2 = {"Ly2/d;", "", "Lzd/u2;", "c", "Landroid/os/Bundle;", "savedState", "d", "outBundle", "e", "Ly2/e;", "a", "Ly2/e;", "owner", "Ly2/c;", "b", "Ly2/c;", "()Ly2/c;", "savedStateRegistry", "", "Z", "attached", "<init>", "(Ly2/e;)V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
public final class d {
    @g

    /* renamed from: d  reason: collision with root package name */
    public static final a f15318d = new a((w) null);
    @g

    /* renamed from: a  reason: collision with root package name */
    public final e f15319a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final c f15320b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15321c;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Ly2/d$a;", "", "Ly2/e;", "owner", "Ly2/d;", "a", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @g
        @m
        public final d a(@g e eVar) {
            l0.p(eVar, "owner");
            return new d(eVar, (w) null);
        }
    }

    public d(e eVar) {
        this.f15319a = eVar;
        this.f15320b = new c();
    }

    public /* synthetic */ d(e eVar, w wVar) {
        this(eVar);
    }

    @g
    @m
    public static final d a(@g e eVar) {
        return f15318d.a(eVar);
    }

    @g
    public final c b() {
        return this.f15320b;
    }

    @j0
    public final void c() {
        p lifecycle = this.f15319a.getLifecycle();
        l0.o(lifecycle, "owner.lifecycle");
        if (lifecycle.b() == p.b.INITIALIZED) {
            lifecycle.a(new Recreator(this.f15319a));
            this.f15320b.g(lifecycle);
            this.f15321c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    @j0
    public final void d(@h Bundle bundle) {
        if (!this.f15321c) {
            c();
        }
        p lifecycle = this.f15319a.getLifecycle();
        l0.o(lifecycle, "owner.lifecycle");
        if (!lifecycle.b().b(p.b.STARTED)) {
            this.f15320b.h(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    @j0
    public final void e(@g Bundle bundle) {
        l0.p(bundle, "outBundle");
        this.f15320b.i(bundle);
    }
}
