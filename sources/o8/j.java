package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import l8.a;

public final class j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        Long l10 = null;
        Long l11 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O == 2) {
                i11 = a.Z(parcel, X);
            } else if (O == 3) {
                l10 = a.d0(parcel, X);
            } else if (O == 4) {
                l11 = a.d0(parcel, X);
            } else if (O != 5) {
                a.h0(parcel, X);
            } else {
                i12 = a.Z(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new ModuleInstallStatusUpdate(i10, i11, l10, l11, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallStatusUpdate[i10];
    }
}
