package y3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15464a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f15465b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        public static final int O = 1;

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).a();
            return true;
        }
    }

    public synchronized void a(v<?> vVar, boolean z10) {
        if (!this.f15464a) {
            if (!z10) {
                this.f15464a = true;
                vVar.a();
                this.f15464a = false;
            }
        }
        this.f15465b.obtainMessage(1, vVar).sendToTarget();
    }
}
