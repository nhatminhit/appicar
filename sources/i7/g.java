package i7;

import j6.s;
import w7.p;
import w7.q0;
import w7.w;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9313a = "CeaUtil";

    /* renamed from: b  reason: collision with root package name */
    public static final int f9314b = q0.T("GA94");

    /* renamed from: c  reason: collision with root package name */
    public static final int f9315c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static final int f9316d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f9317e = 181;

    /* renamed from: f  reason: collision with root package name */
    public static final int f9318f = 49;

    /* renamed from: g  reason: collision with root package name */
    public static final int f9319g = 47;

    public static void a(long j10, w wVar, s[] sVarArr) {
        while (true) {
            boolean z10 = true;
            if (wVar.a() > 1) {
                int c10 = c(wVar);
                int c11 = c(wVar);
                int c12 = wVar.c() + c11;
                if (c11 == -1 || c11 > wVar.a()) {
                    p.l(f9313a, "Skipping remainder of malformed SEI NAL unit.");
                    c12 = wVar.d();
                } else if (c10 == 4 && c11 >= 8) {
                    int D = wVar.D();
                    int J = wVar.J();
                    int l10 = J == 49 ? wVar.l() : 0;
                    int D2 = wVar.D();
                    if (J == 47) {
                        wVar.R(1);
                    }
                    boolean z11 = D == 181 && (J == 49 || J == 47) && D2 == 3;
                    if (J == 49) {
                        if (l10 != f9314b) {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        b(j10, wVar, sVarArr);
                    }
                }
                wVar.Q(c12);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, w wVar, s[] sVarArr) {
        int D = wVar.D();
        if ((D & 64) != 0) {
            wVar.R(1);
            int i10 = (D & 31) * 3;
            int c10 = wVar.c();
            for (s sVar : sVarArr) {
                wVar.Q(c10);
                sVar.a(wVar, i10);
                sVar.c(j10, 1, i10, 0, (s.a) null);
            }
        }
    }

    public static int c(w wVar) {
        int i10 = 0;
        while (wVar.a() != 0) {
            int D = wVar.D();
            i10 += D;
            if (D != 255) {
                return i10;
            }
        }
        return -1;
    }
}
