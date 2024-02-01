package o0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import d.m0;
import d.t0;
import java.lang.reflect.Method;

@t0(21)
public class s extends r {
    public static final String V = "WrappedDrawableApi21";
    public static Method W;

    public s(Drawable drawable) {
        super(drawable);
        g();
    }

    public s(t tVar, Resources resources) {
        super(tVar, resources);
        g();
    }

    public boolean c() {
        return false;
    }

    public final void g() {
        if (W == null) {
            try {
                W = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    @m0
    public Rect getDirtyBounds() {
        return this.T.getDirtyBounds();
    }

    public void getOutline(@m0 Outline outline) {
        this.T.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.T;
        if (!(drawable == null || (method = W) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void setHotspot(float f10, float f11) {
        this.T.setHotspot(f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.T.setHotspotBounds(i10, i11, i12, i13);
    }

    public boolean setState(@m0 int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i10) {
        if (c()) {
            super.setTint(i10);
        } else {
            this.T.setTint(i10);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.T.setTintList(colorStateList);
        }
    }

    public void setTintMode(@m0 PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.T.setTintMode(mode);
        }
    }
}
