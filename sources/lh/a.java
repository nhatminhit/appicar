package lh;

import hh.d;
import java.util.Iterator;
import jh.e;
import jh.f;
import jh.h;
import jh.m;
import jh.p;
import mh.g;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public b f20947a;

    public final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public int f20948a;

        /* renamed from: b  reason: collision with root package name */
        public final h f20949b;

        /* renamed from: c  reason: collision with root package name */
        public h f20950c;

        public b(h hVar, h hVar2) {
            this.f20948a = 0;
            this.f20949b = hVar;
            this.f20950c = hVar2;
        }

        public void a(m mVar, int i10) {
            m eVar;
            if (mVar instanceof h) {
                h hVar = (h) mVar;
                if (a.this.f20947a.i(hVar.M1())) {
                    c b10 = a.this.e(hVar);
                    h hVar2 = b10.f20952a;
                    this.f20950c.v0(hVar2);
                    this.f20948a += b10.f20953b;
                    this.f20950c = hVar2;
                    return;
                } else if (mVar == this.f20949b) {
                    return;
                }
            } else {
                if (mVar instanceof p) {
                    eVar = new p(((p) mVar).u0());
                } else if ((mVar instanceof e) && a.this.f20947a.i(mVar.U().N())) {
                    eVar = new e(((e) mVar).u0());
                }
                this.f20950c.v0(eVar);
                return;
            }
            this.f20948a++;
        }

        public void b(m mVar, int i10) {
            if ((mVar instanceof h) && a.this.f20947a.i(mVar.N())) {
                this.f20950c = this.f20950c.U();
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public h f20952a;

        /* renamed from: b  reason: collision with root package name */
        public int f20953b;

        public c(h hVar, int i10) {
            this.f20952a = hVar;
            this.f20953b = i10;
        }
    }

    public a(b bVar) {
        d.j(bVar);
        this.f20947a = bVar;
    }

    public f c(f fVar) {
        d.j(fVar);
        f z22 = f.z2(fVar.q());
        if (fVar.u2() != null) {
            d(fVar.u2(), z22.u2());
        }
        return z22;
    }

    public final int d(h hVar, h hVar2) {
        b bVar = new b(hVar, hVar2);
        mh.f.c(bVar, hVar);
        return bVar.f20948a;
    }

    public final c e(h hVar) {
        String j22 = hVar.j2();
        jh.b bVar = new jh.b();
        h hVar2 = new h(kh.h.w(j22), hVar.q(), bVar);
        Iterator<jh.a> it = hVar.p().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jh.a next = it.next();
            if (this.f20947a.h(j22, hVar, next)) {
                bVar.P(next);
            } else {
                i10++;
            }
        }
        bVar.q(this.f20947a.g(j22));
        return new c(hVar2, i10);
    }

    public boolean f(f fVar) {
        d.j(fVar);
        return d(fVar.u2(), f.z2(fVar.q()).u2()) == 0 && fVar.D2().v().isEmpty();
    }

    public boolean g(String str) {
        f z22 = f.z2("");
        f z23 = f.z2("");
        kh.e n10 = kh.e.n(1);
        z23.u2().B1(0, kh.g.h(str, z23.u2(), "", n10));
        return d(z23.u2(), z22.u2()) == 0 && n10.isEmpty();
    }
}
