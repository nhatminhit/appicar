package androidx.lifecycle;

import androidx.lifecycle.p;
import b4.a;
import fh.g;
import h0.u0;
import xe.l0;
import xe.r1;
import y2.c;

@r1({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class SavedStateHandleController implements u {
    @g
    public final String O;
    @g
    public final n0 P;
    public boolean Q;

    public SavedStateHandleController(@g String str, @g n0 n0Var) {
        l0.p(str, "key");
        l0.p(n0Var, "handle");
        this.O = str;
        this.P = n0Var;
    }

    public final void a(@g c cVar, @g p pVar) {
        l0.p(cVar, "registry");
        l0.p(pVar, "lifecycle");
        if (!this.Q) {
            this.Q = true;
            pVar.a(this);
            cVar.j(this.O, this.P.o());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public void d(@g y yVar, @g p.a aVar) {
        l0.p(yVar, a.P);
        l0.p(aVar, u0.f8532r0);
        if (aVar == p.a.ON_DESTROY) {
            this.Q = false;
            yVar.getLifecycle().d(this);
        }
    }

    @g
    public final n0 i() {
        return this.P;
    }

    public final boolean j() {
        return this.Q;
    }
}
