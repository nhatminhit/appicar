package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import d.i;
import d.m0;
import d.o0;
import f1.w1;
import i9.a;
import j9.h;
import j9.j;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    @o0

    /* renamed from: l  reason: collision with root package name */
    public Map<View, Integer> f17696l;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @i
    public boolean K(@m0 View view, @m0 View view2, boolean z10, boolean z11) {
        j0(view2, z10);
        return super.K(view, view2, z10, z11);
    }

    @m0
    public FabTransformationBehavior.e h0(Context context, boolean z10) {
        int i10 = z10 ? a.b.mtrl_fab_transformation_sheet_expand_spec : a.b.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f17685a = h.d(context, i10);
        eVar.f17686b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public final void j0(@m0 View view, boolean z10) {
        int i10;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f17696l = new HashMap(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.g) && (((CoordinatorLayout.g) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    Map<View, Integer> map = this.f17696l;
                    if (z10) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        i10 = 4;
                    } else if (map != null && map.containsKey(childAt)) {
                        i10 = this.f17696l.get(childAt).intValue();
                    }
                    w1.P1(childAt, i10);
                }
            }
            if (!z10) {
                this.f17696l = null;
            }
        }
    }
}
