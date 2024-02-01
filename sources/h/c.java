package h;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import d.x0;
import o0.d;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class c extends Drawable implements Drawable.Callback {
    public Drawable O;

    public c(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.O;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.O;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.O = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.O.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.O.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.O.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.O.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.O.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.O.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.O.getMinimumWidth();
    }

    public int getOpacity() {
        return this.O.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.O.getPadding(rect);
    }

    public int[] getState() {
        return this.O.getState();
    }

    public Region getTransparentRegion() {
        return this.O.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return d.h(this.O);
    }

    public boolean isStateful() {
        return this.O.isStateful();
    }

    public void jumpToCurrentState() {
        this.O.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.O.setBounds(rect);
    }

    public boolean onLevelChange(int i10) {
        return this.O.setLevel(i10);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.O.setAlpha(i10);
    }

    public void setAutoMirrored(boolean z10) {
        d.j(this.O, z10);
    }

    public void setChangingConfigurations(int i10) {
        this.O.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.O.setColorFilter(colorFilter);
    }

    public void setDither(boolean z10) {
        this.O.setDither(z10);
    }

    public void setFilterBitmap(boolean z10) {
        this.O.setFilterBitmap(z10);
    }

    public void setHotspot(float f10, float f11) {
        d.k(this.O, f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        d.l(this.O, i10, i11, i12, i13);
    }

    public boolean setState(int[] iArr) {
        return this.O.setState(iArr);
    }

    public void setTint(int i10) {
        d.n(this.O, i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        d.o(this.O, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        d.p(this.O, mode);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.O.setVisible(z10, z11);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
