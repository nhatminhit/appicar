package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.m;
import com.google.android.material.textfield.TextInputLayout;
import d.m0;
import d.o0;
import f1.w1;
import g1.z;
import i9.a;
import z9.o;

public class d extends e {

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f17568q = true;

    /* renamed from: r  reason: collision with root package name */
    public static final int f17569r = 50;

    /* renamed from: s  reason: collision with root package name */
    public static final int f17570s = 67;

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f17571d = new a();

    /* renamed from: e  reason: collision with root package name */
    public final View.OnFocusChangeListener f17572e = new c();

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.e f17573f = new C0287d(this.f17590a);

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.h f17574g = new e();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.i f17575h = new f();

    /* renamed from: i  reason: collision with root package name */
    public boolean f17576i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f17577j = false;

    /* renamed from: k  reason: collision with root package name */
    public long f17578k = Long.MAX_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public StateListDrawable f17579l;

    /* renamed from: m  reason: collision with root package name */
    public z9.j f17580m;
    @o0

    /* renamed from: n  reason: collision with root package name */
    public AccessibilityManager f17581n;

    /* renamed from: o  reason: collision with root package name */
    public ValueAnimator f17582o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f17583p;

    public class a extends m {

        /* renamed from: com.google.android.material.textfield.d$a$a  reason: collision with other inner class name */
        public class C0286a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView O;

            public C0286a(AutoCompleteTextView autoCompleteTextView) {
                this.O = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.O.isPopupShowing();
                d.this.E(isPopupShowing);
                boolean unused = d.this.f17576i = isPopupShowing;
            }
        }

        public a() {
        }

        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView e10 = d.y(d.this.f17590a.getEditText());
            if (d.this.f17581n.isTouchExplorationEnabled() && d.D(e10) && !d.this.f17592c.hasFocus()) {
                e10.dismissDropDown();
            }
            e10.post(new C0286a(e10));
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            d.this.f17592c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        public void onFocusChange(View view, boolean z10) {
            d.this.f17590a.setEndIconActivated(z10);
            if (!z10) {
                d.this.E(false);
                boolean unused = d.this.f17576i = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d  reason: collision with other inner class name */
    public class C0287d extends TextInputLayout.e {
        public C0287d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public void g(View view, @m0 z zVar) {
            super.g(view, zVar);
            if (!d.D(d.this.f17590a.getEditText())) {
                zVar.U0(Spinner.class.getName());
            }
            if (zVar.y0()) {
                zVar.j1((CharSequence) null);
            }
        }

        public void h(View view, @m0 AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView e10 = d.y(d.this.f17590a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.f17581n.isTouchExplorationEnabled() && !d.D(d.this.f17590a.getEditText())) {
                d.this.H(e10);
            }
        }
    }

    public class e implements TextInputLayout.h {
        public e() {
        }

        public void a(@m0 TextInputLayout textInputLayout) {
            AutoCompleteTextView e10 = d.y(textInputLayout.getEditText());
            d.this.F(e10);
            d.this.v(e10);
            d.this.G(e10);
            e10.setThreshold(0);
            e10.removeTextChangedListener(d.this.f17571d);
            e10.addTextChangedListener(d.this.f17571d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!d.D(e10)) {
                w1.P1(d.this.f17592c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f17573f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    public class f implements TextInputLayout.i {

        public class a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView O;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.O = autoCompleteTextView;
            }

            public void run() {
                this.O.removeTextChangedListener(d.this.f17571d);
            }
        }

        public f() {
        }

        public void a(@m0 TextInputLayout textInputLayout, int i10) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i10 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f17572e) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (d.f17568q) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        public void onClick(View view) {
            d.this.H((AutoCompleteTextView) d.this.f17590a.getEditText());
        }
    }

    public class h implements View.OnTouchListener {
        public final /* synthetic */ AutoCompleteTextView O;

        public h(AutoCompleteTextView autoCompleteTextView) {
            this.O = autoCompleteTextView;
        }

        public boolean onTouch(@m0 View view, @m0 MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.C()) {
                    boolean unused = d.this.f17576i = false;
                }
                d.this.H(this.O);
            }
            return false;
        }
    }

    public class i implements AutoCompleteTextView.OnDismissListener {
        public i() {
        }

        public void onDismiss() {
            boolean unused = d.this.f17576i = true;
            long unused2 = d.this.f17578k = System.currentTimeMillis();
            d.this.E(false);
        }
    }

    public class j extends AnimatorListenerAdapter {
        public j() {
        }

        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f17592c.setChecked(dVar.f17577j);
            d.this.f17583p.start();
        }
    }

    public d(@m0 TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public static boolean D(@m0 EditText editText) {
        return editText.getKeyListener() != null;
    }

    @m0
    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final z9.j A(float f10, float f11, float f12, int i10) {
        o m10 = o.a().K(f10).P(f10).x(f11).C(f11).m();
        z9.j n10 = z9.j.n(this.f17591b, f12);
        n10.setShapeAppearanceModel(m10);
        n10.p0(0, i10, 0, i10);
        return n10;
    }

    public final void B() {
        this.f17583p = z(67, 0.0f, 1.0f);
        ValueAnimator z10 = z(50, 1.0f, 0.0f);
        this.f17582o = z10;
        z10.addListener(new j());
    }

    public final boolean C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f17578k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public final void E(boolean z10) {
        if (this.f17577j != z10) {
            this.f17577j = z10;
            this.f17583p.cancel();
            this.f17582o.start();
        }
    }

    public final void F(@m0 AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f17568q) {
            int boxBackgroundMode = this.f17590a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f17580m;
            } else if (boxBackgroundMode == 1) {
                drawable = this.f17579l;
            } else {
                return;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void G(@m0 AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f17572e);
        if (f17568q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    public final void H(@o0 AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (C()) {
                this.f17576i = false;
            }
            if (!this.f17576i) {
                if (f17568q) {
                    E(!this.f17577j);
                } else {
                    this.f17577j = !this.f17577j;
                    this.f17592c.toggle();
                }
                if (this.f17577j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f17576i = false;
        }
    }

    public void a() {
        float dimensionPixelOffset = (float) this.f17591b.getResources().getDimensionPixelOffset(a.f.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f17591b.getResources().getDimensionPixelOffset(a.f.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f17591b.getResources().getDimensionPixelOffset(a.f.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        z9.j A = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        z9.j A2 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f17580m = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f17579l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A);
        this.f17579l.addState(new int[0], A2);
        this.f17590a.setEndIconDrawable(g.a.d(this.f17591b, f17568q ? a.g.mtrl_dropdown_arrow : a.g.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f17590a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(a.m.exposed_dropdown_menu_content_description));
        this.f17590a.setEndIconOnClickListener(new g());
        this.f17590a.e(this.f17574g);
        this.f17590a.f(this.f17575h);
        B();
        this.f17581n = (AccessibilityManager) this.f17591b.getSystemService("accessibility");
    }

    public boolean b(int i10) {
        return i10 != 0;
    }

    public boolean d() {
        return true;
    }

    public final void v(@m0 AutoCompleteTextView autoCompleteTextView) {
        if (!D(autoCompleteTextView)) {
            int boxBackgroundMode = this.f17590a.getBoxBackgroundMode();
            z9.j boxBackground = this.f17590a.getBoxBackground();
            int d10 = o9.a.d(autoCompleteTextView, a.c.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                x(autoCompleteTextView, d10, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                w(autoCompleteTextView, d10, iArr, boxBackground);
            }
        }
    }

    public final void w(@m0 AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, @m0 z9.j jVar) {
        int boxBackgroundColor = this.f17590a.getBoxBackgroundColor();
        int[] iArr2 = {o9.a.g(i10, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f17568q) {
            w1.G1(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), jVar, jVar));
            return;
        }
        z9.j jVar2 = new z9.j(jVar.getShapeAppearanceModel());
        jVar2.n0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar, jVar2});
        int j02 = w1.j0(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int i02 = w1.i0(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        w1.G1(autoCompleteTextView, layerDrawable);
        w1.b2(autoCompleteTextView, j02, paddingTop, i02, paddingBottom);
    }

    public final void x(@m0 AutoCompleteTextView autoCompleteTextView, int i10, int[][] iArr, @m0 z9.j jVar) {
        LayerDrawable layerDrawable;
        int d10 = o9.a.d(autoCompleteTextView, a.c.colorSurface);
        z9.j jVar2 = new z9.j(jVar.getShapeAppearanceModel());
        int g10 = o9.a.g(i10, d10, 0.1f);
        jVar2.n0(new ColorStateList(iArr, new int[]{g10, 0}));
        if (f17568q) {
            jVar2.setTint(d10);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{g10, d10});
            z9.j jVar3 = new z9.j(jVar.getShapeAppearanceModel());
            jVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar2, jVar3), jVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar});
        }
        w1.G1(autoCompleteTextView, layerDrawable);
    }

    public final ValueAnimator z(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(j9.a.f19828a);
        ofFloat.setDuration((long) i10);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }
}
