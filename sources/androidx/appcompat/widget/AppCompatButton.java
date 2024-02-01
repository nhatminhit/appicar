package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.b;
import androidx.core.widget.d0;
import androidx.core.widget.y;
import d.m0;
import d.o0;
import d.u;
import d.x0;
import f.a;
import f1.w0;

public class AppCompatButton extends Button implements w0, b, d0 {
    public final d O;
    public final u P;

    public AppCompatButton(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatButton(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.buttonStyle);
    }

    public AppCompatButton(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(t0.b(context), attributeSet, i10);
        r0.a(this, getContext());
        d dVar = new d(this);
        this.O = dVar;
        dVar.e(attributeSet, i10);
        u uVar = new u(this);
        this.P = uVar;
        uVar.m(attributeSet, i10);
        uVar.b();
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
    public int getAutoSizeMaxTextSize() {
        if (b.f2286a) {
            return super.getAutoSizeMaxTextSize();
        }
        u uVar = this.P;
        if (uVar != null) {
            return uVar.e();
        }
        return -1;
    }

    @x0({x0.a.Q})
    public int getAutoSizeMinTextSize() {
        if (b.f2286a) {
            return super.getAutoSizeMinTextSize();
        }
        u uVar = this.P;
        if (uVar != null) {
            return uVar.f();
        }
        return -1;
    }

    @x0({x0.a.Q})
    public int getAutoSizeStepGranularity() {
        if (b.f2286a) {
            return super.getAutoSizeStepGranularity();
        }
        u uVar = this.P;
        if (uVar != null) {
            return uVar.g();
        }
        return -1;
    }

    @x0({x0.a.Q})
    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f2286a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        u uVar = this.P;
        return uVar != null ? uVar.h() : new int[0];
    }

    @x0({x0.a.Q})
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f2286a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        u uVar = this.P;
        if (uVar != null) {
            return uVar.i();
        }
        return 0;
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
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.P.j();
    }

    @x0({x0.a.Q})
    @o0
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.P.k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        u uVar = this.P;
        if (uVar != null) {
            uVar.o(z10, i10, i11, i12, i13);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        u uVar = this.P;
        if (uVar != null && !b.f2286a && uVar.l()) {
            this.P.c();
        }
    }

    @x0({x0.a.Q})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (b.f2286a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        u uVar = this.P;
        if (uVar != null) {
            uVar.t(i10, i11, i12, i13);
        }
    }

    @x0({x0.a.Q})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@m0 int[] iArr, int i10) throws IllegalArgumentException {
        if (b.f2286a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        u uVar = this.P;
        if (uVar != null) {
            uVar.u(iArr, i10);
        }
    }

    @x0({x0.a.Q})
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (b.f2286a) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        u uVar = this.P;
        if (uVar != null) {
            uVar.v(i10);
        }
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y.H(this, callback));
    }

    public void setSupportAllCaps(boolean z10) {
        u uVar = this.P;
        if (uVar != null) {
            uVar.s(z10);
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
    public void setSupportCompoundDrawablesTintList(@o0 ColorStateList colorStateList) {
        this.P.w(colorStateList);
        this.P.b();
    }

    @x0({x0.a.Q})
    public void setSupportCompoundDrawablesTintMode(@o0 PorterDuff.Mode mode) {
        this.P.x(mode);
        this.P.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        u uVar = this.P;
        if (uVar != null) {
            uVar.q(context, i10);
        }
    }

    public void setTextSize(int i10, float f10) {
        if (b.f2286a) {
            super.setTextSize(i10, f10);
            return;
        }
        u uVar = this.P;
        if (uVar != null) {
            uVar.A(i10, f10);
        }
    }
}
