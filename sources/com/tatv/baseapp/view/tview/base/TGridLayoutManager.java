package com.tatv.baseapp.view.tview.base;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;

public class TGridLayoutManager extends GridLayoutManager {

    /* renamed from: a0  reason: collision with root package name */
    public boolean f17794a0 = false;

    public TGridLayoutManager(Context context, int i10) {
        super(context, i10);
    }

    public TGridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i10, i11, z10);
    }

    public TGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void U3(boolean z10) {
        this.f17794a0 = z10;
    }

    public boolean n() {
        return this.f17794a0 && super.n();
    }

    public boolean o() {
        return this.f17794a0 && super.o();
    }
}
