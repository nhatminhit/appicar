package be;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import oe.f;
import xe.l0;
import zd.k;
import zd.l;

public class b1 extends a1 {
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @f
    @k(message = "Use maxByOrNull instead.", replaceWith = @zd.b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> L0(Map<? extends K, ? extends V> map, we.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        T t10;
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            t10 = null;
        } else {
            T next = it.next();
            if (!it.hasNext()) {
                t10 = next;
            } else {
                Comparable comparable = (Comparable) lVar.A(next);
                do {
                    T next2 = it.next();
                    Comparable comparable2 = (Comparable) lVar.A(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            t10 = next;
        }
        return (Map.Entry) t10;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @f
    @k(message = "Use maxWithOrNull instead.", replaceWith = @zd.b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ <K, V> Map.Entry<K, V> M0(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        l0.p(map, "<this>");
        l0.p(comparator, "comparator");
        return (Map.Entry) e0.Q3(map.entrySet(), comparator);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @zd.b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> N0(Map<? extends K, ? extends V> map, we.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        T t10;
        l0.p(map, "<this>");
        l0.p(lVar, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            t10 = null;
        } else {
            T next = it.next();
            if (!it.hasNext()) {
                t10 = next;
            } else {
                Comparable comparable = (Comparable) lVar.A(next);
                do {
                    T next2 = it.next();
                    Comparable comparable2 = (Comparable) lVar.A(next2);
                    if (comparable.compareTo(comparable2) > 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            t10 = next;
        }
        return (Map.Entry) t10;
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @zd.b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Map.Entry O0(Map map, Comparator comparator) {
        l0.p(map, "<this>");
        l0.p(comparator, "comparator");
        return (Map.Entry) e0.i4(map.entrySet(), comparator);
    }
}
