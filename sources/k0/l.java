package k0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import d.c;
import d.c1;
import d.m0;
import d.o0;
import d.x0;
import org.xmlpull.v1.XmlPullParser;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9921a = "http://schemas.android.com/apk/res/android";

    public static int a(@m0 Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    public static boolean b(@m0 TypedArray typedArray, @c1 int i10, @c1 int i11, boolean z10) {
        return typedArray.getBoolean(i10, typedArray.getBoolean(i11, z10));
    }

    @o0
    public static Drawable c(@m0 TypedArray typedArray, @c1 int i10, @c1 int i11) {
        Drawable drawable = typedArray.getDrawable(i10);
        return drawable == null ? typedArray.getDrawable(i11) : drawable;
    }

    public static int d(@m0 TypedArray typedArray, @c1 int i10, @c1 int i11, int i12) {
        return typedArray.getInt(i10, typedArray.getInt(i11, i12));
    }

    public static boolean e(@m0 TypedArray typedArray, @m0 XmlPullParser xmlPullParser, @m0 String str, @c1 int i10, boolean z10) {
        return !r(xmlPullParser, str) ? z10 : typedArray.getBoolean(i10, z10);
    }

    @d.l
    public static int f(@m0 TypedArray typedArray, @m0 XmlPullParser xmlPullParser, @m0 String str, @c1 int i10, @d.l int i11) {
        return !r(xmlPullParser, str) ? i11 : typedArray.getColor(i10, i11);
    }

    @o0
    public static ColorStateList g(@m0 TypedArray typedArray, @m0 XmlPullParser xmlPullParser, @o0 Resources.Theme theme, @m0 String str, @c1 int i10) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        int i11 = typedValue.type;
        if (i11 != 2) {
            return (i11 < 28 || i11 > 31) ? a.d(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme) : h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i10 + ": " + typedValue);
    }

    @m0
    public static ColorStateList h(@m0 TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static b i(@m0 TypedArray typedArray, @m0 XmlPullParser xmlPullParser, @o0 Resources.Theme theme, @m0 String str, @c1 int i10, @d.l int i11) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return b.b(typedValue.data);
            }
            b g10 = b.g(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            if (g10 != null) {
                return g10;
            }
        }
        return b.b(i11);
    }

    public static float j(@m0 TypedArray typedArray, @m0 XmlPullParser xmlPullParser, @m0 String str, @c1 int i10, float f10) {
        return !r(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    public static int k(@m0 TypedArray typedArray, @m0 XmlPullParser xmlPullParser, @m0 String str, @c1 int i10, int i11) {
        return !r(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    @c
    public static int l(@m0 TypedArray typedArray, @m0 XmlPullParser xmlPullParser, @m0 String str, @c1 int i10, @c int i11) {
        return !r(xmlPullParser, str) ? i11 : typedArray.getResourceId(i10, i11);
    }

    @o0
    public static String m(@m0 TypedArray typedArray, @m0 XmlPullParser xmlPullParser, @m0 String str, @c1 int i10) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i10);
    }

    @c
    public static int n(@m0 TypedArray typedArray, @c1 int i10, @c1 int i11, @c int i12) {
        return typedArray.getResourceId(i10, typedArray.getResourceId(i11, i12));
    }

    @o0
    public static String o(@m0 TypedArray typedArray, @c1 int i10, @c1 int i11) {
        String string = typedArray.getString(i10);
        return string == null ? typedArray.getString(i11) : string;
    }

    @o0
    public static CharSequence p(@m0 TypedArray typedArray, @c1 int i10, @c1 int i11) {
        CharSequence text = typedArray.getText(i10);
        return text == null ? typedArray.getText(i11) : text;
    }

    @o0
    public static CharSequence[] q(@m0 TypedArray typedArray, @c1 int i10, @c1 int i11) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        return textArray == null ? typedArray.getTextArray(i11) : textArray;
    }

    public static boolean r(@m0 XmlPullParser xmlPullParser, @m0 String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @m0
    public static TypedArray s(@m0 Resources resources, @o0 Resources.Theme theme, @m0 AttributeSet attributeSet, @m0 int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @o0
    public static TypedValue t(@m0 TypedArray typedArray, @m0 XmlPullParser xmlPullParser, @m0 String str, int i10) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i10);
    }
}
