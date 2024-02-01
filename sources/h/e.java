package h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import h.b;
import i.a;
import java.io.IOException;
import k0.l;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"RestrictedAPI"})
public class e extends b {

    /* renamed from: f0  reason: collision with root package name */
    public static final String f8353f0 = "StateListDrawable";

    /* renamed from: g0  reason: collision with root package name */
    public static final boolean f8354g0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public a f8355d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f8356e0;

    public static class a extends b.d {
        public int[][] J;

        public a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[g()][];
            }
        }

        public int D(int[] iArr, Drawable drawable) {
            int a10 = a(drawable);
            this.J[a10] = iArr;
            return a10;
        }

        public int E(int[] iArr) {
            int[][] iArr2 = this.J;
            int i10 = i();
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        @m0
        public Drawable newDrawable() {
            return new e(this, (Resources) null);
        }

        @m0
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }

        public void r(int i10, int i11) {
            super.r(i10, i11);
            int[][] iArr = new int[i11][];
            System.arraycopy(this.J, 0, iArr, 0, i10);
            this.J = iArr;
        }

        public void v() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.J[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.J = iArr2;
        }
    }

    public e() {
        this((a) null, (Resources) null);
    }

    public e(@o0 a aVar) {
        if (aVar != null) {
            i(aVar);
        }
    }

    public e(a aVar, Resources resources) {
        i(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @t0(21)
    public void applyTheme(@m0 Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public void b() {
        super.b();
        this.f8356e0 = false;
    }

    public void i(@m0 b.d dVar) {
        super.i(dVar);
        if (dVar instanceof a) {
            this.f8355d0 = (a) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    @m0
    public Drawable mutate() {
        if (!this.f8356e0 && super.mutate() == this) {
            this.f8355d0.v();
            this.f8356e0 = true;
        }
        return this;
    }

    public void n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f8355d0.D(iArr, drawable);
            onStateChange(getState());
        }
    }

    /* renamed from: o */
    public a c() {
        return new a(this.f8355d0, this, (Resources) null);
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int E = this.f8355d0.E(iArr);
        if (E < 0) {
            E = this.f8355d0.E(StateSet.WILD_CARD);
        }
        return h(E) || onStateChange;
    }

    public int[] p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i10 = 0;
        for (int i11 = 0; i11 < attributeCount; i11++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i11);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i12 = i10 + 1;
                if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i10] = attributeNameResource;
                i10 = i12;
            }
        }
        return StateSet.trimStateSet(iArr, i10);
    }

    public int q() {
        return this.f8355d0.i();
    }

    public Drawable r(int i10) {
        return this.f8355d0.h(i10);
    }

    public int s(int[] iArr) {
        return this.f8355d0.E(iArr);
    }

    public a t() {
        return this.f8355d0;
    }

    public int[] u(int i10) {
        return this.f8355d0.J[i10];
    }

    public void v(@m0 Context context, @m0 Resources resources, @m0 XmlPullParser xmlPullParser, @m0 AttributeSet attributeSet, @o0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s10 = l.s(resources, theme, attributeSet, a.j.StateListDrawable);
        setVisible(s10.getBoolean(a.j.StateListDrawable_android_visible, true), true);
        x(s10);
        m(resources);
        s10.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    public final void w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        a aVar = this.f8355d0;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    TypedArray s10 = l.s(resources, theme, attributeSet, a.j.StateListDrawableItem);
                    Drawable drawable = null;
                    int resourceId = s10.getResourceId(a.j.StateListDrawableItem_android_drawable, -1);
                    if (resourceId > 0) {
                        drawable = androidx.appcompat.widget.m0.h().j(context, resourceId);
                    }
                    s10.recycle();
                    int[] p10 = p(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next == 2) {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + a.f8294r0);
                        }
                    }
                    aVar.D(p10, drawable);
                }
            } else {
                return;
            }
        }
    }

    public final void x(TypedArray typedArray) {
        a aVar = this.f8355d0;
        aVar.f8313d |= typedArray.getChangingConfigurations();
        aVar.f8318i = typedArray.getBoolean(a.j.StateListDrawable_android_variablePadding, aVar.f8318i);
        aVar.f8321l = typedArray.getBoolean(a.j.StateListDrawable_android_constantSize, aVar.f8321l);
        aVar.A = typedArray.getInt(a.j.StateListDrawable_android_enterFadeDuration, aVar.A);
        aVar.B = typedArray.getInt(a.j.StateListDrawable_android_exitFadeDuration, aVar.B);
        aVar.f8333x = typedArray.getBoolean(a.j.StateListDrawable_android_dither, aVar.f8333x);
    }
}
