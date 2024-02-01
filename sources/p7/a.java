package p7;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.b;
import w7.e;
import w7.q0;
import w7.w;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f11632c = "background-color";

    /* renamed from: d  reason: collision with root package name */
    public static final String f11633d = "font-family";

    /* renamed from: e  reason: collision with root package name */
    public static final String f11634e = "font-weight";

    /* renamed from: f  reason: collision with root package name */
    public static final String f11635f = "text-decoration";

    /* renamed from: g  reason: collision with root package name */
    public static final String f11636g = "bold";

    /* renamed from: h  reason: collision with root package name */
    public static final String f11637h = "underline";

    /* renamed from: i  reason: collision with root package name */
    public static final String f11638i = "{";

    /* renamed from: j  reason: collision with root package name */
    public static final String f11639j = "}";

    /* renamed from: k  reason: collision with root package name */
    public static final String f11640k = "font-style";

    /* renamed from: l  reason: collision with root package name */
    public static final String f11641l = "italic";

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f11642m = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a  reason: collision with root package name */
    public final w f11643a = new w();

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f11644b = new StringBuilder();

    public static boolean b(w wVar) {
        int c10 = wVar.c();
        int d10 = wVar.d();
        byte[] bArr = wVar.f14880a;
        if (c10 + 2 > d10) {
            return false;
        }
        int i10 = c10 + 1;
        if (bArr[c10] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (bArr[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= d10) {
                wVar.R(d10 - wVar.c());
                return true;
            } else if (((char) bArr[i11]) == '*' && ((char) bArr[i12]) == '/') {
                i11 = i12 + 1;
                d10 = i11;
            } else {
                i11 = i12;
            }
        }
    }

    public static boolean c(w wVar) {
        char j10 = j(wVar, wVar.c());
        if (j10 != 9 && j10 != 10 && j10 != 12 && j10 != 13 && j10 != ' ') {
            return false;
        }
        wVar.R(1);
        return true;
    }

    public static String e(w wVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int c10 = wVar.c();
        int d10 = wVar.d();
        while (c10 < d10 && !z10) {
            char c11 = (char) wVar.f14880a[c10];
            if ((c11 < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !((c11 >= '0' && c11 <= '9') || c11 == '#' || c11 == '-' || c11 == '.' || c11 == '_'))) {
                z10 = true;
            } else {
                c10++;
                sb2.append(c11);
            }
        }
        wVar.R(c10 - wVar.c());
        return sb2.toString();
    }

    public static String f(w wVar, StringBuilder sb2) {
        m(wVar);
        if (wVar.a() == 0) {
            return null;
        }
        String e10 = e(wVar, sb2);
        if (!"".equals(e10)) {
            return e10;
        }
        return "" + ((char) wVar.D());
    }

    public static String g(w wVar, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int c10 = wVar.c();
            String f10 = f(wVar, sb2);
            if (f10 == null) {
                return null;
            }
            if (f11639j.equals(f10) || ";".equals(f10)) {
                wVar.Q(c10);
                z10 = true;
            } else {
                sb3.append(f10);
            }
        }
        return sb3.toString();
    }

    public static String h(w wVar, StringBuilder sb2) {
        m(wVar);
        if (wVar.a() < 5 || !"::cue".equals(wVar.A(5))) {
            return null;
        }
        int c10 = wVar.c();
        String f10 = f(wVar, sb2);
        if (f10 == null) {
            return null;
        }
        if (f11638i.equals(f10)) {
            wVar.Q(c10);
            return "";
        }
        String k10 = "(".equals(f10) ? k(wVar) : null;
        String f11 = f(wVar, sb2);
        if (!")".equals(f11) || f11 == null) {
            return null;
        }
        return k10;
    }

    public static void i(w wVar, d dVar, StringBuilder sb2) {
        m(wVar);
        String e10 = e(wVar, sb2);
        if (!"".equals(e10) && ":".equals(f(wVar, sb2))) {
            m(wVar);
            String g10 = g(wVar, sb2);
            if (g10 != null && !"".equals(g10)) {
                int c10 = wVar.c();
                String f10 = f(wVar, sb2);
                if (!";".equals(f10)) {
                    if (f11639j.equals(f10)) {
                        wVar.Q(c10);
                    } else {
                        return;
                    }
                }
                if (b.L.equals(e10)) {
                    dVar.q(e.c(g10));
                } else if (f11632c.equals(e10)) {
                    dVar.o(e.c(g10));
                } else if (f11635f.equals(e10)) {
                    if ("underline".equals(g10)) {
                        dVar.B(true);
                    }
                } else if (f11633d.equals(e10)) {
                    dVar.r(g10);
                } else if (f11634e.equals(e10)) {
                    if ("bold".equals(g10)) {
                        dVar.p(true);
                    }
                } else if (f11640k.equals(e10) && "italic".equals(g10)) {
                    dVar.u(true);
                }
            }
        }
    }

    public static char j(w wVar, int i10) {
        return (char) wVar.f14880a[i10];
    }

    public static String k(w wVar) {
        int c10 = wVar.c();
        int d10 = wVar.d();
        boolean z10 = false;
        while (c10 < d10 && !z10) {
            int i10 = c10 + 1;
            z10 = ((char) wVar.f14880a[c10]) == ')';
            c10 = i10;
        }
        return wVar.A((c10 - 1) - wVar.c()).trim();
    }

    public static void l(w wVar) {
        do {
        } while (!TextUtils.isEmpty(wVar.n()));
    }

    public static void m(w wVar) {
        while (true) {
            boolean z10 = true;
            while (wVar.a() > 0 && z10) {
                if (!c(wVar) && !b(wVar)) {
                    z10 = false;
                }
            }
            return;
        }
    }

    public final void a(d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f11642m.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.z(matcher.group(1));
                }
                str = str.substring(0, indexOf);
            }
            String[] R0 = q0.R0(str, "\\.");
            String str2 = R0[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.y(str2.substring(0, indexOf2));
                dVar.x(str2.substring(indexOf2 + 1));
            } else {
                dVar.y(str2);
            }
            if (R0.length > 1) {
                dVar.w((String[]) Arrays.copyOfRange(R0, 1, R0.length));
            }
        }
    }

    public List<d> d(w wVar) {
        this.f11644b.setLength(0);
        int c10 = wVar.c();
        l(wVar);
        this.f11643a.O(wVar.f14880a, wVar.c());
        this.f11643a.Q(c10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String h10 = h(this.f11643a, this.f11644b);
            if (h10 == null || !f11638i.equals(f(this.f11643a, this.f11644b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, h10);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int c11 = this.f11643a.c();
                String f10 = f(this.f11643a, this.f11644b);
                boolean z11 = f10 == null || f11639j.equals(f10);
                if (!z11) {
                    this.f11643a.Q(c11);
                    i(this.f11643a, dVar, this.f11644b);
                }
                str = f10;
                z10 = z11;
            }
            if (f11639j.equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
