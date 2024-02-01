package jh;

import hh.d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import jh.f;
import mh.d;
import mh.e;
import mh.g;
import mh.i;
import p7.f;

public class h extends m {
    public static final List<m> V = Collections.emptyList();
    public static final Pattern W = Pattern.compile("\\s+");
    public static final String X = b.J("baseUri");
    public kh.h R;
    public WeakReference<List<h>> S;
    public List<m> T;
    public b U;

    public class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringBuilder f19957a;

        public a(StringBuilder sb2) {
            this.f19957a = sb2;
        }

        public void a(m mVar, int i10) {
            if (mVar instanceof p) {
                h.x0(this.f19957a, (p) mVar);
            } else if (mVar instanceof h) {
                h hVar = (h) mVar;
                if (this.f19957a.length() <= 0) {
                    return;
                }
                if ((hVar.F1() || hVar.R.g().equals(n7.b.f10951s)) && !p.w0(this.f19957a)) {
                    this.f19957a.append(f.f11698i);
                }
            }
        }

        public void b(m mVar, int i10) {
            if ((mVar instanceof h) && ((h) mVar).F1() && (mVar.M() instanceof p) && !p.w0(this.f19957a)) {
                this.f19957a.append(f.f11698i);
            }
        }
    }

    public class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringBuilder f19959a;

        public b(StringBuilder sb2) {
            this.f19959a = sb2;
        }

        public void a(m mVar, int i10) {
            if (mVar instanceof p) {
                this.f19959a.append(((p) mVar).u0());
            }
        }

        public void b(m mVar, int i10) {
        }
    }

    public static final class c extends hh.a<m> {
        public final h O;

        public c(h hVar, int i10) {
            super(i10);
            this.O = hVar;
        }

        public void i() {
            this.O.O();
        }
    }

    public h(String str) {
        this(kh.h.w(str), "", (b) null);
    }

    public h(kh.h hVar, String str) {
        this(hVar, str, (b) null);
    }

    public h(kh.h hVar, String str, b bVar) {
        d.j(hVar);
        this.T = V;
        this.U = bVar;
        this.R = hVar;
        if (str != null) {
            f0(str);
        }
    }

    public static void A0(h hVar, StringBuilder sb2) {
        if (hVar.R.g().equals(n7.b.f10951s) && !p.w0(sb2)) {
            sb2.append(" ");
        }
    }

    public static <E extends h> int A1(h hVar, List<E> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10) == hVar) {
                return i10;
            }
        }
        return 0;
    }

    public static boolean V1(m mVar) {
        if (mVar instanceof h) {
            h hVar = (h) mVar;
            int i10 = 0;
            while (!hVar.R.t()) {
                hVar = hVar.U();
                i10++;
                if (i10 < 6) {
                    if (hVar == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String b2(h hVar, String str) {
        while (hVar != null) {
            if (hVar.H() && hVar.U.D(str)) {
                return hVar.U.z(str);
            }
            hVar = hVar.U();
        }
        return "";
    }

    public static void q0(h hVar, mh.c cVar) {
        h P1 = hVar.U();
        if (P1 != null && !P1.j2().equals("#root")) {
            cVar.add(P1);
            q0(P1, cVar);
        }
    }

    public static void x0(StringBuilder sb2, p pVar) {
        String u02 = pVar.u0();
        if (V1(pVar.O) || (pVar instanceof c)) {
            sb2.append(u02);
        } else {
            ih.c.a(sb2, u02, p.w0(sb2));
        }
    }

    public void B(String str) {
        p().M(X, str);
    }

    /* renamed from: B0 */
    public h n(String str, String str2) {
        super.n(str, str2);
        return this;
    }

    public h B1(int i10, Collection<? extends m> collection) {
        d.k(collection, "Children collection to be inserted must not be null.");
        int u10 = u();
        if (i10 < 0) {
            i10 += u10 + 1;
        }
        d.e(i10 >= 0 && i10 <= u10, "Insert position out of bounds.");
        d(i10, (m[]) new ArrayList(collection).toArray(new m[0]));
        return this;
    }

    public h C0(String str, boolean z10) {
        p().O(str, z10);
        return this;
    }

    public h C1(int i10, m... mVarArr) {
        d.k(mVarArr, "Children collection to be inserted must not be null.");
        int u10 = u();
        if (i10 < 0) {
            i10 += u10 + 1;
        }
        d.e(i10 >= 0 && i10 <= u10, "Insert position out of bounds.");
        d(i10, mVarArr);
        return this;
    }

    public List<m> D() {
        if (this.T == V) {
            this.T = new c(this, 4);
        }
        return this.T;
    }

    /* renamed from: D0 */
    public h r(String str) {
        return (h) super.r(str);
    }

    public boolean D1(String str) {
        return E1(mh.h.t(str));
    }

    /* renamed from: E0 */
    public h s(m mVar) {
        return (h) super.s(mVar);
    }

    public boolean E1(mh.d dVar) {
        return dVar.a(e0(), this);
    }

    public h F0(int i10) {
        return G0().get(i10);
    }

    public boolean F1() {
        return this.R.i();
    }

    public final List<h> G0() {
        List<h> list;
        WeakReference<List<h>> weakReference = this.S;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.T.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.T.get(i10);
            if (mVar instanceof h) {
                arrayList.add((h) mVar);
            }
        }
        this.S = new WeakReference<>(arrayList);
        return arrayList;
    }

    public final boolean G1(f.a aVar) {
        return this.R.d() || (U() != null && U().i2().d()) || aVar.r();
    }

    public boolean H() {
        return this.U != null;
    }

    public mh.c H0() {
        return new mh.c(G0());
    }

    public final boolean H1(f.a aVar) {
        return i2().n() && !i2().j() && U().F1() && W() != null && !aVar.r();
    }

    public int I0() {
        return G0().size();
    }

    public h I1() {
        List<h> G0 = U().G0();
        if (G0.size() > 1) {
            return G0.get(G0.size() - 1);
        }
        return null;
    }

    public String J0() {
        return m("class").trim();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = P1().G0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jh.h J1() {
        /*
            r4 = this;
            jh.m r0 = r4.O
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            jh.h r0 = r4.U()
            java.util.List r0 = r0.G0()
            int r2 = A1(r4, r0)
            int r3 = r0.size()
            int r2 = r2 + 1
            if (r3 <= r2) goto L_0x0021
            java.lang.Object r0 = r0.get(r2)
            jh.h r0 = (jh.h) r0
            return r0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.h.J1():jh.h");
    }

    public <T extends Appendable> T K(T t10) {
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.T.get(i10).Q(t10);
        }
        return t10;
    }

    public Set<String> K0() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(W.split(J0())));
        linkedHashSet.remove("");
        return linkedHashSet;
    }

    public mh.c K1() {
        return L1(true);
    }

    public h L0(Set<String> set) {
        d.j(set);
        if (set.isEmpty()) {
            p().S("class");
        } else {
            p().M("class", ih.c.j(set, " "));
        }
        return this;
    }

    public final mh.c L1(boolean z10) {
        mh.c cVar = new mh.c();
        if (this.O == null) {
            return cVar;
        }
        cVar.add(this);
        return z10 ? cVar.K() : cVar.U();
    }

    /* renamed from: M0 */
    public h y() {
        if (this.U != null) {
            super.y();
            this.U = null;
        }
        return this;
    }

    public String M1() {
        return this.R.s();
    }

    public String N() {
        return this.R.g();
    }

    /* renamed from: N0 */
    public h z() {
        return (h) super.clone();
    }

    public String N1() {
        StringBuilder b10 = ih.c.b();
        O1(b10);
        return ih.c.o(b10).trim();
    }

    public void O() {
        super.O();
        this.S = null;
    }

    public h O0(String str) {
        return P0(mh.h.t(str));
    }

    public final void O1(StringBuilder sb2) {
        for (m next : this.T) {
            if (next instanceof p) {
                x0(sb2, (p) next);
            } else if (next instanceof h) {
                A0((h) next, sb2);
            }
        }
    }

    public h P0(mh.d dVar) {
        d.j(dVar);
        h a22 = e0();
        h hVar = this;
        while (!dVar.a(a22, hVar)) {
            hVar = hVar.U();
            if (hVar == null) {
                return null;
            }
        }
        return hVar;
    }

    /* renamed from: P1 */
    public final h U() {
        return (h) this.O;
    }

    public String Q0() {
        StringBuilder sb2;
        String sb3;
        if (z1().length() > 0) {
            sb2 = new StringBuilder();
            sb2.append("#");
            sb3 = z1();
        } else {
            StringBuilder sb4 = new StringBuilder(j2().replace(':', '|'));
            String j10 = ih.c.j(K0(), ".");
            if (j10.length() > 0) {
                sb4.append('.');
                sb4.append(j10);
            }
            if (U() == null || (U() instanceof f)) {
                return sb4.toString();
            }
            sb4.insert(0, " > ");
            if (U().c2(sb4.toString()).size() > 1) {
                sb4.append(String.format(":nth-child(%d)", new Object[]{Integer.valueOf(V0() + 1)}));
            }
            sb2 = new StringBuilder();
            sb2.append(U().Q0());
            sb3 = sb4.toString();
        }
        sb2.append(sb3);
        return sb2.toString();
    }

    public mh.c Q1() {
        mh.c cVar = new mh.c();
        q0(this, cVar);
        return cVar;
    }

    public void R(Appendable appendable, int i10, f.a aVar) throws IOException {
        if (aVar.u() && G1(aVar) && !H1(aVar) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            L(appendable, i10, aVar);
        }
        appendable.append('<').append(j2());
        b bVar = this.U;
        if (bVar != null) {
            bVar.G(appendable, aVar);
        }
        if (!this.T.isEmpty() || !this.R.r() || (aVar.v() == f.a.C0340a.html && this.R.j())) {
            appendable.append('>');
        } else {
            appendable.append(" />");
        }
    }

    public String R0() {
        String u02;
        StringBuilder b10 = ih.c.b();
        for (m next : this.T) {
            if (next instanceof e) {
                u02 = ((e) next).u0();
            } else if (next instanceof d) {
                u02 = ((d) next).u0();
            } else if (next instanceof h) {
                u02 = ((h) next).R0();
            } else if (next instanceof c) {
                u02 = ((c) next).u0();
            }
            b10.append(u02);
        }
        return ih.c.o(b10);
    }

    public h R1(String str) {
        d.j(str);
        d(0, (m[]) n.b(this).i(str, this, q()).toArray(new m[0]));
        return this;
    }

    public void S(Appendable appendable, int i10, f.a aVar) throws IOException {
        if (!this.T.isEmpty() || !this.R.r()) {
            if (aVar.u() && !this.T.isEmpty() && (this.R.d() || (aVar.r() && (this.T.size() > 1 || (this.T.size() == 1 && !(this.T.get(0) instanceof p)))))) {
                L(appendable, i10, aVar);
            }
            appendable.append("</").append(j2()).append('>');
        }
    }

    public List<e> S0() {
        ArrayList arrayList = new ArrayList();
        for (m next : this.T) {
            if (next instanceof e) {
                arrayList.add((e) next);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public h S1(m mVar) {
        d.j(mVar);
        d(0, mVar);
        return this;
    }

    public Map<String, String> T0() {
        return p().x();
    }

    public h T1(String str) {
        h hVar = new h(kh.h.x(str, n.b(this).o()), q());
        S1(hVar);
        return hVar;
    }

    /* renamed from: U0 */
    public h A(m mVar) {
        h hVar = (h) super.A(mVar);
        b bVar = this.U;
        hVar.U = bVar != null ? bVar.clone() : null;
        c cVar = new c(hVar, this.T.size());
        hVar.T = cVar;
        cVar.addAll(this.T);
        hVar.f0(q());
        return hVar;
    }

    public h U1(String str) {
        d.j(str);
        S1(new p(str));
        return this;
    }

    public int V0() {
        if (U() == null) {
            return 0;
        }
        return A1(this, U().G0());
    }

    /* renamed from: W0 */
    public h C() {
        this.T.clear();
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = P1().G0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jh.h W1() {
        /*
            r3 = this;
            jh.m r0 = r3.O
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            jh.h r0 = r3.U()
            java.util.List r0 = r0.G0()
            int r2 = A1(r3, r0)
            if (r2 <= 0) goto L_0x001d
            int r2 = r2 + -1
            java.lang.Object r0 = r0.get(r2)
            jh.h r0 = (jh.h) r0
            return r0
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.h.W1():jh.h");
    }

    /* renamed from: X0 */
    public h E(e eVar) {
        return (h) super.E(eVar);
    }

    public mh.c X1() {
        return L1(false);
    }

    public h Y0() {
        List<h> G0 = U().G0();
        if (G0.size() > 1) {
            return G0.get(0);
        }
        return null;
    }

    /* renamed from: Y1 */
    public h Z(String str) {
        return (h) super.Z(str);
    }

    public mh.c Z0() {
        return mh.a.a(new d.a(), this);
    }

    public h Z1(String str) {
        hh.d.j(str);
        Set<String> K0 = K0();
        K0.remove(str);
        L0(K0);
        return this;
    }

    public h a1(String str) {
        hh.d.h(str);
        mh.c a10 = mh.a.a(new d.p(str), this);
        if (a10.size() > 0) {
            return (h) a10.get(0);
        }
        return null;
    }

    /* renamed from: a2 */
    public h e0() {
        return (h) super.e0();
    }

    public mh.c b1(String str) {
        hh.d.h(str);
        return mh.a.a(new d.b(str.trim()), this);
    }

    public mh.c c1(String str) {
        hh.d.h(str);
        return mh.a.a(new d.C0367d(str.trim()), this);
    }

    public mh.c c2(String str) {
        return i.c(str, this);
    }

    public mh.c d1(String str, String str2) {
        return mh.a.a(new d.e(str, str2), this);
    }

    public mh.c d2(mh.d dVar) {
        return i.d(dVar, this);
    }

    public mh.c e1(String str, String str2) {
        return mh.a.a(new d.f(str, str2), this);
    }

    public h e2(String str) {
        return i.e(str, this);
    }

    public mh.c f1(String str, String str2) {
        return mh.a.a(new d.g(str, str2), this);
    }

    public h f2(mh.d dVar) {
        return mh.a.b(dVar, this);
    }

    public mh.c g1(String str, String str2) {
        try {
            return h1(str, Pattern.compile(str2));
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException("Pattern syntax error: " + str2, e10);
        }
    }

    /* renamed from: g2 */
    public h i0() {
        kh.h hVar = this.R;
        String q10 = q();
        b bVar = this.U;
        return new h(hVar, q10, bVar == null ? null : bVar.clone());
    }

    public mh.c h1(String str, Pattern pattern) {
        return mh.a.a(new d.h(str, pattern), this);
    }

    public mh.c h2() {
        if (this.O == null) {
            return new mh.c(0);
        }
        List<h> G0 = U().G0();
        mh.c cVar = new mh.c(G0.size() - 1);
        for (h next : G0) {
            if (next != this) {
                cVar.add(next);
            }
        }
        return cVar;
    }

    public mh.c i1(String str, String str2) {
        return mh.a.a(new d.i(str, str2), this);
    }

    public kh.h i2() {
        return this.R;
    }

    public mh.c j1(String str, String str2) {
        return mh.a.a(new d.j(str, str2), this);
    }

    public String j2() {
        return this.R.g();
    }

    public mh.c k1(String str) {
        hh.d.h(str);
        return mh.a.a(new d.k(str), this);
    }

    public h k2(String str) {
        hh.d.i(str, "Tag name must not be empty.");
        this.R = kh.h.x(str, n.b(this).o());
        return this;
    }

    public mh.c l1(int i10) {
        return mh.a.a(new d.q(i10), this);
    }

    public String l2() {
        StringBuilder b10 = ih.c.b();
        mh.f.c(new a(b10), this);
        return ih.c.o(b10).trim();
    }

    public mh.c m1(int i10) {
        return mh.a.a(new d.s(i10), this);
    }

    public h m2(String str) {
        hh.d.j(str);
        C();
        v0(new p(str));
        return this;
    }

    public mh.c n1(int i10) {
        return mh.a.a(new d.t(i10), this);
    }

    public List<p> n2() {
        ArrayList arrayList = new ArrayList();
        for (m next : this.T) {
            if (next instanceof p) {
                arrayList.add((p) next);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public mh.c o1(String str) {
        hh.d.h(str);
        return mh.a.a(new d.j0(ih.b.b(str)), this);
    }

    public h o2(String str) {
        hh.d.j(str);
        Set<String> K0 = K0();
        if (K0.contains(str)) {
            K0.remove(str);
        } else {
            K0.add(str);
        }
        L0(K0);
        return this;
    }

    public b p() {
        if (!H()) {
            this.U = new b();
        }
        return this.U;
    }

    public mh.c p1(String str) {
        return mh.a.a(new d.m(str), this);
    }

    /* renamed from: p2 */
    public h l0(g gVar) {
        return (h) super.l0(gVar);
    }

    public String q() {
        return b2(this, X);
    }

    public mh.c q1(String str) {
        return mh.a.a(new d.n(str), this);
    }

    public String q2() {
        return M1().equals("textarea") ? l2() : m("value");
    }

    public h r0(String str) {
        hh.d.j(str);
        Set<String> K0 = K0();
        K0.add(str);
        L0(K0);
        return this;
    }

    public mh.c r1(String str) {
        try {
            return s1(Pattern.compile(str));
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e10);
        }
    }

    public h r2(String str) {
        if (M1().equals("textarea")) {
            m2(str);
        } else {
            n("value", str);
        }
        return this;
    }

    /* renamed from: s0 */
    public h j(String str) {
        return (h) super.j(str);
    }

    public mh.c s1(Pattern pattern) {
        return mh.a.a(new d.i0(pattern), this);
    }

    public String s2() {
        StringBuilder b10 = ih.c.b();
        mh.f.c(new b(b10), this);
        return ih.c.o(b10);
    }

    /* renamed from: t0 */
    public h k(m mVar) {
        return (h) super.k(mVar);
    }

    public mh.c t1(String str) {
        try {
            return u1(Pattern.compile(str));
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e10);
        }
    }

    /* renamed from: t2 */
    public h n0(String str) {
        return (h) super.n0(str);
    }

    public int u() {
        return this.T.size();
    }

    public h u0(String str) {
        hh.d.j(str);
        g((m[]) n.b(this).i(str, this, q()).toArray(new m[0]));
        return this;
    }

    public mh.c u1(Pattern pattern) {
        return mh.a.a(new d.h0(pattern), this);
    }

    public h v0(m mVar) {
        hh.d.j(mVar);
        b0(mVar);
        D();
        this.T.add(mVar);
        mVar.h0(this.T.size() - 1);
        return this;
    }

    public boolean v1(String str) {
        if (!H()) {
            return false;
        }
        String A = this.U.A("class");
        int length = A.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(A);
            }
            boolean z10 = false;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (Character.isWhitespace(A.charAt(i11))) {
                    if (!z10) {
                        continue;
                    } else if (i11 - i10 == length2 && A.regionMatches(true, i10, str, 0, length2)) {
                        return true;
                    } else {
                        z10 = false;
                    }
                } else if (!z10) {
                    i10 = i11;
                    z10 = true;
                }
            }
            if (z10 && length - i10 == length2) {
                return A.regionMatches(true, i10, str, 0, length2);
            }
        }
        return false;
    }

    public h w0(String str) {
        h hVar = new h(kh.h.x(str, n.b(this).o()), q());
        v0(hVar);
        return hVar;
    }

    public boolean w1() {
        for (m next : this.T) {
            if (next instanceof p) {
                if (!((p) next).v0()) {
                    return true;
                }
            } else if ((next instanceof h) && ((h) next).w1()) {
                return true;
            }
        }
        return false;
    }

    public String x1() {
        StringBuilder b10 = ih.c.b();
        K(b10);
        String o10 = ih.c.o(b10);
        return n.a(this).u() ? o10.trim() : o10;
    }

    public h y0(String str) {
        hh.d.j(str);
        v0(new p(str));
        return this;
    }

    public h y1(String str) {
        C();
        u0(str);
        return this;
    }

    public h z0(h hVar) {
        hh.d.j(hVar);
        hVar.v0(this);
        return this;
    }

    public String z1() {
        return H() ? this.U.A("id") : "";
    }
}
