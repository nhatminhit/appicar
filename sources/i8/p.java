package i8;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import l8.a;

public final class p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        int i11 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                strArr = a.H(parcel, X);
            } else if (O == 2) {
                cursorWindowArr = (CursorWindow[]) a.K(parcel, X, CursorWindow.CREATOR);
            } else if (O == 3) {
                i11 = a.Z(parcel, X);
            } else if (O == 4) {
                bundle = a.g(parcel, X);
            } else if (O != 1000) {
                a.h0(parcel, X);
            } else {
                i10 = a.Z(parcel, X);
            }
        }
        a.N(parcel, i02);
        DataHolder dataHolder = new DataHolder(i10, strArr, cursorWindowArr, i11, bundle);
        dataHolder.Q1();
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
