package g9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.zag;
import java.util.ArrayList;
import l8.a;

public final class g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            int O = a.O(X);
            if (O == 1) {
                arrayList = a.I(parcel, X);
            } else if (O != 2) {
                a.h0(parcel, X);
            } else {
                str = a.G(parcel, X);
            }
        }
        a.N(parcel, i02);
        return new zag(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zag[i10];
    }
}
