package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.location.LastLocationRequest;
import l8.a;

public final class y0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        String str = null;
        zzd zzd = null;
        int i10 = 0;
        boolean z10 = false;
        long j10 = Long.MAX_VALUE;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                j10 = a.c0(parcel, X);
            } else if (O == 2) {
                i10 = a.Z(parcel, X);
            } else if (O == 3) {
                z10 = a.P(parcel, X);
            } else if (O == 4) {
                str = a.G(parcel, X);
            } else if (O != 5) {
                a.h0(parcel, X);
            } else {
                zzd = (zzd) a.C(parcel, X, zzd.CREATOR);
            }
        }
        a.N(parcel, i02);
        return new LastLocationRequest(j10, i10, z10, str, zzd);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LastLocationRequest[i10];
    }
}
