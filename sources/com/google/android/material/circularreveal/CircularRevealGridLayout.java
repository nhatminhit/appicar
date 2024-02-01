package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import com.google.android.material.circularreveal.c;
import d.l;
import d.m0;
import d.o0;

public class CircularRevealGridLayout extends GridLayout implements c {
    @m0
    public final b O;

    public CircularRevealGridLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircularRevealGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O = new b(this);
    }

    public void a() {
        this.O.a();
    }

    public void b() {
        this.O.b();
    }

    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean d() {
        return super.isOpaque();
    }

    public void draw(@m0 Canvas canvas) {
        b bVar = this.O;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @o0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.O.g();
    }

    public int getCircularRevealScrimColor() {
        return this.O.h();
    }

    @o0
    public c.e getRevealInfo() {
        return this.O.j();
    }

    public boolean isOpaque() {
        b bVar = this.O;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(@o0 Drawable drawable) {
        this.O.m(drawable);
    }

    public void setCircularRevealScrimColor(@l int i10) {
        this.O.n(i10);
    }

    public void setRevealInfo(@o0 c.e eVar) {
        this.O.o(eVar);
    }
}
