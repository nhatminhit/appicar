package y3;

import android.util.Log;
import d.m0;
import e1.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l4.e;
import v3.k;

public class i<DataType, ResourceType, Transcode> {

    /* renamed from: f  reason: collision with root package name */
    public static final String f15386f = "DecodePath";

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f15387a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends k<DataType, ResourceType>> f15388b;

    /* renamed from: c  reason: collision with root package name */
    public final e<ResourceType, Transcode> f15389c;

    /* renamed from: d  reason: collision with root package name */
    public final m.a<List<Throwable>> f15390d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15391e;

    public interface a<ResourceType> {
        @m0
        v<ResourceType> a(@m0 v<ResourceType> vVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends k<DataType, ResourceType>> list, e<ResourceType, Transcode> eVar, m.a<List<Throwable>> aVar) {
        this.f15387a = cls;
        this.f15388b = list;
        this.f15389c = eVar;
        this.f15390d = aVar;
        this.f15391e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + p7.a.f11639j;
    }

    public v<Transcode> a(w3.e<DataType> eVar, int i10, int i11, @m0 v3.i iVar, a<ResourceType> aVar) throws q {
        return this.f15389c.a(aVar.a(b(eVar, i10, i11, iVar)), iVar);
    }

    @m0
    public final v<ResourceType> b(w3.e<DataType> eVar, int i10, int i11, @m0 v3.i iVar) throws q {
        List list = (List) t4.k.d(this.f15390d.b());
        try {
            return c(eVar, i10, i11, iVar, list);
        } finally {
            this.f15390d.a(list);
        }
    }

    @m0
    public final v<ResourceType> c(w3.e<DataType> eVar, int i10, int i11, @m0 v3.i iVar, List<Throwable> list) throws q {
        int size = this.f15388b.size();
        v<ResourceType> vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            k kVar = (k) this.f15388b.get(i12);
            try {
                if (kVar.b(eVar.a(), iVar)) {
                    vVar = kVar.a(eVar.a(), i10, i11, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable(f15386f, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to decode data for ");
                    sb2.append(kVar);
                }
                list.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f15391e, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f15387a + ", decoders=" + this.f15388b + ", transcoder=" + this.f15389c + '}';
    }
}
