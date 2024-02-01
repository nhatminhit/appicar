package j8;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b9.u;
import d.o0;
import f8.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import w8.d0;

public final class p0 implements Handler.Callback {
    @NotOnlyInitialized
    public final o0 O;
    public final ArrayList P = new ArrayList();
    @d0
    public final ArrayList Q = new ArrayList();
    public final ArrayList R = new ArrayList();
    public volatile boolean S = false;
    public final AtomicInteger T = new AtomicInteger(0);
    public boolean U = false;
    public final Handler V;
    public final Object W = new Object();

    public p0(Looper looper, o0 o0Var) {
        this.O = o0Var;
        this.V = new u(looper, this);
    }

    public final void a() {
        this.S = false;
        this.T.incrementAndGet();
    }

    public final void b() {
        this.S = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    @w8.d0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(com.google.android.gms.common.ConnectionResult r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.V
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            j8.s.e(r0, r1)
            android.os.Handler r0 = r5.V
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.W
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            java.util.ArrayList r2 = r5.R     // Catch:{ all -> 0x004a }
            r1.<init>(r2)     // Catch:{ all -> 0x004a }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.T     // Catch:{ all -> 0x004a }
            int r2 = r2.get()     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004a }
            f8.k$c r3 = (f8.k.c) r3     // Catch:{ all -> 0x004a }
            boolean r4 = r5.S     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicInteger r4 = r5.T     // Catch:{ all -> 0x004a }
            int r4 = r4.get()     // Catch:{ all -> 0x004a }
            if (r4 == r2) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            java.util.ArrayList r4 = r5.R     // Catch:{ all -> 0x004a }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0021
            r3.H(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0021
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.p0.c(com.google.android.gms.common.ConnectionResult):void");
    }

    @d0
    public final void d(@o0 Bundle bundle) {
        s.e(this.V, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.W) {
            s.r(!this.U);
            this.V.removeMessages(1);
            this.U = true;
            s.r(this.Q.isEmpty());
            ArrayList arrayList = new ArrayList(this.P);
            int i10 = this.T.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k.b bVar = (k.b) it.next();
                if (!this.S || !this.O.a()) {
                    break;
                } else if (this.T.get() != i10) {
                    break;
                } else if (!this.Q.contains(bVar)) {
                    bVar.J(bundle);
                }
            }
            this.Q.clear();
            this.U = false;
        }
    }

    @d0
    public final void e(int i10) {
        s.e(this.V, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.V.removeMessages(1);
        synchronized (this.W) {
            this.U = true;
            ArrayList arrayList = new ArrayList(this.P);
            int i11 = this.T.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k.b bVar = (k.b) it.next();
                if (!this.S) {
                    break;
                } else if (this.T.get() != i11) {
                    break;
                } else if (this.P.contains(bVar)) {
                    bVar.D(i10);
                }
            }
            this.Q.clear();
            this.U = false;
        }
    }

    public final void f(k.b bVar) {
        s.l(bVar);
        synchronized (this.W) {
            if (this.P.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("registerConnectionCallbacks(): listener ");
                sb2.append(valueOf);
                sb2.append(" is already registered");
            } else {
                this.P.add(bVar);
            }
        }
        if (this.O.a()) {
            Handler handler = this.V;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(k.c cVar) {
        s.l(cVar);
        synchronized (this.W) {
            if (this.R.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("registerConnectionFailedListener(): listener ");
                sb2.append(valueOf);
                sb2.append(" is already registered");
            } else {
                this.R.add(cVar);
            }
        }
    }

    public final void h(k.b bVar) {
        s.l(bVar);
        synchronized (this.W) {
            if (!this.P.remove(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unregisterConnectionCallbacks(): listener ");
                sb2.append(valueOf);
                sb2.append(" not found");
            } else if (this.U) {
                this.Q.add(bVar);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            k.b bVar = (k.b) message.obj;
            synchronized (this.W) {
                if (this.S && this.O.a() && this.P.contains(bVar)) {
                    bVar.J((Bundle) null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i10, new Exception());
        return false;
    }

    public final void i(k.c cVar) {
        s.l(cVar);
        synchronized (this.W) {
            if (!this.R.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unregisterConnectionFailedListener(): listener ");
                sb2.append(valueOf);
                sb2.append(" not found");
            }
        }
    }

    public final boolean j(k.b bVar) {
        boolean contains;
        s.l(bVar);
        synchronized (this.W) {
            contains = this.P.contains(bVar);
        }
        return contains;
    }

    public final boolean k(k.c cVar) {
        boolean contains;
        s.l(cVar);
        synchronized (this.W) {
            contains = this.R.contains(cVar);
        }
        return contains;
    }
}
