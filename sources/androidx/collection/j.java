package androidx.collection;

import d.m0;
import d.o0;

public class j<E> implements Cloneable {
    public static final Object S = new Object();
    public boolean O;
    public int[] P;
    public Object[] Q;
    public int R;

    public j() {
        this(10);
    }

    public j(int i10) {
        this.O = false;
        if (i10 == 0) {
            this.P = e.f1528a;
            this.Q = e.f1530c;
            return;
        }
        int e10 = e.e(i10);
        this.P = new int[e10];
        this.Q = new Object[e10];
    }

    public void A(int i10, int i11) {
        int min = Math.min(this.R, i11 + i10);
        while (i10 < min) {
            z(i10);
            i10++;
        }
    }

    @o0
    public E B(int i10, E e10) {
        int q10 = q(i10);
        if (q10 < 0) {
            return null;
        }
        E[] eArr = this.Q;
        E e11 = eArr[q10];
        eArr[q10] = e10;
        return e11;
    }

    public boolean C(int i10, E e10, E e11) {
        int q10 = q(i10);
        if (q10 < 0) {
            return false;
        }
        E e12 = this.Q[q10];
        if (e12 != e10 && (e10 == null || !e10.equals(e12))) {
            return false;
        }
        this.Q[q10] = e11;
        return true;
    }

    public void D(int i10, E e10) {
        if (this.O) {
            m();
        }
        this.Q[i10] = e10;
    }

    public int E() {
        if (this.O) {
            m();
        }
        return this.R;
    }

    public E F(int i10) {
        if (this.O) {
            m();
        }
        return this.Q[i10];
    }

    public void a(int i10, E e10) {
        int i11 = this.R;
        if (i11 == 0 || i10 > this.P[i11 - 1]) {
            if (this.O && i11 >= this.P.length) {
                m();
            }
            int i12 = this.R;
            if (i12 >= this.P.length) {
                int e11 = e.e(i12 + 1);
                int[] iArr = new int[e11];
                Object[] objArr = new Object[e11];
                int[] iArr2 = this.P;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.Q;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.P = iArr;
                this.Q = objArr;
            }
            this.P[i12] = i10;
            this.Q[i12] = e10;
            this.R = i12 + 1;
            return;
        }
        u(i10, e10);
    }

    public void d() {
        int i10 = this.R;
        Object[] objArr = this.Q;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.R = 0;
        this.O = false;
    }

    /* renamed from: g */
    public j<E> clone() {
        try {
            j<E> jVar = (j) super.clone();
            jVar.P = (int[]) this.P.clone();
            jVar.Q = (Object[]) this.Q.clone();
            return jVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean i(int i10) {
        return q(i10) >= 0;
    }

    public boolean j(E e10) {
        return r(e10) >= 0;
    }

    @Deprecated
    public void k(int i10) {
        x(i10);
    }

    public final void m() {
        int i10 = this.R;
        int[] iArr = this.P;
        Object[] objArr = this.Q;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != S) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.O = false;
        this.R = i11;
    }

    @o0
    public E n(int i10) {
        return p(i10, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.Q[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E p(int r3, E r4) {
        /*
            r2 = this;
            int[] r0 = r2.P
            int r1 = r2.R
            int r3 = androidx.collection.e.a(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r0 = r2.Q
            r3 = r0[r3]
            java.lang.Object r0 = S
            if (r3 != r0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.j.p(int, java.lang.Object):java.lang.Object");
    }

    public int q(int i10) {
        if (this.O) {
            m();
        }
        return e.a(this.P, this.R, i10);
    }

    public int r(E e10) {
        if (this.O) {
            m();
        }
        for (int i10 = 0; i10 < this.R; i10++) {
            if (this.Q[i10] == e10) {
                return i10;
            }
        }
        return -1;
    }

    public boolean s() {
        return E() == 0;
    }

    public int t(int i10) {
        if (this.O) {
            m();
        }
        return this.P[i10];
    }

    public String toString() {
        if (E() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.R * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.R; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(t(i10));
            sb2.append('=');
            Object F = F(i10);
            if (F != this) {
                sb2.append(F);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public void u(int i10, E e10) {
        int a10 = e.a(this.P, this.R, i10);
        if (a10 >= 0) {
            this.Q[a10] = e10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.R;
        if (i11 < i12) {
            Object[] objArr = this.Q;
            if (objArr[i11] == S) {
                this.P[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.O && i12 >= this.P.length) {
            m();
            i11 = ~e.a(this.P, this.R, i10);
        }
        int i13 = this.R;
        if (i13 >= this.P.length) {
            int e11 = e.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.P;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.Q;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.P = iArr;
            this.Q = objArr2;
        }
        int i14 = this.R;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.P;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.Q;
            System.arraycopy(objArr4, i11, objArr4, i15, this.R - i11);
        }
        this.P[i11] = i10;
        this.Q[i11] = e10;
        this.R++;
    }

    public void v(@m0 j<? extends E> jVar) {
        int E = jVar.E();
        for (int i10 = 0; i10 < E; i10++) {
            u(jVar.t(i10), jVar.F(i10));
        }
    }

    @o0
    public E w(int i10, E e10) {
        E n10 = n(i10);
        if (n10 == null) {
            u(i10, e10);
        }
        return n10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.Q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.P
            int r1 = r3.R
            int r4 = androidx.collection.e.a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.Q
            r1 = r0[r4]
            java.lang.Object r2 = S
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.O = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.j.x(int):void");
    }

    public boolean y(int i10, Object obj) {
        int q10 = q(i10);
        if (q10 < 0) {
            return false;
        }
        Object F = F(q10);
        if (obj != F && (obj == null || !obj.equals(F))) {
            return false;
        }
        z(q10);
        return true;
    }

    public void z(int i10) {
        Object[] objArr = this.Q;
        Object obj = objArr[i10];
        Object obj2 = S;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.O = true;
        }
    }
}
