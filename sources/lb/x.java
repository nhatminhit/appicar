package lb;

import qa.m;
import qa.q;
import qa.r;
import ya.a;

public final class x {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f20500c = {1, 1, 2};

    /* renamed from: a  reason: collision with root package name */
    public final v f20501a = new v();

    /* renamed from: b  reason: collision with root package name */
    public final w f20502b = new w();

    public r a(int i10, a aVar, int i11) throws m {
        int[] n10 = y.n(aVar, i11, false, f20500c);
        try {
            return this.f20502b.b(i10, aVar, n10);
        } catch (q unused) {
            return this.f20501a.b(i10, aVar, n10);
        }
    }
}
