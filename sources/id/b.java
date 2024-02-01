package id;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public int f19692a;

    /* renamed from: b  reason: collision with root package name */
    public int f19693b;

    /* renamed from: c  reason: collision with root package name */
    public float f19694c;

    /* renamed from: d  reason: collision with root package name */
    public float f19695d;

    /* renamed from: e  reason: collision with root package name */
    public long f19696e = 0;

    public interface a {
        void a();

        void b();

        void onMove(int i10, int i11);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean b(WindowManager.LayoutParams layoutParams, a aVar, WindowManager windowManager, View view, View view2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f19696e = System.currentTimeMillis();
            this.f19692a = layoutParams.x;
            this.f19693b = layoutParams.y;
            this.f19694c = motionEvent.getRawX();
            this.f19695d = motionEvent.getRawY();
            return true;
        } else if (action == 1) {
            int i10 = layoutParams.x;
            int i11 = this.f19692a;
            if (i10 < i11 + 30 && i10 > i11 - 30) {
                int i12 = layoutParams.y;
                int i13 = this.f19693b;
                if (i12 < i13 + 30 && i12 > i13 - 30) {
                    if (System.currentTimeMillis() - this.f19696e > 1000) {
                        if (aVar != null) {
                            aVar.b();
                        }
                    } else if (aVar != null) {
                        aVar.a();
                    }
                }
            }
            return true;
        } else if (action != 2) {
            return false;
        } else {
            int rawX = this.f19692a + ((int) (motionEvent.getRawX() - this.f19694c));
            int rawY = this.f19693b + ((int) (motionEvent.getRawY() - this.f19695d));
            layoutParams.x = rawX;
            layoutParams.y = rawY;
            if (aVar != null) {
                aVar.onMove(rawX, rawY);
            }
            windowManager.updateViewLayout(view, layoutParams);
            return true;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void c(View view, View view2, WindowManager windowManager, WindowManager.LayoutParams layoutParams, a aVar) {
        view.setOnTouchListener(new a(this, layoutParams, aVar, windowManager, view2));
    }
}
