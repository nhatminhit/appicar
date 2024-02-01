package g8;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.r;
import javax.annotation.concurrent.GuardedBy;

public final class c0 extends t0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f8193b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e0 f8194c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, r rVar, ConnectionResult connectionResult) {
        super(rVar);
        this.f8194c = e0Var;
        this.f8193b = connectionResult;
    }

    @GuardedBy("mLock")
    public final void a() {
        this.f8194c.Q.l(this.f8193b);
    }
}
