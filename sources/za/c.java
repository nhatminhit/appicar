package za;

import qa.m;
import qa.t;
import ya.b;

public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static final int f25012h = 10;

    /* renamed from: i  reason: collision with root package name */
    public static final int f25013i = 1;

    /* renamed from: a  reason: collision with root package name */
    public final b f25014a;

    /* renamed from: b  reason: collision with root package name */
    public final int f25015b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25016c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25017d;

    /* renamed from: e  reason: collision with root package name */
    public final int f25018e;

    /* renamed from: f  reason: collision with root package name */
    public final int f25019f;

    /* renamed from: g  reason: collision with root package name */
    public final int f25020g;

    public c(b bVar) throws m {
        this(bVar, 10, bVar.s() / 2, bVar.n() / 2);
    }

    public c(b bVar, int i10, int i11, int i12) throws m {
        this.f25014a = bVar;
        int n10 = bVar.n();
        this.f25015b = n10;
        int s10 = bVar.s();
        this.f25016c = s10;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.f25017d = i14;
        int i15 = i11 + i13;
        this.f25018e = i15;
        int i16 = i12 - i13;
        this.f25020g = i16;
        int i17 = i12 + i13;
        this.f25019f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= n10 || i15 >= s10) {
            throw m.a();
        }
    }

    public final t[] a(t tVar, t tVar2, t tVar3, t tVar4) {
        float c10 = tVar.c();
        float d10 = tVar.d();
        float c11 = tVar2.c();
        float d11 = tVar2.d();
        float c12 = tVar3.c();
        float d12 = tVar3.d();
        float c13 = tVar4.c();
        float d13 = tVar4.d();
        if (c10 < ((float) this.f25016c) / 2.0f) {
            return new t[]{new t(c13 - 1.0f, d13 + 1.0f), new t(c11 + 1.0f, d11 + 1.0f), new t(c12 - 1.0f, d12 - 1.0f), new t(c10 + 1.0f, d10 - 1.0f)};
        }
        return new t[]{new t(c13 + 1.0f, d13 + 1.0f), new t(c11 + 1.0f, d11 - 1.0f), new t(c12 - 1.0f, d12 + 1.0f), new t(c10 - 1.0f, d10 - 1.0f)};
    }

    public final boolean b(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.f25014a.j(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.f25014a.j(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public t[] c() throws m {
        int i10 = this.f25017d;
        int i11 = this.f25018e;
        int i12 = this.f25020g;
        int i13 = this.f25019f;
        boolean z10 = false;
        int i14 = 1;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = true;
        while (true) {
            if (!z15) {
                break;
            }
            boolean z16 = false;
            boolean z17 = true;
            while (true) {
                if ((z17 || !z11) && i11 < this.f25016c) {
                    z17 = b(i12, i13, i11, false);
                    if (z17) {
                        i11++;
                        z11 = true;
                        z16 = true;
                    } else if (!z11) {
                        i11++;
                    }
                }
            }
            if (i11 < this.f25016c) {
                boolean z18 = true;
                while (true) {
                    if ((z18 || !z12) && i13 < this.f25015b) {
                        z18 = b(i10, i11, i13, true);
                        if (z18) {
                            i13++;
                            z12 = true;
                            z16 = true;
                        } else if (!z12) {
                            i13++;
                        }
                    }
                }
                if (i13 < this.f25015b) {
                    boolean z19 = true;
                    while (true) {
                        if ((z19 || !z13) && i10 >= 0) {
                            z19 = b(i12, i13, i10, false);
                            if (z19) {
                                i10--;
                                z13 = true;
                                z16 = true;
                            } else if (!z13) {
                                i10--;
                            }
                        }
                    }
                    if (i10 >= 0) {
                        z15 = z16;
                        boolean z20 = true;
                        while (true) {
                            if ((z20 || !z14) && i12 >= 0) {
                                z20 = b(i10, i11, i12, true);
                                if (z20) {
                                    i12--;
                                    z15 = true;
                                    z14 = true;
                                } else if (!z14) {
                                    i12--;
                                }
                            }
                        }
                        if (i12 < 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        z10 = true;
        if (!z10) {
            int i15 = i11 - i10;
            t tVar = null;
            int i16 = 1;
            t tVar2 = null;
            while (tVar2 == null && i16 < i15) {
                tVar2 = d((float) i10, (float) (i13 - i16), (float) (i10 + i16), (float) i13);
                i16++;
            }
            if (tVar2 != null) {
                int i17 = 1;
                t tVar3 = null;
                while (tVar3 == null && i17 < i15) {
                    tVar3 = d((float) i10, (float) (i12 + i17), (float) (i10 + i17), (float) i12);
                    i17++;
                }
                if (tVar3 != null) {
                    int i18 = 1;
                    t tVar4 = null;
                    while (tVar4 == null && i18 < i15) {
                        tVar4 = d((float) i11, (float) (i12 + i18), (float) (i11 - i18), (float) i12);
                        i18++;
                    }
                    if (tVar4 != null) {
                        while (tVar == null && i14 < i15) {
                            tVar = d((float) i11, (float) (i13 - i14), (float) (i11 - i14), (float) i13);
                            i14++;
                        }
                        if (tVar != null) {
                            return a(tVar, tVar2, tVar4, tVar3);
                        }
                        throw m.a();
                    }
                    throw m.a();
                }
                throw m.a();
            }
            throw m.a();
        }
        throw m.a();
    }

    public final t d(float f10, float f11, float f12, float f13) {
        int c10 = a.c(a.a(f10, f11, f12, f13));
        float f14 = (float) c10;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < c10; i10++) {
            float f17 = (float) i10;
            int c11 = a.c((f17 * f15) + f10);
            int c12 = a.c((f17 * f16) + f11);
            if (this.f25014a.j(c11, c12)) {
                return new t((float) c11, (float) c12);
            }
        }
        return null;
    }
}
