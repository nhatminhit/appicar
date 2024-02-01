package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import d.m0;
import i9.a;
import w9.c;

public final class b {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final a f17012a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final a f17013b;
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final a f17014c;
    @m0

    /* renamed from: d  reason: collision with root package name */
    public final a f17015d;
    @m0

    /* renamed from: e  reason: collision with root package name */
    public final a f17016e;
    @m0

    /* renamed from: f  reason: collision with root package name */
    public final a f17017f;
    @m0

    /* renamed from: g  reason: collision with root package name */
    public final a f17018g;
    @m0

    /* renamed from: h  reason: collision with root package name */
    public final Paint f17019h;

    public b(@m0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(w9.b.f(context, a.c.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), a.o.MaterialCalendar);
        this.f17012a = a.a(context, obtainStyledAttributes.getResourceId(a.o.MaterialCalendar_dayStyle, 0));
        this.f17018g = a.a(context, obtainStyledAttributes.getResourceId(a.o.MaterialCalendar_dayInvalidStyle, 0));
        this.f17013b = a.a(context, obtainStyledAttributes.getResourceId(a.o.MaterialCalendar_daySelectedStyle, 0));
        this.f17014c = a.a(context, obtainStyledAttributes.getResourceId(a.o.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, a.o.MaterialCalendar_rangeFillColor);
        this.f17015d = a.a(context, obtainStyledAttributes.getResourceId(a.o.MaterialCalendar_yearStyle, 0));
        this.f17016e = a.a(context, obtainStyledAttributes.getResourceId(a.o.MaterialCalendar_yearSelectedStyle, 0));
        this.f17017f = a.a(context, obtainStyledAttributes.getResourceId(a.o.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f17019h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
