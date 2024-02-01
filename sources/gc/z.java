package gc;

import android.graphics.Bitmap;
import android.net.Uri;
import gc.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p7.f;

public final class z {

    /* renamed from: s  reason: collision with root package name */
    public static final long f19161s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a  reason: collision with root package name */
    public int f19162a;

    /* renamed from: b  reason: collision with root package name */
    public long f19163b;

    /* renamed from: c  reason: collision with root package name */
    public int f19164c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f19165d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19166e;

    /* renamed from: f  reason: collision with root package name */
    public final String f19167f;

    /* renamed from: g  reason: collision with root package name */
    public final List<h0> f19168g;

    /* renamed from: h  reason: collision with root package name */
    public final int f19169h;

    /* renamed from: i  reason: collision with root package name */
    public final int f19170i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f19171j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f19172k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f19173l;

    /* renamed from: m  reason: collision with root package name */
    public final float f19174m;

    /* renamed from: n  reason: collision with root package name */
    public final float f19175n;

    /* renamed from: o  reason: collision with root package name */
    public final float f19176o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f19177p;

    /* renamed from: q  reason: collision with root package name */
    public final Bitmap.Config f19178q;

    /* renamed from: r  reason: collision with root package name */
    public final v.f f19179r;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Uri f19180a;

        /* renamed from: b  reason: collision with root package name */
        public int f19181b;

        /* renamed from: c  reason: collision with root package name */
        public String f19182c;

        /* renamed from: d  reason: collision with root package name */
        public int f19183d;

        /* renamed from: e  reason: collision with root package name */
        public int f19184e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f19185f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f19186g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f19187h;

        /* renamed from: i  reason: collision with root package name */
        public float f19188i;

        /* renamed from: j  reason: collision with root package name */
        public float f19189j;

        /* renamed from: k  reason: collision with root package name */
        public float f19190k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f19191l;

        /* renamed from: m  reason: collision with root package name */
        public List<h0> f19192m;

        /* renamed from: n  reason: collision with root package name */
        public Bitmap.Config f19193n;

        /* renamed from: o  reason: collision with root package name */
        public v.f f19194o;

        public b(int i10) {
            r(i10);
        }

        public b(Uri uri) {
            s(uri);
        }

        public b(Uri uri, int i10, Bitmap.Config config) {
            this.f19180a = uri;
            this.f19181b = i10;
            this.f19193n = config;
        }

        public b(z zVar) {
            this.f19180a = zVar.f19165d;
            this.f19181b = zVar.f19166e;
            this.f19182c = zVar.f19167f;
            this.f19183d = zVar.f19169h;
            this.f19184e = zVar.f19170i;
            this.f19185f = zVar.f19171j;
            this.f19186g = zVar.f19172k;
            this.f19188i = zVar.f19174m;
            this.f19189j = zVar.f19175n;
            this.f19190k = zVar.f19176o;
            this.f19191l = zVar.f19177p;
            this.f19187h = zVar.f19173l;
            if (zVar.f19168g != null) {
                this.f19192m = new ArrayList(zVar.f19168g);
            }
            this.f19193n = zVar.f19178q;
            this.f19194o = zVar.f19179r;
        }

        public z a() {
            boolean z10 = this.f19186g;
            if (z10 && this.f19185f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f19185f && this.f19183d == 0 && this.f19184e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (z10 && this.f19183d == 0 && this.f19184e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f19194o == null) {
                    this.f19194o = v.f.NORMAL;
                }
                z zVar = r2;
                z zVar2 = new z(this.f19180a, this.f19181b, this.f19182c, this.f19192m, this.f19183d, this.f19184e, this.f19185f, this.f19186g, this.f19187h, this.f19188i, this.f19189j, this.f19190k, this.f19191l, this.f19193n, this.f19194o);
                return zVar;
            }
        }

        public b b() {
            if (!this.f19186g) {
                this.f19185f = true;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        public b c() {
            if (!this.f19185f) {
                this.f19186g = true;
                return this;
            }
            throw new IllegalStateException("Center inside can not be used after calling centerCrop");
        }

        public b d() {
            this.f19185f = false;
            return this;
        }

        public b e() {
            this.f19186g = false;
            return this;
        }

        public b f() {
            this.f19187h = false;
            return this;
        }

        public b g() {
            this.f19183d = 0;
            this.f19184e = 0;
            this.f19185f = false;
            this.f19186g = false;
            return this;
        }

        public b h() {
            this.f19188i = 0.0f;
            this.f19189j = 0.0f;
            this.f19190k = 0.0f;
            this.f19191l = false;
            return this;
        }

        public b i(Bitmap.Config config) {
            this.f19193n = config;
            return this;
        }

        public boolean j() {
            return (this.f19180a == null && this.f19181b == 0) ? false : true;
        }

        public boolean k() {
            return this.f19194o != null;
        }

        public boolean l() {
            return (this.f19183d == 0 && this.f19184e == 0) ? false : true;
        }

        public b m() {
            if (this.f19184e == 0 && this.f19183d == 0) {
                throw new IllegalStateException("onlyScaleDown can not be applied without resize");
            }
            this.f19187h = true;
            return this;
        }

        public b n(v.f fVar) {
            if (fVar == null) {
                throw new IllegalArgumentException("Priority invalid.");
            } else if (this.f19194o == null) {
                this.f19194o = fVar;
                return this;
            } else {
                throw new IllegalStateException("Priority already set.");
            }
        }

        public b o(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i11 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i11 == 0 && i10 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f19183d = i10;
                this.f19184e = i11;
                return this;
            }
        }

        public b p(float f10) {
            this.f19188i = f10;
            return this;
        }

        public b q(float f10, float f11, float f12) {
            this.f19188i = f10;
            this.f19189j = f11;
            this.f19190k = f12;
            this.f19191l = true;
            return this;
        }

        public b r(int i10) {
            if (i10 != 0) {
                this.f19181b = i10;
                this.f19180a = null;
                return this;
            }
            throw new IllegalArgumentException("Image resource ID may not be 0.");
        }

        public b s(Uri uri) {
            if (uri != null) {
                this.f19180a = uri;
                this.f19181b = 0;
                return this;
            }
            throw new IllegalArgumentException("Image URI may not be null.");
        }

        public b t(String str) {
            this.f19182c = str;
            return this;
        }

        public b u(h0 h0Var) {
            if (h0Var == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            } else if (h0Var.a() != null) {
                if (this.f19192m == null) {
                    this.f19192m = new ArrayList(2);
                }
                this.f19192m.add(h0Var);
                return this;
            } else {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
        }

        public b v(List<? extends h0> list) {
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    u((h0) list.get(i10));
                }
                return this;
            }
            throw new IllegalArgumentException("Transformation list must not be null.");
        }
    }

    public z(Uri uri, int i10, String str, List<h0> list, int i11, int i12, boolean z10, boolean z11, boolean z12, float f10, float f11, float f12, boolean z13, Bitmap.Config config, v.f fVar) {
        this.f19165d = uri;
        this.f19166e = i10;
        this.f19167f = str;
        this.f19168g = list == null ? null : Collections.unmodifiableList(list);
        this.f19169h = i11;
        this.f19170i = i12;
        this.f19171j = z10;
        this.f19172k = z11;
        this.f19173l = z12;
        this.f19174m = f10;
        this.f19175n = f11;
        this.f19176o = f12;
        this.f19177p = z13;
        this.f19178q = config;
        this.f19179r = fVar;
    }

    public b a() {
        return new b();
    }

    public String b() {
        Uri uri = this.f19165d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f19166e);
    }

    public boolean c() {
        return this.f19168g != null;
    }

    public boolean d() {
        return (this.f19169h == 0 && this.f19170i == 0) ? false : true;
    }

    public String e() {
        StringBuilder sb2;
        long nanoTime = System.nanoTime() - this.f19163b;
        if (nanoTime > f19161s) {
            sb2 = new StringBuilder();
            sb2.append(h());
            sb2.append('+');
            sb2.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb2.append('s');
        } else {
            sb2 = new StringBuilder();
            sb2.append(h());
            sb2.append('+');
            sb2.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            sb2.append("ms");
        }
        return sb2.toString();
    }

    public boolean f() {
        return d() || this.f19174m != 0.0f;
    }

    public boolean g() {
        return f() || c();
    }

    public String h() {
        return "[R" + this.f19162a + ']';
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i10 = this.f19166e;
        if (i10 > 0) {
            sb2.append(i10);
        } else {
            sb2.append(this.f19165d);
        }
        List<h0> list = this.f19168g;
        if (list != null && !list.isEmpty()) {
            for (h0 a10 : this.f19168g) {
                sb2.append(f.f11698i);
                sb2.append(a10.a());
            }
        }
        if (this.f19167f != null) {
            sb2.append(" stableKey(");
            sb2.append(this.f19167f);
            sb2.append(')');
        }
        if (this.f19169h > 0) {
            sb2.append(" resize(");
            sb2.append(this.f19169h);
            sb2.append(',');
            sb2.append(this.f19170i);
            sb2.append(')');
        }
        if (this.f19171j) {
            sb2.append(" centerCrop");
        }
        if (this.f19172k) {
            sb2.append(" centerInside");
        }
        if (this.f19174m != 0.0f) {
            sb2.append(" rotation(");
            sb2.append(this.f19174m);
            if (this.f19177p) {
                sb2.append(" @ ");
                sb2.append(this.f19175n);
                sb2.append(',');
                sb2.append(this.f19176o);
            }
            sb2.append(')');
        }
        if (this.f19178q != null) {
            sb2.append(f.f11698i);
            sb2.append(this.f19178q);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
