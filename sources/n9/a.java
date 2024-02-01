package n9;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import d.b1;
import d.l;
import d.m0;
import d.o0;
import d.q;
import d.t0;
import d.v;
import d.x0;
import f1.w1;
import i9.a;
import o0.d;
import w9.c;
import x9.b;
import z9.e;
import z9.f;
import z9.j;
import z9.n;
import z9.o;

@x0({x0.a.LIBRARY_GROUP})
public class a {

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f21152t = {16842912};

    /* renamed from: u  reason: collision with root package name */
    public static final int f21153u = -1;

    /* renamed from: v  reason: collision with root package name */
    public static final double f21154v = Math.cos(Math.toRadians(45.0d));

    /* renamed from: w  reason: collision with root package name */
    public static final float f21155w = 1.5f;

    /* renamed from: x  reason: collision with root package name */
    public static final int f21156x = 2;
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final MaterialCardView f21157a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final Rect f21158b = new Rect();
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final j f21159c;
    @m0

    /* renamed from: d  reason: collision with root package name */
    public final j f21160d;
    @q

    /* renamed from: e  reason: collision with root package name */
    public int f21161e;
    @q

    /* renamed from: f  reason: collision with root package name */
    public int f21162f;
    @q

    /* renamed from: g  reason: collision with root package name */
    public int f21163g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public Drawable f21164h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public Drawable f21165i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f21166j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f21167k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public o f21168l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f21169m;
    @o0

    /* renamed from: n  reason: collision with root package name */
    public Drawable f21170n;
    @o0

    /* renamed from: o  reason: collision with root package name */
    public LayerDrawable f21171o;
    @o0

    /* renamed from: p  reason: collision with root package name */
    public j f21172p;
    @o0

    /* renamed from: q  reason: collision with root package name */
    public j f21173q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f21174r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f21175s;

    /* renamed from: n9.a$a  reason: collision with other inner class name */
    public class C0370a extends InsetDrawable {
        public C0370a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public a(@m0 MaterialCardView materialCardView, AttributeSet attributeSet, int i10, @b1 int i11) {
        this.f21157a = materialCardView;
        j jVar = new j(materialCardView.getContext(), attributeSet, i10, i11);
        this.f21159c = jVar;
        jVar.Y(materialCardView.getContext());
        jVar.u0(-12303292);
        o.b v10 = jVar.getShapeAppearanceModel().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, a.o.CardView, i10, a.n.CardView);
        int i12 = a.o.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i12)) {
            v10.o(obtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f21160d = new j();
        R(v10.m());
        obtainStyledAttributes.recycle();
    }

    @m0
    public Rect A() {
        return this.f21158b;
    }

    @m0
    public final Drawable B(Drawable drawable) {
        int i10;
        int i11;
        if (this.f21157a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) d());
            i11 = (int) Math.ceil((double) c());
            i10 = ceil;
        } else {
            i11 = 0;
            i10 = 0;
        }
        return new C0370a(drawable, i11, i10, i11, i10);
    }

    public boolean C() {
        return this.f21174r;
    }

    public boolean D() {
        return this.f21175s;
    }

    public void E(@m0 TypedArray typedArray) {
        ColorStateList a10 = c.a(this.f21157a.getContext(), typedArray, a.o.MaterialCardView_strokeColor);
        this.f21169m = a10;
        if (a10 == null) {
            this.f21169m = ColorStateList.valueOf(-1);
        }
        this.f21163g = typedArray.getDimensionPixelSize(a.o.MaterialCardView_strokeWidth, 0);
        boolean z10 = typedArray.getBoolean(a.o.MaterialCardView_android_checkable, false);
        this.f21175s = z10;
        this.f21157a.setLongClickable(z10);
        this.f21167k = c.a(this.f21157a.getContext(), typedArray, a.o.MaterialCardView_checkedIconTint);
        K(c.d(this.f21157a.getContext(), typedArray, a.o.MaterialCardView_checkedIcon));
        M(typedArray.getDimensionPixelSize(a.o.MaterialCardView_checkedIconSize, 0));
        L(typedArray.getDimensionPixelSize(a.o.MaterialCardView_checkedIconMargin, 0));
        ColorStateList a11 = c.a(this.f21157a.getContext(), typedArray, a.o.MaterialCardView_rippleColor);
        this.f21166j = a11;
        if (a11 == null) {
            this.f21166j = ColorStateList.valueOf(o9.a.d(this.f21157a, a.c.colorControlHighlight));
        }
        I(c.a(this.f21157a.getContext(), typedArray, a.o.MaterialCardView_cardForegroundColor));
        c0();
        Z();
        d0();
        this.f21157a.setBackgroundInternal(B(this.f21159c));
        Drawable r10 = this.f21157a.isClickable() ? r() : this.f21160d;
        this.f21164h = r10;
        this.f21157a.setForeground(B(r10));
    }

    public void F(int i10, int i11) {
        int i12;
        int i13;
        if (this.f21171o != null) {
            int i14 = this.f21161e;
            int i15 = this.f21162f;
            int i16 = (i10 - i14) - i15;
            int i17 = (i11 - i14) - i15;
            if (this.f21157a.getUseCompatPadding()) {
                i17 -= (int) Math.ceil((double) (d() * 2.0f));
                i16 -= (int) Math.ceil((double) (c() * 2.0f));
            }
            int i18 = i17;
            int i19 = this.f21161e;
            if (w1.X(this.f21157a) == 1) {
                i12 = i16;
                i13 = i19;
            } else {
                i13 = i16;
                i12 = i19;
            }
            this.f21171o.setLayerInset(2, i13, this.f21161e, i12, i18);
        }
    }

    public void G(boolean z10) {
        this.f21174r = z10;
    }

    public void H(ColorStateList colorStateList) {
        this.f21159c.n0(colorStateList);
    }

    public void I(@o0 ColorStateList colorStateList) {
        j jVar = this.f21160d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        jVar.n0(colorStateList);
    }

    public void J(boolean z10) {
        this.f21175s = z10;
    }

    public void K(@o0 Drawable drawable) {
        this.f21165i = drawable;
        if (drawable != null) {
            Drawable r10 = d.r(drawable.mutate());
            this.f21165i = r10;
            d.o(r10, this.f21167k);
        }
        if (this.f21171o != null) {
            this.f21171o.setDrawableByLayerId(a.h.mtrl_card_checked_layer_id, f());
        }
    }

    public void L(@q int i10) {
        this.f21161e = i10;
    }

    public void M(@q int i10) {
        this.f21162f = i10;
    }

    public void N(@o0 ColorStateList colorStateList) {
        this.f21167k = colorStateList;
        Drawable drawable = this.f21165i;
        if (drawable != null) {
            d.o(drawable, colorStateList);
        }
    }

    public void O(float f10) {
        R(this.f21168l.w(f10));
        this.f21164h.invalidateSelf();
        if (W() || V()) {
            Y();
        }
        if (W()) {
            b0();
        }
    }

    public void P(@v(from = 0.0d, to = 1.0d) float f10) {
        this.f21159c.o0(f10);
        j jVar = this.f21160d;
        if (jVar != null) {
            jVar.o0(f10);
        }
        j jVar2 = this.f21173q;
        if (jVar2 != null) {
            jVar2.o0(f10);
        }
    }

    public void Q(@o0 ColorStateList colorStateList) {
        this.f21166j = colorStateList;
        c0();
    }

    public void R(@m0 o oVar) {
        this.f21168l = oVar;
        this.f21159c.setShapeAppearanceModel(oVar);
        j jVar = this.f21159c;
        jVar.t0(!jVar.d0());
        j jVar2 = this.f21160d;
        if (jVar2 != null) {
            jVar2.setShapeAppearanceModel(oVar);
        }
        j jVar3 = this.f21173q;
        if (jVar3 != null) {
            jVar3.setShapeAppearanceModel(oVar);
        }
        j jVar4 = this.f21172p;
        if (jVar4 != null) {
            jVar4.setShapeAppearanceModel(oVar);
        }
    }

    public void S(ColorStateList colorStateList) {
        if (this.f21169m != colorStateList) {
            this.f21169m = colorStateList;
            d0();
        }
    }

    public void T(@q int i10) {
        if (i10 != this.f21163g) {
            this.f21163g = i10;
            d0();
        }
    }

    public void U(int i10, int i11, int i12, int i13) {
        this.f21158b.set(i10, i11, i12, i13);
        Y();
    }

    public final boolean V() {
        return this.f21157a.getPreventCornerOverlap() && !e();
    }

    public final boolean W() {
        return this.f21157a.getPreventCornerOverlap() && e() && this.f21157a.getUseCompatPadding();
    }

    public void X() {
        Drawable drawable = this.f21164h;
        Drawable r10 = this.f21157a.isClickable() ? r() : this.f21160d;
        this.f21164h = r10;
        if (drawable != r10) {
            a0(r10);
        }
    }

    public void Y() {
        int a10 = (int) ((V() || W() ? a() : 0.0f) - t());
        MaterialCardView materialCardView = this.f21157a;
        Rect rect = this.f21158b;
        materialCardView.m(rect.left + a10, rect.top + a10, rect.right + a10, rect.bottom + a10);
    }

    public void Z() {
        this.f21159c.m0(this.f21157a.getCardElevation());
    }

    public final float a() {
        return Math.max(Math.max(b(this.f21168l.q(), this.f21159c.R()), b(this.f21168l.s(), this.f21159c.S())), Math.max(b(this.f21168l.k(), this.f21159c.u()), b(this.f21168l.i(), this.f21159c.t())));
    }

    public final void a0(Drawable drawable) {
        if (this.f21157a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f21157a.getForeground()).setDrawable(drawable);
        } else {
            this.f21157a.setForeground(B(drawable));
        }
    }

    public final float b(e eVar, float f10) {
        if (eVar instanceof n) {
            return (float) ((1.0d - f21154v) * ((double) f10));
        }
        if (eVar instanceof f) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public void b0() {
        if (!C()) {
            this.f21157a.setBackgroundInternal(B(this.f21159c));
        }
        this.f21157a.setForeground(B(this.f21164h));
    }

    public final float c() {
        return this.f21157a.getMaxCardElevation() + (W() ? a() : 0.0f);
    }

    public final void c0() {
        Drawable drawable;
        if (!b.f24357a || (drawable = this.f21170n) == null) {
            j jVar = this.f21172p;
            if (jVar != null) {
                jVar.n0(this.f21166j);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f21166j);
    }

    public final float d() {
        return (this.f21157a.getMaxCardElevation() * 1.5f) + (W() ? a() : 0.0f);
    }

    public void d0() {
        this.f21160d.D0((float) this.f21163g, this.f21169m);
    }

    public final boolean e() {
        return this.f21159c.d0();
    }

    @m0
    public final Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f21165i;
        if (drawable != null) {
            stateListDrawable.addState(f21152t, drawable);
        }
        return stateListDrawable;
    }

    @m0
    public final Drawable g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        j i10 = i();
        this.f21172p = i10;
        i10.n0(this.f21166j);
        stateListDrawable.addState(new int[]{16842919}, this.f21172p);
        return stateListDrawable;
    }

    @m0
    public final Drawable h() {
        if (!b.f24357a) {
            return g();
        }
        this.f21173q = i();
        return new RippleDrawable(this.f21166j, (Drawable) null, this.f21173q);
    }

    @m0
    public final j i() {
        return new j(this.f21168l);
    }

    @t0(api = 23)
    public void j() {
        Drawable drawable = this.f21170n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f21170n.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f21170n.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    @m0
    public j k() {
        return this.f21159c;
    }

    public ColorStateList l() {
        return this.f21159c.y();
    }

    public ColorStateList m() {
        return this.f21160d.y();
    }

    @o0
    public Drawable n() {
        return this.f21165i;
    }

    @q
    public int o() {
        return this.f21161e;
    }

    @q
    public int p() {
        return this.f21162f;
    }

    @o0
    public ColorStateList q() {
        return this.f21167k;
    }

    @m0
    public final Drawable r() {
        if (this.f21170n == null) {
            this.f21170n = h();
        }
        if (this.f21171o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f21170n, this.f21160d, f()});
            this.f21171o = layerDrawable;
            layerDrawable.setId(2, a.h.mtrl_card_checked_layer_id);
        }
        return this.f21171o;
    }

    public float s() {
        return this.f21159c.R();
    }

    public final float t() {
        if (!this.f21157a.getPreventCornerOverlap() || !this.f21157a.getUseCompatPadding()) {
            return 0.0f;
        }
        return (float) ((1.0d - f21154v) * ((double) this.f21157a.getCardViewRadius()));
    }

    @v(from = 0.0d, to = 1.0d)
    public float u() {
        return this.f21159c.z();
    }

    @o0
    public ColorStateList v() {
        return this.f21166j;
    }

    public o w() {
        return this.f21168l;
    }

    @l
    public int x() {
        ColorStateList colorStateList = this.f21169m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @o0
    public ColorStateList y() {
        return this.f21169m;
    }

    @q
    public int z() {
        return this.f21163g;
    }
}
