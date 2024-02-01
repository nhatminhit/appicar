package m7;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import h7.b;
import h7.c;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w7.p;
import w7.q;
import w7.w;

public final class a extends c {
    public static final String A = "{\\an3}";
    public static final String B = "{\\an4}";
    public static final String C = "{\\an5}";
    public static final String D = "{\\an6}";
    public static final String E = "{\\an7}";
    public static final String F = "{\\an8}";
    public static final String G = "{\\an9}";

    /* renamed from: q  reason: collision with root package name */
    public static final float f10639q = 0.08f;

    /* renamed from: r  reason: collision with root package name */
    public static final float f10640r = 0.92f;

    /* renamed from: s  reason: collision with root package name */
    public static final float f10641s = 0.5f;

    /* renamed from: t  reason: collision with root package name */
    public static final String f10642t = "SubripDecoder";

    /* renamed from: u  reason: collision with root package name */
    public static final String f10643u = "(?:(\\d+):)?(\\d+):(\\d+),(\\d+)";

    /* renamed from: v  reason: collision with root package name */
    public static final Pattern f10644v = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");

    /* renamed from: w  reason: collision with root package name */
    public static final Pattern f10645w = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: x  reason: collision with root package name */
    public static final String f10646x = "\\{\\\\an[1-9]\\}";

    /* renamed from: y  reason: collision with root package name */
    public static final String f10647y = "{\\an1}";

    /* renamed from: z  reason: collision with root package name */
    public static final String f10648z = "{\\an2}";

    /* renamed from: o  reason: collision with root package name */
    public final StringBuilder f10649o = new StringBuilder();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<String> f10650p = new ArrayList<>();

    public a() {
        super(f10642t);
    }

    public static float E(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long F(Matcher matcher, int i10) {
        return ((Long.parseLong(matcher.group(i10 + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i10 + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i10 + 3)) * 1000) + Long.parseLong(matcher.group(i10 + 4))) * 1000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h7.b C(android.text.Spanned r19, @d.o0 java.lang.String r20) {
        /*
            r18 = this;
            r0 = r20
            if (r0 != 0) goto L_0x000c
            h7.b r0 = new h7.b
            r2 = r19
            r0.<init>(r2)
            return r0
        L_0x000c:
            r2 = r19
            int r1 = r20.hashCode()
            java.lang.String r6 = "{\\an9}"
            java.lang.String r7 = "{\\an8}"
            java.lang.String r8 = "{\\an7}"
            java.lang.String r9 = "{\\an6}"
            java.lang.String r10 = "{\\an5}"
            java.lang.String r11 = "{\\an4}"
            java.lang.String r12 = "{\\an3}"
            java.lang.String r13 = "{\\an2}"
            java.lang.String r14 = "{\\an1}"
            r16 = 0
            r4 = 4
            r5 = 3
            r15 = 2
            r3 = 1
            switch(r1) {
                case -685620710: goto L_0x006f;
                case -685620679: goto L_0x0067;
                case -685620648: goto L_0x005f;
                case -685620617: goto L_0x0057;
                case -685620586: goto L_0x004f;
                case -685620555: goto L_0x0047;
                case -685620524: goto L_0x003f;
                case -685620493: goto L_0x0036;
                case -685620462: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0078
        L_0x002e:
            boolean r1 = r0.equals(r6)
            if (r1 == 0) goto L_0x0078
            r1 = 5
            goto L_0x0079
        L_0x0036:
            boolean r1 = r0.equals(r7)
            if (r1 == 0) goto L_0x0078
            r1 = 8
            goto L_0x0079
        L_0x003f:
            boolean r1 = r0.equals(r8)
            if (r1 == 0) goto L_0x0078
            r1 = r15
            goto L_0x0079
        L_0x0047:
            boolean r1 = r0.equals(r9)
            if (r1 == 0) goto L_0x0078
            r1 = r4
            goto L_0x0079
        L_0x004f:
            boolean r1 = r0.equals(r10)
            if (r1 == 0) goto L_0x0078
            r1 = 7
            goto L_0x0079
        L_0x0057:
            boolean r1 = r0.equals(r11)
            if (r1 == 0) goto L_0x0078
            r1 = r3
            goto L_0x0079
        L_0x005f:
            boolean r1 = r0.equals(r12)
            if (r1 == 0) goto L_0x0078
            r1 = r5
            goto L_0x0079
        L_0x0067:
            boolean r1 = r0.equals(r13)
            if (r1 == 0) goto L_0x0078
            r1 = 6
            goto L_0x0079
        L_0x006f:
            boolean r1 = r0.equals(r14)
            if (r1 == 0) goto L_0x0078
            r1 = r16
            goto L_0x0079
        L_0x0078:
            r1 = -1
        L_0x0079:
            if (r1 == 0) goto L_0x008c
            if (r1 == r3) goto L_0x008c
            if (r1 == r15) goto L_0x008c
            if (r1 == r5) goto L_0x0089
            if (r1 == r4) goto L_0x0089
            r4 = 5
            if (r1 == r4) goto L_0x0089
            r17 = r3
            goto L_0x008e
        L_0x0089:
            r17 = r15
            goto L_0x008e
        L_0x008c:
            r17 = r16
        L_0x008e:
            int r1 = r20.hashCode()
            switch(r1) {
                case -685620710: goto L_0x00d7;
                case -685620679: goto L_0x00cf;
                case -685620648: goto L_0x00c7;
                case -685620617: goto L_0x00bf;
                case -685620586: goto L_0x00b7;
                case -685620555: goto L_0x00ae;
                case -685620524: goto L_0x00a6;
                case -685620493: goto L_0x009e;
                case -685620462: goto L_0x0096;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x00e0
        L_0x0096:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e0
            r0 = 5
            goto L_0x00e1
        L_0x009e:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00e0
            r0 = 4
            goto L_0x00e1
        L_0x00a6:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00e0
            r0 = r5
            goto L_0x00e1
        L_0x00ae:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00e0
            r0 = 8
            goto L_0x00e1
        L_0x00b7:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00e0
            r0 = 7
            goto L_0x00e1
        L_0x00bf:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e0
            r0 = 6
            goto L_0x00e1
        L_0x00c7:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00e0
            r0 = r15
            goto L_0x00e1
        L_0x00cf:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00e0
            r0 = r3
            goto L_0x00e1
        L_0x00d7:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00e0
            r0 = r16
            goto L_0x00e1
        L_0x00e0:
            r0 = -1
        L_0x00e1:
            if (r0 == 0) goto L_0x00f4
            if (r0 == r3) goto L_0x00f4
            if (r0 == r15) goto L_0x00f4
            if (r0 == r5) goto L_0x00f1
            r1 = 4
            if (r0 == r1) goto L_0x00f1
            r1 = 5
            if (r0 == r1) goto L_0x00f1
            r6 = r3
            goto L_0x00f5
        L_0x00f1:
            r6 = r16
            goto L_0x00f5
        L_0x00f4:
            r6 = r15
        L_0x00f5:
            h7.b r0 = new h7.b
            r3 = 0
            float r4 = E(r6)
            r5 = 0
            float r7 = E(r17)
            r9 = 1
            r1 = r0
            r2 = r19
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.a.C(android.text.Spanned, java.lang.String):h7.b");
    }

    /* renamed from: D */
    public b z(byte[] bArr, int i10, boolean z10) {
        StringBuilder sb2;
        String str;
        ArrayList arrayList = new ArrayList();
        q qVar = new q();
        w wVar = new w(bArr, i10);
        while (true) {
            String n10 = wVar.n();
            if (n10 == null) {
                break;
            } else if (n10.length() != 0) {
                try {
                    Integer.parseInt(n10);
                    n10 = wVar.n();
                    if (n10 == null) {
                        p.l(f10642t, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f10644v.matcher(n10);
                    if (matcher.matches()) {
                        boolean z11 = true;
                        qVar.a(F(matcher, 1));
                        int i11 = 0;
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            qVar.a(F(matcher, 6));
                        } else {
                            z11 = false;
                        }
                        this.f10649o.setLength(0);
                        this.f10650p.clear();
                        while (true) {
                            String n11 = wVar.n();
                            if (TextUtils.isEmpty(n11)) {
                                break;
                            }
                            if (this.f10649o.length() > 0) {
                                this.f10649o.append("<br>");
                            }
                            this.f10649o.append(G(n11, this.f10650p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f10649o.toString());
                        String str2 = null;
                        while (true) {
                            if (i11 >= this.f10650p.size()) {
                                break;
                            }
                            String str3 = this.f10650p.get(i11);
                            if (str3.matches(f10646x)) {
                                str2 = str3;
                                break;
                            }
                            i11++;
                        }
                        arrayList.add(C(fromHtml, str2));
                        if (z11) {
                            arrayList.add(b.f8883c0);
                        }
                    } else {
                        sb2 = new StringBuilder();
                        str = "Skipping invalid timing: ";
                        sb2.append(str);
                        sb2.append(n10);
                        p.l(f10642t, sb2.toString());
                    }
                } catch (NumberFormatException unused) {
                    sb2 = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
            }
        }
        b[] bVarArr = new b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return new b(bVarArr, qVar.d());
    }

    public final String G(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f10645w.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i10 += length;
        }
        return sb2.toString();
    }
}
