package x8;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.t;
import d.m0;
import java.util.concurrent.Executor;

@e8.a
public class a implements Executor {
    public final Handler O;

    @e8.a
    public a(@m0 Looper looper) {
        this.O = new t(looper);
    }

    public final void execute(@m0 Runnable runnable) {
        this.O.post(runnable);
    }
}
