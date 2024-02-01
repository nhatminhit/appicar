package id;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import id.b;

public final /* synthetic */ class a implements View.OnTouchListener {
    public final /* synthetic */ b O;
    public final /* synthetic */ WindowManager.LayoutParams P;
    public final /* synthetic */ b.a Q;
    public final /* synthetic */ WindowManager R;
    public final /* synthetic */ View S;

    public /* synthetic */ a(b bVar, WindowManager.LayoutParams layoutParams, b.a aVar, WindowManager windowManager, View view) {
        this.O = bVar;
        this.P = layoutParams;
        this.Q = aVar;
        this.R = windowManager;
        this.S = view;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.O.b(this.P, this.Q, this.R, this.S, view, motionEvent);
    }
}
