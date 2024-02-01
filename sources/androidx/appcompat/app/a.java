package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import d.a1;
import d.m0;
import d.o0;
import d.u;
import d.x0;
import f.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.b;

public abstract class a {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final int f794a = 0;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final int f795b = 1;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final int f796c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f797d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f798e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f799f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f800g = 8;

    /* renamed from: h  reason: collision with root package name */
    public static final int f801h = 16;

    @x0({x0.a.Q})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    public @interface C0019a {
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f802a;

        public b(int i10) {
            this(-2, -1, i10);
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f802a = 8388627;
        }

        public b(int i10, int i11, int i12) {
            super(i10, i11);
            this.f802a = i12;
        }

        public b(@m0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f802a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.ActionBarLayout);
            this.f802a = obtainStyledAttributes.getInt(a.n.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f802a = 0;
        }

        public b(b bVar) {
            super(bVar);
            this.f802a = 0;
            this.f802a = bVar.f802a;
        }
    }

    @x0({x0.a.Q})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public interface d {
        void onMenuVisibilityChanged(boolean z10);
    }

    @Deprecated
    public interface e {
        boolean onNavigationItemSelected(int i10, long j10);
    }

    @Deprecated
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public static final int f803a = -1;

        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract Object e();

        public abstract CharSequence f();

        public abstract void g();

        public abstract f h(@a1 int i10);

        public abstract f i(CharSequence charSequence);

        public abstract f j(int i10);

        public abstract f k(View view);

        public abstract f l(@u int i10);

        public abstract f m(Drawable drawable);

        public abstract f n(g gVar);

        public abstract f o(Object obj);

        public abstract f p(int i10);

        public abstract f q(CharSequence charSequence);
    }

    @Deprecated
    public interface g {
        void a(f fVar, androidx.fragment.app.u uVar);

        void b(f fVar, androidx.fragment.app.u uVar);

        void c(f fVar, androidx.fragment.app.u uVar);
    }

    public Context A() {
        return null;
    }

    public abstract void A0(CharSequence charSequence);

    @o0
    public abstract CharSequence B();

    @x0({x0.a.Q})
    public void B0(CharSequence charSequence) {
    }

    public abstract void C();

    public abstract void C0();

    @x0({x0.a.Q})
    public boolean D() {
        return false;
    }

    @x0({x0.a.Q})
    public k.b D0(b.a aVar) {
        return null;
    }

    public boolean E() {
        return false;
    }

    public abstract boolean F();

    @x0({x0.a.Q})
    public boolean G() {
        return false;
    }

    @Deprecated
    public abstract f H();

    @x0({x0.a.Q})
    public void I(Configuration configuration) {
    }

    public void J() {
    }

    @x0({x0.a.Q})
    public boolean K(int i10, KeyEvent keyEvent) {
        return false;
    }

    @x0({x0.a.Q})
    public boolean L(KeyEvent keyEvent) {
        return false;
    }

    @x0({x0.a.Q})
    public boolean M() {
        return false;
    }

    @Deprecated
    public abstract void N();

    public abstract void O(d dVar);

    @Deprecated
    public abstract void P(f fVar);

    @Deprecated
    public abstract void Q(int i10);

    @x0({x0.a.Q})
    public boolean R() {
        return false;
    }

    @Deprecated
    public abstract void S(f fVar);

    public abstract void T(@o0 Drawable drawable);

    public abstract void U(int i10);

    public abstract void V(View view);

    public abstract void W(View view, b bVar);

    @x0({x0.a.Q})
    public void X(boolean z10) {
    }

    public abstract void Y(boolean z10);

    public abstract void Z(int i10);

    public abstract void a0(int i10, int i11);

    public abstract void b0(boolean z10);

    public abstract void c0(boolean z10);

    public abstract void d0(boolean z10);

    public abstract void e0(boolean z10);

    public void f0(float f10) {
        if (f10 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void g(d dVar);

    public void g0(int i10) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void h(f fVar);

    public void h0(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void i(f fVar, int i10);

    public void i0(@a1 int i10) {
    }

    @Deprecated
    public abstract void j(f fVar, int i10, boolean z10);

    public void j0(@o0 CharSequence charSequence) {
    }

    @Deprecated
    public abstract void k(f fVar, boolean z10);

    public void k0(@u int i10) {
    }

    @x0({x0.a.Q})
    public boolean l() {
        return false;
    }

    public void l0(@o0 Drawable drawable) {
    }

    @x0({x0.a.Q})
    public boolean m() {
        return false;
    }

    public void m0(boolean z10) {
    }

    @x0({x0.a.Q})
    public void n(boolean z10) {
    }

    public abstract void n0(@u int i10);

    public abstract View o();

    public abstract void o0(Drawable drawable);

    public abstract int p();

    @Deprecated
    public abstract void p0(SpinnerAdapter spinnerAdapter, e eVar);

    public float q() {
        return 0.0f;
    }

    public abstract void q0(@u int i10);

    public abstract int r();

    public abstract void r0(Drawable drawable);

    public int s() {
        return 0;
    }

    @Deprecated
    public abstract void s0(int i10);

    @Deprecated
    public abstract int t();

    @Deprecated
    public abstract void t0(int i10);

    @Deprecated
    public abstract int u();

    @x0({x0.a.Q})
    public void u0(boolean z10) {
    }

    @Deprecated
    public abstract int v();

    public void v0(Drawable drawable) {
    }

    @o0
    @Deprecated
    public abstract f w();

    public void w0(Drawable drawable) {
    }

    @o0
    public abstract CharSequence x();

    public abstract void x0(int i10);

    @Deprecated
    public abstract f y(int i10);

    public abstract void y0(CharSequence charSequence);

    @Deprecated
    public abstract int z();

    public abstract void z0(@a1 int i10);
}
