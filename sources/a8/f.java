package a8;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import l8.a;

public final class f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i02 = a.i0(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList<Scope> arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    i10 = a.Z(parcel, X);
                    break;
                case 2:
                    arrayList = a.L(parcel, X, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) a.C(parcel, X, Account.CREATOR);
                    break;
                case 4:
                    z10 = a.P(parcel, X);
                    break;
                case 5:
                    z11 = a.P(parcel, X);
                    break;
                case 6:
                    z12 = a.P(parcel, X);
                    break;
                case 7:
                    str = a.G(parcel, X);
                    break;
                case 8:
                    str2 = a.G(parcel, X);
                    break;
                case 9:
                    arrayList2 = a.L(parcel, X, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = a.G(parcel, X);
                    break;
                default:
                    a.h0(parcel, X);
                    break;
            }
        }
        a.N(parcel, i02);
        return new GoogleSignInOptions(i10, (ArrayList) arrayList, account, z10, z11, z12, str, str2, (ArrayList) arrayList2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
