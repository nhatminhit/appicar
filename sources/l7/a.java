package l7;

import d.o0;
import h7.b;
import h7.c;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w7.p;
import w7.q;
import w7.q0;
import w7.w;

public final class a extends c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f10254t = "SsaDecoder";

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f10255u = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");

    /* renamed from: v  reason: collision with root package name */
    public static final String f10256v = "Format: ";

    /* renamed from: w  reason: collision with root package name */
    public static final String f10257w = "Dialogue: ";

    /* renamed from: o  reason: collision with root package name */
    public final boolean f10258o;

    /* renamed from: p  reason: collision with root package name */
    public int f10259p;

    /* renamed from: q  reason: collision with root package name */
    public int f10260q;

    /* renamed from: r  reason: collision with root package name */
    public int f10261r;

    /* renamed from: s  reason: collision with root package name */
    public int f10262s;

    public a() {
        this((List<byte[]>) null);
    }

    public a(@o0 List<byte[]> list) {
        super(f10254t);
        if (list == null || list.isEmpty()) {
            this.f10258o = false;
            return;
        }
        this.f10258o = true;
        String F = q0.F(list.get(0));
        w7.a.a(F.startsWith(f10256v));
        F(F);
        G(new w(list.get(1)));
    }

    public static long H(String str) {
        Matcher matcher = f10255u.matcher(str);
        return !matcher.matches() ? b6.c.f4201b : (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* renamed from: C */
    public b z(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        q qVar = new q();
        w wVar = new w(bArr, i10);
        if (!this.f10258o) {
            G(wVar);
        }
        E(wVar, arrayList, qVar);
        b[] bVarArr = new b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return new b(bVarArr, qVar.d());
    }

    public final void D(String str, List<b> list, q qVar) {
        long j10;
        StringBuilder sb2;
        StringBuilder sb3;
        String str2;
        if (this.f10259p == 0) {
            sb3 = new StringBuilder();
            str2 = "Skipping dialogue line before complete format: ";
        } else {
            String[] split = str.substring(10).split(",", this.f10259p);
            if (split.length != this.f10259p) {
                sb3 = new StringBuilder();
                str2 = "Skipping dialogue line with fewer columns than format: ";
            } else {
                long H = H(split[this.f10260q]);
                if (H == b6.c.f4201b) {
                    sb2 = new StringBuilder();
                } else {
                    String str3 = split[this.f10261r];
                    if (!str3.trim().isEmpty()) {
                        j10 = H(str3);
                        if (j10 == b6.c.f4201b) {
                            sb2 = new StringBuilder();
                        }
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    list.add(new b(split[this.f10262s].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
                    qVar.a(H);
                    if (j10 != b6.c.f4201b) {
                        list.add(b.f8883c0);
                        qVar.a(j10);
                        return;
                    }
                    return;
                }
                sb3.append("Skipping invalid timing: ");
                sb3.append(str);
                p.l(f10254t, sb3.toString());
            }
        }
        sb3.append(str2);
        sb3.append(str);
        p.l(f10254t, sb3.toString());
    }

    public final void E(w wVar, List<b> list, q qVar) {
        while (true) {
            String n10 = wVar.n();
            if (n10 == null) {
                return;
            }
            if (!this.f10258o && n10.startsWith(f10256v)) {
                F(n10);
            } else if (n10.startsWith(f10257w)) {
                D(n10, list, qVar);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 8
            java.lang.String r6 = r6.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r6 = android.text.TextUtils.split(r6, r0)
            int r0 = r6.length
            r5.f10259p = r0
            r0 = -1
            r5.f10260q = r0
            r5.f10261r = r0
            r5.f10262s = r0
            r1 = 0
            r2 = r1
        L_0x0018:
            int r3 = r5.f10259p
            if (r2 >= r3) goto L_0x0061
            r3 = r6[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = w7.q0.Y0(r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case 100571: goto L_0x0048;
                case 3556653: goto L_0x003d;
                case 109757538: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            r3 = r0
            goto L_0x0052
        L_0x0032:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x003b
            goto L_0x0030
        L_0x003b:
            r3 = 2
            goto L_0x0052
        L_0x003d:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0046
            goto L_0x0030
        L_0x0046:
            r3 = 1
            goto L_0x0052
        L_0x0048:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0051
            goto L_0x0030
        L_0x0051:
            r3 = r1
        L_0x0052:
            switch(r3) {
                case 0: goto L_0x005c;
                case 1: goto L_0x0059;
                case 2: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x005e
        L_0x0056:
            r5.f10260q = r2
            goto L_0x005e
        L_0x0059:
            r5.f10262s = r2
            goto L_0x005e
        L_0x005c:
            r5.f10261r = r2
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0061:
            int r6 = r5.f10260q
            if (r6 == r0) goto L_0x006d
            int r6 = r5.f10261r
            if (r6 == r0) goto L_0x006d
            int r6 = r5.f10262s
            if (r6 != r0) goto L_0x006f
        L_0x006d:
            r5.f10259p = r1
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.a.F(java.lang.String):void");
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void G(w7.w r3) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.String r0 = r3.n()
            if (r0 == 0) goto L_0x000e
            java.lang.String r1 = "[Events]"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.a.G(w7.w):void");
    }
}
