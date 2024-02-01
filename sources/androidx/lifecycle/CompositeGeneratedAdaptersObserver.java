package androidx.lifecycle;

import androidx.lifecycle.p;
import b4.a;
import fh.g;
import h0.u0;
import xe.l0;

public final class CompositeGeneratedAdaptersObserver implements u {
    @g
    public final l[] O;

    public CompositeGeneratedAdaptersObserver(@g l[] lVarArr) {
        l0.p(lVarArr, "generatedAdapters");
        this.O = lVarArr;
    }

    public void d(@g y yVar, @g p.a aVar) {
        l0.p(yVar, a.P);
        l0.p(aVar, u0.f8532r0);
        f0 f0Var = new f0();
        for (l a10 : this.O) {
            a10.a(yVar, aVar, false, f0Var);
        }
        for (l a11 : this.O) {
            a11.a(yVar, aVar, true, f0Var);
        }
    }
}
