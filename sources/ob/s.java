package ob;

import p7.f;
import qa.h;
import qa.m;
import ya.a;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final a f21355a;

    /* renamed from: b  reason: collision with root package name */
    public final m f21356b = new m();

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f21357c = new StringBuilder();

    public s(a aVar) {
        this.f21355a = aVar;
    }

    public static int g(a aVar, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (aVar.n(i10 + i13)) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    public String a(StringBuilder sb2, int i10) throws m, h {
        String str = null;
        while (true) {
            o c10 = c(i10, str);
            String a10 = r.a(c10.b());
            if (a10 != null) {
                sb2.append(a10);
            }
            String valueOf = c10.d() ? String.valueOf(c10.c()) : null;
            if (i10 == c10.a()) {
                return sb2.toString();
            }
            i10 = c10.a();
            str = valueOf;
        }
    }

    public final n b(int i10) {
        char c10;
        int f10 = f(i10, 5);
        if (f10 == 15) {
            return new n(i10 + 5, '$');
        }
        if (f10 >= 5 && f10 < 15) {
            return new n(i10 + 5, (char) ((f10 + 48) - 5));
        }
        int f11 = f(i10, 6);
        if (f11 >= 32 && f11 < 58) {
            return new n(i10 + 6, (char) (f11 + 33));
        }
        switch (f11) {
            case 58:
                c10 = '*';
                break;
            case 59:
                c10 = ',';
                break;
            case 60:
                c10 = '-';
                break;
            case 61:
                c10 = '.';
                break;
            case 62:
                c10 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(f11)));
        }
        return new n(i10 + 6, c10);
    }

    public o c(int i10, String str) throws h {
        this.f21357c.setLength(0);
        if (str != null) {
            this.f21357c.append(str);
        }
        this.f21356b.i(i10);
        o o10 = o();
        return (o10 == null || !o10.d()) ? new o(this.f21356b.a(), this.f21357c.toString()) : new o(this.f21356b.a(), this.f21357c.toString(), o10.c());
    }

    public final n d(int i10) throws h {
        char c10;
        int f10 = f(i10, 5);
        if (f10 == 15) {
            return new n(i10 + 5, '$');
        }
        if (f10 >= 5 && f10 < 15) {
            return new n(i10 + 5, (char) ((f10 + 48) - 5));
        }
        int f11 = f(i10, 7);
        if (f11 >= 64 && f11 < 90) {
            return new n(i10 + 7, (char) (f11 + 1));
        }
        if (f11 >= 90 && f11 < 116) {
            return new n(i10 + 7, (char) (f11 + 7));
        }
        switch (f(i10, 8)) {
            case dg.a.f17848ag:
                c10 = '!';
                break;
            case dg.a.f17890cg:
                c10 = '\"';
                break;
            case dg.a.f17974gg:
                c10 = '%';
                break;
            case dg.a.f17995hg:
                c10 = '&';
                break;
            case dg.a.f18015ig:
                c10 = '\'';
                break;
            case dg.a.f18036jg:
                c10 = '(';
                break;
            case dg.a.f18141og:
                c10 = ')';
                break;
            case dg.a.f18162pg:
                c10 = '*';
                break;
            case 240:
                c10 = '+';
                break;
            case 241:
                c10 = ',';
                break;
            case dg.a.f18226sg:
                c10 = '-';
                break;
            case dg.a.f18247tg:
                c10 = '.';
                break;
            case dg.a.f18289vg:
                c10 = '/';
                break;
            case dg.a.Sg:
                c10 = ':';
                break;
            case dg.a.Tg:
                c10 = f.f11697h;
                break;
            case dg.a.Zg:
                c10 = '<';
                break;
            case dg.a.f17849ah:
                c10 = '=';
                break;
            case 249:
                c10 = '>';
                break;
            case 250:
                c10 = '?';
                break;
            case 251:
                c10 = '_';
                break;
            case dg.a.f18058kh:
                c10 = f.f11698i;
                break;
            default:
                throw h.a();
        }
        return new n(i10 + 8, c10);
    }

    public final p e(int i10) throws h {
        int i11 = i10 + 7;
        if (i11 > this.f21355a.s()) {
            int f10 = f(i10, 4);
            return f10 == 0 ? new p(this.f21355a.s(), 10, 10) : new p(this.f21355a.s(), f10 - 1, 10);
        }
        int f11 = f(i10, 7) - 8;
        return new p(i11, f11 / 11, f11 % 11);
    }

    public int f(int i10, int i11) {
        return g(this.f21355a, i10, i11);
    }

    public final boolean h(int i10) {
        int i11 = i10 + 3;
        if (i11 > this.f21355a.s()) {
            return false;
        }
        while (i10 < i11) {
            if (this.f21355a.n(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final boolean i(int i10) {
        int i11;
        if (i10 + 1 > this.f21355a.s()) {
            return false;
        }
        int i12 = 0;
        while (i12 < 5 && (i11 = i12 + i10) < this.f21355a.s()) {
            if (i12 == 2) {
                if (!this.f21355a.n(i10 + 2)) {
                    return false;
                }
            } else if (this.f21355a.n(i11)) {
                return false;
            }
            i12++;
        }
        return true;
    }

    public final boolean j(int i10) {
        int i11;
        if (i10 + 1 > this.f21355a.s()) {
            return false;
        }
        int i12 = 0;
        while (i12 < 4 && (i11 = i12 + i10) < this.f21355a.s()) {
            if (this.f21355a.n(i11)) {
                return false;
            }
            i12++;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r6 = f(r6, 6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(int r6) {
        /*
            r5 = this;
            int r0 = r6 + 5
            ya.a r1 = r5.f21355a
            int r1 = r1.s()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r5.f(r6, r0)
            r3 = 1
            r4 = 16
            if (r1 < r0) goto L_0x0019
            if (r1 >= r4) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r6 + 6
            ya.a r1 = r5.f21355a
            int r1 = r1.s()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 6
            int r6 = r5.f(r6, r0)
            if (r6 < r4) goto L_0x0030
            r0 = 63
            if (r6 >= r0) goto L_0x0030
            return r3
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.s.k(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r5 = f(r5, 8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(int r5) {
        /*
            r4 = this;
            int r0 = r5 + 5
            ya.a r1 = r4.f21355a
            int r1 = r1.s()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r4.f(r5, r0)
            r3 = 1
            if (r1 < r0) goto L_0x0019
            r0 = 16
            if (r1 >= r0) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r5 + 7
            ya.a r1 = r4.f21355a
            int r1 = r1.s()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 7
            int r0 = r4.f(r5, r0)
            r1 = 64
            if (r0 < r1) goto L_0x0032
            r1 = 116(0x74, float:1.63E-43)
            if (r0 >= r1) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r5 + 8
            ya.a r1 = r4.f21355a
            int r1 = r1.s()
            if (r0 <= r1) goto L_0x003d
            return r2
        L_0x003d:
            r0 = 8
            int r5 = r4.f(r5, r0)
            r0 = 232(0xe8, float:3.25E-43)
            if (r5 < r0) goto L_0x004c
            r0 = 253(0xfd, float:3.55E-43)
            if (r5 >= r0) goto L_0x004c
            return r3
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.s.l(int):boolean");
    }

    public final boolean m(int i10) {
        if (i10 + 7 > this.f21355a.s()) {
            return i10 + 4 <= this.f21355a.s();
        }
        int i11 = i10;
        while (true) {
            int i12 = i10 + 3;
            if (i11 >= i12) {
                return this.f21355a.n(i12);
            }
            if (this.f21355a.n(i11)) {
                return true;
            }
            i11++;
        }
    }

    public final l n() {
        while (k(this.f21356b.a())) {
            n b10 = b(this.f21356b.a());
            this.f21356b.i(b10.a());
            if (b10.c()) {
                return new l(new o(this.f21356b.a(), this.f21357c.toString()), true);
            }
            this.f21357c.append(b10.b());
        }
        if (h(this.f21356b.a())) {
            this.f21356b.b(3);
            this.f21356b.h();
        } else if (i(this.f21356b.a())) {
            if (this.f21356b.a() + 5 < this.f21355a.s()) {
                this.f21356b.b(5);
            } else {
                this.f21356b.i(this.f21355a.s());
            }
            this.f21356b.g();
        }
        return new l(false);
    }

    public final o o() throws h {
        l n10;
        boolean b10;
        do {
            int a10 = this.f21356b.a();
            n10 = this.f21356b.c() ? n() : this.f21356b.d() ? p() : q();
            b10 = n10.b();
            if (!(a10 != this.f21356b.a()) && !b10) {
                break;
            }
        } while (!b10);
        return n10.a();
    }

    public final l p() throws h {
        while (l(this.f21356b.a())) {
            n d10 = d(this.f21356b.a());
            this.f21356b.i(d10.a());
            if (d10.c()) {
                return new l(new o(this.f21356b.a(), this.f21357c.toString()), true);
            }
            this.f21357c.append(d10.b());
        }
        if (h(this.f21356b.a())) {
            this.f21356b.b(3);
            this.f21356b.h();
        } else if (i(this.f21356b.a())) {
            if (this.f21356b.a() + 5 < this.f21355a.s()) {
                this.f21356b.b(5);
            } else {
                this.f21356b.i(this.f21355a.s());
            }
            this.f21356b.f();
        }
        return new l(false);
    }

    public final l q() throws h {
        while (m(this.f21356b.a())) {
            p e10 = e(this.f21356b.a());
            this.f21356b.i(e10.a());
            if (e10.e()) {
                return new l(e10.f() ? new o(this.f21356b.a(), this.f21357c.toString()) : new o(this.f21356b.a(), this.f21357c.toString(), e10.c()), true);
            }
            this.f21357c.append(e10.b());
            if (e10.f()) {
                return new l(new o(this.f21356b.a(), this.f21357c.toString()), true);
            }
            this.f21357c.append(e10.c());
        }
        if (j(this.f21356b.a())) {
            this.f21356b.f();
            this.f21356b.b(4);
        }
        return new l(false);
    }
}
