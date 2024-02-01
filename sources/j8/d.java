package j8;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzj;
import d.h1;
import d.i;
import d.m0;
import d.o0;
import d8.f;
import f8.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import w8.d0;

@e8.a
public abstract class d<T extends IInterface> {
    @e8.a

    /* renamed from: r0  reason: collision with root package name */
    public static final int f9702r0 = 1;
    @e8.a

    /* renamed from: s0  reason: collision with root package name */
    public static final int f9703s0 = 4;
    @e8.a

    /* renamed from: t0  reason: collision with root package name */
    public static final int f9704t0 = 5;
    @e8.a
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public static final String f9705u0 = "pendingIntent";
    @e8.a
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public static final String f9706v0 = "<<default account>>";
    @e8.a
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public static final String[] f9707w0 = {"service_esmobile", "service_googleme"};

    /* renamed from: x0  reason: collision with root package name */
    public static final Feature[] f9708x0 = new Feature[0];
    public int O;
    public long P;
    public long Q;
    public int R;
    public long S;
    @o0
    public volatile String T;
    @d0
    public g2 U;
    public final Context V;
    public final Looper W;
    public final i X;
    public final f Y;
    public final Handler Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Object f9709a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Object f9710b0;
    @GuardedBy("mServiceBrokerLock")
    @o0

    /* renamed from: c0  reason: collision with root package name */
    public n f9711c0;
    @d0
    @m0

    /* renamed from: d0  reason: collision with root package name */
    public c f9712d0;
    @GuardedBy("mLock")
    @o0

    /* renamed from: e0  reason: collision with root package name */
    public IInterface f9713e0;

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayList f9714f0;
    @GuardedBy("mLock")
    @o0

    /* renamed from: g0  reason: collision with root package name */
    public q1 f9715g0;
    @GuardedBy("mLock")

    /* renamed from: h0  reason: collision with root package name */
    public int f9716h0;
    @o0

    /* renamed from: i0  reason: collision with root package name */
    public final a f9717i0;
    @o0

    /* renamed from: j0  reason: collision with root package name */
    public final b f9718j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f9719k0;
    @o0

    /* renamed from: l0  reason: collision with root package name */
    public final String f9720l0;
    @o0

    /* renamed from: m0  reason: collision with root package name */
    public volatile String f9721m0;
    @o0

    /* renamed from: n0  reason: collision with root package name */
    public ConnectionResult f9722n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f9723o0;
    @o0

    /* renamed from: p0  reason: collision with root package name */
    public volatile zzj f9724p0;
    @d0
    @m0

    /* renamed from: q0  reason: collision with root package name */
    public AtomicInteger f9725q0;

    @e8.a
    public interface a {
        @e8.a

        /* renamed from: a  reason: collision with root package name */
        public static final int f9726a = 1;
        @e8.a

        /* renamed from: b  reason: collision with root package name */
        public static final int f9727b = 3;

        @e8.a
        void D(int i10);

        @e8.a
        void J(@o0 Bundle bundle);
    }

    @e8.a
    public interface b {
        @e8.a
        void H(@m0 ConnectionResult connectionResult);
    }

    @e8.a
    public interface c {
        @e8.a
        void a(@m0 ConnectionResult connectionResult);
    }

    /* renamed from: j8.d$d  reason: collision with other inner class name */
    public class C0164d implements c {
        @e8.a
        public C0164d() {
        }

        public final void a(@m0 ConnectionResult connectionResult) {
            if (connectionResult.h1()) {
                d dVar = d.this;
                dVar.i((com.google.android.gms.common.internal.b) null, dVar.L());
            } else if (d.this.f9718j0 != null) {
                d.this.f9718j0.H(connectionResult);
            }
        }
    }

    @e8.a
    public interface e {
        @e8.a
        void a();
    }

    @e8.a
    @d0
    public d(@m0 Context context, @m0 Handler handler, @m0 i iVar, @m0 f fVar, int i10, @o0 a aVar, @o0 b bVar) {
        this.T = null;
        this.f9709a0 = new Object();
        this.f9710b0 = new Object();
        this.f9714f0 = new ArrayList();
        this.f9716h0 = 1;
        this.f9722n0 = null;
        this.f9723o0 = false;
        this.f9724p0 = null;
        this.f9725q0 = new AtomicInteger(0);
        s.m(context, "Context must not be null");
        this.V = context;
        s.m(handler, "Handler must not be null");
        this.Z = handler;
        this.W = handler.getLooper();
        s.m(iVar, "Supervisor must not be null");
        this.X = iVar;
        s.m(fVar, "API availability must not be null");
        this.Y = fVar;
        this.f9719k0 = i10;
        this.f9717i0 = aVar;
        this.f9718j0 = bVar;
        this.f9720l0 = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @e8.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(@d.m0 android.content.Context r10, @d.m0 android.os.Looper r11, int r12, @d.o0 j8.d.a r13, @d.o0 j8.d.b r14, @d.o0 java.lang.String r15) {
        /*
            r9 = this;
            j8.i r3 = j8.i.d(r10)
            d8.f r4 = d8.f.i()
            j8.s.l(r13)
            j8.s.l(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.d.<init>(android.content.Context, android.os.Looper, int, j8.d$a, j8.d$b, java.lang.String):void");
    }

    @e8.a
    @d0
    public d(@m0 Context context, @m0 Looper looper, @m0 i iVar, @m0 f fVar, int i10, @o0 a aVar, @o0 b bVar, @o0 String str) {
        this.T = null;
        this.f9709a0 = new Object();
        this.f9710b0 = new Object();
        this.f9714f0 = new ArrayList();
        this.f9716h0 = 1;
        this.f9722n0 = null;
        this.f9723o0 = false;
        this.f9724p0 = null;
        this.f9725q0 = new AtomicInteger(0);
        s.m(context, "Context must not be null");
        this.V = context;
        s.m(looper, "Looper must not be null");
        this.W = looper;
        s.m(iVar, "Supervisor must not be null");
        this.X = iVar;
        s.m(fVar, "API availability must not be null");
        this.Y = fVar;
        this.Z = new n1(this, looper);
        this.f9719k0 = i10;
        this.f9717i0 = aVar;
        this.f9718j0 = bVar;
        this.f9720l0 = str;
    }

    public static /* bridge */ /* synthetic */ void k0(d dVar, zzj zzj) {
        dVar.f9724p0 = zzj;
        if (dVar.a0()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzj.R;
            u.b().c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.m1());
        }
    }

    public static /* bridge */ /* synthetic */ void l0(d dVar, int i10) {
        int i11;
        int i12;
        synchronized (dVar.f9709a0) {
            i11 = dVar.f9716h0;
        }
        if (i11 == 3) {
            dVar.f9723o0 = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = dVar.Z;
        handler.sendMessage(handler.obtainMessage(i12, dVar.f9725q0.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean o0(d dVar, int i10, int i11, IInterface iInterface) {
        synchronized (dVar.f9709a0) {
            if (dVar.f9716h0 != i10) {
                return false;
            }
            dVar.q0(i11, iInterface);
            return true;
        }
    }

    public static /* bridge */ /* synthetic */ boolean p0(d dVar) {
        if (dVar.f9723o0 || TextUtils.isEmpty(dVar.N()) || TextUtils.isEmpty(dVar.J())) {
            return false;
        }
        try {
            Class.forName(dVar.N());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @e8.a
    @o0
    public abstract T A(@m0 IBinder iBinder);

    @e8.a
    public boolean B() {
        return false;
    }

    @e8.a
    @o0
    public Account C() {
        return null;
    }

    @e8.a
    @m0
    public Feature[] D() {
        return f9708x0;
    }

    @e8.a
    @o0
    public Executor E() {
        return null;
    }

    @e8.a
    @o0
    public Bundle F() {
        return null;
    }

    @e8.a
    @m0
    public final Context G() {
        return this.V;
    }

    @e8.a
    public int H() {
        return this.f9719k0;
    }

    @e8.a
    @m0
    public Bundle I() {
        return new Bundle();
    }

    @e8.a
    @o0
    public String J() {
        return null;
    }

    @e8.a
    @m0
    public final Looper K() {
        return this.W;
    }

    @e8.a
    @m0
    public Set<Scope> L() {
        return Collections.emptySet();
    }

    @e8.a
    @m0
    public final T M() throws DeadObjectException {
        T t10;
        synchronized (this.f9709a0) {
            if (this.f9716h0 != 5) {
                z();
                t10 = this.f9713e0;
                s.m(t10, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t10;
    }

    @e8.a
    @m0
    public abstract String N();

    @e8.a
    @m0
    public abstract String O();

    @e8.a
    @m0
    public String P() {
        return "com.google.android.gms";
    }

    @e8.a
    @o0
    public ConnectionTelemetryConfiguration Q() {
        zzj zzj = this.f9724p0;
        if (zzj == null) {
            return null;
        }
        return zzj.R;
    }

    @e8.a
    public boolean R() {
        return p() >= 211700000;
    }

    @e8.a
    public boolean S() {
        return this.f9724p0 != null;
    }

    @e8.a
    @i
    public void T(@m0 T t10) {
        this.Q = System.currentTimeMillis();
    }

    @e8.a
    @i
    public void U(@m0 ConnectionResult connectionResult) {
        this.R = connectionResult.X0();
        this.S = System.currentTimeMillis();
    }

    @e8.a
    @i
    public void V(int i10) {
        this.O = i10;
        this.P = System.currentTimeMillis();
    }

    @e8.a
    public void W(int i10, @o0 IBinder iBinder, @o0 Bundle bundle, int i11) {
        Handler handler = this.Z;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new r1(this, i10, iBinder, bundle)));
    }

    @e8.a
    public void X(@m0 String str) {
        this.f9721m0 = str;
    }

    @e8.a
    public void Y(int i10) {
        Handler handler = this.Z;
        handler.sendMessage(handler.obtainMessage(6, this.f9725q0.get(), i10));
    }

    @e8.a
    @d0
    public void Z(@m0 c cVar, int i10, @o0 PendingIntent pendingIntent) {
        s.m(cVar, "Connection progress callbacks cannot be null.");
        this.f9712d0 = cVar;
        Handler handler = this.Z;
        handler.sendMessage(handler.obtainMessage(3, this.f9725q0.get(), i10, pendingIntent));
    }

    @e8.a
    public boolean a() {
        boolean z10;
        synchronized (this.f9709a0) {
            z10 = this.f9716h0 == 4;
        }
        return z10;
    }

    @e8.a
    public boolean a0() {
        return false;
    }

    @e8.a
    public boolean b() {
        return false;
    }

    @e8.a
    public void d() {
        this.f9725q0.incrementAndGet();
        synchronized (this.f9714f0) {
            int size = this.f9714f0.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((o1) this.f9714f0.get(i10)).d();
            }
            this.f9714f0.clear();
        }
        synchronized (this.f9710b0) {
            this.f9711c0 = null;
        }
        q0(1, (IInterface) null);
    }

    @e8.a
    public void e(@m0 c cVar) {
        s.m(cVar, "Connection progress callbacks cannot be null.");
        this.f9712d0 = cVar;
        q0(2, (IInterface) null);
    }

    @m0
    public final String f0() {
        String str = this.f9720l0;
        return str == null ? this.V.getClass().getName() : str;
    }

    @e8.a
    public boolean g() {
        return false;
    }

    @e8.a
    @h1
    public void i(@o0 com.google.android.gms.common.internal.b bVar, @m0 Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle I = I();
        int i10 = this.f9719k0;
        String str = this.f9721m0;
        int i11 = f.f6595a;
        Scope[] scopeArr = GetServiceRequest.f5764c0;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f5765d0;
        GetServiceRequest getServiceRequest = r3;
        GetServiceRequest getServiceRequest2 = new GetServiceRequest(6, i10, i11, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, featureArr, featureArr, true, 0, false, str);
        GetServiceRequest getServiceRequest3 = getServiceRequest;
        getServiceRequest3.R = this.V.getPackageName();
        getServiceRequest3.U = I;
        if (set2 != null) {
            getServiceRequest3.T = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (v()) {
            Account C = C();
            if (C == null) {
                C = new Account("<<default account>>", a.f9695a);
            }
            getServiceRequest3.V = C;
            if (bVar != null) {
                getServiceRequest3.S = bVar.asBinder();
            }
        } else if (b()) {
            getServiceRequest3.V = C();
        }
        getServiceRequest3.W = f9708x0;
        getServiceRequest3.X = D();
        if (a0()) {
            getServiceRequest3.f5766a0 = true;
        }
        try {
            synchronized (this.f9710b0) {
                n nVar = this.f9711c0;
                if (nVar != null) {
                    nVar.O(new p1(this, this.f9725q0.get()), getServiceRequest3);
                }
            }
        } catch (DeadObjectException unused) {
            Y(3);
        } catch (SecurityException e10) {
            throw e10;
        } catch (RemoteException | RuntimeException unused2) {
            W(8, (IBinder) null, (Bundle) null, this.f9725q0.get());
        }
    }

    @e8.a
    public void j(@m0 String str) {
        this.T = str;
        d();
    }

    @e8.a
    public boolean k() {
        boolean z10;
        synchronized (this.f9709a0) {
            int i10 = this.f9716h0;
            z10 = true;
            if (i10 != 2) {
                if (i10 != 3) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    @e8.a
    @m0
    public String l() {
        g2 g2Var;
        if (a() && (g2Var = this.U) != null) {
            return g2Var.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public final void m0(int i10, @o0 Bundle bundle, int i11) {
        Handler handler = this.Z;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new s1(this, i10, (Bundle) null)));
    }

    @e8.a
    public void n(@m0 String str, @m0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @m0 String[] strArr) {
        int i10;
        IInterface iInterface;
        n nVar;
        synchronized (this.f9709a0) {
            i10 = this.f9716h0;
            iInterface = this.f9713e0;
        }
        synchronized (this.f9710b0) {
            nVar = this.f9711c0;
        }
        printWriter.append(str).append("mConnectState=");
        printWriter.print(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(N()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (nVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(nVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.Q > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j10 = this.Q;
            String format = simpleDateFormat.format(new Date(j10));
            append.println(j10 + " " + format);
        }
        if (this.P > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i11 = this.O;
            printWriter.append(i11 != 1 ? i11 != 2 ? i11 != 3 ? String.valueOf(i11) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED");
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.P;
            String format2 = simpleDateFormat.format(new Date(j11));
            append2.println(j11 + " " + format2);
        }
        if (this.S > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(h.a(this.R));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.S;
            String format3 = simpleDateFormat.format(new Date(j12));
            append3.println(j12 + " " + format3);
        }
    }

    @e8.a
    public boolean o() {
        return true;
    }

    @e8.a
    public int p() {
        return f.f6595a;
    }

    @e8.a
    public void q(@m0 e eVar) {
        eVar.a();
    }

    public final void q0(int i10, @o0 IInterface iInterface) {
        g2 g2Var;
        boolean z10 = false;
        if ((i10 == 4) == (iInterface != null)) {
            z10 = true;
        }
        s.a(z10);
        synchronized (this.f9709a0) {
            this.f9716h0 = i10;
            this.f9713e0 = iInterface;
            if (i10 == 1) {
                q1 q1Var = this.f9715g0;
                if (q1Var != null) {
                    i iVar = this.X;
                    String c10 = this.U.c();
                    s.l(c10);
                    iVar.j(c10, this.U.b(), this.U.a(), q1Var, f0(), this.U.d());
                    this.f9715g0 = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                q1 q1Var2 = this.f9715g0;
                if (!(q1Var2 == null || (g2Var = this.U) == null)) {
                    String c11 = g2Var.c();
                    String b10 = g2Var.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calling connect() while still connected, missing disconnect() for ");
                    sb2.append(c11);
                    sb2.append(" on ");
                    sb2.append(b10);
                    i iVar2 = this.X;
                    String c12 = this.U.c();
                    s.l(c12);
                    iVar2.j(c12, this.U.b(), this.U.a(), q1Var2, f0(), this.U.d());
                    this.f9725q0.incrementAndGet();
                }
                q1 q1Var3 = new q1(this, this.f9725q0.get());
                this.f9715g0 = q1Var3;
                g2 g2Var2 = (this.f9716h0 != 3 || J() == null) ? new g2(P(), O(), false, i.c(), R()) : new g2(G().getPackageName(), J(), true, i.c(), false);
                this.U = g2Var2;
                if (g2Var2.d()) {
                    if (p() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.U.c())));
                    }
                }
                i iVar3 = this.X;
                String c13 = this.U.c();
                s.l(c13);
                if (!iVar3.k(new y1(c13, this.U.b(), this.U.a(), this.U.d()), q1Var3, f0(), E())) {
                    String c14 = this.U.c();
                    String b11 = this.U.b();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("unable to connect to service: ");
                    sb3.append(c14);
                    sb3.append(" on ");
                    sb3.append(b11);
                    m0(16, (Bundle) null, this.f9725q0.get());
                }
            } else if (i10 == 4) {
                s.l(iInterface);
                T(iInterface);
            }
        }
    }

    @e8.a
    @o0
    public final Feature[] r() {
        zzj zzj = this.f9724p0;
        if (zzj == null) {
            return null;
        }
        return zzj.P;
    }

    @e8.a
    @o0
    public String t() {
        return this.T;
    }

    @e8.a
    @m0
    public Intent u() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @e8.a
    public boolean v() {
        return false;
    }

    @e8.a
    @o0
    public IBinder w() {
        synchronized (this.f9710b0) {
            n nVar = this.f9711c0;
            if (nVar == null) {
                return null;
            }
            IBinder asBinder = nVar.asBinder();
            return asBinder;
        }
    }

    @e8.a
    public void y() {
        int k10 = this.Y.k(this.V, p());
        if (k10 != 0) {
            q0(1, (IInterface) null);
            Z(new C0164d(), k10, (PendingIntent) null);
            return;
        }
        e(new C0164d());
    }

    @e8.a
    public final void z() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }
}
