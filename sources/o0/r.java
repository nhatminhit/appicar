package o0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import d.m0;
import d.o0;
import d.t0;

public class r extends Drawable implements Drawable.Callback, q, p {
    public static final PorterDuff.Mode U = PorterDuff.Mode.SRC_IN;
    public int O;
    public PorterDuff.Mode P;
    public boolean Q;
    public t R;
    public boolean S;
    public Drawable T;

    public r(@o0 Drawable drawable) {
        this.R = d();
        a(drawable);
    }

    public r(@m0 t tVar, @o0 Resources resources) {
        this.R = tVar;
        e(resources);
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.T;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.T = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            t tVar = this.R;
            if (tVar != null) {
                tVar.f11029b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final Drawable b() {
        return this.T;
    }

    public boolean c() {
        return true;
    }

    @m0
    public final t d() {
        return new t(this.R);
    }

    public void draw(@m0 Canvas canvas) {
        this.T.draw(canvas);
    }

    public final void e(@o0 Resources resources) {
        Drawable.ConstantState constantState;
        t tVar = this.R;
        if (tVar != null && (constantState = tVar.f11029b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    public final boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        t tVar = this.R;
        ColorStateList colorStateList = tVar.f11030c;
        PorterDuff.Mode mode = tVar.f11031d;
        if (colorStateList == null || mode == null) {
            this.Q = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.Q && colorForState == this.O && mode == this.P)) {
                setColorFilter(colorForState, mode);
                this.O = colorForState;
                this.P = mode;
                this.Q = true;
                return true;
            }
        }
        return false;
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        t tVar = this.R;
        return changingConfigurations | (tVar != null ? tVar.getChangingConfigurations() : 0) | this.T.getChangingConfigurations();
    }

    @o0
    public Drawable.ConstantState getConstantState() {
        t tVar = this.R;
        if (tVar == null || !tVar.a()) {
            return null;
        }
        this.R.f11028a = getChangingConfigurations();
        return this.R;
    }

    @m0
    public Drawable getCurrent() {
        return this.T.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.T.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.T.getIntrinsicWidth();
    }

    @t0(23)
    public int getLayoutDirection() {
        return d.f(this.T);
    }

    public int getMinimumHeight() {
        return this.T.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.T.getMinimumWidth();
    }

    public int getOpacity() {
        return this.T.getOpacity();
    }

    public boolean getPadding(@m0 Rect rect) {
        return this.T.getPadding(rect);
    }

    @m0
    public int[] getState() {
        return this.T.getState();
    }

    public Region getTransparentRegion() {
        return this.T.getTransparentRegion();
    }

    public void invalidateDrawable(@m0 Drawable drawable) {
        invalidateSelf();
    }

    @t0(19)
    public boolean isAutoMirrored() {
        return d.h(this.T);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.R;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            o0.t r0 = r1.R
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f11030c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.T
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.r.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.T.jumpToCurrentState();
    }

    @m0
    public Drawable mutate() {
        if (!this.S && super.mutate() == this) {
            this.R = d();
            Drawable drawable = this.T;
            if (drawable != null) {
                drawable.mutate();
            }
            t tVar = this.R;
            if (tVar != null) {
                Drawable drawable2 = this.T;
                tVar.f11029b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.S = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.T;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @t0(23)
    public boolean onLayoutDirectionChanged(int i10) {
        return d.m(this.T, i10);
    }

    public boolean onLevelChange(int i10) {
        return this.T.setLevel(i10);
    }

    public void scheduleDrawable(@m0 Drawable drawable, @m0 Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.T.setAlpha(i10);
    }

    @t0(19)
    public void setAutoMirrored(boolean z10) {
        d.j(this.T, z10);
    }

    public void setChangingConfigurations(int i10) {
        this.T.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.T.setColorFilter(colorFilter);
    }

    public void setDither(boolean z10) {
        this.T.setDither(z10);
    }

    public void setFilterBitmap(boolean z10) {
        this.T.setFilterBitmap(z10);
    }

    public boolean setState(@m0 int[] iArr) {
        return f(iArr) || this.T.setState(iArr);
    }

    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.R.f11030c = colorStateList;
        f(getState());
    }

    public void setTintMode(@m0 PorterDuff.Mode mode) {
        this.R.f11031d = mode;
        f(getState());
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.T.setVisible(z10, z11);
    }

    public void unscheduleDrawable(@m0 Drawable drawable, @m0 Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
