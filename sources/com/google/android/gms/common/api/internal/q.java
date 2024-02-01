package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import b6.h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import d8.e;
import f8.a;
import f8.k;
import f8.o;
import f8.u;
import g8.g;
import g8.g1;
import g8.g2;
import g8.h2;
import g8.i2;
import g8.m0;
import g8.m2;
import g8.n;
import g8.n0;
import g8.p;
import g8.q0;
import g8.r0;
import g8.s0;
import j8.o0;
import j8.p0;
import j8.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import w8.d0;

public final class q extends k implements g1 {
    public final i2 A;
    public final o0 B;

    /* renamed from: e  reason: collision with root package name */
    public final Lock f5710e;

    /* renamed from: f  reason: collision with root package name */
    public final p0 f5711f;
    @d.o0

    /* renamed from: g  reason: collision with root package name */
    public x f5712g = null;

    /* renamed from: h  reason: collision with root package name */
    public final int f5713h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f5714i;

    /* renamed from: j  reason: collision with root package name */
    public final Looper f5715j;
    @d0

    /* renamed from: k  reason: collision with root package name */
    public final Queue f5716k = new LinkedList();

    /* renamed from: l  reason: collision with root package name */
    public volatile boolean f5717l;

    /* renamed from: m  reason: collision with root package name */
    public long f5718m;

    /* renamed from: n  reason: collision with root package name */
    public long f5719n;

    /* renamed from: o  reason: collision with root package name */
    public final r0 f5720o;

    /* renamed from: p  reason: collision with root package name */
    public final e f5721p;
    @d.o0
    @d0

    /* renamed from: q  reason: collision with root package name */
    public zabx f5722q;

    /* renamed from: r  reason: collision with root package name */
    public final Map f5723r;

    /* renamed from: s  reason: collision with root package name */
    public Set f5724s;

    /* renamed from: t  reason: collision with root package name */
    public final j8.e f5725t;

    /* renamed from: u  reason: collision with root package name */
    public final Map f5726u;

    /* renamed from: v  reason: collision with root package name */
    public final a.C0126a f5727v;

    /* renamed from: w  reason: collision with root package name */
    public final g f5728w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f5729x;

    /* renamed from: y  reason: collision with root package name */
    public Integer f5730y;
    @d.o0

    /* renamed from: z  reason: collision with root package name */
    public Set f5731z;

    public q(Context context, Lock lock, Looper looper, j8.e eVar, e eVar2, a.C0126a aVar, Map map, List list, List list2, Map map2, int i10, int i11, ArrayList arrayList) {
        Looper looper2 = looper;
        int i12 = i10;
        this.f5718m = true != w8.e.c() ? 120000 : 10000;
        this.f5719n = h.f4357h;
        this.f5724s = new HashSet();
        this.f5728w = new g();
        this.f5730y = null;
        this.f5731z = null;
        m0 m0Var = new m0(this);
        this.B = m0Var;
        this.f5714i = context;
        this.f5710e = lock;
        this.f5711f = new p0(looper, m0Var);
        this.f5715j = looper2;
        this.f5720o = new r0(this, looper);
        this.f5721p = eVar2;
        this.f5713h = i12;
        if (i12 >= 0) {
            this.f5730y = Integer.valueOf(i11);
        }
        this.f5726u = map;
        this.f5723r = map2;
        this.f5729x = arrayList;
        this.A = new i2();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f5711f.f((k.b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f5711f.g((k.c) it2.next());
        }
        this.f5725t = eVar;
        this.f5727v = aVar;
    }

    public static int K(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            a.f fVar = (a.f) it.next();
            z11 |= fVar.v();
            z12 |= fVar.g();
        }
        if (z11) {
            return (!z12 || !z10) ? 1 : 2;
        }
        return 3;
    }

    public static String N(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public static /* bridge */ /* synthetic */ void P(q qVar) {
        qVar.f5710e.lock();
        try {
            if (qVar.f5717l) {
                qVar.U();
            }
        } finally {
            qVar.f5710e.unlock();
        }
    }

    public static /* bridge */ /* synthetic */ void Q(q qVar) {
        qVar.f5710e.lock();
        try {
            if (qVar.R()) {
                qVar.U();
            }
        } finally {
            qVar.f5710e.unlock();
        }
    }

    public final void A() {
        i();
        g();
    }

    public final void B(@d.m0 k.b bVar) {
        this.f5711f.f(bVar);
    }

    public final void C(@d.m0 k.c cVar) {
        this.f5711f.g(cVar);
    }

    public final <L> f<L> D(@d.m0 L l10) {
        this.f5710e.lock();
        try {
            return this.f5728w.d(l10, this.f5715j, "NO_TYPE");
        } finally {
            this.f5710e.unlock();
        }
    }

    public final void E(@d.m0 FragmentActivity fragmentActivity) {
        g gVar = new g((Activity) fragmentActivity);
        if (this.f5713h >= 0) {
            m2.u(gVar).w(this.f5713h);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    public final void F(@d.m0 k.b bVar) {
        this.f5711f.h(bVar);
    }

    public final void G(@d.m0 k.c cVar) {
        this.f5711f.i(cVar);
    }

    public final void H(g2 g2Var) {
        this.f5710e.lock();
        try {
            if (this.f5731z == null) {
                this.f5731z = new HashSet();
            }
            this.f5731z.add(g2Var);
        } finally {
            this.f5710e.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (r3 == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(g8.g2 r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f5710e
            r0.lock()
            java.util.Set r0 = r2.f5731z     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L_0x0016
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
        L_0x0012:
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0054 }
            goto L_0x0047
        L_0x0016:
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0024
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            goto L_0x0012
        L_0x0024:
            java.util.concurrent.locks.Lock r3 = r2.f5710e     // Catch:{ all -> 0x0054 }
            r3.lock()     // Catch:{ all -> 0x0054 }
            java.util.Set r3 = r2.f5731z     // Catch:{ all -> 0x004d }
            if (r3 != 0) goto L_0x0033
            java.util.concurrent.locks.Lock r3 = r2.f5710e     // Catch:{ all -> 0x0054 }
            r3.unlock()     // Catch:{ all -> 0x0054 }
            goto L_0x0040
        L_0x0033:
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x004d }
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.f5710e     // Catch:{ all -> 0x0054 }
            r0.unlock()     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0047
        L_0x0040:
            com.google.android.gms.common.api.internal.x r3 = r2.f5712g     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x0047
            r3.n()     // Catch:{ all -> 0x0054 }
        L_0x0047:
            java.util.concurrent.locks.Lock r3 = r2.f5710e
            r3.unlock()
            return
        L_0x004d:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f5710e     // Catch:{ all -> 0x0054 }
            r0.unlock()     // Catch:{ all -> 0x0054 }
            throw r3     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f5710e
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.q.I(g8.g2):void");
    }

    public final String M() {
        StringWriter stringWriter = new StringWriter();
        j("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    @GuardedBy("mLock")
    public final boolean R() {
        if (!this.f5717l) {
            return false;
        }
        this.f5717l = false;
        this.f5720o.removeMessages(2);
        this.f5720o.removeMessages(1);
        zabx zabx = this.f5722q;
        if (zabx != null) {
            zabx.b();
            this.f5722q = null;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r13v11, types: [com.google.android.gms.common.api.internal.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(int r13) {
        /*
            r12 = this;
            java.lang.Integer r0 = r12.f5730y
            if (r0 != 0) goto L_0x000b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.f5730y = r13
            goto L_0x0011
        L_0x000b:
            int r0 = r0.intValue()
            if (r0 != r13) goto L_0x0091
        L_0x0011:
            com.google.android.gms.common.api.internal.x r13 = r12.f5712g
            if (r13 == 0) goto L_0x0016
            return
        L_0x0016:
            java.util.Map r13 = r12.f5723r
            java.util.Collection r13 = r13.values()
            java.util.Iterator r13 = r13.iterator()
            r0 = 0
            r1 = r0
        L_0x0022:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r13.next()
            f8.a$f r2 = (f8.a.f) r2
            boolean r3 = r2.v()
            r0 = r0 | r3
            boolean r2 = r2.g()
            r1 = r1 | r2
            goto L_0x0022
        L_0x0039:
            java.lang.Integer r13 = r12.f5730y
            int r13 = r13.intValue()
            r2 = 1
            if (r13 == r2) goto L_0x0062
            r1 = 2
            if (r13 == r1) goto L_0x0046
            goto L_0x0066
        L_0x0046:
            if (r0 == 0) goto L_0x0066
            android.content.Context r2 = r12.f5714i
            java.util.concurrent.locks.Lock r4 = r12.f5710e
            android.os.Looper r5 = r12.f5715j
            d8.e r6 = r12.f5721p
            java.util.Map r7 = r12.f5723r
            j8.e r8 = r12.f5725t
            java.util.Map r9 = r12.f5726u
            f8.a$a r10 = r12.f5727v
            java.util.ArrayList r11 = r12.f5729x
            r3 = r12
            com.google.android.gms.common.api.internal.l r13 = com.google.android.gms.common.api.internal.l.t(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x005f:
            r12.f5712g = r13
            return
        L_0x0062:
            if (r0 == 0) goto L_0x0089
            if (r1 != 0) goto L_0x0081
        L_0x0066:
            com.google.android.gms.common.api.internal.s r13 = new com.google.android.gms.common.api.internal.s
            android.content.Context r1 = r12.f5714i
            java.util.concurrent.locks.Lock r3 = r12.f5710e
            android.os.Looper r4 = r12.f5715j
            d8.e r5 = r12.f5721p
            java.util.Map r6 = r12.f5723r
            j8.e r7 = r12.f5725t
            java.util.Map r8 = r12.f5726u
            f8.a$a r9 = r12.f5727v
            java.util.ArrayList r10 = r12.f5729x
            r0 = r13
            r2 = r12
            r11 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x005f
        L_0x0081:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            r13.<init>(r0)
            throw r13
        L_0x0089:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            r13.<init>(r0)
            throw r13
        L_0x0091:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Integer r1 = r12.f5730y
            int r1 = r1.intValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot use sign-in mode: "
            r2.append(r3)
            java.lang.String r13 = N(r13)
            r2.append(r13)
            java.lang.String r13 = ". Mode was already set to "
            r2.append(r13)
            java.lang.String r13 = N(r1)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.q.S(int):void");
    }

    public final void T(k kVar, p pVar, boolean z10) {
        m8.a.f10654d.a(kVar).h(new q0(this, pVar, z10, kVar));
    }

    @GuardedBy("mLock")
    public final void U() {
        this.f5711f.b();
        ((x) s.l(this.f5712g)).i();
    }

    @GuardedBy("mLock")
    public final void a(@d.o0 Bundle bundle) {
        while (!this.f5716k.isEmpty()) {
            m((b.a) this.f5716k.remove());
        }
        this.f5711f.d(bundle);
    }

    @GuardedBy("mLock")
    public final void b(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.f5717l) {
                this.f5717l = true;
                if (this.f5722q == null && !w8.e.c()) {
                    try {
                        this.f5722q = this.f5721p.G(this.f5714i.getApplicationContext(), new s0(this));
                    } catch (SecurityException unused) {
                    }
                }
                r0 r0Var = this.f5720o;
                r0Var.sendMessageDelayed(r0Var.obtainMessage(1), this.f5718m);
                r0 r0Var2 = this.f5720o;
                r0Var2.sendMessageDelayed(r0Var2.obtainMessage(2), this.f5719n);
            }
            i10 = 1;
        }
        for (BasePendingResult l10 : (BasePendingResult[]) this.A.f8226a.toArray(new BasePendingResult[0])) {
            l10.l(i2.f8225c);
        }
        this.f5711f.e(i10);
        this.f5711f.a();
        if (i10 == 2) {
            U();
        }
    }

    @GuardedBy("mLock")
    public final void c(ConnectionResult connectionResult) {
        if (!this.f5721p.l(this.f5714i, connectionResult.X0())) {
            R();
        }
        if (!this.f5717l) {
            this.f5711f.c(connectionResult);
            this.f5711f.a();
        }
    }

    public final ConnectionResult d() {
        boolean z10 = true;
        s.s(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f5710e.lock();
        try {
            if (this.f5713h >= 0) {
                if (this.f5730y == null) {
                    z10 = false;
                }
                s.s(z10, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f5730y;
                if (num == null) {
                    this.f5730y = Integer.valueOf(K(this.f5723r.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            S(((Integer) s.l(this.f5730y)).intValue());
            this.f5711f.b();
            return ((x) s.l(this.f5712g)).f();
        } finally {
            this.f5710e.unlock();
        }
    }

    public final ConnectionResult e(long j10, @d.m0 TimeUnit timeUnit) {
        s.s(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        s.m(timeUnit, "TimeUnit must not be null");
        this.f5710e.lock();
        try {
            Integer num = this.f5730y;
            if (num == null) {
                this.f5730y = Integer.valueOf(K(this.f5723r.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            S(((Integer) s.l(this.f5730y)).intValue());
            this.f5711f.b();
            return ((x) s.l(this.f5712g)).h(j10, timeUnit);
        } finally {
            this.f5710e.unlock();
        }
    }

    public final o<Status> f() {
        s.s(u(), "GoogleApiClient is not connected yet.");
        Integer num = this.f5730y;
        boolean z10 = true;
        if (num != null && num.intValue() == 2) {
            z10 = false;
        }
        s.s(z10, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        p pVar = new p((k) this);
        if (this.f5723r.containsKey(m8.a.f10651a)) {
            T(this, pVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            n0 n0Var = new n0(this, atomicReference, pVar);
            g8.p0 p0Var = new g8.p0(this, pVar);
            k.a aVar = new k.a(this.f5714i);
            aVar.a(m8.a.f10652b);
            aVar.e(n0Var);
            aVar.f(p0Var);
            aVar.m(this.f5720o);
            k h10 = aVar.h();
            atomicReference.set(h10);
            h10.g();
        }
        return pVar;
    }

    public final void g() {
        this.f5710e.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.f5713h >= 0) {
                s.s(this.f5730y != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f5730y;
                if (num == null) {
                    this.f5730y = Integer.valueOf(K(this.f5723r.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) s.l(this.f5730y)).intValue();
            this.f5710e.lock();
            if (intValue == 3 || intValue == 1) {
                i10 = intValue;
            } else if (intValue != 2) {
                i10 = intValue;
                s.b(z10, "Illegal sign-in mode: " + i10);
                S(i10);
                U();
            }
            z10 = true;
            s.b(z10, "Illegal sign-in mode: " + i10);
            S(i10);
            U();
        } catch (Throwable th2) {
            throw th2;
        } finally {
            this.f5710e.unlock();
        }
    }

    public final void h(int i10) {
        this.f5710e.lock();
        boolean z10 = true;
        if (!(i10 == 3 || i10 == 1)) {
            if (i10 == 2) {
                i10 = 2;
            } else {
                z10 = false;
            }
        }
        try {
            s.b(z10, "Illegal sign-in mode: " + i10);
            S(i10);
            U();
        } finally {
            this.f5710e.unlock();
        }
    }

    public final void i() {
        this.f5710e.lock();
        try {
            this.A.b();
            x xVar = this.f5712g;
            if (xVar != null) {
                xVar.q();
            }
            this.f5728w.e();
            for (b.a aVar : this.f5716k) {
                aVar.v((h2) null);
                aVar.f();
            }
            this.f5716k.clear();
            if (this.f5712g != null) {
                R();
                this.f5711f.a();
            }
        } finally {
            this.f5710e.unlock();
        }
    }

    public final void j(String str, @d.o0 FileDescriptor fileDescriptor, PrintWriter printWriter, @d.o0 String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f5714i);
        printWriter.append(str).append("mResuming=").print(this.f5717l);
        printWriter.append(" mWorkQueue.size()=").print(this.f5716k.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.A.f8226a.size());
        x xVar = this.f5712g;
        if (xVar != null) {
            xVar.r(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final <A extends a.b, R extends u, T extends b.a<R, A>> T l(@d.m0 T t10) {
        a<?> x10 = t10.x();
        boolean containsKey = this.f5723r.containsKey(t10.y());
        String d10 = x10 != null ? x10.d() : "the API";
        s.b(containsKey, "GoogleApiClient is not configured to use " + d10 + " required for this call.");
        this.f5710e.lock();
        try {
            x xVar = this.f5712g;
            if (xVar == null) {
                this.f5716k.add(t10);
            } else {
                t10 = xVar.j(t10);
            }
            return t10;
        } finally {
            this.f5710e.unlock();
        }
    }

    public final <A extends a.b, T extends b.a<? extends u, A>> T m(@d.m0 T t10) {
        a<?> x10 = t10.x();
        boolean containsKey = this.f5723r.containsKey(t10.y());
        String d10 = x10 != null ? x10.d() : "the API";
        s.b(containsKey, "GoogleApiClient is not configured to use " + d10 + " required for this call.");
        this.f5710e.lock();
        try {
            x xVar = this.f5712g;
            if (xVar != null) {
                if (this.f5717l) {
                    this.f5716k.add(t10);
                    while (!this.f5716k.isEmpty()) {
                        b.a aVar = (b.a) this.f5716k.remove();
                        this.A.a(aVar);
                        aVar.a(Status.W);
                    }
                } else {
                    t10 = xVar.l(t10);
                }
                return t10;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f5710e.unlock();
        }
    }

    @d.m0
    public final <C extends a.f> C o(@d.m0 a.c<C> cVar) {
        C c10 = (a.f) this.f5723r.get(cVar);
        s.m(c10, "Appropriate Api was not requested.");
        return c10;
    }

    @d.m0
    public final ConnectionResult p(@d.m0 a<?> aVar) {
        ConnectionResult connectionResult;
        this.f5710e.lock();
        try {
            if (!u()) {
                if (!this.f5717l) {
                    throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
                }
            }
            if (this.f5723r.containsKey(aVar.b())) {
                ConnectionResult p10 = ((x) s.l(this.f5712g)).p(aVar);
                if (p10 == null) {
                    if (this.f5717l) {
                        connectionResult = ConnectionResult.f5624r0;
                    } else {
                        M();
                        String d10 = aVar.d();
                        Log.wtf("GoogleApiClientImpl", d10 + " requested in getConnectionResult is not connected but is not present in the failed  connections map", new Exception());
                        connectionResult = new ConnectionResult(8, (PendingIntent) null);
                    }
                    return connectionResult;
                }
                this.f5710e.unlock();
                return p10;
            }
            String d11 = aVar.d();
            throw new IllegalArgumentException(d11 + " was never registered with GoogleApiClient");
        } finally {
            this.f5710e.unlock();
        }
    }

    public final Context q() {
        return this.f5714i;
    }

    public final Looper r() {
        return this.f5715j;
    }

    public final boolean s(@d.m0 a<?> aVar) {
        return this.f5723r.containsKey(aVar.b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (f8.a.f) r2.f5723r.get(r3.b());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(@d.m0 f8.a<?> r3) {
        /*
            r2 = this;
            boolean r0 = r2.u()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Map r0 = r2.f5723r
            f8.a$c r3 = r3.b()
            java.lang.Object r3 = r0.get(r3)
            f8.a$f r3 = (f8.a.f) r3
            if (r3 == 0) goto L_0x001e
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x001e
            r3 = 1
            return r3
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.q.t(f8.a):boolean");
    }

    public final boolean u() {
        x xVar = this.f5712g;
        return xVar != null && xVar.k();
    }

    public final boolean v() {
        x xVar = this.f5712g;
        return xVar != null && xVar.g();
    }

    public final boolean w(@d.m0 k.b bVar) {
        return this.f5711f.j(bVar);
    }

    public final boolean x(@d.m0 k.c cVar) {
        return this.f5711f.k(cVar);
    }

    public final boolean y(n nVar) {
        x xVar = this.f5712g;
        return xVar != null && xVar.m(nVar);
    }

    public final void z() {
        x xVar = this.f5712g;
        if (xVar != null) {
            xVar.o();
        }
    }
}
