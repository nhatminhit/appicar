package f1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import d.x0;

public final class t0 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f7257b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f7258c = 1000;

    /* renamed from: d  reason: collision with root package name */
    public static final int f7259d = 1001;

    /* renamed from: e  reason: collision with root package name */
    public static final int f7260e = 1002;

    /* renamed from: f  reason: collision with root package name */
    public static final int f7261f = 1003;

    /* renamed from: g  reason: collision with root package name */
    public static final int f7262g = 1004;

    /* renamed from: h  reason: collision with root package name */
    public static final int f7263h = 1006;

    /* renamed from: i  reason: collision with root package name */
    public static final int f7264i = 1007;

    /* renamed from: j  reason: collision with root package name */
    public static final int f7265j = 1008;

    /* renamed from: k  reason: collision with root package name */
    public static final int f7266k = 1009;

    /* renamed from: l  reason: collision with root package name */
    public static final int f7267l = 1010;

    /* renamed from: m  reason: collision with root package name */
    public static final int f7268m = 1011;

    /* renamed from: n  reason: collision with root package name */
    public static final int f7269n = 1012;

    /* renamed from: o  reason: collision with root package name */
    public static final int f7270o = 1013;

    /* renamed from: p  reason: collision with root package name */
    public static final int f7271p = 1014;

    /* renamed from: q  reason: collision with root package name */
    public static final int f7272q = 1015;

    /* renamed from: r  reason: collision with root package name */
    public static final int f7273r = 1016;

    /* renamed from: s  reason: collision with root package name */
    public static final int f7274s = 1017;

    /* renamed from: t  reason: collision with root package name */
    public static final int f7275t = 1018;

    /* renamed from: u  reason: collision with root package name */
    public static final int f7276u = 1019;

    /* renamed from: v  reason: collision with root package name */
    public static final int f7277v = 1020;

    /* renamed from: w  reason: collision with root package name */
    public static final int f7278w = 1021;

    /* renamed from: x  reason: collision with root package name */
    public static final int f7279x = 1000;

    /* renamed from: a  reason: collision with root package name */
    public Object f7280a;

    public t0(Object obj) {
        this.f7280a = obj;
    }

    public static t0 a(Bitmap bitmap, float f10, float f11) {
        return Build.VERSION.SDK_INT >= 24 ? new t0(PointerIcon.create(bitmap, f10, f11)) : new t0((Object) null);
    }

    public static t0 c(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new t0(PointerIcon.getSystemIcon(context, i10)) : new t0((Object) null);
    }

    public static t0 d(Resources resources, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new t0(PointerIcon.load(resources, i10)) : new t0((Object) null);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public Object b() {
        return this.f7280a;
    }
}
