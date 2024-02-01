package g8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import d.h1;
import d.m0;
import d.o0;
import e8.a;
import f8.a;
import j8.d;
import j8.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

@a
public final class i implements a.f, ServiceConnection {
    public static final String Z = i.class.getSimpleName();
    @o0
    public final String O;
    @o0
    public final String P;
    @o0
    public final ComponentName Q;
    public final Context R;
    public final d S;
    public final Handler T;
    public final j U;
    @o0
    public IBinder V;
    public boolean W;
    @o0
    public String X;
    @o0
    public String Y;

    @e8.a
    public i(@m0 Context context, @m0 Looper looper, @m0 ComponentName componentName, @m0 d dVar, @m0 j jVar) {
        this(context, looper, (String) null, (String) null, componentName, dVar, jVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r6 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(android.content.Context r2, android.os.Looper r3, @d.o0 java.lang.String r4, @d.o0 java.lang.String r5, @d.o0 android.content.ComponentName r6, g8.d r7, g8.j r8) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.W = r0
            r0 = 0
            r1.X = r0
            r1.R = r2
            b9.u r2 = new b9.u
            r2.<init>(r3)
            r1.T = r2
            r1.S = r7
            r1.U = r8
            if (r4 == 0) goto L_0x001e
            if (r5 == 0) goto L_0x001e
            if (r6 != 0) goto L_0x0027
            r6 = r0
            goto L_0x0020
        L_0x001e:
            if (r6 == 0) goto L_0x0027
        L_0x0020:
            r1.O = r4
            r1.P = r5
            r1.Q = r6
            return
        L_0x0027:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Must specify either package or component, but not both"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.i.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, g8.d, g8.j):void");
    }

    @e8.a
    public i(@m0 Context context, @m0 Looper looper, @m0 String str, @m0 String str2, @m0 d dVar, @m0 j jVar) {
        this(context, looper, str, str2, (ComponentName) null, dVar, jVar);
    }

    public final void A(@o0 String str) {
        this.Y = str;
    }

    @h1
    public final void B() {
        if (Thread.currentThread() != this.T.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @h1
    public final boolean a() {
        B();
        return this.V != null;
    }

    public final boolean b() {
        return false;
    }

    @h1
    public final void d() {
        B();
        String.valueOf(this.V);
        try {
            this.R.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.W = false;
        this.V = null;
    }

    @h1
    public final void e(@m0 d.c cVar) {
        B();
        String.valueOf(this.V);
        if (a()) {
            try {
                j("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.Q;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.O).setAction(this.P);
            }
            boolean bindService = this.R.bindService(intent, this, j8.i.c());
            this.W = bindService;
            if (!bindService) {
                this.V = null;
                this.U.H(new ConnectionResult(16));
            }
            String.valueOf(this.V);
        } catch (SecurityException e10) {
            this.W = false;
            this.V = null;
            throw e10;
        }
    }

    public final /* synthetic */ void f() {
        this.W = false;
        this.V = null;
        this.S.D(1);
    }

    public final boolean g() {
        return false;
    }

    @m0
    public final Set<Scope> h() {
        return Collections.emptySet();
    }

    public final void i(@o0 b bVar, @o0 Set<Scope> set) {
    }

    @h1
    public final void j(@m0 String str) {
        B();
        this.X = str;
        d();
    }

    @h1
    public final boolean k() {
        B();
        return this.W;
    }

    @m0
    public final String l() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        s.l(this.Q);
        return this.Q.getPackageName();
    }

    @m0
    public final Feature[] m() {
        return new Feature[0];
    }

    public final void n(@m0 String str, @o0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @o0 String[] strArr) {
    }

    public final boolean o() {
        return false;
    }

    public final void onServiceConnected(@m0 ComponentName componentName, @m0 IBinder iBinder) {
        this.T.post(new n1(this, iBinder));
    }

    public final void onServiceDisconnected(@m0 ComponentName componentName) {
        this.T.post(new m1(this));
    }

    public final int p() {
        return 0;
    }

    public final void q(@m0 d.e eVar) {
    }

    @m0
    public final Feature[] r() {
        return new Feature[0];
    }

    @o0
    public final String t() {
        return this.X;
    }

    @m0
    public final Intent u() {
        return new Intent();
    }

    public final boolean v() {
        return false;
    }

    @o0
    public final IBinder w() {
        return null;
    }

    @e8.a
    @h1
    @o0
    public IBinder y() {
        B();
        return this.V;
    }

    public final /* synthetic */ void z(IBinder iBinder) {
        this.W = false;
        this.V = iBinder;
        String.valueOf(iBinder);
        this.S.J(new Bundle());
    }
}
