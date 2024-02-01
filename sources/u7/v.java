package u7;

import android.os.ConditionVariable;
import b6.c;
import d.m0;
import d.o0;
import f6.b;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import u7.a;
import w7.p;
import w7.q0;

public final class v implements a {

    /* renamed from: m  reason: collision with root package name */
    public static final String f13883m = "SimpleCache";

    /* renamed from: n  reason: collision with root package name */
    public static final int f13884n = 10;

    /* renamed from: o  reason: collision with root package name */
    public static final String f13885o = ".uid";

    /* renamed from: p  reason: collision with root package name */
    public static final HashSet<File> f13886p = new HashSet<>();

    /* renamed from: q  reason: collision with root package name */
    public static boolean f13887q;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f13888r;

    /* renamed from: b  reason: collision with root package name */
    public final File f13889b;

    /* renamed from: c  reason: collision with root package name */
    public final f f13890c;

    /* renamed from: d  reason: collision with root package name */
    public final n f13891d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final h f13892e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, ArrayList<a.b>> f13893f;

    /* renamed from: g  reason: collision with root package name */
    public final Random f13894g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13895h;

    /* renamed from: i  reason: collision with root package name */
    public long f13896i;

    /* renamed from: j  reason: collision with root package name */
    public long f13897j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f13898k;

    /* renamed from: l  reason: collision with root package name */
    public a.C0232a f13899l;

    public class a extends Thread {
        public final /* synthetic */ ConditionVariable O;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.O = conditionVariable;
        }

        public void run() {
            synchronized (v.this) {
                this.O.open();
                v.this.A();
                v.this.f13890c.e();
            }
        }
    }

    @Deprecated
    public v(File file, f fVar) {
        this(file, fVar, (byte[]) null, false);
    }

    public v(File file, f fVar, b bVar) {
        this(file, fVar, bVar, (byte[]) null, false, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public v(File file, f fVar, @o0 b bVar, @o0 byte[] bArr, boolean z10, boolean z11) {
        this(file, fVar, new n(bVar, file, bArr, z10, z11), (bVar == null || z11) ? null : new h(bVar));
    }

    public v(File file, f fVar, n nVar, @o0 h hVar) {
        if (E(file)) {
            this.f13889b = file;
            this.f13890c = fVar;
            this.f13891d = nVar;
            this.f13892e = hVar;
            this.f13893f = new HashMap<>();
            this.f13894g = new Random();
            this.f13895h = fVar.f();
            this.f13896i = -1;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("SimpleCache.initialize()", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public v(File file, f fVar, @o0 byte[] bArr) {
        this(file, fVar, bArr, bArr != null);
    }

    @Deprecated
    public v(File file, f fVar, @o0 byte[] bArr, boolean z10) {
        this(file, fVar, (b) null, bArr, z10, true);
    }

    public static synchronized boolean B(File file) {
        boolean contains;
        synchronized (v.class) {
            contains = f13886p.contains(file.getAbsoluteFile());
        }
        return contains;
    }

    public static long D(File[] fileArr) {
        int length = fileArr.length;
        int i10 = 0;
        while (i10 < length) {
            File file = fileArr[i10];
            String name = file.getName();
            if (name.endsWith(f13885o)) {
                try {
                    return I(name);
                } catch (NumberFormatException unused) {
                    p.d(f13883m, "Malformed UID file: " + file);
                    file.delete();
                }
            } else {
                i10++;
            }
        }
        return -1;
    }

    public static synchronized boolean E(File file) {
        synchronized (v.class) {
            if (f13887q) {
                return true;
            }
            boolean add = f13886p.add(file.getAbsoluteFile());
            return add;
        }
    }

    public static long I(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static synchronized void N(File file) {
        synchronized (v.class) {
            if (!f13887q) {
                f13886p.remove(file.getAbsoluteFile());
            }
        }
    }

    public static long v(File file) throws IOException {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0 : Math.abs(nextLong);
        String l10 = Long.toString(abs, 16);
        File file2 = new File(file, l10 + f13885o);
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static void w(File file, @o0 b bVar) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                file.delete();
                return;
            }
            if (bVar != null) {
                long D = D(listFiles);
                if (D != -1) {
                    try {
                        h.a(bVar, D);
                    } catch (f6.a unused) {
                        p.l(f13883m, "Failed to delete file metadata: " + D);
                    }
                    try {
                        n.g(bVar, D);
                    } catch (f6.a unused2) {
                        p.l(f13883m, "Failed to delete file metadata: " + D);
                    }
                }
            }
            q0.I0(file);
        }
    }

    @Deprecated
    public static synchronized void x() {
        synchronized (v.class) {
            f13887q = true;
            f13886p.clear();
        }
    }

    @Deprecated
    public static void y() {
        f13888r = true;
    }

    public final void A() {
        a.C0232a aVar;
        if (this.f13889b.exists() || this.f13889b.mkdirs()) {
            File[] listFiles = this.f13889b.listFiles();
            if (listFiles == null) {
                String str = "Failed to list cache directory files: " + this.f13889b;
                p.d(f13883m, str);
                aVar = new a.C0232a(str);
            } else {
                long D = D(listFiles);
                this.f13896i = D;
                if (D == -1) {
                    try {
                        this.f13896i = v(this.f13889b);
                    } catch (IOException e10) {
                        String str2 = "Failed to create cache UID: " + this.f13889b;
                        p.e(f13883m, str2, e10);
                        aVar = new a.C0232a(str2, e10);
                    }
                }
                try {
                    this.f13891d.p(this.f13896i);
                    h hVar = this.f13892e;
                    if (hVar != null) {
                        hVar.f(this.f13896i);
                        Map<String, g> c10 = this.f13892e.c();
                        C(this.f13889b, true, listFiles, c10);
                        this.f13892e.h(c10.keySet());
                    } else {
                        C(this.f13889b, true, listFiles, (Map<String, g>) null);
                    }
                    this.f13891d.t();
                    try {
                        this.f13891d.u();
                        return;
                    } catch (IOException e11) {
                        p.e(f13883m, "Storing index file failed", e11);
                        return;
                    }
                } catch (IOException e12) {
                    String str3 = "Failed to initialize cache indices: " + this.f13889b;
                    p.e(f13883m, str3, e12);
                    aVar = new a.C0232a(str3, e12);
                }
            }
        } else {
            String str4 = "Failed to create cache directory: " + this.f13889b;
            p.d(f13883m, str4);
            aVar = new a.C0232a(str4);
        }
        this.f13899l = aVar;
    }

    public final void C(File file, boolean z10, @o0 File[] fileArr, @o0 Map<String, g> map) {
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z10 && name.indexOf(46) == -1) {
                    C(file2, false, file2.listFiles(), map);
                } else if (!z10 || (!n.q(name) && !name.endsWith(f13885o))) {
                    long j10 = -1;
                    long j11 = c.f4201b;
                    g remove = map != null ? map.remove(name) : null;
                    if (remove != null) {
                        j10 = remove.f13816a;
                        j11 = remove.f13817b;
                    }
                    w i10 = w.i(file2, j10, j11, this.f13891d);
                    if (i10 != null) {
                        t(i10);
                    } else {
                        file2.delete();
                    }
                }
            }
        } else if (!z10) {
            file.delete();
        }
    }

    public final void F(w wVar) {
        ArrayList arrayList = this.f13893f.get(wVar.O);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a.b) arrayList.get(size)).b(this, wVar);
            }
        }
        this.f13890c.b(this, wVar);
    }

    public final void G(j jVar) {
        ArrayList arrayList = this.f13893f.get(jVar.O);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a.b) arrayList.get(size)).c(this, jVar);
            }
        }
        this.f13890c.c(this, jVar);
    }

    public final void H(w wVar, j jVar) {
        ArrayList arrayList = this.f13893f.get(wVar.O);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a.b) arrayList.get(size)).d(this, wVar, jVar);
            }
        }
        this.f13890c.d(this, wVar, jVar);
    }

    public final void J(j jVar) {
        m h10 = this.f13891d.h(jVar.O);
        if (h10 != null && h10.i(jVar)) {
            this.f13897j -= jVar.Q;
            if (this.f13892e != null) {
                String name = jVar.S.getName();
                try {
                    this.f13892e.g(name);
                } catch (IOException unused) {
                    p.l(f13883m, "Failed to remove file index entry for: " + name);
                }
            }
            this.f13891d.r(h10.f13838b);
            G(jVar);
        }
    }

    public final void K() {
        ArrayList arrayList = new ArrayList();
        for (m f10 : this.f13891d.i()) {
            Iterator<w> it = f10.f().iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (!next.S.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            J((j) arrayList.get(i10));
        }
    }

    /* renamed from: L */
    public synchronized w o(String str, long j10) throws InterruptedException, a.C0232a {
        w M;
        w7.a.i(!this.f13898k);
        u();
        while (true) {
            M = p(str, j10);
            if (M == null) {
                wait();
            }
        }
        return M;
    }

    @o0
    /* renamed from: M */
    public synchronized w p(String str, long j10) throws a.C0232a {
        boolean z10 = false;
        w7.a.i(!this.f13898k);
        u();
        w z11 = z(str, j10);
        if (!z11.R) {
            m o10 = this.f13891d.o(str);
            if (o10.h()) {
                return null;
            }
            o10.k(true);
            return z11;
        } else if (!this.f13895h) {
            return z11;
        } else {
            String name = ((File) w7.a.g(z11.S)).getName();
            long j11 = z11.Q;
            long currentTimeMillis = System.currentTimeMillis();
            h hVar = this.f13892e;
            if (hVar != null) {
                try {
                    hVar.i(name, j11, currentTimeMillis);
                } catch (IOException unused) {
                    p.l(f13883m, "Failed to update index with new touch timestamp.");
                }
            } else {
                z10 = true;
            }
            w j12 = this.f13891d.h(str).j(z11, currentTimeMillis, z10);
            H(z11, j12);
            return j12;
        }
    }

    public synchronized void a() {
        if (!this.f13898k) {
            this.f13893f.clear();
            K();
            try {
                this.f13891d.u();
                N(this.f13889b);
            } catch (IOException e10) {
                try {
                    p.e(f13883m, "Storing index file failed", e10);
                    N(this.f13889b);
                } catch (Throwable th2) {
                    N(this.f13889b);
                    this.f13898k = true;
                    throw th2;
                }
            }
            this.f13898k = true;
            return;
        }
        return;
    }

    public synchronized long b() {
        return this.f13896i;
    }

    public synchronized File c(String str, long j10, long j11) throws a.C0232a {
        m h10;
        File file;
        w7.a.i(!this.f13898k);
        u();
        h10 = this.f13891d.h(str);
        w7.a.g(h10);
        w7.a.i(h10.h());
        if (!this.f13889b.exists()) {
            this.f13889b.mkdirs();
            K();
        }
        this.f13890c.a(this, str, j10, j11);
        file = new File(this.f13889b, Integer.toString(this.f13894g.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return w.n(file, h10.f13837a, j10, System.currentTimeMillis());
    }

    public synchronized q d(String str) {
        w7.a.i(!this.f13898k);
        return this.f13891d.k(str);
    }

    public synchronized NavigableSet<j> e(String str, a.b bVar) {
        w7.a.i(!this.f13898k);
        ArrayList arrayList = this.f13893f.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f13893f.put(str, arrayList);
        }
        arrayList.add(bVar);
        return q(str);
    }

    public synchronized void f(j jVar) {
        w7.a.i(!this.f13898k);
        m h10 = this.f13891d.h(jVar.O);
        w7.a.g(h10);
        w7.a.i(h10.h());
        h10.k(false);
        this.f13891d.r(h10.f13838b);
        notifyAll();
    }

    public synchronized long g(String str, long j10, long j11) {
        m h10;
        w7.a.i(!this.f13898k);
        h10 = this.f13891d.h(str);
        return h10 != null ? h10.c(j10, j11) : -j11;
    }

    public synchronized Set<String> h() {
        w7.a.i(!this.f13898k);
        return new HashSet(this.f13891d.m());
    }

    public synchronized void i(File file, long j10) throws a.C0232a {
        boolean z10 = true;
        w7.a.i(!this.f13898k);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            w wVar = (w) w7.a.g(w.j(file, j10, this.f13891d));
            m mVar = (m) w7.a.g(this.f13891d.h(wVar.O));
            w7.a.i(mVar.h());
            long a10 = p.a(mVar.d());
            if (a10 != -1) {
                if (wVar.P + wVar.Q > a10) {
                    z10 = false;
                }
                w7.a.i(z10);
            }
            if (this.f13892e != null) {
                try {
                    this.f13892e.i(file.getName(), wVar.Q, wVar.T);
                } catch (IOException e10) {
                    throw new a.C0232a((Throwable) e10);
                } catch (IOException e11) {
                    throw new a.C0232a((Throwable) e11);
                }
            }
            t(wVar);
            this.f13891d.u();
            notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void j(java.lang.String r2, u7.a.b r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f13898k     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            java.util.HashMap<java.lang.String, java.util.ArrayList<u7.a$b>> r0 = r1.f13893f     // Catch:{ all -> 0x0021 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0021 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001f
            r0.remove(r3)     // Catch:{ all -> 0x0021 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0021 }
            if (r3 == 0) goto L_0x001f
            java.util.HashMap<java.lang.String, java.util.ArrayList<u7.a$b>> r3 = r1.f13893f     // Catch:{ all -> 0x0021 }
            r3.remove(r2)     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r1)
            return
        L_0x0021:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.v.j(java.lang.String, u7.a$b):void");
    }

    public synchronized long k() {
        w7.a.i(!this.f13898k);
        return this.f13897j;
    }

    public synchronized void l(String str, r rVar) throws a.C0232a {
        w7.a.i(!this.f13898k);
        u();
        this.f13891d.e(str, rVar);
        try {
            this.f13891d.u();
        } catch (IOException e10) {
            throw new a.C0232a((Throwable) e10);
        }
    }

    public synchronized void m(j jVar) {
        w7.a.i(!this.f13898k);
        J(jVar);
    }

    public synchronized boolean n(String str, long j10, long j11) {
        boolean z10;
        z10 = true;
        w7.a.i(!this.f13898k);
        m h10 = this.f13891d.h(str);
        if (h10 == null || h10.c(j10, j11) < j11) {
            z10 = false;
        }
        return z10;
    }

    @m0
    public synchronized NavigableSet<j> q(String str) {
        TreeSet treeSet;
        w7.a.i(!this.f13898k);
        m h10 = this.f13891d.h(str);
        if (h10 != null) {
            if (!h10.g()) {
                treeSet = new TreeSet(h10.f());
            }
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    public final void t(w wVar) {
        this.f13891d.o(wVar.O).a(wVar);
        this.f13897j += wVar.Q;
        F(wVar);
    }

    public synchronized void u() throws a.C0232a {
        if (!f13888r) {
            a.C0232a aVar = this.f13899l;
            if (aVar != null) {
                throw aVar;
            }
        }
    }

    public final w z(String str, long j10) {
        w e10;
        m h10 = this.f13891d.h(str);
        if (h10 == null) {
            return w.m(str, j10);
        }
        while (true) {
            e10 = h10.e(j10);
            if (!e10.R || e10.S.exists()) {
                return e10;
            }
            K();
        }
        return e10;
    }
}
