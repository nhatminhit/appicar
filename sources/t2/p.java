package t2;

import android.graphics.Point;
import android.view.MotionEvent;
import d.m0;

public final class p {
    public static Point a(@m0 MotionEvent motionEvent) {
        return new Point((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public static boolean b(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static boolean c(@m0 MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 3;
    }

    public static boolean d(@m0 MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 0;
    }

    public static boolean e(@m0 MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 2;
    }

    public static boolean f(@m0 MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 5;
    }

    public static boolean g(@m0 MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 6;
    }

    public static boolean h(@m0 MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 1;
    }

    public static boolean i(@m0 MotionEvent motionEvent) {
        return b(motionEvent.getMetaState(), 2);
    }

    public static boolean j(MotionEvent motionEvent, int i10) {
        return i10 != 0 && (motionEvent.getButtonState() & i10) == i10;
    }

    public static boolean k(@m0 MotionEvent motionEvent) {
        return b(motionEvent.getMetaState(), 4096);
    }

    public static boolean l(@m0 MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 1;
    }

    public static boolean m(@m0 MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    public static boolean n(MotionEvent motionEvent) {
        return o(motionEvent) && e(motionEvent);
    }

    public static boolean o(@m0 MotionEvent motionEvent) {
        return j(motionEvent, 1);
    }

    public static boolean p(@m0 MotionEvent motionEvent) {
        return j(motionEvent, 2);
    }

    public static boolean q(@m0 MotionEvent motionEvent) {
        return b(motionEvent.getMetaState(), 1);
    }

    public static boolean r(@m0 MotionEvent motionEvent) {
        return j(motionEvent, 4);
    }

    public static boolean s(@m0 MotionEvent motionEvent) {
        return m(motionEvent) && e(motionEvent) && motionEvent.getButtonState() == 0;
    }
}
