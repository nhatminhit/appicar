package t2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import e1.n;

public final class j implements RecyclerView.s {

    /* renamed from: a  reason: collision with root package name */
    public final GestureDetector f12842a;

    public j(@m0 GestureDetector gestureDetector) {
        n.a(gestureDetector != null);
        this.f12842a = gestureDetector;
    }

    public void a(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
    }

    public boolean c(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
        return this.f12842a.onTouchEvent(motionEvent);
    }

    public void e(boolean z10) {
    }
}
