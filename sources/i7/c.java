package i7;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import h7.e;
import h7.g;
import h7.i;
import h7.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lf.h0;
import p7.f;
import w7.p;
import w7.v;
import w7.w;

public final class c extends e {
    public static final int A = 31;
    public static final int A0 = 51;
    public static final int B = 127;
    public static final int B0 = 52;
    public static final int C = 159;
    public static final int C0 = 53;
    public static final int D = 255;
    public static final int D0 = 57;
    public static final int E = 0;
    public static final int E0 = 58;
    public static final int F = 3;
    public static final int F0 = 60;
    public static final int G = 8;
    public static final int G0 = 61;
    public static final int H = 12;
    public static final int H0 = 63;
    public static final int I = 13;
    public static final int I0 = 118;
    public static final int J = 14;
    public static final int J0 = 119;
    public static final int K = 16;
    public static final int K0 = 120;
    public static final int L = 17;
    public static final int L0 = 121;
    public static final int M = 23;
    public static final int M0 = 122;
    public static final int N = 24;
    public static final int N0 = 123;
    public static final int O = 31;
    public static final int O0 = 124;
    public static final int P = 128;
    public static final int P0 = 125;
    public static final int Q = 129;
    public static final int Q0 = 126;
    public static final int R = 130;
    public static final int R0 = 127;
    public static final int S = 131;
    public static final int T = 132;
    public static final int U = 133;
    public static final int V = 134;
    public static final int W = 135;
    public static final int X = 136;
    public static final int Y = 137;
    public static final int Z = 138;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f9227a0 = 139;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f9228b0 = 140;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f9229c0 = 141;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f9230d0 = 142;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f9231e0 = 143;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f9232f0 = 144;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f9233g0 = 145;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f9234h0 = 146;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f9235i0 = 151;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f9236j0 = 152;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f9237k0 = 153;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f9238l0 = 154;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f9239m0 = 155;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f9240n0 = 156;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f9241o0 = 157;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f9242p0 = 158;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f9243q0 = 159;

    /* renamed from: r  reason: collision with root package name */
    public static final String f9244r = "Cea708Decoder";

    /* renamed from: r0  reason: collision with root package name */
    public static final int f9245r0 = 127;

    /* renamed from: s  reason: collision with root package name */
    public static final int f9246s = 8;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f9247s0 = 32;

    /* renamed from: t  reason: collision with root package name */
    public static final int f9248t = 2;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f9249t0 = 33;

    /* renamed from: u  reason: collision with root package name */
    public static final int f9250u = 3;

    /* renamed from: u0  reason: collision with root package name */
    public static final int f9251u0 = 37;

    /* renamed from: v  reason: collision with root package name */
    public static final int f9252v = 4;

    /* renamed from: v0  reason: collision with root package name */
    public static final int f9253v0 = 42;

    /* renamed from: w  reason: collision with root package name */
    public static final int f9254w = 31;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f9255w0 = 44;

    /* renamed from: x  reason: collision with root package name */
    public static final int f9256x = 127;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f9257x0 = 48;

    /* renamed from: y  reason: collision with root package name */
    public static final int f9258y = 159;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f9259y0 = 49;

    /* renamed from: z  reason: collision with root package name */
    public static final int f9260z = 255;

    /* renamed from: z0  reason: collision with root package name */
    public static final int f9261z0 = 50;

    /* renamed from: i  reason: collision with root package name */
    public final w f9262i = new w();

    /* renamed from: j  reason: collision with root package name */
    public final v f9263j = new v();

    /* renamed from: k  reason: collision with root package name */
    public final int f9264k;

    /* renamed from: l  reason: collision with root package name */
    public final a[] f9265l;

    /* renamed from: m  reason: collision with root package name */
    public a f9266m;

    /* renamed from: n  reason: collision with root package name */
    public List<h7.b> f9267n;

    /* renamed from: o  reason: collision with root package name */
    public List<h7.b> f9268o;

    /* renamed from: p  reason: collision with root package name */
    public b f9269p;

    /* renamed from: q  reason: collision with root package name */
    public int f9270q;

    public static final class a {
        public static final int A = 15;
        public static final int B = 0;
        public static final int C = 1;
        public static final int D = 2;
        public static final int E = 3;
        public static final int F = 0;
        public static final int G = 1;
        public static final int H = 2;
        public static final int I = 3;
        public static final int J = 0;
        public static final int K = 3;
        public static final int L = h(2, 2, 2, 0);
        public static final int M;
        public static final int N;
        public static final int O = 1;
        public static final int P = 0;
        public static final int Q = 1;
        public static final int R = 2;
        public static final int S = 3;
        public static final int T = 4;
        public static final int U = 1;
        public static final int[] V = {0, 0, 0, 0, 0, 2, 0};
        public static final int[] W = {0, 0, 0, 0, 0, 0, 2};
        public static final int[] X = {3, 3, 3, 3, 3, 3, 1};
        public static final boolean[] Y = {false, false, false, true, true, true, false};
        public static final int[] Z;

        /* renamed from: a0  reason: collision with root package name */
        public static final int[] f9271a0 = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: b0  reason: collision with root package name */
        public static final int[] f9272b0 = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: c0  reason: collision with root package name */
        public static final int[] f9273c0;

        /* renamed from: w  reason: collision with root package name */
        public static final int f9274w = 99;

        /* renamed from: x  reason: collision with root package name */
        public static final int f9275x = 74;

        /* renamed from: y  reason: collision with root package name */
        public static final int f9276y = 209;

        /* renamed from: z  reason: collision with root package name */
        public static final int f9277z = 4;

        /* renamed from: a  reason: collision with root package name */
        public final List<SpannableString> f9278a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final SpannableStringBuilder f9279b = new SpannableStringBuilder();

        /* renamed from: c  reason: collision with root package name */
        public boolean f9280c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f9281d;

        /* renamed from: e  reason: collision with root package name */
        public int f9282e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f9283f;

        /* renamed from: g  reason: collision with root package name */
        public int f9284g;

        /* renamed from: h  reason: collision with root package name */
        public int f9285h;

        /* renamed from: i  reason: collision with root package name */
        public int f9286i;

        /* renamed from: j  reason: collision with root package name */
        public int f9287j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f9288k;

        /* renamed from: l  reason: collision with root package name */
        public int f9289l;

        /* renamed from: m  reason: collision with root package name */
        public int f9290m;

        /* renamed from: n  reason: collision with root package name */
        public int f9291n;

        /* renamed from: o  reason: collision with root package name */
        public int f9292o;

        /* renamed from: p  reason: collision with root package name */
        public int f9293p;

        /* renamed from: q  reason: collision with root package name */
        public int f9294q;

        /* renamed from: r  reason: collision with root package name */
        public int f9295r;

        /* renamed from: s  reason: collision with root package name */
        public int f9296s;

        /* renamed from: t  reason: collision with root package name */
        public int f9297t;

        /* renamed from: u  reason: collision with root package name */
        public int f9298u;

        /* renamed from: v  reason: collision with root package name */
        public int f9299v;

        static {
            int h10 = h(0, 0, 0, 0);
            M = h10;
            int h11 = h(0, 0, 0, 3);
            N = h11;
            Z = new int[]{h10, h11, h10, h10, h11, h10, h10};
            f9273c0 = new int[]{h10, h10, h10, h10, h10, h11, h11};
        }

        public a() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                w7.a.c(r4, r0, r1)
                w7.a.c(r5, r0, r1)
                w7.a.c(r6, r0, r1)
                w7.a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = r0
                goto L_0x0022
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0022
            L_0x0021:
                r7 = r2
            L_0x0022:
                if (r4 <= r1) goto L_0x0026
                r4 = r2
                goto L_0x0027
            L_0x0026:
                r4 = r0
            L_0x0027:
                if (r5 <= r1) goto L_0x002b
                r5 = r2
                goto L_0x002c
            L_0x002b:
                r5 = r0
            L_0x002c:
                if (r6 <= r1) goto L_0x002f
                r0 = r2
            L_0x002f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.c.a.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 == 10) {
                this.f9278a.add(d());
                this.f9279b.clear();
                if (this.f9293p != -1) {
                    this.f9293p = 0;
                }
                if (this.f9294q != -1) {
                    this.f9294q = 0;
                }
                if (this.f9295r != -1) {
                    this.f9295r = 0;
                }
                if (this.f9297t != -1) {
                    this.f9297t = 0;
                }
                while (true) {
                    if ((this.f9288k && this.f9278a.size() >= this.f9287j) || this.f9278a.size() >= 15) {
                        this.f9278a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f9279b.append(c10);
            }
        }

        public void b() {
            int length = this.f9279b.length();
            if (length > 0) {
                this.f9279b.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public i7.b c() {
            /*
                r15 = this;
                boolean r0 = r15.j()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = r0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f9278a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f9278a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.d()
                r2.append(r1)
                int r1 = r15.f9289l
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f9289l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0060
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0060
            L_0x005e:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0060:
                r6 = r1
                boolean r1 = r15.f9283f
                if (r1 == 0) goto L_0x0070
                int r1 = r15.f9285h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f9284g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.f9285h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f9284g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007d:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f9286i
                int r8 = r1 % 3
                if (r8 != 0) goto L_0x0091
                r8 = r0
                goto L_0x0098
            L_0x0091:
                int r8 = r1 % 3
                if (r8 != r5) goto L_0x0097
                r8 = r5
                goto L_0x0098
            L_0x0097:
                r8 = r3
            L_0x0098:
                int r9 = r1 / 3
                if (r9 != 0) goto L_0x009e
                r9 = r0
                goto L_0x00a4
            L_0x009e:
                int r1 = r1 / r4
                if (r1 != r5) goto L_0x00a3
                r9 = r5
                goto L_0x00a4
            L_0x00a3:
                r9 = r3
            L_0x00a4:
                int r1 = r15.f9292o
                int r3 = M
                if (r1 == r3) goto L_0x00ab
                r0 = r5
            L_0x00ab:
                i7.b r13 = new i7.b
                r5 = 0
                r11 = 1
                int r12 = r15.f9292o
                int r14 = r15.f9282e
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.c.a.c():i7.b");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9279b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f9293p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f9293p, length, 33);
                }
                if (this.f9294q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f9294q, length, 33);
                }
                if (this.f9295r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f9296s), this.f9295r, length, 33);
                }
                if (this.f9297t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f9298u), this.f9297t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f9278a.clear();
            this.f9279b.clear();
            this.f9293p = -1;
            this.f9294q = -1;
            this.f9295r = -1;
            this.f9297t = -1;
            this.f9299v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            boolean z14 = z11;
            int i18 = i16;
            int i19 = i17;
            this.f9280c = true;
            this.f9281d = z10;
            this.f9288k = z14;
            this.f9282e = i10;
            this.f9283f = z13;
            this.f9284g = i11;
            this.f9285h = i12;
            this.f9286i = i15;
            int i20 = i13 + 1;
            if (this.f9287j != i20) {
                this.f9287j = i20;
                while (true) {
                    if ((!z14 || this.f9278a.size() < this.f9287j) && this.f9278a.size() < 15) {
                        break;
                    }
                    this.f9278a.remove(0);
                }
            }
            if (!(i18 == 0 || this.f9290m == i18)) {
                this.f9290m = i18;
                int i21 = i18 - 1;
                q(Z[i21], N, Y[i21], 0, W[i21], X[i21], V[i21]);
            }
            if (i19 != 0 && this.f9291n != i19) {
                this.f9291n = i19;
                int i22 = i19 - 1;
                m(0, 1, 1, false, false, f9272b0[i22], f9271a0[i22]);
                n(L, f9273c0[i22], M);
            }
        }

        public boolean i() {
            return this.f9280c;
        }

        public boolean j() {
            return !i() || (this.f9278a.isEmpty() && this.f9279b.length() == 0);
        }

        public boolean k() {
            return this.f9281d;
        }

        public void l() {
            e();
            this.f9280c = false;
            this.f9281d = false;
            this.f9282e = 4;
            this.f9283f = false;
            this.f9284g = 0;
            this.f9285h = 0;
            this.f9286i = 0;
            this.f9287j = 15;
            this.f9288k = true;
            this.f9289l = 0;
            this.f9290m = 0;
            this.f9291n = 0;
            int i10 = M;
            this.f9292o = i10;
            this.f9296s = L;
            this.f9298u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f9293p != -1) {
                if (!z10) {
                    this.f9279b.setSpan(new StyleSpan(2), this.f9293p, this.f9279b.length(), 33);
                    this.f9293p = -1;
                }
            } else if (z10) {
                this.f9293p = this.f9279b.length();
            }
            if (this.f9294q != -1) {
                if (!z11) {
                    this.f9279b.setSpan(new UnderlineSpan(), this.f9294q, this.f9279b.length(), 33);
                    this.f9294q = -1;
                }
            } else if (z11) {
                this.f9294q = this.f9279b.length();
            }
        }

        public void n(int i10, int i11, int i12) {
            if (!(this.f9295r == -1 || this.f9296s == i10)) {
                this.f9279b.setSpan(new ForegroundColorSpan(this.f9296s), this.f9295r, this.f9279b.length(), 33);
            }
            if (i10 != L) {
                this.f9295r = this.f9279b.length();
                this.f9296s = i10;
            }
            if (!(this.f9297t == -1 || this.f9298u == i11)) {
                this.f9279b.setSpan(new BackgroundColorSpan(this.f9298u), this.f9297t, this.f9279b.length(), 33);
            }
            if (i11 != M) {
                this.f9297t = this.f9279b.length();
                this.f9298u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f9299v != i10) {
                a(10);
            }
            this.f9299v = i10;
        }

        public void p(boolean z10) {
            this.f9281d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f9292o = i10;
            this.f9289l = i15;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f9300a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9301b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f9302c;

        /* renamed from: d  reason: collision with root package name */
        public int f9303d = 0;

        public b(int i10, int i11) {
            this.f9300a = i10;
            this.f9301b = i11;
            this.f9302c = new byte[((i11 * 2) - 1)];
        }
    }

    public c(int i10, List<byte[]> list) {
        this.f9264k = i10 == -1 ? 1 : i10;
        this.f9265l = new a[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f9265l[i11] = new a();
        }
        this.f9266m = this.f9265l[0];
        D();
    }

    public final void A() {
        this.f9263j.p(4);
        int h10 = this.f9263j.h(4);
        this.f9263j.p(2);
        this.f9266m.o(h10, this.f9263j.h(6));
    }

    public final void B() {
        int h10 = a.h(this.f9263j.h(2), this.f9263j.h(2), this.f9263j.h(2), this.f9263j.h(2));
        int h11 = this.f9263j.h(2);
        int g10 = a.g(this.f9263j.h(2), this.f9263j.h(2), this.f9263j.h(2));
        if (this.f9263j.g()) {
            h11 |= 4;
        }
        boolean g11 = this.f9263j.g();
        int h12 = this.f9263j.h(2);
        int h13 = this.f9263j.h(2);
        int h14 = this.f9263j.h(2);
        this.f9263j.p(8);
        this.f9266m.q(h10, g10, g11, h11, h12, h13, h14);
    }

    public final void C() {
        String str;
        StringBuilder sb2;
        b bVar = this.f9269p;
        int i10 = bVar.f9303d;
        if (i10 != (bVar.f9301b * 2) - 1) {
            p.l(f9244r, "DtvCcPacket ended prematurely; size is " + ((this.f9269p.f9301b * 2) - 1) + ", but current index is " + this.f9269p.f9303d + " (sequence number " + this.f9269p.f9300a + "); ignoring packet");
            return;
        }
        this.f9263j.m(bVar.f9302c, i10);
        int h10 = this.f9263j.h(3);
        int h11 = this.f9263j.h(5);
        if (h10 == 7) {
            this.f9263j.p(2);
            h10 = this.f9263j.h(6);
            if (h10 < 7) {
                p.l(f9244r, "Invalid extended service number: " + h10);
            }
        }
        if (h11 == 0) {
            if (h10 != 0) {
                p.l(f9244r, "serviceNumber is non-zero (" + h10 + ") when blockSize is 0");
            }
        } else if (h10 == this.f9264k) {
            boolean z10 = false;
            while (this.f9263j.b() > 0) {
                int h12 = this.f9263j.h(8);
                if (h12 == 16) {
                    h12 = this.f9263j.h(8);
                    if (h12 <= 31) {
                        r(h12);
                    } else if (h12 <= 127) {
                        w(h12);
                    } else if (h12 <= 159) {
                        s(h12);
                    } else if (h12 <= 255) {
                        x(h12);
                    } else {
                        sb2 = new StringBuilder();
                        str = "Invalid extended command: ";
                        sb2.append(str);
                        sb2.append(h12);
                        p.l(f9244r, sb2.toString());
                    }
                } else if (h12 <= 31) {
                    p(h12);
                } else if (h12 <= 127) {
                    u(h12);
                } else if (h12 <= 159) {
                    q(h12);
                } else if (h12 <= 255) {
                    v(h12);
                } else {
                    sb2 = new StringBuilder();
                    str = "Invalid base command: ";
                    sb2.append(str);
                    sb2.append(h12);
                    p.l(f9244r, sb2.toString());
                }
                z10 = true;
            }
            if (z10) {
                this.f9267n = o();
            }
        }
    }

    public final void D() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f9265l[i10].l();
        }
    }

    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    public e f() {
        List<h7.b> list = this.f9267n;
        this.f9268o = list;
        return new f(list);
    }

    public void flush() {
        super.flush();
        this.f9267n = null;
        this.f9268o = null;
        this.f9270q = 0;
        this.f9266m = this.f9265l[0];
        D();
        this.f9269p = null;
    }

    public void g(i iVar) {
        this.f9262i.O(iVar.Q.array(), iVar.Q.limit());
        while (this.f9262i.a() >= 3) {
            int D2 = this.f9262i.D() & 7;
            int i10 = D2 & 3;
            boolean z10 = false;
            boolean z11 = (D2 & 4) == 4;
            byte D3 = (byte) this.f9262i.D();
            byte D4 = (byte) this.f9262i.D();
            if ((i10 == 2 || i10 == 3) && z11) {
                if (i10 == 3) {
                    n();
                    int i11 = (D3 & w1.a.K6) >> 6;
                    byte b10 = D3 & 63;
                    if (b10 == 0) {
                        b10 = 64;
                    }
                    b bVar = new b(i11, b10);
                    this.f9269p = bVar;
                    byte[] bArr = bVar.f9302c;
                    int i12 = bVar.f9303d;
                    bVar.f9303d = i12 + 1;
                    bArr[i12] = D4;
                } else {
                    if (i10 == 2) {
                        z10 = true;
                    }
                    w7.a.a(z10);
                    b bVar2 = this.f9269p;
                    if (bVar2 == null) {
                        p.d(f9244r, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = bVar2.f9302c;
                        int i13 = bVar2.f9303d;
                        int i14 = i13 + 1;
                        bArr2[i13] = D3;
                        bVar2.f9303d = i14 + 1;
                        bArr2[i14] = D4;
                    }
                }
                b bVar3 = this.f9269p;
                if (bVar3.f9303d == (bVar3.f9301b * 2) - 1) {
                    n();
                }
            }
        }
    }

    public String getName() {
        return f9244r;
    }

    public /* bridge */ /* synthetic */ i h() throws g {
        return super.d();
    }

    public /* bridge */ /* synthetic */ j i() throws g {
        return super.c();
    }

    public boolean j() {
        return this.f9267n != this.f9268o;
    }

    public /* bridge */ /* synthetic */ void k(i iVar) throws g {
        super.e(iVar);
    }

    public final void n() {
        if (this.f9269p != null) {
            C();
            this.f9269p = null;
        }
    }

    public final List<h7.b> o() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f9265l[i10].j() && this.f9265l[i10].k()) {
                arrayList.add(this.f9265l[i10].c());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    public final void p(int i10) {
        v vVar;
        if (i10 == 0) {
            return;
        }
        if (i10 != 3) {
            int i11 = 8;
            if (i10 != 8) {
                switch (i10) {
                    case 12:
                        D();
                        return;
                    case 13:
                        this.f9266m.a(10);
                        return;
                    case 14:
                        return;
                    default:
                        if (i10 >= 17 && i10 <= 23) {
                            p.l(f9244r, "Currently unsupported COMMAND_EXT1 Command: " + i10);
                            vVar = this.f9263j;
                        } else if (i10 < 24 || i10 > 31) {
                            p.l(f9244r, "Invalid C0 command: " + i10);
                            return;
                        } else {
                            p.l(f9244r, "Currently unsupported COMMAND_P16 Command: " + i10);
                            vVar = this.f9263j;
                            i11 = 16;
                        }
                        vVar.p(i11);
                        return;
                }
            } else {
                this.f9266m.b();
            }
        } else {
            this.f9267n = o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        r5 = r4.f9263j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r5.p(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r4.f9263j.g() == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r4.f9265l[8 - r2].l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        if (r4.f9263j.g() == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        r4.f9265l[8 - r2].p(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
        if (r4.f9263j.g() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        r4.f9265l[8 - r2].e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0105, code lost:
        r4.f9266m = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x00f9;
                case 129: goto L_0x00f9;
                case 130: goto L_0x00f9;
                case 131: goto L_0x00f9;
                case 132: goto L_0x00f9;
                case 133: goto L_0x00f9;
                case 134: goto L_0x00f9;
                case 135: goto L_0x00f9;
                case 136: goto L_0x00e3;
                case 137: goto L_0x00cc;
                case 138: goto L_0x00b5;
                case 139: goto L_0x0099;
                case 140: goto L_0x0083;
                case 141: goto L_0x007c;
                case 142: goto L_0x0107;
                case 143: goto L_0x0077;
                case 144: goto L_0x0063;
                case 145: goto L_0x0051;
                case 146: goto L_0x0043;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0031;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            w7.p.l(r0, r5)
            goto L_0x0107
        L_0x0020:
            int r5 = r5 + -152
            r4.t(r5)
            int r0 = r4.f9270q
            if (r0 == r5) goto L_0x0107
            r4.f9270q = r5
            i7.c$a[] r0 = r4.f9265l
            r5 = r0[r5]
            goto L_0x0105
        L_0x0031:
            i7.c$a r5 = r4.f9266m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x003e
            w7.v r5 = r4.f9263j
            r0 = 32
            goto L_0x006d
        L_0x003e:
            r4.B()
            goto L_0x0107
        L_0x0043:
            i7.c$a r5 = r4.f9266m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x004c
            goto L_0x006b
        L_0x004c:
            r4.A()
            goto L_0x0107
        L_0x0051:
            i7.c$a r5 = r4.f9266m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x005e
            w7.v r5 = r4.f9263j
            r0 = 24
            goto L_0x006d
        L_0x005e:
            r4.z()
            goto L_0x0107
        L_0x0063:
            i7.c$a r5 = r4.f9266m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0072
        L_0x006b:
            w7.v r5 = r4.f9263j
        L_0x006d:
            r5.p(r0)
            goto L_0x0107
        L_0x0072:
            r4.y()
            goto L_0x0107
        L_0x0077:
            r4.D()
            goto L_0x0107
        L_0x007c:
            w7.v r5 = r4.f9263j
            r5.p(r1)
            goto L_0x0107
        L_0x0083:
            if (r2 > r1) goto L_0x0107
            w7.v r5 = r4.f9263j
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x0096
            i7.c$a[] r5 = r4.f9265l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.l()
        L_0x0096:
            int r2 = r2 + 1
            goto L_0x0083
        L_0x0099:
            r5 = r2
        L_0x009a:
            if (r5 > r1) goto L_0x0107
            w7.v r0 = r4.f9263j
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00b2
            i7.c$a[] r0 = r4.f9265l
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.k()
            r3 = r3 ^ r2
            r0.p(r3)
        L_0x00b2:
            int r5 = r5 + 1
            goto L_0x009a
        L_0x00b5:
            if (r2 > r1) goto L_0x0107
            w7.v r5 = r4.f9263j
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00c9
            i7.c$a[] r5 = r4.f9265l
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.p(r0)
        L_0x00c9:
            int r2 = r2 + 1
            goto L_0x00b5
        L_0x00cc:
            r5 = r2
        L_0x00cd:
            if (r5 > r1) goto L_0x0107
            w7.v r0 = r4.f9263j
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00e0
            i7.c$a[] r0 = r4.f9265l
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.p(r2)
        L_0x00e0:
            int r5 = r5 + 1
            goto L_0x00cd
        L_0x00e3:
            if (r2 > r1) goto L_0x0107
            w7.v r5 = r4.f9263j
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00f6
            i7.c$a[] r5 = r4.f9265l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.e()
        L_0x00f6:
            int r2 = r2 + 1
            goto L_0x00e3
        L_0x00f9:
            int r5 = r5 + -128
            int r0 = r4.f9270q
            if (r0 == r5) goto L_0x0107
            r4.f9270q = r5
            i7.c$a[] r0 = r4.f9265l
            r5 = r0[r5]
        L_0x0105:
            r4.f9266m = r5
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.c.q(int):void");
    }

    public final void r(int i10) {
        v vVar;
        int i11;
        if (i10 > 7) {
            if (i10 <= 15) {
                vVar = this.f9263j;
                i11 = 8;
            } else if (i10 <= 23) {
                vVar = this.f9263j;
                i11 = 16;
            } else if (i10 <= 31) {
                vVar = this.f9263j;
                i11 = 24;
            } else {
                return;
            }
            vVar.p(i11);
        }
    }

    public final void s(int i10) {
        v vVar;
        int i11;
        if (i10 <= 135) {
            vVar = this.f9263j;
            i11 = 32;
        } else if (i10 <= 143) {
            vVar = this.f9263j;
            i11 = 40;
        } else if (i10 <= 159) {
            this.f9263j.p(2);
            this.f9263j.p(this.f9263j.h(6) * 8);
            return;
        } else {
            return;
        }
        vVar.p(i11);
    }

    public final void t(int i10) {
        a aVar = this.f9265l[i10];
        this.f9263j.p(2);
        boolean g10 = this.f9263j.g();
        boolean g11 = this.f9263j.g();
        boolean g12 = this.f9263j.g();
        int h10 = this.f9263j.h(3);
        boolean g13 = this.f9263j.g();
        int h11 = this.f9263j.h(7);
        int h12 = this.f9263j.h(8);
        int h13 = this.f9263j.h(4);
        int h14 = this.f9263j.h(4);
        this.f9263j.p(2);
        int h15 = this.f9263j.h(6);
        this.f9263j.p(2);
        aVar.f(g10, g11, g12, h10, g13, h11, h12, h14, h15, h13, this.f9263j.h(3), this.f9263j.h(3));
    }

    public final void u(int i10) {
        if (i10 == 127) {
            this.f9266m.a(9835);
        } else {
            this.f9266m.a((char) (i10 & 255));
        }
    }

    public final void v(int i10) {
        this.f9266m.a((char) (i10 & 255));
    }

    public final void w(int i10) {
        a aVar;
        char c10 = f.f11698i;
        if (i10 == 32) {
            aVar = this.f9266m;
        } else if (i10 == 33) {
            aVar = this.f9266m;
            c10 = h0.f20813g;
        } else if (i10 == 37) {
            aVar = this.f9266m;
            c10 = h0.F;
        } else if (i10 == 42) {
            aVar = this.f9266m;
            c10 = 352;
        } else if (i10 == 44) {
            aVar = this.f9266m;
            c10 = 338;
        } else if (i10 == 63) {
            aVar = this.f9266m;
            c10 = 376;
        } else if (i10 == 57) {
            aVar = this.f9266m;
            c10 = h0.J;
        } else if (i10 == 58) {
            aVar = this.f9266m;
            c10 = 353;
        } else if (i10 == 60) {
            aVar = this.f9266m;
            c10 = 339;
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    aVar = this.f9266m;
                    c10 = 9608;
                    break;
                case 49:
                    aVar = this.f9266m;
                    c10 = h0.f20829w;
                    break;
                case 50:
                    aVar = this.f9266m;
                    c10 = h0.f20830x;
                    break;
                case 51:
                    aVar = this.f9266m;
                    c10 = h0.f20832z;
                    break;
                case 52:
                    aVar = this.f9266m;
                    c10 = h0.A;
                    break;
                case 53:
                    aVar = this.f9266m;
                    c10 = h0.E;
                    break;
                default:
                    switch (i10) {
                        case 118:
                            aVar = this.f9266m;
                            c10 = 8539;
                            break;
                        case 119:
                            aVar = this.f9266m;
                            c10 = 8540;
                            break;
                        case 120:
                            aVar = this.f9266m;
                            c10 = 8541;
                            break;
                        case 121:
                            aVar = this.f9266m;
                            c10 = 8542;
                            break;
                        case 122:
                            aVar = this.f9266m;
                            c10 = 9474;
                            break;
                        case 123:
                            aVar = this.f9266m;
                            c10 = 9488;
                            break;
                        case 124:
                            aVar = this.f9266m;
                            c10 = 9492;
                            break;
                        case 125:
                            aVar = this.f9266m;
                            c10 = 9472;
                            break;
                        case 126:
                            aVar = this.f9266m;
                            c10 = 9496;
                            break;
                        case 127:
                            aVar = this.f9266m;
                            c10 = 9484;
                            break;
                        default:
                            p.l(f9244r, "Invalid G2 character: " + i10);
                            return;
                    }
            }
        } else {
            aVar = this.f9266m;
            c10 = 8480;
        }
        aVar.a(c10);
    }

    public final void x(int i10) {
        a aVar;
        char c10;
        if (i10 == 160) {
            aVar = this.f9266m;
            c10 = 13252;
        } else {
            p.l(f9244r, "Invalid G3 character: " + i10);
            aVar = this.f9266m;
            c10 = '_';
        }
        aVar.a(c10);
    }

    public final void y() {
        this.f9266m.m(this.f9263j.h(4), this.f9263j.h(2), this.f9263j.h(2), this.f9263j.g(), this.f9263j.g(), this.f9263j.h(3), this.f9263j.h(3));
    }

    public final void z() {
        int h10 = a.h(this.f9263j.h(2), this.f9263j.h(2), this.f9263j.h(2), this.f9263j.h(2));
        int h11 = a.h(this.f9263j.h(2), this.f9263j.h(2), this.f9263j.h(2), this.f9263j.h(2));
        this.f9263j.p(2);
        this.f9266m.n(h10, h11, a.g(this.f9263j.h(2), this.f9263j.h(2), this.f9263j.h(2)));
    }
}
