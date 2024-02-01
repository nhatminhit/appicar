package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import d.m0;
import d.o0;
import d.u;
import d.x0;
import f1.w0;

public class AppCompatToggleButton extends ToggleButton implements w0 {
    public final d O;
    public final u P;

    public AppCompatToggleButton(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatToggleButton(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public AppCompatToggleButton(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0.a(this, getContext());
        d dVar = new d(this);
        this.O = dVar;
        dVar.e(attributeSet, i10);
        u uVar = new u(this);
        this.P = uVar;
        uVar.m(attributeSet, i10);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.O;
        if (dVar != null) {
            dVar.b();
        }
        u uVar = this.P;
        if (uVar != null) {
            uVar.b();
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
}
