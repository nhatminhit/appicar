package i0;

public final class b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.os.CancellationSignal} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.Cursor a(android.content.ContentResolver r7, android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12, x0.c r13) {
        /*
            if (r13 == 0) goto L_0x0009
            java.lang.Object r13 = r13.b()     // Catch:{ Exception -> 0x0007 }
            goto L_0x000a
        L_0x0007:
            r7 = move-exception
            goto L_0x0018
        L_0x0009:
            r13 = 0
        L_0x000a:
            r6 = r13
            android.os.CancellationSignal r6 = (android.os.CancellationSignal) r6     // Catch:{ Exception -> 0x0007 }
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0007 }
            return r7
        L_0x0018:
            boolean r8 = r7 instanceof android.os.OperationCanceledException
            if (r8 == 0) goto L_0x0022
            x0.q r7 = new x0.q
            r7.<init>()
            throw r7
        L_0x0022:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.a(android.content.ContentResolver, android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, x0.c):android.database.Cursor");
    }
}
