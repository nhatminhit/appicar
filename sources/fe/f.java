package fe;

import java.util.Comparator;

public final /* synthetic */ class f implements Comparator {
    public final /* synthetic */ Comparator O;

    public /* synthetic */ f(Comparator comparator) {
        this.O = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return g.w(this.O, obj, obj2);
    }
}
