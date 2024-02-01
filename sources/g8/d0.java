package g8;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.r;
import j8.d;
import javax.annotation.concurrent.GuardedBy;

public final class d0 extends t0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.c f8197b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, r rVar, d.c cVar) {
        super(rVar);
        this.f8197b = cVar;
    }

    @GuardedBy("mLock")
    public final void a() {
        this.f8197b.a(new ConnectionResult(16, (PendingIntent) null));
    }
}
