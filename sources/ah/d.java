package ah;

import javax.security.auth.x500.X500Principal;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f16113a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16114b;

    /* renamed from: c  reason: collision with root package name */
    public int f16115c;

    /* renamed from: d  reason: collision with root package name */
    public int f16116d;

    /* renamed from: e  reason: collision with root package name */
    public int f16117e;

    /* renamed from: f  reason: collision with root package name */
    public int f16118f;

    /* renamed from: g  reason: collision with root package name */
    public char[] f16119g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f16113a = name;
        this.f16114b = name.length();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        r2 = r8.f16116d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        return new java.lang.String(r1, r2, r8.f16117e - r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r8 = this;
            int r0 = r8.f16115c
            r8.f16116d = r0
            r8.f16117e = r0
        L_0x0006:
            int r0 = r8.f16115c
            int r1 = r8.f16114b
            if (r0 < r1) goto L_0x0019
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f16119g
            int r2 = r8.f16116d
            int r3 = r8.f16117e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0019:
            char[] r1 = r8.f16119g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L_0x0058
            if (r2 == r5) goto L_0x004d
            r5 = 92
            if (r2 == r5) goto L_0x003a
            if (r2 == r4) goto L_0x004d
            if (r2 == r3) goto L_0x004d
            int r3 = r8.f16117e
            int r4 = r3 + 1
            r8.f16117e = r4
            r1[r3] = r2
            goto L_0x0048
        L_0x003a:
            int r0 = r8.f16117e
            int r2 = r0 + 1
            r8.f16117e = r2
            char r2 = r8.d()
            r1[r0] = r2
            int r0 = r8.f16115c
        L_0x0048:
            int r0 = r0 + 1
            r8.f16115c = r0
            goto L_0x0006
        L_0x004d:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f16116d
            int r3 = r8.f16117e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0058:
            int r2 = r8.f16117e
            r8.f16118f = r2
            int r0 = r0 + 1
            r8.f16115c = r0
            int r0 = r2 + 1
            r8.f16117e = r0
            r1[r2] = r6
        L_0x0066:
            int r0 = r8.f16115c
            int r1 = r8.f16114b
            if (r0 >= r1) goto L_0x007f
            char[] r2 = r8.f16119g
            char r7 = r2[r0]
            if (r7 != r6) goto L_0x007f
            int r1 = r8.f16117e
            int r7 = r1 + 1
            r8.f16117e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f16115c = r0
            goto L_0x0066
        L_0x007f:
            if (r0 == r1) goto L_0x008b
            char[] r1 = r8.f16119g
            char r0 = r1[r0]
            if (r0 == r3) goto L_0x008b
            if (r0 == r4) goto L_0x008b
            if (r0 != r5) goto L_0x0006
        L_0x008b:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f16119g
            int r2 = r8.f16116d
            int r3 = r8.f16118f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.d.a():java.lang.String");
    }

    public String b(String str) {
        this.f16115c = 0;
        this.f16116d = 0;
        this.f16117e = 0;
        this.f16118f = 0;
        this.f16119g = this.f16113a.toCharArray();
        String g10 = g();
        if (g10 == null) {
            return null;
        }
        do {
            int i10 = this.f16115c;
            if (i10 == this.f16114b) {
                return null;
            }
            char c10 = this.f16119g[i10];
            String a10 = c10 != '\"' ? c10 != '#' ? (c10 == '+' || c10 == ',' || c10 == ';') ? "" : a() : f() : h();
            if (str.equalsIgnoreCase(g10)) {
                return a10;
            }
            int i11 = this.f16115c;
            if (i11 >= this.f16114b) {
                return null;
            }
            char c11 = this.f16119g[i11];
            if (c11 == ',' || c11 == ';' || c11 == '+') {
                this.f16115c = i11 + 1;
                g10 = g();
            } else {
                throw new IllegalStateException("Malformed DN: " + this.f16113a);
            }
        } while (g10 != null);
        throw new IllegalStateException("Malformed DN: " + this.f16113a);
    }

    public final int c(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 < this.f16114b) {
            char[] cArr = this.f16119g;
            char c10 = cArr[i10];
            if (c10 >= '0' && c10 <= '9') {
                i11 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i11 = c10 - 'W';
            } else if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f16113a);
            } else {
                i11 = c10 - '7';
            }
            char c11 = cArr[i13];
            if (c11 >= '0' && c11 <= '9') {
                i12 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i12 = c11 - 'W';
            } else if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f16113a);
            } else {
                i12 = c11 - '7';
            }
            return (i11 << 4) + i12;
        }
        throw new IllegalStateException("Malformed DN: " + this.f16113a);
    }

    public final char d() {
        int i10 = this.f16115c + 1;
        this.f16115c = i10;
        if (i10 != this.f16114b) {
            char c10 = this.f16119g[i10];
            if (c10 == ' ' || c10 == '%' || c10 == '\\' || c10 == '_' || c10 == '\"' || c10 == '#') {
                return c10;
            }
            switch (c10) {
                case '*':
                case '+':
                case ',':
                    return c10;
                default:
                    switch (c10) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            return c10;
                        default:
                            return e();
                    }
            }
        } else {
            throw new IllegalStateException("Unexpected end of DN: " + this.f16113a);
        }
    }

    public final char e() {
        int i10;
        int i11;
        int c10 = c(this.f16115c);
        this.f16115c++;
        if (c10 < 128) {
            return (char) c10;
        }
        if (c10 < 192 || c10 > 247) {
            return '?';
        }
        if (c10 <= 223) {
            i11 = c10 & 31;
            i10 = 1;
        } else if (c10 <= 239) {
            i10 = 2;
            i11 = c10 & 15;
        } else {
            i10 = 3;
            i11 = c10 & 7;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = this.f16115c + 1;
            this.f16115c = i13;
            if (i13 == this.f16114b || this.f16119g[i13] != '\\') {
                return '?';
            }
            int i14 = i13 + 1;
            this.f16115c = i14;
            int c11 = c(i14);
            this.f16115c++;
            if ((c11 & 192) != 128) {
                return '?';
            }
            i11 = (i11 << 6) + (c11 & 63);
        }
        return (char) i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r1 = r6.f16119g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f() {
        /*
            r6 = this;
            int r0 = r6.f16115c
            int r1 = r0 + 4
            int r2 = r6.f16114b
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L_0x0090
            r6.f16116d = r0
        L_0x000c:
            int r0 = r0 + 1
            r6.f16115c = r0
            int r0 = r6.f16115c
            int r1 = r6.f16114b
            if (r0 == r1) goto L_0x004c
            char[] r1 = r6.f16119g
            char r2 = r1[r0]
            r4 = 43
            if (r2 == r4) goto L_0x004c
            r4 = 44
            if (r2 == r4) goto L_0x004c
            r4 = 59
            if (r2 != r4) goto L_0x0027
            goto L_0x004c
        L_0x0027:
            r4 = 32
            if (r2 != r4) goto L_0x003e
            r6.f16117e = r0
        L_0x002d:
            int r0 = r0 + 1
            r6.f16115c = r0
            int r0 = r6.f16115c
            int r1 = r6.f16114b
            if (r0 >= r1) goto L_0x004e
            char[] r1 = r6.f16119g
            char r1 = r1[r0]
            if (r1 != r4) goto L_0x004e
            goto L_0x002d
        L_0x003e:
            r4 = 65
            if (r2 < r4) goto L_0x000c
            r4 = 70
            if (r2 > r4) goto L_0x000c
            int r2 = r2 + 32
            char r2 = (char) r2
            r1[r0] = r2
            goto L_0x000c
        L_0x004c:
            r6.f16117e = r0
        L_0x004e:
            int r0 = r6.f16117e
            int r1 = r6.f16116d
            int r0 = r0 - r1
            r2 = 5
            if (r0 < r2) goto L_0x0079
            r2 = r0 & 1
            if (r2 == 0) goto L_0x0079
            int r2 = r0 / 2
            byte[] r3 = new byte[r2]
            r4 = 0
            int r1 = r1 + 1
        L_0x0061:
            if (r4 >= r2) goto L_0x006f
            int r5 = r6.c(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L_0x0061
        L_0x006f:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f16119g
            int r3 = r6.f16116d
            r1.<init>(r2, r3, r0)
            return r1
        L_0x0079:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f16113a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0090:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f16113a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.d.f():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String g() {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6.f16115c
            int r1 = r6.f16114b
            r2 = 32
            if (r0 >= r1) goto L_0x0013
            char[] r3 = r6.f16119g
            char r3 = r3[r0]
            if (r3 != r2) goto L_0x0013
            int r0 = r0 + 1
            r6.f16115c = r0
            goto L_0x0000
        L_0x0013:
            if (r0 != r1) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            r6.f16116d = r0
        L_0x0019:
            int r0 = r0 + 1
            r6.f16115c = r0
            int r0 = r6.f16115c
            int r1 = r6.f16114b
            r3 = 61
            if (r0 >= r1) goto L_0x002e
            char[] r4 = r6.f16119g
            char r4 = r4[r0]
            if (r4 == r3) goto L_0x002e
            if (r4 == r2) goto L_0x002e
            goto L_0x0019
        L_0x002e:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 >= r1) goto L_0x00cb
            r6.f16117e = r0
            char[] r1 = r6.f16119g
            char r0 = r1[r0]
            if (r0 != r2) goto L_0x006d
        L_0x003a:
            int r0 = r6.f16115c
            int r1 = r6.f16114b
            if (r0 >= r1) goto L_0x004d
            char[] r5 = r6.f16119g
            char r5 = r5[r0]
            if (r5 == r3) goto L_0x004d
            if (r5 != r2) goto L_0x004d
            int r0 = r0 + 1
            r6.f16115c = r0
            goto L_0x003a
        L_0x004d:
            char[] r5 = r6.f16119g
            char r5 = r5[r0]
            if (r5 != r3) goto L_0x0056
            if (r0 == r1) goto L_0x0056
            goto L_0x006d
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r6.f16113a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006d:
            int r0 = r6.f16115c
        L_0x006f:
            int r0 = r0 + 1
            r6.f16115c = r0
            int r0 = r6.f16115c
            int r1 = r6.f16114b
            if (r0 >= r1) goto L_0x0080
            char[] r1 = r6.f16119g
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x0080
            goto L_0x006f
        L_0x0080:
            int r0 = r6.f16117e
            int r1 = r6.f16116d
            int r2 = r0 - r1
            r3 = 4
            if (r2 <= r3) goto L_0x00c0
            char[] r2 = r6.f16119g
            int r4 = r1 + 3
            char r4 = r2[r4]
            r5 = 46
            if (r4 != r5) goto L_0x00c0
            char r4 = r2[r1]
            r5 = 79
            if (r4 == r5) goto L_0x009d
            r5 = 111(0x6f, float:1.56E-43)
            if (r4 != r5) goto L_0x00c0
        L_0x009d:
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 73
            if (r4 == r5) goto L_0x00ad
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 105(0x69, float:1.47E-43)
            if (r4 != r5) goto L_0x00c0
        L_0x00ad:
            int r4 = r1 + 2
            char r4 = r2[r4]
            r5 = 68
            if (r4 == r5) goto L_0x00bd
            int r4 = r1 + 2
            char r2 = r2[r4]
            r4 = 100
            if (r2 != r4) goto L_0x00c0
        L_0x00bd:
            int r1 = r1 + r3
            r6.f16116d = r1
        L_0x00c0:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f16119g
            int r3 = r6.f16116d
            int r0 = r0 - r3
            r1.<init>(r2, r3, r0)
            return r1
        L_0x00cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r6.f16113a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.d.g():java.lang.String");
    }

    public final String h() {
        int i10 = this.f16115c + 1;
        this.f16115c = i10;
        this.f16116d = i10;
        while (true) {
            this.f16117e = i10;
            int i11 = this.f16115c;
            if (i11 != this.f16114b) {
                char[] cArr = this.f16119g;
                char c10 = cArr[i11];
                if (c10 == '\"') {
                    do {
                        this.f16115c = i11 + 1;
                        i11 = this.f16115c;
                        if (i11 >= this.f16114b || this.f16119g[i11] != ' ') {
                            char[] cArr2 = this.f16119g;
                            int i12 = this.f16116d;
                        }
                        this.f16115c = i11 + 1;
                        i11 = this.f16115c;
                        break;
                    } while (this.f16119g[i11] != ' ');
                    char[] cArr22 = this.f16119g;
                    int i122 = this.f16116d;
                    return new String(cArr22, i122, this.f16117e - i122);
                }
                if (c10 == '\\') {
                    cArr[this.f16117e] = d();
                } else {
                    cArr[this.f16117e] = c10;
                }
                this.f16115c++;
                i10 = this.f16117e + 1;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f16113a);
            }
        }
    }
}
