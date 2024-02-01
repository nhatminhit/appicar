package o8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import l8.a;

public final class g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            if (a.O(X) != 1) {
                a.h0(parcel, X);
            } else {
                pendingIntent = (PendingIntent) a.C(parcel, X, PendingIntent.CREATOR);
            }
        }
        a.N(parcel, i02);
        return new ModuleInstallIntentResponse(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallIntentResponse[i10];
    }
}
