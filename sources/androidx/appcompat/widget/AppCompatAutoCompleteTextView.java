package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.y;
import d.m0;
import d.o0;
import d.u;
import d.x0;
import f.a;
import f1.w0;

public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements w0 {
    public static final int[] Q = {16843126};
    public final d O;
    public final u P;

    public AppCompatAutoCompleteTextView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatAutoCompleteTextView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(t0.b(context), attributeSet, i10);
        r0.a(this, getContext());
        w0 G = w0.G(getContext(), attributeSet, Q, i10, 0);
        if (G.C(0)) {
            setDropDownBackgroundDrawable(G.h(0));
        }
        G.I();
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

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return g.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
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

    public void setDropDownBackgroundResource(@u int i10) {
        setDropDownBackgroundDrawable(g.a.d(getContext(), i10));
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

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        u uVar = this.P;
        if (uVar != null) {
            uVar.q(context, i10);
        }
    }
}
