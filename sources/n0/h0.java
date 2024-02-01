package n0;

import android.graphics.Insets;
import android.graphics.Rect;
import d.m0;
import d.t0;
import d.x0;

public final class h0 {
    @m0

    /* renamed from: e  reason: collision with root package name */
    public static final h0 f10721e = new h0(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f10722a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10723b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10724c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10725d;

    public h0(int i10, int i11, int i12, int i13) {
        this.f10722a = i10;
        this.f10723b = i11;
        this.f10724c = i12;
        this.f10725d = i13;
    }

    @m0
    public static h0 a(@m0 h0 h0Var, @m0 h0 h0Var2) {
        return d(h0Var.f10722a + h0Var2.f10722a, h0Var.f10723b + h0Var2.f10723b, h0Var.f10724c + h0Var2.f10724c, h0Var.f10725d + h0Var2.f10725d);
    }

    @m0
    public static h0 b(@m0 h0 h0Var, @m0 h0 h0Var2) {
        return d(Math.max(h0Var.f10722a, h0Var2.f10722a), Math.max(h0Var.f10723b, h0Var2.f10723b), Math.max(h0Var.f10724c, h0Var2.f10724c), Math.max(h0Var.f10725d, h0Var2.f10725d));
    }

    @m0
    public static h0 c(@m0 h0 h0Var, @m0 h0 h0Var2) {
        return d(Math.min(h0Var.f10722a, h0Var2.f10722a), Math.min(h0Var.f10723b, h0Var2.f10723b), Math.min(h0Var.f10724c, h0Var2.f10724c), Math.min(h0Var.f10725d, h0Var2.f10725d));
    }

    @m0
    public static h0 d(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f10721e : new h0(i10, i11, i12, i13);
    }

    @m0
    public static h0 e(@m0 Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @m0
    public static h0 f(@m0 h0 h0Var, @m0 h0 h0Var2) {
        return d(h0Var.f10722a - h0Var2.f10722a, h0Var.f10723b - h0Var2.f10723b, h0Var.f10724c - h0Var2.f10724c, h0Var.f10725d - h0Var2.f10725d);
    }

    @t0(api = 29)
    @m0
    public static h0 g(@m0 Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    @t0(api = 29)
    @m0
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static h0 i(@m0 Insets insets) {
        return g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f10725d == h0Var.f10725d && this.f10722a == h0Var.f10722a && this.f10724c == h0Var.f10724c && this.f10723b == h0Var.f10723b;
    }

    @t0(api = 29)
    @m0
    public Insets h() {
        return Insets.of(this.f10722a, this.f10723b, this.f10724c, this.f10725d);
    }

    public int hashCode() {
        return (((((this.f10722a * 31) + this.f10723b) * 31) + this.f10724c) * 31) + this.f10725d;
    }

    public String toString() {
        return "Insets{left=" + this.f10722a + ", top=" + this.f10723b + ", right=" + this.f10724c + ", bottom=" + this.f10725d + '}';
    }
}
