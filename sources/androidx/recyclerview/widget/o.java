package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import f1.w1;
import s2.a;

public class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f3662a = new o();

    public static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != view) {
                float P = w1.P(childAt);
                if (P > f10) {
                    f10 = P;
                }
            }
        }
        return f10;
    }

    public void a(View view) {
        int i10 = a.e.item_touch_helper_previous_elevation;
        Object tag = view.getTag(i10);
        if (tag instanceof Float) {
            w1.L1(view, ((Float) tag).floatValue());
        }
        view.setTag(i10, (Object) null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void b(View view) {
    }

    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
    }

    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        if (z10) {
            int i11 = a.e.item_touch_helper_previous_elevation;
            if (view.getTag(i11) == null) {
                Float valueOf = Float.valueOf(w1.P(view));
                w1.L1(view, e(recyclerView, view) + 1.0f);
                view.setTag(i11, valueOf);
            }
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }
}
