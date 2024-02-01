package lb;

import qa.m;
import ya.a;

public final class c extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final int[][] f20421a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* renamed from: b  reason: collision with root package name */
    public static final float f20422b = 0.25f;

    /* renamed from: c  reason: collision with root package name */
    public static final float f20423c = 0.7f;

    /* renamed from: d  reason: collision with root package name */
    public static final int f20424d = 98;

    /* renamed from: e  reason: collision with root package name */
    public static final int f20425e = 99;

    /* renamed from: f  reason: collision with root package name */
    public static final int f20426f = 100;

    /* renamed from: g  reason: collision with root package name */
    public static final int f20427g = 101;

    /* renamed from: h  reason: collision with root package name */
    public static final int f20428h = 102;

    /* renamed from: i  reason: collision with root package name */
    public static final int f20429i = 97;

    /* renamed from: j  reason: collision with root package name */
    public static final int f20430j = 96;

    /* renamed from: k  reason: collision with root package name */
    public static final int f20431k = 101;

    /* renamed from: l  reason: collision with root package name */
    public static final int f20432l = 100;

    /* renamed from: m  reason: collision with root package name */
    public static final int f20433m = 103;

    /* renamed from: n  reason: collision with root package name */
    public static final int f20434n = 104;

    /* renamed from: o  reason: collision with root package name */
    public static final int f20435o = 105;

    /* renamed from: p  reason: collision with root package name */
    public static final int f20436p = 106;

    public static int h(a aVar, int[] iArr, int i10) throws m {
        r.f(aVar, i10, iArr);
        float f10 = 0.25f;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[][] iArr2 = f20421a;
            if (i12 >= iArr2.length) {
                break;
            }
            float e10 = r.e(iArr, iArr2[i12], 0.7f);
            if (e10 < f10) {
                i11 = i12;
                f10 = e10;
            }
            i12++;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw m.a();
    }

    public static int[] i(a aVar) throws m {
        int s10 = aVar.s();
        int q10 = aVar.q(0);
        int[] iArr = new int[6];
        boolean z10 = false;
        int i10 = 0;
        int i11 = q10;
        while (q10 < s10) {
            if (aVar.n(q10) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 == 5) {
                    float f10 = 0.25f;
                    int i12 = -1;
                    for (int i13 = 103; i13 <= 105; i13++) {
                        float e10 = r.e(iArr, f20421a[i13], 0.7f);
                        if (e10 < f10) {
                            i12 = i13;
                            f10 = e10;
                        }
                    }
                    if (i12 < 0 || !aVar.u(Math.max(0, i11 - ((q10 - i11) / 2)), i11, false)) {
                        i11 += iArr[0] + iArr[1];
                        int i14 = i10 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i14);
                        iArr[i14] = 0;
                        iArr[i10] = 0;
                        i10--;
                    } else {
                        return new int[]{i11, q10, i12};
                    }
                } else {
                    i10++;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            q10++;
        }
        throw m.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0156, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0159, code lost:
        if (r18 == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x015b, code lost:
        if (r14 != 'e') goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x015d, code lost:
        r14 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x015f, code lost:
        r14 = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0160, code lost:
        r18 = r5;
        r15 = 6;
        r23 = r12;
        r12 = r8;
        r8 = r21;
        r21 = r19;
        r19 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        r13.append((char) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        if (r13.length() == 0) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        r13.append("]C1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c5, code lost:
        r13.append(hb.b.f19529o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d2, code lost:
        if (r9 != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        r10 = 'd';
        r14 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e8, code lost:
        r5 = false;
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fb, code lost:
        if (r13.length() == 0) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0104, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0108, code lost:
        if (r9 != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010a, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010c, code lost:
        r5 = false;
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x010f, code lost:
        r5 = false;
        r10 = 'd';
        r14 = 'c';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0116, code lost:
        r10 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0119, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x011b, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x011c, code lost:
        r10 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x014d, code lost:
        r14 = 'e';
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qa.r c(int r25, ya.a r26, java.util.Map<qa.e, ?> r27) throws qa.m, qa.h, qa.d {
        /*
            r24 = this;
            r0 = r26
            r1 = r27
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            qa.e r4 = qa.e.ASSUME_GS1
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x0012
            r1 = r2
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            int[] r4 = i(r26)
            r5 = 2
            r6 = r4[r5]
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 20
            r7.<init>(r8)
            byte r9 = (byte) r6
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            r7.add(r9)
            switch(r6) {
                case 103: goto L_0x0037;
                case 104: goto L_0x0034;
                case 105: goto L_0x0031;
                default: goto L_0x002c;
            }
        L_0x002c:
            qa.h r0 = qa.h.a()
            throw r0
        L_0x0031:
            r12 = 99
            goto L_0x0039
        L_0x0034:
            r12 = 100
            goto L_0x0039
        L_0x0037:
            r12 = 101(0x65, float:1.42E-43)
        L_0x0039:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r8)
            r8 = r4[r3]
            r14 = r4[r2]
            r15 = 6
            int[] r2 = new int[r15]
            r9 = r3
            r16 = r9
            r18 = r16
            r19 = r18
            r20 = r19
            r21 = r20
            r17 = 1
            r23 = r12
            r12 = r8
            r8 = r14
            r14 = r23
        L_0x0058:
            if (r16 != 0) goto L_0x016f
            int r12 = h(r0, r2, r8)
            byte r5 = (byte) r12
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r7.add(r5)
            r5 = 106(0x6a, float:1.49E-43)
            if (r12 == r5) goto L_0x006c
            r17 = 1
        L_0x006c:
            if (r12 == r5) goto L_0x0074
            int r20 = r20 + 1
            int r21 = r20 * r12
            int r6 = r6 + r21
        L_0x0074:
            r21 = r8
            r11 = 0
        L_0x0077:
            if (r11 >= r15) goto L_0x0080
            r22 = r2[r11]
            int r21 = r21 + r22
            int r11 = r11 + 1
            goto L_0x0077
        L_0x0080:
            switch(r12) {
                case 103: goto L_0x008e;
                case 104: goto L_0x008e;
                case 105: goto L_0x008e;
                default: goto L_0x0083;
            }
        L_0x0083:
            r11 = 96
            java.lang.String r15 = "]C1"
            switch(r14) {
                case 99: goto L_0x011f;
                case 100: goto L_0x00de;
                case 101: goto L_0x0093;
                default: goto L_0x008a;
            }
        L_0x008a:
            r10 = 100
            goto L_0x0156
        L_0x008e:
            qa.h r0 = qa.h.a()
            throw r0
        L_0x0093:
            r10 = 64
            if (r12 >= r10) goto L_0x00a3
            int r5 = r12 + 32
            if (r9 != r3) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            int r5 = r5 + 128
        L_0x009e:
            char r5 = (char) r5
            r13.append(r5)
            goto L_0x00e8
        L_0x00a3:
            if (r12 >= r11) goto L_0x00ad
            if (r9 != r3) goto L_0x00aa
            int r5 = r12 + -64
            goto L_0x009e
        L_0x00aa:
            int r5 = r12 + 64
            goto L_0x009e
        L_0x00ad:
            if (r12 == r5) goto L_0x00b1
            r17 = 0
        L_0x00b1:
            if (r12 == r5) goto L_0x0119
            switch(r12) {
                case 96: goto L_0x011b;
                case 97: goto L_0x011b;
                case 98: goto L_0x00d7;
                case 99: goto L_0x010f;
                case 100: goto L_0x00d5;
                case 101: goto L_0x00cb;
                case 102: goto L_0x00b8;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            goto L_0x011b
        L_0x00b8:
            if (r1 == 0) goto L_0x011b
            int r5 = r13.length()
            if (r5 != 0) goto L_0x00c5
        L_0x00c0:
            r13.append(r15)
            goto L_0x011b
        L_0x00c5:
            r5 = 29
            r13.append(r5)
            goto L_0x011b
        L_0x00cb:
            if (r3 != 0) goto L_0x00d0
            if (r9 == 0) goto L_0x00d0
            goto L_0x0104
        L_0x00d0:
            if (r3 == 0) goto L_0x010c
            if (r9 == 0) goto L_0x010c
            goto L_0x010a
        L_0x00d5:
            r5 = 0
            goto L_0x00d8
        L_0x00d7:
            r5 = 1
        L_0x00d8:
            r10 = 100
            r14 = 100
            goto L_0x0157
        L_0x00de:
            if (r12 >= r11) goto L_0x00eb
            int r5 = r12 + 32
            if (r9 != r3) goto L_0x00e5
            goto L_0x009e
        L_0x00e5:
            int r5 = r5 + 128
            goto L_0x009e
        L_0x00e8:
            r5 = 0
            r9 = 0
            goto L_0x011c
        L_0x00eb:
            if (r12 == r5) goto L_0x00ef
            r17 = 0
        L_0x00ef:
            if (r12 == r5) goto L_0x0119
            switch(r12) {
                case 96: goto L_0x011b;
                case 97: goto L_0x011b;
                case 98: goto L_0x0115;
                case 99: goto L_0x010f;
                case 100: goto L_0x0100;
                case 101: goto L_0x00fe;
                case 102: goto L_0x00f5;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            goto L_0x011b
        L_0x00f5:
            if (r1 == 0) goto L_0x011b
            int r5 = r13.length()
            if (r5 != 0) goto L_0x00c5
            goto L_0x00c0
        L_0x00fe:
            r5 = 0
            goto L_0x0116
        L_0x0100:
            if (r3 != 0) goto L_0x0106
            if (r9 == 0) goto L_0x0106
        L_0x0104:
            r3 = 1
            goto L_0x00e8
        L_0x0106:
            if (r3 == 0) goto L_0x010c
            if (r9 == 0) goto L_0x010c
        L_0x010a:
            r3 = 0
            goto L_0x00e8
        L_0x010c:
            r5 = 0
            r9 = 1
            goto L_0x011c
        L_0x010f:
            r5 = 0
            r10 = 100
            r14 = 99
            goto L_0x0157
        L_0x0115:
            r5 = 1
        L_0x0116:
            r10 = 100
            goto L_0x014d
        L_0x0119:
            r16 = 1
        L_0x011b:
            r5 = 0
        L_0x011c:
            r10 = 100
            goto L_0x0157
        L_0x011f:
            r10 = 100
            if (r12 >= r10) goto L_0x0130
            r5 = 10
            if (r12 >= r5) goto L_0x012c
            r5 = 48
            r13.append(r5)
        L_0x012c:
            r13.append(r12)
            goto L_0x0156
        L_0x0130:
            if (r12 == r5) goto L_0x0134
            r17 = 0
        L_0x0134:
            if (r12 == r5) goto L_0x0152
            switch(r12) {
                case 100: goto L_0x0150;
                case 101: goto L_0x014c;
                case 102: goto L_0x013a;
                default: goto L_0x0139;
            }
        L_0x0139:
            goto L_0x0156
        L_0x013a:
            if (r1 == 0) goto L_0x0156
            int r5 = r13.length()
            if (r5 != 0) goto L_0x0146
            r13.append(r15)
            goto L_0x0156
        L_0x0146:
            r5 = 29
            r13.append(r5)
            goto L_0x0156
        L_0x014c:
            r5 = 0
        L_0x014d:
            r14 = 101(0x65, float:1.42E-43)
            goto L_0x0157
        L_0x0150:
            r14 = r10
            goto L_0x0156
        L_0x0152:
            r5 = 0
            r16 = 1
            goto L_0x0157
        L_0x0156:
            r5 = 0
        L_0x0157:
            r11 = 101(0x65, float:1.42E-43)
            if (r18 == 0) goto L_0x0160
            if (r14 != r11) goto L_0x015f
            r14 = r10
            goto L_0x0160
        L_0x015f:
            r14 = r11
        L_0x0160:
            r18 = r5
            r5 = 2
            r15 = 6
            r23 = r12
            r12 = r8
            r8 = r21
            r21 = r19
            r19 = r23
            goto L_0x0058
        L_0x016f:
            int r1 = r8 - r12
            int r2 = r0.r(r8)
            int r3 = r26.s()
            int r5 = r2 - r12
            r8 = 2
            int r5 = r5 / r8
            int r5 = r5 + r2
            int r3 = java.lang.Math.min(r3, r5)
            r5 = 0
            boolean r0 = r0.u(r2, r3, r5)
            if (r0 == 0) goto L_0x01fc
            r3 = r21
            int r20 = r20 * r3
            int r6 = r6 - r20
            int r6 = r6 % 103
            if (r6 != r3) goto L_0x01f7
            int r0 = r13.length()
            if (r0 == 0) goto L_0x01f2
            if (r0 <= 0) goto L_0x01a9
            if (r17 == 0) goto L_0x01a9
            r2 = 99
            if (r14 != r2) goto L_0x01a4
            int r2 = r0 + -2
            goto L_0x01a6
        L_0x01a4:
            int r2 = r0 + -1
        L_0x01a6:
            r13.delete(r2, r0)
        L_0x01a9:
            r0 = 1
            r2 = r4[r0]
            r0 = 0
            r3 = r4[r0]
            int r2 = r2 + r3
            float r0 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r3 = (float) r12
            float r1 = (float) r1
            float r1 = r1 / r2
            float r3 = r3 + r1
            int r1 = r7.size()
            byte[] r2 = new byte[r1]
            r5 = 0
        L_0x01bf:
            if (r5 >= r1) goto L_0x01d0
            java.lang.Object r4 = r7.get(r5)
            java.lang.Byte r4 = (java.lang.Byte) r4
            byte r4 = r4.byteValue()
            r2[r5] = r4
            int r5 = r5 + 1
            goto L_0x01bf
        L_0x01d0:
            qa.r r1 = new qa.r
            java.lang.String r4 = r13.toString()
            r5 = 2
            qa.t[] r5 = new qa.t[r5]
            qa.t r6 = new qa.t
            r7 = r25
            float r7 = (float) r7
            r6.<init>(r0, r7)
            r0 = 0
            r5[r0] = r6
            qa.t r0 = new qa.t
            r0.<init>(r3, r7)
            r3 = 1
            r5[r3] = r0
            qa.a r0 = qa.a.CODE_128
            r1.<init>(r4, r2, r5, r0)
            return r1
        L_0x01f2:
            qa.m r0 = qa.m.a()
            throw r0
        L_0x01f7:
            qa.d r0 = qa.d.a()
            throw r0
        L_0x01fc:
            qa.m r0 = qa.m.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.c.c(int, ya.a, java.util.Map):qa.r");
    }
}
