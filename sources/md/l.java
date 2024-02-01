package md;

public class l {

    /* renamed from: b  reason: collision with root package name */
    public static final int f21078b = 64;

    /* renamed from: a  reason: collision with root package name */
    public final float f21079a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f21080a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21081b;

        /* renamed from: c  reason: collision with root package name */
        public final float f21082c;

        public a(int i10, int i11, float f10) {
            this.f21080a = i10;
            this.f21081b = i11;
            this.f21082c = f10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f21080a == aVar.f21080a && this.f21081b == aVar.f21081b) {
                return Float.compare(aVar.f21082c, this.f21082c) == 0;
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f21080a * 31) + this.f21081b) * 31;
            float f10 = this.f21082c;
            return i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
        }

        public String toString() {
            return "Size{width=" + this.f21080a + ", height=" + this.f21081b + ", scaleFactor=" + this.f21082c + '}';
        }
    }

    public l(float f10) {
        this.f21079a = f10;
    }

    public final int a(float f10) {
        return (int) Math.ceil((double) (f10 / this.f21079a));
    }

    public boolean b(int i10, int i11) {
        return a((float) i11) == 0 || a((float) i10) == 0;
    }

    public final int c(int i10) {
        int i11 = i10 % 64;
        return i11 == 0 ? i10 : (i10 - i11) + 64;
    }

    public a d(int i10, int i11) {
        float f10 = (float) i10;
        int c10 = c(a(f10));
        float f11 = f10 / ((float) c10);
        return new a(c10, (int) Math.ceil((double) (((float) i11) / f11)), f11);
    }
}
