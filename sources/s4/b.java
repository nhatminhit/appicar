package s4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import d.g1;
import d.m0;
import d.o0;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import v3.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12623a = "AppVersionSignature";

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentMap<String, f> f12624b = new ConcurrentHashMap();

    @o0
    public static PackageInfo a(@m0 Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot resolve info for");
            sb2.append(context.getPackageName());
            return null;
        }
    }

    @m0
    public static String b(@o0 PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @m0
    public static f c(@m0 Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, f> concurrentMap = f12624b;
        f fVar = concurrentMap.get(packageName);
        if (fVar != null) {
            return fVar;
        }
        f d10 = d(context);
        f putIfAbsent = concurrentMap.putIfAbsent(packageName, d10);
        return putIfAbsent == null ? d10 : putIfAbsent;
    }

    @m0
    public static f d(@m0 Context context) {
        return new e(b(a(context)));
    }

    @g1
    public static void e() {
        f12624b.clear();
    }
}
