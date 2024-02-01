package l5;

import b5.c;
import b5.d;
import c5.h;
import i5.j;
import i5.v;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import w4.f;

public class l {

    /* renamed from: e  reason: collision with root package name */
    public static final int f10171e = 64;

    /* renamed from: a  reason: collision with root package name */
    public final v[] f10172a;

    /* renamed from: b  reason: collision with root package name */
    public final d f10173b;

    /* renamed from: c  reason: collision with root package name */
    public final d f10174c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10175d;

    public class a extends c.a {
        public a(InputStream inputStream, byte[] bArr) {
            super(inputStream, bArr);
        }

        public a(byte[] bArr) {
            super(bArr);
        }

        public a(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
        }

        public b d(v vVar, d dVar) {
            InputStream inputStream = this.f4144a;
            byte[] bArr = this.f4145b;
            int i10 = this.f4146c;
            return new b(inputStream, bArr, i10, this.f4147d - i10, vVar, dVar);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f10177a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f10178b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10179c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10180d;

        /* renamed from: e  reason: collision with root package name */
        public final v f10181e;

        /* renamed from: f  reason: collision with root package name */
        public final d f10182f;

        public b(InputStream inputStream, byte[] bArr, int i10, int i11, v vVar, d dVar) {
            this.f10177a = inputStream;
            this.f10178b = bArr;
            this.f10179c = i10;
            this.f10180d = i11;
            this.f10181e = vVar;
            this.f10182f = dVar;
        }

        public w4.l a() throws IOException {
            v vVar = this.f10181e;
            if (vVar == null) {
                return null;
            }
            f h10 = vVar.h();
            return this.f10177a == null ? h10.t(this.f10178b, this.f10179c, this.f10180d) : h10.o(b());
        }

        public InputStream b() {
            return this.f10177a == null ? new ByteArrayInputStream(this.f10178b, this.f10179c, this.f10180d) : new h((c5.d) null, this.f10177a, this.f10178b, this.f10179c, this.f10180d);
        }

        public d c() {
            d dVar = this.f10182f;
            return dVar == null ? d.INCONCLUSIVE : dVar;
        }

        public String d() {
            return this.f10181e.h().x();
        }

        public v e() {
            return this.f10181e;
        }

        public boolean f() {
            return this.f10181e != null;
        }
    }

    public l(Collection<v> collection) {
        this((v[]) collection.toArray(new v[collection.size()]));
    }

    public l(v... vVarArr) {
        this(vVarArr, d.SOLID_MATCH, d.WEAK_MATCH, 64);
    }

    public l(v[] vVarArr, d dVar, d dVar2, int i10) {
        this.f10172a = vVarArr;
        this.f10173b = dVar;
        this.f10174c = dVar2;
        this.f10175d = i10;
    }

    public final b a(a aVar) throws IOException {
        v[] vVarArr = this.f10172a;
        int length = vVarArr.length;
        v vVar = null;
        int i10 = 0;
        d dVar = null;
        while (true) {
            if (i10 >= length) {
                break;
            }
            v vVar2 = vVarArr[i10];
            aVar.reset();
            d A0 = vVar2.h().A0(aVar);
            if (A0 != null && A0.ordinal() >= this.f10174c.ordinal() && (vVar == null || dVar.ordinal() < A0.ordinal())) {
                if (A0.ordinal() >= this.f10173b.ordinal()) {
                    vVar = vVar2;
                    dVar = A0;
                    break;
                }
                vVar = vVar2;
                dVar = A0;
            }
            i10++;
        }
        return aVar.d(vVar, dVar);
    }

    public b b(InputStream inputStream) throws IOException {
        return a(new a(inputStream, new byte[this.f10175d]));
    }

    public b c(byte[] bArr) throws IOException {
        return a(new a(bArr));
    }

    public b d(byte[] bArr, int i10, int i11) throws IOException {
        return a(new a(bArr, i10, i11));
    }

    public l e(i5.f fVar) {
        int length = this.f10172a.length;
        v[] vVarArr = new v[length];
        for (int i10 = 0; i10 < length; i10++) {
            vVarArr[i10] = this.f10172a[i10].k1(fVar);
        }
        return new l(vVarArr, this.f10173b, this.f10174c, this.f10175d);
    }

    public l f(v[] vVarArr) {
        return new l(vVarArr, this.f10173b, this.f10174c, this.f10175d);
    }

    public l g(int i10) {
        return i10 == this.f10175d ? this : new l(this.f10172a, this.f10173b, this.f10174c, i10);
    }

    public l h(d dVar) {
        return dVar == this.f10174c ? this : new l(this.f10172a, this.f10173b, dVar, this.f10175d);
    }

    public l i(d dVar) {
        return dVar == this.f10173b ? this : new l(this.f10172a, dVar, this.f10174c, this.f10175d);
    }

    public l j(j jVar) {
        int length = this.f10172a.length;
        v[] vVarArr = new v[length];
        for (int i10 = 0; i10 < length; i10++) {
            vVarArr[i10] = this.f10172a[i10].m0(jVar);
        }
        return new l(vVarArr, this.f10173b, this.f10174c, this.f10175d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        v[] vVarArr = this.f10172a;
        int length = vVarArr.length;
        if (length > 0) {
            sb2.append(vVarArr[0].h().x());
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(this.f10172a[i10].h().x());
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
