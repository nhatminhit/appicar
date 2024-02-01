package f1;

import android.view.View;
import android.view.ViewParent;
import d.m0;
import d.o0;

public class k0 {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f7209a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f7210b;

    /* renamed from: c  reason: collision with root package name */
    public final View f7211c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7212d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f7213e;

    public k0(@m0 View view) {
        this.f7211c = view;
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent i10;
        if (!m() || (i10 = i(0)) == null) {
            return false;
        }
        return r2.c(i10, this.f7211c, f10, f11, z10);
    }

    public boolean b(float f10, float f11) {
        ViewParent i10;
        if (!m() || (i10 = i(0)) == null) {
            return false;
        }
        return r2.d(i10, this.f7211c, f10, f11);
    }

    public boolean c(int i10, int i11, @o0 int[] iArr, @o0 int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean d(int i10, int i11, @o0 int[] iArr, @o0 int[] iArr2, int i12) {
        ViewParent i13;
        int i14;
        int i15;
        if (!m() || (i13 = i(i12)) == null) {
            return false;
        }
        if (i10 != 0 || i11 != 0) {
            if (iArr2 != null) {
                this.f7211c.getLocationInWindow(iArr2);
                i15 = iArr2[0];
                i14 = iArr2[1];
            } else {
                i15 = 0;
                i14 = 0;
            }
            if (iArr == null) {
                iArr = j();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            r2.f(i13, this.f7211c, i10, i11, iArr, i12);
            if (iArr2 != null) {
                this.f7211c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i15;
                iArr2[1] = iArr2[1] - i14;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public void e(int i10, int i11, int i12, int i13, @o0 int[] iArr, int i14, @o0 int[] iArr2) {
        h(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean f(int i10, int i11, int i12, int i13, @o0 int[] iArr) {
        return h(i10, i11, i12, i13, iArr, 0, (int[]) null);
    }

    public boolean g(int i10, int i11, int i12, int i13, @o0 int[] iArr, int i14) {
        return h(i10, i11, i12, i13, iArr, i14, (int[]) null);
    }

    public final boolean h(int i10, int i11, int i12, int i13, @o0 int[] iArr, int i14, @o0 int[] iArr2) {
        ViewParent i15;
        int i16;
        int i17;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!m() || (i15 = i(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f7211c.getLocationInWindow(iArr4);
            i17 = iArr4[0];
            i16 = iArr4[1];
        } else {
            i17 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] j10 = j();
            j10[0] = 0;
            j10[1] = 0;
            iArr3 = j10;
        } else {
            iArr3 = iArr2;
        }
        r2.i(i15, this.f7211c, i10, i11, i12, i13, i14, iArr3);
        if (iArr4 != null) {
            this.f7211c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i17;
            iArr4[1] = iArr4[1] - i16;
        }
        return true;
    }

    public final ViewParent i(int i10) {
        if (i10 == 0) {
            return this.f7209a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f7210b;
    }

    public final int[] j() {
        if (this.f7213e == null) {
            this.f7213e = new int[2];
        }
        return this.f7213e;
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i10) {
        return i(i10) != null;
    }

    public boolean m() {
        return this.f7212d;
    }

    public void n() {
        w1.E2(this.f7211c);
    }

    public void o(@m0 View view) {
        w1.E2(this.f7211c);
    }

    public void p(boolean z10) {
        if (this.f7212d) {
            w1.E2(this.f7211c);
        }
        this.f7212d = z10;
    }

    public final void q(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f7209a = viewParent;
        } else if (i10 == 1) {
            this.f7210b = viewParent;
        }
    }

    public boolean r(int i10) {
        return s(i10, 0);
    }

    public boolean s(int i10, int i11) {
        if (l(i11)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View view = this.f7211c;
        for (ViewParent parent = this.f7211c.getParent(); parent != null; parent = parent.getParent()) {
            if (r2.m(parent, view, this.f7211c, i10, i11)) {
                q(i11, parent);
                r2.k(parent, view, this.f7211c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void t() {
        u(0);
    }

    public void u(int i10) {
        ViewParent i11 = i(i10);
        if (i11 != null) {
            r2.o(i11, this.f7211c, i10);
            q(i10, (ViewParent) null);
        }
    }
}
