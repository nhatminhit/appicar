package x9;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import d.g1;
import d.l;
import d.m0;
import d.o0;
import d.x0;
import n0.f0;

@x0({x0.a.LIBRARY_GROUP})
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f24357a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f24358b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f24359c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f24360d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f24361e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f24362f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f24363g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f24364h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f24365i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f24366j = {16842913};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f24367k = {16842910, 16842919};
    @g1

    /* renamed from: l  reason: collision with root package name */
    public static final String f24368l = b.class.getSimpleName();
    @g1

    /* renamed from: m  reason: collision with root package name */
    public static final String f24369m = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    @m0
    public static ColorStateList a(@o0 ColorStateList colorStateList) {
        if (f24357a) {
            return new ColorStateList(new int[][]{f24366j, StateSet.NOTHING}, new int[]{c(colorStateList, f24362f), c(colorStateList, f24358b)});
        }
        int[] iArr = f24362f;
        int[] iArr2 = f24363g;
        int[] iArr3 = f24364h;
        int[] iArr4 = f24365i;
        int[] iArr5 = f24358b;
        int[] iArr6 = f24359c;
        int[] iArr7 = f24360d;
        int[] iArr8 = f24361e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f24366j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    @l
    public static int b(@l int i10) {
        return f0.B(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    @l
    public static int c(@o0 ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f24357a ? b(colorForState) : colorForState;
    }

    @m0
    public static ColorStateList d(@o0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f24367k, 0));
        }
        return colorStateList;
    }

    public static boolean e(@m0 int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
