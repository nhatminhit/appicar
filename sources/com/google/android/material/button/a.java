package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.internal.v;
import d.m0;
import d.o0;
import d.q;
import d.x0;
import f1.w1;
import i9.a;
import o0.d;
import w9.c;
import x9.b;
import z9.j;
import z9.o;
import z9.s;

@x0({x0.a.LIBRARY_GROUP})
public class a {

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f16829t = true;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f16830a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public o f16831b;

    /* renamed from: c  reason: collision with root package name */
    public int f16832c;

    /* renamed from: d  reason: collision with root package name */
    public int f16833d;

    /* renamed from: e  reason: collision with root package name */
    public int f16834e;

    /* renamed from: f  reason: collision with root package name */
    public int f16835f;

    /* renamed from: g  reason: collision with root package name */
    public int f16836g;

    /* renamed from: h  reason: collision with root package name */
    public int f16837h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f16838i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f16839j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f16840k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f16841l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public Drawable f16842m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16843n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16844o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16845p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f16846q;

    /* renamed from: r  reason: collision with root package name */
    public LayerDrawable f16847r;

    /* renamed from: s  reason: collision with root package name */
    public int f16848s;

    public a(MaterialButton materialButton, @m0 o oVar) {
        this.f16830a = materialButton;
        this.f16831b = oVar;
    }

    public void A(@o0 ColorStateList colorStateList) {
        if (this.f16840k != colorStateList) {
            this.f16840k = colorStateList;
            I();
        }
    }

    public void B(int i10) {
        if (this.f16837h != i10) {
            this.f16837h = i10;
            I();
        }
    }

    public void C(@o0 ColorStateList colorStateList) {
        if (this.f16839j != colorStateList) {
            this.f16839j = colorStateList;
            if (f() != null) {
                d.o(f(), this.f16839j);
            }
        }
    }

    public void D(@o0 PorterDuff.Mode mode) {
        if (this.f16838i != mode) {
            this.f16838i = mode;
            if (f() != null && this.f16838i != null) {
                d.p(f(), this.f16838i);
            }
        }
    }

    public final void E(@q int i10, @q int i11) {
        int j02 = w1.j0(this.f16830a);
        int paddingTop = this.f16830a.getPaddingTop();
        int i02 = w1.i0(this.f16830a);
        int paddingBottom = this.f16830a.getPaddingBottom();
        int i12 = this.f16834e;
        int i13 = this.f16835f;
        this.f16835f = i11;
        this.f16834e = i10;
        if (!this.f16844o) {
            F();
        }
        w1.b2(this.f16830a, j02, (paddingTop + i10) - i12, i02, (paddingBottom + i11) - i13);
    }

    public final void F() {
        this.f16830a.setInternalBackground(a());
        j f10 = f();
        if (f10 != null) {
            f10.m0((float) this.f16848s);
        }
    }

    public final void G(@m0 o oVar) {
        if (f() != null) {
            f().setShapeAppearanceModel(oVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(oVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(oVar);
        }
    }

    public void H(int i10, int i11) {
        Drawable drawable = this.f16842m;
        if (drawable != null) {
            drawable.setBounds(this.f16832c, this.f16834e, i11 - this.f16833d, i10 - this.f16835f);
        }
    }

    public final void I() {
        j f10 = f();
        j n10 = n();
        if (f10 != null) {
            f10.D0((float) this.f16837h, this.f16840k);
            if (n10 != null) {
                n10.C0((float) this.f16837h, this.f16843n ? o9.a.d(this.f16830a, a.c.colorSurface) : 0);
            }
        }
    }

    @m0
    public final InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f16832c, this.f16834e, this.f16833d, this.f16835f);
    }

    public final Drawable a() {
        j jVar = new j(this.f16831b);
        jVar.Y(this.f16830a.getContext());
        d.o(jVar, this.f16839j);
        PorterDuff.Mode mode = this.f16838i;
        if (mode != null) {
            d.p(jVar, mode);
        }
        jVar.D0((float) this.f16837h, this.f16840k);
        j jVar2 = new j(this.f16831b);
        jVar2.setTint(0);
        jVar2.C0((float) this.f16837h, this.f16843n ? o9.a.d(this.f16830a, a.c.colorSurface) : 0);
        if (f16829t) {
            j jVar3 = new j(this.f16831b);
            this.f16842m = jVar3;
            d.n(jVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.d(this.f16841l), J(new LayerDrawable(new Drawable[]{jVar2, jVar})), this.f16842m);
            this.f16847r = rippleDrawable;
            return rippleDrawable;
        }
        x9.a aVar = new x9.a(this.f16831b);
        this.f16842m = aVar;
        d.o(aVar, b.d(this.f16841l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar, this.f16842m});
        this.f16847r = layerDrawable;
        return J(layerDrawable);
    }

    public int b() {
        return this.f16836g;
    }

    public int c() {
        return this.f16835f;
    }

    public int d() {
        return this.f16834e;
    }

    @o0
    public s e() {
        LayerDrawable layerDrawable = this.f16847r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (s) (this.f16847r.getNumberOfLayers() > 2 ? this.f16847r.getDrawable(2) : this.f16847r.getDrawable(1));
    }

    @o0
    public j f() {
        return g(false);
    }

    @o0
    public final j g(boolean z10) {
        LayerDrawable layerDrawable = this.f16847r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (j) (f16829t ? (LayerDrawable) ((InsetDrawable) this.f16847r.getDrawable(0)).getDrawable() : this.f16847r).getDrawable(z10 ^ true ? 1 : 0);
    }

    @o0
    public ColorStateList h() {
        return this.f16841l;
    }

    @m0
    public o i() {
        return this.f16831b;
    }

    @o0
    public ColorStateList j() {
        return this.f16840k;
    }

    public int k() {
        return this.f16837h;
    }

    public ColorStateList l() {
        return this.f16839j;
    }

    public PorterDuff.Mode m() {
        return this.f16838i;
    }

    @o0
    public final j n() {
        return g(true);
    }

    public boolean o() {
        return this.f16844o;
    }

    public boolean p() {
        return this.f16846q;
    }

    public void q(@m0 TypedArray typedArray) {
        this.f16832c = typedArray.getDimensionPixelOffset(a.o.MaterialButton_android_insetLeft, 0);
        this.f16833d = typedArray.getDimensionPixelOffset(a.o.MaterialButton_android_insetRight, 0);
        this.f16834e = typedArray.getDimensionPixelOffset(a.o.MaterialButton_android_insetTop, 0);
        this.f16835f = typedArray.getDimensionPixelOffset(a.o.MaterialButton_android_insetBottom, 0);
        int i10 = a.o.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f16836g = dimensionPixelSize;
            y(this.f16831b.w((float) dimensionPixelSize));
            this.f16845p = true;
        }
        this.f16837h = typedArray.getDimensionPixelSize(a.o.MaterialButton_strokeWidth, 0);
        this.f16838i = v.k(typedArray.getInt(a.o.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f16839j = c.a(this.f16830a.getContext(), typedArray, a.o.MaterialButton_backgroundTint);
        this.f16840k = c.a(this.f16830a.getContext(), typedArray, a.o.MaterialButton_strokeColor);
        this.f16841l = c.a(this.f16830a.getContext(), typedArray, a.o.MaterialButton_rippleColor);
        this.f16846q = typedArray.getBoolean(a.o.MaterialButton_android_checkable, false);
        this.f16848s = typedArray.getDimensionPixelSize(a.o.MaterialButton_elevation, 0);
        int j02 = w1.j0(this.f16830a);
        int paddingTop = this.f16830a.getPaddingTop();
        int i02 = w1.i0(this.f16830a);
        int paddingBottom = this.f16830a.getPaddingBottom();
        if (typedArray.hasValue(a.o.MaterialButton_android_background)) {
            s();
        } else {
            F();
        }
        w1.b2(this.f16830a, j02 + this.f16832c, paddingTop + this.f16834e, i02 + this.f16833d, paddingBottom + this.f16835f);
    }

    public void r(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    public void s() {
        this.f16844o = true;
        this.f16830a.setSupportBackgroundTintList(this.f16839j);
        this.f16830a.setSupportBackgroundTintMode(this.f16838i);
    }

    public void t(boolean z10) {
        this.f16846q = z10;
    }

    public void u(int i10) {
        if (!this.f16845p || this.f16836g != i10) {
            this.f16836g = i10;
            this.f16845p = true;
            y(this.f16831b.w((float) i10));
        }
    }

    public void v(@q int i10) {
        E(this.f16834e, i10);
    }

    public void w(@q int i10) {
        E(i10, this.f16835f);
    }

    public void x(@o0 ColorStateList colorStateList) {
        if (this.f16841l != colorStateList) {
            this.f16841l = colorStateList;
            boolean z10 = f16829t;
            if (z10 && (this.f16830a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f16830a.getBackground()).setColor(b.d(colorStateList));
            } else if (!z10 && (this.f16830a.getBackground() instanceof x9.a)) {
                ((x9.a) this.f16830a.getBackground()).setTintList(b.d(colorStateList));
            }
        }
    }

    public void y(@m0 o oVar) {
        this.f16831b = oVar;
        G(oVar);
    }

    public void z(boolean z10) {
        this.f16843n = z10;
        I();
    }
}
