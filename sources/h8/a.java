package h8;

import d.m0;
import d.o0;
import w8.d0;

@e8.a
public abstract class a<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f8912d = new Object();
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final String f8913a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final Object f8914b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public Object f8915c = null;

    public a(@m0 String str, @m0 Object obj) {
        this.f8913a = str;
        this.f8914b = obj;
    }

    @e8.a
    public static boolean c() {
        synchronized (f8912d) {
        }
        return false;
    }

    @e8.a
    @m0
    public static a<Float> f(@m0 String str, @m0 Float f10) {
        return new e(str, f10);
    }

    @e8.a
    @m0
    public static a<Integer> g(@m0 String str, @m0 Integer num) {
        return new d(str, num);
    }

    @e8.a
    @m0
    public static a<Long> h(@m0 String str, @m0 Long l10) {
        return new c(str, l10);
    }

    @e8.a
    @m0
    public static a<String> i(@m0 String str, @m0 String str2) {
        return new f(str, str2);
    }

    @e8.a
    @m0
    public static a<Boolean> j(@m0 String str, boolean z10) {
        return new b(str, Boolean.valueOf(z10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = k(r4.f8913a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0028, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0030, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0031, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0034, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001b */
    @e8.a
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f8915c
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.Object r1 = f8912d
            monitor-enter(r1)
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            monitor-enter(r1)
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r4.f8913a     // Catch:{ SecurityException -> 0x001b }
            java.lang.Object r1 = r4.k(r1)     // Catch:{ SecurityException -> 0x001b }
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x0019:
            r1 = move-exception
            goto L_0x0031
        L_0x001b:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch:{ all -> 0x0019 }
            java.lang.String r3 = r4.f8913a     // Catch:{ all -> 0x002c }
            java.lang.Object r3 = r4.k(r3)     // Catch:{ all -> 0x002c }
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ all -> 0x0019 }
            android.os.StrictMode.setThreadPolicy(r0)
            return r3
        L_0x002c:
            r3 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ all -> 0x0019 }
            throw r3     // Catch:{ all -> 0x0019 }
        L_0x0031:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        L_0x0035:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0038:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.a.a():java.lang.Object");
    }

    @e8.a
    @m0
    @Deprecated
    public final T b() {
        return a();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    @e8.a
    @w8.d0
    public void d(@d.m0 T r2) {
        /*
            r1 = this;
            r1.f8915c = r2
            java.lang.Object r2 = f8912d
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r2)     // Catch:{ all -> 0x0009 }
            monitor-exit(r2)     // Catch:{ all -> 0x000c }
            return
        L_0x0009:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0009 }
            throw r0     // Catch:{ all -> 0x000c }
        L_0x000c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.a.d(java.lang.Object):void");
    }

    @e8.a
    @d0
    public void e() {
        this.f8915c = null;
    }

    @m0
    public abstract Object k(@m0 String str);
}
