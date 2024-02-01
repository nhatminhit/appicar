package z8;

import java.util.Iterator;

public final class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f16015a;

    public j(a aVar) {
        this.f16015a = aVar;
    }

    public final void a(e eVar) {
        this.f16015a.f16009a = eVar;
        Iterator it = this.f16015a.f16011c.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a(this.f16015a.f16009a);
        }
        this.f16015a.f16011c.clear();
        this.f16015a.f16010b = null;
    }
}
