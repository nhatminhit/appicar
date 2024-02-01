package h9;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import d.j0;
import g8.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class r0 extends LifecycleCallback {
    public final List P = new ArrayList();

    public r0(h hVar) {
        super(hVar);
        this.O.i("TaskOnStopCallback", this);
    }

    public static r0 m(Activity activity) {
        h c10 = LifecycleCallback.c(activity);
        r0 r0Var = (r0) c10.o("TaskOnStopCallback", r0.class);
        return r0Var == null ? new r0(c10) : r0Var;
    }

    @j0
    public final void l() {
        synchronized (this.P) {
            for (WeakReference weakReference : this.P) {
                m0 m0Var = (m0) weakReference.get();
                if (m0Var != null) {
                    m0Var.o();
                }
            }
            this.P.clear();
        }
    }

    public final void n(m0 m0Var) {
        synchronized (this.P) {
            this.P.add(new WeakReference(m0Var));
        }
    }
}
