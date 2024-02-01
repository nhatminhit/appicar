package b5;

import b5.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import w4.f;

public class a {

    /* renamed from: e  reason: collision with root package name */
    public static final int f4133e = 64;

    /* renamed from: a  reason: collision with root package name */
    public final f[] f4134a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4135b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4136c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4137d;

    public a(Collection<f> collection) {
        this((f[]) collection.toArray(new f[0]));
    }

    public a(f... fVarArr) {
        this(fVarArr, d.SOLID_MATCH, d.WEAK_MATCH, 64);
    }

    public a(f[] fVarArr, d dVar, d dVar2, int i10) {
        this.f4134a = fVarArr;
        this.f4135b = dVar;
        this.f4136c = dVar2;
        this.f4137d = i10;
    }

    public final b a(c.a aVar) throws IOException {
        f[] fVarArr = this.f4134a;
        int length = fVarArr.length;
        f fVar = null;
        int i10 = 0;
        d dVar = null;
        while (true) {
            if (i10 >= length) {
                break;
            }
            f fVar2 = fVarArr[i10];
            aVar.reset();
            d A0 = fVar2.A0(aVar);
            if (A0 != null && A0.ordinal() >= this.f4136c.ordinal() && (fVar == null || dVar.ordinal() < A0.ordinal())) {
                if (A0.ordinal() >= this.f4135b.ordinal()) {
                    fVar = fVar2;
                    dVar = A0;
                    break;
                }
                fVar = fVar2;
                dVar = A0;
            }
            i10++;
        }
        return aVar.c(fVar, dVar);
    }

    public b b(InputStream inputStream) throws IOException {
        return a(new c.a(inputStream, new byte[this.f4137d]));
    }

    public b c(byte[] bArr) throws IOException {
        return a(new c.a(bArr));
    }

    public b d(byte[] bArr, int i10, int i11) throws IOException {
        return a(new c.a(bArr, i10, i11));
    }

    public a e(int i10) {
        return i10 == this.f4137d ? this : new a(this.f4134a, this.f4135b, this.f4136c, i10);
    }

    public a f(d dVar) {
        return dVar == this.f4136c ? this : new a(this.f4134a, this.f4135b, dVar, this.f4137d);
    }

    public a g(d dVar) {
        return dVar == this.f4135b ? this : new a(this.f4134a, dVar, this.f4136c, this.f4137d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        f[] fVarArr = this.f4134a;
        int length = fVarArr.length;
        if (length > 0) {
            sb2.append(fVarArr[0].x());
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(this.f4134a[i10].x());
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
