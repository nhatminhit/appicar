package k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import d.i1;
import d.l;
import d.m0;
import d.n;
import d.o0;
import d.v;
import d.x0;
import f1.w1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f9882a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(@d.m0 android.content.res.Resources r4, @d.m0 org.xmlpull.v1.XmlPullParser r5, @d.o0 android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
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
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.a.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    @m0
    public static ColorStateList b(@m0 Resources resources, @m0 XmlPullParser xmlPullParser, @m0 AttributeSet attributeSet, @o0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @m0
    public static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = f9882a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @o0
    public static ColorStateList d(@m0 Resources resources, @i1 int i10, @o0 Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i10), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (r9.hasValue(r12) != false) goto L_0x006b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList e(@d.m0 android.content.res.Resources r17, @d.m0 org.xmlpull.v1.XmlPullParser r18, @d.m0 android.util.AttributeSet r19, @d.o0 android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            int r3 = r18.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = r7
        L_0x0014:
            int r9 = r18.next()
            if (r9 == r4) goto L_0x00c1
            int r10 = r18.getDepth()
            if (r10 >= r3) goto L_0x0023
            r11 = 3
            if (r9 == r11) goto L_0x00c1
        L_0x0023:
            r11 = 2
            if (r9 != r11) goto L_0x00be
            if (r10 > r3) goto L_0x00be
            java.lang.String r9 = r18.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0036
            goto L_0x00be
        L_0x0036:
            int[] r9 = e0.a.j.ColorStateListItem
            android.content.res.TypedArray r9 = h(r0, r2, r1, r9)
            int r10 = e0.a.j.ColorStateListItem_android_color
            r11 = -1
            int r12 = r9.getResourceId(r10, r11)
            r13 = -65281(0xffffffffffff00ff, float:NaN)
            if (r12 == r11) goto L_0x005d
            boolean r11 = f(r0, r12)
            if (r11 != 0) goto L_0x005d
            android.content.res.XmlResourceParser r10 = r0.getXml(r12)     // Catch:{ Exception -> 0x005b }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x005b }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x005b }
            goto L_0x0061
        L_0x005b:
            int r10 = e0.a.j.ColorStateListItem_android_color
        L_0x005d:
            int r10 = r9.getColor(r10, r13)
        L_0x0061:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = e0.a.j.ColorStateListItem_android_alpha
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x0070
        L_0x006b:
            float r11 = r9.getFloat(r12, r11)
            goto L_0x0079
        L_0x0070:
            int r12 = e0.a.j.ColorStateListItem_alpha
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x0079
            goto L_0x006b
        L_0x0079:
            r9.recycle()
            int r9 = r19.getAttributeCount()
            int[] r12 = new int[r9]
            r13 = r7
            r14 = r13
        L_0x0084:
            if (r13 >= r9) goto L_0x00a9
            int r15 = r1.getAttributeNameResource(r13)
            r4 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r4) goto L_0x00a5
            r4 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r4) goto L_0x00a5
            int r4 = e0.a.C0110a.alpha
            if (r15 == r4) goto L_0x00a5
            int r4 = r14 + 1
            boolean r16 = r1.getAttributeBooleanValue(r13, r7)
            if (r16 == 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            int r15 = -r15
        L_0x00a2:
            r12[r14] = r15
            r14 = r4
        L_0x00a5:
            int r13 = r13 + 1
            r4 = 1
            goto L_0x0084
        L_0x00a9:
            int[] r4 = android.util.StateSet.trimStateSet(r12, r14)
            int r9 = g(r10, r11)
            int[] r5 = k0.f.a(r5, r8, r9)
            java.lang.Object[] r4 = k0.f.c(r6, r8, r4)
            r6 = r4
            int[][] r6 = (int[][]) r6
            int r8 = r8 + 1
        L_0x00be:
            r4 = 1
            goto L_0x0014
        L_0x00c1:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            java.lang.System.arraycopy(r5, r7, r0, r7, r8)
            java.lang.System.arraycopy(r6, r7, r1, r7, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.a.e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    public static boolean f(@m0 Resources resources, @n int i10) {
        TypedValue c10 = c();
        resources.getValue(i10, c10, true);
        int i11 = c10.type;
        return i11 >= 28 && i11 <= 31;
    }

    @l
    public static int g(@l int i10, @v(from = 0.0d, to = 1.0d) float f10) {
        return (i10 & w1.f7299s) | (Math.round(((float) Color.alpha(i10)) * f10) << 24);
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
