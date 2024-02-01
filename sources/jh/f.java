package jh;

import f6.e;
import hh.d;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import jh.i;
import kh.g;
import kh.h;
import mh.c;
import vn.tw.service.BuildConfig;
import ya.l;

public class f extends h {
    public a Y = new a();
    public g Z;

    /* renamed from: a0  reason: collision with root package name */
    public b f19954a0 = b.noQuirks;

    /* renamed from: b0  reason: collision with root package name */
    public String f19955b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f19956c0 = false;

    public static class a implements Cloneable {
        public i.c O = i.c.base;
        public Charset P;
        public ThreadLocal<CharsetEncoder> Q = new ThreadLocal<>();
        public i.b R;
        public boolean S = true;
        public boolean T = false;
        public int U = 1;
        public C0340a V = C0340a.html;

        /* renamed from: jh.f$a$a  reason: collision with other inner class name */
        public enum C0340a {
            html,
            xml
        }

        public a() {
            g(Charset.forName(l.f24694e));
        }

        public Charset a() {
            return this.P;
        }

        public a d(String str) {
            g(Charset.forName(str));
            return this;
        }

        public a g(Charset charset) {
            this.P = charset;
            return this;
        }

        /* renamed from: i */
        public a clone() {
            try {
                a aVar = (a) super.clone();
                aVar.d(this.P.name());
                aVar.O = i.c.valueOf(this.O.name());
                return aVar;
            } catch (CloneNotSupportedException e10) {
                throw new RuntimeException(e10);
            }
        }

        public CharsetEncoder j() {
            CharsetEncoder charsetEncoder = this.Q.get();
            return charsetEncoder != null ? charsetEncoder : s();
        }

        public a k(i.c cVar) {
            this.O = cVar;
            return this;
        }

        public i.c m() {
            return this.O;
        }

        public int n() {
            return this.U;
        }

        public a p(int i10) {
            d.d(i10 >= 0);
            this.U = i10;
            return this;
        }

        public a q(boolean z10) {
            this.T = z10;
            return this;
        }

        public boolean r() {
            return this.T;
        }

        public CharsetEncoder s() {
            CharsetEncoder newEncoder = this.P.newEncoder();
            this.Q.set(newEncoder);
            this.R = i.b.a(newEncoder.charset().name());
            return newEncoder;
        }

        public a t(boolean z10) {
            this.S = z10;
            return this;
        }

        public boolean u() {
            return this.S;
        }

        public C0340a v() {
            return this.V;
        }

        public a w(C0340a aVar) {
            this.V = aVar;
            return this;
        }
    }

    public enum b {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public f(String str) {
        super(h.x("#root", kh.f.f20292c), str);
        this.f19955b0 = str;
    }

    public static f z2(String str) {
        d.j(str);
        f fVar = new f(str);
        fVar.Z = fVar.L2();
        h w02 = fVar.w0("html");
        w02.w0(n7.b.f10946n);
        w02.w0("body");
        return fVar;
    }

    public g A2() {
        for (m next : this.T) {
            if (next instanceof g) {
                return (g) next;
            }
            if (!(next instanceof l)) {
                return null;
            }
        }
        return null;
    }

    public final void B2() {
        q qVar;
        if (this.f19956c0) {
            a.C0340a v10 = I2().v();
            if (v10 == a.C0340a.html) {
                h z10 = c2("meta[charset]").z();
                if (z10 == null) {
                    h D2 = D2();
                    if (D2 != null) {
                        z10 = D2.w0("meta");
                    }
                    c2("meta[name=charset]").W();
                }
                z10.n("charset", v2().displayName());
                c2("meta[name=charset]").W();
            } else if (v10 == a.C0340a.xml) {
                m mVar = v().get(0);
                if (mVar instanceof q) {
                    q qVar2 = (q) mVar;
                    if (qVar2.v0().equals("xml")) {
                        qVar2.n(wg.g.f24244n, v2().displayName());
                        if (qVar2.m(e.f7416h) != null) {
                            qVar2.n(e.f7416h, BuildConfig.VERSION_NAME);
                            return;
                        }
                        return;
                    }
                    qVar = new q("xml", false);
                } else {
                    qVar = new q("xml", false);
                }
                qVar.n(e.f7416h, BuildConfig.VERSION_NAME);
                qVar.n(wg.g.f24244n, v2().displayName());
                S1(qVar);
            }
        }
    }

    public final h C2(String str, m mVar) {
        if (mVar.N().equals(str)) {
            return (h) mVar;
        }
        int u10 = mVar.u();
        for (int i10 = 0; i10 < u10; i10++) {
            h C2 = C2(str, mVar.t(i10));
            if (C2 != null) {
                return C2;
            }
        }
        return null;
    }

    public h D2() {
        return C2(n7.b.f10946n, this);
    }

    public String E2() {
        return this.f19955b0;
    }

    public f F2() {
        h C2 = C2("html", this);
        if (C2 == null) {
            C2 = w0("html");
        }
        if (D2() == null) {
            C2.T1(n7.b.f10946n);
        }
        if (u2() == null) {
            C2.w0("body");
        }
        H2(D2());
        H2(C2);
        H2(this);
        G2(n7.b.f10946n, C2);
        G2("body", C2);
        B2();
        return this;
    }

    public final void G2(String str, h hVar) {
        c o12 = o1(str);
        h z10 = o12.z();
        if (o12.size() > 1) {
            ArrayList<m> arrayList = new ArrayList<>();
            for (int i10 = 1; i10 < o12.size(); i10++) {
                m mVar = (m) o12.get(i10);
                arrayList.addAll(mVar.D());
                mVar.Y();
            }
            for (m v02 : arrayList) {
                z10.v0(v02);
            }
        }
        if (!z10.U().equals(hVar)) {
            hVar.v0(z10);
        }
    }

    public final void H2(h hVar) {
        ArrayList arrayList = new ArrayList();
        for (m next : hVar.T) {
            if (next instanceof p) {
                p pVar = (p) next;
                if (!pVar.v0()) {
                    arrayList.add(pVar);
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m mVar = (m) arrayList.get(size);
            hVar.a0(mVar);
            u2().S1(new p(" "));
            u2().S1(mVar);
        }
    }

    public a I2() {
        return this.Y;
    }

    public f J2(a aVar) {
        d.j(aVar);
        this.Y = aVar;
        return this;
    }

    public f K2(g gVar) {
        this.Z = gVar;
        return this;
    }

    public g L2() {
        return this.Z;
    }

    public b M2() {
        return this.f19954a0;
    }

    public String N() {
        return "#document";
    }

    public f N2(b bVar) {
        this.f19954a0 = bVar;
        return this;
    }

    public String O2() {
        h z10 = o1("title").z();
        return z10 != null ? ih.c.m(z10.l2()).trim() : "";
    }

    public String P() {
        return super.x1();
    }

    public void P2(String str) {
        d.j(str);
        h z10 = o1("title").z();
        if (z10 == null) {
            D2().w0("title").m2(str);
        } else {
            z10.m2(str);
        }
    }

    public void Q2(boolean z10) {
        this.f19956c0 = z10;
    }

    public boolean R2() {
        return this.f19956c0;
    }

    public h m2(String str) {
        u2().m2(str);
        return this;
    }

    public h u2() {
        return C2("body", this);
    }

    public Charset v2() {
        return this.Y.a();
    }

    public void w2(Charset charset) {
        Q2(true);
        this.Y.g(charset);
        B2();
    }

    /* renamed from: x2 */
    public f z() {
        f fVar = (f) super.z();
        fVar.Y = this.Y.clone();
        return fVar;
    }

    public h y2(String str) {
        return new h(h.x(str, kh.f.f20293d), q());
    }
}
