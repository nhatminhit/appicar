package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import d.e0;
import d.g1;
import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<g> f3532a = new a();

    public static class a implements Comparator<g> {
        /* renamed from: a */
        public int compare(g gVar, g gVar2) {
            int i10 = gVar.f3555a - gVar2.f3555a;
            return i10 == 0 ? gVar.f3556b - gVar2.f3556b : i10;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        @o0
        public Object c(int i10, int i11) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    public static class c {

        /* renamed from: h  reason: collision with root package name */
        public static final int f3533h = -1;

        /* renamed from: i  reason: collision with root package name */
        public static final int f3534i = 1;

        /* renamed from: j  reason: collision with root package name */
        public static final int f3535j = 2;

        /* renamed from: k  reason: collision with root package name */
        public static final int f3536k = 4;

        /* renamed from: l  reason: collision with root package name */
        public static final int f3537l = 8;

        /* renamed from: m  reason: collision with root package name */
        public static final int f3538m = 16;

        /* renamed from: n  reason: collision with root package name */
        public static final int f3539n = 5;

        /* renamed from: o  reason: collision with root package name */
        public static final int f3540o = 31;

        /* renamed from: a  reason: collision with root package name */
        public final List<g> f3541a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f3542b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f3543c;

        /* renamed from: d  reason: collision with root package name */
        public final b f3544d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3545e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3546f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f3547g;

        public c(b bVar, List<g> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f3541a = list;
            this.f3542b = iArr;
            this.f3543c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f3544d = bVar;
            this.f3545e = bVar.e();
            this.f3546f = bVar.d();
            this.f3547g = z10;
            a();
            j();
        }

        public static e m(List<e> list, int i10, boolean z10) {
            int size = list.size() - 1;
            while (size >= 0) {
                e eVar = list.get(size);
                if (eVar.f3548a == i10 && eVar.f3550c == z10) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f3549b += z10 ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        public final void a() {
            g gVar = this.f3541a.isEmpty() ? null : this.f3541a.get(0);
            if (gVar == null || gVar.f3555a != 0 || gVar.f3556b != 0) {
                g gVar2 = new g();
                gVar2.f3555a = 0;
                gVar2.f3556b = 0;
                gVar2.f3558d = false;
                gVar2.f3557c = 0;
                gVar2.f3559e = false;
                this.f3541a.add(0, gVar2);
            }
        }

        public int b(@e0(from = 0) int i10) {
            if (i10 < 0 || i10 >= this.f3546f) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i10 + ", new list size = " + this.f3546f);
            }
            int i11 = this.f3543c[i10];
            if ((i11 & 31) == 0) {
                return -1;
            }
            return i11 >> 5;
        }

        public int c(@e0(from = 0) int i10) {
            if (i10 < 0 || i10 >= this.f3545e) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i10 + ", old list size = " + this.f3545e);
            }
            int i11 = this.f3542b[i10];
            if ((i11 & 31) == 0) {
                return -1;
            }
            return i11 >> 5;
        }

        public final void d(List<e> list, t tVar, int i10, int i11, int i12) {
            if (!this.f3547g) {
                tVar.b(i10, i11);
                return;
            }
            for (int i13 = i11 - 1; i13 >= 0; i13--) {
                int i14 = i12 + i13;
                int i15 = this.f3543c[i14];
                int i16 = i15 & 31;
                if (i16 == 0) {
                    tVar.b(i10, 1);
                    for (e eVar : list) {
                        eVar.f3549b++;
                    }
                } else if (i16 == 4 || i16 == 8) {
                    int i17 = i15 >> 5;
                    tVar.a(m(list, i17, true).f3549b, i10);
                    if (i16 == 4) {
                        tVar.d(i10, 1, this.f3544d.c(i17, i14));
                    }
                } else if (i16 == 16) {
                    list.add(new e(i14, i10, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i14 + " " + Long.toBinaryString((long) i16));
                }
            }
        }

        public final void e(List<e> list, t tVar, int i10, int i11, int i12) {
            if (!this.f3547g) {
                tVar.c(i10, i11);
                return;
            }
            for (int i13 = i11 - 1; i13 >= 0; i13--) {
                int i14 = i12 + i13;
                int i15 = this.f3542b[i14];
                int i16 = i15 & 31;
                if (i16 == 0) {
                    tVar.c(i10 + i13, 1);
                    for (e eVar : list) {
                        eVar.f3549b--;
                    }
                } else if (i16 == 4 || i16 == 8) {
                    int i17 = i15 >> 5;
                    e m10 = m(list, i17, false);
                    tVar.a(i10 + i13, m10.f3549b - 1);
                    if (i16 == 4) {
                        tVar.d(m10.f3549b - 1, 1, this.f3544d.c(i14, i17));
                    }
                } else if (i16 == 16) {
                    list.add(new e(i14, i10 + i13, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i14 + " " + Long.toBinaryString((long) i16));
                }
            }
        }

        public void f(@m0 t tVar) {
            f fVar = tVar instanceof f ? (f) tVar : new f(tVar);
            ArrayList arrayList = new ArrayList();
            int i10 = this.f3545e;
            int i11 = this.f3546f;
            for (int size = this.f3541a.size() - 1; size >= 0; size--) {
                g gVar = this.f3541a.get(size);
                int i12 = gVar.f3557c;
                int i13 = gVar.f3555a + i12;
                int i14 = gVar.f3556b + i12;
                if (i13 < i10) {
                    e(arrayList, fVar, i13, i10 - i13, i13);
                }
                if (i14 < i11) {
                    d(arrayList, fVar, i13, i11 - i14, i14);
                }
                for (int i15 = i12 - 1; i15 >= 0; i15--) {
                    int[] iArr = this.f3542b;
                    int i16 = gVar.f3555a;
                    if ((iArr[i16 + i15] & 31) == 2) {
                        fVar.d(i16 + i15, 1, this.f3544d.c(i16 + i15, gVar.f3556b + i15));
                    }
                }
                i10 = gVar.f3555a;
                i11 = gVar.f3556b;
            }
            fVar.e();
        }

        public void g(@m0 RecyclerView.g gVar) {
            f(new b(gVar));
        }

        public final void h(int i10, int i11, int i12) {
            if (this.f3542b[i10 - 1] == 0) {
                i(i10, i11, i12, false);
            }
        }

        public final boolean i(int i10, int i11, int i12, boolean z10) {
            int i13;
            int i14;
            if (z10) {
                i11--;
                i13 = i10;
                i14 = i11;
            } else {
                i14 = i10 - 1;
                i13 = i14;
            }
            while (i12 >= 0) {
                g gVar = this.f3541a.get(i12);
                int i15 = gVar.f3555a;
                int i16 = gVar.f3557c;
                int i17 = i15 + i16;
                int i18 = gVar.f3556b + i16;
                int i19 = 8;
                if (z10) {
                    for (int i20 = i13 - 1; i20 >= i17; i20--) {
                        if (this.f3544d.b(i20, i14)) {
                            if (!this.f3544d.a(i20, i14)) {
                                i19 = 4;
                            }
                            this.f3543c[i14] = (i20 << 5) | 16;
                            this.f3542b[i20] = (i14 << 5) | i19;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i21 = i11 - 1; i21 >= i18; i21--) {
                        if (this.f3544d.b(i14, i21)) {
                            if (!this.f3544d.a(i14, i21)) {
                                i19 = 4;
                            }
                            int i22 = i10 - 1;
                            this.f3542b[i22] = (i21 << 5) | 16;
                            this.f3543c[i21] = (i22 << 5) | i19;
                            return true;
                        }
                    }
                    continue;
                }
                i13 = gVar.f3555a;
                i11 = gVar.f3556b;
                i12--;
            }
            return false;
        }

        public final void j() {
            int i10 = this.f3545e;
            int i11 = this.f3546f;
            for (int size = this.f3541a.size() - 1; size >= 0; size--) {
                g gVar = this.f3541a.get(size);
                int i12 = gVar.f3555a;
                int i13 = gVar.f3557c;
                int i14 = i12 + i13;
                int i15 = gVar.f3556b + i13;
                if (this.f3547g) {
                    while (i10 > i14) {
                        h(i10, i11, size);
                        i10--;
                    }
                    while (i11 > i15) {
                        k(i10, i11, size);
                        i11--;
                    }
                }
                for (int i16 = 0; i16 < gVar.f3557c; i16++) {
                    int i17 = gVar.f3555a + i16;
                    int i18 = gVar.f3556b + i16;
                    int i19 = this.f3544d.a(i17, i18) ? 1 : 2;
                    this.f3542b[i17] = (i18 << 5) | i19;
                    this.f3543c[i18] = (i17 << 5) | i19;
                }
                i10 = gVar.f3555a;
                i11 = gVar.f3556b;
            }
        }

        public final void k(int i10, int i11, int i12) {
            if (this.f3543c[i11 - 1] == 0) {
                i(i10, i11, i12, true);
            }
        }

        @g1
        public List<g> l() {
            return this.f3541a;
        }
    }

    public static abstract class d<T> {
        public abstract boolean a(@m0 T t10, @m0 T t11);

        public abstract boolean b(@m0 T t10, @m0 T t11);

        @o0
        public Object c(@m0 T t10, @m0 T t11) {
            return null;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f3548a;

        /* renamed from: b  reason: collision with root package name */
        public int f3549b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3550c;

        public e(int i10, int i11, boolean z10) {
            this.f3548a = i10;
            this.f3549b = i11;
            this.f3550c = z10;
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f3551a;

        /* renamed from: b  reason: collision with root package name */
        public int f3552b;

        /* renamed from: c  reason: collision with root package name */
        public int f3553c;

        /* renamed from: d  reason: collision with root package name */
        public int f3554d;

        public f() {
        }

        public f(int i10, int i11, int i12, int i13) {
            this.f3551a = i10;
            this.f3552b = i11;
            this.f3553c = i12;
            this.f3554d = i13;
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f3555a;

        /* renamed from: b  reason: collision with root package name */
        public int f3556b;

        /* renamed from: c  reason: collision with root package name */
        public int f3557c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3558d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3559e;
    }

    @m0
    public static c a(@m0 b bVar) {
        return b(bVar, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.recyclerview.widget.i.c b(@d.m0 androidx.recyclerview.widget.i.b r15, boolean r16) {
        /*
            int r0 = r15.e()
            int r1 = r15.d()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.recyclerview.widget.i$f r3 = new androidx.recyclerview.widget.i$f
            r5 = 0
            r3.<init>(r5, r0, r5, r1)
            r2.add(r3)
            int r3 = r0 + r1
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r3 = r3 + r0
            int r0 = r3 * 2
            int[] r1 = new int[r0]
            int[] r0 = new int[r0]
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x002e:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x00dd
            int r5 = r2.size()
            int r5 = r5 + -1
            java.lang.Object r5 = r2.remove(r5)
            r14 = r5
            androidx.recyclerview.widget.i$f r14 = (androidx.recyclerview.widget.i.f) r14
            int r6 = r14.f3551a
            int r7 = r14.f3552b
            int r8 = r14.f3553c
            int r9 = r14.f3554d
            r5 = r15
            r10 = r1
            r11 = r0
            r12 = r3
            androidx.recyclerview.widget.i$g r5 = c(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto L_0x00d8
            int r6 = r5.f3557c
            if (r6 <= 0) goto L_0x005a
            r4.add(r5)
        L_0x005a:
            int r6 = r5.f3555a
            int r7 = r14.f3551a
            int r6 = r6 + r7
            r5.f3555a = r6
            int r6 = r5.f3556b
            int r7 = r14.f3553c
            int r6 = r6 + r7
            r5.f3556b = r6
            boolean r6 = r13.isEmpty()
            if (r6 == 0) goto L_0x0074
            androidx.recyclerview.widget.i$f r6 = new androidx.recyclerview.widget.i$f
            r6.<init>()
            goto L_0x0080
        L_0x0074:
            int r6 = r13.size()
            int r6 = r6 + -1
            java.lang.Object r6 = r13.remove(r6)
            androidx.recyclerview.widget.i$f r6 = (androidx.recyclerview.widget.i.f) r6
        L_0x0080:
            int r7 = r14.f3551a
            r6.f3551a = r7
            int r7 = r14.f3553c
            r6.f3553c = r7
            boolean r7 = r5.f3559e
            if (r7 == 0) goto L_0x0095
            int r7 = r5.f3555a
        L_0x008e:
            r6.f3552b = r7
            int r7 = r5.f3556b
        L_0x0092:
            r6.f3554d = r7
            goto L_0x00a7
        L_0x0095:
            boolean r7 = r5.f3558d
            if (r7 == 0) goto L_0x009e
            int r7 = r5.f3555a
            int r7 = r7 + -1
            goto L_0x008e
        L_0x009e:
            int r7 = r5.f3555a
            r6.f3552b = r7
            int r7 = r5.f3556b
            int r7 = r7 + -1
            goto L_0x0092
        L_0x00a7:
            r2.add(r6)
            boolean r6 = r5.f3559e
            if (r6 == 0) goto L_0x00c7
            boolean r6 = r5.f3558d
            if (r6 == 0) goto L_0x00ba
            int r6 = r5.f3555a
            int r7 = r5.f3557c
            int r6 = r6 + r7
            int r6 = r6 + 1
            goto L_0x00cc
        L_0x00ba:
            int r6 = r5.f3555a
            int r7 = r5.f3557c
            int r6 = r6 + r7
            r14.f3551a = r6
            int r5 = r5.f3556b
            int r5 = r5 + r7
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00c7:
            int r6 = r5.f3555a
            int r7 = r5.f3557c
            int r6 = r6 + r7
        L_0x00cc:
            r14.f3551a = r6
            int r5 = r5.f3556b
            int r5 = r5 + r7
        L_0x00d1:
            r14.f3553c = r5
            r2.add(r14)
            goto L_0x002e
        L_0x00d8:
            r13.add(r14)
            goto L_0x002e
        L_0x00dd:
            java.util.Comparator<androidx.recyclerview.widget.i$g> r2 = f3532a
            java.util.Collections.sort(r4, r2)
            androidx.recyclerview.widget.i$c r8 = new androidx.recyclerview.widget.i$c
            r2 = r8
            r3 = r15
            r5 = r1
            r6 = r0
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.b(androidx.recyclerview.widget.i$b, boolean):androidx.recyclerview.widget.i$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if (r2[r12 - 1] < r2[r12 + 1]) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097 A[LOOP:1: B:10:0x0033->B:33:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x007f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.recyclerview.widget.i.g c(androidx.recyclerview.widget.i.b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x0129
            if (r4 >= r5) goto L_0x0011
            goto L_0x0129
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = r5
            goto L_0x002e
        L_0x002d:
            r8 = r10
        L_0x002e:
            r9 = r10
        L_0x002f:
            if (r9 > r7) goto L_0x0121
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x009d
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = r5
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = r10
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.b(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x0097
            int r10 = r6 - r9
            r15 = 1
            int r10 = r10 + r15
            if (r12 < r10) goto L_0x0097
            int r10 = r6 + r9
            int r10 = r10 - r15
            if (r12 > r10) goto L_0x0097
            r10 = r2[r5]
            if (r13 < r10) goto L_0x0097
            androidx.recyclerview.widget.i$g r0 = new androidx.recyclerview.widget.i$g
            r0.<init>()
            r2 = r2[r5]
            r0.f3555a = r2
            int r3 = r2 - r12
            r0.f3556b = r3
            r1 = r1[r5]
            int r1 = r1 - r2
            r0.f3557c = r1
            r0.f3558d = r14
            r15 = 0
            r0.f3559e = r15
            return r0
        L_0x0097:
            r15 = 0
            int r12 = r12 + 2
            r10 = r15
            r5 = 1
            goto L_0x0033
        L_0x009d:
            r15 = r10
            r5 = r11
        L_0x009f:
            if (r5 > r9) goto L_0x0116
            int r10 = r5 + r6
            int r12 = r9 + r6
            if (r10 == r12) goto L_0x00c1
            int r12 = r11 + r6
            if (r10 == r12) goto L_0x00b8
            int r12 = r26 + r10
            int r13 = r12 + -1
            r13 = r2[r13]
            r14 = 1
            int r12 = r12 + r14
            r12 = r2[r12]
            if (r13 >= r12) goto L_0x00b9
            goto L_0x00c2
        L_0x00b8:
            r14 = 1
        L_0x00b9:
            int r12 = r26 + r10
            int r12 = r12 + r14
            r12 = r2[r12]
            int r12 = r12 - r14
            r13 = r14
            goto L_0x00c8
        L_0x00c1:
            r14 = 1
        L_0x00c2:
            int r12 = r26 + r10
            int r12 = r12 - r14
            r12 = r2[r12]
            r13 = r15
        L_0x00c8:
            int r16 = r12 - r10
        L_0x00ca:
            if (r12 <= 0) goto L_0x00e7
            if (r16 <= 0) goto L_0x00e7
            int r17 = r20 + r12
            int r15 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.b(r15, r3)
            if (r3 == 0) goto L_0x00e9
            int r12 = r12 + -1
            int r16 = r16 + -1
            r3 = r18
            r14 = 1
            r15 = 0
            goto L_0x00ca
        L_0x00e7:
            r18 = r3
        L_0x00e9:
            int r3 = r26 + r10
            r2[r3] = r12
            if (r8 != 0) goto L_0x010f
            if (r10 < r11) goto L_0x010f
            if (r10 > r9) goto L_0x010f
            r14 = r1[r3]
            if (r14 < r12) goto L_0x010f
            androidx.recyclerview.widget.i$g r0 = new androidx.recyclerview.widget.i$g
            r0.<init>()
            r2 = r2[r3]
            r0.f3555a = r2
            int r4 = r2 - r10
            r0.f3556b = r4
            r1 = r1[r3]
            int r1 = r1 - r2
            r0.f3557c = r1
            r0.f3558d = r13
            r3 = 1
            r0.f3559e = r3
            return r0
        L_0x010f:
            r3 = 1
            int r5 = r5 + 2
            r3 = r18
            r15 = 0
            goto L_0x009f
        L_0x0116:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r5 = r3
            r3 = r18
            r10 = 0
            goto L_0x002f
        L_0x0121:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x0129:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.c(androidx.recyclerview.widget.i$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.i$g");
    }
}
