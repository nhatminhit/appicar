package jh;

import gh.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jh.f;
import mh.c;
import mh.e;
import mh.g;

public abstract class m implements Cloneable {
    public static final String Q = "";
    public m O;
    public int P;

    public static class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public Appendable f19971a;

        /* renamed from: b  reason: collision with root package name */
        public f.a f19972b;

        public a(Appendable appendable, f.a aVar) {
            this.f19971a = appendable;
            this.f19972b = aVar;
            aVar.s();
        }

        public void a(m mVar, int i10) {
            try {
                mVar.R(this.f19971a, i10, this.f19972b);
            } catch (IOException e10) {
                throw new d((Throwable) e10);
            }
        }

        public void b(m mVar, int i10) {
            if (!mVar.N().equals("#text")) {
                try {
                    mVar.S(this.f19971a, i10, this.f19972b);
                } catch (IOException e10) {
                    throw new d((Throwable) e10);
                }
            }
        }
    }

    public m A(m mVar) {
        try {
            m mVar2 = (m) super.clone();
            mVar2.O = mVar;
            mVar2.P = mVar == null ? 0 : this.P;
            return mVar2;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public abstract void B(String str);

    public abstract m C();

    public abstract List<m> D();

    public m E(e eVar) {
        hh.d.j(eVar);
        mh.f.a(eVar, this);
        return this;
    }

    public final h F(h hVar) {
        c H0 = hVar.H0();
        return H0.size() > 0 ? F((h) H0.get(0)) : hVar;
    }

    public boolean G(String str) {
        hh.d.j(str);
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (p().E(substring) && !a(substring).equals("")) {
                return true;
            }
        }
        return p().E(str);
    }

    public abstract boolean H();

    public boolean I() {
        return this.O != null;
    }

    public boolean J(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return P().equals(((m) obj).P());
    }

    public <T extends Appendable> T K(T t10) {
        Q(t10);
        return t10;
    }

    public void L(Appendable appendable, int i10, f.a aVar) throws IOException {
        appendable.append(10).append(ih.c.n(i10 * aVar.n()));
    }

    public m M() {
        m mVar = this.O;
        if (mVar == null) {
            return null;
        }
        List<m> D = mVar.D();
        int i10 = this.P + 1;
        if (D.size() > i10) {
            return D.get(i10);
        }
        return null;
    }

    public abstract String N();

    public void O() {
    }

    public String P() {
        StringBuilder b10 = ih.c.b();
        Q(b10);
        return ih.c.o(b10);
    }

    public void Q(Appendable appendable) {
        mh.f.c(new a(appendable, n.a(this)), this);
    }

    public abstract void R(Appendable appendable, int i10, f.a aVar) throws IOException;

    public abstract void S(Appendable appendable, int i10, f.a aVar) throws IOException;

    public f T() {
        m e02 = e0();
        if (e02 instanceof f) {
            return (f) e02;
        }
        return null;
    }

    public m U() {
        return this.O;
    }

    public final m V() {
        return this.O;
    }

    public m W() {
        m mVar = this.O;
        if (mVar != null && this.P > 0) {
            return mVar.D().get(this.P - 1);
        }
        return null;
    }

    public final void X(int i10) {
        List<m> D = D();
        while (i10 < D.size()) {
            D.get(i10).h0(i10);
            i10++;
        }
    }

    public void Y() {
        hh.d.j(this.O);
        this.O.a0(this);
    }

    public m Z(String str) {
        hh.d.j(str);
        p().T(str);
        return this;
    }

    public String a(String str) {
        hh.d.h(str);
        return !G(str) ? "" : ih.c.p(q(), m(str));
    }

    public void a0(m mVar) {
        hh.d.d(mVar.O == this);
        int i10 = mVar.P;
        D().remove(i10);
        X(i10);
        mVar.O = null;
    }

    public void b0(m mVar) {
        mVar.g0(this);
    }

    public void c0(m mVar, m mVar2) {
        hh.d.d(mVar.O == this);
        hh.d.j(mVar2);
        m mVar3 = mVar2.O;
        if (mVar3 != null) {
            mVar3.a0(mVar2);
        }
        int i10 = mVar.P;
        D().set(i10, mVar2);
        mVar2.O = this;
        mVar2.h0(i10);
        mVar.O = null;
    }

    public void d(int i10, m... mVarArr) {
        hh.d.j(mVarArr);
        if (mVarArr.length != 0) {
            List<m> D = D();
            m U = mVarArr[0].U();
            if (U == null || U.u() != mVarArr.length) {
                hh.d.f(mVarArr);
                for (m b02 : mVarArr) {
                    b0(b02);
                }
                D.addAll(i10, Arrays.asList(mVarArr));
                X(i10);
                return;
            }
            List<m> v10 = U.v();
            int length = mVarArr.length;
            while (true) {
                int i11 = length - 1;
                if (length <= 0 || mVarArr[i11] != v10.get(i11)) {
                    U.C();
                    D.addAll(i10, Arrays.asList(mVarArr));
                    int length2 = mVarArr.length;
                } else {
                    length = i11;
                }
            }
            U.C();
            D.addAll(i10, Arrays.asList(mVarArr));
            int length22 = mVarArr.length;
            while (true) {
                int i12 = length22 - 1;
                if (length22 > 0) {
                    mVarArr[i12].O = this;
                    length22 = i12;
                } else {
                    X(i10);
                    return;
                }
            }
        }
    }

    public void d0(m mVar) {
        hh.d.j(mVar);
        hh.d.j(this.O);
        this.O.c0(this, mVar);
    }

    public m e0() {
        m mVar = this;
        while (true) {
            m mVar2 = mVar.O;
            if (mVar2 == null) {
                return mVar;
            }
            mVar = mVar2;
        }
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public void f0(String str) {
        hh.d.j(str);
        B(str);
    }

    public void g(m... mVarArr) {
        List<m> D = D();
        for (m mVar : mVarArr) {
            b0(mVar);
            D.add(mVar);
            mVar.h0(D.size() - 1);
        }
    }

    public void g0(m mVar) {
        hh.d.j(mVar);
        m mVar2 = this.O;
        if (mVar2 != null) {
            mVar2.a0(this);
        }
        this.O = mVar;
    }

    public void h0(int i10) {
        this.P = i10;
    }

    public final void i(int i10, String str) {
        hh.d.j(str);
        hh.d.j(this.O);
        this.O.d(i10, (m[]) n.b(this).i(str, U() instanceof h ? (h) U() : null, q()).toArray(new m[0]));
    }

    public m i0() {
        return A((m) null);
    }

    public m j(String str) {
        i(this.P + 1, str);
        return this;
    }

    public int j0() {
        return this.P;
    }

    public m k(m mVar) {
        hh.d.j(mVar);
        hh.d.j(this.O);
        this.O.d(this.P + 1, mVar);
        return this;
    }

    public List<m> k0() {
        m mVar = this.O;
        if (mVar == null) {
            return Collections.emptyList();
        }
        List<m> D = mVar.D();
        ArrayList arrayList = new ArrayList(D.size() - 1);
        for (m next : D) {
            if (next != this) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public m l0(g gVar) {
        hh.d.j(gVar);
        mh.f.c(gVar, this);
        return this;
    }

    public String m(String str) {
        hh.d.j(str);
        if (!H()) {
            return "";
        }
        String A = p().A(str);
        return A.length() > 0 ? A : str.startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public m m0() {
        hh.d.j(this.O);
        List<m> D = D();
        m mVar = D.size() > 0 ? D.get(0) : null;
        this.O.d(this.P, w());
        Y();
        return mVar;
    }

    public m n(String str, String str2) {
        p().Q(n.b(this).o().a(str), str2);
        return this;
    }

    public m n0(String str) {
        hh.d.h(str);
        List<m> i10 = n.b(this).i(str, U() instanceof h ? (h) U() : null, q());
        m mVar = i10.get(0);
        if (!(mVar instanceof h)) {
            return null;
        }
        h hVar = (h) mVar;
        h F = F(hVar);
        this.O.c0(this, hVar);
        F.g(this);
        if (i10.size() > 0) {
            for (int i11 = 0; i11 < i10.size(); i11++) {
                m mVar2 = i10.get(i11);
                mVar2.O.a0(mVar2);
                hVar.v0(mVar2);
            }
        }
        return this;
    }

    public abstract b p();

    public abstract String q();

    public m r(String str) {
        i(this.P, str);
        return this;
    }

    public m s(m mVar) {
        hh.d.j(mVar);
        hh.d.j(this.O);
        this.O.d(this.P, mVar);
        return this;
    }

    public m t(int i10) {
        return D().get(i10);
    }

    public String toString() {
        return P();
    }

    public abstract int u();

    public List<m> v() {
        return Collections.unmodifiableList(D());
    }

    public m[] w() {
        return (m[]) D().toArray(new m[0]);
    }

    public List<m> x() {
        List<m> D = D();
        ArrayList arrayList = new ArrayList(D.size());
        for (m z10 : D) {
            arrayList.add(z10.clone());
        }
        return arrayList;
    }

    public m y() {
        Iterator<a> it = p().iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        return this;
    }

    /* renamed from: z */
    public m clone() {
        m A = A((m) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(A);
        while (!linkedList.isEmpty()) {
            m mVar = (m) linkedList.remove();
            int u10 = mVar.u();
            for (int i10 = 0; i10 < u10; i10++) {
                List<m> D = mVar.D();
                m A2 = D.get(i10).A(mVar);
                D.set(i10, A2);
                linkedList.add(A2);
            }
        }
        return A;
    }
}
