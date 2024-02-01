package xa;

import java.util.List;
import w0.d;

public final class g0 extends u {
    public static String q(CharSequence charSequence, String str) {
        List<String> t10 = f0.t(charSequence, str, true, false);
        if (t10 == null || t10.isEmpty()) {
            return null;
        }
        return t10.get(0);
    }

    public static String[] r(CharSequence charSequence, String str) {
        List<List<String>> u10 = f0.u(charSequence, str, true, false);
        if (u10 == null || u10.isEmpty()) {
            return null;
        }
        int size = u10.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = (String) u10.get(i10).get(0);
        }
        return strArr;
    }

    public static String t(String str) {
        return str != null ? (str.startsWith(d.f14357b) || str.startsWith("MAILTO:")) ? str.substring(7) : str : str;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xa.g k(qa.r r17) {
        /*
            r16 = this;
            java.lang.String r0 = xa.u.c(r17)
            java.lang.String r1 = "BEGIN:VEVENT"
            int r1 = r0.indexOf(r1)
            r2 = 0
            if (r1 >= 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r1 = "SUMMARY"
            java.lang.String r4 = q(r1, r0)
            java.lang.String r1 = "DTSTART"
            java.lang.String r5 = q(r1, r0)
            if (r5 != 0) goto L_0x001d
            return r2
        L_0x001d:
            java.lang.String r1 = "DTEND"
            java.lang.String r6 = q(r1, r0)
            java.lang.String r1 = "DURATION"
            java.lang.String r7 = q(r1, r0)
            java.lang.String r1 = "LOCATION"
            java.lang.String r8 = q(r1, r0)
            java.lang.String r1 = "ORGANIZER"
            java.lang.String r1 = q(r1, r0)
            java.lang.String r9 = t(r1)
            java.lang.String r1 = "ATTENDEE"
            java.lang.String[] r10 = r(r1, r0)
            r1 = 0
            if (r10 == 0) goto L_0x0051
            r3 = r1
        L_0x0043:
            int r11 = r10.length
            if (r3 >= r11) goto L_0x0051
            r11 = r10[r3]
            java.lang.String r11 = t(r11)
            r10[r3] = r11
            int r3 = r3 + 1
            goto L_0x0043
        L_0x0051:
            java.lang.String r3 = "DESCRIPTION"
            java.lang.String r11 = q(r3, r0)
            java.lang.String r3 = "GEO"
            java.lang.String r0 = q(r3, r0)
            r12 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r0 != 0) goto L_0x0063
            r14 = r12
            goto L_0x007f
        L_0x0063:
            r3 = 59
            int r3 = r0.indexOf(r3)
            if (r3 >= 0) goto L_0x006c
            return r2
        L_0x006c:
            java.lang.String r1 = r0.substring(r1, r3)     // Catch:{ NumberFormatException -> 0x0086 }
            double r12 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x0086 }
            int r3 = r3 + 1
            java.lang.String r0 = r0.substring(r3)     // Catch:{ NumberFormatException -> 0x0086 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0086 }
            r14 = r0
        L_0x007f:
            xa.g r0 = new xa.g     // Catch:{  }
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14)     // Catch:{  }
            return r0
        L_0x0086:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.g0.k(qa.r):xa.g");
    }
}
