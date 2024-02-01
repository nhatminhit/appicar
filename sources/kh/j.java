package kh;

import hh.d;
import ih.c;

public class j {

    /* renamed from: c  reason: collision with root package name */
    public static final char f20323c = '\\';

    /* renamed from: a  reason: collision with root package name */
    public String f20324a;

    /* renamed from: b  reason: collision with root package name */
    public int f20325b = 0;

    public j(String str) {
        d.j(str);
        this.f20324a = str;
    }

    public static String D(String str) {
        StringBuilder b10 = c.b();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i10 = 0;
        char c10 = 0;
        while (i10 < length) {
            char c11 = charArray[i10];
            if (c11 != '\\' || (c10 != 0 && c10 == '\\')) {
                b10.append(c11);
            }
            i10++;
            c10 = c11;
        }
        return c.o(b10);
    }

    public char A() {
        if (r()) {
            return 0;
        }
        return this.f20324a.charAt(this.f20325b);
    }

    public String B() {
        String str = this.f20324a;
        String substring = str.substring(this.f20325b, str.length());
        this.f20325b = this.f20324a.length();
        return substring;
    }

    public final int C() {
        return this.f20324a.length() - this.f20325b;
    }

    public void a(Character ch2) {
        b(ch2.toString());
    }

    public void b(String str) {
        this.f20324a = str + this.f20324a.substring(this.f20325b);
        this.f20325b = 0;
    }

    public void c() {
        if (!r()) {
            this.f20325b++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0048 A[EDGE_INSN: B:36:0x0048->B:30:0x0048 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String d(char r10, char r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = -1
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r1
            r6 = r5
        L_0x0007:
            boolean r7 = r9.r()
            if (r7 == 0) goto L_0x000e
            goto L_0x0048
        L_0x000e:
            char r7 = r9.g()
            if (r0 == 0) goto L_0x0018
            r8 = 92
            if (r0 == r8) goto L_0x003f
        L_0x0018:
            r8 = 39
            if (r7 != r8) goto L_0x0023
            if (r7 == r10) goto L_0x0023
            if (r2 != 0) goto L_0x0023
            r3 = r3 ^ 1
            goto L_0x002d
        L_0x0023:
            r8 = 34
            if (r7 != r8) goto L_0x002d
            if (r7 == r10) goto L_0x002d
            if (r3 != 0) goto L_0x002d
            r2 = r2 ^ 1
        L_0x002d:
            if (r3 != 0) goto L_0x0046
            if (r2 == 0) goto L_0x0032
            goto L_0x0046
        L_0x0032:
            if (r7 != r10) goto L_0x003b
            int r4 = r4 + 1
            if (r5 != r1) goto L_0x003f
            int r5 = r9.f20325b
            goto L_0x003f
        L_0x003b:
            if (r7 != r11) goto L_0x003f
            int r4 = r4 + -1
        L_0x003f:
            if (r4 <= 0) goto L_0x0045
            if (r0 == 0) goto L_0x0045
            int r6 = r9.f20325b
        L_0x0045:
            r0 = r7
        L_0x0046:
            if (r4 > 0) goto L_0x0007
        L_0x0048:
            if (r6 < 0) goto L_0x0051
            java.lang.String r10 = r9.f20324a
            java.lang.String r10 = r10.substring(r5, r6)
            goto L_0x0053
        L_0x0051:
            java.lang.String r10 = ""
        L_0x0053:
            if (r4 <= 0) goto L_0x006e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Did not find balanced marker at '"
            r11.append(r0)
            r11.append(r10)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            hh.d.a(r11)
        L_0x006e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.j.d(char, char):java.lang.String");
    }

    public String e(String str) {
        String m10 = m(str);
        s(str);
        return m10;
    }

    public String f(String str) {
        String o10 = o(str);
        s(str);
        return o10;
    }

    public char g() {
        String str = this.f20324a;
        int i10 = this.f20325b;
        this.f20325b = i10 + 1;
        return str.charAt(i10);
    }

    public void h(String str) {
        if (t(str)) {
            int length = str.length();
            if (length <= C()) {
                this.f20325b += length;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public String i() {
        int i10 = this.f20325b;
        while (!r() && (z() || u('-', '_', ':'))) {
            this.f20325b++;
        }
        return this.f20324a.substring(i10, this.f20325b);
    }

    public String j() {
        int i10 = this.f20325b;
        while (!r() && (z() || u('-', '_'))) {
            this.f20325b++;
        }
        return this.f20324a.substring(i10, this.f20325b);
    }

    public String k() {
        int i10 = this.f20325b;
        while (!r() && (z() || v("*|", "|", "_", "-"))) {
            this.f20325b++;
        }
        return this.f20324a.substring(i10, this.f20325b);
    }

    public String l() {
        int i10 = this.f20325b;
        while (!r() && (z() || u(':', '_', '-'))) {
            this.f20325b++;
        }
        return this.f20324a.substring(i10, this.f20325b);
    }

    public String m(String str) {
        int indexOf = this.f20324a.indexOf(str, this.f20325b);
        if (indexOf == -1) {
            return B();
        }
        String substring = this.f20324a.substring(this.f20325b, indexOf);
        this.f20325b += substring.length();
        return substring;
    }

    public String n(String... strArr) {
        int i10 = this.f20325b;
        while (!r() && !v(strArr)) {
            this.f20325b++;
        }
        return this.f20324a.substring(i10, this.f20325b);
    }

    public String o(String str) {
        int i10;
        int i11;
        int i12 = this.f20325b;
        String substring = str.substring(0, 1);
        boolean equals = substring.toLowerCase().equals(substring.toUpperCase());
        while (!r() && !t(str)) {
            if (equals) {
                int indexOf = this.f20324a.indexOf(substring, this.f20325b);
                int i13 = this.f20325b;
                int i14 = indexOf - i13;
                if (i14 == 0) {
                    i11 = i13 + 1;
                } else if (i14 < 0) {
                    i10 = this.f20324a.length();
                } else {
                    i11 = i13 + i14;
                }
                this.f20325b = i11;
            } else {
                i10 = this.f20325b + 1;
            }
            this.f20325b = i10;
        }
        return this.f20324a.substring(i12, this.f20325b);
    }

    public boolean p() {
        boolean z10 = false;
        while (y()) {
            this.f20325b++;
            z10 = true;
        }
        return z10;
    }

    public String q() {
        int i10 = this.f20325b;
        while (z()) {
            this.f20325b++;
        }
        return this.f20324a.substring(i10, this.f20325b);
    }

    public boolean r() {
        return C() == 0;
    }

    public boolean s(String str) {
        if (!t(str)) {
            return false;
        }
        this.f20325b += str.length();
        return true;
    }

    public boolean t(String str) {
        return this.f20324a.regionMatches(true, this.f20325b, str, 0, str.length());
    }

    public String toString() {
        return this.f20324a.substring(this.f20325b);
    }

    public boolean u(char... cArr) {
        if (r()) {
            return false;
        }
        for (char c10 : cArr) {
            if (this.f20324a.charAt(this.f20325b) == c10) {
                return true;
            }
        }
        return false;
    }

    public boolean v(String... strArr) {
        for (String t10 : strArr) {
            if (t(t10)) {
                return true;
            }
        }
        return false;
    }

    public boolean w(String str) {
        return this.f20324a.startsWith(str, this.f20325b);
    }

    public boolean x() {
        return C() >= 2 && this.f20324a.charAt(this.f20325b) == '<' && Character.isLetter(this.f20324a.charAt(this.f20325b + 1));
    }

    public boolean y() {
        return !r() && c.i(this.f20324a.charAt(this.f20325b));
    }

    public boolean z() {
        return !r() && Character.isLetterOrDigit(this.f20324a.charAt(this.f20325b));
    }
}
