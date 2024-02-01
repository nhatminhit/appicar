package ld;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

public class f {
    public static final UUID A = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final int B = 517;
    public static final int C = 23;
    public static final int D = 2;
    public static final int E = 100;
    public static final int F = 35000;
    public static final int G = 4500;
    public static final int H = 25000;
    public static final long I = 1000;
    public static final long J = 500;
    public static final String K = "no valid service UUID provided";
    public static final String L = "no valid characteristic UUID provided";
    public static final String M = "no valid characteristic provided";
    public static final String N = "no valid writeType provided";
    public static final String O = "no valid value provided";
    public static final String P = "no valid descriptor provided";
    public static final String Q = "no valid peripheral callback provided";
    public static final String R = "no valid device provided";
    public static final String S = "no valid priority provided";
    public static final String T = "peripheral not connected";
    public static final String U = "value byte array is empty";
    public static final String V = "value byte array is too long";
    public static final int W = 0;
    public static final int X = 1;
    public static final int Y = 2;
    public static final int Z = 0;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f20616a0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f20617b0 = 2;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f20618c0 = 3;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f20619d0 = 4;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f20620e0 = 5;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f20621f0 = 6;
    @fh.g

    /* renamed from: a  reason: collision with root package name */
    public final Context f20622a;
    @fh.g

    /* renamed from: b  reason: collision with root package name */
    public final Handler f20623b;
    @fh.g

    /* renamed from: c  reason: collision with root package name */
    public BluetoothDevice f20624c;
    @fh.g

    /* renamed from: d  reason: collision with root package name */
    public final c0 f20625d;
    @fh.g

    /* renamed from: e  reason: collision with root package name */
    public i f20626e;
    @fh.g

    /* renamed from: f  reason: collision with root package name */
    public final Queue<Runnable> f20627f = new ConcurrentLinkedQueue();
    @fh.h

    /* renamed from: g  reason: collision with root package name */
    public volatile BluetoothGatt f20628g;
    @fh.g

    /* renamed from: h  reason: collision with root package name */
    public String f20629h = "";
    @fh.g

    /* renamed from: i  reason: collision with root package name */
    public byte[] f20630i = new byte[0];

    /* renamed from: j  reason: collision with root package name */
    public int f20631j = 0;
    @fh.g

    /* renamed from: k  reason: collision with root package name */
    public final Set<BluetoothGattCharacteristic> f20632k = new HashSet();
    @fh.g

    /* renamed from: l  reason: collision with root package name */
    public final Handler f20633l = new Handler(Looper.getMainLooper());
    @fh.h

    /* renamed from: m  reason: collision with root package name */
    public Runnable f20634m;
    @fh.h

    /* renamed from: n  reason: collision with root package name */
    public Runnable f20635n;

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f20636o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f20637p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f20638q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f20639r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f20640s = false;

    /* renamed from: t  reason: collision with root package name */
    public volatile int f20641t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f20642u;

    /* renamed from: v  reason: collision with root package name */
    public long f20643v;

    /* renamed from: w  reason: collision with root package name */
    public int f20644w = 23;

    /* renamed from: x  reason: collision with root package name */
    public final BluetoothGattCallback f20645x = new a();

    /* renamed from: y  reason: collision with root package name */
    public final BroadcastReceiver f20646y = new w();

    /* renamed from: z  reason: collision with root package name */
    public final BroadcastReceiver f20647z = new b();

    public class a extends BluetoothGattCallback {

        /* renamed from: ld.f$a$a  reason: collision with other inner class name */
        public class C0353a implements Runnable {
            public final /* synthetic */ int O;
            public final /* synthetic */ int P;
            public final /* synthetic */ p Q;

            public C0353a(int i10, int i11, p pVar) {
                this.O = i10;
                this.P = i11;
                this.Q = pVar;
            }

            public void run() {
                f fVar = f.this;
                fVar.f20626e.l(fVar, t.a(this.O), t.a(this.P), this.Q);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ int O;
            public final /* synthetic */ int P;
            public final /* synthetic */ p Q;

            public b(int i10, int i11, p pVar) {
                this.O = i10;
                this.P = i11;
                this.Q = pVar;
            }

            public void run() {
                f fVar = f.this;
                fVar.f20626e.l(fVar, t.a(this.O), t.a(this.P), this.Q);
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ int O;
            public final /* synthetic */ int P;
            public final /* synthetic */ int Q;
            public final /* synthetic */ p R;

            public c(int i10, int i11, int i12, p pVar) {
                this.O = i10;
                this.P = i11;
                this.Q = i12;
                this.R = pVar;
            }

            public void run() {
                f fVar = f.this;
                fVar.f20626e.g(fVar, this.O, this.P, this.Q, this.R);
            }
        }

        public class d implements Runnable {
            public d() {
            }

            public void run() {
                f fVar = f.this;
                fVar.f20626e.n(fVar);
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ BluetoothGattCharacteristic O;
            public final /* synthetic */ p P;

            public e(BluetoothGattCharacteristic bluetoothGattCharacteristic, p pVar) {
                this.O = bluetoothGattCharacteristic;
                this.P = pVar;
            }

            public void run() {
                f fVar = f.this;
                fVar.f20626e.k(fVar, this.O, this.P);
            }
        }

        /* renamed from: ld.f$a$f  reason: collision with other inner class name */
        public class C0354f implements Runnable {
            public final /* synthetic */ BluetoothGattDescriptor O;
            public final /* synthetic */ p P;

            public C0354f(BluetoothGattDescriptor bluetoothGattDescriptor, p pVar) {
                this.O = bluetoothGattDescriptor;
                this.P = pVar;
            }

            public void run() {
                f fVar = f.this;
                fVar.f20626e.i(fVar, fVar.f20630i, this.O, this.P);
            }
        }

        public class g implements Runnable {
            public final /* synthetic */ byte[] O;
            public final /* synthetic */ BluetoothGattDescriptor P;
            public final /* synthetic */ p Q;

            public g(byte[] bArr, BluetoothGattDescriptor bluetoothGattDescriptor, p pVar) {
                this.O = bArr;
                this.P = bluetoothGattDescriptor;
                this.Q = pVar;
            }

            public void run() {
                f fVar = f.this;
                fVar.f20626e.h(fVar, this.O, this.P, this.Q);
            }
        }

        public class h implements Runnable {
            public final /* synthetic */ byte[] O;
            public final /* synthetic */ BluetoothGattCharacteristic P;

            public h(byte[] bArr, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.O = bArr;
                this.P = bluetoothGattCharacteristic;
            }

            public void run() {
                f fVar = f.this;
                fVar.f20626e.e(fVar, this.O, this.P, p.SUCCESS);
            }
        }

        public class i implements Runnable {
            public final /* synthetic */ byte[] O;
            public final /* synthetic */ BluetoothGattCharacteristic P;
            public final /* synthetic */ p Q;

            public i(byte[] bArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, p pVar) {
                this.O = bArr;
                this.P = bluetoothGattCharacteristic;
                this.Q = pVar;
            }

            public void run() {
                f fVar = f.this;
                fVar.f20626e.e(fVar, this.O, this.P, this.Q);
            }
        }

        public class j implements Runnable {
            public final /* synthetic */ byte[] O;
            public final /* synthetic */ BluetoothGattCharacteristic P;
            public final /* synthetic */ p Q;

            public j(byte[] bArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, p pVar) {
                this.O = bArr;
                this.P = bluetoothGattCharacteristic;
                this.Q = pVar;
            }

            public void run() {
                f fVar = f.this;
                fVar.f20626e.f(fVar, this.O, this.P, this.Q);
            }
        }

        public class k implements Runnable {
            public final /* synthetic */ int O;
            public final /* synthetic */ p P;

            public k(int i10, p pVar) {
                this.O = i10;
                this.P = pVar;
            }

            public void run() {
                f fVar = f.this;
                fVar.f20626e.m(fVar, this.O, this.P);
            }
        }

        public class l implements Runnable {
            public final /* synthetic */ int O;
            public final /* synthetic */ p P;

            public l(int i10, p pVar) {
                this.O = i10;
                this.P = pVar;
            }

            public void run() {
                f fVar = f.this;
                fVar.f20626e.j(fVar, this.O, this.P);
            }
        }

        public a() {
        }

        public final boolean a(@fh.g p pVar) {
            if ((pVar != p.AUTHORIZATION_FAILED && pVar != p.INSUFFICIENT_AUTHENTICATION && pVar != p.INSUFFICIENT_ENCRYPTION) || Build.VERSION.SDK_INT >= 26) {
                return false;
            }
            wh.b.i("operation will be retried after bonding, bonding should be in progress", new Object[0]);
            return true;
        }

        public void b(@fh.g BluetoothGatt bluetoothGatt, int i10, int i11, int i12, int i13) {
            p a10 = p.a(i13);
            if (a10 == p.SUCCESS) {
                wh.b.b(String.format(Locale.ENGLISH, "connection parameters: interval=%.1fms latency=%d timeout=%ds", new Object[]{Float.valueOf(((float) i10) * 1.25f), Integer.valueOf(i11), Integer.valueOf(i12 / 100)}), new Object[0]);
            } else {
                wh.b.e("connection parameters update failed with status '%s'", a10);
            }
            f.this.f20623b.post(new c(i10, i11, i12, a10));
        }

        public void onCharacteristicChanged(@fh.g BluetoothGatt bluetoothGatt, @fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            f.this.f20623b.post(new h(f.this.C0(bluetoothGattCharacteristic.getValue()), bluetoothGattCharacteristic));
        }

        public void onCharacteristicRead(@fh.g BluetoothGatt bluetoothGatt, @fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            p a10 = p.a(i10);
            if (a10 != p.SUCCESS) {
                wh.b.e("read failed for characteristic <%s>, status '%s'", bluetoothGattCharacteristic.getUuid(), a10);
                if (a(a10)) {
                    return;
                }
            }
            f.this.f20623b.post(new i(f.this.C0(bluetoothGattCharacteristic.getValue()), bluetoothGattCharacteristic, a10));
            f.this.T();
        }

        public void onCharacteristicWrite(@fh.g BluetoothGatt bluetoothGatt, @fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            p a10 = p.a(i10);
            if (a10 != p.SUCCESS) {
                wh.b.e("writing <%s> to characteristic <%s> failed, status '%s'", b.a(f.this.f20630i), bluetoothGattCharacteristic.getUuid(), a10);
                if (a(a10)) {
                    return;
                }
            }
            byte[] J = f.this.f20630i;
            byte[] unused = f.this.f20630i = new byte[0];
            f.this.f20623b.post(new j(J, bluetoothGattCharacteristic, a10));
            f.this.T();
        }

        public void onConnectionStateChange(@fh.g BluetoothGatt bluetoothGatt, int i10, int i11) {
            f.this.P();
            int b10 = f.this.f20641t;
            int unused = f.this.f20641t = i11;
            q a10 = q.a(i10);
            if (a10 != q.SUCCESS) {
                f.this.Y(a10, b10, i11);
            } else if (i11 == 0) {
                f.this.W0(b10);
            } else if (i11 == 1) {
                wh.b.i("peripheral is connecting", new Object[0]);
            } else if (i11 == 2) {
                f.this.V0();
            } else if (i11 != 3) {
                wh.b.e("unknown state received", new Object[0]);
            } else {
                wh.b.i("peripheral is disconnecting", new Object[0]);
            }
        }

        public void onDescriptorRead(@fh.g BluetoothGatt bluetoothGatt, @fh.g BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            p a10 = p.a(i10);
            if (a10 != p.SUCCESS) {
                wh.b.e("reading descriptor <%s> failed for device '%s, status '%s'", bluetoothGattDescriptor.getUuid(), f.this.h0(), a10);
                if (a(a10)) {
                    return;
                }
            }
            f.this.f20623b.post(new g(f.this.C0(bluetoothGattDescriptor.getValue()), bluetoothGattDescriptor, a10));
            f.this.T();
        }

        public void onDescriptorWrite(@fh.g BluetoothGatt bluetoothGatt, @fh.g BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            p a10 = p.a(i10);
            BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
            p pVar = p.SUCCESS;
            if (a10 != pVar) {
                wh.b.e("failed to write <%s> to descriptor of characteristic <%s> for device: '%s', status '%s' ", b.a(f.this.f20630i), characteristic.getUuid(), f.this.h0(), a10);
                if (a(a10)) {
                    return;
                }
            }
            if (bluetoothGattDescriptor.getUuid().equals(f.A)) {
                if (a10 == pVar) {
                    byte[] C0 = f.this.C0(bluetoothGattDescriptor.getValue());
                    if (Arrays.equals(C0, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) || Arrays.equals(C0, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE)) {
                        f.this.f20632k.add(characteristic);
                    } else if (Arrays.equals(C0, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
                        f.this.f20632k.remove(characteristic);
                    }
                }
                f.this.f20623b.post(new e(characteristic, a10));
            } else {
                f.this.f20623b.post(new C0354f(bluetoothGattDescriptor, a10));
            }
            f.this.T();
        }

        public void onMtuChanged(@fh.g BluetoothGatt bluetoothGatt, int i10, int i11) {
            p a10 = p.a(i11);
            if (a10 != p.SUCCESS) {
                wh.b.e("change MTU failed, status '%s'", a10);
            }
            int unused = f.this.f20644w = i10;
            f.this.f20623b.post(new l(i10, a10));
            if (f.this.f20631j == 1) {
                int unused2 = f.this.f20631j = 0;
                f.this.T();
            }
        }

        public void onPhyRead(@fh.g BluetoothGatt bluetoothGatt, int i10, int i11, int i12) {
            p a10 = p.a(i12);
            if (a10 != p.SUCCESS) {
                wh.b.e("read Phy failed, status '%s'", a10);
            } else {
                wh.b.i("updated Phy: tx = %s, rx = %s", t.a(i10), t.a(i11));
            }
            f.this.f20623b.post(new C0353a(i10, i11, a10));
            f.this.T();
        }

        public void onPhyUpdate(@fh.g BluetoothGatt bluetoothGatt, int i10, int i11, int i12) {
            p a10 = p.a(i12);
            if (a10 != p.SUCCESS) {
                wh.b.e("update Phy failed, status '%s'", a10);
            } else {
                wh.b.i("updated Phy: tx = %s, rx = %s", t.a(i10), t.a(i11));
            }
            f.this.f20623b.post(new b(i10, i11, a10));
            if (f.this.f20631j == 2) {
                int unused = f.this.f20631j = 0;
                f.this.T();
            }
        }

        public void onReadRemoteRssi(@fh.g BluetoothGatt bluetoothGatt, int i10, int i11) {
            p a10 = p.a(i11);
            if (a10 != p.SUCCESS) {
                wh.b.e("reading RSSI failed, status '%s'", a10);
            }
            f.this.f20623b.post(new k(i10, a10));
            f.this.T();
        }

        public void onServicesDiscovered(@fh.g BluetoothGatt bluetoothGatt, int i10) {
            p a10 = p.a(i10);
            if (a10 != p.SUCCESS) {
                wh.b.e("service discovery failed due to internal error '%s', disconnecting", a10);
                f.this.d0();
                return;
            }
            wh.b.i("discovered %d services for '%s'", Integer.valueOf(bluetoothGatt.getServices().size()), f.this.p0());
            f.this.f20625d.a(f.this);
            f.this.f20623b.post(new d());
        }
    }

    public class a0 implements Runnable {
        public a0() {
        }

        public void run() {
            f fVar = f.this;
            fVar.f20626e.b(fVar);
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        public void onReceive(Context context, Intent intent) {
            String d10;
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null && bluetoothDevice.getAddress().equalsIgnoreCase(f.this.h0())) {
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE);
                wh.b.b("pairing request received: " + f.this.E0(intExtra) + " (" + intExtra + ")", new Object[0]);
                if (intExtra == 0 && (d10 = f.this.f20625d.d(f.this)) != null) {
                    wh.b.b("setting PIN code for this peripheral using '%s'", d10);
                    bluetoothDevice.setPin(d10.getBytes());
                    abortBroadcast();
                }
            }
        }
    }

    public class b0 implements Runnable {
        public b0() {
        }

        public void run() {
            f fVar = f.this;
            fVar.f20626e.a(fVar);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            wh.b.i("connect to '%s' (%s) using TRANSPORT_LE", f.this.p0(), f.this.h0());
            f.this.K0();
            int unused = f.this.f20641t = 1;
            boolean unused2 = f.this.f20640s = false;
            f fVar = f.this;
            BluetoothGatt unused3 = fVar.f20628g = fVar.W(fVar.f20624c, false, f.this.f20645x);
            long unused4 = f.this.f20643v = SystemClock.elapsedRealtime();
            f fVar2 = f.this;
            fVar2.U0(fVar2);
        }
    }

    public interface c0 {
        void a(@fh.g f fVar);

        void b(@fh.g f fVar, @fh.g q qVar);

        void c(@fh.g f fVar, @fh.g q qVar);

        String d(@fh.g f fVar);
    }

    public class d implements Runnable {
        public d() {
        }

        public void run() {
            wh.b.i("autoConnect to '%s' (%s) using TRANSPORT_LE", f.this.p0(), f.this.h0());
            f.this.K0();
            int unused = f.this.f20641t = 1;
            boolean unused2 = f.this.f20640s = false;
            f fVar = f.this;
            BluetoothGatt unused3 = fVar.f20628g = fVar.W(fVar.f20624c, true, f.this.f20645x);
            long unused4 = f.this.f20643v = SystemClock.elapsedRealtime();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public void run() {
            boolean unused = f.this.f20639r = true;
            if (!f.this.f20624c.createBond()) {
                wh.b.e("bonding failed for %s", f.this.h0());
                f.this.T();
                return;
            }
            wh.b.b("manually bonding %s", f.this.h0());
            f.x(f.this);
        }
    }

    /* renamed from: ld.f$f  reason: collision with other inner class name */
    public class C0355f implements Runnable {
        public C0355f() {
        }

        public void run() {
            f.this.f20645x.onConnectionStateChange(f.this.f20628g, q.SUCCESS.O, 0);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            if (f.this.f20641t == 3 && f.this.f20628g != null) {
                f.this.f20628g.disconnect();
                wh.b.i("force disconnect '%s' (%s)", f.this.p0(), f.this.h0());
            }
        }
    }

    public class h implements Runnable {
        public final /* synthetic */ BluetoothGattCharacteristic O;

        public h(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            this.O = bluetoothGattCharacteristic;
        }

        public void run() {
            if (f.this.y0()) {
                if (f.this.f20628g.readCharacteristic(this.O)) {
                    wh.b.b("reading characteristic <%s>", this.O.getUuid());
                    f.x(f.this);
                    return;
                }
                wh.b.e("readCharacteristic failed for characteristic: %s", this.O.getUuid());
            }
            f.this.T();
        }
    }

    public class i implements Runnable {
        public final /* synthetic */ byte[] O;
        public final /* synthetic */ BluetoothGattCharacteristic P;
        public final /* synthetic */ x Q;

        public i(byte[] bArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, x xVar) {
            this.O = bArr;
            this.P = bluetoothGattCharacteristic;
            this.Q = xVar;
        }

        public void run() {
            if (f.this.y0()) {
                byte[] unused = f.this.f20630i = this.O;
                this.P.setWriteType(this.Q.O);
                if (f.this.X0(this.O, this.Q)) {
                    wh.b.x("value byte array is longer than allowed by MTU, write will fail if peripheral does not support long writes", new Object[0]);
                }
                this.P.setValue(this.O);
                if (f.this.f20628g.writeCharacteristic(this.P)) {
                    wh.b.b("writing <%s> to characteristic <%s>", b.a(this.O), this.P.getUuid());
                    f.x(f.this);
                    return;
                }
                wh.b.e("writeCharacteristic failed for characteristic: %s", this.P.getUuid());
            }
            f.this.T();
        }
    }

    public class j implements Runnable {
        public final /* synthetic */ BluetoothGattDescriptor O;

        public j(BluetoothGattDescriptor bluetoothGattDescriptor) {
            this.O = bluetoothGattDescriptor;
        }

        public void run() {
            if (f.this.y0()) {
                if (f.this.f20628g.readDescriptor(this.O)) {
                    wh.b.b("reading descriptor <%s>", this.O.getUuid());
                    f.x(f.this);
                    return;
                }
                wh.b.e("readDescriptor failed for characteristic: %s", this.O.getUuid());
            }
            f.this.T();
        }
    }

    public class k implements Runnable {
        public final /* synthetic */ byte[] O;
        public final /* synthetic */ BluetoothGattDescriptor P;

        public k(byte[] bArr, BluetoothGattDescriptor bluetoothGattDescriptor) {
            this.O = bArr;
            this.P = bluetoothGattDescriptor;
        }

        public void run() {
            if (f.this.y0()) {
                byte[] unused = f.this.f20630i = this.O;
                this.P.setValue(this.O);
                if (f.this.f20628g.writeDescriptor(this.P)) {
                    wh.b.b("writing <%s> to descriptor <%s>", b.a(this.O), this.P.getUuid());
                    f.x(f.this);
                    return;
                }
                wh.b.e("writeDescriptor failed for descriptor: %s", this.P.getUuid());
            }
            f.this.T();
        }
    }

    public class l implements Runnable {
        public final /* synthetic */ BluetoothGattCharacteristic O;
        public final /* synthetic */ boolean P;
        public final /* synthetic */ byte[] Q;
        public final /* synthetic */ BluetoothGattDescriptor R;

        public l(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10, byte[] bArr, BluetoothGattDescriptor bluetoothGattDescriptor) {
            this.O = bluetoothGattCharacteristic;
            this.P = z10;
            this.Q = bArr;
            this.R = bluetoothGattDescriptor;
        }

        public void run() {
            if (!f.this.D0()) {
                if (!f.this.f20628g.setCharacteristicNotification(this.O, this.P)) {
                    wh.b.e("setCharacteristicNotification failed for characteristic: %s", this.O.getUuid());
                } else {
                    f.this.M(this.O);
                    byte[] unused = f.this.f20630i = this.Q;
                    this.R.setValue(this.Q);
                    if (f.this.f20628g.writeDescriptor(this.R)) {
                        f.x(f.this);
                        return;
                    }
                    wh.b.e("writeDescriptor failed for descriptor: %s", this.R.getUuid());
                    f.this.T();
                    return;
                }
            }
            f.this.T();
        }
    }

    public class m implements Runnable {
        public m() {
        }

        public void run() {
            if (f.this.y0()) {
                if (!f.this.f20628g.readRemoteRssi()) {
                    wh.b.e("readRemoteRssi failed", new Object[0]);
                } else {
                    return;
                }
            }
            f.this.T();
        }
    }

    public class n implements Runnable {
        public final /* synthetic */ int O;

        public n(int i10) {
            this.O = i10;
        }

        public void run() {
            if (f.this.y0()) {
                if (f.this.f20628g.requestMtu(this.O)) {
                    int unused = f.this.f20631j = 1;
                    wh.b.i("requesting MTU of %d", Integer.valueOf(this.O));
                    return;
                }
                wh.b.e("requestMtu failed", new Object[0]);
            }
            f.this.T();
        }
    }

    public class o implements Runnable {
        public final /* synthetic */ n O;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                f.this.T();
            }
        }

        public o(n nVar) {
            this.O = nVar;
        }

        public void run() {
            if (f.this.y0()) {
                if (f.this.f20628g.requestConnectionPriority(this.O.O)) {
                    wh.b.b("requesting connection priority %s", this.O);
                } else {
                    wh.b.e("could not request connection priority", new Object[0]);
                }
            }
            f.this.f20623b.postDelayed(new a(), 500);
        }
    }

    public class p implements Runnable {
        public final /* synthetic */ t O;
        public final /* synthetic */ t P;
        public final /* synthetic */ s Q;

        public p(t tVar, t tVar2, s sVar) {
            this.O = tVar;
            this.P = tVar2;
            this.Q = sVar;
        }

        public void run() {
            if (!f.this.y0()) {
                f.this.T();
            } else if (Build.VERSION.SDK_INT >= 26) {
                int unused = f.this.f20631j = 2;
                wh.b.i("setting preferred Phy: tx = %s, rx = %s, options = %s", this.O, this.P, this.Q);
                f.this.f20628g.setPreferredPhy(this.O.P, this.P.P, this.Q.O);
            }
        }
    }

    public class q implements Runnable {
        public q() {
        }

        public void run() {
            if (!f.this.y0()) {
                f.this.T();
            } else if (Build.VERSION.SDK_INT >= 26) {
                f.this.f20628g.readPhy();
                wh.b.b("reading Phy", new Object[0]);
            }
        }
    }

    public class r implements Runnable {
        public final /* synthetic */ Runnable O;

        public r(Runnable runnable) {
            this.O = runnable;
        }

        public void run() {
            try {
                this.O.run();
            } catch (Exception e10) {
                wh.b.g(e10, "command exception for device '%s'", f.this.p0());
                f.this.T();
            }
        }
    }

    public class s implements Runnable {
        public final /* synthetic */ f O;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                f.this.f20645x.onConnectionStateChange(f.this.f20628g, q.CONNECTION_FAILED_ESTABLISHMENT.O, 0);
            }
        }

        public s(f fVar) {
            this.O = fVar;
        }

        public void run() {
            wh.b.e("connection timout, disconnecting '%s'", this.O.p0());
            f.this.d0();
            f.this.f20633l.postDelayed(new a(), 50);
            Runnable unused = f.this.f20634m = null;
        }
    }

    public static /* synthetic */ class t {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20650a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                ld.x[] r0 = ld.x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20650a = r0
                ld.x r1 = ld.x.WITH_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20650a     // Catch:{ NoSuchFieldError -> 0x001d }
                ld.x r1 = ld.x.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ld.f.t.<clinit>():void");
        }
    }

    public class u implements Runnable {
        public final /* synthetic */ long O;

        public u(long j10) {
            this.O = j10;
        }

        public void run() {
            wh.b.b("discovering services of '%s' with delay of %d ms", f.this.p0(), Long.valueOf(this.O));
            if (f.this.f20628g == null || !f.this.f20628g.discoverServices()) {
                wh.b.e("discoverServices failed to start", new Object[0]);
            } else {
                boolean unused = f.this.f20640s = true;
            }
            Runnable unused2 = f.this.f20635n = null;
        }
    }

    public class v implements Runnable {
        public v() {
        }

        public void run() {
            f.this.f20625d.b(f.this, q.SUCCESS);
        }
    }

    public class w extends BroadcastReceiver {
        public w() {
        }

        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            String action = intent.getAction();
            if (action != null && (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null && bluetoothDevice.getAddress().equalsIgnoreCase(f.this.h0()) && action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                f.this.x0(intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE), intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", Integer.MIN_VALUE));
            }
        }
    }

    public class x implements Runnable {
        public x() {
        }

        public void run() {
            f fVar = f.this;
            fVar.f20626e.c(fVar);
        }
    }

    public class y implements Runnable {
        public y() {
        }

        public void run() {
            f fVar = f.this;
            fVar.f20626e.d(fVar);
        }
    }

    public class z implements Runnable {
        public z() {
        }

        public void run() {
            wh.b.b("retrying command after bonding", new Object[0]);
            f.this.N0();
        }
    }

    public f(@fh.g Context context, @fh.g BluetoothDevice bluetoothDevice, @fh.g c0 c0Var, @fh.g i iVar, @fh.g Handler handler) {
        Objects.requireNonNull(context, "no valid context provided");
        Context context2 = context;
        this.f20622a = context;
        Objects.requireNonNull(bluetoothDevice, R);
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        this.f20624c = bluetoothDevice;
        Objects.requireNonNull(c0Var, "no valid listener provided");
        this.f20625d = c0Var;
        Objects.requireNonNull(iVar, Q);
        this.f20626e = iVar;
        Objects.requireNonNull(handler, "no valid callback handler provided");
        Handler handler2 = handler;
        this.f20623b = handler;
    }

    public static /* synthetic */ int x(f fVar) {
        int i10 = fVar.f20642u;
        fVar.f20642u = i10 + 1;
        return i10;
    }

    public boolean A0() {
        return w0() == r.UNKNOWN;
    }

    public final void B0() {
        synchronized (this) {
            if (!this.f20636o) {
                Runnable peek = this.f20627f.peek();
                if (peek != null) {
                    if (this.f20628g == null) {
                        wh.b.e("gatt is 'null' for peripheral '%s', clearing command queue", h0());
                        this.f20627f.clear();
                        this.f20636o = false;
                        return;
                    }
                    this.f20636o = true;
                    if (!this.f20637p) {
                        this.f20642u = 0;
                    }
                    this.f20633l.post(new r(peek));
                }
            }
        }
    }

    @fh.g
    public byte[] C0(@fh.h byte[] bArr) {
        return bArr == null ? new byte[0] : bArr;
    }

    public final boolean D0() {
        return !y0();
    }

    public final String E0(int i10) {
        switch (i10) {
            case 0:
                return "PAIRING_VARIANT_PIN";
            case 1:
                return "PAIRING_VARIANT_PASSKEY";
            case 2:
                return "PAIRING_VARIANT_PASSKEY_CONFIRMATION";
            case 3:
                return "PAIRING_VARIANT_CONSENT";
            case 4:
                return "PAIRING_VARIANT_DISPLAY_PASSKEY";
            case 5:
                return "PAIRING_VARIANT_DISPLAY_PIN";
            case 6:
                return "PAIRING_VARIANT_OOB_CONSENT";
            default:
                return "UNKNOWN";
        }
    }

    public boolean F0(@fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        Objects.requireNonNull(bluetoothGattCharacteristic, M);
        if (D0()) {
            wh.b.e(T, new Object[0]);
            return false;
        } else if (!f0(bluetoothGattCharacteristic)) {
            boolean add = this.f20627f.add(new h(bluetoothGattCharacteristic));
            if (add) {
                B0();
            } else {
                wh.b.e("could not enqueue read characteristic command", new Object[0]);
            }
            return add;
        } else {
            throw new IllegalArgumentException(String.format("characteristic <%s> does not have read property", new Object[]{bluetoothGattCharacteristic.getUuid()}));
        }
    }

    public boolean G0(@fh.g UUID uuid, @fh.g UUID uuid2) {
        Objects.requireNonNull(uuid, K);
        Objects.requireNonNull(uuid2, L);
        BluetoothGattCharacteristic j02 = j0(uuid, uuid2);
        if (j02 != null) {
            return F0(j02);
        }
        return false;
    }

    public boolean H0(@fh.g BluetoothGattDescriptor bluetoothGattDescriptor) {
        Objects.requireNonNull(bluetoothGattDescriptor, P);
        if (D0()) {
            wh.b.e(T, new Object[0]);
            return false;
        }
        boolean add = this.f20627f.add(new j(bluetoothGattDescriptor));
        if (add) {
            B0();
        } else {
            wh.b.e("could not enqueue read descriptor command", new Object[0]);
        }
        return add;
    }

    public boolean I0() {
        if (D0()) {
            wh.b.e(T, new Object[0]);
            return false;
        } else if (Build.VERSION.SDK_INT < 26) {
            wh.b.e("setPreferredPhy requires Android 8.0 or newer", new Object[0]);
            return false;
        } else {
            boolean add = this.f20627f.add(new q());
            if (add) {
                B0();
            } else {
                wh.b.e("could not enqueue readyPhy command", new Object[0]);
            }
            return add;
        }
    }

    public boolean J0() {
        if (D0()) {
            wh.b.e(T, new Object[0]);
            return false;
        }
        boolean add = this.f20627f.add(new m());
        if (add) {
            B0();
        } else {
            wh.b.e("could not enqueue readRemoteRssi command", new Object[0]);
        }
        return add;
    }

    public final void K0() {
        this.f20622a.registerReceiver(this.f20646y, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
        this.f20622a.registerReceiver(this.f20647z, new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST"));
    }

    public boolean L0(@fh.g n nVar) {
        Objects.requireNonNull(nVar, S);
        if (D0()) {
            wh.b.e(T, new Object[0]);
            return false;
        }
        boolean add = this.f20627f.add(new o(nVar));
        if (add) {
            B0();
        } else {
            wh.b.e("could not enqueue request connection priority command", new Object[0]);
        }
        return add;
    }

    public final void M(@fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (Build.VERSION.SDK_INT < 24) {
            bluetoothGattCharacteristic.setWriteType(2);
        }
    }

    public boolean M0(int i10) {
        if (i10 < 23 || i10 > 517) {
            throw new IllegalArgumentException("mtu must be between 23 and 517");
        } else if (D0()) {
            wh.b.e(T, new Object[0]);
            return false;
        } else {
            boolean add = this.f20627f.add(new n(i10));
            if (add) {
                B0();
            } else {
                wh.b.e("could not enqueue requestMtu command", new Object[0]);
            }
            return add;
        }
    }

    public void N() {
        if (this.f20641t == 0) {
            this.f20633l.post(new d());
            return;
        }
        wh.b.e("peripheral '%s' not yet disconnected, will not connect", p0());
    }

    public final void N0() {
        this.f20636o = false;
        if (this.f20627f.peek() != null) {
            if (this.f20642u >= 2) {
                wh.b.b("max number of tries reached, not retrying operation anymore", new Object[0]);
                this.f20627f.poll();
            } else {
                this.f20637p = true;
            }
        }
        B0();
    }

    public void O() {
        if (this.f20628g == null) {
            wh.b.x("cannot cancel connection because no connection attempt is made yet", new Object[0]);
        } else if (this.f20641t != 0 && this.f20641t != 3) {
            P();
            int i10 = this.f20641t;
            d0();
            if (i10 == 1) {
                this.f20633l.postDelayed(new C0355f(), 50);
            }
        }
    }

    public final void O0(BluetoothGatt bluetoothGatt, boolean z10) throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = bluetoothGatt.getClass().getDeclaredField("mAutoConnect");
        declaredField.setAccessible(true);
        declaredField.setBoolean(bluetoothGatt, z10);
    }

    public final void P() {
        Runnable runnable = this.f20634m;
        if (runnable != null) {
            this.f20633l.removeCallbacks(runnable);
            this.f20634m = null;
        }
    }

    public void P0(@fh.g BluetoothDevice bluetoothDevice) {
        Objects.requireNonNull(bluetoothDevice, R);
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        this.f20624c = bluetoothDevice;
    }

    public final void Q() {
        Runnable runnable = this.f20635n;
        if (runnable != null) {
            this.f20633l.removeCallbacks(runnable);
            this.f20635n = null;
        }
    }

    public boolean Q0(@fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10) {
        byte[] bArr;
        Objects.requireNonNull(bluetoothGattCharacteristic, M);
        if (D0()) {
            wh.b.e(T, new Object[0]);
            return false;
        }
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(A);
        if (descriptor != null) {
            int properties = bluetoothGattCharacteristic.getProperties();
            if ((properties & 16) > 0) {
                bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
            } else if ((properties & 32) > 0) {
                bArr = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
            } else {
                throw new IllegalArgumentException(String.format("characteristic %s does not have notify or indicate property", new Object[]{bluetoothGattCharacteristic.getUuid()}));
            }
            if (!z10) {
                bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
            }
            boolean add = this.f20627f.add(new l(bluetoothGattCharacteristic, z10, bArr, descriptor));
            if (add) {
                B0();
            } else {
                wh.b.e("could not enqueue setNotify command", new Object[0]);
            }
            return add;
        }
        throw new IllegalArgumentException(String.format("could not get CCC descriptor for characteristic %s", new Object[]{bluetoothGattCharacteristic.getUuid()}));
    }

    public boolean R() {
        if (this.f20628g == null) {
            return false;
        }
        try {
            Method method = this.f20628g.getClass().getMethod("refresh", new Class[0]);
            if (method != null) {
                return ((Boolean) method.invoke(this.f20628g, new Object[0])).booleanValue();
            }
            return false;
        } catch (Exception unused) {
            wh.b.e("could not invoke refresh method", new Object[0]);
            return false;
        }
    }

    public boolean R0(@fh.g UUID uuid, @fh.g UUID uuid2, boolean z10) {
        Objects.requireNonNull(uuid, K);
        Objects.requireNonNull(uuid2, L);
        BluetoothGattCharacteristic j02 = j0(uuid, uuid2);
        if (j02 != null) {
            return Q0(j02, z10);
        }
        return false;
    }

    public final void S(boolean z10, @fh.g q qVar) {
        if (this.f20628g != null) {
            this.f20628g.close();
            this.f20628g = null;
        }
        this.f20627f.clear();
        this.f20636o = false;
        this.f20632k.clear();
        try {
            this.f20622a.unregisterReceiver(this.f20646y);
            this.f20622a.unregisterReceiver(this.f20647z);
        } catch (IllegalArgumentException unused) {
        }
        this.f20638q = false;
        if (z10) {
            this.f20625d.c(this, qVar);
        }
    }

    public void S0(@fh.g i iVar) {
        Objects.requireNonNull(iVar, Q);
        this.f20626e = iVar;
    }

    public final void T() {
        this.f20637p = false;
        this.f20627f.poll();
        this.f20636o = false;
        B0();
    }

    public boolean T0(@fh.g t tVar, @fh.g t tVar2, @fh.g s sVar) {
        Objects.requireNonNull(tVar);
        Objects.requireNonNull(tVar2);
        Objects.requireNonNull(sVar);
        if (D0()) {
            wh.b.e(T, new Object[0]);
            return false;
        } else if (Build.VERSION.SDK_INT < 26) {
            wh.b.e("setPreferredPhy requires Android 8.0 or newer", new Object[0]);
            return false;
        } else {
            boolean add = this.f20627f.add(new p(tVar, tVar2, sVar));
            if (add) {
                B0();
            } else {
                wh.b.e("could not enqueue setPreferredPhy command", new Object[0]);
            }
            return add;
        }
    }

    public void U() {
        if (this.f20641t == 0) {
            this.f20633l.postDelayed(new c(), 100);
            return;
        }
        wh.b.e("peripheral '%s' not yet disconnected, will not connect", p0());
    }

    public final void U0(@fh.g f fVar) {
        P();
        s sVar = new s(fVar);
        this.f20634m = sVar;
        this.f20633l.postDelayed(sVar, 35000);
    }

    public final BluetoothGatt V(BluetoothGattCallback bluetoothGattCallback, BluetoothDevice bluetoothDevice, boolean z10) {
        return bluetoothDevice.connectGatt(this.f20622a, z10, bluetoothGattCallback, 2);
    }

    public final void V0() {
        l i02 = i0();
        wh.b.i("connected to '%s' (%s) in %.1fs", p0(), i02, Float.valueOf(((float) (SystemClock.elapsedRealtime() - this.f20643v)) / 1000.0f));
        if (i02 == l.P || i02 == l.BONDED) {
            c0(s0(i02));
        } else if (i02 == l.BONDING) {
            wh.b.i("waiting for bonding to complete", new Object[0]);
        }
    }

    public final BluetoothGatt W(BluetoothDevice bluetoothDevice, boolean z10, BluetoothGattCallback bluetoothGattCallback) {
        if (bluetoothDevice == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24 || !z10) {
            return V(bluetoothGattCallback, bluetoothDevice, z10);
        }
        try {
            Object l02 = l0(m0());
            if (l02 == null) {
                wh.b.e("could not get iBluetoothGatt object", new Object[0]);
                return V(bluetoothGattCallback, bluetoothDevice, true);
            }
            BluetoothGatt a02 = a0(l02, bluetoothDevice);
            if (a02 == null) {
                wh.b.e("could not create BluetoothGatt object", new Object[0]);
                return V(bluetoothGattCallback, bluetoothDevice, true);
            }
            if (!X(bluetoothDevice, a02, bluetoothGattCallback, true)) {
                wh.b.i("connection using reflection failed, closing gatt", new Object[0]);
                a02.close();
            }
            return a02;
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            wh.b.e("error during reflection", new Object[0]);
            return V(bluetoothGattCallback, bluetoothDevice, true);
        }
    }

    public final void W0(int i10) {
        if (i10 == 2 || i10 == 3) {
            wh.b.i("disconnected '%s' on request", p0());
        } else if (i10 == 1) {
            wh.b.i("cancelling connect attempt", new Object[0]);
        }
        if (this.f20638q) {
            S(false, q.SUCCESS);
            this.f20623b.postDelayed(new v(), 1000);
            return;
        }
        S(true, q.SUCCESS);
    }

    public final boolean X(BluetoothDevice bluetoothDevice, BluetoothGatt bluetoothGatt, BluetoothGattCallback bluetoothGattCallback, boolean z10) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        O0(bluetoothGatt, z10);
        Method declaredMethod = bluetoothGatt.getClass().getDeclaredMethod(od.e.f21426m, new Class[]{Boolean.class, BluetoothGattCallback.class});
        declaredMethod.setAccessible(true);
        return ((Boolean) declaredMethod.invoke(bluetoothGatt, new Object[]{Boolean.TRUE, bluetoothGattCallback})).booleanValue();
    }

    public final boolean X0(@fh.g byte[] bArr, @fh.g x xVar) {
        return bArr.length > this.f20644w + -3 && xVar == x.WITH_RESPONSE;
    }

    public final void Y(@fh.g q qVar, int i10, int i11) {
        Q();
        boolean z10 = !t0().isEmpty();
        if (i10 == 1) {
            boolean z11 = SystemClock.elapsedRealtime() - this.f20643v > ((long) v0());
            if (qVar == q.ERROR && z11) {
                qVar = q.CONNECTION_FAILED_ESTABLISHMENT;
            }
            wh.b.i("connection failed with status '%s'", qVar);
        } else if (i10 == 2 && i11 == 0 && !z10) {
            wh.b.i("peripheral '%s' disconnected with status '%s' (%d) before completing service discovery", p0(), qVar, Integer.valueOf(qVar.O));
        } else {
            Object[] objArr = new Object[3];
            if (i11 == 0) {
                objArr[0] = p0();
                objArr[1] = qVar;
                objArr[2] = Integer.valueOf(qVar.O);
                wh.b.i("peripheral '%s' disconnected with status '%s' (%d)", objArr);
            } else {
                objArr[0] = p0();
                objArr[1] = qVar;
                objArr[2] = Integer.valueOf(qVar.O);
                wh.b.i("unexpected connection state change for '%s' status '%s' (%d)", objArr);
            }
            S(true, qVar);
            return;
        }
        S(false, qVar);
        this.f20625d.b(this, qVar);
    }

    public boolean Y0(@fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic, @fh.g byte[] bArr, @fh.g x xVar) {
        Objects.requireNonNull(bluetoothGattCharacteristic, M);
        Objects.requireNonNull(bArr, O);
        Objects.requireNonNull(xVar, N);
        if (D0()) {
            wh.b.e(T, new Object[0]);
            return false;
        } else if (bArr.length == 0) {
            throw new IllegalArgumentException(U);
        } else if (bArr.length > n0(xVar)) {
            throw new IllegalArgumentException(V);
        } else if (!g0(bluetoothGattCharacteristic, xVar)) {
            boolean add = this.f20627f.add(new i(Z(bArr), bluetoothGattCharacteristic, xVar));
            if (add) {
                B0();
            } else {
                wh.b.e("could not enqueue write characteristic command", new Object[0]);
            }
            return add;
        } else {
            throw new IllegalArgumentException(String.format("characteristic <%s> does not support writeType '%s'", new Object[]{bluetoothGattCharacteristic.getUuid(), xVar}));
        }
    }

    @fh.g
    public byte[] Z(@fh.h byte[] bArr) {
        return bArr == null ? new byte[0] : Arrays.copyOf(bArr, bArr.length);
    }

    public boolean Z0(@fh.g UUID uuid, @fh.g UUID uuid2, @fh.g byte[] bArr, @fh.g x xVar) {
        Objects.requireNonNull(uuid, K);
        Objects.requireNonNull(uuid2, L);
        Objects.requireNonNull(bArr, O);
        Objects.requireNonNull(xVar, N);
        BluetoothGattCharacteristic j02 = j0(uuid, uuid2);
        if (j02 != null) {
            return Y0(j02, bArr, xVar);
        }
        return false;
    }

    public final BluetoothGatt a0(Object obj, BluetoothDevice bluetoothDevice) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Object newInstance;
        Constructor constructor = BluetoothGatt.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        if (constructor.getParameterTypes().length == 4) {
            newInstance = constructor.newInstance(new Object[]{this.f20622a, obj, bluetoothDevice, 2});
        } else {
            newInstance = constructor.newInstance(new Object[]{this.f20622a, obj, bluetoothDevice});
        }
        return (BluetoothGatt) newInstance;
    }

    public boolean a1(@fh.g BluetoothGattDescriptor bluetoothGattDescriptor, @fh.g byte[] bArr) {
        Objects.requireNonNull(bluetoothGattDescriptor, P);
        Objects.requireNonNull(bArr, O);
        if (D0()) {
            wh.b.e(T, new Object[0]);
            return false;
        } else if (bArr.length == 0) {
            throw new IllegalArgumentException(U);
        } else if (bArr.length <= n0(x.WITH_RESPONSE)) {
            boolean add = this.f20627f.add(new k(Z(bArr), bluetoothGattDescriptor));
            if (add) {
                B0();
            } else {
                wh.b.e("could not enqueue write descriptor command", new Object[0]);
            }
            return add;
        } else {
            throw new IllegalArgumentException(V);
        }
    }

    public boolean b0() {
        if (this.f20628g == null) {
            return this.f20624c.createBond();
        }
        boolean add = this.f20627f.add(new e());
        if (add) {
            B0();
        } else {
            wh.b.e("could not enqueue bonding command", new Object[0]);
        }
        return add;
    }

    public final void c0(long j10) {
        u uVar = new u(j10);
        this.f20635n = uVar;
        this.f20633l.postDelayed(uVar, j10);
    }

    public final void d0() {
        if (this.f20641t == 2 || this.f20641t == 1) {
            this.f20641t = 3;
            this.f20633l.post(new g());
            return;
        }
        this.f20625d.c(this, q.SUCCESS);
    }

    public void e0() {
        this.f20628g = null;
        S(true, q.SUCCESS);
    }

    public final boolean f0(@fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return (bluetoothGattCharacteristic.getProperties() & 2) == 0;
    }

    public final boolean g0(@fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic, @fh.g x xVar) {
        return (bluetoothGattCharacteristic.getProperties() & xVar.P) == 0;
    }

    @fh.g
    public String h0() {
        return this.f20624c.getAddress();
    }

    @fh.g
    public l i0() {
        return l.a(this.f20624c.getBondState());
    }

    @fh.h
    public BluetoothGattCharacteristic j0(@fh.g UUID uuid, @fh.g UUID uuid2) {
        Objects.requireNonNull(uuid, K);
        Objects.requireNonNull(uuid2, L);
        BluetoothGattService r02 = r0(uuid);
        if (r02 != null) {
            return r02.getCharacteristic(uuid2);
        }
        return null;
    }

    public int k0() {
        return this.f20644w;
    }

    public final Object l0(Object obj) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (obj == null) {
            return null;
        }
        return o0(obj.getClass(), "getBluetoothGatt").invoke(obj, new Object[0]);
    }

    public final Object m0() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return null;
        }
        return o0(defaultAdapter.getClass(), "getBluetoothManager").invoke(defaultAdapter, new Object[0]);
    }

    public int n0(@fh.g x xVar) {
        Objects.requireNonNull(xVar, "writetype is null");
        int i10 = t.f20650a[xVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f20644w - 3 : this.f20644w - 15;
        }
        return 512;
    }

    public final Method o0(Class<?> cls, String str) throws NoSuchMethodException {
        Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @fh.g
    public String p0() {
        String name = this.f20624c.getName();
        if (name == null) {
            return this.f20629h;
        }
        this.f20629h = name;
        return name;
    }

    @fh.g
    public Set<BluetoothGattCharacteristic> q0() {
        return Collections.unmodifiableSet(this.f20632k);
    }

    @fh.h
    public BluetoothGattService r0(@fh.g UUID uuid) {
        Objects.requireNonNull(uuid, K);
        if (this.f20628g != null) {
            return this.f20628g.getService(uuid);
        }
        return null;
    }

    public final long s0(@fh.g l lVar) {
        long j10 = Build.VERSION.SDK_INT <= 24 ? 1000 : 0;
        if (lVar == l.BONDED) {
            return j10;
        }
        return 0;
    }

    @fh.g
    public List<BluetoothGattService> t0() {
        return this.f20628g != null ? this.f20628g.getServices() : Collections.emptyList();
    }

    @fh.g
    public o u0() {
        return o.a(this.f20641t);
    }

    public final int v0() {
        if (Build.MANUFACTURER.equalsIgnoreCase(com.google.android.material.internal.e.f17193b)) {
            return G;
        }
        return 25000;
    }

    @fh.g
    public r w0() {
        return r.a(this.f20624c.getType());
    }

    public final void x0(int i10, int i11) {
        Runnable runnable;
        Handler handler;
        switch (i10) {
            case 10:
                if (i11 == 11) {
                    wh.b.e("bonding failed for '%s', disconnecting device", p0());
                    handler = this.f20623b;
                    runnable = new a0();
                } else {
                    wh.b.e("bond lost for '%s'", p0());
                    this.f20638q = true;
                    Q();
                    handler = this.f20623b;
                    runnable = new b0();
                }
                handler.post(runnable);
                d0();
                return;
            case 11:
                wh.b.b("starting bonding with '%s' (%s)", p0(), h0());
                this.f20623b.post(new x());
                return;
            case 12:
                wh.b.b("bonded with '%s' (%s)", p0(), h0());
                this.f20623b.post(new y());
                if (t0().isEmpty() && !this.f20640s) {
                    c0(0);
                }
                if (Build.VERSION.SDK_INT < 26 && this.f20636o && !this.f20639r) {
                    this.f20633l.postDelayed(new z(), 50);
                }
                if (this.f20639r) {
                    this.f20639r = false;
                    T();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final boolean y0() {
        return this.f20628g != null && this.f20641t == 2;
    }

    public boolean z0(@fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        Objects.requireNonNull(bluetoothGattCharacteristic, M);
        return this.f20632k.contains(bluetoothGattCharacteristic);
    }
}
