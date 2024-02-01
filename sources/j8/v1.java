package j8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import l8.a;

public final class v1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        Bundle bundle = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i10 = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                bundle = a.g(parcel, X);
            } else if (O == 2) {
                featureArr = (Feature[]) a.K(parcel, X, Feature.CREATOR);
            } else if (O == 3) {
                i10 = a.Z(parcel, X);
            } else if (O != 4) {
                a.h0(parcel, X);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) a.C(parcel, X, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        a.N(parcel, i02);
        return new zzj(bundle, featureArr, i10, connectionTelemetryConfiguration);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
