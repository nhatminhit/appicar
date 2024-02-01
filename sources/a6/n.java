package a6;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

@Deprecated
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final int f255a = 29;

    /* renamed from: b  reason: collision with root package name */
    public static final TimeZone f256b = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static String b(Date date) {
        return d(date, false, f256b);
    }

    public static String c(Date date, boolean z10) {
        return d(date, z10, f256b);
    }

    @Deprecated
    public static String d(Date date, boolean z10, TimeZone timeZone) {
        return e(date, z10, timeZone, Locale.US);
    }

    public static String e(Date date, boolean z10, TimeZone timeZone, Locale locale) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(String.format("%04d-%02d-%02dT%02d:%02d:%02d", new Object[]{Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13))}));
        if (z10) {
            sb2.append(String.format(".%03d", new Object[]{Integer.valueOf(gregorianCalendar.get(14))}));
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int abs = Math.abs(i10 / 60);
            int abs2 = Math.abs(i10 % 60);
            Object[] objArr = new Object[3];
            objArr[0] = Character.valueOf(offset < 0 ? '-' : '+');
            objArr[1] = Integer.valueOf(abs);
            objArr[2] = Integer.valueOf(abs2);
            sb2.append(String.format("%c%02d:%02d", objArr));
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    public static int f(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cf A[Catch:{ Exception -> 0x01a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019b A[Catch:{ Exception -> 0x01a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date g(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ Exception -> 0x01a3 }
            int r3 = r0 + 4
            int r0 = h(r1, r0, r3)     // Catch:{ Exception -> 0x01a3 }
            r4 = 45
            boolean r5 = a(r1, r3, r4)     // Catch:{ Exception -> 0x01a3 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = h(r1, r3, r5)     // Catch:{ Exception -> 0x01a3 }
            boolean r6 = a(r1, r5, r4)     // Catch:{ Exception -> 0x01a3 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = h(r1, r5, r6)     // Catch:{ Exception -> 0x01a3 }
            r7 = 84
            boolean r7 = a(r1, r6, r7)     // Catch:{ Exception -> 0x01a3 }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r17.length()     // Catch:{ Exception -> 0x01a3 }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ Exception -> 0x01a3 }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ Exception -> 0x01a3 }
            r2.setIndex(r6)     // Catch:{ Exception -> 0x01a3 }
            java.util.Date r0 = r4.getTime()     // Catch:{ Exception -> 0x01a3 }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            r12 = 2
            if (r7 == 0) goto L_0x00c5
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = h(r1, r6, r7)     // Catch:{ Exception -> 0x01a3 }
            r13 = 58
            boolean r14 = a(r1, r7, r13)     // Catch:{ Exception -> 0x01a3 }
            if (r14 == 0) goto L_0x0062
            int r7 = r7 + 1
        L_0x0062:
            int r14 = r7 + 2
            int r7 = h(r1, r7, r14)     // Catch:{ Exception -> 0x01a3 }
            boolean r13 = a(r1, r14, r13)     // Catch:{ Exception -> 0x01a3 }
            if (r13 == 0) goto L_0x0070
            int r14 = r14 + 1
        L_0x0070:
            int r13 = r17.length()     // Catch:{ Exception -> 0x01a3 }
            if (r13 <= r14) goto L_0x00c0
            char r13 = r1.charAt(r14)     // Catch:{ Exception -> 0x01a3 }
            if (r13 == r10) goto L_0x00c0
            if (r13 == r9) goto L_0x00c0
            if (r13 == r4) goto L_0x00c0
            int r13 = r14 + 2
            int r14 = h(r1, r14, r13)     // Catch:{ Exception -> 0x01a3 }
            r15 = 59
            if (r14 <= r15) goto L_0x0090
            r15 = 63
            if (r14 >= r15) goto L_0x0090
            r14 = 59
        L_0x0090:
            r15 = 46
            boolean r15 = a(r1, r13, r15)     // Catch:{ Exception -> 0x01a3 }
            if (r15 == 0) goto L_0x00bb
            int r13 = r13 + 1
            int r15 = r13 + 1
            int r15 = f(r1, r15)     // Catch:{ Exception -> 0x01a3 }
            int r11 = r13 + 3
            int r11 = java.lang.Math.min(r15, r11)     // Catch:{ Exception -> 0x01a3 }
            int r16 = h(r1, r13, r11)     // Catch:{ Exception -> 0x01a3 }
            int r11 = r11 - r13
            if (r11 == r8) goto L_0x00b3
            if (r11 == r12) goto L_0x00b0
            goto L_0x00b5
        L_0x00b0:
            int r16 = r16 * 10
            goto L_0x00b5
        L_0x00b3:
            int r16 = r16 * 100
        L_0x00b5:
            r11 = r7
            r13 = r16
            r7 = r6
            r6 = r15
            goto L_0x00c9
        L_0x00bb:
            r11 = r7
            r7 = r6
            r6 = r13
            r13 = 0
            goto L_0x00c9
        L_0x00c0:
            r11 = r7
            r13 = 0
            r7 = r6
            r6 = r14
            goto L_0x00c8
        L_0x00c5:
            r7 = 0
            r11 = 0
            r13 = 0
        L_0x00c8:
            r14 = 0
        L_0x00c9:
            int r15 = r17.length()     // Catch:{ Exception -> 0x01a3 }
            if (r15 <= r6) goto L_0x019b
            char r15 = r1.charAt(r6)     // Catch:{ Exception -> 0x01a3 }
            if (r15 != r10) goto L_0x00da
            java.util.TimeZone r4 = f256b     // Catch:{ Exception -> 0x01a3 }
            int r6 = r6 + r8
            goto L_0x016a
        L_0x00da:
            if (r15 == r9) goto L_0x00fb
            if (r15 != r4) goto L_0x00df
            goto L_0x00fb
        L_0x00df:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ Exception -> 0x01a3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a3 }
            r3.<init>()     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ Exception -> 0x01a3 }
            r3.append(r15)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01a3 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x01a3 }
            throw r0     // Catch:{ Exception -> 0x01a3 }
        L_0x00fb:
            java.lang.String r4 = r1.substring(r6)     // Catch:{ Exception -> 0x01a3 }
            int r9 = r4.length()     // Catch:{ Exception -> 0x01a3 }
            int r6 = r6 + r9
            java.lang.String r9 = "+0000"
            boolean r9 = r9.equals(r4)     // Catch:{ Exception -> 0x01a3 }
            if (r9 != 0) goto L_0x0168
            java.lang.String r9 = "+00:00"
            boolean r9 = r9.equals(r4)     // Catch:{ Exception -> 0x01a3 }
            if (r9 == 0) goto L_0x0115
            goto L_0x0168
        L_0x0115:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a3 }
            r9.<init>()     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r10 = "GMT"
            r9.append(r10)     // Catch:{ Exception -> 0x01a3 }
            r9.append(r4)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x01a3 }
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r4)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r10 = r9.getID()     // Catch:{ Exception -> 0x01a3 }
            boolean r15 = r10.equals(r4)     // Catch:{ Exception -> 0x01a3 }
            if (r15 != 0) goto L_0x0166
            java.lang.String r15 = ":"
            java.lang.String r12 = ""
            java.lang.String r10 = r10.replace(r15, r12)     // Catch:{ Exception -> 0x01a3 }
            boolean r10 = r10.equals(r4)     // Catch:{ Exception -> 0x01a3 }
            if (r10 == 0) goto L_0x0143
            goto L_0x0166
        L_0x0143:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ Exception -> 0x01a3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a3 }
            r3.<init>()     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r3.append(r5)     // Catch:{ Exception -> 0x01a3 }
            r3.append(r4)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r4 = r9.getID()     // Catch:{ Exception -> 0x01a3 }
            r3.append(r4)     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01a3 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x01a3 }
            throw r0     // Catch:{ Exception -> 0x01a3 }
        L_0x0166:
            r4 = r9
            goto L_0x016a
        L_0x0168:
            java.util.TimeZone r4 = f256b     // Catch:{ Exception -> 0x01a3 }
        L_0x016a:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ Exception -> 0x01a3 }
            r9.<init>(r4)     // Catch:{ Exception -> 0x01a3 }
            r4 = 0
            r9.setLenient(r4)     // Catch:{ Exception -> 0x01a3 }
            r9.set(r8, r0)     // Catch:{ Exception -> 0x01a3 }
            int r3 = r3 - r8
            r0 = 2
            r9.set(r0, r3)     // Catch:{ Exception -> 0x01a3 }
            r0 = 5
            r9.set(r0, r5)     // Catch:{ Exception -> 0x01a3 }
            r0 = 11
            r9.set(r0, r7)     // Catch:{ Exception -> 0x01a3 }
            r0 = 12
            r9.set(r0, r11)     // Catch:{ Exception -> 0x01a3 }
            r0 = 13
            r9.set(r0, r14)     // Catch:{ Exception -> 0x01a3 }
            r0 = 14
            r9.set(r0, r13)     // Catch:{ Exception -> 0x01a3 }
            r2.setIndex(r6)     // Catch:{ Exception -> 0x01a3 }
            java.util.Date r0 = r9.getTime()     // Catch:{ Exception -> 0x01a3 }
            return r0
        L_0x019b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x01a3 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ Exception -> 0x01a3 }
            throw r0     // Catch:{ Exception -> 0x01a3 }
        L_0x01a3:
            r0 = move-exception
            if (r1 != 0) goto L_0x01a8
            r1 = 0
            goto L_0x01bc
        L_0x01a8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01bc:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01c8
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x01e6
        L_0x01c8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "("
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x01e6:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = ": "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.n.g(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int h(String str, int i10, int i11) throws NumberFormatException {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit >= 0) {
                i12 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int digit2 = Character.digit(str.charAt(i13), 10);
            if (digit2 >= 0) {
                i12 = (i12 * 10) - digit2;
                i13 = i14;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
        }
        return -i12;
    }
}
