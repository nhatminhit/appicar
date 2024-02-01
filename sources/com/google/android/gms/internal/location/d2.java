package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.collection.i;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import d9.p0;
import g8.d;
import g8.j;
import h9.a;
import h9.n;
import j8.e;
import j8.h;
import j8.l;
import j8.s;
import java.util.List;

public final class d2 extends h {
    public static final /* synthetic */ int F0 = 0;
    public final i C0 = new i();
    public final i D0 = new i();
    public final i E0 = new i();

    public d2(Context context, Looper looper, e eVar, d dVar, j jVar) {
        super(context, looper, 23, eVar, dVar, jVar);
    }

    public final /* synthetic */ IInterface A(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof g3 ? (g3) queryLocalInterface : new f3(iBinder);
    }

    public final void A0(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, n nVar) throws RemoteException {
        s.m(geofencingRequest, "geofencingRequest can't be null.");
        s.m(pendingIntent, "PendingIntent must be specified.");
        ((g3) M()).u1(geofencingRequest, pendingIntent, new l1(nVar));
    }

    public final void B0(n nVar) throws RemoteException {
        ((g3) M()).P1(new q1((Object) null, nVar));
    }

    public final void C0(CurrentLocationRequest currentLocationRequest, a aVar, n nVar) throws RemoteException {
        G();
        if (y0(p0.f6710e)) {
            l q12 = ((g3) M()).q1(currentLocationRequest, new p1(this, nVar));
            if (aVar != null) {
                aVar.b(new i1(q12));
                return;
            }
            return;
        }
        f b10 = g.b(new m1(this, nVar), w2.a(), "GetCurrentLocation");
        f.a b11 = b10.b();
        b11.getClass();
        n1 n1Var = new n1(this, b10, nVar);
        n nVar2 = new n();
        LocationRequest.a aVar2 = new LocationRequest.a(currentLocationRequest.g1(), 0);
        aVar2.i(0);
        aVar2.b(currentLocationRequest.X0());
        aVar2.c(currentLocationRequest.Z0());
        aVar2.e(currentLocationRequest.f1());
        aVar2.l(currentLocationRequest.A1());
        aVar2.n(currentLocationRequest.h1());
        aVar2.k(true);
        aVar2.m(currentLocationRequest.r1());
        aVar2.o(currentLocationRequest.m1());
        E0(n1Var, aVar2.a(), nVar2);
        nVar2.a().e(new j1(nVar));
        if (aVar != null) {
            aVar.b(new k1(this, b11));
        }
    }

    public final Feature[] D() {
        return p0.f6717l;
    }

    public final void D0(LastLocationRequest lastLocationRequest, n nVar) throws RemoteException {
        G();
        if (y0(p0.f6711f)) {
            ((g3) M()).f0(lastLocationRequest, new p1(this, nVar));
        } else {
            nVar.c(((g3) M()).c());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E0(com.google.android.gms.internal.location.v1 r18, com.google.android.gms.location.LocationRequest r19, h9.n r20) throws android.os.RemoteException {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.f r3 = r18.b()
            com.google.android.gms.common.api.internal.f$a r4 = r3.b()
            r4.getClass()
            com.google.android.gms.common.Feature r5 = d9.p0.f6715j
            boolean r5 = r1.y0(r5)
            androidx.collection.i r6 = r1.D0
            monitor-enter(r6)
            androidx.collection.i r7 = r1.D0     // Catch:{ all -> 0x0082 }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.z1 r7 = (com.google.android.gms.internal.location.z1) r7     // Catch:{ all -> 0x0082 }
            r8 = 0
            if (r7 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            r7.b0(r3)     // Catch:{ all -> 0x0082 }
            r13 = r7
            r7 = r8
            goto L_0x003b
        L_0x002e:
            com.google.android.gms.internal.location.z1 r3 = new com.google.android.gms.internal.location.z1     // Catch:{ all -> 0x0082 }
            r9 = r18
            r3.<init>(r9)     // Catch:{ all -> 0x0082 }
            androidx.collection.i r9 = r1.D0     // Catch:{ all -> 0x0082 }
            r9.put(r4, r3)     // Catch:{ all -> 0x0082 }
            r13 = r3
        L_0x003b:
            r17.G()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r4.a()     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x0057
            android.os.IInterface r4 = r17.M()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.g3 r4 = (com.google.android.gms.internal.location.g3) r4     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.zzdb r3 = com.google.android.gms.internal.location.zzdb.Z0(r7, r13, r8, r3)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.o1 r5 = new com.google.android.gms.internal.location.o1     // Catch:{ all -> 0x0082 }
            r5.<init>(r1, r8, r2)     // Catch:{ all -> 0x0082 }
            r4.N1(r3, r0, r5)     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x0057:
            android.os.IInterface r4 = r17.M()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.g3 r4 = (com.google.android.gms.internal.location.g3) r4     // Catch:{ all -> 0x0082 }
            com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a     // Catch:{ all -> 0x0082 }
            r5.<init>((com.google.android.gms.location.LocationRequest) r0)     // Catch:{ all -> 0x0082 }
            r5.m(r8)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.location.LocationRequest r0 = r5.a()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.zzdd r11 = com.google.android.gms.internal.location.zzdd.X0(r8, r0)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.s1 r15 = new com.google.android.gms.internal.location.s1     // Catch:{ all -> 0x0082 }
            r15.<init>(r2, r13)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.zzdf r0 = new com.google.android.gms.internal.location.zzdf     // Catch:{ all -> 0x0082 }
            r10 = 1
            r12 = 0
            r14 = 0
            r9 = r0
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0082 }
            r4.k0(r0)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            return
        L_0x0082:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.d2.E0(com.google.android.gms.internal.location.v1, com.google.android.gms.location.LocationRequest, h9.n):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F0(com.google.android.gms.internal.location.v1 r18, com.google.android.gms.location.LocationRequest r19, h9.n r20) throws android.os.RemoteException {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.f r3 = r18.b()
            com.google.android.gms.common.api.internal.f$a r4 = r3.b()
            r4.getClass()
            com.google.android.gms.common.Feature r5 = d9.p0.f6715j
            boolean r5 = r1.y0(r5)
            androidx.collection.i r6 = r1.C0
            monitor-enter(r6)
            androidx.collection.i r7 = r1.C0     // Catch:{ all -> 0x0082 }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.c2 r7 = (com.google.android.gms.internal.location.c2) r7     // Catch:{ all -> 0x0082 }
            r8 = 0
            if (r7 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            r7.b0(r3)     // Catch:{ all -> 0x0082 }
            r12 = r7
            r7 = r8
            goto L_0x003b
        L_0x002e:
            com.google.android.gms.internal.location.c2 r3 = new com.google.android.gms.internal.location.c2     // Catch:{ all -> 0x0082 }
            r9 = r18
            r3.<init>(r9)     // Catch:{ all -> 0x0082 }
            androidx.collection.i r9 = r1.C0     // Catch:{ all -> 0x0082 }
            r9.put(r4, r3)     // Catch:{ all -> 0x0082 }
            r12 = r3
        L_0x003b:
            r17.G()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r4.a()     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x0057
            android.os.IInterface r4 = r17.M()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.g3 r4 = (com.google.android.gms.internal.location.g3) r4     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.zzdb r3 = com.google.android.gms.internal.location.zzdb.f1(r7, r12, r8, r3)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.o1 r5 = new com.google.android.gms.internal.location.o1     // Catch:{ all -> 0x0082 }
            r5.<init>(r1, r8, r2)     // Catch:{ all -> 0x0082 }
            r4.N1(r3, r0, r5)     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x0057:
            android.os.IInterface r4 = r17.M()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.g3 r4 = (com.google.android.gms.internal.location.g3) r4     // Catch:{ all -> 0x0082 }
            com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a     // Catch:{ all -> 0x0082 }
            r5.<init>((com.google.android.gms.location.LocationRequest) r0)     // Catch:{ all -> 0x0082 }
            r5.m(r8)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.location.LocationRequest r0 = r5.a()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.zzdd r11 = com.google.android.gms.internal.location.zzdd.X0(r8, r0)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.r1 r15 = new com.google.android.gms.internal.location.r1     // Catch:{ all -> 0x0082 }
            r15.<init>(r2, r12)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.location.zzdf r0 = new com.google.android.gms.internal.location.zzdf     // Catch:{ all -> 0x0082 }
            r10 = 1
            r13 = 0
            r14 = 0
            r9 = r0
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0082 }
            r4.k0(r0)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            return
        L_0x0082:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.d2.F0(com.google.android.gms.internal.location.v1, com.google.android.gms.location.LocationRequest, h9.n):void");
    }

    public final void G0(PendingIntent pendingIntent, LocationRequest locationRequest, n nVar) throws RemoteException {
        G();
        if (y0(p0.f6715j)) {
            ((g3) M()).N1(zzdb.X0(pendingIntent, (String) null, (String) null), locationRequest, new o1(this, (Object) null, nVar));
            return;
        }
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        aVar.m((String) null);
        zzdd X0 = zzdd.X0((String) null, aVar.a());
        q1 q1Var = new q1((Object) null, nVar);
        int hashCode = pendingIntent.hashCode();
        ((g3) M()).k0(new zzdf(1, X0, (IBinder) null, (IBinder) null, pendingIntent, q1Var, "PendingIntent@" + hashCode));
    }

    public final void H0(PendingIntent pendingIntent, n nVar) throws RemoteException {
        s.m(pendingIntent, "PendingIntent must be specified.");
        ((g3) M()).c1(pendingIntent, new l1(nVar), G().getPackageName());
    }

    public final void I0(List list, n nVar) throws RemoteException {
        s.b(list != null && !list.isEmpty(), "geofenceRequestIds can't be null nor empty.");
        ((g3) M()).K1((String[]) list.toArray(new String[0]), new l1(nVar), G().getPackageName());
    }

    public final void J0(Location location, n nVar) throws RemoteException {
        if (y0(p0.f6713h)) {
            ((g3) M()).j1(location, new o1(this, (Object) null, nVar));
            return;
        }
        ((g3) M()).U(location);
        nVar.c(null);
    }

    public final String N() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String O() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final void V(int i10) {
        super.V(i10);
        synchronized (this.C0) {
            this.C0.clear();
        }
        synchronized (this.D0) {
            this.D0.clear();
        }
        synchronized (this.E0) {
            this.E0.clear();
        }
    }

    public final boolean a0() {
        return true;
    }

    public final int p() {
        return 11717000;
    }

    public final void u0(boolean z10, n nVar) throws RemoteException {
        if (y0(p0.f6712g)) {
            ((g3) M()).u0(z10, new o1(this, (Object) null, nVar));
            return;
        }
        ((g3) M()).B1(z10);
        nVar.c(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v0(com.google.android.gms.common.api.internal.f.a r10, boolean r11, h9.n r12) throws android.os.RemoteException {
        /*
            r9 = this;
            androidx.collection.i r0 = r9.D0
            monitor-enter(r0)
            androidx.collection.i r1 = r9.D0     // Catch:{ all -> 0x005b }
            java.lang.Object r10 = r1.remove(r10)     // Catch:{ all -> 0x005b }
            r5 = r10
            com.google.android.gms.internal.location.z1 r5 = (com.google.android.gms.internal.location.z1) r5     // Catch:{ all -> 0x005b }
            if (r5 != 0) goto L_0x0015
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x005b }
            r12.c(r10)     // Catch:{ all -> 0x005b }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x0015:
            r5.Y1()     // Catch:{ all -> 0x005b }
            if (r11 == 0) goto L_0x0054
            com.google.android.gms.common.Feature r10 = d9.p0.f6715j     // Catch:{ all -> 0x005b }
            boolean r10 = r9.y0(r10)     // Catch:{ all -> 0x005b }
            if (r10 == 0) goto L_0x0038
            android.os.IInterface r10 = r9.M()     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.location.g3 r10 = (com.google.android.gms.internal.location.g3) r10     // Catch:{ all -> 0x005b }
            r11 = 0
            com.google.android.gms.internal.location.zzdb r11 = com.google.android.gms.internal.location.zzdb.Z0(r11, r5, r11, r11)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.location.o1 r2 = new com.google.android.gms.internal.location.o1     // Catch:{ all -> 0x005b }
            r2.<init>(r9, r1, r12)     // Catch:{ all -> 0x005b }
            r10.G0(r11, r2)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0038:
            android.os.IInterface r10 = r9.M()     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.location.g3 r10 = (com.google.android.gms.internal.location.g3) r10     // Catch:{ all -> 0x005b }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.location.q1 r7 = new com.google.android.gms.internal.location.q1     // Catch:{ all -> 0x005b }
            r7.<init>(r11, r12)     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.location.zzdf r11 = new com.google.android.gms.internal.location.zzdf     // Catch:{ all -> 0x005b }
            r2 = 2
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x005b }
            r10.k0(r11)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0054:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            r12.c(r10)     // Catch:{ all -> 0x005b }
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x005b:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.d2.v0(com.google.android.gms.common.api.internal.f$a, boolean, h9.n):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w0(com.google.android.gms.common.api.internal.f.a r10, boolean r11, h9.n r12) throws android.os.RemoteException {
        /*
            r9 = this;
            androidx.collection.i r0 = r9.C0
            monitor-enter(r0)
            androidx.collection.i r1 = r9.C0     // Catch:{ all -> 0x005b }
            java.lang.Object r10 = r1.remove(r10)     // Catch:{ all -> 0x005b }
            r4 = r10
            com.google.android.gms.internal.location.c2 r4 = (com.google.android.gms.internal.location.c2) r4     // Catch:{ all -> 0x005b }
            if (r4 != 0) goto L_0x0015
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x005b }
            r12.c(r10)     // Catch:{ all -> 0x005b }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x0015:
            r4.Y1()     // Catch:{ all -> 0x005b }
            if (r11 == 0) goto L_0x0054
            com.google.android.gms.common.Feature r10 = d9.p0.f6715j     // Catch:{ all -> 0x005b }
            boolean r10 = r9.y0(r10)     // Catch:{ all -> 0x005b }
            if (r10 == 0) goto L_0x0038
            android.os.IInterface r10 = r9.M()     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.location.g3 r10 = (com.google.android.gms.internal.location.g3) r10     // Catch:{ all -> 0x005b }
            r11 = 0
            com.google.android.gms.internal.location.zzdb r11 = com.google.android.gms.internal.location.zzdb.f1(r11, r4, r11, r11)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.location.o1 r2 = new com.google.android.gms.internal.location.o1     // Catch:{ all -> 0x005b }
            r2.<init>(r9, r1, r12)     // Catch:{ all -> 0x005b }
            r10.G0(r11, r2)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0038:
            android.os.IInterface r10 = r9.M()     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.location.g3 r10 = (com.google.android.gms.internal.location.g3) r10     // Catch:{ all -> 0x005b }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.location.q1 r7 = new com.google.android.gms.internal.location.q1     // Catch:{ all -> 0x005b }
            r7.<init>(r11, r12)     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.location.zzdf r11 = new com.google.android.gms.internal.location.zzdf     // Catch:{ all -> 0x005b }
            r2 = 2
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x005b }
            r10.k0(r11)     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x0054:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x005b }
            r12.c(r10)     // Catch:{ all -> 0x005b }
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x005b:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.d2.w0(com.google.android.gms.common.api.internal.f$a, boolean, h9.n):void");
    }

    public final void x0(PendingIntent pendingIntent, n nVar, Object obj) throws RemoteException {
        if (y0(p0.f6715j)) {
            ((g3) M()).G0(zzdb.X0(pendingIntent, (String) null, (String) null), new o1(this, (Object) null, nVar));
            return;
        }
        ((g3) M()).k0(new zzdf(2, (zzdd) null, (IBinder) null, (IBinder) null, pendingIntent, new q1((Object) null, nVar), (String) null));
    }

    public final boolean y0(Feature feature) {
        Feature feature2;
        Feature[] r10 = r();
        if (r10 == null) {
            return false;
        }
        int length = r10.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                feature2 = null;
                break;
            }
            feature2 = r10[i10];
            if (feature.X0().equals(feature2.X0())) {
                break;
            }
            i10++;
        }
        return feature2 != null && feature2.Z0() >= feature.Z0();
    }

    public final LocationAvailability z0() throws RemoteException {
        return ((g3) M()).o1(G().getPackageName());
    }
}
