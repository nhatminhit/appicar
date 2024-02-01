package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.b0;
import androidx.core.widget.y;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import d.a1;
import d.b1;
import d.g1;
import d.l;
import d.m0;
import d.n;
import d.o0;
import d.p;
import d.u;
import d.x0;
import f1.w1;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z9.j;
import z9.o;

public class TextInputLayout extends LinearLayout {
    public static final String A1 = "TextInputLayout";
    public static final int B1 = 0;
    public static final int C1 = 1;
    public static final int D1 = 2;
    public static final int E1 = -1;
    public static final int F1 = 0;
    public static final int G1 = 1;
    public static final int H1 = 2;
    public static final int I1 = 3;

    /* renamed from: x1  reason: collision with root package name */
    public static final int f17496x1 = a.n.Widget_Design_TextInputLayout;

    /* renamed from: y1  reason: collision with root package name */
    public static final int f17497y1 = 167;

    /* renamed from: z1  reason: collision with root package name */
    public static final int f17498z1 = -1;
    public int A0;
    @l
    public int B0;
    @l
    public int C0;
    public final Rect D0;
    public final Rect E0;
    public final RectF F0;
    public Typeface G0;
    @m0
    public final CheckableImageButton H0;
    public ColorStateList I0;
    public boolean J0;
    public PorterDuff.Mode K0;
    public boolean L0;
    @o0
    public Drawable M0;
    public int N0;
    @m0
    public final FrameLayout O;
    public View.OnLongClickListener O0;
    @m0
    public final LinearLayout P;
    public final LinkedHashSet<h> P0;
    @m0
    public final LinearLayout Q;
    public int Q0;
    @m0
    public final FrameLayout R;
    public final SparseArray<e> R0;
    public EditText S;
    @m0
    public final CheckableImageButton S0;
    public CharSequence T;
    public final LinkedHashSet<i> T0;
    public final f U;
    public ColorStateList U0;
    public boolean V;
    public boolean V0;
    public int W;
    public PorterDuff.Mode W0;
    public boolean X0;
    @o0
    public Drawable Y0;
    public int Z0;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f17499a0;

    /* renamed from: a1  reason: collision with root package name */
    public Drawable f17500a1;
    @o0

    /* renamed from: b0  reason: collision with root package name */
    public TextView f17501b0;

    /* renamed from: b1  reason: collision with root package name */
    public View.OnLongClickListener f17502b1;

    /* renamed from: c0  reason: collision with root package name */
    public int f17503c0;

    /* renamed from: c1  reason: collision with root package name */
    public View.OnLongClickListener f17504c1;

    /* renamed from: d0  reason: collision with root package name */
    public int f17505d0;
    @m0

    /* renamed from: d1  reason: collision with root package name */
    public final CheckableImageButton f17506d1;

    /* renamed from: e0  reason: collision with root package name */
    public CharSequence f17507e0;

    /* renamed from: e1  reason: collision with root package name */
    public ColorStateList f17508e1;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f17509f0;

    /* renamed from: f1  reason: collision with root package name */
    public ColorStateList f17510f1;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f17511g0;

    /* renamed from: g1  reason: collision with root package name */
    public ColorStateList f17512g1;
    @o0

    /* renamed from: h0  reason: collision with root package name */
    public ColorStateList f17513h0;
    @l

    /* renamed from: h1  reason: collision with root package name */
    public int f17514h1;

    /* renamed from: i0  reason: collision with root package name */
    public int f17515i0;
    @l

    /* renamed from: i1  reason: collision with root package name */
    public int f17516i1;
    @o0

    /* renamed from: j0  reason: collision with root package name */
    public ColorStateList f17517j0;
    @l

    /* renamed from: j1  reason: collision with root package name */
    public int f17518j1;
    @o0

    /* renamed from: k0  reason: collision with root package name */
    public ColorStateList f17519k0;

    /* renamed from: k1  reason: collision with root package name */
    public ColorStateList f17520k1;
    @o0

    /* renamed from: l0  reason: collision with root package name */
    public CharSequence f17521l0;
    @l

    /* renamed from: l1  reason: collision with root package name */
    public int f17522l1;
    @m0

    /* renamed from: m0  reason: collision with root package name */
    public final TextView f17523m0;
    @l

    /* renamed from: m1  reason: collision with root package name */
    public int f17524m1;
    @o0

    /* renamed from: n0  reason: collision with root package name */
    public CharSequence f17525n0;
    @l

    /* renamed from: n1  reason: collision with root package name */
    public int f17526n1;
    @m0

    /* renamed from: o0  reason: collision with root package name */
    public final TextView f17527o0;
    @l

    /* renamed from: o1  reason: collision with root package name */
    public int f17528o1;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f17529p0;
    @l

    /* renamed from: p1  reason: collision with root package name */
    public int f17530p1;

    /* renamed from: q0  reason: collision with root package name */
    public CharSequence f17531q0;

    /* renamed from: q1  reason: collision with root package name */
    public boolean f17532q1;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f17533r0;

    /* renamed from: r1  reason: collision with root package name */
    public final com.google.android.material.internal.a f17534r1;
    @o0

    /* renamed from: s0  reason: collision with root package name */
    public j f17535s0;

    /* renamed from: s1  reason: collision with root package name */
    public boolean f17536s1;
    @o0

    /* renamed from: t0  reason: collision with root package name */
    public j f17537t0;

    /* renamed from: t1  reason: collision with root package name */
    public boolean f17538t1;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public o f17539u0;

    /* renamed from: u1  reason: collision with root package name */
    public ValueAnimator f17540u1;

    /* renamed from: v0  reason: collision with root package name */
    public final int f17541v0;

    /* renamed from: v1  reason: collision with root package name */
    public boolean f17542v1;

    /* renamed from: w0  reason: collision with root package name */
    public int f17543w0;

    /* renamed from: w1  reason: collision with root package name */
    public boolean f17544w1;

    /* renamed from: x0  reason: collision with root package name */
    public int f17545x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f17546y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f17547z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        @o0
        public CharSequence Q;
        public boolean R;
        @o0
        public CharSequence S;
        @o0
        public CharSequence T;
        @o0
        public CharSequence U;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @o0
            /* renamed from: a */
            public SavedState createFromParcel(@m0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @m0
            /* renamed from: b */
            public SavedState createFromParcel(@m0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @m0
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@m0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.R = parcel.readInt() != 1 ? false : true;
            this.S = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.T = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.U = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @m0
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.Q + " hint=" + this.S + " helperText=" + this.T + " placeholderText=" + this.U + p7.a.f11639j;
        }

        public void writeToParcel(@m0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.Q, parcel, i10);
            parcel.writeInt(this.R ? 1 : 0);
            TextUtils.writeToParcel(this.S, parcel, i10);
            TextUtils.writeToParcel(this.T, parcel, i10);
            TextUtils.writeToParcel(this.U, parcel, i10);
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(@m0 Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.L0(!textInputLayout.f17544w1);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.V) {
                textInputLayout2.E0(editable.length());
            }
            if (TextInputLayout.this.f17509f0) {
                TextInputLayout.this.P0(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            TextInputLayout.this.S0.performClick();
            TextInputLayout.this.S0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            TextInputLayout.this.S.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            TextInputLayout.this.f17534r1.h0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends f1.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f17549d;

        public e(@m0 TextInputLayout textInputLayout) {
            this.f17549d = textInputLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
            if (r3 != null) goto L_0x0085;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(@d.m0 android.view.View r14, @d.m0 g1.z r15) {
            /*
                r13 = this;
                super.g(r14, r15)
                com.google.android.material.textfield.TextInputLayout r14 = r13.f17549d
                android.widget.EditText r14 = r14.getEditText()
                if (r14 == 0) goto L_0x0010
                android.text.Editable r0 = r14.getText()
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                com.google.android.material.textfield.TextInputLayout r1 = r13.f17549d
                java.lang.CharSequence r1 = r1.getHint()
                com.google.android.material.textfield.TextInputLayout r2 = r13.f17549d
                java.lang.CharSequence r2 = r2.getError()
                com.google.android.material.textfield.TextInputLayout r3 = r13.f17549d
                java.lang.CharSequence r3 = r3.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r4 = r13.f17549d
                int r4 = r4.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r5 = r13.f17549d
                java.lang.CharSequence r5 = r5.getCounterOverflowDescription()
                boolean r6 = android.text.TextUtils.isEmpty(r0)
                r7 = 1
                r6 = r6 ^ r7
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                r8 = r8 ^ r7
                com.google.android.material.textfield.TextInputLayout r9 = r13.f17549d
                boolean r9 = r9.X()
                r9 = r9 ^ r7
                boolean r10 = android.text.TextUtils.isEmpty(r2)
                r10 = r10 ^ r7
                if (r10 != 0) goto L_0x0051
                boolean r11 = android.text.TextUtils.isEmpty(r5)
                if (r11 != 0) goto L_0x004f
                goto L_0x0051
            L_0x004f:
                r11 = 0
                goto L_0x0052
            L_0x0051:
                r11 = r7
            L_0x0052:
                if (r8 == 0) goto L_0x0059
                java.lang.String r1 = r1.toString()
                goto L_0x005b
            L_0x0059:
                java.lang.String r1 = ""
            L_0x005b:
                java.lang.String r8 = ", "
                if (r6 == 0) goto L_0x0063
                r15.J1(r0)
                goto L_0x0088
            L_0x0063:
                boolean r12 = android.text.TextUtils.isEmpty(r1)
                if (r12 != 0) goto L_0x0083
                r15.J1(r1)
                if (r9 == 0) goto L_0x0088
                if (r3 == 0) goto L_0x0088
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r1)
                r9.append(r8)
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                goto L_0x0085
            L_0x0083:
                if (r3 == 0) goto L_0x0088
            L_0x0085:
                r15.J1(r3)
            L_0x0088:
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 != 0) goto L_0x00b4
                int r3 = android.os.Build.VERSION.SDK_INT
                r9 = 26
                if (r3 < r9) goto L_0x0098
                r15.j1(r1)
                goto L_0x00af
            L_0x0098:
                if (r6 == 0) goto L_0x00ac
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r8)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
            L_0x00ac:
                r15.J1(r1)
            L_0x00af:
                r1 = r6 ^ 1
                r15.F1(r1)
            L_0x00b4:
                if (r0 == 0) goto L_0x00bd
                int r0 = r0.length()
                if (r0 != r4) goto L_0x00bd
                goto L_0x00be
            L_0x00bd:
                r4 = -1
            L_0x00be:
                r15.s1(r4)
                if (r11 == 0) goto L_0x00ca
                if (r10 == 0) goto L_0x00c6
                goto L_0x00c7
            L_0x00c6:
                r2 = r5
            L_0x00c7:
                r15.f1(r2)
            L_0x00ca:
                if (r14 == 0) goto L_0x00d1
                int r15 = i9.a.h.textinput_helper_text
                r14.setLabelFor(r15)
            L_0x00d1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e.g(android.view.View, g1.z):void");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    public interface h {
        void a(@m0 TextInputLayout textInputLayout);
    }

    public interface i {
        void a(@m0 TextInputLayout textInputLayout, int i10);
    }

    public TextInputLayout(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public TextInputLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.textInputStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(@d.m0 android.content.Context r28, @d.o0 android.util.AttributeSet r29, int r30) {
        /*
            r27 = this;
            r0 = r27
            r7 = r29
            r8 = r30
            int r9 = f17496x1
            r1 = r28
            android.content.Context r1 = ca.a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.textfield.f r1 = new com.google.android.material.textfield.f
            r1.<init>(r0)
            r0.U = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.D0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.E0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.F0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.P0 = r1
            r10 = 0
            r0.Q0 = r10
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            r0.R0 = r11
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.T0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f17534r1 = r1
            android.content.Context r12 = r27.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r12)
            r0.O = r2
            r2.setAddStatesFromChildren(r13)
            r0.addView(r2)
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            r14.<init>(r12)
            r0.P = r14
            r14.setOrientation(r10)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r15 = -2
            r6 = -1
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3.<init>(r15, r6, r4)
            r14.setLayoutParams(r3)
            r2.addView(r14)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r12)
            r0.Q = r5
            r5.setOrientation(r10)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r15, r6, r4)
            r5.setLayoutParams(r3)
            r2.addView(r5)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r12)
            r0.R = r4
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r15, r6)
            r4.setLayoutParams(r2)
            android.animation.TimeInterpolator r2 = j9.a.f19828a
            r1.n0(r2)
            r1.k0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.U(r2)
            int[] r3 = i9.a.o.TextInputLayout
            r1 = 5
            int[] r2 = new int[r1]
            int r1 = i9.a.o.TextInputLayout_counterTextAppearance
            r2[r10] = r1
            int r15 = i9.a.o.TextInputLayout_counterOverflowTextAppearance
            r2[r13] = r15
            int r10 = i9.a.o.TextInputLayout_errorTextAppearance
            r13 = 2
            r2[r13] = r10
            int r13 = i9.a.o.TextInputLayout_helperTextTextAppearance
            r16 = r11
            r11 = 3
            r2[r11] = r13
            int r11 = i9.a.o.TextInputLayout_hintTextAppearance
            r17 = 4
            r2[r17] = r11
            r17 = r14
            r14 = r1
            r1 = r12
            r18 = r2
            r2 = r29
            r19 = r4
            r4 = r30
            r20 = r15
            r15 = r5
            r5 = r9
            r21 = r14
            r14 = r6
            r6 = r18
            androidx.appcompat.widget.w0 r1 = com.google.android.material.internal.n.k(r1, r2, r3, r4, r5, r6)
            int r2 = i9.a.o.TextInputLayout_hintEnabled
            r3 = 1
            boolean r2 = r1.a(r2, r3)
            r0.f17529p0 = r2
            int r2 = i9.a.o.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.x(r2)
            r0.setHint((java.lang.CharSequence) r2)
            int r2 = i9.a.o.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.a(r2, r3)
            r0.f17538t1 = r2
            int r2 = i9.a.o.TextInputLayout_expandedHintEnabled
            boolean r2 = r1.a(r2, r3)
            r0.f17536s1 = r2
            z9.o$b r2 = z9.o.e(r12, r7, r8, r9)
            z9.o r2 = r2.m()
            r0.f17539u0 = r2
            android.content.res.Resources r2 = r12.getResources()
            int r3 = i9.a.f.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f17541v0 = r2
            int r2 = i9.a.o.TextInputLayout_boxCollapsedPaddingTop
            r3 = 0
            int r2 = r1.f(r2, r3)
            r0.f17545x0 = r2
            int r2 = i9.a.o.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r12.getResources()
            int r4 = i9.a.f.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.g(r2, r3)
            r0.f17547z0 = r2
            int r2 = i9.a.o.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r12.getResources()
            int r4 = i9.a.f.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.g(r2, r3)
            r0.A0 = r2
            int r2 = r0.f17547z0
            r0.f17546y0 = r2
            int r2 = i9.a.o.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.e(r2, r3)
            int r4 = i9.a.o.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.e(r4, r3)
            int r5 = i9.a.o.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.e(r5, r3)
            int r6 = i9.a.o.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.e(r6, r3)
            z9.o r6 = r0.f17539u0
            z9.o$b r6 = r6.v()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x017f
            r6.K(r2)
        L_0x017f:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0186
            r6.P(r4)
        L_0x0186:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x018d
            r6.C(r5)
        L_0x018d:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0194
            r6.x(r3)
        L_0x0194:
            z9.o r2 = r6.m()
            r0.f17539u0 = r2
            int r2 = i9.a.o.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = w9.c.b(r12, r1, r2)
            if (r2 == 0) goto L_0x01f9
            int r3 = r2.getDefaultColor()
            r0.f17522l1 = r3
            r0.C0 = r3
            boolean r3 = r2.isStateful()
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L_0x01d5
            r3 = 1
            int[] r5 = new int[r3]
            r3 = 0
            r5[r3] = r4
            int r3 = r2.getColorForState(r5, r14)
            r0.f17524m1 = r3
            r3 = 2
            int[] r4 = new int[r3]
            r4 = {16842908, 16842910} // fill-array
            int r4 = r2.getColorForState(r4, r14)
            r0.f17526n1 = r4
            int[] r4 = new int[r3]
            r4 = {16843623, 16842910} // fill-array
            int r2 = r2.getColorForState(r4, r14)
            goto L_0x01f6
        L_0x01d5:
            int r2 = r0.f17522l1
            r0.f17526n1 = r2
            int r2 = i9.a.e.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = g.a.c(r12, r2)
            r3 = 1
            int[] r5 = new int[r3]
            r6 = 0
            r5[r6] = r4
            int r4 = r2.getColorForState(r5, r14)
            r0.f17524m1 = r4
            int[] r4 = new int[r3]
            r3 = 16843623(0x1010367, float:2.3696E-38)
            r4[r6] = r3
            int r2 = r2.getColorForState(r4, r14)
        L_0x01f6:
            r0.f17528o1 = r2
            goto L_0x0204
        L_0x01f9:
            r6 = 0
            r0.C0 = r6
            r0.f17522l1 = r6
            r0.f17524m1 = r6
            r0.f17526n1 = r6
            r0.f17528o1 = r6
        L_0x0204:
            int r2 = i9.a.o.TextInputLayout_android_textColorHint
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x0214
            android.content.res.ColorStateList r2 = r1.d(r2)
            r0.f17512g1 = r2
            r0.f17510f1 = r2
        L_0x0214:
            int r2 = i9.a.o.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r3 = w9.c.b(r12, r1, r2)
            r4 = 0
            int r2 = r1.c(r2, r4)
            r0.f17518j1 = r2
            int r2 = i9.a.e.mtrl_textinput_default_box_stroke_color
            int r2 = i0.d.f(r12, r2)
            r0.f17514h1 = r2
            int r2 = i9.a.e.mtrl_textinput_disabled_color
            int r2 = i0.d.f(r12, r2)
            r0.f17530p1 = r2
            int r2 = i9.a.e.mtrl_textinput_hovered_box_stroke_color
            int r2 = i0.d.f(r12, r2)
            r0.f17516i1 = r2
            if (r3 == 0) goto L_0x023e
            r0.setBoxStrokeColorStateList(r3)
        L_0x023e:
            int r2 = i9.a.o.TextInputLayout_boxStrokeErrorColor
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x024d
            android.content.res.ColorStateList r2 = w9.c.b(r12, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x024d:
            int r2 = r1.u(r11, r14)
            if (r2 == r14) goto L_0x025c
            r2 = 0
            int r3 = r1.u(r11, r2)
            r0.setHintTextAppearance(r3)
            goto L_0x025d
        L_0x025c:
            r2 = 0
        L_0x025d:
            int r3 = r1.u(r10, r2)
            int r4 = i9.a.o.TextInputLayout_errorContentDescription
            java.lang.CharSequence r4 = r1.x(r4)
            int r5 = i9.a.o.TextInputLayout_errorEnabled
            boolean r5 = r1.a(r5, r2)
            android.content.Context r6 = r27.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r7 = i9.a.k.design_text_input_end_icon
            android.view.View r6 = r6.inflate(r7, r15, r2)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.f17506d1 = r6
            int r8 = i9.a.h.text_input_error_icon
            r6.setId(r8)
            r8 = 8
            r6.setVisibility(r8)
            boolean r9 = w9.c.g(r12)
            if (r9 == 0) goto L_0x0298
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            f1.o.h(r9, r2)
        L_0x0298:
            int r2 = i9.a.o.TextInputLayout_errorIconDrawable
            boolean r9 = r1.C(r2)
            if (r9 == 0) goto L_0x02a7
            android.graphics.drawable.Drawable r2 = r1.h(r2)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x02a7:
            int r2 = i9.a.o.TextInputLayout_errorIconTint
            boolean r9 = r1.C(r2)
            if (r9 == 0) goto L_0x02b6
            android.content.res.ColorStateList r2 = w9.c.b(r12, r1, r2)
            r0.setErrorIconTintList(r2)
        L_0x02b6:
            int r2 = i9.a.o.TextInputLayout_errorIconTintMode
            boolean r9 = r1.C(r2)
            r10 = 0
            if (r9 == 0) goto L_0x02ca
            int r2 = r1.o(r2, r14)
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.v.k(r2, r10)
            r0.setErrorIconTintMode(r2)
        L_0x02ca:
            android.content.res.Resources r2 = r27.getResources()
            int r9 = i9.a.m.error_icon_content_description
            java.lang.CharSequence r2 = r2.getText(r9)
            r6.setContentDescription(r2)
            r2 = 2
            f1.w1.P1(r6, r2)
            r2 = 0
            r6.setClickable(r2)
            r6.setPressable(r2)
            r6.setFocusable(r2)
            int r9 = r1.u(r13, r2)
            int r11 = i9.a.o.TextInputLayout_helperTextEnabled
            boolean r11 = r1.a(r11, r2)
            int r13 = i9.a.o.TextInputLayout_helperText
            java.lang.CharSequence r13 = r1.x(r13)
            int r10 = i9.a.o.TextInputLayout_placeholderTextAppearance
            int r10 = r1.u(r10, r2)
            int r8 = i9.a.o.TextInputLayout_placeholderText
            java.lang.CharSequence r8 = r1.x(r8)
            int r14 = i9.a.o.TextInputLayout_prefixTextAppearance
            int r14 = r1.u(r14, r2)
            int r2 = i9.a.o.TextInputLayout_prefixText
            java.lang.CharSequence r2 = r1.x(r2)
            r22 = r14
            int r14 = i9.a.o.TextInputLayout_suffixTextAppearance
            r23 = r2
            r2 = 0
            int r14 = r1.u(r14, r2)
            int r2 = i9.a.o.TextInputLayout_suffixText
            java.lang.CharSequence r2 = r1.x(r2)
            r24 = r14
            int r14 = i9.a.o.TextInputLayout_counterEnabled
            r25 = r2
            r2 = 0
            boolean r14 = r1.a(r14, r2)
            int r2 = i9.a.o.TextInputLayout_counterMaxLength
            r26 = r14
            r14 = -1
            int r2 = r1.o(r2, r14)
            r0.setCounterMaxLength(r2)
            r2 = r21
            r14 = 0
            int r2 = r1.u(r2, r14)
            r0.f17505d0 = r2
            r2 = r20
            int r2 = r1.u(r2, r14)
            r0.f17503c0 = r2
            android.content.Context r2 = r27.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r20 = r10
            int r10 = i9.a.k.design_text_input_start_icon
            r21 = r8
            r8 = r17
            android.view.View r2 = r2.inflate(r10, r8, r14)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.H0 = r2
            r10 = 8
            r2.setVisibility(r10)
            boolean r10 = w9.c.g(r12)
            if (r10 == 0) goto L_0x0372
            android.view.ViewGroup$LayoutParams r10 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            f1.o.g(r10, r14)
        L_0x0372:
            r10 = 0
            r0.setStartIconOnClickListener(r10)
            r0.setStartIconOnLongClickListener(r10)
            int r10 = i9.a.o.TextInputLayout_startIconDrawable
            boolean r14 = r1.C(r10)
            if (r14 == 0) goto L_0x03a1
            android.graphics.drawable.Drawable r10 = r1.h(r10)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r10)
            int r10 = i9.a.o.TextInputLayout_startIconContentDescription
            boolean r14 = r1.C(r10)
            if (r14 == 0) goto L_0x0397
            java.lang.CharSequence r10 = r1.x(r10)
            r0.setStartIconContentDescription((java.lang.CharSequence) r10)
        L_0x0397:
            int r10 = i9.a.o.TextInputLayout_startIconCheckable
            r14 = 1
            boolean r10 = r1.a(r10, r14)
            r0.setStartIconCheckable(r10)
        L_0x03a1:
            int r10 = i9.a.o.TextInputLayout_startIconTint
            boolean r14 = r1.C(r10)
            if (r14 == 0) goto L_0x03b0
            android.content.res.ColorStateList r10 = w9.c.b(r12, r1, r10)
            r0.setStartIconTintList(r10)
        L_0x03b0:
            int r10 = i9.a.o.TextInputLayout_startIconTintMode
            boolean r14 = r1.C(r10)
            if (r14 == 0) goto L_0x03c5
            r14 = -1
            int r10 = r1.o(r10, r14)
            r14 = 0
            android.graphics.PorterDuff$Mode r10 = com.google.android.material.internal.v.k(r10, r14)
            r0.setStartIconTintMode(r10)
        L_0x03c5:
            int r10 = i9.a.o.TextInputLayout_boxBackgroundMode
            r14 = 0
            int r10 = r1.o(r10, r14)
            r0.setBoxBackgroundMode(r10)
            android.content.Context r10 = r27.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r17 = r4
            r4 = r19
            android.view.View r7 = r10.inflate(r7, r4, r14)
            com.google.android.material.internal.CheckableImageButton r7 = (com.google.android.material.internal.CheckableImageButton) r7
            r0.S0 = r7
            r4.addView(r7)
            r10 = 8
            r7.setVisibility(r10)
            boolean r10 = w9.c.g(r12)
            if (r10 == 0) goto L_0x03fa
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            f1.o.h(r7, r14)
        L_0x03fa:
            com.google.android.material.textfield.b r7 = new com.google.android.material.textfield.b
            r7.<init>(r0)
            r10 = r16
            r14 = -1
            r10.append(r14, r7)
            com.google.android.material.textfield.g r7 = new com.google.android.material.textfield.g
            r7.<init>(r0)
            r14 = 0
            r10.append(r14, r7)
            com.google.android.material.textfield.h r7 = new com.google.android.material.textfield.h
            r7.<init>(r0)
            r14 = 1
            r10.append(r14, r7)
            com.google.android.material.textfield.a r7 = new com.google.android.material.textfield.a
            r7.<init>(r0)
            r14 = 2
            r10.append(r14, r7)
            com.google.android.material.textfield.d r7 = new com.google.android.material.textfield.d
            r7.<init>(r0)
            r14 = 3
            r10.append(r14, r7)
            int r7 = i9.a.o.TextInputLayout_endIconMode
            boolean r10 = r1.C(r7)
            if (r10 == 0) goto L_0x0462
            r10 = 0
            int r7 = r1.o(r7, r10)
            r0.setEndIconMode(r7)
            int r7 = i9.a.o.TextInputLayout_endIconDrawable
            boolean r10 = r1.C(r7)
            if (r10 == 0) goto L_0x0448
            android.graphics.drawable.Drawable r7 = r1.h(r7)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r7)
        L_0x0448:
            int r7 = i9.a.o.TextInputLayout_endIconContentDescription
            boolean r10 = r1.C(r7)
            if (r10 == 0) goto L_0x0457
            java.lang.CharSequence r7 = r1.x(r7)
            r0.setEndIconContentDescription((java.lang.CharSequence) r7)
        L_0x0457:
            int r7 = i9.a.o.TextInputLayout_endIconCheckable
            r10 = 1
            boolean r7 = r1.a(r7, r10)
            r0.setEndIconCheckable(r7)
            goto L_0x04a8
        L_0x0462:
            int r7 = i9.a.o.TextInputLayout_passwordToggleEnabled
            boolean r10 = r1.C(r7)
            if (r10 == 0) goto L_0x04a8
            r10 = 0
            boolean r7 = r1.a(r7, r10)
            r0.setEndIconMode(r7)
            int r7 = i9.a.o.TextInputLayout_passwordToggleDrawable
            android.graphics.drawable.Drawable r7 = r1.h(r7)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r7)
            int r7 = i9.a.o.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r7 = r1.x(r7)
            r0.setEndIconContentDescription((java.lang.CharSequence) r7)
            int r7 = i9.a.o.TextInputLayout_passwordToggleTint
            boolean r10 = r1.C(r7)
            if (r10 == 0) goto L_0x0493
            android.content.res.ColorStateList r7 = w9.c.b(r12, r1, r7)
            r0.setEndIconTintList(r7)
        L_0x0493:
            int r7 = i9.a.o.TextInputLayout_passwordToggleTintMode
            boolean r10 = r1.C(r7)
            if (r10 == 0) goto L_0x04a8
            r10 = -1
            int r7 = r1.o(r7, r10)
            r10 = 0
            android.graphics.PorterDuff$Mode r7 = com.google.android.material.internal.v.k(r7, r10)
            r0.setEndIconTintMode(r7)
        L_0x04a8:
            int r7 = i9.a.o.TextInputLayout_passwordToggleEnabled
            boolean r7 = r1.C(r7)
            if (r7 != 0) goto L_0x04d4
            int r7 = i9.a.o.TextInputLayout_endIconTint
            boolean r10 = r1.C(r7)
            if (r10 == 0) goto L_0x04bf
            android.content.res.ColorStateList r7 = w9.c.b(r12, r1, r7)
            r0.setEndIconTintList(r7)
        L_0x04bf:
            int r7 = i9.a.o.TextInputLayout_endIconTintMode
            boolean r10 = r1.C(r7)
            if (r10 == 0) goto L_0x04d4
            r10 = -1
            int r7 = r1.o(r7, r10)
            r10 = 0
            android.graphics.PorterDuff$Mode r7 = com.google.android.material.internal.v.k(r7, r10)
            r0.setEndIconTintMode(r7)
        L_0x04d4:
            androidx.appcompat.widget.AppCompatTextView r7 = new androidx.appcompat.widget.AppCompatTextView
            r7.<init>(r12)
            r0.f17523m0 = r7
            int r10 = i9.a.h.textinput_prefix_text
            r7.setId(r10)
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r14 = -2
            r10.<init>(r14, r14)
            r7.setLayoutParams(r10)
            r10 = 1
            f1.w1.B1(r7, r10)
            r8.addView(r2)
            r8.addView(r7)
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r12)
            r0.f17527o0 = r2
            int r7 = i9.a.h.textinput_suffix_text
            r2.setId(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r8 = 80
            r10 = -2
            r7.<init>(r10, r10, r8)
            r2.setLayoutParams(r7)
            r7 = 1
            f1.w1.B1(r2, r7)
            r15.addView(r2)
            r15.addView(r6)
            r15.addView(r4)
            r0.setHelperTextEnabled(r11)
            r0.setHelperText(r13)
            r0.setHelperTextTextAppearance(r9)
            r0.setErrorEnabled(r5)
            r0.setErrorTextAppearance(r3)
            r2 = r17
            r0.setErrorContentDescription(r2)
            int r2 = r0.f17505d0
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f17503c0
            r0.setCounterOverflowTextAppearance(r2)
            r2 = r21
            r0.setPlaceholderText(r2)
            r2 = r20
            r0.setPlaceholderTextAppearance(r2)
            r2 = r23
            r0.setPrefixText(r2)
            r2 = r22
            r0.setPrefixTextAppearance(r2)
            r2 = r25
            r0.setSuffixText(r2)
            r2 = r24
            r0.setSuffixTextAppearance(r2)
            int r2 = i9.a.o.TextInputLayout_errorTextColor
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x0562
            android.content.res.ColorStateList r2 = r1.d(r2)
            r0.setErrorTextColor(r2)
        L_0x0562:
            int r2 = i9.a.o.TextInputLayout_helperTextTextColor
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x0571
            android.content.res.ColorStateList r2 = r1.d(r2)
            r0.setHelperTextColor(r2)
        L_0x0571:
            int r2 = i9.a.o.TextInputLayout_hintTextColor
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x0580
            android.content.res.ColorStateList r2 = r1.d(r2)
            r0.setHintTextColor(r2)
        L_0x0580:
            int r2 = i9.a.o.TextInputLayout_counterTextColor
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x058f
            android.content.res.ColorStateList r2 = r1.d(r2)
            r0.setCounterTextColor(r2)
        L_0x058f:
            int r2 = i9.a.o.TextInputLayout_counterOverflowTextColor
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x059e
            android.content.res.ColorStateList r2 = r1.d(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x059e:
            int r2 = i9.a.o.TextInputLayout_placeholderTextColor
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x05ad
            android.content.res.ColorStateList r2 = r1.d(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05ad:
            int r2 = i9.a.o.TextInputLayout_prefixTextColor
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x05bc
            android.content.res.ColorStateList r2 = r1.d(r2)
            r0.setPrefixTextColor(r2)
        L_0x05bc:
            int r2 = i9.a.o.TextInputLayout_suffixTextColor
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x05cb
            android.content.res.ColorStateList r2 = r1.d(r2)
            r0.setSuffixTextColor(r2)
        L_0x05cb:
            r2 = r26
            r0.setCounterEnabled(r2)
            int r2 = i9.a.o.TextInputLayout_android_enabled
            r3 = 1
            boolean r2 = r1.a(r2, r3)
            r0.setEnabled(r2)
            r1.I()
            r1 = 2
            f1.w1.P1(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x05ea
            f1.w1.Q1(r0, r3)
        L_0x05ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void F0(@m0 Context context, @m0 TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? a.m.character_counter_overflowed_content_description : a.m.character_counter_content_description, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}));
    }

    private e getEndIconDelegate() {
        e eVar = this.R0.get(this.Q0);
        return eVar != null ? eVar : this.R0.get(0);
    }

    @o0
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f17506d1.getVisibility() == 0) {
            return this.f17506d1;
        }
        if (!L() || !P()) {
            return null;
        }
        return this.S0;
    }

    public static void h0(@m0 ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                h0((ViewGroup) childAt, z10);
            }
        }
    }

    public static void s0(@m0 CheckableImageButton checkableImageButton, @o0 View.OnLongClickListener onLongClickListener) {
        boolean J02 = w1.J0(checkableImageButton);
        boolean z10 = false;
        int i10 = 1;
        boolean z11 = onLongClickListener != null;
        if (J02 || z11) {
            z10 = true;
        }
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(J02);
        checkableImageButton.setPressable(J02);
        checkableImageButton.setLongClickable(z11);
        if (!z10) {
            i10 = 2;
        }
        w1.P1(checkableImageButton, i10);
    }

    private void setEditText(EditText editText) {
        if (this.S == null) {
            if (this.Q0 != 3) {
                boolean z10 = editText instanceof TextInputEditText;
            }
            this.S = editText;
            e0();
            setTextInputAccessibilityDelegate(new e(this));
            this.f17534r1.o0(this.S.getTypeface());
            this.f17534r1.e0(this.S.getTextSize());
            int gravity = this.S.getGravity();
            this.f17534r1.U((gravity & -113) | 48);
            this.f17534r1.d0(gravity);
            this.S.addTextChangedListener(new a());
            if (this.f17510f1 == null) {
                this.f17510f1 = this.S.getHintTextColors();
            }
            if (this.f17529p0) {
                if (TextUtils.isEmpty(this.f17531q0)) {
                    CharSequence hint = this.S.getHint();
                    this.T = hint;
                    setHint(hint);
                    this.S.setHint((CharSequence) null);
                }
                this.f17533r0 = true;
            }
            if (this.f17501b0 != null) {
                E0(this.S.getText().length());
            }
            I0();
            this.U.e();
            this.P.bringToFront();
            this.Q.bringToFront();
            this.R.bringToFront();
            this.f17506d1.bringToFront();
            E();
            Q0();
            T0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            M0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z10) {
        int i10 = 0;
        this.f17506d1.setVisibility(z10 ? 0 : 8);
        FrameLayout frameLayout = this.R;
        if (z10) {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        T0();
        if (!L()) {
            H0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f17531q0)) {
            this.f17531q0 = charSequence;
            this.f17534r1.m0(charSequence);
            if (!this.f17532q1) {
                f0();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f17509f0 != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f17511g0 = appCompatTextView;
                appCompatTextView.setId(a.h.textinput_placeholder);
                w1.B1(this.f17511g0, 1);
                setPlaceholderTextAppearance(this.f17515i0);
                setPlaceholderTextColor(this.f17513h0);
                g();
            } else {
                o0();
                this.f17511g0 = null;
            }
            this.f17509f0 = z10;
        }
    }

    public static void t0(@m0 CheckableImageButton checkableImageButton, @o0 View.OnClickListener onClickListener, @o0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        s0(checkableImageButton, onLongClickListener);
    }

    public static void u0(@m0 CheckableImageButton checkableImageButton, @o0 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        s0(checkableImageButton, onLongClickListener);
    }

    public final void A() {
        if (C()) {
            ((c) this.f17535s0).R0();
        }
    }

    public final void A0(boolean z10) {
        if (!z10 || getEndIconDrawable() == null) {
            m();
            return;
        }
        Drawable mutate = o0.d.r(getEndIconDrawable()).mutate();
        o0.d.n(mutate, this.U.p());
        this.S0.setImageDrawable(mutate);
    }

    public final void B(boolean z10) {
        ValueAnimator valueAnimator = this.f17540u1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f17540u1.cancel();
        }
        if (!z10 || !this.f17538t1) {
            this.f17534r1.h0(1.0f);
        } else {
            i(1.0f);
        }
        this.f17532q1 = false;
        if (C()) {
            f0();
        }
        O0();
        R0();
        U0();
    }

    public final void B0() {
        Resources resources;
        int i10;
        if (this.f17543w0 == 1) {
            if (w9.c.h(getContext())) {
                resources = getResources();
                i10 = a.f.material_font_2_0_box_collapsed_padding_top;
            } else if (w9.c.g(getContext())) {
                resources = getResources();
                i10 = a.f.material_font_1_3_box_collapsed_padding_top;
            } else {
                return;
            }
            this.f17545x0 = resources.getDimensionPixelSize(i10);
        }
    }

    public final boolean C() {
        return this.f17529p0 && !TextUtils.isEmpty(this.f17531q0) && (this.f17535s0 instanceof c);
    }

    public final void C0(@m0 Rect rect) {
        j jVar = this.f17537t0;
        if (jVar != null) {
            int i10 = rect.bottom;
            jVar.setBounds(rect.left, i10 - this.A0, rect.right, i10);
        }
    }

    @g1
    public boolean D() {
        return C() && ((c) this.f17535s0).O0();
    }

    public final void D0() {
        if (this.f17501b0 != null) {
            EditText editText = this.S;
            E0(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void E() {
        Iterator<h> it = this.P0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public void E0(int i10) {
        boolean z10 = this.f17499a0;
        int i11 = this.W;
        if (i11 == -1) {
            this.f17501b0.setText(String.valueOf(i10));
            this.f17501b0.setContentDescription((CharSequence) null);
            this.f17499a0 = false;
        } else {
            this.f17499a0 = i10 > i11;
            F0(getContext(), this.f17501b0, i10, this.W, this.f17499a0);
            if (z10 != this.f17499a0) {
                G0();
            }
            this.f17501b0.setText(b1.a.c().q(getContext().getString(a.m.character_counter_pattern, new Object[]{Integer.valueOf(i10), Integer.valueOf(this.W)})));
        }
        if (this.S != null && z10 != this.f17499a0) {
            L0(false);
            V0();
            I0();
        }
    }

    public final void F(int i10) {
        Iterator<i> it = this.T0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10);
        }
    }

    public final void G(Canvas canvas) {
        j jVar = this.f17537t0;
        if (jVar != null) {
            Rect bounds = jVar.getBounds();
            bounds.top = bounds.bottom - this.f17546y0;
            this.f17537t0.draw(canvas);
        }
    }

    public final void G0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f17501b0;
        if (textView != null) {
            v0(textView, this.f17499a0 ? this.f17503c0 : this.f17505d0);
            if (!this.f17499a0 && (colorStateList2 = this.f17517j0) != null) {
                this.f17501b0.setTextColor(colorStateList2);
            }
            if (this.f17499a0 && (colorStateList = this.f17519k0) != null) {
                this.f17501b0.setTextColor(colorStateList);
            }
        }
    }

    public final void H(@m0 Canvas canvas) {
        if (this.f17529p0) {
            this.f17534r1.j(canvas);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.S
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.x0()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.P
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.S
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.M0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.N0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.M0 = r6
            r10.N0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.S
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.y.h(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.M0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.S
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.y.w(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.M0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.S
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.y.h(r0)
            android.widget.EditText r6 = r10.S
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.y.w(r6, r2, r7, r8, r0)
            r10.M0 = r2
        L_0x0060:
            r0 = r5
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            boolean r6 = r10.w0()
            if (r6 == 0) goto L_0x00ce
            android.widget.TextView r2 = r10.f17527o0
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.S
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = f1.o.c(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.S
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.y.h(r6)
            android.graphics.drawable.Drawable r7 = r10.Y0
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.Z0
            if (r8 == r2) goto L_0x00ad
            r10.Z0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.S
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.Y0
            r4 = r6[r4]
        L_0x00a9:
            androidx.core.widget.y.w(r0, r1, r2, r3, r4)
            goto L_0x00ef
        L_0x00ad:
            if (r7 != 0) goto L_0x00bb
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.Y0 = r7
            r10.Z0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bb:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.Y0
            if (r2 == r3) goto L_0x00cc
            r10.f17500a1 = r2
            android.widget.EditText r0 = r10.S
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            goto L_0x00a9
        L_0x00cc:
            r5 = r0
            goto L_0x00ef
        L_0x00ce:
            android.graphics.drawable.Drawable r6 = r10.Y0
            if (r6 == 0) goto L_0x00f0
            android.widget.EditText r6 = r10.S
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.y.h(r6)
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.Y0
            if (r3 != r7) goto L_0x00ec
            android.widget.EditText r0 = r10.S
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f17500a1
            r4 = r6[r4]
            androidx.core.widget.y.w(r0, r1, r3, r7, r4)
            goto L_0x00ed
        L_0x00ec:
            r5 = r0
        L_0x00ed:
            r10.Y0 = r2
        L_0x00ef:
            r0 = r5
        L_0x00f0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.H0():boolean");
    }

    public final void I(boolean z10) {
        ValueAnimator valueAnimator = this.f17540u1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f17540u1.cancel();
        }
        if (!z10 || !this.f17538t1) {
            this.f17534r1.h0(0.0f);
        } else {
            i(0.0f);
        }
        if (C() && ((c) this.f17535s0).O0()) {
            A();
        }
        this.f17532q1 = true;
        M();
        R0();
        U0();
    }

    public void I0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.S;
        if (editText != null && this.f17543w0 == 0 && (background = editText.getBackground()) != null) {
            if (b0.a(background)) {
                background = background.mutate();
            }
            if (this.U.l()) {
                currentTextColor = this.U.p();
            } else if (!this.f17499a0 || (textView = this.f17501b0) == null) {
                o0.d.c(background);
                this.S.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(androidx.appcompat.widget.f.e(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    public final int J(int i10, boolean z10) {
        int compoundPaddingLeft = i10 + this.S.getCompoundPaddingLeft();
        return (this.f17521l0 == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - this.f17523m0.getMeasuredWidth()) + this.f17523m0.getPaddingLeft();
    }

    public final boolean J0() {
        int max;
        if (this.S == null || this.S.getMeasuredHeight() >= (max = Math.max(this.Q.getMeasuredHeight(), this.P.getMeasuredHeight()))) {
            return false;
        }
        this.S.setMinimumHeight(max);
        return true;
    }

    public final int K(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.S.getCompoundPaddingRight();
        return (this.f17521l0 == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (this.f17523m0.getMeasuredWidth() - this.f17523m0.getPaddingRight());
    }

    public final void K0() {
        if (this.f17543w0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.O.getLayoutParams();
            int v10 = v();
            if (v10 != layoutParams.topMargin) {
                layoutParams.topMargin = v10;
                this.O.requestLayout();
            }
        }
    }

    public final boolean L() {
        return this.Q0 != 0;
    }

    public void L0(boolean z10) {
        M0(z10, false);
    }

    public final void M() {
        TextView textView = this.f17511g0;
        if (textView != null && this.f17509f0) {
            textView.setText((CharSequence) null);
            this.f17511g0.setVisibility(4);
        }
    }

    public final void M0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        com.google.android.material.internal.a aVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.S;
        boolean z12 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.S;
        boolean z13 = editText2 != null && editText2.hasFocus();
        boolean l10 = this.U.l();
        ColorStateList colorStateList2 = this.f17510f1;
        if (colorStateList2 != null) {
            this.f17534r1.T(colorStateList2);
            this.f17534r1.c0(this.f17510f1);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f17510f1;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f17530p1) : this.f17530p1;
            this.f17534r1.T(ColorStateList.valueOf(colorForState));
            this.f17534r1.c0(ColorStateList.valueOf(colorForState));
        } else if (l10) {
            this.f17534r1.T(this.U.q());
        } else {
            if (this.f17499a0 && (textView = this.f17501b0) != null) {
                aVar = this.f17534r1;
                colorStateList = textView.getTextColors();
            } else if (z13 && (colorStateList = this.f17512g1) != null) {
                aVar = this.f17534r1;
            }
            aVar.T(colorStateList);
        }
        if (z12 || !this.f17536s1 || (isEnabled() && z13)) {
            if (z11 || this.f17532q1) {
                B(z10);
            }
        } else if (z11 || !this.f17532q1) {
            I(z10);
        }
    }

    public boolean N() {
        return this.V;
    }

    public final void N0() {
        EditText editText;
        if (this.f17511g0 != null && (editText = this.S) != null) {
            this.f17511g0.setGravity(editText.getGravity());
            this.f17511g0.setPadding(this.S.getCompoundPaddingLeft(), this.S.getCompoundPaddingTop(), this.S.getCompoundPaddingRight(), this.S.getCompoundPaddingBottom());
        }
    }

    public boolean O() {
        return this.S0.a();
    }

    public final void O0() {
        EditText editText = this.S;
        P0(editText == null ? 0 : editText.getText().length());
    }

    public boolean P() {
        return this.R.getVisibility() == 0 && this.S0.getVisibility() == 0;
    }

    public final void P0(int i10) {
        if (i10 != 0 || this.f17532q1) {
            M();
        } else {
            z0();
        }
    }

    public boolean Q() {
        return this.U.C();
    }

    public final void Q0() {
        if (this.S != null) {
            w1.b2(this.f17523m0, c0() ? 0 : w1.j0(this.S), this.S.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(a.f.material_input_text_to_prefix_suffix_padding), this.S.getCompoundPaddingBottom());
        }
    }

    public final boolean R() {
        return this.f17506d1.getVisibility() == 0;
    }

    public final void R0() {
        this.f17523m0.setVisibility((this.f17521l0 == null || X()) ? 8 : 0);
        H0();
    }

    public boolean S() {
        return this.f17536s1;
    }

    public final void S0(boolean z10, boolean z11) {
        int defaultColor = this.f17520k1.getDefaultColor();
        int colorForState = this.f17520k1.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f17520k1.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.B0 = colorForState2;
        } else if (z11) {
            this.B0 = colorForState;
        } else {
            this.B0 = defaultColor;
        }
    }

    @g1
    public final boolean T() {
        return this.U.v();
    }

    public final void T0() {
        if (this.S != null) {
            w1.b2(this.f17527o0, getContext().getResources().getDimensionPixelSize(a.f.material_input_text_to_prefix_suffix_padding), this.S.getPaddingTop(), (P() || R()) ? 0 : w1.i0(this.S), this.S.getPaddingBottom());
        }
    }

    public boolean U() {
        return this.U.D();
    }

    public final void U0() {
        int visibility = this.f17527o0.getVisibility();
        int i10 = 0;
        boolean z10 = this.f17525n0 != null && !X();
        TextView textView = this.f17527o0;
        if (!z10) {
            i10 = 8;
        }
        textView.setVisibility(i10);
        if (visibility != this.f17527o0.getVisibility()) {
            getEndIconDelegate().c(z10);
        }
        H0();
    }

    public boolean V() {
        return this.f17538t1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.S;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V0() {
        /*
            r6 = this;
            z9.j r0 = r6.f17535s0
            if (r0 == 0) goto L_0x00db
            int r0 = r6.f17543w0
            if (r0 != 0) goto L_0x000a
            goto L_0x00db
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.S
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.S
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = r1
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.f17530p1
        L_0x003c:
            r6.B0 = r4
            goto L_0x0075
        L_0x003f:
            com.google.android.material.textfield.f r4 = r6.U
            boolean r4 = r4.l()
            if (r4 == 0) goto L_0x0056
            android.content.res.ColorStateList r4 = r6.f17520k1
            if (r4 == 0) goto L_0x004f
        L_0x004b:
            r6.S0(r0, r3)
            goto L_0x0075
        L_0x004f:
            com.google.android.material.textfield.f r4 = r6.U
            int r4 = r4.p()
            goto L_0x003c
        L_0x0056:
            boolean r4 = r6.f17499a0
            if (r4 == 0) goto L_0x0068
            android.widget.TextView r4 = r6.f17501b0
            if (r4 == 0) goto L_0x0068
            android.content.res.ColorStateList r5 = r6.f17520k1
            if (r5 == 0) goto L_0x0063
            goto L_0x004b
        L_0x0063:
            int r4 = r4.getCurrentTextColor()
            goto L_0x003c
        L_0x0068:
            if (r0 == 0) goto L_0x006d
            int r4 = r6.f17518j1
            goto L_0x003c
        L_0x006d:
            if (r3 == 0) goto L_0x0072
            int r4 = r6.f17516i1
            goto L_0x003c
        L_0x0072:
            int r4 = r6.f17514h1
            goto L_0x003c
        L_0x0075:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x008c
            com.google.android.material.textfield.f r4 = r6.U
            boolean r4 = r4.C()
            if (r4 == 0) goto L_0x008c
            com.google.android.material.textfield.f r4 = r6.U
            boolean r4 = r4.l()
            if (r4 == 0) goto L_0x008c
            r1 = r2
        L_0x008c:
            r6.setErrorIconVisible(r1)
            r6.j0()
            r6.l0()
            r6.i0()
            com.google.android.material.textfield.e r1 = r6.getEndIconDelegate()
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x00ab
            com.google.android.material.textfield.f r1 = r6.U
            boolean r1 = r1.l()
            r6.A0(r1)
        L_0x00ab:
            if (r0 == 0) goto L_0x00b6
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00b6
            int r1 = r6.A0
            goto L_0x00b8
        L_0x00b6:
            int r1 = r6.f17547z0
        L_0x00b8:
            r6.f17546y0 = r1
            int r1 = r6.f17543w0
            if (r1 != r2) goto L_0x00d8
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00c9
            int r0 = r6.f17524m1
        L_0x00c6:
            r6.C0 = r0
            goto L_0x00d8
        L_0x00c9:
            if (r3 == 0) goto L_0x00d0
            if (r0 != 0) goto L_0x00d0
            int r0 = r6.f17528o1
            goto L_0x00c6
        L_0x00d0:
            if (r0 == 0) goto L_0x00d5
            int r0 = r6.f17526n1
            goto L_0x00c6
        L_0x00d5:
            int r0 = r6.f17522l1
            goto L_0x00c6
        L_0x00d8:
            r6.j()
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.V0():void");
    }

    public boolean W() {
        return this.f17529p0;
    }

    @g1
    public final boolean X() {
        return this.f17532q1;
    }

    @Deprecated
    public boolean Y() {
        return this.Q0 == 1;
    }

    @x0({x0.a.LIBRARY_GROUP})
    public boolean Z() {
        return this.f17533r0;
    }

    public final boolean a0() {
        return this.f17543w0 == 1 && this.S.getMinLines() <= 1;
    }

    public void addView(@m0 View view, int i10, @m0 ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.O.addView(view, layoutParams2);
            this.O.setLayoutParams(layoutParams);
            K0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    public boolean b0() {
        return this.H0.a();
    }

    public boolean c0() {
        return this.H0.getVisibility() == 0;
    }

    public final int[] d0(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@m0 ViewStructure viewStructure, int i10) {
        EditText editText = this.S;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.T != null) {
            boolean z10 = this.f17533r0;
            this.f17533r0 = false;
            CharSequence hint = editText.getHint();
            this.S.setHint(this.T);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
            } finally {
                this.S.setHint(hint);
                this.f17533r0 = z10;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i10);
            onProvideAutofillVirtualStructure(viewStructure, i10);
            viewStructure.setChildCount(this.O.getChildCount());
            for (int i11 = 0; i11 < this.O.getChildCount(); i11++) {
                View childAt = this.O.getChildAt(i11);
                ViewStructure newChild = viewStructure.newChild(i11);
                childAt.dispatchProvideAutofillStructure(newChild, i10);
                if (childAt == this.S) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public void dispatchRestoreInstanceState(@m0 SparseArray<Parcelable> sparseArray) {
        this.f17544w1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f17544w1 = false;
    }

    public void draw(@m0 Canvas canvas) {
        super.draw(canvas);
        H(canvas);
        G(canvas);
    }

    public void drawableStateChanged() {
        if (!this.f17542v1) {
            boolean z10 = true;
            this.f17542v1 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.a aVar = this.f17534r1;
            boolean l02 = aVar != null ? aVar.l0(drawableState) | false : false;
            if (this.S != null) {
                if (!w1.T0(this) || !isEnabled()) {
                    z10 = false;
                }
                L0(z10);
            }
            I0();
            V0();
            if (l02) {
                invalidate();
            }
            this.f17542v1 = false;
        }
    }

    public void e(@m0 h hVar) {
        this.P0.add(hVar);
        if (this.S != null) {
            hVar.a(this);
        }
    }

    public final void e0() {
        p();
        r0();
        V0();
        B0();
        h();
        if (this.f17543w0 != 0) {
            K0();
        }
    }

    public void f(@m0 i iVar) {
        this.T0.add(iVar);
    }

    public final void f0() {
        if (C()) {
            RectF rectF = this.F0;
            this.f17534r1.m(rectF, this.S.getWidth(), this.S.getGravity());
            l(rectF);
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            ((c) this.f17535s0).U0(rectF);
        }
    }

    public final void g() {
        TextView textView = this.f17511g0;
        if (textView != null) {
            this.O.addView(textView);
            this.f17511g0.setVisibility(0);
        }
    }

    @Deprecated
    public void g0(boolean z10) {
        if (this.Q0 == 1) {
            this.S0.performClick();
            if (z10) {
                this.S0.jumpDrawablesToCurrentState();
            }
        }
    }

    public int getBaseline() {
        EditText editText = this.S;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    @m0
    public j getBoxBackground() {
        int i10 = this.f17543w0;
        if (i10 == 1 || i10 == 2) {
            return this.f17535s0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.C0;
    }

    public int getBoxBackgroundMode() {
        return this.f17543w0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f17535s0.t();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f17535s0.u();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f17535s0.S();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f17535s0.R();
    }

    public int getBoxStrokeColor() {
        return this.f17518j1;
    }

    @o0
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f17520k1;
    }

    public int getBoxStrokeWidth() {
        return this.f17547z0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.A0;
    }

    public int getCounterMaxLength() {
        return this.W;
    }

    @o0
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.V || !this.f17499a0 || (textView = this.f17501b0) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    @o0
    public ColorStateList getCounterOverflowTextColor() {
        return this.f17517j0;
    }

    @o0
    public ColorStateList getCounterTextColor() {
        return this.f17517j0;
    }

    @o0
    public ColorStateList getDefaultHintTextColor() {
        return this.f17510f1;
    }

    @o0
    public EditText getEditText() {
        return this.S;
    }

    @o0
    public CharSequence getEndIconContentDescription() {
        return this.S0.getContentDescription();
    }

    @o0
    public Drawable getEndIconDrawable() {
        return this.S0.getDrawable();
    }

    public int getEndIconMode() {
        return this.Q0;
    }

    @m0
    public CheckableImageButton getEndIconView() {
        return this.S0;
    }

    @o0
    public CharSequence getError() {
        if (this.U.C()) {
            return this.U.o();
        }
        return null;
    }

    @o0
    public CharSequence getErrorContentDescription() {
        return this.U.n();
    }

    @l
    public int getErrorCurrentTextColors() {
        return this.U.p();
    }

    @o0
    public Drawable getErrorIconDrawable() {
        return this.f17506d1.getDrawable();
    }

    @g1
    public final int getErrorTextCurrentColor() {
        return this.U.p();
    }

    @o0
    public CharSequence getHelperText() {
        if (this.U.D()) {
            return this.U.r();
        }
        return null;
    }

    @l
    public int getHelperTextCurrentTextColor() {
        return this.U.t();
    }

    @o0
    public CharSequence getHint() {
        if (this.f17529p0) {
            return this.f17531q0;
        }
        return null;
    }

    @g1
    public final float getHintCollapsedTextHeight() {
        return this.f17534r1.p();
    }

    @g1
    public final int getHintCurrentCollapsedTextColor() {
        return this.f17534r1.u();
    }

    @o0
    public ColorStateList getHintTextColor() {
        return this.f17512g1;
    }

    @o0
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.S0.getContentDescription();
    }

    @o0
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.S0.getDrawable();
    }

    @o0
    public CharSequence getPlaceholderText() {
        if (this.f17509f0) {
            return this.f17507e0;
        }
        return null;
    }

    @b1
    public int getPlaceholderTextAppearance() {
        return this.f17515i0;
    }

    @o0
    public ColorStateList getPlaceholderTextColor() {
        return this.f17513h0;
    }

    @o0
    public CharSequence getPrefixText() {
        return this.f17521l0;
    }

    @o0
    public ColorStateList getPrefixTextColor() {
        return this.f17523m0.getTextColors();
    }

    @m0
    public TextView getPrefixTextView() {
        return this.f17523m0;
    }

    @o0
    public CharSequence getStartIconContentDescription() {
        return this.H0.getContentDescription();
    }

    @o0
    public Drawable getStartIconDrawable() {
        return this.H0.getDrawable();
    }

    @o0
    public CharSequence getSuffixText() {
        return this.f17525n0;
    }

    @o0
    public ColorStateList getSuffixTextColor() {
        return this.f17527o0.getTextColors();
    }

    @m0
    public TextView getSuffixTextView() {
        return this.f17527o0;
    }

    @o0
    public Typeface getTypeface() {
        return this.G0;
    }

    public final void h() {
        EditText editText;
        int j02;
        int dimensionPixelSize;
        int i02;
        Resources resources;
        int i10;
        if (this.S != null && this.f17543w0 == 1) {
            if (w9.c.h(getContext())) {
                editText = this.S;
                j02 = w1.j0(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(a.f.material_filled_edittext_font_2_0_padding_top);
                i02 = w1.i0(this.S);
                resources = getResources();
                i10 = a.f.material_filled_edittext_font_2_0_padding_bottom;
            } else if (w9.c.g(getContext())) {
                editText = this.S;
                j02 = w1.j0(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(a.f.material_filled_edittext_font_1_3_padding_top);
                i02 = w1.i0(this.S);
                resources = getResources();
                i10 = a.f.material_filled_edittext_font_1_3_padding_bottom;
            } else {
                return;
            }
            w1.b2(editText, j02, dimensionPixelSize, i02, resources.getDimensionPixelSize(i10));
        }
    }

    @g1
    public void i(float f10) {
        if (this.f17534r1.C() != f10) {
            if (this.f17540u1 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f17540u1 = valueAnimator;
                valueAnimator.setInterpolator(j9.a.f19829b);
                this.f17540u1.setDuration(167);
                this.f17540u1.addUpdateListener(new d());
            }
            this.f17540u1.setFloatValues(new float[]{this.f17534r1.C(), f10});
            this.f17540u1.start();
        }
    }

    public void i0() {
        k0(this.S0, this.U0);
    }

    public final void j() {
        j jVar = this.f17535s0;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(this.f17539u0);
            if (w()) {
                this.f17535s0.C0((float) this.f17546y0, this.B0);
            }
            int q10 = q();
            this.C0 = q10;
            this.f17535s0.n0(ColorStateList.valueOf(q10));
            if (this.Q0 == 3) {
                this.S.getBackground().invalidateSelf();
            }
            k();
            invalidate();
        }
    }

    public void j0() {
        k0(this.f17506d1, this.f17508e1);
    }

    public final void k() {
        if (this.f17537t0 != null) {
            if (x()) {
                this.f17537t0.n0(ColorStateList.valueOf(this.B0));
            }
            invalidate();
        }
    }

    public final void k0(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(d0(checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = o0.d.r(drawable).mutate();
            o0.d.o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public final void l(@m0 RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f17541v0;
        rectF.left = f10 - ((float) i10);
        rectF.top -= (float) i10;
        rectF.right += (float) i10;
        rectF.bottom += (float) i10;
    }

    public void l0() {
        k0(this.H0, this.I0);
    }

    public final void m() {
        n(this.S0, this.V0, this.U0, this.X0, this.W0);
    }

    public void m0(@m0 h hVar) {
        this.P0.remove(hVar);
    }

    public final void n(@m0 CheckableImageButton checkableImageButton, boolean z10, ColorStateList colorStateList, boolean z11, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z10 || z11)) {
            drawable = o0.d.r(drawable).mutate();
            if (z10) {
                o0.d.o(drawable, colorStateList);
            }
            if (z11) {
                o0.d.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void n0(@m0 i iVar) {
        this.T0.remove(iVar);
    }

    public final void o() {
        n(this.H0, this.J0, this.I0, this.L0, this.K0);
    }

    public final void o0() {
        TextView textView = this.f17511g0;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.S;
        if (editText != null) {
            Rect rect = this.D0;
            com.google.android.material.internal.c.a(this, editText, rect);
            C0(rect);
            if (this.f17529p0) {
                this.f17534r1.e0(this.S.getTextSize());
                int gravity = this.S.getGravity();
                this.f17534r1.U((gravity & -113) | 48);
                this.f17534r1.d0(gravity);
                this.f17534r1.Q(r(rect));
                this.f17534r1.Z(u(rect));
                this.f17534r1.N();
                if (C() && !this.f17532q1) {
                    f0();
                }
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean J02 = J0();
        boolean H02 = H0();
        if (J02 || H02) {
            this.S.post(new c());
        }
        N0();
        Q0();
        T0();
    }

    public void onRestoreInstanceState(@o0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.Q);
        if (savedState.R) {
            this.S0.post(new b());
        }
        setHint(savedState.S);
        setHelperText(savedState.T);
        setPlaceholderText(savedState.U);
        requestLayout();
    }

    @o0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.U.l()) {
            savedState.Q = getError();
        }
        savedState.R = L() && this.S0.isChecked();
        savedState.S = getHint();
        savedState.T = getHelperText();
        savedState.U = getPlaceholderText();
        return savedState;
    }

    public final void p() {
        int i10 = this.f17543w0;
        if (i10 == 0) {
            this.f17535s0 = null;
        } else if (i10 == 1) {
            this.f17535s0 = new j(this.f17539u0);
            this.f17537t0 = new j();
            return;
        } else if (i10 == 2) {
            this.f17535s0 = (!this.f17529p0 || (this.f17535s0 instanceof c)) ? new j(this.f17539u0) : new c(this.f17539u0);
        } else {
            throw new IllegalArgumentException(this.f17543w0 + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        this.f17537t0 = null;
    }

    public void p0(float f10, float f11, float f12, float f13) {
        j jVar = this.f17535s0;
        if (jVar == null || jVar.R() != f10 || this.f17535s0.S() != f11 || this.f17535s0.u() != f13 || this.f17535s0.t() != f12) {
            this.f17539u0 = this.f17539u0.v().K(f10).P(f11).C(f13).x(f12).m();
            j();
        }
    }

    public final int q() {
        return this.f17543w0 == 1 ? o9.a.f(o9.a.e(this, a.c.colorSurface, 0), this.C0) : this.C0;
    }

    public void q0(@p int i10, @p int i11, @p int i12, @p int i13) {
        p0(getContext().getResources().getDimension(i10), getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i13), getContext().getResources().getDimension(i12));
    }

    @m0
    public final Rect r(@m0 Rect rect) {
        int i10;
        int i11;
        if (this.S != null) {
            Rect rect2 = this.E0;
            boolean z10 = w1.X(this) == 1;
            rect2.bottom = rect.bottom;
            int i12 = this.f17543w0;
            if (i12 == 1) {
                rect2.left = J(rect.left, z10);
                i10 = rect.top + this.f17545x0;
            } else if (i12 != 2) {
                rect2.left = J(rect.left, z10);
                i10 = getPaddingTop();
            } else {
                rect2.left = rect.left + this.S.getPaddingLeft();
                rect2.top = rect.top - v();
                i11 = rect.right - this.S.getPaddingRight();
                rect2.right = i11;
                return rect2;
            }
            rect2.top = i10;
            i11 = K(rect.right, z10);
            rect2.right = i11;
            return rect2;
        }
        throw new IllegalStateException();
    }

    public final void r0() {
        if (y0()) {
            w1.G1(this.S, this.f17535s0);
        }
    }

    public final int s(@m0 Rect rect, @m0 Rect rect2, float f10) {
        return a0() ? (int) (((float) rect2.top) + f10) : rect.bottom - this.S.getCompoundPaddingBottom();
    }

    public void setBoxBackgroundColor(@l int i10) {
        if (this.C0 != i10) {
            this.C0 = i10;
            this.f17522l1 = i10;
            this.f17526n1 = i10;
            this.f17528o1 = i10;
            j();
        }
    }

    public void setBoxBackgroundColorResource(@n int i10) {
        setBoxBackgroundColor(i0.d.f(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@m0 ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f17522l1 = defaultColor;
        this.C0 = defaultColor;
        this.f17524m1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f17526n1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f17528o1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        j();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 != this.f17543w0) {
            this.f17543w0 = i10;
            if (this.S != null) {
                e0();
            }
        }
    }

    public void setBoxStrokeColor(@l int i10) {
        if (this.f17518j1 != i10) {
            this.f17518j1 = i10;
            V0();
        }
    }

    public void setBoxStrokeColorStateList(@m0 ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f17514h1 = colorStateList.getDefaultColor();
            this.f17530p1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f17516i1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f17518j1 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            V0();
        }
        this.f17518j1 = defaultColor;
        V0();
    }

    public void setBoxStrokeErrorColor(@o0 ColorStateList colorStateList) {
        if (this.f17520k1 != colorStateList) {
            this.f17520k1 = colorStateList;
            V0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f17547z0 = i10;
        V0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.A0 = i10;
        V0();
    }

    public void setBoxStrokeWidthFocusedResource(@p int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(@p int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.V != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f17501b0 = appCompatTextView;
                appCompatTextView.setId(a.h.textinput_counter);
                Typeface typeface = this.G0;
                if (typeface != null) {
                    this.f17501b0.setTypeface(typeface);
                }
                this.f17501b0.setMaxLines(1);
                this.U.d(this.f17501b0, 2);
                f1.o.h((ViewGroup.MarginLayoutParams) this.f17501b0.getLayoutParams(), getResources().getDimensionPixelOffset(a.f.mtrl_textinput_counter_margin_start));
                G0();
                D0();
            } else {
                this.U.E(this.f17501b0, 2);
                this.f17501b0 = null;
            }
            this.V = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.W != i10) {
            if (i10 <= 0) {
                i10 = -1;
            }
            this.W = i10;
            if (this.V) {
                D0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f17503c0 != i10) {
            this.f17503c0 = i10;
            G0();
        }
    }

    public void setCounterOverflowTextColor(@o0 ColorStateList colorStateList) {
        if (this.f17519k0 != colorStateList) {
            this.f17519k0 = colorStateList;
            G0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f17505d0 != i10) {
            this.f17505d0 = i10;
            G0();
        }
    }

    public void setCounterTextColor(@o0 ColorStateList colorStateList) {
        if (this.f17517j0 != colorStateList) {
            this.f17517j0 = colorStateList;
            G0();
        }
    }

    public void setDefaultHintTextColor(@o0 ColorStateList colorStateList) {
        this.f17510f1 = colorStateList;
        this.f17512g1 = colorStateList;
        if (this.S != null) {
            L0(false);
        }
    }

    public void setEnabled(boolean z10) {
        h0(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.S0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.S0.setCheckable(z10);
    }

    public void setEndIconContentDescription(@a1 int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconContentDescription(@o0 CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.S0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@u int i10) {
        setEndIconDrawable(i10 != 0 ? g.a.d(getContext(), i10) : null);
    }

    public void setEndIconDrawable(@o0 Drawable drawable) {
        this.S0.setImageDrawable(drawable);
        i0();
    }

    public void setEndIconMode(int i10) {
        int i11 = this.Q0;
        this.Q0 = i10;
        F(i11);
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().b(this.f17543w0)) {
            getEndIconDelegate().a();
            m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f17543w0 + " is not supported by the end icon mode " + i10);
    }

    public void setEndIconOnClickListener(@o0 View.OnClickListener onClickListener) {
        t0(this.S0, onClickListener, this.f17502b1);
    }

    public void setEndIconOnLongClickListener(@o0 View.OnLongClickListener onLongClickListener) {
        this.f17502b1 = onLongClickListener;
        u0(this.S0, onLongClickListener);
    }

    public void setEndIconTintList(@o0 ColorStateList colorStateList) {
        if (this.U0 != colorStateList) {
            this.U0 = colorStateList;
            this.V0 = true;
            m();
        }
    }

    public void setEndIconTintMode(@o0 PorterDuff.Mode mode) {
        if (this.W0 != mode) {
            this.W0 = mode;
            this.X0 = true;
            m();
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (P() != z10) {
            this.S0.setVisibility(z10 ? 0 : 8);
            T0();
            H0();
        }
    }

    public void setError(@o0 CharSequence charSequence) {
        if (!this.U.C()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.U.R(charSequence);
        } else {
            this.U.x();
        }
    }

    public void setErrorContentDescription(@o0 CharSequence charSequence) {
        this.U.G(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.U.H(z10);
    }

    public void setErrorIconDrawable(@u int i10) {
        setErrorIconDrawable(i10 != 0 ? g.a.d(getContext(), i10) : null);
        j0();
    }

    public void setErrorIconDrawable(@o0 Drawable drawable) {
        this.f17506d1.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.U.C());
    }

    public void setErrorIconOnClickListener(@o0 View.OnClickListener onClickListener) {
        t0(this.f17506d1, onClickListener, this.f17504c1);
    }

    public void setErrorIconOnLongClickListener(@o0 View.OnLongClickListener onLongClickListener) {
        this.f17504c1 = onLongClickListener;
        u0(this.f17506d1, onLongClickListener);
    }

    public void setErrorIconTintList(@o0 ColorStateList colorStateList) {
        this.f17508e1 = colorStateList;
        Drawable drawable = this.f17506d1.getDrawable();
        if (drawable != null) {
            drawable = o0.d.r(drawable).mutate();
            o0.d.o(drawable, colorStateList);
        }
        if (this.f17506d1.getDrawable() != drawable) {
            this.f17506d1.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(@o0 PorterDuff.Mode mode) {
        Drawable drawable = this.f17506d1.getDrawable();
        if (drawable != null) {
            drawable = o0.d.r(drawable).mutate();
            o0.d.p(drawable, mode);
        }
        if (this.f17506d1.getDrawable() != drawable) {
            this.f17506d1.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(@b1 int i10) {
        this.U.I(i10);
    }

    public void setErrorTextColor(@o0 ColorStateList colorStateList) {
        this.U.J(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f17536s1 != z10) {
            this.f17536s1 = z10;
            L0(false);
        }
    }

    public void setHelperText(@o0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!U()) {
                setHelperTextEnabled(true);
            }
            this.U.S(charSequence);
        } else if (U()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(@o0 ColorStateList colorStateList) {
        this.U.M(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.U.L(z10);
    }

    public void setHelperTextTextAppearance(@b1 int i10) {
        this.U.K(i10);
    }

    public void setHint(@a1 int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(@o0 CharSequence charSequence) {
        if (this.f17529p0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f17538t1 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f17529p0) {
            this.f17529p0 = z10;
            if (!z10) {
                this.f17533r0 = false;
                if (!TextUtils.isEmpty(this.f17531q0) && TextUtils.isEmpty(this.S.getHint())) {
                    this.S.setHint(this.f17531q0);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.S.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f17531q0)) {
                        setHint(hint);
                    }
                    this.S.setHint((CharSequence) null);
                }
                this.f17533r0 = true;
            }
            if (this.S != null) {
                K0();
            }
        }
    }

    public void setHintTextAppearance(@b1 int i10) {
        this.f17534r1.R(i10);
        this.f17512g1 = this.f17534r1.n();
        if (this.S != null) {
            L0(false);
            K0();
        }
    }

    public void setHintTextColor(@o0 ColorStateList colorStateList) {
        if (this.f17512g1 != colorStateList) {
            if (this.f17510f1 == null) {
                this.f17534r1.T(colorStateList);
            }
            this.f17512g1 = colorStateList;
            if (this.S != null) {
                L0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@a1 int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@o0 CharSequence charSequence) {
        this.S0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@u int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? g.a.d(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@o0 Drawable drawable) {
        this.S0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.Q0 != 1) {
            setEndIconMode(1);
        } else if (!z10) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@o0 ColorStateList colorStateList) {
        this.U0 = colorStateList;
        this.V0 = true;
        m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@o0 PorterDuff.Mode mode) {
        this.W0 = mode;
        this.X0 = true;
        m();
    }

    public void setPlaceholderText(@o0 CharSequence charSequence) {
        if (!this.f17509f0 || !TextUtils.isEmpty(charSequence)) {
            if (!this.f17509f0) {
                setPlaceholderTextEnabled(true);
            }
            this.f17507e0 = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        O0();
    }

    public void setPlaceholderTextAppearance(@b1 int i10) {
        this.f17515i0 = i10;
        TextView textView = this.f17511g0;
        if (textView != null) {
            y.E(textView, i10);
        }
    }

    public void setPlaceholderTextColor(@o0 ColorStateList colorStateList) {
        if (this.f17513h0 != colorStateList) {
            this.f17513h0 = colorStateList;
            TextView textView = this.f17511g0;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(@o0 CharSequence charSequence) {
        this.f17521l0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f17523m0.setText(charSequence);
        R0();
    }

    public void setPrefixTextAppearance(@b1 int i10) {
        y.E(this.f17523m0, i10);
    }

    public void setPrefixTextColor(@m0 ColorStateList colorStateList) {
        this.f17523m0.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.H0.setCheckable(z10);
    }

    public void setStartIconContentDescription(@a1 int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(@o0 CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.H0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@u int i10) {
        setStartIconDrawable(i10 != 0 ? g.a.d(getContext(), i10) : null);
    }

    public void setStartIconDrawable(@o0 Drawable drawable) {
        this.H0.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            l0();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(@o0 View.OnClickListener onClickListener) {
        t0(this.H0, onClickListener, this.O0);
    }

    public void setStartIconOnLongClickListener(@o0 View.OnLongClickListener onLongClickListener) {
        this.O0 = onLongClickListener;
        u0(this.H0, onLongClickListener);
    }

    public void setStartIconTintList(@o0 ColorStateList colorStateList) {
        if (this.I0 != colorStateList) {
            this.I0 = colorStateList;
            this.J0 = true;
            o();
        }
    }

    public void setStartIconTintMode(@o0 PorterDuff.Mode mode) {
        if (this.K0 != mode) {
            this.K0 = mode;
            this.L0 = true;
            o();
        }
    }

    public void setStartIconVisible(boolean z10) {
        if (c0() != z10) {
            this.H0.setVisibility(z10 ? 0 : 8);
            Q0();
            H0();
        }
    }

    public void setSuffixText(@o0 CharSequence charSequence) {
        this.f17525n0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f17527o0.setText(charSequence);
        U0();
    }

    public void setSuffixTextAppearance(@b1 int i10) {
        y.E(this.f17527o0, i10);
    }

    public void setSuffixTextColor(@m0 ColorStateList colorStateList) {
        this.f17527o0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@o0 e eVar) {
        EditText editText = this.S;
        if (editText != null) {
            w1.z1(editText, eVar);
        }
    }

    public void setTypeface(@o0 Typeface typeface) {
        if (typeface != this.G0) {
            this.G0 = typeface;
            this.f17534r1.o0(typeface);
            this.U.O(typeface);
            TextView textView = this.f17501b0;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(@m0 Rect rect, float f10) {
        return a0() ? (int) (((float) rect.centerY()) - (f10 / 2.0f)) : rect.top + this.S.getCompoundPaddingTop();
    }

    @m0
    public final Rect u(@m0 Rect rect) {
        if (this.S != null) {
            Rect rect2 = this.E0;
            float z10 = this.f17534r1.z();
            rect2.left = rect.left + this.S.getCompoundPaddingLeft();
            rect2.top = t(rect, z10);
            rect2.right = rect.right - this.S.getCompoundPaddingRight();
            rect2.bottom = s(rect, rect2, z10);
            return rect2;
        }
        throw new IllegalStateException();
    }

    public final int v() {
        float p10;
        if (!this.f17529p0) {
            return 0;
        }
        int i10 = this.f17543w0;
        if (i10 == 0 || i10 == 1) {
            p10 = this.f17534r1.p();
        } else if (i10 != 2) {
            return 0;
        } else {
            p10 = this.f17534r1.p() / 2.0f;
        }
        return (int) p10;
    }

    public void v0(@m0 TextView textView, @b1 int i10) {
        boolean z10 = true;
        try {
            y.E(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            y.E(textView, a.n.TextAppearance_AppCompat_Caption);
            textView.setTextColor(i0.d.f(getContext(), a.e.design_error));
        }
    }

    public final boolean w() {
        return this.f17543w0 == 2 && x();
    }

    public final boolean w0() {
        return (this.f17506d1.getVisibility() == 0 || ((L() && P()) || this.f17525n0 != null)) && this.Q.getMeasuredWidth() > 0;
    }

    public final boolean x() {
        return this.f17546y0 > -1 && this.B0 != 0;
    }

    public final boolean x0() {
        return !(getStartIconDrawable() == null && this.f17521l0 == null) && this.P.getMeasuredWidth() > 0;
    }

    public void y() {
        this.P0.clear();
    }

    public final boolean y0() {
        EditText editText = this.S;
        return (editText == null || this.f17535s0 == null || editText.getBackground() != null || this.f17543w0 == 0) ? false : true;
    }

    public void z() {
        this.T0.clear();
    }

    public final void z0() {
        TextView textView = this.f17511g0;
        if (textView != null && this.f17509f0) {
            textView.setText(this.f17507e0);
            this.f17511g0.setVisibility(0);
            this.f17511g0.bringToFront();
        }
    }
}
