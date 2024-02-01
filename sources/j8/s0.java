package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import l8.a;

public final class s0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i02 = a.i0(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
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
                    i12 = a.Z(parcel2, X);
                    break;
                case 4:
                    j10 = a.c0(parcel2, X);
                    break;
                case 5:
                    j11 = a.c0(parcel2, X);
                    break;
                case 6:
                    str = a.G(parcel2, X);
                    break;
                case 7:
                    str2 = a.G(parcel2, X);
                    break;
                case 8:
                    i13 = a.Z(parcel2, X);
                    break;
                case 9:
                    i14 = a.Z(parcel2, X);
                    break;
                default:
                    a.h0(parcel2, X);
                    break;
            }
        }
        a.N(parcel2, i02);
        return new MethodInvocation(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
