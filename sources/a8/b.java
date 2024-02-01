package a8;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {
    public static final /* synthetic */ b O = new b();

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).X0().compareTo(((Scope) obj2).X0());
    }
}
