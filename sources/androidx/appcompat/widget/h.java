package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.j;
import d.m0;
import d.x0;
import f.a;
import f1.w1;

@x0({x0.a.Q})
public class h {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f1307a;

    /* renamed from: b  reason: collision with root package name */
    public u0 f1308b;

    /* renamed from: c  reason: collision with root package name */
    public u0 f1309c;

    /* renamed from: d  reason: collision with root package name */
    public u0 f1310d;

    public h(@m0 ImageView imageView) {
        this.f1307a = imageView;
    }

    public final boolean a(@m0 Drawable drawable) {
        if (this.f1310d == null) {
            this.f1310d = new u0();
        }
        u0 u0Var = this.f1310d;
        u0Var.a();
        ColorStateList a10 = j.a(this.f1307a);
        if (a10 != null) {
            u0Var.f1464d = true;
            u0Var.f1461a = a10;
        }
        PorterDuff.Mode b10 = j.b(this.f1307a);
        if (b10 != null) {
            u0Var.f1463c = true;
            u0Var.f1462b = b10;
        }
        if (!u0Var.f1464d && !u0Var.f1463c) {
            return false;
        }
        f.j(drawable, u0Var, this.f1307a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable drawable = this.f1307a.getDrawable();
        if (drawable != null) {
            b0.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!k() || !a(drawable)) {
            u0 u0Var = this.f1309c;
            if (u0Var != null) {
                f.j(drawable, u0Var, this.f1307a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f1308b;
            if (u0Var2 != null) {
                f.j(drawable, u0Var2, this.f1307a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        u0 u0Var = this.f1309c;
        if (u0Var != null) {
            return u0Var.f1461a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        u0 u0Var = this.f1309c;
        if (u0Var != null) {
            return u0Var.f1462b;
        }
        return null;
    }

    public boolean e() {
        return !(this.f1307a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i10) {
        int u10;
        Context context = this.f1307a.getContext();
        int[] iArr = a.n.AppCompatImageView;
        w0 G = w0.G(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1307a;
        w1.x1(imageView, imageView.getContext(), iArr, attributeSet, G.B(), i10, 0);
        try {
            Drawable drawable = this.f1307a.getDrawable();
            if (!(drawable != null || (u10 = G.u(a.n.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = g.a.d(this.f1307a.getContext(), u10)) == null)) {
                this.f1307a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                b0.b(drawable);
            }
            int i11 = a.n.AppCompatImageView_tint;
            if (G.C(i11)) {
                j.c(this.f1307a, G.d(i11));
            }
            int i12 = a.n.AppCompatImageView_tintMode;
            if (G.C(i12)) {
                j.d(this.f1307a, b0.e(G.o(i12, -1), (PorterDuff.Mode) null));
            }
        } finally {
            G.I();
        }
    }

    public void g(int i10) {
        if (i10 != 0) {
            Drawable d10 = g.a.d(this.f1307a.getContext(), i10);
            if (d10 != null) {
                b0.b(d10);
            }
            this.f1307a.setImageDrawable(d10);
        } else {
            this.f1307a.setImageDrawable((Drawable) null);
        }
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1308b == null) {
                this.f1308b = new u0();
            }
            u0 u0Var = this.f1308b;
            u0Var.f1461a = colorStateList;
            u0Var.f1464d = true;
        } else {
            this.f1308b = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f1309c == null) {
            this.f1309c = new u0();
        }
        u0 u0Var = this.f1309c;
        u0Var.f1461a = colorStateList;
        u0Var.f1464d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f1309c == null) {
            this.f1309c = new u0();
        }
        u0 u0Var = this.f1309c;
        u0Var.f1462b = mode;
        u0Var.f1463c = true;
        b();
    }

    public final boolean k() {
        return this.f1308b != null;
    }
}
