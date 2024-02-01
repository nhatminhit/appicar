package j8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import d.o0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import w8.v;

public final class a2 implements ServiceConnection, e2 {
    public final Map O = new HashMap();
    public int P = 2;
    public boolean Q;
    @o0
    public IBinder R;
    public final y1 S;
    public ComponentName T;
    public final /* synthetic */ d2 U;

    public a2(d2 d2Var, y1 y1Var) {
        this.U = d2Var;
        this.S = y1Var;
    }

    public final int a() {
        return this.P;
    }

    public final ComponentName b() {
        return this.T;
    }

    @o0
    public final IBinder c() {
        return this.R;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.O.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, @o0 Executor executor) {
        this.P = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (v.r()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            d2 d2Var = this.U;
            boolean e10 = d2Var.f9733j.e(d2Var.f9730g, str, this.S.c(d2Var.f9730g), this, this.S.a(), executor);
            this.Q = e10;
            if (e10) {
                this.U.f9731h.sendMessageDelayed(this.U.f9731h.obtainMessage(1, this.S), this.U.f9735l);
            } else {
                this.P = 2;
                try {
                    d2 d2Var2 = this.U;
                    d2Var2.f9733j.c(d2Var2.f9730g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.O.remove(serviceConnection);
    }

    public final void g(String str) {
        this.U.f9731h.removeMessages(1, this.S);
        d2 d2Var = this.U;
        d2Var.f9733j.c(d2Var.f9730g, this);
        this.Q = false;
        this.P = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.O.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.O.isEmpty();
    }

    public final boolean j() {
        return this.Q;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.U.f9729f) {
            this.U.f9731h.removeMessages(1, this.S);
            this.R = iBinder;
            this.T = componentName;
            for (ServiceConnection onServiceConnected : this.O.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.P = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.U.f9729f) {
            this.U.f9731h.removeMessages(1, this.S);
            this.R = null;
            this.T = componentName;
            for (ServiceConnection onServiceDisconnected : this.O.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.P = 2;
        }
    }
}
