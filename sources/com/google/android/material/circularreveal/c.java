package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.b;
import d.l;
import d.m0;
import d.o0;

public interface c extends b.a {

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f16942b = new b();

        /* renamed from: a  reason: collision with root package name */
        public final e f16943a = new e();

        @m0
        /* renamed from: a */
        public e evaluate(float f10, @m0 e eVar, @m0 e eVar2) {
            this.f16943a.b(u9.a.f(eVar.f16947a, eVar2.f16947a, f10), u9.a.f(eVar.f16948b, eVar2.f16948b, f10), u9.a.f(eVar.f16949c, eVar2.f16949c, f10));
            return this.f16943a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c  reason: collision with other inner class name */
    public static class C0278c extends Property<c, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, e> f16944a = new C0278c("circularReveal");

        public C0278c(String str) {
            super(e.class, str);
        }

        @o0
        /* renamed from: a */
        public e get(@m0 c cVar) {
            return cVar.getRevealInfo();
        }

        /* renamed from: b */
        public void set(@m0 c cVar, @o0 e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    public static class d extends Property<c, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, Integer> f16945a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @m0
        /* renamed from: a */
        public Integer get(@m0 c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(@m0 c cVar, @m0 Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* renamed from: d  reason: collision with root package name */
        public static final float f16946d = Float.MAX_VALUE;

        /* renamed from: a  reason: collision with root package name */
        public float f16947a;

        /* renamed from: b  reason: collision with root package name */
        public float f16948b;

        /* renamed from: c  reason: collision with root package name */
        public float f16949c;

        public e() {
        }

        public e(float f10, float f11, float f12) {
            this.f16947a = f10;
            this.f16948b = f11;
            this.f16949c = f12;
        }

        public e(@m0 e eVar) {
            this(eVar.f16947a, eVar.f16948b, eVar.f16949c);
        }

        public boolean a() {
            return this.f16949c == Float.MAX_VALUE;
        }

        public void b(float f10, float f11, float f12) {
            this.f16947a = f10;
            this.f16948b = f11;
            this.f16949c = f12;
        }

        public void c(@m0 e eVar) {
            b(eVar.f16947a, eVar.f16948b, eVar.f16949c);
        }
    }

    void a();

    void b();

    void draw(Canvas canvas);

    @o0
    Drawable getCircularRevealOverlayDrawable();

    @l
    int getCircularRevealScrimColor();

    @o0
    e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@o0 Drawable drawable);

    void setCircularRevealScrimColor(@l int i10);

    void setRevealInfo(@o0 e eVar);
}
