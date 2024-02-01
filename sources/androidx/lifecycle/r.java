package androidx.lifecycle;

import androidx.lifecycle.p;
import b4.a;
import d.j0;
import fh.g;
import java.util.concurrent.CancellationException;
import pf.n2;
import xe.l0;
import xe.r1;

@r1({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
@j0
public final class r {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final p f2836a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final p.b f2837b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final j f2838c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public final u f2839d;

    public r(@g p pVar, @g p.b bVar, @g j jVar, @g n2 n2Var) {
        l0.p(pVar, "lifecycle");
        l0.p(bVar, "minState");
        l0.p(jVar, "dispatchQueue");
        l0.p(n2Var, "parentJob");
        this.f2836a = pVar;
        this.f2837b = bVar;
        this.f2838c = jVar;
        q qVar = new q(this, n2Var);
        this.f2839d = qVar;
        if (pVar.b() == p.b.DESTROYED) {
            n2.a.b(n2Var, (CancellationException) null, 1, (Object) null);
            b();
            return;
        }
        pVar.a(qVar);
    }

    public static final void d(r rVar, n2 n2Var, y yVar, p.a aVar) {
        l0.p(rVar, "this$0");
        l0.p(n2Var, "$parentJob");
        l0.p(yVar, a.P);
        l0.p(aVar, "<anonymous parameter 1>");
        if (yVar.getLifecycle().b() == p.b.DESTROYED) {
            n2.a.b(n2Var, (CancellationException) null, 1, (Object) null);
            rVar.b();
            return;
        }
        int compareTo = yVar.getLifecycle().b().compareTo(rVar.f2837b);
        j jVar = rVar.f2838c;
        if (compareTo < 0) {
            jVar.h();
        } else {
            jVar.i();
        }
    }

    @j0
    public final void b() {
        this.f2836a.d(this.f2839d);
        this.f2838c.g();
    }

    public final void c(n2 n2Var) {
        n2.a.b(n2Var, (CancellationException) null, 1, (Object) null);
        b();
    }
}
