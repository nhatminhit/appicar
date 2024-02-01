package k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import d.l;
import d.m0;
import d.n;
import d.o0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final String f9883d = "ComplexColorCompat";

    /* renamed from: a  reason: collision with root package name */
    public final Shader f9884a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f9885b;

    /* renamed from: c  reason: collision with root package name */
    public int f9886c;

    public b(Shader shader, ColorStateList colorStateList, @l int i10) {
        this.f9884a = shader;
        this.f9885b = colorStateList;
        this.f9886c = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k0.b a(@d.m0 android.content.res.Resources r4, @d.n int r5, @d.o0 android.content.res.Resources.Theme r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = k0.a.b(r4, r5, r0, r6)
            k0.b r4 = c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = k0.e.c(r4, r5, r0, r6)
            k0.b r4 = d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.b.a(android.content.res.Resources, int, android.content.res.Resources$Theme):k0.b");
    }

    public static b b(@l int i10) {
        return new b((Shader) null, (ColorStateList) null, i10);
    }

    public static b c(@m0 ColorStateList colorStateList) {
        return new b((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    public static b d(@m0 Shader shader) {
        return new b(shader, (ColorStateList) null, 0);
    }

    @o0
    public static b g(@m0 Resources resources, @n int i10, @o0 Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    @l
    public int e() {
        return this.f9886c;
    }

    @o0
    public Shader f() {
        return this.f9884a;
    }

    public boolean h() {
        return this.f9884a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f9885b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f9884a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f9885b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.b.i():boolean");
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f9885b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f9886c) {
                this.f9886c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(@l int i10) {
        this.f9886c = i10;
    }

    public boolean l() {
        return h() || this.f9886c != 0;
    }
}
