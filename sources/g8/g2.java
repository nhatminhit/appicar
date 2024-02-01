package g8;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import d.m0;
import d.o0;
import f8.k;
import f8.o;
import f8.q;
import f8.u;
import f8.v;
import f8.w;
import f8.x;
import f8.y;
import j8.s;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

public final class g2<R extends u> extends y<R> implements v<R> {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public x f8215a = null;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public g2 f8216b = null;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public volatile w f8217c = null;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public o f8218d = null;

    /* renamed from: e  reason: collision with root package name */
    public final Object f8219e = new Object();
    @o0

    /* renamed from: f  reason: collision with root package name */
    public Status f8220f = null;

    /* renamed from: g  reason: collision with root package name */
    public final WeakReference f8221g;

    /* renamed from: h  reason: collision with root package name */
    public final e2 f8222h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8223i = false;

    public g2(WeakReference weakReference) {
        s.m(weakReference, "GoogleApiClient reference must not be null");
        this.f8221g = weakReference;
        k kVar = (k) weakReference.get();
        this.f8222h = new e2(this, kVar != null ? kVar.r() : Looper.getMainLooper());
    }

    public static final void q(u uVar) {
        if (uVar instanceof q) {
            try {
                ((q) uVar).a();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(uVar));
            }
        }
    }

    public final void a(u uVar) {
        synchronized (this.f8219e) {
            if (!uVar.g().r1()) {
                m(uVar.g());
                q(uVar);
            } else if (this.f8215a != null) {
                t1.a().submit(new d2(this, uVar));
            } else if (p()) {
                ((w) s.l(this.f8217c)).c(uVar);
            }
        }
    }

    public final void b(@m0 w<? super R> wVar) {
        synchronized (this.f8219e) {
            boolean z10 = true;
            s.s(this.f8217c == null, "Cannot call andFinally() twice.");
            if (this.f8215a != null) {
                z10 = false;
            }
            s.s(z10, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f8217c = wVar;
            n();
        }
    }

    @m0
    public final <S extends u> y<S> c(@m0 x<? super R, ? extends S> xVar) {
        g2 g2Var;
        synchronized (this.f8219e) {
            boolean z10 = true;
            s.s(this.f8215a == null, "Cannot call then() twice.");
            if (this.f8217c != null) {
                z10 = false;
            }
            s.s(z10, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f8215a = xVar;
            g2Var = new g2(this.f8221g);
            this.f8216b = g2Var;
            n();
        }
        return g2Var;
    }

    public final void k() {
        this.f8217c = null;
    }

    public final void l(o oVar) {
        synchronized (this.f8219e) {
            this.f8218d = oVar;
            n();
        }
    }

    public final void m(Status status) {
        synchronized (this.f8219e) {
            this.f8220f = status;
            o(status);
        }
    }

    @GuardedBy("mSyncToken")
    public final void n() {
        if (this.f8215a != null || this.f8217c != null) {
            k kVar = (k) this.f8221g.get();
            if (!(this.f8223i || this.f8215a == null || kVar == null)) {
                kVar.H(this);
                this.f8223i = true;
            }
            Status status = this.f8220f;
            if (status != null) {
                o(status);
                return;
            }
            o oVar = this.f8218d;
            if (oVar != null) {
                oVar.h(this);
            }
        }
    }

    public final void o(Status status) {
        synchronized (this.f8219e) {
            x xVar = this.f8215a;
            if (xVar != null) {
                ((g2) s.l(this.f8216b)).m((Status) s.m(xVar.b(status), "onFailure must not return null"));
            } else if (p()) {
                ((w) s.l(this.f8217c)).b(status);
            }
        }
    }

    @GuardedBy("mSyncToken")
    public final boolean p() {
        return (this.f8217c == null || ((k) this.f8221g.get()) == null) ? false : true;
    }
}
