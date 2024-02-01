package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import d.m0;
import i9.a;

public class a extends e {

    /* renamed from: j  reason: collision with root package name */
    public static final int f17550j = 100;

    /* renamed from: k  reason: collision with root package name */
    public static final int f17551k = 150;

    /* renamed from: l  reason: collision with root package name */
    public static final float f17552l = 0.8f;

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f17553d = new C0284a();

    /* renamed from: e  reason: collision with root package name */
    public final View.OnFocusChangeListener f17554e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.h f17555f = new c();

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.i f17556g = new d();

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f17557h;

    /* renamed from: i  reason: collision with root package name */
    public ValueAnimator f17558i;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    public class C0284a implements TextWatcher {
        public C0284a() {
        }

        public void afterTextChanged(@m0 Editable editable) {
            if (a.this.f17590a.getSuffixText() == null) {
                a.this.i(a.l(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        public void onFocusChange(View view, boolean z10) {
            boolean z11 = true;
            boolean z12 = !TextUtils.isEmpty(((EditText) view).getText());
            a aVar = a.this;
            if (!z12 || !z10) {
                z11 = false;
            }
            aVar.i(z11);
        }
    }

    public class c implements TextInputLayout.h {
        public c() {
        }

        public void a(@m0 TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && a.l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(a.this.f17554e);
            editText.removeTextChangedListener(a.this.f17553d);
            editText.addTextChangedListener(a.this.f17553d);
        }
    }

    public class d implements TextInputLayout.i {

        /* renamed from: com.google.android.material.textfield.a$d$a  reason: collision with other inner class name */
        public class C0285a implements Runnable {
            public final /* synthetic */ EditText O;

            public C0285a(EditText editText) {
                this.O = editText;
            }

            public void run() {
                this.O.removeTextChangedListener(a.this.f17553d);
            }
        }

        public d() {
        }

        public void a(@m0 TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i10 == 2) {
                editText.post(new C0285a(editText));
                if (editText.getOnFocusChangeListener() == a.this.f17554e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        public void onClick(View view) {
            Editable text = a.this.f17590a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f17590a.i0();
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        public void onAnimationStart(Animator animator) {
            a.this.f17590a.setEndIconVisible(true);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        public void onAnimationEnd(Animator animator) {
            a.this.f17590a.setEndIconVisible(false);
        }
    }

    public class h implements ValueAnimator.AnimatorUpdateListener {
        public h() {
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            a.this.f17592c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {
        public i() {
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f17592c.setScaleX(floatValue);
            a.this.f17592c.setScaleY(floatValue);
        }
    }

    public a(@m0 TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public static boolean l(@m0 Editable editable) {
        return editable.length() > 0;
    }

    public void a() {
        this.f17590a.setEndIconDrawable(g.a.d(this.f17591b, a.g.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f17590a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(a.m.clear_text_end_icon_content_description));
        this.f17590a.setEndIconOnClickListener(new e());
        this.f17590a.e(this.f17555f);
        this.f17590a.f(this.f17556g);
        m();
    }

    public void c(boolean z10) {
        if (this.f17590a.getSuffixText() != null) {
            i(z10);
        }
    }

    public final void i(boolean z10) {
        boolean z11 = this.f17590a.P() == z10;
        if (z10 && !this.f17557h.isRunning()) {
            this.f17558i.cancel();
            this.f17557h.start();
            if (z11) {
                this.f17557h.end();
            }
        } else if (!z10) {
            this.f17557h.cancel();
            this.f17558i.start();
            if (z11) {
                this.f17558i.end();
            }
        }
    }

    public final ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(j9.a.f19828a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    public final ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(j9.a.f19831d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    public final void m() {
        ValueAnimator k10 = k();
        ValueAnimator j10 = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17557h = animatorSet;
        animatorSet.playTogether(new Animator[]{k10, j10});
        this.f17557h.addListener(new f());
        ValueAnimator j11 = j(1.0f, 0.0f);
        this.f17558i = j11;
        j11.addListener(new g());
    }
}
