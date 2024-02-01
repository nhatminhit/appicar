package p7;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import w7.p;

public final class e extends h7.b {

    /* renamed from: n0  reason: collision with root package name */
    public final long f11677n0;

    /* renamed from: o0  reason: collision with root package name */
    public final long f11678o0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11679a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11679a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11679a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11679a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.e.a.<clinit>():void");
        }
    }

    public static class b {

        /* renamed from: k  reason: collision with root package name */
        public static final String f11680k = "WebvttCueBuilder";

        /* renamed from: a  reason: collision with root package name */
        public long f11681a;

        /* renamed from: b  reason: collision with root package name */
        public long f11682b;

        /* renamed from: c  reason: collision with root package name */
        public SpannableStringBuilder f11683c;

        /* renamed from: d  reason: collision with root package name */
        public Layout.Alignment f11684d;

        /* renamed from: e  reason: collision with root package name */
        public float f11685e;

        /* renamed from: f  reason: collision with root package name */
        public int f11686f;

        /* renamed from: g  reason: collision with root package name */
        public int f11687g;

        /* renamed from: h  reason: collision with root package name */
        public float f11688h;

        /* renamed from: i  reason: collision with root package name */
        public int f11689i;

        /* renamed from: j  reason: collision with root package name */
        public float f11690j;

        public b() {
            c();
        }

        public e a() {
            if (this.f11688h != Float.MIN_VALUE && this.f11689i == Integer.MIN_VALUE) {
                b();
            }
            return new e(this.f11681a, this.f11682b, this.f11683c, this.f11684d, this.f11685e, this.f11686f, this.f11687g, this.f11688h, this.f11689i, this.f11690j);
        }

        public final b b() {
            Layout.Alignment alignment = this.f11684d;
            if (alignment == null) {
                this.f11689i = Integer.MIN_VALUE;
            } else {
                int i10 = a.f11679a[alignment.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        this.f11689i = 1;
                    } else if (i10 != 3) {
                        p.l(f11680k, "Unrecognized alignment: " + this.f11684d);
                    } else {
                        this.f11689i = 2;
                    }
                }
                this.f11689i = 0;
            }
            return this;
        }

        public void c() {
            this.f11681a = 0;
            this.f11682b = 0;
            this.f11683c = null;
            this.f11684d = null;
            this.f11685e = Float.MIN_VALUE;
            this.f11686f = Integer.MIN_VALUE;
            this.f11687g = Integer.MIN_VALUE;
            this.f11688h = Float.MIN_VALUE;
            this.f11689i = Integer.MIN_VALUE;
            this.f11690j = Float.MIN_VALUE;
        }

        public b d(long j10) {
            this.f11682b = j10;
            return this;
        }

        public b e(float f10) {
            this.f11685e = f10;
            return this;
        }

        public b f(int i10) {
            this.f11687g = i10;
            return this;
        }

        public b g(int i10) {
            this.f11686f = i10;
            return this;
        }

        public b h(float f10) {
            this.f11688h = f10;
            return this;
        }

        public b i(int i10) {
            this.f11689i = i10;
            return this;
        }

        public b j(long j10) {
            this.f11681a = j10;
            return this;
        }

        public b k(SpannableStringBuilder spannableStringBuilder) {
            this.f11683c = spannableStringBuilder;
            return this;
        }

        public b l(Layout.Alignment alignment) {
            this.f11684d = alignment;
            return this;
        }

        public b m(float f10) {
            this.f11690j = f10;
            return this;
        }
    }

    public e(long j10, long j11, CharSequence charSequence) {
        this(j10, j11, charSequence, (Layout.Alignment) null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(long j10, long j11, CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12) {
        super(charSequence, alignment, f10, i10, i11, f11, i12, f12);
        this.f11677n0 = j10;
        this.f11678o0 = j11;
    }

    public e(CharSequence charSequence) {
        this(0, 0, charSequence);
    }

    public boolean a() {
        return this.R == Float.MIN_VALUE && this.U == Float.MIN_VALUE;
    }
}
