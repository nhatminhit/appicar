package g8;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.internal.b;
import d.h1;
import d.m0;
import d.o0;
import f8.a;
import j8.d;
import java.util.Set;

public final class e1 implements d.c, x1 {

    /* renamed from: a  reason: collision with root package name */
    public final a.f f8198a;

    /* renamed from: b  reason: collision with root package name */
    public final c f8199b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public b f8200c = null;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public Set f8201d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8202e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.internal.d f8203f;

    public e1(com.google.android.gms.common.api.internal.d dVar, a.f fVar, c cVar) {
        this.f8203f = dVar;
        this.f8198a = fVar;
        this.f8199b = cVar;
    }

    public final void a(@m0 ConnectionResult connectionResult) {
        this.f8203f.f5660d0.post(new d1(this, connectionResult));
    }

    @h1
    public final void b(ConnectionResult connectionResult) {
        u uVar = (u) this.f8203f.Z.get(this.f8199b);
        if (uVar != null) {
            uVar.G(connectionResult);
        }
    }

    @h1
    public final void c(@o0 b bVar, @o0 Set set) {
        if (bVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new ConnectionResult(4));
            return;
        }
        this.f8200c = bVar;
        this.f8201d = set;
        h();
    }

    @h1
    public final void h() {
        b bVar;
        if (this.f8202e && (bVar = this.f8200c) != null) {
            this.f8198a.i(bVar, this.f8201d);
        }
    }
}
