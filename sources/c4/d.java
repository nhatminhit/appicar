package c4;

import android.graphics.Bitmap;
import d.g1;
import d.o0;
import t4.k;

public final class d {
    @g1

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config f4817e = Bitmap.Config.RGB_565;

    /* renamed from: a  reason: collision with root package name */
    public final int f4818a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4819b;

    /* renamed from: c  reason: collision with root package name */
    public final Bitmap.Config f4820c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4821d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4822a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4823b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f4824c;

        /* renamed from: d  reason: collision with root package name */
        public int f4825d;

        public a(int i10) {
            this(i10, i10);
        }

        public a(int i10, int i11) {
            this.f4825d = 1;
            if (i10 <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            } else if (i11 > 0) {
                this.f4822a = i10;
                this.f4823b = i11;
            } else {
                throw new IllegalArgumentException("Height must be > 0");
            }
        }

        public d a() {
            return new d(this.f4822a, this.f4823b, this.f4824c, this.f4825d);
        }

        public Bitmap.Config b() {
            return this.f4824c;
        }

        public a c(@o0 Bitmap.Config config) {
            this.f4824c = config;
            return this;
        }

        public a d(int i10) {
            if (i10 > 0) {
                this.f4825d = i10;
                return this;
            }
            throw new IllegalArgumentException("Weight must be > 0");
        }
    }

    public d(int i10, int i11, Bitmap.Config config, int i12) {
        this.f4820c = (Bitmap.Config) k.e(config, "Config must not be null");
        this.f4818a = i10;
        this.f4819b = i11;
        this.f4821d = i12;
    }

    public Bitmap.Config a() {
        return this.f4820c;
    }

    public int b() {
        return this.f4819b;
    }

    public int c() {
        return this.f4821d;
    }

    public int d() {
        return this.f4818a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4819b == dVar.f4819b && this.f4818a == dVar.f4818a && this.f4821d == dVar.f4821d && this.f4820c == dVar.f4820c;
    }

    public int hashCode() {
        return (((((this.f4818a * 31) + this.f4819b) * 31) + this.f4820c.hashCode()) * 31) + this.f4821d;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f4818a + ", height=" + this.f4819b + ", config=" + this.f4820c + ", weight=" + this.f4821d + '}';
    }
}
