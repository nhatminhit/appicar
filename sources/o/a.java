package o;

import d.m0;
import d.o0;
import d.x0;
import java.util.HashMap;
import java.util.Map;
import o.b;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class a<K, V> extends b<K, V> {
    public final HashMap<K, b.c<K, V>> S = new HashMap<>();

    @o0
    public b.c<K, V> c(K k10) {
        return this.S.get(k10);
    }

    public boolean contains(K k10) {
        return this.S.containsKey(k10);
    }

    public V i(@m0 K k10, @m0 V v10) {
        b.c c10 = c(k10);
        if (c10 != null) {
            return c10.P;
        }
        this.S.put(k10, h(k10, v10));
        return null;
    }

    public V j(@m0 K k10) {
        V j10 = super.j(k10);
        this.S.remove(k10);
        return j10;
    }

    @o0
    public Map.Entry<K, V> l(K k10) {
        if (contains(k10)) {
            return this.S.get(k10).R;
        }
        return null;
    }
}
