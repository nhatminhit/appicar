package g8;

import com.google.android.gms.common.api.internal.o;
import d.h1;
import f8.a;
import java.util.ArrayList;

public final class f0 extends l0 {
    public final ArrayList P;
    public final /* synthetic */ o Q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(o oVar, ArrayList arrayList) {
        super(oVar, (k0) null);
        this.Q = oVar;
        this.P = arrayList;
    }

    @h1
    public final void a() {
        o oVar = this.Q;
        oVar.f5688a.f5733b0.f5724s = o.y(oVar);
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar2 = this.Q;
            ((a.f) arrayList.get(i10)).i(oVar2.f5702o, oVar2.f5688a.f5733b0.f5724s);
        }
    }
}
