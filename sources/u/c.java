package u;

import g7.h;
import java.util.Arrays;

public class c {

    /* renamed from: b  reason: collision with root package name */
    public static c f13291b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final String f13292c = "cubic(0.4, 0.0, 0.2, 1)";

    /* renamed from: d  reason: collision with root package name */
    public static final String f13293d = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* renamed from: e  reason: collision with root package name */
    public static final String f13294e = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* renamed from: f  reason: collision with root package name */
    public static final String f13295f = "cubic(1, 1, 0, 0)";

    /* renamed from: g  reason: collision with root package name */
    public static final String f13296g = "decelerate";

    /* renamed from: h  reason: collision with root package name */
    public static final String f13297h = "accelerate";

    /* renamed from: i  reason: collision with root package name */
    public static final String f13298i = "standard";

    /* renamed from: j  reason: collision with root package name */
    public static final String f13299j = "linear";

    /* renamed from: k  reason: collision with root package name */
    public static String[] f13300k = {f13298i, f13297h, f13296g, f13299j};

    /* renamed from: a  reason: collision with root package name */
    public String f13301a = h.G;

    public static class a extends c {

        /* renamed from: p  reason: collision with root package name */
        public static double f13302p = 0.01d;

        /* renamed from: q  reason: collision with root package name */
        public static double f13303q = 1.0E-4d;

        /* renamed from: l  reason: collision with root package name */
        public double f13304l;

        /* renamed from: m  reason: collision with root package name */
        public double f13305m;

        /* renamed from: n  reason: collision with root package name */
        public double f13306n;

        /* renamed from: o  reason: collision with root package name */
        public double f13307o;

        public a(double d10, double d11, double d12, double d13) {
            h(d10, d11, d12, d13);
        }

        public a(String str) {
            this.f13301a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f13304l = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i10 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i10);
            this.f13305m = Double.parseDouble(str.substring(i10, indexOf3).trim());
            int i11 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i11);
            this.f13306n = Double.parseDouble(str.substring(i11, indexOf4).trim());
            int i12 = indexOf4 + 1;
            this.f13307o = Double.parseDouble(str.substring(i12, str.indexOf(41, i12)).trim());
        }

        public double a(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > f13302p) {
                d11 *= 0.5d;
                d12 = f(d12) < d10 ? d12 + d11 : d12 - d11;
            }
            double d13 = d12 - d11;
            double f10 = f(d13);
            double d14 = d12 + d11;
            double f11 = f(d14);
            double g10 = g(d13);
            return (((g(d14) - g10) * (d10 - f10)) / (f11 - f10)) + g10;
        }

        public double b(double d10) {
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > f13303q) {
                d11 *= 0.5d;
                d12 = f(d12) < d10 ? d12 + d11 : d12 - d11;
            }
            double d13 = d12 - d11;
            double d14 = d12 + d11;
            return (g(d14) - g(d13)) / (f(d14) - f(d13));
        }

        public final double d(double d10) {
            double d11 = 1.0d - d10;
            double d12 = this.f13304l;
            double d13 = this.f13306n;
            return (d11 * 3.0d * d11 * d12) + (d11 * 6.0d * d10 * (d13 - d12)) + (3.0d * d10 * d10 * (1.0d - d13));
        }

        public final double e(double d10) {
            double d11 = 1.0d - d10;
            double d12 = this.f13305m;
            double d13 = this.f13307o;
            return (d11 * 3.0d * d11 * d12) + (d11 * 6.0d * d10 * (d13 - d12)) + (3.0d * d10 * d10 * (1.0d - d13));
        }

        public final double f(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            return (this.f13304l * d11 * d12 * d10) + (this.f13306n * d12 * d10 * d10) + (d10 * d10 * d10);
        }

        public final double g(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            return (this.f13305m * d11 * d12 * d10) + (this.f13307o * d12 * d10 * d10) + (d10 * d10 * d10);
        }

        public void h(double d10, double d11, double d12, double d13) {
            this.f13304l = d10;
            this.f13305m = d11;
            this.f13306n = d12;
            this.f13307o = d13;
        }
    }

    public static c c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals(f13297h)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals(f13296g)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals(f13299j)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals(f13298i)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new a(f13293d);
            case 1:
                return new a(f13294e);
            case 2:
                return new a(f13295f);
            case 3:
                return new a(f13292c);
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                sb2.append(Arrays.toString(f13300k));
                return f13291b;
        }
    }

    public double a(double d10) {
        return d10;
    }

    public double b(double d10) {
        return 1.0d;
    }

    public String toString() {
        return this.f13301a;
    }
}
