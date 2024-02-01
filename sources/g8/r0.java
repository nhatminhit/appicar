package g8;

import android.os.Looper;
import android.os.Message;
import b9.u;
import com.google.android.gms.common.api.internal.q;

public final class r0 extends u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f8269a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(q qVar, Looper looper) {
        super(looper);
        this.f8269a = qVar;
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            q.Q(this.f8269a);
        } else if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown message id: ");
            sb2.append(i10);
        } else {
            q.P(this.f8269a);
        }
    }
}
