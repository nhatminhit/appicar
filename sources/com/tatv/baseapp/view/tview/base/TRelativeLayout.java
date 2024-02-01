package com.tatv.baseapp.view.tview.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public abstract class TRelativeLayout extends RelativeLayout {
    public Context O;

    public TRelativeLayout(Context context) {
        super(context);
        c();
    }

    public TRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public TRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
    }

    public TRelativeLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        c();
    }

    public abstract void a();

    public abstract void b();

    public final void c() {
        Context context = getContext();
        this.O = context;
        View.inflate(context, getView(), this);
        b();
        a();
    }

    public abstract int getView();
}
