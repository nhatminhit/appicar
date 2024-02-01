package d9;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.zzb;
import l8.a;

public final class f0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i02 = a.i0(parcel);
        boolean z10 = false;
        boolean z11 = false;
        long j10 = 0;
        long j11 = 0;
        WorkSource workSource = null;
        String str = null;
        int[] iArr = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    j10 = a.c0(parcel2, X);
                    break;
                case 2:
                    z10 = a.P(parcel2, X);
                    break;
                case 3:
                    workSource = (WorkSource) a.C(parcel2, X, WorkSource.CREATOR);
                    break;
                case 4:
                    str = a.G(parcel2, X);
                    break;
                case 5:
                    iArr = a.u(parcel2, X);
                    break;
                case 6:
                    z11 = a.P(parcel2, X);
                    break;
                case 7:
                    str2 = a.G(parcel2, X);
                    break;
                case 8:
                    j11 = a.c0(parcel2, X);
                    break;
                case 9:
                    str3 = a.G(parcel2, X);
                    break;
                default:
                    a.h0(parcel2, X);
                    break;
            }
        }
        a.N(parcel2, i02);
        return new zzb(j10, z10, workSource, str, iArr, z11, str2, j11, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzb[i10];
    }
}
