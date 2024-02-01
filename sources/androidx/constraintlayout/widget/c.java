package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import n7.b;

public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final int f1916c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f1917d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f1918e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f1919f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f1920g = 5;

    /* renamed from: h  reason: collision with root package name */
    public static final int f1921h = 6;

    /* renamed from: i  reason: collision with root package name */
    public static final int f1922i = 7;

    /* renamed from: j  reason: collision with root package name */
    public static final int f1923j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f1924k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int f1925l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f1926m = -2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f1927n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f1928o = 0;

    /* renamed from: a  reason: collision with root package name */
    public ConstraintLayout.b f1929a;

    /* renamed from: b  reason: collision with root package name */
    public View f1930b;

    public c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.f1929a = (ConstraintLayout.b) layoutParams;
            this.f1930b = view;
            return;
        }
        throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }

    public c A(float f10) {
        this.f1929a.E = f10;
        return this;
    }

    public c B(int i10, int i11) {
        switch (i10) {
            case 1:
                this.f1929a.leftMargin = i11;
                break;
            case 2:
                this.f1929a.rightMargin = i11;
                break;
            case 3:
                this.f1929a.topMargin = i11;
                break;
            case 4:
                this.f1929a.bottomMargin = i11;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f1929a.setMarginStart(i11);
                break;
            case 7:
                this.f1929a.setMarginEnd(i11);
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public c C(int i10) {
        switch (i10) {
            case 1:
                ConstraintLayout.b bVar = this.f1929a;
                bVar.f1817e = -1;
                bVar.f1815d = -1;
                bVar.leftMargin = -1;
                bVar.f1843t = -1;
                break;
            case 2:
                ConstraintLayout.b bVar2 = this.f1929a;
                bVar2.f1821g = -1;
                bVar2.f1819f = -1;
                bVar2.rightMargin = -1;
                bVar2.f1845v = -1;
                break;
            case 3:
                ConstraintLayout.b bVar3 = this.f1929a;
                bVar3.f1825i = -1;
                bVar3.f1823h = -1;
                bVar3.topMargin = -1;
                bVar3.f1844u = -1;
                break;
            case 4:
                ConstraintLayout.b bVar4 = this.f1929a;
                bVar4.f1827j = -1;
                bVar4.f1829k = -1;
                bVar4.bottomMargin = -1;
                bVar4.f1846w = -1;
                break;
            case 5:
                this.f1929a.f1831l = -1;
                break;
            case 6:
                ConstraintLayout.b bVar5 = this.f1929a;
                bVar5.f1839p = -1;
                bVar5.f1840q = -1;
                bVar5.setMarginStart(-1);
                this.f1929a.f1847x = -1;
                break;
            case 7:
                ConstraintLayout.b bVar6 = this.f1929a;
                bVar6.f1841r = -1;
                bVar6.f1842s = -1;
                bVar6.setMarginEnd(-1);
                this.f1929a.f1848y = -1;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public c D() {
        ConstraintLayout.b bVar = this.f1929a;
        int i10 = bVar.f1817e;
        int i11 = bVar.f1819f;
        if (i10 == -1 && i11 == -1) {
            int i12 = bVar.f1839p;
            int i13 = bVar.f1841r;
            if (!(i12 == -1 && i13 == -1)) {
                c cVar = new c(((ViewGroup) this.f1930b.getParent()).findViewById(i12));
                c cVar2 = new c(((ViewGroup) this.f1930b.getParent()).findViewById(i13));
                ConstraintLayout.b bVar2 = this.f1929a;
                if (i12 != -1 && i13 != -1) {
                    cVar.m(7, i13, 6, 0);
                    cVar2.m(6, i10, 7, 0);
                } else if (!(i10 == -1 && i13 == -1)) {
                    int i14 = bVar2.f1821g;
                    if (i14 != -1) {
                        cVar.m(7, i14, 7, 0);
                    } else {
                        int i15 = bVar2.f1815d;
                        if (i15 != -1) {
                            cVar2.m(6, i15, 6, 0);
                        }
                    }
                }
            }
            C(6);
            C(7);
        } else {
            c cVar3 = new c(((ViewGroup) this.f1930b.getParent()).findViewById(i10));
            c cVar4 = new c(((ViewGroup) this.f1930b.getParent()).findViewById(i11));
            ConstraintLayout.b bVar3 = this.f1929a;
            if (i10 != -1 && i11 != -1) {
                cVar3.m(2, i11, 1, 0);
                cVar4.m(1, i10, 2, 0);
            } else if (!(i10 == -1 && i11 == -1)) {
                int i16 = bVar3.f1821g;
                if (i16 != -1) {
                    cVar3.m(2, i16, 2, 0);
                } else {
                    int i17 = bVar3.f1815d;
                    if (i17 != -1) {
                        cVar4.m(1, i17, 1, 0);
                    }
                }
            }
            C(1);
            C(2);
        }
        return this;
    }

    public c E() {
        ConstraintLayout.b bVar = this.f1929a;
        int i10 = bVar.f1825i;
        int i11 = bVar.f1827j;
        if (!(i10 == -1 && i11 == -1)) {
            c cVar = new c(((ViewGroup) this.f1930b.getParent()).findViewById(i10));
            c cVar2 = new c(((ViewGroup) this.f1930b.getParent()).findViewById(i11));
            ConstraintLayout.b bVar2 = this.f1929a;
            if (i10 != -1 && i11 != -1) {
                cVar.m(4, i11, 3, 0);
                cVar2.m(3, i10, 4, 0);
            } else if (!(i10 == -1 && i11 == -1)) {
                int i12 = bVar2.f1829k;
                if (i12 != -1) {
                    cVar.m(4, i12, 4, 0);
                } else {
                    int i13 = bVar2.f1823h;
                    if (i13 != -1) {
                        cVar2.m(3, i13, 3, 0);
                    }
                }
            }
        }
        C(3);
        C(4);
        return this;
    }

    public c F(float f10) {
        this.f1930b.setRotation(f10);
        return this;
    }

    public c G(float f10) {
        this.f1930b.setRotationX(f10);
        return this;
    }

    public c H(float f10) {
        this.f1930b.setRotationY(f10);
        return this;
    }

    public c I(float f10) {
        this.f1930b.setScaleY(f10);
        return this;
    }

    public c J(float f10) {
        return this;
    }

    public final String K(int i10) {
        switch (i10) {
            case 1:
                return b.U;
            case 2:
                return b.W;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return b.X;
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public c L(float f10, float f11) {
        this.f1930b.setPivotX(f10);
        this.f1930b.setPivotY(f11);
        return this;
    }

    public c M(float f10) {
        this.f1930b.setPivotX(f10);
        return this;
    }

    public c N(float f10) {
        this.f1930b.setPivotY(f10);
        return this;
    }

    public c O(float f10, float f11) {
        this.f1930b.setTranslationX(f10);
        this.f1930b.setTranslationY(f11);
        return this;
    }

    public c P(float f10) {
        this.f1930b.setTranslationX(f10);
        return this;
    }

    public c Q(float f10) {
        this.f1930b.setTranslationY(f10);
        return this;
    }

    public c R(float f10) {
        this.f1930b.setTranslationZ(f10);
        return this;
    }

    public c S(float f10) {
        this.f1929a.A = f10;
        return this;
    }

    public c T(int i10) {
        this.f1929a.H = i10;
        return this;
    }

    public c U(float f10) {
        this.f1929a.F = f10;
        return this;
    }

    public c V(int i10) {
        this.f1930b.setVisibility(i10);
        return this;
    }

    public c a(int i10, int i11) {
        m(1, i10, i10 == 0 ? 1 : 2, 0);
        m(2, i11, i11 == 0 ? 2 : 1, 0);
        if (i10 != 0) {
            new c(((ViewGroup) this.f1930b.getParent()).findViewById(i10)).m(2, this.f1930b.getId(), 1, 0);
        }
        if (i11 != 0) {
            new c(((ViewGroup) this.f1930b.getParent()).findViewById(i11)).m(1, this.f1930b.getId(), 2, 0);
        }
        return this;
    }

    public c b(int i10, int i11) {
        m(6, i10, i10 == 0 ? 6 : 7, 0);
        m(7, i11, i11 == 0 ? 7 : 6, 0);
        if (i10 != 0) {
            new c(((ViewGroup) this.f1930b.getParent()).findViewById(i10)).m(7, this.f1930b.getId(), 6, 0);
        }
        if (i11 != 0) {
            new c(((ViewGroup) this.f1930b.getParent()).findViewById(i11)).m(6, this.f1930b.getId(), 7, 0);
        }
        return this;
    }

    public c c(int i10, int i11) {
        m(3, i10, i10 == 0 ? 3 : 4, 0);
        m(4, i11, i11 == 0 ? 4 : 3, 0);
        if (i10 != 0) {
            new c(((ViewGroup) this.f1930b.getParent()).findViewById(i10)).m(4, this.f1930b.getId(), 3, 0);
        }
        if (i11 != 0) {
            new c(((ViewGroup) this.f1930b.getParent()).findViewById(i11)).m(3, this.f1930b.getId(), 4, 0);
        }
        return this;
    }

    public c d(float f10) {
        this.f1930b.setAlpha(f10);
        return this;
    }

    public void e() {
    }

    public c f(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        if (i12 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i15 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f10 <= 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else {
            int i16 = 2;
            int i17 = 1;
            if (!(i11 == 1 || i11 == 2)) {
                i16 = 7;
                i17 = 6;
                if (!(i11 == 6 || i11 == 7)) {
                    m(3, i10, i11, i12);
                    m(4, i13, i14, i15);
                    this.f1929a.A = f10;
                    return this;
                }
            }
            m(i17, i10, i11, i12);
            m(i16, i13, i14, i15);
            this.f1929a.f1849z = f10;
            return this;
        }
    }

    public c g(int i10) {
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        c cVar;
        if (i10 == 0) {
            i16 = 0;
            i15 = 1;
            i14 = 0;
            i13 = 0;
            i12 = 2;
            i11 = 0;
            f10 = 0.5f;
            cVar = this;
        } else {
            i15 = 2;
            i14 = 0;
            i12 = 1;
            i11 = 0;
            f10 = 0.5f;
            cVar = this;
            i16 = i10;
            i13 = i10;
        }
        cVar.f(i16, i15, i14, i13, i12, i11, f10);
        return this;
    }

    public c h(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        m(1, i10, i11, i12);
        m(2, i13, i14, i15);
        this.f1929a.f1849z = f10;
        return this;
    }

    public c i(int i10) {
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        c cVar;
        if (i10 == 0) {
            i16 = 0;
            i15 = 6;
            i14 = 0;
            i13 = 0;
            i12 = 7;
            i11 = 0;
            f10 = 0.5f;
            cVar = this;
        } else {
            i15 = 7;
            i14 = 0;
            i12 = 6;
            i11 = 0;
            f10 = 0.5f;
            cVar = this;
            i16 = i10;
            i13 = i10;
        }
        cVar.f(i16, i15, i14, i13, i12, i11, f10);
        return this;
    }

    public c j(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        m(6, i10, i11, i12);
        m(7, i13, i14, i15);
        this.f1929a.f1849z = f10;
        return this;
    }

    public c k(int i10) {
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        c cVar;
        if (i10 == 0) {
            i16 = 0;
            i15 = 3;
            i14 = 0;
            i13 = 0;
            i12 = 4;
            i11 = 0;
            f10 = 0.5f;
            cVar = this;
        } else {
            i15 = 4;
            i14 = 0;
            i12 = 3;
            i11 = 0;
            f10 = 0.5f;
            cVar = this;
            i16 = i10;
            i13 = i10;
        }
        cVar.f(i16, i15, i14, i13, i12, i11, f10);
        return this;
    }

    public c l(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        m(3, i10, i11, i12);
        m(4, i13, i14, i15);
        this.f1929a.A = f10;
        return this;
    }

    public c m(int i10, int i11, int i12, int i13) {
        ConstraintLayout.b bVar;
        ConstraintLayout.b bVar2;
        switch (i10) {
            case 1:
                if (i12 == 1) {
                    ConstraintLayout.b bVar3 = this.f1929a;
                    bVar3.f1815d = i11;
                    bVar3.f1817e = -1;
                } else if (i12 == 2) {
                    ConstraintLayout.b bVar4 = this.f1929a;
                    bVar4.f1817e = i11;
                    bVar4.f1815d = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + K(i12) + " undefined");
                }
                this.f1929a.leftMargin = i13;
                break;
            case 2:
                if (i12 == 1) {
                    ConstraintLayout.b bVar5 = this.f1929a;
                    bVar5.f1819f = i11;
                    bVar5.f1821g = -1;
                } else if (i12 == 2) {
                    ConstraintLayout.b bVar6 = this.f1929a;
                    bVar6.f1821g = i11;
                    bVar6.f1819f = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                }
                this.f1929a.rightMargin = i13;
                break;
            case 3:
                if (i12 == 3) {
                    bVar = this.f1929a;
                    bVar.f1823h = i11;
                    bVar.f1825i = -1;
                } else if (i12 == 4) {
                    bVar = this.f1929a;
                    bVar.f1825i = i11;
                    bVar.f1823h = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                }
                bVar.f1831l = -1;
                this.f1929a.topMargin = i13;
                break;
            case 4:
                if (i12 == 4) {
                    bVar2 = this.f1929a;
                    bVar2.f1829k = i11;
                    bVar2.f1827j = -1;
                } else if (i12 == 3) {
                    bVar2 = this.f1929a;
                    bVar2.f1827j = i11;
                    bVar2.f1829k = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                }
                bVar2.f1831l = -1;
                this.f1929a.bottomMargin = i13;
                break;
            case 5:
                if (i12 == 5) {
                    ConstraintLayout.b bVar7 = this.f1929a;
                    bVar7.f1831l = i11;
                    bVar7.f1829k = -1;
                    bVar7.f1827j = -1;
                    bVar7.f1823h = -1;
                    bVar7.f1825i = -1;
                    break;
                } else {
                    throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                }
            case 6:
                if (i12 == 6) {
                    ConstraintLayout.b bVar8 = this.f1929a;
                    bVar8.f1840q = i11;
                    bVar8.f1839p = -1;
                } else if (i12 == 7) {
                    ConstraintLayout.b bVar9 = this.f1929a;
                    bVar9.f1839p = i11;
                    bVar9.f1840q = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                }
                this.f1929a.setMarginStart(i13);
                break;
            case 7:
                if (i12 == 7) {
                    ConstraintLayout.b bVar10 = this.f1929a;
                    bVar10.f1842s = i11;
                    bVar10.f1841r = -1;
                } else if (i12 == 6) {
                    ConstraintLayout.b bVar11 = this.f1929a;
                    bVar11.f1841r = i11;
                    bVar11.f1842s = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                }
                this.f1929a.setMarginEnd(i13);
                break;
            default:
                throw new IllegalArgumentException(K(i10) + " to " + K(i12) + " unknown");
        }
        return this;
    }

    public c n(int i10) {
        this.f1929a.J = i10;
        return this;
    }

    public c o(int i10) {
        this.f1929a.I = i10;
        return this;
    }

    public c p(int i10) {
        this.f1929a.height = i10;
        return this;
    }

    public c q(int i10) {
        this.f1929a.N = i10;
        return this;
    }

    public c r(int i10) {
        this.f1929a.M = i10;
        return this;
    }

    public c s(int i10) {
        this.f1929a.L = i10;
        return this;
    }

    public c t(int i10) {
        this.f1929a.K = i10;
        return this;
    }

    public c u(int i10) {
        this.f1929a.width = i10;
        return this;
    }

    public c v(String str) {
        this.f1929a.B = str;
        return this;
    }

    public c w(float f10) {
        this.f1930b.setElevation(f10);
        return this;
    }

    public c x(int i10, int i11) {
        switch (i10) {
            case 1:
                this.f1929a.f1843t = i11;
                break;
            case 2:
                this.f1929a.f1845v = i11;
                break;
            case 3:
                this.f1929a.f1844u = i11;
                break;
            case 4:
                this.f1929a.f1846w = i11;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f1929a.f1847x = i11;
                break;
            case 7:
                this.f1929a.f1848y = i11;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    public c y(float f10) {
        this.f1929a.f1849z = f10;
        return this;
    }

    public c z(int i10) {
        this.f1929a.G = i10;
        return this;
    }
}
