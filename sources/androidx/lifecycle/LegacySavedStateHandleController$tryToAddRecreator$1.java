package androidx.lifecycle;

import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.p;
import b4.a;
import fh.g;
import h0.u0;
import xe.l0;
import y2.c;

public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements u {
    public final /* synthetic */ p O;
    public final /* synthetic */ c P;

    public LegacySavedStateHandleController$tryToAddRecreator$1(p pVar, c cVar) {
        this.O = pVar;
        this.P = cVar;
    }

    public void d(@g y yVar, @g p.a aVar) {
        l0.p(yVar, a.P);
        l0.p(aVar, u0.f8532r0);
        if (aVar == p.a.ON_START) {
            this.O.d(this);
            this.P.k(LegacySavedStateHandleController.a.class);
        }
    }
}
