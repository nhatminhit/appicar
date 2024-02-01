package w9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import d.b1;
import d.g1;
import d.m0;
import d.o0;
import d.w;
import d.x0;
import i9.a;
import k0.g;

@x0({x0.a.LIBRARY_GROUP})
public class d {

    /* renamed from: r  reason: collision with root package name */
    public static final String f23971r = "TextAppearance";

    /* renamed from: s  reason: collision with root package name */
    public static final int f23972s = 1;

    /* renamed from: t  reason: collision with root package name */
    public static final int f23973t = 2;

    /* renamed from: u  reason: collision with root package name */
    public static final int f23974u = 3;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f23975a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f23976b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f23977c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f23978d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final String f23979e;

    /* renamed from: f  reason: collision with root package name */
    public final int f23980f;

    /* renamed from: g  reason: collision with root package name */
    public final int f23981g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f23982h;

    /* renamed from: i  reason: collision with root package name */
    public final float f23983i;

    /* renamed from: j  reason: collision with root package name */
    public final float f23984j;

    /* renamed from: k  reason: collision with root package name */
    public final float f23985k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f23986l;

    /* renamed from: m  reason: collision with root package name */
    public final float f23987m;

    /* renamed from: n  reason: collision with root package name */
    public float f23988n;
    @w

    /* renamed from: o  reason: collision with root package name */
    public final int f23989o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f23990p = false;

    /* renamed from: q  reason: collision with root package name */
    public Typeface f23991q;

    public class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f23992a;

        public a(f fVar) {
            this.f23992a = fVar;
        }

        public void d(int i10) {
            boolean unused = d.this.f23990p = true;
            this.f23992a.a(i10);
        }

        public void e(@m0 Typeface typeface) {
            d dVar = d.this;
            Typeface unused = dVar.f23991q = Typeface.create(typeface, dVar.f23980f);
            boolean unused2 = d.this.f23990p = true;
            this.f23992a.b(d.this.f23991q, false);
        }
    }

    public class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextPaint f23994a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f23995b;

        public b(TextPaint textPaint, f fVar) {
            this.f23994a = textPaint;
            this.f23995b = fVar;
        }

        public void a(int i10) {
            this.f23995b.a(i10);
        }

        public void b(@m0 Typeface typeface, boolean z10) {
            d.this.l(this.f23994a, typeface);
            this.f23995b.b(typeface, z10);
        }
    }

    public d(@m0 Context context, @b1 int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, a.o.TextAppearance);
        this.f23988n = obtainStyledAttributes.getDimension(a.o.TextAppearance_android_textSize, 0.0f);
        this.f23975a = c.a(context, obtainStyledAttributes, a.o.TextAppearance_android_textColor);
        this.f23976b = c.a(context, obtainStyledAttributes, a.o.TextAppearance_android_textColorHint);
        this.f23977c = c.a(context, obtainStyledAttributes, a.o.TextAppearance_android_textColorLink);
        this.f23980f = obtainStyledAttributes.getInt(a.o.TextAppearance_android_textStyle, 0);
        this.f23981g = obtainStyledAttributes.getInt(a.o.TextAppearance_android_typeface, 1);
        int e10 = c.e(obtainStyledAttributes, a.o.TextAppearance_fontFamily, a.o.TextAppearance_android_fontFamily);
        this.f23989o = obtainStyledAttributes.getResourceId(e10, 0);
        this.f23979e = obtainStyledAttributes.getString(e10);
        this.f23982h = obtainStyledAttributes.getBoolean(a.o.TextAppearance_textAllCaps, false);
        this.f23978d = c.a(context, obtainStyledAttributes, a.o.TextAppearance_android_shadowColor);
        this.f23983i = obtainStyledAttributes.getFloat(a.o.TextAppearance_android_shadowDx, 0.0f);
        this.f23984j = obtainStyledAttributes.getFloat(a.o.TextAppearance_android_shadowDy, 0.0f);
        this.f23985k = obtainStyledAttributes.getFloat(a.o.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, a.o.MaterialTextAppearance);
        int i11 = a.o.MaterialTextAppearance_android_letterSpacing;
        this.f23986l = obtainStyledAttributes2.hasValue(i11);
        this.f23987m = obtainStyledAttributes2.getFloat(i11, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.f23991q == null && (str = this.f23979e) != null) {
            this.f23991q = Typeface.create(str, this.f23980f);
        }
        if (this.f23991q == null) {
            int i10 = this.f23981g;
            this.f23991q = i10 != 1 ? i10 != 2 ? i10 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f23991q = Typeface.create(this.f23991q, this.f23980f);
        }
    }

    public Typeface e() {
        d();
        return this.f23991q;
    }

    @g1
    @m0
    public Typeface f(@m0 Context context) {
        if (this.f23990p) {
            return this.f23991q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface i10 = g.i(context, this.f23989o);
                this.f23991q = i10;
                if (i10 != null) {
                    this.f23991q = Typeface.create(i10, this.f23980f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error loading font ");
                sb2.append(this.f23979e);
            }
        }
        d();
        this.f23990p = true;
        return this.f23991q;
    }

    public void g(@m0 Context context, @m0 TextPaint textPaint, @m0 f fVar) {
        l(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(@m0 Context context, @m0 f fVar) {
        if (i(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f23989o;
        if (i10 == 0) {
            this.f23990p = true;
        }
        if (this.f23990p) {
            fVar.b(this.f23991q, true);
            return;
        }
        try {
            g.k(context, i10, new a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f23990p = true;
            fVar.a(1);
        } catch (Exception unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error loading font ");
            sb2.append(this.f23979e);
            this.f23990p = true;
            fVar.a(-3);
        }
    }

    public final boolean i(Context context) {
        return e.b();
    }

    public void j(@m0 Context context, @m0 TextPaint textPaint, @m0 f fVar) {
        k(context, textPaint, fVar);
        ColorStateList colorStateList = this.f23975a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f23985k;
        float f11 = this.f23983i;
        float f12 = this.f23984j;
        ColorStateList colorStateList2 = this.f23978d;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void k(@m0 Context context, @m0 TextPaint textPaint, @m0 f fVar) {
        if (i(context)) {
            l(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void l(@m0 TextPaint textPaint, @m0 Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f23980f;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f23988n);
        if (this.f23986l) {
            textPaint.setLetterSpacing(this.f23987m);
        }
    }
}
