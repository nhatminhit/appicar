package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;
import l8.a;

public final class f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i02 = a.i0(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        float f10 = 0.0f;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    i10 = a.Z(parcel2, X);
                    break;
                case 2:
                    j10 = a.c0(parcel2, X);
                    break;
                case 4:
                    str = a.G(parcel2, X);
                    break;
                case 5:
                    i12 = a.Z(parcel2, X);
                    break;
                case 6:
                    arrayList = a.I(parcel2, X);
                    break;
                case 8:
                    j11 = a.c0(parcel2, X);
                    break;
                case 10:
                    str3 = a.G(parcel2, X);
                    break;
                case 11:
                    i11 = a.Z(parcel2, X);
                    break;
                case 12:
                    str2 = a.G(parcel2, X);
                    break;
                case 13:
                    str4 = a.G(parcel2, X);
                    break;
                case 14:
                    i13 = a.Z(parcel2, X);
                    break;
                case 15:
                    f10 = a.V(parcel2, X);
                    break;
                case 16:
                    j12 = a.c0(parcel2, X);
                    break;
                case 17:
                    str5 = a.G(parcel2, X);
                    break;
                case 18:
                    z10 = a.P(parcel2, X);
                    break;
                default:
                    a.h0(parcel2, X);
                    break;
            }
        }
        a.N(parcel2, i02);
        return new WakeLockEvent(i10, j10, i11, str, i12, arrayList, str2, j11, i13, str3, str4, f10, j12, str5, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new WakeLockEvent[i10];
    }
}
