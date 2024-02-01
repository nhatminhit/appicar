package d6;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import b6.l0;
import d.o0;
import d6.l;
import d6.u;
import d6.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import w7.p;
import w7.q0;

public final class a0 implements u {
    public static final long T = 250000;
    public static final long U = 750000;
    public static final long V = 250000;
    public static final int W = 4;
    public static final int X = 2;
    public static final int Y = -2;
    public static final int Z = 0;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f6198a0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f6199b0 = 1;
    @SuppressLint({"InlinedApi"})

    /* renamed from: c0  reason: collision with root package name */
    public static final int f6200c0 = 1;

    /* renamed from: d0  reason: collision with root package name */
    public static final String f6201d0 = "AudioTrack";

    /* renamed from: e0  reason: collision with root package name */
    public static final int f6202e0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f6203f0 = 1;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f6204g0 = 2;

    /* renamed from: h0  reason: collision with root package name */
    public static boolean f6205h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public static boolean f6206i0 = false;
    public long A;
    public int B;
    public int C;
    public long D;
    public float E;
    public l[] F;
    public ByteBuffer[] G;
    @o0
    public ByteBuffer H;
    @o0
    public ByteBuffer I;
    public byte[] J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public x Q;
    public boolean R;
    public long S;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final d f6207b;

    /* renamed from: c  reason: collision with root package name */
    public final c f6208c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6209d;

    /* renamed from: e  reason: collision with root package name */
    public final z f6210e;

    /* renamed from: f  reason: collision with root package name */
    public final k0 f6211f;

    /* renamed from: g  reason: collision with root package name */
    public final l[] f6212g;

    /* renamed from: h  reason: collision with root package name */
    public final l[] f6213h;

    /* renamed from: i  reason: collision with root package name */
    public final ConditionVariable f6214i;

    /* renamed from: j  reason: collision with root package name */
    public final w f6215j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayDeque<g> f6216k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public u.c f6217l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public AudioTrack f6218m;
    @o0

    /* renamed from: n  reason: collision with root package name */
    public d f6219n;

    /* renamed from: o  reason: collision with root package name */
    public d f6220o;

    /* renamed from: p  reason: collision with root package name */
    public AudioTrack f6221p;

    /* renamed from: q  reason: collision with root package name */
    public c f6222q;
    @o0

    /* renamed from: r  reason: collision with root package name */
    public l0 f6223r;

    /* renamed from: s  reason: collision with root package name */
    public l0 f6224s;

    /* renamed from: t  reason: collision with root package name */
    public long f6225t;

    /* renamed from: u  reason: collision with root package name */
    public long f6226u;
    @o0

    /* renamed from: v  reason: collision with root package name */
    public ByteBuffer f6227v;

    /* renamed from: w  reason: collision with root package name */
    public int f6228w;

    /* renamed from: x  reason: collision with root package name */
    public long f6229x;

    /* renamed from: y  reason: collision with root package name */
    public long f6230y;

    /* renamed from: z  reason: collision with root package name */
    public long f6231z;

    public class a extends Thread {
        public final /* synthetic */ AudioTrack O;

        public a(AudioTrack audioTrack) {
            this.O = audioTrack;
        }

        public void run() {
            try {
                this.O.flush();
                this.O.release();
            } finally {
                a0.this.f6214i.open();
            }
        }
    }

    public class b extends Thread {
        public final /* synthetic */ AudioTrack O;

        public b(AudioTrack audioTrack) {
            this.O = audioTrack;
        }

        public void run() {
            this.O.release();
        }
    }

    public interface c {
        long a(long j10);

        l0 b(l0 l0Var);

        long c();

        l[] d();
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f6232a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6233b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6234c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6235d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6236e;

        /* renamed from: f  reason: collision with root package name */
        public final int f6237f;

        /* renamed from: g  reason: collision with root package name */
        public final int f6238g;

        /* renamed from: h  reason: collision with root package name */
        public final int f6239h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f6240i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f6241j;

        /* renamed from: k  reason: collision with root package name */
        public final l[] f6242k;

        public d(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, boolean z12, l[] lVarArr) {
            this.f6232a = z10;
            this.f6233b = i10;
            this.f6234c = i11;
            this.f6235d = i12;
            this.f6236e = i13;
            this.f6237f = i14;
            this.f6238g = i15;
            this.f6239h = i16 == 0 ? f() : i16;
            this.f6240i = z11;
            this.f6241j = z12;
            this.f6242k = lVarArr;
        }

        public AudioTrack a(boolean z10, c cVar, int i10) throws u.b {
            AudioTrack audioTrack;
            if (q0.f14786a >= 21) {
                audioTrack = c(z10, cVar, i10);
            } else {
                int e02 = q0.e0(cVar.f6274c);
                int i11 = this.f6236e;
                int i12 = this.f6237f;
                int i13 = this.f6238g;
                int i14 = this.f6239h;
                if (i10 != 0) {
                    audioTrack = new AudioTrack(e02, i11, i12, i13, i14, 1, i10);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new u.b(state, this.f6236e, this.f6237f, this.f6239h);
        }

        public boolean b(d dVar) {
            return dVar.f6238g == this.f6238g && dVar.f6236e == this.f6236e && dVar.f6237f == this.f6237f;
        }

        @TargetApi(21)
        public final AudioTrack c(boolean z10, c cVar, int i10) {
            AudioAttributes build = z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : cVar.a();
            AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.f6237f).setEncoding(this.f6238g).setSampleRate(this.f6236e).build();
            int i11 = this.f6239h;
            if (i10 == 0) {
                i10 = 0;
            }
            return new AudioTrack(build, build2, i11, 1, i10);
        }

        public long d(long j10) {
            return (j10 * ((long) this.f6236e)) / 1000000;
        }

        public long e(long j10) {
            return (j10 * 1000000) / ((long) this.f6236e);
        }

        public final int f() {
            if (this.f6232a) {
                int minBufferSize = AudioTrack.getMinBufferSize(this.f6236e, this.f6237f, this.f6238g);
                w7.a.i(minBufferSize != -2);
                return q0.u(minBufferSize * 4, ((int) d(250000)) * this.f6235d, (int) Math.max((long) minBufferSize, d(a0.U) * ((long) this.f6235d)));
            }
            int t10 = a0.F(this.f6238g);
            if (this.f6238g == 5) {
                t10 *= 2;
            }
            return (int) ((((long) t10) * 250000) / 1000000);
        }

        public long g(long j10) {
            return (j10 * 1000000) / ((long) this.f6234c);
        }
    }

    public static class e implements c {

        /* renamed from: a  reason: collision with root package name */
        public final l[] f6243a;

        /* renamed from: b  reason: collision with root package name */
        public final f0 f6244b;

        /* renamed from: c  reason: collision with root package name */
        public final i0 f6245c;

        public e(l... lVarArr) {
            l[] lVarArr2 = (l[]) Arrays.copyOf(lVarArr, lVarArr.length + 2);
            this.f6243a = lVarArr2;
            f0 f0Var = new f0();
            this.f6244b = f0Var;
            i0 i0Var = new i0();
            this.f6245c = i0Var;
            lVarArr2[lVarArr.length] = f0Var;
            lVarArr2[lVarArr.length + 1] = i0Var;
        }

        public long a(long j10) {
            return this.f6245c.j(j10);
        }

        public l0 b(l0 l0Var) {
            this.f6244b.y(l0Var.f4404c);
            return new l0(this.f6245c.m(l0Var.f4402a), this.f6245c.l(l0Var.f4403b), l0Var.f4404c);
        }

        public long c() {
            return this.f6244b.s();
        }

        public l[] d() {
            return this.f6243a;
        }
    }

    public static final class f extends RuntimeException {
        public f(String str) {
            super(str);
        }

        public /* synthetic */ f(String str, a aVar) {
            this(str);
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final l0 f6246a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6247b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6248c;

        public g(l0 l0Var, long j10, long j11) {
            this.f6246a = l0Var;
            this.f6247b = j10;
            this.f6248c = j11;
        }

        public /* synthetic */ g(l0 l0Var, long j10, long j11, a aVar) {
            this(l0Var, j10, j11);
        }
    }

    public final class h implements w.a {
        public h() {
        }

        public /* synthetic */ h(a0 a0Var, a aVar) {
            this();
        }

        public void a(int i10, long j10) {
            if (a0.this.f6217l != null) {
                a0.this.f6217l.b(i10, j10, SystemClock.elapsedRealtime() - a0.this.S);
            }
        }

        public void b(long j10) {
            p.l(a0.f6201d0, "Ignoring impossibly large audio latency: " + j10);
        }

        public void c(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + a0.this.G() + ", " + a0.this.H();
            if (!a0.f6206i0) {
                p.l(a0.f6201d0, str);
                return;
            }
            throw new f(str, (a) null);
        }

        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + a0.this.G() + ", " + a0.this.H();
            if (!a0.f6206i0) {
                p.l(a0.f6201d0, str);
                return;
            }
            throw new f(str, (a) null);
        }
    }

    public a0(@o0 d dVar, c cVar, boolean z10) {
        this.f6207b = dVar;
        this.f6208c = (c) w7.a.g(cVar);
        this.f6209d = z10;
        this.f6214i = new ConditionVariable(true);
        this.f6215j = new w(new h(this, (a) null));
        z zVar = new z();
        this.f6210e = zVar;
        k0 k0Var = new k0();
        this.f6211f = k0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new y[]{new e0(), zVar, k0Var});
        Collections.addAll(arrayList, cVar.d());
        this.f6212g = (l[]) arrayList.toArray(new l[0]);
        this.f6213h = new l[]{new c0()};
        this.E = 1.0f;
        this.C = 0;
        this.f6222q = c.f6271e;
        this.P = 0;
        this.Q = new x(0, 0.0f);
        this.f6224s = l0.f4401e;
        this.L = -1;
        this.F = new l[0];
        this.G = new ByteBuffer[0];
        this.f6216k = new ArrayDeque<>();
    }

    public a0(@o0 d dVar, l[] lVarArr) {
        this(dVar, lVarArr, false);
    }

    public a0(@o0 d dVar, l[] lVarArr, boolean z10) {
        this(dVar, (c) new e(lVarArr), z10);
    }

    public static int D(int i10, boolean z10) {
        int i11 = q0.f14786a;
        if (i11 <= 28 && !z10) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(q0.f14787b) && !z10 && i10 == 1) {
            i10 = 2;
        }
        return q0.I(i10);
    }

    public static int E(int i10, ByteBuffer byteBuffer) {
        if (i10 == 7 || i10 == 8) {
            return b0.e(byteBuffer);
        }
        if (i10 == 5) {
            return a.b();
        }
        if (i10 == 6 || i10 == 18) {
            return a.h(byteBuffer);
        }
        if (i10 == 17) {
            return b.c(byteBuffer);
        }
        if (i10 == 14) {
            int a10 = a.a(byteBuffer);
            if (a10 == -1) {
                return 0;
            }
            return a.i(byteBuffer, a10) * 16;
        }
        throw new IllegalStateException("Unexpected audio encoding: " + i10);
    }

    public static int F(int i10) {
        if (i10 == 5) {
            return 80000;
        }
        if (i10 == 6) {
            return 768000;
        }
        if (i10 == 7) {
            return 192000;
        }
        if (i10 == 8) {
            return 2250000;
        }
        if (i10 == 14) {
            return 3062500;
        }
        if (i10 == 17) {
            return 336000;
        }
        if (i10 == 18) {
            return 768000;
        }
        throw new IllegalArgumentException();
    }

    public static AudioTrack J(int i10) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
    }

    @TargetApi(21)
    public static void P(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    public static void Q(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    @TargetApi(21)
    public static int T(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    public final long A(long j10) {
        long j11;
        long V2;
        g gVar = null;
        while (!this.f6216k.isEmpty() && j10 >= this.f6216k.getFirst().f6248c) {
            gVar = this.f6216k.remove();
        }
        if (gVar != null) {
            this.f6224s = gVar.f6246a;
            this.f6226u = gVar.f6248c;
            this.f6225t = gVar.f6247b - this.D;
        }
        if (this.f6224s.f4402a == 1.0f) {
            return (j10 + this.f6225t) - this.f6226u;
        }
        if (this.f6216k.isEmpty()) {
            j11 = this.f6225t;
            V2 = this.f6208c.a(j10 - this.f6226u);
        } else {
            j11 = this.f6225t;
            V2 = q0.V(j10 - this.f6226u, this.f6224s.f4402a);
        }
        return j11 + V2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B() throws d6.u.d {
        /*
            r9 = this;
            int r0 = r9.L
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0016
            d6.a0$d r0 = r9.f6220o
            boolean r0 = r0.f6240i
            if (r0 == 0) goto L_0x000f
            r0 = r3
            goto L_0x0012
        L_0x000f:
            d6.l[] r0 = r9.F
            int r0 = r0.length
        L_0x0012:
            r9.L = r0
            r0 = r2
            goto L_0x0017
        L_0x0016:
            r0 = r3
        L_0x0017:
            int r4 = r9.L
            d6.l[] r5 = r9.F
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x002a
            r4.h()
        L_0x002a:
            r9.M(r7)
            boolean r0 = r4.a()
            if (r0 != 0) goto L_0x0034
            return r3
        L_0x0034:
            int r0 = r9.L
            int r0 = r0 + r2
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.I
            if (r0 == 0) goto L_0x0044
            r9.S(r0, r7)
            java.nio.ByteBuffer r0 = r9.I
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.L = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.a0.B():boolean");
    }

    public final void C() {
        int i10 = 0;
        while (true) {
            l[] lVarArr = this.F;
            if (i10 < lVarArr.length) {
                l lVar = lVarArr[i10];
                lVar.flush();
                this.G[i10] = lVar.b();
                i10++;
            } else {
                return;
            }
        }
    }

    public final long G() {
        d dVar = this.f6220o;
        return dVar.f6232a ? this.f6229x / ((long) dVar.f6233b) : this.f6230y;
    }

    public final long H() {
        d dVar = this.f6220o;
        return dVar.f6232a ? this.f6231z / ((long) dVar.f6235d) : this.A;
    }

    public final void I(long j10) throws u.b {
        this.f6214i.block();
        AudioTrack a10 = ((d) w7.a.g(this.f6220o)).a(this.R, this.f6222q, this.P);
        this.f6221p = a10;
        int audioSessionId = a10.getAudioSessionId();
        if (f6205h0 && q0.f14786a < 21) {
            AudioTrack audioTrack = this.f6218m;
            if (!(audioTrack == null || audioSessionId == audioTrack.getAudioSessionId())) {
                N();
            }
            if (this.f6218m == null) {
                this.f6218m = J(audioSessionId);
            }
        }
        if (this.P != audioSessionId) {
            this.P = audioSessionId;
            u.c cVar = this.f6217l;
            if (cVar != null) {
                cVar.a(audioSessionId);
            }
        }
        y(this.f6224s, j10);
        w wVar = this.f6215j;
        AudioTrack audioTrack2 = this.f6221p;
        d dVar = this.f6220o;
        wVar.s(audioTrack2, dVar.f6238g, dVar.f6235d, dVar.f6239h);
        O();
        int i10 = this.Q.f6494a;
        if (i10 != 0) {
            this.f6221p.attachAuxEffect(i10);
            this.f6221p.setAuxEffectSendLevel(this.Q.f6495b);
        }
    }

    public final boolean K() {
        return this.f6221p != null;
    }

    public final void L() {
        if (!this.N) {
            this.N = true;
            this.f6215j.g(H());
            this.f6221p.stop();
            this.f6228w = 0;
        }
    }

    public final void M(long j10) throws u.d {
        ByteBuffer byteBuffer;
        int length = this.F.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.G[i10 - 1];
            } else {
                byteBuffer = this.H;
                if (byteBuffer == null) {
                    byteBuffer = l.f6434a;
                }
            }
            if (i10 == length) {
                S(byteBuffer, j10);
            } else {
                l lVar = this.F[i10];
                lVar.d(byteBuffer);
                ByteBuffer b10 = lVar.b();
                this.G[i10] = b10;
                if (b10.hasRemaining()) {
                    i10++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i10--;
            } else {
                return;
            }
        }
    }

    public final void N() {
        AudioTrack audioTrack = this.f6218m;
        if (audioTrack != null) {
            this.f6218m = null;
            new b(audioTrack).start();
        }
    }

    public final void O() {
        if (K()) {
            if (q0.f14786a >= 21) {
                P(this.f6221p, this.E);
            } else {
                Q(this.f6221p, this.E);
            }
        }
    }

    public final void R() {
        l[] lVarArr = this.f6220o.f6242k;
        ArrayList arrayList = new ArrayList();
        for (l lVar : lVarArr) {
            if (lVar.c()) {
                arrayList.add(lVar);
            } else {
                lVar.flush();
            }
        }
        int size = arrayList.size();
        this.F = (l[]) arrayList.toArray(new l[size]);
        this.G = new ByteBuffer[size];
        C();
    }

    public final void S(ByteBuffer byteBuffer, long j10) throws u.d {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.I;
            boolean z10 = true;
            int i10 = 0;
            if (byteBuffer2 != null) {
                w7.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.I = byteBuffer;
                if (q0.f14786a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.J;
                    if (bArr == null || bArr.length < remaining) {
                        this.J = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.J, 0, remaining);
                    byteBuffer.position(position);
                    this.K = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (q0.f14786a < 21) {
                int c10 = this.f6215j.c(this.f6231z);
                if (c10 > 0 && (i10 = this.f6221p.write(this.J, this.K, Math.min(remaining2, c10))) > 0) {
                    this.K += i10;
                    byteBuffer.position(byteBuffer.position() + i10);
                }
            } else if (this.R) {
                if (j10 == b6.c.f4201b) {
                    z10 = false;
                }
                w7.a.i(z10);
                i10 = U(this.f6221p, byteBuffer, remaining2, j10);
            } else {
                i10 = T(this.f6221p, byteBuffer, remaining2);
            }
            this.S = SystemClock.elapsedRealtime();
            if (i10 >= 0) {
                boolean z11 = this.f6220o.f6232a;
                if (z11) {
                    this.f6231z += (long) i10;
                }
                if (i10 == remaining2) {
                    if (!z11) {
                        this.A += (long) this.B;
                    }
                    this.I = null;
                    return;
                }
                return;
            }
            throw new u.d(i10);
        }
    }

    @TargetApi(21)
    public final int U(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (q0.f14786a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f6227v == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f6227v = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f6227v.putInt(1431633921);
        }
        if (this.f6228w == 0) {
            this.f6227v.putInt(4, i10);
            this.f6227v.putLong(8, j10 * 1000);
            this.f6227v.position(0);
            this.f6228w = i10;
        }
        int remaining = this.f6227v.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f6227v, remaining, 1);
            if (write < 0) {
                this.f6228w = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int T2 = T(audioTrack, byteBuffer, i10);
        if (T2 < 0) {
            this.f6228w = 0;
            return T2;
        }
        this.f6228w -= T2;
        return T2;
    }

    public boolean a() {
        return !K() || (this.M && !k());
    }

    public void b(c cVar) {
        if (!this.f6222q.equals(cVar)) {
            this.f6222q = cVar;
            if (!this.R) {
                flush();
                this.P = 0;
            }
        }
    }

    public l0 c(l0 l0Var) {
        d dVar = this.f6220o;
        if (dVar == null || dVar.f6241j) {
            l0 l0Var2 = this.f6223r;
            if (l0Var2 == null) {
                l0Var2 = !this.f6216k.isEmpty() ? this.f6216k.getLast().f6246a : this.f6224s;
            }
            if (!l0Var.equals(l0Var2)) {
                if (K()) {
                    this.f6223r = l0Var;
                } else {
                    this.f6224s = l0Var;
                }
            }
            return this.f6224s;
        }
        l0 l0Var3 = l0.f4401e;
        this.f6224s = l0Var3;
        return l0Var3;
    }

    public l0 d() {
        return this.f6224s;
    }

    public boolean e(int i10, int i11) {
        if (q0.s0(i11)) {
            return i11 != 4 || q0.f14786a >= 21;
        }
        d dVar = this.f6207b;
        return dVar != null && dVar.f(i11) && (i10 == -1 || i10 <= this.f6207b.e());
    }

    public void f() {
        this.O = true;
        if (K()) {
            this.f6215j.t();
            this.f6221p.play();
        }
    }

    public void flush() {
        if (K()) {
            this.f6229x = 0;
            this.f6230y = 0;
            this.f6231z = 0;
            this.A = 0;
            this.B = 0;
            l0 l0Var = this.f6223r;
            if (l0Var != null) {
                this.f6224s = l0Var;
                this.f6223r = null;
            } else if (!this.f6216k.isEmpty()) {
                this.f6224s = this.f6216k.getLast().f6246a;
            }
            this.f6216k.clear();
            this.f6225t = 0;
            this.f6226u = 0;
            this.f6211f.q();
            C();
            this.H = null;
            this.I = null;
            this.N = false;
            this.M = false;
            this.L = -1;
            this.f6227v = null;
            this.f6228w = 0;
            this.C = 0;
            if (this.f6215j.i()) {
                this.f6221p.pause();
            }
            AudioTrack audioTrack = this.f6221p;
            this.f6221p = null;
            d dVar = this.f6219n;
            if (dVar != null) {
                this.f6220o = dVar;
                this.f6219n = null;
            }
            this.f6215j.q();
            this.f6214i.close();
            new a(audioTrack).start();
        }
    }

    public void g(float f10) {
        if (this.E != f10) {
            this.E = f10;
            O();
        }
    }

    public void h(x xVar) {
        if (!this.Q.equals(xVar)) {
            int i10 = xVar.f6494a;
            float f10 = xVar.f6495b;
            AudioTrack audioTrack = this.f6221p;
            if (audioTrack != null) {
                if (this.Q.f6494a != i10) {
                    audioTrack.attachAuxEffect(i10);
                }
                if (i10 != 0) {
                    this.f6221p.setAuxEffectSendLevel(f10);
                }
            }
            this.Q = xVar;
        }
    }

    public void i(int i10, int i11, int i12, int i13, @o0 int[] iArr, int i14, int i15) throws u.a {
        int[] iArr2;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int i19 = i11;
        boolean z11 = false;
        if (q0.f14786a < 21 && i19 == 8 && iArr == null) {
            iArr2 = new int[6];
            for (int i20 = 0; i20 < 6; i20++) {
                iArr2[i20] = i20;
            }
        } else {
            iArr2 = iArr;
        }
        boolean s02 = q0.s0(i10);
        int i21 = i10;
        boolean z12 = s02 && i21 != 4;
        boolean z13 = this.f6209d && e(i19, 4) && q0.r0(i10);
        l[] lVarArr = z13 ? this.f6213h : this.f6212g;
        if (z12) {
            this.f6211f.r(i14, i15);
            this.f6210e.p(iArr2);
            int length = lVarArr.length;
            i17 = i12;
            i18 = i19;
            int i22 = 0;
            boolean z14 = false;
            int i23 = i21;
            while (i22 < length) {
                l lVar = lVarArr[i22];
                try {
                    z14 |= lVar.i(i17, i18, i23);
                    if (lVar.c()) {
                        i18 = lVar.e();
                        i17 = lVar.f();
                        i23 = lVar.g();
                    }
                    i22++;
                } catch (l.a e10) {
                    throw new u.a((Throwable) e10);
                }
            }
            z10 = z14;
            i16 = i23;
        } else {
            i17 = i12;
            i18 = i19;
            z10 = false;
            i16 = i21;
        }
        int D2 = D(i18, s02);
        if (D2 != 0) {
            d dVar = r5;
            d dVar2 = new d(s02, s02 ? q0.Z(i10, i11) : -1, i12, s02 ? q0.Z(i16, i18) : -1, i17, D2, i16, i13, z12, z12 && !z13, lVarArr);
            if (z10 || this.f6219n != null) {
                z11 = true;
            }
            if (!K() || (dVar.b(this.f6220o) && !z11)) {
                this.f6220o = dVar;
            } else {
                this.f6219n = dVar;
            }
        } else {
            throw new u.a("Unsupported channel count: " + i18);
        }
    }

    public void j() throws u.d {
        if (!this.M && K() && B()) {
            L();
            this.M = true;
        }
    }

    public boolean k() {
        return K() && this.f6215j.h(H());
    }

    public void l(int i10) {
        if (this.P != i10) {
            this.P = i10;
            flush();
        }
    }

    public long m(boolean z10) {
        if (!K() || this.C == 0) {
            return Long.MIN_VALUE;
        }
        return this.D + z(A(Math.min(this.f6215j.d(z10), this.f6220o.e(H()))));
    }

    public void n() {
        if (this.R) {
            this.R = false;
            this.P = 0;
            flush();
        }
    }

    public void o() {
        if (this.C == 1) {
            this.C = 2;
        }
    }

    public boolean p(ByteBuffer byteBuffer, long j10) throws u.b, u.d {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j11 = j10;
        ByteBuffer byteBuffer3 = this.H;
        w7.a.a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.f6219n != null) {
            if (!B()) {
                return false;
            }
            if (!this.f6219n.b(this.f6220o)) {
                L();
                if (k()) {
                    return false;
                }
                flush();
            } else {
                this.f6220o = this.f6219n;
                this.f6219n = null;
            }
            y(this.f6224s, j11);
        }
        if (!K()) {
            I(j11);
            if (this.O) {
                f();
            }
        }
        if (!this.f6215j.k(H())) {
            return false;
        }
        if (this.H == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            d dVar = this.f6220o;
            if (!dVar.f6232a && this.B == 0) {
                int E2 = E(dVar.f6238g, byteBuffer2);
                this.B = E2;
                if (E2 == 0) {
                    return true;
                }
            }
            if (this.f6223r != null) {
                if (!B()) {
                    return false;
                }
                l0 l0Var = this.f6223r;
                this.f6223r = null;
                y(l0Var, j11);
            }
            if (this.C == 0) {
                this.D = Math.max(0, j11);
                this.C = 1;
            } else {
                long g10 = this.D + this.f6220o.g(G() - this.f6211f.p());
                if (this.C == 1 && Math.abs(g10 - j11) > 200000) {
                    p.d(f6201d0, "Discontinuity detected [expected " + g10 + ", got " + j11 + "]");
                    this.C = 2;
                }
                if (this.C == 2) {
                    long j12 = j11 - g10;
                    this.D += j12;
                    this.C = 1;
                    u.c cVar = this.f6217l;
                    if (!(cVar == null || j12 == 0)) {
                        cVar.c();
                    }
                }
            }
            if (this.f6220o.f6232a) {
                this.f6229x += (long) byteBuffer.remaining();
            } else {
                this.f6230y += (long) this.B;
            }
            this.H = byteBuffer2;
        }
        if (this.f6220o.f6240i) {
            M(j11);
        } else {
            S(this.H, j11);
        }
        if (!this.H.hasRemaining()) {
            this.H = null;
            return true;
        } else if (!this.f6215j.j(H())) {
            return false;
        } else {
            p.l(f6201d0, "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    public void pause() {
        this.O = false;
        if (K() && this.f6215j.p()) {
            this.f6221p.pause();
        }
    }

    public void q(int i10) {
        w7.a.i(q0.f14786a >= 21);
        if (!this.R || this.P != i10) {
            this.R = true;
            this.P = i10;
            flush();
        }
    }

    public void r(u.c cVar) {
        this.f6217l = cVar;
    }

    public void reset() {
        flush();
        N();
        for (l reset : this.f6212g) {
            reset.reset();
        }
        for (l reset2 : this.f6213h) {
            reset2.reset();
        }
        this.P = 0;
        this.O = false;
    }

    public final void y(l0 l0Var, long j10) {
        this.f6216k.add(new g(this.f6220o.f6241j ? this.f6208c.b(l0Var) : l0.f4401e, Math.max(0, j10), this.f6220o.e(H()), (a) null));
        R();
    }

    public final long z(long j10) {
        return j10 + this.f6220o.e(this.f6208c.c());
    }
}
