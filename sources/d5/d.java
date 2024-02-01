package d5;

import w4.j;
import w4.k;
import w4.l;
import w4.n;
import w4.o;

public final class d extends o {

    /* renamed from: f  reason: collision with root package name */
    public final d f6111f;

    /* renamed from: g  reason: collision with root package name */
    public b f6112g;

    /* renamed from: h  reason: collision with root package name */
    public d f6113h;

    /* renamed from: i  reason: collision with root package name */
    public String f6114i;

    /* renamed from: j  reason: collision with root package name */
    public Object f6115j;

    /* renamed from: k  reason: collision with root package name */
    public int f6116k;

    /* renamed from: l  reason: collision with root package name */
    public int f6117l;

    public d(d dVar, b bVar, int i10, int i11, int i12) {
        this.f6111f = dVar;
        this.f6112g = bVar;
        this.f14648a = i10;
        this.f6116k = i11;
        this.f6117l = i12;
        this.f14649b = -1;
    }

    public static d v(int i10, int i11, b bVar) {
        return new d((d) null, bVar, 0, i10, i11);
    }

    public static d w(b bVar) {
        return new d((d) null, bVar, 0, 1, 0);
    }

    public void A(int i10, int i11, int i12) {
        this.f14648a = i10;
        this.f14649b = -1;
        this.f6116k = i11;
        this.f6117l = i12;
        this.f6114i = null;
        this.f6115j = null;
        b bVar = this.f6112g;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void B(String str) throws n {
        this.f6114i = str;
        b bVar = this.f6112g;
        if (bVar != null) {
            r(bVar, str);
        }
    }

    public d C(b bVar) {
        this.f6112g = bVar;
        return this;
    }

    public String b() {
        return this.f6114i;
    }

    public Object c() {
        return this.f6115j;
    }

    public j f(Object obj) {
        return new j(obj, -1, this.f6116k, this.f6117l);
    }

    public boolean i() {
        return this.f6114i != null;
    }

    public void p(Object obj) {
        this.f6115j = obj;
    }

    public final void r(b bVar, String str) throws n {
        if (bVar.d(str)) {
            Object c10 = bVar.c();
            l lVar = c10 instanceof l ? (l) c10 : null;
            throw new k(lVar, "Duplicate field '" + str + "'");
        }
    }

    public d s() {
        this.f6115j = null;
        return this.f6111f;
    }

    public d t(int i10, int i11) {
        d dVar = this.f6113h;
        if (dVar == null) {
            b bVar = this.f6112g;
            dVar = new d(this, bVar == null ? null : bVar.a(), 1, i10, i11);
            this.f6113h = dVar;
        } else {
            dVar.A(1, i10, i11);
        }
        return dVar;
    }

    public d u(int i10, int i11) {
        d dVar = this.f6113h;
        if (dVar == null) {
            b bVar = this.f6112g;
            d dVar2 = new d(this, bVar == null ? null : bVar.a(), 2, i10, i11);
            this.f6113h = dVar2;
            return dVar2;
        }
        dVar.A(2, i10, i11);
        return dVar;
    }

    public boolean x() {
        int i10 = this.f14649b + 1;
        this.f14649b = i10;
        return this.f14648a != 0 && i10 > 0;
    }

    public b y() {
        return this.f6112g;
    }

    /* renamed from: z */
    public d e() {
        return this.f6111f;
    }
}
