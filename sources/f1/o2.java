package f1;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import d.m0;

public final class o2 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f7225a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f7226b = 1;

    public static int a(@m0 ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    public static int b(@m0 ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static boolean c(@m0 ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    @Deprecated
    public static boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void e(@m0 ViewGroup viewGroup, int i10) {
        viewGroup.setLayoutMode(i10);
    }

    @Deprecated
    public static void f(ViewGroup viewGroup, boolean z10) {
        viewGroup.setMotionEventSplittingEnabled(z10);
    }

    public static void g(@m0 ViewGroup viewGroup, boolean z10) {
        viewGroup.setTransitionGroup(z10);
    }
}
