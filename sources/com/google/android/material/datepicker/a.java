package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import d.b1;
import d.m0;
import e1.n;
import f1.w1;
import i9.a;
import w9.c;
import z9.j;
import z9.o;

public final class a {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final Rect f17006a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f17007b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f17008c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f17009d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17010e;

    /* renamed from: f  reason: collision with root package name */
    public final o f17011f;

    public a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, o oVar, @m0 Rect rect) {
        n.d(rect.left);
        n.d(rect.top);
        n.d(rect.right);
        n.d(rect.bottom);
        this.f17006a = rect;
        this.f17007b = colorStateList2;
        this.f17008c = colorStateList;
        this.f17009d = colorStateList3;
        this.f17010e = i10;
        this.f17011f = oVar;
    }

    @m0
    public static a a(@m0 Context context, @b1 int i10) {
        n.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, a.o.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(a.o.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(a.o.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, a.o.MaterialCalendarItem_itemFillColor);
        ColorStateList a11 = c.a(context, obtainStyledAttributes, a.o.MaterialCalendarItem_itemTextColor);
        ColorStateList a12 = c.a(context, obtainStyledAttributes, a.o.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.o.MaterialCalendarItem_itemStrokeWidth, 0);
        o m10 = o.b(context, obtainStyledAttributes.getResourceId(a.o.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(a.o.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m();
        obtainStyledAttributes.recycle();
        return new a(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    public int b() {
        return this.f17006a.bottom;
    }

    public int c() {
        return this.f17006a.left;
    }

    public int d() {
        return this.f17006a.right;
    }

    public int e() {
        return this.f17006a.top;
    }

    public void f(@m0 TextView textView) {
        j jVar = new j();
        j jVar2 = new j();
        jVar.setShapeAppearanceModel(this.f17011f);
        jVar2.setShapeAppearanceModel(this.f17011f);
        jVar.n0(this.f17008c);
        jVar.D0((float) this.f17010e, this.f17009d);
        textView.setTextColor(this.f17007b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f17007b.withAlpha(30), jVar, jVar2);
        Rect rect = this.f17006a;
        w1.G1(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
