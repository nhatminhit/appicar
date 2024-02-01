package d8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzo;
import l8.a;

public final class p0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                str = a.G(parcel, X);
            } else if (O == 2) {
                z10 = a.P(parcel, X);
            } else if (O == 3) {
                z11 = a.P(parcel, X);
            } else if (O == 4) {
                iBinder = a.Y(parcel, X);
            } else if (O != 5) {
                a.h0(parcel, X);
            } else {
                z12 = a.P(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new zzo(str, z10, z11, iBinder, z12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
