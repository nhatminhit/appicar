package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.a0;
import androidx.core.widget.y;
import d.m0;
import d.o0;
import d.t0;
import d.u;
import d.x0;
import f.a;
import f1.c;
import f1.r0;
import f1.w0;
import f1.w1;
import i1.e;
import i1.g;

public class AppCompatEditText extends EditText implements w0, r0 {
    public final d O;
    public final u P;
    public final n Q;
    public final a0 R;

    public AppCompatEditText(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatEditText(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.editTextStyle);
    }

    public AppCompatEditText(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(t0.b(context), attributeSet, i10);
        r0.a(this, getContext());
        d dVar = new d(this);
        this.O = dVar;
        dVar.e(attributeSet, i10);
        u uVar = new u(this);
        this.P = uVar;
        uVar.m(attributeSet, i10);
        uVar.b();
        this.Q = new n(this);
        this.R = new a0();
    }

    @o0
    public c a(@m0 c cVar) {
        return this.R.a(this, cVar);
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

    @o0
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatEditText.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    @o0
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.P.r(this, onCreateInputConnection, editorInfo);
        InputConnection a10 = g.a(onCreateInputConnection, editorInfo, this);
        String[] f02 = w1.f0(this);
        if (a10 == null || f02 == null) {
            return a10;
        }
        e.h(editorInfo, f02);
        return g.b(a10, editorInfo, k.a(this));
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (k.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i10) {
        if (k.c(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
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

    @t0(api = 26)
    public void setTextClassifier(@o0 TextClassifier textClassifier) {
        n nVar;
        if (Build.VERSION.SDK_INT >= 28 || (nVar = this.Q) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            nVar.b(textClassifier);
        }
    }
}
