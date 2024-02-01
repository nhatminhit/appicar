package lb;

import java.util.Collection;
import java.util.Collections;
import qa.a;
import qa.h;

public final class b0 extends z {

    /* renamed from: b  reason: collision with root package name */
    public static final int f20420b = 51;

    public boolean[] e(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.r(a0.s(str));
            } catch (h e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length == 8) {
            try {
                if (!y.i(a0.s(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        s.d(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i10 = a0.f20414m[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int c10 = s.c(zArr, 0, y.f20505f, true);
            for (int i11 = 1; i11 <= 6; i11++) {
                int digit2 = Character.digit(str.charAt(i11), 10);
                if (((i10 >> (6 - i11)) & 1) == 1) {
                    digit2 += 10;
                }
                c10 += s.c(zArr, c10, y.f20509j[digit2], false);
            }
            s.c(zArr, c10, y.f20507h, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }

    public Collection<a> g() {
        return Collections.singleton(a.UPC_E);
    }
}
