package d7;

import b7.q0;
import d7.e;
import j6.h;
import j6.s;
import w7.p;

public final class c implements e.b {

    /* renamed from: c  reason: collision with root package name */
    public static final String f6512c = "BaseMediaChunkOutput";

    /* renamed from: a  reason: collision with root package name */
    public final int[] f6513a;

    /* renamed from: b  reason: collision with root package name */
    public final q0[] f6514b;

    public c(int[] iArr, q0[] q0VarArr) {
        this.f6513a = iArr;
        this.f6514b = q0VarArr;
    }

    public s a(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f6513a;
            if (i12 >= iArr.length) {
                p.d(f6512c, "Unmatched track of type: " + i11);
                return new h();
            } else if (i11 == iArr[i12]) {
                return this.f6514b[i12];
            } else {
                i12++;
            }
        }
    }

    public int[] b() {
        int[] iArr = new int[this.f6514b.length];
        int i10 = 0;
        while (true) {
            q0[] q0VarArr = this.f6514b;
            if (i10 >= q0VarArr.length) {
                return iArr;
            }
            q0 q0Var = q0VarArr[i10];
            if (q0Var != null) {
                iArr[i10] = q0Var.t();
            }
            i10++;
        }
    }

    public void c(long j10) {
        for (q0 q0Var : this.f6514b) {
            if (q0Var != null) {
                q0Var.H(j10);
            }
        }
    }
}
