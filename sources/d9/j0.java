package d9;

import com.google.android.gms.location.ActivityTransition;
import j8.s;
import java.util.Comparator;

public final class j0 implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        s.l(activityTransition);
        s.l(activityTransition2);
        int X0 = activityTransition.X0();
        int X02 = activityTransition2.X0();
        if (X0 != X02) {
            return X0 >= X02 ? 1 : -1;
        }
        int Z0 = activityTransition.Z0();
        int Z02 = activityTransition2.Z0();
        if (Z0 == Z02) {
            return 0;
        }
        return Z0 < Z02 ? -1 : 1;
    }
}
