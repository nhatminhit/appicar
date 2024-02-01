package f8;

import android.text.TextUtils;
import androidx.collection.a;
import com.google.android.gms.common.ConnectionResult;
import d.m0;
import f8.a;
import j8.s;
import java.util.ArrayList;

public class c extends Exception {
    public final a O;

    public c(@m0 a aVar) {
        this.O = aVar;
    }

    @m0
    public ConnectionResult a(@m0 j<? extends a.d> jVar) {
        g8.c<? extends a.d> G = jVar.G();
        boolean z10 = this.O.get(G) != null;
        String b10 = G.b();
        s.b(z10, "The given API (" + b10 + ") was not part of the availability request.");
        return (ConnectionResult) s.l((ConnectionResult) this.O.get(G));
    }

    @m0
    public ConnectionResult b(@m0 l<? extends a.d> lVar) {
        g8.c<? extends a.d> G = lVar.G();
        boolean z10 = this.O.get(G) != null;
        String b10 = G.b();
        s.b(z10, "The given API (" + b10 + ") was not part of the availability request.");
        return (ConnectionResult) s.l((ConnectionResult) this.O.get(G));
    }

    @m0
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (g8.c cVar : this.O.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) s.l((ConnectionResult) this.O.get(cVar));
            z10 &= !connectionResult.h1();
            arrayList.add(cVar.b() + ": " + String.valueOf(connectionResult));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
