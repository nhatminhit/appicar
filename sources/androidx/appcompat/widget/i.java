package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.o;
import d.b1;
import d.f;
import d.m0;
import d.o0;
import f.a;

public class i extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f1311b = false;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1312a;

    public i(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet, i10, 0);
    }

    public i(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10, @b1 int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    public final void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        w0 G = w0.G(context, attributeSet, a.n.PopupWindow, i10, i11);
        int i12 = a.n.PopupWindow_overlapAnchor;
        if (G.C(i12)) {
            b(G.a(i12, false));
        }
        setBackgroundDrawable(G.h(a.n.PopupWindow_android_popupBackground));
        G.I();
    }

    public final void b(boolean z10) {
        if (f1311b) {
            this.f1312a = z10;
        } else {
            o.c(this, z10);
        }
    }

    public void showAsDropDown(View view, int i10, int i11) {
        if (f1311b && this.f1312a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1311b && this.f1312a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }

    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1311b && this.f1312a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }
}
