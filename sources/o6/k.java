package o6;

import android.support.v4.media.session.PlaybackStateCompat;
import j6.j;
import java.io.IOException;
import t6.d;
import w7.q0;
import w7.w;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final int f11279a = 4096;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f11280b = {q0.T("isom"), q0.T("iso2"), q0.T("iso3"), q0.T("iso4"), q0.T("iso5"), q0.T("iso6"), q0.T(d.f13029f), q0.T(d.f13033j), q0.T(d.f13032i), q0.T("av01"), q0.T("mp41"), q0.T("mp42"), q0.T("3g2a"), q0.T("3g2b"), q0.T("3gr6"), q0.T("3gs6"), q0.T("3ge6"), q0.T("3gg6"), q0.T("M4V "), q0.T("M4A "), q0.T("f4v "), q0.T("kddi"), q0.T("M4VP"), q0.T("qt  "), q0.T("MSNV"), q0.T("dby1")};

    public static boolean a(int i10) {
        if ((i10 >>> 8) == q0.T("3gp")) {
            return true;
        }
        for (int i11 : f11280b) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(j jVar) throws IOException, InterruptedException {
        return c(jVar, true);
    }

    public static boolean c(j jVar, boolean z10) throws IOException, InterruptedException {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        j jVar2 = jVar;
        long length = jVar.getLength();
        long j10 = -1;
        int i10 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        long j11 = PlaybackStateCompat.f556m0;
        if (i10 != 0 && length <= PlaybackStateCompat.f556m0) {
            j11 = length;
        }
        int i11 = (int) j11;
        w wVar = new w(64);
        boolean z15 = false;
        int i12 = 0;
        boolean z16 = false;
        while (true) {
            if (i12 >= i11) {
                z11 = z15;
                break;
            }
            wVar.M(8);
            jVar2.k(wVar.f14880a, z15 ? 1 : 0, 8);
            long F = wVar.F();
            int l10 = wVar.l();
            int i13 = 16;
            if (F == 1) {
                jVar2.k(wVar.f14880a, 8, 8);
                wVar.P(16);
                F = wVar.w();
            } else {
                if (F == 0) {
                    long length2 = jVar.getLength();
                    if (length2 != j10) {
                        F = (length2 - jVar.d()) + ((long) 8);
                    }
                }
                i13 = 8;
            }
            if (i10 != 0 && ((long) i12) + F > length) {
                return z15;
            }
            long j12 = (long) i13;
            if (F < j12) {
                return z15;
            }
            i12 += i13;
            if (l10 == a.W) {
                i11 += (int) F;
                if (i10 != 0 && ((long) i11) > length) {
                    i11 = (int) length;
                }
            } else if (l10 == a.f11080d0 || l10 == a.f11086f0) {
                z11 = z15;
                z12 = true;
                z13 = true;
            } else {
                long j13 = length;
                int i14 = i12;
                if ((((long) i12) + F) - j12 >= ((long) i11)) {
                    z11 = false;
                    break;
                }
                int i15 = (int) (F - j12);
                i12 = i14 + i15;
                if (l10 != a.f11088g) {
                    z14 = false;
                    if (i15 != 0) {
                        jVar2.e(i15);
                    }
                } else if (i15 < 8) {
                    return false;
                } else {
                    wVar.M(i15);
                    jVar2.k(wVar.f14880a, 0, i15);
                    int i16 = i15 / 4;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= i16) {
                            break;
                        }
                        if (i17 == 1) {
                            wVar.R(4);
                        } else if (a(wVar.l())) {
                            z16 = true;
                            break;
                        }
                        i17++;
                    }
                    z14 = false;
                    if (!z16) {
                        return false;
                    }
                }
                z15 = z14;
                length = j13;
            }
            j10 = -1;
        }
        z12 = true;
        z13 = z11;
        return (!z16 || z10 != z13) ? z11 : z12;
    }

    public static boolean d(j jVar) throws IOException, InterruptedException {
        return c(jVar, false);
    }
}
