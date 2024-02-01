package g8;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import d.g1;
import d.j0;
import java.util.ArrayList;
import java.util.List;

@g1(otherwise = 2)
public final class s extends LifecycleCallback {
    public List P = new ArrayList();

    public s(h hVar) {
        super(hVar);
        this.O.i("LifecycleObserverOnStop", this);
    }

    public static /* bridge */ /* synthetic */ s m(Activity activity) {
        s sVar;
        synchronized (activity) {
            h c10 = LifecycleCallback.c(activity);
            sVar = (s) c10.o("LifecycleObserverOnStop", s.class);
            if (sVar == null) {
                sVar = new s(c10);
            }
        }
        return sVar;
    }

    @j0
    public final void l() {
        List<Runnable> list;
        synchronized (this) {
            list = this.P;
            this.P = new ArrayList();
        }
        for (Runnable run : list) {
            run.run();
        }
    }

    public final synchronized void o(Runnable runnable) {
        this.P.add(runnable);
    }
}
