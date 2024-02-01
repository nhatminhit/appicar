package u0;

import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import d.m0;
import d.o0;
import d.t;
import d.t0;
import d.w0;
import d.z;
import e1.n;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import u0.a;
import x0.c;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final long f13390a = 30000;

    /* renamed from: b  reason: collision with root package name */
    public static final long f13391b = 10000;

    /* renamed from: c  reason: collision with root package name */
    public static final long f13392c = 5;

    /* renamed from: d  reason: collision with root package name */
    public static Field f13393d;
    @z("sGnssStatusListeners")

    /* renamed from: e  reason: collision with root package name */
    public static final androidx.collection.i<Object, Object> f13394e = new androidx.collection.i<>();

    public class a implements Runnable {
        public final /* synthetic */ e1.c O;
        public final /* synthetic */ Location P;

        public a(e1.c cVar, Location location) {
            this.O = cVar;
            this.P = location;
        }

        public void run() {
            this.O.accept(this.P);
        }
    }

    public class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f13395a;

        public b(f fVar) {
            this.f13395a = fVar;
        }

        @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onCancel() {
            this.f13395a.a();
        }
    }

    public class c implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocationManager f13396a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f13397b;

        public c(LocationManager locationManager, h hVar) {
            this.f13396a = locationManager;
            this.f13397b = hVar;
        }

        @w0("android.permission.ACCESS_FINE_LOCATION")
        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(this.f13396a.addGpsStatusListener(this.f13397b));
        }
    }

    @t0(28)
    public static class d {
        @t
        public static String a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @t
        public static int b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @t
        public static boolean c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    @t0(30)
    public static class e {

        public class a implements Consumer<Location> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ e1.c f13398a;

            public a(e1.c cVar) {
                this.f13398a = cVar;
            }

            /* renamed from: a */
            public void accept(Location location) {
                this.f13398a.accept(location);
            }
        }

        @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @t
        public static void a(LocationManager locationManager, @m0 String str, @o0 x0.c cVar, @m0 Executor executor, @m0 e1.c<Location> cVar2) {
            locationManager.getCurrentLocation(str, cVar != null ? (CancellationSignal) cVar.b() : null, executor, new a(cVar2));
        }
    }

    public static final class f implements LocationListener {
        public final LocationManager O;
        public final Executor P;
        public final Handler Q = new Handler(Looper.getMainLooper());
        public e1.c<Location> R;
        @z("this")
        public boolean S;
        @o0
        public Runnable T;

        public class a implements Runnable {
            public a() {
            }

            @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
            public void run() {
                f fVar = f.this;
                fVar.T = null;
                fVar.onLocationChanged((Location) null);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ e1.c O;
            public final /* synthetic */ Location P;

            public b(e1.c cVar, Location location) {
                this.O = cVar;
                this.P = location;
            }

            public void run() {
                this.O.accept(this.P);
            }
        }

        public f(LocationManager locationManager, Executor executor, e1.c<Location> cVar) {
            this.O = locationManager;
            this.P = executor;
            this.R = cVar;
        }

        @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void a() {
            synchronized (this) {
                if (!this.S) {
                    this.S = true;
                    b();
                }
            }
        }

        @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public final void b() {
            this.R = null;
            this.O.removeUpdates(this);
            Runnable runnable = this.T;
            if (runnable != null) {
                this.Q.removeCallbacks(runnable);
                this.T = null;
            }
        }

        public void c(long j10) {
            synchronized (this) {
                if (!this.S) {
                    a aVar = new a();
                    this.T = aVar;
                    this.Q.postDelayed(aVar, j10);
                }
            }
        }

        @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@o0 Location location) {
            synchronized (this) {
                if (!this.S) {
                    this.S = true;
                    this.P.execute(new b(this.R, location));
                    b();
                }
            }
        }

        @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@m0 String str) {
            onLocationChanged((Location) null);
        }

        public void onProviderEnabled(@m0 String str) {
        }

        public void onStatusChanged(String str, int i10, Bundle bundle) {
        }
    }

    @t0(30)
    public static class g extends GnssStatus.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0221a f13399a;

        public g(a.C0221a aVar) {
            n.b(aVar != null, "invalid null callback");
            this.f13399a = aVar;
        }

        public void onFirstFix(int i10) {
            this.f13399a.a(i10);
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f13399a.b(a.n(gnssStatus));
        }

        public void onStarted() {
            this.f13399a.c();
        }

        public void onStopped() {
            this.f13399a.d();
        }
    }

    public static class h implements GpsStatus.Listener {

        /* renamed from: a  reason: collision with root package name */
        public final LocationManager f13400a;

        /* renamed from: b  reason: collision with root package name */
        public final a.C0221a f13401b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public volatile Executor f13402c;

        public class a implements Runnable {
            public final /* synthetic */ Executor O;

            public a(Executor executor) {
                this.O = executor;
            }

            public void run() {
                if (h.this.f13402c == this.O) {
                    h.this.f13401b.c();
                }
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ Executor O;

            public b(Executor executor) {
                this.O = executor;
            }

            public void run() {
                if (h.this.f13402c == this.O) {
                    h.this.f13401b.d();
                }
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ Executor O;
            public final /* synthetic */ int P;

            public c(Executor executor, int i10) {
                this.O = executor;
                this.P = i10;
            }

            public void run() {
                if (h.this.f13402c == this.O) {
                    h.this.f13401b.a(this.P);
                }
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ Executor O;
            public final /* synthetic */ a P;

            public d(Executor executor, a aVar) {
                this.O = executor;
                this.P = aVar;
            }

            public void run() {
                if (h.this.f13402c == this.O) {
                    h.this.f13401b.b(this.P);
                }
            }
        }

        public h(LocationManager locationManager, a.C0221a aVar) {
            n.b(aVar != null, "invalid null callback");
            this.f13400a = locationManager;
            this.f13401b = aVar;
        }

        public void a(Executor executor) {
            n.i(this.f13402c == null);
            this.f13402c = executor;
        }

        public void b() {
            this.f13402c = null;
        }

        @w0("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i10) {
            Runnable runnable;
            Runnable runnable2;
            GpsStatus gpsStatus;
            Executor executor = this.f13402c;
            if (executor != null) {
                if (i10 == 1) {
                    runnable = new a(executor);
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        GpsStatus gpsStatus2 = this.f13400a.getGpsStatus((GpsStatus) null);
                        if (gpsStatus2 != null) {
                            runnable2 = new c(executor, gpsStatus2.getTimeToFirstFix());
                        } else {
                            return;
                        }
                    } else if (i10 == 4 && (gpsStatus = this.f13400a.getGpsStatus((GpsStatus) null)) != null) {
                        runnable2 = new d(executor, a.o(gpsStatus));
                    } else {
                        return;
                    }
                    executor.execute(runnable2);
                    return;
                } else {
                    runnable = new b(executor);
                }
                executor.execute(runnable);
            }
        }
    }

    public static final class i implements Executor {
        public final Handler O;

        public i(@m0 Handler handler) {
            this.O = (Handler) n.g(handler);
        }

        public void execute(@m0 Runnable runnable) {
            if (Looper.myLooper() == this.O.getLooper()) {
                runnable.run();
            } else if (!this.O.post((Runnable) n.g(runnable))) {
                throw new RejectedExecutionException(this.O + " is shutting down");
            }
        }
    }

    @t0(24)
    public static class j extends GnssStatus.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0221a f13403a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public volatile Executor f13404b;

        public class a implements Runnable {
            public final /* synthetic */ Executor O;

            public a(Executor executor) {
                this.O = executor;
            }

            public void run() {
                if (j.this.f13404b == this.O) {
                    j.this.f13403a.c();
                }
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ Executor O;

            public b(Executor executor) {
                this.O = executor;
            }

            public void run() {
                if (j.this.f13404b == this.O) {
                    j.this.f13403a.d();
                }
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ Executor O;
            public final /* synthetic */ int P;

            public c(Executor executor, int i10) {
                this.O = executor;
                this.P = i10;
            }

            public void run() {
                if (j.this.f13404b == this.O) {
                    j.this.f13403a.a(this.P);
                }
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ Executor O;
            public final /* synthetic */ GnssStatus P;

            public d(Executor executor, GnssStatus gnssStatus) {
                this.O = executor;
                this.P = gnssStatus;
            }

            public void run() {
                if (j.this.f13404b == this.O) {
                    j.this.f13403a.b(a.n(this.P));
                }
            }
        }

        public j(a.C0221a aVar) {
            n.b(aVar != null, "invalid null callback");
            this.f13403a = aVar;
        }

        public void a(Executor executor) {
            boolean z10 = true;
            n.b(executor != null, "invalid null executor");
            if (this.f13404b != null) {
                z10 = false;
            }
            n.i(z10);
            this.f13404b = executor;
        }

        public void b() {
            this.f13404b = null;
        }

        public void onFirstFix(int i10) {
            Executor executor = this.f13404b;
            if (executor != null) {
                executor.execute(new c(executor, i10));
            }
        }

        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            Executor executor = this.f13404b;
            if (executor != null) {
                executor.execute(new d(executor, gnssStatus));
            }
        }

        public void onStarted() {
            Executor executor = this.f13404b;
            if (executor != null) {
                executor.execute(new a(executor));
            }
        }

        public void onStopped() {
            Executor executor = this.f13404b;
            if (executor != null) {
                executor.execute(new b(executor));
            }
        }
    }

    @w0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void a(@m0 LocationManager locationManager, @m0 String str, @o0 x0.c cVar, @m0 Executor executor, @m0 e1.c<Location> cVar2) {
        if (Build.VERSION.SDK_INT >= 30) {
            e.a(locationManager, str, cVar, executor, cVar2);
            return;
        }
        if (cVar != null) {
            cVar.e();
        }
        Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation == null || SystemClock.elapsedRealtime() - h.a(lastKnownLocation) >= 10000) {
            f fVar = new f(locationManager, executor, cVar2);
            locationManager.requestLocationUpdates(str, 0, 0.0f, fVar, Looper.getMainLooper());
            if (cVar != null) {
                cVar.d(new b(fVar));
            }
            fVar.c(f13390a);
            return;
        }
        executor.execute(new a(cVar2, lastKnownLocation));
    }

    @o0
    public static String b(@m0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(locationManager);
        }
        return null;
    }

    public static int c(@m0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.b(locationManager);
        }
        return 0;
    }

    public static boolean d(@m0 LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? d.c(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c3, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ce, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x00d8 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0129 A[SYNTHETIC, Splitter:B:103:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x010a A[Catch:{ ExecutionException -> 0x0100, TimeoutException -> 0x00e7, all -> 0x00e4, all -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011f A[Catch:{ ExecutionException -> 0x0100, TimeoutException -> 0x00e7, all -> 0x00e4, all -> 0x0126 }] */
    @d.w0("android.permission.ACCESS_FINE_LOCATION")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e(android.location.LocationManager r9, android.os.Handler r10, java.util.concurrent.Executor r11, u0.a.C0221a r12) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 30
            if (r0 < r3) goto L_0x0028
            androidx.collection.i<java.lang.Object, java.lang.Object> r3 = f13394e
            monitor-enter(r3)
            java.lang.Object r10 = r3.get(r12)     // Catch:{ all -> 0x0025 }
            u0.m$g r10 = (u0.m.g) r10     // Catch:{ all -> 0x0025 }
            if (r10 != 0) goto L_0x0018
            u0.m$g r10 = new u0.m$g     // Catch:{ all -> 0x0025 }
            r10.<init>(r12)     // Catch:{ all -> 0x0025 }
        L_0x0018:
            boolean r9 = r9.registerGnssStatusCallback(r11, r10)     // Catch:{ all -> 0x0025 }
            if (r9 == 0) goto L_0x0023
            r3.put(r12, r10)     // Catch:{ all -> 0x0025 }
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r1
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0025:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r9
        L_0x0028:
            r3 = 24
            if (r0 < r3) goto L_0x005b
            if (r10 == 0) goto L_0x0030
            r0 = r1
            goto L_0x0031
        L_0x0030:
            r0 = r2
        L_0x0031:
            e1.n.a(r0)
            androidx.collection.i<java.lang.Object, java.lang.Object> r0 = f13394e
            monitor-enter(r0)
            java.lang.Object r3 = r0.get(r12)     // Catch:{ all -> 0x0058 }
            u0.m$j r3 = (u0.m.j) r3     // Catch:{ all -> 0x0058 }
            if (r3 != 0) goto L_0x0045
            u0.m$j r3 = new u0.m$j     // Catch:{ all -> 0x0058 }
            r3.<init>(r12)     // Catch:{ all -> 0x0058 }
            goto L_0x0048
        L_0x0045:
            r3.b()     // Catch:{ all -> 0x0058 }
        L_0x0048:
            r3.a(r11)     // Catch:{ all -> 0x0058 }
            boolean r9 = r9.registerGnssStatusCallback(r3, r10)     // Catch:{ all -> 0x0058 }
            if (r9 == 0) goto L_0x0056
            r0.put(r12, r3)     // Catch:{ all -> 0x0058 }
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return r1
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return r2
        L_0x0058:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r9
        L_0x005b:
            if (r10 == 0) goto L_0x005f
            r0 = r1
            goto L_0x0060
        L_0x005f:
            r0 = r2
        L_0x0060:
            e1.n.a(r0)
            androidx.collection.i<java.lang.Object, java.lang.Object> r0 = f13394e
            monitor-enter(r0)
            java.lang.Object r3 = r0.get(r12)     // Catch:{ all -> 0x0148 }
            u0.m$h r3 = (u0.m.h) r3     // Catch:{ all -> 0x0148 }
            if (r3 != 0) goto L_0x0074
            u0.m$h r3 = new u0.m$h     // Catch:{ all -> 0x0148 }
            r3.<init>(r9, r12)     // Catch:{ all -> 0x0148 }
            goto L_0x0077
        L_0x0074:
            r3.b()     // Catch:{ all -> 0x0148 }
        L_0x0077:
            r3.a(r11)     // Catch:{ all -> 0x0148 }
            java.util.concurrent.FutureTask r11 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0148 }
            u0.m$c r4 = new u0.m$c     // Catch:{ all -> 0x0148 }
            r4.<init>(r9, r3)     // Catch:{ all -> 0x0148 }
            r11.<init>(r4)     // Catch:{ all -> 0x0148 }
            android.os.Looper r9 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0148 }
            android.os.Looper r4 = r10.getLooper()     // Catch:{ all -> 0x0148 }
            if (r9 != r4) goto L_0x0092
            r11.run()     // Catch:{ all -> 0x0148 }
            goto L_0x0098
        L_0x0092:
            boolean r9 = r10.post(r11)     // Catch:{ all -> 0x0148 }
            if (r9 == 0) goto L_0x0131
        L_0x0098:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x0100, TimeoutException -> 0x00e7, all -> 0x00e4 }
            r4 = 5
            long r4 = r9.toNanos(r4)     // Catch:{ ExecutionException -> 0x0100, TimeoutException -> 0x00e7, all -> 0x00e4 }
            long r6 = java.lang.System.nanoTime()     // Catch:{ ExecutionException -> 0x0100, TimeoutException -> 0x00e7, all -> 0x00e4 }
            long r6 = r6 + r4
            r9 = r2
        L_0x00a6:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x00d8, ExecutionException -> 0x00d5, TimeoutException -> 0x00d2, all -> 0x00cf }
            java.lang.Object r4 = r11.get(r4, r8)     // Catch:{ InterruptedException -> 0x00d8, ExecutionException -> 0x00d5, TimeoutException -> 0x00d2, all -> 0x00cf }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ InterruptedException -> 0x00d8, ExecutionException -> 0x00d5, TimeoutException -> 0x00d2, all -> 0x00cf }
            boolean r4 = r4.booleanValue()     // Catch:{ InterruptedException -> 0x00d8, ExecutionException -> 0x00d5, TimeoutException -> 0x00d2, all -> 0x00cf }
            if (r4 == 0) goto L_0x00c4
            androidx.collection.i<java.lang.Object, java.lang.Object> r4 = f13394e     // Catch:{ InterruptedException -> 0x00d8, ExecutionException -> 0x00d5, TimeoutException -> 0x00d2, all -> 0x00cf }
            r4.put(r12, r3)     // Catch:{ InterruptedException -> 0x00d8, ExecutionException -> 0x00d5, TimeoutException -> 0x00d2, all -> 0x00cf }
            if (r9 == 0) goto L_0x00c2
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0148 }
            r9.interrupt()     // Catch:{ all -> 0x0148 }
        L_0x00c2:
            monitor-exit(r0)     // Catch:{ all -> 0x0148 }
            return r1
        L_0x00c4:
            if (r9 == 0) goto L_0x00cd
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0148 }
            r9.interrupt()     // Catch:{ all -> 0x0148 }
        L_0x00cd:
            monitor-exit(r0)     // Catch:{ all -> 0x0148 }
            return r2
        L_0x00cf:
            r10 = move-exception
            r1 = r9
            goto L_0x0127
        L_0x00d2:
            r11 = move-exception
            r1 = r9
            goto L_0x00e9
        L_0x00d5:
            r10 = move-exception
            r1 = r9
            goto L_0x0102
        L_0x00d8:
            long r4 = java.lang.System.nanoTime()     // Catch:{ ExecutionException -> 0x00e2, TimeoutException -> 0x00e0 }
            long r4 = r6 - r4
            r9 = r1
            goto L_0x00a6
        L_0x00e0:
            r11 = move-exception
            goto L_0x00e9
        L_0x00e2:
            r10 = move-exception
            goto L_0x0102
        L_0x00e4:
            r10 = move-exception
            r1 = r2
            goto L_0x0127
        L_0x00e7:
            r11 = move-exception
            r1 = r2
        L_0x00e9:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0126 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0126 }
            r12.<init>()     // Catch:{ all -> 0x0126 }
            r12.append(r10)     // Catch:{ all -> 0x0126 }
            java.lang.String r10 = " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread"
            r12.append(r10)     // Catch:{ all -> 0x0126 }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x0126 }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0126 }
            throw r9     // Catch:{ all -> 0x0126 }
        L_0x0100:
            r10 = move-exception
            r1 = r2
        L_0x0102:
            java.lang.Throwable r9 = r10.getCause()     // Catch:{ all -> 0x0126 }
            boolean r9 = r9 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0126 }
            if (r9 != 0) goto L_0x011f
            java.lang.Throwable r9 = r10.getCause()     // Catch:{ all -> 0x0126 }
            boolean r9 = r9 instanceof java.lang.Error     // Catch:{ all -> 0x0126 }
            if (r9 == 0) goto L_0x0119
            java.lang.Throwable r9 = r10.getCause()     // Catch:{ all -> 0x0126 }
            java.lang.Error r9 = (java.lang.Error) r9     // Catch:{ all -> 0x0126 }
            throw r9     // Catch:{ all -> 0x0126 }
        L_0x0119:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0126 }
            r9.<init>(r10)     // Catch:{ all -> 0x0126 }
            throw r9     // Catch:{ all -> 0x0126 }
        L_0x011f:
            java.lang.Throwable r9 = r10.getCause()     // Catch:{ all -> 0x0126 }
            java.lang.RuntimeException r9 = (java.lang.RuntimeException) r9     // Catch:{ all -> 0x0126 }
            throw r9     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r10 = move-exception
        L_0x0127:
            if (r1 == 0) goto L_0x0130
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0148 }
            r9.interrupt()     // Catch:{ all -> 0x0148 }
        L_0x0130:
            throw r10     // Catch:{ all -> 0x0148 }
        L_0x0131:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0148 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0148 }
            r11.<init>()     // Catch:{ all -> 0x0148 }
            r11.append(r10)     // Catch:{ all -> 0x0148 }
            java.lang.String r10 = " is shutting down"
            r11.append(r10)     // Catch:{ all -> 0x0148 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x0148 }
            r9.<init>(r10)     // Catch:{ all -> 0x0148 }
            throw r9     // Catch:{ all -> 0x0148 }
        L_0x0148:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0148 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.m.e(android.location.LocationManager, android.os.Handler, java.util.concurrent.Executor, u0.a$a):boolean");
    }

    @w0("android.permission.ACCESS_FINE_LOCATION")
    public static boolean f(@m0 LocationManager locationManager, @m0 Executor executor, @m0 a.C0221a aVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            return e(locationManager, (Handler) null, executor, aVar);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return e(locationManager, new Handler(myLooper), executor, aVar);
    }

    @w0("android.permission.ACCESS_FINE_LOCATION")
    public static boolean g(@m0 LocationManager locationManager, @m0 a.C0221a aVar, @m0 Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? f(locationManager, x0.f.a(handler), aVar) : f(locationManager, new i(handler), aVar);
    }

    public static void h(@m0 LocationManager locationManager, @m0 a.C0221a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            androidx.collection.i<Object, Object> iVar = f13394e;
            synchronized (iVar) {
                g gVar = (g) iVar.remove(aVar);
                if (gVar != null) {
                    locationManager.unregisterGnssStatusCallback(gVar);
                }
            }
        } else if (i10 >= 24) {
            androidx.collection.i<Object, Object> iVar2 = f13394e;
            synchronized (iVar2) {
                j jVar = (j) iVar2.remove(aVar);
                if (jVar != null) {
                    jVar.b();
                    locationManager.unregisterGnssStatusCallback(jVar);
                }
            }
        } else {
            androidx.collection.i<Object, Object> iVar3 = f13394e;
            synchronized (iVar3) {
                h hVar = (h) iVar3.remove(aVar);
                if (hVar != null) {
                    hVar.b();
                    locationManager.removeGpsStatusListener(hVar);
                }
            }
        }
    }
}
