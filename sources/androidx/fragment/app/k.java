package androidx.fragment.app;

import androidx.lifecycle.a1;
import d.o0;
import java.util.Collection;
import java.util.Map;

@Deprecated
public class k {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final Collection<Fragment> f2633a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, k> f2634b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, a1> f2635c;

    public k(@o0 Collection<Fragment> collection, @o0 Map<String, k> map, @o0 Map<String, a1> map2) {
        this.f2633a = collection;
        this.f2634b = map;
        this.f2635c = map2;
    }

    @o0
    public Map<String, k> a() {
        return this.f2634b;
    }

    @o0
    public Collection<Fragment> b() {
        return this.f2633a;
    }

    @o0
    public Map<String, a1> c() {
        return this.f2635c;
    }

    public boolean d(Fragment fragment) {
        Collection<Fragment> collection = this.f2633a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
