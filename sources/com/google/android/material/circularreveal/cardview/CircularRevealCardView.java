package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;
import d.l;
import d.m0;
import d.o0;

public class CircularRevealCardView extends MaterialCardView implements c {
    @m0

    /* renamed from: l0  reason: collision with root package name */
    public final b f16950l0;

    public CircularRevealCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16950l0 = new b(this);
    }

    public void a() {
        this.f16950l0.a();
    }

    public void b() {
        this.f16950l0.b();
    }

    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        b bVar = this.f16950l0;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @o0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f16950l0.g();
    }

    public int getCircularRevealScrimColor() {
        return this.f16950l0.h();
    }

    @o0
    public c.e getRevealInfo() {
        return this.f16950l0.j();
    }

    public boolean isOpaque() {
        b bVar = this.f16950l0;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(@o0 Drawable drawable) {
        this.f16950l0.m(drawable);
    }

    public void setCircularRevealScrimColor(@l int i10) {
        this.f16950l0.n(i10);
    }

    public void setRevealInfo(@o0 c.e eVar) {
        this.f16950l0.o(eVar);
    }
}
