package f1;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import d.m0;

public final class r2 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7228a = "ViewParentCompat";

    /* renamed from: b  reason: collision with root package name */
    public static int[] f7229b;

    public static int[] a() {
        int[] iArr = f7229b;
        if (iArr == null) {
            f7229b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f7229b;
    }

    public static void b(ViewParent viewParent, View view, View view2, int i10) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
    }

    public static boolean c(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        try {
            return viewParent.onNestedFling(view, f10, f11, z10);
        } catch (AbstractMethodError unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ViewParent ");
            sb2.append(viewParent);
            sb2.append(" does not implement interface method onNestedFling");
            return false;
        }
    }

    public static boolean d(ViewParent viewParent, View view, float f10, float f11) {
        try {
            return viewParent.onNestedPreFling(view, f10, f11);
        } catch (AbstractMethodError unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ViewParent ");
            sb2.append(viewParent);
            sb2.append(" does not implement interface method onNestedPreFling");
            return false;
        }
    }

    public static void e(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
        f(viewParent, view, i10, i11, iArr, 0);
    }

    public static void f(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (viewParent instanceof l0) {
            ((l0) viewParent).v(view, i10, i11, iArr, i12);
        } else if (i12 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i10, i11, iArr);
            } catch (AbstractMethodError unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ViewParent ");
                sb2.append(viewParent);
                sb2.append(" does not implement interface method onNestedPreScroll");
            }
        }
    }

    public static void g(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
        i(viewParent, view, i10, i11, i12, i13, 0, a());
    }

    public static void h(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14) {
        i(viewParent, view, i10, i11, i12, i13, i14, a());
    }

    public static void i(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14, @m0 int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof m0) {
            ((m0) viewParent2).e(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent2 instanceof l0) {
            ((l0) viewParent2).r(view, i10, i11, i12, i13, i14);
        } else if (i14 == 0) {
            try {
                viewParent.onNestedScroll(view, i10, i11, i12, i13);
            } catch (AbstractMethodError unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ViewParent ");
                sb2.append(viewParent);
                sb2.append(" does not implement interface method onNestedScroll");
            }
        }
    }

    public static void j(ViewParent viewParent, View view, View view2, int i10) {
        k(viewParent, view, view2, i10, 0);
    }

    public static void k(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof l0) {
            ((l0) viewParent).t(view, view2, i10, i11);
        } else if (i11 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i10);
            } catch (AbstractMethodError unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ViewParent ");
                sb2.append(viewParent);
                sb2.append(" does not implement interface method onNestedScrollAccepted");
            }
        }
    }

    public static boolean l(ViewParent viewParent, View view, View view2, int i10) {
        return m(viewParent, view, view2, i10, 0);
    }

    public static boolean m(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof l0) {
            return ((l0) viewParent).s(view, view2, i10, i11);
        }
        if (i11 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i10);
        } catch (AbstractMethodError unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ViewParent ");
            sb2.append(viewParent);
            sb2.append(" does not implement interface method onStartNestedScroll");
            return false;
        }
    }

    public static void n(ViewParent viewParent, View view) {
        o(viewParent, view, 0);
    }

    public static void o(ViewParent viewParent, View view, int i10) {
        if (viewParent instanceof l0) {
            ((l0) viewParent).u(view, i10);
        } else if (i10 == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ViewParent ");
                sb2.append(viewParent);
                sb2.append(" does not implement interface method onStopNestedScroll");
            }
        }
    }

    @Deprecated
    public static boolean p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
