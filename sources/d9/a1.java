package d9;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.location.LocationRequest;
import l8.a;

public final class a1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i02 = a.i0(parcel);
        WorkSource workSource = new WorkSource();
        String str = null;
        zzd zzd = null;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 102;
        long j12 = 3600000;
        long j13 = 600000;
        long j14 = 0;
        int i13 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        long j15 = -1;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    i12 = a.Z(parcel2, X);
                    break;
                case 2:
                    j12 = a.c0(parcel2, X);
                    break;
                case 3:
                    j13 = a.c0(parcel2, X);
                    break;
                case 5:
                    j10 = a.c0(parcel2, X);
                    break;
                case 6:
                    i13 = a.Z(parcel2, X);
                    break;
                case 7:
                    f10 = a.V(parcel2, X);
                    break;
                case 8:
                    j14 = a.c0(parcel2, X);
                    break;
                case 9:
                    z10 = a.P(parcel2, X);
                    break;
                case 10:
                    j11 = a.c0(parcel2, X);
                    break;
                case 11:
                    j15 = a.c0(parcel2, X);
                    break;
                case 12:
                    i10 = a.Z(parcel2, X);
                    break;
                case 13:
                    i11 = a.Z(parcel2, X);
                    break;
                case 14:
                    str = a.G(parcel2, X);
                    break;
                case 15:
                    z11 = a.P(parcel2, X);
                    break;
                case 16:
                    workSource = (WorkSource) a.C(parcel2, X, WorkSource.CREATOR);
                    break;
                case 17:
                    zzd = (zzd) a.C(parcel2, X, zzd.CREATOR);
                    break;
                default:
                    a.h0(parcel2, X);
                    break;
            }
        }
        a.N(parcel2, i02);
        return new LocationRequest(i12, j12, j13, j14, j10, j11, i13, f10, z10, j15, i10, i11, str, z11, workSource, zzd);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
