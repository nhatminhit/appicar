package y7;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final int f15553e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f15554f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f15555g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f15556h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f15557i = 3;

    /* renamed from: a  reason: collision with root package name */
    public final b f15558a;

    /* renamed from: b  reason: collision with root package name */
    public final b f15559b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15560c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15561d;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final c[] f15562a;

        public b(c... cVarArr) {
            this.f15562a = cVarArr;
        }

        public c a(int i10) {
            return this.f15562a[i10];
        }

        public int b() {
            return this.f15562a.length;
        }
    }

    public static final class c {

        /* renamed from: e  reason: collision with root package name */
        public static final int f15563e = 0;

        /* renamed from: a  reason: collision with root package name */
        public final int f15564a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15565b;

        /* renamed from: c  reason: collision with root package name */
        public final float[] f15566c;

        /* renamed from: d  reason: collision with root package name */
        public final float[] f15567d;

        public c(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f15564a = i10;
            w7.a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f15566c = fArr;
            this.f15567d = fArr2;
            this.f15565b = i11;
        }

        public int a() {
            return this.f15566c.length / 3;
        }
    }

    public d(b bVar, int i10) {
        this(bVar, bVar, i10);
    }

    public d(b bVar, b bVar2, int i10) {
        this.f15558a = bVar;
        this.f15559b = bVar2;
        this.f15560c = i10;
        this.f15561d = bVar == bVar2;
    }

    public static d a(float f10, int i10, int i11, float f11, float f12, int i12) {
        int i13;
        float f13;
        int i14;
        float[] fArr;
        int i15;
        int i16;
        int i17;
        float f14 = f10;
        int i18 = i10;
        int i19 = i11;
        float f15 = f11;
        float f16 = f12;
        w7.a.a(f14 > 0.0f);
        w7.a.a(i18 >= 1);
        w7.a.a(i19 >= 1);
        w7.a.a(f15 > 0.0f && f15 <= 180.0f);
        w7.a.a(f16 > 0.0f && f16 <= 360.0f);
        float radians = (float) Math.toRadians((double) f15);
        float radians2 = (float) Math.toRadians((double) f16);
        float f17 = radians / ((float) i18);
        float f18 = radians2 / ((float) i19);
        int i20 = i19 + 1;
        int i21 = ((i20 * 2) + 2) * i18;
        float[] fArr2 = new float[(i21 * 3)];
        float[] fArr3 = new float[(i21 * 2)];
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i22 < i18) {
            float f19 = radians / 2.0f;
            float f20 = (((float) i22) * f17) - f19;
            int i25 = i22 + 1;
            float f21 = (((float) i25) * f17) - f19;
            int i26 = 0;
            while (i26 < i20) {
                float f22 = f20;
                int i27 = i25;
                int i28 = 0;
                int i29 = 2;
                while (i28 < i29) {
                    if (i28 == 0) {
                        f13 = f22;
                        i13 = i20;
                    } else {
                        i13 = i20;
                        f13 = f21;
                    }
                    float f23 = ((float) i26) * f18;
                    float f24 = f18;
                    int i30 = i23 + 1;
                    int i31 = i26;
                    double d10 = (double) f14;
                    float f25 = f17;
                    double d11 = (double) ((f23 + 3.1415927f) - (radians2 / 2.0f));
                    int i32 = i28;
                    double d12 = (double) f13;
                    float[] fArr4 = fArr3;
                    float f26 = f21;
                    fArr2[i23] = -((float) (Math.sin(d11) * d10 * Math.cos(d12)));
                    int i33 = i30 + 1;
                    int i34 = i22;
                    fArr2[i30] = (float) (d10 * Math.sin(d12));
                    int i35 = i33 + 1;
                    fArr2[i33] = (float) (d10 * Math.cos(d11) * Math.cos(d12));
                    int i36 = i24 + 1;
                    fArr4[i24] = f23 / radians2;
                    int i37 = i36 + 1;
                    fArr4[i36] = (((float) (i34 + i32)) * f25) / radians;
                    if (i31 == 0 && i32 == 0) {
                        i17 = i11;
                        i16 = i31;
                        i15 = i32;
                    } else {
                        i17 = i11;
                        i16 = i31;
                        i15 = i32;
                        if (!(i16 == i17 && i15 == 1)) {
                            fArr = fArr4;
                            i14 = 2;
                            i24 = i37;
                            i23 = i35;
                            i28 = i15 + 1;
                            i19 = i17;
                            i26 = i16;
                            fArr3 = fArr;
                            i29 = i14;
                            i22 = i34;
                            i20 = i13;
                            f18 = f24;
                            f17 = f25;
                            f21 = f26;
                        }
                    }
                    System.arraycopy(fArr2, i35 - 3, fArr2, i35, 3);
                    i35 += 3;
                    fArr = fArr4;
                    i14 = 2;
                    System.arraycopy(fArr, i37 - 2, fArr, i37, 2);
                    i37 += 2;
                    i24 = i37;
                    i23 = i35;
                    i28 = i15 + 1;
                    i19 = i17;
                    i26 = i16;
                    fArr3 = fArr;
                    i29 = i14;
                    i22 = i34;
                    i20 = i13;
                    f18 = f24;
                    f17 = f25;
                    f21 = f26;
                }
                float f27 = f17;
                float f28 = f18;
                int i38 = i20;
                float f29 = f21;
                int i39 = i22;
                int i40 = i26;
                int i41 = i19;
                int i42 = i29;
                float[] fArr5 = fArr3;
                int i43 = i40 + 1;
                f20 = f22;
                i25 = i27;
                i20 = i38;
                f17 = f27;
                f21 = f29;
                int i44 = i43;
                i19 = i41;
                i26 = i44;
            }
            i18 = i10;
            i22 = i25;
        }
        return new d(new b(new c(0, fArr2, fArr3, 1)), i12);
    }

    public static d b(int i10) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i10);
    }
}
