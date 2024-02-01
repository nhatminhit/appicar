package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import d.m0;
import d.t0;

public class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f1225a;

    public b(ActionBarContainer actionBarContainer) {
        this.f1225a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1225a;
        if (actionBarContainer.V) {
            Drawable drawable = actionBarContainer.U;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.S;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1225a;
        Drawable drawable3 = actionBarContainer2.T;
        if (drawable3 != null && actionBarContainer2.W) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    @t0(21)
    public void getOutline(@m0 Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1225a;
        if (actionBarContainer.V) {
            drawable = actionBarContainer.U;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.S;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i10) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
