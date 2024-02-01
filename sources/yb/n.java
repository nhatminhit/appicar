package yb;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import qa.j;
import va.l;
import zb.h;
import zb.s;

public class n {

    /* renamed from: k  reason: collision with root package name */
    public static final String f24707k = "n";

    /* renamed from: a  reason: collision with root package name */
    public h f24708a;

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f24709b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f24710c;

    /* renamed from: d  reason: collision with root package name */
    public k f24711d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f24712e;

    /* renamed from: f  reason: collision with root package name */
    public Rect f24713f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f24714g = false;

    /* renamed from: h  reason: collision with root package name */
    public final Object f24715h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public final Handler.Callback f24716i = new a();

    /* renamed from: j  reason: collision with root package name */
    public final s f24717j = new b();

    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == l.g.zxing_decode) {
                n.this.g((y) message.obj);
                return true;
            } else if (i10 != l.g.zxing_preview_failed) {
                return true;
            } else {
                n.this.j();
                return true;
            }
        }
    }

    public class b implements s {
        public b() {
        }

        public void a(Exception exc) {
            synchronized (n.this.f24715h) {
                if (n.this.f24714g) {
                    n.this.f24710c.obtainMessage(l.g.zxing_preview_failed).sendToTarget();
                }
            }
        }

        public void b(y yVar) {
            synchronized (n.this.f24715h) {
                if (n.this.f24714g) {
                    n.this.f24710c.obtainMessage(l.g.zxing_decode, yVar).sendToTarget();
                }
            }
        }
    }

    public n(h hVar, k kVar, Handler handler) {
        z.a();
        this.f24708a = hVar;
        this.f24711d = kVar;
        this.f24712e = handler;
    }

    public j f(y yVar) {
        if (this.f24713f == null) {
            return null;
        }
        return yVar.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(yb.y r8) {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.graphics.Rect r2 = r7.f24713f
            r8.m(r2)
            qa.j r2 = r7.f(r8)
            if (r2 == 0) goto L_0x0016
            yb.k r3 = r7.f24711d
            qa.r r2 = r3.c(r2)
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            if (r2 == 0) goto L_0x004a
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Found barcode in "
            r5.append(r6)
            long r3 = r3 - r0
            r5.append(r3)
            java.lang.String r0 = " ms"
            r5.append(r0)
            android.os.Handler r0 = r7.f24712e
            if (r0 == 0) goto L_0x0057
            yb.d r0 = new yb.d
            r0.<init>(r2, r8)
            android.os.Handler r1 = r7.f24712e
            int r2 = va.l.g.zxing_decode_succeeded
            android.os.Message r0 = android.os.Message.obtain(r1, r2, r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.setData(r1)
            goto L_0x0054
        L_0x004a:
            android.os.Handler r0 = r7.f24712e
            if (r0 == 0) goto L_0x0057
            int r1 = va.l.g.zxing_decode_failed
            android.os.Message r0 = android.os.Message.obtain(r0, r1)
        L_0x0054:
            r0.sendToTarget()
        L_0x0057:
            android.os.Handler r0 = r7.f24712e
            if (r0 == 0) goto L_0x0070
            yb.k r0 = r7.f24711d
            java.util.List r0 = r0.d()
            java.util.List r8 = yb.d.m(r0, r8)
            android.os.Handler r0 = r7.f24712e
            int r1 = va.l.g.zxing_possible_result_points
            android.os.Message r8 = android.os.Message.obtain(r0, r1, r8)
            r8.sendToTarget()
        L_0x0070:
            r7.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.n.g(yb.y):void");
    }

    public Rect h() {
        return this.f24713f;
    }

    public k i() {
        return this.f24711d;
    }

    public final void j() {
        this.f24708a.E(this.f24717j);
    }

    public void k(Rect rect) {
        this.f24713f = rect;
    }

    public void l(k kVar) {
        this.f24711d = kVar;
    }

    public void m() {
        z.a();
        HandlerThread handlerThread = new HandlerThread(f24707k);
        this.f24709b = handlerThread;
        handlerThread.start();
        this.f24710c = new Handler(this.f24709b.getLooper(), this.f24716i);
        this.f24714g = true;
        j();
    }

    public void n() {
        z.a();
        synchronized (this.f24715h) {
            this.f24714g = false;
            this.f24710c.removeCallbacksAndMessages((Object) null);
            this.f24709b.quit();
        }
    }
}
