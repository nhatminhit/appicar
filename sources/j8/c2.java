package j8;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import x0.e;

public final class c2 implements Handler.Callback {
    public final /* synthetic */ d2 O;

    public /* synthetic */ c2(d2 d2Var, b2 b2Var) {
        this.O = d2Var;
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.O.f9729f) {
                y1 y1Var = (y1) message.obj;
                a2 a2Var = (a2) this.O.f9729f.get(y1Var);
                if (a2Var != null && a2Var.i()) {
                    if (a2Var.j()) {
                        a2Var.g("GmsClientSupervisor");
                    }
                    this.O.f9729f.remove(y1Var);
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            synchronized (this.O.f9729f) {
                y1 y1Var2 = (y1) message.obj;
                a2 a2Var2 = (a2) this.O.f9729f.get(y1Var2);
                if (a2Var2 != null && a2Var2.a() == 3) {
                    String valueOf = String.valueOf(y1Var2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    new Exception();
                    ComponentName b10 = a2Var2.b();
                    if (b10 == null) {
                        b10 = y1Var2.b();
                    }
                    if (b10 == null) {
                        String d10 = y1Var2.d();
                        s.l(d10);
                        b10 = new ComponentName(d10, e.f15004b);
                    }
                    a2Var2.onServiceDisconnected(b10);
                }
            }
            return true;
        }
    }
}
