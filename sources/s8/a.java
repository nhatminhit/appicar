package s8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;

public final class a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = l8.a.i0(parcel);
        int i10 = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < i02) {
            int X = l8.a.X(parcel);
            int O = l8.a.O(X);
            if (O == 1) {
                i10 = l8.a.Z(parcel, X);
            } else if (O != 2) {
                l8.a.h0(parcel, X);
            } else {
                stringToIntConverter = (StringToIntConverter) l8.a.C(parcel, X, StringToIntConverter.CREATOR);
            }
        }
        l8.a.N(parcel, i02);
        return new zaa(i10, stringToIntConverter);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zaa[i10];
    }
}
