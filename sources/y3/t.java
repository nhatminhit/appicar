package y3;

import d.m0;
import e1.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p7.a;
import t4.k;
import v3.i;
import w3.e;
import y3.i;

public class t<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<Data> f15451a;

    /* renamed from: b  reason: collision with root package name */
    public final m.a<List<Throwable>> f15452b;

    /* renamed from: c  reason: collision with root package name */
    public final List<? extends i<Data, ResourceType, Transcode>> f15453c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15454d;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, m.a<List<Throwable>> aVar) {
        this.f15451a = cls;
        this.f15452b = aVar;
        this.f15453c = (List) k.c(list);
        this.f15454d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + a.f11639j;
    }

    public Class<Data> a() {
        return this.f15451a;
    }

    public v<Transcode> b(e<Data> eVar, @m0 i iVar, int i10, int i11, i.a<ResourceType> aVar) throws q {
        List list = (List) k.d(this.f15452b.b());
        try {
            return c(eVar, iVar, i10, i11, aVar, list);
        } finally {
            this.f15452b.a(list);
        }
    }

    public final v<Transcode> c(e<Data> eVar, @m0 v3.i iVar, int i10, int i11, i.a<ResourceType> aVar, List<Throwable> list) throws q {
        List<Throwable> list2 = list;
        int size = this.f15453c.size();
        v<Transcode> vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVar = ((i) this.f15453c.get(i12)).a(eVar, i10, i11, iVar, aVar);
            } catch (q e10) {
                list2.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f15454d, (List<Throwable>) new ArrayList(list2));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f15453c.toArray()) + '}';
    }
}
