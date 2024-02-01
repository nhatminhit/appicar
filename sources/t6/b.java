package t6;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import b6.c0;
import b6.i;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.c;
import d.j;
import d.o0;
import g6.e;
import g6.f;
import h6.l;
import h6.n;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import t6.d;
import w7.i0;
import w7.k0;
import w7.p;
import w7.q0;
import w7.t;

public abstract class b extends b6.b {

    /* renamed from: c1  reason: collision with root package name */
    public static final float f12973c1 = -1.0f;

    /* renamed from: d1  reason: collision with root package name */
    public static final String f12974d1 = "MediaCodecRenderer";

    /* renamed from: e1  reason: collision with root package name */
    public static final long f12975e1 = 1000;

    /* renamed from: f1  reason: collision with root package name */
    public static final int f12976f1 = 0;

    /* renamed from: g1  reason: collision with root package name */
    public static final int f12977g1 = 1;

    /* renamed from: h1  reason: collision with root package name */
    public static final int f12978h1 = 2;

    /* renamed from: i1  reason: collision with root package name */
    public static final int f12979i1 = 3;

    /* renamed from: j1  reason: collision with root package name */
    public static final int f12980j1 = 0;

    /* renamed from: k1  reason: collision with root package name */
    public static final int f12981k1 = 1;

    /* renamed from: l1  reason: collision with root package name */
    public static final int f12982l1 = 2;

    /* renamed from: m1  reason: collision with root package name */
    public static final int f12983m1 = 0;

    /* renamed from: n1  reason: collision with root package name */
    public static final int f12984n1 = 1;

    /* renamed from: o1  reason: collision with root package name */
    public static final int f12985o1 = 2;

    /* renamed from: p1  reason: collision with root package name */
    public static final int f12986p1 = 0;

    /* renamed from: q1  reason: collision with root package name */
    public static final int f12987q1 = 1;

    /* renamed from: r1  reason: collision with root package name */
    public static final int f12988r1 = 2;

    /* renamed from: s1  reason: collision with root package name */
    public static final int f12989s1 = 3;

    /* renamed from: t1  reason: collision with root package name */
    public static final int f12990t1 = 0;

    /* renamed from: u1  reason: collision with root package name */
    public static final int f12991u1 = 1;

    /* renamed from: v1  reason: collision with root package name */
    public static final int f12992v1 = 2;

    /* renamed from: w1  reason: collision with root package name */
    public static final byte[] f12993w1 = q0.K("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: x1  reason: collision with root package name */
    public static final int f12994x1 = 32;
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public ByteBuffer[] G0;
    public ByteBuffer[] H0;
    public long I0;
    public int J0;
    public int K0;
    public ByteBuffer L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public int P0 = 0;
    public int Q0 = 0;
    public int R0 = 0;
    public boolean S0;
    public boolean T0;
    public long U0;
    public long V0;
    public boolean W0;
    public final c X;
    public boolean X0;
    @o0
    public final l<n> Y;
    public boolean Y0;
    public final boolean Z;
    public boolean Z0;

    /* renamed from: a0  reason: collision with root package name */
    public final boolean f12995a0;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f12996a1;

    /* renamed from: b0  reason: collision with root package name */
    public final float f12997b0;

    /* renamed from: b1  reason: collision with root package name */
    public e f12998b1;

    /* renamed from: c0  reason: collision with root package name */
    public final f f12999c0 = new f(0);

    /* renamed from: d0  reason: collision with root package name */
    public final f f13000d0 = f.v();

    /* renamed from: e0  reason: collision with root package name */
    public final c0 f13001e0 = new c0();

    /* renamed from: f0  reason: collision with root package name */
    public final i0<Format> f13002f0 = new i0<>();

    /* renamed from: g0  reason: collision with root package name */
    public final ArrayList<Long> f13003g0 = new ArrayList<>();

    /* renamed from: h0  reason: collision with root package name */
    public final MediaCodec.BufferInfo f13004h0 = new MediaCodec.BufferInfo();
    @o0

    /* renamed from: i0  reason: collision with root package name */
    public Format f13005i0;

    /* renamed from: j0  reason: collision with root package name */
    public Format f13006j0;
    @o0

    /* renamed from: k0  reason: collision with root package name */
    public c<n> f13007k0;
    @o0

    /* renamed from: l0  reason: collision with root package name */
    public c<n> f13008l0;
    @o0

    /* renamed from: m0  reason: collision with root package name */
    public MediaCrypto f13009m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f13010n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f13011o0 = b6.c.f4201b;

    /* renamed from: p0  reason: collision with root package name */
    public float f13012p0 = 1.0f;
    @o0

    /* renamed from: q0  reason: collision with root package name */
    public MediaCodec f13013q0;
    @o0

    /* renamed from: r0  reason: collision with root package name */
    public Format f13014r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f13015s0 = -1.0f;
    @o0

    /* renamed from: t0  reason: collision with root package name */
    public ArrayDeque<a> f13016t0;
    @o0

    /* renamed from: u0  reason: collision with root package name */
    public a f13017u0;
    @o0

    /* renamed from: v0  reason: collision with root package name */
    public a f13018v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f13019w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f13020x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f13021y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f13022z0;

    public static class a extends Exception {
        public static final int T = -50000;
        public static final int U = -49999;
        public static final int V = -49998;
        public final String O;
        public final boolean P;
        public final String Q;
        public final String R;
        @o0
        public final a S;

        public a(Format format, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + format, th2, format.W, z10, (String) null, b(i10), (a) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Format format, Throwable th2, boolean z10, String str) {
            this("Decoder init failed: " + str + ", " + format, th2, format.W, z10, str, q0.f14786a >= 21 ? d(th2) : null, (a) null);
        }

        public a(String str, Throwable th2, String str2, boolean z10, @o0 String str3, @o0 String str4, @o0 a aVar) {
            super(str, th2);
            this.O = str2;
            this.P = z10;
            this.Q = str3;
            this.R = str4;
            this.S = aVar;
        }

        public static String b(int i10) {
            String str = i10 < 0 ? "neg_" : "";
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i10);
        }

        @TargetApi(21)
        public static String d(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        @j
        public final a c(a aVar) {
            return new a(getMessage(), getCause(), this.O, this.P, this.Q, this.R, aVar);
        }
    }

    public b(int i10, c cVar, @o0 l<n> lVar, boolean z10, boolean z11, float f10) {
        super(i10);
        this.X = (c) w7.a.g(cVar);
        this.Y = lVar;
        this.Z = z10;
        this.f12995a0 = z11;
        this.f12997b0 = f10;
    }

    private void F0(@o0 c<n> cVar) {
        if (cVar != null && cVar != this.f13008l0 && cVar != this.f13007k0) {
            this.Y.f(cVar);
        }
    }

    private void L0(@o0 c<n> cVar) {
        c<n> cVar2 = this.f13008l0;
        this.f13008l0 = cVar;
        F0(cVar2);
    }

    public static boolean M(String str, Format format) {
        return q0.f14786a < 21 && format.Y.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean N(String str) {
        int i10 = q0.f14786a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = q0.f14787b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean O(String str) {
        return q0.f14786a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private boolean O0(boolean z10) throws i {
        c<n> cVar = this.f13007k0;
        if (cVar == null || (!z10 && this.Z)) {
            return false;
        }
        int state = cVar.getState();
        if (state != 1) {
            return state != 4;
        }
        throw i.c(this.f13007k0.d(), x());
    }

    public static boolean P(a aVar) {
        String str = aVar.f12964a;
        int i10 = q0.f14786a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ("Amazon".equals(q0.f14788c) && "AFTS".equals(q0.f14789d) && aVar.f12970g);
    }

    public static boolean Q(String str) {
        int i10 = q0.f14786a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && q0.f14789d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public static boolean R(String str, Format format) {
        return q0.f14786a <= 18 && format.f5077j0 == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public static boolean S(String str) {
        return q0.f14789d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private boolean a0() throws i {
        int i10;
        int i11;
        MediaCodec mediaCodec = this.f13013q0;
        if (mediaCodec == null || this.Q0 == 2 || this.W0) {
            return false;
        }
        if (this.J0 < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.J0 = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.f12999c0.Q = m0(dequeueInputBuffer);
            this.f12999c0.j();
        }
        if (this.Q0 == 1) {
            if (!this.F0) {
                this.T0 = true;
                this.f13013q0.queueInputBuffer(this.J0, 0, 0, 0, 4);
                I0();
            }
            this.Q0 = 2;
            return false;
        } else if (this.D0) {
            this.D0 = false;
            ByteBuffer byteBuffer = this.f12999c0.Q;
            byte[] bArr = f12993w1;
            byteBuffer.put(bArr);
            this.f13013q0.queueInputBuffer(this.J0, 0, bArr.length, 0, 0);
            I0();
            this.S0 = true;
            return true;
        } else {
            if (this.Y0) {
                i11 = -4;
                i10 = 0;
            } else {
                if (this.P0 == 1) {
                    for (int i12 = 0; i12 < this.f13014r0.Y.size(); i12++) {
                        this.f12999c0.Q.put(this.f13014r0.Y.get(i12));
                    }
                    this.P0 = 2;
                }
                i10 = this.f12999c0.Q.position();
                i11 = H(this.f13001e0, this.f12999c0, false);
            }
            if (g()) {
                this.U0 = this.V0;
            }
            if (i11 == -3) {
                return false;
            }
            if (i11 == -5) {
                if (this.P0 == 2) {
                    this.f12999c0.j();
                    this.P0 = 1;
                }
                u0(this.f13001e0.f4302c);
                return true;
            } else if (this.f12999c0.n()) {
                if (this.P0 == 2) {
                    this.f12999c0.j();
                    this.P0 = 1;
                }
                this.W0 = true;
                if (!this.S0) {
                    y0();
                    return false;
                }
                try {
                    if (!this.F0) {
                        this.T0 = true;
                        this.f13013q0.queueInputBuffer(this.J0, 0, 0, 0, 4);
                        I0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw i.c(e10, x());
                }
            } else if (!this.Z0 || this.f12999c0.o()) {
                this.Z0 = false;
                boolean t10 = this.f12999c0.t();
                boolean O02 = O0(t10);
                this.Y0 = O02;
                if (O02) {
                    return false;
                }
                if (this.f13021y0 && !t10) {
                    t.b(this.f12999c0.Q);
                    if (this.f12999c0.Q.position() == 0) {
                        return true;
                    }
                    this.f13021y0 = false;
                }
                try {
                    f fVar = this.f12999c0;
                    long j10 = fVar.R;
                    if (fVar.m()) {
                        this.f13003g0.add(Long.valueOf(j10));
                    }
                    if (this.f12996a1) {
                        this.f13002f0.a(j10, this.f13005i0);
                        this.f12996a1 = false;
                    }
                    this.V0 = Math.max(this.V0, j10);
                    this.f12999c0.s();
                    x0(this.f12999c0);
                    if (t10) {
                        this.f13013q0.queueSecureInputBuffer(this.J0, 0, l0(this.f12999c0, i10), j10, 0);
                    } else {
                        this.f13013q0.queueInputBuffer(this.J0, 0, this.f12999c0.Q.limit(), j10, 0);
                    }
                    I0();
                    this.S0 = true;
                    this.P0 = 0;
                    this.f12998b1.f8061c++;
                    return true;
                } catch (MediaCodec.CryptoException e11) {
                    throw i.c(e11, x());
                }
            } else {
                this.f12999c0.j();
                if (this.P0 == 2) {
                    this.P0 = 1;
                }
                return true;
            }
        }
    }

    public static MediaCodec.CryptoInfo l0(f fVar, int i10) {
        MediaCodec.CryptoInfo a10 = fVar.P.a();
        if (i10 == 0) {
            return a10;
        }
        if (a10.numBytesOfClearData == null) {
            a10.numBytesOfClearData = new int[1];
        }
        int[] iArr = a10.numBytesOfClearData;
        iArr[0] = iArr[0] + i10;
        return a10;
    }

    private void y0() throws i {
        int i10 = this.R0;
        if (i10 == 1) {
            b0();
        } else if (i10 == 2) {
            R0();
        } else if (i10 != 3) {
            this.X0 = true;
            G0();
        } else {
            D0();
        }
    }

    public void A() {
        this.f13005i0 = null;
        if (this.f13008l0 == null && this.f13007k0 == null) {
            c0();
        } else {
            D();
        }
    }

    public final void A0() {
        if (q0.f14786a < 21) {
            this.H0 = this.f13013q0.getOutputBuffers();
        }
    }

    public void B(boolean z10) throws i {
        this.f12998b1 = new e();
    }

    public final void B0() throws i {
        MediaFormat outputFormat = this.f13013q0.getOutputFormat();
        if (this.f13019w0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.E0 = true;
            return;
        }
        if (this.C0) {
            outputFormat.setInteger("channel-count", 1);
        }
        v0(this.f13013q0, outputFormat);
    }

    public void C(long j10, boolean z10) throws i {
        this.W0 = false;
        this.X0 = false;
        b0();
        this.f13002f0.c();
    }

    public final boolean C0(boolean z10) throws i {
        this.f13000d0.j();
        int H = H(this.f13001e0, this.f13000d0, z10);
        if (H == -5) {
            u0(this.f13001e0.f4302c);
            return true;
        } else if (H != -4 || !this.f13000d0.n()) {
            return false;
        } else {
            this.W0 = true;
            y0();
            return false;
        }
    }

    public void D() {
        try {
            E0();
        } finally {
            L0((c<n>) null);
        }
    }

    public final void D0() throws i {
        E0();
        r0();
    }

    public void E() {
    }

    public void E0() {
        this.f13016t0 = null;
        this.f13018v0 = null;
        this.f13014r0 = null;
        I0();
        J0();
        H0();
        this.Y0 = false;
        this.I0 = b6.c.f4201b;
        this.f13003g0.clear();
        this.V0 = b6.c.f4201b;
        this.U0 = b6.c.f4201b;
        try {
            MediaCodec mediaCodec = this.f13013q0;
            if (mediaCodec != null) {
                this.f12998b1.f8060b++;
                mediaCodec.stop();
                this.f13013q0.release();
            }
            this.f13013q0 = null;
            try {
                MediaCrypto mediaCrypto = this.f13009m0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f13009m0 = null;
                this.f13010n0 = false;
                K0((c<n>) null);
            }
        } catch (Throwable th2) {
            this.f13013q0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f13009m0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.f13009m0 = null;
                this.f13010n0 = false;
                K0((c<n>) null);
            }
        }
    }

    public void F() {
    }

    public void G0() throws i {
    }

    public final void H0() {
        if (q0.f14786a < 21) {
            this.G0 = null;
            this.H0 = null;
        }
    }

    public final void I0() {
        this.J0 = -1;
        this.f12999c0.Q = null;
    }

    public final void J0() {
        this.K0 = -1;
        this.L0 = null;
    }

    public int K(MediaCodec mediaCodec, a aVar, Format format, Format format2) {
        return 0;
    }

    public final void K0(@o0 c<n> cVar) {
        c<n> cVar2 = this.f13007k0;
        this.f13007k0 = cVar;
        F0(cVar2);
    }

    public final int L(String str) {
        int i10 = q0.f14786a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = q0.f14789d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = q0.f14787b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public final boolean M0(long j10) {
        return this.f13011o0 == b6.c.f4201b || SystemClock.elapsedRealtime() - j10 < this.f13011o0;
    }

    public boolean N0(a aVar) {
        return true;
    }

    public abstract int P0(c cVar, l<n> lVar, Format format) throws d.c;

    public final void Q0() throws i {
        if (q0.f14786a >= 23) {
            float i02 = i0(this.f13012p0, this.f13014r0, y());
            float f10 = this.f13015s0;
            if (f10 != i02) {
                if (i02 == -1.0f) {
                    W();
                } else if (f10 != -1.0f || i02 > this.f12997b0) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", i02);
                    this.f13013q0.setParameters(bundle);
                    this.f13015s0 = i02;
                }
            }
        }
    }

    @TargetApi(23)
    public final void R0() throws i {
        n b10 = this.f13008l0.b();
        if (b10 == null) {
            D0();
        } else if (b6.c.B1.equals(b10.f8861a)) {
            D0();
        } else if (!b0()) {
            try {
                this.f13009m0.setMediaDrmSession(b10.f8862b);
                K0(this.f13008l0);
                this.Q0 = 0;
                this.R0 = 0;
            } catch (MediaCryptoException e10) {
                throw i.c(e10, x());
            }
        }
    }

    @o0
    public final Format S0(long j10) {
        Format i10 = this.f13002f0.i(j10);
        if (i10 != null) {
            this.f13006j0 = i10;
        }
        return i10;
    }

    public abstract void T(a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f10);

    public final boolean U() {
        if ("Amazon".equals(q0.f14788c)) {
            String str = q0.f14789d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void V() {
        if (this.S0) {
            this.Q0 = 1;
            this.R0 = 1;
        }
    }

    public final void W() throws i {
        if (this.S0) {
            this.Q0 = 1;
            this.R0 = 3;
            return;
        }
        D0();
    }

    public final void X() throws i {
        if (q0.f14786a < 23) {
            W();
        } else if (this.S0) {
            this.Q0 = 1;
            this.R0 = 2;
        } else {
            R0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Y(long r19, long r21) throws b6.i {
        /*
            r18 = this;
            r14 = r18
            boolean r0 = r18.o0()
            r15 = 1
            r13 = 0
            if (r0 != 0) goto L_0x00ac
            boolean r0 = r14.B0
            if (r0 == 0) goto L_0x002a
            boolean r0 = r14.T0
            if (r0 == 0) goto L_0x002a
            android.media.MediaCodec r0 = r14.f13013q0     // Catch:{ IllegalStateException -> 0x001f }
            android.media.MediaCodec$BufferInfo r1 = r14.f13004h0     // Catch:{ IllegalStateException -> 0x001f }
            long r2 = r18.k0()     // Catch:{ IllegalStateException -> 0x001f }
            int r0 = r0.dequeueOutputBuffer(r1, r2)     // Catch:{ IllegalStateException -> 0x001f }
            goto L_0x0036
        L_0x001f:
            r18.y0()
            boolean r0 = r14.X0
            if (r0 == 0) goto L_0x0029
            r18.E0()
        L_0x0029:
            return r13
        L_0x002a:
            android.media.MediaCodec r0 = r14.f13013q0
            android.media.MediaCodec$BufferInfo r1 = r14.f13004h0
            long r2 = r18.k0()
            int r0 = r0.dequeueOutputBuffer(r1, r2)
        L_0x0036:
            if (r0 >= 0) goto L_0x0057
            r1 = -2
            if (r0 != r1) goto L_0x003f
            r18.B0()
            return r15
        L_0x003f:
            r1 = -3
            if (r0 != r1) goto L_0x0046
            r18.A0()
            return r15
        L_0x0046:
            boolean r0 = r14.F0
            if (r0 == 0) goto L_0x0056
            boolean r0 = r14.W0
            if (r0 != 0) goto L_0x0053
            int r0 = r14.Q0
            r1 = 2
            if (r0 != r1) goto L_0x0056
        L_0x0053:
            r18.y0()
        L_0x0056:
            return r13
        L_0x0057:
            boolean r1 = r14.E0
            if (r1 == 0) goto L_0x0063
            r14.E0 = r13
            android.media.MediaCodec r1 = r14.f13013q0
            r1.releaseOutputBuffer(r0, r13)
            return r15
        L_0x0063:
            android.media.MediaCodec$BufferInfo r1 = r14.f13004h0
            int r2 = r1.size
            if (r2 != 0) goto L_0x0073
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0073
            r18.y0()
            return r13
        L_0x0073:
            r14.K0 = r0
            java.nio.ByteBuffer r0 = r14.n0(r0)
            r14.L0 = r0
            if (r0 == 0) goto L_0x0090
            android.media.MediaCodec$BufferInfo r1 = r14.f13004h0
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r14.L0
            android.media.MediaCodec$BufferInfo r1 = r14.f13004h0
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x0090:
            android.media.MediaCodec$BufferInfo r0 = r14.f13004h0
            long r0 = r0.presentationTimeUs
            boolean r0 = r14.q0(r0)
            r14.M0 = r0
            long r0 = r14.U0
            android.media.MediaCodec$BufferInfo r2 = r14.f13004h0
            long r2 = r2.presentationTimeUs
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00a6
            r0 = r15
            goto L_0x00a7
        L_0x00a6:
            r0 = r13
        L_0x00a7:
            r14.N0 = r0
            r14.S0(r2)
        L_0x00ac:
            boolean r0 = r14.B0
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r14.T0
            if (r0 == 0) goto L_0x00e4
            android.media.MediaCodec r5 = r14.f13013q0     // Catch:{ IllegalStateException -> 0x00d7 }
            java.nio.ByteBuffer r6 = r14.L0     // Catch:{ IllegalStateException -> 0x00d7 }
            int r7 = r14.K0     // Catch:{ IllegalStateException -> 0x00d7 }
            android.media.MediaCodec$BufferInfo r0 = r14.f13004h0     // Catch:{ IllegalStateException -> 0x00d7 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00d7 }
            long r9 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00d7 }
            boolean r11 = r14.M0     // Catch:{ IllegalStateException -> 0x00d7 }
            boolean r12 = r14.N0     // Catch:{ IllegalStateException -> 0x00d7 }
            com.google.android.exoplayer2.Format r3 = r14.f13006j0     // Catch:{ IllegalStateException -> 0x00d7 }
            r0 = r18
            r1 = r19
            r16 = r3
            r3 = r21
            r17 = r13
            r13 = r16
            boolean r0 = r0.z0(r1, r3, r5, r6, r7, r8, r9, r11, r12, r13)     // Catch:{ IllegalStateException -> 0x00d9 }
            goto L_0x0102
        L_0x00d7:
            r17 = r13
        L_0x00d9:
            r18.y0()
            boolean r0 = r14.X0
            if (r0 == 0) goto L_0x00e3
            r18.E0()
        L_0x00e3:
            return r17
        L_0x00e4:
            r17 = r13
            android.media.MediaCodec r5 = r14.f13013q0
            java.nio.ByteBuffer r6 = r14.L0
            int r7 = r14.K0
            android.media.MediaCodec$BufferInfo r0 = r14.f13004h0
            int r8 = r0.flags
            long r9 = r0.presentationTimeUs
            boolean r11 = r14.M0
            boolean r12 = r14.N0
            com.google.android.exoplayer2.Format r13 = r14.f13006j0
            r0 = r18
            r1 = r19
            r3 = r21
            boolean r0 = r0.z0(r1, r3, r5, r6, r7, r8, r9, r11, r12, r13)
        L_0x0102:
            if (r0 == 0) goto L_0x0120
            android.media.MediaCodec$BufferInfo r0 = r14.f13004h0
            long r0 = r0.presentationTimeUs
            r14.w0(r0)
            android.media.MediaCodec$BufferInfo r0 = r14.f13004h0
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0115
            r13 = r15
            goto L_0x0117
        L_0x0115:
            r13 = r17
        L_0x0117:
            r18.J0()
            if (r13 != 0) goto L_0x011d
            return r15
        L_0x011d:
            r18.y0()
        L_0x0120:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.b.Y(long, long):boolean");
    }

    public void Z(long j10) {
        this.f13011o0 = j10;
    }

    public boolean a() {
        return this.X0;
    }

    public final int b(Format format) throws i {
        try {
            return P0(this.X, this.Y, format);
        } catch (d.c e10) {
            throw i.c(e10, x());
        }
    }

    public final boolean b0() throws i {
        boolean c02 = c0();
        if (c02) {
            r0();
        }
        return c02;
    }

    public boolean c0() {
        MediaCodec mediaCodec = this.f13013q0;
        if (mediaCodec == null) {
            return false;
        }
        if (this.R0 == 3 || this.f13022z0 || (this.A0 && this.T0)) {
            E0();
            return true;
        }
        mediaCodec.flush();
        I0();
        J0();
        this.I0 = b6.c.f4201b;
        this.T0 = false;
        this.S0 = false;
        this.Z0 = true;
        this.D0 = false;
        this.E0 = false;
        this.M0 = false;
        this.N0 = false;
        this.Y0 = false;
        this.f13003g0.clear();
        this.V0 = b6.c.f4201b;
        this.U0 = b6.c.f4201b;
        this.Q0 = 0;
        this.R0 = 0;
        this.P0 = this.O0 ? 1 : 0;
        return false;
    }

    public final List<a> d0(boolean z10) throws d.c {
        List<a> j02 = j0(this.X, this.f13005i0, z10);
        if (j02.isEmpty() && z10) {
            j02 = j0(this.X, this.f13005i0, false);
            if (!j02.isEmpty()) {
                p.l(f12974d1, "Drm session requires secure decoder for " + this.f13005i0.W + ", but no secure decoder available. Trying to proceed with " + j02 + ".");
            }
        }
        return j02;
    }

    public final MediaCodec e0() {
        return this.f13013q0;
    }

    public final void f0(MediaCodec mediaCodec) {
        if (q0.f14786a < 21) {
            this.G0 = mediaCodec.getInputBuffers();
            this.H0 = mediaCodec.getOutputBuffers();
        }
    }

    @o0
    public final a g0() {
        return this.f13018v0;
    }

    public boolean h0() {
        return false;
    }

    public float i0(float f10, Format format, Format[] formatArr) {
        return -1.0f;
    }

    public boolean isReady() {
        return this.f13005i0 != null && !this.Y0 && (z() || o0() || (this.I0 != b6.c.f4201b && SystemClock.elapsedRealtime() < this.I0));
    }

    public abstract List<a> j0(c cVar, Format format, boolean z10) throws d.c;

    public long k0() {
        return 0;
    }

    public final int l() {
        return 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b A[LOOP:1: B:14:0x002b->B:17:0x0035, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(long r4, long r6) throws b6.i {
        /*
            r3 = this;
            boolean r0 = r3.X0
            if (r0 == 0) goto L_0x0008
            r3.G0()
            return
        L_0x0008:
            com.google.android.exoplayer2.Format r0 = r3.f13005i0
            if (r0 != 0) goto L_0x0014
            r0 = 1
            boolean r0 = r3.C0(r0)
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            r3.r0()
            android.media.MediaCodec r0 = r3.f13013q0
            if (r0 == 0) goto L_0x003c
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r2 = "drainAndFeed"
            w7.k0.a(r2)
        L_0x0024:
            boolean r2 = r3.Y(r4, r6)
            if (r2 == 0) goto L_0x002b
            goto L_0x0024
        L_0x002b:
            boolean r4 = r3.a0()
            if (r4 == 0) goto L_0x0038
            boolean r4 = r3.M0(r0)
            if (r4 == 0) goto L_0x0038
            goto L_0x002b
        L_0x0038:
            w7.k0.c()
            goto L_0x004b
        L_0x003c:
            g6.e r6 = r3.f12998b1
            int r7 = r6.f8062d
            int r4 = r3.I(r4)
            int r7 = r7 + r4
            r6.f8062d = r7
            r4 = 0
            r3.C0(r4)
        L_0x004b:
            g6.e r4 = r3.f12998b1
            r4.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.b.m(long, long):void");
    }

    public final ByteBuffer m0(int i10) {
        return q0.f14786a >= 21 ? this.f13013q0.getInputBuffer(i10) : this.G0[i10];
    }

    public final ByteBuffer n0(int i10) {
        return q0.f14786a >= 21 ? this.f13013q0.getOutputBuffer(i10) : this.H0[i10];
    }

    public final boolean o0() {
        return this.K0 >= 0;
    }

    public final void p(float f10) throws i {
        this.f13012p0 = f10;
        if (this.f13013q0 != null && this.R0 != 3 && getState() != 0) {
            Q0();
        }
    }

    public final void p0(a aVar, MediaCrypto mediaCrypto) throws Exception {
        String str = aVar.f12964a;
        float f10 = -1.0f;
        float i02 = q0.f14786a < 23 ? -1.0f : i0(this.f13012p0, this.f13005i0, y());
        if (i02 > this.f12997b0) {
            f10 = i02;
        }
        MediaCodec mediaCodec = null;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            k0.a("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            k0.c();
            k0.a("configureCodec");
            T(aVar, mediaCodec, this.f13005i0, mediaCrypto, f10);
            k0.c();
            k0.a("startCodec");
            mediaCodec.start();
            k0.c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            f0(mediaCodec);
            this.f13013q0 = mediaCodec;
            this.f13018v0 = aVar;
            this.f13015s0 = f10;
            this.f13014r0 = this.f13005i0;
            this.f13019w0 = L(str);
            this.f13020x0 = S(str);
            this.f13021y0 = M(str, this.f13014r0);
            this.f13022z0 = Q(str);
            this.A0 = N(str);
            this.B0 = O(str);
            this.C0 = R(str, this.f13014r0);
            this.F0 = P(aVar) || h0();
            I0();
            J0();
            this.I0 = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : b6.c.f4201b;
            this.O0 = false;
            this.P0 = 0;
            this.T0 = false;
            this.S0 = false;
            this.Q0 = 0;
            this.R0 = 0;
            this.D0 = false;
            this.E0 = false;
            this.M0 = false;
            this.N0 = false;
            this.Z0 = true;
            this.f12998b1.f8059a++;
            t0(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Exception e10) {
            if (mediaCodec != null) {
                H0();
                mediaCodec.release();
            }
            throw e10;
        }
    }

    public final boolean q0(long j10) {
        int size = this.f13003g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f13003g0.get(i10).longValue() == j10) {
                this.f13003g0.remove(i10);
                return true;
            }
        }
        return false;
    }

    public final void r0() throws i {
        if (this.f13013q0 == null && this.f13005i0 != null) {
            K0(this.f13008l0);
            String str = this.f13005i0.W;
            c<n> cVar = this.f13007k0;
            if (cVar != null) {
                if (this.f13009m0 == null) {
                    n b10 = cVar.b();
                    if (b10 != null) {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(b10.f8861a, b10.f8862b);
                            this.f13009m0 = mediaCrypto;
                            this.f13010n0 = !b10.f8863c && mediaCrypto.requiresSecureDecoderComponent(str);
                        } catch (MediaCryptoException e10) {
                            throw i.c(e10, x());
                        }
                    } else if (this.f13007k0.d() == null) {
                        return;
                    }
                }
                if (U()) {
                    int state = this.f13007k0.getState();
                    if (state == 1) {
                        throw i.c(this.f13007k0.d(), x());
                    } else if (state != 4) {
                        return;
                    }
                }
            }
            try {
                s0(this.f13009m0, this.f13010n0);
            } catch (a e11) {
                throw i.c(e11, x());
            }
        }
    }

    public final void s0(MediaCrypto mediaCrypto, boolean z10) throws a {
        if (this.f13016t0 == null) {
            try {
                List<a> d02 = d0(z10);
                ArrayDeque<a> arrayDeque = new ArrayDeque<>();
                this.f13016t0 = arrayDeque;
                if (this.f12995a0) {
                    arrayDeque.addAll(d02);
                } else if (!d02.isEmpty()) {
                    this.f13016t0.add(d02.get(0));
                }
                this.f13017u0 = null;
            } catch (d.c e10) {
                throw new a(this.f13005i0, (Throwable) e10, z10, (int) a.V);
            }
        }
        if (!this.f13016t0.isEmpty()) {
            while (this.f13013q0 == null) {
                a peekFirst = this.f13016t0.peekFirst();
                if (N0(peekFirst)) {
                    try {
                        p0(peekFirst, mediaCrypto);
                    } catch (Exception e11) {
                        p.m(f12974d1, "Failed to initialize decoder: " + peekFirst, e11);
                        this.f13016t0.removeFirst();
                        a aVar = new a(this.f13005i0, (Throwable) e11, z10, peekFirst.f12964a);
                        if (this.f13017u0 == null) {
                            this.f13017u0 = aVar;
                        } else {
                            this.f13017u0 = this.f13017u0.c(aVar);
                        }
                        if (this.f13016t0.isEmpty()) {
                            throw this.f13017u0;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f13016t0 = null;
            return;
        }
        throw new a(this.f13005i0, (Throwable) null, z10, (int) a.U);
    }

    public void t0(String str, long j10, long j11) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b8, code lost:
        if (r6.f5070c0 == r2.f5070c0) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u0(com.google.android.exoplayer2.Format r6) throws b6.i {
        /*
            r5 = this;
            com.google.android.exoplayer2.Format r0 = r5.f13005i0
            r5.f13005i0 = r6
            r1 = 1
            r5.f12996a1 = r1
            com.google.android.exoplayer2.drm.DrmInitData r2 = r6.Z
            r3 = 0
            if (r0 != 0) goto L_0x000e
            r0 = r3
            goto L_0x0010
        L_0x000e:
            com.google.android.exoplayer2.drm.DrmInitData r0 = r0.Z
        L_0x0010:
            boolean r0 = w7.q0.e(r2, r0)
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x004d
            com.google.android.exoplayer2.drm.DrmInitData r0 = r6.Z
            if (r0 == 0) goto L_0x004a
            h6.l<h6.n> r0 = r5.Y
            if (r0 == 0) goto L_0x003a
            android.os.Looper r2 = android.os.Looper.myLooper()
            com.google.android.exoplayer2.drm.DrmInitData r3 = r6.Z
            com.google.android.exoplayer2.drm.c r0 = r0.a(r2, r3)
            com.google.android.exoplayer2.drm.c<h6.n> r2 = r5.f13008l0
            if (r0 == r2) goto L_0x0031
            com.google.android.exoplayer2.drm.c<h6.n> r2 = r5.f13007k0
            if (r0 != r2) goto L_0x0036
        L_0x0031:
            h6.l<h6.n> r2 = r5.Y
            r2.f(r0)
        L_0x0036:
            r5.L0(r0)
            goto L_0x004d
        L_0x003a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.x()
            b6.i r6 = b6.i.c(r6, r0)
            throw r6
        L_0x004a:
            r5.L0(r3)
        L_0x004d:
            android.media.MediaCodec r0 = r5.f13013q0
            if (r0 != 0) goto L_0x0055
            r5.r0()
            return
        L_0x0055:
            com.google.android.exoplayer2.drm.c<h6.n> r2 = r5.f13008l0
            if (r2 != 0) goto L_0x005d
            com.google.android.exoplayer2.drm.c<h6.n> r3 = r5.f13007k0
            if (r3 != 0) goto L_0x0075
        L_0x005d:
            if (r2 == 0) goto L_0x0063
            com.google.android.exoplayer2.drm.c<h6.n> r3 = r5.f13007k0
            if (r3 == 0) goto L_0x0075
        L_0x0063:
            if (r2 == 0) goto L_0x006b
            t6.a r3 = r5.f13018v0
            boolean r3 = r3.f12970g
            if (r3 == 0) goto L_0x0075
        L_0x006b:
            int r3 = w7.q0.f14786a
            r4 = 23
            if (r3 >= r4) goto L_0x0079
            com.google.android.exoplayer2.drm.c<h6.n> r3 = r5.f13007k0
            if (r2 == r3) goto L_0x0079
        L_0x0075:
            r5.W()
            return
        L_0x0079:
            t6.a r2 = r5.f13018v0
            com.google.android.exoplayer2.Format r3 = r5.f13014r0
            int r0 = r5.K(r0, r2, r3, r6)
            if (r0 == 0) goto L_0x00dd
            if (r0 == r1) goto L_0x00ca
            r2 = 2
            if (r0 == r2) goto L_0x009d
            r1 = 3
            if (r0 != r1) goto L_0x0097
            r5.f13014r0 = r6
            r5.Q0()
            com.google.android.exoplayer2.drm.c<h6.n> r6 = r5.f13008l0
            com.google.android.exoplayer2.drm.c<h6.n> r0 = r5.f13007k0
            if (r6 == r0) goto L_0x00e0
            goto L_0x00d5
        L_0x0097:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L_0x009d:
            boolean r0 = r5.f13020x0
            if (r0 == 0) goto L_0x00a2
            goto L_0x00dd
        L_0x00a2:
            r5.O0 = r1
            r5.P0 = r1
            int r0 = r5.f13019w0
            if (r0 == r2) goto L_0x00bc
            if (r0 != r1) goto L_0x00bb
            int r0 = r6.f5069b0
            com.google.android.exoplayer2.Format r2 = r5.f13014r0
            int r3 = r2.f5069b0
            if (r0 != r3) goto L_0x00bb
            int r0 = r6.f5070c0
            int r2 = r2.f5070c0
            if (r0 != r2) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            r5.D0 = r1
            r5.f13014r0 = r6
            r5.Q0()
            com.google.android.exoplayer2.drm.c<h6.n> r6 = r5.f13008l0
            com.google.android.exoplayer2.drm.c<h6.n> r0 = r5.f13007k0
            if (r6 == r0) goto L_0x00e0
            goto L_0x00d5
        L_0x00ca:
            r5.f13014r0 = r6
            r5.Q0()
            com.google.android.exoplayer2.drm.c<h6.n> r6 = r5.f13008l0
            com.google.android.exoplayer2.drm.c<h6.n> r0 = r5.f13007k0
            if (r6 == r0) goto L_0x00d9
        L_0x00d5:
            r5.X()
            goto L_0x00e0
        L_0x00d9:
            r5.V()
            goto L_0x00e0
        L_0x00dd:
            r5.W()
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.b.u0(com.google.android.exoplayer2.Format):void");
    }

    public void v0(MediaCodec mediaCodec, MediaFormat mediaFormat) throws i {
    }

    public void w0(long j10) {
    }

    public void x0(f fVar) {
    }

    public abstract boolean z0(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10, boolean z11, Format format) throws i;
}
