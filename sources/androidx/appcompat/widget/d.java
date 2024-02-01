package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import d.m0;
import d.o0;
import f.a;
import f1.w1;

public class d {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final View f1282a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1283b;

    /* renamed from: c  reason: collision with root package name */
    public int f1284c = -1;

    /* renamed from: d  reason: collision with root package name */
    public u0 f1285d;

    /* renamed from: e  reason: collision with root package name */
    public u0 f1286e;

    /* renamed from: f  reason: collision with root package name */
    public u0 f1287f;

    public d(@m0 View view) {
        this.f1282a = view;
        this.f1283b = f.b();
    }

    public final boolean a(@m0 Drawable drawable) {
        if (this.f1287f == null) {
            this.f1287f = new u0();
        }
        u0 u0Var = this.f1287f;
        u0Var.a();
        ColorStateList L = w1.L(this.f1282a);
        if (L != null) {
            u0Var.f1464d = true;
            u0Var.f1461a = L;
        }
        PorterDuff.Mode M = w1.M(this.f1282a);
        if (M != null) {
            u0Var.f1463c = true;
            u0Var.f1462b = M;
        }
        if (!u0Var.f1464d && !u0Var.f1463c) {
            return false;
        }
        f.j(drawable, u0Var, this.f1282a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f1282a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            u0 u0Var = this.f1286e;
            if (u0Var != null) {
                f.j(background, u0Var, this.f1282a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f1285d;
            if (u0Var2 != null) {
                f.j(background, u0Var2, this.f1282a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        u0 u0Var = this.f1286e;
        if (u0Var != null) {
            return u0Var.f1461a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        u0 u0Var = this.f1286e;
        if (u0Var != null) {
            return u0Var.f1462b;
        }
        return null;
    }

    public void e(@o0 AttributeSet attributeSet, int i10) {
        Context context = this.f1282a.getContext();
        int[] iArr = a.n.ViewBackgroundHelper;
        w0 G = w0.G(context, attributeSet, iArr, i10, 0);
        View view = this.f1282a;
        w1.x1(view, view.getContext(), iArr, attributeSet, G.B(), i10, 0);
        try {
            int i11 = a.n.ViewBackgroundHelper_android_background;
            if (G.C(i11)) {
                this.f1284c = G.u(i11, -1);
                ColorStateList f10 = this.f1283b.f(this.f1282a.getContext(), this.f1284c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = a.n.ViewBackgroundHelper_backgroundTint;
            if (G.C(i12)) {
                w1.H1(this.f1282a, G.d(i12));
            }
            int i13 = a.n.ViewBackgroundHelper_backgroundTintMode;
            if (G.C(i13)) {
                w1.I1(this.f1282a, b0.e(G.o(i13, -1), (PorterDuff.Mode) null));
            }
        } finally {
            G.I();
        }
    }

    public void f(Drawable drawable) {
        this.f1284c = -1;
        h((ColorStateList) null);
        b();
    }

    public void g(int i10) {
        this.f1284c = i10;
        f fVar = this.f1283b;
        h(fVar != null ? fVar.f(this.f1282a.getContext(), i10) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1285d == null) {
                this.f1285d = new u0();
            }
            u0 u0Var = this.f1285d;
            u0Var.f1461a = colorStateList;
            u0Var.f1464d = true;
        } else {
            this.f1285d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f1286e == null) {
            this.f1286e = new u0();
        }
        u0 u0Var = this.f1286e;
        u0Var.f1461a = colorStateList;
        u0Var.f1464d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f1286e == null) {
            this.f1286e = new u0();
        }
        u0 u0Var = this.f1286e;
        u0Var.f1462b = mode;
        u0Var.f1463c = true;
        b();
    }

    public final boolean k() {
        return this.f1285d != null;
    }
}
