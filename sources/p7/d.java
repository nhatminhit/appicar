package p7;

import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w7.q0;

public final class d {

    /* renamed from: q  reason: collision with root package name */
    public static final int f11651q = -1;

    /* renamed from: r  reason: collision with root package name */
    public static final int f11652r = 0;

    /* renamed from: s  reason: collision with root package name */
    public static final int f11653s = 1;

    /* renamed from: t  reason: collision with root package name */
    public static final int f11654t = 2;

    /* renamed from: u  reason: collision with root package name */
    public static final int f11655u = 3;

    /* renamed from: v  reason: collision with root package name */
    public static final int f11656v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f11657w = 2;

    /* renamed from: x  reason: collision with root package name */
    public static final int f11658x = 3;

    /* renamed from: y  reason: collision with root package name */
    public static final int f11659y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final int f11660z = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f11661a;

    /* renamed from: b  reason: collision with root package name */
    public String f11662b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f11663c;

    /* renamed from: d  reason: collision with root package name */
    public String f11664d;

    /* renamed from: e  reason: collision with root package name */
    public String f11665e;

    /* renamed from: f  reason: collision with root package name */
    public int f11666f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11667g;

    /* renamed from: h  reason: collision with root package name */
    public int f11668h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11669i;

    /* renamed from: j  reason: collision with root package name */
    public int f11670j;

    /* renamed from: k  reason: collision with root package name */
    public int f11671k;

    /* renamed from: l  reason: collision with root package name */
    public int f11672l;

    /* renamed from: m  reason: collision with root package name */
    public int f11673m;

    /* renamed from: n  reason: collision with root package name */
    public int f11674n;

    /* renamed from: o  reason: collision with root package name */
    public float f11675o;

    /* renamed from: p  reason: collision with root package name */
    public Layout.Alignment f11676p;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public d() {
        n();
    }

    public static int C(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public d A(Layout.Alignment alignment) {
        this.f11676p = alignment;
        return this;
    }

    public d B(boolean z10) {
        this.f11671k = z10 ? 1 : 0;
        return this;
    }

    public void a(d dVar) {
        if (dVar.f11667g) {
            q(dVar.f11666f);
        }
        int i10 = dVar.f11672l;
        if (i10 != -1) {
            this.f11672l = i10;
        }
        int i11 = dVar.f11673m;
        if (i11 != -1) {
            this.f11673m = i11;
        }
        String str = dVar.f11665e;
        if (str != null) {
            this.f11665e = str;
        }
        if (this.f11670j == -1) {
            this.f11670j = dVar.f11670j;
        }
        if (this.f11671k == -1) {
            this.f11671k = dVar.f11671k;
        }
        if (this.f11676p == null) {
            this.f11676p = dVar.f11676p;
        }
        if (this.f11674n == -1) {
            this.f11674n = dVar.f11674n;
            this.f11675o = dVar.f11675o;
        }
        if (dVar.f11669i) {
            o(dVar.f11668h);
        }
    }

    public int b() {
        if (this.f11669i) {
            return this.f11668h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public int c() {
        if (this.f11667g) {
            return this.f11666f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f11665e;
    }

    public float e() {
        return this.f11675o;
    }

    public int f() {
        return this.f11674n;
    }

    public int g(String str, String str2, String[] strArr, String str3) {
        if (this.f11661a.isEmpty() && this.f11662b.isEmpty() && this.f11663c.isEmpty() && this.f11664d.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int C = C(C(C(0, this.f11661a, str, 1073741824), this.f11662b, str2, 2), this.f11664d, str3, 4);
        if (C == -1 || !Arrays.asList(strArr).containsAll(this.f11663c)) {
            return 0;
        }
        return C + (this.f11663c.size() * 4);
    }

    public int h() {
        int i10 = this.f11672l;
        if (i10 == -1 && this.f11673m == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f11673m == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    public Layout.Alignment i() {
        return this.f11676p;
    }

    public boolean j() {
        return this.f11669i;
    }

    public boolean k() {
        return this.f11667g;
    }

    public boolean l() {
        return this.f11670j == 1;
    }

    public boolean m() {
        return this.f11671k == 1;
    }

    public void n() {
        this.f11661a = "";
        this.f11662b = "";
        this.f11663c = Collections.emptyList();
        this.f11664d = "";
        this.f11665e = null;
        this.f11667g = false;
        this.f11669i = false;
        this.f11670j = -1;
        this.f11671k = -1;
        this.f11672l = -1;
        this.f11673m = -1;
        this.f11674n = -1;
        this.f11676p = null;
    }

    public d o(int i10) {
        this.f11668h = i10;
        this.f11669i = true;
        return this;
    }

    public d p(boolean z10) {
        this.f11672l = z10 ? 1 : 0;
        return this;
    }

    public d q(int i10) {
        this.f11666f = i10;
        this.f11667g = true;
        return this;
    }

    public d r(String str) {
        this.f11665e = q0.Y0(str);
        return this;
    }

    public d s(float f10) {
        this.f11675o = f10;
        return this;
    }

    public d t(short s10) {
        this.f11674n = s10;
        return this;
    }

    public d u(boolean z10) {
        this.f11673m = z10 ? 1 : 0;
        return this;
    }

    public d v(boolean z10) {
        this.f11670j = z10 ? 1 : 0;
        return this;
    }

    public void w(String[] strArr) {
        this.f11663c = Arrays.asList(strArr);
    }

    public void x(String str) {
        this.f11661a = str;
    }

    public void y(String str) {
        this.f11662b = str;
    }

    public void z(String str) {
        this.f11664d = str;
    }
}
