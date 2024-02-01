package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import d.f1;
import d.m0;
import d.o0;

public class ContentLoadingProgressBar extends ProgressBar {
    public static final int U = 500;
    public static final int V = 500;
    public long O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final Runnable S;
    public final Runnable T;

    public ContentLoadingProgressBar(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public ContentLoadingProgressBar(@m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.O = -1;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = new g(this);
        this.T = new h(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.P = false;
        this.O = -1;
        setVisibility(8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.Q = false;
        if (!this.R) {
            this.O = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    public void e() {
        post(new f(this));
    }

    @f1
    public final void f() {
        this.R = true;
        removeCallbacks(this.T);
        this.Q = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.O;
        long j11 = currentTimeMillis - j10;
        if (j11 >= 500 || j10 == -1) {
            setVisibility(8);
        } else if (!this.P) {
            postDelayed(this.S, 500 - j11);
            this.P = true;
        }
    }

    public final void i() {
        removeCallbacks(this.S);
        removeCallbacks(this.T);
    }

    public void j() {
        post(new e(this));
    }

    @f1
    public final void k() {
        this.O = -1;
        this.R = false;
        removeCallbacks(this.S);
        this.P = false;
        if (!this.Q) {
            postDelayed(this.T, 500);
            this.Q = true;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }
}
