package mh;

import jh.h;
import jh.m;
import mh.e;

public class a {

    /* renamed from: mh.a$a  reason: collision with other inner class name */
    public static class C0365a implements g {

        /* renamed from: a  reason: collision with root package name */
        public final h f21107a;

        /* renamed from: b  reason: collision with root package name */
        public final c f21108b;

        /* renamed from: c  reason: collision with root package name */
        public final d f21109c;

        public C0365a(h hVar, c cVar, d dVar) {
            this.f21107a = hVar;
            this.f21108b = cVar;
            this.f21109c = dVar;
        }

        public void a(m mVar, int i10) {
            if (mVar instanceof h) {
                h hVar = (h) mVar;
                if (this.f21109c.a(this.f21107a, hVar)) {
                    this.f21108b.add(hVar);
                }
            }
        }

        public void b(m mVar, int i10) {
        }
    }

    public static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public final h f21110a;

        /* renamed from: b  reason: collision with root package name */
        public h f21111b = null;

        /* renamed from: c  reason: collision with root package name */
        public final d f21112c;

        public b(h hVar, d dVar) {
            this.f21110a = hVar;
            this.f21112c = dVar;
        }

        public e.a a(m mVar, int i10) {
            if (mVar instanceof h) {
                h hVar = (h) mVar;
                if (this.f21112c.a(this.f21110a, hVar)) {
                    this.f21111b = hVar;
                    return e.a.STOP;
                }
            }
            return e.a.CONTINUE;
        }

        public e.a b(m mVar, int i10) {
            return e.a.CONTINUE;
        }
    }

    public static c a(d dVar, h hVar) {
        c cVar = new c();
        f.c(new C0365a(hVar, cVar, dVar), hVar);
        return cVar;
    }

    public static h b(d dVar, h hVar) {
        b bVar = new b(hVar, dVar);
        f.a(bVar, hVar);
        return bVar.f21111b;
    }
}
