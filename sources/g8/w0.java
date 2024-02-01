package g8;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class w0 implements Executor {
    public final /* synthetic */ Handler O;

    public /* synthetic */ w0(Handler handler) {
        this.O = handler;
    }

    public final void execute(Runnable runnable) {
        this.O.post(runnable);
    }
}
