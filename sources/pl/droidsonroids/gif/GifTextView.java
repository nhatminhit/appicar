package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import d.t0;
import h0.u0;
import java.io.IOException;
import pl.droidsonroids.gif.l;

public class GifTextView extends TextView {
    public l.b O;

    public GifTextView(Context context) {
        super(context);
    }

    public GifTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet, 0, 0);
    }

    public GifTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(attributeSet, i10, 0);
    }

    @t0(21)
    public GifTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        c(attributeSet, i10, i11);
    }

    public static void d(Drawable[] drawableArr, boolean z10) {
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setVisible(z10, false);
            }
        }
    }

    private void setCompoundDrawablesVisible(boolean z10) {
        d(getCompoundDrawables(), z10);
        d(getCompoundDrawablesRelative(), z10);
    }

    public final void a() {
        if (this.O.f22140b >= 0) {
            for (Drawable a10 : getCompoundDrawables()) {
                l.a(this.O.f22140b, a10);
            }
            for (Drawable a11 : getCompoundDrawablesRelative()) {
                l.a(this.O.f22140b, a11);
            }
            l.a(this.O.f22140b, getBackground());
        }
    }

    public final Drawable b(int i10) {
        if (i10 == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i10);
        if (!isInEditMode() && l.f22136b.contains(resourceTypeName)) {
            try {
                return new e(resources, i10);
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return resources.getDrawable(i10, getContext().getTheme());
    }

    public final void c(AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet != null) {
            Drawable b10 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableLeft", 0));
            Drawable b11 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableTop", 0));
            Drawable b12 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableRight", 0));
            Drawable b13 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableBottom", 0));
            Drawable b14 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableStart", 0));
            Drawable b15 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableEnd", 0));
            if (getLayoutDirection() == 0) {
                if (b14 != null) {
                    b10 = b14;
                }
                if (b15 == null) {
                    b15 = b12;
                }
            } else {
                if (b14 != null) {
                    b12 = b14;
                }
                if (b15 == null) {
                    b15 = b10;
                }
                b10 = b12;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(b10, b11, b15, b13);
            setBackground(b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", u0.q.C, 0)));
            this.O = new l.b(this, attributeSet, i10, i11);
            a();
        }
        this.O = new l.b();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setCompoundDrawablesVisible(true);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setCompoundDrawablesVisible(false);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        gifViewSavedState.a(compoundDrawables[0], 0);
        gifViewSavedState.a(compoundDrawables[1], 1);
        gifViewSavedState.a(compoundDrawables[2], 2);
        gifViewSavedState.a(compoundDrawables[3], 3);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        gifViewSavedState.a(compoundDrawablesRelative[0], 4);
        gifViewSavedState.a(compoundDrawablesRelative[2], 5);
        gifViewSavedState.a(getBackground(), 6);
    }

    public Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.O.f22139a) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            drawableArr[4] = compoundDrawablesRelative[0];
            drawableArr[5] = compoundDrawablesRelative[2];
            drawableArr[6] = getBackground();
        }
        return new GifViewSavedState(super.onSaveInstanceState(), drawableArr);
    }

    public void setBackgroundResource(int i10) {
        setBackground(b(i10));
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(b(i10), b(i11), b(i12), b(i13));
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        setCompoundDrawablesWithIntrinsicBounds(b(i10), b(i11), b(i12), b(i13));
    }

    public void setFreezesAnimation(boolean z10) {
        this.O.f22139a = z10;
    }
}
