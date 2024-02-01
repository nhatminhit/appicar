package ua;

import java.util.LinkedList;
import ya.a;

public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final f f23335e = new f(g.f23340b, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f23336a;

    /* renamed from: b  reason: collision with root package name */
    public final g f23337b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23338c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23339d;

    public f(g gVar, int i10, int i11, int i12) {
        this.f23337b = gVar;
        this.f23336a = i10;
        this.f23338c = i11;
        this.f23339d = i12;
    }

    public static int b(f fVar) {
        int i10 = fVar.f23338c;
        if (i10 > 62) {
            return 21;
        }
        if (i10 > 31) {
            return 20;
        }
        return i10 > 0 ? 10 : 0;
    }

    public f a(int i10) {
        g gVar = this.f23337b;
        int i11 = this.f23336a;
        int i12 = this.f23339d;
        if (i11 == 4 || i11 == 2) {
            int i13 = d.f23329h[i11][0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            gVar = gVar.a(i14, i15);
            i12 += i15;
            i11 = 0;
        }
        int i16 = this.f23338c;
        f fVar = new f(gVar, i11, i16 + 1, i12 + ((i16 == 0 || i16 == 31) ? 18 : i16 == 62 ? 9 : 8));
        return fVar.f23338c == 2078 ? fVar.c(i10 + 1) : fVar;
    }

    public f c(int i10) {
        int i11 = this.f23338c;
        return i11 == 0 ? this : new f(this.f23337b.b(i10 - i11, i11), this.f23336a, 0, this.f23339d);
    }

    public int d() {
        return this.f23338c;
    }

    public int e() {
        return this.f23339d;
    }

    public int f() {
        return this.f23336a;
    }

    public g g() {
        return this.f23337b;
    }

    public boolean h(f fVar) {
        int i10 = this.f23339d + (d.f23329h[this.f23336a][fVar.f23336a] >> 16);
        int i11 = this.f23338c;
        int i12 = fVar.f23338c;
        if (i11 < i12) {
            i10 += b(fVar) - b(this);
        } else if (i11 > i12 && i12 > 0) {
            i10 += 10;
        }
        return i10 <= fVar.f23339d;
    }

    public f i(int i10, int i11) {
        int i12 = this.f23339d;
        g gVar = this.f23337b;
        int i13 = this.f23336a;
        if (i10 != i13) {
            int i14 = d.f23329h[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar = gVar.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new f(gVar.a(i11, i17), i10, 0, i12 + i17);
    }

    public f j(int i10, int i11) {
        g gVar = this.f23337b;
        int i12 = this.f23336a;
        int i13 = i12 == 2 ? 4 : 5;
        return new f(gVar.a(d.f23331j[i12][i10], i13).a(i11, 5), this.f23336a, 0, this.f23339d + i13 + 5);
    }

    public a k(byte[] bArr) {
        LinkedList<g> linkedList = new LinkedList<>();
        for (g gVar = c(bArr.length).f23337b; gVar != null; gVar = gVar.d()) {
            linkedList.addFirst(gVar);
        }
        a aVar = new a();
        for (g c10 : linkedList) {
            c10.c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{d.f23323b[this.f23336a], Integer.valueOf(this.f23339d), Integer.valueOf(this.f23338c)});
    }
}
