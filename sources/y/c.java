package y;

import x.e;
import z.j;

public class c extends x.c {

    /* renamed from: e  reason: collision with root package name */
    public e.d f15218e;

    /* renamed from: f  reason: collision with root package name */
    public int f15219f;

    /* renamed from: g  reason: collision with root package name */
    public z.a f15220g;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15221a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                x.e$d[] r0 = x.e.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15221a = r0
                x.e$d r1 = x.e.d.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15221a     // Catch:{ NoSuchFieldError -> 0x001d }
                x.e$d r1 = x.e.d.START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15221a     // Catch:{ NoSuchFieldError -> 0x0028 }
                x.e$d r1 = x.e.d.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15221a     // Catch:{ NoSuchFieldError -> 0x0033 }
                x.e$d r1 = x.e.d.END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15221a     // Catch:{ NoSuchFieldError -> 0x003e }
                x.e$d r1 = x.e.d.TOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15221a     // Catch:{ NoSuchFieldError -> 0x0049 }
                x.e$d r1 = x.e.d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y.c.a.<clinit>():void");
        }
    }

    public c(e eVar) {
        super(eVar, e.C0237e.BARRIER);
    }

    public void b() {
        c();
        int i10 = 0;
        switch (a.f15221a[this.f15218e.ordinal()]) {
            case 3:
            case 4:
                i10 = 1;
                break;
            case 5:
                i10 = 2;
                break;
            case 6:
                i10 = 3;
                break;
        }
        this.f15220g.X1(i10);
        this.f15220g.Y1(this.f15219f);
    }

    public j c() {
        if (this.f15220g == null) {
            this.f15220g = new z.a();
        }
        return this.f15220g;
    }

    public void f(int i10) {
        this.f15219f = i10;
    }

    public void g(Object obj) {
        f(this.f14975a.f(obj));
    }

    public void h(e.d dVar) {
        this.f15218e = dVar;
    }
}
