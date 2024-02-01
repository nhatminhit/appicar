package g8;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.o;
import d.m0;
import f8.a;
import j8.d;
import j8.s;
import java.lang.ref.WeakReference;

public final class b0 implements d.c {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f8185a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8186b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8187c;

    public b0(o oVar, a aVar, boolean z10) {
        this.f8185a = new WeakReference(oVar);
        this.f8186b = aVar;
        this.f8187c = z10;
    }

    public final void a(@m0 ConnectionResult connectionResult) {
        o oVar = (o) this.f8185a.get();
        if (oVar != null) {
            s.s(Looper.myLooper() == oVar.f5688a.f5733b0.r(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            oVar.f5689b.lock();
            try {
                if (oVar.o(0)) {
                    if (!connectionResult.h1()) {
                        oVar.m(connectionResult, this.f8186b, this.f8187c);
                    }
                    if (oVar.p()) {
                        oVar.n();
                    }
                }
            } finally {
                oVar.f5689b.unlock();
            }
        }
    }
}
