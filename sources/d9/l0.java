package d9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import java.util.ArrayList;
import l8.a;

public final class l0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        ArrayList<ActivityTransitionEvent> arrayList = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                arrayList = a.L(parcel, X, ActivityTransitionEvent.CREATOR);
            } else if (O != 2) {
                a.h0(parcel, X);
            } else {
                bundle = a.g(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new ActivityTransitionResult(arrayList, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActivityTransitionResult[i10];
    }
}
