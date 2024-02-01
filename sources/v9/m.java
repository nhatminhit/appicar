package v9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import d.g1;
import d.m0;
import i9.a;
import j3.b;
import j3.d;
import java.util.Arrays;

public final class m extends i<ObjectAnimator> {

    /* renamed from: l  reason: collision with root package name */
    public static final int f23500l = 1800;

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f23501m = {533, p3.a.Z0, 850, 750};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f23502n = {1267, 1000, 333, 0};

    /* renamed from: o  reason: collision with root package name */
    public static final Property<m, Float> f23503o = new b(Float.class, "animationFraction");

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f23504d;

    /* renamed from: e  reason: collision with root package name */
    public final Interpolator[] f23505e;

    /* renamed from: f  reason: collision with root package name */
    public final b f23506f;

    /* renamed from: g  reason: collision with root package name */
    public int f23507g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f23508h;

    /* renamed from: i  reason: collision with root package name */
    public float f23509i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f23510j;

    /* renamed from: k  reason: collision with root package name */
    public b.a f23511k = null;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (m.this.f23510j) {
                m.this.f23504d.setRepeatCount(-1);
                m mVar = m.this;
                mVar.f23511k.b(mVar.f23482a);
                boolean unused = m.this.f23510j = false;
            }
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            m mVar = m.this;
            int unused = mVar.f23507g = (mVar.f23507g + 1) % m.this.f23506f.f23430c.length;
            boolean unused2 = m.this.f23508h = true;
        }
    }

    public static class b extends Property<m, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(m mVar) {
            return Float.valueOf(mVar.q());
        }

        /* renamed from: b */
        public void set(m mVar, Float f10) {
            mVar.u(f10.floatValue());
        }
    }

    public m(@m0 Context context, @m0 n nVar) {
        super(2);
        this.f23506f = nVar;
        this.f23505e = new Interpolator[]{d.b(context, a.b.linear_indeterminate_line1_head_interpolator), d.b(context, a.b.linear_indeterminate_line1_tail_interpolator), d.b(context, a.b.linear_indeterminate_line2_head_interpolator), d.b(context, a.b.linear_indeterminate_line2_tail_interpolator)};
    }

    public void a() {
        ObjectAnimator objectAnimator = this.f23504d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void c() {
        t();
    }

    public void d(@m0 b.a aVar) {
        this.f23511k = aVar;
    }

    public void f() {
        if (this.f23482a.isVisible()) {
            this.f23510j = true;
            this.f23504d.setRepeatCount(0);
            return;
        }
        a();
    }

    public void g() {
        r();
        t();
        this.f23504d.start();
    }

    public void h() {
        this.f23511k = null;
    }

    public final float q() {
        return this.f23509i;
    }

    public final void r() {
        if (this.f23504d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f23503o, new float[]{0.0f, 1.0f});
            this.f23504d = ofFloat;
            ofFloat.setDuration(1800);
            this.f23504d.setInterpolator((TimeInterpolator) null);
            this.f23504d.setRepeatCount(-1);
            this.f23504d.addListener(new a());
        }
    }

    public final void s() {
        if (this.f23508h) {
            Arrays.fill(this.f23484c, o9.a.a(this.f23506f.f23430c[this.f23507g], this.f23482a.getAlpha()));
            this.f23508h = false;
        }
    }

    @g1
    public void t() {
        this.f23507g = 0;
        int a10 = o9.a.a(this.f23506f.f23430c[0], this.f23482a.getAlpha());
        int[] iArr = this.f23484c;
        iArr[0] = a10;
        iArr[1] = a10;
    }

    @g1
    public void u(float f10) {
        this.f23509i = f10;
        v((int) (f10 * 1800.0f));
        s();
        this.f23482a.invalidateSelf();
    }

    public final void v(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            this.f23483b[i11] = Math.max(0.0f, Math.min(1.0f, this.f23505e[i11].getInterpolation(b(i10, f23502n[i11], f23501m[i11]))));
        }
    }
}
