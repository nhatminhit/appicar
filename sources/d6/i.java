package d6;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import d.g1;
import d.o0;
import d.t0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import w7.p;
import w7.q0;
import w7.s;

public final class i {

    /* renamed from: j  reason: collision with root package name */
    public static final int f6368j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f6369k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final int f6370l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f6371m = -1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f6372n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f6373o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f6374p = 2;

    /* renamed from: q  reason: collision with root package name */
    public static final int f6375q = 3;

    /* renamed from: r  reason: collision with root package name */
    public static final String f6376r = "AudioFocusManager";

    /* renamed from: s  reason: collision with root package name */
    public static final float f6377s = 0.2f;

    /* renamed from: t  reason: collision with root package name */
    public static final float f6378t = 1.0f;

    /* renamed from: a  reason: collision with root package name */
    public final AudioManager f6379a;

    /* renamed from: b  reason: collision with root package name */
    public final b f6380b;

    /* renamed from: c  reason: collision with root package name */
    public final d f6381c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public c f6382d;

    /* renamed from: e  reason: collision with root package name */
    public int f6383e;

    /* renamed from: f  reason: collision with root package name */
    public int f6384f;

    /* renamed from: g  reason: collision with root package name */
    public float f6385g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public AudioFocusRequest f6386h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6387i;

    public class b implements AudioManager.OnAudioFocusChangeListener {
        public b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAudioFocusChange(int r6) {
            /*
                r5 = this;
                r0 = -3
                r1 = 3
                r2 = 2
                r3 = -1
                r4 = 1
                if (r6 == r0) goto L_0x0037
                r0 = -2
                if (r6 == r0) goto L_0x0031
                if (r6 == r3) goto L_0x002b
                if (r6 == r4) goto L_0x0025
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unknown focus change type: "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                java.lang.String r0 = "AudioFocusManager"
                w7.p.l(r0, r6)
                return
            L_0x0025:
                d6.i r6 = d6.i.this
                int unused = r6.f6383e = r4
                goto L_0x0045
            L_0x002b:
                d6.i r6 = d6.i.this
                int unused = r6.f6383e = r3
                goto L_0x0045
            L_0x0031:
                d6.i r6 = d6.i.this
                int unused = r6.f6383e = r2
                goto L_0x0045
            L_0x0037:
                d6.i r6 = d6.i.this
                boolean r6 = r6.w()
                if (r6 == 0) goto L_0x0040
                goto L_0x0031
            L_0x0040:
                d6.i r6 = d6.i.this
                int unused = r6.f6383e = r1
            L_0x0045:
                d6.i r6 = d6.i.this
                int r6 = r6.f6383e
                if (r6 == r3) goto L_0x0088
                if (r6 == 0) goto L_0x0096
                if (r6 == r4) goto L_0x007e
                if (r6 == r2) goto L_0x0073
                if (r6 != r1) goto L_0x0056
                goto L_0x0096
            L_0x0056:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unknown audio focus state: "
                r0.append(r1)
                d6.i r1 = d6.i.this
                int r1 = r1.f6383e
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L_0x0073:
                d6.i r6 = d6.i.this
                d6.i$d r6 = r6.f6381c
                r0 = 0
                r6.h(r0)
                goto L_0x0096
            L_0x007e:
                d6.i r6 = d6.i.this
                d6.i$d r6 = r6.f6381c
                r6.h(r4)
                goto L_0x0096
            L_0x0088:
                d6.i r6 = d6.i.this
                d6.i$d r6 = r6.f6381c
                r6.h(r3)
                d6.i r6 = d6.i.this
                r6.b(r4)
            L_0x0096:
                d6.i r6 = d6.i.this
                int r6 = r6.f6383e
                if (r6 != r1) goto L_0x00a2
                r6 = 1045220557(0x3e4ccccd, float:0.2)
                goto L_0x00a4
            L_0x00a2:
                r6 = 1065353216(0x3f800000, float:1.0)
            L_0x00a4:
                d6.i r0 = d6.i.this
                float r0 = r0.f6385g
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 == 0) goto L_0x00bc
                d6.i r0 = d6.i.this
                float unused = r0.f6385g = r6
                d6.i r0 = d6.i.this
                d6.i$d r0 = r0.f6381c
                r0.f(r6)
            L_0x00bc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d6.i.b.onAudioFocusChange(int):void");
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public interface d {
        void f(float f10);

        void h(int i10);
    }

    public i(Context context, d dVar) {
        this.f6379a = (AudioManager) context.getApplicationContext().getSystemService(s.f14801b);
        this.f6381c = dVar;
        this.f6380b = new b();
        this.f6383e = 0;
    }

    public static int l(@o0 c cVar) {
        if (cVar == null) {
            return 0;
        }
        switch (cVar.f6274c) {
            case 0:
                p.l(f6376r, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (cVar.f6272a == 1) {
                    return 2;
                }
                break;
            case 16:
                return q0.f14786a >= 19 ? 4 : 2;
            default:
                p.l(f6376r, "Unidentified audio usage: " + cVar.f6274c);
                return 0;
        }
        return 3;
    }

    public final void a() {
        b(false);
    }

    public final void b(boolean z10) {
        int i10 = this.f6384f;
        if (i10 != 0 || this.f6383e != 0) {
            if (i10 != 1 || this.f6383e == -1 || z10) {
                if (q0.f14786a >= 26) {
                    d();
                } else {
                    c();
                }
                this.f6383e = 0;
            }
        }
    }

    public final void c() {
        this.f6379a.abandonAudioFocus(this.f6380b);
    }

    @t0(26)
    public final void d() {
        AudioFocusRequest audioFocusRequest = this.f6386h;
        if (audioFocusRequest != null) {
            int unused = this.f6379a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    @g1
    public AudioManager.OnAudioFocusChangeListener m() {
        return this.f6380b;
    }

    public float n() {
        return this.f6385g;
    }

    public final int o(boolean z10) {
        return z10 ? 1 : -1;
    }

    public int p(boolean z10) {
        if (z10) {
            return s();
        }
        return -1;
    }

    public int q(boolean z10, int i10) {
        if (z10) {
            return i10 == 1 ? o(z10) : s();
        }
        a();
        return -1;
    }

    public void r() {
        b(true);
    }

    public final int s() {
        if (this.f6384f == 0) {
            if (this.f6383e != 0) {
                b(true);
            }
            return 1;
        }
        if (this.f6383e == 0) {
            this.f6383e = (q0.f14786a >= 26 ? u() : t()) == 1 ? 1 : 0;
        }
        int i10 = this.f6383e;
        if (i10 == 0) {
            return -1;
        }
        return i10 == 2 ? 0 : 1;
    }

    public final int t() {
        return this.f6379a.requestAudioFocus(this.f6380b, q0.e0(((c) w7.a.g(this.f6382d)).f6274c), this.f6384f);
    }

    @t0(26)
    public final int u() {
        AudioFocusRequest audioFocusRequest = this.f6386h;
        if (audioFocusRequest == null || this.f6387i) {
            this.f6386h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f6384f) : new AudioFocusRequest.Builder(this.f6386h)).setAudioAttributes(((c) w7.a.g(this.f6382d)).a()).setWillPauseWhenDucked(w()).setOnAudioFocusChangeListener(this.f6380b).build();
            this.f6387i = false;
        }
        return this.f6379a.requestAudioFocus(this.f6386h);
    }

    public int v(@o0 c cVar, boolean z10, int i10) {
        if (!q0.e(this.f6382d, cVar)) {
            this.f6382d = cVar;
            int l10 = l(cVar);
            this.f6384f = l10;
            w7.a.b(l10 == 1 || l10 == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
            if (z10 && (i10 == 2 || i10 == 3)) {
                return s();
            }
        }
        return i10 == 1 ? o(z10) : p(z10);
    }

    public final boolean w() {
        c cVar = this.f6382d;
        return cVar != null && cVar.f6272a == 1;
    }
}
