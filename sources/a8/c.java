package a8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import l8.a;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i02 = a.i0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    i10 = a.Z(parcel2, X);
                    break;
                case 2:
                    str = a.G(parcel2, X);
                    break;
                case 3:
                    str2 = a.G(parcel2, X);
                    break;
                case 4:
                    str3 = a.G(parcel2, X);
                    break;
                case 5:
                    str4 = a.G(parcel2, X);
                    break;
                case 6:
                    uri = (Uri) a.C(parcel2, X, Uri.CREATOR);
                    break;
                case 7:
                    str5 = a.G(parcel2, X);
                    break;
                case 8:
                    j10 = a.c0(parcel2, X);
                    break;
                case 9:
                    str6 = a.G(parcel2, X);
                    break;
                case 10:
                    arrayList = a.L(parcel2, X, Scope.CREATOR);
                    break;
                case 11:
                    str7 = a.G(parcel2, X);
                    break;
                case 12:
                    str8 = a.G(parcel2, X);
                    break;
                default:
                    a.h0(parcel2, X);
                    break;
            }
        }
        a.N(parcel2, i02);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
