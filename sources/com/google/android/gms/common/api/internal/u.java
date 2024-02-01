package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import d.h1;
import d.m0;
import d.o0;
import f8.a;
import f8.j;
import f8.k;
import f8.z;
import g8.a1;
import g8.b1;
import g8.c;
import g8.c1;
import g8.e1;
import g8.k2;
import g8.n2;
import g8.p1;
import g8.v;
import g8.w2;
import g8.x0;
import g8.y0;
import g8.y1;
import h9.n;
import j8.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import m8.q;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import va.i;
import w8.b;

public final class u implements k.b, k.c, w2 {
    public final Queue O = new LinkedList();
    @NotOnlyInitialized
    public final a.f P;
    public final c Q;
    public final v R;
    public final Set S = new HashSet();
    public final Map T = new HashMap();
    public final int U;
    @o0
    public final y1 V;
    public boolean W;
    public final List X = new ArrayList();
    @o0
    public ConnectionResult Y = null;
    public int Z = 0;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ d f5736a0;

    @h1
    public u(d dVar, j jVar) {
        this.f5736a0 = dVar;
        a.f c02 = jVar.c0(dVar.f5660d0.getLooper(), this);
        this.P = c02;
        this.Q = jVar.G();
        this.R = new v();
        this.U = jVar.b0();
        if (c02.v()) {
            this.V = jVar.d0(dVar.U, dVar.f5660d0);
        } else {
            this.V = null;
        }
    }

    public static /* bridge */ /* synthetic */ void y(u uVar, c1 c1Var) {
        if (!uVar.X.contains(c1Var) || uVar.W) {
            return;
        }
        if (!uVar.P.a()) {
            uVar.B();
        } else {
            uVar.f();
        }
    }

    public static /* bridge */ /* synthetic */ void z(u uVar, c1 c1Var) {
        Feature[] g10;
        if (uVar.X.remove(c1Var)) {
            uVar.f5736a0.f5660d0.removeMessages(15, c1Var);
            uVar.f5736a0.f5660d0.removeMessages(16, c1Var);
            Feature a10 = c1Var.f8196b;
            ArrayList arrayList = new ArrayList(uVar.O.size());
            for (k2 k2Var : uVar.O) {
                if ((k2Var instanceof g8.h1) && (g10 = ((g8.h1) k2Var).g(uVar)) != null && b.d(g10, a10)) {
                    arrayList.add(k2Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                k2 k2Var2 = (k2) arrayList.get(i10);
                uVar.O.remove(k2Var2);
                k2Var2.b(new z(a10));
            }
        }
    }

    @h1
    public final void A() {
        s.d(this.f5736a0.f5660d0);
        this.Y = null;
    }

    @h1
    public final void B() {
        ConnectionResult connectionResult;
        s.d(this.f5736a0.f5660d0);
        if (!this.P.a() && !this.P.k()) {
            try {
                d dVar = this.f5736a0;
                int b10 = dVar.W.b(dVar.U, this.P);
                if (b10 != 0) {
                    ConnectionResult connectionResult2 = new ConnectionResult(b10, (PendingIntent) null);
                    String name = this.P.getClass().getName();
                    String obj = connectionResult2.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("The service for ");
                    sb2.append(name);
                    sb2.append(" is not available: ");
                    sb2.append(obj);
                    F(connectionResult2, (Exception) null);
                    return;
                }
                d dVar2 = this.f5736a0;
                a.f fVar = this.P;
                e1 e1Var = new e1(dVar2, fVar, this.Q);
                if (fVar.v()) {
                    ((y1) s.l(this.V)).b2(e1Var);
                }
                try {
                    this.P.e(e1Var);
                } catch (SecurityException e10) {
                    e = e10;
                    connectionResult = new ConnectionResult(10);
                    F(connectionResult, e);
                }
            } catch (IllegalStateException e11) {
                e = e11;
                connectionResult = new ConnectionResult(10);
                F(connectionResult, e);
            }
        }
    }

    @h1
    public final void C(k2 k2Var) {
        s.d(this.f5736a0.f5660d0);
        if (!this.P.a()) {
            this.O.add(k2Var);
            ConnectionResult connectionResult = this.Y;
            if (connectionResult == null || !connectionResult.g1()) {
                B();
            } else {
                F(this.Y, (Exception) null);
            }
        } else if (l(k2Var)) {
            i();
        } else {
            this.O.add(k2Var);
        }
    }

    public final void D(int i10) {
        if (Looper.myLooper() == this.f5736a0.f5660d0.getLooper()) {
            h(i10);
        } else {
            this.f5736a0.f5660d0.post(new y0(this, i10));
        }
    }

    @h1
    public final void E() {
        this.Z++;
    }

    @h1
    public final void F(@m0 ConnectionResult connectionResult, @o0 Exception exc) {
        s.d(this.f5736a0.f5660d0);
        y1 y1Var = this.V;
        if (y1Var != null) {
            y1Var.c2();
        }
        A();
        this.f5736a0.W.c();
        c(connectionResult);
        if ((this.P instanceof q) && connectionResult.X0() != 24) {
            this.f5736a0.R = true;
            d dVar = this.f5736a0;
            dVar.f5660d0.sendMessageDelayed(dVar.f5660d0.obtainMessage(19), i.f23544h);
        }
        if (connectionResult.X0() == 4) {
            d(d.f5654g0);
        } else if (this.O.isEmpty()) {
            this.Y = connectionResult;
        } else if (exc != null) {
            s.d(this.f5736a0.f5660d0);
            e((Status) null, exc, false);
        } else if (this.f5736a0.f5661e0) {
            e(d.i(this.Q, connectionResult), (Exception) null, true);
            if (!this.O.isEmpty() && !m(connectionResult) && !this.f5736a0.h(connectionResult, this.U)) {
                if (connectionResult.X0() == 18) {
                    this.W = true;
                }
                if (this.W) {
                    d dVar2 = this.f5736a0;
                    dVar2.f5660d0.sendMessageDelayed(Message.obtain(dVar2.f5660d0, 9, this.Q), this.f5736a0.O);
                    return;
                }
                d(d.i(this.Q, connectionResult));
            }
        } else {
            d(d.i(this.Q, connectionResult));
        }
    }

    @h1
    public final void G(@m0 ConnectionResult connectionResult) {
        s.d(this.f5736a0.f5660d0);
        a.f fVar = this.P;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        fVar.j("onSignInFailed for " + name + " with " + valueOf);
        F(connectionResult, (Exception) null);
    }

    @h1
    public final void H(@m0 ConnectionResult connectionResult) {
        F(connectionResult, (Exception) null);
    }

    @h1
    public final void I(n2 n2Var) {
        s.d(this.f5736a0.f5660d0);
        this.S.add(n2Var);
    }

    public final void J(@o0 Bundle bundle) {
        if (Looper.myLooper() == this.f5736a0.f5660d0.getLooper()) {
            g();
        } else {
            this.f5736a0.f5660d0.post(new x0(this));
        }
    }

    @h1
    public final void K() {
        s.d(this.f5736a0.f5660d0);
        if (this.W) {
            B();
        }
    }

    @h1
    public final void L() {
        s.d(this.f5736a0.f5660d0);
        d(d.f5653f0);
        this.R.f();
        for (f.a c0Var : (f.a[]) this.T.keySet().toArray(new f.a[0])) {
            C(new c0(c0Var, new n()));
        }
        c(new ConnectionResult(4));
        if (this.P.a()) {
            this.P.q(new a1(this));
        }
    }

    @h1
    public final void M() {
        s.d(this.f5736a0.f5660d0);
        if (this.W) {
            k();
            d dVar = this.f5736a0;
            d(dVar.V.j(dVar.U) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.P.j("Timing out connection while resuming.");
        }
    }

    public final boolean O() {
        return this.P.a();
    }

    public final boolean P() {
        return this.P.v();
    }

    @h1
    public final boolean a() {
        return n(true);
    }

    @h1
    @o0
    public final Feature b(@o0 Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] r10 = this.P.r();
            if (r10 == null) {
                r10 = new Feature[0];
            }
            androidx.collection.a aVar = new androidx.collection.a(r3);
            for (Feature feature : r10) {
                aVar.put(feature.X0(), Long.valueOf(feature.Z0()));
            }
            for (Feature feature2 : featureArr) {
                Long l10 = (Long) aVar.get(feature2.X0());
                if (l10 == null || l10.longValue() < feature2.Z0()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void b0(ConnectionResult connectionResult, a aVar, boolean z10) {
        throw null;
    }

    @h1
    public final void c(ConnectionResult connectionResult) {
        for (n2 c10 : this.S) {
            c10.c(this.Q, connectionResult, j8.q.b(connectionResult, ConnectionResult.f5624r0) ? this.P.l() : null);
        }
        this.S.clear();
    }

    @h1
    public final void d(Status status) {
        s.d(this.f5736a0.f5660d0);
        e(status, (Exception) null, false);
    }

    @h1
    public final void e(@o0 Status status, @o0 Exception exc, boolean z10) {
        s.d(this.f5736a0.f5660d0);
        boolean z11 = false;
        boolean z12 = status == null;
        if (exc == null) {
            z11 = true;
        }
        if (z12 != z11) {
            Iterator it = this.O.iterator();
            while (it.hasNext()) {
                k2 k2Var = (k2) it.next();
                if (!z10 || k2Var.f8237a == 2) {
                    if (status != null) {
                        k2Var.a(status);
                    } else {
                        k2Var.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    @h1
    public final void f() {
        ArrayList arrayList = new ArrayList(this.O);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            k2 k2Var = (k2) arrayList.get(i10);
            if (this.P.a()) {
                if (l(k2Var)) {
                    this.O.remove(k2Var);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @h1
    public final void g() {
        A();
        c(ConnectionResult.f5624r0);
        k();
        Iterator it = this.T.values().iterator();
        while (it.hasNext()) {
            p1 p1Var = (p1) it.next();
            if (b(p1Var.f8253a.c()) == null) {
                try {
                    p1Var.f8253a.d(this.P, new n());
                } catch (DeadObjectException unused) {
                    D(3);
                    this.P.j("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                }
            }
            it.remove();
        }
        f();
        i();
    }

    @h1
    public final void h(int i10) {
        A();
        this.W = true;
        this.R.e(i10, this.P.t());
        d dVar = this.f5736a0;
        dVar.f5660d0.sendMessageDelayed(Message.obtain(dVar.f5660d0, 9, this.Q), this.f5736a0.O);
        d dVar2 = this.f5736a0;
        dVar2.f5660d0.sendMessageDelayed(Message.obtain(dVar2.f5660d0, 11, this.Q), this.f5736a0.P);
        this.f5736a0.W.c();
        for (p1 p1Var : this.T.values()) {
            p1Var.f8255c.run();
        }
    }

    public final void i() {
        this.f5736a0.f5660d0.removeMessages(12, this.Q);
        d dVar = this.f5736a0;
        dVar.f5660d0.sendMessageDelayed(dVar.f5660d0.obtainMessage(12, this.Q), this.f5736a0.Q);
    }

    @h1
    public final void j(k2 k2Var) {
        k2Var.d(this.R, P());
        try {
            k2Var.c(this);
        } catch (DeadObjectException unused) {
            D(1);
            this.P.j("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @h1
    public final void k() {
        if (this.W) {
            this.f5736a0.f5660d0.removeMessages(11, this.Q);
            this.f5736a0.f5660d0.removeMessages(9, this.Q);
            this.W = false;
        }
    }

    @h1
    public final boolean l(k2 k2Var) {
        if (!(k2Var instanceof g8.h1)) {
            j(k2Var);
            return true;
        }
        g8.h1 h1Var = (g8.h1) k2Var;
        Feature b10 = b(h1Var.g(this));
        if (b10 == null) {
            j(k2Var);
            return true;
        }
        String name = this.P.getClass().getName();
        String X0 = b10.X0();
        long Z0 = b10.Z0();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(X0);
        sb2.append(", ");
        sb2.append(Z0);
        sb2.append(").");
        if (!this.f5736a0.f5661e0 || !h1Var.f(this)) {
            h1Var.b(new z(b10));
            return true;
        }
        c1 c1Var = new c1(this.Q, b10, (b1) null);
        int indexOf = this.X.indexOf(c1Var);
        if (indexOf >= 0) {
            c1 c1Var2 = (c1) this.X.get(indexOf);
            this.f5736a0.f5660d0.removeMessages(15, c1Var2);
            d dVar = this.f5736a0;
            dVar.f5660d0.sendMessageDelayed(Message.obtain(dVar.f5660d0, 15, c1Var2), this.f5736a0.O);
            return false;
        }
        this.X.add(c1Var);
        d dVar2 = this.f5736a0;
        dVar2.f5660d0.sendMessageDelayed(Message.obtain(dVar2.f5660d0, 15, c1Var), this.f5736a0.O);
        d dVar3 = this.f5736a0;
        dVar3.f5660d0.sendMessageDelayed(Message.obtain(dVar3.f5660d0, 16, c1Var), this.f5736a0.P);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (m(connectionResult)) {
            return false;
        }
        this.f5736a0.h(connectionResult, this.U);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    @d.h1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(@d.m0 com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.d.f5655h0
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.d r1 = r3.f5736a0     // Catch:{ all -> 0x002a }
            g8.w r2 = r1.f5657a0     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f5658b0     // Catch:{ all -> 0x002a }
            g8.c r2 = r3.Q     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.d r1 = r3.f5736a0     // Catch:{ all -> 0x002a }
            g8.w r1 = r1.f5657a0     // Catch:{ all -> 0x002a }
            int r2 = r3.U     // Catch:{ all -> 0x002a }
            r1.t(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.u.m(com.google.android.gms.common.ConnectionResult):boolean");
    }

    @h1
    public final boolean n(boolean z10) {
        s.d(this.f5736a0.f5660d0);
        if (!this.P.a() || this.T.size() != 0) {
            return false;
        }
        if (this.R.g()) {
            if (z10) {
                i();
            }
            return false;
        }
        this.P.j("Timing out service connection.");
        return true;
    }

    public final int o() {
        return this.U;
    }

    @h1
    public final int p() {
        return this.Z;
    }

    @h1
    @o0
    public final ConnectionResult q() {
        s.d(this.f5736a0.f5660d0);
        return this.Y;
    }

    public final a.f s() {
        return this.P;
    }

    public final Map u() {
        return this.T;
    }
}
