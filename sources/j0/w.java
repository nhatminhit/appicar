package j0;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import androidx.core.graphics.drawable.IconCompat;
import d.g1;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import e1.n;
import j0.o;
import j0.p;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class w {

    /* renamed from: a  reason: collision with root package name */
    public static final int f9358a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f9359b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f9360c = 4;

    /* renamed from: d  reason: collision with root package name */
    public static final int f9361d = 8;
    @g1

    /* renamed from: e  reason: collision with root package name */
    public static final String f9362e = "com.android.launcher.action.INSTALL_SHORTCUT";
    @g1

    /* renamed from: f  reason: collision with root package name */
    public static final String f9363f = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* renamed from: g  reason: collision with root package name */
    public static final int f9364g = 96;

    /* renamed from: h  reason: collision with root package name */
    public static final int f9365h = 48;

    /* renamed from: i  reason: collision with root package name */
    public static final String f9366i = "android.intent.extra.shortcut.ID";

    /* renamed from: j  reason: collision with root package name */
    public static volatile p<?> f9367j = null;

    /* renamed from: k  reason: collision with root package name */
    public static volatile List<h> f9368k = null;

    /* renamed from: l  reason: collision with root package name */
    public static final String f9369l = "androidx.core.content.pm.SHORTCUT_LISTENER";

    /* renamed from: m  reason: collision with root package name */
    public static final String f9370m = "androidx.core.content.pm.shortcut_listener_impl";

    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IntentSender f9371a;

        public a(IntentSender intentSender) {
            this.f9371a = intentSender;
        }

        public void onReceive(Context context, Intent intent) {
            try {
                this.f9371a.sendIntent(context, 0, (Intent) null, (IntentSender.OnFinished) null, (Handler) null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    @t0(25)
    public static class b {
        public static String a(@m0 List<ShortcutInfo> list) {
            int i10 = -1;
            String str = null;
            for (ShortcutInfo next : list) {
                if (next.getRank() > i10) {
                    String id2 = next.getId();
                    str = id2;
                    i10 = next.getRank();
                }
            }
            return str;
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @g1
    public static void A(p<Void> pVar) {
        f9367j = pVar;
    }

    public static boolean B(@m0 Context context, @m0 List<o> list) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 29) {
            c(context, list);
        }
        if (i10 >= 25) {
            ArrayList arrayList = new ArrayList();
            for (o E : list) {
                arrayList.add(E.E());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
                return false;
            }
        }
        o(context).a(list);
        for (h d10 : n(context)) {
            d10.d(list);
        }
        return true;
    }

    public static boolean a(@m0 Context context, @m0 List<o> list) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 29) {
            c(context, list);
        }
        if (i10 >= 25) {
            ArrayList arrayList = new ArrayList();
            for (o E : list) {
                arrayList.add(E.E());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        o(context).a(list);
        for (h b10 : n(context)) {
            b10.b(list);
        }
        return true;
    }

    @g1
    public static boolean b(@m0 Context context, @m0 o oVar) {
        Bitmap decodeStream;
        IconCompat iconCompat = oVar.f9335i;
        if (iconCompat == null) {
            return false;
        }
        int i10 = iconCompat.f2218a;
        if (i10 != 6 && i10 != 4) {
            return true;
        }
        InputStream K = iconCompat.K(context);
        if (K == null || (decodeStream = BitmapFactory.decodeStream(K)) == null) {
            return false;
        }
        oVar.f9335i = i10 == 6 ? IconCompat.r(decodeStream) : IconCompat.u(decodeStream);
        return true;
    }

    @g1
    public static void c(@m0 Context context, @m0 List<o> list) {
        for (o oVar : new ArrayList(list)) {
            if (!b(context, oVar)) {
                list.remove(oVar);
            }
        }
    }

    @m0
    public static Intent d(@m0 Context context, @m0 o oVar) {
        Intent a10 = Build.VERSION.SDK_INT >= 26 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(oVar.E()) : null;
        if (a10 == null) {
            a10 = new Intent();
        }
        return oVar.a(a10);
    }

    public static void e(@m0 Context context, @m0 List<String> list, @o0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, charSequence);
        }
        o(context).d(list);
        for (h c10 : n(context)) {
            c10.c(list);
        }
    }

    public static void f(@m0 Context context, @m0 List<o> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            for (o oVar : list) {
                arrayList.add(oVar.f9328b);
            }
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        }
        o(context).a(list);
        for (h b10 : n(context)) {
            b10.b(list);
        }
    }

    @m0
    public static List<o> g(@m0 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (ShortcutInfo aVar : dynamicShortcuts) {
                arrayList.add(new o.a(context, aVar).c());
            }
            return arrayList;
        }
        try {
            return o(context).b();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static int h(@m0 Context context, boolean z10) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(androidx.appcompat.widget.c.f1244r);
        int max = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (((float) max) * ((z10 ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    public static int i(@m0 Context context) {
        n.g(context);
        return Build.VERSION.SDK_INT >= 25 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxHeight() : h(context, false);
    }

    public static int j(@m0 Context context) {
        n.g(context);
        return Build.VERSION.SDK_INT >= 25 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxWidth() : h(context, true);
    }

    public static int k(@m0 Context context) {
        n.g(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    @g1
    public static List<h> l() {
        return f9368k;
    }

    public static String m(@m0 List<o> list) {
        int i10 = -1;
        String str = null;
        for (o next : list) {
            if (next.u() > i10) {
                String j10 = next.j();
                str = j10;
                i10 = next.u();
            }
        }
        return str;
    }

    public static List<h> n(Context context) {
        Bundle bundle;
        String string;
        if (f9368k == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(f9369l);
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString(f9370m)) == null)) {
                    try {
                        arrayList.add((h) Class.forName(string, false, w.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f9368k == null) {
                f9368k = arrayList;
            }
        }
        return f9368k;
    }

    public static p<?> o(Context context) {
        if (f9367j == null) {
            try {
                f9367j = (p) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, w.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            } catch (Exception unused) {
            }
            if (f9367j == null) {
                f9367j = new p.a();
            }
        }
        return f9367j;
    }

    @m0
    public static List<o> p(@m0 Context context, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            return o.c(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i10));
        }
        if (i11 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            ArrayList arrayList = new ArrayList();
            if ((i10 & 1) != 0) {
                arrayList.addAll(shortcutManager.getManifestShortcuts());
            }
            if ((i10 & 2) != 0) {
                arrayList.addAll(shortcutManager.getDynamicShortcuts());
            }
            if ((i10 & 4) != 0) {
                arrayList.addAll(shortcutManager.getPinnedShortcuts());
            }
            return o.c(context, arrayList);
        }
        if ((i10 & 2) != 0) {
            try {
                return o(context).b();
            } catch (Exception unused) {
            }
        }
        return Collections.emptyList();
    }

    public static boolean q(@m0 Context context) {
        n.g(context);
        return Build.VERSION.SDK_INT >= 25 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRateLimitingActive() : p(context, 3).size() == k(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean r(@d.m0 android.content.Context r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0013
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r4 = r4.getSystemService(r0)
            android.content.pm.ShortcutManager r4 = (android.content.pm.ShortcutManager) r4
            boolean r4 = r4.isRequestPinShortcutSupported()
            return r4
        L_0x0013:
            java.lang.String r0 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r1 = i0.d.a(r4, r0)
            r2 = 0
            if (r1 == 0) goto L_0x001d
            return r2
        L_0x001d:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r1.<init>(r3)
            java.util.List r4 = r4.queryBroadcastReceivers(r1, r2)
            java.util.Iterator r4 = r4.iterator()
        L_0x0030:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r4.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.permission
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x004c
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0030
        L_0x004c:
            r4 = 1
            return r4
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.w.r(android.content.Context):boolean");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static boolean s(@d.m0 android.content.Context r6, @d.m0 j0.o r7) {
        /*
            e1.n.g(r6)
            e1.n.g(r7)
            int r0 = k(r6)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 > r3) goto L_0x0017
            b(r6, r7)
        L_0x0017:
            r3 = 30
            r4 = 1
            if (r2 < r3) goto L_0x002c
            java.lang.Class<android.content.pm.ShortcutManager> r2 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r6.getSystemService(r2)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            android.content.pm.ShortcutInfo r3 = r7.E()
            r2.pushDynamicShortcut(r3)
            goto L_0x0067
        L_0x002c:
            r3 = 25
            if (r2 < r3) goto L_0x0067
            java.lang.Class<android.content.pm.ShortcutManager> r2 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r6.getSystemService(r2)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            boolean r3 = r2.isRateLimitingActive()
            if (r3 == 0) goto L_0x003f
            return r1
        L_0x003f:
            java.util.List r3 = r2.getDynamicShortcuts()
            int r5 = r3.size()
            if (r5 < r0) goto L_0x0058
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String r3 = j0.w.b.a(r3)
            r5[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r5)
            r2.removeDynamicShortcuts(r3)
        L_0x0058:
            android.content.pm.ShortcutInfo[] r3 = new android.content.pm.ShortcutInfo[r4]
            android.content.pm.ShortcutInfo r5 = r7.E()
            r3[r1] = r5
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.addDynamicShortcuts(r3)
        L_0x0067:
            j0.p r2 = o(r6)
            java.util.List r3 = r2.b()     // Catch:{ Exception -> 0x00d8, all -> 0x00b3 }
            int r5 = r3.size()     // Catch:{ Exception -> 0x00d8, all -> 0x00b3 }
            if (r5 < r0) goto L_0x0084
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ Exception -> 0x00d8, all -> 0x00b3 }
            java.lang.String r3 = m(r3)     // Catch:{ Exception -> 0x00d8, all -> 0x00b3 }
            r0[r1] = r3     // Catch:{ Exception -> 0x00d8, all -> 0x00b3 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00b3 }
            r2.d(r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00b3 }
        L_0x0084:
            j0.o[] r0 = new j0.o[r4]     // Catch:{ Exception -> 0x00d8, all -> 0x00b3 }
            r0[r1] = r7     // Catch:{ Exception -> 0x00d8, all -> 0x00b3 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00b3 }
            r2.a(r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00b3 }
            java.util.List r0 = n(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x0097:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ab
            java.lang.Object r1 = r0.next()
            j0.h r1 = (j0.h) r1
            java.util.List r2 = java.util.Collections.singletonList(r7)
            r1.b(r2)
            goto L_0x0097
        L_0x00ab:
            java.lang.String r7 = r7.j()
            w(r6, r7)
            return r4
        L_0x00b3:
            r0 = move-exception
            java.util.List r1 = n(r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x00bc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d0
            java.lang.Object r2 = r1.next()
            j0.h r2 = (j0.h) r2
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r2.b(r3)
            goto L_0x00bc
        L_0x00d0:
            java.lang.String r7 = r7.j()
            w(r6, r7)
            throw r0
        L_0x00d8:
            java.util.List r0 = n(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x00e0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00f4
            java.lang.Object r2 = r0.next()
            j0.h r2 = (j0.h) r2
            java.util.List r3 = java.util.Collections.singletonList(r7)
            r2.b(r3)
            goto L_0x00e0
        L_0x00f4:
            java.lang.String r7 = r7.j()
            w(r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.w.s(android.content.Context, j0.o):boolean");
    }

    public static void t(@m0 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        o(context).c();
        for (h a10 : n(context)) {
            a10.a();
        }
    }

    public static void u(@m0 Context context, @m0 List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        o(context).d(list);
        for (h c10 : n(context)) {
            c10.c(list);
        }
    }

    public static void v(@m0 Context context, @m0 List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            u(context, list);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list);
        o(context).d(list);
        for (h c10 : n(context)) {
            c10.c(list);
        }
    }

    public static void w(@m0 Context context, @m0 String str) {
        n.g(context);
        n.g(str);
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        }
        for (h e10 : n(context)) {
            e10.e(Collections.singletonList(str));
        }
    }

    public static boolean x(@m0 Context context, @m0 o oVar, @o0 IntentSender intentSender) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(oVar.E(), intentSender);
        }
        if (!r(context)) {
            return false;
        }
        Intent a10 = oVar.a(new Intent(f9362e));
        if (intentSender == null) {
            context.sendBroadcast(a10);
            return true;
        }
        context.sendOrderedBroadcast(a10, (String) null, new a(intentSender), (Handler) null, -1, (String) null, (Bundle) null);
        return true;
    }

    public static boolean y(@m0 Context context, @m0 List<o> list) {
        n.g(context);
        n.g(list);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            for (o E : list) {
                arrayList.add(E.E());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        o(context).c();
        o(context).a(list);
        for (h next : n(context)) {
            next.a();
            next.b(list);
        }
        return true;
    }

    @g1
    public static void z(List<h> list) {
        f9368k = list;
    }
}
