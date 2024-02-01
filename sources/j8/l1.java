package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import l8.a;

public final class l1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O == 2) {
                z10 = a.P(parcel, X);
            } else if (O == 3) {
                z11 = a.P(parcel, X);
            } else if (O == 4) {
                i11 = a.Z(parcel, X);
            } else if (O != 5) {
                a.h0(parcel, X);
            } else {
                i12 = a.Z(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new RootTelemetryConfiguration(i10, z10, z11, i11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new RootTelemetryConfiguration[i10];
    }
}
