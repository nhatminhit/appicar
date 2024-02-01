package md;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import d.l;
import d.m0;
import d.o0;
import eightbitlab.com.blurview.BlurView;
import md.l;

public final class g implements b {
    @l

    /* renamed from: p  reason: collision with root package name */
    public static final int f21052p = 0;

    /* renamed from: c  reason: collision with root package name */
    public float f21053c = 16.0f;

    /* renamed from: d  reason: collision with root package name */
    public final a f21054d;

    /* renamed from: e  reason: collision with root package name */
    public c f21055e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f21056f;

    /* renamed from: g  reason: collision with root package name */
    public final BlurView f21057g;

    /* renamed from: h  reason: collision with root package name */
    public int f21058h;

    /* renamed from: i  reason: collision with root package name */
    public final ViewGroup f21059i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f21060j = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public final int[] f21061k = new int[2];

    /* renamed from: l  reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f21062l = new a();

    /* renamed from: m  reason: collision with root package name */
    public boolean f21063m = true;

    /* renamed from: n  reason: collision with root package name */
    public boolean f21064n;
    @o0

    /* renamed from: o  reason: collision with root package name */
    public Drawable f21065o;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        public boolean onPreDraw() {
            g.this.j();
            return true;
        }
    }

    public g(@m0 BlurView blurView, @m0 ViewGroup viewGroup, @l int i10, a aVar) {
        this.f21059i = viewGroup;
        this.f21057g = blurView;
        this.f21058h = i10;
        this.f21054d = aVar;
        if (aVar instanceof j) {
            ((j) aVar).f(blurView.getContext());
        }
        h(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    public d a(boolean z10) {
        this.f21059i.getViewTreeObserver().removeOnPreDrawListener(this.f21062l);
        if (z10) {
            this.f21059i.getViewTreeObserver().addOnPreDrawListener(this.f21062l);
        }
        return this;
    }

    public d b(int i10) {
        if (this.f21058h != i10) {
            this.f21058h = i10;
            this.f21057g.invalidate();
        }
        return this;
    }

    public d c(@o0 Drawable drawable) {
        this.f21065o = drawable;
        return this;
    }

    public void d() {
        h(this.f21057g.getMeasuredWidth(), this.f21057g.getMeasuredHeight());
    }

    public void destroy() {
        a(false);
        this.f21054d.destroy();
        this.f21064n = false;
    }

    public boolean draw(Canvas canvas) {
        if (this.f21063m && this.f21064n) {
            if (canvas instanceof c) {
                return false;
            }
            float height = ((float) this.f21057g.getHeight()) / ((float) this.f21056f.getHeight());
            canvas.save();
            canvas.scale(((float) this.f21057g.getWidth()) / ((float) this.f21056f.getWidth()), height);
            this.f21054d.d(canvas, this.f21056f);
            canvas.restore();
            int i10 = this.f21058h;
            if (i10 != 0) {
                canvas.drawColor(i10);
            }
        }
        return true;
    }

    public d e(boolean z10) {
        this.f21063m = z10;
        a(z10);
        this.f21057g.invalidate();
        return this;
    }

    public d f(float f10) {
        this.f21053c = f10;
        return this;
    }

    public final void g() {
        this.f21056f = this.f21054d.e(this.f21056f, this.f21053c);
        if (!this.f21054d.c()) {
            this.f21055e.setBitmap(this.f21056f);
        }
    }

    public void h(int i10, int i11) {
        a(true);
        l lVar = new l(this.f21054d.a());
        if (lVar.b(i10, i11)) {
            this.f21057g.setWillNotDraw(true);
            return;
        }
        this.f21057g.setWillNotDraw(false);
        l.a d10 = lVar.d(i10, i11);
        this.f21056f = Bitmap.createBitmap(d10.f21080a, d10.f21081b, this.f21054d.b());
        this.f21055e = new c(this.f21056f);
        this.f21064n = true;
        j();
    }

    public final void i() {
        this.f21059i.getLocationOnScreen(this.f21060j);
        this.f21057g.getLocationOnScreen(this.f21061k);
        int[] iArr = this.f21061k;
        int i10 = iArr[0];
        int[] iArr2 = this.f21060j;
        int i11 = i10 - iArr2[0];
        int i12 = iArr[1] - iArr2[1];
        float height = ((float) this.f21057g.getHeight()) / ((float) this.f21056f.getHeight());
        float width = ((float) this.f21057g.getWidth()) / ((float) this.f21056f.getWidth());
        this.f21055e.translate(((float) (-i11)) / width, ((float) (-i12)) / height);
        this.f21055e.scale(1.0f / width, 1.0f / height);
    }

    public void j() {
        if (this.f21063m && this.f21064n) {
            Drawable drawable = this.f21065o;
            if (drawable == null) {
                this.f21056f.eraseColor(0);
            } else {
                drawable.draw(this.f21055e);
            }
            this.f21055e.save();
            i();
            this.f21059i.draw(this.f21055e);
            this.f21055e.restore();
            g();
        }
    }
}
