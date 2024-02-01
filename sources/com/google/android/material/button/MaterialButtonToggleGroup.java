package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.v;
import d.b0;
import d.g1;
import d.h;
import d.m0;
import d.o0;
import f1.w1;
import g1.z;
import i9.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import z9.o;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: b0  reason: collision with root package name */
    public static final String f16818b0 = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: c0  reason: collision with root package name */
    public static final int f16819c0 = a.n.Widget_MaterialComponents_MaterialButtonToggleGroup;
    public final List<d> O;
    public final c P;
    public final f Q;
    public final LinkedHashSet<e> R;
    public final Comparator<MaterialButton> S;
    public Integer[] T;
    public boolean U;
    public boolean V;
    public boolean W;
    @b0

    /* renamed from: a0  reason: collision with root package name */
    public int f16820a0;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends f1.a {
        public b() {
        }

        public void g(View view, @m0 z zVar) {
            super.g(view, zVar);
            zVar.X0(z.c.h(0, 1, MaterialButtonToggleGroup.this.p(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public class c implements MaterialButton.b {
        public c() {
        }

        public /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }

        public void a(@m0 MaterialButton materialButton, boolean z10) {
            if (!MaterialButtonToggleGroup.this.U) {
                if (MaterialButtonToggleGroup.this.V) {
                    int unused = MaterialButtonToggleGroup.this.f16820a0 = z10 ? materialButton.getId() : -1;
                }
                if (MaterialButtonToggleGroup.this.z(materialButton.getId(), z10)) {
                    MaterialButtonToggleGroup.this.n(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }
    }

    public static class d {

        /* renamed from: e  reason: collision with root package name */
        public static final z9.d f16823e = new z9.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public z9.d f16824a;

        /* renamed from: b  reason: collision with root package name */
        public z9.d f16825b;

        /* renamed from: c  reason: collision with root package name */
        public z9.d f16826c;

        /* renamed from: d  reason: collision with root package name */
        public z9.d f16827d;

        public d(z9.d dVar, z9.d dVar2, z9.d dVar3, z9.d dVar4) {
            this.f16824a = dVar;
            this.f16825b = dVar3;
            this.f16826c = dVar4;
            this.f16827d = dVar2;
        }

        public static d a(d dVar) {
            z9.d dVar2 = f16823e;
            return new d(dVar2, dVar.f16827d, dVar2, dVar.f16826c);
        }

        public static d b(d dVar, View view) {
            return v.j(view) ? c(dVar) : d(dVar);
        }

        public static d c(d dVar) {
            z9.d dVar2 = dVar.f16824a;
            z9.d dVar3 = dVar.f16827d;
            z9.d dVar4 = f16823e;
            return new d(dVar2, dVar3, dVar4, dVar4);
        }

        public static d d(d dVar) {
            z9.d dVar2 = f16823e;
            return new d(dVar2, dVar2, dVar.f16825b, dVar.f16826c);
        }

        public static d e(d dVar, View view) {
            return v.j(view) ? d(dVar) : c(dVar);
        }

        public static d f(d dVar) {
            z9.d dVar2 = dVar.f16824a;
            z9.d dVar3 = f16823e;
            return new d(dVar2, dVar3, dVar.f16825b, dVar3);
        }
    }

    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, @b0 int i10, boolean z10);
    }

    public class f implements MaterialButton.c {
        public f() {
        }

        public /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }

        public void a(@m0 MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialButtonToggleGroup(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.materialButtonToggleGroupStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(@d.m0 android.content.Context r7, @d.o0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f16819c0
            android.content.Context r7 = ca.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.O = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.P = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.Q = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.R = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.S = r7
            r7 = 0
            r6.U = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = i9.a.o.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r9 = i9.a.o.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = i9.a.o.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f16820a0 = r9
            int r9 = i9.a.o.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.W = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            f1.w1.P1(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (r(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (r(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && r(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setCheckedId(int i10) {
        this.f16820a0 = i10;
        n(i10, true);
    }

    private void setGeneratedIdIfNeeded(@m0 MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(w1.B());
        }
    }

    private void setupButtonChild(@m0 MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.a(this.P);
        materialButton.setOnPressedChangeListenerInternal(this.Q);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public static void y(o.b bVar, @o0 d dVar) {
        if (dVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.L(dVar.f16824a).y(dVar.f16827d).Q(dVar.f16825b).D(dVar.f16826c);
        }
    }

    public final void A() {
        TreeMap treeMap = new TreeMap(this.S);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(o(i10), Integer.valueOf(i10));
        }
        this.T = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @g1
    public void B() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton o10 = o(i10);
            if (o10.getVisibility() != 8) {
                o.b v10 = o10.getShapeAppearanceModel().v();
                y(v10, q(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                o10.setShapeAppearanceModel(v10.m());
            }
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i10, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            if (materialButton.isChecked()) {
                z(materialButton.getId(), true);
                setCheckedId(materialButton.getId());
            }
            o shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.O.add(new d(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
            w1.z1(materialButton, new b());
        }
    }

    public void dispatchDraw(@m0 Canvas canvas) {
        A();
        super.dispatchDraw(canvas);
    }

    public void g(@m0 e eVar) {
        this.R.add(eVar);
    }

    @m0
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    @b0
    public int getCheckedButtonId() {
        if (this.V) {
            return this.f16820a0;
        }
        return -1;
    }

    @m0
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton o10 = o(i10);
            if (o10.isChecked()) {
                arrayList.add(Integer.valueOf(o10.getId()));
            }
        }
        return arrayList;
    }

    public int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.T;
        return (numArr == null || i11 >= numArr.length) ? i11 : numArr[i11].intValue();
    }

    public final void h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
                MaterialButton o10 = o(i10);
                int min = Math.min(o10.getStrokeWidth(), o(i10 - 1).getStrokeWidth());
                LinearLayout.LayoutParams i11 = i(o10);
                if (getOrientation() == 0) {
                    f1.o.g(i11, 0);
                    f1.o.h(i11, -min);
                    i11.topMargin = 0;
                } else {
                    i11.bottomMargin = 0;
                    i11.topMargin = -min;
                    f1.o.h(i11, 0);
                }
                o10.setLayoutParams(i11);
            }
            v(firstVisibleChildIndex);
        }
    }

    @m0
    public final LinearLayout.LayoutParams i(@m0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public void j(@b0 int i10) {
        if (i10 != this.f16820a0) {
            k(i10);
        }
    }

    public final void k(int i10) {
        w(i10, true);
        z(i10, true);
        setCheckedId(i10);
    }

    public void l() {
        this.U = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton o10 = o(i10);
            o10.setChecked(false);
            n(o10.getId(), false);
        }
        this.U = false;
        setCheckedId(-1);
    }

    public void m() {
        this.R.clear();
    }

    public final void n(@b0 int i10, boolean z10) {
        Iterator<e> it = this.R.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10, z10);
        }
    }

    public final MaterialButton o(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f16820a0;
        if (i10 != -1) {
            k(i10);
        }
    }

    public void onInitializeAccessibilityNodeInfo(@m0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.V1(accessibilityNodeInfo).W0(z.b.f(1, getVisibleButtonCount(), false, t() ? 1 : 2));
    }

    public void onMeasure(int i10, int i11) {
        B();
        h();
        super.onMeasure(i10, i11);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.i(this.P);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton.c) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.O.remove(indexOfChild);
        }
        B();
        h();
    }

    public final int p(@o0 View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && r(i11)) {
                i10++;
            }
        }
        return -1;
    }

    @o0
    public final d q(int i10, int i11, int i12) {
        d dVar = this.O.get(i10);
        if (i11 == i12) {
            return dVar;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? d.e(dVar, this) : d.f(dVar);
        }
        if (i10 == i12) {
            return z10 ? d.b(dVar, this) : d.a(dVar);
        }
        return null;
    }

    public final boolean r(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public boolean s() {
        return this.W;
    }

    public void setSelectionRequired(boolean z10) {
        this.W = z10;
    }

    public void setSingleSelection(@h int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            l();
        }
    }

    public boolean t() {
        return this.V;
    }

    public void u(@m0 e eVar) {
        this.R.remove(eVar);
    }

    public final void v(int i10) {
        if (getChildCount() != 0 && i10 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) o(i10).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            f1.o.g(layoutParams, 0);
            f1.o.h(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void w(@b0 int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof MaterialButton) {
            this.U = true;
            ((MaterialButton) findViewById).setChecked(z10);
            this.U = false;
        }
    }

    public void x(@b0 int i10) {
        w(i10, false);
        z(i10, false);
        this.f16820a0 = -1;
        n(i10, false);
    }

    public final boolean z(int i10, boolean z10) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.W || !checkedButtonIds.isEmpty()) {
            if (z10 && this.V) {
                checkedButtonIds.remove(Integer.valueOf(i10));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    w(intValue2, false);
                    n(intValue2, false);
                }
            }
            return true;
        }
        w(i10, true);
        this.f16820a0 = i10;
        return false;
    }
}
