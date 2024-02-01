package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.badge.BadgeDrawable;
import d.m0;
import d.o0;
import d.x0;
import f.a;
import f1.j;
import f1.w1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: g0  reason: collision with root package name */
    public static final int f1095g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f1096h0 = 1;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f1097i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f1098j0 = 1;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f1099k0 = 2;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f1100l0 = 4;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f1101m0 = 4;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f1102n0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f1103o0 = 1;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f1104p0 = 2;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f1105q0 = 3;

    /* renamed from: r0  reason: collision with root package name */
    public static final String f1106r0 = "androidx.appcompat.widget.LinearLayoutCompat";
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public boolean V;
    public int[] W;

    /* renamed from: a0  reason: collision with root package name */
    public int[] f1107a0;

    /* renamed from: b0  reason: collision with root package name */
    public Drawable f1108b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f1109c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f1110d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f1111e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f1112f0;

    @x0({x0.a.Q})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static class b extends LinearLayout.LayoutParams {
        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(int i10, int i11, float f10) {
            super(i10, i11, f10);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @x0({x0.a.Q})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public LinearLayoutCompat(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public LinearLayoutCompat(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.O = true;
        this.P = -1;
        this.Q = 0;
        this.S = BadgeDrawable.f16647f0;
        int[] iArr = a.n.LinearLayoutCompat;
        w0 G = w0.G(context, attributeSet, iArr, i10, 0);
        w1.x1(this, context, iArr, attributeSet, G.B(), i10, 0);
        int o10 = G.o(a.n.LinearLayoutCompat_android_orientation, -1);
        if (o10 >= 0) {
            setOrientation(o10);
        }
        int o11 = G.o(a.n.LinearLayoutCompat_android_gravity, -1);
        if (o11 >= 0) {
            setGravity(o11);
        }
        boolean a10 = G.a(a.n.LinearLayoutCompat_android_baselineAligned, true);
        if (!a10) {
            setBaselineAligned(a10);
        }
        this.U = G.j(a.n.LinearLayoutCompat_android_weightSum, -1.0f);
        this.P = G.o(a.n.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.V = G.a(a.n.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(G.h(a.n.LinearLayoutCompat_divider));
        this.f1111e0 = G.o(a.n.LinearLayoutCompat_showDividers, 0);
        this.f1112f0 = G.g(a.n.LinearLayoutCompat_dividerPadding, 0);
        G.I();
    }

    public int A(int i10) {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02cf, code lost:
        if (r15 > 0) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02da, code lost:
        if (r15 < 0) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02dc, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02dd, code lost:
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & -256);
        r0 = r18;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0329  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B(int r34, int r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.T = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.P
            boolean r15 = r7.V
            r16 = 0
            r17 = 1
            r1 = r10
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r18 = r6
            r20 = r18
            r0 = r16
            r19 = r17
        L_0x002b:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x0199
            android.view.View r4 = r7.s(r6)
            if (r4 != 0) goto L_0x0048
            int r4 = r7.T
            int r10 = r7.A(r6)
            int r4 = r4 + r10
            r7.T = r4
            r26 = r11
            r24 = r13
            r4 = r22
            goto L_0x018d
        L_0x0048:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005f
            int r1 = r7.p(r4, r6)
            int r6 = r6 + r1
            r26 = r11
            r4 = r22
            r1 = r24
            r24 = r13
            goto L_0x018d
        L_0x005f:
            boolean r1 = r7.t(r6)
            if (r1 == 0) goto L_0x006c
            int r1 = r7.T
            int r10 = r7.f1110d0
            int r1 = r1 + r10
            r7.T = r1
        L_0x006c:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.LinearLayoutCompat$b r10 = (androidx.appcompat.widget.LinearLayoutCompat.b) r10
            float r1 = r10.weight
            float r25 = r0 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 != r0) goto L_0x00a6
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a6
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            int r0 = r7.T
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.T = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r18 = r17
            r8 = r24
            r29 = r26
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = r6
            goto L_0x0114
        L_0x00a6:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b5
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b5
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00b7
        L_0x00b5:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b7:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c2
            int r0 = r7.T
            r23 = r0
            goto L_0x00c4
        L_0x00c2:
            r23 = 0
        L_0x00c4:
            r28 = 1073741824(0x40000000, float:2.0)
            r0 = r33
            r8 = r24
            r1 = r4
            r30 = r2
            r29 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r26 = r11
            r24 = r13
            r13 = r22
            r11 = r28
            r22 = r4
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r23
            r0.y(r1, r2, r3, r4, r5, r6)
            r0 = r30
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f1
            r10.height = r0
        L_0x00f1:
            int r0 = r22.getMeasuredHeight()
            int r1 = r7.T
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r22
            int r4 = r7.r(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.T = r1
            if (r15 == 0) goto L_0x0113
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x0114
        L_0x0113:
            r0 = r9
        L_0x0114:
            if (r14 < 0) goto L_0x011e
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x011e
            int r1 = r7.T
            r7.Q = r1
        L_0x011e:
            if (r11 >= r14) goto L_0x012f
            float r1 = r10.weight
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x0127
            goto L_0x012f
        L_0x0127:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x012f:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x013d
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x013d
            r1 = r17
            r20 = r1
            goto L_0x013e
        L_0x013d:
            r1 = 0
        L_0x013e:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r29
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0160
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0160
            r19 = r17
            goto L_0x0162
        L_0x0160:
            r19 = 0
        L_0x0162:
            float r8 = r10.weight
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x0173
            if (r1 == 0) goto L_0x016b
            goto L_0x016c
        L_0x016b:
            r2 = r4
        L_0x016c:
            int r4 = java.lang.Math.max(r13, r2)
            r1 = r31
            goto L_0x017e
        L_0x0173:
            if (r1 == 0) goto L_0x0176
            goto L_0x0177
        L_0x0176:
            r2 = r4
        L_0x0177:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
            r4 = r13
        L_0x017e:
            int r2 = r7.p(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L_0x018d:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r13 = r24
            r11 = r26
            goto L_0x002b
        L_0x0199:
            r8 = r1
            r9 = r3
            r1 = r5
            r26 = r11
            r24 = r13
            r13 = r22
            r5 = r2
            int r2 = r7.T
            if (r2 <= 0) goto L_0x01b7
            r2 = r26
            boolean r3 = r7.t(r2)
            if (r3 == 0) goto L_0x01b9
            int r3 = r7.T
            int r4 = r7.f1110d0
            int r3 = r3 + r4
            r7.T = r3
            goto L_0x01b9
        L_0x01b7:
            r2 = r26
        L_0x01b9:
            r3 = r24
            if (r15 == 0) goto L_0x0207
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c3
            if (r3 != 0) goto L_0x0207
        L_0x01c3:
            r4 = 0
            r7.T = r4
            r4 = 0
        L_0x01c7:
            if (r4 >= r2) goto L_0x0207
            android.view.View r6 = r7.s(r4)
            if (r6 != 0) goto L_0x01d9
            int r6 = r7.T
            int r11 = r7.A(r4)
            int r6 = r6 + r11
        L_0x01d6:
            r7.T = r6
            goto L_0x0202
        L_0x01d9:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01e5
            int r6 = r7.p(r6, r4)
            int r4 = r4 + r6
            goto L_0x0202
        L_0x01e5:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$b r11 = (androidx.appcompat.widget.LinearLayoutCompat.b) r11
            int r14 = r7.T
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.r(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            goto L_0x01d6
        L_0x0202:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01c7
        L_0x0207:
            int r4 = r7.T
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.T = r4
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.T
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x0276
            if (r9 == 0) goto L_0x0235
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0235
            goto L_0x0276
        L_0x0235:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x0271
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x0271
            r1 = 0
        L_0x0240:
            if (r1 >= r2) goto L_0x0271
            android.view.View r3 = r7.s(r1)
            if (r3 == 0) goto L_0x026e
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0251
            goto L_0x026e
        L_0x0251:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$b r9 = (androidx.appcompat.widget.LinearLayoutCompat.b) r9
            float r9 = r9.weight
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x026e
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x026e:
            int r1 = r1 + 1
            goto L_0x0240
        L_0x0271:
            r11 = r34
            r1 = r8
            goto L_0x0361
        L_0x0276:
            float r10 = r7.U
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x027d
            r0 = r10
        L_0x027d:
            r10 = 0
            r7.T = r10
            r11 = r9
            r9 = r1
            r1 = r8
            r8 = r10
        L_0x0284:
            if (r8 >= r2) goto L_0x0350
            android.view.View r13 = r7.s(r8)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0298
            r21 = r11
            r11 = r34
            goto L_0x0349
        L_0x0298:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$b r14 = (androidx.appcompat.widget.LinearLayoutCompat.b) r14
            float r10 = r14.weight
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x02f1
            float r15 = (float) r11
            float r15 = r15 * r10
            float r15 = r15 / r0
            int r15 = (int) r15
            float r0 = r0 - r10
            int r11 = r11 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r0
            int r0 = r14.leftMargin
            int r10 = r10 + r0
            int r0 = r14.rightMargin
            int r10 = r10 + r0
            int r0 = r14.width
            r21 = r11
            r11 = r34
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r0)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02d2
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02cf
            goto L_0x02d4
        L_0x02cf:
            if (r15 <= 0) goto L_0x02dc
            goto L_0x02dd
        L_0x02d2:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02d4:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02dd
        L_0x02dc:
            r15 = 0
        L_0x02dd:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r0, r15)
            int r0 = r13.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r0)
            r0 = r18
            goto L_0x02f6
        L_0x02f1:
            r10 = r11
            r11 = r34
            r21 = r10
        L_0x02f6:
            int r10 = r14.leftMargin
            int r15 = r14.rightMargin
            int r10 = r10 + r15
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r10
            int r5 = java.lang.Math.max(r5, r15)
            r18 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0314
            int r0 = r14.width
            r23 = r1
            r1 = -1
            if (r0 != r1) goto L_0x0317
            r0 = r17
            goto L_0x0318
        L_0x0314:
            r23 = r1
            r1 = -1
        L_0x0317:
            r0 = 0
        L_0x0318:
            if (r0 == 0) goto L_0x031b
            goto L_0x031c
        L_0x031b:
            r10 = r15
        L_0x031c:
            int r0 = java.lang.Math.max(r9, r10)
            if (r19 == 0) goto L_0x0329
            int r9 = r14.width
            if (r9 != r1) goto L_0x0329
            r9 = r17
            goto L_0x032a
        L_0x0329:
            r9 = 0
        L_0x032a:
            int r10 = r7.T
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.r(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.T = r1
            r19 = r9
            r1 = r23
            r9 = r0
            r0 = r18
        L_0x0349:
            int r8 = r8 + 1
            r11 = r21
            r10 = 0
            goto L_0x0284
        L_0x0350:
            r11 = r34
            int r0 = r7.T
            int r3 = r33.getPaddingTop()
            int r8 = r33.getPaddingBottom()
            int r3 = r3 + r8
            int r0 = r0 + r3
            r7.T = r0
            r0 = r9
        L_0x0361:
            if (r19 != 0) goto L_0x0368
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0368
            goto L_0x0369
        L_0x0368:
            r0 = r5
        L_0x0369:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x0387
            r7.l(r2, r6)
        L_0x0387:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.B(int, int):void");
    }

    public final void C(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    public void c(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int virtualChildCount = getVirtualChildCount();
        boolean b10 = d1.b(this);
        for (int i13 = 0; i13 < virtualChildCount; i13++) {
            View s10 = s(i13);
            if (!(s10 == null || s10.getVisibility() == 8 || !t(i13))) {
                b bVar = (b) s10.getLayoutParams();
                j(canvas, b10 ? s10.getRight() + bVar.rightMargin : (s10.getLeft() - bVar.leftMargin) - this.f1109c0);
            }
        }
        if (t(virtualChildCount)) {
            View s11 = s(virtualChildCount - 1);
            if (s11 != null) {
                b bVar2 = (b) s11.getLayoutParams();
                if (b10) {
                    i12 = s11.getLeft();
                    i11 = bVar2.leftMargin;
                } else {
                    i10 = s11.getRight() + bVar2.rightMargin;
                    j(canvas, i10);
                }
            } else if (b10) {
                i10 = getPaddingLeft();
                j(canvas, i10);
            } else {
                i12 = getWidth();
                i11 = getPaddingRight();
            }
            i10 = (i12 - i11) - this.f1109c0;
            j(canvas, i10);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public int getBaseline() {
        int i10;
        if (this.P < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.P;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i12 = this.Q;
                if (this.R == 1 && (i10 = this.S & 112) != 48) {
                    if (i10 == 16) {
                        i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.T) / 2;
                    } else if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.T;
                    }
                }
                return i12 + ((b) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.P == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.P;
    }

    public Drawable getDividerDrawable() {
        return this.f1108b0;
    }

    public int getDividerPadding() {
        return this.f1112f0;
    }

    @x0({x0.a.Q})
    public int getDividerWidth() {
        return this.f1109c0;
    }

    public int getGravity() {
        return this.S;
    }

    public int getOrientation() {
        return this.R;
    }

    public int getShowDividers() {
        return this.f1111e0;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.U;
    }

    public void h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View s10 = s(i10);
            if (!(s10 == null || s10.getVisibility() == 8 || !t(i10))) {
                i(canvas, (s10.getTop() - ((b) s10.getLayoutParams()).topMargin) - this.f1110d0);
            }
        }
        if (t(virtualChildCount)) {
            View s11 = s(virtualChildCount - 1);
            i(canvas, s11 == null ? (getHeight() - getPaddingBottom()) - this.f1110d0 : s11.getBottom() + ((b) s11.getLayoutParams()).bottomMargin);
        }
    }

    public void i(Canvas canvas, int i10) {
        this.f1108b0.setBounds(getPaddingLeft() + this.f1112f0, i10, (getWidth() - getPaddingRight()) - this.f1112f0, this.f1110d0 + i10);
        this.f1108b0.draw(canvas);
    }

    public void j(Canvas canvas, int i10) {
        this.f1108b0.setBounds(i10, getPaddingTop() + this.f1112f0, this.f1109c0 + i10, (getHeight() - getPaddingBottom()) - this.f1112f0);
        this.f1108b0.draw(canvas);
    }

    public final void k(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View s10 = s(i12);
            if (s10.getVisibility() != 8) {
                b bVar = (b) s10.getLayoutParams();
                if (bVar.height == -1) {
                    int i13 = bVar.width;
                    bVar.width = s10.getMeasuredWidth();
                    measureChildWithMargins(s10, i11, 0, makeMeasureSpec, 0);
                    bVar.width = i13;
                }
            }
        }
    }

    public final void l(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View s10 = s(i12);
            if (s10.getVisibility() != 8) {
                b bVar = (b) s10.getLayoutParams();
                if (bVar.width == -1) {
                    int i13 = bVar.height;
                    bVar.height = s10.getMeasuredHeight();
                    measureChildWithMargins(s10, makeMeasureSpec, 0, i11, 0);
                    bVar.height = i13;
                }
            }
        }
    }

    /* renamed from: m */
    public b generateDefaultLayoutParams() {
        int i10 = this.R;
        if (i10 == 0) {
            return new b(-2, -2);
        }
        if (i10 == 1) {
            return new b(-1, -2);
        }
        return null;
    }

    /* renamed from: n */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* renamed from: o */
    public b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public void onDraw(Canvas canvas) {
        if (this.f1108b0 != null) {
            if (this.R == 1) {
                h(canvas);
            } else {
                c(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f1106r0);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f1106r0);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.R == 1) {
            x(i10, i11, i12, i13);
        } else {
            w(i10, i11, i12, i13);
        }
    }

    public void onMeasure(int i10, int i11) {
        if (this.R == 1) {
            B(i10, i11);
        } else {
            z(i10, i11);
        }
    }

    public int p(View view, int i10) {
        return 0;
    }

    public int q(View view) {
        return 0;
    }

    public int r(View view) {
        return 0;
    }

    public View s(int i10) {
        return getChildAt(i10);
    }

    public void setBaselineAligned(boolean z10) {
        this.O = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 < 0 || i10 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.P = i10;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1108b0) {
            this.f1108b0 = drawable;
            boolean z10 = false;
            if (drawable != null) {
                this.f1109c0 = drawable.getIntrinsicWidth();
                this.f1110d0 = drawable.getIntrinsicHeight();
            } else {
                this.f1109c0 = 0;
                this.f1110d0 = 0;
            }
            if (drawable == null) {
                z10 = true;
            }
            setWillNotDraw(z10);
            requestLayout();
        }
    }

    public void setDividerPadding(int i10) {
        this.f1112f0 = i10;
    }

    public void setGravity(int i10) {
        if (this.S != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= j.f7185b;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.S = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & j.f7187d;
        int i12 = this.S;
        if ((8388615 & i12) != i11) {
            this.S = i11 | (-8388616 & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.V = z10;
    }

    public void setOrientation(int i10) {
        if (this.R != i10) {
            this.R = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1111e0) {
            requestLayout();
        }
        this.f1111e0 = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.S;
        if ((i12 & 112) != i11) {
            this.S = i11 | (i12 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.U = Math.max(0.0f, f10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @x0({x0.a.O})
    public boolean t(int i10) {
        if (i10 == 0) {
            return (this.f1111e0 & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f1111e0 & 4) != 0;
        }
        if ((this.f1111e0 & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean u() {
        return this.O;
    }

    public boolean v() {
        return this.V;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = androidx.appcompat.widget.d1.b(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.S
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.O
            int[] r13 = r6.W
            int[] r14 = r6.f1107a0
            int r1 = f1.w1.X(r24)
            int r1 = f1.j.d(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.T
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.T
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = r2
            r17 = r5
        L_0x0064:
            r3 = r2
        L_0x0065:
            if (r3 >= r10) goto L_0x0149
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.s(r2)
            if (r0 != 0) goto L_0x0080
            int r0 = r6.A(r2)
            int r1 = r1 + r0
            r21 = r5
            r22 = r7
            r19 = r10
            r20 = r11
            goto L_0x013a
        L_0x0080:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0130
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.LinearLayoutCompat$b r4 = (androidx.appcompat.widget.LinearLayoutCompat.b) r4
            r18 = r3
            if (r12 == 0) goto L_0x00a8
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00aa
            int r10 = r0.getBaseline()
            goto L_0x00ab
        L_0x00a8:
            r19 = r10
        L_0x00aa:
            r10 = -1
        L_0x00ab:
            int r3 = r4.gravity
            if (r3 >= 0) goto L_0x00b0
            r3 = r11
        L_0x00b0:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r3 == r11) goto L_0x00eb
            r11 = 48
            if (r3 == r11) goto L_0x00d9
            r11 = 80
            if (r3 == r11) goto L_0x00c3
            r3 = r7
            r11 = -1
            goto L_0x00e8
        L_0x00c3:
            int r3 = r8 - r5
            int r11 = r4.bottomMargin
            int r3 = r3 - r11
            r11 = -1
            if (r10 == r11) goto L_0x00e8
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r10
            r10 = 2
            r22 = r14[r10]
            int r22 = r22 - r21
            int r3 = r3 - r22
            goto L_0x00e8
        L_0x00d9:
            r11 = -1
            int r3 = r4.topMargin
            int r3 = r3 + r7
            if (r10 == r11) goto L_0x00e8
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r10
            int r3 = r3 + r22
            goto L_0x00f9
        L_0x00e8:
            r21 = 1
            goto L_0x00f9
        L_0x00eb:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00f9:
            boolean r10 = r6.t(r2)
            if (r10 == 0) goto L_0x0102
            int r10 = r6.f1109c0
            int r1 = r1 + r10
        L_0x0102:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.q(r0)
            int r22 = r10 + r1
            r25 = r0
            r0 = r24
            r1 = r25
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.C(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.r(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.p(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x013c
        L_0x0130:
            r18 = r3
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
        L_0x013a:
            r23 = -1
        L_0x013c:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r5 = r21
            r7 = r22
            r15 = 2
            goto L_0x0065
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.w(int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.S
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L_0x003b
            r0 = 80
            if (r1 == r0) goto L_0x002f
            int r0 = r17.getPaddingTop()
            goto L_0x0047
        L_0x002f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.T
            int r0 = r0 - r1
            goto L_0x0047
        L_0x003b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.T
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x0047:
            r1 = 0
            r12 = r1
        L_0x0049:
            if (r12 >= r10) goto L_0x00c8
            android.view.View r13 = r6.s(r12)
            r14 = 1
            if (r13 != 0) goto L_0x0059
            int r1 = r6.A(r12)
            int r0 = r0 + r1
            goto L_0x00c5
        L_0x0059:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x00c5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat$b r5 = (androidx.appcompat.widget.LinearLayoutCompat.b) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L_0x0075
            r1 = r11
        L_0x0075:
            int r2 = f1.w1.X(r17)
            int r1 = f1.j.d(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L_0x008b
            r2 = 5
            if (r1 == r2) goto L_0x0088
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L_0x0096
        L_0x0088:
            int r1 = r8 - r4
            goto L_0x0093
        L_0x008b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L_0x0093:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L_0x0096:
            r2 = r1
            boolean r1 = r6.t(r12)
            if (r1 == 0) goto L_0x00a0
            int r1 = r6.f1110d0
            int r0 = r0 + r1
        L_0x00a0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.C(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
            goto L_0x00c6
        L_0x00c5:
            r1 = r14
        L_0x00c6:
            int r12 = r12 + r1
            goto L_0x0049
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.x(int, int, int, int):void");
    }

    public void y(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a4, code lost:
        if (r8 > 0) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03af, code lost:
        if (r8 < 0) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b1, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b2, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & -16777216);
        r0 = r23;
        r3 = r24;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(int r39, int r40) {
        /*
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.T = r10
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r7.W
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f1107a0
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.W = r0
            int[] r0 = new int[r14]
            r7.f1107a0 = r0
        L_0x0026:
            int[] r15 = r7.W
            int[] r6 = r7.f1107a0
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.O
            boolean r3 = r7.V
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = r18
            goto L_0x004e
        L_0x004c:
            r19 = r10
        L_0x004e:
            r20 = 0
            r1 = r10
            r14 = r1
            r21 = r14
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r27 = r25
            r26 = r18
            r0 = r20
        L_0x0062:
            r28 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x01fd
            android.view.View r6 = r7.s(r1)
            if (r6 != 0) goto L_0x0082
            int r5 = r7.T
            int r6 = r7.A(r1)
            int r5 = r5 + r6
            r7.T = r5
        L_0x0077:
            r32 = r3
            r36 = r4
            r37 = r2
            r2 = r1
            r1 = r37
            goto L_0x01ea
        L_0x0082:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x008e
            int r5 = r7.p(r6, r1)
            int r1 = r1 + r5
            goto L_0x0077
        L_0x008e:
            boolean r5 = r7.t(r1)
            if (r5 == 0) goto L_0x009b
            int r5 = r7.T
            int r10 = r7.f1109c0
            int r5 = r5 + r10
            r7.T = r5
        L_0x009b:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.LinearLayoutCompat$b r10 = (androidx.appcompat.widget.LinearLayoutCompat.b) r10
            float r5 = r10.weight
            float r31 = r0 + r5
            if (r12 != r2) goto L_0x00eb
            int r0 = r10.width
            if (r0 != 0) goto L_0x00eb
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00eb
            int r0 = r7.T
            if (r19 == 0) goto L_0x00bb
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            goto L_0x00c5
        L_0x00bb:
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
        L_0x00c5:
            r7.T = r0
            if (r4 == 0) goto L_0x00dc
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r30 = -2
            goto L_0x0163
        L_0x00dc:
            r34 = r1
            r32 = r3
            r36 = r4
            r3 = r6
            r24 = r18
            r1 = 1073741824(0x40000000, float:2.0)
            r30 = -2
            goto L_0x0165
        L_0x00eb:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f8
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f8
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00fb
        L_0x00f8:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00fb:
            int r0 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0104
            int r0 = r7.T
            r29 = r0
            goto L_0x0106
        L_0x0104:
            r29 = 0
        L_0x0106:
            r33 = 0
            r0 = r38
            r34 = r1
            r1 = r6
            r35 = r2
            r2 = r34
            r32 = r3
            r3 = r39
            r36 = r4
            r4 = r29
            r29 = r5
            r9 = -1
            r5 = r40
            r30 = r29
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = r6
            r6 = r33
            r0.y(r1, r2, r3, r4, r5, r6)
            r0 = r35
            if (r0 == r9) goto L_0x012f
            r10.width = r0
        L_0x012f:
            int r0 = r29.getMeasuredWidth()
            if (r19 == 0) goto L_0x0146
            int r1 = r7.T
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r29
            int r4 = r7.r(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            goto L_0x015b
        L_0x0146:
            r3 = r29
            int r1 = r7.T
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.r(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
        L_0x015b:
            r7.T = r1
            if (r32 == 0) goto L_0x0163
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0163:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0165:
            if (r13 == r1) goto L_0x0171
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0171
            r0 = r18
            r27 = r0
            goto L_0x0172
        L_0x0171:
            r0 = 0
        L_0x0172:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r25
            int r25 = android.view.View.combineMeasuredStates(r6, r5)
            if (r36 == 0) goto L_0x01af
            int r5 = r3.getBaseline()
            r6 = -1
            if (r5 == r6) goto L_0x01af
            int r6 = r10.gravity
            if (r6 >= 0) goto L_0x0195
            int r6 = r7.S
        L_0x0195:
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = 4
            int r6 = r6 >> r9
            r6 = r6 & -2
            int r6 = r6 >> 1
            r9 = r15[r6]
            int r9 = java.lang.Math.max(r9, r5)
            r15[r6] = r9
            r9 = r28[r6]
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r9, r5)
            r28[r6] = r5
        L_0x01af:
            r5 = r21
            int r21 = java.lang.Math.max(r5, r4)
            if (r26 == 0) goto L_0x01bf
            int r5 = r10.height
            r6 = -1
            if (r5 != r6) goto L_0x01bf
            r26 = r18
            goto L_0x01c1
        L_0x01bf:
            r26 = 0
        L_0x01c1:
            float r5 = r10.weight
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d2
            if (r0 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r2 = r4
        L_0x01cb:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L_0x01e0
        L_0x01d2:
            r10 = r23
            if (r0 == 0) goto L_0x01d7
            goto L_0x01d8
        L_0x01d7:
            r2 = r4
        L_0x01d8:
            r4 = r22
            int r22 = java.lang.Math.max(r4, r2)
            r23 = r10
        L_0x01e0:
            r10 = r34
            int r0 = r7.p(r3, r10)
            int r0 = r0 + r10
            r2 = r0
            r0 = r31
        L_0x01ea:
            int r2 = r2 + 1
            r9 = r40
            r6 = r28
            r3 = r32
            r4 = r36
            r5 = -1
            r10 = 0
            r37 = r2
            r2 = r1
            r1 = r37
            goto L_0x0062
        L_0x01fd:
            r1 = r2
            r32 = r3
            r36 = r4
            r2 = r21
            r4 = r22
            r10 = r23
            r6 = r25
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = -2
            int r3 = r7.T
            if (r3 <= 0) goto L_0x021f
            boolean r3 = r7.t(r11)
            if (r3 == 0) goto L_0x021f
            int r3 = r7.T
            int r1 = r7.f1109c0
            int r3 = r3 + r1
            r7.T = r3
        L_0x021f:
            r1 = r15[r18]
            r3 = -1
            if (r1 != r3) goto L_0x0237
            r21 = 0
            r5 = r15[r21]
            if (r5 != r3) goto L_0x0237
            r5 = r15[r17]
            if (r5 != r3) goto L_0x0237
            r5 = r15[r16]
            if (r5 == r3) goto L_0x0233
            goto L_0x0237
        L_0x0233:
            r1 = r2
            r23 = r6
            goto L_0x0266
        L_0x0237:
            r3 = r15[r16]
            r5 = 0
            r9 = r15[r5]
            r5 = r15[r17]
            int r1 = java.lang.Math.max(r1, r5)
            int r1 = java.lang.Math.max(r9, r1)
            int r1 = java.lang.Math.max(r3, r1)
            r3 = r28[r16]
            r5 = 0
            r9 = r28[r5]
            r5 = r28[r18]
            r23 = r6
            r6 = r28[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r2, r1)
        L_0x0266:
            if (r32 == 0) goto L_0x02c7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r2) goto L_0x026e
            if (r12 != 0) goto L_0x02c7
        L_0x026e:
            r2 = 0
            r7.T = r2
            r2 = 0
        L_0x0272:
            if (r2 >= r11) goto L_0x02c7
            android.view.View r3 = r7.s(r2)
            if (r3 != 0) goto L_0x0284
            int r3 = r7.T
            int r5 = r7.A(r2)
            int r3 = r3 + r5
            r7.T = r3
            goto L_0x0291
        L_0x0284:
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0294
            int r3 = r7.p(r3, r2)
            int r2 = r2 + r3
        L_0x0291:
            r21 = r1
            goto L_0x02c2
        L_0x0294:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$b r5 = (androidx.appcompat.widget.LinearLayoutCompat.b) r5
            int r6 = r7.T
            if (r19 == 0) goto L_0x02ad
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r3 = r7.r(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            r7.T = r6
            goto L_0x0291
        L_0x02ad:
            int r9 = r6 + r14
            r21 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.r(r3)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.T = r1
        L_0x02c2:
            int r2 = r2 + 1
            r1 = r21
            goto L_0x0272
        L_0x02c7:
            r21 = r1
            int r1 = r7.T
            int r2 = r38.getPaddingLeft()
            int r3 = r38.getPaddingRight()
            int r2 = r2 + r3
            int r1 = r1 + r2
            r7.T = r1
            int r2 = r38.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r3 = r7.T
            int r2 = r2 - r3
            if (r24 != 0) goto L_0x0338
            if (r2 == 0) goto L_0x02f4
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02f4
            goto L_0x0338
        L_0x02f4:
            int r0 = java.lang.Math.max(r4, r10)
            if (r32 == 0) goto L_0x0330
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0330
            r10 = 0
        L_0x02ff:
            if (r10 >= r11) goto L_0x0330
            android.view.View r2 = r7.s(r10)
            if (r2 == 0) goto L_0x032d
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x0310
            goto L_0x032d
        L_0x0310:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$b r4 = (androidx.appcompat.widget.LinearLayoutCompat.b) r4
            float r4 = r4.weight
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x032d
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r4)
            int r6 = r2.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r2.measure(r5, r6)
        L_0x032d:
            int r10 = r10 + 1
            goto L_0x02ff
        L_0x0330:
            r2 = r40
            r25 = r11
            r3 = r21
            goto L_0x04c6
        L_0x0338:
            float r5 = r7.U
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x033f
            r0 = r5
        L_0x033f:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r28[r16] = r5
            r28[r17] = r5
            r28[r18] = r5
            r28[r6] = r5
            r7.T = r6
            r6 = r4
            r4 = r5
            r9 = r23
            r10 = 0
        L_0x0358:
            if (r10 >= r11) goto L_0x046f
            android.view.View r14 = r7.s(r10)
            if (r14 == 0) goto L_0x0460
            int r5 = r14.getVisibility()
            r3 = 8
            if (r5 != r3) goto L_0x036a
            goto L_0x0460
        L_0x036a:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$b r5 = (androidx.appcompat.widget.LinearLayoutCompat.b) r5
            float r3 = r5.weight
            int r23 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03c9
            float r8 = (float) r2
            float r8 = r8 * r3
            float r8 = r8 / r0
            int r8 = (int) r8
            float r0 = r0 - r3
            int r2 = r2 - r8
            int r3 = r38.getPaddingTop()
            int r23 = r38.getPaddingBottom()
            int r3 = r3 + r23
            r23 = r0
            int r0 = r5.topMargin
            int r3 = r3 + r0
            int r0 = r5.bottomMargin
            int r3 = r3 + r0
            int r0 = r5.height
            r24 = r2
            r25 = r11
            r11 = -1
            r2 = r40
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r2, r3, r0)
            int r3 = r5.width
            if (r3 != 0) goto L_0x03a7
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x03a4
            goto L_0x03a9
        L_0x03a4:
            if (r8 <= 0) goto L_0x03b1
            goto L_0x03b2
        L_0x03a7:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x03a9:
            int r29 = r14.getMeasuredWidth()
            int r8 = r29 + r8
            if (r8 >= 0) goto L_0x03b2
        L_0x03b1:
            r8 = 0
        L_0x03b2:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r3)
            r14.measure(r8, r0)
            int r0 = r14.getMeasuredState()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r3
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            r0 = r23
            r3 = r24
            goto L_0x03cf
        L_0x03c9:
            r3 = r2
            r25 = r11
            r11 = -1
            r2 = r40
        L_0x03cf:
            int r8 = r7.T
            if (r19 == 0) goto L_0x03ec
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.r(r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.T = r8
            r23 = r0
            goto L_0x0404
        L_0x03ec:
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r0
            int r0 = r5.leftMargin
            int r11 = r11 + r0
            int r0 = r5.rightMargin
            int r11 = r11 + r0
            int r0 = r7.r(r14)
            int r11 = r11 + r0
            int r0 = java.lang.Math.max(r8, r11)
            r7.T = r0
        L_0x0404:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L_0x0410
            int r0 = r5.height
            r8 = -1
            if (r0 != r8) goto L_0x0410
            r0 = r18
            goto L_0x0411
        L_0x0410:
            r0 = 0
        L_0x0411:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r4 = java.lang.Math.max(r4, r11)
            if (r0 == 0) goto L_0x0422
            goto L_0x0423
        L_0x0422:
            r8 = r11
        L_0x0423:
            int r0 = java.lang.Math.max(r6, r8)
            if (r26 == 0) goto L_0x0431
            int r6 = r5.height
            r8 = -1
            if (r6 != r8) goto L_0x0432
            r6 = r18
            goto L_0x0433
        L_0x0431:
            r8 = -1
        L_0x0432:
            r6 = 0
        L_0x0433:
            if (r36 == 0) goto L_0x045a
            int r14 = r14.getBaseline()
            if (r14 == r8) goto L_0x045a
            int r5 = r5.gravity
            if (r5 >= 0) goto L_0x0441
            int r5 = r7.S
        L_0x0441:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r5 = r5 >> r8
            r5 = r5 & -2
            int r5 = r5 >> 1
            r8 = r15[r5]
            int r8 = java.lang.Math.max(r8, r14)
            r15[r5] = r8
            r8 = r28[r5]
            int r11 = r11 - r14
            int r8 = java.lang.Math.max(r8, r11)
            r28[r5] = r8
        L_0x045a:
            r26 = r6
            r6 = r0
            r0 = r23
            goto L_0x0465
        L_0x0460:
            r3 = r2
            r25 = r11
            r2 = r40
        L_0x0465:
            int r10 = r10 + 1
            r8 = r39
            r2 = r3
            r11 = r25
            r5 = -1
            goto L_0x0358
        L_0x046f:
            r2 = r40
            r25 = r11
            int r0 = r7.T
            int r3 = r38.getPaddingLeft()
            int r5 = r38.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            r7.T = r0
            r0 = r15[r18]
            r3 = -1
            if (r0 != r3) goto L_0x0496
            r5 = 0
            r8 = r15[r5]
            if (r8 != r3) goto L_0x0496
            r5 = r15[r17]
            if (r5 != r3) goto L_0x0496
            r5 = r15[r16]
            if (r5 == r3) goto L_0x0494
            goto L_0x0496
        L_0x0494:
            r0 = r4
            goto L_0x04c2
        L_0x0496:
            r3 = r15[r16]
            r5 = 0
            r8 = r15[r5]
            r10 = r15[r17]
            int r0 = java.lang.Math.max(r0, r10)
            int r0 = java.lang.Math.max(r8, r0)
            int r0 = java.lang.Math.max(r3, r0)
            r3 = r28[r16]
            r5 = r28[r5]
            r8 = r28[r18]
            r10 = r28[r17]
            int r8 = java.lang.Math.max(r8, r10)
            int r5 = java.lang.Math.max(r5, r8)
            int r3 = java.lang.Math.max(r3, r5)
            int r0 = r0 + r3
            int r0 = java.lang.Math.max(r4, r0)
        L_0x04c2:
            r3 = r0
            r0 = r6
            r23 = r9
        L_0x04c6:
            if (r26 != 0) goto L_0x04cd
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x04cd
            goto L_0x04ce
        L_0x04cd:
            r0 = r3
        L_0x04ce:
            int r3 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r23 & r3
            r1 = r1 | r3
            int r3 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r2, r3)
            r7.setMeasuredDimension(r1, r0)
            if (r27 == 0) goto L_0x04f7
            r0 = r39
            r1 = r25
            r7.k(r1, r0)
        L_0x04f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.z(int, int):void");
    }
}
