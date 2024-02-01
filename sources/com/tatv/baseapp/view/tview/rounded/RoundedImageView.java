package com.tatv.baseapp.view.tview.rounded;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.tatv.baseapp.a;
import fd.b;

public class RoundedImageView extends AppCompatImageView {
    public RectF Q;
    public Path R = new Path();
    public float S = 0.0f;

    public RoundedImageView(Context context) {
        super(context);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.q.RoundedView);
        String string = obtainStyledAttributes.getString(a.q.RoundedView_cornerRadiusValue);
        this.S = string == null ? 15.0f : b.b(string.toString(), getResources().getDisplayMetrics());
        obtainStyledAttributes.recycle();
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public final void b() {
        this.R.reset();
        Path path = this.R;
        RectF rectF = this.Q;
        float f10 = this.S;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        this.R.close();
    }

    public void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.R);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.R);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.Q = new RectF(0.0f, 0.0f, (float) i10, (float) i11);
        b();
    }
}
