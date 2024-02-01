package k4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import d.g1;
import d.m0;
import j3.b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k4.g;
import t4.k;
import v3.m;
import z3.e;

public class c extends Drawable implements g.b, Animatable, b {
    public static final int Z = -1;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f9982a0 = 0;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f9983b0 = 119;
    public final a O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public Paint W;
    public Rect X;
    public List<b.a> Y;

    public static final class a extends Drawable.ConstantState {
        @g1

        /* renamed from: a  reason: collision with root package name */
        public final g f9984a;

        public a(g gVar) {
            this.f9984a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @m0
        public Drawable newDrawable() {
            return new c(this);
        }

        @m0
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public c(Context context, u3.a aVar, m<Bitmap> mVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.d(context), aVar, i10, i11, mVar, bitmap)));
    }

    @Deprecated
    public c(Context context, u3.a aVar, e eVar, m<Bitmap> mVar, int i10, int i11, Bitmap bitmap) {
        this(context, aVar, mVar, i10, i11, bitmap);
    }

    public c(a aVar) {
        this.S = true;
        this.U = -1;
        this.O = (a) k.d(aVar);
    }

    @g1
    public c(g gVar, Paint paint) {
        this(new a(gVar));
        this.W = paint;
    }

    public void a() {
        if (d() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (i() == h() - 1) {
            this.T++;
        }
        int i10 = this.U;
        if (i10 != -1 && this.T >= i10) {
            n();
            stop();
        }
    }

    public void b(@m0 b.a aVar) {
        if (aVar != null) {
            if (this.Y == null) {
                this.Y = new ArrayList();
            }
            this.Y.add(aVar);
        }
    }

    public boolean c(@m0 b.a aVar) {
        List<b.a> list = this.Y;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    public void clearAnimationCallbacks() {
        List<b.a> list = this.Y;
        if (list != null) {
            list.clear();
        }
    }

    public final Drawable.Callback d() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    public void draw(@m0 Canvas canvas) {
        if (!this.R) {
            if (this.V) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), f());
                this.V = false;
            }
            canvas.drawBitmap(this.O.f9984a.c(), (Rect) null, f(), k());
        }
    }

    public ByteBuffer e() {
        return this.O.f9984a.b();
    }

    public final Rect f() {
        if (this.X == null) {
            this.X = new Rect();
        }
        return this.X;
    }

    public Bitmap g() {
        return this.O.f9984a.e();
    }

    public Drawable.ConstantState getConstantState() {
        return this.O;
    }

    public int getIntrinsicHeight() {
        return this.O.f9984a.i();
    }

    public int getIntrinsicWidth() {
        return this.O.f9984a.m();
    }

    public int getOpacity() {
        return -2;
    }

    public int h() {
        return this.O.f9984a.f();
    }

    public int i() {
        return this.O.f9984a.d();
    }

    public boolean isRunning() {
        return this.P;
    }

    public m<Bitmap> j() {
        return this.O.f9984a.h();
    }

    public final Paint k() {
        if (this.W == null) {
            this.W = new Paint(2);
        }
        return this.W;
    }

    public int l() {
        return this.O.f9984a.l();
    }

    public boolean m() {
        return this.R;
    }

    public final void n() {
        List<b.a> list = this.Y;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.Y.get(i10).b(this);
            }
        }
    }

    public void o() {
        this.R = true;
        this.O.f9984a.a();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.V = true;
    }

    public final void p() {
        this.T = 0;
    }

    public void q(m<Bitmap> mVar, Bitmap bitmap) {
        this.O.f9984a.q(mVar, bitmap);
    }

    public void r(boolean z10) {
        this.P = z10;
    }

    public void s(int i10) {
        int i11 = -1;
        if (i10 <= 0 && i10 != -1 && i10 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        } else if (i10 == 0) {
            int j10 = this.O.f9984a.j();
            if (j10 != 0) {
                i11 = j10;
            }
            this.U = i11;
        } else {
            this.U = i10;
        }
    }

    public void setAlpha(int i10) {
        k().setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        k().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        k.a(!this.R, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.S = z10;
        if (!z10) {
            v();
        } else if (this.Q) {
            u();
        }
        return super.setVisible(z10, z11);
    }

    public void start() {
        this.Q = true;
        p();
        if (this.S) {
            u();
        }
    }

    public void stop() {
        this.Q = false;
        v();
    }

    public void t() {
        k.a(!this.P, "You cannot restart a currently running animation.");
        this.O.f9984a.r();
        start();
    }

    public final void u() {
        k.a(!this.R, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.O.f9984a.f() != 1) {
            if (!this.P) {
                this.P = true;
                this.O.f9984a.v(this);
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    public final void v() {
        this.P = false;
        this.O.f9984a.w(this);
    }
}
