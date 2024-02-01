package gc;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RemoteViews;
import gc.v;
import gc.y;
import gc.z;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class a0 {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicInteger f18958m = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final v f18959a;

    /* renamed from: b  reason: collision with root package name */
    public final z.b f18960b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18961c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18962d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18963e;

    /* renamed from: f  reason: collision with root package name */
    public int f18964f;

    /* renamed from: g  reason: collision with root package name */
    public int f18965g;

    /* renamed from: h  reason: collision with root package name */
    public int f18966h;

    /* renamed from: i  reason: collision with root package name */
    public int f18967i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f18968j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f18969k;

    /* renamed from: l  reason: collision with root package name */
    public Object f18970l;

    public a0() {
        this.f18963e = true;
        this.f18959a = null;
        this.f18960b = new z.b((Uri) null, 0, (Bitmap.Config) null);
    }

    public a0(v vVar, Uri uri, int i10) {
        this.f18963e = true;
        if (!vVar.f19132o) {
            this.f18959a = vVar;
            this.f18960b = new z.b(uri, i10, vVar.f19129l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    public a0 A(int i10, int i11) {
        Resources resources = this.f18959a.f19122e.getResources();
        return z(resources.getDimensionPixelSize(i10), resources.getDimensionPixelSize(i11));
    }

    public a0 B(float f10) {
        this.f18960b.p(f10);
        return this;
    }

    public a0 C(float f10, float f11, float f12) {
        this.f18960b.q(f10, f11, f12);
        return this;
    }

    @Deprecated
    public a0 D() {
        return q(r.NO_CACHE, r.NO_STORE);
    }

    public a0 E(String str) {
        this.f18960b.t(str);
        return this;
    }

    public a0 F(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Tag invalid.");
        } else if (this.f18970l == null) {
            this.f18970l = obj;
            return this;
        } else {
            throw new IllegalStateException("Tag already set.");
        }
    }

    public a0 G(h0 h0Var) {
        this.f18960b.u(h0Var);
        return this;
    }

    public a0 H(List<? extends h0> list) {
        this.f18960b.v(list);
        return this;
    }

    public a0 I() {
        this.f18962d = false;
        return this;
    }

    public a0 a() {
        this.f18960b.b();
        return this;
    }

    public a0 b() {
        this.f18960b.c();
        return this;
    }

    public a0 c(Bitmap.Config config) {
        this.f18960b.i(config);
        return this;
    }

    public final z d(long j10) {
        int andIncrement = f18958m.getAndIncrement();
        z a10 = this.f18960b.a();
        a10.f19162a = andIncrement;
        a10.f19163b = j10;
        boolean z10 = this.f18959a.f19131n;
        if (z10) {
            j0.w(j0.f19084m, j0.f19087p, a10.h(), a10.toString());
        }
        z G = this.f18959a.G(a10);
        if (G != a10) {
            G.f19162a = andIncrement;
            G.f19163b = j10;
            if (z10) {
                String e10 = G.e();
                j0.w(j0.f19084m, j0.f19088q, e10, "into " + G);
            }
        }
        return G;
    }

    public a0 e(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        } else if (this.f18969k == null) {
            this.f18965g = i10;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    public a0 f(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Error image may not be null.");
        } else if (this.f18965g == 0) {
            this.f18969k = drawable;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    public void g() {
        h((e) null);
    }

    public void h(e eVar) {
        long nanoTime = System.nanoTime();
        if (this.f18962d) {
            throw new IllegalStateException("Fit cannot be used with fetch.");
        } else if (this.f18960b.j()) {
            if (!this.f18960b.k()) {
                this.f18960b.n(v.f.LOW);
            }
            z d10 = d(nanoTime);
            String j10 = j0.j(d10, new StringBuilder());
            if (this.f18959a.x(j10) != null) {
                if (this.f18959a.f19131n) {
                    String h10 = d10.h();
                    j0.w(j0.f19084m, j0.D, h10, "from " + v.e.MEMORY);
                }
                if (eVar != null) {
                    eVar.onSuccess();
                    return;
                }
                return;
            }
            this.f18959a.F(new k(this.f18959a, d10, this.f18966h, this.f18967i, this.f18970l, j10, eVar));
        }
    }

    public a0 i() {
        this.f18962d = true;
        return this;
    }

    public Bitmap j() throws IOException {
        long nanoTime = System.nanoTime();
        j0.d();
        if (this.f18962d) {
            throw new IllegalStateException("Fit cannot be used with get.");
        } else if (!this.f18960b.j()) {
            return null;
        } else {
            z d10 = d(nanoTime);
            m mVar = new m(this.f18959a, d10, this.f18966h, this.f18967i, this.f18970l, j0.j(d10, new StringBuilder()));
            v vVar = this.f18959a;
            return c.g(vVar, vVar.f19123f, vVar.f19124g, vVar.f19125h, mVar).r();
        }
    }

    public final Drawable k() {
        return this.f18964f != 0 ? this.f18959a.f19122e.getResources().getDrawable(this.f18964f) : this.f18968j;
    }

    public void l(ImageView imageView) {
        m(imageView, (e) null);
    }

    public void m(ImageView imageView, e eVar) {
        Bitmap x10;
        ImageView imageView2 = imageView;
        e eVar2 = eVar;
        long nanoTime = System.nanoTime();
        j0.c();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f18960b.j()) {
            this.f18959a.d(imageView2);
            if (this.f18963e) {
                w.d(imageView2, k());
            }
        } else {
            if (this.f18962d) {
                if (!this.f18960b.l()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f18963e) {
                            w.d(imageView2, k());
                        }
                        this.f18959a.i(imageView2, new h(this, imageView2, eVar2));
                        return;
                    }
                    this.f18960b.o(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            z d10 = d(nanoTime);
            String i10 = j0.i(d10);
            if (!r.a(this.f18966h) || (x10 = this.f18959a.x(i10)) == null) {
                if (this.f18963e) {
                    w.d(imageView2, k());
                }
                this.f18959a.k(new n(this.f18959a, imageView, d10, this.f18966h, this.f18967i, this.f18965g, this.f18969k, i10, this.f18970l, eVar, this.f18961c));
                return;
            }
            this.f18959a.d(imageView2);
            v vVar = this.f18959a;
            Context context = vVar.f19122e;
            v.e eVar3 = v.e.MEMORY;
            w.c(imageView, context, x10, eVar3, this.f18961c, vVar.f19130m);
            if (this.f18959a.f19131n) {
                String h10 = d10.h();
                j0.w(j0.f19084m, j0.D, h10, "from " + eVar3);
            }
            if (eVar2 != null) {
                eVar.onSuccess();
            }
        }
    }

    public void n(RemoteViews remoteViews, int i10, int i11, Notification notification) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("RemoteViews must not be null.");
        } else if (notification == null) {
            throw new IllegalArgumentException("Notification must not be null.");
        } else if (this.f18962d) {
            throw new IllegalStateException("Fit cannot be used with RemoteViews.");
        } else if (this.f18968j == null && this.f18964f == 0 && this.f18969k == null) {
            z d10 = d(nanoTime);
            RemoteViews remoteViews2 = remoteViews;
            int i12 = i10;
            int i13 = i11;
            Notification notification2 = notification;
            v(new y.b(this.f18959a, d10, remoteViews2, i12, i13, notification2, this.f18966h, this.f18967i, j0.j(d10, new StringBuilder()), this.f18970l, this.f18965g));
        } else {
            throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        }
    }

    public void o(RemoteViews remoteViews, int i10, int[] iArr) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("remoteViews must not be null.");
        } else if (iArr == null) {
            throw new IllegalArgumentException("appWidgetIds must not be null.");
        } else if (this.f18962d) {
            throw new IllegalStateException("Fit cannot be used with remote views.");
        } else if (this.f18968j == null && this.f18964f == 0 && this.f18969k == null) {
            z d10 = d(nanoTime);
            RemoteViews remoteViews2 = remoteViews;
            int i11 = i10;
            int[] iArr2 = iArr;
            v(new y.a(this.f18959a, d10, remoteViews2, i11, iArr2, this.f18966h, this.f18967i, j0.j(d10, new StringBuilder()), this.f18970l, this.f18965g));
        } else {
            throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        }
    }

    public void p(f0 f0Var) {
        Bitmap x10;
        long nanoTime = System.nanoTime();
        j0.c();
        if (f0Var == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f18962d) {
            Drawable drawable = null;
            if (!this.f18960b.j()) {
                this.f18959a.f(f0Var);
                if (this.f18963e) {
                    drawable = k();
                }
                f0Var.c(drawable);
                return;
            }
            z d10 = d(nanoTime);
            String i10 = j0.i(d10);
            if (!r.a(this.f18966h) || (x10 = this.f18959a.x(i10)) == null) {
                if (this.f18963e) {
                    drawable = k();
                }
                f0Var.c(drawable);
                this.f18959a.k(new g0(this.f18959a, f0Var, d10, this.f18966h, this.f18967i, this.f18969k, i10, this.f18970l, this.f18965g));
                return;
            }
            this.f18959a.f(f0Var);
            f0Var.a(x10, v.e.MEMORY);
        } else {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
    }

    public a0 q(r rVar, r... rVarArr) {
        if (rVar != null) {
            this.f18966h = rVar.O | this.f18966h;
            if (rVarArr != null) {
                if (rVarArr.length > 0) {
                    int length = rVarArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        r rVar2 = rVarArr[i10];
                        if (rVar2 != null) {
                            this.f18966h = rVar2.O | this.f18966h;
                            i10++;
                        } else {
                            throw new IllegalArgumentException("Memory policy cannot be null.");
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        throw new IllegalArgumentException("Memory policy cannot be null.");
    }

    public a0 r(s sVar, s... sVarArr) {
        if (sVar != null) {
            this.f18967i = sVar.O | this.f18967i;
            if (sVarArr != null) {
                if (sVarArr.length > 0) {
                    int length = sVarArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        s sVar2 = sVarArr[i10];
                        if (sVar2 != null) {
                            this.f18967i = sVar2.O | this.f18967i;
                            i10++;
                        } else {
                            throw new IllegalArgumentException("Network policy cannot be null.");
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        throw new IllegalArgumentException("Network policy cannot be null.");
    }

    public a0 s() {
        this.f18961c = true;
        return this;
    }

    public a0 t() {
        if (this.f18964f != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        } else if (this.f18968j == null) {
            this.f18963e = false;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public a0 u() {
        this.f18960b.m();
        return this;
    }

    public final void v(y yVar) {
        Bitmap x10;
        if (!r.a(this.f18966h) || (x10 = this.f18959a.x(yVar.d())) == null) {
            int i10 = this.f18964f;
            if (i10 != 0) {
                yVar.o(i10);
            }
            this.f18959a.k(yVar);
            return;
        }
        yVar.b(x10, v.e.MEMORY);
    }

    public a0 w(int i10) {
        if (!this.f18963e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i10 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.f18968j == null) {
            this.f18964f = i10;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public a0 x(Drawable drawable) {
        if (!this.f18963e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (this.f18964f == 0) {
            this.f18968j = drawable;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public a0 y(v.f fVar) {
        this.f18960b.n(fVar);
        return this;
    }

    public a0 z(int i10, int i11) {
        this.f18960b.o(i10, i11);
        return this;
    }
}
