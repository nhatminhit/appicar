package androidx.appcompat.app;

public class m {

    /* renamed from: d  reason: collision with root package name */
    public static m f853d = null;

    /* renamed from: e  reason: collision with root package name */
    public static final int f854e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f855f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final float f856g = 0.017453292f;

    /* renamed from: h  reason: collision with root package name */
    public static final float f857h = 9.0E-4f;

    /* renamed from: i  reason: collision with root package name */
    public static final float f858i = -0.10471976f;

    /* renamed from: j  reason: collision with root package name */
    public static final float f859j = 0.0334196f;

    /* renamed from: k  reason: collision with root package name */
    public static final float f860k = 3.49066E-4f;

    /* renamed from: l  reason: collision with root package name */
    public static final float f861l = 5.236E-6f;

    /* renamed from: m  reason: collision with root package name */
    public static final float f862m = 0.4092797f;

    /* renamed from: n  reason: collision with root package name */
    public static final long f863n = 946728000000L;

    /* renamed from: a  reason: collision with root package name */
    public long f864a;

    /* renamed from: b  reason: collision with root package name */
    public long f865b;

    /* renamed from: c  reason: collision with root package name */
    public int f866c;

    public static m b() {
        if (f853d == null) {
            f853d = new m();
        }
        return f853d;
    }

    public void a(long j10, double d10, double d11) {
        float f10 = ((float) (j10 - f863n)) / 8.64E7f;
        float f11 = (0.01720197f * f10) + 6.24006f;
        double d12 = (double) f11;
        double sin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin((double) (2.0f * f11)) * 3.4906598739326E-4d) + (Math.sin((double) (f11 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d13 = (-d11) / 360.0d;
        double round = ((double) (((float) Math.round(((double) (f10 - 9.0E-4f)) - d13)) + 9.0E-4f)) + d13 + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * sin) * -0.0069d);
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d14 = 0.01745329238474369d * d10;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d14) * Math.sin(asin))) / (Math.cos(d14) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f866c = 1;
        } else if (sin2 <= -1.0d) {
            this.f866c = 0;
        } else {
            double acos = (double) ((float) (Math.acos(sin2) / 6.283185307179586d));
            this.f864a = Math.round((round + acos) * 8.64E7d) + f863n;
            long round2 = Math.round((round - acos) * 8.64E7d) + f863n;
            this.f865b = round2;
            if (round2 >= j10 || this.f864a <= j10) {
                this.f866c = 1;
                return;
            } else {
                this.f866c = 0;
                return;
            }
        }
        this.f864a = -1;
        this.f865b = -1;
    }
}
