package o0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import d.l;
import d.m0;
import d.o0;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11008a = "DrawableCompat";

    /* renamed from: b  reason: collision with root package name */
    public static Method f11009b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f11010c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f11011d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f11012e;

    public static void a(@m0 Drawable drawable, @m0 Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean b(@m0 Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static void c(@m0 Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int d(@m0 Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter e(@m0 Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static int f(@m0 Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static void g(@m0 Drawable drawable, @m0 Resources resources, @m0 XmlPullParser xmlPullParser, @m0 AttributeSet attributeSet, @o0 Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(@m0 Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void i(@m0 Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(@m0 Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    public static void k(@m0 Drawable drawable, float f10, float f11) {
        drawable.setHotspot(f10, f11);
    }

    public static void l(@m0 Drawable drawable, int i10, int i11, int i12, int i13) {
        drawable.setHotspotBounds(i10, i11, i12, i13);
    }

    public static boolean m(@m0 Drawable drawable, int i10) {
        return drawable.setLayoutDirection(i10);
    }

    public static void n(@m0 Drawable drawable, @l int i10) {
        drawable.setTint(i10);
    }

    public static void o(@m0 Drawable drawable, @o0 ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void p(@m0 Drawable drawable, @m0 PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static <T extends Drawable> T q(@m0 Drawable drawable) {
        return drawable instanceof q ? ((q) drawable).b() : drawable;
    }

    public static Drawable r(@m0 Drawable drawable) {
        return drawable;
    }
}
