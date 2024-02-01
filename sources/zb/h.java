package zb;

import android.content.Context;
import android.os.Handler;
import android.view.SurfaceHolder;
import va.l;
import yb.x;
import yb.z;

public class h {

    /* renamed from: n  reason: collision with root package name */
    public static final String f25040n = "h";

    /* renamed from: a  reason: collision with root package name */
    public m f25041a;

    /* renamed from: b  reason: collision with root package name */
    public l f25042b;

    /* renamed from: c  reason: collision with root package name */
    public i f25043c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f25044d;

    /* renamed from: e  reason: collision with root package name */
    public o f25045e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f25046f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f25047g = true;

    /* renamed from: h  reason: collision with root package name */
    public Handler f25048h;

    /* renamed from: i  reason: collision with root package name */
    public k f25049i = new k();

    /* renamed from: j  reason: collision with root package name */
    public Runnable f25050j = new a();

    /* renamed from: k  reason: collision with root package name */
    public Runnable f25051k = new b();

    /* renamed from: l  reason: collision with root package name */
    public Runnable f25052l = new c();

    /* renamed from: m  reason: collision with root package name */
    public Runnable f25053m = new d();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                String unused = h.f25040n;
                h.this.f25043c.r();
            } catch (Exception e10) {
                h.this.C(e10);
                String unused2 = h.f25040n;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            try {
                String unused = h.f25040n;
                h.this.f25043c.f();
                if (h.this.f25044d != null) {
                    h.this.f25044d.obtainMessage(l.g.zxing_prewiew_size_ready, h.this.u()).sendToTarget();
                }
            } catch (Exception e10) {
                h.this.C(e10);
                String unused2 = h.f25040n;
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            try {
                String unused = h.f25040n;
                h.this.f25043c.z(h.this.f25042b);
                h.this.f25043c.B();
            } catch (Exception e10) {
                h.this.C(e10);
                String unused2 = h.f25040n;
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public void run() {
            try {
                String unused = h.f25040n;
                h.this.f25043c.C();
                h.this.f25043c.e();
            } catch (Exception unused2) {
                String unused3 = h.f25040n;
            }
            boolean unused4 = h.this.f25047g = true;
            h.this.f25044d.sendEmptyMessage(l.g.zxing_camera_closed);
            h.this.f25041a.b();
        }
    }

    public h(Context context) {
        z.a();
        this.f25041a = m.e();
        i iVar = new i(context);
        this.f25043c = iVar;
        iVar.u(this.f25049i);
        this.f25048h = new Handler();
    }

    public h(i iVar) {
        z.a();
        this.f25043c = iVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(s sVar) {
        if (this.f25046f) {
            this.f25041a.c(new f(this, sVar));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void B(boolean z10) {
        this.f25043c.A(z10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(j jVar) {
        this.f25043c.d(jVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z(s sVar) {
        this.f25043c.s(sVar);
    }

    public final void C(Exception exc) {
        Handler handler = this.f25044d;
        if (handler != null) {
            handler.obtainMessage(l.g.zxing_camera_error, exc).sendToTarget();
        }
    }

    public void D() {
        z.a();
        this.f25046f = true;
        this.f25047g = false;
        this.f25041a.f(this.f25050j);
    }

    public void E(s sVar) {
        this.f25048h.post(new g(this, sVar));
    }

    public void F(k kVar) {
        if (!this.f25046f) {
            this.f25049i = kVar;
            this.f25043c.u(kVar);
        }
    }

    public void G(o oVar) {
        this.f25045e = oVar;
        this.f25043c.w(oVar);
    }

    public void H(Handler handler) {
        this.f25044d = handler;
    }

    public void I(l lVar) {
        this.f25042b = lVar;
    }

    public void J(SurfaceHolder surfaceHolder) {
        I(new l(surfaceHolder));
    }

    public void K(boolean z10) {
        z.a();
        if (this.f25046f) {
            this.f25041a.c(new e(this, z10));
        }
    }

    public void L() {
        z.a();
        M();
        this.f25041a.c(this.f25052l);
    }

    public final void M() {
        if (!this.f25046f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public void m(j jVar) {
        z.a();
        if (this.f25046f) {
            this.f25041a.c(new d(this, jVar));
        }
    }

    public void n() {
        z.a();
        if (this.f25046f) {
            this.f25041a.c(this.f25053m);
        } else {
            this.f25047g = true;
        }
        this.f25046f = false;
    }

    public void o() {
        z.a();
        M();
        this.f25041a.c(this.f25051k);
    }

    public i p() {
        return this.f25043c;
    }

    public int q() {
        return this.f25043c.h();
    }

    public k r() {
        return this.f25049i;
    }

    public m s() {
        return this.f25041a;
    }

    public o t() {
        return this.f25045e;
    }

    public final x u() {
        return this.f25043c.m();
    }

    public l v() {
        return this.f25042b;
    }

    public boolean w() {
        return this.f25047g;
    }

    public boolean x() {
        return this.f25046f;
    }
}
