package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import d.m0;
import d.o0;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k3.h;

public class AudioAttributesCompat implements h {
    public static final SparseIntArray A;
    public static boolean B = false;
    public static final int[] C = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 4;
    public static final int G = 8;
    public static final int H = 16;
    public static final int I = 32;
    public static final int J = 64;
    public static final int K = 128;
    public static final int L = 256;
    public static final int M = 512;
    public static final int N = 1023;
    public static final int O = 273;
    public static final int P = -1;
    public static final String Q = "androidx.media.audio_attrs.FRAMEWORKS";
    public static final String R = "androidx.media.audio_attrs.USAGE";
    public static final String S = "androidx.media.audio_attrs.CONTENT_TYPE";
    public static final String T = "androidx.media.audio_attrs.FLAGS";
    public static final String U = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE";

    /* renamed from: b  reason: collision with root package name */
    public static final String f2872b = "AudioAttributesCompat";

    /* renamed from: c  reason: collision with root package name */
    public static final int f2873c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f2874d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f2875e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f2876f = 3;

    /* renamed from: g  reason: collision with root package name */
    public static final int f2877g = 4;

    /* renamed from: h  reason: collision with root package name */
    public static final int f2878h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f2879i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f2880j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f2881k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f2882l = 4;

    /* renamed from: m  reason: collision with root package name */
    public static final int f2883m = 5;

    /* renamed from: n  reason: collision with root package name */
    public static final int f2884n = 6;

    /* renamed from: o  reason: collision with root package name */
    public static final int f2885o = 7;

    /* renamed from: p  reason: collision with root package name */
    public static final int f2886p = 8;

    /* renamed from: q  reason: collision with root package name */
    public static final int f2887q = 9;

    /* renamed from: r  reason: collision with root package name */
    public static final int f2888r = 10;

    /* renamed from: s  reason: collision with root package name */
    public static final int f2889s = 11;

    /* renamed from: t  reason: collision with root package name */
    public static final int f2890t = 12;

    /* renamed from: u  reason: collision with root package name */
    public static final int f2891u = 13;

    /* renamed from: v  reason: collision with root package name */
    public static final int f2892v = 14;

    /* renamed from: w  reason: collision with root package name */
    public static final int f2893w = 15;

    /* renamed from: x  reason: collision with root package name */
    public static final int f2894x = 16;

    /* renamed from: y  reason: collision with root package name */
    public static final int f2895y = 1;

    /* renamed from: z  reason: collision with root package name */
    public static final int f2896z = 2;
    @x0({x0.a.P})

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f2897a;

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public static final int f2898a = 6;

        /* renamed from: b  reason: collision with root package name */
        public static final int f2899b = 7;

        /* renamed from: c  reason: collision with root package name */
        public static final int f2900c = 9;

        /* renamed from: d  reason: collision with root package name */
        public static final int f2901d = 10;
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f2902a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f2903b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2904c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2905d = -1;

        public d() {
        }

        public d(AudioAttributesCompat audioAttributesCompat) {
            this.f2902a = audioAttributesCompat.i();
            this.f2903b = audioAttributesCompat.k();
            this.f2904c = audioAttributesCompat.j();
            this.f2905d = audioAttributesCompat.h();
        }

        public AudioAttributesCompat a() {
            AudioAttributesImpl audioAttributesImpl;
            if (!AudioAttributesCompat.B) {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2903b).setFlags(this.f2904c).setUsage(this.f2902a);
                int i10 = this.f2905d;
                if (i10 != -1) {
                    usage.setLegacyStreamType(i10);
                }
                audioAttributesImpl = new AudioAttributesImplApi21(usage.build(), this.f2905d);
            } else {
                audioAttributesImpl = new AudioAttributesImplBase(this.f2903b, this.f2904c, this.f2902a, this.f2905d);
            }
            return new AudioAttributesCompat(audioAttributesImpl);
        }

        public d b(int i10) {
            if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                this.f2903b = i10;
            } else {
                this.f2902a = 0;
            }
            return this;
        }

        public d c(int i10) {
            this.f2904c = (i10 & 1023) | this.f2904c;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
            r3.f2903b = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
            r3.f2903b = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
            r3.f2902a = androidx.media.AudioAttributesCompat.n(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
            return r3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.media.AudioAttributesCompat.d d(int r4) {
            /*
                r3 = this;
                r0 = 1
                r1 = 4
                switch(r4) {
                    case 0: goto L_0x002b;
                    case 1: goto L_0x0028;
                    case 2: goto L_0x0028;
                    case 3: goto L_0x0026;
                    case 4: goto L_0x0028;
                    case 5: goto L_0x0028;
                    case 6: goto L_0x001e;
                    case 7: goto L_0x0018;
                    case 8: goto L_0x0028;
                    case 9: goto L_0x0028;
                    case 10: goto L_0x002b;
                    default: goto L_0x0005;
                }
            L_0x0005:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Invalid stream type "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " for AudioAttributesCompat"
                r0.append(r1)
                goto L_0x002d
            L_0x0018:
                int r2 = r3.f2904c
                r0 = r0 | r2
                r3.f2904c = r0
                goto L_0x0028
            L_0x001e:
                r3.f2903b = r0
                int r0 = r3.f2904c
                r0 = r0 | r1
                r3.f2904c = r0
                goto L_0x002d
            L_0x0026:
                r0 = 2
                goto L_0x002b
            L_0x0028:
                r3.f2903b = r1
                goto L_0x002d
            L_0x002b:
                r3.f2903b = r0
            L_0x002d:
                int r4 = androidx.media.AudioAttributesCompat.n(r4)
                r3.f2902a = r4
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media.AudioAttributesCompat.d.d(int):androidx.media.AudioAttributesCompat$d");
        }

        public d e(int i10) {
            if (i10 != 10) {
                this.f2905d = i10;
                return d(i10);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        public d f(int i10) {
            switch (i10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                case 16:
                    if (AudioAttributesCompat.B || Build.VERSION.SDK_INT <= 25) {
                        i10 = 12;
                        break;
                    }
                default:
                    i10 = 0;
                    break;
            }
            this.f2902a = i10;
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f2897a = audioAttributesImpl;
    }

    @x0({x0.a.P})
    public static AudioAttributesCompat b(Bundle bundle) {
        AudioAttributesImpl b10 = AudioAttributesImplApi21.b(bundle);
        if (b10 == null) {
            return null;
        }
        return new AudioAttributesCompat(b10);
    }

    @x0({x0.a.P})
    public static void c(boolean z10) {
        B = z10;
    }

    public static int d(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            return z10 ? 1 : 7;
        }
        if ((i10 & 4) == 4) {
            return z10 ? 0 : 6;
        }
        switch (i11) {
            case 0:
                return z10 ? Integer.MIN_VALUE : 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z10 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z10) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i11 + " in audio attributes");
        }
    }

    public static int e(boolean z10, AudioAttributesCompat audioAttributesCompat) {
        return d(z10, audioAttributesCompat.j(), audioAttributesCompat.i());
    }

    public static int n(int i10) {
        switch (i10) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    public static String o(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                return "unknown usage " + i10;
        }
    }

    @o0
    public static AudioAttributesCompat p(@m0 Object obj) {
        if (B) {
            return null;
        }
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21((AudioAttributes) obj);
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f2897a = audioAttributesImplApi21;
        return audioAttributesCompat;
    }

    @x0({x0.a.P})
    @m0
    public Bundle a() {
        return this.f2897a.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f2897a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f2897a;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public int g() {
        return this.f2897a.g();
    }

    public int h() {
        return this.f2897a.h();
    }

    public int hashCode() {
        return this.f2897a.hashCode();
    }

    public int i() {
        return this.f2897a.i();
    }

    public int j() {
        return this.f2897a.j();
    }

    public int k() {
        return this.f2897a.k();
    }

    public int l() {
        return this.f2897a.l();
    }

    @o0
    public Object m() {
        return this.f2897a.f();
    }

    public String toString() {
        return this.f2897a.toString();
    }
}
