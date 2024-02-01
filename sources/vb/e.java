package vb;

import ab.a;
import ab.c;
import java.util.Map;
import qa.d;
import qa.h;
import ya.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final c f23587a = new c(a.f16033l);

    public final void a(byte[] bArr, int i10) throws d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f23587a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (ab.e unused) {
            throw d.a();
        }
    }

    public final ya.e b(a aVar, Map<qa.e, ?> map) throws h, d {
        j e10 = aVar.e();
        f d10 = aVar.d().d();
        b[] b10 = b.b(aVar.c(), e10, d10);
        int i10 = 0;
        for (b c10 : b10) {
            i10 += c10.c();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (b bVar : b10) {
            byte[] a10 = bVar.a();
            int c11 = bVar.c();
            a(a10, c11);
            int i12 = 0;
            while (i12 < c11) {
                bArr[i11] = a10[i12];
                i12++;
                i11++;
            }
        }
        return d.a(bArr, e10, d10, map);
    }

    public ya.e c(b bVar) throws d, h {
        return d(bVar, (Map<qa.e, ?>) null);
    }

    public ya.e d(b bVar, Map<qa.e, ?> map) throws h, d {
        d e10;
        a aVar = new a(bVar);
        h hVar = null;
        try {
            return b(aVar, map);
        } catch (h e11) {
            h hVar2 = e11;
            e10 = null;
            hVar = hVar2;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                ya.e b10 = b(aVar, map);
                b10.o(new i(true));
                return b10;
            } catch (d | h unused) {
                if (hVar != null) {
                    throw hVar;
                }
                throw e10;
            }
        } catch (d e12) {
            e10 = e12;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            ya.e b102 = b(aVar, map);
            b102.o(new i(true));
            return b102;
        }
    }

    public ya.e e(boolean[][] zArr) throws d, h {
        return f(zArr, (Map<qa.e, ?>) null);
    }

    public ya.e f(boolean[][] zArr, Map<qa.e, ?> map) throws d, h {
        return d(b.u(zArr), map);
    }
}
