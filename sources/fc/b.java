package fc;

public final class b {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        re.c.a(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        throw new java.lang.RuntimeException("Can't parse HTML file.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x002a */
    @fh.g
    @d.g1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(@fh.g java.io.InputStream r12) {
        /*
            java.lang.String r0 = "inputStream"
            xe.l0.p(r12, r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x002a }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x002a }
            java.lang.String r2 = "utf-8"
            r1.<init>(r12, r2)     // Catch:{ Exception -> 0x002a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x002a }
            java.util.List r3 = re.y.j(r0)     // Catch:{ Exception -> 0x002a }
            java.lang.String r4 = "\n"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 62
            r11 = 0
            java.lang.String r0 = be.e0.h3(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x002a }
            r1 = 0
            re.c.a(r12, r1)
            return r0
        L_0x0028:
            r0 = move-exception
            goto L_0x0032
        L_0x002a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "Can't parse HTML file."
            r0.<init>(r1)     // Catch:{ all -> 0x0028 }
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0032:
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r1 = move-exception
            re.c.a(r12, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.b.a(java.io.InputStream):java.lang.String");
    }
}
