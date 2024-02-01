package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import d.x0;
import fh.g;
import fh.h;
import xe.l0;
import xe.w;

@x0({x0.a.LIBRARY})
public class SixteenByNineFrameLayout extends FrameLayout {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SixteenByNineFrameLayout(@g Context context) {
        this(context, (AttributeSet) null);
        l0.p(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SixteenByNineFrameLayout(@g Context context, @h AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l0.p(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SixteenByNineFrameLayout(@g Context context, @h AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        l0.p(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SixteenByNineFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11, w wVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public void onMeasure(int i10, int i11) {
        if (getLayoutParams().height == -2) {
            i11 = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) * 9) / 16, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
