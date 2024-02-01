package eb;

public class c implements g {
    public static String e(CharSequence charSequence) {
        int charAt = (charSequence.charAt(0) * 1600) + (charSequence.charAt(1) * '(') + charSequence.charAt(2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    public static void g(h hVar, StringBuilder sb2) {
        hVar.t(e(sb2));
        sb2.delete(0, 3);
    }

    public int a() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        if (r2 != 1) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (r2 != 2) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(eb.h r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.j()
            if (r1 == 0) goto L_0x0075
            char r1 = r9.d()
            int r2 = r9.f18546f
            r3 = 1
            int r2 = r2 + r3
            r9.f18546f = r2
            int r1 = r8.d(r1, r0)
            int r2 = r0.length()
            r4 = 3
            int r2 = r2 / r4
            int r2 = r2 << r3
            int r5 = r9.a()
            int r5 = r5 + r2
            r9.r(r5)
            eb.k r2 = r9.h()
            int r2 = r2.b()
            int r2 = r2 - r5
            boolean r5 = r9.j()
            if (r5 != 0) goto L_0x0056
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r0.length()
            int r6 = r6 % r4
            r7 = 2
            if (r6 != r7) goto L_0x004a
            if (r2 == r7) goto L_0x004a
        L_0x0046:
            int r1 = r8.c(r9, r0, r5, r1)
        L_0x004a:
            int r6 = r0.length()
            int r6 = r6 % r4
            if (r6 != r3) goto L_0x0075
            if (r1 > r4) goto L_0x0046
            if (r2 == r3) goto L_0x0075
            goto L_0x0046
        L_0x0056:
            int r1 = r0.length()
            int r1 = r1 % r4
            if (r1 != 0) goto L_0x0005
            java.lang.String r1 = r9.e()
            int r2 = r9.f18546f
            int r3 = r8.a()
            int r1 = eb.j.o(r1, r2, r3)
            int r2 = r8.a()
            if (r1 == r2) goto L_0x0005
            r1 = 0
            r9.p(r1)
        L_0x0075:
            r8.f(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.c.b(eb.h):void");
    }

    public final int c(h hVar, StringBuilder sb2, StringBuilder sb3, int i10) {
        int length = sb2.length();
        sb2.delete(length - i10, length);
        hVar.f18546f--;
        int d10 = d(hVar.d(), sb3);
        hVar.l();
        return d10;
    }

    public int d(char c10, StringBuilder sb2) {
        int i10;
        int i11;
        char c11;
        if (c10 == ' ') {
            c11 = 3;
        } else {
            if (c10 >= '0' && c10 <= '9') {
                i11 = (c10 - '0') + 4;
            } else if (c10 < 'A' || c10 > 'Z') {
                if (c10 < ' ') {
                    sb2.append(0);
                } else {
                    if (c10 <= '/') {
                        sb2.append(1);
                        i10 = c10 - '!';
                    } else if (c10 <= '@') {
                        sb2.append(1);
                        i10 = (c10 - ':') + 15;
                    } else if (c10 <= '_') {
                        sb2.append(1);
                        i10 = (c10 - '[') + 22;
                    } else if (c10 <= 127) {
                        sb2.append(2);
                        i10 = c10 - '`';
                    } else {
                        sb2.append("\u0001\u001e");
                        return d((char) (c10 - 128), sb2) + 2;
                    }
                    c10 = (char) i10;
                }
                sb2.append(c10);
                return 2;
            } else {
                i11 = (c10 - 'A') + 14;
            }
            c11 = (char) i11;
        }
        sb2.append(c11);
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r8.j() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r8.j() != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(eb.h r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 1
            int r0 = r0 << r2
            int r3 = r9.length()
            int r3 = r3 % r1
            int r4 = r8.a()
            int r4 = r4 + r0
            r8.r(r4)
            eb.k r0 = r8.h()
            int r0 = r0.b()
            int r0 = r0 - r4
            r4 = 0
            r5 = 254(0xfe, float:3.56E-43)
            r6 = 2
            if (r3 != r6) goto L_0x003b
            r9.append(r4)
        L_0x0027:
            int r0 = r9.length()
            if (r0 < r1) goto L_0x0031
            g(r8, r9)
            goto L_0x0027
        L_0x0031:
            boolean r9 = r8.j()
            if (r9 == 0) goto L_0x006d
        L_0x0037:
            r8.s(r5)
            goto L_0x006d
        L_0x003b:
            if (r0 != r2) goto L_0x0058
            if (r3 != r2) goto L_0x0058
        L_0x003f:
            int r0 = r9.length()
            if (r0 < r1) goto L_0x0049
            g(r8, r9)
            goto L_0x003f
        L_0x0049:
            boolean r9 = r8.j()
            if (r9 == 0) goto L_0x0052
            r8.s(r5)
        L_0x0052:
            int r9 = r8.f18546f
            int r9 = r9 - r2
            r8.f18546f = r9
            goto L_0x006d
        L_0x0058:
            if (r3 != 0) goto L_0x0071
        L_0x005a:
            int r2 = r9.length()
            if (r2 < r1) goto L_0x0064
            g(r8, r9)
            goto L_0x005a
        L_0x0064:
            if (r0 > 0) goto L_0x0037
            boolean r9 = r8.j()
            if (r9 == 0) goto L_0x006d
            goto L_0x0037
        L_0x006d:
            r8.p(r4)
            return
        L_0x0071:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unexpected case. Please report!"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.c.f(eb.h, java.lang.StringBuilder):void");
    }
}
