package y8;

import android.content.Context;
import d.o0;
import e8.a;

@a
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static Context f15577a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f15578b;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003e */
    @e8.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(@d.m0 android.content.Context r4) {
        /*
            java.lang.Class<y8.b> r0 = y8.b.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x004b }
            android.content.Context r2 = f15577a     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0018
            java.lang.Boolean r3 = f15578b     // Catch:{ all -> 0x004b }
            if (r3 == 0) goto L_0x0018
            if (r2 == r1) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            boolean r4 = r3.booleanValue()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)
            return r4
        L_0x0018:
            r2 = 0
            f15578b = r2     // Catch:{ all -> 0x004b }
            boolean r2 = w8.v.n()     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0030
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x004b }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x004b }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x004b }
        L_0x002d:
            f15578b = r4     // Catch:{ all -> 0x004b }
            goto L_0x0041
        L_0x0030:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x003e }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x003e }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x003e }
            f15578b = r4     // Catch:{ ClassNotFoundException -> 0x003e }
            goto L_0x0041
        L_0x003e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004b }
            goto L_0x002d
        L_0x0041:
            f15577a = r1     // Catch:{ all -> 0x004b }
            java.lang.Boolean r4 = f15578b     // Catch:{ all -> 0x004b }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004b }
            monitor-exit(r0)
            return r4
        L_0x004b:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.b.a(android.content.Context):boolean");
    }
}
