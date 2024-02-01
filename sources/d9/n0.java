package d9;

import com.google.android.gms.location.DetectedActivity;
import j8.s;
import java.util.Comparator;

public final class n0 implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        s.l(detectedActivity);
        s.l(detectedActivity2);
        int compareTo = Integer.valueOf(detectedActivity2.X0()).compareTo(Integer.valueOf(detectedActivity.X0()));
        return compareTo == 0 ? Integer.valueOf(detectedActivity.Z0()).compareTo(Integer.valueOf(detectedActivity2.Z0())) : compareTo;
    }
}
