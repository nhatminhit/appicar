package l6;

import b6.c;
import b6.j0;
import d.o0;
import j6.h;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import w7.w;

public final class d extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final String f10231c = "onMetaData";

    /* renamed from: d  reason: collision with root package name */
    public static final String f10232d = "duration";

    /* renamed from: e  reason: collision with root package name */
    public static final int f10233e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f10234f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f10235g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f10236h = 3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f10237i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final int f10238j = 9;

    /* renamed from: k  reason: collision with root package name */
    public static final int f10239k = 10;

    /* renamed from: l  reason: collision with root package name */
    public static final int f10240l = 11;

    /* renamed from: b  reason: collision with root package name */
    public long f10241b = c.f4201b;

    public d() {
        super(new h());
    }

    public static Boolean f(w wVar) {
        boolean z10 = true;
        if (wVar.D() != 1) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @o0
    public static Object g(w wVar, int i10) {
        if (i10 == 0) {
            return i(wVar);
        }
        if (i10 == 1) {
            return f(wVar);
        }
        if (i10 == 2) {
            return m(wVar);
        }
        if (i10 == 3) {
            return k(wVar);
        }
        if (i10 == 8) {
            return j(wVar);
        }
        if (i10 == 10) {
            return l(wVar);
        }
        if (i10 != 11) {
            return null;
        }
        return h(wVar);
    }

    public static Date h(w wVar) {
        Date date = new Date((long) i(wVar).doubleValue());
        wVar.R(2);
        return date;
    }

    public static Double i(w wVar) {
        return Double.valueOf(Double.longBitsToDouble(wVar.w()));
    }

    public static HashMap<String, Object> j(w wVar) {
        int H = wVar.H();
        HashMap<String, Object> hashMap = new HashMap<>(H);
        for (int i10 = 0; i10 < H; i10++) {
            String m10 = m(wVar);
            Object g10 = g(wVar, n(wVar));
            if (g10 != null) {
                hashMap.put(m10, g10);
            }
        }
        return hashMap;
    }

    public static HashMap<String, Object> k(w wVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String m10 = m(wVar);
            int n10 = n(wVar);
            if (n10 == 9) {
                return hashMap;
            }
            Object g10 = g(wVar, n10);
            if (g10 != null) {
                hashMap.put(m10, g10);
            }
        }
    }

    public static ArrayList<Object> l(w wVar) {
        int H = wVar.H();
        ArrayList<Object> arrayList = new ArrayList<>(H);
        for (int i10 = 0; i10 < H; i10++) {
            Object g10 = g(wVar, n(wVar));
            if (g10 != null) {
                arrayList.add(g10);
            }
        }
        return arrayList;
    }

    public static String m(w wVar) {
        int J = wVar.J();
        int c10 = wVar.c();
        wVar.R(J);
        return new String(wVar.f14880a, c10, J);
    }

    public static int n(w wVar) {
        return wVar.D();
    }

    public boolean b(w wVar) {
        return true;
    }

    public boolean c(w wVar, long j10) throws j0 {
        if (n(wVar) != 2) {
            throw new j0();
        } else if (!f10231c.equals(m(wVar)) || n(wVar) != 8) {
            return false;
        } else {
            HashMap<String, Object> j11 = j(wVar);
            if (j11.containsKey(f10232d)) {
                double doubleValue = ((Double) j11.get(f10232d)).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f10241b = (long) (doubleValue * 1000000.0d);
                }
            }
            return false;
        }
    }

    public void d() {
    }

    public long e() {
        return this.f10241b;
    }
}
