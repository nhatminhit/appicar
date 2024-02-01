package g8;

import android.os.Looper;
import android.os.Message;
import b9.u;
import com.google.android.gms.common.api.Status;
import f8.o;
import j8.s;

public final class e2 extends u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g2 f8204a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e2(g2 g2Var, Looper looper) {
        super(looper);
        this.f8204a = g2Var;
    }

    public final void handleMessage(Message message) {
        Status k10;
        int i10 = message.what;
        if (i10 == 0) {
            o oVar = (o) message.obj;
            synchronized (this.f8204a.f8219e) {
                g2 g2Var = (g2) s.l(this.f8204a.f8216b);
                if (oVar == null) {
                    k10 = new Status(13, "Transform returned null");
                } else if (oVar instanceof u1) {
                    k10 = ((u1) oVar).k();
                } else {
                    g2Var.l(oVar);
                }
                g2Var.m(k10);
            }
        } else if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("TransformationResultHandler received unknown message type: ");
            sb2.append(i10);
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage()));
            throw runtimeException;
        }
    }
}
