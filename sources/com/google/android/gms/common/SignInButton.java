package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c8.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import d.m0;
import d.o0;
import j8.b1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import z8.h;

public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 0;
    public static final int W = 1;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f5625a0 = 2;
    public int O;
    public int P;
    public View Q;
    @o0
    public View.OnClickListener R;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public SignInButton(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public SignInButton(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.R = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.f.SignInButton, 0, 0);
        try {
            this.O = obtainStyledAttributes.getInt(a.f.SignInButton_buttonSize, 0);
            this.P = obtainStyledAttributes.getInt(a.f.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            a(this.O, this.P);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void a(int i10, int i11) {
        this.O = i10;
        this.P = i11;
        c(getContext());
    }

    @Deprecated
    public void b(int i10, int i11, @m0 Scope[] scopeArr) {
        a(i10, i11);
    }

    public final void c(Context context) {
        View view = this.Q;
        if (view != null) {
            removeView(view);
        }
        try {
            this.Q = b1.c(context, this.O, this.P);
        } catch (h.a unused) {
            int i10 = this.O;
            int i11 = this.P;
            zaaa zaaa = new zaaa(context, (AttributeSet) null);
            zaaa.a(context.getResources(), i10, i11);
            this.Q = zaaa;
        }
        addView(this.Q);
        this.Q.setEnabled(isEnabled());
        this.Q.setOnClickListener(this);
    }

    public void onClick(@m0 View view) {
        View.OnClickListener onClickListener = this.R;
        if (onClickListener != null && view == this.Q) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i10) {
        a(this.O, i10);
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.Q.setEnabled(z10);
    }

    public void setOnClickListener(@o0 View.OnClickListener onClickListener) {
        this.R = onClickListener;
        View view = this.Q;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@m0 Scope[] scopeArr) {
        a(this.O, this.P);
    }

    public void setSize(int i10) {
        a(i10, this.P);
    }
}
