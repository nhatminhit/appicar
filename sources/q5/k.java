package q5;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class k implements Iterable<i> {
    public Map<x, i> O;

    public k() {
    }

    public k(Map<x, i> map) {
        this.O = map;
    }

    public i b(String str, Class<?>[] clsArr) {
        Map<x, i> map = this.O;
        if (map == null) {
            return null;
        }
        return map.get(new x(str, clsArr));
    }

    public i c(Method method) {
        Map<x, i> map = this.O;
        if (map == null) {
            return null;
        }
        return map.get(new x(method));
    }

    public Iterator<i> iterator() {
        Map<x, i> map = this.O;
        return map == null ? Collections.emptyIterator() : map.values().iterator();
    }

    public int size() {
        Map<x, i> map = this.O;
        if (map == null) {
            return 0;
        }
        return map.size();
    }
}
