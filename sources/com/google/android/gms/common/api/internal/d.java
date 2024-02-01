package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.b;
import b6.h;
import b9.u;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import d.h1;
import d.m0;
import d.o0;
import d8.e;
import e8.a;
import f8.j;
import g8.c;
import g8.c1;
import g8.j2;
import g8.k1;
import g8.l1;
import g8.n2;
import g8.o;
import g8.o1;
import g8.p1;
import g8.q;
import g8.w0;
import g8.x;
import h9.m;
import h9.n;
import j8.i;
import j8.q0;
import j8.s;
import j8.w;
import j8.y;
import j8.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import w8.l;

@a
@w
public class d implements Handler.Callback {
    @m0

    /* renamed from: f0  reason: collision with root package name */
    public static final Status f5653f0 = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: g0  reason: collision with root package name */
    public static final Status f5654g0 = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: h0  reason: collision with root package name */
    public static final Object f5655h0 = new Object();
    @GuardedBy("lock")
    @o0

    /* renamed from: i0  reason: collision with root package name */
    public static d f5656i0;
    public long O = h.f4357h;
    public long P = 120000;
    public long Q = 10000;
    public boolean R = false;
    @o0
    public TelemetryData S;
    @o0
    public z T;
    public final Context U;
    public final e V;
    public final q0 W;
    public final AtomicInteger X = new AtomicInteger(1);
    public final AtomicInteger Y = new AtomicInteger(0);
    public final Map Z = new ConcurrentHashMap(5, 0.75f, 1);
    @GuardedBy("lock")
    @o0

    /* renamed from: a0  reason: collision with root package name */
    public g8.w f5657a0 = null;
    @GuardedBy("lock")

    /* renamed from: b0  reason: collision with root package name */
    public final Set f5658b0 = new b();

    /* renamed from: c0  reason: collision with root package name */
    public final Set f5659c0 = new b();
    @NotOnlyInitialized

    /* renamed from: d0  reason: collision with root package name */
    public final Handler f5660d0;

    /* renamed from: e0  reason: collision with root package name */
    public volatile boolean f5661e0 = true;

    @a
    public d(Context context, Looper looper, e eVar) {
        this.U = context;
        u uVar = new u(looper, this);
        this.f5660d0 = uVar;
        this.V = eVar;
        this.W = new q0(eVar);
        if (l.a(context)) {
            this.f5661e0 = false;
        }
        uVar.sendMessage(uVar.obtainMessage(6));
    }

    @a
    public static void a() {
        synchronized (f5655h0) {
            d dVar = f5656i0;
            if (dVar != null) {
                dVar.Y.incrementAndGet();
                Handler handler = dVar.f5660d0;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    public static Status i(c cVar, ConnectionResult connectionResult) {
        String b10 = cVar.b();
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, "API: " + b10 + " is not available on this device. Connection failed with: " + valueOf);
    }

    @m0
    public static d y() {
        d dVar;
        synchronized (f5655h0) {
            s.m(f5656i0, "Must guarantee manager is non-null before using getInstance");
            dVar = f5656i0;
        }
        return dVar;
    }

    @m0
    public static d z(@m0 Context context) {
        d dVar;
        synchronized (f5655h0) {
            if (f5656i0 == null) {
                f5656i0 = new d(context.getApplicationContext(), i.e().getLooper(), e.x());
            }
            dVar = f5656i0;
        }
        return dVar;
    }

    @m0
    public final m B(@m0 Iterable iterable) {
        n2 n2Var = new n2(iterable);
        Handler handler = this.f5660d0;
        handler.sendMessage(handler.obtainMessage(2, n2Var));
        return n2Var.a();
    }

    @m0
    public final m C(@m0 j jVar) {
        x xVar = new x(jVar.G());
        Handler handler = this.f5660d0;
        handler.sendMessage(handler.obtainMessage(14, xVar));
        return xVar.b().a();
    }

    @m0
    public final m D(@m0 j jVar, @m0 h hVar, @m0 k kVar, @m0 Runnable runnable) {
        n nVar = new n();
        m(nVar, hVar.e(), jVar);
        b0 b0Var = new b0(new p1(hVar, kVar, runnable), nVar);
        Handler handler = this.f5660d0;
        handler.sendMessage(handler.obtainMessage(8, new o1(b0Var, this.Y.get(), jVar)));
        return nVar.a();
    }

    @m0
    public final m E(@m0 j jVar, @m0 f.a aVar, int i10) {
        n nVar = new n();
        m(nVar, i10, jVar);
        c0 c0Var = new c0(aVar, nVar);
        Handler handler = this.f5660d0;
        handler.sendMessage(handler.obtainMessage(13, new o1(c0Var, this.Y.get(), jVar)));
        return nVar.a();
    }

    public final void J(@m0 j jVar, int i10, @m0 b.a aVar) {
        a0 a0Var = new a0(i10, aVar);
        Handler handler = this.f5660d0;
        handler.sendMessage(handler.obtainMessage(4, new o1(a0Var, this.Y.get(), jVar)));
    }

    public final void K(@m0 j jVar, int i10, @m0 q qVar, @m0 n nVar, @m0 o oVar) {
        m(nVar, qVar.d(), jVar);
        j2 j2Var = new j2(i10, qVar, nVar, oVar);
        Handler handler = this.f5660d0;
        handler.sendMessage(handler.obtainMessage(4, new o1(j2Var, this.Y.get(), jVar)));
    }

    public final void L(MethodInvocation methodInvocation, int i10, long j10, int i11) {
        Handler handler = this.f5660d0;
        handler.sendMessage(handler.obtainMessage(18, new l1(methodInvocation, i10, j10, i11)));
    }

    public final void M(@m0 ConnectionResult connectionResult, int i10) {
        if (!h(connectionResult, i10)) {
            Handler handler = this.f5660d0;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
        }
    }

    public final void b() {
        Handler handler = this.f5660d0;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void c(@m0 j jVar) {
        Handler handler = this.f5660d0;
        handler.sendMessage(handler.obtainMessage(7, jVar));
    }

    public final void d(@m0 g8.w wVar) {
        synchronized (f5655h0) {
            if (this.f5657a0 != wVar) {
                this.f5657a0 = wVar;
                this.f5658b0.clear();
            }
            this.f5658b0.addAll(wVar.u());
        }
    }

    public final void e(@m0 g8.w wVar) {
        synchronized (f5655h0) {
            if (this.f5657a0 == wVar) {
                this.f5657a0 = null;
                this.f5658b0.clear();
            }
        }
    }

    @h1
    public final boolean g() {
        if (this.R) {
            return false;
        }
        RootTelemetryConfiguration a10 = j8.u.b().a();
        if (a10 != null && !a10.f1()) {
            return false;
        }
        int a11 = this.W.a(this.U, 203400000);
        return a11 == -1 || a11 == 0;
    }

    public final boolean h(ConnectionResult connectionResult, int i10) {
        return this.V.L(this.U, connectionResult, i10);
    }

    @h1
    public final boolean handleMessage(@m0 Message message) {
        n nVar;
        Boolean bool;
        int i10 = message.what;
        long j10 = va.i.f23544h;
        u uVar = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.Q = j10;
                this.f5660d0.removeMessages(12);
                for (c obtainMessage : this.Z.keySet()) {
                    Handler handler = this.f5660d0;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.Q);
                }
                break;
            case 2:
                n2 n2Var = (n2) message.obj;
                Iterator it = n2Var.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        c cVar = (c) it.next();
                        u uVar2 = (u) this.Z.get(cVar);
                        if (uVar2 == null) {
                            n2Var.c(cVar, new ConnectionResult(13), (String) null);
                            break;
                        } else if (uVar2.O()) {
                            n2Var.c(cVar, ConnectionResult.f5624r0, uVar2.s().l());
                        } else {
                            ConnectionResult q10 = uVar2.q();
                            if (q10 != null) {
                                n2Var.c(cVar, q10, (String) null);
                            } else {
                                uVar2.I(n2Var);
                                uVar2.B();
                            }
                        }
                    }
                }
            case 3:
                for (u uVar3 : this.Z.values()) {
                    uVar3.A();
                    uVar3.B();
                }
                break;
            case 4:
            case 8:
            case 13:
                o1 o1Var = (o1) message.obj;
                u uVar4 = (u) this.Z.get(o1Var.f8250c.G());
                if (uVar4 == null) {
                    uVar4 = j(o1Var.f8250c);
                }
                if (uVar4.P() && this.Y.get() != o1Var.f8249b) {
                    o1Var.f8248a.a(f5653f0);
                    uVar4.L();
                    break;
                } else {
                    uVar4.C(o1Var.f8248a);
                    break;
                }
                break;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.Z.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        u uVar5 = (u) it2.next();
                        if (uVar5.o() == i11) {
                            uVar = uVar5;
                        }
                    }
                }
                if (uVar != null) {
                    if (connectionResult.X0() != 13) {
                        uVar.d(i(uVar.Q, connectionResult));
                        break;
                    } else {
                        String h10 = this.V.h(connectionResult.X0());
                        String Z0 = connectionResult.Z0();
                        uVar.d(new Status(17, "Error resolution was canceled by the user, original error message: " + h10 + ": " + Z0));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.U.getApplicationContext() instanceof Application) {
                    a.c((Application) this.U.getApplicationContext());
                    a.b().a(new t(this));
                    if (!a.b().e(true)) {
                        this.Q = va.i.f23544h;
                        break;
                    }
                }
                break;
            case 7:
                j((j) message.obj);
                break;
            case 9:
                if (this.Z.containsKey(message.obj)) {
                    ((u) this.Z.get(message.obj)).K();
                    break;
                }
                break;
            case 10:
                for (c remove : this.f5659c0) {
                    u uVar6 = (u) this.Z.remove(remove);
                    if (uVar6 != null) {
                        uVar6.L();
                    }
                }
                this.f5659c0.clear();
                break;
            case 11:
                if (this.Z.containsKey(message.obj)) {
                    ((u) this.Z.get(message.obj)).M();
                    break;
                }
                break;
            case 12:
                if (this.Z.containsKey(message.obj)) {
                    ((u) this.Z.get(message.obj)).a();
                    break;
                }
                break;
            case 14:
                x xVar = (x) message.obj;
                c a10 = xVar.a();
                if (!this.Z.containsKey(a10)) {
                    nVar = xVar.b();
                    bool = Boolean.FALSE;
                } else {
                    boolean N = ((u) this.Z.get(a10)).n(false);
                    nVar = xVar.b();
                    bool = Boolean.valueOf(N);
                }
                nVar.c(bool);
                break;
            case 15:
                c1 c1Var = (c1) message.obj;
                if (this.Z.containsKey(c1Var.f8195a)) {
                    u.y((u) this.Z.get(c1Var.f8195a), c1Var);
                    break;
                }
                break;
            case 16:
                c1 c1Var2 = (c1) message.obj;
                if (this.Z.containsKey(c1Var2.f8195a)) {
                    u.z((u) this.Z.get(c1Var2.f8195a), c1Var2);
                    break;
                }
                break;
            case 17:
                l();
                break;
            case 18:
                l1 l1Var = (l1) message.obj;
                if (l1Var.f8240c != 0) {
                    TelemetryData telemetryData = this.S;
                    if (telemetryData != null) {
                        List X0 = telemetryData.X0();
                        if (telemetryData.c() != l1Var.f8239b || (X0 != null && X0.size() >= l1Var.f8241d)) {
                            this.f5660d0.removeMessages(17);
                            l();
                        } else {
                            this.S.Z0(l1Var.f8238a);
                        }
                    }
                    if (this.S == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(l1Var.f8238a);
                        this.S = new TelemetryData(l1Var.f8239b, arrayList);
                        Handler handler2 = this.f5660d0;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), l1Var.f8240c);
                        break;
                    }
                } else {
                    k().g(new TelemetryData(l1Var.f8239b, Arrays.asList(new MethodInvocation[]{l1Var.f8238a})));
                    break;
                }
                break;
            case 19:
                this.R = false;
                break;
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown message id: ");
                sb2.append(i10);
                return false;
        }
        return true;
    }

    @h1
    public final u j(j jVar) {
        c G = jVar.G();
        u uVar = (u) this.Z.get(G);
        if (uVar == null) {
            uVar = new u(this, jVar);
            this.Z.put(G, uVar);
        }
        if (uVar.P()) {
            this.f5659c0.add(G);
        }
        uVar.B();
        return uVar;
    }

    @h1
    public final z k() {
        if (this.T == null) {
            this.T = y.a(this.U);
        }
        return this.T;
    }

    @h1
    public final void l() {
        TelemetryData telemetryData = this.S;
        if (telemetryData != null) {
            if (telemetryData.c() > 0 || g()) {
                k().g(telemetryData);
            }
            this.S = null;
        }
    }

    public final void m(n nVar, int i10, j jVar) {
        k1 b10;
        if (i10 != 0 && (b10 = k1.b(this, i10, jVar.G())) != null) {
            m a10 = nVar.a();
            Handler handler = this.f5660d0;
            handler.getClass();
            a10.f(new w0(handler), b10);
        }
    }

    public final int n() {
        return this.X.getAndIncrement();
    }

    @o0
    public final u x(c cVar) {
        return (u) this.Z.get(cVar);
    }
}
