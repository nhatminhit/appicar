package kh;

import hh.d;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import jh.b;
import jh.f;
import jh.h;
import kh.i;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public g f20385a;

    /* renamed from: b  reason: collision with root package name */
    public a f20386b;

    /* renamed from: c  reason: collision with root package name */
    public k f20387c;

    /* renamed from: d  reason: collision with root package name */
    public f f20388d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<h> f20389e;

    /* renamed from: f  reason: collision with root package name */
    public String f20390f;

    /* renamed from: g  reason: collision with root package name */
    public i f20391g;

    /* renamed from: h  reason: collision with root package name */
    public f f20392h;

    /* renamed from: i  reason: collision with root package name */
    public i.h f20393i = new i.h();

    /* renamed from: j  reason: collision with root package name */
    public i.g f20394j = new i.g();

    public h a() {
        int size = this.f20389e.size();
        if (size > 0) {
            return this.f20389e.get(size - 1);
        }
        return null;
    }

    public abstract f b();

    public void c(String str) {
        e a10 = this.f20385a.a();
        if (a10.i()) {
            a10.add(new d(this.f20386b.H(), str));
        }
    }

    public void d(Reader reader, String str, g gVar) {
        d.k(reader, "String input must not be null");
        d.k(str, "BaseURI must not be null");
        f fVar = new f(str);
        this.f20388d = fVar;
        fVar.K2(gVar);
        this.f20385a = gVar;
        this.f20392h = gVar.o();
        this.f20386b = new a(reader);
        this.f20391g = null;
        this.f20387c = new k(this.f20386b, gVar.a());
        this.f20389e = new ArrayList<>(32);
        this.f20390f = str;
    }

    public f e(Reader reader, String str, g gVar) {
        d(reader, str, gVar);
        k();
        this.f20386b.d();
        this.f20386b = null;
        this.f20387c = null;
        this.f20389e = null;
        return this.f20388d;
    }

    public abstract List<jh.m> f(String str, h hVar, String str2, g gVar);

    public abstract boolean g(i iVar);

    public boolean h(String str) {
        i iVar = this.f20391g;
        i.g gVar = this.f20394j;
        return g((iVar == gVar ? new i.g() : gVar.m()).C(str));
    }

    public boolean i(String str) {
        i.h hVar = this.f20393i;
        return g((this.f20391g == hVar ? new i.h() : hVar.m()).C(str));
    }

    public boolean j(String str, b bVar) {
        i.h hVar = this.f20393i;
        if (this.f20391g == hVar) {
            return g(new i.h().H(str, bVar));
        }
        hVar.m();
        hVar.H(str, bVar);
        return g(hVar);
    }

    public void k() {
        i x10;
        k kVar = this.f20387c;
        i.j jVar = i.j.EOF;
        do {
            x10 = kVar.x();
            g(x10);
            x10.m();
        } while (x10.f20304a != jVar);
    }
}
