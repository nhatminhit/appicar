package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import d.w0;
import d9.d;
import d9.l;
import d9.m;
import f8.k;
import f8.o;
import h9.n;
import j8.s;

public final class v implements d {
    public static /* bridge */ /* synthetic */ n m(b.C0094b bVar) {
        n nVar = new n();
        nVar.a().e(new i(bVar));
        return nVar;
    }

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final LocationAvailability a(k kVar) {
        s.b(kVar != null, "GoogleApiClient parameter is required.");
        try {
            return ((d2) kVar.o(r0.f5912m)).z0();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final o<Status> b(k kVar) {
        return kVar.m(new k(this, kVar));
    }

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final o<Status> c(k kVar, LocationRequest locationRequest, l lVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            s.m(looper, "invalid null looper");
        }
        return kVar.m(new m(this, kVar, g.a(lVar, looper, l.class.getSimpleName()), locationRequest));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r0 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    @d.w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.location.Location d(f8.k r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L_0x0006
            r2 = r1
            goto L_0x0007
        L_0x0006:
            r2 = r0
        L_0x0007:
            java.lang.String r3 = "GoogleApiClient parameter is required."
            j8.s.b(r2, r3)
            f8.a$g r2 = com.google.android.gms.internal.location.r0.f5912m
            f8.a$f r11 = r11.o(r2)
            com.google.android.gms.internal.location.d2 r11 = (com.google.android.gms.internal.location.d2) r11
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r1)
            h9.n r4 = new h9.n
            r4.<init>()
            r5 = 0
            com.google.android.gms.location.LastLocationRequest$a r6 = new com.google.android.gms.location.LastLocationRequest$a     // Catch:{ Exception -> 0x0078 }
            r6.<init>()     // Catch:{ Exception -> 0x0078 }
            com.google.android.gms.location.LastLocationRequest r6 = r6.a()     // Catch:{ Exception -> 0x0078 }
            r11.D0(r6, r4)     // Catch:{ Exception -> 0x0078 }
            h9.m r11 = r4.a()
            com.google.android.gms.internal.location.j r4 = new com.google.android.gms.internal.location.j
            r4.<init>(r2, r3)
            r11.e(r4)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r6 = 30
            long r6 = r11.toNanos(r6)     // Catch:{ all -> 0x0062 }
            long r8 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0062 }
            long r8 = r8 + r6
        L_0x0049:
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x0064 }
            boolean r11 = r3.await(r6, r11)     // Catch:{ InterruptedException -> 0x0064 }
            if (r0 == 0) goto L_0x0058
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0058:
            if (r11 == 0) goto L_0x0061
            java.lang.Object r11 = r2.get()
            android.location.Location r11 = (android.location.Location) r11
            return r11
        L_0x0061:
            return r5
        L_0x0062:
            r11 = move-exception
            goto L_0x006e
        L_0x0064:
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x006c }
            long r6 = r8 - r6
            r0 = r1
            goto L_0x0049
        L_0x006c:
            r11 = move-exception
            r0 = r1
        L_0x006e:
            if (r0 == 0) goto L_0x0077
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0077:
            throw r11
        L_0x0078:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.v.d(f8.k):android.location.Location");
    }

    public final o<Status> e(k kVar, m mVar) {
        return kVar.m(new o(this, kVar, mVar));
    }

    public final o<Status> f(k kVar, l lVar) {
        return kVar.m(new q(this, kVar, lVar));
    }

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final o<Status> g(k kVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return kVar.m(new n(this, kVar, pendingIntent, locationRequest));
    }

    public final o<Status> h(k kVar, Location location) {
        return kVar.m(new s(this, kVar, location));
    }

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final o<Status> i(k kVar, LocationRequest locationRequest, m mVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            s.m(looper, "invalid null looper");
        }
        return kVar.m(new l(this, kVar, g.a(mVar, looper, m.class.getSimpleName()), locationRequest));
    }

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final o<Status> j(k kVar, LocationRequest locationRequest, m mVar) {
        Looper myLooper = Looper.myLooper();
        s.m(myLooper, "invalid null looper");
        return kVar.m(new l(this, kVar, g.a(mVar, myLooper, m.class.getSimpleName()), locationRequest));
    }

    public final o<Status> k(k kVar, PendingIntent pendingIntent) {
        return kVar.m(new p(this, kVar, pendingIntent));
    }

    public final o<Status> l(k kVar, boolean z10) {
        return kVar.m(new r(this, kVar, z10));
    }
}
