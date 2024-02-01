package q4;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import d.m0;
import d.t0;
import t4.k;

public class i extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f11889a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f11890b;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f11891c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f11892d;

    /* renamed from: e  reason: collision with root package name */
    public a f11893e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11894f;

    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f11895a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11896b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11897c;

        public a(Drawable.ConstantState constantState, int i10, int i11) {
            this.f11895a = constantState;
            this.f11896b = i10;
            this.f11897c = i11;
        }

        public a(a aVar) {
            this(aVar.f11895a, aVar.f11896b, aVar.f11897c);
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @m0
        public Drawable newDrawable() {
            return new i(this, this.f11895a.newDrawable());
        }

        @m0
        public Drawable newDrawable(Resources resources) {
            return new i(this, this.f11895a.newDrawable(resources));
        }
    }

    public i(Drawable drawable, int i10, int i11) {
        this(new a(drawable.getConstantState(), i10, i11), drawable);
    }

    public i(a aVar, Drawable drawable) {
        this.f11893e = (a) k.d(aVar);
        this.f11892d = (Drawable) k.d(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f11889a = new Matrix();
        this.f11890b = new RectF(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        this.f11891c = new RectF();
    }

    public final void a() {
        this.f11889a.setRectToRect(this.f11890b, this.f11891c, Matrix.ScaleToFit.CENTER);
    }

    public void clearColorFilter() {
        this.f11892d.clearColorFilter();
    }

    public void draw(@m0 Canvas canvas) {
        canvas.save();
        canvas.concat(this.f11889a);
        this.f11892d.draw(canvas);
        canvas.restore();
    }

    @t0(19)
    public int getAlpha() {
        return this.f11892d.getAlpha();
    }

    public Drawable.Callback getCallback() {
        return this.f11892d.getCallback();
    }

    public int getChangingConfigurations() {
        return this.f11892d.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f11893e;
    }

    @m0
    public Drawable getCurrent() {
        return this.f11892d.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f11893e.f11897c;
    }

    public int getIntrinsicWidth() {
        return this.f11893e.f11896b;
    }

    public int getMinimumHeight() {
        return this.f11892d.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f11892d.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f11892d.getOpacity();
    }

    public boolean getPadding(@m0 Rect rect) {
        return this.f11892d.getPadding(rect);
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        this.f11892d.invalidateSelf();
    }

    @m0
    public Drawable mutate() {
        if (!this.f11894f && super.mutate() == this) {
            this.f11892d = this.f11892d.mutate();
            this.f11893e = new a(this.f11893e);
            this.f11894f = true;
        }
        return this;
    }

    public void scheduleSelf(@m0 Runnable runnable, long j10) {
        super.scheduleSelf(runnable, j10);
        this.f11892d.scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f11892d.setAlpha(i10);
    }

    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f11891c.set((float) i10, (float) i11, (float) i12, (float) i13);
        a();
    }

    public void setBounds(@m0 Rect rect) {
        super.setBounds(rect);
        this.f11891c.set(rect);
        a();
    }

    public void setChangingConfigurations(int i10) {
        this.f11892d.setChangingConfigurations(i10);
    }

    public void setColorFilter(int i10, @m0 PorterDuff.Mode mode) {
        this.f11892d.setColorFilter(i10, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11892d.setColorFilter(colorFilter);
    }

    @Deprecated
    public void setDither(boolean z10) {
        this.f11892d.setDither(z10);
    }

    public void setFilterBitmap(boolean z10) {
        this.f11892d.setFilterBitmap(z10);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return this.f11892d.setVisible(z10, z11);
    }

    public void unscheduleSelf(@m0 Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f11892d.unscheduleSelf(runnable);
    }
}
