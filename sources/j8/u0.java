package j8;

import com.google.android.gms.common.api.Status;
import f8.o;
import h9.n;
import j8.r;
import java.util.concurrent.TimeUnit;

public final class u0 implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f9802a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f9803b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r.a f9804c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x0 f9805d;

    public u0(o oVar, n nVar, r.a aVar, x0 x0Var) {
        this.f9802a = oVar;
        this.f9803b = nVar;
        this.f9804c = aVar;
        this.f9805d = x0Var;
    }

    public final void a(Status status) {
        if (status.r1()) {
            this.f9803b.c(this.f9804c.a(this.f9802a.e(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f9803b.b(b.a(status));
    }
}
