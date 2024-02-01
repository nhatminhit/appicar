package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.b;
import d.m0;
import d.o0;
import d8.f;
import f8.a;
import g8.g1;
import g8.n;
import g8.t0;
import g8.u0;
import g8.v2;
import g8.w2;
import j8.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import y3.q;

public final class s implements x, w2 {
    public final Lock O;
    public final Condition P;
    public final Context Q;
    public final f R;
    public final u0 S;
    public final Map T;
    public final Map U = new HashMap();
    @o0
    public final e V;
    public final Map W;
    @o0
    public final a.C0126a X;
    @NotOnlyInitialized
    public volatile r Y;
    @o0
    public ConnectionResult Z = null;

    /* renamed from: a0  reason: collision with root package name */
    public int f5732a0;

    /* renamed from: b0  reason: collision with root package name */
    public final q f5733b0;

    /* renamed from: c0  reason: collision with root package name */
    public final g1 f5734c0;

    public s(Context context, q qVar, Lock lock, Looper looper, f fVar, Map map, @o0 e eVar, Map map2, @o0 a.C0126a aVar, ArrayList arrayList, g1 g1Var) {
        this.Q = context;
        this.O = lock;
        this.R = fVar;
        this.T = map;
        this.V = eVar;
        this.W = map2;
        this.X = aVar;
        this.f5733b0 = qVar;
        this.f5734c0 = g1Var;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((v2) arrayList.get(i10)).a(this);
        }
        this.S = new u0(this, looper);
        this.P = lock.newCondition();
        this.Y = new p(this);
    }

    public final void D(int i10) {
        this.O.lock();
        try {
            this.Y.d(i10);
        } finally {
            this.O.unlock();
        }
    }

    public final void J(@o0 Bundle bundle) {
        this.O.lock();
        try {
            this.Y.b(bundle);
        } finally {
            this.O.unlock();
        }
    }

    public final void b0(@m0 ConnectionResult connectionResult, @m0 a aVar, boolean z10) {
        this.O.lock();
        try {
            this.Y.a(connectionResult, aVar, z10);
        } finally {
            this.O.unlock();
        }
    }

    public final void c() {
        this.O.lock();
        try {
            this.f5733b0.R();
            this.Y = new n(this);
            this.Y.e();
            this.P.signalAll();
        } finally {
            this.O.unlock();
        }
    }

    public final void d() {
        this.O.lock();
        try {
            this.Y = new o(this, this.V, this.W, this.R, this.X, this.O, this.Q);
            this.Y.e();
            this.P.signalAll();
        } finally {
            this.O.unlock();
        }
    }

    public final void e(@o0 ConnectionResult connectionResult) {
        this.O.lock();
        try {
            this.Z = connectionResult;
            this.Y = new p(this);
            this.Y.e();
            this.P.signalAll();
        } finally {
            this.O.unlock();
        }
    }

    @GuardedBy("mLock")
    public final ConnectionResult f() {
        i();
        while (this.Y instanceof o) {
            try {
                this.P.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            }
        }
        if (this.Y instanceof n) {
            return ConnectionResult.f5624r0;
        }
        ConnectionResult connectionResult = this.Z;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
    }

    public final boolean g() {
        return this.Y instanceof o;
    }

    @GuardedBy("mLock")
    public final ConnectionResult h(long j10, TimeUnit timeUnit) {
        i();
        long nanos = timeUnit.toNanos(j10);
        while (this.Y instanceof o) {
            if (nanos <= 0) {
                try {
                    q();
                    return new ConnectionResult(14, (PendingIntent) null);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, (PendingIntent) null);
                }
            } else {
                nanos = this.P.awaitNanos(nanos);
            }
        }
        if (this.Y instanceof n) {
            return ConnectionResult.f5624r0;
        }
        ConnectionResult connectionResult = this.Z;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
    }

    @GuardedBy("mLock")
    public final void i() {
        this.Y.c();
    }

    @GuardedBy("mLock")
    public final b.a j(@m0 b.a aVar) {
        aVar.s();
        this.Y.f(aVar);
        return aVar;
    }

    public final boolean k() {
        return this.Y instanceof n;
    }

    @GuardedBy("mLock")
    public final b.a l(@m0 b.a aVar) {
        aVar.s();
        return this.Y.h(aVar);
    }

    public final boolean m(n nVar) {
        return false;
    }

    @GuardedBy("mLock")
    public final void n() {
        if (this.Y instanceof n) {
            ((n) this.Y).j();
        }
    }

    public final void o() {
    }

    @GuardedBy("mLock")
    @o0
    public final ConnectionResult p(@m0 a aVar) {
        a.c b10 = aVar.b();
        if (!this.T.containsKey(b10)) {
            return null;
        }
        if (((a.f) this.T.get(b10)).a()) {
            return ConnectionResult.f5624r0;
        }
        if (this.U.containsKey(b10)) {
            return (ConnectionResult) this.U.get(b10);
        }
        return null;
    }

    @GuardedBy("mLock")
    public final void q() {
        if (this.Y.g()) {
            this.U.clear();
        }
    }

    public final void r(String str, @o0 FileDescriptor fileDescriptor, PrintWriter printWriter, @o0 String[] strArr) {
        String concat = String.valueOf(str).concat(q.a.R);
        printWriter.append(str).append("mState=").println(this.Y);
        for (a aVar : this.W.keySet()) {
            printWriter.append(str).append(aVar.d()).println(":");
            ((a.f) j8.s.l((a.f) this.T.get(aVar.b()))).n(concat, fileDescriptor, printWriter, strArr);
        }
    }

    public final void s(t0 t0Var) {
        this.S.sendMessage(this.S.obtainMessage(1, t0Var));
    }

    public final void t(RuntimeException runtimeException) {
        this.S.sendMessage(this.S.obtainMessage(2, runtimeException));
    }
}
