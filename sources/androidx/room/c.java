package androidx.room;

import a3.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.lifecycle.LiveData;
import d.g1;
import d.h1;
import d.m0;
import d.o0;
import d.x0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import u2.d1;
import u2.e1;
import u2.n2;

public class c {

    /* renamed from: n  reason: collision with root package name */
    public static final String[] f3743n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: o  reason: collision with root package name */
    public static final String f3744o = "room_table_modification_log";

    /* renamed from: p  reason: collision with root package name */
    public static final String f3745p = "table_id";

    /* renamed from: q  reason: collision with root package name */
    public static final String f3746q = "invalidated";

    /* renamed from: r  reason: collision with root package name */
    public static final String f3747r = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    @g1

    /* renamed from: s  reason: collision with root package name */
    public static final String f3748s = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";
    @g1

    /* renamed from: t  reason: collision with root package name */
    public static final String f3749t = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Integer> f3750a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f3751b;
    @m0

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Set<String>> f3752c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public u2.a f3753d;

    /* renamed from: e  reason: collision with root package name */
    public final n2 f3754e;

    /* renamed from: f  reason: collision with root package name */
    public AtomicBoolean f3755f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f3756g;

    /* renamed from: h  reason: collision with root package name */
    public volatile h f3757h;

    /* renamed from: i  reason: collision with root package name */
    public b f3758i;

    /* renamed from: j  reason: collision with root package name */
    public final d1 f3759j;
    @SuppressLint({"RestrictedApi"})
    @g1

    /* renamed from: k  reason: collision with root package name */
    public final o.b<C0053c, d> f3760k;

    /* renamed from: l  reason: collision with root package name */
    public d f3761l;
    @g1

    /* renamed from: m  reason: collision with root package name */
    public Runnable f3762m;

    public class a implements Runnable {
        public a() {
        }

        /* JADX INFO: finally extract failed */
        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor D = c.this.f3754e.D(new a3.b(c.f3749t));
            while (D.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(D.getInt(0)));
                } catch (Throwable th2) {
                    D.close();
                    throw th2;
                }
            }
            D.close();
            if (!hashSet.isEmpty()) {
                c.this.f3757h.K();
            }
            return hashSet;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
            if (r0 != null) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
            r0.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
            if (r0 == null) goto L_0x009d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a3, code lost:
            if (r1.isEmpty() != false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
            r0 = r5.O.f3760k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a9, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            r2 = r5.O.f3760k.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b6, code lost:
            if (r2.hasNext() == false) goto L_0x00c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b8, code lost:
            ((androidx.room.c.d) r2.next().getValue()).a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c8, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                androidx.room.c r0 = androidx.room.c.this
                u2.n2 r0 = r0.f3754e
                java.util.concurrent.locks.Lock r0 = r0.m()
                r0.lock()
                r1 = 0
                androidx.room.c r2 = androidx.room.c.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                boolean r2 = r2.g()     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                if (r2 != 0) goto L_0x0021
                r0.unlock()
                androidx.room.c r0 = androidx.room.c.this
                u2.a r0 = r0.f3753d
                if (r0 == 0) goto L_0x0020
                r0.b()
            L_0x0020:
                return
            L_0x0021:
                androidx.room.c r2 = androidx.room.c.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f3755f     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                if (r2 != 0) goto L_0x003a
                r0.unlock()
                androidx.room.c r0 = androidx.room.c.this
                u2.a r0 = r0.f3753d
                if (r0 == 0) goto L_0x0039
                r0.b()
            L_0x0039:
                return
            L_0x003a:
                androidx.room.c r2 = androidx.room.c.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                u2.n2 r2 = r2.f3754e     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                boolean r2 = r2.u()     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                if (r2 == 0) goto L_0x0051
                r0.unlock()
                androidx.room.c r0 = androidx.room.c.this
                u2.a r0 = r0.f3753d
                if (r0 == 0) goto L_0x0050
                r0.b()
            L_0x0050:
                return
            L_0x0051:
                androidx.room.c r2 = androidx.room.c.this     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                u2.n2 r2 = r2.f3754e     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                boolean r3 = r2.f13546g     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                if (r3 == 0) goto L_0x0074
                a3.d r2 = r2.o()     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                a3.c r2 = r2.getWritableDatabase()     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                r2.w0()     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                java.util.Set r1 = r5.a()     // Catch:{ all -> 0x006f }
                r2.s0()     // Catch:{ all -> 0x006f }
                r2.M0()     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                goto L_0x0078
            L_0x006f:
                r3 = move-exception
                r2.M0()     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
                throw r3     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
            L_0x0074:
                java.util.Set r1 = r5.a()     // Catch:{ SQLiteException | IllegalStateException -> 0x0093, all -> 0x0085 }
            L_0x0078:
                r0.unlock()
                androidx.room.c r0 = androidx.room.c.this
                u2.a r0 = r0.f3753d
                if (r0 == 0) goto L_0x009d
            L_0x0081:
                r0.b()
                goto L_0x009d
            L_0x0085:
                r1 = move-exception
                r0.unlock()
                androidx.room.c r0 = androidx.room.c.this
                u2.a r0 = r0.f3753d
                if (r0 == 0) goto L_0x0092
                r0.b()
            L_0x0092:
                throw r1
            L_0x0093:
                r0.unlock()
                androidx.room.c r0 = androidx.room.c.this
                u2.a r0 = r0.f3753d
                if (r0 == 0) goto L_0x009d
                goto L_0x0081
            L_0x009d:
                if (r1 == 0) goto L_0x00cd
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto L_0x00cd
                androidx.room.c r0 = androidx.room.c.this
                o.b<androidx.room.c$c, androidx.room.c$d> r0 = r0.f3760k
                monitor-enter(r0)
                androidx.room.c r2 = androidx.room.c.this     // Catch:{ all -> 0x00ca }
                o.b<androidx.room.c$c, androidx.room.c$d> r2 = r2.f3760k     // Catch:{ all -> 0x00ca }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00ca }
            L_0x00b2:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00ca }
                if (r3 == 0) goto L_0x00c8
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00ca }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00ca }
                java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00ca }
                androidx.room.c$d r3 = (androidx.room.c.d) r3     // Catch:{ all -> 0x00ca }
                r3.a(r1)     // Catch:{ all -> 0x00ca }
                goto L_0x00b2
            L_0x00c8:
                monitor-exit(r0)     // Catch:{ all -> 0x00ca }
                goto L_0x00cd
            L_0x00ca:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00ca }
                throw r1
            L_0x00cd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.c.a.run():void");
        }
    }

    public static class b {

        /* renamed from: f  reason: collision with root package name */
        public static final int f3763f = 0;

        /* renamed from: g  reason: collision with root package name */
        public static final int f3764g = 1;

        /* renamed from: h  reason: collision with root package name */
        public static final int f3765h = 2;

        /* renamed from: a  reason: collision with root package name */
        public final long[] f3766a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f3767b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f3768c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3769d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3770e;

        public b(int i10) {
            long[] jArr = new long[i10];
            this.f3766a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f3767b = zArr;
            this.f3768c = new int[i10];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        @o0
        public int[] a() {
            synchronized (this) {
                if (this.f3769d) {
                    if (!this.f3770e) {
                        int length = this.f3766a.length;
                        int i10 = 0;
                        while (true) {
                            int i11 = 1;
                            if (i10 < length) {
                                boolean z10 = this.f3766a[i10] > 0;
                                boolean[] zArr = this.f3767b;
                                if (z10 != zArr[i10]) {
                                    int[] iArr = this.f3768c;
                                    if (!z10) {
                                        i11 = 2;
                                    }
                                    iArr[i10] = i11;
                                } else {
                                    this.f3768c[i10] = 0;
                                }
                                zArr[i10] = z10;
                                i10++;
                            } else {
                                this.f3770e = true;
                                this.f3769d = false;
                                int[] iArr2 = this.f3768c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        public boolean b(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f3766a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        this.f3769d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        public boolean c(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f3766a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        this.f3769d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        public void d() {
            synchronized (this) {
                this.f3770e = false;
            }
        }

        public void e() {
            synchronized (this) {
                Arrays.fill(this.f3767b, false);
                this.f3769d = true;
            }
        }
    }

    /* renamed from: androidx.room.c$c  reason: collision with other inner class name */
    public static abstract class C0053c {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f3771a;

        public C0053c(@m0 String str, String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.f3771a = strArr2;
            strArr2[strArr.length] = str;
        }

        public C0053c(@m0 String[] strArr) {
            this.f3771a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public boolean a() {
            return false;
        }

        public abstract void b(@m0 Set<String> set);
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f3772a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f3773b;

        /* renamed from: c  reason: collision with root package name */
        public final C0053c f3774c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f3775d;

        public d(C0053c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f3774c = cVar;
            this.f3772a = iArr;
            this.f3773b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f3775d = set;
        }

        public void a(Set<Integer> set) {
            int length = this.f3772a.length;
            Set set2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f3772a[i10]))) {
                    if (length == 1) {
                        set2 = this.f3775d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f3773b[i10]);
                    }
                }
            }
            if (set2 != null) {
                this.f3774c.b(set2);
            }
        }

        public void b(String[] strArr) {
            Set<String> set = null;
            if (this.f3773b.length == 1) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    } else if (strArr[i10].equalsIgnoreCase(this.f3773b[0])) {
                        set = this.f3775d;
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f3773b;
                    int length2 = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i11];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i11++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f3774c.b(set);
            }
        }
    }

    public static class e extends C0053c {

        /* renamed from: b  reason: collision with root package name */
        public final c f3776b;

        /* renamed from: c  reason: collision with root package name */
        public final WeakReference<C0053c> f3777c;

        public e(c cVar, C0053c cVar2) {
            super(cVar2.f3771a);
            this.f3776b = cVar;
            this.f3777c = new WeakReference<>(cVar2);
        }

        public void b(@m0 Set<String> set) {
            C0053c cVar = this.f3777c.get();
            if (cVar == null) {
                this.f3776b.m(this);
            } else {
                cVar.b(set);
            }
        }
    }

    @x0({x0.a.Q})
    public c(n2 n2Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f3753d = null;
        this.f3755f = new AtomicBoolean(false);
        this.f3756g = false;
        this.f3760k = new o.b<>();
        this.f3762m = new a();
        this.f3754e = n2Var;
        this.f3758i = new b(strArr.length);
        this.f3750a = new HashMap<>();
        this.f3752c = map2;
        this.f3759j = new d1(n2Var);
        int length = strArr.length;
        this.f3751b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f3750a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f3751b[i10] = str2.toLowerCase(locale);
            } else {
                this.f3751b[i10] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.f3750a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f3750a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    @x0({x0.a.Q})
    public c(n2 n2Var, String... strArr) {
        this(n2Var, new HashMap(), Collections.emptyMap(), strArr);
    }

    public static void c(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("`");
    }

    public static void d(a3.c cVar) {
        if (cVar.u1()) {
            cVar.w0();
        } else {
            cVar.s();
        }
    }

    @h1
    @SuppressLint({"RestrictedApi"})
    public void a(@m0 C0053c cVar) {
        d i10;
        String[] n10 = n(cVar.f3771a);
        int[] iArr = new int[n10.length];
        int length = n10.length;
        int i11 = 0;
        while (i11 < length) {
            Integer num = this.f3750a.get(n10[i11].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i11] = num.intValue();
                i11++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + n10[i11]);
            }
        }
        d dVar = new d(cVar, iArr, n10);
        synchronized (this.f3760k) {
            i10 = this.f3760k.i(cVar, dVar);
        }
        if (i10 == null && this.f3758i.b(iArr)) {
            t();
        }
    }

    @x0({x0.a.Q})
    public void b(C0053c cVar) {
        a(new e(this, cVar));
    }

    @x0({x0.a.Q})
    @Deprecated
    public <T> LiveData<T> e(String[] strArr, Callable<T> callable) {
        return f(strArr, false, callable);
    }

    @x0({x0.a.Q})
    public <T> LiveData<T> f(String[] strArr, boolean z10, Callable<T> callable) {
        return this.f3759j.a(v(strArr), z10, callable);
    }

    public boolean g() {
        if (!this.f3754e.A()) {
            return false;
        }
        if (!this.f3756g) {
            this.f3754e.o().getWritableDatabase();
        }
        return this.f3756g;
    }

    public void h(a3.c cVar) {
        synchronized (this) {
            if (!this.f3756g) {
                cVar.E("PRAGMA temp_store = MEMORY;");
                cVar.E("PRAGMA recursive_triggers='ON';");
                cVar.E(f3747r);
                u(cVar);
                this.f3757h = cVar.L(f3748s);
                this.f3756g = true;
            }
        }
    }

    @x0({x0.a.O})
    @g1(otherwise = 3)
    public void i(String... strArr) {
        synchronized (this.f3760k) {
            Iterator<Map.Entry<C0053c, d>> it = this.f3760k.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!((C0053c) next.getKey()).a()) {
                    ((d) next.getValue()).b(strArr);
                }
            }
        }
    }

    public void j() {
        synchronized (this) {
            this.f3756g = false;
            this.f3758i.e();
        }
    }

    public void k() {
        if (this.f3755f.compareAndSet(false, true)) {
            u2.a aVar = this.f3753d;
            if (aVar != null) {
                aVar.f();
            }
            this.f3754e.p().execute(this.f3762m);
        }
    }

    @x0({x0.a.Q})
    @h1
    public void l() {
        u2.a aVar = this.f3753d;
        if (aVar != null) {
            aVar.f();
        }
        t();
        this.f3762m.run();
    }

    @h1
    @SuppressLint({"RestrictedApi"})
    public void m(@m0 C0053c cVar) {
        d j10;
        synchronized (this.f3760k) {
            j10 = this.f3760k.j(cVar);
        }
        if (j10 != null && this.f3758i.c(j10.f3772a)) {
            t();
        }
    }

    public final String[] n(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f3752c.containsKey(lowerCase)) {
                hashSet.addAll(this.f3752c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public void o(u2.a aVar) {
        this.f3753d = aVar;
        aVar.i(new e1(this));
    }

    public void p(Context context, String str) {
        this.f3761l = new d(context, str, this, this.f3754e.p());
    }

    public final void q(a3.c cVar, int i10) {
        cVar.E("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f3751b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f3743n) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            c(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append(f3744o);
            sb2.append(" SET ");
            sb2.append(f3746q);
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append(f3745p);
            sb2.append(" = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append(f3746q);
            sb2.append(" = 0");
            sb2.append("; END");
            cVar.E(sb2.toString());
        }
    }

    public void r() {
        d dVar = this.f3761l;
        if (dVar != null) {
            dVar.a();
            this.f3761l = null;
        }
    }

    public final void s(a3.c cVar, int i10) {
        String str = this.f3751b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String c10 : f3743n) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            c(sb2, str, c10);
            cVar.E(sb2.toString());
        }
    }

    public void t() {
        if (this.f3754e.A()) {
            u(this.f3754e.o().getWritableDatabase());
        }
    }

    public void u(a3.c cVar) {
        if (!cVar.n1()) {
            while (true) {
                try {
                    Lock m10 = this.f3754e.m();
                    m10.lock();
                    try {
                        int[] a10 = this.f3758i.a();
                        if (a10 == null) {
                            m10.unlock();
                            return;
                        }
                        int length = a10.length;
                        d(cVar);
                        for (int i10 = 0; i10 < length; i10++) {
                            int i11 = a10[i10];
                            if (i11 == 1) {
                                q(cVar, i10);
                            } else if (i11 == 2) {
                                s(cVar, i10);
                            }
                        }
                        cVar.s0();
                        cVar.M0();
                        this.f3758i.d();
                        m10.unlock();
                    } catch (Throwable th2) {
                        m10.unlock();
                        throw th2;
                    }
                } catch (SQLiteException | IllegalStateException unused) {
                    return;
                }
            }
        }
    }

    public final String[] v(String[] strArr) {
        String[] n10 = n(strArr);
        int length = n10.length;
        int i10 = 0;
        while (i10 < length) {
            String str = n10[i10];
            if (this.f3750a.containsKey(str.toLowerCase(Locale.US))) {
                i10++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        return n10;
    }
}
