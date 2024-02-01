package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;
import l8.a;

public final class k0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        ArrayList<ActivityTransition> arrayList = null;
        String str = null;
        ArrayList<ClientIdentity> arrayList2 = null;
        String str2 = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                arrayList = a.L(parcel, X, ActivityTransition.CREATOR);
            } else if (O == 2) {
                str = a.G(parcel, X);
            } else if (O == 3) {
                arrayList2 = a.L(parcel, X, ClientIdentity.CREATOR);
            } else if (O != 4) {
                a.h0(parcel, X);
            } else {
                str2 = a.G(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new ActivityTransitionRequest(arrayList, str, arrayList2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActivityTransitionRequest[i10];
    }
}
