package g8;

import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.signin.internal.zak;
import d.g;
import g9.c;
import java.lang.ref.WeakReference;

public final class h0 extends c {
    public final WeakReference O;

    public h0(o oVar) {
        this.O = new WeakReference(oVar);
    }

    @g
    public final void h0(zak zak) {
        o oVar = (o) this.O.get();
        if (oVar != null) {
            oVar.f5688a.s(new g0(this, oVar, oVar, zak));
        }
    }
}
