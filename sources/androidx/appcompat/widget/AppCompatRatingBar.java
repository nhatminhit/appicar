package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import d.m0;
import d.o0;
import f.a;

public class AppCompatRatingBar extends RatingBar {
    public final j O;

    public AppCompatRatingBar(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatRatingBar(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.ratingBarStyle);
    }

    public AppCompatRatingBar(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0.a(this, getContext());
        j jVar = new j(this);
        this.O = jVar;
        jVar.c(attributeSet, i10);
    }

    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap b10 = this.O.b();
        if (b10 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b10.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
