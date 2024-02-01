package t2;

import d.m0;
import e1.n;

public final class z {

    /* renamed from: d  reason: collision with root package name */
    public static final int f12899d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f12900e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final String f12901f = "Range";

    /* renamed from: a  reason: collision with root package name */
    public final a f12902a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12903b;

    /* renamed from: c  reason: collision with root package name */
    public int f12904c = -1;

    public static abstract class a {
        public abstract void a(int i10, int i11, boolean z10, int i12);
    }

    public z(int i10, @m0 a aVar) {
        this.f12903b = i10;
        this.f12902a = aVar;
    }

    public final void a(int i10, int i11) {
        n.b(this.f12904c == -1, "End has already been set.");
        this.f12904c = i10;
        int i12 = this.f12903b;
        if (i10 > i12) {
            g(i12 + 1, i10, true, i11);
        } else if (i10 < i12) {
            g(i10, i12 - 1, true, i11);
        }
    }

    public void b(int i10, int i11) {
        n.b(i10 != -1, "Position cannot be NO_POSITION.");
        int i12 = this.f12904c;
        if (i12 == -1 || i12 == this.f12903b) {
            this.f12904c = -1;
            a(i10, i11);
            return;
        }
        f(i10, i11);
    }

    public final void c(int i10, String str) {
        String str2 = i10 == 0 ? "PRIMARY" : "PROVISIONAL";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this));
        sb2.append(": ");
        sb2.append(str);
        sb2.append(" (");
        sb2.append(str2);
        sb2.append(")");
    }

    public final void d(int i10, int i11) {
        int i12 = this.f12904c;
        if (i10 < i12) {
            int i13 = this.f12903b;
            if (i10 < i13) {
                g(i13 + 1, i12, false, i11);
                g(i10, this.f12903b - 1, true, i11);
                return;
            }
            g(i10 + 1, i12, false, i11);
        } else if (i10 > i12) {
            g(i12 + 1, i10, true, i11);
        }
    }

    public final void e(int i10, int i11) {
        int i12 = this.f12904c;
        if (i10 > i12) {
            int i13 = this.f12903b;
            if (i10 > i13) {
                g(i12, i13 - 1, false, i11);
                g(this.f12903b + 1, i10, true, i11);
                return;
            }
            g(i12, i10 - 1, false, i11);
        } else if (i10 < i12) {
            g(i10, i12 - 1, true, i11);
        }
    }

    public final void f(int i10, int i11) {
        boolean z10 = true;
        n.b(this.f12904c != -1, "End must already be set.");
        if (this.f12903b == this.f12904c) {
            z10 = false;
        }
        n.b(z10, "Beging and end point to same position.");
        int i12 = this.f12904c;
        int i13 = this.f12903b;
        if (i12 > i13) {
            d(i10, i11);
        } else if (i12 < i13) {
            e(i10, i11);
        }
        this.f12904c = i10;
    }

    public final void g(int i10, int i11, boolean z10, int i12) {
        this.f12902a.a(i10, i11, z10, i12);
    }

    public String toString() {
        return "Range{begin=" + this.f12903b + ", end=" + this.f12904c + p7.a.f11639j;
    }
}
