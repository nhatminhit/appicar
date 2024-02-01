package ch;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class q extends AbstractList<f> implements RandomAccess {
    public final f[] O;
    public final int[] P;

    public q(f[] fVarArr, int[] iArr) {
        this.O = fVarArr;
        this.P = iArr;
    }

    public static void b(long j10, c cVar, int i10, List<f> list, int i11, int i12, List<Integer> list2) {
        int i13;
        int i14;
        c cVar2;
        int i15;
        c cVar3 = cVar;
        int i16 = i10;
        List<f> list3 = list;
        int i17 = i11;
        int i18 = i12;
        List<Integer> list4 = list2;
        if (i17 < i18) {
            int i19 = i17;
            while (i19 < i18) {
                if (list3.get(i19).R() >= i16) {
                    i19++;
                } else {
                    throw new AssertionError();
                }
            }
            f fVar = list.get(i11);
            f fVar2 = list3.get(i18 - 1);
            int i20 = -1;
            if (i16 == fVar.R()) {
                i20 = list4.get(i17).intValue();
                i17++;
                fVar = list3.get(i17);
            }
            int i21 = i17;
            if (fVar.r(i16) != fVar2.r(i16)) {
                int i22 = 1;
                for (int i23 = i21 + 1; i23 < i18; i23++) {
                    if (list3.get(i23 - 1).r(i16) != list3.get(i23).r(i16)) {
                        i22++;
                    }
                }
                long e10 = j10 + ((long) e(cVar)) + 2 + ((long) (i22 * 2));
                cVar3.writeInt(i22);
                cVar3.writeInt(i20);
                for (int i24 = i21; i24 < i18; i24++) {
                    byte r10 = list3.get(i24).r(i16);
                    if (i24 == i21 || r10 != list3.get(i24 - 1).r(i16)) {
                        cVar3.writeInt(r10 & 255);
                    }
                }
                c cVar4 = new c();
                int i25 = i21;
                while (i25 < i18) {
                    byte r11 = list3.get(i25).r(i16);
                    int i26 = i25 + 1;
                    int i27 = i26;
                    while (true) {
                        if (i27 >= i18) {
                            i14 = i18;
                            break;
                        } else if (r11 != list3.get(i27).r(i16)) {
                            i14 = i27;
                            break;
                        } else {
                            i27++;
                        }
                    }
                    if (i26 == i14 && i16 + 1 == list3.get(i25).R()) {
                        cVar3.writeInt(list4.get(i25).intValue());
                        i15 = i14;
                        cVar2 = cVar4;
                    } else {
                        cVar3.writeInt((int) ((((long) e(cVar4)) + e10) * -1));
                        i15 = i14;
                        cVar2 = cVar4;
                        b(e10, cVar4, i16 + 1, list, i25, i14, list2);
                    }
                    cVar4 = cVar2;
                    i25 = i15;
                }
                c cVar5 = cVar4;
                cVar3.d1(cVar5, cVar5.size());
                return;
            }
            int i28 = 0;
            int min = Math.min(fVar.R(), fVar2.R());
            int i29 = i16;
            while (i29 < min && fVar.r(i29) == fVar2.r(i29)) {
                i28++;
                i29++;
            }
            long e11 = 1 + j10 + ((long) e(cVar)) + 2 + ((long) i28);
            cVar3.writeInt(-i28);
            cVar3.writeInt(i20);
            int i30 = i16;
            while (true) {
                i13 = i16 + i28;
                if (i30 >= i13) {
                    break;
                }
                cVar3.writeInt(fVar.r(i30) & 255);
                i30++;
            }
            if (i21 + 1 != i18) {
                c cVar6 = new c();
                cVar3.writeInt((int) ((((long) e(cVar6)) + e11) * -1));
                b(e11, cVar6, i13, list, i21, i12, list2);
                cVar3.d1(cVar6, cVar6.size());
            } else if (i13 == list3.get(i21).R()) {
                cVar3.writeInt(list4.get(i21).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    public static int e(c cVar) {
        return (int) (cVar.size() / 4);
    }

    public static q f(f... fVarArr) {
        if (fVarArr.length == 0) {
            return new q(new f[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(fVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(-1);
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.set(Collections.binarySearch(arrayList, fVarArr[i11]), Integer.valueOf(i11));
        }
        if (((f) arrayList.get(0)).R() != 0) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                f fVar = (f) arrayList.get(i12);
                int i13 = i12 + 1;
                int i14 = i13;
                while (i14 < arrayList.size()) {
                    f fVar2 = (f) arrayList.get(i14);
                    if (!fVar2.S(fVar)) {
                        continue;
                        break;
                    } else if (fVar2.R() == fVar.R()) {
                        throw new IllegalArgumentException("duplicate option: " + fVar2);
                    } else if (((Integer) arrayList2.get(i14)).intValue() > ((Integer) arrayList2.get(i12)).intValue()) {
                        arrayList.remove(i14);
                        arrayList2.remove(i14);
                    } else {
                        i14++;
                    }
                }
                i12 = i13;
            }
            c cVar = new c();
            b(0, cVar, 0, arrayList, 0, arrayList.size(), arrayList2);
            int e10 = e(cVar);
            int[] iArr = new int[e10];
            for (int i15 = 0; i15 < e10; i15++) {
                iArr[i15] = cVar.readInt();
            }
            if (cVar.X()) {
                return new q((f[]) fVarArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    /* renamed from: c */
    public f get(int i10) {
        return this.O[i10];
    }

    public final int size() {
        return this.O.length;
    }
}
