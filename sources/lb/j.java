package lb;

import java.util.Collection;
import java.util.Collections;
import qa.a;
import qa.h;

public final class j extends z {

    /* renamed from: b  reason: collision with root package name */
    public static final int f20468b = 95;

    public boolean[] e(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + y.r(str);
            } catch (h e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length == 13) {
            try {
                if (!y.i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        s.d(str);
        int i10 = i.f20466l[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int c10 = s.c(zArr, 0, y.f20505f, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int digit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                digit += 10;
            }
            c10 += s.c(zArr, c10, y.f20509j[digit], false);
        }
        int c11 = c10 + s.c(zArr, c10, y.f20506g, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            c11 += s.c(zArr, c11, y.f20508i[Character.digit(str.charAt(i12), 10)], true);
        }
        s.c(zArr, c11, y.f20505f, true);
        return zArr;
    }

    public Collection<a> g() {
        return Collections.singleton(a.EAN_13);
    }
}
