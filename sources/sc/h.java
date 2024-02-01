package sc;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import ld.d;
import ld.f;

public abstract class h extends BluetoothGattCallback {
    public static final String A = "I3C";
    public static final String B = "IP24";
    public static String C = "C39X";
    public static h D = null;

    /* renamed from: w  reason: collision with root package name */
    public static final String f22890w = "BLESocket";

    /* renamed from: x  reason: collision with root package name */
    public static final int f22891x = 512;

    /* renamed from: y  reason: collision with root package name */
    public static final int f22892y = 23;

    /* renamed from: z  reason: collision with root package name */
    public static final String f22893z = "C39X";

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<byte[]> f22894a;

    /* renamed from: b  reason: collision with root package name */
    public final IntentFilter f22895b;

    /* renamed from: c  reason: collision with root package name */
    public Context f22896c;

    /* renamed from: d  reason: collision with root package name */
    public b f22897d;

    /* renamed from: e  reason: collision with root package name */
    public BluetoothManager f22898e;

    /* renamed from: f  reason: collision with root package name */
    public BluetoothAdapter f22899f;

    /* renamed from: g  reason: collision with root package name */
    public a f22900g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22901h;

    /* renamed from: i  reason: collision with root package name */
    public k f22902i;

    /* renamed from: j  reason: collision with root package name */
    public BluetoothDevice f22903j;

    /* renamed from: k  reason: collision with root package name */
    public BluetoothGatt f22904k;

    /* renamed from: l  reason: collision with root package name */
    public BluetoothGattCharacteristic f22905l;

    /* renamed from: m  reason: collision with root package name */
    public BluetoothGattCharacteristic f22906m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f22907n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f22908o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f22909p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f22910q = false;

    /* renamed from: r  reason: collision with root package name */
    public int f22911r = 8;

    /* renamed from: s  reason: collision with root package name */
    public int f22912s = 20;
    @SuppressLint({"MissingPermission"})

    /* renamed from: t  reason: collision with root package name */
    public BluetoothAdapter.LeScanCallback f22913t = new d(this);

    /* renamed from: u  reason: collision with root package name */
    public d f22914u;

    /* renamed from: v  reason: collision with root package name */
    public f f22915v;

    public class b extends k {
        public b() {
        }

        public boolean b(BluetoothGattService bluetoothGattService, BluetoothGattService bluetoothGattService2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("connectCharacteristics");
            sb2.append(h.this.u());
            h hVar = h.this;
            BluetoothGattCharacteristic unused = hVar.f22905l = bluetoothGattService.getCharacteristic(UUID.fromString(hVar.s()));
            h hVar2 = h.this;
            BluetoothGattCharacteristic unused2 = hVar2.f22906m = bluetoothGattService2.getCharacteristic(UUID.fromString(hVar2.u()));
            return true;
        }
    }

    public h(Context context) {
        this.f22896c = context;
        this.f22894a = new ArrayList<>();
        IntentFilter intentFilter = new IntentFilter();
        this.f22895b = intentFilter;
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
        a aVar;
        if (bluetoothDevice.getType() == 2 && (aVar = this.f22900g) != null) {
            aVar.b(new i(bluetoothDevice.getName(), bluetoothDevice.getAddress()));
        }
    }

    public static h h(Context context) {
        h hVar = D;
        return hVar != null ? hVar : i(context, C);
    }

    public static h i(Context context, String str) {
        if (D != null) {
            D.r();
        }
        char c10 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 71801) {
            if (hashCode != 2046863) {
                if (hashCode == 2253225 && str.equals(B)) {
                    c10 = 1;
                }
            } else if (str.equals(f22893z)) {
                c10 = 2;
            }
        } else if (str.equals(A)) {
            c10 = 0;
        }
        D = c10 != 0 ? c10 != 1 ? new j(context) : new m(context) : new l(context);
        return D;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.f22904k.connect();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y() {
        new Handler().postDelayed(new c(this), 1000);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f22904k.disconnect();
    }

    public final void C() {
        this.f22909p = true;
        b bVar = this.f22897d;
        if (bVar != null) {
            bVar.c();
        }
    }

    public final void D(Exception exc) {
        this.f22908o = true;
        this.f22909p = false;
        b bVar = this.f22897d;
        if (bVar != null) {
            bVar.a(exc);
        }
        k();
    }

    public final void E(Exception exc) {
        this.f22907n = false;
        this.f22908o = true;
        b bVar = this.f22897d;
        if (bVar != null) {
            bVar.b(exc);
        }
        k();
    }

    public final void F(byte[] bArr) {
        b bVar = this.f22897d;
        if (bVar != null) {
            bVar.e(bArr);
        }
    }

    @SuppressLint({"MissingPermission"})
    public void G(int i10, a aVar) {
        this.f22900g = aVar;
        Context context = this.f22896c;
        if (context != null) {
            if (this.f22898e == null) {
                BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
                this.f22898e = bluetoothManager;
                this.f22899f = bluetoothManager.getAdapter();
            }
            B();
            new Handler().postDelayed(new e(this), (long) i10);
            this.f22910q = true;
            this.f22899f.startLeScan(this.f22913t);
        }
    }

    public void H(a aVar) {
        G(this.f22911r, aVar);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: I */
    public void B() {
        this.f22910q = false;
        BluetoothAdapter bluetoothAdapter = this.f22899f;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.stopLeScan(this.f22913t);
        }
        a aVar = this.f22900g;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void J(String str) throws IOException {
        K(tc.a.n(str));
    }

    @SuppressLint({"MissingPermission"})
    public void K(byte[] bArr) throws IOException {
        byte[] copyOfRange;
        if (this.f22908o || !this.f22909p || this.f22906m == null) {
            throw new IOException("not connected");
        }
        synchronized (this.f22894a) {
            int length = bArr.length;
            int i10 = this.f22912s;
            copyOfRange = length <= i10 ? bArr : Arrays.copyOfRange(bArr, 0, i10);
            if (this.f22907n || !this.f22894a.isEmpty() || !this.f22902i.a()) {
                this.f22894a.add(copyOfRange);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("write queued, len=");
                sb2.append(copyOfRange.length);
                copyOfRange = null;
            } else {
                this.f22907n = true;
            }
            if (bArr.length > this.f22912s) {
                int i11 = 1;
                while (true) {
                    int length2 = bArr.length;
                    int i12 = this.f22912s;
                    if (i11 >= ((length2 + i12) - 1) / i12) {
                        break;
                    }
                    int i13 = i11 * i12;
                    int min = Math.min(i12 + i13, bArr.length);
                    this.f22894a.add(Arrays.copyOfRange(bArr, i13, min));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("write queued, len=");
                    sb3.append(min - i13);
                    i11++;
                }
            }
        }
        if (copyOfRange != null) {
            this.f22906m.setValue(copyOfRange);
            if (this.f22904k.writeCharacteristic(this.f22906m)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("write started, len=");
                sb4.append(copyOfRange.length);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void L() {
        byte[] bArr;
        synchronized (this.f22894a) {
            if (this.f22894a.isEmpty() || !this.f22902i.a()) {
                this.f22907n = false;
                bArr = null;
            } else {
                this.f22907n = true;
                bArr = this.f22894a.remove(0);
            }
        }
        if (bArr != null) {
            this.f22906m.setValue(bArr);
            if (!this.f22904k.writeCharacteristic(this.f22906m)) {
                E(new IOException("write failed"));
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("write started, len=");
            sb2.append(bArr.length);
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void j(BluetoothGatt bluetoothGatt) {
        IOException iOException;
        if (this.f22905l.getDescriptors().isEmpty()) {
            iOException = new IOException("no CCCD descriptor for read characteristic");
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getDescriptor: ");
            sb2.append(this.f22905l.getDescriptors().size());
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f22905l;
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(bluetoothGattCharacteristic.getDescriptors().get(0).getUuid());
            if (descriptor == null) {
                iOException = new IOException("no CCCD descriptor for read characteristic");
            } else {
                int properties = this.f22905l.getProperties();
                if ((properties & 32) != 0) {
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                } else if ((properties & 16) != 0) {
                    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                } else {
                    iOException = new IOException("no indication/notification for read characteristic (" + properties + ")");
                }
                if (!bluetoothGatt.writeDescriptor(descriptor)) {
                    D(new IOException("read characteristic CCCD descriptor not writable"));
                    return;
                }
                return;
            }
        }
        D(iOException);
    }

    @SuppressLint({"MissingPermission"})
    public void k() {
        if (this.f22904k != null) {
            this.f22908o = false;
            new Handler(Looper.getMainLooper()).post(new g(this));
        }
    }

    @SuppressLint({"MissingPermission"})
    public void l(String str, boolean z10, b bVar) {
        if (!(this.f22903j == null || this.f22904k == null)) {
            r();
        }
        this.f22903j = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        m(z10, bVar);
    }

    @SuppressLint({"MissingPermission"})
    public void m(boolean z10, b bVar) {
        try {
            this.f22908o = false;
            this.f22897d = bVar;
            this.f22901h = z10;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("connect ");
            sb2.append(this.f22903j);
            BluetoothGatt connectGatt = this.f22903j.connectGatt(this.f22896c, z10, this, 2);
            this.f22904k = connectGatt;
            if (connectGatt == null) {
                throw new IOException("connectGatt failed");
            }
        } catch (IOException e10) {
            ad.d.c(f22890w, e10.getMessage());
        }
    }

    public final void n(BluetoothGatt bluetoothGatt) {
        boolean z10;
        boolean z11 = false;
        this.f22907n = false;
        BluetoothGattService bluetoothGattService = null;
        BluetoothGattService bluetoothGattService2 = null;
        for (BluetoothGattService next : bluetoothGatt.getServices()) {
            next.getUuid().toString();
            if (next.getUuid().toString().equals(t())) {
                bluetoothGattService = next;
            }
            if (next.getUuid().toString().equals(v())) {
                bluetoothGattService2 = next;
            }
        }
        if (bluetoothGattService == null || bluetoothGattService2 == null) {
            z10 = true;
        } else {
            b bVar = new b();
            this.f22902i = bVar;
            z10 = bVar.b(bluetoothGattService, bluetoothGattService2);
        }
        if (!this.f22908o) {
            if (this.f22902i == null || this.f22905l == null || this.f22906m == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("delegate: ");
                sb2.append(this.f22902i == null);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("readCharacteristic: ");
                sb3.append(this.f22905l == null);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("writeCharacteristic: ");
                if (this.f22906m == null) {
                    z11 = true;
                }
                sb4.append(z11);
                for (BluetoothGattService next2 : bluetoothGatt.getServices()) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("service ");
                    sb5.append(next2.getUuid());
                    for (BluetoothGattCharacteristic uuid : next2.getCharacteristics()) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("characteristic ");
                        sb6.append(uuid.getUuid());
                    }
                }
                D(new IOException("no serial profile found"));
            } else if (z10) {
                o(bluetoothGatt);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void o(BluetoothGatt bluetoothGatt) {
        if (!bluetoothGatt.requestMtu(512)) {
            D(new IOException("request MTU failed"));
        }
    }

    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (!this.f22908o) {
            this.f22902i.d(bluetoothGatt, bluetoothGattCharacteristic);
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.f22905l;
            if (bluetoothGattCharacteristic == bluetoothGattCharacteristic2) {
                byte[] value = bluetoothGattCharacteristic2.getValue();
                F(value);
                if (!this.f22909p) {
                    C();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("read, len=");
                sb2.append(value.length);
            }
        }
    }

    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        if (!this.f22908o && this.f22909p && this.f22906m != null) {
            if (i10 != 0) {
                E(new IOException("write failed"));
                return;
            }
            this.f22902i.e(bluetoothGatt, bluetoothGattCharacteristic, i10);
            if (!this.f22908o && bluetoothGattCharacteristic == this.f22906m) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("write finished, status=");
                sb2.append(i10);
                L();
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i10, int i11) {
        b bVar;
        IOException iOException;
        if (i11 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("connect status ");
            sb2.append(i10);
            sb2.append(", discoverServices");
            if (!bluetoothGatt.discoverServices()) {
                iOException = new IOException("discoverServices failed");
            } else {
                return;
            }
        } else if ((i10 == 8 && i11 == 0) || (i10 == 133 && i11 == 0)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onConnectionStateChange ");
            sb3.append(i10);
            sb3.append(", disconnect");
            if (i10 == 8 && (bVar = this.f22897d) != null) {
                bVar.a(new IOException("Device Disconnect"));
            }
            bluetoothGatt.disconnect();
            bluetoothGatt.close();
            bluetoothGatt.getDevice().connectGatt(this.f22896c, false, this);
            return;
        } else if (i11 == 0) {
            String str = "gatt status " + i10;
        } else {
            iOException = new IOException("unknown connect state " + i11 + " " + i10);
        }
        D(iOException);
    }

    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
        this.f22902i.f(bluetoothGatt, bluetoothGattDescriptor, i10);
        if (!this.f22908o) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onDescriptorWrite: ");
            sb2.append(bluetoothGattDescriptor.getCharacteristic());
            if (bluetoothGattDescriptor.getCharacteristic() == this.f22905l) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("writing read characteristic descriptor finished, status=");
                sb3.append(i10);
                if (i10 != 0) {
                    D(new IOException("write descriptor failed"));
                } else {
                    C();
                }
            }
        }
    }

    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mtu size ");
        sb2.append(i10);
        sb2.append(", status=");
        sb2.append(i11);
        if (i11 == 0) {
            this.f22912s = i10 - 3;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("payload size ");
            sb3.append(this.f22912s);
        }
        p(bluetoothGatt);
    }

    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("servicesDiscovered, status ");
        sb2.append(i10);
        if (!this.f22908o) {
            n(bluetoothGatt);
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void p(BluetoothGatt bluetoothGatt) {
        IOException iOException;
        if ((this.f22906m.getProperties() & 12) == 0) {
            iOException = new IOException("write characteristic not writable");
        } else if (!bluetoothGatt.setCharacteristicNotification(this.f22905l, true)) {
            iOException = new IOException("no notification for read characteristic");
        } else {
            j(bluetoothGatt);
            return;
        }
        D(iOException);
    }

    @SuppressLint({"MissingPermission"})
    public void q() {
        if (this.f22904k != null) {
            new Handler(Looper.getMainLooper()).post(new f(this));
        }
    }

    @SuppressLint({"MissingPermission"})
    public void r() {
        BluetoothGatt bluetoothGatt = this.f22904k;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
            this.f22904k.close();
            this.f22908o = true;
            this.f22909p = false;
            this.f22905l = null;
            this.f22906m = null;
            this.f22902i = null;
            b bVar = this.f22897d;
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    public abstract String s();

    public abstract String t();

    public abstract String u();

    public abstract String v();

    public boolean w() {
        BluetoothGatt bluetoothGatt = this.f22904k;
        return bluetoothGatt != null && bluetoothGatt.getConnectionState(this.f22903j) == 2;
    }
}
