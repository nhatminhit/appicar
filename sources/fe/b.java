package fe;

import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {
    public final /* synthetic */ Comparator O;
    public final /* synthetic */ Comparator P;

    public /* synthetic */ b(Comparator comparator, Comparator comparator2) {
        this.O = comparator;
        this.P = comparator2;
    }

    public final int compare(Object obj, Object obj2) {
        return g.A(this.O, this.P, obj, obj2);
    }
}
