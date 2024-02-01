package eb;

import dg.a;

public final class b implements g {
    public static char c(char c10, int i10) {
        int i11 = c10 + ((i10 * a.Yb) % 255) + 1;
        return i11 <= 255 ? (char) i11 : (char) (i11 - 256);
    }

    public int a() {
        return 5;
    }

    public void b(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(0);
        while (true) {
            if (!hVar.j()) {
                break;
            }
            sb2.append(hVar.d());
            hVar.f18546f++;
            if (j.o(hVar.e(), hVar.f18546f, a()) != a()) {
                hVar.p(0);
                break;
            }
        }
        int length = sb2.length() - 1;
        int a10 = hVar.a() + length + 1;
        hVar.r(a10);
        boolean z10 = hVar.h().b() - a10 > 0;
        if (hVar.j() || z10) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb2.length();
        for (int i10 = 0; i10 < length2; i10++) {
            hVar.s(c(sb2.charAt(i10), hVar.a() + 1));
        }
    }
}
