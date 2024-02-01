package x;

import java.util.HashMap;
import java.util.Iterator;
import y.g;
import z.f;
import z.j;

public class e {

    /* renamed from: e  reason: collision with root package name */
    public static final int f14979e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f14980f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f14981g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f14982h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final Integer f14983i = 0;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Object, d> f14984a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public HashMap<Object, c> f14985b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final a f14986c;

    /* renamed from: d  reason: collision with root package name */
    public int f14987d;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14988a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                x.e$e[] r0 = x.e.C0237e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14988a = r0
                x.e$e r1 = x.e.C0237e.HORIZONTAL_CHAIN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14988a     // Catch:{ NoSuchFieldError -> 0x001d }
                x.e$e r1 = x.e.C0237e.VERTICAL_CHAIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14988a     // Catch:{ NoSuchFieldError -> 0x0028 }
                x.e$e r1 = x.e.C0237e.ALIGN_HORIZONTALLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14988a     // Catch:{ NoSuchFieldError -> 0x0033 }
                x.e$e r1 = x.e.C0237e.ALIGN_VERTICALLY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14988a     // Catch:{ NoSuchFieldError -> 0x003e }
                x.e$e r1 = x.e.C0237e.BARRIER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x.e.a.<clinit>():void");
        }
    }

    public enum b {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum c {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY
    }

    public enum d {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* renamed from: x.e$e  reason: collision with other inner class name */
    public enum C0237e {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public e() {
        a aVar = new a(this);
        this.f14986c = aVar;
        this.f14987d = 0;
        this.f14984a.put(f14983i, aVar);
    }

    public void a(f fVar) {
        fVar.T1();
        this.f14986c.A().i(this, fVar, 0);
        this.f14986c.v().i(this, fVar, 1);
        for (Object next : this.f14985b.keySet()) {
            j c10 = this.f14985b.get(next).c();
            if (c10 != null) {
                d dVar = this.f14984a.get(next);
                if (dVar == null) {
                    dVar = e(next);
                }
                dVar.b(c10);
            }
        }
        for (Object obj : this.f14984a.keySet()) {
            d dVar2 = this.f14984a.get(obj);
            if (dVar2 != this.f14986c) {
                z.e c11 = dVar2.c();
                c11.x1((z.e) null);
                if (dVar2 instanceof y.e) {
                    dVar2.apply();
                }
                fVar.b(c11);
            } else {
                dVar2.b(fVar);
            }
        }
        for (Object obj2 : this.f14985b.keySet()) {
            c cVar = this.f14985b.get(obj2);
            if (cVar.c() != null) {
                Iterator<Object> it = cVar.f14977c.iterator();
                while (it.hasNext()) {
                    cVar.c().b(this.f14984a.get(it.next()).c());
                }
                cVar.b();
            }
        }
        for (Object obj3 : this.f14984a.keySet()) {
            this.f14984a.get(obj3).apply();
        }
    }

    public y.c b(Object obj, d dVar) {
        y.c cVar = (y.c) l(obj, C0237e.BARRIER);
        cVar.h(dVar);
        return cVar;
    }

    public y.a c(Object... objArr) {
        y.a aVar = (y.a) l((Object) null, C0237e.ALIGN_HORIZONTALLY);
        aVar.a(objArr);
        return aVar;
    }

    public y.b d(Object... objArr) {
        y.b bVar = (y.b) l((Object) null, C0237e.ALIGN_VERTICALLY);
        bVar.a(objArr);
        return bVar;
    }

    public a e(Object obj) {
        d dVar = this.f14984a.get(obj);
        if (dVar == null) {
            dVar = g(obj);
            this.f14984a.put(obj, dVar);
            dVar.a(obj);
        }
        if (dVar instanceof a) {
            return (a) dVar;
        }
        return null;
    }

    public int f(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public a g(Object obj) {
        return new a(this);
    }

    public final String h() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("__HELPER_KEY_");
        int i10 = this.f14987d;
        this.f14987d = i10 + 1;
        sb2.append(i10);
        sb2.append("__");
        return sb2.toString();
    }

    public void i() {
        for (Object next : this.f14984a.keySet()) {
            e(next).P(next);
        }
    }

    public y.e j(Object obj, int i10) {
        d dVar = this.f14984a.get(obj);
        y.e eVar = dVar;
        if (dVar == null) {
            y.e eVar2 = new y.e(this);
            eVar2.g(i10);
            eVar2.a(obj);
            this.f14984a.put(obj, eVar2);
            eVar = eVar2;
        }
        return (y.e) eVar;
    }

    public e k(b bVar) {
        return r(bVar);
    }

    public c l(Object obj, C0237e eVar) {
        c cVar;
        if (obj == null) {
            obj = h();
        }
        c cVar2 = this.f14985b.get(obj);
        if (cVar2 == null) {
            int i10 = a.f14988a[eVar.ordinal()];
            if (i10 == 1) {
                cVar = new y.f(this);
            } else if (i10 == 2) {
                cVar = new g(this);
            } else if (i10 == 3) {
                cVar = new y.a(this);
            } else if (i10 == 4) {
                cVar = new y.b(this);
            } else if (i10 != 5) {
                cVar2 = new c(this, eVar);
                this.f14985b.put(obj, cVar2);
            } else {
                cVar = new y.c(this);
            }
            cVar2 = cVar;
            this.f14985b.put(obj, cVar2);
        }
        return cVar2;
    }

    public y.f m(Object... objArr) {
        y.f fVar = (y.f) l((Object) null, C0237e.HORIZONTAL_CHAIN);
        fVar.a(objArr);
        return fVar;
    }

    public y.e n(Object obj) {
        return j(obj, 0);
    }

    public void o(Object obj, Object obj2) {
        e(obj).P(obj2);
    }

    public d p(Object obj) {
        return this.f14984a.get(obj);
    }

    public void q() {
        this.f14985b.clear();
    }

    public e r(b bVar) {
        this.f14986c.M(bVar);
        return this;
    }

    public e s(b bVar) {
        this.f14986c.Q(bVar);
        return this;
    }

    public g t(Object... objArr) {
        g gVar = (g) l((Object) null, C0237e.VERTICAL_CHAIN);
        gVar.a(objArr);
        return gVar;
    }

    public y.e u(Object obj) {
        return j(obj, 1);
    }

    public e v(b bVar) {
        return s(bVar);
    }
}
