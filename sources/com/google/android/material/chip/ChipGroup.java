package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.material.internal.FlowLayout;
import d.b0;
import d.h;
import d.m0;
import d.o0;
import d.p;
import d.q;
import f1.w1;
import g1.z;
import i9.a;
import java.util.ArrayList;
import java.util.List;

public class ChipGroup extends FlowLayout {

    /* renamed from: e0  reason: collision with root package name */
    public static final int f16885e0 = a.n.Widget_MaterialComponents_ChipGroup;
    @q
    public int S;
    @q
    public int T;
    public boolean U;
    public boolean V;
    @o0
    public d W;

    /* renamed from: a0  reason: collision with root package name */
    public final b f16886a0;
    @m0

    /* renamed from: b0  reason: collision with root package name */
    public e f16887b0;
    @b0

    /* renamed from: c0  reason: collision with root package name */
    public int f16888c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f16889d0;

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        public void onCheckedChanged(@m0 CompoundButton compoundButton, boolean z10) {
            if (!ChipGroup.this.f16889d0) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.V) {
                    int id2 = compoundButton.getId();
                    if (z10) {
                        if (!(ChipGroup.this.f16888c0 == -1 || ChipGroup.this.f16888c0 == id2 || !ChipGroup.this.U)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.s(chipGroup.f16888c0, false);
                        }
                        ChipGroup.this.setCheckedId(id2);
                    } else if (ChipGroup.this.f16888c0 == id2) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                } else {
                    ChipGroup.this.s(compoundButton.getId(), true);
                    ChipGroup.this.r(compoundButton.getId(), false);
                }
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public interface d {
        void a(ChipGroup chipGroup, @b0 int i10);
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener O;

        public e() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(w1.B());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f16886a0);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.O;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.O;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.chipGroupStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f16885e0
            android.content.Context r8 = ca.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$b r8 = new com.google.android.material.chip.ChipGroup$b
            r0 = 0
            r8.<init>()
            r7.f16886a0 = r8
            com.google.android.material.chip.ChipGroup$e r8 = new com.google.android.material.chip.ChipGroup$e
            r8.<init>()
            r7.f16887b0 = r8
            r8 = -1
            r7.f16888c0 = r8
            r6 = 0
            r7.f16889d0 = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = i9.a.o.ChipGroup
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r10 = i9.a.o.ChipGroup_chipSpacing
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = i9.a.o.ChipGroup_chipSpacingHorizontal
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingHorizontal(r0)
            int r0 = i9.a.o.ChipGroup_chipSpacingVertical
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingVertical(r10)
            int r10 = i9.a.o.ChipGroup_singleLine
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleLine((boolean) r10)
            int r10 = i9.a.o.ChipGroup_singleSelection
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleSelection((boolean) r10)
            int r10 = i9.a.o.ChipGroup_selectionRequired
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSelectionRequired(r10)
            int r10 = i9.a.o.ChipGroup_checkedChip
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L_0x0069
            r7.f16888c0 = r10
        L_0x0069:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$e r8 = r7.f16887b0
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            f1.w1.P1(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int getChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                i10++;
            }
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i10) {
        r(i10, true);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i11 = this.f16888c0;
                if (i11 != -1 && this.U) {
                    s(i11, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i10, layoutParams);
    }

    public boolean c() {
        return super.c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    @m0
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @m0
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @m0
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    @b0
    public int getCheckedChipId() {
        if (this.U) {
            return this.f16888c0;
        }
        return -1;
    }

    @m0
    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.U) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    @q
    public int getChipSpacingHorizontal() {
        return this.S;
    }

    @q
    public int getChipSpacingVertical() {
        return this.T;
    }

    public void m(@b0 int i10) {
        int i11 = this.f16888c0;
        if (i10 != i11) {
            if (i11 != -1 && this.U) {
                s(i11, false);
            }
            if (i10 != -1) {
                s(i10, true);
            }
            setCheckedId(i10);
        }
    }

    public void n() {
        this.f16889d0 = true;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f16889d0 = false;
        setCheckedId(-1);
    }

    public int o(@o0 View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                if (((Chip) getChildAt(i11)) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f16888c0;
        if (i10 != -1) {
            s(i10, true);
            setCheckedId(this.f16888c0);
        }
    }

    public void onInitializeAccessibilityNodeInfo(@m0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.V1(accessibilityNodeInfo).W0(z.b.f(getRowCount(), c() ? getChipCount() : -1, false, q() ? 1 : 2));
    }

    public boolean p() {
        return this.V;
    }

    public boolean q() {
        return this.U;
    }

    public final void r(int i10, boolean z10) {
        this.f16888c0 = i10;
        d dVar = this.W;
        if (dVar != null && this.U && z10) {
            dVar.a(this, i10);
        }
    }

    public final void s(@b0 int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof Chip) {
            this.f16889d0 = true;
            ((Chip) findViewById).setChecked(z10);
            this.f16889d0 = false;
        }
    }

    public void setChipSpacing(@q int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(@q int i10) {
        if (this.S != i10) {
            this.S = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@p int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(@p int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(@q int i10) {
        if (this.T != i10) {
            this.T = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@p int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@o0 Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.W = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f16887b0.O = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.V = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(@h int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(@h int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            n();
        }
    }
}
