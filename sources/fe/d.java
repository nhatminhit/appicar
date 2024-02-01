package fe;

import java.util.Comparator;

public final /* synthetic */ class d implements Comparator {
    public final /* synthetic */ Comparator O;
    public final /* synthetic */ Comparator P;

    public /* synthetic */ d(Comparator comparator, Comparator comparator2) {
        this.O = comparator;
        this.P = comparator2;
    }

    public final int compare(Object obj, Object obj2) {
        return g.H(this.O, this.P, obj, obj2);
    }
}
