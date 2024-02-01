package k0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import d.m0;
import d.o0;
import d.x0;
import e0.a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f9887a = 400;

    /* renamed from: b  reason: collision with root package name */
    public static final int f9888b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f9889c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f9890d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f9891e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f9892f = 500;

    public interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements a {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final C0165d[] f9893a;

        public c(@m0 C0165d[] dVarArr) {
            this.f9893a = dVarArr;
        }

        @m0
        public C0165d[] a() {
            return this.f9893a;
        }
    }

    /* renamed from: k0.d$d  reason: collision with other inner class name */
    public static final class C0165d {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final String f9894a;

        /* renamed from: b  reason: collision with root package name */
        public int f9895b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9896c;

        /* renamed from: d  reason: collision with root package name */
        public String f9897d;

        /* renamed from: e  reason: collision with root package name */
        public int f9898e;

        /* renamed from: f  reason: collision with root package name */
        public int f9899f;

        public C0165d(@m0 String str, int i10, boolean z10, @o0 String str2, int i11, int i12) {
            this.f9894a = str;
            this.f9895b = i10;
            this.f9896c = z10;
            this.f9897d = str2;
            this.f9898e = i11;
            this.f9899f = i12;
        }

        @m0
        public String a() {
            return this.f9894a;
        }

        public int b() {
            return this.f9899f;
        }

        public int c() {
            return this.f9898e;
        }

        @o0
        public String d() {
            return this.f9897d;
        }

        public int e() {
            return this.f9895b;
        }

        public boolean f() {
            return this.f9896c;
        }
    }

    public static final class e implements a {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final y0.d f9900a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9901b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9902c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public final String f9903d;

        public e(@m0 y0.d dVar, int i10, int i11) {
            this(dVar, i10, i11, (String) null);
        }

        @x0({x0.a.LIBRARY})
        public e(@m0 y0.d dVar, int i10, int i11, @o0 String str) {
            this.f9900a = dVar;
            this.f9902c = i10;
            this.f9901b = i11;
            this.f9903d = str;
        }

        public int a() {
            return this.f9902c;
        }

        @m0
        public y0.d b() {
            return this.f9900a;
        }

        @x0({x0.a.LIBRARY})
        @o0
        public String c() {
            return this.f9903d;
        }

        public int d() {
            return this.f9901b;
        }
    }

    public static int a(TypedArray typedArray, int i10) {
        return typedArray.getType(i10);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @d.o0
    public static k0.d.a b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            k0.d$a r3 = d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.d.b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):k0.d$a");
    }

    public static List<List<byte[]>> c(Resources resources, @d.e int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    @o0
    public static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, p7.a.f11633d);
        if (xmlPullParser.getName().equals(p7.a.f11633d)) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    @o0
    public static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.j.FontFamily);
        String string = obtainAttributes.getString(a.j.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(a.j.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(a.j.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(a.j.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(a.j.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(a.j.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(a.j.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((C0165d[]) arrayList.toArray(new C0165d[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new e(new y0.d(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
    }

    public static C0165d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.j.FontFamilyFont);
        int i10 = a.j.FontFamilyFont_fontWeight;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = a.j.FontFamilyFont_android_fontWeight;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = a.j.FontFamilyFont_fontStyle;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = a.j.FontFamilyFont_android_fontStyle;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = a.j.FontFamilyFont_ttcIndex;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = a.j.FontFamilyFont_android_ttcIndex;
        }
        int i14 = a.j.FontFamilyFont_fontVariationSettings;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = a.j.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = a.j.FontFamilyFont_font;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = a.j.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0165d(string2, i11, z10, string, i15, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
