package ab;

import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final a f16047a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f16048b;

    public d(a aVar) {
        this.f16047a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f16048b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    public final b a(int i10) {
        if (i10 >= this.f16048b.size()) {
            List<b> list = this.f16048b;
            b bVar = list.get(list.size() - 1);
            for (int size = this.f16048b.size(); size <= i10; size++) {
                a aVar = this.f16047a;
                bVar = bVar.i(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f16048b.add(bVar);
            }
        }
        return this.f16048b.get(i10);
    }

    public void b(int[] iArr, int i10) {
        if (i10 != 0) {
            int length = iArr.length - i10;
            if (length > 0) {
                b a10 = a(i10);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] e10 = new b(this.f16047a, iArr2).j(i10, 1).b(a10)[1].e();
                int length2 = i10 - e10.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    iArr[length + i11] = 0;
                }
                System.arraycopy(e10, 0, iArr, length + length2, e10.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
