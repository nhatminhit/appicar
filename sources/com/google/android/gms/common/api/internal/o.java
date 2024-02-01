package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import d.o0;
import d8.f;
import f8.a;
import g8.a0;
import g8.b0;
import g8.e0;
import g8.f0;
import g8.i0;
import g8.j0;
import g8.v0;
import j8.e;
import j8.g0;
import j8.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class o implements r {

    /* renamed from: a  reason: collision with root package name */
    public final s f5688a;

    /* renamed from: b  reason: collision with root package name */
    public final Lock f5689b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f5690c;

    /* renamed from: d  reason: collision with root package name */
    public final f f5691d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public ConnectionResult f5692e;

    /* renamed from: f  reason: collision with root package name */
    public int f5693f;

    /* renamed from: g  reason: collision with root package name */
    public int f5694g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f5695h;

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f5696i = new Bundle();

    /* renamed from: j  reason: collision with root package name */
    public final Set f5697j = new HashSet();
    @o0

    /* renamed from: k  reason: collision with root package name */
    public f9.f f5698k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5699l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5700m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5701n;
    @o0

    /* renamed from: o  reason: collision with root package name */
    public b f5702o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5703p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5704q;
    @o0

    /* renamed from: r  reason: collision with root package name */
    public final e f5705r;

    /* renamed from: s  reason: collision with root package name */
    public final Map f5706s;
    @o0

    /* renamed from: t  reason: collision with root package name */
    public final a.C0126a f5707t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f5708u = new ArrayList();

    public o(s sVar, @o0 e eVar, Map map, f fVar, @o0 a.C0126a aVar, Lock lock, Context context) {
        this.f5688a = sVar;
        this.f5705r = eVar;
        this.f5706s = map;
        this.f5691d = fVar;
        this.f5707t = aVar;
        this.f5689b = lock;
        this.f5690c = context;
    }

    public static /* bridge */ /* synthetic */ void B(o oVar, zak zak) {
        if (oVar.o(0)) {
            ConnectionResult X0 = zak.X0();
            if (X0.h1()) {
                zav zav = (zav) s.l(zak.Z0());
                ConnectionResult X02 = zav.X0();
                if (!X02.h1()) {
                    String valueOf = String.valueOf(X02);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    oVar.l(X02);
                    return;
                }
                oVar.f5701n = true;
                oVar.f5702o = (b) s.l(zav.Z0());
                oVar.f5703p = zav.f1();
                oVar.f5704q = zav.g1();
                oVar.n();
            } else if (oVar.q(X0)) {
                oVar.i();
                oVar.n();
            } else {
                oVar.l(X0);
            }
        }
    }

    public static final String r(int i10) {
        return i10 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public static /* bridge */ /* synthetic */ Set y(o oVar) {
        e eVar = oVar.f5705r;
        if (eVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(eVar.i());
        Map n10 = oVar.f5705r.n();
        for (a aVar : n10.keySet()) {
            if (!oVar.f5688a.U.containsKey(aVar.b())) {
                hashSet.addAll(((g0) n10.get(aVar)).f9759a);
            }
        }
        return hashSet;
    }

    public final void J() {
        ArrayList arrayList = this.f5708u;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Future) arrayList.get(i10)).cancel(true);
        }
        this.f5708u.clear();
    }

    @GuardedBy("mLock")
    public final void a(ConnectionResult connectionResult, a aVar, boolean z10) {
        if (o(1)) {
            m(connectionResult, aVar, z10);
            if (p()) {
                k();
            }
        }
    }

    @GuardedBy("mLock")
    public final void b(@o0 Bundle bundle) {
        if (o(1)) {
            if (bundle != null) {
                this.f5696i.putAll(bundle);
            }
            if (p()) {
                k();
            }
        }
    }

    public final void c() {
    }

    @GuardedBy("mLock")
    public final void d(int i10) {
        l(new ConnectionResult(8, (PendingIntent) null));
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [f9.f, f8.a$f] */
    @GuardedBy("mLock")
    public final void e() {
        this.f5688a.U.clear();
        this.f5700m = false;
        this.f5692e = null;
        this.f5694g = 0;
        this.f5699l = true;
        this.f5701n = false;
        this.f5703p = false;
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        for (a aVar : this.f5706s.keySet()) {
            a.f fVar = (a.f) s.l((a.f) this.f5688a.T.get(aVar.b()));
            z10 |= aVar.c().b() == 1;
            boolean booleanValue = ((Boolean) this.f5706s.get(aVar)).booleanValue();
            if (fVar.v()) {
                this.f5700m = true;
                if (booleanValue) {
                    this.f5697j.add(aVar.b());
                } else {
                    this.f5699l = false;
                }
            }
            hashMap.put(fVar, new b0(this, aVar, booleanValue));
        }
        if (z10) {
            this.f5700m = false;
        }
        if (this.f5700m) {
            s.l(this.f5705r);
            s.l(this.f5707t);
            this.f5705r.o(Integer.valueOf(System.identityHashCode(this.f5688a.f5733b0)));
            j0 j0Var = new j0(this, (i0) null);
            a.C0126a aVar2 = this.f5707t;
            Context context = this.f5690c;
            Looper r10 = this.f5688a.f5733b0.r();
            e eVar = this.f5705r;
            this.f5698k = aVar2.c(context, r10, eVar, eVar.k(), j0Var, j0Var);
        }
        this.f5695h = this.f5688a.T.size();
        this.f5708u.add(v0.a().submit(new e0(this, hashMap)));
    }

    public final b.a f(b.a aVar) {
        this.f5688a.f5733b0.f5716k.add(aVar);
        return aVar;
    }

    @GuardedBy("mLock")
    public final boolean g() {
        J();
        j(true);
        this.f5688a.e((ConnectionResult) null);
        return true;
    }

    public final b.a h(b.a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @GuardedBy("mLock")
    public final void i() {
        this.f5700m = false;
        this.f5688a.f5733b0.f5724s = Collections.emptySet();
        for (a.c cVar : this.f5697j) {
            if (!this.f5688a.U.containsKey(cVar)) {
                this.f5688a.U.put(cVar, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    @GuardedBy("mLock")
    public final void j(boolean z10) {
        f9.f fVar = this.f5698k;
        if (fVar != null) {
            if (fVar.a() && z10) {
                fVar.c();
            }
            fVar.d();
            e eVar = (e) s.l(this.f5705r);
            this.f5702o = null;
        }
    }

    @GuardedBy("mLock")
    public final void k() {
        this.f5688a.c();
        v0.a().execute(new a0(this));
        f9.f fVar = this.f5698k;
        if (fVar != null) {
            if (this.f5703p) {
                fVar.s((com.google.android.gms.common.internal.b) s.l(this.f5702o), this.f5704q);
            }
            j(false);
        }
        for (a.c cVar : this.f5688a.U.keySet()) {
            ((a.f) s.l((a.f) this.f5688a.T.get(cVar))).d();
        }
        this.f5688a.f5734c0.a(this.f5696i.isEmpty() ? null : this.f5696i);
    }

    @GuardedBy("mLock")
    public final void l(ConnectionResult connectionResult) {
        J();
        j(!connectionResult.g1());
        this.f5688a.e(connectionResult);
        this.f5688a.f5734c0.c(connectionResult);
    }

    @GuardedBy("mLock")
    public final void m(ConnectionResult connectionResult, a aVar, boolean z10) {
        int b10 = aVar.c().b();
        if ((!z10 || connectionResult.g1() || this.f5691d.d(connectionResult.X0()) != null) && (this.f5692e == null || b10 < this.f5693f)) {
            this.f5692e = connectionResult;
            this.f5693f = b10;
        }
        this.f5688a.U.put(aVar.b(), connectionResult);
    }

    @GuardedBy("mLock")
    public final void n() {
        if (this.f5695h == 0) {
            if (!this.f5700m || this.f5701n) {
                ArrayList arrayList = new ArrayList();
                this.f5694g = 1;
                this.f5695h = this.f5688a.T.size();
                for (a.c cVar : this.f5688a.T.keySet()) {
                    if (!this.f5688a.U.containsKey(cVar)) {
                        arrayList.add((a.f) this.f5688a.T.get(cVar));
                    } else if (p()) {
                        k();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f5708u.add(v0.a().submit(new f0(this, arrayList)));
                }
            }
        }
    }

    @GuardedBy("mLock")
    public final boolean o(int i10) {
        if (this.f5694g == i10) {
            return true;
        }
        this.f5688a.f5733b0.M();
        "Unexpected callback in ".concat(toString());
        int i11 = this.f5695h;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mRemainingConnections=");
        sb2.append(i11);
        int i12 = this.f5694g;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(r(i12));
        sb3.append(" but received callback for step ");
        sb3.append(r(i10));
        new Exception();
        l(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }

    @GuardedBy("mLock")
    public final boolean p() {
        ConnectionResult connectionResult;
        int i10 = this.f5695h - 1;
        this.f5695h = i10;
        if (i10 > 0) {
            return false;
        }
        if (i10 < 0) {
            this.f5688a.f5733b0.M();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            connectionResult = new ConnectionResult(8, (PendingIntent) null);
        } else {
            connectionResult = this.f5692e;
            if (connectionResult == null) {
                return true;
            }
            this.f5688a.f5732a0 = this.f5693f;
        }
        l(connectionResult);
        return false;
    }

    @GuardedBy("mLock")
    public final boolean q(ConnectionResult connectionResult) {
        return this.f5699l && !connectionResult.g1();
    }
}
