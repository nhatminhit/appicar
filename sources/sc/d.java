package sc;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

public final /* synthetic */ class d implements BluetoothAdapter.LeScanCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f22889a;

    public /* synthetic */ d(h hVar) {
        this.f22889a = hVar;
    }

    public final void onLeScan(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
        this.f22889a.A(bluetoothDevice, i10, bArr);
    }
}
