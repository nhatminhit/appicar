package rg;

import ch.a0;
import ch.p;
import ch.z;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import yg.h;

public final class d implements Closeable, Flushable {

    /* renamed from: i0  reason: collision with root package name */
    public static final String f22565i0 = "journal";

    /* renamed from: j0  reason: collision with root package name */
    public static final String f22566j0 = "journal.tmp";

    /* renamed from: k0  reason: collision with root package name */
    public static final String f22567k0 = "journal.bkp";

    /* renamed from: l0  reason: collision with root package name */
    public static final String f22568l0 = "libcore.io.DiskLruCache";

    /* renamed from: m0  reason: collision with root package name */
    public static final String f22569m0 = "1";

    /* renamed from: n0  reason: collision with root package name */
    public static final long f22570n0 = -1;

    /* renamed from: o0  reason: collision with root package name */
    public static final Pattern f22571o0 = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: p0  reason: collision with root package name */
    public static final String f22572p0 = "CLEAN";

    /* renamed from: q0  reason: collision with root package name */
    public static final String f22573q0 = "DIRTY";

    /* renamed from: r0  reason: collision with root package name */
    public static final String f22574r0 = "REMOVE";

    /* renamed from: s0  reason: collision with root package name */
    public static final String f22575s0 = "READ";

    /* renamed from: t0  reason: collision with root package name */
    public static final /* synthetic */ boolean f22576t0 = false;
    public final xg.a O;
    public final File P;
    public final File Q;
    public final File R;
    public final File S;
    public final int T;
    public long U;
    public final int V;
    public long W = 0;
    public ch.d X;
    public final LinkedHashMap<String, e> Y = new LinkedHashMap<>(0, 0.75f, true);
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f22577a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f22578b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f22579c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f22580d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f22581e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f22582f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public final Executor f22583g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Runnable f22584h0 = new a();

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r1 = r6.O;
            r1.f22581e0 = true;
            r1.X = ch.p.c(ch.p.b());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                rg.d r0 = rg.d.this
                monitor-enter(r0)
                rg.d r1 = rg.d.this     // Catch:{ all -> 0x003f }
                boolean r2 = r1.f22578b0     // Catch:{ all -> 0x003f }
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L_0x000d
                r2 = r4
                goto L_0x000e
            L_0x000d:
                r2 = r3
            L_0x000e:
                boolean r5 = r1.f22579c0     // Catch:{ all -> 0x003f }
                r2 = r2 | r5
                if (r2 == 0) goto L_0x0015
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                return
            L_0x0015:
                r1.z0()     // Catch:{ IOException -> 0x0019 }
                goto L_0x001d
            L_0x0019:
                rg.d r1 = rg.d.this     // Catch:{ all -> 0x003f }
                r1.f22580d0 = r4     // Catch:{ all -> 0x003f }
            L_0x001d:
                rg.d r1 = rg.d.this     // Catch:{ IOException -> 0x002f }
                boolean r1 = r1.A()     // Catch:{ IOException -> 0x002f }
                if (r1 == 0) goto L_0x003d
                rg.d r1 = rg.d.this     // Catch:{ IOException -> 0x002f }
                r1.a0()     // Catch:{ IOException -> 0x002f }
                rg.d r1 = rg.d.this     // Catch:{ IOException -> 0x002f }
                r1.Z = r3     // Catch:{ IOException -> 0x002f }
                goto L_0x003d
            L_0x002f:
                rg.d r1 = rg.d.this     // Catch:{ all -> 0x003f }
                r1.f22581e0 = r4     // Catch:{ all -> 0x003f }
                ch.z r2 = ch.p.b()     // Catch:{ all -> 0x003f }
                ch.d r2 = ch.p.c(r2)     // Catch:{ all -> 0x003f }
                r1.X = r2     // Catch:{ all -> 0x003f }
            L_0x003d:
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                return
            L_0x003f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: rg.d.a.run():void");
        }
    }

    public class b extends e {
        public static final /* synthetic */ boolean R = false;

        static {
            Class<d> cls = d.class;
        }

        public b(z zVar) {
            super(zVar);
        }

        public void f(IOException iOException) {
            d.this.f22577a0 = true;
        }
    }

    public class c implements Iterator<f> {
        public final Iterator<e> O;
        public f P;
        public f Q;

        public c() {
            this.O = new ArrayList(d.this.Y.values()).iterator();
        }

        /* renamed from: a */
        public f next() {
            if (hasNext()) {
                f fVar = this.P;
                this.Q = fVar;
                this.P = null;
                return fVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.P != null) {
                return true;
            }
            synchronized (d.this) {
                if (d.this.f22579c0) {
                    return false;
                }
                while (this.O.hasNext()) {
                    e next = this.O.next();
                    if (next.f22593e) {
                        f c10 = next.c();
                        if (c10 != null) {
                            this.P = c10;
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public void remove() {
            f fVar = this.Q;
            if (fVar != null) {
                try {
                    d.this.c0(fVar.O);
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.Q = null;
                    throw th2;
                }
                this.Q = null;
                return;
            }
            throw new IllegalStateException("remove() before next()");
        }
    }

    /* renamed from: rg.d$d  reason: collision with other inner class name */
    public final class C0413d {

        /* renamed from: a  reason: collision with root package name */
        public final e f22585a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f22586b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f22587c;

        /* renamed from: rg.d$d$a */
        public class a extends e {
            public a(z zVar) {
                super(zVar);
            }

            public void f(IOException iOException) {
                synchronized (d.this) {
                    C0413d.this.d();
                }
            }
        }

        public C0413d(e eVar) {
            this.f22585a = eVar;
            this.f22586b = eVar.f22593e ? null : new boolean[d.this.V];
        }

        public void a() throws IOException {
            synchronized (d.this) {
                if (!this.f22587c) {
                    if (this.f22585a.f22594f == this) {
                        d.this.g(this, false);
                    }
                    this.f22587c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(2:7|8)|9|10) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b() {
            /*
                r3 = this;
                rg.d r0 = rg.d.this
                monitor-enter(r0)
                boolean r1 = r3.f22587c     // Catch:{ all -> 0x0015 }
                if (r1 != 0) goto L_0x0013
                rg.d$e r1 = r3.f22585a     // Catch:{ all -> 0x0015 }
                rg.d$d r1 = r1.f22594f     // Catch:{ all -> 0x0015 }
                if (r1 != r3) goto L_0x0013
                rg.d r1 = rg.d.this     // Catch:{ IOException -> 0x0013 }
                r2 = 0
                r1.g(r3, r2)     // Catch:{ IOException -> 0x0013 }
            L_0x0013:
                monitor-exit(r0)     // Catch:{ all -> 0x0015 }
                return
            L_0x0015:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0015 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: rg.d.C0413d.b():void");
        }

        public void c() throws IOException {
            synchronized (d.this) {
                if (!this.f22587c) {
                    if (this.f22585a.f22594f == this) {
                        d.this.g(this, true);
                    }
                    this.f22587c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void d() {
            if (this.f22585a.f22594f == this) {
                int i10 = 0;
                while (true) {
                    d dVar = d.this;
                    if (i10 < dVar.V) {
                        try {
                            dVar.O.f(this.f22585a.f22592d[i10]);
                        } catch (IOException unused) {
                        }
                        i10++;
                    } else {
                        this.f22585a.f22594f = null;
                        return;
                    }
                }
            }
        }

        public z e(int i10) {
            synchronized (d.this) {
                if (!this.f22587c) {
                    e eVar = this.f22585a;
                    if (eVar.f22594f != this) {
                        z b10 = p.b();
                        return b10;
                    }
                    if (!eVar.f22593e) {
                        this.f22586b[i10] = true;
                    }
                    try {
                        a aVar = new a(d.this.O.b(eVar.f22592d[i10]));
                        return aVar;
                    } catch (FileNotFoundException unused) {
                        return p.b();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ch.a0 f(int r5) {
            /*
                r4 = this;
                rg.d r0 = rg.d.this
                monitor-enter(r0)
                boolean r1 = r4.f22587c     // Catch:{ all -> 0x002b }
                if (r1 != 0) goto L_0x0025
                rg.d$e r1 = r4.f22585a     // Catch:{ all -> 0x002b }
                boolean r2 = r1.f22593e     // Catch:{ all -> 0x002b }
                r3 = 0
                if (r2 == 0) goto L_0x0023
                rg.d$d r2 = r1.f22594f     // Catch:{ all -> 0x002b }
                if (r2 == r4) goto L_0x0013
                goto L_0x0023
            L_0x0013:
                rg.d r2 = rg.d.this     // Catch:{ FileNotFoundException -> 0x0021 }
                xg.a r2 = r2.O     // Catch:{ FileNotFoundException -> 0x0021 }
                java.io.File[] r1 = r1.f22591c     // Catch:{ FileNotFoundException -> 0x0021 }
                r5 = r1[r5]     // Catch:{ FileNotFoundException -> 0x0021 }
                ch.a0 r5 = r2.a(r5)     // Catch:{ FileNotFoundException -> 0x0021 }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return r5
            L_0x0021:
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return r3
            L_0x0023:
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return r3
            L_0x0025:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002b }
                r5.<init>()     // Catch:{ all -> 0x002b }
                throw r5     // Catch:{ all -> 0x002b }
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: rg.d.C0413d.f(int):ch.a0");
        }
    }

    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f22589a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f22590b;

        /* renamed from: c  reason: collision with root package name */
        public final File[] f22591c;

        /* renamed from: d  reason: collision with root package name */
        public final File[] f22592d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f22593e;

        /* renamed from: f  reason: collision with root package name */
        public C0413d f22594f;

        /* renamed from: g  reason: collision with root package name */
        public long f22595g;

        public e(String str) {
            this.f22589a = str;
            int i10 = d.this.V;
            this.f22590b = new long[i10];
            this.f22591c = new File[i10];
            this.f22592d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < d.this.V; i11++) {
                sb2.append(i11);
                this.f22591c[i11] = new File(d.this.P, sb2.toString());
                sb2.append(".tmp");
                this.f22592d[i11] = new File(d.this.P, sb2.toString());
                sb2.setLength(length);
            }
        }

        public final IOException a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public void b(String[] strArr) throws IOException {
            if (strArr.length == d.this.V) {
                int i10 = 0;
                while (i10 < strArr.length) {
                    try {
                        this.f22590b[i10] = Long.parseLong(strArr[i10]);
                        i10++;
                    } catch (NumberFormatException unused) {
                        throw a(strArr);
                    }
                }
                return;
            }
            throw a(strArr);
        }

        public f c() {
            a0 a0Var;
            if (Thread.holdsLock(d.this)) {
                a0[] a0VarArr = new a0[d.this.V];
                long[] jArr = (long[]) this.f22590b.clone();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    try {
                        d dVar = d.this;
                        if (i11 >= dVar.V) {
                            return new f(this.f22589a, this.f22595g, a0VarArr, jArr);
                        }
                        a0VarArr[i11] = dVar.O.a(this.f22591c[i11]);
                        i11++;
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            d dVar2 = d.this;
                            if (i10 >= dVar2.V || (a0Var = a0VarArr[i10]) == null) {
                                try {
                                    dVar2.e0(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            } else {
                                pg.e.g(a0Var);
                                i10++;
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }

        public void d(ch.d dVar) throws IOException {
            for (long G1 : this.f22590b) {
                dVar.writeByte(32).G1(G1);
            }
        }
    }

    public final class f implements Closeable {
        public final String O;
        public final long P;
        public final a0[] Q;
        public final long[] R;

        public f(String str, long j10, a0[] a0VarArr, long[] jArr) {
            this.O = str;
            this.P = j10;
            this.Q = a0VarArr;
            this.R = jArr;
        }

        public void close() {
            for (a0 g10 : this.Q) {
                pg.e.g(g10);
            }
        }

        @Nullable
        public C0413d f() throws IOException {
            return d.this.l(this.O, this.P);
        }

        public long g(int i10) {
            return this.R[i10];
        }

        public a0 h(int i10) {
            return this.Q[i10];
        }

        public String i() {
            return this.O;
        }
    }

    static {
        Class<d> cls = d.class;
    }

    public d(xg.a aVar, File file, int i10, int i11, long j10, Executor executor) {
        this.O = aVar;
        this.P = file;
        this.T = i10;
        this.Q = new File(file, "journal");
        this.R = new File(file, "journal.tmp");
        this.S = new File(file, "journal.bkp");
        this.V = i11;
        this.U = j10;
        this.f22583g0 = executor;
    }

    public static /* synthetic */ void c(Throwable th2, AutoCloseable autoCloseable) {
        if (th2 != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        } else {
            autoCloseable.close();
        }
    }

    public static d h(xg.a aVar, File file, int i10, int i11, long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i11 > 0) {
            return new d(aVar, file, i10, i11, j10, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), pg.e.J("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    public boolean A() {
        int i10 = this.Z;
        return i10 >= 2000 && i10 >= this.Y.size();
    }

    public final void H0(String str) {
        if (!f22571o0.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public final ch.d N() throws FileNotFoundException {
        return p.c(new b(this.O.g(this.Q)));
    }

    public final void P() throws IOException {
        this.O.f(this.R);
        Iterator<e> it = this.Y.values().iterator();
        while (it.hasNext()) {
            e next = it.next();
            int i10 = 0;
            if (next.f22594f == null) {
                while (i10 < this.V) {
                    this.W += next.f22590b[i10];
                    i10++;
                }
            } else {
                next.f22594f = null;
                while (i10 < this.V) {
                    this.O.f(next.f22591c[i10]);
                    this.O.f(next.f22592d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.Z = r0 - r9.Y.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.X() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        a0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.X = N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        c((java.lang.Throwable) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        if (r1 != null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        c(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007b=Splitter:B:23:0x007b, B:16:0x005d=Splitter:B:16:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Q() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            xg.a r1 = r9.O
            java.io.File r2 = r9.Q
            ch.a0 r1 = r1.a(r2)
            ch.e r1 = ch.p.d(r1)
            java.lang.String r2 = r1.b1()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = r1.b1()     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = r1.b1()     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = r1.b1()     // Catch:{ all -> 0x00a9 }
            java.lang.String r6 = r1.b1()     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x007b
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x007b
            int r7 = r9.T     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00a9 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x007b
            int r4 = r9.V     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00a9 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x007b
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x007b
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.b1()     // Catch:{ EOFException -> 0x005d }
            r9.Y(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, rg.d$e> r2 = r9.Y     // Catch:{ all -> 0x00a9 }
            int r2 = r2.size()     // Catch:{ all -> 0x00a9 }
            int r0 = r0 - r2
            r9.Z = r0     // Catch:{ all -> 0x00a9 }
            boolean r0 = r1.X()     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x0070
            r9.a0()     // Catch:{ all -> 0x00a9 }
            goto L_0x0076
        L_0x0070:
            ch.d r0 = r9.N()     // Catch:{ all -> 0x00a9 }
            r9.X = r0     // Catch:{ all -> 0x00a9 }
        L_0x0076:
            r0 = 0
            c(r0, r1)
            return
        L_0x007b:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r7.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            r7.append(r2)     // Catch:{ all -> 0x00a9 }
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            r7.append(r3)     // Catch:{ all -> 0x00a9 }
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            r7.append(r5)     // Catch:{ all -> 0x00a9 }
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            r7.append(r6)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00a9 }
            r4.<init>(r0)     // Catch:{ all -> 0x00a9 }
            throw r4     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r2 = move-exception
            if (r1 == 0) goto L_0x00b1
            c(r0, r1)
        L_0x00b1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.d.Q():void");
    }

    public final void Y(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                str2 = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.Y.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i10, indexOf2);
            }
            e eVar = this.Y.get(str2);
            if (eVar == null) {
                eVar = new e(str2);
                this.Y.put(str2, eVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                eVar.f22593e = true;
                eVar.f22594f = null;
                eVar.b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                eVar.f22594f = new C0413d(eVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b6, code lost:
        if (r0 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        c(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bb, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a0() throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            ch.d r0 = r7.X     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00bc }
        L_0x0008:
            xg.a r0 = r7.O     // Catch:{ all -> 0x00bc }
            java.io.File r1 = r7.R     // Catch:{ all -> 0x00bc }
            ch.z r0 = r0.b(r1)     // Catch:{ all -> 0x00bc }
            ch.d r0 = ch.p.c(r0)     // Catch:{ all -> 0x00bc }
            r1 = 0
            java.lang.String r2 = "libcore.io.DiskLruCache"
            ch.d r2 = r0.D0(r2)     // Catch:{ all -> 0x00b3 }
            r3 = 10
            r2.writeByte(r3)     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "1"
            ch.d r2 = r0.D0(r2)     // Catch:{ all -> 0x00b3 }
            r2.writeByte(r3)     // Catch:{ all -> 0x00b3 }
            int r2 = r7.T     // Catch:{ all -> 0x00b3 }
            long r4 = (long) r2     // Catch:{ all -> 0x00b3 }
            ch.d r2 = r0.G1(r4)     // Catch:{ all -> 0x00b3 }
            r2.writeByte(r3)     // Catch:{ all -> 0x00b3 }
            int r2 = r7.V     // Catch:{ all -> 0x00b3 }
            long r4 = (long) r2     // Catch:{ all -> 0x00b3 }
            ch.d r2 = r0.G1(r4)     // Catch:{ all -> 0x00b3 }
            r2.writeByte(r3)     // Catch:{ all -> 0x00b3 }
            r0.writeByte(r3)     // Catch:{ all -> 0x00b3 }
            java.util.LinkedHashMap<java.lang.String, rg.d$e> r2 = r7.Y     // Catch:{ all -> 0x00b3 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00b3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00b3 }
        L_0x004a:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00b3 }
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00b3 }
            rg.d$e r4 = (rg.d.e) r4     // Catch:{ all -> 0x00b3 }
            rg.d$d r5 = r4.f22594f     // Catch:{ all -> 0x00b3 }
            r6 = 32
            if (r5 == 0) goto L_0x006e
            java.lang.String r5 = "DIRTY"
            ch.d r5 = r0.D0(r5)     // Catch:{ all -> 0x00b3 }
            r5.writeByte(r6)     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = r4.f22589a     // Catch:{ all -> 0x00b3 }
            r0.D0(r4)     // Catch:{ all -> 0x00b3 }
        L_0x006a:
            r0.writeByte(r3)     // Catch:{ all -> 0x00b3 }
            goto L_0x004a
        L_0x006e:
            java.lang.String r5 = "CLEAN"
            ch.d r5 = r0.D0(r5)     // Catch:{ all -> 0x00b3 }
            r5.writeByte(r6)     // Catch:{ all -> 0x00b3 }
            java.lang.String r5 = r4.f22589a     // Catch:{ all -> 0x00b3 }
            r0.D0(r5)     // Catch:{ all -> 0x00b3 }
            r4.d(r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x006a
        L_0x0080:
            c(r1, r0)     // Catch:{ all -> 0x00bc }
            xg.a r0 = r7.O     // Catch:{ all -> 0x00bc }
            java.io.File r1 = r7.Q     // Catch:{ all -> 0x00bc }
            boolean r0 = r0.d(r1)     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0096
            xg.a r0 = r7.O     // Catch:{ all -> 0x00bc }
            java.io.File r1 = r7.Q     // Catch:{ all -> 0x00bc }
            java.io.File r2 = r7.S     // Catch:{ all -> 0x00bc }
            r0.e(r1, r2)     // Catch:{ all -> 0x00bc }
        L_0x0096:
            xg.a r0 = r7.O     // Catch:{ all -> 0x00bc }
            java.io.File r1 = r7.R     // Catch:{ all -> 0x00bc }
            java.io.File r2 = r7.Q     // Catch:{ all -> 0x00bc }
            r0.e(r1, r2)     // Catch:{ all -> 0x00bc }
            xg.a r0 = r7.O     // Catch:{ all -> 0x00bc }
            java.io.File r1 = r7.S     // Catch:{ all -> 0x00bc }
            r0.f(r1)     // Catch:{ all -> 0x00bc }
            ch.d r0 = r7.N()     // Catch:{ all -> 0x00bc }
            r7.X = r0     // Catch:{ all -> 0x00bc }
            r0 = 0
            r7.f22577a0 = r0     // Catch:{ all -> 0x00bc }
            r7.f22581e0 = r0     // Catch:{ all -> 0x00bc }
            monitor-exit(r7)
            return
        L_0x00b3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r2 = move-exception
            if (r0 == 0) goto L_0x00bb
            c(r1, r0)     // Catch:{ all -> 0x00bc }
        L_0x00bb:
            throw r2     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.d.a0():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean c0(java.lang.String r6) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.w()     // Catch:{ all -> 0x0029 }
            r5.f()     // Catch:{ all -> 0x0029 }
            r5.H0(r6)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, rg.d$e> r0 = r5.Y     // Catch:{ all -> 0x0029 }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x0029 }
            rg.d$e r6 = (rg.d.e) r6     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r6 != 0) goto L_0x0017
            monitor-exit(r5)
            return r0
        L_0x0017:
            boolean r6 = r5.e0(r6)     // Catch:{ all -> 0x0029 }
            if (r6 == 0) goto L_0x0027
            long r1 = r5.W     // Catch:{ all -> 0x0029 }
            long r3 = r5.U     // Catch:{ all -> 0x0029 }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0027
            r5.f22580d0 = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r5)
            return r6
        L_0x0029:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.d.c0(java.lang.String):boolean");
    }

    public synchronized void close() throws IOException {
        if (this.f22578b0) {
            if (!this.f22579c0) {
                for (e eVar : (e[]) this.Y.values().toArray(new e[this.Y.size()])) {
                    C0413d dVar = eVar.f22594f;
                    if (dVar != null) {
                        dVar.a();
                    }
                }
                z0();
                this.X.close();
                this.X = null;
                this.f22579c0 = true;
                return;
            }
        }
        this.f22579c0 = true;
    }

    public boolean e0(e eVar) throws IOException {
        C0413d dVar = eVar.f22594f;
        if (dVar != null) {
            dVar.d();
        }
        for (int i10 = 0; i10 < this.V; i10++) {
            this.O.f(eVar.f22591c[i10]);
            long j10 = this.W;
            long[] jArr = eVar.f22590b;
            this.W = j10 - jArr[i10];
            jArr[i10] = 0;
        }
        this.Z++;
        this.X.D0("REMOVE").writeByte(32).D0(eVar.f22589a).writeByte(10);
        this.Y.remove(eVar.f22589a);
        if (A()) {
            this.f22583g0.execute(this.f22584h0);
        }
        return true;
    }

    public final synchronized void f() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void flush() throws IOException {
        if (this.f22578b0) {
            f();
            z0();
            this.X.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void g(rg.d.C0413d r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            rg.d$e r0 = r10.f22585a     // Catch:{ all -> 0x00fb }
            rg.d$d r1 = r0.f22594f     // Catch:{ all -> 0x00fb }
            if (r1 != r10) goto L_0x00f5
            r1 = 0
            if (r11 == 0) goto L_0x0047
            boolean r2 = r0.f22593e     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x0047
            r2 = r1
        L_0x000f:
            int r3 = r9.V     // Catch:{ all -> 0x00fb }
            if (r2 >= r3) goto L_0x0047
            boolean[] r3 = r10.f22586b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002d
            xg.a r3 = r9.O     // Catch:{ all -> 0x00fb }
            java.io.File[] r4 = r0.f22592d     // Catch:{ all -> 0x00fb }
            r4 = r4[r2]     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.d(r4)     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x002a
            r10.a()     // Catch:{ all -> 0x00fb }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.a()     // Catch:{ all -> 0x00fb }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.<init>(r11)     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x0047:
            int r10 = r9.V     // Catch:{ all -> 0x00fb }
            if (r1 >= r10) goto L_0x007f
            java.io.File[] r10 = r0.f22592d     // Catch:{ all -> 0x00fb }
            r10 = r10[r1]     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0077
            xg.a r2 = r9.O     // Catch:{ all -> 0x00fb }
            boolean r2 = r2.d(r10)     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x007c
            java.io.File[] r2 = r0.f22591c     // Catch:{ all -> 0x00fb }
            r2 = r2[r1]     // Catch:{ all -> 0x00fb }
            xg.a r3 = r9.O     // Catch:{ all -> 0x00fb }
            r3.e(r10, r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f22590b     // Catch:{ all -> 0x00fb }
            r3 = r10[r1]     // Catch:{ all -> 0x00fb }
            xg.a r10 = r9.O     // Catch:{ all -> 0x00fb }
            long r5 = r10.h(r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f22590b     // Catch:{ all -> 0x00fb }
            r10[r1] = r5     // Catch:{ all -> 0x00fb }
            long r7 = r9.W     // Catch:{ all -> 0x00fb }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.W = r7     // Catch:{ all -> 0x00fb }
            goto L_0x007c
        L_0x0077:
            xg.a r2 = r9.O     // Catch:{ all -> 0x00fb }
            r2.f(r10)     // Catch:{ all -> 0x00fb }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x007f:
            int r10 = r9.Z     // Catch:{ all -> 0x00fb }
            r1 = 1
            int r10 = r10 + r1
            r9.Z = r10     // Catch:{ all -> 0x00fb }
            r10 = 0
            r0.f22594f = r10     // Catch:{ all -> 0x00fb }
            boolean r10 = r0.f22593e     // Catch:{ all -> 0x00fb }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00bb
            r0.f22593e = r1     // Catch:{ all -> 0x00fb }
            ch.d r10 = r9.X     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "CLEAN"
            ch.d r10 = r10.D0(r1)     // Catch:{ all -> 0x00fb }
            r10.writeByte(r3)     // Catch:{ all -> 0x00fb }
            ch.d r10 = r9.X     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r0.f22589a     // Catch:{ all -> 0x00fb }
            r10.D0(r1)     // Catch:{ all -> 0x00fb }
            ch.d r10 = r9.X     // Catch:{ all -> 0x00fb }
            r0.d(r10)     // Catch:{ all -> 0x00fb }
            ch.d r10 = r9.X     // Catch:{ all -> 0x00fb }
            r10.writeByte(r2)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00d9
            long r10 = r9.f22582f0     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r1 = r1 + r10
            r9.f22582f0 = r1     // Catch:{ all -> 0x00fb }
            r0.f22595g = r10     // Catch:{ all -> 0x00fb }
            goto L_0x00d9
        L_0x00bb:
            java.util.LinkedHashMap<java.lang.String, rg.d$e> r10 = r9.Y     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f22589a     // Catch:{ all -> 0x00fb }
            r10.remove(r11)     // Catch:{ all -> 0x00fb }
            ch.d r10 = r9.X     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = "REMOVE"
            ch.d r10 = r10.D0(r11)     // Catch:{ all -> 0x00fb }
            r10.writeByte(r3)     // Catch:{ all -> 0x00fb }
            ch.d r10 = r9.X     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f22589a     // Catch:{ all -> 0x00fb }
            r10.D0(r11)     // Catch:{ all -> 0x00fb }
            ch.d r10 = r9.X     // Catch:{ all -> 0x00fb }
            r10.writeByte(r2)     // Catch:{ all -> 0x00fb }
        L_0x00d9:
            ch.d r10 = r9.X     // Catch:{ all -> 0x00fb }
            r10.flush()     // Catch:{ all -> 0x00fb }
            long r10 = r9.W     // Catch:{ all -> 0x00fb }
            long r0 = r9.U     // Catch:{ all -> 0x00fb }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ec
            boolean r10 = r9.A()     // Catch:{ all -> 0x00fb }
            if (r10 == 0) goto L_0x00f3
        L_0x00ec:
            java.util.concurrent.Executor r10 = r9.f22583g0     // Catch:{ all -> 0x00fb }
            java.lang.Runnable r11 = r9.f22584h0     // Catch:{ all -> 0x00fb }
            r10.execute(r11)     // Catch:{ all -> 0x00fb }
        L_0x00f3:
            monitor-exit(r9)
            return
        L_0x00f5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            r10.<init>()     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.d.g(rg.d$d, boolean):void");
    }

    public void i() throws IOException {
        close();
        this.O.c(this.P);
    }

    public synchronized boolean isClosed() {
        return this.f22579c0;
    }

    @Nullable
    public C0413d k(String str) throws IOException {
        return l(str, -1);
    }

    public synchronized void k0(long j10) {
        this.U = j10;
        if (this.f22578b0) {
            this.f22583g0.execute(this.f22584h0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized rg.d.C0413d l(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.w()     // Catch:{ all -> 0x0074 }
            r5.f()     // Catch:{ all -> 0x0074 }
            r5.H0(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, rg.d$e> r0 = r5.Y     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            rg.d$e r0 = (rg.d.e) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r3 = r0.f22595g     // Catch:{ all -> 0x0074 }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r2
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            rg.d$d r7 = r0.f22594f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r2
        L_0x002b:
            boolean r7 = r5.f22580d0     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.f22581e0     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            ch.d r7 = r5.X     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            ch.d r7 = r7.D0(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            ch.d r7 = r7.writeByte(r8)     // Catch:{ all -> 0x0074 }
            ch.d r7 = r7.D0(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.writeByte(r8)     // Catch:{ all -> 0x0074 }
            ch.d r7 = r5.X     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.f22577a0     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r2
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            rg.d$e r0 = new rg.d$e     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, rg.d$e> r7 = r5.Y     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            rg.d$d r6 = new rg.d$d     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f22594f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.f22583g0     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.f22584h0     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r2
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.d.l(java.lang.String, long):rg.d$d");
    }

    public synchronized void m() throws IOException {
        w();
        for (e e02 : (e[]) this.Y.values().toArray(new e[this.Y.size()])) {
            e0(e02);
        }
        this.f22580d0 = false;
    }

    public synchronized Iterator<f> m0() throws IOException {
        w();
        return new c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized rg.d.f o(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.w()     // Catch:{ all -> 0x0050 }
            r3.f()     // Catch:{ all -> 0x0050 }
            r3.H0(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, rg.d$e> r0 = r3.Y     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            rg.d$e r0 = (rg.d.e) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f22593e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            rg.d$f r0 = r0.c()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.Z     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.Z = r1     // Catch:{ all -> 0x0050 }
            ch.d r1 = r3.X     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            ch.d r1 = r1.D0(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            ch.d r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0050 }
            ch.d r4 = r1.D0(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.writeByte(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.A()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.f22583g0     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.f22584h0     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.d.o(java.lang.String):rg.d$f");
    }

    public File q() {
        return this.P;
    }

    public synchronized long size() throws IOException {
        w();
        return this.W;
    }

    public synchronized long t() {
        return this.U;
    }

    public synchronized void w() throws IOException {
        if (!this.f22578b0) {
            if (this.O.d(this.S)) {
                if (this.O.d(this.Q)) {
                    this.O.f(this.S);
                } else {
                    this.O.e(this.S, this.Q);
                }
            }
            if (this.O.d(this.Q)) {
                try {
                    Q();
                    P();
                    this.f22578b0 = true;
                    return;
                } catch (IOException e10) {
                    h m10 = h.m();
                    m10.u(5, "DiskLruCache " + this.P + " is corrupt: " + e10.getMessage() + ", removing", e10);
                    i();
                    this.f22579c0 = false;
                } catch (Throwable th2) {
                    this.f22579c0 = false;
                    throw th2;
                }
            }
            a0();
            this.f22578b0 = true;
        }
    }

    public void z0() throws IOException {
        while (this.W > this.U) {
            e0(this.Y.values().iterator().next());
        }
        this.f22580d0 = false;
    }
}
