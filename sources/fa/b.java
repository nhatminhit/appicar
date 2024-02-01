package fa;

import d.t0;

@t0(21)
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18716a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f18717b = new C0303b();

    /* renamed from: c  reason: collision with root package name */
    public static final a f18718c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final a f18719d = new d();

    public static class a implements a {
        public c a(float f10, float f11, float f12) {
            return c.a(255, v.n(0, 255, f11, f12, f10));
        }
    }

    /* renamed from: fa.b$b  reason: collision with other inner class name */
    public static class C0303b implements a {
        public c a(float f10, float f11, float f12) {
            return c.b(v.n(255, 0, f11, f12, f10), 255);
        }
    }

    public static class c implements a {
        public c a(float f10, float f11, float f12) {
            return c.b(v.n(255, 0, f11, f12, f10), v.n(0, 255, f11, f12, f10));
        }
    }

    public static class d implements a {
        public c a(float f10, float f11, float f12) {
            float f13 = ((f12 - f11) * 0.35f) + f11;
            return c.b(v.n(255, 0, f11, f13, f10), v.n(0, 255, f13, f12, f10));
        }
    }

    public static a a(int i10, boolean z10) {
        if (i10 == 0) {
            return z10 ? f18716a : f18717b;
        }
        if (i10 == 1) {
            return z10 ? f18717b : f18716a;
        }
        if (i10 == 2) {
            return f18718c;
        }
        if (i10 == 3) {
            return f18719d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i10);
    }
}
