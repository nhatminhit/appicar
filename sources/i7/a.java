package i7;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d6.b0;
import h7.b;
import h7.e;
import h7.g;
import h7.i;
import h7.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p7.f;
import w7.p;
import w7.s;
import w7.w;

public final class a extends e {
    public static final int A = 2;
    public static final int B = 1;
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    public static final int[] K = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] L = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] M = {-1, -16711936, -16776961, -16711681, s0.a.f12612c, -256, -65281};
    public static final int N = 7;
    public static final int O = 8;
    public static final int P = 4;
    public static final byte Q = -4;
    public static final byte R = 32;
    public static final byte S = 33;
    public static final byte T = 36;
    public static final byte U = 37;
    public static final byte V = 38;
    public static final byte W = 39;
    public static final byte X = 41;
    public static final byte Y = 42;
    public static final byte Z = 43;

    /* renamed from: a0  reason: collision with root package name */
    public static final byte f9185a0 = 44;

    /* renamed from: b0  reason: collision with root package name */
    public static final byte f9186b0 = 45;

    /* renamed from: c0  reason: collision with root package name */
    public static final byte f9187c0 = 46;

    /* renamed from: d0  reason: collision with root package name */
    public static final byte f9188d0 = 47;

    /* renamed from: e0  reason: collision with root package name */
    public static final int[] f9189e0 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, dg.a.f17890cg, 93, dg.a.f18036jg, dg.a.f18247tg, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, dg.a.Zg, 209, 241, 9632};

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f9190f0 = {174, 176, 189, dg.a.Be, 8482, dg.a.f18075ld, 163, 9834, 224, 32, dg.a.f17848ag, dg.a.If, dg.a.f17974gg, dg.a.f18141og, dg.a.f18289vg, 251};

    /* renamed from: g0  reason: collision with root package name */
    public static final int[] f9191g0 = {193, 201, dg.a.f1if, 218, dg.a.f18331xf, dg.a.f18058kh, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, dg.a.Fe, dg.a.Oe, 200, dg.a.Ue, dg.a.Ve, dg.a.f17995hg, dg.a.f17847af, dg.a.f17868bf, dg.a.f18162pg, dg.a.f18056kf, 217, 249, dg.a.f18310wf, dg.a.Kd, 187};

    /* renamed from: h0  reason: collision with root package name */
    public static final int[] f9192h0 = {dg.a.Ke, dg.a.Jf, dg.a.Ze, dg.a.Ye, dg.a.f18015ig, dg.a.f17952ff, dg.a.f18226sg, dg.a.f18077lf, dg.a.Sg, 123, 125, 92, 94, 95, 124, 126, dg.a.Le, dg.a.Vf, dg.a.f18098mf, dg.a.Tg, dg.a.Af, dg.a.f18244td, dg.a.f18223sd, 9474, dg.a.Me, dg.a.Wf, dg.a.f18204rf, dg.a.f17849ah, 9484, 9488, 9492, 9496};

    /* renamed from: i0  reason: collision with root package name */
    public static final boolean[] f9193i0 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: y  reason: collision with root package name */
    public static final String f9194y = "Cea608Decoder";

    /* renamed from: z  reason: collision with root package name */
    public static final int f9195z = 4;

    /* renamed from: i  reason: collision with root package name */
    public final w f9196i = new w();

    /* renamed from: j  reason: collision with root package name */
    public final int f9197j;

    /* renamed from: k  reason: collision with root package name */
    public final int f9198k;

    /* renamed from: l  reason: collision with root package name */
    public final int f9199l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<C0156a> f9200m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public C0156a f9201n = new C0156a(0, 4);

    /* renamed from: o  reason: collision with root package name */
    public List<b> f9202o;

    /* renamed from: p  reason: collision with root package name */
    public List<b> f9203p;

    /* renamed from: q  reason: collision with root package name */
    public int f9204q;

    /* renamed from: r  reason: collision with root package name */
    public int f9205r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9206s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9207t;

    /* renamed from: u  reason: collision with root package name */
    public byte f9208u;

    /* renamed from: v  reason: collision with root package name */
    public byte f9209v;

    /* renamed from: w  reason: collision with root package name */
    public int f9210w = 0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f9211x;

    /* renamed from: i7.a$a  reason: collision with other inner class name */
    public static class C0156a {

        /* renamed from: i  reason: collision with root package name */
        public static final int f9212i = 32;

        /* renamed from: j  reason: collision with root package name */
        public static final int f9213j = 15;

        /* renamed from: a  reason: collision with root package name */
        public final List<C0157a> f9214a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<SpannableString> f9215b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final StringBuilder f9216c = new StringBuilder();

        /* renamed from: d  reason: collision with root package name */
        public int f9217d;

        /* renamed from: e  reason: collision with root package name */
        public int f9218e;

        /* renamed from: f  reason: collision with root package name */
        public int f9219f;

        /* renamed from: g  reason: collision with root package name */
        public int f9220g;

        /* renamed from: h  reason: collision with root package name */
        public int f9221h;

        /* renamed from: i7.a$a$a  reason: collision with other inner class name */
        public static class C0157a {

            /* renamed from: a  reason: collision with root package name */
            public final int f9222a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f9223b;

            /* renamed from: c  reason: collision with root package name */
            public int f9224c;

            public C0157a(int i10, boolean z10, int i11) {
                this.f9222a = i10;
                this.f9223b = z10;
                this.f9224c = i11;
            }
        }

        public C0156a(int i10, int i11) {
            j(i10);
            m(i11);
        }

        public static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
            }
        }

        public static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        public static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            this.f9216c.append(c10);
        }

        public void f() {
            int length = this.f9216c.length();
            if (length > 0) {
                this.f9216c.delete(length - 1, length);
                int size = this.f9214a.size() - 1;
                while (size >= 0) {
                    C0157a aVar = this.f9214a.get(size);
                    int i10 = aVar.f9224c;
                    if (i10 == length) {
                        aVar.f9224c = i10 - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        public b g(int i10) {
            float f10;
            int i11;
            int i12;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f9215b.size(); i13++) {
                spannableStringBuilder.append(this.f9215b.get(i13));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i14 = this.f9218e + this.f9219f;
            int length = (32 - i14) - spannableStringBuilder.length();
            int i15 = i14 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f9220g != 2 || (Math.abs(i15) >= 3 && length >= 0)) ? (this.f9220g != 2 || i15 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i14 = 32 - length;
                }
                f10 = ((((float) i14) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            float f11 = f10;
            if (this.f9220g == 1 || (i12 = this.f9217d) > 7) {
                i12 = (this.f9217d - 15) - 2;
                i11 = 2;
            } else {
                i11 = 0;
            }
            return new b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (float) i12, 1, i11, f11, i10, Float.MIN_VALUE);
        }

        public final SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9216c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (i10 < this.f9214a.size()) {
                C0157a aVar = this.f9214a.get(i10);
                boolean z11 = aVar.f9223b;
                int i16 = aVar.f9222a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.M[i16];
                    }
                    z10 = z12;
                }
                int i17 = aVar.f9224c;
                i10++;
                if (i17 != (i10 < this.f9214a.size() ? this.f9214a.get(i10).f9224c : length)) {
                    if (i12 != -1 && !z11) {
                        q(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i17;
                    }
                    if (i13 != -1 && !z10) {
                        o(spannableStringBuilder, i13, i17);
                        i13 = -1;
                    } else if (i13 == -1 && z10) {
                        i13 = i17;
                    }
                    if (i15 != i14) {
                        n(spannableStringBuilder, i11, i17, i14);
                        i14 = i15;
                        i11 = i17;
                    }
                }
            }
            if (!(i12 == -1 || i12 == length)) {
                q(spannableStringBuilder, i12, length);
            }
            if (!(i13 == -1 || i13 == length)) {
                o(spannableStringBuilder, i13, length);
            }
            if (i11 != length) {
                n(spannableStringBuilder, i11, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean i() {
            return this.f9214a.isEmpty() && this.f9215b.isEmpty() && this.f9216c.length() == 0;
        }

        public void j(int i10) {
            this.f9220g = i10;
            this.f9214a.clear();
            this.f9215b.clear();
            this.f9216c.setLength(0);
            this.f9217d = 15;
            this.f9218e = 0;
            this.f9219f = 0;
        }

        public void k() {
            this.f9215b.add(h());
            this.f9216c.setLength(0);
            this.f9214a.clear();
            int min = Math.min(this.f9221h, this.f9217d);
            while (this.f9215b.size() >= min) {
                this.f9215b.remove(0);
            }
        }

        public void l(int i10) {
            this.f9220g = i10;
        }

        public void m(int i10) {
            this.f9221h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f9214a.add(new C0157a(i10, z10, this.f9216c.length()));
        }
    }

    public a(String str, int i10) {
        this.f9197j = s.f14812g0.equals(str) ? 2 : 3;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f9199l = 0;
                } else if (i10 != 4) {
                    p.l(f9194y, "Invalid channel. Defaulting to CC1.");
                } else {
                    this.f9199l = 1;
                }
                this.f9198k = 1;
                L(0);
                K();
                this.f9211x = true;
            }
            this.f9199l = 1;
            this.f9198k = 0;
            L(0);
            K();
            this.f9211x = true;
        }
        this.f9199l = 0;
        this.f9198k = 0;
        L(0);
        K();
        this.f9211x = true;
    }

    public static boolean A(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    public static boolean B(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    public static boolean C(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & w1.a.K6) == 64;
    }

    public static boolean D(byte b10) {
        return (b10 & 240) == 16;
    }

    public static boolean F(byte b10) {
        return (b10 & 247) == 20;
    }

    public static boolean G(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    public static boolean H(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    public static boolean I(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    public static char o(byte b10) {
        return (char) f9189e0[(b10 & Byte.MAX_VALUE) - 32];
    }

    public static int p(byte b10) {
        return (b10 >> 3) & 1;
    }

    public static char r(byte b10) {
        return (char) f9191g0[b10 & b0.f6265f];
    }

    public static char s(byte b10) {
        return (char) f9192h0[b10 & b0.f6265f];
    }

    public static char t(byte b10, byte b11) {
        return (b10 & 1) == 0 ? r(b11) : s(b11);
    }

    public static char u(byte b10) {
        return (char) f9190f0[b10 & 15];
    }

    public static boolean y(byte b10) {
        return (b10 & 224) == 0;
    }

    public static boolean z(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    public final boolean E(boolean z10, byte b10, byte b11) {
        if (!z10 || !D(b10)) {
            this.f9207t = false;
        } else if (this.f9207t && this.f9208u == b10 && this.f9209v == b11) {
            this.f9207t = false;
            return true;
        } else {
            this.f9207t = true;
            this.f9208u = b10;
            this.f9209v = b11;
        }
        return false;
    }

    public final void J(byte b10, byte b11) {
        if (!I(b10)) {
            if (F(b10)) {
                if (!(b11 == 32 || b11 == 47)) {
                    switch (b11) {
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (b11) {
                                case 41:
                                    break;
                                case 42:
                                case 43:
                                    break;
                                default:
                                    return;
                            }
                    }
                }
                this.f9211x = true;
                return;
            }
            return;
        }
        this.f9211x = false;
    }

    public final void K() {
        this.f9201n.j(this.f9204q);
        this.f9200m.clear();
        this.f9200m.add(this.f9201n);
    }

    public final void L(int i10) {
        int i11 = this.f9204q;
        if (i11 != i10) {
            this.f9204q = i10;
            if (i10 == 3) {
                for (int i12 = 0; i12 < this.f9200m.size(); i12++) {
                    this.f9200m.get(i12).l(i10);
                }
                return;
            }
            K();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f9202o = Collections.emptyList();
            }
        }
    }

    public final void M(int i10) {
        this.f9205r = i10;
        this.f9201n.m(i10);
    }

    public final boolean N(byte b10) {
        if (y(b10)) {
            this.f9210w = p(b10);
        }
        return this.f9210w == this.f9199l;
    }

    public void a() {
    }

    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    public e f() {
        List<b> list = this.f9202o;
        this.f9203p = list;
        return new f(list);
    }

    public void flush() {
        super.flush();
        this.f9202o = null;
        this.f9203p = null;
        L(0);
        M(4);
        K();
        this.f9206s = false;
        this.f9207t = false;
        this.f9208u = 0;
        this.f9209v = 0;
        this.f9210w = 0;
        this.f9211x = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0014 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(h7.i r10) {
        /*
            r9 = this;
            w7.w r0 = r9.f9196i
            java.nio.ByteBuffer r1 = r10.Q
            byte[] r1 = r1.array()
            java.nio.ByteBuffer r10 = r10.Q
            int r10 = r10.limit()
            r0.O(r1, r10)
            r10 = 0
            r0 = 1
            r1 = r10
        L_0x0014:
            w7.w r2 = r9.f9196i
            int r2 = r2.a()
            int r3 = r9.f9197j
            if (r2 < r3) goto L_0x00ec
            r2 = 2
            if (r3 != r2) goto L_0x0023
            r2 = -4
            goto L_0x002a
        L_0x0023:
            w7.w r2 = r9.f9196i
            int r2 = r2.D()
            byte r2 = (byte) r2
        L_0x002a:
            w7.w r3 = r9.f9196i
            int r3 = r3.D()
            w7.w r4 = r9.f9196i
            int r4 = r4.D()
            r5 = r2 & 2
            if (r5 == 0) goto L_0x003b
            goto L_0x0014
        L_0x003b:
            r5 = r2 & 1
            int r6 = r9.f9198k
            if (r5 == r6) goto L_0x0042
            goto L_0x0014
        L_0x0042:
            r5 = r3 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x004d
            if (r6 != 0) goto L_0x004d
            goto L_0x0014
        L_0x004d:
            boolean r7 = r9.f9206s
            r2 = r2 & 4
            r8 = 4
            if (r2 != r8) goto L_0x0060
            boolean[] r2 = f9193i0
            boolean r3 = r2[r3]
            if (r3 == 0) goto L_0x0060
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x0060
            r2 = r0
            goto L_0x0061
        L_0x0060:
            r2 = r10
        L_0x0061:
            r9.f9206s = r2
            boolean r2 = r9.E(r2, r5, r6)
            if (r2 == 0) goto L_0x006a
            goto L_0x0014
        L_0x006a:
            boolean r2 = r9.f9206s
            if (r2 != 0) goto L_0x0075
            if (r7 == 0) goto L_0x0014
            r9.K()
        L_0x0073:
            r1 = r0
            goto L_0x0014
        L_0x0075:
            r9.J(r5, r6)
            boolean r2 = r9.f9211x
            if (r2 != 0) goto L_0x007d
            goto L_0x0014
        L_0x007d:
            boolean r2 = r9.N(r5)
            if (r2 != 0) goto L_0x0084
            goto L_0x0014
        L_0x0084:
            boolean r1 = y(r5)
            if (r1 == 0) goto L_0x00d5
            boolean r1 = G(r5, r6)
            if (r1 == 0) goto L_0x0097
            i7.a$a r1 = r9.f9201n
            char r2 = u(r6)
            goto L_0x00e8
        L_0x0097:
            boolean r1 = z(r5, r6)
            if (r1 == 0) goto L_0x00a9
            i7.a$a r1 = r9.f9201n
            r1.f()
            i7.a$a r1 = r9.f9201n
            char r2 = t(r5, r6)
            goto L_0x00e8
        L_0x00a9:
            boolean r1 = A(r5, r6)
            if (r1 == 0) goto L_0x00b3
            r9.v(r6)
            goto L_0x0073
        L_0x00b3:
            boolean r1 = C(r5, r6)
            if (r1 == 0) goto L_0x00bd
            r9.x(r5, r6)
            goto L_0x0073
        L_0x00bd:
            boolean r1 = H(r5, r6)
            if (r1 == 0) goto L_0x00cb
            i7.a$a r1 = r9.f9201n
            int r6 = r6 + -32
            int unused = r1.f9219f = r6
            goto L_0x0073
        L_0x00cb:
            boolean r1 = B(r5, r6)
            if (r1 == 0) goto L_0x0073
            r9.w(r6)
            goto L_0x0073
        L_0x00d5:
            i7.a$a r1 = r9.f9201n
            char r2 = o(r5)
            r1.e(r2)
            r1 = r6 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x0073
            i7.a$a r1 = r9.f9201n
            char r2 = o(r6)
        L_0x00e8:
            r1.e(r2)
            goto L_0x0073
        L_0x00ec:
            if (r1 == 0) goto L_0x00fb
            int r10 = r9.f9204q
            if (r10 == r0) goto L_0x00f5
            r0 = 3
            if (r10 != r0) goto L_0x00fb
        L_0x00f5:
            java.util.List r10 = r9.q()
            r9.f9202o = r10
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.a.g(h7.i):void");
    }

    public String getName() {
        return f9194y;
    }

    public /* bridge */ /* synthetic */ i h() throws g {
        return super.d();
    }

    public /* bridge */ /* synthetic */ j i() throws g {
        return super.c();
    }

    public boolean j() {
        return this.f9202o != this.f9203p;
    }

    public /* bridge */ /* synthetic */ void k(i iVar) throws g {
        super.e(iVar);
    }

    public final List<b> q() {
        int size = this.f9200m.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            b g10 = this.f9200m.get(i11).g(Integer.MIN_VALUE);
            arrayList.add(g10);
            if (g10 != null) {
                i10 = Math.min(i10, g10.V);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = (b) arrayList.get(i12);
            if (bVar != null) {
                if (bVar.V != i10) {
                    bVar = this.f9200m.get(i12).g(i10);
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    public final void v(byte b10) {
        this.f9201n.e(f.f11698i);
        this.f9201n.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    public final void w(byte b10) {
        if (b10 == 32) {
            L(2);
        } else if (b10 != 41) {
            switch (b10) {
                case 37:
                    L(1);
                    M(2);
                    return;
                case 38:
                    L(1);
                    M(3);
                    return;
                case 39:
                    L(1);
                    M(4);
                    return;
                default:
                    int i10 = this.f9204q;
                    if (i10 != 0) {
                        if (b10 != 33) {
                            switch (b10) {
                                case 44:
                                    this.f9202o = Collections.emptyList();
                                    int i11 = this.f9204q;
                                    if (!(i11 == 1 || i11 == 3)) {
                                        return;
                                    }
                                case 45:
                                    if (i10 == 1 && !this.f9201n.i()) {
                                        this.f9201n.k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    break;
                                case 47:
                                    this.f9202o = q();
                                    break;
                                default:
                                    return;
                            }
                            K();
                            return;
                        }
                        this.f9201n.f();
                        return;
                    }
                    return;
            }
        } else {
            L(3);
        }
    }

    public final void x(byte b10, byte b11) {
        int i10 = K[b10 & 7];
        boolean z10 = false;
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f9201n.f9217d) {
            if (this.f9204q != 1 && !this.f9201n.i()) {
                C0156a aVar = new C0156a(this.f9204q, this.f9205r);
                this.f9201n = aVar;
                this.f9200m.add(aVar);
            }
            int unused = this.f9201n.f9217d = i10;
        }
        boolean z11 = (b11 & 16) == 16;
        if ((b11 & 1) == 1) {
            z10 = true;
        }
        int i11 = (b11 >> 1) & 7;
        this.f9201n.p(z11 ? 8 : i11, z10);
        if (z11) {
            int unused2 = this.f9201n.f9218e = L[i11];
        }
    }
}
