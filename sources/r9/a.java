package r9;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.internal.v;
import d.l;
import d.m0;
import i9.a;
import n0.f0;
import w9.b;

public class a {

    /* renamed from: e  reason: collision with root package name */
    public static final float f22406e = 4.5f;

    /* renamed from: f  reason: collision with root package name */
    public static final float f22407f = 2.0f;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22408a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22409b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22410c;

    /* renamed from: d  reason: collision with root package name */
    public final float f22411d;

    public a(@m0 Context context) {
        this.f22408a = b.b(context, a.c.elevationOverlayEnabled, false);
        this.f22409b = o9.a.b(context, a.c.elevationOverlayColor, 0);
        this.f22410c = o9.a.b(context, a.c.colorSurface, 0);
        this.f22411d = context.getResources().getDisplayMetrics().density;
    }

    public int a(float f10) {
        return Math.round(b(f10) * 255.0f);
    }

    public float b(float f10) {
        float f11 = this.f22411d;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f10 / f11))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    @l
    public int c(@l int i10, float f10) {
        float b10 = b(f10);
        return f0.B(o9.a.g(f0.B(i10, 255), this.f22409b, b10), Color.alpha(i10));
    }

    @l
    public int d(@l int i10, float f10, @m0 View view) {
        return c(i10, f10 + i(view));
    }

    @l
    public int e(@l int i10, float f10) {
        return (!this.f22408a || !m(i10)) ? i10 : c(i10, f10);
    }

    @l
    public int f(@l int i10, float f10, @m0 View view) {
        return e(i10, f10 + i(view));
    }

    @l
    public int g(float f10) {
        return e(this.f22410c, f10);
    }

    @l
    public int h(float f10, @m0 View view) {
        return g(f10 + i(view));
    }

    public float i(@m0 View view) {
        return v.i(view);
    }

    @l
    public int j() {
        return this.f22409b;
    }

    @l
    public int k() {
        return this.f22410c;
    }

    public boolean l() {
        return this.f22408a;
    }

    public final boolean m(@l int i10) {
        return f0.B(i10, 255) == this.f22410c;
    }
}
