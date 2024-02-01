package p8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;
import l8.a;

public final class e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        ArrayList<Feature> arrayList = null;
        String str = null;
        boolean z10 = false;
        String str2 = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                arrayList = a.L(parcel, X, Feature.CREATOR);
            } else if (O == 2) {
                z10 = a.P(parcel, X);
            } else if (O == 3) {
                str2 = a.G(parcel, X);
            } else if (O != 4) {
                a.h0(parcel, X);
            } else {
                str = a.G(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new ApiFeatureRequest(arrayList, z10, str2, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ApiFeatureRequest[i10];
    }
}
