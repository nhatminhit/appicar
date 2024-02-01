package t3;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p7.f;

public final class b implements Closeable {

    /* renamed from: c0  reason: collision with root package name */
    public static final String f12905c0 = "journal";

    /* renamed from: d0  reason: collision with root package name */
    public static final String f12906d0 = "journal.tmp";

    /* renamed from: e0  reason: collision with root package name */
    public static final String f12907e0 = "journal.bkp";

    /* renamed from: f0  reason: collision with root package name */
    public static final String f12908f0 = "libcore.io.DiskLruCache";

    /* renamed from: g0  reason: collision with root package name */
    public static final String f12909g0 = "1";

    /* renamed from: h0  reason: collision with root package name */
    public static final long f12910h0 = -1;

    /* renamed from: i0  reason: collision with root package name */
    public static final String f12911i0 = "CLEAN";

    /* renamed from: j0  reason: collision with root package name */
    public static final String f12912j0 = "DIRTY";

    /* renamed from: k0  reason: collision with root package name */
    public static final String f12913k0 = "REMOVE";

    /* renamed from: l0  reason: collision with root package name */
    public static final String f12914l0 = "READ";
    public final File O;
    public final File P;
    public final File Q;
    public final File R;
    public final int S;
    public long T;
    public final int U;
    public long V = 0;
    public Writer W;
    public final LinkedHashMap<String, d> X = new LinkedHashMap<>(0, 0.75f, true);
    public int Y;
    public long Z = 0;

    /* renamed from: a0  reason: collision with root package name */
    public final ThreadPoolExecutor f12915a0 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C0217b((a) null));

    /* renamed from: b0  reason: collision with root package name */
    public final Callable<Void> f12916b0 = new a();

    public class a implements Callable<Void> {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                t3.b r0 = t3.b.this
                monitor-enter(r0)
                t3.b r1 = t3.b.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.W     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                t3.b r1 = t3.b.this     // Catch:{ all -> 0x0028 }
                r1.m1()     // Catch:{ all -> 0x0028 }
                t3.b r1 = t3.b.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.z0()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                t3.b r1 = t3.b.this     // Catch:{ all -> 0x0028 }
                r1.Z0()     // Catch:{ all -> 0x0028 }
                t3.b r1 = t3.b.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.Y = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.b.a.call():java.lang.Void");
        }
    }

    /* renamed from: t3.b$b  reason: collision with other inner class name */
    public static final class C0217b implements ThreadFactory {
        public C0217b() {
        }

        public /* synthetic */ C0217b(a aVar) {
            this();
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f12918a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f12919b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12920c;

        public c(d dVar) {
            this.f12918a = dVar;
            this.f12919b = dVar.f12926e ? null : new boolean[b.this.U];
        }

        public /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() throws IOException {
            b.this.A(this, false);
        }

        public void b() {
            if (!this.f12920c) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void e() throws IOException {
            b.this.A(this, true);
            this.f12920c = true;
        }

        public File f(int i10) throws IOException {
            File k10;
            synchronized (b.this) {
                if (this.f12918a.f12927f == this) {
                    if (!this.f12918a.f12926e) {
                        this.f12919b[i10] = true;
                    }
                    k10 = this.f12918a.k(i10);
                    if (!b.this.O.exists()) {
                        b.this.O.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return k10;
        }

        public String g(int i10) throws IOException {
            InputStream h10 = h(i10);
            if (h10 != null) {
                return b.m0(h10);
            }
            return null;
        }

        public final InputStream h(int i10) throws IOException {
            synchronized (b.this) {
                if (this.f12918a.f12927f != this) {
                    throw new IllegalStateException();
                } else if (!this.f12918a.f12926e) {
                    return null;
                } else {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.f12918a.j(i10));
                        return fileInputStream;
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
            }
        }

        public void i(int i10, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(f(i10)), d.f12936b);
                try {
                    outputStreamWriter2.write(str);
                    d.a(outputStreamWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    d.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                d.a(outputStreamWriter);
                throw th;
            }
        }
    }

    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f12922a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f12923b;

        /* renamed from: c  reason: collision with root package name */
        public File[] f12924c;

        /* renamed from: d  reason: collision with root package name */
        public File[] f12925d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f12926e;

        /* renamed from: f  reason: collision with root package name */
        public c f12927f;

        /* renamed from: g  reason: collision with root package name */
        public long f12928g;

        public d(String str) {
            this.f12922a = str;
            this.f12923b = new long[b.this.U];
            this.f12924c = new File[b.this.U];
            this.f12925d = new File[b.this.U];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < b.this.U; i10++) {
                sb2.append(i10);
                this.f12924c[i10] = new File(b.this.O, sb2.toString());
                sb2.append(".tmp");
                this.f12925d[i10] = new File(b.this.O, sb2.toString());
                sb2.setLength(length);
            }
        }

        public /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        public File j(int i10) {
            return this.f12924c[i10];
        }

        public File k(int i10) {
            return this.f12925d[i10];
        }

        public String l() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long append : this.f12923b) {
                sb2.append(f.f11698i);
                sb2.append(append);
            }
            return sb2.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length == b.this.U) {
                int i10 = 0;
                while (i10 < strArr.length) {
                    try {
                        this.f12923b[i10] = Long.parseLong(strArr[i10]);
                        i10++;
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }
    }

    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f12930a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12931b;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f12932c;

        /* renamed from: d  reason: collision with root package name */
        public final File[] f12933d;

        public e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f12930a = str;
            this.f12931b = j10;
            this.f12933d = fileArr;
            this.f12932c = jArr;
        }

        public /* synthetic */ e(b bVar, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        public c a() throws IOException {
            return b.this.Y(this.f12930a, this.f12931b);
        }

        public File b(int i10) {
            return this.f12933d[i10];
        }

        public long c(int i10) {
            return this.f12932c[i10];
        }

        public String d(int i10) throws IOException {
            return b.m0(new FileInputStream(this.f12933d[i10]));
        }
    }

    public b(File file, int i10, int i11, long j10) {
        File file2 = file;
        this.O = file2;
        this.S = i10;
        this.P = new File(file2, "journal");
        this.Q = new File(file2, "journal.tmp");
        this.R = new File(file2, "journal.bkp");
        this.U = i11;
        this.T = j10;
    }

    public static b H0(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i11 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    g1(file2, file3, false);
                }
            }
            b bVar = new b(file, i10, i11, j10);
            if (bVar.P.exists()) {
                try {
                    bVar.W0();
                    bVar.T0();
                    return bVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    bVar.N();
                }
            }
            file.mkdirs();
            b bVar2 = new b(file, i10, i11, j10);
            bVar2.Z0();
            return bVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    public static void P(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void a0(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void g1(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            P(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static String m0(InputStream inputStream) throws IOException {
        return d.c(new InputStreamReader(inputStream, d.f12936b));
    }

    @TargetApi(26)
    public static void w(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A(t3.b.c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            t3.b$d r0 = r10.f12918a     // Catch:{ all -> 0x010e }
            t3.b$c r1 = r0.f12927f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f12926e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = r1
        L_0x0015:
            int r3 = r9.U     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f12919b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.U     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f12923b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f12923b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.V     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.V = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            P(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.Y     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.Y = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            t3.b.c unused = r0.f12927f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f12926e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f12926e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.W     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.W     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.W     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f12922a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.W     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.W     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.Z     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.Z = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f12928g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, t3.b$d> r10 = r9.X     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f12922a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.W     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.W     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.W     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f12922a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.W     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.W     // Catch:{ all -> 0x010e }
            a0(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.V     // Catch:{ all -> 0x010e }
            long r0 = r9.T     // Catch:{ all -> 0x010e }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ff
            boolean r10 = r9.z0()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f12915a0     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f12916b0     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b.A(t3.b$c, boolean):void");
    }

    public void N() throws IOException {
        close();
        d.b(this.O);
    }

    public c Q(String str) throws IOException {
        return Y(str, -1);
    }

    public final void T0() throws IOException {
        P(this.Q);
        Iterator<d> it = this.X.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f12927f == null) {
                while (i10 < this.U) {
                    this.V += next.f12923b[i10];
                    i10++;
                }
            } else {
                c unused = next.f12927f = null;
                while (i10 < this.U) {
                    P(next.j(i10));
                    P(next.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.Y = r0 - r9.X.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.g() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        Z0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.W = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.P, true), t3.d.f12935a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W0() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            t3.c r1 = new t3.c
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.P
            r2.<init>(r3)
            java.nio.charset.Charset r3 = t3.d.f12935a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.h()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.h()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.h()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.h()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.h()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.S     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.U     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.h()     // Catch:{ EOFException -> 0x005f }
            r9.X0(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, t3.b$d> r2 = r9.X     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.Y = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.g()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.Z0()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.P     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = t3.d.f12935a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.W = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            t3.d.a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            t3.d.a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b.W0():void");
    }

    public final void X0(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                str2 = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.X.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i10, indexOf2);
            }
            d dVar = this.X.get(str2);
            if (dVar == null) {
                dVar = new d(this, str2, (a) null);
                this.X.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f12926e = true;
                c unused2 = dVar.f12927f = null;
                dVar.n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c unused3 = dVar.f12927f = new c(this, dVar, (a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized t3.b.c Y(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.t()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, t3.b$d> r0 = r5.X     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            t3.b$d r0 = (t3.b.d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r3 = r0.f12928g     // Catch:{ all -> 0x005d }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r2
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            t3.b$d r0 = new t3.b$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r2)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, t3.b$d> r7 = r5.X     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            t3.b$c r7 = r0.f12927f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r2
        L_0x0034:
            t3.b$c r7 = new t3.b$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r2)     // Catch:{ all -> 0x005d }
            t3.b.c unused = r0.f12927f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.W     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.W     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.W     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.W     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.W     // Catch:{ all -> 0x005d }
            a0(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b.Y(java.lang.String, long):t3.b$c");
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void Z0() throws IOException {
        String str;
        Writer writer = this.W;
        if (writer != null) {
            w(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.Q), d.f12935a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.S));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.U));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d next : this.X.values()) {
                if (next.f12927f != null) {
                    str = "DIRTY " + next.f12922a + 10;
                } else {
                    str = "CLEAN " + next.f12922a + next.l() + 10;
                }
                bufferedWriter.write(str);
            }
            w(bufferedWriter);
            if (this.P.exists()) {
                g1(this.P, this.R, true);
            }
            g1(this.Q, this.P, false);
            this.R.delete();
            this.W = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.P, true), d.f12935a));
        } catch (Throwable th2) {
            w(bufferedWriter);
            throw th2;
        }
    }

    public synchronized e c0(String str) throws IOException {
        t();
        d dVar = this.X.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f12926e) {
            return null;
        }
        for (File exists : dVar.f12924c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.Y++;
        this.W.append("READ");
        this.W.append(f.f11698i);
        this.W.append(str);
        this.W.append(10);
        if (z0()) {
            this.f12915a0.submit(this.f12916b0);
        }
        return new e(this, str, dVar.f12928g, dVar.f12924c, dVar.f12923b, (a) null);
    }

    public synchronized void close() throws IOException {
        if (this.W != null) {
            Iterator it = new ArrayList(this.X.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f12927f != null) {
                    dVar.f12927f.a();
                }
            }
            m1();
            w(this.W);
            this.W = null;
        }
    }

    public File e0() {
        return this.O;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean f1(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.t()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, t3.b$d> r0 = r7.X     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            t3.b$d r0 = (t3.b.d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            t3.b$c r2 = r0.f12927f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.U     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.V     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f12923b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.V = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f12923b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.Y     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.Y = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.W     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.W     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.W     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.W     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, t3.b$d> r0 = r7.X     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.z0()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f12915a0     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f12916b0     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.b.f1(java.lang.String):boolean");
    }

    public synchronized void flush() throws IOException {
        t();
        m1();
        a0(this.W);
    }

    public synchronized void h1(long j10) {
        this.T = j10;
        this.f12915a0.submit(this.f12916b0);
    }

    public synchronized boolean isClosed() {
        return this.W == null;
    }

    public synchronized long k0() {
        return this.T;
    }

    public final void m1() throws IOException {
        while (this.V > this.T) {
            f1((String) this.X.entrySet().iterator().next().getKey());
        }
    }

    public synchronized long size() {
        return this.V;
    }

    public final void t() {
        if (this.W == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final boolean z0() {
        int i10 = this.Y;
        return i10 >= 2000 && i10 >= this.X.size();
    }
}
