package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.zzac;
import l8.a;

public final class z0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i02 = a.i0(parcel);
        int i10 = 1;
        int i11 = 1;
        int i12 = 1000;
        long j10 = 0;
        zzac[] zzacArr = null;
        boolean z10 = false;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    i10 = a.Z(parcel2, X);
                    break;
                case 2:
                    i11 = a.Z(parcel2, X);
                    break;
                case 3:
                    j10 = a.c0(parcel2, X);
                    break;
                case 4:
                    i12 = a.Z(parcel2, X);
                    break;
                case 5:
                    zzacArr = (zzac[]) a.K(parcel2, X, zzac.CREATOR);
                    break;
                case 6:
                    z10 = a.P(parcel2, X);
                    break;
                default:
                    a.h0(parcel2, X);
                    break;
            }
        }
        a.N(parcel2, i02);
        return new LocationAvailability(i12, i10, i11, j10, zzacArr, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
