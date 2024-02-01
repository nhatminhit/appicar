package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.c0;
import d.o0;
import d.u;
import d.x0;
import f.a;
import f1.w0;

public class AppCompatRadioButton extends RadioButton implements c0, w0 {
    public final e O;
    public final d P;
    public final u Q;

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatRadioButton(Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, @o0 AttributeSet attributeSet, int i10) {
        super(t0.b(context), attributeSet, i10);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.O = eVar;
        eVar.e(attributeSet, i10);
        d dVar = new d(this);
        this.P = dVar;
        dVar.e(attributeSet, i10);
        u uVar = new u(this);
        this.Q = uVar;
        uVar.m(attributeSet, i10);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.P;
        if (dVar != null) {
            dVar.b();
        }
        u uVar = this.Q;
        if (uVar != null) {
            uVar.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        e eVar = this.O;
        return eVar != null ? eVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @x0({x0.a.Q})
    @o0
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.P;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @x0({x0.a.Q})
    @o0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.P;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @x0({x0.a.Q})
    @o0
    public ColorStateList getSupportButtonTintList() {
        e eVar = this.O;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @x0({x0.a.Q})
    @o0
    public PorterDuff.Mode getSupportButtonTintMode() {
        e eVar = this.O;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void setBackgroundDrawable(@o0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.P;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(@u int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.P;
        if (dVar != null) {
            dVar.g(i10);
        }
    }

    public void setButtonDrawable(@u int i10) {
        setButtonDrawable(g.a.d(getContext(), i10));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        e eVar = this.O;
        if (eVar != null) {
            eVar.f();
        }
    }

    @x0({x0.a.Q})
    public void setSupportBackgroundTintList(@o0 ColorStateList colorStateList) {
        d dVar = this.P;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @x0({x0.a.Q})
    public void setSupportBackgroundTintMode(@o0 PorterDuff.Mode mode) {
        d dVar = this.P;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @x0({x0.a.Q})
    public void setSupportButtonTintList(@o0 ColorStateList colorStateList) {
        e eVar = this.O;
        if (eVar != null) {
            eVar.g(colorStateList);
        }
    }

    @x0({x0.a.Q})
    public void setSupportButtonTintMode(@o0 PorterDuff.Mode mode) {
        e eVar = this.O;
        if (eVar != null) {
            eVar.h(mode);
        }
    }
}
