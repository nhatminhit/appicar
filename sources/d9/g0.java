package d9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import l8.a;

public final class g0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        long j10 = 0;
        long j11 = 0;
        ArrayList<DetectedActivity> arrayList = null;
        Bundle bundle = null;
        int i10 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                arrayList = a.L(parcel, X, DetectedActivity.CREATOR);
            } else if (O == 2) {
                j10 = a.c0(parcel, X);
            } else if (O == 3) {
                j11 = a.c0(parcel, X);
            } else if (O == 4) {
                i10 = a.Z(parcel, X);
            } else if (O != 5) {
                a.h0(parcel, X);
            } else {
                bundle = a.g(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new ActivityRecognitionResult(arrayList, j10, j11, i10, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActivityRecognitionResult[i10];
    }
}
