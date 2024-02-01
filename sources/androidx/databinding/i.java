package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

public class i<C, T, A> implements Cloneable {
    public static final String T = "CallbackRegistry";
    public List<C> O = new ArrayList();
    public long P = 0;
    public long[] Q;
    public int R;
    public final a<C, T, A> S;

    public static abstract class a<C, T, A> {
        public abstract void a(C c10, T t10, int i10, A a10);
    }

    public i(a<C, T, A> aVar) {
        this.S = aVar;
    }

    public synchronized void a(C c10) {
        if (c10 != null) {
            int lastIndexOf = this.O.lastIndexOf(c10);
            if (lastIndexOf < 0 || m(lastIndexOf)) {
                this.O.add(c10);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    public synchronized void d() {
        if (this.R == 0) {
            this.O.clear();
        } else if (!this.O.isEmpty()) {
            for (int size = this.O.size() - 1; size >= 0; size--) {
                v(size);
            }
        }
    }

    /* renamed from: g */
    public synchronized i<C, T, A> clone() {
        i<C, T, A> iVar;
        CloneNotSupportedException e10;
        try {
            iVar = (i) super.clone();
            try {
                iVar.P = 0;
                iVar.Q = null;
                iVar.R = 0;
                iVar.O = new ArrayList();
                int size = this.O.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!m(i10)) {
                        iVar.O.add(this.O.get(i10));
                    }
                }
            } catch (CloneNotSupportedException e11) {
                e10 = e11;
                e10.printStackTrace();
                return iVar;
            }
        } catch (CloneNotSupportedException e12) {
            CloneNotSupportedException cloneNotSupportedException = e12;
            iVar = null;
            e10 = cloneNotSupportedException;
            e10.printStackTrace();
            return iVar;
        }
        return iVar;
    }

    public synchronized ArrayList<C> i() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.O.size());
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!m(i10)) {
                arrayList.add(this.O.get(i10));
            }
        }
        return arrayList;
    }

    public synchronized void j(List<C> list) {
        list.clear();
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!m(i10)) {
                list.add(this.O.get(i10));
            }
        }
    }

    public synchronized boolean k() {
        if (this.O.isEmpty()) {
            return true;
        }
        if (this.R == 0) {
            return false;
        }
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!m(i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean m(int i10) {
        int i11;
        if (i10 < 64) {
            return ((1 << i10) & this.P) != 0;
        }
        long[] jArr = this.Q;
        if (jArr == null || (i11 = (i10 / 64) - 1) >= jArr.length) {
            return false;
        }
        return ((1 << (i10 % 64)) & jArr[i11]) != 0;
    }

    public synchronized void n(T t10, int i10, A a10) {
        this.R++;
        r(t10, i10, a10);
        int i11 = this.R - 1;
        this.R = i11;
        if (i11 == 0) {
            long[] jArr = this.Q;
            if (jArr != null) {
                for (int length = jArr.length - 1; length >= 0; length--) {
                    long j10 = this.Q[length];
                    if (j10 != 0) {
                        u((length + 1) * 64, j10);
                        this.Q[length] = 0;
                    }
                }
            }
            long j11 = this.P;
            if (j11 != 0) {
                u(0, j11);
                this.P = 0;
            }
        }
    }

    public final void p(T t10, int i10, A a10, int i11, int i12, long j10) {
        long j11 = 1;
        while (i11 < i12) {
            if ((j10 & j11) == 0) {
                this.S.a(this.O.get(i11), t10, i10, a10);
            }
            j11 <<= 1;
            i11++;
        }
    }

    public final void q(T t10, int i10, A a10) {
        p(t10, i10, a10, 0, Math.min(64, this.O.size()), this.P);
    }

    public final void r(T t10, int i10, A a10) {
        int size = this.O.size();
        long[] jArr = this.Q;
        int length = jArr == null ? -1 : jArr.length - 1;
        s(t10, i10, a10, length);
        p(t10, i10, a10, (length + 2) * 64, size, 0);
    }

    public final void s(T t10, int i10, A a10, int i11) {
        if (i11 < 0) {
            q(t10, i10, a10);
            return;
        }
        long j10 = this.Q[i11];
        int i12 = (i11 + 1) * 64;
        int min = Math.min(this.O.size(), i12 + 64);
        s(t10, i10, a10, i11 - 1);
        p(t10, i10, a10, i12, min, j10);
    }

    public synchronized void t(C c10) {
        if (this.R == 0) {
            this.O.remove(c10);
        } else {
            int lastIndexOf = this.O.lastIndexOf(c10);
            if (lastIndexOf >= 0) {
                v(lastIndexOf);
            }
        }
    }

    public final void u(int i10, long j10) {
        long j11 = Long.MIN_VALUE;
        for (int i11 = (i10 + 64) - 1; i11 >= i10; i11--) {
            if ((j10 & j11) != 0) {
                this.O.remove(i11);
            }
            j11 >>>= 1;
        }
    }

    public final void v(int i10) {
        if (i10 < 64) {
            this.P = (1 << i10) | this.P;
            return;
        }
        int i11 = (i10 / 64) - 1;
        long[] jArr = this.Q;
        if (jArr == null) {
            this.Q = new long[(this.O.size() / 64)];
        } else if (jArr.length <= i11) {
            long[] jArr2 = new long[(this.O.size() / 64)];
            long[] jArr3 = this.Q;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.Q = jArr2;
        }
        long j10 = 1 << (i10 % 64);
        long[] jArr4 = this.Q;
        jArr4[i11] = j10 | jArr4[i11];
    }
}
