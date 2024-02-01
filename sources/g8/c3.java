package g8;

import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;

public final class c3 implements Runnable {
    public final /* synthetic */ LifecycleCallback O;
    public final /* synthetic */ String P;
    public final /* synthetic */ zzb Q;

    public c3(zzb zzb, LifecycleCallback lifecycleCallback, String str) {
        this.Q = zzb;
        this.O = lifecycleCallback;
        this.P = str;
    }

    public final void run() {
        zzb zzb = this.Q;
        if (zzb.P > 0) {
            this.O.g(zzb.Q != null ? zzb.Q.getBundle(this.P) : null);
        }
        if (this.Q.P >= 2) {
            this.O.k();
        }
        if (this.Q.P >= 3) {
            this.O.i();
        }
        if (this.Q.P >= 4) {
            this.O.l();
        }
        if (this.Q.P >= 5) {
            this.O.h();
        }
    }
}
