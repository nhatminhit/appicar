package k0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import d.l;
import d.m0;
import d.o0;
import d.x0;
import e0.a;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f9904a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f9905b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f9906c = 2;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f9907a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f9908b;

        public a(@l int i10, @l int i11) {
            this.f9907a = new int[]{i10, i11};
            this.f9908b = new float[]{0.0f, 1.0f};
        }

        public a(@l int i10, @l int i11, @l int i12) {
            this.f9907a = new int[]{i10, i11, i12};
            this.f9908b = new float[]{0.0f, 0.5f, 1.0f};
        }

        public a(@m0 List<Integer> list, @m0 List<Float> list2) {
            int size = list.size();
            this.f9907a = new int[size];
            this.f9908b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f9907a[i10] = list.get(i10).intValue();
                this.f9908b[i10] = list2.get(i10).floatValue();
            }
        }
    }

    public static a a(@o0 a aVar, @l int i10, @l int i11, boolean z10, @l int i12) {
        a aVar2;
        if (aVar != null) {
            return aVar;
        }
        if (z10) {
            return aVar2;
        }
        aVar2 = new a(i10, i11);
        return aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Shader b(@d.m0 android.content.res.Resources r4, @d.m0 org.xmlpull.v1.XmlPullParser r5, @d.o0 android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.graphics.Shader r4 = c(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.e.b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.graphics.Shader");
    }

    public static Shader c(@m0 Resources resources, @m0 XmlPullParser xmlPullParser, @m0 AttributeSet attributeSet, @o0 Resources.Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray s10 = l.s(resources, theme2, attributeSet, a.j.GradientColor);
            float j10 = l.j(s10, xmlPullParser2, "startX", a.j.GradientColor_android_startX, 0.0f);
            float j11 = l.j(s10, xmlPullParser2, "startY", a.j.GradientColor_android_startY, 0.0f);
            float j12 = l.j(s10, xmlPullParser2, "endX", a.j.GradientColor_android_endX, 0.0f);
            float j13 = l.j(s10, xmlPullParser2, "endY", a.j.GradientColor_android_endY, 0.0f);
            float j14 = l.j(s10, xmlPullParser2, "centerX", a.j.GradientColor_android_centerX, 0.0f);
            float j15 = l.j(s10, xmlPullParser2, "centerY", a.j.GradientColor_android_centerY, 0.0f);
            int k10 = l.k(s10, xmlPullParser2, "type", a.j.GradientColor_android_type, 0);
            int f10 = l.f(s10, xmlPullParser2, "startColor", a.j.GradientColor_android_startColor, 0);
            boolean r10 = l.r(xmlPullParser2, "centerColor");
            int f11 = l.f(s10, xmlPullParser2, "centerColor", a.j.GradientColor_android_centerColor, 0);
            int f12 = l.f(s10, xmlPullParser2, "endColor", a.j.GradientColor_android_endColor, 0);
            int k11 = l.k(s10, xmlPullParser2, "tileMode", a.j.GradientColor_android_tileMode, 0);
            float f13 = j14;
            float j16 = l.j(s10, xmlPullParser2, "gradientRadius", a.j.GradientColor_android_gradientRadius, 0.0f);
            s10.recycle();
            a a10 = a(d(resources, xmlPullParser, attributeSet, theme), f10, f12, r10, f11);
            if (k10 == 1) {
                float f14 = f13;
                if (j16 > 0.0f) {
                    int[] iArr = a10.f9907a;
                    return new RadialGradient(f14, j15, j16, iArr, a10.f9908b, e(k11));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (k10 != 2) {
                return new LinearGradient(j10, j11, j12, j13, a10.f9907a, a10.f9908b, e(k11));
            } else {
                return new SweepGradient(f13, j15, a10.f9907a, a10.f9908b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k0.e.a d(@d.m0 android.content.res.Resources r9, @d.m0 org.xmlpull.v1.XmlPullParser r10, @d.m0 android.util.AttributeSet r11, @d.o0 android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = e0.a.j.GradientColorItem
            android.content.res.TypedArray r3 = k0.l.s(r9, r12, r11, r3)
            int r5 = e0.a.j.GradientColorItem_android_color
            boolean r6 = r3.hasValue(r5)
            int r7 = e0.a.j.GradientColorItem_android_offset
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            k0.e$a r9 = new k0.e$a
            r9.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.e.d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):k0.e$a");
    }

    public static Shader.TileMode e(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
