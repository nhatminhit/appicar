package h9;

import d.m0;
import java.util.ArrayList;
import java.util.Collection;

public final class r implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Collection f8943a;

    public r(Collection collection) {
        this.f8943a = collection;
    }

    public final /* bridge */ /* synthetic */ Object a(@m0 m mVar) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (m r10 : this.f8943a) {
            arrayList.add(r10.r());
        }
        return arrayList;
    }
}
