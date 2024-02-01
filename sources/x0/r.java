package x0;

import android.os.Parcel;
import d.m0;

public final class r {
    public static boolean a(@m0 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void b(@m0 Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }
}
