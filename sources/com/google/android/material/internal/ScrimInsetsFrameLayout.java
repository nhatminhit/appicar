package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import d.m0;
import d.o0;
import d.x0;
import f1.e3;
import f1.p0;
import f1.w1;
import i9.a;

@x0({x0.a.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {
    @o0
    public Drawable O;
    public Rect P;
    public Rect Q;
    public boolean R;
    public boolean S;

    public class a implements p0 {
        public a() {
        }

        public e3 a(View view, @m0 e3 e3Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.P == null) {
                scrimInsetsFrameLayout.P = new Rect();
            }
            ScrimInsetsFrameLayout.this.P.set(e3Var.p(), e3Var.r(), e3Var.q(), e3Var.o());
            ScrimInsetsFrameLayout.this.a(e3Var);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!e3Var.w() || ScrimInsetsFrameLayout.this.O == null);
            w1.l1(ScrimInsetsFrameLayout.this);
            return e3Var.c();
        }
    }

    public ScrimInsetsFrameLayout(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public ScrimInsetsFrameLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Q = new Rect();
        this.R = true;
        this.S = true;
        TypedArray j10 = n.j(context, attributeSet, a.o.ScrimInsetsFrameLayout, i10, a.n.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.O = j10.getDrawable(a.o.ScrimInsetsFrameLayout_insetForeground);
        j10.recycle();
        setWillNotDraw(true);
        w1.Y1(this, new a());
    }

    public void a(e3 e3Var) {
    }

    public void draw(@m0 Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.P != null && this.O != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.R) {
                this.Q.set(0, 0, width, this.P.top);
                this.O.setBounds(this.Q);
                this.O.draw(canvas);
            }
            if (this.S) {
                this.Q.set(0, height - this.P.bottom, width, height);
                this.O.setBounds(this.Q);
                this.O.draw(canvas);
            }
            Rect rect = this.Q;
            Rect rect2 = this.P;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.O.setBounds(this.Q);
            this.O.draw(canvas);
            Rect rect3 = this.Q;
            Rect rect4 = this.P;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.O.setBounds(this.Q);
            this.O.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.S = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.R = z10;
    }

    public void setScrimInsetForeground(@o0 Drawable drawable) {
        this.O = drawable;
    }
}
