package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import l8.a;

public final class i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O != 2) {
                a.h0(parcel, X);
            } else {
                z10 = a.P(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new ModuleInstallResponse(i10, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallResponse[i10];
    }
}
