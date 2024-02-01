package d9;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.location.CurrentLocationRequest;
import l8.a;

public final class m0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i02 = a.i0(parcel);
        WorkSource workSource = new WorkSource();
        String str = null;
        zzd zzd = null;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 102;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    j10 = a.c0(parcel2, X);
                    break;
                case 2:
                    i10 = a.Z(parcel2, X);
                    break;
                case 3:
                    i12 = a.Z(parcel2, X);
                    break;
                case 4:
                    j11 = a.c0(parcel2, X);
                    break;
                case 5:
                    z10 = a.P(parcel2, X);
                    break;
                case 6:
                    workSource = (WorkSource) a.C(parcel2, X, WorkSource.CREATOR);
                    break;
                case 7:
                    i11 = a.Z(parcel2, X);
                    break;
                case 8:
                    str = a.G(parcel2, X);
                    break;
                case 9:
                    zzd = (zzd) a.C(parcel2, X, zzd.CREATOR);
                    break;
                default:
                    a.h0(parcel2, X);
                    break;
            }
        }
        a.N(parcel2, i02);
        return new CurrentLocationRequest(j10, i10, i12, j11, z10, i11, str, workSource, zzd);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new CurrentLocationRequest[i10];
    }
}
