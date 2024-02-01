package x7;

import b6.j0;
import java.util.ArrayList;
import java.util.List;
import w7.d;
import w7.t;
import w7.w;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f15147a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15148b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15149c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15150d;

    /* renamed from: e  reason: collision with root package name */
    public final float f15151e;

    public a(List<byte[]> list, int i10, int i11, int i12, float f10) {
        this.f15147a = list;
        this.f15148b = i10;
        this.f15149c = i11;
        this.f15150d = i12;
        this.f15151e = f10;
    }

    public static byte[] a(w wVar) {
        int J = wVar.J();
        int c10 = wVar.c();
        wVar.R(J);
        return d.d(wVar.f14880a, c10, J);
    }

    public static a b(w wVar) throws j0 {
        float f10;
        int i10;
        int i11;
        try {
            wVar.R(4);
            int D = (wVar.D() & 3) + 1;
            if (D != 3) {
                ArrayList arrayList = new ArrayList();
                int D2 = wVar.D() & 31;
                for (int i12 = 0; i12 < D2; i12++) {
                    arrayList.add(a(wVar));
                }
                int D3 = wVar.D();
                for (int i13 = 0; i13 < D3; i13++) {
                    arrayList.add(a(wVar));
                }
                if (D2 > 0) {
                    t.b i14 = t.i((byte[]) arrayList.get(0), D, ((byte[]) arrayList.get(0)).length);
                    int i15 = i14.f14861e;
                    int i16 = i14.f14862f;
                    f10 = i14.f14863g;
                    i11 = i15;
                    i10 = i16;
                } else {
                    f10 = 1.0f;
                    i11 = -1;
                    i10 = -1;
                }
                return new a(arrayList, D, i11, i10, f10);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new j0("Error parsing AVC config", e10);
        }
    }
}
