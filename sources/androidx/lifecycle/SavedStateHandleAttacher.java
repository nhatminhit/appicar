package androidx.lifecycle;

import androidx.lifecycle.p;
import b4.a;
import fh.g;
import h0.u0;
import xe.l0;

public final class SavedStateHandleAttacher implements u {
    @g
    public final p0 O;

    public SavedStateHandleAttacher(@g p0 p0Var) {
        l0.p(p0Var, "provider");
        this.O = p0Var;
    }

    public void d(@g y yVar, @g p.a aVar) {
        l0.p(yVar, a.P);
        l0.p(aVar, u0.f8532r0);
        if (aVar == p.a.ON_CREATE) {
            yVar.getLifecycle().d(this);
            this.O.d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
