package w7;

import android.os.SystemClock;
import android.view.Surface;
import b6.i;
import b6.l0;
import b6.x0;
import b7.i0;
import bc.p;
import c6.b;
import c6.c;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.d;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import g6.e;
import g7.h;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import og.c0;
import q7.m;
import y3.q;

public class k implements c {

    /* renamed from: f  reason: collision with root package name */
    public static final String f14746f = "EventLogger";

    /* renamed from: g  reason: collision with root package name */
    public static final int f14747g = 3;

    /* renamed from: h  reason: collision with root package name */
    public static final NumberFormat f14748h;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final d f14749a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14750b;

    /* renamed from: c  reason: collision with root package name */
    public final x0.c f14751c;

    /* renamed from: d  reason: collision with root package name */
    public final x0.b f14752d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14753e;

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.US);
        f14748h = instance;
        instance.setMinimumFractionDigits(2);
        instance.setMaximumFractionDigits(2);
        instance.setGroupingUsed(false);
    }

    public k(@o0 d dVar) {
        this(dVar, f14746f);
    }

    public k(@o0 d dVar, String str) {
        this.f14749a = dVar;
        this.f14750b = str;
        this.f14751c = new x0.c();
        this.f14752d = new x0.b();
        this.f14753e = SystemClock.elapsedRealtime();
    }

    public static String O(int i10, int i11) {
        return i10 < 2 ? "N/A" : i11 != 0 ? i11 != 8 ? i11 != 16 ? "?" : h.J : "YES_NOT_SEAMLESS" : h.K;
    }

    public static String P(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : "INTERNAL" : "AD_INSERTION" : "SEEK_ADJUSTMENT" : "SEEK" : "PERIOD_TRANSITION";
    }

    public static String T(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : h.J : "NO_EXCEEDS_CAPABILITIES" : "NO_UNSUPPORTED_DRM" : "NO_UNSUPPORTED_TYPE" : h.K;
    }

    public static String U(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    public static String V(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "?" : p.f16186e : "READY" : p.f16189h : "IDLE";
    }

    public static String W(long j10) {
        return j10 == b6.c.f4201b ? "?" : f14748h.format((double) (((float) j10) / 1000.0f));
    }

    public static String X(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "DYNAMIC" : "RESET" : "PREPARED";
    }

    public static String Y(@o0 f fVar, TrackGroup trackGroup, int i10) {
        return Z((fVar == null || fVar.a() != trackGroup || fVar.r(i10) == -1) ? false : true);
    }

    public static String Z(boolean z10) {
        return z10 ? "[X]" : "[ ]";
    }

    public static String a0(int i10) {
        switch (i10) {
            case 0:
                return p.f16197p;
            case 1:
                return s.f14801b;
            case 2:
                return s.f14799a;
            case 3:
                return "text";
            case 4:
                return "metadata";
            case 5:
                return "camera motion";
            case 6:
                return "none";
            default:
                if (i10 < 10000) {
                    return "?";
                }
                return "custom (" + i10 + ")";
        }
    }

    public void A(c.a aVar, boolean z10, int i10) {
        c0(aVar, "state", z10 + ", " + V(i10));
    }

    public void B(c.a aVar, int i10) {
        c0(aVar, "audioSessionId", Integer.toString(i10));
    }

    public void C(c.a aVar) {
        b0(aVar, "drmSessionAcquired");
    }

    public void D(c.a aVar, int i10, long j10) {
        c0(aVar, "droppedFrames", Integer.toString(i10));
    }

    public void E(c.a aVar) {
        b0(aVar, "seekStarted");
    }

    public void F(c.a aVar, int i10, int i11, int i12, float f10) {
        c0(aVar, "videoSizeChanged", i10 + ", " + i11);
    }

    public void G(c.a aVar, int i10, e eVar) {
        c0(aVar, "decoderEnabled", a0(i10));
    }

    public void H(c.a aVar) {
        b0(aVar, "drmKeysRemoved");
    }

    public void I(c.a aVar, @o0 Surface surface) {
        c0(aVar, "renderedFirstFrame", String.valueOf(surface));
    }

    public /* synthetic */ void J(c.a aVar, d6.c cVar) {
        b.a(this, aVar, cVar);
    }

    public void K(c.a aVar, Exception exc) {
        h0(aVar, "drmSessionManagerError", exc);
    }

    public void L(c.a aVar, i0.b bVar, i0.c cVar) {
    }

    public void M(c.a aVar, Metadata metadata) {
        d0("metadata [" + S(aVar) + ", ");
        i0(metadata, q.a.R);
        d0("]");
    }

    public void N(c.a aVar, i0.c cVar) {
        c0(aVar, "upstreamDiscarded", Format.L(cVar.f4541c));
    }

    public final String Q(c.a aVar, String str) {
        return str + " [" + S(aVar) + "]";
    }

    public final String R(c.a aVar, String str, String str2) {
        return str + " [" + S(aVar) + ", " + str2 + "]";
    }

    public final String S(c.a aVar) {
        String str = "window=" + aVar.f4884c;
        if (aVar.f4885d != null) {
            str = str + ", period=" + aVar.f4883b.b(aVar.f4885d.f4733a);
            if (aVar.f4885d.b()) {
                str = (str + ", adGroup=" + aVar.f4885d.f4734b) + ", ad=" + aVar.f4885d.f4735c;
            }
        }
        return W(aVar.f4882a - this.f14753e) + ", " + W(aVar.f4887f) + ", " + str;
    }

    public void a(c.a aVar, i0.b bVar, i0.c cVar) {
    }

    public void b(c.a aVar) {
        b0(aVar, "mediaPeriodReadingStarted");
    }

    public final void b0(c.a aVar, String str) {
        d0(Q(aVar, str));
    }

    public void c(c.a aVar, int i10, String str, long j10) {
        c0(aVar, "decoderInitialized", a0(i10) + ", " + str);
    }

    public final void c0(c.a aVar, String str, String str2) {
        d0(R(aVar, str, str2));
    }

    public void d(c.a aVar, int i10, long j10, long j11) {
        e0(aVar, "audioTrackUnderrun", i10 + ", " + j10 + ", " + j11 + "]", (Throwable) null);
    }

    public void d0(String str) {
        p.b(this.f14750b, str);
    }

    public void e(c.a aVar, int i10, long j10, long j11) {
    }

    public final void e0(c.a aVar, String str, String str2, @o0 Throwable th2) {
        g0(R(aVar, str, str2), th2);
    }

    public /* synthetic */ void f(c.a aVar, float f10) {
        b.N(this, aVar, f10);
    }

    public final void f0(c.a aVar, String str, @o0 Throwable th2) {
        g0(Q(aVar, str), th2);
    }

    public void g(c.a aVar, boolean z10) {
        c0(aVar, "loading", Boolean.toString(z10));
    }

    public void g0(String str, @o0 Throwable th2) {
        p.e(this.f14750b, str, th2);
    }

    public void h(c.a aVar, l0 l0Var) {
        c0(aVar, "playbackParameters", q0.E("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(l0Var.f4402a), Float.valueOf(l0Var.f4403b), Boolean.valueOf(l0Var.f4404c)));
    }

    public final void h0(c.a aVar, String str, Exception exc) {
        e0(aVar, "internalError", str, exc);
    }

    public void i(c.a aVar, int i10, Format format) {
        c0(aVar, "decoderInputFormatChanged", a0(i10) + ", " + Format.L(format));
    }

    public final void i0(Metadata metadata, String str) {
        for (int i10 = 0; i10 < metadata.d(); i10++) {
            d0(str + metadata.c(i10));
        }
    }

    public void j(c.a aVar, int i10) {
        c0(aVar, "positionDiscontinuity", P(i10));
    }

    public void k(c.a aVar) {
        b0(aVar, "seekProcessed");
    }

    public void l(c.a aVar, int i10) {
        c0(aVar, "repeatMode", U(i10));
    }

    public void m(c.a aVar) {
        b0(aVar, "drmKeysLoaded");
    }

    public void n(c.a aVar, i0.b bVar, i0.c cVar) {
    }

    public void o(c.a aVar) {
        b0(aVar, "mediaPeriodReleased");
    }

    public void p(c.a aVar, i0.b bVar, i0.c cVar, IOException iOException, boolean z10) {
        h0(aVar, "loadError", iOException);
    }

    public void q(c.a aVar, int i10, e eVar) {
        c0(aVar, "decoderDisabled", a0(i10));
    }

    public void r(c.a aVar, TrackGroupArray trackGroupArray, m mVar) {
        String str;
        String str2;
        int i10;
        d dVar = this.f14749a;
        d.a g10 = dVar != null ? dVar.g() : null;
        if (g10 == null) {
            c0(aVar, "tracksChanged", c0.f21474n);
            return;
        }
        c.a aVar2 = aVar;
        d0("tracksChanged [" + S(aVar) + ", ");
        int c10 = g10.c();
        int i11 = 0;
        while (true) {
            str = "  ]";
            str2 = " [";
            if (i11 >= c10) {
                break;
            }
            TrackGroupArray g11 = g10.g(i11);
            f a10 = mVar.a(i11);
            if (g11.O > 0) {
                StringBuilder sb2 = new StringBuilder();
                i10 = c10;
                sb2.append("  Renderer:");
                sb2.append(i11);
                sb2.append(str2);
                d0(sb2.toString());
                int i12 = 0;
                while (i12 < g11.O) {
                    TrackGroup a11 = g11.a(i12);
                    TrackGroupArray trackGroupArray2 = g11;
                    String str3 = str;
                    String O = O(a11.O, g10.a(i11, i12, false));
                    d0("    Group:" + i12 + ", adaptive_supported=" + O + str2);
                    int i13 = 0;
                    while (i13 < a11.O) {
                        String Y = Y(a10, a11, i13);
                        String T = T(g10.h(i11, i12, i13));
                        String str4 = str2;
                        d0("      " + Y + " Track:" + i13 + ", " + Format.L(a11.a(i13)) + ", supported=" + T);
                        i13++;
                        str2 = str4;
                    }
                    String str5 = str2;
                    d0("    ]");
                    i12++;
                    m mVar2 = mVar;
                    g11 = trackGroupArray2;
                    str = str3;
                }
                String str6 = str;
                if (a10 != null) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= a10.length()) {
                            break;
                        }
                        Metadata metadata = a10.f(i14).U;
                        if (metadata != null) {
                            d0("    Metadata [");
                            i0(metadata, "      ");
                            d0("    ]");
                            break;
                        }
                        i14++;
                    }
                }
                d0(str6);
            } else {
                i10 = c10;
            }
            i11++;
            c10 = i10;
        }
        String str7 = str;
        String str8 = str2;
        TrackGroupArray l10 = g10.l();
        if (l10.O > 0) {
            d0("  Renderer:None [");
            int i15 = 0;
            while (i15 < l10.O) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("    Group:");
                sb3.append(i15);
                String str9 = str8;
                sb3.append(str9);
                d0(sb3.toString());
                TrackGroup a12 = l10.a(i15);
                for (int i16 = 0; i16 < a12.O; i16++) {
                    String Z = Z(false);
                    String T2 = T(0);
                    d0("      " + Z + " Track:" + i16 + ", " + Format.L(a12.a(i16)) + ", supported=" + T2);
                }
                d0("    ]");
                i15++;
                str8 = str9;
            }
            d0(str7);
        }
        d0("]");
    }

    public void s(c.a aVar, int i10, int i11) {
        c0(aVar, "surfaceSizeChanged", i10 + ", " + i11);
    }

    public void t(c.a aVar, int i10) {
        int i11 = aVar.f4883b.i();
        int q10 = aVar.f4883b.q();
        d0("timelineChanged [" + S(aVar) + ", periodCount=" + i11 + ", windowCount=" + q10 + ", reason=" + X(i10));
        for (int i12 = 0; i12 < Math.min(i11, 3); i12++) {
            aVar.f4883b.f(i12, this.f14752d);
            d0("  period [" + W(this.f14752d.h()) + "]");
        }
        if (i11 > 3) {
            d0("  ...");
        }
        for (int i13 = 0; i13 < Math.min(q10, 3); i13++) {
            aVar.f4883b.n(i13, this.f14751c);
            d0("  window [" + W(this.f14751c.c()) + ", " + this.f14751c.f4501d + ", " + this.f14751c.f4502e + "]");
        }
        if (q10 > 3) {
            d0("  ...");
        }
        d0("]");
    }

    public void u(c.a aVar, i iVar) {
        f0(aVar, "playerFailed", iVar);
    }

    public void v(c.a aVar) {
        b0(aVar, "mediaPeriodCreated");
    }

    public void w(c.a aVar, i0.c cVar) {
        c0(aVar, "downstreamFormatChanged", Format.L(cVar.f4541c));
    }

    public void x(c.a aVar, boolean z10) {
        c0(aVar, "shuffleModeEnabled", Boolean.toString(z10));
    }

    public void y(c.a aVar) {
        b0(aVar, "drmSessionReleased");
    }

    public void z(c.a aVar) {
        b0(aVar, "drmKeysRestored");
    }
}
