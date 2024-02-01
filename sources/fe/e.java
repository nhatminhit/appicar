package fe;

import java.util.Comparator;

public final /* synthetic */ class e implements Comparator {
    public final /* synthetic */ Comparator O;

    public /* synthetic */ e(Comparator comparator) {
        this.O = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return g.t(this.O, obj, obj2);
    }
}
