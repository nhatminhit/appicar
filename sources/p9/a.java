package p9;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import d.m0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP})
public class a implements View.OnTouchListener {
    @m0
    public final Dialog O;
    public final int P;
    public final int Q;
    public final int R;

    public a(@m0 Dialog dialog, @m0 Rect rect) {
        this.O = dialog;
        this.P = rect.left;
        this.Q = rect.top;
        this.R = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(@m0 View view, @m0 MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.P + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.Q + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.R;
            obtain.setLocation((float) ((-i10) - 1), (float) ((-i10) - 1));
        }
        view.performClick();
        return this.O.onTouchEvent(obtain);
    }
}
