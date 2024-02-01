package j3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import d.m0;
import d.o0;
import d.t0;
import j3.b;
import java.io.IOException;
import java.util.ArrayList;
import k0.l;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c extends h implements b {
    public static final String W = "AnimatedVDCompat";
    public static final String X = "animated-vector";
    public static final String Y = "target";
    public static final boolean Z = false;
    public C0159c P;
    public Context Q;
    public ArgbEvaluator R;
    public d S;
    public Animator.AnimatorListener T;
    public ArrayList<b.a> U;
    public final Drawable.Callback V;

    public class a implements Drawable.Callback {
        public a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.U);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b.a) arrayList.get(i10)).b(c.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.U);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b.a) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* renamed from: j3.c$c  reason: collision with other inner class name */
    public static class C0159c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f9427a;

        /* renamed from: b  reason: collision with root package name */
        public i f9428b;

        /* renamed from: c  reason: collision with root package name */
        public AnimatorSet f9429c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Animator> f9430d;

        /* renamed from: e  reason: collision with root package name */
        public androidx.collection.a<Animator, String> f9431e;

        public C0159c(Context context, C0159c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f9427a = cVar.f9427a;
                i iVar = cVar.f9428b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    this.f9428b = (i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    i iVar2 = (i) this.f9428b.mutate();
                    this.f9428b = iVar2;
                    iVar2.setCallback(callback);
                    this.f9428b.setBounds(cVar.f9428b.getBounds());
                    this.f9428b.l(false);
                }
                ArrayList<Animator> arrayList = cVar.f9430d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f9430d = new ArrayList<>(size);
                    this.f9431e = new androidx.collection.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = cVar.f9430d.get(i10);
                        Animator clone = animator.clone();
                        String str = cVar.f9431e.get(animator);
                        clone.setTarget(this.f9428b.g(str));
                        this.f9430d.add(clone);
                        this.f9431e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f9429c == null) {
                this.f9429c = new AnimatorSet();
            }
            this.f9429c.playTogether(this.f9430d);
        }

        public int getChangingConfigurations() {
            return this.f9427a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    @t0(24)
    public static class d extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f9432a;

        public d(Drawable.ConstantState constantState) {
            this.f9432a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f9432a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f9432a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f9432a.newDrawable();
            cVar.O = newDrawable;
            newDrawable.setCallback(cVar.V);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f9432a.newDrawable(resources);
            cVar.O = newDrawable;
            newDrawable.setCallback(cVar.V);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f9432a.newDrawable(resources, theme);
            cVar.O = newDrawable;
            newDrawable.setCallback(cVar.V);
            return cVar;
        }
    }

    public c() {
        this((Context) null, (C0159c) null, (Resources) null);
    }

    public c(@o0 Context context) {
        this(context, (C0159c) null, (Resources) null);
    }

    public c(@o0 Context context, @o0 C0159c cVar, @o0 Resources resources) {
        this.R = null;
        this.T = null;
        this.U = null;
        a aVar = new a();
        this.V = aVar;
        this.Q = context;
        if (cVar != null) {
            this.P = cVar;
        } else {
            this.P = new C0159c(context, cVar, aVar, resources);
        }
    }

    public static void a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            if (Build.VERSION.SDK_INT >= 24) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            } else {
                ((c) drawable).clearAnimationCallbacks();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045 A[Catch:{ IOException | XmlPullParserException -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052 A[Catch:{ IOException | XmlPullParserException -> 0x005a }] */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j3.c d(@d.m0 android.content.Context r4, @d.u int r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x002c
            j3.c r0 = new j3.c
            r0.<init>(r4)
            android.content.res.Resources r1 = r4.getResources()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            android.graphics.drawable.Drawable r4 = k0.g.f(r1, r5, r4)
            r0.O = r4
            android.graphics.drawable.Drawable$Callback r5 = r0.V
            r4.setCallback(r5)
            j3.c$d r4 = new j3.c$d
            android.graphics.drawable.Drawable r5 = r0.O
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.S = r4
            return r0
        L_0x002c:
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.XmlResourceParser r5 = r0.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x005a }
        L_0x0038:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            r2 = 2
            if (r1 == r2) goto L_0x0043
            r3 = 1
            if (r1 == r3) goto L_0x0043
            goto L_0x0038
        L_0x0043:
            if (r1 != r2) goto L_0x0052
            android.content.res.Resources r1 = r4.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            android.content.res.Resources$Theme r2 = r4.getTheme()     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            j3.c r4 = e(r4, r1, r5, r0, r2)     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            return r4
        L_0x0052:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x005a }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x005a }
        L_0x005a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.c.d(android.content.Context, int):j3.c");
    }

    public static c e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public static void f(Drawable drawable, b.a aVar) {
        if (drawable != null && aVar != null && (drawable instanceof Animatable)) {
            if (Build.VERSION.SDK_INT >= 24) {
                g((AnimatedVectorDrawable) drawable, aVar);
            } else {
                ((c) drawable).b(aVar);
            }
        }
    }

    @t0(23)
    public static void g(@m0 AnimatedVectorDrawable animatedVectorDrawable, @m0 b.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.a());
    }

    public static boolean k(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 24 ? l((AnimatedVectorDrawable) drawable, aVar) : ((c) drawable).c(aVar);
    }

    @t0(23)
    public static boolean l(AnimatedVectorDrawable animatedVectorDrawable, b.a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.a());
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.O;
        if (drawable != null) {
            o0.d.a(drawable, theme);
        }
    }

    public void b(@m0 b.a aVar) {
        Drawable drawable = this.O;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, aVar);
        } else if (aVar != null) {
            if (this.U == null) {
                this.U = new ArrayList<>();
            }
            if (!this.U.contains(aVar)) {
                this.U.add(aVar);
                if (this.T == null) {
                    this.T = new b();
                }
                this.P.f9429c.addListener(this.T);
            }
        }
    }

    public boolean c(@m0 b.a aVar) {
        Drawable drawable = this.O;
        if (drawable != null) {
            l((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<b.a> arrayList = this.U;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(aVar);
        if (this.U.size() == 0) {
            h();
        }
        return remove;
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.O;
        if (drawable != null) {
            return o0.d.b(drawable);
        }
        return false;
    }

    public void clearAnimationCallbacks() {
        Drawable drawable = this.O;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        h();
        ArrayList<b.a> arrayList = this.U;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.P.f9428b.draw(canvas);
        if (this.P.f9429c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.O;
        return drawable != null ? o0.d.d(drawable) : this.P.f9428b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.P.f9427a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.O;
        return drawable != null ? o0.d.e(drawable) : this.P.f9428b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.O == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.O.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getIntrinsicHeight() : this.P.f9428b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getIntrinsicWidth() : this.P.f9428b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getOpacity() : this.P.f9428b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void h() {
        Animator.AnimatorListener animatorListener = this.T;
        if (animatorListener != null) {
            this.P.f9429c.removeListener(animatorListener);
            this.T = null;
        }
    }

    public final void i(String str, Animator animator) {
        animator.setTarget(this.P.f9428b.g(str));
        C0159c cVar = this.P;
        if (cVar.f9430d == null) {
            cVar.f9430d = new ArrayList<>();
            this.P.f9431e = new androidx.collection.a<>();
        }
        this.P.f9430d.add(animator);
        this.P.f9431e.put(animator, str);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes;
        Drawable drawable = this.O;
        if (drawable != null) {
            o0.d.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (X.equals(name)) {
                    obtainAttributes = l.s(resources, theme, attributeSet, a.M);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i d10 = i.d(resources, resourceId, theme);
                        d10.l(false);
                        d10.setCallback(this.V);
                        i iVar = this.P.f9428b;
                        if (iVar != null) {
                            iVar.setCallback((Drawable.Callback) null);
                        }
                        this.P.f9428b = d10;
                    }
                } else if (Y.equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, a.O);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.Q;
                        if (context != null) {
                            i(string, e.j(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.P.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.O;
        return drawable != null ? o0.d.h(drawable) : this.P.f9428b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.O;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.P.f9429c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.isStateful() : this.P.f9428b.isStateful();
    }

    public final void j(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i10 = 0; i10 < childAnimations.size(); i10++) {
                j(childAnimations.get(i10));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.R == null) {
                    this.R = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.R);
            }
        }
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.P.f9428b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i10) {
        Drawable drawable = this.O;
        return drawable != null ? drawable.setLevel(i10) : this.P.f9428b.setLevel(i10);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.O;
        return drawable != null ? drawable.setState(iArr) : this.P.f9428b.setState(iArr);
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.P.f9428b.setAlpha(i10);
        }
    }

    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.O;
        if (drawable != null) {
            o0.d.j(drawable, z10);
        } else {
            this.P.f9428b.setAutoMirrored(z10);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.P.f9428b.setColorFilter(colorFilter);
        }
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i10) {
        Drawable drawable = this.O;
        if (drawable != null) {
            o0.d.n(drawable, i10);
        } else {
            this.P.f9428b.setTint(i10);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.O;
        if (drawable != null) {
            o0.d.o(drawable, colorStateList);
        } else {
            this.P.f9428b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.O;
        if (drawable != null) {
            o0.d.p(drawable, mode);
        } else {
            this.P.f9428b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.O;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.P.f9428b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    public void start() {
        Drawable drawable = this.O;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.P.f9429c.isStarted()) {
            this.P.f9429c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.O;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.P.f9429c.end();
        }
    }
}
