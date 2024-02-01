package n7;

import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class e {

    /* renamed from: o  reason: collision with root package name */
    public static final int f10980o = -1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f10981p = 0;

    /* renamed from: q  reason: collision with root package name */
    public static final int f10982q = 1;

    /* renamed from: r  reason: collision with root package name */
    public static final int f10983r = 2;

    /* renamed from: s  reason: collision with root package name */
    public static final int f10984s = 3;

    /* renamed from: t  reason: collision with root package name */
    public static final int f10985t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f10986u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final int f10987v = 3;

    /* renamed from: w  reason: collision with root package name */
    public static final int f10988w = 0;

    /* renamed from: x  reason: collision with root package name */
    public static final int f10989x = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f10990a;

    /* renamed from: b  reason: collision with root package name */
    public int f10991b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10992c;

    /* renamed from: d  reason: collision with root package name */
    public int f10993d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10994e;

    /* renamed from: f  reason: collision with root package name */
    public int f10995f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f10996g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f10997h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f10998i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f10999j = -1;

    /* renamed from: k  reason: collision with root package name */
    public float f11000k;

    /* renamed from: l  reason: collision with root package name */
    public String f11001l;

    /* renamed from: m  reason: collision with root package name */
    public e f11002m;

    /* renamed from: n  reason: collision with root package name */
    public Layout.Alignment f11003n;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public e a(e eVar) {
        return m(eVar, true);
    }

    public int b() {
        if (this.f10994e) {
            return this.f10993d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f10992c) {
            return this.f10991b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f10990a;
    }

    public float e() {
        return this.f11000k;
    }

    public int f() {
        return this.f10999j;
    }

    public String g() {
        return this.f11001l;
    }

    public int h() {
        int i10 = this.f10997h;
        if (i10 == -1 && this.f10998i == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f10998i == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    public Layout.Alignment i() {
        return this.f11003n;
    }

    public boolean j() {
        return this.f10994e;
    }

    public boolean k() {
        return this.f10992c;
    }

    public e l(e eVar) {
        return m(eVar, false);
    }

    public final e m(e eVar, boolean z10) {
        if (eVar != null) {
            if (!this.f10992c && eVar.f10992c) {
                r(eVar.f10991b);
            }
            if (this.f10997h == -1) {
                this.f10997h = eVar.f10997h;
            }
            if (this.f10998i == -1) {
                this.f10998i = eVar.f10998i;
            }
            if (this.f10990a == null) {
                this.f10990a = eVar.f10990a;
            }
            if (this.f10995f == -1) {
                this.f10995f = eVar.f10995f;
            }
            if (this.f10996g == -1) {
                this.f10996g = eVar.f10996g;
            }
            if (this.f11003n == null) {
                this.f11003n = eVar.f11003n;
            }
            if (this.f10999j == -1) {
                this.f10999j = eVar.f10999j;
                this.f11000k = eVar.f11000k;
            }
            if (z10 && !this.f10994e && eVar.f10994e) {
                p(eVar.f10993d);
            }
        }
        return this;
    }

    public boolean n() {
        return this.f10995f == 1;
    }

    public boolean o() {
        return this.f10996g == 1;
    }

    public e p(int i10) {
        this.f10993d = i10;
        this.f10994e = true;
        return this;
    }

    public e q(boolean z10) {
        w7.a.i(this.f11002m == null);
        this.f10997h = z10 ? 1 : 0;
        return this;
    }

    public e r(int i10) {
        w7.a.i(this.f11002m == null);
        this.f10991b = i10;
        this.f10992c = true;
        return this;
    }

    public e s(String str) {
        w7.a.i(this.f11002m == null);
        this.f10990a = str;
        return this;
    }

    public e t(float f10) {
        this.f11000k = f10;
        return this;
    }

    public e u(int i10) {
        this.f10999j = i10;
        return this;
    }

    public e v(String str) {
        this.f11001l = str;
        return this;
    }

    public e w(boolean z10) {
        w7.a.i(this.f11002m == null);
        this.f10998i = z10 ? 1 : 0;
        return this;
    }

    public e x(boolean z10) {
        w7.a.i(this.f11002m == null);
        this.f10995f = z10 ? 1 : 0;
        return this;
    }

    public e y(Layout.Alignment alignment) {
        this.f11003n = alignment;
        return this;
    }

    public e z(boolean z10) {
        w7.a.i(this.f11002m == null);
        this.f10996g = z10 ? 1 : 0;
        return this;
    }
}
