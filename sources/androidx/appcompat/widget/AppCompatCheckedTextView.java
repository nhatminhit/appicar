package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.y;
import d.m0;
import d.o0;
import d.u;
import g.a;

public class AppCompatCheckedTextView extends CheckedTextView {
    public static final int[] P = {16843016};
    public final u O;

    public AppCompatCheckedTextView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatCheckedTextView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public AppCompatCheckedTextView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(t0.b(context), attributeSet, i10);
        r0.a(this, getContext());
        u uVar = new u(this);
        this.O = uVar;
        uVar.m(attributeSet, i10);
        uVar.b();
        w0 G = w0.G(getContext(), attributeSet, P, i10, 0);
        setCheckMarkDrawable(G.h(0));
        G.I();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.O;
        if (uVar != null) {
            uVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return g.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(@u int i10) {
        setCheckMarkDrawable(a.d(getContext(), i10));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(y.H(this, callback));
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        u uVar = this.O;
        if (uVar != null) {
            uVar.q(context, i10);
        }
    }
}
