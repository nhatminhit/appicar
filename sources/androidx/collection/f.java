package androidx.collection;

import d.m0;
import d.o0;

public class f<E> implements Cloneable {
    public static final Object S = new Object();
    public boolean O;
    public long[] P;
    public Object[] Q;
    public int R;

    public f() {
        this(10);
    }

    public f(int i10) {
        this.O = false;
        if (i10 == 0) {
            this.P = e.f1529b;
            this.Q = e.f1530c;
            return;
        }
        int f10 = e.f(i10);
        this.P = new long[f10];
        this.Q = new Object[f10];
    }

    @o0
    public E A(long j10, E e10) {
        int q10 = q(j10);
        if (q10 < 0) {
            return null;
        }
        E[] eArr = this.Q;
        E e11 = eArr[q10];
        eArr[q10] = e10;
        return e11;
    }

    public boolean B(long j10, E e10, E e11) {
        int q10 = q(j10);
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

    public void C(int i10, E e10) {
        if (this.O) {
            m();
        }
        this.Q[i10] = e10;
    }

    public int D() {
        if (this.O) {
            m();
        }
        return this.R;
    }

    public E E(int i10) {
        if (this.O) {
            m();
        }
        return this.Q[i10];
    }

    public void a(long j10, E e10) {
        int i10 = this.R;
        if (i10 == 0 || j10 > this.P[i10 - 1]) {
            if (this.O && i10 >= this.P.length) {
                m();
            }
            int i11 = this.R;
            if (i11 >= this.P.length) {
                int f10 = e.f(i11 + 1);
                long[] jArr = new long[f10];
                Object[] objArr = new Object[f10];
                long[] jArr2 = this.P;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.Q;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.P = jArr;
                this.Q = objArr;
            }
            this.P[i11] = j10;
            this.Q[i11] = e10;
            this.R = i11 + 1;
            return;
        }
        u(j10, e10);
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
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.P = (long[]) this.P.clone();
            fVar.Q = (Object[]) this.Q.clone();
            return fVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean i(long j10) {
        return q(j10) >= 0;
    }

    public boolean j(E e10) {
        return r(e10) >= 0;
    }

    @Deprecated
    public void k(long j10) {
        x(j10);
    }

    public final void m() {
        int i10 = this.R;
        long[] jArr = this.P;
        Object[] objArr = this.Q;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != S) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
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
    public E n(long j10) {
        return p(j10, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.Q[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E p(long r3, E r5) {
        /*
            r2 = this;
            long[] r0 = r2.P
            int r1 = r2.R
            int r3 = androidx.collection.e.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r4 = r2.Q
            r3 = r4[r3]
            java.lang.Object r4 = S
            if (r3 != r4) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.f.p(long, java.lang.Object):java.lang.Object");
    }

    public int q(long j10) {
        if (this.O) {
            m();
        }
        return e.b(this.P, this.R, j10);
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
        return D() == 0;
    }

    public long t(int i10) {
        if (this.O) {
            m();
        }
        return this.P[i10];
    }

    public String toString() {
        if (D() <= 0) {
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
            Object E = E(i10);
            if (E != this) {
                sb2.append(E);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public void u(long j10, E e10) {
        int b10 = e.b(this.P, this.R, j10);
        if (b10 >= 0) {
            this.Q[b10] = e10;
            return;
        }
        int i10 = ~b10;
        int i11 = this.R;
        if (i10 < i11) {
            Object[] objArr = this.Q;
            if (objArr[i10] == S) {
                this.P[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.O && i11 >= this.P.length) {
            m();
            i10 = ~e.b(this.P, this.R, j10);
        }
        int i12 = this.R;
        if (i12 >= this.P.length) {
            int f10 = e.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.P;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.Q;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.P = jArr;
            this.Q = objArr2;
        }
        int i13 = this.R;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.P;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.Q;
            System.arraycopy(objArr4, i10, objArr4, i14, this.R - i10);
        }
        this.P[i10] = j10;
        this.Q[i10] = e10;
        this.R++;
    }

    public void v(@m0 f<? extends E> fVar) {
        int D = fVar.D();
        for (int i10 = 0; i10 < D; i10++) {
            u(fVar.t(i10), fVar.E(i10));
        }
    }

    @o0
    public E w(long j10, E e10) {
        E n10 = n(j10);
        if (n10 == null) {
            u(j10, e10);
        }
        return n10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.Q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.P
            int r1 = r2.R
            int r3 = androidx.collection.e.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.Q
            r0 = r4[r3]
            java.lang.Object r1 = S
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.O = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.f.x(long):void");
    }

    public boolean y(long j10, Object obj) {
        int q10 = q(j10);
        if (q10 < 0) {
            return false;
        }
        Object E = E(q10);
        if (obj != E && (obj == null || !obj.equals(E))) {
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
