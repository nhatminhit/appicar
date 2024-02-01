package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.widget.e0;
import d.m0;
import d.o0;
import d.u;
import d.x0;
import f.a;
import f1.w0;

public class AppCompatImageButton extends ImageButton implements w0, e0 {
    public final d O;
    public final h P;

    public AppCompatImageButton(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatImageButton(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.imageButtonStyle);
    }

    public AppCompatImageButton(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(t0.b(context), attributeSet, i10);
        r0.a(this, getContext());
        d dVar = new d(this);
        this.O = dVar;
        dVar.e(attributeSet, i10);
        h hVar = new h(this);
        this.P = hVar;
        hVar.f(attributeSet, i10);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.O;
        if (dVar != null) {
            dVar.b();
        }
        h hVar = this.P;
        if (hVar != null) {
            hVar.b();
        }
    }

    @x0({x0.a.Q})
    @o0
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.O;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @x0({x0.a.Q})
    @o0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.O;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @x0({x0.a.Q})
    @o0
    public ColorStateList getSupportImageTintList() {
        h hVar = this.P;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    @x0({x0.a.Q})
    @o0
    public PorterDuff.Mode getSupportImageTintMode() {
        h hVar = this.P;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.P.e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(@o0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.O;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(@u int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.O;
        if (dVar != null) {
            dVar.g(i10);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        h hVar = this.P;
        if (hVar != null) {
            hVar.b();
        }
    }

    public void setImageDrawable(@o0 Drawable drawable) {
        super.setImageDrawable(drawable);
        h hVar = this.P;
        if (hVar != null) {
            hVar.b();
        }
    }

    public void setImageResource(@u int i10) {
        this.P.g(i10);
    }

    public void setImageURI(@o0 Uri uri) {
        super.setImageURI(uri);
        h hVar = this.P;
        if (hVar != null) {
            hVar.b();
        }
    }

    @x0({x0.a.Q})
    public void setSupportBackgroundTintList(@o0 ColorStateList colorStateList) {
        d dVar = this.O;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @x0({x0.a.Q})
    public void setSupportBackgroundTintMode(@o0 PorterDuff.Mode mode) {
        d dVar = this.O;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @x0({x0.a.Q})
    public void setSupportImageTintList(@o0 ColorStateList colorStateList) {
        h hVar = this.P;
        if (hVar != null) {
            hVar.i(colorStateList);
        }
    }

    @x0({x0.a.Q})
    public void setSupportImageTintMode(@o0 PorterDuff.Mode mode) {
        h hVar = this.P;
        if (hVar != null) {
            hVar.j(mode);
        }
    }
}
