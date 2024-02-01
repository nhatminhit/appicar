package u7;

import android.net.Uri;
import android.util.Pair;
import d.o0;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import t7.m;
import t7.o;
import u7.a;
import w7.z;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final int f13831a = 131072;

    /* renamed from: b  reason: collision with root package name */
    public static final i f13832b = new k();

    public interface a {
        void a(long j10, long j11, long j12);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a f13833a;

        /* renamed from: b  reason: collision with root package name */
        public long f13834b;

        /* renamed from: c  reason: collision with root package name */
        public long f13835c;

        public b(a aVar) {
            this.f13833a = aVar;
        }

        public void a(long j10, long j11) {
            this.f13834b = j10;
            this.f13835c = j11;
            this.f13833a.a(j10, j11, 0);
        }

        public void b(long j10) {
            long j11 = this.f13835c + j10;
            this.f13835c = j11;
            this.f13833a.a(this.f13834b, j11, j10);
        }

        public void c(long j10) {
            if (this.f13834b == -1 && j10 != -1) {
                this.f13834b = j10;
                this.f13833a.a(j10, this.f13835c, 0);
            }
        }
    }

    public static String b(o oVar, @o0 i iVar) {
        if (iVar == null) {
            iVar = f13832b;
        }
        return iVar.a(oVar);
    }

    public static void c(o oVar, a aVar, @o0 i iVar, t7.l lVar, @o0 a aVar2, @o0 AtomicBoolean atomicBoolean) throws IOException, InterruptedException {
        d(oVar, aVar, iVar, new d(aVar, lVar), new byte[131072], (z) null, 0, aVar2, atomicBoolean, false);
    }

    public static void d(o oVar, a aVar, @o0 i iVar, d dVar, byte[] bArr, z zVar, int i10, @o0 a aVar2, @o0 AtomicBoolean atomicBoolean, boolean z10) throws IOException, InterruptedException {
        b bVar;
        long j10;
        o oVar2 = oVar;
        a aVar3 = aVar2;
        w7.a.g(dVar);
        w7.a.g(bArr);
        String b10 = b(oVar2, iVar);
        if (aVar3 != null) {
            bVar = new b(aVar3);
            Pair<Long, Long> f10 = f(oVar, aVar, iVar);
            bVar.a(((Long) f10.first).longValue(), ((Long) f10.second).longValue());
            j10 = ((Long) f10.first).longValue();
            a aVar4 = aVar;
        } else {
            j10 = g(oVar2, aVar, b10);
            bVar = null;
        }
        b bVar2 = bVar;
        long j11 = oVar2.f13134e;
        boolean z11 = j10 == -1;
        long j12 = j10;
        long j13 = j11;
        while (j12 != 0) {
            m(atomicBoolean);
            long g10 = aVar.g(b10, j13, z11 ? Long.MAX_VALUE : j12);
            if (g10 <= 0) {
                long j14 = -g10;
                long j15 = j14 == Long.MAX_VALUE ? -1 : j14;
                long j16 = j14;
                if (j(oVar, j13, j15, dVar, bArr, zVar, i10, bVar2, j15 == j12, atomicBoolean) >= j16) {
                    g10 = j16;
                } else if (z10 && !z11) {
                    throw new EOFException();
                } else {
                    return;
                }
            }
            j13 += g10;
            if (!z11) {
                j12 -= g10;
            }
        }
    }

    public static String e(Uri uri) {
        return uri.toString();
    }

    public static Pair<Long, Long> f(o oVar, a aVar, @o0 i iVar) {
        o oVar2 = oVar;
        String b10 = b(oVar2, iVar);
        long j10 = oVar2.f13134e;
        long g10 = g(oVar2, aVar, b10);
        long j11 = j10;
        long j12 = g10;
        long j13 = 0;
        while (j12 != 0) {
            int i10 = (j12 > -1 ? 1 : (j12 == -1 ? 0 : -1));
            long g11 = aVar.g(b10, j11, i10 != 0 ? j12 : Long.MAX_VALUE);
            if (g11 <= 0) {
                g11 = -g11;
                if (g11 == Long.MAX_VALUE) {
                    break;
                }
            } else {
                j13 += g11;
            }
            j11 += g11;
            if (i10 == 0) {
                g11 = 0;
            }
            j12 -= g11;
        }
        return Pair.create(Long.valueOf(g10), Long.valueOf(j13));
    }

    public static long g(o oVar, a aVar, String str) {
        long j10 = oVar.f13136g;
        if (j10 != -1) {
            return j10;
        }
        long a10 = p.a(aVar.d(str));
        if (a10 == -1) {
            return -1;
        }
        return a10 - oVar.f13134e;
    }

    public static boolean h(IOException iOException) {
        Throwable th2;
        while (th2 != null) {
            if ((th2 instanceof m) && ((m) th2).O == 0) {
                return true;
            }
            Throwable cause = th2.getCause();
            th2 = iOException;
            th2 = cause;
        }
        return false;
    }

    public static /* synthetic */ String i(o oVar) {
        String str = oVar.f13137h;
        return str != null ? str : e(oVar.f13130a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        r14 = r7;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0083, code lost:
        w7.q0.r(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0086, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[ExcHandler: all (r0v12 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:10:0x0025] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long j(t7.o r16, long r17, long r19, t7.l r21, byte[] r22, w7.z r23, int r24, @d.o0 u7.l.b r25, boolean r26, java.util.concurrent.atomic.AtomicBoolean r27) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r1 = r16
            r2 = r21
            r3 = r22
            r4 = r25
            long r5 = r1.f13134e
            long r5 = r17 - r5
            r7 = -1
            int r0 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0015
            long r9 = r5 + r19
            goto L_0x0016
        L_0x0015:
            r9 = r7
        L_0x0016:
            r11 = r5
        L_0x0017:
            if (r23 == 0) goto L_0x001c
            r23.b(r24)
        L_0x001c:
            m(r27)
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r13 == 0) goto L_0x003f
            long r14 = r9 - r11
            t7.o r0 = r1.e(r11, r14)     // Catch:{ IOException -> 0x0031, all -> 0x002f }
            long r14 = r2.a(r0)     // Catch:{ IOException -> 0x0031, all -> 0x002f }
            r0 = 1
            goto L_0x0041
        L_0x002f:
            r0 = move-exception
            goto L_0x0083
        L_0x0031:
            r0 = move-exception
            if (r26 == 0) goto L_0x003e
            boolean r14 = h(r0)     // Catch:{ a -> 0x0087, all -> 0x002f }
            if (r14 == 0) goto L_0x003e
            w7.q0.r(r21)     // Catch:{ a -> 0x0087, all -> 0x002f }
            goto L_0x003f
        L_0x003e:
            throw r0     // Catch:{ a -> 0x0087, all -> 0x002f }
        L_0x003f:
            r14 = r7
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x004b
            t7.o r0 = r1.e(r11, r7)     // Catch:{ a -> 0x0087, all -> 0x002f }
            long r14 = r2.a(r0)     // Catch:{ a -> 0x0087, all -> 0x002f }
        L_0x004b:
            if (r26 == 0) goto L_0x0057
            if (r4 == 0) goto L_0x0057
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0057
            long r14 = r14 + r11
            r4.c(r14)     // Catch:{ a -> 0x0087, all -> 0x002f }
        L_0x0057:
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x008d
            m(r27)     // Catch:{ a -> 0x0087, all -> 0x002f }
            if (r13 == 0) goto L_0x006a
            int r0 = r3.length     // Catch:{ a -> 0x0087, all -> 0x002f }
            long r14 = (long) r0     // Catch:{ a -> 0x0087, all -> 0x002f }
            long r7 = r9 - r11
            long r7 = java.lang.Math.min(r14, r7)     // Catch:{ a -> 0x0087, all -> 0x002f }
            int r0 = (int) r7     // Catch:{ a -> 0x0087, all -> 0x002f }
            goto L_0x006b
        L_0x006a:
            int r0 = r3.length     // Catch:{ a -> 0x0087, all -> 0x002f }
        L_0x006b:
            r7 = 0
            int r0 = r2.read(r3, r7, r0)     // Catch:{ a -> 0x0087, all -> 0x002f }
            r8 = -1
            if (r0 != r8) goto L_0x0079
            if (r4 == 0) goto L_0x008d
            r4.c(r11)     // Catch:{ a -> 0x0087, all -> 0x002f }
            goto L_0x008d
        L_0x0079:
            long r14 = (long) r0     // Catch:{ a -> 0x0087, all -> 0x002f }
            long r11 = r11 + r14
            if (r4 == 0) goto L_0x0080
            r4.b(r14)     // Catch:{ a -> 0x0087, all -> 0x002f }
        L_0x0080:
            r7 = -1
            goto L_0x0057
        L_0x0083:
            w7.q0.r(r21)
            throw r0
        L_0x0087:
            w7.q0.r(r21)
            r7 = -1
            goto L_0x0017
        L_0x008d:
            long r11 = r11 - r5
            w7.q0.r(r21)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.l.j(t7.o, long, long, t7.l, byte[], w7.z, int, u7.l$b, boolean, java.util.concurrent.atomic.AtomicBoolean):long");
    }

    public static void k(o oVar, a aVar, @o0 i iVar) {
        l(aVar, b(oVar, iVar));
    }

    public static void l(a aVar, String str) {
        for (j m10 : aVar.q(str)) {
            try {
                aVar.m(m10);
            } catch (a.C0232a unused) {
            }
        }
    }

    public static void m(AtomicBoolean atomicBoolean) throws InterruptedException {
        if (Thread.interrupted() || (atomicBoolean != null && atomicBoolean.get())) {
            throw new InterruptedException();
        }
    }
}
