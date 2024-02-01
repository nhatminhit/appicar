package com.google.android.gms.dynamite;

import a9.d;
import a9.e;
import a9.f;
import a9.g;
import a9.h;
import a9.i;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.util.DynamiteApi;
import d.m0;
import d.o0;
import d6.v;
import j8.q;
import j8.s;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

@e8.a
public final class DynamiteModule {
    @e8.a

    /* renamed from: b  reason: collision with root package name */
    public static final int f5807b = -1;
    @e8.a

    /* renamed from: c  reason: collision with root package name */
    public static final int f5808c = 1;
    @e8.a

    /* renamed from: d  reason: collision with root package name */
    public static final int f5809d = 0;
    @e8.a

    /* renamed from: e  reason: collision with root package name */
    public static final int f5810e = 0;
    @e8.a
    @m0

    /* renamed from: f  reason: collision with root package name */
    public static final b f5811f = new b();
    @e8.a
    @m0

    /* renamed from: g  reason: collision with root package name */
    public static final b f5812g = new c();
    @e8.a
    @m0

    /* renamed from: h  reason: collision with root package name */
    public static final b f5813h = new d();
    @e8.a
    @m0

    /* renamed from: i  reason: collision with root package name */
    public static final b f5814i = new e();
    @e8.a
    @m0

    /* renamed from: j  reason: collision with root package name */
    public static final b f5815j = new f();
    @e8.a
    @m0

    /* renamed from: k  reason: collision with root package name */
    public static final b f5816k = new g();
    @GuardedBy("DynamiteModule.class")
    @o0

    /* renamed from: l  reason: collision with root package name */
    public static Boolean f5817l = null;
    @GuardedBy("DynamiteModule.class")
    @o0

    /* renamed from: m  reason: collision with root package name */
    public static String f5818m = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: n  reason: collision with root package name */
    public static boolean f5819n = false;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: o  reason: collision with root package name */
    public static int f5820o = -1;
    @GuardedBy("DynamiteModule.class")
    @o0

    /* renamed from: p  reason: collision with root package name */
    public static Boolean f5821p;

    /* renamed from: q  reason: collision with root package name */
    public static final ThreadLocal f5822q = new ThreadLocal();

    /* renamed from: r  reason: collision with root package name */
    public static final ThreadLocal f5823r = new d();

    /* renamed from: s  reason: collision with root package name */
    public static final b.a f5824s = new a();
    @m0

    /* renamed from: t  reason: collision with root package name */
    public static final b f5825t = new h();
    @GuardedBy("DynamiteModule.class")
    @o0

    /* renamed from: u  reason: collision with root package name */
    public static h f5826u;
    @GuardedBy("DynamiteModule.class")
    @o0

    /* renamed from: v  reason: collision with root package name */
    public static i f5827v;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5828a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        @o0
        public static ClassLoader sClassLoader;
    }

    @e8.a
    public static class a extends Exception {
        public /* synthetic */ a(String str, g gVar) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th2, g gVar) {
            super(str, th2);
        }
    }

    public interface b {

        @e8.a
        public interface a {
            int a(@m0 Context context, @m0 String str, boolean z10) throws a;

            int b(@m0 Context context, @m0 String str);
        }

        @e8.a
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public static class C0096b {
            @e8.a

            /* renamed from: a  reason: collision with root package name */
            public int f5829a = 0;
            @e8.a

            /* renamed from: b  reason: collision with root package name */
            public int f5830b = 0;
            @e8.a

            /* renamed from: c  reason: collision with root package name */
            public int f5831c = 0;
        }

        @e8.a
        @m0
        C0096b a(@m0 Context context, @m0 String str, @m0 a aVar) throws a;
    }

    public DynamiteModule(Context context) {
        s.l(context);
        this.f5828a = context;
    }

    @e8.a
    public static int a(@m0 Context context, @m0 String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (q.b(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            return 0;
        } catch (Exception e10) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage()));
            return 0;
        }
    }

    @e8.a
    public static int c(@m0 Context context, @m0 String str) {
        return f(context, str, false);
    }

    @e8.a
    @m0
    public static DynamiteModule e(@m0 Context context, @m0 b bVar, @m0 String str) throws a {
        int i10;
        Boolean bool;
        DynamiteModule dynamiteModule;
        z8.d dVar;
        i iVar;
        Boolean valueOf;
        Context context2 = context;
        b bVar2 = bVar;
        String str2 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal threadLocal = f5822q;
        f fVar = (f) threadLocal.get();
        f fVar2 = new f((e) null);
        threadLocal.set(fVar2);
        ThreadLocal threadLocal2 = f5823r;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0096b a10 = bVar2.a(context2, str2, f5824s);
            int i11 = a10.f5829a;
            int i12 = a10.f5830b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Considering local module ");
            sb2.append(str2);
            sb2.append(":");
            sb2.append(i11);
            sb2.append(" and remote module ");
            sb2.append(str2);
            sb2.append(":");
            sb2.append(i12);
            int i13 = a10.f5831c;
            if (i13 != 0) {
                if (i13 == -1) {
                    if (a10.f5829a != 0) {
                        i13 = -1;
                    }
                }
                if (!(i13 == 1 && a10.f5830b == 0)) {
                    if (i13 == -1) {
                        DynamiteModule h10 = h(context2, str2);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = fVar2.f288a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(fVar);
                        return h10;
                    } else if (i13 == 1) {
                        try {
                            int i14 = a10.f5830b;
                            try {
                                synchronized (cls) {
                                    if (k(context)) {
                                        bool = f5817l;
                                    } else {
                                        throw new a("Remote loading disabled", (g) null);
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str2);
                                        sb3.append(", version >= ");
                                        sb3.append(i14);
                                        synchronized (cls) {
                                            iVar = f5827v;
                                        }
                                        if (iVar != null) {
                                            f fVar3 = (f) threadLocal.get();
                                            if (fVar3 == null || fVar3.f288a == null) {
                                                throw new a("No result cursor", (g) null);
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = fVar3.f288a;
                                            z8.f.b0(null);
                                            synchronized (cls) {
                                                valueOf = Boolean.valueOf(f5820o >= 2);
                                            }
                                            Context context3 = (Context) z8.f.J(valueOf.booleanValue() ? iVar.Z1(z8.f.b0(applicationContext), str2, i14, z8.f.b0(cursor2)) : iVar.Y1(z8.f.b0(applicationContext), str2, i14, z8.f.b0(cursor2)));
                                            if (context3 != null) {
                                                dynamiteModule = new DynamiteModule(context3);
                                            } else {
                                                throw new a("Failed to get module context", (g) null);
                                            }
                                        } else {
                                            throw new a("DynamiteLoaderV2 was not cached.", (g) null);
                                        }
                                    } else {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("Selected remote version of ");
                                        sb4.append(str2);
                                        sb4.append(", version >= ");
                                        sb4.append(i14);
                                        h l10 = l(context);
                                        if (l10 != null) {
                                            int Y1 = l10.Y1();
                                            if (Y1 >= 3) {
                                                f fVar4 = (f) threadLocal.get();
                                                if (fVar4 != null) {
                                                    dVar = l10.c2(z8.f.b0(context), str2, i14, z8.f.b0(fVar4.f288a));
                                                } else {
                                                    throw new a("No cached result cursor holder", (g) null);
                                                }
                                            } else {
                                                dVar = Y1 == 2 ? l10.d2(z8.f.b0(context), str2, i14) : l10.b2(z8.f.b0(context), str2, i14);
                                            }
                                            Object J = z8.f.J(dVar);
                                            if (J != null) {
                                                dynamiteModule = new DynamiteModule((Context) J);
                                            } else {
                                                throw new a("Failed to load remote module.", (g) null);
                                            }
                                        } else {
                                            throw new a("Failed to create IDynamiteLoader.", (g) null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = fVar2.f288a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(fVar);
                                    return dynamiteModule;
                                }
                                throw new a("Failed to determine which loading route to use.", (g) null);
                            } catch (RemoteException e10) {
                                throw new a("Failed to load remote module.", e10, (g) null);
                            } catch (a e11) {
                                throw e11;
                            } catch (Throwable th2) {
                                w8.i.a(context2, th2);
                                throw new a("Failed to load remote module.", th2, (g) null);
                            }
                        } catch (a e12) {
                            String message = e12.getMessage();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Failed to load remote module: ");
                            sb5.append(message);
                            int i15 = a10.f5829a;
                            if (i15 != 0) {
                                if (bVar.a(context2, str2, new i(i15, 0)).f5831c == -1) {
                                    DynamiteModule h11 = h(context2, str2);
                                    if (i10 != 0) {
                                        f5823r.set(Long.valueOf(longValue));
                                    }
                                    return h11;
                                }
                            }
                            throw new a("Remote load failed. No local fallback found.", e12, (g) null);
                        }
                    } else {
                        throw new a("VersionPolicy returned invalid code:" + i13, (g) null);
                    }
                }
            }
            throw new a("No acceptable module " + str2 + " found. Local version is " + a10.f5829a + " and remote version is " + a10.f5830b + ".", (g) null);
        } finally {
            if (longValue == 0) {
                f5823r.remove();
            } else {
                f5823r.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = fVar2.f288a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f5822q.set(fVar);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:50:0x009a=Splitter:B:50:0x009a, B:17:0x003b=Splitter:B:17:0x003b} */
    public static int f(@d.m0 android.content.Context r10, @d.m0 java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x018f }
            java.lang.Boolean r1 = f5817l     // Catch:{ all -> 0x018c }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00cc
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00af }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00af }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00af }
            if (r5 != r6) goto L_0x0036
        L_0x0032:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00af }
            goto L_0x00ad
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            i(r5)     // Catch:{ a -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00af }
            goto L_0x00ad
        L_0x003f:
            boolean r5 = k(r10)     // Catch:{ all -> 0x00af }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            return r3
        L_0x0048:
            boolean r5 = f5819n     // Catch:{ all -> 0x00af }
            if (r5 != 0) goto L_0x00a5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00af }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00af }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a5
        L_0x0055:
            r6 = 1
            int r6 = g(r10, r11, r12, r6)     // Catch:{ a -> 0x009d }
            java.lang.String r7 = f5818m     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x009a
            boolean r7 = r7.isEmpty()     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x0065
            goto L_0x009a
        L_0x0065:
            java.lang.ClassLoader r7 = a9.b.a()     // Catch:{ a -> 0x009d }
            if (r7 == 0) goto L_0x006c
            goto L_0x008f
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x009d }
            r8 = 29
            if (r7 < r8) goto L_0x0081
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ a -> 0x009d }
            java.lang.String r8 = f5818m     // Catch:{ a -> 0x009d }
            j8.s.l(r8)     // Catch:{ a -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x009d }
            goto L_0x008f
        L_0x0081:
            a9.c r7 = new a9.c     // Catch:{ a -> 0x009d }
            java.lang.String r8 = f5818m     // Catch:{ a -> 0x009d }
            j8.s.l(r8)     // Catch:{ a -> 0x009d }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x009d }
            r7.<init>(r8, r9)     // Catch:{ a -> 0x009d }
        L_0x008f:
            i(r7)     // Catch:{ a -> 0x009d }
            r1.set(r2, r7)     // Catch:{ a -> 0x009d }
            f5817l = r5     // Catch:{ a -> 0x009d }
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            return r6
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            return r6
        L_0x009d:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00af }
            r1.set(r2, r5)     // Catch:{ all -> 0x00af }
            goto L_0x0032
        L_0x00a5:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00af }
            r1.set(r2, r5)     // Catch:{ all -> 0x00af }
            goto L_0x0032
        L_0x00ad:
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            goto L_0x00ca
        L_0x00af:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00af }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00b6, IllegalAccessException -> 0x00b4, NoSuchFieldException -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            goto L_0x00b7
        L_0x00b4:
            r1 = move-exception
            goto L_0x00b7
        L_0x00b6:
            r1 = move-exception
        L_0x00b7:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x018c }
            r4.<init>()     // Catch:{ all -> 0x018c }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x018c }
            r4.append(r1)     // Catch:{ all -> 0x018c }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x018c }
        L_0x00ca:
            f5817l = r1     // Catch:{ all -> 0x018c }
        L_0x00cc:
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x00eb
            int r10 = g(r10, r11, r12, r3)     // Catch:{ a -> 0x00d8 }
            return r10
        L_0x00d8:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x018f }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x018f }
            r12.<init>()     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x018f }
            r12.append(r11)     // Catch:{ all -> 0x018f }
            return r3
        L_0x00eb:
            a9.h r4 = l(r10)     // Catch:{ all -> 0x018f }
            if (r4 != 0) goto L_0x00f3
            goto L_0x0183
        L_0x00f3:
            int r0 = r4.Y1()     // Catch:{ RemoteException -> 0x016b }
            r1 = 3
            if (r0 < r1) goto L_0x0154
            java.lang.ThreadLocal r0 = f5822q     // Catch:{ RemoteException -> 0x016b }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x016b }
            a9.f r0 = (a9.f) r0     // Catch:{ RemoteException -> 0x016b }
            if (r0 == 0) goto L_0x010e
            android.database.Cursor r0 = r0.f288a     // Catch:{ RemoteException -> 0x016b }
            if (r0 == 0) goto L_0x010e
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x016b }
            goto L_0x0183
        L_0x010e:
            z8.d r5 = z8.f.b0(r10)     // Catch:{ RemoteException -> 0x016b }
            java.lang.ThreadLocal r0 = f5823r     // Catch:{ RemoteException -> 0x016b }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x016b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x016b }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x016b }
            r6 = r11
            r7 = r12
            z8.d r11 = r4.e2(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x016b }
            java.lang.Object r11 = z8.f.J(r11)     // Catch:{ RemoteException -> 0x016b }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x016b }
            if (r11 == 0) goto L_0x014e
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x014b, all -> 0x0148 }
            if (r12 != 0) goto L_0x0133
            goto L_0x014e
        L_0x0133:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x014b, all -> 0x0148 }
            if (r12 <= 0) goto L_0x0140
            boolean r0 = j(r11)     // Catch:{ RemoteException -> 0x014b, all -> 0x0148 }
            if (r0 == 0) goto L_0x0140
            goto L_0x0141
        L_0x0140:
            r2 = r11
        L_0x0141:
            if (r2 == 0) goto L_0x0146
            r2.close()     // Catch:{ all -> 0x018f }
        L_0x0146:
            r3 = r12
            goto L_0x0183
        L_0x0148:
            r12 = move-exception
            r2 = r11
            goto L_0x0186
        L_0x014b:
            r12 = move-exception
            r2 = r11
            goto L_0x016d
        L_0x014e:
            if (r11 == 0) goto L_0x0183
            r11.close()     // Catch:{ all -> 0x018f }
            goto L_0x0183
        L_0x0154:
            r1 = 2
            if (r0 != r1) goto L_0x0160
            z8.d r0 = z8.f.b0(r10)     // Catch:{ RemoteException -> 0x016b }
            int r3 = r4.a2(r0, r11, r12)     // Catch:{ RemoteException -> 0x016b }
            goto L_0x0183
        L_0x0160:
            z8.d r0 = z8.f.b0(r10)     // Catch:{ RemoteException -> 0x016b }
            int r3 = r4.Z1(r0, r11, r12)     // Catch:{ RemoteException -> 0x016b }
            goto L_0x0183
        L_0x0169:
            r12 = r11
            goto L_0x0186
        L_0x016b:
            r11 = move-exception
            r12 = r11
        L_0x016d:
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r12.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x0184 }
            r12.append(r11)     // Catch:{ all -> 0x0184 }
            if (r2 == 0) goto L_0x0183
            r2.close()     // Catch:{ all -> 0x018f }
        L_0x0183:
            return r3
        L_0x0184:
            r11 = move-exception
            goto L_0x0169
        L_0x0186:
            if (r2 == 0) goto L_0x018b
            r2.close()     // Catch:{ all -> 0x018f }
        L_0x018b:
            throw r12     // Catch:{ all -> 0x018f }
        L_0x018c:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            throw r11     // Catch:{ all -> 0x018f }
        L_0x018f:
            r11 = move-exception
            w8.i.a(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f5823r     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r12.<init>()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f5818m = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f5820o = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = r11
        L_0x007f:
            f5819n = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = j(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b1
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00ab:
            r10 = move-exception
            r11 = r10
            goto L_0x00c0
        L_0x00ae:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b1:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x00be }
            if (r12 == 0) goto L_0x00b6
            throw r11     // Catch:{ all -> 0x00be }
        L_0x00b6:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00be }
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00be }
            throw r12     // Catch:{ all -> 0x00be }
        L_0x00be:
            r11 = move-exception
            r0 = r10
        L_0x00c0:
            if (r0 == 0) goto L_0x00c5
            r0.close()
        L_0x00c5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static DynamiteModule h(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    public static void i(ClassLoader classLoader) throws a {
        i iVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder);
            }
            f5827v = iVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10, (g) null);
        }
    }

    public static boolean j(Cursor cursor) {
        f fVar = (f) f5822q.get();
        if (fVar == null || fVar.f288a != null) {
            return false;
        }
        fVar.f288a = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    public static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f5821p)) {
            return true;
        }
        boolean z10 = false;
        if (f5821p == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (d8.f.i().k(context, v.f6453m) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f5821p = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f5819n = true;
            }
        }
        return z10;
    }

    @o0
    public static h l(Context context) {
        h hVar;
        synchronized (DynamiteModule.class) {
            h hVar2 = f5826u;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new h(iBinder);
                }
                if (hVar != null) {
                    f5826u = hVar;
                    return hVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
            }
        }
        return null;
    }

    @e8.a
    @m0
    public Context b() {
        return this.f5828a;
    }

    @e8.a
    @m0
    public IBinder d(@m0 String str) throws a {
        try {
            return (IBinder) this.f5828a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, (g) null);
        }
    }
}
