package v9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import d.g1;
import d.m0;
import d.o0;
import j3.b;
import java.util.Arrays;

public final class l extends i<ObjectAnimator> {

    /* renamed from: j  reason: collision with root package name */
    public static final int f23490j = 667;

    /* renamed from: k  reason: collision with root package name */
    public static final int f23491k = 333;

    /* renamed from: l  reason: collision with root package name */
    public static final Property<l, Float> f23492l = new b(Float.class, "animationFraction");

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f23493d;

    /* renamed from: e  reason: collision with root package name */
    public z1.b f23494e;

    /* renamed from: f  reason: collision with root package name */
    public final b f23495f;

    /* renamed from: g  reason: collision with root package name */
    public int f23496g = 1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f23497h;

    /* renamed from: i  reason: collision with root package name */
    public float f23498i;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            l lVar = l.this;
            int unused = lVar.f23496g = (lVar.f23496g + 1) % l.this.f23495f.f23430c.length;
            boolean unused2 = l.this.f23497h = true;
        }
    }

    public static class b extends Property<l, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(l lVar) {
            return Float.valueOf(lVar.n());
        }

        /* renamed from: b */
        public void set(l lVar, Float f10) {
            lVar.r(f10.floatValue());
        }
    }

    public l(@m0 n nVar) {
        super(3);
        this.f23495f = nVar;
        this.f23494e = new z1.b();
    }

    public void a() {
        ObjectAnimator objectAnimator = this.f23493d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void c() {
        q();
    }

    public void d(@o0 b.a aVar) {
    }

    public void f() {
    }

    public void g() {
        o();
        q();
        this.f23493d.start();
    }

    public void h() {
    }

    public final float n() {
        return this.f23498i;
    }

    public final void o() {
        if (this.f23493d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f23492l, new float[]{0.0f, 1.0f});
            this.f23493d = ofFloat;
            ofFloat.setDuration(333);
            this.f23493d.setInterpolator((TimeInterpolator) null);
            this.f23493d.setRepeatCount(-1);
            this.f23493d.addListener(new a());
        }
    }

    public final void p() {
        if (this.f23497h && this.f23483b[3] < 1.0f) {
            int[] iArr = this.f23484c;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = o9.a.a(this.f23495f.f23430c[this.f23496g], this.f23482a.getAlpha());
            this.f23497h = false;
        }
    }

    @g1
    public void q() {
        this.f23497h = true;
        this.f23496g = 1;
        Arrays.fill(this.f23484c, o9.a.a(this.f23495f.f23430c[0], this.f23482a.getAlpha()));
    }

    @g1
    public void r(float f10) {
        this.f23498i = f10;
        s((int) (f10 * 333.0f));
        p();
        this.f23482a.invalidateSelf();
    }

    public final void s(int i10) {
        this.f23483b[0] = 0.0f;
        float b10 = b(i10, 0, 667);
        float[] fArr = this.f23483b;
        float interpolation = this.f23494e.getInterpolation(b10);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f23483b;
        float interpolation2 = this.f23494e.getInterpolation(b10 + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f23483b[5] = 1.0f;
    }
}
