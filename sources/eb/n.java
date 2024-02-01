package eb;

public final class n extends c {
    public int a() {
        return 3;
    }

    public void b(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.j()) {
                break;
            }
            char d10 = hVar.d();
            hVar.f18546f++;
            d(d10, sb2);
            if (sb2.length() % 3 == 0) {
                c.g(hVar, sb2);
                if (j.o(hVar.e(), hVar.f18546f, a()) != a()) {
                    hVar.p(0);
                    break;
                }
            }
        }
        f(hVar, sb2);
    }

    public int d(char c10, StringBuilder sb2) {
        char c11;
        int i10;
        if (c10 == 13) {
            c11 = 0;
        } else if (c10 != ' ') {
            if (c10 == '*') {
                sb2.append(1);
            } else if (c10 != '>') {
                if (c10 >= '0' && c10 <= '9') {
                    i10 = (c10 - '0') + 4;
                } else if (c10 < 'A' || c10 > 'Z') {
                    j.f(c10);
                } else {
                    i10 = (c10 - 'A') + 14;
                }
                c11 = (char) i10;
            } else {
                c11 = 2;
            }
            return 1;
        } else {
            c11 = 3;
        }
        sb2.append(c11);
        return 1;
    }

    public void f(h hVar, StringBuilder sb2) {
        hVar.q();
        int b10 = hVar.h().b() - hVar.a();
        hVar.f18546f -= sb2.length();
        if (hVar.g() > 1 || b10 > 1 || hVar.g() != b10) {
            hVar.s(254);
        }
        if (hVar.f() < 0) {
            hVar.p(0);
        }
    }
}
