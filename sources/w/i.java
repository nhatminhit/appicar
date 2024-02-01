package w;

import java.util.Arrays;
import java.util.HashSet;
import va.e;

public class i {
    public static final int A = 7;
    public static final int B = 8;
    public static int C = 1;
    public static int D = 1;
    public static int E = 1;
    public static int F = 1;
    public static int G = 1;
    public static final int H = 9;

    /* renamed from: r  reason: collision with root package name */
    public static final boolean f14311r = false;

    /* renamed from: s  reason: collision with root package name */
    public static final boolean f14312s = false;

    /* renamed from: t  reason: collision with root package name */
    public static final int f14313t = 0;

    /* renamed from: u  reason: collision with root package name */
    public static final int f14314u = 1;

    /* renamed from: v  reason: collision with root package name */
    public static final int f14315v = 2;

    /* renamed from: w  reason: collision with root package name */
    public static final int f14316w = 3;

    /* renamed from: x  reason: collision with root package name */
    public static final int f14317x = 4;

    /* renamed from: y  reason: collision with root package name */
    public static final int f14318y = 5;

    /* renamed from: z  reason: collision with root package name */
    public static final int f14319z = 6;

    /* renamed from: a  reason: collision with root package name */
    public boolean f14320a;

    /* renamed from: b  reason: collision with root package name */
    public String f14321b;

    /* renamed from: c  reason: collision with root package name */
    public int f14322c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f14323d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f14324e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f14325f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14326g = false;

    /* renamed from: h  reason: collision with root package name */
    public float[] f14327h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public float[] f14328i = new float[9];

    /* renamed from: j  reason: collision with root package name */
    public b f14329j;

    /* renamed from: k  reason: collision with root package name */
    public b[] f14330k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    public int f14331l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f14332m = 0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14333n = false;

    /* renamed from: o  reason: collision with root package name */
    public int f14334o = -1;

    /* renamed from: p  reason: collision with root package name */
    public float f14335p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    public HashSet<b> f14336q = null;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14337a;

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
                w.i$b[] r0 = w.i.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14337a = r0
                w.i$b r1 = w.i.b.UNRESTRICTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14337a     // Catch:{ NoSuchFieldError -> 0x001d }
                w.i$b r1 = w.i.b.CONSTANT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14337a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w.i$b r1 = w.i.b.SLACK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14337a     // Catch:{ NoSuchFieldError -> 0x0033 }
                w.i$b r1 = w.i.b.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14337a     // Catch:{ NoSuchFieldError -> 0x003e }
                w.i$b r1 = w.i.b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w.i.a.<clinit>():void");
        }
    }

    public enum b {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(String str, b bVar) {
        this.f14321b = str;
        this.f14329j = bVar;
    }

    public i(b bVar, String str) {
        this.f14329j = bVar;
    }

    public static String d(b bVar, String str) {
        StringBuilder sb2;
        int i10;
        if (str != null) {
            sb2 = new StringBuilder();
            sb2.append(str);
            i10 = D;
        } else {
            int i11 = a.f14337a[bVar.ordinal()];
            if (i11 == 1) {
                sb2 = new StringBuilder();
                sb2.append("U");
                i10 = E + 1;
                E = i10;
            } else if (i11 == 2) {
                sb2 = new StringBuilder();
                sb2.append("C");
                i10 = F + 1;
                F = i10;
            } else if (i11 == 3) {
                sb2 = new StringBuilder();
                sb2.append(w1.a.L4);
                i10 = C + 1;
                C = i10;
            } else if (i11 == 4) {
                sb2 = new StringBuilder();
                sb2.append(e.f23523d);
                i10 = D + 1;
                D = i10;
            } else if (i11 == 5) {
                sb2 = new StringBuilder();
                sb2.append(w1.a.R4);
                i10 = G + 1;
                G = i10;
            } else {
                throw new AssertionError(bVar.name());
            }
        }
        sb2.append(i10);
        return sb2.toString();
    }

    public static void e() {
        D++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f14331l;
            if (i10 >= i11) {
                b[] bVarArr = this.f14330k;
                if (i11 >= bVarArr.length) {
                    this.f14330k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f14330k;
                int i12 = this.f14331l;
                bVarArr2[i12] = bVar;
                this.f14331l = i12 + 1;
                return;
            } else if (this.f14330k[i10] != bVar) {
                i10++;
            } else {
                return;
            }
        }
    }

    public void b() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f14327h[i10] = 0.0f;
        }
    }

    public String c() {
        return this.f14321b;
    }

    public final void f(b bVar) {
        int i10 = this.f14331l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f14330k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f14330k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f14331l--;
                return;
            }
            i11++;
        }
    }

    public void g() {
        this.f14321b = null;
        this.f14329j = b.UNKNOWN;
        this.f14324e = 0;
        this.f14322c = -1;
        this.f14323d = -1;
        this.f14325f = 0.0f;
        this.f14326g = false;
        this.f14333n = false;
        this.f14334o = -1;
        this.f14335p = 0.0f;
        int i10 = this.f14331l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f14330k[i11] = null;
        }
        this.f14331l = 0;
        this.f14332m = 0;
        this.f14320a = false;
        Arrays.fill(this.f14328i, 0.0f);
    }

    public void h(e eVar, float f10) {
        this.f14325f = f10;
        this.f14326g = true;
        this.f14333n = false;
        this.f14334o = -1;
        this.f14335p = 0.0f;
        int i10 = this.f14331l;
        this.f14323d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f14330k[i11].a(eVar, this, false);
        }
        this.f14331l = 0;
    }

    public void i(String str) {
        this.f14321b = str;
    }

    public void j(e eVar, i iVar, float f10) {
        this.f14333n = true;
        this.f14334o = iVar.f14322c;
        this.f14335p = f10;
        int i10 = this.f14331l;
        this.f14323d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f14330k[i11].G(eVar, this, false);
        }
        this.f14331l = 0;
        eVar.z();
    }

    public void k(b bVar, String str) {
        this.f14329j = bVar;
    }

    public String l() {
        StringBuilder sb2;
        String str;
        String str2 = this + "[";
        boolean z10 = true;
        boolean z11 = false;
        for (int i10 = 0; i10 < this.f14327h.length; i10++) {
            String str3 = str2 + this.f14327h[i10];
            float[] fArr = this.f14327h;
            float f10 = fArr[i10];
            if (f10 > 0.0f) {
                z11 = false;
            } else if (f10 < 0.0f) {
                z11 = true;
            }
            if (f10 != 0.0f) {
                z10 = false;
            }
            if (i10 < fArr.length - 1) {
                sb2 = new StringBuilder();
                sb2.append(str3);
                str = ", ";
            } else {
                sb2 = new StringBuilder();
                sb2.append(str3);
                str = "] ";
            }
            sb2.append(str);
            str2 = sb2.toString();
        }
        if (z11) {
            str2 = str2 + " (-)";
        }
        if (!z10) {
            return str2;
        }
        return str2 + " (*)";
    }

    public final void m(e eVar, b bVar) {
        int i10 = this.f14331l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f14330k[i11].f(eVar, bVar, false);
        }
        this.f14331l = 0;
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f14321b != null) {
            sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f14321b);
        } else {
            sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(this.f14322c);
        }
        return sb2.toString();
    }
}
