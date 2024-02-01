package h7;

import android.graphics.Bitmap;
import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class b {

    /* renamed from: c0  reason: collision with root package name */
    public static final b f8883c0 = new b("");

    /* renamed from: d0  reason: collision with root package name */
    public static final float f8884d0 = Float.MIN_VALUE;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f8885e0 = Integer.MIN_VALUE;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f8886f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f8887g0 = 1;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f8888h0 = 2;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f8889i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f8890j0 = 1;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f8891k0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f8892l0 = 1;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f8893m0 = 2;
    public final CharSequence O;
    public final Layout.Alignment P;
    public final Bitmap Q;
    public final float R;
    public final int S;
    public final int T;
    public final float U;
    public final int V;
    public final float W;
    public final float X;
    public final boolean Y;
    public final int Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f8894a0;

    /* renamed from: b0  reason: collision with root package name */
    public final float f8895b0;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: h7.b$b  reason: collision with other inner class name */
    public @interface C0147b {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public b(Bitmap bitmap, float f10, int i10, float f11, int i11, float f12, float f13) {
        this((CharSequence) null, (Layout.Alignment) null, bitmap, f11, 0, i11, f10, i10, Integer.MIN_VALUE, Float.MIN_VALUE, f12, f13, false, -16777216);
    }

    public b(CharSequence charSequence) {
        this(charSequence, (Layout.Alignment) null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12) {
        this(charSequence, alignment, f10, i10, i11, f11, i12, f12, false, -16777216);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, int i13, float f13) {
        this(charSequence, alignment, (Bitmap) null, f10, i10, i11, f11, i12, i13, f13, f12, Float.MIN_VALUE, false, -16777216);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13) {
        this(charSequence, alignment, (Bitmap) null, f10, i10, i11, f11, i12, Integer.MIN_VALUE, Float.MIN_VALUE, f12, Float.MIN_VALUE, z10, i13);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14) {
        this.O = charSequence;
        this.P = alignment;
        this.Q = bitmap;
        this.R = f10;
        this.S = i10;
        this.T = i11;
        this.U = f11;
        this.V = i12;
        this.W = f13;
        this.X = f14;
        this.Y = z10;
        this.Z = i14;
        this.f8894a0 = i13;
        this.f8895b0 = f12;
    }
}
