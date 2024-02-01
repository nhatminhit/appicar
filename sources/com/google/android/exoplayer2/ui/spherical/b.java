package com.google.android.exoplayer2.ui.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.ui.spherical.a;
import d.o0;
import s7.g;

public class b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, a.C0092a {
    public static final float V = 45.0f;
    public final PointF O = new PointF();
    public final PointF P = new PointF();
    public final a Q;
    public final float R;
    public final GestureDetector S;
    public volatile float T;
    @o0
    public g U;

    public interface a {
        void b(PointF pointF);
    }

    public b(Context context, a aVar, float f10) {
        this.Q = aVar;
        this.R = f10;
        this.S = new GestureDetector(context, this);
        this.T = 3.1415927f;
    }

    @d.g
    public void a(float[] fArr, float f10) {
        this.T = -f10;
    }

    public void b(@o0 g gVar) {
        this.U = gVar;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.O.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.O.x) / this.R;
        float y10 = motionEvent2.getY();
        PointF pointF = this.O;
        float f12 = (y10 - pointF.y) / this.R;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = (double) this.T;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.P;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = pointF2.y + (sin * x10) + (cos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.Q.b(this.P);
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        g gVar = this.U;
        if (gVar != null) {
            return gVar.onSingleTapUp(motionEvent);
        }
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.S.onTouchEvent(motionEvent);
    }
}
