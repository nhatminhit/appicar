package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzaj;
import l8.a;

public final class m1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            if (a.O(X) != 1) {
                a.h0(parcel, X);
            } else {
                i10 = a.Z(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new zzaj(i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaj[i10];
    }
}
