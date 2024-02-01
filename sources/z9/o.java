package z9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import d.b1;
import d.f;
import d.m0;
import d.q;
import d.x0;
import i9.a;

public class o {

    /* renamed from: m  reason: collision with root package name */
    public static final d f24928m = new m(0.5f);

    /* renamed from: a  reason: collision with root package name */
    public e f24929a;

    /* renamed from: b  reason: collision with root package name */
    public e f24930b;

    /* renamed from: c  reason: collision with root package name */
    public e f24931c;

    /* renamed from: d  reason: collision with root package name */
    public e f24932d;

    /* renamed from: e  reason: collision with root package name */
    public d f24933e;

    /* renamed from: f  reason: collision with root package name */
    public d f24934f;

    /* renamed from: g  reason: collision with root package name */
    public d f24935g;

    /* renamed from: h  reason: collision with root package name */
    public d f24936h;

    /* renamed from: i  reason: collision with root package name */
    public g f24937i;

    /* renamed from: j  reason: collision with root package name */
    public g f24938j;

    /* renamed from: k  reason: collision with root package name */
    public g f24939k;

    /* renamed from: l  reason: collision with root package name */
    public g f24940l;

    public static final class b {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public e f24941a = k.b();
        @m0

        /* renamed from: b  reason: collision with root package name */
        public e f24942b = k.b();
        @m0

        /* renamed from: c  reason: collision with root package name */
        public e f24943c = k.b();
        @m0

        /* renamed from: d  reason: collision with root package name */
        public e f24944d = k.b();
        @m0

        /* renamed from: e  reason: collision with root package name */
        public d f24945e = new a(0.0f);
        @m0

        /* renamed from: f  reason: collision with root package name */
        public d f24946f = new a(0.0f);
        @m0

        /* renamed from: g  reason: collision with root package name */
        public d f24947g = new a(0.0f);
        @m0

        /* renamed from: h  reason: collision with root package name */
        public d f24948h = new a(0.0f);
        @m0

        /* renamed from: i  reason: collision with root package name */
        public g f24949i = k.c();
        @m0

        /* renamed from: j  reason: collision with root package name */
        public g f24950j = k.c();
        @m0

        /* renamed from: k  reason: collision with root package name */
        public g f24951k = k.c();
        @m0

        /* renamed from: l  reason: collision with root package name */
        public g f24952l = k.c();

        public b() {
        }

        public b(@m0 o oVar) {
            this.f24941a = oVar.f24929a;
            this.f24942b = oVar.f24930b;
            this.f24943c = oVar.f24931c;
            this.f24944d = oVar.f24932d;
            this.f24945e = oVar.f24933e;
            this.f24946f = oVar.f24934f;
            this.f24947g = oVar.f24935g;
            this.f24948h = oVar.f24936h;
            this.f24949i = oVar.f24937i;
            this.f24950j = oVar.f24938j;
            this.f24951k = oVar.f24939k;
            this.f24952l = oVar.f24940l;
        }

        public static float n(e eVar) {
            if (eVar instanceof n) {
                return ((n) eVar).f24927a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f24876a;
            }
            return -1.0f;
        }

        @m0
        public b A(int i10, @m0 d dVar) {
            return B(k.a(i10)).D(dVar);
        }

        @m0
        public b B(@m0 e eVar) {
            this.f24943c = eVar;
            float n10 = n(eVar);
            if (n10 != -1.0f) {
                C(n10);
            }
            return this;
        }

        @m0
        public b C(@q float f10) {
            this.f24947g = new a(f10);
            return this;
        }

        @m0
        public b D(@m0 d dVar) {
            this.f24947g = dVar;
            return this;
        }

        @m0
        public b E(@m0 g gVar) {
            this.f24952l = gVar;
            return this;
        }

        @m0
        public b F(@m0 g gVar) {
            this.f24950j = gVar;
            return this;
        }

        @m0
        public b G(@m0 g gVar) {
            this.f24949i = gVar;
            return this;
        }

        @m0
        public b H(int i10, @q float f10) {
            return J(k.a(i10)).K(f10);
        }

        @m0
        public b I(int i10, @m0 d dVar) {
            return J(k.a(i10)).L(dVar);
        }

        @m0
        public b J(@m0 e eVar) {
            this.f24941a = eVar;
            float n10 = n(eVar);
            if (n10 != -1.0f) {
                K(n10);
            }
            return this;
        }

        @m0
        public b K(@q float f10) {
            this.f24945e = new a(f10);
            return this;
        }

        @m0
        public b L(@m0 d dVar) {
            this.f24945e = dVar;
            return this;
        }

        @m0
        public b M(int i10, @q float f10) {
            return O(k.a(i10)).P(f10);
        }

        @m0
        public b N(int i10, @m0 d dVar) {
            return O(k.a(i10)).Q(dVar);
        }

        @m0
        public b O(@m0 e eVar) {
            this.f24942b = eVar;
            float n10 = n(eVar);
            if (n10 != -1.0f) {
                P(n10);
            }
            return this;
        }

        @m0
        public b P(@q float f10) {
            this.f24946f = new a(f10);
            return this;
        }

        @m0
        public b Q(@m0 d dVar) {
            this.f24946f = dVar;
            return this;
        }

        @m0
        public o m() {
            return new o(this);
        }

        @m0
        public b o(@q float f10) {
            return K(f10).P(f10).C(f10).x(f10);
        }

        @m0
        public b p(@m0 d dVar) {
            return L(dVar).Q(dVar).D(dVar).y(dVar);
        }

        @m0
        public b q(int i10, @q float f10) {
            return r(k.a(i10)).o(f10);
        }

        @m0
        public b r(@m0 e eVar) {
            return J(eVar).O(eVar).B(eVar).w(eVar);
        }

        @m0
        public b s(@m0 g gVar) {
            return E(gVar).G(gVar).F(gVar).t(gVar);
        }

        @m0
        public b t(@m0 g gVar) {
            this.f24951k = gVar;
            return this;
        }

        @m0
        public b u(int i10, @q float f10) {
            return w(k.a(i10)).x(f10);
        }

        @m0
        public b v(int i10, @m0 d dVar) {
            return w(k.a(i10)).y(dVar);
        }

        @m0
        public b w(@m0 e eVar) {
            this.f24944d = eVar;
            float n10 = n(eVar);
            if (n10 != -1.0f) {
                x(n10);
            }
            return this;
        }

        @m0
        public b x(@q float f10) {
            this.f24948h = new a(f10);
            return this;
        }

        @m0
        public b y(@m0 d dVar) {
            this.f24948h = dVar;
            return this;
        }

        @m0
        public b z(int i10, @q float f10) {
            return B(k.a(i10)).C(f10);
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    public interface c {
        @m0
        d a(@m0 d dVar);
    }

    public o() {
        this.f24929a = k.b();
        this.f24930b = k.b();
        this.f24931c = k.b();
        this.f24932d = k.b();
        this.f24933e = new a(0.0f);
        this.f24934f = new a(0.0f);
        this.f24935g = new a(0.0f);
        this.f24936h = new a(0.0f);
        this.f24937i = k.c();
        this.f24938j = k.c();
        this.f24939k = k.c();
        this.f24940l = k.c();
    }

    public o(@m0 b bVar) {
        this.f24929a = bVar.f24941a;
        this.f24930b = bVar.f24942b;
        this.f24931c = bVar.f24943c;
        this.f24932d = bVar.f24944d;
        this.f24933e = bVar.f24945e;
        this.f24934f = bVar.f24946f;
        this.f24935g = bVar.f24947g;
        this.f24936h = bVar.f24948h;
        this.f24937i = bVar.f24949i;
        this.f24938j = bVar.f24950j;
        this.f24939k = bVar.f24951k;
        this.f24940l = bVar.f24952l;
    }

    @m0
    public static b a() {
        return new b();
    }

    @m0
    public static b b(Context context, @b1 int i10, @b1 int i11) {
        return c(context, i10, i11, 0);
    }

    @m0
    public static b c(Context context, @b1 int i10, @b1 int i11, int i12) {
        return d(context, i10, i11, new a((float) i12));
    }

    @m0
    public static b d(Context context, @b1 int i10, @b1 int i11, @m0 d dVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, a.o.ShapeAppearance);
        try {
            int i12 = obtainStyledAttributes.getInt(a.o.ShapeAppearance_cornerFamily, 0);
            int i13 = obtainStyledAttributes.getInt(a.o.ShapeAppearance_cornerFamilyTopLeft, i12);
            int i14 = obtainStyledAttributes.getInt(a.o.ShapeAppearance_cornerFamilyTopRight, i12);
            int i15 = obtainStyledAttributes.getInt(a.o.ShapeAppearance_cornerFamilyBottomRight, i12);
            int i16 = obtainStyledAttributes.getInt(a.o.ShapeAppearance_cornerFamilyBottomLeft, i12);
            d m10 = m(obtainStyledAttributes, a.o.ShapeAppearance_cornerSize, dVar);
            d m11 = m(obtainStyledAttributes, a.o.ShapeAppearance_cornerSizeTopLeft, m10);
            d m12 = m(obtainStyledAttributes, a.o.ShapeAppearance_cornerSizeTopRight, m10);
            d m13 = m(obtainStyledAttributes, a.o.ShapeAppearance_cornerSizeBottomRight, m10);
            return new b().I(i13, m11).N(i14, m12).A(i15, m13).v(i16, m(obtainStyledAttributes, a.o.ShapeAppearance_cornerSizeBottomLeft, m10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @m0
    public static b e(@m0 Context context, AttributeSet attributeSet, @f int i10, @b1 int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    @m0
    public static b f(@m0 Context context, AttributeSet attributeSet, @f int i10, @b1 int i11, int i12) {
        return g(context, attributeSet, i10, i11, new a((float) i12));
    }

    @m0
    public static b g(@m0 Context context, AttributeSet attributeSet, @f int i10, @b1 int i11, @m0 d dVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.MaterialShape, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(a.o.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(a.o.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    @m0
    public static d m(TypedArray typedArray, int i10, @m0 d dVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return dVar;
        }
        int i11 = peekValue.type;
        return i11 == 5 ? new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new m(peekValue.getFraction(1.0f, 1.0f)) : dVar;
    }

    @m0
    public g h() {
        return this.f24939k;
    }

    @m0
    public e i() {
        return this.f24932d;
    }

    @m0
    public d j() {
        return this.f24936h;
    }

    @m0
    public e k() {
        return this.f24931c;
    }

    @m0
    public d l() {
        return this.f24935g;
    }

    @m0
    public g n() {
        return this.f24940l;
    }

    @m0
    public g o() {
        return this.f24938j;
    }

    @m0
    public g p() {
        return this.f24937i;
    }

    @m0
    public e q() {
        return this.f24929a;
    }

    @m0
    public d r() {
        return this.f24933e;
    }

    @m0
    public e s() {
        return this.f24930b;
    }

    @m0
    public d t() {
        return this.f24934f;
    }

    @x0({x0.a.LIBRARY_GROUP})
    public boolean u(@m0 RectF rectF) {
        Class<g> cls = g.class;
        boolean z10 = this.f24940l.getClass().equals(cls) && this.f24938j.getClass().equals(cls) && this.f24937i.getClass().equals(cls) && this.f24939k.getClass().equals(cls);
        float a10 = this.f24933e.a(rectF);
        return z10 && ((this.f24934f.a(rectF) > a10 ? 1 : (this.f24934f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f24936h.a(rectF) > a10 ? 1 : (this.f24936h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f24935g.a(rectF) > a10 ? 1 : (this.f24935g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f24930b instanceof n) && (this.f24929a instanceof n) && (this.f24931c instanceof n) && (this.f24932d instanceof n));
    }

    @m0
    public b v() {
        return new b(this);
    }

    @m0
    public o w(float f10) {
        return v().o(f10).m();
    }

    @m0
    public o x(@m0 d dVar) {
        return v().p(dVar).m();
    }

    @x0({x0.a.LIBRARY_GROUP})
    @m0
    public o y(@m0 c cVar) {
        return v().L(cVar.a(r())).Q(cVar.a(t())).y(cVar.a(j())).D(cVar.a(l())).m();
    }
}
