package j3;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import o0.d;
import o0.p;

public abstract class h extends Drawable implements p {
    public Drawable O;

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.O;
        if (drawable != null) {
            d.a(drawable, theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.O;
        if (drawable != null) {
            d.i(drawable);
        }
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    public boolean onLevelChange(int i10) {
        Drawable drawable = this.O;
        return drawable != null ? drawable.setLevel(i10) : super.onLevelChange(i10);
    }

    public void setChangingConfigurations(int i10) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setChangingConfigurations(i10);
        } else {
            super.setChangingConfigurations(i10);
        }
    }

    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setColorFilter(i10, mode);
        } else {
            super.setColorFilter(i10, mode);
        }
    }

    public void setFilterBitmap(boolean z10) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.O;
        if (drawable != null) {
            d.k(drawable, f10, f11);
        }
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Drawable drawable = this.O;
        if (drawable != null) {
            d.l(drawable, i10, i11, i12, i13);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.O;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
