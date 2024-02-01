package kh;

import gh.e;
import hh.d;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;

public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static final char f20219j = '￿';

    /* renamed from: k  reason: collision with root package name */
    public static final int f20220k = 12;

    /* renamed from: l  reason: collision with root package name */
    public static final int f20221l = 32768;

    /* renamed from: m  reason: collision with root package name */
    public static final int f20222m = 24576;

    /* renamed from: n  reason: collision with root package name */
    public static final int f20223n = 1024;

    /* renamed from: o  reason: collision with root package name */
    public static final int f20224o = 512;

    /* renamed from: a  reason: collision with root package name */
    public char[] f20225a;

    /* renamed from: b  reason: collision with root package name */
    public Reader f20226b;

    /* renamed from: c  reason: collision with root package name */
    public int f20227c;

    /* renamed from: d  reason: collision with root package name */
    public int f20228d;

    /* renamed from: e  reason: collision with root package name */
    public int f20229e;

    /* renamed from: f  reason: collision with root package name */
    public int f20230f;

    /* renamed from: g  reason: collision with root package name */
    public int f20231g;

    /* renamed from: h  reason: collision with root package name */
    public String[] f20232h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f20233i;

    public a(Reader reader) {
        this(reader, 32768);
    }

    public a(Reader reader, int i10) {
        this.f20231g = -1;
        this.f20232h = new String[512];
        d.j(reader);
        d.d(reader.markSupported());
        this.f20226b = reader;
        this.f20225a = new char[(i10 > 32768 ? 32768 : i10)];
        b();
    }

    public a(String str) {
        this(new StringReader(str), str.length());
    }

    public static boolean J(char[] cArr, int i10, int i11, String str) {
        if (i11 != str.length()) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = i11 - 1;
            if (i11 == 0) {
                return true;
            }
            int i14 = i10 + 1;
            int i15 = i12 + 1;
            if (cArr[i10] != str.charAt(i12)) {
                return false;
            }
            i10 = i14;
            i11 = i13;
            i12 = i15;
        }
    }

    public static String c(char[] cArr, String[] strArr, int i10, int i11) {
        if (i11 > 12) {
            return new String(cArr, i10, i11);
        }
        if (i11 < 1) {
            return "";
        }
        int i12 = i11 * 31;
        int i13 = 0;
        int i14 = i10;
        while (i13 < i11) {
            i12 = (i12 * 31) + cArr[i14];
            i13++;
            i14++;
        }
        int i15 = i12 & 511;
        String str = strArr[i15];
        if (str == null) {
            String str2 = new String(cArr, i10, i11);
            strArr[i15] = str2;
            return str2;
        } else if (J(cArr, i10, i11, str)) {
            return str;
        } else {
            String str3 = new String(cArr, i10, i11);
            strArr[i15] = str3;
            return str3;
        }
    }

    public boolean A(char... cArr) {
        if (t()) {
            return false;
        }
        b();
        char c10 = this.f20225a[this.f20229e];
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public boolean B(char[] cArr) {
        b();
        return !t() && Arrays.binarySearch(cArr, this.f20225a[this.f20229e]) >= 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r3.f20225a[r3.f20229e];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean C() {
        /*
            r3 = this;
            boolean r0 = r3.t()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            char[] r0 = r3.f20225a
            int r2 = r3.f20229e
            char r0 = r0[r2]
            r2 = 48
            if (r0 < r2) goto L_0x0017
            r2 = 57
            if (r0 > r2) goto L_0x0017
            r1 = 1
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.a.C():boolean");
    }

    public boolean D(String str) {
        b();
        int length = str.length();
        if (length > this.f20227c - this.f20229e) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (Character.toUpperCase(str.charAt(i10)) != Character.toUpperCase(this.f20225a[this.f20229e + i10])) {
                return false;
            }
        }
        return true;
    }

    public boolean E() {
        if (t()) {
            return false;
        }
        char c10 = this.f20225a[this.f20229e];
        return (c10 >= 'A' && c10 <= 'Z') || (c10 >= 'a' && c10 <= 'z') || Character.isLetter(c10);
    }

    public int F(char c10) {
        b();
        for (int i10 = this.f20229e; i10 < this.f20227c; i10++) {
            if (c10 == this.f20225a[i10]) {
                return i10 - this.f20229e;
            }
        }
        return -1;
    }

    public int G(CharSequence charSequence) {
        b();
        char charAt = charSequence.charAt(0);
        int i10 = this.f20229e;
        while (i10 < this.f20227c) {
            int i11 = 1;
            if (charAt != this.f20225a[i10]) {
                do {
                    i10++;
                    if (i10 >= this.f20227c) {
                        break;
                    }
                } while (charAt == this.f20225a[i10]);
            }
            int i12 = i10 + 1;
            int length = (charSequence.length() + i12) - 1;
            int i13 = this.f20227c;
            if (i10 < i13 && length <= i13) {
                int i14 = i12;
                while (i14 < length && charSequence.charAt(i11) == this.f20225a[i14]) {
                    i14++;
                    i11++;
                }
                if (i14 == length) {
                    return i10 - this.f20229e;
                }
            }
            i10 = i12;
        }
        return -1;
    }

    public int H() {
        return this.f20230f + this.f20229e;
    }

    public boolean I(int i10, int i11, String str) {
        return J(this.f20225a, i10, i11, str);
    }

    public void K() {
        int i10 = this.f20231g;
        if (i10 != -1) {
            this.f20229e = i10;
            M();
            return;
        }
        throw new e(new IOException("Mark invalid"));
    }

    public void L() {
        int i10 = this.f20229e;
        if (i10 >= 1) {
            this.f20229e = i10 - 1;
            return;
        }
        throw new e(new IOException("No buffer left to unconsume"));
    }

    public void M() {
        this.f20231g = -1;
    }

    public void a() {
        this.f20229e++;
    }

    public final void b() {
        int i10;
        int i11;
        boolean z10;
        if (!this.f20233i && (i10 = this.f20229e) >= this.f20228d) {
            int i12 = this.f20231g;
            if (i12 != -1) {
                int i13 = i12;
                i11 = i10 - i12;
                i10 = i13;
            } else {
                i11 = 0;
            }
            try {
                long j10 = (long) i10;
                long skip = this.f20226b.skip(j10);
                this.f20226b.mark(32768);
                int i14 = 0;
                while (true) {
                    z10 = true;
                    if (i14 > 1024) {
                        break;
                    }
                    Reader reader = this.f20226b;
                    char[] cArr = this.f20225a;
                    int read = reader.read(cArr, i14, cArr.length - i14);
                    if (read == -1) {
                        this.f20233i = true;
                    }
                    if (read <= 0) {
                        break;
                    }
                    i14 += read;
                }
                this.f20226b.reset();
                if (i14 > 0) {
                    if (skip != j10) {
                        z10 = false;
                    }
                    d.d(z10);
                    this.f20227c = i14;
                    this.f20230f += i10;
                    this.f20229e = i11;
                    if (this.f20231g != -1) {
                        this.f20231g = 0;
                    }
                    if (i14 > 24576) {
                        i14 = 24576;
                    }
                    this.f20228d = i14;
                }
            } catch (IOException e10) {
                throw new e(e10);
            }
        }
    }

    public void d() {
        Reader reader = this.f20226b;
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                this.f20226b = null;
                this.f20225a = null;
                this.f20232h = null;
                throw th2;
            }
            this.f20226b = null;
            this.f20225a = null;
            this.f20232h = null;
        }
    }

    public char e() {
        b();
        char c10 = u() ? 65535 : this.f20225a[this.f20229e];
        this.f20229e++;
        return c10;
    }

    public String f() {
        int i10 = this.f20229e;
        int i11 = this.f20227c;
        char[] cArr = this.f20225a;
        int i12 = i10;
        while (i12 < i11) {
            char c10 = cArr[i12];
            if (c10 == 0 || c10 == '&' || c10 == '<') {
                break;
            }
            i12++;
        }
        this.f20229e = i12;
        return i12 > i10 ? c(this.f20225a, this.f20232h, i10, i12 - i10) : "";
    }

    public String g() {
        int i10;
        char c10;
        b();
        int i11 = this.f20229e;
        while (true) {
            i10 = this.f20229e;
            if (i10 < this.f20227c && (c10 = this.f20225a[i10]) >= '0' && c10 <= '9') {
                this.f20229e = i10 + 1;
            }
        }
        return c(this.f20225a, this.f20232h, i11, i10 - i11);
    }

    public String h() {
        int i10;
        char c10;
        b();
        int i11 = this.f20229e;
        while (true) {
            i10 = this.f20229e;
            if (i10 < this.f20227c && (((c10 = this.f20225a[i10]) >= '0' && c10 <= '9') || ((c10 >= 'A' && c10 <= 'F') || (c10 >= 'a' && c10 <= 'f')))) {
                this.f20229e = i10 + 1;
            }
        }
        return c(this.f20225a, this.f20232h, i11, i10 - i11);
    }

    public String i() {
        char c10;
        b();
        int i10 = this.f20229e;
        while (true) {
            int i11 = this.f20229e;
            if (i11 < this.f20227c && (((c10 = this.f20225a[i11]) >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || Character.isLetter(c10)))) {
                this.f20229e++;
            }
        }
        return c(this.f20225a, this.f20232h, i10, this.f20229e - i10);
    }

    public String j() {
        char c10;
        b();
        int i10 = this.f20229e;
        while (true) {
            int i11 = this.f20229e;
            if (i11 < this.f20227c && (((c10 = this.f20225a[i11]) >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || Character.isLetter(c10)))) {
                this.f20229e++;
            }
        }
        while (!u() && (r1 = this.f20225a[r2]) >= '0' && r1 <= '9') {
            this.f20229e = (r2 = this.f20229e) + 1;
        }
        return c(this.f20225a, this.f20232h, i10, this.f20229e - i10);
    }

    public String k() {
        int i10 = this.f20229e;
        int i11 = this.f20227c;
        char[] cArr = this.f20225a;
        int i12 = i10;
        while (i12 < i11) {
            char c10 = cArr[i12];
            if (c10 == 0 || c10 == '<') {
                break;
            }
            i12++;
        }
        this.f20229e = i12;
        return i12 > i10 ? c(this.f20225a, this.f20232h, i10, i12 - i10) : "";
    }

    public String l() {
        b();
        int i10 = this.f20229e;
        int i11 = this.f20227c;
        char[] cArr = this.f20225a;
        int i12 = i10;
        while (i12 < i11) {
            char c10 = cArr[i12];
            if (c10 == 0 || c10 == ' ' || c10 == '/' || c10 == '<' || c10 == '>' || c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13) {
                break;
            }
            i12++;
        }
        this.f20229e = i12;
        return i12 > i10 ? c(this.f20225a, this.f20232h, i10, i12 - i10) : "";
    }

    public String m(char c10) {
        int F = F(c10);
        if (F == -1) {
            return q();
        }
        String c11 = c(this.f20225a, this.f20232h, this.f20229e, F);
        this.f20229e += F;
        return c11;
    }

    public String n(String str) {
        int G = G(str);
        if (G != -1) {
            String c10 = c(this.f20225a, this.f20232h, this.f20229e, G);
            this.f20229e += G;
            return c10;
        } else if (this.f20227c - this.f20229e < str.length()) {
            return q();
        } else {
            int length = (this.f20227c - str.length()) + 1;
            char[] cArr = this.f20225a;
            String[] strArr = this.f20232h;
            int i10 = this.f20229e;
            String c11 = c(cArr, strArr, i10, length - i10);
            this.f20229e = length;
            return c11;
        }
    }

    public String o(char... cArr) {
        b();
        int i10 = this.f20229e;
        int i11 = this.f20227c;
        char[] cArr2 = this.f20225a;
        int i12 = i10;
        loop0:
        while (i12 < i11) {
            for (char c10 : cArr) {
                if (cArr2[i12] == c10) {
                    break loop0;
                }
            }
            i12++;
        }
        this.f20229e = i12;
        return i12 > i10 ? c(this.f20225a, this.f20232h, i10, i12 - i10) : "";
    }

    public String p(char... cArr) {
        b();
        int i10 = this.f20229e;
        int i11 = this.f20227c;
        char[] cArr2 = this.f20225a;
        int i12 = i10;
        while (i12 < i11 && Arrays.binarySearch(cArr, cArr2[i12]) < 0) {
            i12++;
        }
        this.f20229e = i12;
        return i12 > i10 ? c(this.f20225a, this.f20232h, i10, i12 - i10) : "";
    }

    public String q() {
        b();
        char[] cArr = this.f20225a;
        String[] strArr = this.f20232h;
        int i10 = this.f20229e;
        String c10 = c(cArr, strArr, i10, this.f20227c - i10);
        this.f20229e = this.f20227c;
        return c10;
    }

    public boolean r(String str) {
        Locale locale = Locale.ENGLISH;
        return G(str.toLowerCase(locale)) > -1 || G(str.toUpperCase(locale)) > -1;
    }

    public char s() {
        b();
        if (u()) {
            return 65535;
        }
        return this.f20225a[this.f20229e];
    }

    public boolean t() {
        b();
        return this.f20229e >= this.f20227c;
    }

    public String toString() {
        int i10 = this.f20227c;
        int i11 = this.f20229e;
        return i10 - i11 < 0 ? "" : new String(this.f20225a, i11, i10 - i11);
    }

    public final boolean u() {
        return this.f20229e >= this.f20227c;
    }

    public void v() {
        if (this.f20227c - this.f20229e < 1024) {
            this.f20228d = 0;
        }
        b();
        this.f20231g = this.f20229e;
    }

    public boolean w(String str) {
        b();
        if (!z(str)) {
            return false;
        }
        this.f20229e += str.length();
        return true;
    }

    public boolean x(String str) {
        if (!D(str)) {
            return false;
        }
        this.f20229e += str.length();
        return true;
    }

    public boolean y(char c10) {
        return !t() && this.f20225a[this.f20229e] == c10;
    }

    public boolean z(String str) {
        b();
        int length = str.length();
        if (length > this.f20227c - this.f20229e) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != this.f20225a[this.f20229e + i10]) {
                return false;
            }
        }
        return true;
    }
}
