package androidx.databinding;

import androidx.databinding.i;
import androidx.databinding.y;
import d.m0;
import e1.m;

public class s extends i<y.a, y, b> {
    public static final m.c<b> U = new m.c<>(10);
    public static final int V = 0;
    public static final int W = 1;
    public static final int X = 2;
    public static final int Y = 3;
    public static final int Z = 4;

    /* renamed from: a0  reason: collision with root package name */
    public static final i.a<y.a, y, b> f2370a0 = new a();

    public class a extends i.a<y.a, y, b> {
        /* renamed from: b */
        public void a(y.a aVar, y yVar, int i10, b bVar) {
            if (i10 == 1) {
                aVar.f(yVar, bVar.f2371a, bVar.f2372b);
            } else if (i10 == 2) {
                aVar.g(yVar, bVar.f2371a, bVar.f2372b);
            } else if (i10 == 3) {
                aVar.h(yVar, bVar.f2371a, bVar.f2373c, bVar.f2372b);
            } else if (i10 != 4) {
                aVar.a(yVar);
            } else {
                aVar.i(yVar, bVar.f2371a, bVar.f2372b);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2371a;

        /* renamed from: b  reason: collision with root package name */
        public int f2372b;

        /* renamed from: c  reason: collision with root package name */
        public int f2373c;
    }

    public s() {
        super(f2370a0);
    }

    public static b w(int i10, int i11, int i12) {
        b b10 = U.b();
        if (b10 == null) {
            b10 = new b();
        }
        b10.f2371a = i10;
        b10.f2373c = i11;
        b10.f2372b = i12;
        return b10;
    }

    public void A(@m0 y yVar, int i10, int i11) {
        n(yVar, 2, w(i10, 0, i11));
    }

    public void B(@m0 y yVar, int i10, int i11, int i12) {
        n(yVar, 3, w(i10, i11, i12));
    }

    public void C(@m0 y yVar, int i10, int i11) {
        n(yVar, 4, w(i10, 0, i11));
    }

    /* renamed from: x */
    public synchronized void n(@m0 y yVar, int i10, b bVar) {
        super.n(yVar, i10, bVar);
        if (bVar != null) {
            U.a(bVar);
        }
    }

    public void y(@m0 y yVar) {
        n(yVar, 0, (b) null);
    }

    public void z(@m0 y yVar, int i10, int i11) {
        n(yVar, 1, w(i10, 0, i11));
    }
}
