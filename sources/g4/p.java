package g4;

import v3.h;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f7982a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final p f7983b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final p f7984c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final p f7985d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final p f7986e;

    /* renamed from: f  reason: collision with root package name */
    public static final p f7987f = new f();

    /* renamed from: g  reason: collision with root package name */
    public static final p f7988g;

    /* renamed from: h  reason: collision with root package name */
    public static final h<p> f7989h;

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f7990i = true;

    public static class a extends p {
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            int min = Math.min(i11 / i13, i10 / i12);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    public static class b extends p {
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i11) / ((float) i13), ((float) i10) / ((float) i12)));
            int i14 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i14 = 0;
            }
            return 1.0f / ((float) (max << i14));
        }
    }

    public static class c extends p {
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : p.f7984c.a(i10, i11, i12, i13);
        }

        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, p.f7984c.b(i10, i11, i12, i13));
        }
    }

    public static class d extends p {
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
        }
    }

    public static class e extends p {
        public g a(int i10, int i11, int i12, int i13) {
            return p.f7990i ? g.QUALITY : g.MEMORY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            if (p.f7990i) {
                return Math.min(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
            }
            int max = Math.max(i11 / i13, i10 / i12);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    public static class f extends p {
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f7986e = dVar;
        f7988g = dVar;
        f7989h = h.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
