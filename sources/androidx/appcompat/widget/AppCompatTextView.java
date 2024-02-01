package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.d0;
import androidx.core.widget.y;
import b1.l;
import d.e0;
import d.m0;
import d.o0;
import d.r0;
import d.t0;
import d.u;
import d.x0;
import f1.w0;
import g.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements w0, d0, b {
    public final d O;
    public final u P;
    public final n Q;
    public boolean R;
    @o0
    public Future<l> S;

    public AppCompatTextView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatTextView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(t0.b(context), attributeSet, i10);
        this.R = false;
        r0.a(this, getContext());
        d dVar = new d(this);
        this.O = dVar;
        dVar.e(attributeSet, i10);
        u uVar = new u(this);
        this.P = uVar;
        uVar.m(attributeSet, i10);
        uVar.b();
        this.Q = new n(this);
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

    public final void e() {
        Future<l> future = this.S;
        if (future != null) {
            try {
                this.S = null;
                y.D(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
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

    public int getFirstBaselineToTopHeight() {
        return y.i(this);
    }

    public int getLastBaselineToBottomHeight() {
        return y.j(this);
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

    public CharSequence getText() {
        e();
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.Q;
     */
    @d.t0(api = 26)
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.n r0 = r2.Q
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    @m0
    public l.a getTextMetricsParamsCompat() {
        return y.o(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.P.r(this, onCreateInputConnection, editorInfo);
        return g.a(onCreateInputConnection, editorInfo, this);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        u uVar = this.P;
        if (uVar != null) {
            uVar.o(z10, i10, i11, i12, i13);
        }
    }

    public void onMeasure(int i10, int i11) {
        e();
        super.onMeasure(i10, i11);
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

    public void setCompoundDrawables(@o0 Drawable drawable, @o0 Drawable drawable2, @o0 Drawable drawable3, @o0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u uVar = this.P;
        if (uVar != null) {
            uVar.p();
        }
    }

    @t0(17)
    public void setCompoundDrawablesRelative(@o0 Drawable drawable, @o0 Drawable drawable2, @o0 Drawable drawable3, @o0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u uVar = this.P;
        if (uVar != null) {
            uVar.p();
        }
    }

    @t0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d10 = i10 != 0 ? a.d(context, i10) : null;
        Drawable d11 = i11 != 0 ? a.d(context, i11) : null;
        Drawable d12 = i12 != 0 ? a.d(context, i12) : null;
        if (i13 != 0) {
            drawable = a.d(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d10, d11, d12, drawable);
        u uVar = this.P;
        if (uVar != null) {
            uVar.p();
        }
    }

    @t0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@o0 Drawable drawable, @o0 Drawable drawable2, @o0 Drawable drawable3, @o0 Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        u uVar = this.P;
        if (uVar != null) {
            uVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d10 = i10 != 0 ? a.d(context, i10) : null;
        Drawable d11 = i11 != 0 ? a.d(context, i11) : null;
        Drawable d12 = i12 != 0 ? a.d(context, i12) : null;
        if (i13 != 0) {
            drawable = a.d(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(d10, d11, d12, drawable);
        u uVar = this.P;
        if (uVar != null) {
            uVar.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@o0 Drawable drawable, @o0 Drawable drawable2, @o0 Drawable drawable3, @o0 Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        u uVar = this.P;
        if (uVar != null) {
            uVar.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y.H(this, callback));
    }

    public void setFirstBaselineToTopHeight(@r0 @e0(from = 0) int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            y.A(this, i10);
        }
    }

    public void setLastBaselineToBottomHeight(@r0 @e0(from = 0) int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            y.B(this, i10);
        }
    }

    public void setLineHeight(@r0 @e0(from = 0) int i10) {
        y.C(this, i10);
    }

    public void setPrecomputedText(@m0 l lVar) {
        y.D(this, lVar);
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

    @t0(api = 26)
    public void setTextClassifier(@o0 TextClassifier textClassifier) {
        n nVar;
        if (Build.VERSION.SDK_INT >= 28 || (nVar = this.Q) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            nVar.b(textClassifier);
        }
    }

    public void setTextFuture(@o0 Future<l> future) {
        this.S = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@m0 l.a aVar) {
        y.F(this, aVar);
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

    public void setTypeface(@o0 Typeface typeface, int i10) {
        if (!this.R) {
            Typeface typeface2 = null;
            if (typeface != null && i10 > 0) {
                typeface2 = n0.x0.b(getContext(), typeface, i10);
            }
            this.R = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i10);
            } finally {
                this.R = false;
            }
        }
    }
}
