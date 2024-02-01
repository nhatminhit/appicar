package o7;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import h7.b;
import h7.c;
import h7.e;
import h7.g;
import java.nio.charset.Charset;
import java.util.List;
import w7.q0;
import w7.w;

public final class a extends c {
    public static final int A = 8;
    public static final int B = 2;
    public static final int C = 2;
    public static final int D = 12;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 4;
    public static final int H = 16711680;
    public static final int I = 0;
    public static final int J = 0;
    public static final int K = -1;
    public static final String L = "sans-serif";
    public static final float M = 0.85f;

    /* renamed from: v  reason: collision with root package name */
    public static final char f11327v = '﻿';

    /* renamed from: w  reason: collision with root package name */
    public static final char f11328w = '￾';

    /* renamed from: x  reason: collision with root package name */
    public static final int f11329x = q0.T("styl");

    /* renamed from: y  reason: collision with root package name */
    public static final int f11330y = q0.T("tbox");

    /* renamed from: z  reason: collision with root package name */
    public static final String f11331z = "Serif";

    /* renamed from: o  reason: collision with root package name */
    public final w f11332o = new w();

    /* renamed from: p  reason: collision with root package name */
    public boolean f11333p;

    /* renamed from: q  reason: collision with root package name */
    public int f11334q;

    /* renamed from: r  reason: collision with root package name */
    public int f11335r;

    /* renamed from: s  reason: collision with root package name */
    public String f11336s;

    /* renamed from: t  reason: collision with root package name */
    public float f11337t;

    /* renamed from: u  reason: collision with root package name */
    public int f11338u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z10 = false;
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f11334q = bArr[24];
            this.f11335r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f11336s = f11331z.equals(q0.G(bArr, 43, bArr.length - 43)) ? b6.c.f4253o : str;
            int i10 = bArr[25] * 20;
            this.f11338u = i10;
            z10 = (bArr[0] & 32) != 0 ? true : z10;
            this.f11333p = z10;
            if (z10) {
                float f10 = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i10);
                this.f11337t = f10;
                this.f11337t = q0.t(f10, 0.0f, 0.95f);
                return;
            }
        } else {
            this.f11334q = 0;
            this.f11335r = -1;
            this.f11336s = str;
            this.f11333p = false;
        }
        this.f11337t = 0.85f;
    }

    public static void D(boolean z10) throws g {
        if (!z10) {
            throw new g("Unexpected subtitle format.");
        }
    }

    public static void E(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void F(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L_0x004c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x000c
            r10 = r1
            goto L_0x000d
        L_0x000c:
            r10 = r0
        L_0x000d:
            r2 = r6 & 2
            if (r2 == 0) goto L_0x0013
            r2 = r1
            goto L_0x0014
        L_0x0013:
            r2 = r0
        L_0x0014:
            if (r10 == 0) goto L_0x0023
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L_0x001f
            r4 = 3
            r3.<init>(r4)
            goto L_0x002b
        L_0x001f:
            r3.<init>(r1)
            goto L_0x002b
        L_0x0023:
            if (r2 == 0) goto L_0x002e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L_0x002b:
            r5.setSpan(r3, r8, r9, r7)
        L_0x002e:
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = r0
        L_0x0034:
            if (r1 == 0) goto L_0x003e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L_0x003e:
            if (r1 != 0) goto L_0x004c
            if (r10 != 0) goto L_0x004c
            if (r2 != 0) goto L_0x004c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.a.F(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    public static void G(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i10, int i11, int i12) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, i12 | 33);
        }
    }

    public static String H(w wVar) throws g {
        char e10;
        D(wVar.a() >= 2);
        int J2 = wVar.J();
        if (J2 == 0) {
            return "";
        }
        return wVar.B(J2, Charset.forName((wVar.a() < 2 || !((e10 = wVar.e()) == 65279 || e10 == 65534)) ? "UTF-8" : b6.c.f4245m));
    }

    public final void C(w wVar, SpannableStringBuilder spannableStringBuilder) throws g {
        D(wVar.a() >= 12);
        int J2 = wVar.J();
        int J3 = wVar.J();
        wVar.R(2);
        int D2 = wVar.D();
        wVar.R(1);
        int l10 = wVar.l();
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i10 = J2;
        int i11 = J3;
        F(spannableStringBuilder2, D2, this.f11334q, i10, i11, 0);
        E(spannableStringBuilder2, l10, this.f11335r, i10, i11, 0);
    }

    public e z(byte[] bArr, int i10, boolean z10) throws g {
        this.f11332o.O(bArr, i10);
        String H2 = H(this.f11332o);
        if (H2.isEmpty()) {
            return b.P;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(H2);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        F(spannableStringBuilder2, this.f11334q, 0, 0, spannableStringBuilder.length(), 16711680);
        E(spannableStringBuilder2, this.f11335r, -1, 0, spannableStringBuilder.length(), 16711680);
        G(spannableStringBuilder2, this.f11336s, "sans-serif", 0, spannableStringBuilder.length(), 16711680);
        float f10 = this.f11337t;
        while (this.f11332o.a() >= 8) {
            int c10 = this.f11332o.c();
            int l10 = this.f11332o.l();
            int l11 = this.f11332o.l();
            boolean z11 = true;
            if (l11 == f11329x) {
                if (this.f11332o.a() < 2) {
                    z11 = false;
                }
                D(z11);
                int J2 = this.f11332o.J();
                for (int i11 = 0; i11 < J2; i11++) {
                    C(this.f11332o, spannableStringBuilder);
                }
            } else if (l11 == f11330y && this.f11333p) {
                if (this.f11332o.a() < 2) {
                    z11 = false;
                }
                D(z11);
                f10 = q0.t(((float) this.f11332o.J()) / ((float) this.f11338u), 0.0f, 0.95f);
            }
            this.f11332o.Q(c10 + l10);
        }
        return new b(new b(spannableStringBuilder, (Layout.Alignment) null, f10, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }
}
