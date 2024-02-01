package t6;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import d.o0;
import t6.d;
import w7.p;
import w7.q0;
import w7.s;

public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static final String f12962j = "MediaCodecInfo";

    /* renamed from: k  reason: collision with root package name */
    public static final int f12963k = -1;

    /* renamed from: a  reason: collision with root package name */
    public final String f12964a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final String f12965b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final String f12966c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f12967d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12968e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12969f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f12970g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12971h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f12972i;

    public a(String str, @o0 String str2, @o0 String str3, @o0 MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        this.f12964a = (String) w7.a.g(str);
        this.f12965b = str2;
        this.f12966c = str3;
        this.f12967d = codecCapabilities;
        this.f12971h = z10;
        boolean z13 = true;
        this.f12968e = !z11 && codecCapabilities != null && g(codecCapabilities);
        this.f12969f = codecCapabilities != null && q(codecCapabilities);
        if (!z12 && (codecCapabilities == null || !o(codecCapabilities))) {
            z13 = false;
        }
        this.f12970g = z13;
        this.f12972i = s.n(str2);
    }

    public static int a(String str, String str2, int i10) {
        if (i10 > 1 || ((q0.f14786a >= 26 && i10 > 0) || s.f14838w.equals(str2) || s.M.equals(str2) || s.N.equals(str2) || s.f14836u.equals(str2) || s.K.equals(str2) || s.L.equals(str2) || s.f14841z.equals(str2) || s.O.equals(str2) || s.A.equals(str2) || s.B.equals(str2) || s.Q.equals(str2))) {
            return i10;
        }
        int i11 = s.C.equals(str2) ? 6 : s.D.equals(str2) ? 16 : 30;
        p.l(f12962j, "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    @TargetApi(21)
    public static boolean c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        return (d10 == -1.0d || d10 <= 0.0d) ? videoCapabilities.isSizeSupported(i10, i11) : videoCapabilities.areSizeAndRateSupported(i10, i11, Math.floor(d10));
    }

    @TargetApi(23)
    public static int e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    public static boolean g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return q0.f14786a >= 19 && h(codecCapabilities);
    }

    @TargetApi(19)
    public static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean o(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return q0.f14786a >= 21 && p(codecCapabilities);
    }

    @TargetApi(21)
    public static boolean p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return q0.f14786a >= 21 && r(codecCapabilities);
    }

    @TargetApi(21)
    public static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static a v(String str, String str2, String str3, @o0 MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        return new a(str, str2, str3, codecCapabilities, false, z10, z11);
    }

    public static a w(String str) {
        return new a(str, (String) null, (String) null, (MediaCodecInfo.CodecCapabilities) null, true, false, false);
    }

    @TargetApi(21)
    public Point b(int i10, int i11) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12967d;
        if (codecCapabilities == null) {
            str = "align.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "align.vCaps";
            } else {
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                return new Point(q0.n(i10, widthAlignment) * widthAlignment, q0.n(i11, heightAlignment) * heightAlignment);
            }
        }
        u(str);
        return null;
    }

    public int d() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (q0.f14786a < 23 || (codecCapabilities = this.f12967d) == null) {
            return -1;
        }
        return e(codecCapabilities);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.MediaCodecInfo.CodecProfileLevel[] f() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f12967d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.a.f():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    @TargetApi(21)
    public boolean i(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12967d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else if (a(this.f12964a, this.f12965b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
                return true;
            } else {
                str = "channelCount.support, " + i10;
            }
        }
        u(str);
        return false;
    }

    @TargetApi(21)
    public boolean j(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12967d;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i10)) {
                return true;
            } else {
                str = "sampleRate.support, " + i10;
            }
        }
        u(str);
        return false;
    }

    public boolean k(String str) {
        String d10;
        StringBuilder sb2;
        String str2;
        if (str == null || this.f12965b == null || (d10 = s.d(str)) == null) {
            return true;
        }
        if (!this.f12965b.equals(d10)) {
            sb2 = new StringBuilder();
            str2 = "codec.mime ";
        } else {
            Pair<Integer, Integer> g10 = d.g(str);
            if (g10 == null) {
                return true;
            }
            int intValue = ((Integer) g10.first).intValue();
            int intValue2 = ((Integer) g10.second).intValue();
            if (!this.f12972i && intValue != 42) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : f()) {
                if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                    return true;
                }
            }
            sb2 = new StringBuilder();
            str2 = "codec.profileLevel, ";
        }
        sb2.append(str2);
        sb2.append(str);
        sb2.append(", ");
        sb2.append(d10);
        u(sb2.toString());
        return false;
    }

    public boolean l(Format format) throws d.c {
        int i10;
        boolean z10 = false;
        if (!k(format.T)) {
            return false;
        }
        if (this.f12972i) {
            int i11 = format.f5069b0;
            if (i11 <= 0 || (i10 = format.f5070c0) <= 0) {
                return true;
            }
            if (q0.f14786a >= 21) {
                return s(i11, i10, (double) format.f5071d0);
            }
            if (i11 * i10 <= d.o()) {
                z10 = true;
            }
            if (!z10) {
                u("legacyFrameSize, " + format.f5069b0 + "x" + format.f5070c0);
            }
            return z10;
        }
        if (q0.f14786a >= 21) {
            int i12 = format.f5078k0;
            if (i12 != -1 && !j(i12)) {
                return false;
            }
            int i13 = format.f5077j0;
            if (i13 != -1 && !i(i13)) {
                return false;
            }
        }
        return true;
    }

    public boolean m(Format format) {
        if (this.f12972i) {
            return this.f12968e;
        }
        Pair<Integer, Integer> g10 = d.g(format.T);
        return g10 != null && ((Integer) g10.first).intValue() == 42;
    }

    public boolean n(Format format, Format format2, boolean z10) {
        if (this.f12972i) {
            return format.W.equals(format2.W) && format.f5072e0 == format2.f5072e0 && (this.f12968e || (format.f5069b0 == format2.f5069b0 && format.f5070c0 == format2.f5070c0)) && ((!z10 && format2.f5076i0 == null) || q0.e(format.f5076i0, format2.f5076i0));
        }
        if (s.f14836u.equals(this.f12965b) && format.W.equals(format2.W) && format.f5077j0 == format2.f5077j0 && format.f5078k0 == format2.f5078k0) {
            Pair<Integer, Integer> g10 = d.g(format.T);
            Pair<Integer, Integer> g11 = d.g(format2.T);
            if (!(g10 == null || g11 == null)) {
                return ((Integer) g10.first).intValue() == 42 && ((Integer) g11.first).intValue() == 42;
            }
        }
        return false;
    }

    @TargetApi(21)
    public boolean s(int i10, int i11, double d10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12967d;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else if (c(videoCapabilities, i10, i11, d10)) {
                return true;
            } else {
                if (i10 >= i11 || !c(videoCapabilities, i11, i10, d10)) {
                    str = "sizeAndRate.support, " + i10 + "x" + i11 + "x" + d10;
                } else {
                    t("sizeAndRate.rotated, " + i10 + "x" + i11 + "x" + d10);
                    return true;
                }
            }
        }
        u(str);
        return false;
    }

    public final void t(String str) {
        p.b(f12962j, "AssumedSupport [" + str + "] [" + this.f12964a + ", " + this.f12965b + "] [" + q0.f14790e + "]");
    }

    public String toString() {
        return this.f12964a;
    }

    public final void u(String str) {
        p.b(f12962j, "NoSupport [" + str + "] [" + this.f12964a + ", " + this.f12965b + "] [" + q0.f14790e + "]");
    }
}
