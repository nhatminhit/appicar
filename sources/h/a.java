package h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.collection.j;
import d.m0;
import d.o0;
import d.t0;
import h.b;
import h.e;
import i.a;
import j3.i;
import java.io.IOException;
import k0.l;
import o0.p;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
public class a extends e implements p {

    /* renamed from: m0  reason: collision with root package name */
    public static final String f8289m0 = a.class.getSimpleName();

    /* renamed from: n0  reason: collision with root package name */
    public static final String f8290n0 = "transition";

    /* renamed from: o0  reason: collision with root package name */
    public static final String f8291o0 = "item";

    /* renamed from: p0  reason: collision with root package name */
    public static final String f8292p0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: q0  reason: collision with root package name */
    public static final String f8293q0 = ": <transition> tag requires 'fromId' & 'toId' attributes";

    /* renamed from: r0  reason: collision with root package name */
    public static final String f8294r0 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: h0  reason: collision with root package name */
    public c f8295h0;

    /* renamed from: i0  reason: collision with root package name */
    public g f8296i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f8297j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f8298k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f8299l0;

    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f8300a;

        public b(Animatable animatable) {
            super();
            this.f8300a = animatable;
        }

        public void c() {
            this.f8300a.start();
        }

        public void d() {
            this.f8300a.stop();
        }
    }

    public static class c extends e.a {
        public static final long M = 4294967296L;
        public static final long N = 8589934592L;
        public androidx.collection.f<Long> K;
        public j<Integer> L;

        public c(@o0 c cVar, @m0 a aVar, @o0 Resources resources) {
            super(cVar, aVar, resources);
            j<Integer> jVar;
            if (cVar != null) {
                this.K = cVar.K;
                jVar = cVar.L;
            } else {
                this.K = new androidx.collection.f<>();
                jVar = new j<>();
            }
            this.L = jVar;
        }

        public static long H(int i10, int i11) {
            return ((long) i11) | (((long) i10) << 32);
        }

        public int F(@m0 int[] iArr, @m0 Drawable drawable, int i10) {
            int D = super.D(iArr, drawable);
            this.L.u(D, Integer.valueOf(i10));
            return D;
        }

        public int G(int i10, int i11, @m0 Drawable drawable, boolean z10) {
            int a10 = super.a(drawable);
            long H = H(i10, i11);
            long j10 = z10 ? 8589934592L : 0;
            long j11 = (long) a10;
            this.K.a(H, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.a(H(i11, i10), Long.valueOf(M | j11 | j10));
            }
            return a10;
        }

        public int I(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.p(i10, 0).intValue();
        }

        public int J(@m0 int[] iArr) {
            int E = super.E(iArr);
            return E >= 0 ? E : super.E(StateSet.WILD_CARD);
        }

        public int K(int i10, int i11) {
            return (int) this.K.p(H(i10, i11), -1L).longValue();
        }

        public boolean L(int i10, int i11) {
            return (this.K.p(H(i10, i11), -1L).longValue() & M) != 0;
        }

        public boolean M(int i10, int i11) {
            return (this.K.p(H(i10, i11), -1L).longValue() & 8589934592L) != 0;
        }

        @m0
        public Drawable newDrawable() {
            return new a(this, (Resources) null);
        }

        @m0
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        public void v() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        public final j3.c f8301a;

        public d(j3.c cVar) {
            super();
            this.f8301a = cVar;
        }

        public void c() {
            this.f8301a.start();
        }

        public void d() {
            this.f8301a.stop();
        }
    }

    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f8302a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8303b;

        public e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i10, i11});
            ofInt.setAutoCancel(true);
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.f8303b = z11;
            this.f8302a = ofInt;
        }

        public boolean a() {
            return this.f8303b;
        }

        public void b() {
            this.f8302a.reverse();
        }

        public void c() {
            this.f8302a.start();
        }

        public void d() {
            this.f8302a.cancel();
        }
    }

    public static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f8304a;

        /* renamed from: b  reason: collision with root package name */
        public int f8305b;

        /* renamed from: c  reason: collision with root package name */
        public int f8306c;

        public f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        public int a() {
            return this.f8306c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f8305b = numberOfFrames;
            int[] iArr = this.f8304a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f8304a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f8304a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f8306c = i10;
            return i10;
        }

        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * ((float) this.f8306c)) + 0.5f);
            int i11 = this.f8305b;
            int[] iArr = this.f8304a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            return (((float) i12) / ((float) i11)) + (i12 < i11 ? ((float) i10) / ((float) this.f8306c) : 0.0f);
        }
    }

    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this((c) null, (Resources) null);
    }

    public a(@o0 c cVar, @o0 Resources resources) {
        super((e.a) null);
        this.f8297j0 = -1;
        this.f8298k0 = -1;
        i(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ IOException | XmlPullParserException -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019 A[Catch:{ IOException | XmlPullParserException -> 0x0026 }] */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h.a B(@d.m0 android.content.Context r5, @d.u int r6, @d.o0 android.content.res.Resources.Theme r7) {
        /*
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
        L_0x000c:
            int r2 = r6.next()     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            r3 = 2
            if (r2 == r3) goto L_0x0017
            r4 = 1
            if (r2 == r4) goto L_0x0017
            goto L_0x000c
        L_0x0017:
            if (r2 != r3) goto L_0x001e
            h.a r5 = C(r5, r0, r6, r1, r7)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            return r5
        L_0x001e:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            java.lang.String r6 = "No start tag found"
            r5.<init>(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            throw r5     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
        L_0x0026:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.B(android.content.Context, int, android.content.res.Resources$Theme):h.a");
    }

    public static a C(@m0 Context context, @m0 Resources resources, @m0 XmlPullParser xmlPullParser, @m0 AttributeSet attributeSet, @o0 Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.v(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void w(@m0 Context context, @m0 Resources resources, @m0 XmlPullParser xmlPullParser, @m0 AttributeSet attributeSet, @o0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        E(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals(f8290n0)) {
                        F(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void x(TypedArray typedArray) {
        c cVar = this.f8295h0;
        cVar.f8313d |= typedArray.getChangingConfigurations();
        cVar.B(typedArray.getBoolean(a.j.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f8318i));
        cVar.x(typedArray.getBoolean(a.j.AnimatedStateListDrawableCompat_android_constantSize, cVar.f8321l));
        cVar.y(typedArray.getInt(a.j.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.A));
        cVar.z(typedArray.getInt(a.j.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.B));
        setDither(typedArray.getBoolean(a.j.AnimatedStateListDrawableCompat_android_dither, cVar.f8333x));
    }

    /* renamed from: A */
    public c o() {
        return new c(this.f8295h0, this, (Resources) null);
    }

    public final void D() {
        onStateChange(getState());
    }

    public final int E(@m0 Context context, @m0 Resources resources, @m0 XmlPullParser xmlPullParser, @m0 AttributeSet attributeSet, @o0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s10 = l.s(resources, theme, attributeSet, a.j.AnimatedStateListDrawableItem);
        int resourceId = s10.getResourceId(a.j.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = s10.getResourceId(a.j.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable j10 = resourceId2 > 0 ? androidx.appcompat.widget.m0.h().j(context, resourceId2) : null;
        s10.recycle();
        int[] p10 = p(attributeSet);
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j10 = xmlPullParser.getName().equals(i.f9452d0) ? i.e(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f8294r0);
            }
        }
        if (j10 != null) {
            return this.f8295h0.F(p10, j10, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f8294r0);
    }

    public final int F(@m0 Context context, @m0 Resources resources, @m0 XmlPullParser xmlPullParser, @m0 AttributeSet attributeSet, @o0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s10 = l.s(resources, theme, attributeSet, a.j.AnimatedStateListDrawableTransition);
        int resourceId = s10.getResourceId(a.j.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = s10.getResourceId(a.j.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = s10.getResourceId(a.j.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable j10 = resourceId3 > 0 ? androidx.appcompat.widget.m0.h().j(context, resourceId3) : null;
        boolean z10 = s10.getBoolean(a.j.AnimatedStateListDrawableTransition_android_reversible, false);
        s10.recycle();
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j10 = xmlPullParser.getName().equals(j3.c.X) ? j3.c.e(context, resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f8292p0);
            }
        }
        if (j10 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f8292p0);
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f8295h0.G(resourceId, resourceId2, j10, z10);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f8293q0);
        }
    }

    public final boolean G(int i10) {
        int i11;
        int K;
        g gVar;
        g gVar2 = this.f8296i0;
        if (gVar2 == null) {
            i11 = d();
        } else if (i10 == this.f8297j0) {
            return true;
        } else {
            if (i10 != this.f8298k0 || !gVar2.a()) {
                i11 = this.f8297j0;
                gVar2.d();
            } else {
                gVar2.b();
                this.f8297j0 = this.f8298k0;
                this.f8298k0 = i10;
                return true;
            }
        }
        this.f8296i0 = null;
        this.f8298k0 = -1;
        this.f8297j0 = -1;
        c cVar = this.f8295h0;
        int I = cVar.I(i11);
        int I2 = cVar.I(i10);
        if (I2 == 0 || I == 0 || (K = cVar.K(I, I2)) < 0) {
            return false;
        }
        boolean M = cVar.M(I, I2);
        h(K);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.L(I, I2), M);
        } else if (current instanceof j3.c) {
            gVar = new d((j3.c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.f8296i0 = gVar;
        this.f8298k0 = i11;
        this.f8297j0 = i10;
        return true;
    }

    @t0(21)
    public /* bridge */ /* synthetic */ void applyTheme(@m0 Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public void b() {
        super.b();
        this.f8299l0 = false;
    }

    @t0(21)
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(@m0 Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @m0
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(@m0 Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @t0(21)
    public /* bridge */ /* synthetic */ void getOutline(@m0 Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(@m0 Rect rect) {
        return super.getPadding(rect);
    }

    public void i(@m0 b.d dVar) {
        super.i(dVar);
        if (dVar instanceof c) {
            this.f8295h0 = (c) dVar;
        }
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(@m0 Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f8296i0;
        if (gVar != null) {
            gVar.d();
            this.f8296i0 = null;
            h(this.f8297j0);
            this.f8297j0 = -1;
            this.f8298k0 = -1;
        }
    }

    public /* bridge */ /* synthetic */ void k(int i10) {
        super.k(i10);
    }

    public /* bridge */ /* synthetic */ void l(int i10) {
        super.l(i10);
    }

    public Drawable mutate() {
        if (!this.f8299l0 && super.mutate() == this) {
            this.f8295h0.v();
            this.f8299l0 = true;
        }
        return this;
    }

    public /* bridge */ /* synthetic */ void n(int[] iArr, Drawable drawable) {
        super.n(iArr, drawable);
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i10) {
        return super.onLayoutDirectionChanged(i10);
    }

    public boolean onStateChange(int[] iArr) {
        int J = this.f8295h0.J(iArr);
        boolean z10 = J != d() && (G(J) || h(J));
        Drawable current = getCurrent();
        return current != null ? z10 | current.setState(iArr) : z10;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(@m0 Drawable drawable, @m0 Runnable runnable, long j10) {
        super.scheduleDrawable(drawable, runnable, j10);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z10) {
        super.setAutoMirrored(z10);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z10) {
        super.setDither(z10);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(@m0 PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f8296i0;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(@m0 Drawable drawable, @m0 Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public void v(@m0 Context context, @m0 Resources resources, @m0 XmlPullParser xmlPullParser, @m0 AttributeSet attributeSet, @o0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s10 = l.s(resources, theme, attributeSet, a.j.AnimatedStateListDrawableCompat);
        setVisible(s10.getBoolean(a.j.AnimatedStateListDrawableCompat_android_visible, true), true);
        x(s10);
        m(resources);
        s10.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        D();
    }

    public void y(@m0 int[] iArr, @m0 Drawable drawable, int i10) {
        if (drawable != null) {
            this.f8295h0.F(iArr, drawable, i10);
            onStateChange(getState());
            return;
        }
        throw new IllegalArgumentException("Drawable must not be null");
    }

    public <T extends Drawable & Animatable> void z(int i10, int i11, @m0 T t10, boolean z10) {
        if (t10 != null) {
            this.f8295h0.G(i10, i11, t10, z10);
            return;
        }
        throw new IllegalArgumentException("Transition drawable must not be null");
    }
}
