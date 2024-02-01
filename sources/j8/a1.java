package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zax;
import l8.a;

public final class a1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        int i11 = 0;
        Scope[] scopeArr = null;
        int i12 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                i10 = a.Z(parcel, X);
            } else if (O == 2) {
                i12 = a.Z(parcel, X);
            } else if (O == 3) {
                i11 = a.Z(parcel, X);
            } else if (O != 4) {
                a.h0(parcel, X);
            } else {
                scopeArr = (Scope[]) a.K(parcel, X, Scope.CREATOR);
            }
        }
        a.N(parcel, i02);
        return new zax(i10, i12, i11, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zax[i10];
    }
}
