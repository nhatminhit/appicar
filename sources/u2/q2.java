package u2;

import a3.e;
import a3.f;
import d.g1;
import d.x0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class q2 implements f, e {
    @g1
    public static final int W = 15;
    @g1
    public static final int X = 10;
    @g1
    public static final TreeMap<Integer, q2> Y = new TreeMap<>();
    public static final int Z = 1;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f13595a0 = 2;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f13596b0 = 3;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f13597c0 = 4;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f13598d0 = 5;
    public volatile String O;
    @g1
    public final long[] P;
    @g1
    public final double[] Q;
    @g1
    public final String[] R;
    @g1
    public final byte[][] S;
    public final int[] T;
    @g1
    public final int U;
    @g1
    public int V;

    public class a implements e {
        public a() {
        }

        public void B0(int i10, byte[] bArr) {
            q2.this.B0(i10, bArr);
        }

        public void F(int i10, String str) {
            q2.this.F(i10, str);
        }

        public void R(int i10, double d10) {
            q2.this.R(i10, d10);
        }

        public void a1(int i10) {
            q2.this.a1(i10);
        }

        public void close() {
        }

        public void q0(int i10, long j10) {
            q2.this.q0(i10, j10);
        }

        public void z1() {
            q2.this.z1();
        }
    }

    public q2(int i10) {
        this.U = i10;
        int i11 = i10 + 1;
        this.T = new int[i11];
        this.P = new long[i11];
        this.Q = new double[i11];
        this.R = new String[i11];
        this.S = new byte[i11][];
    }

    public static q2 h(String str, int i10) {
        TreeMap<Integer, q2> treeMap = Y;
        synchronized (treeMap) {
            Map.Entry<Integer, q2> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                q2 value = ceilingEntry.getValue();
                value.l(str, i10);
                return value;
            }
            q2 q2Var = new q2(i10);
            q2Var.l(str, i10);
            return q2Var;
        }
    }

    public static q2 k(f fVar) {
        q2 h10 = h(fVar.f(), fVar.c());
        fVar.g(new a());
        return h10;
    }

    public static void m() {
        TreeMap<Integer, q2> treeMap = Y;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i10 = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i10;
                } else {
                    return;
                }
            }
        }
    }

    public void B0(int i10, byte[] bArr) {
        this.T[i10] = 5;
        this.S[i10] = bArr;
    }

    public void F(int i10, String str) {
        this.T[i10] = 4;
        this.R[i10] = str;
    }

    public void R(int i10, double d10) {
        this.T[i10] = 3;
        this.Q[i10] = d10;
    }

    public void a() {
        TreeMap<Integer, q2> treeMap = Y;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.U), this);
            m();
        }
    }

    public void a1(int i10) {
        this.T[i10] = 1;
    }

    public int c() {
        return this.V;
    }

    public void close() {
    }

    public String f() {
        return this.O;
    }

    public void g(e eVar) {
        for (int i10 = 1; i10 <= this.V; i10++) {
            int i11 = this.T[i10];
            if (i11 == 1) {
                eVar.a1(i10);
            } else if (i11 == 2) {
                eVar.q0(i10, this.P[i10]);
            } else if (i11 == 3) {
                eVar.R(i10, this.Q[i10]);
            } else if (i11 == 4) {
                eVar.F(i10, this.R[i10]);
            } else if (i11 == 5) {
                eVar.B0(i10, this.S[i10]);
            }
        }
    }

    public void i(q2 q2Var) {
        int c10 = q2Var.c() + 1;
        System.arraycopy(q2Var.T, 0, this.T, 0, c10);
        System.arraycopy(q2Var.P, 0, this.P, 0, c10);
        System.arraycopy(q2Var.R, 0, this.R, 0, c10);
        System.arraycopy(q2Var.S, 0, this.S, 0, c10);
        System.arraycopy(q2Var.Q, 0, this.Q, 0, c10);
    }

    public void l(String str, int i10) {
        this.O = str;
        this.V = i10;
    }

    public void q0(int i10, long j10) {
        this.T[i10] = 2;
        this.P[i10] = j10;
    }

    public void z1() {
        Arrays.fill(this.T, 1);
        Arrays.fill(this.R, (Object) null);
        Arrays.fill(this.S, (Object) null);
        this.O = null;
    }
}
