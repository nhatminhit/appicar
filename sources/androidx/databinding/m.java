package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static k f2368a = new DataBinderMapperImpl();

    /* renamed from: b  reason: collision with root package name */
    public static l f2369b = null;

    @o0
    public static <T extends ViewDataBinding> T a(@m0 View view) {
        return b(view, f2369b);
    }

    @o0
    public static <T extends ViewDataBinding> T b(@m0 View view, l lVar) {
        T h10 = h(view);
        if (h10 != null) {
            return h10;
        }
        Object tag = view.getTag();
        if (tag instanceof String) {
            int e10 = f2368a.e((String) tag);
            if (e10 != 0) {
                return f2368a.c(lVar, view, e10);
            }
            throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
        }
        throw new IllegalArgumentException("View is not a binding layout");
    }

    public static <T extends ViewDataBinding> T c(l lVar, View view, int i10) {
        return f2368a.c(lVar, view, i10);
    }

    public static <T extends ViewDataBinding> T d(l lVar, View[] viewArr, int i10) {
        return f2368a.d(lVar, viewArr, i10);
    }

    public static <T extends ViewDataBinding> T e(l lVar, ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        if (i12 == 1) {
            return c(lVar, viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return d(lVar, viewArr, i11);
    }

    @o0
    public static String f(int i10) {
        return f2368a.b(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r3 == -1) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r1.indexOf(47, r3 + 1) == -1) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004c A[SYNTHETIC] */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends androidx.databinding.ViewDataBinding> T g(@d.m0 android.view.View r9) {
        /*
        L_0x0000:
            r0 = 0
            if (r9 == 0) goto L_0x005a
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.ViewDataBinding.y(r9)
            if (r1 == 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.Object r1 = r9.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x004d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "layout"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = "_0"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L_0x004d
            r2 = 6
            char r2 = r1.charAt(r2)
            r3 = 7
            r4 = 47
            int r3 = r1.indexOf(r4, r3)
            r5 = 1
            r6 = -1
            r7 = 0
            if (r2 != r4) goto L_0x003b
            if (r3 != r6) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r5 = r7
        L_0x0039:
            r7 = r5
            goto L_0x004a
        L_0x003b:
            r8 = 45
            if (r2 != r8) goto L_0x004a
            if (r3 == r6) goto L_0x004a
            int r3 = r3 + 1
            int r1 = r1.indexOf(r4, r3)
            if (r1 != r6) goto L_0x0038
            goto L_0x0039
        L_0x004a:
            if (r7 == 0) goto L_0x004d
            return r0
        L_0x004d:
            android.view.ViewParent r9 = r9.getParent()
            boolean r1 = r9 instanceof android.view.View
            if (r1 == 0) goto L_0x0058
            android.view.View r9 = (android.view.View) r9
            goto L_0x0000
        L_0x0058:
            r9 = r0
            goto L_0x0000
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.m.g(android.view.View):androidx.databinding.ViewDataBinding");
    }

    @o0
    public static <T extends ViewDataBinding> T h(@m0 View view) {
        return ViewDataBinding.y(view);
    }

    @o0
    public static l i() {
        return f2369b;
    }

    public static <T extends ViewDataBinding> T j(@m0 LayoutInflater layoutInflater, int i10, @o0 ViewGroup viewGroup, boolean z10) {
        return k(layoutInflater, i10, viewGroup, z10, f2369b);
    }

    public static <T extends ViewDataBinding> T k(@m0 LayoutInflater layoutInflater, int i10, @o0 ViewGroup viewGroup, boolean z10, @o0 l lVar) {
        int i11 = 0;
        boolean z11 = viewGroup != null && z10;
        if (z11) {
            i11 = viewGroup.getChildCount();
        }
        return z11 ? e(lVar, viewGroup, i11, i10) : c(lVar, layoutInflater.inflate(i10, viewGroup, z10), i10);
    }

    public static <T extends ViewDataBinding> T l(@m0 Activity activity, int i10) {
        return m(activity, i10, f2369b);
    }

    public static <T extends ViewDataBinding> T m(@m0 Activity activity, int i10, @o0 l lVar) {
        activity.setContentView(i10);
        return e(lVar, (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290), 0, i10);
    }

    public static void n(@o0 l lVar) {
        f2369b = lVar;
    }
}
