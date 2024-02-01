package b1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import d.m0;
import d.o0;

@SuppressLint({"InlinedApi"})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f4064a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f4065b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f4066c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f4067d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f4068e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f4069f = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final int f4070g = 16;

    /* renamed from: h  reason: collision with root package name */
    public static final int f4071h = 32;

    /* renamed from: i  reason: collision with root package name */
    public static final int f4072i = 256;

    /* renamed from: j  reason: collision with root package name */
    public static final int f4073j = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final int f4074k = 63;

    @m0
    public static Spanned a(@m0 String str, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, i10) : Html.fromHtml(str);
    }

    @m0
    public static Spanned b(@m0 String str, int i10, @o0 Html.ImageGetter imageGetter, @o0 Html.TagHandler tagHandler) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, i10, imageGetter, tagHandler) : Html.fromHtml(str, imageGetter, tagHandler);
    }

    @m0
    public static String c(@m0 Spanned spanned, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? Html.toHtml(spanned, i10) : Html.toHtml(spanned);
    }
}
