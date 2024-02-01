package sg;

import ch.a0;
import ch.b0;
import ch.c;
import ch.f;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import pg.e;

public final class b {

    /* renamed from: k  reason: collision with root package name */
    public static final int f23004k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f23005l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final f f23006m = f.o("OkHttp cache v1\n");

    /* renamed from: n  reason: collision with root package name */
    public static final f f23007n = f.o("OkHttp DIRTY :(\n");

    /* renamed from: o  reason: collision with root package name */
    public static final long f23008o = 32;

    /* renamed from: a  reason: collision with root package name */
    public RandomAccessFile f23009a;

    /* renamed from: b  reason: collision with root package name */
    public Thread f23010b;

    /* renamed from: c  reason: collision with root package name */
    public a0 f23011c;

    /* renamed from: d  reason: collision with root package name */
    public final c f23012d = new c();

    /* renamed from: e  reason: collision with root package name */
    public long f23013e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f23014f;

    /* renamed from: g  reason: collision with root package name */
    public final f f23015g;

    /* renamed from: h  reason: collision with root package name */
    public final c f23016h = new c();

    /* renamed from: i  reason: collision with root package name */
    public final long f23017i;

    /* renamed from: j  reason: collision with root package name */
    public int f23018j;

    public class a implements a0 {
        public final b0 O = new b0();
        public a P;
        public long Q;

        public a() {
            this.P = new a(b.this.f23009a.getChannel());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
            r11 = r7 - r0.f23016h.size();
            r13 = r1.Q;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
            if (r13 >= r11) goto L_0x00fc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
            r2 = java.lang.Math.min(r2, r7 - r13);
            r1.R.f23016h.m(r22, r1.Q - r11, r2);
            r1.Q += r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0116, code lost:
            return r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long C0(ch.c r22, long r23) throws java.io.IOException {
            /*
                r21 = this;
                r1 = r21
                r2 = r23
                sg.a r0 = r1.P
                if (r0 == 0) goto L_0x011a
                sg.b r4 = sg.b.this
                monitor-enter(r4)
            L_0x000b:
                long r5 = r1.Q     // Catch:{ all -> 0x0117 }
                sg.b r0 = sg.b.this     // Catch:{ all -> 0x0117 }
                long r7 = r0.f23013e     // Catch:{ all -> 0x0117 }
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                r6 = 2
                r9 = -1
                if (r5 != 0) goto L_0x0031
                boolean r5 = r0.f23014f     // Catch:{ all -> 0x0117 }
                if (r5 == 0) goto L_0x001e
                monitor-exit(r4)     // Catch:{ all -> 0x0117 }
                return r9
            L_0x001e:
                java.lang.Thread r5 = r0.f23010b     // Catch:{ all -> 0x0117 }
                if (r5 == 0) goto L_0x0028
                ch.b0 r5 = r1.O     // Catch:{ all -> 0x0117 }
                r5.k(r0)     // Catch:{ all -> 0x0117 }
                goto L_0x000b
            L_0x0028:
                java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0117 }
                r0.f23010b = r5     // Catch:{ all -> 0x0117 }
                r0 = 1
                monitor-exit(r4)     // Catch:{ all -> 0x0117 }
                goto L_0x0041
            L_0x0031:
                ch.c r0 = r0.f23016h     // Catch:{ all -> 0x0117 }
                long r11 = r0.size()     // Catch:{ all -> 0x0117 }
                long r11 = r7 - r11
                long r13 = r1.Q     // Catch:{ all -> 0x0117 }
                int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r0 >= 0) goto L_0x00fc
                monitor-exit(r4)     // Catch:{ all -> 0x0117 }
                r0 = r6
            L_0x0041:
                r4 = 32
                if (r0 != r6) goto L_0x005e
                long r9 = r1.Q
                long r7 = r7 - r9
                long r2 = java.lang.Math.min(r2, r7)
                sg.a r9 = r1.P
                long r6 = r1.Q
                long r10 = r6 + r4
                r12 = r22
                r13 = r2
                r9.a(r10, r12, r13)
                long r4 = r1.Q
                long r4 = r4 + r2
                r1.Q = r4
                return r2
            L_0x005e:
                r6 = 0
                sg.b r0 = sg.b.this     // Catch:{ all -> 0x00ec }
                ch.a0 r11 = r0.f23011c     // Catch:{ all -> 0x00ec }
                ch.c r12 = r0.f23012d     // Catch:{ all -> 0x00ec }
                long r13 = r0.f23017i     // Catch:{ all -> 0x00ec }
                long r11 = r11.C0(r12, r13)     // Catch:{ all -> 0x00ec }
                int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r0 != 0) goto L_0x0083
                sg.b r0 = sg.b.this     // Catch:{ all -> 0x00ec }
                r0.a(r7)     // Catch:{ all -> 0x00ec }
                sg.b r2 = sg.b.this
                monitor-enter(r2)
                sg.b r0 = sg.b.this     // Catch:{ all -> 0x0080 }
                r0.f23010b = r6     // Catch:{ all -> 0x0080 }
                r0.notifyAll()     // Catch:{ all -> 0x0080 }
                monitor-exit(r2)     // Catch:{ all -> 0x0080 }
                return r9
            L_0x0080:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0080 }
                throw r0
            L_0x0083:
                long r2 = java.lang.Math.min(r11, r2)     // Catch:{ all -> 0x00ec }
                sg.b r0 = sg.b.this     // Catch:{ all -> 0x00ec }
                ch.c r13 = r0.f23012d     // Catch:{ all -> 0x00ec }
                r15 = 0
                r14 = r22
                r17 = r2
                r13.m(r14, r15, r17)     // Catch:{ all -> 0x00ec }
                long r9 = r1.Q     // Catch:{ all -> 0x00ec }
                long r9 = r9 + r2
                r1.Q = r9     // Catch:{ all -> 0x00ec }
                sg.a r15 = r1.P     // Catch:{ all -> 0x00ec }
                long r16 = r7 + r4
                sg.b r0 = sg.b.this     // Catch:{ all -> 0x00ec }
                ch.c r0 = r0.f23012d     // Catch:{ all -> 0x00ec }
                ch.c r18 = r0.clone()     // Catch:{ all -> 0x00ec }
                r19 = r11
                r15.b(r16, r18, r19)     // Catch:{ all -> 0x00ec }
                sg.b r4 = sg.b.this     // Catch:{ all -> 0x00ec }
                monitor-enter(r4)     // Catch:{ all -> 0x00ec }
                sg.b r0 = sg.b.this     // Catch:{ all -> 0x00e9 }
                ch.c r5 = r0.f23016h     // Catch:{ all -> 0x00e9 }
                ch.c r0 = r0.f23012d     // Catch:{ all -> 0x00e9 }
                r5.d1(r0, r11)     // Catch:{ all -> 0x00e9 }
                sg.b r0 = sg.b.this     // Catch:{ all -> 0x00e9 }
                ch.c r0 = r0.f23016h     // Catch:{ all -> 0x00e9 }
                long r7 = r0.size()     // Catch:{ all -> 0x00e9 }
                sg.b r0 = sg.b.this     // Catch:{ all -> 0x00e9 }
                long r9 = r0.f23017i     // Catch:{ all -> 0x00e9 }
                int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r5 <= 0) goto L_0x00d4
                ch.c r0 = r0.f23016h     // Catch:{ all -> 0x00e9 }
                long r7 = r0.size()     // Catch:{ all -> 0x00e9 }
                sg.b r5 = sg.b.this     // Catch:{ all -> 0x00e9 }
                long r9 = r5.f23017i     // Catch:{ all -> 0x00e9 }
                long r7 = r7 - r9
                r0.skip(r7)     // Catch:{ all -> 0x00e9 }
            L_0x00d4:
                sg.b r5 = sg.b.this     // Catch:{ all -> 0x00e9 }
                long r7 = r5.f23013e     // Catch:{ all -> 0x00e9 }
                long r7 = r7 + r11
                r5.f23013e = r7     // Catch:{ all -> 0x00e9 }
                monitor-exit(r4)     // Catch:{ all -> 0x00e9 }
                monitor-enter(r5)
                sg.b r0 = sg.b.this     // Catch:{ all -> 0x00e6 }
                r0.f23010b = r6     // Catch:{ all -> 0x00e6 }
                r0.notifyAll()     // Catch:{ all -> 0x00e6 }
                monitor-exit(r5)     // Catch:{ all -> 0x00e6 }
                return r2
            L_0x00e6:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x00e6 }
                throw r0
            L_0x00e9:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x00e9 }
                throw r0     // Catch:{ all -> 0x00ec }
            L_0x00ec:
                r0 = move-exception
                sg.b r2 = sg.b.this
                monitor-enter(r2)
                sg.b r3 = sg.b.this     // Catch:{ all -> 0x00f9 }
                r3.f23010b = r6     // Catch:{ all -> 0x00f9 }
                r3.notifyAll()     // Catch:{ all -> 0x00f9 }
                monitor-exit(r2)     // Catch:{ all -> 0x00f9 }
                throw r0
            L_0x00f9:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00f9 }
                throw r0
            L_0x00fc:
                long r7 = r7 - r13
                long r2 = java.lang.Math.min(r2, r7)     // Catch:{ all -> 0x0117 }
                sg.b r0 = sg.b.this     // Catch:{ all -> 0x0117 }
                ch.c r13 = r0.f23016h     // Catch:{ all -> 0x0117 }
                long r5 = r1.Q     // Catch:{ all -> 0x0117 }
                long r15 = r5 - r11
                r14 = r22
                r17 = r2
                r13.m(r14, r15, r17)     // Catch:{ all -> 0x0117 }
                long r5 = r1.Q     // Catch:{ all -> 0x0117 }
                long r5 = r5 + r2
                r1.Q = r5     // Catch:{ all -> 0x0117 }
                monitor-exit(r4)     // Catch:{ all -> 0x0117 }
                return r2
            L_0x0117:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0117 }
                throw r0
            L_0x011a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "closed"
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.b.a.C0(ch.c, long):long");
        }

        public b0 b() {
            return this.O;
        }

        public void close() throws IOException {
            if (this.P != null) {
                RandomAccessFile randomAccessFile = null;
                this.P = null;
                synchronized (b.this) {
                    b bVar = b.this;
                    int i10 = bVar.f23018j - 1;
                    bVar.f23018j = i10;
                    if (i10 == 0) {
                        RandomAccessFile randomAccessFile2 = bVar.f23009a;
                        bVar.f23009a = null;
                        randomAccessFile = randomAccessFile2;
                    }
                }
                if (randomAccessFile != null) {
                    e.g(randomAccessFile);
                }
            }
        }
    }

    public b(RandomAccessFile randomAccessFile, a0 a0Var, long j10, f fVar, long j11) {
        this.f23009a = randomAccessFile;
        this.f23011c = a0Var;
        this.f23014f = a0Var == null;
        this.f23013e = j10;
        this.f23015g = fVar;
        this.f23017i = j11;
    }

    public static b b(File file, a0 a0Var, f fVar, long j10) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        b bVar = new b(randomAccessFile, a0Var, 0, fVar, j10);
        randomAccessFile.setLength(0);
        bVar.g(f23007n, -1, -1);
        return bVar;
    }

    public static b f(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        a aVar = new a(randomAccessFile.getChannel());
        c cVar = new c();
        aVar.a(0, cVar, 32);
        f fVar = f23006m;
        if (cVar.B((long) fVar.R()).equals(fVar)) {
            long readLong = cVar.readLong();
            long readLong2 = cVar.readLong();
            c cVar2 = new c();
            aVar.a(readLong + 32, cVar2, readLong2);
            return new b(randomAccessFile, (a0) null, readLong, cVar2.Q0(), 0);
        }
        throw new IOException("unreadable cache file");
    }

    public void a(long j10) throws IOException {
        h(j10);
        this.f23009a.getChannel().force(false);
        g(f23006m, j10, (long) this.f23015g.R());
        this.f23009a.getChannel().force(false);
        synchronized (this) {
            this.f23014f = true;
        }
        e.g(this.f23011c);
        this.f23011c = null;
    }

    public boolean c() {
        return this.f23009a == null;
    }

    public f d() {
        return this.f23015g;
    }

    public a0 e() {
        synchronized (this) {
            if (this.f23009a == null) {
                return null;
            }
            this.f23018j++;
            return new a();
        }
    }

    public final void g(f fVar, long j10, long j11) throws IOException {
        c cVar = new c();
        cVar.T(fVar);
        cVar.writeLong(j10);
        cVar.writeLong(j11);
        if (cVar.size() == 32) {
            new a(this.f23009a.getChannel()).b(0, cVar, 32);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void h(long j10) throws IOException {
        c cVar = new c();
        cVar.T(this.f23015g);
        new a(this.f23009a.getChannel()).b(32 + j10, cVar, (long) this.f23015g.R());
    }
}
