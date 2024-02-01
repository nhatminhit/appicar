package eb;

public final class a implements g {
    public static char c(char c10, char c11) {
        if (j.g(c10) && j.g(c11)) {
            return (char) (((c10 - '0') * 10) + (c11 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c10 + c11);
    }

    public int a() {
        return 0;
    }

    public void b(h hVar) {
        if (j.a(hVar.e(), hVar.f18546f) >= 2) {
            hVar.s(c(hVar.e().charAt(hVar.f18546f), hVar.e().charAt(hVar.f18546f + 1)));
            hVar.f18546f += 2;
            return;
        }
        char d10 = hVar.d();
        int o10 = j.o(hVar.e(), hVar.f18546f, a());
        if (o10 != a()) {
            if (o10 == 1) {
                hVar.s(j.f18556b);
                hVar.p(1);
            } else if (o10 == 2) {
                hVar.s(j.f18562h);
                hVar.p(2);
            } else if (o10 == 3) {
                hVar.s(j.f18561g);
                hVar.p(3);
            } else if (o10 == 4) {
                hVar.s(j.f18563i);
                hVar.p(4);
            } else if (o10 == 5) {
                hVar.s(j.f18557c);
                hVar.p(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(o10)));
            }
        } else if (j.h(d10)) {
            hVar.s(j.f18558d);
            hVar.s((char) ((d10 - 128) + 1));
            hVar.f18546f++;
        } else {
            hVar.s((char) (d10 + 1));
            hVar.f18546f++;
        }
    }
}
