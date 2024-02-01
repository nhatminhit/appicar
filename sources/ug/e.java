package ug;

import ch.c;
import ch.f;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import og.b0;
import og.c0;
import og.j;
import og.j0;
import og.l0;
import og.p;
import og.q;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final f f23378a = f.o("\"\\");

    /* renamed from: b  reason: collision with root package name */
    public static final f f23379b = f.o("\t ,=");

    public static long a(b0 b0Var) {
        return q(b0Var.d("Content-Length"));
    }

    public static long b(l0 l0Var) {
        return a(l0Var.q());
    }

    public static boolean c(l0 l0Var) {
        if (l0Var.e0().g().equals("HEAD")) {
            return false;
        }
        int i10 = l0Var.i();
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && b(l0Var) == -1 && !"chunked".equalsIgnoreCase(l0Var.l("Transfer-Encoding"))) ? false : true;
    }

    public static boolean d(b0 b0Var) {
        return r(b0Var).contains("*");
    }

    public static boolean e(l0 l0Var) {
        return d(l0Var.q());
    }

    public static void f(List<j> list, c cVar) {
        String j10;
        int m10;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    p(cVar);
                    str = j(cVar);
                    if (str == null) {
                        return;
                    }
                }
                boolean p10 = p(cVar);
                j10 = j(cVar);
                if (j10 != null) {
                    m10 = m(cVar, (byte) 61);
                    boolean p11 = p(cVar);
                    if (p10 || (!p11 && !cVar.X())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int m11 = m10 + m(cVar, (byte) 61);
                        while (true) {
                            if (j10 == null) {
                                j10 = j(cVar);
                                if (p(cVar)) {
                                    continue;
                                    break;
                                }
                                m11 = m(cVar, (byte) 61);
                            }
                            if (m11 == 0) {
                                continue;
                                break;
                            } else if (m11 <= 1 && !p(cVar)) {
                                String j11 = (cVar.X() || cVar.N(0) != 34) ? j(cVar) : i(cVar);
                                if (j11 == null || ((String) linkedHashMap.put(j10, j11)) != null) {
                                    return;
                                }
                                if (p(cVar) || cVar.X()) {
                                    j10 = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new j(str, (Map<String, String>) linkedHashMap));
                        str = j10;
                    }
                } else if (cVar.X()) {
                    list.add(new j(str, (Map<String, String>) Collections.emptyMap()));
                    return;
                } else {
                    return;
                }
            }
            list.add(new j(str, (Map<String, String>) Collections.singletonMap((Object) null, j10 + l('=', m10))));
        }
    }

    public static List<j> g(b0 b0Var, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b0Var.m(); i10++) {
            if (str.equalsIgnoreCase(b0Var.h(i10))) {
                f(arrayList, new c().D0(b0Var.o(i10)));
            }
        }
        return arrayList;
    }

    public static int h(String str, int i10) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > y4.c.M0) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static String i(c cVar) {
        if (cVar.readByte() == 34) {
            c cVar2 = new c();
            while (true) {
                long y12 = cVar.y1(f23378a);
                if (y12 == -1) {
                    return null;
                }
                if (cVar.N(y12) == 34) {
                    cVar2.d1(cVar, y12);
                    cVar.readByte();
                    return cVar2.o1();
                } else if (cVar.size() == y12 + 1) {
                    return null;
                } else {
                    cVar2.d1(cVar, y12);
                    cVar.readByte();
                    cVar2.d1(cVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static String j(c cVar) {
        try {
            long y12 = cVar.y1(f23379b);
            if (y12 == -1) {
                y12 = cVar.size();
            }
            if (y12 != 0) {
                return cVar.u(y12);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public static void k(q qVar, c0 c0Var, b0 b0Var) {
        if (qVar != q.f21767a) {
            List<p> k10 = p.k(c0Var, b0Var);
            if (!k10.isEmpty()) {
                qVar.b(c0Var, k10);
            }
        }
    }

    public static String l(char c10, int i10) {
        char[] cArr = new char[i10];
        Arrays.fill(cArr, c10);
        return new String(cArr);
    }

    public static int m(c cVar, byte b10) {
        int i10 = 0;
        while (!cVar.X() && cVar.N(0) == b10) {
            i10++;
            cVar.readByte();
        }
        return i10;
    }

    public static int n(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    public static int o(String str, int i10) {
        while (i10 < str.length() && ((r0 = str.charAt(i10)) == ' ' || r0 == 9)) {
            i10++;
        }
        return i10;
    }

    public static boolean p(c cVar) {
        boolean z10 = false;
        while (!cVar.X()) {
            byte N = cVar.N(0);
            if (N != 44) {
                if (N != 32 && N != 9) {
                    break;
                }
                cVar.readByte();
            } else {
                cVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    public static long q(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static Set<String> r(b0 b0Var) {
        Set<String> emptySet = Collections.emptySet();
        int m10 = b0Var.m();
        for (int i10 = 0; i10 < m10; i10++) {
            if ("Vary".equalsIgnoreCase(b0Var.h(i10))) {
                String o10 = b0Var.o(i10);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : o10.split(",")) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }

    public static Set<String> s(l0 l0Var) {
        return r(l0Var.q());
    }

    public static b0 t(b0 b0Var, b0 b0Var2) {
        Set<String> r10 = r(b0Var2);
        if (r10.isEmpty()) {
            return pg.e.f22067c;
        }
        b0.a aVar = new b0.a();
        int m10 = b0Var.m();
        for (int i10 = 0; i10 < m10; i10++) {
            String h10 = b0Var.h(i10);
            if (r10.contains(h10)) {
                aVar.b(h10, b0Var.o(i10));
            }
        }
        return aVar.i();
    }

    public static b0 u(l0 l0Var) {
        return t(l0Var.N().e0().e(), l0Var.q());
    }

    public static boolean v(l0 l0Var, b0 b0Var, j0 j0Var) {
        for (String next : s(l0Var)) {
            if (!Objects.equals(b0Var.p(next), j0Var.d(next))) {
                return false;
            }
        }
        return true;
    }
}
