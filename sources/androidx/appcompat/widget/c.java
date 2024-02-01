package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c extends DataSetObservable {
    public static final Object A = new Object();
    public static final Map<String, c> B = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f1240n = false;

    /* renamed from: o  reason: collision with root package name */
    public static final String f1241o = c.class.getSimpleName();

    /* renamed from: p  reason: collision with root package name */
    public static final String f1242p = "historical-records";

    /* renamed from: q  reason: collision with root package name */
    public static final String f1243q = "historical-record";

    /* renamed from: r  reason: collision with root package name */
    public static final String f1244r = "activity";

    /* renamed from: s  reason: collision with root package name */
    public static final String f1245s = "time";

    /* renamed from: t  reason: collision with root package name */
    public static final String f1246t = "weight";

    /* renamed from: u  reason: collision with root package name */
    public static final String f1247u = "activity_choser_model_history.xml";

    /* renamed from: v  reason: collision with root package name */
    public static final int f1248v = 50;

    /* renamed from: w  reason: collision with root package name */
    public static final int f1249w = 5;

    /* renamed from: x  reason: collision with root package name */
    public static final float f1250x = 1.0f;

    /* renamed from: y  reason: collision with root package name */
    public static final String f1251y = ".xml";

    /* renamed from: z  reason: collision with root package name */
    public static final int f1252z = -1;

    /* renamed from: a  reason: collision with root package name */
    public final Object f1253a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f1254b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List<e> f1255c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final Context f1256d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1257e;

    /* renamed from: f  reason: collision with root package name */
    public Intent f1258f;

    /* renamed from: g  reason: collision with root package name */
    public C0023c f1259g = new d();

    /* renamed from: h  reason: collision with root package name */
    public int f1260h = 50;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1261i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1262j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1263k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1264l = false;

    /* renamed from: m  reason: collision with root package name */
    public f f1265m;

    public interface a {
        void setActivityChooserModel(c cVar);
    }

    public static final class b implements Comparable<b> {
        public final ResolveInfo O;
        public float P;

        public b(ResolveInfo resolveInfo) {
            this.O = resolveInfo;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            return Float.floatToIntBits(bVar.P) - Float.floatToIntBits(this.P);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && b.class == obj.getClass() && Float.floatToIntBits(this.P) == Float.floatToIntBits(((b) obj).P);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.P) + 31;
        }

        public String toString() {
            return "[" + "resolveInfo:" + this.O.toString() + "; weight:" + new BigDecimal((double) this.P) + "]";
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    public interface C0023c {
        void a(Intent intent, List<b> list, List<e> list2);
    }

    public static final class d implements C0023c {

        /* renamed from: b  reason: collision with root package name */
        public static final float f1266b = 0.95f;

        /* renamed from: a  reason: collision with root package name */
        public final Map<ComponentName, b> f1267a = new HashMap();

        public void a(Intent intent, List<b> list, List<e> list2) {
            Map<ComponentName, b> map = this.f1267a;
            map.clear();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = list.get(i10);
                bVar.P = 0.0f;
                ActivityInfo activityInfo = bVar.O.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), bVar);
            }
            float f10 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                e eVar = list2.get(size2);
                b bVar2 = map.get(eVar.f1268a);
                if (bVar2 != null) {
                    bVar2.P += eVar.f1270c * f10;
                    f10 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f1268a;

        /* renamed from: b  reason: collision with root package name */
        public final long f1269b;

        /* renamed from: c  reason: collision with root package name */
        public final float f1270c;

        public e(ComponentName componentName, long j10, float f10) {
            this.f1268a = componentName;
            this.f1269b = j10;
            this.f1270c = f10;
        }

        public e(String str, long j10, float f10) {
            this(ComponentName.unflattenFromString(str), j10, f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            ComponentName componentName = this.f1268a;
            if (componentName == null) {
                if (eVar.f1268a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.f1268a)) {
                return false;
            }
            return this.f1269b == eVar.f1269b && Float.floatToIntBits(this.f1270c) == Float.floatToIntBits(eVar.f1270c);
        }

        public int hashCode() {
            ComponentName componentName = this.f1268a;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j10 = this.f1269b;
            return ((((hashCode + 31) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Float.floatToIntBits(this.f1270c);
        }

        public String toString() {
            return "[" + "; activity:" + this.f1268a + "; time:" + this.f1269b + "; weight:" + new BigDecimal((double) this.f1270c) + "]";
        }
    }

    public interface f {
        boolean a(c cVar, Intent intent);
    }

    public final class g extends AsyncTask<Object, Void, Void> {
        public g() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
            if (r15 != null) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0071, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r0 = androidx.appcompat.widget.c.f1241o;
            r0 = new java.lang.StringBuilder();
            r0.append("Error writing historical record file: ");
            r0.append(r14.f1271a.f1257e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0084, code lost:
            r14.f1271a.f1261i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0088, code lost:
            if (r15 == null) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r0 = androidx.appcompat.widget.c.f1241o;
            r0 = new java.lang.StringBuilder();
            r0.append("Error writing historical record file: ");
            r0.append(r14.f1271a.f1257e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
            r14.f1271a.f1261i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
            if (r15 == null) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r0 = androidx.appcompat.widget.c.f1241o;
            r0 = new java.lang.StringBuilder();
            r0.append("Error writing historical record file: ");
            r0.append(r14.f1271a.f1257e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
            r14.f1271a.f1261i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
            if (r15 == null) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bc, code lost:
            r14.f1271a.f1261i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
            if (r15 != null) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c5, code lost:
            throw r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:14:0x0073, B:18:0x008b, B:22:0x00a3] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x008b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00a3 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                r14 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                java.lang.String r2 = "Error writing historical record file: "
                r3 = 0
                r4 = r15[r3]
                java.util.List r4 = (java.util.List) r4
                r5 = 1
                r15 = r15[r5]
                java.lang.String r15 = (java.lang.String) r15
                r6 = 0
                androidx.appcompat.widget.c r7 = androidx.appcompat.widget.c.this     // Catch:{ FileNotFoundException -> 0x00c6 }
                android.content.Context r7 = r7.f1256d     // Catch:{ FileNotFoundException -> 0x00c6 }
                java.io.FileOutputStream r15 = r7.openFileOutput(r15, r3)     // Catch:{ FileNotFoundException -> 0x00c6 }
                org.xmlpull.v1.XmlSerializer r7 = android.util.Xml.newSerializer()
                r7.setOutput(r15, r6)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r8 = "UTF-8"
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.startDocument(r8, r9)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.startTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                int r8 = r4.size()     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r9 = r3
            L_0x002f:
                if (r9 >= r8) goto L_0x0061
                java.lang.Object r10 = r4.remove(r3)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                androidx.appcompat.widget.c$e r10 = (androidx.appcompat.widget.c.e) r10     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.startTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r11 = "activity"
                android.content.ComponentName r12 = r10.f1268a     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r12 = r12.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r11 = "time"
                long r12 = r10.f1269b     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r11 = "weight"
                float r10 = r10.f1270c     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.attribute(r6, r11, r10)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.endTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                int r9 = r9 + 1
                goto L_0x002f
            L_0x0061:
                r7.endTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.endDocument()     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.c.this
                r0.f1261i = r5
                if (r15 == 0) goto L_0x00bb
            L_0x006d:
                r15.close()     // Catch:{ IOException -> 0x00bb }
                goto L_0x00bb
            L_0x0071:
                r0 = move-exception
                goto L_0x00bc
            L_0x0073:
                java.lang.String r0 = androidx.appcompat.widget.c.f1241o     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r0.<init>()     // Catch:{ all -> 0x0071 }
                r0.append(r2)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.c.this     // Catch:{ all -> 0x0071 }
                java.lang.String r1 = r1.f1257e     // Catch:{ all -> 0x0071 }
                r0.append(r1)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.c.this
                r0.f1261i = r5
                if (r15 == 0) goto L_0x00bb
                goto L_0x006d
            L_0x008b:
                java.lang.String r0 = androidx.appcompat.widget.c.f1241o     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r0.<init>()     // Catch:{ all -> 0x0071 }
                r0.append(r2)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.c.this     // Catch:{ all -> 0x0071 }
                java.lang.String r1 = r1.f1257e     // Catch:{ all -> 0x0071 }
                r0.append(r1)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.c.this
                r0.f1261i = r5
                if (r15 == 0) goto L_0x00bb
                goto L_0x006d
            L_0x00a3:
                java.lang.String r0 = androidx.appcompat.widget.c.f1241o     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r0.<init>()     // Catch:{ all -> 0x0071 }
                r0.append(r2)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.c.this     // Catch:{ all -> 0x0071 }
                java.lang.String r1 = r1.f1257e     // Catch:{ all -> 0x0071 }
                r0.append(r1)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.c.this
                r0.f1261i = r5
                if (r15 == 0) goto L_0x00bb
                goto L_0x006d
            L_0x00bb:
                return r6
            L_0x00bc:
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.c.this
                r1.f1261i = r5
                if (r15 == 0) goto L_0x00c5
                r15.close()     // Catch:{ IOException -> 0x00c5 }
            L_0x00c5:
                throw r0
            L_0x00c6:
                java.lang.String r0 = androidx.appcompat.widget.c.f1241o
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r15)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.g.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    public c(Context context, String str) {
        this.f1256d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(f1251y)) {
            this.f1257e = str;
            return;
        }
        this.f1257e = str + f1251y;
    }

    public static c d(Context context, String str) {
        c cVar;
        synchronized (A) {
            Map<String, c> map = B;
            cVar = map.get(str);
            if (cVar == null) {
                cVar = new c(context, str);
                map.put(str, cVar);
            }
        }
        return cVar;
    }

    public final boolean a(e eVar) {
        boolean add = this.f1255c.add(eVar);
        if (add) {
            this.f1263k = true;
            n();
            m();
            v();
            notifyChanged();
        }
        return add;
    }

    public Intent b(int i10) {
        synchronized (this.f1253a) {
            if (this.f1258f == null) {
                return null;
            }
            c();
            ActivityInfo activityInfo = this.f1254b.get(i10).O.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent(this.f1258f);
            intent.setComponent(componentName);
            if (this.f1265m != null) {
                if (this.f1265m.a(this, new Intent(intent))) {
                    return null;
                }
            }
            a(new e(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public final void c() {
        boolean l10 = l() | o();
        n();
        if (l10) {
            v();
            notifyChanged();
        }
    }

    public ResolveInfo e(int i10) {
        ResolveInfo resolveInfo;
        synchronized (this.f1253a) {
            c();
            resolveInfo = this.f1254b.get(i10).O;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f1253a) {
            c();
            size = this.f1254b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f1253a) {
            c();
            List<b> list = this.f1254b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (list.get(i10).O == resolveInfo) {
                    return i10;
                }
            }
            return -1;
        }
    }

    public ResolveInfo h() {
        synchronized (this.f1253a) {
            c();
            if (this.f1254b.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.f1254b.get(0).O;
            return resolveInfo;
        }
    }

    public int i() {
        int i10;
        synchronized (this.f1253a) {
            i10 = this.f1260h;
        }
        return i10;
    }

    public int j() {
        int size;
        synchronized (this.f1253a) {
            c();
            size = this.f1255c.size();
        }
        return size;
    }

    public Intent k() {
        Intent intent;
        synchronized (this.f1253a) {
            intent = this.f1258f;
        }
        return intent;
    }

    public final boolean l() {
        if (!this.f1264l || this.f1258f == null) {
            return false;
        }
        this.f1264l = false;
        this.f1254b.clear();
        List<ResolveInfo> queryIntentActivities = this.f1256d.getPackageManager().queryIntentActivities(this.f1258f, 0);
        int size = queryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1254b.add(new b(queryIntentActivities.get(i10)));
        }
        return true;
    }

    public final void m() {
        if (!this.f1262j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f1263k) {
            this.f1263k = false;
            if (!TextUtils.isEmpty(this.f1257e)) {
                new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f1255c), this.f1257e});
            }
        }
    }

    public final void n() {
        int size = this.f1255c.size() - this.f1260h;
        if (size > 0) {
            this.f1263k = true;
            for (int i10 = 0; i10 < size; i10++) {
                e remove = this.f1255c.remove(0);
            }
        }
    }

    public final boolean o() {
        if (!this.f1261i || !this.f1263k || TextUtils.isEmpty(this.f1257e)) {
            return false;
        }
        this.f1261i = false;
        this.f1262j = true;
        p();
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0085 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r10 = this;
            java.lang.String r0 = "Error reading historical recrod file: "
            android.content.Context r1 = r10.f1256d     // Catch:{ FileNotFoundException -> 0x00ac }
            java.lang.String r2 = r10.f1257e     // Catch:{ FileNotFoundException -> 0x00ac }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x00ac }
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r3 = "UTF-8"
            r2.setInput(r1, r3)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            r3 = 0
        L_0x0014:
            r4 = 1
            if (r3 == r4) goto L_0x001f
            r5 = 2
            if (r3 == r5) goto L_0x001f
            int r3 = r2.next()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            goto L_0x0014
        L_0x001f:
            java.lang.String r3 = "historical-records"
            java.lang.String r5 = r2.getName()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            if (r3 == 0) goto L_0x007b
            java.util.List<androidx.appcompat.widget.c$e> r3 = r10.f1255c     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            r3.clear()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
        L_0x0030:
            int r5 = r2.next()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            if (r5 != r4) goto L_0x003c
            if (r1 == 0) goto L_0x00a5
        L_0x0038:
            r1.close()     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00a5
        L_0x003c:
            r6 = 3
            if (r5 == r6) goto L_0x0030
            r6 = 4
            if (r5 != r6) goto L_0x0043
            goto L_0x0030
        L_0x0043:
            java.lang.String r5 = r2.getName()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r6 = "historical-record"
            boolean r5 = r6.equals(r5)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            if (r5 == 0) goto L_0x0073
            java.lang.String r5 = "activity"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r7 = "time"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r9 = "weight"
            java.lang.String r6 = r2.getAttributeValue(r6, r9)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            androidx.appcompat.widget.c$e r9 = new androidx.appcompat.widget.c$e     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            r9.<init>((java.lang.String) r5, (long) r7, (float) r6)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            r3.add(r9)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            goto L_0x0030
        L_0x0073:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r3 = "Share records file not well-formed."
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
        L_0x007b:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r3 = "Share records file does not start with historical-records tag."
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
        L_0x0083:
            r0 = move-exception
            goto L_0x00a6
        L_0x0085:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            r2.append(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = r10.f1257e     // Catch:{ all -> 0x0083 }
            r2.append(r0)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x00a5
            goto L_0x0038
        L_0x0095:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            r2.append(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = r10.f1257e     // Catch:{ all -> 0x0083 }
            r2.append(r0)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x00a5
            goto L_0x0038
        L_0x00a5:
            return
        L_0x00a6:
            if (r1 == 0) goto L_0x00ab
            r1.close()     // Catch:{ IOException -> 0x00ab }
        L_0x00ab:
            throw r0
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.p():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(androidx.appcompat.widget.c.C0023c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f1253a
            monitor-enter(r0)
            androidx.appcompat.widget.c$c r1 = r2.f1259g     // Catch:{ all -> 0x0016 }
            if (r1 != r3) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0009:
            r2.f1259g = r3     // Catch:{ all -> 0x0016 }
            boolean r3 = r2.v()     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0014
            r2.notifyChanged()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.q(androidx.appcompat.widget.c$c):void");
    }

    public void r(int i10) {
        synchronized (this.f1253a) {
            c();
            b bVar = this.f1254b.get(i10);
            b bVar2 = this.f1254b.get(0);
            float f10 = bVar2 != null ? (bVar2.P - bVar.P) + 5.0f : 1.0f;
            ActivityInfo activityInfo = bVar.O.activityInfo;
            a(new e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f10));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f1253a
            monitor-enter(r0)
            int r1 = r2.f1260h     // Catch:{ all -> 0x0019 }
            if (r1 != r3) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0009:
            r2.f1260h = r3     // Catch:{ all -> 0x0019 }
            r2.n()     // Catch:{ all -> 0x0019 }
            boolean r3 = r2.v()     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            r2.notifyChanged()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.s(int):void");
    }

    public void t(Intent intent) {
        synchronized (this.f1253a) {
            if (this.f1258f != intent) {
                this.f1258f = intent;
                this.f1264l = true;
                c();
            }
        }
    }

    public void u(f fVar) {
        synchronized (this.f1253a) {
            this.f1265m = fVar;
        }
    }

    public final boolean v() {
        if (this.f1259g == null || this.f1258f == null || this.f1254b.isEmpty() || this.f1255c.isEmpty()) {
            return false;
        }
        this.f1259g.a(this.f1258f, this.f1254b, Collections.unmodifiableList(this.f1255c));
        return true;
    }
}
