package d6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import b6.i;
import b6.l0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.material.internal.e;
import d.o0;
import d6.t;
import d6.u;
import g6.f;
import h6.l;
import h6.n;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import t6.c;
import t6.d;
import w7.p;
import w7.q0;
import w7.r;
import w7.s;

public class d0 extends t6.b implements r {
    public static final int Q1 = 10;
    public static final String R1 = "MediaCodecAudioRenderer";
    public final u A1;
    public final long[] B1;
    public int C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public MediaFormat G1;
    public int H1;
    public int I1;
    public int J1;
    public int K1;
    public long L1;
    public boolean M1;
    public boolean N1;
    public long O1;
    public int P1;

    /* renamed from: y1  reason: collision with root package name */
    public final Context f6287y1;

    /* renamed from: z1  reason: collision with root package name */
    public final t.a f6288z1;

    public final class b implements u.c {
        public b() {
        }

        public void a(int i10) {
            d0.this.f6288z1.g(i10);
            d0.this.e1(i10);
        }

        public void b(int i10, long j10, long j11) {
            d0.this.f6288z1.h(i10, j10, j11);
            d0.this.g1(i10, j10, j11);
        }

        public void c() {
            d0.this.f1();
            boolean unused = d0.this.N1 = true;
        }
    }

    public d0(Context context, c cVar) {
        this(context, cVar, (l<n>) null, false);
    }

    public d0(Context context, c cVar, @o0 Handler handler, @o0 t tVar) {
        this(context, cVar, (l<n>) null, false, handler, tVar);
    }

    public d0(Context context, c cVar, @o0 l<n> lVar, boolean z10) {
        this(context, cVar, lVar, z10, (Handler) null, (t) null);
    }

    public d0(Context context, c cVar, @o0 l<n> lVar, boolean z10, @o0 Handler handler, @o0 t tVar) {
        this(context, cVar, lVar, z10, handler, tVar, (d) null, new l[0]);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d0(Context context, c cVar, @o0 l<n> lVar, boolean z10, @o0 Handler handler, @o0 t tVar, @o0 d dVar, l... lVarArr) {
        this(context, cVar, lVar, z10, handler, tVar, new a0(dVar, lVarArr));
        d dVar2 = dVar;
    }

    public d0(Context context, c cVar, @o0 l<n> lVar, boolean z10, @o0 Handler handler, @o0 t tVar, u uVar) {
        this(context, cVar, lVar, z10, false, handler, tVar, uVar);
    }

    public d0(Context context, c cVar, @o0 l<n> lVar, boolean z10, boolean z11, @o0 Handler handler, @o0 t tVar, u uVar) {
        super(1, cVar, lVar, z10, z11, 44100.0f);
        this.f6287y1 = context.getApplicationContext();
        this.A1 = uVar;
        this.O1 = b6.c.f4201b;
        this.B1 = new long[10];
        this.f6288z1 = new t.a(handler, tVar);
        uVar.r(new b());
    }

    public static boolean X0(String str) {
        if (q0.f14786a < 24 && "OMX.SEC.aac.dec".equals(str) && e.f17193b.equals(q0.f14788c)) {
            String str2 = q0.f14787b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    public static boolean Y0(String str) {
        if (q0.f14786a < 21 && "OMX.SEC.mp3.dec".equals(str) && e.f17193b.equals(q0.f14788c)) {
            String str2 = q0.f14787b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean Z0() {
        if (q0.f14786a == 23) {
            String str = q0.f14789d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void A() {
        try {
            this.O1 = b6.c.f4201b;
            this.P1 = 0;
            this.A1.flush();
            try {
                super.A();
            } finally {
                this.f6288z1.j(this.f12998b1);
            }
        } catch (Throwable th2) {
            super.A();
            throw th2;
        } finally {
            this.f6288z1.j(this.f12998b1);
        }
    }

    public void B(boolean z10) throws i {
        super.B(z10);
        this.f6288z1.k(this.f12998b1);
        int i10 = w().f4469a;
        if (i10 != 0) {
            this.A1.q(i10);
        } else {
            this.A1.n();
        }
    }

    public void C(long j10, boolean z10) throws i {
        super.C(j10, z10);
        this.A1.flush();
        this.L1 = j10;
        this.M1 = true;
        this.N1 = true;
        this.O1 = b6.c.f4201b;
        this.P1 = 0;
    }

    public void D() {
        try {
            super.D();
        } finally {
            this.A1.reset();
        }
    }

    public void E() {
        super.E();
        this.A1.f();
    }

    public void F() {
        h1();
        this.A1.pause();
        super.F();
    }

    public void G(Format[] formatArr, long j10) throws i {
        super.G(formatArr, j10);
        if (this.O1 != b6.c.f4201b) {
            int i10 = this.P1;
            if (i10 == this.B1.length) {
                p.l(R1, "Too many stream changes, so dropping change at " + this.B1[this.P1 - 1]);
            } else {
                this.P1 = i10 + 1;
            }
            this.B1[this.P1 - 1] = this.O1;
        }
    }

    public void G0() throws i {
        try {
            this.A1.j();
        } catch (u.d e10) {
            throw i.c(e10, x());
        }
    }

    public int K(MediaCodec mediaCodec, t6.a aVar, Format format, Format format2) {
        if (a1(aVar, format2) <= this.C1 && format.f5080m0 == 0 && format.f5081n0 == 0 && format2.f5080m0 == 0 && format2.f5081n0 == 0) {
            if (aVar.n(format, format2, true)) {
                return 3;
            }
            if (W0(format, format2)) {
                return 1;
            }
        }
        return 0;
    }

    public int P0(c cVar, l<n> lVar, Format format) throws d.c {
        boolean z10;
        String str = format.W;
        if (!s.l(str)) {
            return 0;
        }
        int i10 = q0.f14786a >= 21 ? 32 : 0;
        boolean J = b6.b.J(lVar, format.Z);
        int i11 = 4;
        int i12 = 8;
        if (J && V0(format.f5077j0, str) && cVar.a() != null) {
            return i10 | 8 | 4;
        }
        if ((s.f14841z.equals(str) && !this.A1.e(format.f5077j0, format.f5079l0)) || !this.A1.e(format.f5077j0, 2)) {
            return 1;
        }
        DrmInitData drmInitData = format.Z;
        if (drmInitData != null) {
            z10 = false;
            for (int i13 = 0; i13 < drmInitData.R; i13++) {
                z10 |= drmInitData.e(i13).T;
            }
        } else {
            z10 = false;
        }
        List<t6.a> b10 = cVar.b(format.W, z10, false);
        if (b10.isEmpty()) {
            return (!z10 || cVar.b(format.W, false, false).isEmpty()) ? 1 : 2;
        }
        if (!J) {
            return 2;
        }
        t6.a aVar = b10.get(0);
        boolean l10 = aVar.l(format);
        if (l10 && aVar.m(format)) {
            i12 = 16;
        }
        if (!l10) {
            i11 = 3;
        }
        return i12 | i10 | i11;
    }

    public void T(t6.a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f10) {
        this.C1 = b1(aVar, format, y());
        this.E1 = X0(aVar.f12964a);
        this.F1 = Y0(aVar.f12964a);
        boolean z10 = aVar.f12971h;
        this.D1 = z10;
        MediaFormat c12 = c1(format, z10 ? s.f14841z : aVar.f12966c, this.C1, f10);
        mediaCodec.configure(c12, (Surface) null, mediaCrypto, 0);
        if (this.D1) {
            this.G1 = c12;
            c12.setString("mime", format.W);
            return;
        }
        this.G1 = null;
    }

    public boolean V0(int i10, String str) {
        return d1(i10, str) != 0;
    }

    public boolean W0(Format format, Format format2) {
        return q0.e(format.W, format2.W) && format.f5077j0 == format2.f5077j0 && format.f5078k0 == format2.f5078k0 && format.K(format2);
    }

    public boolean a() {
        return super.a() && this.A1.a();
    }

    public final int a1(t6.a aVar, Format format) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(aVar.f12964a) || (i10 = q0.f14786a) >= 24 || (i10 == 23 && q0.v0(this.f6287y1))) {
            return format.X;
        }
        return -1;
    }

    public int b1(t6.a aVar, Format format, Format[] formatArr) {
        int a12 = a1(aVar, format);
        if (formatArr.length == 1) {
            return a12;
        }
        for (Format format2 : formatArr) {
            if (aVar.n(format, format2, false)) {
                a12 = Math.max(a12, a1(aVar, format2));
            }
        }
        return a12;
    }

    public l0 c(l0 l0Var) {
        return this.A1.c(l0Var);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat c1(Format format, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.f5077j0);
        mediaFormat.setInteger("sample-rate", format.f5078k0);
        t6.e.e(mediaFormat, format.Y);
        t6.e.d(mediaFormat, "max-input-size", i10);
        int i11 = q0.f14786a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !Z0()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && s.F.equals(format.W)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        return mediaFormat;
    }

    public l0 d() {
        return this.A1.d();
    }

    public int d1(int i10, String str) {
        if (s.E.equals(str)) {
            if (this.A1.e(i10, 18)) {
                return s.c(s.E);
            }
            str = s.D;
        }
        int c10 = s.c(str);
        if (this.A1.e(i10, c10)) {
            return c10;
        }
        return 0;
    }

    public void e1(int i10) {
    }

    public void f1() {
    }

    public void g1(int i10, long j10, long j11) {
    }

    public final void h1() {
        long m10 = this.A1.m(a());
        if (m10 != Long.MIN_VALUE) {
            if (!this.N1) {
                m10 = Math.max(this.L1, m10);
            }
            this.L1 = m10;
            this.N1 = false;
        }
    }

    public float i0(float f10, Format format, Format[] formatArr) {
        int i10 = -1;
        for (Format format2 : formatArr) {
            int i11 = format2.f5078k0;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * ((float) i10);
    }

    public boolean isReady() {
        return this.A1.k() || super.isReady();
    }

    public long j() {
        if (getState() == 2) {
            h1();
        }
        return this.L1;
    }

    public List<t6.a> j0(c cVar, Format format, boolean z10) throws d.c {
        t6.a a10;
        if (V0(format.f5077j0, format.W) && (a10 = cVar.a()) != null) {
            return Collections.singletonList(a10);
        }
        List<t6.a> b10 = cVar.b(format.W, z10, false);
        if (s.E.equals(format.W)) {
            b10.addAll(cVar.b(s.D, z10, false));
        }
        return Collections.unmodifiableList(b10);
    }

    public void n(int i10, @o0 Object obj) throws i {
        if (i10 == 2) {
            this.A1.g(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.A1.b((c) obj);
        } else if (i10 != 5) {
            super.n(i10, obj);
        } else {
            this.A1.h((x) obj);
        }
    }

    public void t0(String str, long j10, long j11) {
        this.f6288z1.i(str, j10, j11);
    }

    public void u0(Format format) throws i {
        super.u0(format);
        this.f6288z1.l(format);
        this.H1 = s.f14841z.equals(format.W) ? format.f5079l0 : 2;
        this.I1 = format.f5077j0;
        this.J1 = format.f5080m0;
        this.K1 = format.f5081n0;
    }

    public r v() {
        return this;
    }

    public void v0(MediaCodec mediaCodec, MediaFormat mediaFormat) throws i {
        int i10;
        int[] iArr;
        int i11;
        MediaFormat mediaFormat2 = this.G1;
        if (mediaFormat2 != null) {
            i10 = d1(mediaFormat2.getInteger("channel-count"), mediaFormat2.getString("mime"));
            mediaFormat = mediaFormat2;
        } else {
            i10 = this.H1;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.E1 || integer != 6 || (i11 = this.I1) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i11];
            for (int i12 = 0; i12 < this.I1; i12++) {
                iArr[i12] = i12;
            }
        }
        try {
            this.A1.i(i10, integer, integer2, 0, iArr, this.J1, this.K1);
        } catch (u.a e10) {
            throw i.c(e10, x());
        }
    }

    @d.i
    public void w0(long j10) {
        while (this.P1 != 0 && j10 >= this.B1[0]) {
            this.A1.o();
            int i10 = this.P1 - 1;
            this.P1 = i10;
            long[] jArr = this.B1;
            System.arraycopy(jArr, 1, jArr, 0, i10);
        }
    }

    public void x0(f fVar) {
        if (this.M1 && !fVar.m()) {
            if (Math.abs(fVar.R - this.L1) > 500000) {
                this.L1 = fVar.R;
            }
            this.M1 = false;
        }
        this.O1 = Math.max(fVar.R, this.O1);
    }

    public boolean z0(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10, boolean z11, Format format) throws i {
        if (this.F1 && j12 == 0 && (i11 & 4) != 0) {
            long j13 = this.O1;
            if (j13 != b6.c.f4201b) {
                j12 = j13;
            }
        }
        if (this.D1 && (i11 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i10, false);
            return true;
        } else if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.f12998b1.f8064f++;
            this.A1.o();
            return true;
        } else {
            try {
                if (!this.A1.p(byteBuffer, j12)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i10, false);
                this.f12998b1.f8063e++;
                return true;
            } catch (u.b | u.d e10) {
                throw i.c(e10, x());
            }
        }
    }
}
