package j8;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import d.g;
import d.o0;

public final class s1 extends c1 {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f9797g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @g
    public s1(d dVar, @o0 int i10, Bundle bundle) {
        super(dVar, i10, (Bundle) null);
        this.f9797g = dVar;
    }

    public final void f(ConnectionResult connectionResult) {
        if (!this.f9797g.B() || !d.p0(this.f9797g)) {
            this.f9797g.f9712d0.a(connectionResult);
            this.f9797g.U(connectionResult);
            return;
        }
        d.l0(this.f9797g, 16);
    }

    public final boolean g() {
        this.f9797g.f9712d0.a(ConnectionResult.f5624r0);
        return true;
    }
}
