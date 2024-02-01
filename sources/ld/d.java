package ld;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import ld.f;
import ld.i;

public class d {
    public static final long D = 180000;
    public static final int E = 1000;
    public static final int F = 1;
    public static final String G = "no peripheral address provided";
    public static final String H = "no valid peripheral provided";
    public static final String I = "no valid peripheral callback specified";
    public final ScanCallback A = new h();
    public final f.c0 B = new i();
    public final BroadcastReceiver C;
    @fh.g

    /* renamed from: a  reason: collision with root package name */
    public final Context f20585a;
    @fh.g

    /* renamed from: b  reason: collision with root package name */
    public final Handler f20586b;
    @fh.g

    /* renamed from: c  reason: collision with root package name */
    public final BluetoothAdapter f20587c;
    @fh.h

    /* renamed from: d  reason: collision with root package name */
    public BluetoothLeScanner f20588d;
    @fh.h

    /* renamed from: e  reason: collision with root package name */
    public BluetoothLeScanner f20589e;
    @fh.g

    /* renamed from: f  reason: collision with root package name */
    public final e f20590f;
    @fh.g

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, f> f20591g = new ConcurrentHashMap();
    @fh.g

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, f> f20592h = new ConcurrentHashMap();
    @fh.g

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, f> f20593i = new ConcurrentHashMap();
    @fh.g

    /* renamed from: j  reason: collision with root package name */
    public final List<String> f20594j = new ArrayList();
    @fh.g

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, i> f20595k = new ConcurrentHashMap();
    @fh.g

    /* renamed from: l  reason: collision with root package name */
    public String[] f20596l = new String[0];
    @fh.g

    /* renamed from: m  reason: collision with root package name */
    public final Handler f20597m = new Handler(Looper.getMainLooper());
    @fh.h

    /* renamed from: n  reason: collision with root package name */
    public Runnable f20598n;
    @fh.h

    /* renamed from: o  reason: collision with root package name */
    public Runnable f20599o;
    @fh.g

    /* renamed from: p  reason: collision with root package name */
    public final Object f20600p = new Object();
    @fh.h

    /* renamed from: q  reason: collision with root package name */
    public ScanCallback f20601q;
    @fh.h

    /* renamed from: r  reason: collision with root package name */
    public List<ScanFilter> f20602r;
    @fh.g

    /* renamed from: s  reason: collision with root package name */
    public ScanSettings f20603s;
    @fh.g

    /* renamed from: t  reason: collision with root package name */
    public final ScanSettings f20604t;
    @fh.g

    /* renamed from: u  reason: collision with root package name */
    public final Map<String, Integer> f20605u = new ConcurrentHashMap();

    /* renamed from: v  reason: collision with root package name */
    public boolean f20606v = false;
    @fh.h

    /* renamed from: w  reason: collision with root package name */
    public Runnable f20607w;
    @fh.g

    /* renamed from: x  reason: collision with root package name */
    public final Map<String, String> f20608x = new ConcurrentHashMap();

    /* renamed from: y  reason: collision with root package name */
    public final ScanCallback f20609y = new C0352d();

    /* renamed from: z  reason: collision with root package name */
    public final ScanCallback f20610z = new e();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            wh.b.b("popup hack completed", new Object[0]);
            d.this.f20587c.cancelDiscovery();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            wh.b.e("bluetooth turned off but no automatic disconnects happening, so doing it ourselves", new Object[0]);
            d.this.I();
            Runnable unused = d.this.f20607w = null;
        }
    }

    public class c extends BroadcastReceiver {

        public class a implements Runnable {
            public final /* synthetic */ int O;

            public a(int i10) {
                this.O = i10;
            }

            public void run() {
                d.this.f20590f.a(this.O);
            }
        }

        public c() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                d.this.f20586b.post(new a(intExtra));
                d.this.S(intExtra);
            }
        }
    }

    /* renamed from: ld.d$d  reason: collision with other inner class name */
    public class C0352d extends ScanCallback {
        public C0352d() {
        }

        public void onScanFailed(int i10) {
            d.this.f0(v.a(i10));
        }

        public void onScanResult(int i10, ScanResult scanResult) {
            synchronized (this) {
                String name = scanResult.getDevice().getName();
                if (name != null) {
                    for (String contains : d.this.f20596l) {
                        if (name.contains(contains)) {
                            d.this.g0(scanResult);
                            return;
                        }
                    }
                }
            }
        }
    }

    public class e extends ScanCallback {
        public e() {
        }

        public void onScanFailed(int i10) {
            d.this.f0(v.a(i10));
        }

        public void onScanResult(int i10, ScanResult scanResult) {
            synchronized (this) {
                d.this.g0(scanResult);
            }
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ ScanResult O;

        public f(ScanResult scanResult) {
            this.O = scanResult;
        }

        public void run() {
            if (d.this.W()) {
                f Q = d.this.Q(this.O.getDevice().getAddress());
                Q.P0(this.O.getDevice());
                d.this.f20590f.e(Q, this.O);
            }
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ v O;

        public g(v vVar) {
            this.O = vVar;
        }

        public void run() {
            wh.b.e("scan failed with error code %d (%s)", Integer.valueOf(this.O.O), this.O);
            d.this.f20590f.f(this.O);
        }
    }

    public class h extends ScanCallback {

        public class a implements Runnable {
            public final /* synthetic */ v O;

            public a(v vVar) {
                this.O = vVar;
            }

            public void run() {
                d.this.f20590f.f(this.O);
            }
        }

        public h() {
        }

        public void onScanFailed(int i10) {
            v a10 = v.a(i10);
            wh.b.e("autoConnect scan failed with error code %d (%s)", Integer.valueOf(i10), a10);
            BluetoothLeScanner unused = d.this.f20589e = null;
            d.this.f20586b.post(new a(a10));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0082, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onScanResult(int r4, android.bluetooth.le.ScanResult r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                ld.d r4 = ld.d.this     // Catch:{ all -> 0x0083 }
                boolean r4 = r4.T()     // Catch:{ all -> 0x0083 }
                if (r4 != 0) goto L_0x000b
                monitor-exit(r3)     // Catch:{ all -> 0x0083 }
                return
            L_0x000b:
                java.lang.String r4 = "peripheral with address '%s' found"
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0083 }
                r1 = 0
                android.bluetooth.BluetoothDevice r2 = r5.getDevice()     // Catch:{ all -> 0x0083 }
                java.lang.String r2 = r2.getAddress()     // Catch:{ all -> 0x0083 }
                r0[r1] = r2     // Catch:{ all -> 0x0083 }
                wh.b.b(r4, r0)     // Catch:{ all -> 0x0083 }
                ld.d r4 = ld.d.this     // Catch:{ all -> 0x0083 }
                r4.o0()     // Catch:{ all -> 0x0083 }
                android.bluetooth.BluetoothDevice r4 = r5.getDevice()     // Catch:{ all -> 0x0083 }
                java.lang.String r4 = r4.getAddress()     // Catch:{ all -> 0x0083 }
                ld.d r5 = ld.d.this     // Catch:{ all -> 0x0083 }
                java.util.Map r5 = r5.f20592h     // Catch:{ all -> 0x0083 }
                java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x0083 }
                ld.f r5 = (ld.f) r5     // Catch:{ all -> 0x0083 }
                ld.d r0 = ld.d.this     // Catch:{ all -> 0x0083 }
                java.util.Map r0 = r0.f20595k     // Catch:{ all -> 0x0083 }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0083 }
                ld.i r0 = (ld.i) r0     // Catch:{ all -> 0x0083 }
                ld.d r1 = ld.d.this     // Catch:{ all -> 0x0083 }
                java.util.List r1 = r1.f20594j     // Catch:{ all -> 0x0083 }
                r1.remove(r4)     // Catch:{ all -> 0x0083 }
                ld.d r1 = ld.d.this     // Catch:{ all -> 0x0083 }
                java.util.Map r1 = r1.f20595k     // Catch:{ all -> 0x0083 }
                r1.remove(r4)     // Catch:{ all -> 0x0083 }
                ld.d r1 = ld.d.this     // Catch:{ all -> 0x0083 }
                java.util.Map r1 = r1.f20592h     // Catch:{ all -> 0x0083 }
                r1.remove(r4)     // Catch:{ all -> 0x0083 }
                ld.d r1 = ld.d.this     // Catch:{ all -> 0x0083 }
                java.util.Map r1 = r1.f20593i     // Catch:{ all -> 0x0083 }
                r1.remove(r4)     // Catch:{ all -> 0x0083 }
                if (r5 == 0) goto L_0x0070
                if (r0 == 0) goto L_0x0070
                ld.d r4 = ld.d.this     // Catch:{ all -> 0x0083 }
                r4.O(r5, r0)     // Catch:{ all -> 0x0083 }
            L_0x0070:
                ld.d r4 = ld.d.this     // Catch:{ all -> 0x0083 }
                java.util.List r4 = r4.f20594j     // Catch:{ all -> 0x0083 }
                int r4 = r4.size()     // Catch:{ all -> 0x0083 }
                if (r4 <= 0) goto L_0x0081
                ld.d r4 = ld.d.this     // Catch:{ all -> 0x0083 }
                r4.Z()     // Catch:{ all -> 0x0083 }
            L_0x0081:
                monitor-exit(r3)     // Catch:{ all -> 0x0083 }
                return
            L_0x0083:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0083 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ld.d.h.onScanResult(int, android.bluetooth.le.ScanResult):void");
        }
    }

    public class i implements f.c0 {

        public class a implements Runnable {
            public final /* synthetic */ f O;

            public a(f fVar) {
                this.O = fVar;
            }

            public void run() {
                d.this.f20590f.b(this.O);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ f O;
            public final /* synthetic */ q P;

            public b(f fVar, q qVar) {
                this.O = fVar;
                this.P = qVar;
            }

            public void run() {
                d.this.f20590f.c(this.O, this.P);
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ f O;
            public final /* synthetic */ q P;

            public c(f fVar, q qVar) {
                this.O = fVar;
                this.P = qVar;
            }

            public void run() {
                d.this.f20590f.d(this.O, this.P);
            }
        }

        public i() {
        }

        public void a(@fh.g f fVar) {
            d.this.f20605u.remove(fVar.h0());
            d.this.f20592h.remove(fVar.h0());
            d.this.f20593i.remove(fVar.h0());
            d.this.f20591g.put(fVar.h0(), fVar);
            d.this.f20586b.post(new a(fVar));
        }

        public void b(@fh.g f fVar, @fh.g q qVar) {
            d.this.f20592h.remove(fVar.h0());
            d.this.f20593i.remove(fVar.h0());
            Integer num = (Integer) d.this.f20605u.get(fVar.h0());
            int intValue = num != null ? num.intValue() : 0;
            if (intValue >= 1 || qVar == q.CONNECTION_FAILED_ESTABLISHMENT) {
                wh.b.i("connection to '%s' (%s) failed", fVar.p0(), fVar.h0());
                d.this.f20605u.remove(fVar.h0());
                d.this.f20586b.post(new b(fVar, qVar));
                return;
            }
            wh.b.i("retrying connection to '%s' (%s)", fVar.p0(), fVar.h0());
            d.this.f20605u.put(fVar.h0(), Integer.valueOf(intValue + 1));
            d.this.f20592h.put(fVar.h0(), fVar);
            fVar.U();
        }

        public void c(@fh.g f fVar, @fh.g q qVar) {
            if (d.this.f20606v) {
                d.this.L();
                boolean unused = d.this.f20606v = false;
            }
            d.this.f20591g.remove(fVar.h0());
            d.this.f20592h.remove(fVar.h0());
            d.this.f20593i.remove(fVar.h0());
            d.this.f20605u.remove(fVar.h0());
            d.this.f20586b.post(new c(fVar, qVar));
        }

        @fh.h
        public String d(@fh.g f fVar) {
            return (String) d.this.f20608x.get(fVar.h0());
        }
    }

    public class j implements Runnable {
        public final /* synthetic */ f O;

        public j(f fVar) {
            this.O = fVar;
        }

        public void run() {
            d.this.f20590f.d(this.O, q.SUCCESS);
        }
    }

    public class k implements Runnable {

        public class a implements Runnable {
            public final /* synthetic */ ScanCallback O;
            public final /* synthetic */ List P;

            public a(ScanCallback scanCallback, List list) {
                this.O = scanCallback;
                this.P = list;
            }

            public void run() {
                if (this.O != null) {
                    d dVar = d.this;
                    dVar.n0(this.P, dVar.f20603s, this.O);
                }
            }
        }

        public k() {
        }

        public void run() {
            wh.b.b("scanning timeout, restarting scan", new Object[0]);
            ScanCallback m10 = d.this.f20601q;
            List n10 = d.this.f20602r;
            d.this.p0();
            d.this.f20586b.postDelayed(new a(m10, n10), 1000);
        }
    }

    public class l implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                d.this.Z();
            }
        }

        public l() {
        }

        public void run() {
            wh.b.b("autoconnect scan timeout, restarting scan", new Object[0]);
            if (d.this.f20589e != null) {
                d.this.f20589e.stopScan(d.this.A);
                BluetoothLeScanner unused = d.this.f20589e = null;
            }
            d.this.f20597m.postDelayed(new a(), 1000);
        }
    }

    public d(@fh.g Context context, @fh.g e eVar, @fh.g Handler handler) {
        c cVar = new c();
        this.C = cVar;
        Objects.requireNonNull(context, "no valid context provided");
        Context context2 = context;
        this.f20585a = context;
        Objects.requireNonNull(eVar, "no valid bluetoothCallback provided");
        this.f20590f = eVar;
        Objects.requireNonNull(handler, "no valid handler provided");
        Handler handler2 = handler;
        this.f20586b = handler;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        Objects.requireNonNull(defaultAdapter, "no bluetooth adapter found");
        BluetoothAdapter bluetoothAdapter = defaultAdapter;
        this.f20587c = defaultAdapter;
        this.f20604t = R(w.LOW_POWER);
        this.f20603s = R(w.LOW_LATENCY);
        context.registerReceiver(cVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    public void E(@fh.g f fVar, @fh.g i iVar) {
        synchronized (this.f20600p) {
            Objects.requireNonNull(fVar, H);
            Objects.requireNonNull(iVar, I);
            if (this.f20591g.containsKey(fVar.h0())) {
                wh.b.x("already connected to %s'", fVar.h0());
            } else if (this.f20592h.get(fVar.h0()) != null) {
                wh.b.x("already issued autoconnect for '%s' ", fVar.h0());
            } else if (fVar.A0()) {
                wh.b.b("peripheral with address '%s' not in Bluetooth cache, autoconnecting by scanning", fVar.h0());
                this.f20593i.remove(fVar.h0());
                this.f20592h.put(fVar.h0(), fVar);
                F(fVar.h0(), iVar);
            } else if (fVar.w0() == r.CLASSIC) {
                wh.b.e("peripheral does not support Bluetooth LE", new Object[0]);
            } else {
                fVar.S0(iVar);
                this.f20593i.remove(fVar.h0());
                this.f20592h.put(fVar.h0(), fVar);
                fVar.N();
            }
        }
    }

    public final void F(String str, i iVar) {
        if (this.f20594j.contains(str)) {
            wh.b.x("peripheral already on list for reconnection", new Object[0]);
            return;
        }
        this.f20594j.add(str);
        this.f20595k.put(str, iVar);
        Z();
    }

    public void G(@fh.g Map<f, i> map) {
        Objects.requireNonNull(map, "no valid batch provided");
        HashMap hashMap = new HashMap();
        for (f next : map.keySet()) {
            if (next.A0()) {
                hashMap.put(next, map.get(next));
            } else {
                E(next, map.get(next));
            }
        }
        if (!hashMap.isEmpty()) {
            for (f fVar : hashMap.keySet()) {
                String h02 = fVar.h0();
                this.f20594j.add(h02);
                this.f20595k.put(h02, hashMap.get(fVar));
                this.f20592h.put(h02, fVar);
            }
            Z();
        }
    }

    public final boolean H() {
        if (!U() || !V()) {
            return true;
        }
        return !X();
    }

    public final void I() {
        wh.b.b("disconnect all peripherals because bluetooth is off", new Object[0]);
        for (f e02 : this.f20591g.values()) {
            e02.e0();
        }
        this.f20591g.clear();
        for (f e03 : this.f20592h.values()) {
            e03.e0();
        }
        this.f20592h.clear();
        this.f20594j.clear();
        this.f20595k.clear();
    }

    public final void J() {
        Runnable runnable = this.f20599o;
        if (runnable != null) {
            this.f20597m.removeCallbacks(runnable);
            this.f20599o = null;
        }
    }

    public void K(@fh.g f fVar) {
        Objects.requireNonNull(fVar, H);
        String h02 = fVar.h0();
        if (this.f20594j.contains(h02)) {
            this.f20594j.remove(h02);
            this.f20595k.remove(h02);
            this.f20592h.remove(h02);
            o0();
            wh.b.b("cancelling autoconnect for %s", h02);
            this.f20586b.post(new j(fVar));
            if (this.f20594j.size() > 0) {
                Z();
            }
        } else if (this.f20592h.containsKey(h02) || this.f20591g.containsKey(h02)) {
            fVar.O();
        } else {
            wh.b.e("cannot cancel connection to unknown peripheral %s", h02);
        }
    }

    public final void L() {
        Runnable runnable = this.f20607w;
        if (runnable != null) {
            this.f20597m.removeCallbacks(runnable);
            this.f20607w = null;
        }
    }

    public final void M() {
        Runnable runnable = this.f20598n;
        if (runnable != null) {
            this.f20597m.removeCallbacks(runnable);
            this.f20598n = null;
        }
    }

    public void N() {
        this.f20592h.clear();
        this.f20591g.clear();
        this.f20595k.clear();
        this.f20594j.clear();
        this.f20593i.clear();
        this.f20585a.unregisterReceiver(this.C);
    }

    public void O(@fh.g f fVar, @fh.g i iVar) {
        synchronized (this.f20600p) {
            Objects.requireNonNull(fVar, H);
            Objects.requireNonNull(iVar, I);
            if (this.f20591g.containsKey(fVar.h0())) {
                wh.b.x("already connected to %s'", fVar.h0());
            } else if (this.f20592h.containsKey(fVar.h0())) {
                wh.b.x("already connecting to %s'", fVar.h0());
            } else {
                if (fVar.A0()) {
                    wh.b.x("peripheral with address '%s' is not in the Bluetooth cache, hence connection may fail", fVar.h0());
                }
                fVar.S0(iVar);
                this.f20593i.remove(fVar.h0());
                this.f20592h.put(fVar.h0(), fVar);
                fVar.U();
            }
        }
    }

    @fh.g
    public List<f> P() {
        return new ArrayList(this.f20591g.values());
    }

    @fh.g
    public f Q(@fh.g String str) {
        Map<String, f> map;
        Objects.requireNonNull(str, G);
        if (BluetoothAdapter.checkBluetoothAddress(str)) {
            if (this.f20591g.containsKey(str)) {
                map = this.f20591g;
            } else if (this.f20592h.containsKey(str)) {
                map = this.f20592h;
            } else if (this.f20593i.containsKey(str)) {
                map = this.f20593i;
            } else {
                f fVar = new f(this.f20585a, this.f20587c.getRemoteDevice(str), this.B, new i.a(), this.f20586b);
                this.f20593i.put(str, fVar);
                return fVar;
            }
            f fVar2 = map.get(str);
            Objects.requireNonNull(fVar2);
            return fVar2;
        }
        throw new IllegalArgumentException(String.format("%s is not a valid bluetooth address. Make sure all alphabetic characters are uppercase.", new Object[]{str}));
    }

    public final ScanSettings R(@fh.g w wVar) {
        Objects.requireNonNull(wVar, "scanMode is null");
        return new ScanSettings.Builder().setScanMode(wVar.O).setCallbackType(1).setMatchMode(1).setNumOfMatches(1).setReportDelay(0).build();
    }

    public final void S(int i10) {
        switch (i10) {
            case 10:
                if (this.f20591g.size() > 0 || this.f20592h.size() > 0) {
                    this.f20606v = true;
                    l0();
                }
                wh.b.b("bluetooth turned off", new Object[0]);
                return;
            case 11:
                this.f20606v = false;
                wh.b.b("bluetooth turning on", new Object[0]);
                return;
            case 12:
                this.f20606v = false;
                wh.b.b("bluetooth turned on", new Object[0]);
                return;
            case 13:
                this.f20606v = true;
                M();
                J();
                this.f20601q = null;
                this.f20602r = null;
                this.f20589e = null;
                wh.b.b("bluetooth turning off", new Object[0]);
                return;
            default:
                return;
        }
    }

    public final boolean T() {
        return this.f20589e != null;
    }

    public final boolean U() {
        if (this.f20585a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return true;
        }
        wh.b.e("BLE not supported", new Object[0]);
        return false;
    }

    public boolean V() {
        if (this.f20587c.isEnabled()) {
            return true;
        }
        wh.b.e("Bluetooth disabled", new Object[0]);
        return false;
    }

    public boolean W() {
        return (this.f20588d == null || this.f20601q == null) ? false : true;
    }

    public final boolean X() {
        int i10 = this.f20585a.getApplicationInfo().targetSdkVersion;
        if (Build.VERSION.SDK_INT < 29 || i10 < 29) {
            if (this.f20585a.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                return true;
            }
            throw new SecurityException("app does not have ACCESS_COARSE_LOCATION permission, cannot start scan");
        } else if (this.f20585a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        } else {
            throw new SecurityException("app does not have ACCESS_FINE_LOCATION permission, cannot start scan");
        }
    }

    public boolean Y(@fh.g String str) {
        Objects.requireNonNull(str, G);
        Set<BluetoothDevice> bondedDevices = this.f20587c.getBondedDevices();
        if (bondedDevices.size() > 0) {
            BluetoothDevice bluetoothDevice = null;
            for (BluetoothDevice next : bondedDevices) {
                if (next.getAddress().equals(str)) {
                    bluetoothDevice = next;
                }
            }
            if (bluetoothDevice != null) {
                try {
                    boolean booleanValue = ((Boolean) bluetoothDevice.getClass().getMethod("removeBond", (Class[]) null).invoke(bluetoothDevice, (Object[]) null)).booleanValue();
                    if (booleanValue) {
                        wh.b.i("Succesfully removed bond for '%s'", bluetoothDevice.getName());
                    }
                    return booleanValue;
                } catch (Exception e10) {
                    wh.b.i("could not remove bond", new Object[0]);
                    e10.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }

    public final void Z() {
        if (!H()) {
            if (this.f20589e != null) {
                o0();
            }
            BluetoothLeScanner bluetoothLeScanner = this.f20587c.getBluetoothLeScanner();
            this.f20589e = bluetoothLeScanner;
            if (bluetoothLeScanner != null) {
                ArrayList arrayList = new ArrayList();
                for (String deviceAddress : this.f20594j) {
                    arrayList.add(new ScanFilter.Builder().setDeviceAddress(deviceAddress).build());
                }
                this.f20589e.startScan(arrayList, this.f20604t, this.A);
                wh.b.b("started scanning to autoconnect peripherals (" + this.f20594j.size() + ")", new Object[0]);
                h0();
                return;
            }
            wh.b.e("starting autoconnect scan failed", new Object[0]);
        }
    }

    public void a0() {
        n0(Collections.emptyList(), this.f20603s, this.f20610z);
    }

    public void b0(@fh.g List<ScanFilter> list) {
        Objects.requireNonNull(list, "no filters supplied");
        if (!list.isEmpty()) {
            n0(list, this.f20603s, this.f20610z);
            return;
        }
        throw new IllegalArgumentException("at least one scan filter must be supplied");
    }

    public void c0(@fh.g String[] strArr) {
        Objects.requireNonNull(strArr, "no peripheral addresses supplied");
        if (strArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (BluetoothAdapter.checkBluetoothAddress(str)) {
                    arrayList.add(new ScanFilter.Builder().setDeviceAddress(str).build());
                } else {
                    wh.b.e("%s is not a valid address. Make sure all alphabetic characters are uppercase.", str);
                }
            }
            n0(arrayList, this.f20603s, this.f20610z);
            return;
        }
        throw new IllegalArgumentException("at least one peripheral address must be supplied");
    }

    public void d0(@fh.g String[] strArr) {
        Objects.requireNonNull(strArr, "no peripheral names supplied");
        if (strArr.length != 0) {
            this.f20596l = strArr;
            n0(Collections.emptyList(), this.f20603s, this.f20609y);
            return;
        }
        throw new IllegalArgumentException("at least one peripheral name must be supplied");
    }

    public void e0(@fh.g UUID[] uuidArr) {
        Objects.requireNonNull(uuidArr, "no service UUIDs supplied");
        if (uuidArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (UUID parcelUuid : uuidArr) {
                arrayList.add(new ScanFilter.Builder().setServiceUuid(new ParcelUuid(parcelUuid)).build());
            }
            n0(arrayList, this.f20603s, this.f20610z);
            return;
        }
        throw new IllegalArgumentException("at least one service UUID  must be supplied");
    }

    public final void f0(@fh.g v vVar) {
        this.f20601q = null;
        this.f20602r = null;
        this.f20586b.post(new g(vVar));
    }

    public final void g0(@fh.g ScanResult scanResult) {
        this.f20586b.post(new f(scanResult));
    }

    public final void h0() {
        J();
        l lVar = new l();
        this.f20599o = lVar;
        this.f20597m.postDelayed(lVar, D);
    }

    public boolean i0(@fh.g String str, @fh.g String str2) {
        Objects.requireNonNull(str, G);
        Objects.requireNonNull(str2, "no pin provided");
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            wh.b.e("%s is not a valid address. Make sure all alphabetic characters are uppercase.", str);
            return false;
        } else if (str2.length() != 6) {
            wh.b.e("%s is not 6 digits long", str2);
            return false;
        } else {
            this.f20608x.put(str, str2);
            return true;
        }
    }

    public void j0(@fh.g w wVar) {
        Objects.requireNonNull(wVar);
        this.f20603s = R(wVar);
    }

    public final void k0() {
        M();
        k kVar = new k();
        this.f20598n = kVar;
        this.f20597m.postDelayed(kVar, D);
    }

    public final void l0() {
        L();
        b bVar = new b();
        this.f20607w = bVar;
        this.f20597m.postDelayed(bVar, 1000);
    }

    public void m0() {
        if (!Build.MANUFACTURER.equalsIgnoreCase(com.google.android.material.internal.e.f17193b)) {
            this.f20587c.startDiscovery();
            this.f20586b.postDelayed(new a(), 1000);
        }
    }

    public final void n0(@fh.g List<ScanFilter> list, @fh.g ScanSettings scanSettings, @fh.g ScanCallback scanCallback) {
        if (!H()) {
            if (W()) {
                wh.b.e("other scan still active, stopping scan", new Object[0]);
                p0();
            }
            if (this.f20588d == null) {
                this.f20588d = this.f20587c.getBluetoothLeScanner();
            }
            if (this.f20588d != null) {
                k0();
                this.f20601q = scanCallback;
                this.f20602r = list;
                this.f20588d.startScan(list, scanSettings, scanCallback);
                wh.b.i("scan started", new Object[0]);
                return;
            }
            wh.b.e("starting scan failed", new Object[0]);
        }
    }

    public final void o0() {
        J();
        BluetoothLeScanner bluetoothLeScanner = this.f20589e;
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.stopScan(this.A);
            this.f20589e = null;
            wh.b.i("autoscan stopped", new Object[0]);
        }
    }

    public void p0() {
        M();
        if (W()) {
            BluetoothLeScanner bluetoothLeScanner = this.f20588d;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.f20601q);
                wh.b.i("scan stopped", new Object[0]);
            }
        } else {
            wh.b.i("no scan to stop because no scan is running", new Object[0]);
        }
        this.f20601q = null;
        this.f20602r = null;
        this.f20593i.clear();
    }
}
