package y;

import java.util.Iterator;
import x.e;

public class g extends d {

    /* renamed from: g  reason: collision with root package name */
    public Object f15236g;

    /* renamed from: h  reason: collision with root package name */
    public Object f15237h;

    /* renamed from: i  reason: collision with root package name */
    public Object f15238i;

    /* renamed from: j  reason: collision with root package name */
    public Object f15239j;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15240a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                x.e$b[] r0 = x.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15240a = r0
                x.e$b r1 = x.e.b.SPREAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15240a     // Catch:{ NoSuchFieldError -> 0x001d }
                x.e$b r1 = x.e.b.SPREAD_INSIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15240a     // Catch:{ NoSuchFieldError -> 0x0028 }
                x.e$b r1 = x.e.b.PACKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y.g.a.<clinit>():void");
        }
    }

    public g(e eVar) {
        super(eVar, e.C0237e.VERTICAL_CHAIN);
    }

    public void b() {
        Iterator<Object> it = this.f14977c.iterator();
        while (it.hasNext()) {
            this.f14975a.e(it.next()).o();
        }
        Iterator<Object> it2 = this.f14977c.iterator();
        x.a aVar = null;
        x.a aVar2 = null;
        while (it2.hasNext()) {
            x.a e10 = this.f14975a.e(it2.next());
            if (aVar2 == null) {
                Object obj = this.f15236g;
                if (obj == null) {
                    Object obj2 = this.f15237h;
                    if (obj2 != null) {
                        e10.V(obj2);
                        aVar2 = e10;
                    } else {
                        obj = e.f14983i;
                    }
                }
                e10.W(obj);
                aVar2 = e10;
            }
            if (aVar != null) {
                aVar.j(e10.getKey());
                e10.V(aVar.getKey());
            }
            aVar = e10;
        }
        if (aVar != null) {
            Object obj3 = this.f15238i;
            if (obj3 != null) {
                aVar.j(obj3);
            } else {
                Object obj4 = this.f15239j;
                if (obj4 == null) {
                    obj4 = e.f14983i;
                }
                aVar.i(obj4);
            }
        }
        if (aVar2 != null) {
            float f10 = this.f15222e;
            if (f10 != 0.5f) {
                aVar2.Y(f10);
            }
        }
        int i10 = a.f15240a[this.f15223f.ordinal()];
        if (i10 == 1) {
            aVar2.O(0);
        } else if (i10 == 2) {
            aVar2.O(1);
        } else if (i10 == 3) {
            aVar2.O(2);
        }
    }

    public void j(Object obj) {
        this.f15239j = obj;
    }

    public void k(Object obj) {
        this.f15238i = obj;
    }

    public void l(Object obj) {
        this.f15237h = obj;
    }

    public void m(Object obj) {
        this.f15236g = obj;
    }
}
