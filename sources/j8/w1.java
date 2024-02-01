package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import l8.a;

public final class w1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) a.C(parcel, X, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z10 = a.P(parcel, X);
                    break;
                case 3:
                    z11 = a.P(parcel, X);
                    break;
                case 4:
                    iArr = a.u(parcel, X);
                    break;
                case 5:
                    i10 = a.Z(parcel, X);
                    break;
                case 6:
                    iArr2 = a.u(parcel, X);
                    break;
                default:
                    a.h0(parcel, X);
                    break;
            }
        }
        a.N(parcel, i02);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z10, z11, iArr, i10, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionTelemetryConfiguration[i10];
    }
}
