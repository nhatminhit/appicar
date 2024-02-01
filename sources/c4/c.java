package c4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<d, Integer> f4813a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f4814b;

    /* renamed from: c  reason: collision with root package name */
    public int f4815c;

    /* renamed from: d  reason: collision with root package name */
    public int f4816d;

    public c(Map<d, Integer> map) {
        this.f4813a = map;
        this.f4814b = new ArrayList(map.keySet());
        for (Integer intValue : map.values()) {
            this.f4815c += intValue.intValue();
        }
    }

    public int a() {
        return this.f4815c;
    }

    public boolean b() {
        return this.f4815c == 0;
    }

    public d c() {
        d dVar = this.f4814b.get(this.f4816d);
        Integer num = this.f4813a.get(dVar);
        if (num.intValue() == 1) {
            this.f4813a.remove(dVar);
            this.f4814b.remove(this.f4816d);
        } else {
            this.f4813a.put(dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f4815c--;
        this.f4816d = this.f4814b.isEmpty() ? 0 : (this.f4816d + 1) % this.f4814b.size();
        return dVar;
    }
}
