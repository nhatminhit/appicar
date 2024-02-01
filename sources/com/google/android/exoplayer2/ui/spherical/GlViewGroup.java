package com.google.android.exoplayer2.ui.spherical;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import d.d;
import d.f1;
import s7.b;
import w7.a;

public final class GlViewGroup extends FrameLayout {
    public final b O;

    public GlViewGroup(Context context, int i10) {
        super(context);
        b bVar = new b();
        this.O = bVar;
        LayoutInflater.from(context).inflate(i10, this);
        measure(-2, -2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        a.i(measuredWidth > 0 && measuredHeight > 0);
        bVar.g(measuredWidth, measuredHeight);
        setLayoutParams(new FrameLayout.LayoutParams(measuredWidth, measuredHeight));
    }

    @f1
    public boolean a() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    @f1
    public boolean b(int i10, float f10, float f11) {
        PointF i11;
        if (!a() || (i11 = this.O.i(f10, f11)) == null) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, i10, i11.x, i11.y, 1));
        return true;
    }

    public void dispatchDraw(Canvas canvas) {
        Canvas f10 = this.O.f();
        if (f10 == null) {
            postInvalidate();
            return;
        }
        f10.drawColor(0, PorterDuff.Mode.CLEAR);
        super.dispatchDraw(f10);
        this.O.j(f10);
    }

    @d
    public b getRenderer() {
        return this.O;
    }
}
