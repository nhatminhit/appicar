package u2;

import a3.d;
import a3.h;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import d.e0;
import d.h1;
import d.i;
import d.m0;
import d.o0;
import d.x0;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class n2 {

    /* renamed from: n  reason: collision with root package name */
    public static final String f13538n = "_Impl";
    @x0({x0.a.LIBRARY_GROUP_PREFIX})

    /* renamed from: o  reason: collision with root package name */
    public static final int f13539o = 999;
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public volatile a3.c f13540a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f13541b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f13542c;

    /* renamed from: d  reason: collision with root package name */
    public a3.d f13543d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.room.c f13544e = i();

    /* renamed from: f  reason: collision with root package name */
    public boolean f13545f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13546g;
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @o0
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public List<b> f13547h;

    /* renamed from: i  reason: collision with root package name */
    public final ReentrantReadWriteLock f13548i = new ReentrantReadWriteLock();
    @o0

    /* renamed from: j  reason: collision with root package name */
    public a f13549j;

    /* renamed from: k  reason: collision with root package name */
    public final ThreadLocal<Integer> f13550k = new ThreadLocal<>();

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, Object> f13551l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final Map<Class<?>, Object> f13552m = new HashMap();

    public static class a<T extends n2> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f13553a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13554b;

        /* renamed from: c  reason: collision with root package name */
        public final Context f13555c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<b> f13556d;

        /* renamed from: e  reason: collision with root package name */
        public e f13557e;

        /* renamed from: f  reason: collision with root package name */
        public f f13558f;

        /* renamed from: g  reason: collision with root package name */
        public Executor f13559g;

        /* renamed from: h  reason: collision with root package name */
        public List<Object> f13560h;

        /* renamed from: i  reason: collision with root package name */
        public Executor f13561i;

        /* renamed from: j  reason: collision with root package name */
        public Executor f13562j;

        /* renamed from: k  reason: collision with root package name */
        public d.c f13563k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f13564l;

        /* renamed from: m  reason: collision with root package name */
        public c f13565m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f13566n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f13567o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f13568p;

        /* renamed from: q  reason: collision with root package name */
        public long f13569q = -1;

        /* renamed from: r  reason: collision with root package name */
        public TimeUnit f13570r;

        /* renamed from: s  reason: collision with root package name */
        public final d f13571s;

        /* renamed from: t  reason: collision with root package name */
        public Set<Integer> f13572t;

        /* renamed from: u  reason: collision with root package name */
        public Set<Integer> f13573u;

        /* renamed from: v  reason: collision with root package name */
        public String f13574v;

        /* renamed from: w  reason: collision with root package name */
        public File f13575w;

        /* renamed from: x  reason: collision with root package name */
        public Callable<InputStream> f13576x;

        public a(@m0 Context context, @m0 Class<T> cls, @o0 String str) {
            this.f13555c = context;
            this.f13553a = cls;
            this.f13554b = str;
            this.f13565m = c.AUTOMATIC;
            this.f13567o = true;
            this.f13571s = new d();
        }

        @m0
        public a<T> a(@m0 b bVar) {
            if (this.f13556d == null) {
                this.f13556d = new ArrayList<>();
            }
            this.f13556d.add(bVar);
            return this;
        }

        @m0
        public a<T> b(@m0 v2.c... cVarArr) {
            if (this.f13573u == null) {
                this.f13573u = new HashSet();
            }
            for (v2.c cVar : cVarArr) {
                this.f13573u.add(Integer.valueOf(cVar.f14156a));
                this.f13573u.add(Integer.valueOf(cVar.f14157b));
            }
            this.f13571s.b(cVarArr);
            return this;
        }

        @m0
        public a<T> c(@m0 Object obj) {
            if (this.f13560h == null) {
                this.f13560h = new ArrayList();
            }
            this.f13560h.add(obj);
            return this;
        }

        @m0
        public a<T> d() {
            this.f13564l = true;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            if (r1 != null) goto L_0x0018;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x011f  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        @d.m0
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T e() {
            /*
                r24 = this;
                r0 = r24
                android.content.Context r1 = r0.f13555c
                if (r1 == 0) goto L_0x012f
                java.lang.Class<T> r1 = r0.f13553a
                if (r1 == 0) goto L_0x0127
                java.util.concurrent.Executor r1 = r0.f13561i
                if (r1 != 0) goto L_0x001b
                java.util.concurrent.Executor r2 = r0.f13562j
                if (r2 != 0) goto L_0x001b
                java.util.concurrent.Executor r1 = n.c.g()
                r0.f13562j = r1
            L_0x0018:
                r0.f13561i = r1
                goto L_0x002b
            L_0x001b:
                if (r1 == 0) goto L_0x0024
                java.util.concurrent.Executor r2 = r0.f13562j
                if (r2 != 0) goto L_0x0024
                r0.f13562j = r1
                goto L_0x002b
            L_0x0024:
                if (r1 != 0) goto L_0x002b
                java.util.concurrent.Executor r1 = r0.f13562j
                if (r1 == 0) goto L_0x002b
                goto L_0x0018
            L_0x002b:
                java.util.Set<java.lang.Integer> r1 = r0.f13573u
                if (r1 == 0) goto L_0x0063
                java.util.Set<java.lang.Integer> r2 = r0.f13572t
                if (r2 == 0) goto L_0x0063
                java.util.Iterator r1 = r1.iterator()
            L_0x0037:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0063
                java.lang.Object r2 = r1.next()
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.util.Set<java.lang.Integer> r3 = r0.f13572t
                boolean r3 = r3.contains(r2)
                if (r3 != 0) goto L_0x004c
                goto L_0x0037
            L_0x004c:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L_0x0063:
                a3.d$c r1 = r0.f13563k
                if (r1 != 0) goto L_0x006c
                b3.c r1 = new b3.c
                r1.<init>()
            L_0x006c:
                long r2 = r0.f13569q
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 <= 0) goto L_0x0090
                java.lang.String r4 = r0.f13554b
                if (r4 == 0) goto L_0x0088
                u2.a r4 = new u2.a
                java.util.concurrent.TimeUnit r5 = r0.f13570r
                java.util.concurrent.Executor r6 = r0.f13562j
                r4.<init>(r2, r5, r6)
                u2.i0 r2 = new u2.i0
                r2.<init>(r1, r4)
                r1 = r2
                goto L_0x0090
            L_0x0088:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create auto-closing database for an in-memory database."
                r1.<init>(r2)
                throw r1
            L_0x0090:
                java.lang.String r2 = r0.f13574v
                if (r2 != 0) goto L_0x009c
                java.io.File r3 = r0.f13575w
                if (r3 != 0) goto L_0x009c
                java.util.concurrent.Callable<java.io.InputStream> r3 = r0.f13576x
                if (r3 == 0) goto L_0x00be
            L_0x009c:
                java.lang.String r3 = r0.f13554b
                if (r3 == 0) goto L_0x011f
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L_0x00a6
                r5 = r3
                goto L_0x00a7
            L_0x00a6:
                r5 = r4
            L_0x00a7:
                java.io.File r6 = r0.f13575w
                if (r6 != 0) goto L_0x00ad
                r7 = r3
                goto L_0x00ae
            L_0x00ad:
                r7 = r4
            L_0x00ae:
                int r5 = r5 + r7
                java.util.concurrent.Callable<java.io.InputStream> r7 = r0.f13576x
                if (r7 != 0) goto L_0x00b4
                goto L_0x00b5
            L_0x00b4:
                r3 = r4
            L_0x00b5:
                int r5 = r5 + r3
                if (r5 != r4) goto L_0x0117
                u2.t2 r3 = new u2.t2
                r3.<init>(r2, r6, r7, r1)
                r1 = r3
            L_0x00be:
                u2.n2$f r2 = r0.f13558f
                if (r2 == 0) goto L_0x00cb
                u2.y1 r3 = new u2.y1
                java.util.concurrent.Executor r4 = r0.f13559g
                r3.<init>(r1, r2, r4)
                r8 = r3
                goto L_0x00cc
            L_0x00cb:
                r8 = r1
            L_0x00cc:
                u2.n0 r1 = new u2.n0
                r5 = r1
                android.content.Context r2 = r0.f13555c
                r6 = r2
                java.lang.String r7 = r0.f13554b
                u2.n2$d r9 = r0.f13571s
                java.util.ArrayList<u2.n2$b> r10 = r0.f13556d
                boolean r11 = r0.f13564l
                u2.n2$c r3 = r0.f13565m
                u2.n2$c r12 = r3.b(r2)
                java.util.concurrent.Executor r13 = r0.f13561i
                java.util.concurrent.Executor r14 = r0.f13562j
                boolean r15 = r0.f13566n
                boolean r2 = r0.f13567o
                r16 = r2
                boolean r2 = r0.f13568p
                r17 = r2
                java.util.Set<java.lang.Integer> r2 = r0.f13572t
                r18 = r2
                java.lang.String r2 = r0.f13574v
                r19 = r2
                java.io.File r2 = r0.f13575w
                r20 = r2
                java.util.concurrent.Callable<java.io.InputStream> r2 = r0.f13576x
                r21 = r2
                u2.n2$e r2 = r0.f13557e
                r22 = r2
                java.util.List<java.lang.Object> r2 = r0.f13560h
                r23 = r2
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Class<T> r2 = r0.f13553a
                java.lang.String r3 = "_Impl"
                java.lang.Object r2 = u2.k2.b(r2, r3)
                u2.n2 r2 = (u2.n2) r2
                r2.v(r1)
                return r2
            L_0x0117:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations."
                r1.<init>(r2)
                throw r1
            L_0x011f:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create from asset or file for an in-memory database."
                r1.<init>(r2)
                throw r1
            L_0x0127:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Must provide an abstract class that extends RoomDatabase"
                r1.<init>(r2)
                throw r1
            L_0x012f:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot provide null context for the database."
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u2.n2.a.e():u2.n2");
        }

        @m0
        public a<T> f(@m0 String str) {
            this.f13574v = str;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @m0
        public a<T> g(@m0 String str, @m0 e eVar) {
            this.f13557e = eVar;
            this.f13574v = str;
            return this;
        }

        @m0
        public a<T> h(@m0 File file) {
            this.f13575w = file;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        @m0
        public a<T> i(@m0 File file, @m0 e eVar) {
            this.f13557e = eVar;
            this.f13575w = file;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @m0
        public a<T> j(@m0 Callable<InputStream> callable) {
            this.f13576x = callable;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        @m0
        public a<T> k(@m0 Callable<InputStream> callable, @m0 e eVar) {
            this.f13557e = eVar;
            this.f13576x = callable;
            return this;
        }

        @m0
        public a<T> l() {
            this.f13566n = this.f13554b != null;
            return this;
        }

        @m0
        public a<T> m() {
            this.f13567o = false;
            this.f13568p = true;
            return this;
        }

        @m0
        public a<T> n(int... iArr) {
            if (this.f13572t == null) {
                this.f13572t = new HashSet(iArr.length);
            }
            for (int valueOf : iArr) {
                this.f13572t.add(Integer.valueOf(valueOf));
            }
            return this;
        }

        @m0
        public a<T> o() {
            this.f13567o = true;
            this.f13568p = true;
            return this;
        }

        @m0
        public a<T> p(@o0 d.c cVar) {
            this.f13563k = cVar;
            return this;
        }

        @m0
        @v0
        public a<T> q(@e0(from = 0) long j10, @m0 TimeUnit timeUnit) {
            if (j10 >= 0) {
                this.f13569q = j10;
                this.f13570r = timeUnit;
                return this;
            }
            throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
        }

        @m0
        public a<T> r(@m0 c cVar) {
            this.f13565m = cVar;
            return this;
        }

        @m0
        public a<T> s(@m0 f fVar, @m0 Executor executor) {
            this.f13558f = fVar;
            this.f13559g = executor;
            return this;
        }

        @m0
        public a<T> t(@m0 Executor executor) {
            this.f13561i = executor;
            return this;
        }

        @m0
        public a<T> u(@m0 Executor executor) {
            this.f13562j = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(@m0 a3.c cVar) {
        }

        public void b(@m0 a3.c cVar) {
        }

        public void c(@m0 a3.c cVar) {
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public static boolean a(@m0 ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        public c b(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService(androidx.appcompat.widget.c.f1244r);
            return (activityManager == null || a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public HashMap<Integer, TreeMap<Integer, v2.c>> f13577a = new HashMap<>();

        public final void a(v2.c cVar) {
            int i10 = cVar.f14156a;
            int i11 = cVar.f14157b;
            TreeMap treeMap = this.f13577a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f13577a.put(Integer.valueOf(i10), treeMap);
            }
            v2.c cVar2 = (v2.c) treeMap.get(Integer.valueOf(i11));
            if (cVar2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Overriding migration ");
                sb2.append(cVar2);
                sb2.append(" with ");
                sb2.append(cVar);
            }
            treeMap.put(Integer.valueOf(i11), cVar);
        }

        public void b(@m0 v2.c... cVarArr) {
            for (v2.c a10 : cVarArr) {
                a(a10);
            }
        }

        @o0
        public List<v2.c> c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i11 > i10, i10, i11);
        }

        public final List<v2.c> d(List<v2.c> list, boolean z10, int i10, int i11) {
            boolean z11;
            do {
                if (z10) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap treeMap = this.f13577a.get(Integer.valueOf(i10));
                if (treeMap != null) {
                    Iterator it = (z10 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        z11 = true;
                        boolean z12 = false;
                        if (!it.hasNext()) {
                            z11 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z10 ? !(intValue < i11 || intValue >= i10) : !(intValue > i11 || intValue <= i10)) {
                            z12 = true;
                            continue;
                        }
                        if (z12) {
                            list.add((v2.c) treeMap.get(Integer.valueOf(intValue)));
                            i10 = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z11);
            return null;
        }
    }

    public static abstract class e {
        public void a(@m0 a3.c cVar) {
        }
    }

    public interface f {
        void a(@m0 String str, @m0 List<Object> list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object B(a3.c cVar) {
        w();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object C(a3.c cVar) {
        x();
        return null;
    }

    public static boolean z() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean A() {
        a aVar = this.f13549j;
        if (aVar != null) {
            return aVar.h();
        }
        a3.c cVar = this.f13540a;
        return cVar != null && cVar.isOpen();
    }

    @m0
    public Cursor D(@m0 a3.f fVar) {
        return E(fVar, (CancellationSignal) null);
    }

    @m0
    public Cursor E(@m0 a3.f fVar, @o0 CancellationSignal cancellationSignal) {
        c();
        d();
        return cancellationSignal != null ? this.f13543d.getWritableDatabase().Y0(fVar, cancellationSignal) : this.f13543d.getWritableDatabase().G(fVar);
    }

    @m0
    public Cursor F(@m0 String str, @o0 Object[] objArr) {
        return this.f13543d.getWritableDatabase().G(new a3.b(str, objArr));
    }

    public <V> V G(@m0 Callable<V> callable) {
        e();
        try {
            V call = callable.call();
            I();
            k();
            return call;
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            x2.f.a(e11);
            k();
            return null;
        } catch (Throwable th2) {
            k();
            throw th2;
        }
    }

    public void H(@m0 Runnable runnable) {
        e();
        try {
            runnable.run();
            I();
        } finally {
            k();
        }
    }

    @Deprecated
    public void I() {
        this.f13543d.getWritableDatabase().s0();
    }

    @o0
    public final <T> T J(Class<T> cls, a3.d dVar) {
        if (cls.isInstance(dVar)) {
            return dVar;
        }
        if (dVar instanceof p0) {
            return J(cls, ((p0) dVar).i());
        }
        return null;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void c() {
        if (!this.f13545f && z()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void d() {
        if (!u() && this.f13550k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void e() {
        c();
        a aVar = this.f13549j;
        if (aVar == null) {
            w();
        } else {
            aVar.c(new l2(this));
        }
    }

    @h1
    public abstract void f();

    public void g() {
        if (A()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f13548i.writeLock();
            writeLock.lock();
            try {
                this.f13544e.r();
                this.f13543d.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public h h(@m0 String str) {
        c();
        d();
        return this.f13543d.getWritableDatabase().L(str);
    }

    @m0
    public abstract androidx.room.c i();

    @m0
    public abstract a3.d j(n0 n0Var);

    @Deprecated
    public void k() {
        a aVar = this.f13549j;
        if (aVar == null) {
            x();
        } else {
            aVar.c(new m2(this));
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    public Map<String, Object> l() {
        return this.f13551l;
    }

    public Lock m() {
        return this.f13548i.readLock();
    }

    @m0
    public androidx.room.c n() {
        return this.f13544e;
    }

    @m0
    public a3.d o() {
        return this.f13543d;
    }

    @m0
    public Executor p() {
        return this.f13541b;
    }

    @x0({x0.a.LIBRARY_GROUP})
    @m0
    public Map<Class<?>, List<Class<?>>> q() {
        return Collections.emptyMap();
    }

    @x0({x0.a.LIBRARY_GROUP})
    public ThreadLocal<Integer> r() {
        return this.f13550k;
    }

    @m0
    public Executor s() {
        return this.f13542c;
    }

    @o0
    public <T> T t(@m0 Class<T> cls) {
        return this.f13552m.get(cls);
    }

    public boolean u() {
        return this.f13543d.getWritableDatabase().n1();
    }

    @i
    public void v(@m0 n0 n0Var) {
        a3.d j10 = j(n0Var);
        this.f13543d = j10;
        s2 s2Var = (s2) J(s2.class, j10);
        if (s2Var != null) {
            s2Var.h(n0Var);
        }
        z zVar = (z) J(z.class, this.f13543d);
        if (zVar != null) {
            a c10 = zVar.c();
            this.f13549j = c10;
            this.f13544e.o(c10);
        }
        boolean z10 = n0Var.f13528i == c.WRITE_AHEAD_LOGGING;
        this.f13543d.setWriteAheadLoggingEnabled(z10);
        this.f13547h = n0Var.f13524e;
        this.f13541b = n0Var.f13529j;
        this.f13542c = new x2(n0Var.f13530k);
        this.f13545f = n0Var.f13527h;
        this.f13546g = z10;
        if (n0Var.f13531l) {
            this.f13544e.p(n0Var.f13521b, n0Var.f13522c);
        }
        Map<Class<?>, List<Class<?>>> q10 = q();
        BitSet bitSet = new BitSet();
        for (Map.Entry next : q10.entrySet()) {
            Class cls = (Class) next.getKey();
            Iterator it = ((List) next.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls2 = (Class) it.next();
                    int size = n0Var.f13526g.size() - 1;
                    while (true) {
                        if (size < 0) {
                            size = -1;
                            break;
                        } else if (cls2.isAssignableFrom(n0Var.f13526g.get(size).getClass())) {
                            bitSet.set(size);
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (size >= 0) {
                        this.f13552m.put(cls2, n0Var.f13526g.get(size));
                    } else {
                        throw new IllegalArgumentException("A required type converter (" + cls2 + ") for " + cls.getCanonicalName() + " is missing in the database configuration.");
                    }
                }
            }
        }
        int size2 = n0Var.f13526g.size() - 1;
        while (size2 >= 0) {
            if (bitSet.get(size2)) {
                size2--;
            } else {
                throw new IllegalArgumentException("Unexpected type converter " + n0Var.f13526g.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
        }
    }

    public final void w() {
        c();
        a3.c writableDatabase = this.f13543d.getWritableDatabase();
        this.f13544e.u(writableDatabase);
        if (writableDatabase.u1()) {
            writableDatabase.w0();
        } else {
            writableDatabase.s();
        }
    }

    public final void x() {
        this.f13543d.getWritableDatabase().M0();
        if (!u()) {
            this.f13544e.k();
        }
    }

    public void y(@m0 a3.c cVar) {
        this.f13544e.h(cVar);
    }
}
