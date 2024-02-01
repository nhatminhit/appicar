package p8;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.Comparator;

public final /* synthetic */ class d implements Comparator {
    public static final /* synthetic */ d O = new d();

    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        return !feature.X0().equals(feature2.X0()) ? feature.X0().compareTo(feature2.X0()) : (feature.Z0() > feature2.Z0() ? 1 : (feature.Z0() == feature2.Z0() ? 0 : -1));
    }
}
