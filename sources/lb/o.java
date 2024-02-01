package lb;

import java.util.Collection;
import java.util.Collections;
import qa.a;

public final class o extends s {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f20483b = {1, 1, 1, 1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f20484c = {3, 1, 1};

    /* renamed from: d  reason: collision with root package name */
    public static final int f20485d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f20486e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int[][] f20487f = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    public boolean[] e(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            s.d(str);
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int c10 = s.c(zArr, 0, f20483b, true);
            for (int i10 = 0; i10 < length; i10 += 2) {
                int digit = Character.digit(str.charAt(i10), 10);
                int digit2 = Character.digit(str.charAt(i10 + 1), 10);
                int[] iArr = new int[10];
                for (int i11 = 0; i11 < 5; i11++) {
                    int i12 = i11 * 2;
                    int[][] iArr2 = f20487f;
                    iArr[i12] = iArr2[digit][i11];
                    iArr[i12 + 1] = iArr2[digit2][i11];
                }
                c10 += s.c(zArr, c10, iArr, true);
            }
            s.c(zArr, c10, f20484c, true);
            return zArr;
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }

    public Collection<a> g() {
        return Collections.singleton(a.ITF);
    }
}
