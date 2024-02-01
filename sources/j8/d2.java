package j8;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import b6.h;
import com.google.android.gms.internal.common.t;
import d.o0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import v8.b;
import va.i;

public final class d2 extends i {
    @GuardedBy("connectionStatus")

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f9729f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Context f9730g;

    /* renamed from: h  reason: collision with root package name */
    public volatile Handler f9731h;

    /* renamed from: i  reason: collision with root package name */
    public final c2 f9732i;

    /* renamed from: j  reason: collision with root package name */
    public final b f9733j;

    /* renamed from: k  reason: collision with root package name */
    public final long f9734k;

    /* renamed from: l  reason: collision with root package name */
    public final long f9735l;

    public d2(Context context, Looper looper) {
        c2 c2Var = new c2(this, (b2) null);
        this.f9732i = c2Var;
        this.f9730g = context.getApplicationContext();
        this.f9731h = new t(looper, c2Var);
        this.f9733j = b.b();
        this.f9734k = h.f4357h;
        this.f9735l = i.f23544h;
    }

    public final void i(y1 y1Var, ServiceConnection serviceConnection, String str) {
        s.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9729f) {
            a2 a2Var = (a2) this.f9729f.get(y1Var);
            if (a2Var == null) {
                String obj = y1Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (a2Var.h(serviceConnection)) {
                a2Var.f(serviceConnection, str);
                if (a2Var.i()) {
                    this.f9731h.sendMessageDelayed(this.f9731h.obtainMessage(0, y1Var), this.f9734k);
                }
            } else {
                String obj2 = y1Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    public final boolean k(y1 y1Var, ServiceConnection serviceConnection, String str, @o0 Executor executor) {
        boolean j10;
        s.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9729f) {
            a2 a2Var = (a2) this.f9729f.get(y1Var);
            if (a2Var == null) {
                a2Var = new a2(this, y1Var);
                a2Var.d(serviceConnection, serviceConnection, str);
                a2Var.e(str, executor);
                this.f9729f.put(y1Var, a2Var);
            } else {
                this.f9731h.removeMessages(0, y1Var);
                if (!a2Var.h(serviceConnection)) {
                    a2Var.d(serviceConnection, serviceConnection, str);
                    int a10 = a2Var.a();
                    if (a10 == 1) {
                        serviceConnection.onServiceConnected(a2Var.b(), a2Var.c());
                    } else if (a10 == 2) {
                        a2Var.e(str, executor);
                    }
                } else {
                    String obj = y1Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            j10 = a2Var.j();
        }
        return j10;
    }

    public final void q(Looper looper) {
        synchronized (this.f9729f) {
            this.f9731h = new t(looper, this.f9732i);
        }
    }
}
