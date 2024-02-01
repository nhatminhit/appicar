package t2;

import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import d.m0;
import d.o0;
import e1.n;

public final class k<T extends GestureDetector.OnGestureListener & GestureDetector.OnDoubleTapListener> implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public final i0<T> O;

    public k() {
        this(new GestureDetector.SimpleOnGestureListener());
    }

    public k(@m0 T t10) {
        n.a(t10 != null);
        this.O = new i0<>(t10);
    }

    public void a(int i10, @o0 T t10) {
        this.O.b(i10, t10);
    }

    public boolean onDoubleTap(@m0 MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener) ((GestureDetector.OnGestureListener) this.O.a(motionEvent))).onDoubleTap(motionEvent);
    }

    public boolean onDoubleTapEvent(@m0 MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener) ((GestureDetector.OnGestureListener) this.O.a(motionEvent))).onDoubleTapEvent(motionEvent);
    }

    public boolean onDown(@m0 MotionEvent motionEvent) {
        return ((GestureDetector.OnGestureListener) this.O.a(motionEvent)).onDown(motionEvent);
    }

    public boolean onFling(@m0 MotionEvent motionEvent, @m0 MotionEvent motionEvent2, float f10, float f11) {
        return ((GestureDetector.OnGestureListener) this.O.a(motionEvent2)).onFling(motionEvent, motionEvent2, f10, f11);
    }

    public void onLongPress(@m0 MotionEvent motionEvent) {
        ((GestureDetector.OnGestureListener) this.O.a(motionEvent)).onLongPress(motionEvent);
    }

    public boolean onScroll(@m0 MotionEvent motionEvent, @m0 MotionEvent motionEvent2, float f10, float f11) {
        return ((GestureDetector.OnGestureListener) this.O.a(motionEvent2)).onScroll(motionEvent, motionEvent2, f10, f11);
    }

    public void onShowPress(@m0 MotionEvent motionEvent) {
        ((GestureDetector.OnGestureListener) this.O.a(motionEvent)).onShowPress(motionEvent);
    }

    public boolean onSingleTapConfirmed(@m0 MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener) ((GestureDetector.OnGestureListener) this.O.a(motionEvent))).onSingleTapConfirmed(motionEvent);
    }

    public boolean onSingleTapUp(@m0 MotionEvent motionEvent) {
        return ((GestureDetector.OnGestureListener) this.O.a(motionEvent)).onSingleTapUp(motionEvent);
    }
}
