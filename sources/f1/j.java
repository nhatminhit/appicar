package f1;

import android.graphics.Rect;
import android.view.Gravity;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final int f7184a = 8388608;

    /* renamed from: b  reason: collision with root package name */
    public static final int f7185b = 8388611;

    /* renamed from: c  reason: collision with root package name */
    public static final int f7186c = 8388613;

    /* renamed from: d  reason: collision with root package name */
    public static final int f7187d = 8388615;

    public static void a(int i10, int i11, int i12, Rect rect, int i13, int i14, Rect rect2, int i15) {
        Gravity.apply(i10, i11, i12, rect, i13, i14, rect2, i15);
    }

    public static void b(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
        Gravity.apply(i10, i11, i12, rect, rect2, i13);
    }

    public static void c(int i10, Rect rect, Rect rect2, int i11) {
        Gravity.applyDisplay(i10, rect, rect2, i11);
    }

    public static int d(int i10, int i11) {
        return Gravity.getAbsoluteGravity(i10, i11);
    }
}
