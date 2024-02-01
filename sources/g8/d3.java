package g8;

import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzd;

public final class d3 implements Runnable {
    public final /* synthetic */ LifecycleCallback O;
    public final /* synthetic */ String P;
    public final /* synthetic */ zzd Q;

    public d3(zzd zzd, LifecycleCallback lifecycleCallback, String str) {
        this.Q = zzd;
        this.O = lifecycleCallback;
        this.P = str;
    }

    public final void run() {
        zzd zzd = this.Q;
        if (zzd.Z0 > 0) {
            this.O.g(zzd.f5743a1 != null ? zzd.f5743a1.getBundle(this.P) : null);
        }
        if (this.Q.Z0 >= 2) {
            this.O.k();
        }
        if (this.Q.Z0 >= 3) {
            this.O.i();
        }
        if (this.Q.Z0 >= 4) {
            this.O.l();
        }
        if (this.Q.Z0 >= 5) {
            this.O.h();
        }
    }
}
