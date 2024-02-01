package w8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import d.m0;
import e8.a;
import j8.s;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import y8.e;

@a
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14892a = Process.myUid();

    /* renamed from: b  reason: collision with root package name */
    public static final Method f14893b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f14894c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f14895d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f14896e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f14897f;

    /* renamed from: g  reason: collision with root package name */
    public static final Method f14898g;

    /* renamed from: h  reason: collision with root package name */
    public static final Method f14899h;

    /* renamed from: i  reason: collision with root package name */
    public static final Method f14900i;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c A[SYNTHETIC, Splitter:B:23:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6  */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            int r2 = android.os.Process.myUid()
            f14892a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x001a }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x001a }
            r5[r3] = r6     // Catch:{ Exception -> 0x001a }
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.reflect.Method r5 = r6.getMethod(r1, r5)     // Catch:{ Exception -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r5 = r4
        L_0x001b:
            f14893b = r5
            boolean r5 = w8.v.g()
            r6 = 2
            if (r5 == 0) goto L_0x0033
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0033 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0033 }
            r5[r3] = r7     // Catch:{ Exception -> 0x0033 }
            r5[r2] = r0     // Catch:{ Exception -> 0x0033 }
            java.lang.Class<android.os.WorkSource> r7 = android.os.WorkSource.class
            java.lang.reflect.Method r1 = r7.getMethod(r1, r5)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r1 = r4
        L_0x0034:
            f14894c = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0041 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0042
        L_0x0041:
            r1 = r4
        L_0x0042:
            f14895d = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0053 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0053 }
            r1[r3] = r5     // Catch:{ Exception -> 0x0053 }
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.String r7 = "get"
            java.lang.reflect.Method r1 = r5.getMethod(r7, r1)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r1 = r4
        L_0x0054:
            f14896e = r1
            boolean r1 = w8.v.g()
            if (r1 == 0) goto L_0x006b
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x006b }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x006b }
            r1[r3] = r5     // Catch:{ Exception -> 0x006b }
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.String r7 = "getName"
            java.lang.reflect.Method r1 = r5.getMethod(r7, r1)     // Catch:{ Exception -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r1 = r4
        L_0x006c:
            f14897f = r1
            boolean r1 = w8.v.o()
            if (r1 == 0) goto L_0x007f
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "createWorkChain"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x007f }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x007f }
            goto L_0x0080
        L_0x007f:
            r1 = r4
        L_0x0080:
            f14898g = r1
            boolean r1 = w8.v.o()
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x009d }
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x009d }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x009d }
            r5[r3] = r6     // Catch:{ Exception -> 0x009d }
            r5[r2] = r0     // Catch:{ Exception -> 0x009d }
            java.lang.String r0 = "addNode"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x009d }
            goto L_0x009e
        L_0x009d:
            r0 = r4
        L_0x009e:
            f14899h = r0
            boolean r0 = w8.v.o()
            if (r0 == 0) goto L_0x00b3
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00b3 }
            java.lang.reflect.Method r4 = r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x00b3 }
            r4.setAccessible(r2)     // Catch:{ Exception -> 0x00b3 }
        L_0x00b3:
            f14900i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.e0.<clinit>():void");
    }

    @a
    public static void a(@m0 WorkSource workSource, int i10, @m0 String str) {
        Method method = f14894c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i10), str});
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        } else {
            Method method2 = f14893b;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i10)});
                } catch (Exception e11) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                }
            }
        }
    }

    @a
    @m0
    public static WorkSource b(@m0 Context context, @m0 String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c10 = e.a(context).c(str, 0);
                if (c10 == null) {
                    "Could not get applicationInfo from package: ".concat(str);
                    return null;
                }
                int i10 = c10.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                "Could not find package: ".concat(str);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    @e8.a
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.WorkSource c(@d.m0 android.content.Context r8, @d.m0 java.lang.String r9, @d.m0 java.lang.String r10) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0061
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            if (r1 == 0) goto L_0x0061
            if (r10 == 0) goto L_0x0061
            if (r9 != 0) goto L_0x000e
            goto L_0x0061
        L_0x000e:
            r1 = -1
            r2 = 0
            y8.d r8 = y8.e.a(r8)     // Catch:{ NameNotFoundException -> 0x0020 }
            android.content.pm.ApplicationInfo r8 = r8.c(r9, r2)     // Catch:{ NameNotFoundException -> 0x0020 }
            if (r8 != 0) goto L_0x001d
            java.lang.String r8 = "Could not get applicationInfo from package: "
            goto L_0x0022
        L_0x001d:
            int r1 = r8.uid
            goto L_0x0025
        L_0x0020:
            java.lang.String r8 = "Could not find package: "
        L_0x0022:
            r8.concat(r9)
        L_0x0025:
            if (r1 >= 0) goto L_0x0028
            return r0
        L_0x0028:
            android.os.WorkSource r8 = new android.os.WorkSource
            r8.<init>()
            java.lang.reflect.Method r0 = f14898g
            if (r0 == 0) goto L_0x005d
            java.lang.reflect.Method r3 = f14899h
            if (r3 != 0) goto L_0x0036
            goto L_0x005d
        L_0x0036:
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0060 }
            java.lang.Object r0 = r0.invoke(r8, r4)     // Catch:{ Exception -> 0x0060 }
            int r4 = f14892a     // Catch:{ Exception -> 0x0060 }
            r5 = 1
            r6 = 2
            if (r1 == r4) goto L_0x004f
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0060 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0060 }
            r7[r2] = r1     // Catch:{ Exception -> 0x0060 }
            r7[r5] = r9     // Catch:{ Exception -> 0x0060 }
            r3.invoke(r0, r7)     // Catch:{ Exception -> 0x0060 }
        L_0x004f:
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0060 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0060 }
            r9[r2] = r1     // Catch:{ Exception -> 0x0060 }
            r9[r5] = r10     // Catch:{ Exception -> 0x0060 }
            r3.invoke(r0, r9)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0060
        L_0x005d:
            a(r8, r1, r9)
        L_0x0060:
            return r8
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.e0.c(android.content.Context, java.lang.String, java.lang.String):android.os.WorkSource");
    }

    @a
    public static int d(@m0 WorkSource workSource, int i10) {
        Method method = f14896e;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[]{Integer.valueOf(i10)});
                s.l(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }

    @a
    @m0
    public static String e(@m0 WorkSource workSource, int i10) {
        Method method = f14897f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i10)});
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return null;
        }
    }

    @a
    @m0
    public static List<String> f(@m0 WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int i10 = workSource == null ? 0 : i(workSource);
        if (i10 != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                String e10 = e(workSource, i11);
                if (!b0.b(e10)) {
                    s.l(e10);
                    arrayList.add(e10);
                }
            }
        }
        return arrayList;
    }

    @a
    public static boolean g(@m0 Context context) {
        return (context == null || context.getPackageManager() == null || e.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    @a
    public static boolean h(@m0 WorkSource workSource) {
        Method method = f14900i;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                s.l(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception unused) {
            }
        }
        return i(workSource) == 0;
    }

    @a
    public static int i(@m0 WorkSource workSource) {
        Method method = f14895d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                s.l(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }
}
