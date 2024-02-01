package kh;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import jh.f;
import jh.h;
import jh.m;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public m f20296a;

    /* renamed from: b  reason: collision with root package name */
    public e f20297b = e.m();

    /* renamed from: c  reason: collision with root package name */
    public f f20298c;

    public g(m mVar) {
        this.f20296a = mVar;
        this.f20298c = mVar.b();
    }

    public static g c() {
        return new g(new b());
    }

    public static f e(String str, String str2) {
        b bVar = new b();
        return bVar.e(new StringReader(str), str2, new g(bVar));
    }

    public static f f(String str, String str2) {
        f z22 = f.z2(str2);
        h u22 = z22.u2();
        List<m> g10 = g(str, u22, str2);
        m[] mVarArr = (m[]) g10.toArray(new m[0]);
        for (int length = mVarArr.length - 1; length > 0; length--) {
            mVarArr[length].Y();
        }
        for (m v02 : mVarArr) {
            u22.v0(v02);
        }
        return z22;
    }

    public static List<m> g(String str, h hVar, String str2) {
        b bVar = new b();
        return bVar.f(str, hVar, str2, new g(bVar));
    }

    public static List<m> h(String str, h hVar, String str2, e eVar) {
        b bVar = new b();
        g gVar = new g(bVar);
        gVar.f20297b = eVar;
        return bVar.f(str, hVar, str2, gVar);
    }

    public static List<m> l(String str, String str2) {
        n nVar = new n();
        return nVar.s(str, str2, new g(nVar));
    }

    public static String q(String str, boolean z10) {
        return new k(new a(str), e.m()).z(z10);
    }

    public static g r() {
        return new g(new n());
    }

    public e a() {
        return this.f20297b;
    }

    public m b() {
        return this.f20296a;
    }

    public boolean d() {
        return this.f20297b.j() > 0;
    }

    public List<m> i(String str, h hVar, String str2) {
        return this.f20296a.f(str, hVar, str2, this);
    }

    public f j(Reader reader, String str) {
        return this.f20296a.e(reader, str, this);
    }

    public f k(String str, String str2) {
        return this.f20296a.e(new StringReader(str), str2, this);
    }

    public g m(int i10) {
        this.f20297b = i10 > 0 ? e.n(i10) : e.m();
        return this;
    }

    public g n(m mVar) {
        this.f20296a = mVar;
        mVar.f20385a = this;
        return this;
    }

    public f o() {
        return this.f20298c;
    }

    public g p(f fVar) {
        this.f20298c = fVar;
        return this;
    }
}
