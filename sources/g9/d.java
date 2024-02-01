package g9;

import android.os.Parcel;
import android.os.RemoteException;
import b9.b;
import b9.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;

public abstract class d extends b implements e {
    public d() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean Y1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) c.a(parcel, ConnectionResult.CREATOR);
                zaa zaa = (zaa) c.a(parcel, zaa.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                c.b(parcel);
                h0((zak) c.a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zag = (zag) c.a(parcel, zag.CREATOR);
                break;
            default:
                return false;
        }
        c.b(parcel);
        parcel2.writeNoException();
        return true;
    }
}
