package g8;

import android.os.Looper;
import android.os.Message;
import b9.u;
import com.google.android.gms.common.api.internal.s;

public final class u0 extends u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f8277a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u0(s sVar, Looper looper) {
        super(looper);
        this.f8277a = sVar;
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ((t0) message.obj).b(this.f8277a);
        } else if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown message id: ");
            sb2.append(i10);
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
