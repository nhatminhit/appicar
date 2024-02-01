package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import d.o0;
import d9.e;
import d9.l;
import d9.p0;
import f8.a;
import f8.j;
import g8.q;
import h9.m;
import h9.n;
import j8.s;
import java.util.concurrent.Executor;

public final class r0 extends j implements e {

    /* renamed from: m  reason: collision with root package name */
    public static final a.g f5912m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f5913n;

    static {
        a.g gVar = new a.g();
        f5912m = gVar;
        f5913n = new a("LocationServices.API", new o0(), gVar);
    }

    public r0(Activity activity) {
        super(activity, f5913n, a.d.f7423w, j.a.f7467c);
    }

    public r0(Context context) {
        super(context, f5913n, a.d.f7423w, j.a.f7467c);
    }

    public final m<Void> A() {
        return U(q.a().c(w.f5923a).f(2422).a());
    }

    public final m<Location> B(int i10, @o0 h9.a aVar) {
        CurrentLocationRequest.a aVar2 = new CurrentLocationRequest.a();
        aVar2.e(i10);
        CurrentLocationRequest a10 = aVar2.a();
        if (aVar != null) {
            s.b(!aVar.a(), "cancellationToken may not be already canceled");
        }
        m<Location> O = O(q.a().c(new j0(a10, aVar)).f(2415).a());
        if (aVar == null) {
            return O;
        }
        n nVar = new n(aVar);
        O.m(new k0(nVar));
        return nVar.a();
    }

    public final m<LocationAvailability> C() {
        return O(q.a().c(c0.f5856a).f(2416).a());
    }

    public final m<Void> D(LocationRequest locationRequest, Executor executor, l lVar) {
        return g0(locationRequest, g.b(lVar, executor, l.class.getSimpleName()));
    }

    public final m<Void> E(LocationRequest locationRequest, Executor executor, d9.m mVar) {
        return h0(locationRequest, g.b(mVar, executor, d9.m.class.getSimpleName()));
    }

    public final m<Void> c(LocationRequest locationRequest, l lVar, @o0 Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            s.m(looper, "invalid null looper");
        }
        return g0(locationRequest, g.a(lVar, looper, l.class.getSimpleName()));
    }

    public final m g0(LocationRequest locationRequest, f fVar) {
        q0 q0Var = new q0(this, fVar, y.f5927a);
        return Q(i.a().c(new z(q0Var, locationRequest)).g(q0Var).h(fVar).f(2436).a());
    }

    public final m h0(LocationRequest locationRequest, f fVar) {
        q0 q0Var = new q0(this, fVar, f0.f5864a);
        return Q(i.a().c(new h0(q0Var, locationRequest)).g(q0Var).h(fVar).f(2435).a());
    }

    public final m<Void> i(boolean z10) {
        return U(q.a().c(new d0(z10)).f(2420).a());
    }

    public final m<Void> l(d9.m mVar) {
        return S(g.c(mVar, d9.m.class.getSimpleName()), 2418).n(m0.O, n0.f5899a);
    }

    public final m<Void> n(Location location) {
        s.a(location != null);
        return U(q.a().c(new x(location)).f(2421).a());
    }

    public final m<Void> o(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return U(q.a().c(new a0(pendingIntent, locationRequest)).f(2417).a());
    }

    public final m<Location> p(CurrentLocationRequest currentLocationRequest, @o0 h9.a aVar) {
        if (aVar != null) {
            s.b(!aVar.a(), "cancellationToken may not be already canceled");
        }
        m<Location> O = O(q.a().c(new j0(currentLocationRequest, aVar)).f(2415).a());
        if (aVar == null) {
            return O;
        }
        n nVar = new n(aVar);
        O.m(new k0(nVar));
        return nVar.a();
    }

    public final m<Void> t(LocationRequest locationRequest, d9.m mVar, @o0 Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            s.m(looper, "invalid null looper");
        }
        return h0(locationRequest, g.a(mVar, looper, d9.m.class.getSimpleName()));
    }

    public final m<Void> v(PendingIntent pendingIntent) {
        return U(q.a().c(new i0(pendingIntent)).f(2418).a());
    }

    public final m<Location> w() {
        return O(q.a().c(g0.f5866a).f(2414).a());
    }

    public final m<Void> x(l lVar) {
        return S(g.c(lVar, l.class.getSimpleName()), 2418).n(m0.O, e0.f5863a);
    }

    public final m<Location> z(LastLocationRequest lastLocationRequest) {
        return O(q.a().c(new l0(lastLocationRequest)).f(2414).e(p0.f6711f).a());
    }
}
