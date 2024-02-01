package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import b9.p;
import b9.u;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import d.m0;
import d.o0;
import d8.f;
import f8.a;
import g8.a3;
import g8.b3;
import g8.n;
import g8.v2;
import g8.x2;
import g8.y2;
import g8.z2;
import j8.e;
import j8.q;
import j8.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import y3.q;

public final class l implements x {
    public final Context O;
    public final q P;
    public final Looper Q;
    public final s R;
    public final s S;
    public final Map T;
    public final Set U = Collections.newSetFromMap(new WeakHashMap());
    @o0
    public final a.f V;
    @o0
    public Bundle W;
    @o0
    public ConnectionResult X = null;
    @o0
    public ConnectionResult Y = null;
    public boolean Z = false;

    /* renamed from: a0  reason: collision with root package name */
    public final Lock f5683a0;
    @GuardedBy("mLock")

    /* renamed from: b0  reason: collision with root package name */
    public int f5684b0 = 0;

    public l(Context context, q qVar, Lock lock, Looper looper, f fVar, Map map, Map map2, e eVar, a.C0126a aVar, @o0 a.f fVar2, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.O = context;
        this.P = qVar;
        this.f5683a0 = lock;
        this.Q = looper;
        this.V = fVar2;
        Context context2 = context;
        q qVar2 = qVar;
        Lock lock2 = lock;
        Looper looper2 = looper;
        f fVar3 = fVar;
        s sVar = r3;
        s sVar2 = new s(context2, qVar2, lock2, looper2, fVar3, map2, (e) null, map4, (a.C0126a) null, arrayList2, new z2(this, (y2) null));
        this.R = sVar;
        this.S = new s(context2, qVar2, lock2, looper2, fVar3, map, eVar, map3, aVar, arrayList, new b3(this, (a3) null));
        androidx.collection.a aVar2 = new androidx.collection.a();
        for (a.c put : map2.keySet()) {
            aVar2.put(put, this.R);
        }
        for (a.c put2 : map.keySet()) {
            aVar2.put(put2, this.S);
        }
        this.T = Collections.unmodifiableMap(aVar2);
    }

    public static /* bridge */ /* synthetic */ void A(l lVar, int i10, boolean z10) {
        lVar.P.b(i10, z10);
        lVar.Y = null;
        lVar.X = null;
    }

    public static /* bridge */ /* synthetic */ void B(l lVar, Bundle bundle) {
        Bundle bundle2 = lVar.W;
        if (bundle2 == null) {
            lVar.W = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void C(l lVar) {
        ConnectionResult connectionResult;
        if (e(lVar.X)) {
            if (e(lVar.Y) || lVar.c()) {
                int i10 = lVar.f5684b0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        lVar.f5684b0 = 0;
                        return;
                    }
                    ((q) s.l(lVar.P)).a(lVar.W);
                }
                lVar.b();
                lVar.f5684b0 = 0;
                return;
            }
            ConnectionResult connectionResult2 = lVar.Y;
            if (connectionResult2 == null) {
                return;
            }
            if (lVar.f5684b0 == 1) {
                lVar.b();
                return;
            }
            lVar.a(connectionResult2);
            lVar.R.q();
        } else if (lVar.X == null || !e(lVar.Y)) {
            ConnectionResult connectionResult3 = lVar.X;
            if (connectionResult3 != null && (connectionResult = lVar.Y) != null) {
                if (lVar.S.f5732a0 < lVar.R.f5732a0) {
                    connectionResult3 = connectionResult;
                }
                lVar.a(connectionResult3);
            }
        } else {
            lVar.S.q();
            lVar.a((ConnectionResult) s.l(lVar.X));
        }
    }

    public static boolean e(@o0 ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.h1();
    }

    public static l t(Context context, q qVar, Lock lock, Looper looper, f fVar, Map map, e eVar, Map map2, a.C0126a aVar, ArrayList arrayList) {
        Map map3 = map2;
        androidx.collection.a aVar2 = new androidx.collection.a();
        androidx.collection.a aVar3 = new androidx.collection.a();
        a.f fVar2 = null;
        for (Map.Entry entry : map.entrySet()) {
            a.f fVar3 = (a.f) entry.getValue();
            if (true == fVar3.g()) {
                fVar2 = fVar3;
            }
            boolean v10 = fVar3.v();
            a.c cVar = (a.c) entry.getKey();
            if (v10) {
                aVar2.put(cVar, fVar3);
            } else {
                aVar3.put(cVar, fVar3);
            }
        }
        s.s(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        androidx.collection.a aVar4 = new androidx.collection.a();
        androidx.collection.a aVar5 = new androidx.collection.a();
        for (a aVar6 : map2.keySet()) {
            a.c b10 = aVar6.b();
            if (aVar2.containsKey(b10)) {
                aVar4.put(aVar6, (Boolean) map3.get(aVar6));
            } else if (aVar3.containsKey(b10)) {
                aVar5.put(aVar6, (Boolean) map3.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v2 v2Var = (v2) arrayList.get(i10);
            if (aVar4.containsKey(v2Var.O)) {
                arrayList2.add(v2Var);
            } else if (aVar5.containsKey(v2Var.O)) {
                arrayList3.add(v2Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new l(context, qVar, lock, looper, fVar, aVar2, aVar3, eVar, aVar, fVar2, arrayList2, arrayList3, aVar4, aVar5);
    }

    @o0
    public final PendingIntent E() {
        if (this.V == null) {
            return null;
        }
        return PendingIntent.getActivity(this.O, System.identityHashCode(this.P), this.V.u(), p.f4754a | 134217728);
    }

    @GuardedBy("mLock")
    public final void a(ConnectionResult connectionResult) {
        int i10 = this.f5684b0;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f5684b0 = 0;
            }
            this.P.c(connectionResult);
        }
        b();
        this.f5684b0 = 0;
    }

    @GuardedBy("mLock")
    public final void b() {
        for (n a10 : this.U) {
            a10.a();
        }
        this.U.clear();
    }

    @GuardedBy("mLock")
    public final boolean c() {
        ConnectionResult connectionResult = this.Y;
        return connectionResult != null && connectionResult.X0() == 4;
    }

    public final boolean d(b.a aVar) {
        s sVar = (s) this.T.get(aVar.y());
        s.m(sVar, "GoogleApiClient is not configured to use the API required for this call.");
        return sVar.equals(this.S);
    }

    @GuardedBy("mLock")
    public final ConnectionResult f() {
        throw new UnsupportedOperationException();
    }

    public final boolean g() {
        this.f5683a0.lock();
        try {
            return this.f5684b0 == 2;
        } finally {
            this.f5683a0.unlock();
        }
    }

    @GuardedBy("mLock")
    public final ConnectionResult h(long j10, @m0 TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @GuardedBy("mLock")
    public final void i() {
        this.f5684b0 = 2;
        this.Z = false;
        this.Y = null;
        this.X = null;
        this.R.i();
        this.S.i();
    }

    @GuardedBy("mLock")
    public final b.a j(@m0 b.a aVar) {
        if (!d(aVar)) {
            this.R.j(aVar);
            return aVar;
        } else if (c()) {
            aVar.a(new Status(4, (String) null, E()));
            return aVar;
        } else {
            this.S.j(aVar);
            return aVar;
        }
    }

    public final boolean k() {
        this.f5683a0.lock();
        try {
            boolean z10 = false;
            if (this.R.k() && (this.S.k() || c() || this.f5684b0 == 1)) {
                z10 = true;
            }
            return z10;
        } finally {
            this.f5683a0.unlock();
        }
    }

    @GuardedBy("mLock")
    public final b.a l(@m0 b.a aVar) {
        if (!d(aVar)) {
            return this.R.l(aVar);
        }
        if (!c()) {
            return this.S.l(aVar);
        }
        aVar.a(new Status(4, (String) null, E()));
        return aVar;
    }

    public final boolean m(n nVar) {
        this.f5683a0.lock();
        try {
            if ((g() || k()) && !this.S.k()) {
                this.U.add(nVar);
                if (this.f5684b0 == 0) {
                    this.f5684b0 = 1;
                }
                this.Y = null;
                this.S.i();
                return true;
            }
            this.f5683a0.unlock();
            return false;
        } finally {
            this.f5683a0.unlock();
        }
    }

    @GuardedBy("mLock")
    public final void n() {
        this.R.n();
        this.S.n();
    }

    public final void o() {
        this.f5683a0.lock();
        try {
            boolean g10 = g();
            this.S.q();
            this.Y = new ConnectionResult(4);
            if (g10) {
                new u(this.Q).post(new x2(this));
            } else {
                b();
            }
        } finally {
            this.f5683a0.unlock();
        }
    }

    @GuardedBy("mLock")
    @o0
    public final ConnectionResult p(@m0 a aVar) {
        return q.b(this.T.get(aVar.b()), this.S) ? c() ? new ConnectionResult(4, E()) : this.S.p(aVar) : this.R.p(aVar);
    }

    @GuardedBy("mLock")
    public final void q() {
        this.Y = null;
        this.X = null;
        this.f5684b0 = 0;
        this.R.q();
        this.S.q();
        b();
    }

    public final void r(String str, @o0 FileDescriptor fileDescriptor, PrintWriter printWriter, @o0 String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.S.r(String.valueOf(str).concat(q.a.R), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.R.r(String.valueOf(str).concat(q.a.R), fileDescriptor, printWriter, strArr);
    }
}
