package ua;

import ya.a;

public final class b extends g {

    /* renamed from: c  reason: collision with root package name */
    public final short f23316c;

    /* renamed from: d  reason: collision with root package name */
    public final short f23317d;

    public b(g gVar, int i10, int i11) {
        super(gVar);
        this.f23316c = (short) i10;
        this.f23317d = (short) i11;
    }

    public void c(a aVar, byte[] bArr) {
        int i10;
        int i11 = 0;
        while (true) {
            short s10 = this.f23317d;
            if (i11 < s10) {
                if (i11 == 0 || (i11 == 31 && s10 <= 62)) {
                    int i12 = 5;
                    aVar.g(31, 5);
                    short s11 = this.f23317d;
                    if (s11 > 62) {
                        i10 = s11 - 31;
                        i12 = 16;
                    } else if (i11 == 0) {
                        aVar.g(Math.min(s11, 31), 5);
                    } else {
                        i10 = s11 - 31;
                    }
                    aVar.g(i10, i12);
                }
                aVar.g(bArr[this.f23316c + i11], 8);
                i11++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(this.f23316c);
        sb2.append("::");
        sb2.append((this.f23316c + this.f23317d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
