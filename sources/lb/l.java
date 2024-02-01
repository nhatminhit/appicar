package lb;

import java.util.Collection;
import java.util.Collections;
import qa.a;
import qa.h;

public final class l extends z {

    /* renamed from: b  reason: collision with root package name */
    public static final int f20470b = 67;

    public boolean[] e(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.r(str);
            } catch (h e10) {
                throw new IllegalArgumentException(e10);
            }
        } else if (length == 8) {
            try {
                if (!y.i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        s.d(str);
        boolean[] zArr = new boolean[67];
        int c10 = s.c(zArr, 0, y.f20505f, true) + 0;
        for (int i10 = 0; i10 <= 3; i10++) {
            c10 += s.c(zArr, c10, y.f20508i[Character.digit(str.charAt(i10), 10)], false);
        }
        int c11 = c10 + s.c(zArr, c10, y.f20506g, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            c11 += s.c(zArr, c11, y.f20508i[Character.digit(str.charAt(i11), 10)], true);
        }
        s.c(zArr, c11, y.f20505f, true);
        return zArr;
    }

    public Collection<a> g() {
        return Collections.singleton(a.EAN_8);
    }
}
