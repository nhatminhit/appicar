package yb;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import qa.a;
import qa.e;
import qa.k;

public class o implements l {

    /* renamed from: a  reason: collision with root package name */
    public Collection<a> f24719a;

    /* renamed from: b  reason: collision with root package name */
    public Map<e, ?> f24720b;

    /* renamed from: c  reason: collision with root package name */
    public String f24721c;

    /* renamed from: d  reason: collision with root package name */
    public int f24722d;

    public o() {
    }

    public o(Collection<a> collection) {
        this.f24719a = collection;
    }

    public o(Collection<a> collection, Map<e, ?> map, String str, int i10) {
        this.f24719a = collection;
        this.f24720b = map;
        this.f24721c = str;
        this.f24722d = i10;
    }

    public k a(Map<e, ?> map) {
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.putAll(map);
        Map<e, ?> map2 = this.f24720b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<a> collection = this.f24719a;
        if (collection != null) {
            enumMap.put(e.POSSIBLE_FORMATS, collection);
        }
        String str = this.f24721c;
        if (str != null) {
            enumMap.put(e.CHARACTER_SET, str);
        }
        k kVar = new k();
        kVar.e(enumMap);
        int i10 = this.f24722d;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? new k(kVar) : new q(kVar) : new p(kVar) : new k(kVar);
    }
}
