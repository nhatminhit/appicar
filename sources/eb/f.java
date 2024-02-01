package eb;

public final class f implements g {
    public static void c(char c10, StringBuilder sb2) {
        if (c10 >= ' ' && c10 <= '?') {
            sb2.append(c10);
        } else if (c10 < '@' || c10 > '^') {
            j.f(c10);
        } else {
            sb2.append((char) (c10 - '@'));
        }
    }

    public static String d(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            char c10 = 0;
            char charAt = charSequence.charAt(0);
            char charAt2 = length >= 2 ? charSequence.charAt(1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(2) : 0;
            if (length >= 4) {
                c10 = charSequence.charAt(3);
            }
            int i10 = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c10;
            char c11 = (char) ((i10 >> 8) & 255);
            char c12 = (char) (i10 & 255);
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append((char) ((i10 >> 16) & 255));
            if (length >= 2) {
                sb2.append(c11);
            }
            if (length >= 3) {
                sb2.append(c12);
            }
            return sb2.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    public static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z10 = true;
                if (length == 1) {
                    hVar.q();
                    int b10 = hVar.h().b() - hVar.a();
                    int g10 = hVar.g();
                    if (g10 > b10) {
                        hVar.r(hVar.a() + 1);
                        b10 = hVar.h().b() - hVar.a();
                    }
                    if (g10 <= b10 && b10 <= 2) {
                        hVar.p(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i10 = length - 1;
                    String d10 = d(charSequence);
                    if (!(!hVar.j()) || i10 > 2) {
                        z10 = false;
                    }
                    if (i10 <= 2) {
                        hVar.r(hVar.a() + i10);
                        if (hVar.h().b() - hVar.a() >= 3) {
                            hVar.r(hVar.a() + d10.length());
                            z10 = false;
                        }
                    }
                    if (z10) {
                        hVar.l();
                        hVar.f18546f -= i10;
                    } else {
                        hVar.t(d10);
                    }
                    hVar.p(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.p(0);
        }
    }

    public int a() {
        return 4;
    }

    public void b(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.j()) {
                break;
            }
            c(hVar.d(), sb2);
            hVar.f18546f++;
            if (sb2.length() >= 4) {
                hVar.t(d(sb2));
                sb2.delete(0, 4);
                if (j.o(hVar.e(), hVar.f18546f, a()) != a()) {
                    hVar.p(0);
                    break;
                }
            }
        }
        sb2.append(31);
        e(hVar, sb2);
    }
}
