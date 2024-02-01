package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.y;
import d.b1;
import d.l;
import d.m0;
import d.o0;
import d.p;
import f1.w1;
import i9.a;
import j9.b;
import java.util.ArrayList;
import java.util.List;
import w9.c;

public final class f {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final int f17593v = 217;

    /* renamed from: w  reason: collision with root package name */
    public static final int f17594w = 167;

    /* renamed from: x  reason: collision with root package name */
    public static final int f17595x = 0;

    /* renamed from: y  reason: collision with root package name */
    public static final int f17596y = 1;

    /* renamed from: z  reason: collision with root package name */
    public static final int f17597z = 2;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17598a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f17599b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f17600c;

    /* renamed from: d  reason: collision with root package name */
    public int f17601d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f17602e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public Animator f17603f;

    /* renamed from: g  reason: collision with root package name */
    public final float f17604g;

    /* renamed from: h  reason: collision with root package name */
    public int f17605h;

    /* renamed from: i  reason: collision with root package name */
    public int f17606i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f17607j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f17608k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public TextView f17609l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f17610m;

    /* renamed from: n  reason: collision with root package name */
    public int f17611n;
    @o0

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f17612o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f17613p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f17614q;
    @o0

    /* renamed from: r  reason: collision with root package name */
    public TextView f17615r;

    /* renamed from: s  reason: collision with root package name */
    public int f17616s;
    @o0

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f17617t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f17618u;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17619a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f17620b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f17621c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f17622d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f17619a = i10;
            this.f17620b = textView;
            this.f17621c = i11;
            this.f17622d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = f.this.f17605h = this.f17619a;
            Animator unused2 = f.this.f17603f = null;
            TextView textView = this.f17620b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f17621c == 1 && f.this.f17609l != null) {
                    f.this.f17609l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f17622d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f17622d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f17622d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(@m0 TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f17598a = context;
        this.f17599b = textInputLayout;
        this.f17604g = (float) context.getResources().getDimensionPixelSize(a.f.design_textinput_caption_translate_y);
    }

    public final boolean A(int i10) {
        return i10 == 2 && this.f17615r != null && !TextUtils.isEmpty(this.f17613p);
    }

    public boolean B(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public boolean C() {
        return this.f17608k;
    }

    public boolean D() {
        return this.f17614q;
    }

    public void E(TextView textView, int i10) {
        ViewGroup viewGroup;
        if (this.f17600c != null) {
            if (!B(i10) || (viewGroup = this.f17602e) == null) {
                viewGroup = this.f17600c;
            }
            viewGroup.removeView(textView);
            int i11 = this.f17601d - 1;
            this.f17601d = i11;
            P(this.f17600c, i11);
        }
    }

    public final void F(int i10, int i11) {
        TextView m10;
        TextView m11;
        if (i10 != i11) {
            if (!(i11 == 0 || (m11 = m(i11)) == null)) {
                m11.setVisibility(0);
                m11.setAlpha(1.0f);
            }
            if (!(i10 == 0 || (m10 = m(i10)) == null)) {
                m10.setVisibility(4);
                if (i10 == 1) {
                    m10.setText((CharSequence) null);
                }
            }
            this.f17605h = i11;
        }
    }

    public void G(@o0 CharSequence charSequence) {
        this.f17610m = charSequence;
        TextView textView = this.f17609l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void H(boolean z10) {
        if (this.f17608k != z10) {
            g();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f17598a);
                this.f17609l = appCompatTextView;
                appCompatTextView.setId(a.h.textinput_error);
                this.f17609l.setTextAlignment(5);
                Typeface typeface = this.f17618u;
                if (typeface != null) {
                    this.f17609l.setTypeface(typeface);
                }
                I(this.f17611n);
                J(this.f17612o);
                G(this.f17610m);
                this.f17609l.setVisibility(4);
                w1.B1(this.f17609l, 1);
                d(this.f17609l, 0);
            } else {
                x();
                E(this.f17609l, 0);
                this.f17609l = null;
                this.f17599b.I0();
                this.f17599b.V0();
            }
            this.f17608k = z10;
        }
    }

    public void I(@b1 int i10) {
        this.f17611n = i10;
        TextView textView = this.f17609l;
        if (textView != null) {
            this.f17599b.v0(textView, i10);
        }
    }

    public void J(@o0 ColorStateList colorStateList) {
        this.f17612o = colorStateList;
        TextView textView = this.f17609l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void K(@b1 int i10) {
        this.f17616s = i10;
        TextView textView = this.f17615r;
        if (textView != null) {
            y.E(textView, i10);
        }
    }

    public void L(boolean z10) {
        if (this.f17614q != z10) {
            g();
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f17598a);
                this.f17615r = appCompatTextView;
                appCompatTextView.setId(a.h.textinput_helper_text);
                this.f17615r.setTextAlignment(5);
                Typeface typeface = this.f17618u;
                if (typeface != null) {
                    this.f17615r.setTypeface(typeface);
                }
                this.f17615r.setVisibility(4);
                w1.B1(this.f17615r, 1);
                K(this.f17616s);
                M(this.f17617t);
                d(this.f17615r, 1);
            } else {
                y();
                E(this.f17615r, 1);
                this.f17615r = null;
                this.f17599b.I0();
                this.f17599b.V0();
            }
            this.f17614q = z10;
        }
    }

    public void M(@o0 ColorStateList colorStateList) {
        this.f17617t = colorStateList;
        TextView textView = this.f17615r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void N(@o0 TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void O(Typeface typeface) {
        if (typeface != this.f17618u) {
            this.f17618u = typeface;
            N(this.f17609l, typeface);
            N(this.f17615r, typeface);
        }
    }

    public final void P(@m0 ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean Q(@o0 TextView textView, @o0 CharSequence charSequence) {
        return w1.T0(this.f17599b) && this.f17599b.isEnabled() && (this.f17606i != this.f17605h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public void R(CharSequence charSequence) {
        g();
        this.f17607j = charSequence;
        this.f17609l.setText(charSequence);
        int i10 = this.f17605h;
        if (i10 != 1) {
            this.f17606i = 1;
        }
        T(i10, this.f17606i, Q(this.f17609l, charSequence));
    }

    public void S(CharSequence charSequence) {
        g();
        this.f17613p = charSequence;
        this.f17615r.setText(charSequence);
        int i10 = this.f17605h;
        if (i10 != 2) {
            this.f17606i = 2;
        }
        T(i10, this.f17606i, Q(this.f17615r, charSequence));
    }

    public final void T(int i10, int i11, boolean z10) {
        boolean z11 = z10;
        if (i10 != i11) {
            if (z11) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f17603f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i12 = i10;
                int i13 = i11;
                h(arrayList2, this.f17614q, this.f17615r, 2, i12, i13);
                h(arrayList2, this.f17608k, this.f17609l, 1, i12, i13);
                b.a(animatorSet, arrayList);
                animatorSet.addListener(new a(i11, m(i10), i10, m(i11)));
                animatorSet.start();
            } else {
                F(i10, i11);
            }
            this.f17599b.I0();
            this.f17599b.L0(z11);
            this.f17599b.V0();
        }
    }

    public void d(TextView textView, int i10) {
        if (this.f17600c == null && this.f17602e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f17598a);
            this.f17600c = linearLayout;
            linearLayout.setOrientation(0);
            this.f17599b.addView(this.f17600c, -1, -2);
            this.f17602e = new FrameLayout(this.f17598a);
            this.f17600c.addView(this.f17602e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f17599b.getEditText() != null) {
                e();
            }
        }
        if (B(i10)) {
            this.f17602e.setVisibility(0);
            this.f17602e.addView(textView);
        } else {
            this.f17600c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f17600c.setVisibility(0);
        this.f17601d++;
    }

    public void e() {
        if (f()) {
            EditText editText = this.f17599b.getEditText();
            boolean g10 = c.g(this.f17598a);
            LinearLayout linearLayout = this.f17600c;
            int i10 = a.f.material_helper_text_font_1_3_padding_horizontal;
            w1.b2(linearLayout, u(g10, i10, w1.j0(editText)), u(g10, a.f.material_helper_text_font_1_3_padding_top, this.f17598a.getResources().getDimensionPixelSize(a.f.material_helper_text_default_padding_top)), u(g10, i10, w1.i0(editText)), 0);
        }
    }

    public final boolean f() {
        return (this.f17600c == null || this.f17599b.getEditText() == null) ? false : true;
    }

    public void g() {
        Animator animator = this.f17603f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void h(@m0 List<Animator> list, boolean z10, @o0 TextView textView, int i10, int i11, int i12) {
        if (textView != null && z10) {
            if (i10 == i12 || i10 == i11) {
                list.add(i(textView, i12 == i10));
                if (i12 == i10) {
                    list.add(j(textView));
                }
            }
        }
    }

    public final ObjectAnimator i(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z10 ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(j9.a.f19828a);
        return ofFloat;
    }

    public final ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f17604g, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(j9.a.f19831d);
        return ofFloat;
    }

    public boolean k() {
        return z(this.f17605h);
    }

    public boolean l() {
        return z(this.f17606i);
    }

    @o0
    public final TextView m(int i10) {
        if (i10 == 1) {
            return this.f17609l;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f17615r;
    }

    @o0
    public CharSequence n() {
        return this.f17610m;
    }

    @o0
    public CharSequence o() {
        return this.f17607j;
    }

    @l
    public int p() {
        TextView textView = this.f17609l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @o0
    public ColorStateList q() {
        TextView textView = this.f17609l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence r() {
        return this.f17613p;
    }

    @o0
    public ColorStateList s() {
        TextView textView = this.f17615r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @l
    public int t() {
        TextView textView = this.f17615r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int u(boolean z10, @p int i10, int i11) {
        return z10 ? this.f17598a.getResources().getDimensionPixelSize(i10) : i11;
    }

    public boolean v() {
        return A(this.f17605h);
    }

    public boolean w() {
        return A(this.f17606i);
    }

    public void x() {
        this.f17607j = null;
        g();
        if (this.f17605h == 1) {
            this.f17606i = (!this.f17614q || TextUtils.isEmpty(this.f17613p)) ? 0 : 2;
        }
        T(this.f17605h, this.f17606i, Q(this.f17609l, (CharSequence) null));
    }

    public void y() {
        g();
        int i10 = this.f17605h;
        if (i10 == 2) {
            this.f17606i = 0;
        }
        T(i10, this.f17606i, Q(this.f17615r, (CharSequence) null));
    }

    public final boolean z(int i10) {
        return i10 == 1 && this.f17609l != null && !TextUtils.isEmpty(this.f17607j);
    }
}
