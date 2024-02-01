package w4;

import c5.i;
import y4.c;

public class m {

    /* renamed from: f  reason: collision with root package name */
    public static final char f14638f = '/';

    /* renamed from: g  reason: collision with root package name */
    public static final m f14639g = new m();

    /* renamed from: a  reason: collision with root package name */
    public final m f14640a;

    /* renamed from: b  reason: collision with root package name */
    public volatile m f14641b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14642c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14643d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14644e;

    public m() {
        this.f14640a = null;
        this.f14643d = "";
        this.f14644e = -1;
        this.f14642c = "";
    }

    public m(String str, String str2, int i10, m mVar) {
        this.f14642c = str;
        this.f14640a = mVar;
        this.f14643d = str2;
        this.f14644e = i10;
    }

    public m(String str, String str2, m mVar) {
        this.f14642c = str;
        this.f14640a = mVar;
        this.f14643d = str2;
        this.f14644e = f(str2);
    }

    public static void a(StringBuilder sb2, char c10) {
        if (c10 == '0') {
            c10 = '~';
        } else if (c10 == '1') {
            c10 = '/';
        } else {
            sb2.append('~');
        }
        sb2.append(c10);
    }

    public static void b(StringBuilder sb2, String str) {
        String str2;
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '/') {
                str2 = "~1";
            } else if (charAt == '~') {
                str2 = "~0";
            } else {
                sb2.append(charAt);
            }
            sb2.append(str2);
        }
    }

    public static String e(m mVar, String str) {
        if (mVar == null) {
            StringBuilder sb2 = new StringBuilder(str.length() + 1);
            sb2.append('/');
            b(sb2, str);
            return sb2.toString();
        }
        String str2 = mVar.f14642c;
        StringBuilder sb3 = new StringBuilder(str.length() + 1 + str2.length());
        sb3.append('/');
        b(sb3, str);
        sb3.append(str2);
        return sb3.toString();
    }

    public static final int f(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char charAt = str.charAt(0);
        if (charAt <= '0') {
            return (length == 1 && charAt == '0') ? 0 : -1;
        }
        if (charAt > '9') {
            return -1;
        }
        for (int i10 = 1; i10 < length; i10++) {
            char charAt2 = str.charAt(i10);
            if (charAt2 > '9' || charAt2 < '0') {
                return -1;
            }
        }
        if (length != 10 || i.m(str) <= c.M0) {
            return i.k(str);
        }
        return -1;
    }

    public static m g(String str, int i10) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(Math.max(16, length));
        if (i10 > 2) {
            sb2.append(str, 1, i10 - 1);
        }
        int i11 = i10 + 1;
        a(sb2, str.charAt(i10));
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt == '/') {
                return new m(str, sb2.toString(), h(str.substring(i11)));
            }
            i11++;
            if (charAt != '~' || i11 >= length) {
                sb2.append(charAt);
            } else {
                a(sb2, str.charAt(i11));
                i11++;
            }
        }
        return new m(str, sb2.toString(), f14639g);
    }

    public static m h(String str) {
        int length = str.length();
        int i10 = 1;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt == '/') {
                return new m(str, str.substring(1, i10), h(str.substring(i10)));
            }
            i10++;
            if (charAt == '~' && i10 < length) {
                return g(str, i10);
            }
        }
        return new m(str, str.substring(1), f14639g);
    }

    public static m j(String str) throws IllegalArgumentException {
        if (str == null || str.length() == 0) {
            return f14639g;
        }
        if (str.charAt(0) == '/') {
            return h(str);
        }
        throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + "\"");
    }

    public static m k() {
        return f14639g;
    }

    public static m l(o oVar, boolean z10) {
        if (oVar == null) {
            return f14639g;
        }
        if (!oVar.j() && (!z10 || !oVar.m() || !oVar.h())) {
            oVar = oVar.e();
        }
        m mVar = null;
        while (oVar != null) {
            if (oVar.l()) {
                String b10 = oVar.b();
                if (b10 == null) {
                    b10 = "";
                }
                mVar = new m(e(mVar, b10), b10, mVar);
            } else if (oVar.k() || z10) {
                int a10 = oVar.a();
                String valueOf = String.valueOf(a10);
                mVar = new m(e(mVar, valueOf), valueOf, a10, mVar);
            }
            oVar = oVar.e();
        }
        return mVar == null ? f14639g : mVar;
    }

    public static m y(String str) {
        return j(str);
    }

    public m c() {
        m p10 = p();
        if (p10 == this) {
            return f14639g;
        }
        int length = p10.f14642c.length();
        m mVar = this.f14640a;
        String str = this.f14642c;
        return new m(str.substring(0, str.length() - length), this.f14643d, this.f14644e, mVar.d(length, p10));
    }

    public m d(int i10, m mVar) {
        if (this == mVar) {
            return f14639g;
        }
        m mVar2 = this.f14640a;
        String str = this.f14642c;
        return new m(str.substring(0, str.length() - i10), this.f14643d, this.f14644e, mVar2.d(i10, mVar));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof m)) {
            return this.f14642c.equals(((m) obj).f14642c);
        }
        return false;
    }

    public int hashCode() {
        return this.f14642c.hashCode();
    }

    public m i(m mVar) {
        m mVar2 = f14639g;
        if (this == mVar2) {
            return mVar;
        }
        if (mVar == mVar2) {
            return this;
        }
        String str = this.f14642c;
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        return j(str + mVar.f14642c);
    }

    public int m() {
        return this.f14644e;
    }

    public String n() {
        return this.f14643d;
    }

    public m o() {
        m mVar = this.f14641b;
        if (mVar == null) {
            if (this != f14639g) {
                mVar = c();
            }
            this.f14641b = mVar;
        }
        return mVar;
    }

    public m p() {
        if (this == f14639g) {
            return null;
        }
        m mVar = this;
        while (true) {
            m mVar2 = mVar.f14640a;
            if (mVar2 == f14639g) {
                return mVar;
            }
            mVar = mVar2;
        }
    }

    public m q(int i10) {
        if (i10 != this.f14644e || i10 < 0) {
            return null;
        }
        return this.f14640a;
    }

    public m r(String str) {
        if (this.f14640a == null || !this.f14643d.equals(str)) {
            return null;
        }
        return this.f14640a;
    }

    public boolean s() {
        return this.f14640a == null;
    }

    public boolean t(int i10) {
        return i10 == this.f14644e && i10 >= 0;
    }

    public String toString() {
        return this.f14642c;
    }

    public boolean u(String str) {
        return this.f14640a != null && this.f14643d.equals(str);
    }

    public boolean v() {
        return this.f14644e >= 0;
    }

    public boolean w() {
        return this.f14643d != null;
    }

    public m x() {
        return this.f14640a;
    }
}
