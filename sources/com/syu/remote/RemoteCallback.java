package com.syu.remote;

import android.os.RemoteException;
import android.util.SparseArray;
import com.syu.ipc.IModuleCallback;
import org.greenrobot.eventbus.EventBus;

public class RemoteCallback extends IModuleCallback.Stub {

    /* renamed from: a  reason: collision with root package name */
    public int f17771a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<Boolean> f17772b = new SparseArray<>();

    public RemoteCallback(int i10) {
        this.f17771a = i10;
    }

    public void disEnable(int i10) {
        if (this.f17772b.indexOfKey(i10) >= 0 && this.f17772b.get(i10).booleanValue()) {
            this.f17772b.put(i10, Boolean.FALSE);
        }
    }

    public void enable(int i10) {
        if (!this.f17772b.get(i10, Boolean.FALSE).booleanValue()) {
            this.f17772b.put(i10, Boolean.TRUE);
        }
    }

    public void update(int i10, int[] iArr, float[] fArr, String[] strArr) throws RemoteException {
        if (this.f17772b.get(i10, Boolean.FALSE).booleanValue()) {
            EventBus.getDefault().post(new Message(this.f17771a, i10, iArr, fArr, strArr));
        }
    }
}
