package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzaj;
import java.util.ArrayList;
import l8.a;

public final class c0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        ArrayList<zzaj> arrayList = null;
        int i10 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                arrayList = a.L(parcel, X, zzaj.CREATOR);
            } else if (O != 2) {
                a.h0(parcel, X);
            } else {
                i10 = a.Z(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new SleepSegmentRequest(arrayList, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new SleepSegmentRequest[i10];
    }
}
