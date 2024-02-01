package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import f.a;
import f1.s2;
import f1.t2;
import f1.w1;

public abstract class a extends ViewGroup {
    public static final int W = 200;
    public final b O;
    public final Context P;
    public ActionMenuView Q;
    public ActionMenuPresenter R;
    public int S;
    public s2 T;
    public boolean U;
    public boolean V;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    public class C0022a implements Runnable {
        public C0022a() {
        }

        public void run() {
            a.this.o();
        }
    }

    public class b implements t2 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1219a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1220b;

        public b() {
        }

        public void a(View view) {
            this.f1219a = true;
        }

        public void b(View view) {
            if (!this.f1219a) {
                a aVar = a.this;
                aVar.T = null;
                a.super.setVisibility(this.f1220b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.f1219a = false;
        }

        public b d(s2 s2Var, int i10) {
            a.this.T = s2Var;
            this.f1220b = i10;
            return this;
        }
    }

    public a(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public a(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.O = new b();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.c.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.P = context;
        } else {
            this.P = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int k(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    public void c(int i10) {
        n(i10, 200).w();
    }

    public boolean d() {
        return i() && getVisibility() == 0;
    }

    public void e() {
        ActionMenuPresenter actionMenuPresenter = this.R;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
    }

    public boolean f() {
        ActionMenuPresenter actionMenuPresenter = this.R;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.E();
        }
        return false;
    }

    public boolean g() {
        ActionMenuPresenter actionMenuPresenter = this.R;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.G();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.T != null ? this.O.f1220b : getVisibility();
    }

    public int getContentHeight() {
        return this.S;
    }

    public boolean h() {
        ActionMenuPresenter actionMenuPresenter = this.R;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.H();
        }
        return false;
    }

    public boolean i() {
        ActionMenuPresenter actionMenuPresenter = this.R;
        return actionMenuPresenter != null && actionMenuPresenter.I();
    }

    public int j(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public int l(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public void m() {
        post(new C0022a());
    }

    public s2 n(int i10, long j10) {
        s2 a10;
        s2 s2Var = this.T;
        if (s2Var != null) {
            s2Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            a10 = w1.f(this).a(1.0f);
        } else {
            a10 = w1.f(this).a(0.0f);
        }
        a10.q(j10);
        a10.s(this.O.d(a10, i10));
        return a10;
    }

    public boolean o() {
        ActionMenuPresenter actionMenuPresenter = this.R;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.Q();
        }
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, a.n.ActionBar, a.c.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(a.n.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.R;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.J(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.V = false;
        }
        if (!this.V) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.V = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.V = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.U = false;
        }
        if (!this.U) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.U = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.U = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.S = i10;
        requestLayout();
    }

    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            s2 s2Var = this.T;
            if (s2Var != null) {
                s2Var.c();
            }
            super.setVisibility(i10);
        }
    }
}
