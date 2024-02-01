package androidx.recyclerview.widget;

import d.m0;

public class f implements t {
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public final t O;
    public int P = 0;
    public int Q = -1;
    public int R = -1;
    public Object S = null;

    public f(@m0 t tVar) {
        this.O = tVar;
    }

    public void a(int i10, int i11) {
        e();
        this.O.a(i10, i11);
    }

    public void b(int i10, int i11) {
        int i12;
        if (this.P == 1 && i10 >= (i12 = this.Q)) {
            int i13 = this.R;
            if (i10 <= i12 + i13) {
                this.R = i13 + i11;
                this.Q = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.Q = i10;
        this.R = i11;
        this.P = 1;
    }

    public void c(int i10, int i11) {
        int i12;
        if (this.P != 2 || (i12 = this.Q) < i10 || i12 > i10 + i11) {
            e();
            this.Q = i10;
            this.R = i11;
            this.P = 2;
            return;
        }
        this.R += i11;
        this.Q = i10;
    }

    public void d(int i10, int i11, Object obj) {
        int i12;
        if (this.P == 3) {
            int i13 = this.Q;
            int i14 = this.R;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.S == obj) {
                this.Q = Math.min(i10, i13);
                this.R = Math.max(i14 + i13, i12) - this.Q;
                return;
            }
        }
        e();
        this.Q = i10;
        this.R = i11;
        this.S = obj;
        this.P = 3;
    }

    public void e() {
        int i10 = this.P;
        if (i10 != 0) {
            if (i10 == 1) {
                this.O.b(this.Q, this.R);
            } else if (i10 == 2) {
                this.O.c(this.Q, this.R);
            } else if (i10 == 3) {
                this.O.d(this.Q, this.R, this.S);
            }
            this.S = null;
            this.P = 0;
        }
    }
}
