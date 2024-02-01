package x7;

import d.o0;
import t6.d;
import w7.w;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f15152a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15153b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15154c;

    public b(int i10, int i11, String str) {
        this.f15152a = i10;
        this.f15153b = i11;
        this.f15154c = str;
    }

    @o0
    public static b a(w wVar) {
        String str;
        wVar.R(2);
        int D = wVar.D();
        int i10 = D >> 1;
        int D2 = ((wVar.D() >> 3) & 31) | ((D & 1) << 5);
        if (i10 == 4 || i10 == 5) {
            str = d.f13036m;
        } else if (i10 == 8) {
            str = d.f13032i;
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        return new b(i10, D2, str + ".0" + i10 + ".0" + D2);
    }
}
