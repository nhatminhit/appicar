package g3;

import android.view.View;

public abstract class t1 extends n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7886a = "android:visibilityPropagation:visibility";

    /* renamed from: b  reason: collision with root package name */
    public static final String f7887b = "android:visibilityPropagation:center";

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f7888c = {f7886a, f7887b};

    public static int d(r0 r0Var, int i10) {
        int[] iArr;
        if (r0Var == null || (iArr = (int[]) r0Var.f7847a.get(f7887b)) == null) {
            return -1;
        }
        return iArr[i10];
    }

    public void a(r0 r0Var) {
        View view = r0Var.f7848b;
        Integer num = (Integer) r0Var.f7847a.get(s1.L0);
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        r0Var.f7847a.put(f7886a, num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = round;
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        r0Var.f7847a.put(f7887b, iArr);
    }

    public String[] b() {
        return f7888c;
    }

    public int e(r0 r0Var) {
        Integer num;
        if (r0Var == null || (num = (Integer) r0Var.f7847a.get(f7886a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(r0 r0Var) {
        return d(r0Var, 0);
    }

    public int g(r0 r0Var) {
        return d(r0Var, 1);
    }
}
