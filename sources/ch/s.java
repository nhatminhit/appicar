package ch;

import java.io.IOException;
import javax.annotation.Nullable;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final long f16516a;

    /* renamed from: b  reason: collision with root package name */
    public final c f16517b = new c();

    /* renamed from: c  reason: collision with root package name */
    public boolean f16518c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16519d;

    /* renamed from: e  reason: collision with root package name */
    public final z f16520e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final a0 f16521f = new b();
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public z f16522g;

    public final class a implements z {
        public final t O = new t();

        public a() {
        }

        public b0 b() {
            return this.O;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
            r5.O.m(r1.b());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
            r5.O.l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r5 = this;
                ch.s r0 = ch.s.this
                ch.c r0 = r0.f16517b
                monitor-enter(r0)
                ch.s r1 = ch.s.this     // Catch:{ all -> 0x005d }
                boolean r2 = r1.f16518c     // Catch:{ all -> 0x005d }
                if (r2 == 0) goto L_0x000d
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                return
            L_0x000d:
                ch.z r1 = r1.f16522g     // Catch:{ all -> 0x005d }
                if (r1 == 0) goto L_0x001a
                ch.s r1 = ch.s.this     // Catch:{ all -> 0x005d }
                ch.z r1 = r1.f16522g     // Catch:{ all -> 0x005d }
                goto L_0x0040
            L_0x001a:
                ch.s r1 = ch.s.this     // Catch:{ all -> 0x005d }
                boolean r2 = r1.f16519d     // Catch:{ all -> 0x005d }
                if (r2 == 0) goto L_0x0035
                ch.c r1 = r1.f16517b     // Catch:{ all -> 0x005d }
                long r1 = r1.size()     // Catch:{ all -> 0x005d }
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 > 0) goto L_0x002d
                goto L_0x0035
            L_0x002d:
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x005d }
                java.lang.String r2 = "source is closed"
                r1.<init>(r2)     // Catch:{ all -> 0x005d }
                throw r1     // Catch:{ all -> 0x005d }
            L_0x0035:
                ch.s r1 = ch.s.this     // Catch:{ all -> 0x005d }
                r2 = 1
                r1.f16518c = r2     // Catch:{ all -> 0x005d }
                ch.c r1 = r1.f16517b     // Catch:{ all -> 0x005d }
                r1.notifyAll()     // Catch:{ all -> 0x005d }
                r1 = 0
            L_0x0040:
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                if (r1 == 0) goto L_0x005c
                ch.t r0 = r5.O
                ch.b0 r2 = r1.b()
                r0.m(r2)
                r1.close()     // Catch:{ all -> 0x0055 }
                ch.t r0 = r5.O
                r0.l()
                goto L_0x005c
            L_0x0055:
                r0 = move-exception
                ch.t r1 = r5.O
                r1.l()
                throw r0
            L_0x005c:
                return
            L_0x005d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.s.a.close():void");
        }

        public void d1(c cVar, long j10) throws IOException {
            z zVar;
            synchronized (s.this.f16517b) {
                if (!s.this.f16518c) {
                    while (true) {
                        if (j10 <= 0) {
                            zVar = null;
                            break;
                        } else if (s.this.f16522g != null) {
                            zVar = s.this.f16522g;
                            break;
                        } else {
                            s sVar = s.this;
                            if (!sVar.f16519d) {
                                long size = sVar.f16516a - sVar.f16517b.size();
                                if (size == 0) {
                                    this.O.k(s.this.f16517b);
                                } else {
                                    long min = Math.min(size, j10);
                                    s.this.f16517b.d1(cVar, min);
                                    j10 -= min;
                                    s.this.f16517b.notifyAll();
                                }
                            } else {
                                throw new IOException("source is closed");
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("closed");
                }
            }
            if (zVar != null) {
                this.O.m(zVar.b());
                try {
                    zVar.d1(cVar, j10);
                } finally {
                    this.O.l();
                }
            }
        }

        public void flush() throws IOException {
            z zVar;
            synchronized (s.this.f16517b) {
                s sVar = s.this;
                if (sVar.f16518c) {
                    throw new IllegalStateException("closed");
                } else if (sVar.f16522g != null) {
                    zVar = s.this.f16522g;
                } else {
                    s sVar2 = s.this;
                    if (sVar2.f16519d) {
                        if (sVar2.f16517b.size() > 0) {
                            throw new IOException("source is closed");
                        }
                    }
                    zVar = null;
                }
            }
            if (zVar != null) {
                this.O.m(zVar.b());
                try {
                    zVar.flush();
                } finally {
                    this.O.l();
                }
            }
        }
    }

    public final class b implements a0 {
        public final b0 O = new b0();

        public b() {
        }

        public long C0(c cVar, long j10) throws IOException {
            synchronized (s.this.f16517b) {
                if (!s.this.f16519d) {
                    while (s.this.f16517b.size() == 0) {
                        s sVar = s.this;
                        if (sVar.f16518c) {
                            return -1;
                        }
                        this.O.k(sVar.f16517b);
                    }
                    long C0 = s.this.f16517b.C0(cVar, j10);
                    s.this.f16517b.notifyAll();
                    return C0;
                }
                throw new IllegalStateException("closed");
            }
        }

        public b0 b() {
            return this.O;
        }

        public void close() throws IOException {
            synchronized (s.this.f16517b) {
                s sVar = s.this;
                sVar.f16519d = true;
                sVar.f16517b.notifyAll();
            }
        }
    }

    public s(long j10) {
        if (j10 >= 1) {
            this.f16516a = j10;
            return;
        }
        throw new IllegalArgumentException("maxBufferSize < 1: " + j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        monitor-enter(r6.f16517b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r6.f16519d = true;
        r6.f16517b.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(ch.z r7) throws java.io.IOException {
        /*
            r6 = this;
        L_0x0000:
            ch.c r0 = r6.f16517b
            monitor-enter(r0)
            ch.z r1 = r6.f16522g     // Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0041
            ch.c r1 = r6.f16517b     // Catch:{ all -> 0x0049 }
            boolean r1 = r1.X()     // Catch:{ all -> 0x0049 }
            r2 = 1
            if (r1 == 0) goto L_0x0016
            r6.f16519d = r2     // Catch:{ all -> 0x0049 }
            r6.f16522g = r7     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0016:
            ch.c r1 = new ch.c     // Catch:{ all -> 0x0049 }
            r1.<init>()     // Catch:{ all -> 0x0049 }
            ch.c r3 = r6.f16517b     // Catch:{ all -> 0x0049 }
            long r4 = r3.P     // Catch:{ all -> 0x0049 }
            r1.d1(r3, r4)     // Catch:{ all -> 0x0049 }
            ch.c r3 = r6.f16517b     // Catch:{ all -> 0x0049 }
            r3.notifyAll()     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            long r3 = r1.P     // Catch:{ all -> 0x0031 }
            r7.d1(r1, r3)     // Catch:{ all -> 0x0031 }
            r7.flush()     // Catch:{ all -> 0x0031 }
            goto L_0x0000
        L_0x0031:
            r7 = move-exception
            ch.c r1 = r6.f16517b
            monitor-enter(r1)
            r6.f16519d = r2     // Catch:{ all -> 0x003e }
            ch.c r0 = r6.f16517b     // Catch:{ all -> 0x003e }
            r0.notifyAll()     // Catch:{ all -> 0x003e }
            monitor-exit(r1)     // Catch:{ all -> 0x003e }
            throw r7
        L_0x003e:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003e }
            throw r7
        L_0x0041:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "sink already folded"
            r7.<init>(r1)     // Catch:{ all -> 0x0049 }
            throw r7     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.s.b(ch.z):void");
    }

    public final z c() {
        return this.f16520e;
    }

    public final a0 d() {
        return this.f16521f;
    }
}
