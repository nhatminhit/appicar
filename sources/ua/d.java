package ua;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f23323b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c  reason: collision with root package name */
    public static final int f23324c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f23325d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f23326e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f23327f = 3;

    /* renamed from: g  reason: collision with root package name */
    public static final int f23328g = 4;

    /* renamed from: h  reason: collision with root package name */
    public static final int[][] f23329h = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: i  reason: collision with root package name */
    public static final int[][] f23330i;

    /* renamed from: j  reason: collision with root package name */
    public static final int[][] f23331j;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f23332a;

    public class a implements Comparator<f> {
        public a() {
        }

        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.e() - fVar2.e();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, new int[]{5, 256});
        f23330i = iArr;
        iArr[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f23330i[0][i10] = (i10 - 65) + 2;
        }
        f23330i[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f23330i[1][i11] = (i11 - 97) + 2;
        }
        f23330i[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f23330i[2][i12] = (i12 - 48) + 2;
        }
        int[] iArr2 = f23330i[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f23330i[3][iArr3[i13]] = i13;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr4[i14];
            if (i15 > 0) {
                f23330i[4][i15] = i14;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 6});
        f23331j = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f23331j;
        iArr6[0][4] = 0;
        int[] iArr7 = iArr6[1];
        iArr7[4] = 0;
        iArr7[0] = 28;
        iArr6[3][4] = 0;
        int[] iArr8 = iArr6[2];
        iArr8[4] = 0;
        iArr8[0] = 15;
    }

    public d(byte[] bArr) {
        this.f23332a = bArr;
    }

    public static Collection<f> b(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f next : iterable) {
            boolean z10 = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f fVar = (f) it.next();
                if (fVar.h(next)) {
                    z10 = false;
                    break;
                } else if (next.h(fVar)) {
                    it.remove();
                }
            }
            if (z10) {
                linkedList.add(next);
            }
        }
        return linkedList;
    }

    public static void d(f fVar, int i10, int i11, Collection<f> collection) {
        f c10 = fVar.c(i10);
        collection.add(c10.i(4, i11));
        if (fVar.f() != 4) {
            collection.add(c10.j(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(c10.i(2, 16 - i11).i(2, 1));
        }
        if (fVar.d() > 0) {
            collection.add(fVar.a(i10).a(i10 + 1));
        }
    }

    public static Collection<f> f(Iterable<f> iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        for (f d10 : iterable) {
            d(d10, i10, i11, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ya.a a() {
        /*
            r8 = this;
            ua.f r0 = ua.f.f23335e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L_0x0008:
            byte[] r3 = r8.f23332a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r5 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r5 = r1
        L_0x0016:
            byte r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L_0x0038
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L_0x0034
            r6 = 46
            if (r3 == r6) goto L_0x0030
            r6 = 58
            if (r3 == r6) goto L_0x002c
        L_0x002a:
            r3 = r1
            goto L_0x003d
        L_0x002c:
            if (r5 != r7) goto L_0x002a
            r3 = 5
            goto L_0x003d
        L_0x0030:
            if (r5 != r7) goto L_0x002a
            r3 = 3
            goto L_0x003d
        L_0x0034:
            if (r5 != r7) goto L_0x002a
            r3 = 4
            goto L_0x003d
        L_0x0038:
            r3 = 10
            if (r5 != r3) goto L_0x002a
            r3 = 2
        L_0x003d:
            if (r3 <= 0) goto L_0x0045
            java.util.Collection r0 = f(r0, r2, r3)
            r2 = r4
            goto L_0x0049
        L_0x0045:
            java.util.Collection r0 = r8.e(r0, r2)
        L_0x0049:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004c:
            ua.d$a r1 = new ua.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            ua.f r0 = (ua.f) r0
            byte[] r1 = r8.f23332a
            ya.a r0 = r0.k(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.d.a():ya.a");
    }

    public final void c(f fVar, int i10, Collection<f> collection) {
        char c10 = (char) (this.f23332a[i10] & 255);
        boolean z10 = f23330i[fVar.f()][c10] > 0;
        f fVar2 = null;
        for (int i11 = 0; i11 <= 4; i11++) {
            int i12 = f23330i[i11][c10];
            if (i12 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.c(i10);
                }
                if (!z10 || i11 == fVar.f() || i11 == 2) {
                    collection.add(fVar2.i(i11, i12));
                }
                if (!z10 && f23331j[fVar.f()][i11] >= 0) {
                    collection.add(fVar2.j(i11, i12));
                }
            }
        }
        if (fVar.d() > 0 || f23330i[fVar.f()][c10] == 0) {
            collection.add(fVar.a(i10));
        }
    }

    public final Collection<f> e(Iterable<f> iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        for (f c10 : iterable) {
            c(c10, i10, linkedList);
        }
        return b(linkedList);
    }
}
