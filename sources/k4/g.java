package k4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import d.g1;
import d.m0;
import d.o0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p4.h;
import r4.f;
import v3.m;
import y3.j;
import z3.e;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final u3.a f9987a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f9988b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f9989c;

    /* renamed from: d  reason: collision with root package name */
    public final l f9990d;

    /* renamed from: e  reason: collision with root package name */
    public final e f9991e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9992f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9993g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9994h;

    /* renamed from: i  reason: collision with root package name */
    public k<Bitmap> f9995i;

    /* renamed from: j  reason: collision with root package name */
    public a f9996j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9997k;

    /* renamed from: l  reason: collision with root package name */
    public a f9998l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f9999m;

    /* renamed from: n  reason: collision with root package name */
    public m<Bitmap> f10000n;

    /* renamed from: o  reason: collision with root package name */
    public a f10001o;
    @o0

    /* renamed from: p  reason: collision with root package name */
    public d f10002p;

    /* renamed from: q  reason: collision with root package name */
    public int f10003q;

    /* renamed from: r  reason: collision with root package name */
    public int f10004r;

    /* renamed from: s  reason: collision with root package name */
    public int f10005s;

    @g1
    public static class a extends q4.e<Bitmap> {
        public final Handler R;
        public final int S;
        public final long T;
        public Bitmap U;

        public a(Handler handler, int i10, long j10) {
            this.R = handler;
            this.S = i10;
            this.T = j10;
        }

        public Bitmap c() {
            return this.U;
        }

        /* renamed from: d */
        public void s(@m0 Bitmap bitmap, @o0 f<? super Bitmap> fVar) {
            this.U = bitmap;
            this.R.sendMessageAtTime(this.R.obtainMessage(1, this), this.T);
        }

        public void r(@o0 Drawable drawable) {
            this.U = null;
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public static final int P = 1;
        public static final int Q = 2;

        public c() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.o((a) message.obj);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                g.this.f9990d.B((a) message.obj);
                return false;
            }
        }
    }

    @g1
    public interface d {
        void a();
    }

    public g(com.bumptech.glide.b bVar, u3.a aVar, int i10, int i11, m<Bitmap> mVar, Bitmap bitmap) {
        this(bVar.g(), com.bumptech.glide.b.D(bVar.i()), aVar, (Handler) null, k(com.bumptech.glide.b.D(bVar.i()), i10, i11), mVar, bitmap);
    }

    public g(e eVar, l lVar, u3.a aVar, Handler handler, k<Bitmap> kVar, m<Bitmap> mVar, Bitmap bitmap) {
        this.f9989c = new ArrayList();
        this.f9990d = lVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f9991e = eVar;
        this.f9988b = handler;
        this.f9995i = kVar;
        this.f9987a = aVar;
        q(mVar, bitmap);
    }

    public static v3.f g() {
        return new s4.e(Double.valueOf(Math.random()));
    }

    public static k<Bitmap> k(l lVar, int i10, int i11) {
        return lVar.w().a(((h) ((h) h.e1(j.f15393b).X0(true)).N0(true)).C0(i10, i11));
    }

    public void a() {
        this.f9989c.clear();
        p();
        u();
        a aVar = this.f9996j;
        if (aVar != null) {
            this.f9990d.B(aVar);
            this.f9996j = null;
        }
        a aVar2 = this.f9998l;
        if (aVar2 != null) {
            this.f9990d.B(aVar2);
            this.f9998l = null;
        }
        a aVar3 = this.f10001o;
        if (aVar3 != null) {
            this.f9990d.B(aVar3);
            this.f10001o = null;
        }
        this.f9987a.clear();
        this.f9997k = true;
    }

    public ByteBuffer b() {
        return this.f9987a.getData().asReadOnlyBuffer();
    }

    public Bitmap c() {
        a aVar = this.f9996j;
        return aVar != null ? aVar.c() : this.f9999m;
    }

    public int d() {
        a aVar = this.f9996j;
        if (aVar != null) {
            return aVar.S;
        }
        return -1;
    }

    public Bitmap e() {
        return this.f9999m;
    }

    public int f() {
        return this.f9987a.e();
    }

    public m<Bitmap> h() {
        return this.f10000n;
    }

    public int i() {
        return this.f10005s;
    }

    public int j() {
        return this.f9987a.q();
    }

    public int l() {
        return this.f9987a.p() + this.f10003q;
    }

    public int m() {
        return this.f10004r;
    }

    public final void n() {
        if (this.f9992f && !this.f9993g) {
            if (this.f9994h) {
                t4.k.a(this.f10001o == null, "Pending target must be null when starting from the first frame");
                this.f9987a.l();
                this.f9994h = false;
            }
            a aVar = this.f10001o;
            if (aVar != null) {
                this.f10001o = null;
                o(aVar);
                return;
            }
            this.f9993g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f9987a.f());
            this.f9987a.d();
            this.f9998l = new a(this.f9988b, this.f9987a.m(), uptimeMillis);
            this.f9995i.a(h.v1(g())).n(this.f9987a).m1(this.f9998l);
        }
    }

    @g1
    public void o(a aVar) {
        d dVar = this.f10002p;
        if (dVar != null) {
            dVar.a();
        }
        this.f9993g = false;
        if (this.f9997k) {
            this.f9988b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f9992f) {
            this.f10001o = aVar;
        } else {
            if (aVar.c() != null) {
                p();
                a aVar2 = this.f9996j;
                this.f9996j = aVar;
                for (int size = this.f9989c.size() - 1; size >= 0; size--) {
                    this.f9989c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f9988b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            n();
        }
    }

    public final void p() {
        Bitmap bitmap = this.f9999m;
        if (bitmap != null) {
            this.f9991e.d(bitmap);
            this.f9999m = null;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [v3.m<android.graphics.Bitmap>, java.lang.Object, v3.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(v3.m<android.graphics.Bitmap> r3, android.graphics.Bitmap r4) {
        /*
            r2 = this;
            java.lang.Object r0 = t4.k.d(r3)
            v3.m r0 = (v3.m) r0
            r2.f10000n = r0
            java.lang.Object r0 = t4.k.d(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.f9999m = r0
            com.bumptech.glide.k<android.graphics.Bitmap> r0 = r2.f9995i
            p4.h r1 = new p4.h
            r1.<init>()
            p4.a r3 = r1.T0(r3)
            com.bumptech.glide.k r3 = r0.a(r3)
            r2.f9995i = r3
            int r3 = t4.m.h(r4)
            r2.f10003q = r3
            int r3 = r4.getWidth()
            r2.f10004r = r3
            int r3 = r4.getHeight()
            r2.f10005s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.g.q(v3.m, android.graphics.Bitmap):void");
    }

    public void r() {
        t4.k.a(!this.f9992f, "Can't restart a running animation");
        this.f9994h = true;
        a aVar = this.f10001o;
        if (aVar != null) {
            this.f9990d.B(aVar);
            this.f10001o = null;
        }
    }

    @g1
    public void s(@o0 d dVar) {
        this.f10002p = dVar;
    }

    public final void t() {
        if (!this.f9992f) {
            this.f9992f = true;
            this.f9997k = false;
            n();
        }
    }

    public final void u() {
        this.f9992f = false;
    }

    public void v(b bVar) {
        if (this.f9997k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f9989c.contains(bVar)) {
            boolean isEmpty = this.f9989c.isEmpty();
            this.f9989c.add(bVar);
            if (isEmpty) {
                t();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    public void w(b bVar) {
        this.f9989c.remove(bVar);
        if (this.f9989c.isEmpty()) {
            u();
        }
    }
}
