package d8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzs;
import l8.a;

public final class r0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        boolean z10 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z11 = false;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                str = a.G(parcel, X);
            } else if (O == 2) {
                iBinder = a.Y(parcel, X);
            } else if (O == 3) {
                z10 = a.P(parcel, X);
            } else if (O != 4) {
                a.h0(parcel, X);
            } else {
                z11 = a.P(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new zzs(str, iBinder, z10, z11);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzs[i10];
    }
}
