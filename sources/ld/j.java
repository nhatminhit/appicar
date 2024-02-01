package ld;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import fh.h;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class j {

    /* renamed from: r  reason: collision with root package name */
    public static final UUID f20652r = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: s  reason: collision with root package name */
    public static final String f20653s = "context is null";

    /* renamed from: t  reason: collision with root package name */
    public static final String f20654t = "BluetoothManager is null";

    /* renamed from: u  reason: collision with root package name */
    public static final String f20655u = "service is null";

    /* renamed from: v  reason: collision with root package name */
    public static final String f20656v = "characteristic is null";

    /* renamed from: w  reason: collision with root package name */
    public static final String f20657w = "device is null";

    /* renamed from: x  reason: collision with root package name */
    public static final String f20658x = "characteristic value is null";

    /* renamed from: y  reason: collision with root package name */
    public static final String f20659y = "central is null";

    /* renamed from: z  reason: collision with root package name */
    public static final String f20660z = "address is null";
    @fh.g

    /* renamed from: a  reason: collision with root package name */
    public final Context f20661a;
    @fh.g

    /* renamed from: b  reason: collision with root package name */
    public final Handler f20662b = new Handler(Looper.getMainLooper());
    @fh.g

    /* renamed from: c  reason: collision with root package name */
    public final BluetoothManager f20663c;
    @fh.g

    /* renamed from: d  reason: collision with root package name */
    public final BluetoothAdapter f20664d;
    @fh.g

    /* renamed from: e  reason: collision with root package name */
    public final BluetoothLeAdvertiser f20665e;
    @fh.g

    /* renamed from: f  reason: collision with root package name */
    public final BluetoothGattServer f20666f;
    @fh.g

    /* renamed from: g  reason: collision with root package name */
    public final k f20667g;
    @fh.g

    /* renamed from: h  reason: collision with root package name */
    public final Queue<Runnable> f20668h = new ConcurrentLinkedQueue();
    @fh.g

    /* renamed from: i  reason: collision with root package name */
    public final HashMap<BluetoothGattCharacteristic, byte[]> f20669i = new HashMap<>();
    @fh.g

    /* renamed from: j  reason: collision with root package name */
    public final HashMap<BluetoothGattDescriptor, byte[]> f20670j = new HashMap<>();
    @fh.g

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, c> f20671k = new ConcurrentHashMap();
    @h

    /* renamed from: l  reason: collision with root package name */
    public BluetoothGattCharacteristic f20672l = null;
    @fh.g

    /* renamed from: m  reason: collision with root package name */
    public byte[] f20673m = new byte[0];

    /* renamed from: n  reason: collision with root package name */
    public volatile boolean f20674n = false;

    /* renamed from: o  reason: collision with root package name */
    public final BluetoothGattServerCallback f20675o;

    /* renamed from: p  reason: collision with root package name */
    public final AdvertiseCallback f20676p;

    /* renamed from: q  reason: collision with root package name */
    public final BroadcastReceiver f20677q;

    public class a extends BluetoothGattServerCallback {

        /* renamed from: ld.j$a$a  reason: collision with other inner class name */
        public class C0356a implements Runnable {
            public final /* synthetic */ c O;

            public C0356a(c cVar) {
                this.O = cVar;
            }

            public void run() {
                j.this.f20667g.d(this.O);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ c O;

            public b(c cVar) {
                this.O = cVar;
            }

            public void run() {
                j.this.f20667g.e(this.O);
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ int O;
            public final /* synthetic */ BluetoothGattService P;

            public c(int i10, BluetoothGattService bluetoothGattService) {
                this.O = i10;
                this.P = bluetoothGattService;
            }

            public void run() {
                j.this.f20667g.m(p.a(this.O), this.P);
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ int O;
            public final /* synthetic */ c P;
            public final /* synthetic */ BluetoothGattCharacteristic Q;
            public final /* synthetic */ BluetoothDevice R;
            public final /* synthetic */ int S;

            public d(int i10, c cVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothDevice bluetoothDevice, int i11) {
                this.O = i10;
                this.P = cVar;
                this.Q = bluetoothGattCharacteristic;
                this.R = bluetoothDevice;
                this.S = i11;
            }

            public void run() {
                if (this.O == 0) {
                    j.this.f20667g.f(this.P, this.Q);
                }
                j jVar = j.this;
                j.this.f20666f.sendResponse(this.R, this.S, 0, this.O, jVar.z(jVar.I(this.Q.getValue()), this.O, this.P.b() - 1));
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ boolean O;
            public final /* synthetic */ c P;
            public final /* synthetic */ BluetoothGattCharacteristic Q;
            public final /* synthetic */ byte[] R;
            public final /* synthetic */ int S;
            public final /* synthetic */ boolean T;
            public final /* synthetic */ BluetoothDevice U;
            public final /* synthetic */ int V;

            public e(boolean z10, c cVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i10, boolean z11, BluetoothDevice bluetoothDevice, int i11) {
                this.O = z10;
                this.P = cVar;
                this.Q = bluetoothGattCharacteristic;
                this.R = bArr;
                this.S = i10;
                this.T = z11;
                this.U = bluetoothDevice;
                this.V = i11;
            }

            public void run() {
                p pVar = p.SUCCESS;
                if (!this.O) {
                    p g10 = j.this.f20667g.g(this.P, this.Q, this.R);
                    if (g10 == pVar) {
                        this.Q.setValue(this.R);
                    }
                    pVar = g10;
                } else if (this.S == 0) {
                    j.this.f20669i.put(this.Q, this.R);
                } else {
                    byte[] bArr = (byte[]) j.this.f20669i.get(this.Q);
                    if (bArr == null || this.S != bArr.length) {
                        pVar = p.INVALID_OFFSET;
                    } else {
                        j.this.f20669i.put(this.Q, b.w(bArr, this.R));
                    }
                }
                if (this.T) {
                    j.this.f20666f.sendResponse(this.U, this.V, pVar.O, this.S, this.R);
                }
            }
        }

        public class f implements Runnable {
            public final /* synthetic */ int O;
            public final /* synthetic */ c P;
            public final /* synthetic */ BluetoothGattDescriptor Q;
            public final /* synthetic */ BluetoothDevice R;
            public final /* synthetic */ int S;

            public f(int i10, c cVar, BluetoothGattDescriptor bluetoothGattDescriptor, BluetoothDevice bluetoothDevice, int i11) {
                this.O = i10;
                this.P = cVar;
                this.Q = bluetoothGattDescriptor;
                this.R = bluetoothDevice;
                this.S = i11;
            }

            public void run() {
                if (this.O == 0) {
                    j.this.f20667g.h(this.P, this.Q);
                }
                j jVar = j.this;
                j.this.f20666f.sendResponse(this.R, this.S, 0, this.O, jVar.z(jVar.I(this.Q.getValue()), this.O, this.P.b() - 1));
            }
        }

        public class g implements Runnable {
            public final /* synthetic */ BluetoothGattDescriptor O;
            public final /* synthetic */ byte[] P;
            public final /* synthetic */ BluetoothGattCharacteristic Q;
            public final /* synthetic */ boolean R;
            public final /* synthetic */ c S;
            public final /* synthetic */ int T;
            public final /* synthetic */ boolean U;
            public final /* synthetic */ BluetoothDevice V;
            public final /* synthetic */ int W;

            public g(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10, c cVar, int i10, boolean z11, BluetoothDevice bluetoothDevice, int i11) {
                this.O = bluetoothGattDescriptor;
                this.P = bArr;
                this.Q = bluetoothGattCharacteristic;
                this.R = z10;
                this.S = cVar;
                this.T = i10;
                this.U = z11;
                this.V = bluetoothDevice;
                this.W = i11;
            }

            public void run() {
                p pVar;
                p pVar2 = p.SUCCESS;
                UUID uuid = this.O.getUuid();
                UUID uuid2 = j.f20652r;
                if (uuid.equals(uuid2)) {
                    pVar = a.this.b(this.P, this.Q);
                } else if (!this.R) {
                    pVar = j.this.f20667g.i(this.S, this.O, this.P);
                } else {
                    if (this.T == 0) {
                        j.this.f20670j.put(this.O, this.P);
                    } else {
                        byte[] bArr = (byte[]) j.this.f20670j.get(this.O);
                        if (bArr == null || this.T != bArr.length) {
                            pVar = p.INVALID_OFFSET;
                        } else {
                            j.this.f20670j.put(this.O, b.w(bArr, this.P));
                        }
                    }
                    pVar = pVar2;
                }
                if (pVar == pVar2 && !this.R) {
                    this.O.setValue(this.P);
                }
                if (this.U) {
                    j.this.f20666f.sendResponse(this.V, this.W, pVar.O, this.T, this.P);
                }
                if (pVar == pVar2 && this.O.getUuid().equals(uuid2)) {
                    if (Arrays.equals(this.P, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE) || Arrays.equals(this.P, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE)) {
                        wh.b.i("notifying enabled for <%s>", this.Q.getUuid());
                        j.this.f20667g.l(this.S, this.Q);
                        return;
                    }
                    wh.b.i("notifying disabled for <%s>", this.Q.getUuid());
                    j.this.f20667g.k(this.S, this.Q);
                }
            }
        }

        public class h implements Runnable {
            public final /* synthetic */ c O;
            public final /* synthetic */ BluetoothDevice P;
            public final /* synthetic */ int Q;

            public h(c cVar, BluetoothDevice bluetoothDevice, int i10) {
                this.O = cVar;
                this.P = bluetoothDevice;
                this.Q = i10;
            }

            public void run() {
                p pVar;
                HashMap hashMap;
                BluetoothGattDescriptor bluetoothGattDescriptor;
                p pVar2 = p.SUCCESS;
                if (!j.this.f20669i.isEmpty()) {
                    BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) j.this.f20669i.keySet().iterator().next();
                    if (bluetoothGattCharacteristic != null) {
                        pVar = j.this.f20667g.g(this.O, bluetoothGattCharacteristic, (byte[]) j.this.f20669i.get(bluetoothGattCharacteristic));
                        if (pVar == pVar2) {
                            bluetoothGattCharacteristic.setValue((byte[]) j.this.f20669i.get(bluetoothGattCharacteristic));
                            hashMap = j.this.f20669i;
                        }
                        pVar2 = pVar;
                    }
                    j.this.f20666f.sendResponse(this.P, this.Q, pVar2.O, 0, (byte[]) null);
                }
                if (!j.this.f20670j.isEmpty() && (bluetoothGattDescriptor = (BluetoothGattDescriptor) j.this.f20670j.keySet().iterator().next()) != null) {
                    pVar = j.this.f20667g.i(this.O, bluetoothGattDescriptor, (byte[]) j.this.f20670j.get(bluetoothGattDescriptor));
                    if (pVar == pVar2) {
                        bluetoothGattDescriptor.setValue((byte[]) j.this.f20670j.get(bluetoothGattDescriptor));
                        hashMap = j.this.f20670j;
                    }
                    pVar2 = pVar;
                }
                j.this.f20666f.sendResponse(this.P, this.Q, pVar2.O, 0, (byte[]) null);
                hashMap.clear();
                pVar2 = pVar;
                j.this.f20666f.sendResponse(this.P, this.Q, pVar2.O, 0, (byte[]) null);
            }
        }

        public class i implements Runnable {
            public final /* synthetic */ c O;
            public final /* synthetic */ byte[] P;
            public final /* synthetic */ BluetoothGattCharacteristic Q;
            public final /* synthetic */ int R;

            public i(c cVar, byte[] bArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
                this.O = cVar;
                this.P = bArr;
                this.Q = bluetoothGattCharacteristic;
                this.R = i10;
            }

            public void run() {
                j.this.f20667g.j(this.O, this.P, this.Q, p.a(this.R));
            }
        }

        public a() {
        }

        public final p b(@fh.g byte[] bArr, @fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            p pVar = p.SUCCESS;
            return bArr.length != 2 ? p.INVALID_ATTRIBUTE_VALUE_LENGTH : (Arrays.equals(bArr, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE) || Arrays.equals(bArr, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) || Arrays.equals(bArr, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) ? ((j.this.R(bluetoothGattCharacteristic) || !Arrays.equals(bArr, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE)) && (j.this.S(bluetoothGattCharacteristic) || !Arrays.equals(bArr, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE))) ? pVar : p.REQUEST_NOT_SUPPORTED : p.VALUE_NOT_ALLOWED;
        }

        public final void c(@fh.g BluetoothDevice bluetoothDevice) {
            wh.b.i("Central '%s' (%s) connected", bluetoothDevice.getName(), bluetoothDevice.getAddress());
            c cVar = new c(bluetoothDevice.getAddress(), bluetoothDevice.getName());
            j.this.f20671k.put(cVar.a(), cVar);
            j.this.f20662b.post(new C0356a(cVar));
        }

        public final void d(@fh.g BluetoothDevice bluetoothDevice) {
            c m10 = j.this.B(bluetoothDevice);
            wh.b.i("Central '%s' (%s) disconnected", m10.d(), m10.a());
            j.this.f20662b.post(new b(m10));
            j.this.O(bluetoothDevice);
        }

        public void onCharacteristicReadRequest(@fh.g BluetoothDevice bluetoothDevice, int i10, int i11, @fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            wh.b.i("read request for characteristic <%s> with offset %d", bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i11));
            j.this.f20662b.post(new d(i11, j.this.B(bluetoothDevice), bluetoothGattCharacteristic, bluetoothDevice, i10));
        }

        public void onCharacteristicWriteRequest(@fh.g BluetoothDevice bluetoothDevice, int i10, @fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10, boolean z11, int i11, @fh.h byte[] bArr) {
            Object[] objArr = new Object[4];
            objArr[0] = z11 ? "WITH_RESPONSE" : "WITHOUT_RESPONSE";
            objArr[1] = b.a(bArr);
            objArr[2] = Integer.valueOf(i11);
            objArr[3] = bluetoothGattCharacteristic.getUuid();
            wh.b.i("write characteristic %s request <%s> offset %d for <%s>", objArr);
            boolean z12 = z10;
            j.this.f20662b.post(new e(z12, j.this.B(bluetoothDevice), bluetoothGattCharacteristic, j.this.I(bArr), i11, z11, bluetoothDevice, i10));
        }

        public void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i10, int i11) {
            if (i10 != 0) {
                wh.b.i("Device '%s' disconnected with status %d", bluetoothDevice.getName(), Integer.valueOf(i10));
            } else if (i11 == 2) {
                if (!j.this.f20671k.containsKey(bluetoothDevice.getAddress())) {
                    j.this.f20666f.connect(bluetoothDevice, false);
                    c(bluetoothDevice);
                    return;
                }
                return;
            } else if (i11 != 0 || !j.this.f20671k.containsKey(bluetoothDevice.getAddress())) {
                return;
            }
            d(bluetoothDevice);
        }

        public void onDescriptorReadRequest(@fh.g BluetoothDevice bluetoothDevice, int i10, int i11, @fh.g BluetoothGattDescriptor bluetoothGattDescriptor) {
            wh.b.i("read request for descriptor <%s> with offset %d", bluetoothGattDescriptor.getUuid(), Integer.valueOf(i11));
            j.this.f20662b.post(new f(i11, j.this.B(bluetoothDevice), bluetoothGattDescriptor, bluetoothDevice, i10));
        }

        public void onDescriptorWriteRequest(@fh.g BluetoothDevice bluetoothDevice, int i10, @fh.g BluetoothGattDescriptor bluetoothGattDescriptor, boolean z10, boolean z11, int i11, @fh.h byte[] bArr) {
            byte[] p10 = j.this.I(bArr);
            BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
            Objects.requireNonNull(characteristic, "Descriptor does not have characteristic");
            BluetoothGattCharacteristic bluetoothGattCharacteristic = characteristic;
            Object[] objArr = new Object[4];
            objArr[0] = z11 ? "WITH_RESPONSE" : "WITHOUT_RESPONSE";
            objArr[1] = b.a(bArr);
            objArr[2] = Integer.valueOf(i11);
            objArr[3] = bluetoothGattDescriptor.getUuid();
            wh.b.i("write descriptor %s request <%s> offset %d for <%s>", objArr);
            j.this.f20662b.post(new g(bluetoothGattDescriptor, p10, characteristic, z10, j.this.B(bluetoothDevice), i11, z11, bluetoothDevice, i10));
        }

        public void onExecuteWrite(@fh.g BluetoothDevice bluetoothDevice, int i10, boolean z10) {
            c m10 = j.this.B(bluetoothDevice);
            if (z10) {
                j.this.f20662b.post(new h(m10, bluetoothDevice, i10));
                return;
            }
            j.this.f20669i.clear();
            j.this.f20670j.clear();
            j.this.f20666f.sendResponse(bluetoothDevice, i10, p.SUCCESS.O, 0, (byte[]) null);
        }

        public void onMtuChanged(@fh.g BluetoothDevice bluetoothDevice, int i10) {
            wh.b.i("new MTU: %d", Integer.valueOf(i10));
            j.this.B(bluetoothDevice).e(i10);
        }

        public void onNotificationSent(@fh.g BluetoothDevice bluetoothDevice, int i10) {
            c m10 = j.this.B(bluetoothDevice);
            BluetoothGattCharacteristic f10 = j.this.f20672l;
            Objects.requireNonNull(f10);
            BluetoothGattCharacteristic bluetoothGattCharacteristic = f10;
            byte[] h10 = j.this.f20673m;
            Objects.requireNonNull(h10);
            byte[] unused = j.this.f20673m = new byte[0];
            j.this.f20662b.post(new i(m10, h10, f10, i10));
            j.this.x();
        }

        public void onPhyRead(@fh.g BluetoothDevice bluetoothDevice, int i10, int i11, int i12) {
            super.onPhyRead(bluetoothDevice, i10, i11, i12);
        }

        public void onPhyUpdate(@fh.g BluetoothDevice bluetoothDevice, int i10, int i11, int i12) {
            super.onPhyUpdate(bluetoothDevice, i10, i11, i12);
        }

        public void onServiceAdded(int i10, @fh.g BluetoothGattService bluetoothGattService) {
            j.this.f20662b.post(new c(i10, bluetoothGattService));
            j.this.x();
        }
    }

    public class b extends AdvertiseCallback {

        public class a implements Runnable {
            public final /* synthetic */ AdvertiseSettings O;

            public a(AdvertiseSettings advertiseSettings) {
                this.O = advertiseSettings;
            }

            public void run() {
                j.this.f20667g.b(this.O);
            }
        }

        /* renamed from: ld.j$b$b  reason: collision with other inner class name */
        public class C0357b implements Runnable {
            public final /* synthetic */ a O;

            public C0357b(a aVar) {
                this.O = aVar;
            }

            public void run() {
                j.this.f20667g.a(this.O);
            }
        }

        public b() {
        }

        public void onStartFailure(int i10) {
            a a10 = a.a(i10);
            wh.b.e("advertising failed with error '%s'", a10);
            j.this.f20662b.post(new C0357b(a10));
        }

        public void onStartSuccess(@fh.g AdvertiseSettings advertiseSettings) {
            wh.b.i("advertising started", new Object[0]);
            j.this.f20662b.post(new a(advertiseSettings));
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            j.this.f20667g.c();
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ BluetoothGattService O;

        public d(BluetoothGattService bluetoothGattService) {
            this.O = bluetoothGattService;
        }

        public void run() {
            if (!j.this.f20666f.addService(this.O)) {
                wh.b.e("adding service %s failed", this.O.getUuid());
                j.this.x();
            }
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ byte[] O;
        public final /* synthetic */ BluetoothGattCharacteristic P;
        public final /* synthetic */ BluetoothDevice Q;
        public final /* synthetic */ boolean R;

        public e(byte[] bArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothDevice bluetoothDevice, boolean z10) {
            this.O = bArr;
            this.P = bluetoothGattCharacteristic;
            this.Q = bluetoothDevice;
            this.R = z10;
        }

        public void run() {
            byte[] unused = j.this.f20673m = this.O;
            BluetoothGattCharacteristic unused2 = j.this.f20672l = this.P;
            this.P.setValue(this.O);
            if (!j.this.f20666f.notifyCharacteristicChanged(this.Q, this.P, this.R)) {
                wh.b.e("notifying characteristic changed failed for <%s>", this.P.getUuid());
                j.this.x();
            }
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ Runnable O;

        public f(Runnable runnable) {
            this.O = runnable;
        }

        public void run() {
            try {
                this.O.run();
            } catch (Exception e10) {
                wh.b.g(e10, "command exception", new Object[0]);
                j.this.x();
            }
        }
    }

    public class g extends BroadcastReceiver {
        public g() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                j.this.G(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE));
            }
        }
    }

    public j(@fh.g Context context, @fh.g BluetoothManager bluetoothManager, @fh.g k kVar) {
        a aVar = new a();
        this.f20675o = aVar;
        this.f20676p = new b();
        g gVar = new g();
        this.f20677q = gVar;
        Objects.requireNonNull(context, f20653s);
        Context context2 = context;
        this.f20661a = context;
        Objects.requireNonNull(kVar, "Callback is null");
        this.f20667g = kVar;
        Objects.requireNonNull(bluetoothManager, f20654t);
        BluetoothManager bluetoothManager2 = bluetoothManager;
        this.f20663c = bluetoothManager;
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f20664d = adapter;
        this.f20665e = adapter.getBluetoothLeAdvertiser();
        this.f20666f = bluetoothManager.openGattServer(context, aVar);
        context.registerReceiver(gVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    public final boolean A(@fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return !R(bluetoothGattCharacteristic) && !S(bluetoothGattCharacteristic);
    }

    @fh.g
    public final c B(@fh.g BluetoothDevice bluetoothDevice) {
        Objects.requireNonNull(bluetoothDevice, f20657w);
        c cVar = this.f20671k.get(bluetoothDevice.getAddress());
        return cVar == null ? new c(bluetoothDevice.getAddress(), bluetoothDevice.getName()) : cVar;
    }

    @h
    public c C(@fh.g String str) {
        Objects.requireNonNull(str, f20660z);
        return this.f20671k.get(str);
    }

    @fh.g
    public Set<c> D() {
        return Collections.unmodifiableSet(new HashSet(this.f20671k.values()));
    }

    @fh.g
    public final List<BluetoothDevice> E() {
        return this.f20663c.getConnectedDevices(7);
    }

    @fh.g
    public List<BluetoothGattService> F() {
        return this.f20666f.getServices();
    }

    public final void G(int i10) {
        switch (i10) {
            case 10:
                wh.b.b("bluetooth turned off", new Object[0]);
                t();
                return;
            case 11:
                wh.b.b("bluetooth turning on", new Object[0]);
                return;
            case 12:
                wh.b.b("bluetooth turned on", new Object[0]);
                return;
            case 13:
                wh.b.b("bluetooth turning off", new Object[0]);
                return;
            default:
                return;
        }
    }

    public final void H() {
        synchronized (this) {
            if (!this.f20674n) {
                Runnable peek = this.f20668h.peek();
                if (peek != null) {
                    this.f20674n = true;
                    this.f20662b.post(new f(peek));
                }
            }
        }
    }

    @fh.g
    public final byte[] I(@h byte[] bArr) {
        return bArr == null ? new byte[0] : bArr;
    }

    public final boolean J(@fh.g byte[] bArr, @fh.g BluetoothDevice bluetoothDevice, @fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        Objects.requireNonNull(bArr, f20658x);
        Objects.requireNonNull(bluetoothDevice, f20657w);
        Objects.requireNonNull(bluetoothGattCharacteristic, f20656v);
        Objects.requireNonNull(bluetoothGattCharacteristic.getValue(), f20658x);
        if (A(bluetoothGattCharacteristic)) {
            return false;
        }
        boolean add = this.f20668h.add(new e(bArr, bluetoothGattCharacteristic, bluetoothDevice, R(bluetoothGattCharacteristic)));
        if (add) {
            H();
        } else {
            wh.b.e("could not enqueue notify command", new Object[0]);
        }
        return add;
    }

    public boolean K(@fh.g byte[] bArr, @fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        Objects.requireNonNull(bArr, f20658x);
        Objects.requireNonNull(bluetoothGattCharacteristic, f20656v);
        if (A(bluetoothGattCharacteristic)) {
            return false;
        }
        boolean z10 = true;
        for (BluetoothDevice J : E()) {
            if (!J(y(bArr), J, bluetoothGattCharacteristic)) {
                z10 = false;
            }
        }
        return z10;
    }

    public void L() {
        wh.b.i("advertising stopped", new Object[0]);
        this.f20662b.post(new c());
    }

    public boolean M(@fh.g BluetoothGattService bluetoothGattService) {
        Objects.requireNonNull(bluetoothGattService, f20655u);
        return this.f20666f.removeService(bluetoothGattService);
    }

    public void N() {
        this.f20666f.clearServices();
    }

    public final void O(@fh.g BluetoothDevice bluetoothDevice) {
        Objects.requireNonNull(bluetoothDevice, f20657w);
        this.f20671k.remove(bluetoothDevice.getAddress());
    }

    public void P(@fh.g AdvertiseSettings advertiseSettings, @fh.g AdvertiseData advertiseData, @fh.g AdvertiseData advertiseData2) {
        if (!this.f20664d.isMultipleAdvertisementSupported()) {
            wh.b.e("device does not support advertising", new Object[0]);
        } else {
            this.f20665e.startAdvertising(advertiseSettings, advertiseData, advertiseData2, this.f20676p);
        }
    }

    public void Q() {
        this.f20665e.stopAdvertising(this.f20676p);
        L();
    }

    public final boolean R(@fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return (bluetoothGattCharacteristic.getProperties() & 32) > 0;
    }

    public final boolean S(@fh.g BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return (bluetoothGattCharacteristic.getProperties() & 16) > 0;
    }

    public boolean s(@fh.g BluetoothGattService bluetoothGattService) {
        Objects.requireNonNull(bluetoothGattService, f20655u);
        boolean add = this.f20668h.add(new d(bluetoothGattService));
        if (add) {
            H();
        } else {
            wh.b.e("could not enqueue add service command", new Object[0]);
        }
        return add;
    }

    public final void t() {
        for (c a10 : D()) {
            this.f20675o.onConnectionStateChange(this.f20664d.getRemoteDevice(a10.a()), 0, 0);
        }
        L();
    }

    public final void u(@fh.g BluetoothDevice bluetoothDevice) {
        Objects.requireNonNull(bluetoothDevice, f20657w);
        wh.b.i("cancelConnection with '%s' (%s)", bluetoothDevice.getName(), bluetoothDevice.getAddress());
        this.f20666f.cancelConnection(bluetoothDevice);
    }

    public void v(@fh.g c cVar) {
        Objects.requireNonNull(cVar, f20659y);
        u(this.f20664d.getRemoteDevice(cVar.a()));
    }

    public void w() {
        Q();
        this.f20661a.unregisterReceiver(this.f20677q);
        this.f20666f.close();
    }

    public final void x() {
        this.f20668h.poll();
        this.f20674n = false;
        H();
    }

    @fh.g
    public byte[] y(@h byte[] bArr) {
        return bArr == null ? new byte[0] : Arrays.copyOf(bArr, bArr.length);
    }

    @fh.g
    public final byte[] z(@fh.g byte[] bArr, int i10, int i11) {
        return bArr.length > i11 ? Arrays.copyOfRange(bArr, i10, Math.min(bArr.length - i10, i11) + i10) : Arrays.copyOf(bArr, bArr.length);
    }
}
