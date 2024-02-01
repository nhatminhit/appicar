package com.tatv.baseapp.view.tview.rounded;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tatv.baseapp.a;
import fd.b;

public class RoundedRelativeLayout extends RelativeLayout {
    public RectF O;
    public Path P = new Path();
    public float Q = 0.0f;

    public RoundedRelativeLayout(Context context) {
        super(context);
    }

    public RoundedRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public RoundedRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.q.RoundedView);
        String string = obtainStyledAttributes.getString(a.q.RoundedView_cornerRadiusValue);
        this.Q = string == null ? 15.0f : b.b(string.toString(), getResources().getDisplayMetrics());
        obtainStyledAttributes.recycle();
    }

    public final void b() {
        this.P.reset();
        Path path = this.P;
        RectF rectF = this.O;
        float f10 = this.Q;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        this.P.close();
    }

    public void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.P);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.P);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.O = new RectF(0.0f, 0.0f, (float) i10, (float) i11);
        b();
    }
}
