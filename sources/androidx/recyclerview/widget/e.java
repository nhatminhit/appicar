package androidx.recyclerview.widget;

import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.f0;
import d.f1;
import d.h1;
import d.m0;
import d.o0;

public class e<T> {

    /* renamed from: s  reason: collision with root package name */
    public static final String f3399s = "AsyncListUtil";

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f3400t = false;

    /* renamed from: a  reason: collision with root package name */
    public final Class<T> f3401a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3402b;

    /* renamed from: c  reason: collision with root package name */
    public final c<T> f3403c;

    /* renamed from: d  reason: collision with root package name */
    public final d f3404d;

    /* renamed from: e  reason: collision with root package name */
    public final f0<T> f3405e;

    /* renamed from: f  reason: collision with root package name */
    public final e0.b<T> f3406f;

    /* renamed from: g  reason: collision with root package name */
    public final e0.a<T> f3407g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f3408h = new int[2];

    /* renamed from: i  reason: collision with root package name */
    public final int[] f3409i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    public final int[] f3410j = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public boolean f3411k;

    /* renamed from: l  reason: collision with root package name */
    public int f3412l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f3413m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f3414n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f3415o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final SparseIntArray f3416p = new SparseIntArray();

    /* renamed from: q  reason: collision with root package name */
    public final e0.b<T> f3417q;

    /* renamed from: r  reason: collision with root package name */
    public final e0.a<T> f3418r;

    public class a implements e0.b<T> {
        public a() {
        }

        public void a(int i10, f0.a<T> aVar) {
            if (!d(i10)) {
                e.this.f3407g.b(aVar);
                return;
            }
            f0.a<T> a10 = e.this.f3405e.a(aVar);
            if (a10 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("duplicate tile @");
                sb2.append(a10.f3434b);
                e.this.f3407g.b(a10);
            }
            int i11 = aVar.f3434b + aVar.f3435c;
            int i12 = 0;
            while (i12 < e.this.f3416p.size()) {
                int keyAt = e.this.f3416p.keyAt(i12);
                if (aVar.f3434b > keyAt || keyAt >= i11) {
                    i12++;
                } else {
                    e.this.f3416p.removeAt(i12);
                    e.this.f3404d.d(keyAt);
                }
            }
        }

        public void b(int i10, int i11) {
            if (d(i10)) {
                f0.a<T> e10 = e.this.f3405e.e(i11);
                if (e10 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("tile not found @");
                    sb2.append(i11);
                    return;
                }
                e.this.f3407g.b(e10);
            }
        }

        public void c(int i10, int i11) {
            if (d(i10)) {
                e eVar = e.this;
                eVar.f3413m = i11;
                eVar.f3404d.c();
                e eVar2 = e.this;
                eVar2.f3414n = eVar2.f3415o;
                e();
                e eVar3 = e.this;
                eVar3.f3411k = false;
                eVar3.g();
            }
        }

        public final boolean d(int i10) {
            return i10 == e.this.f3415o;
        }

        public final void e() {
            for (int i10 = 0; i10 < e.this.f3405e.f(); i10++) {
                e eVar = e.this;
                eVar.f3407g.b(eVar.f3405e.c(i10));
            }
            e.this.f3405e.b();
        }
    }

    public class b implements e0.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public f0.a<T> f3420a;

        /* renamed from: b  reason: collision with root package name */
        public final SparseBooleanArray f3421b = new SparseBooleanArray();

        /* renamed from: c  reason: collision with root package name */
        public int f3422c;

        /* renamed from: d  reason: collision with root package name */
        public int f3423d;

        /* renamed from: e  reason: collision with root package name */
        public int f3424e;

        /* renamed from: f  reason: collision with root package name */
        public int f3425f;

        public b() {
        }

        public void a(int i10, int i11, int i12, int i13, int i14) {
            if (i10 <= i11) {
                int h10 = h(i10);
                int h11 = h(i11);
                this.f3424e = h(i12);
                int h12 = h(i13);
                this.f3425f = h12;
                if (i14 == 1) {
                    l(this.f3424e, h11, i14, true);
                    l(h11 + e.this.f3402b, this.f3425f, i14, false);
                    return;
                }
                l(h10, h12, i14, false);
                l(this.f3424e, h10 - e.this.f3402b, i14, true);
            }
        }

        public void b(f0.a<T> aVar) {
            e.this.f3403c.c(aVar.f3433a, aVar.f3435c);
            aVar.f3436d = this.f3420a;
            this.f3420a = aVar;
        }

        public void c(int i10, int i11) {
            if (!i(i10)) {
                f0.a e10 = e();
                e10.f3434b = i10;
                int min = Math.min(e.this.f3402b, this.f3423d - i10);
                e10.f3435c = min;
                e.this.f3403c.a(e10.f3433a, e10.f3434b, min);
                g(i11);
                f(e10);
            }
        }

        public void d(int i10) {
            this.f3422c = i10;
            this.f3421b.clear();
            int d10 = e.this.f3403c.d();
            this.f3423d = d10;
            e.this.f3406f.c(this.f3422c, d10);
        }

        public final f0.a<T> e() {
            f0.a<T> aVar = this.f3420a;
            if (aVar != null) {
                this.f3420a = aVar.f3436d;
                return aVar;
            }
            e eVar = e.this;
            return new f0.a<>(eVar.f3401a, eVar.f3402b);
        }

        public final void f(f0.a<T> aVar) {
            this.f3421b.put(aVar.f3434b, true);
            e.this.f3406f.a(this.f3422c, aVar);
        }

        public final void g(int i10) {
            int b10 = e.this.f3403c.b();
            while (this.f3421b.size() >= b10) {
                int keyAt = this.f3421b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f3421b;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i11 = this.f3424e - keyAt;
                int i12 = keyAt2 - this.f3425f;
                if (i11 > 0 && (i11 >= i12 || i10 == 2)) {
                    k(keyAt);
                } else if (i12 <= 0) {
                    return;
                } else {
                    if (i11 < i12 || i10 == 1) {
                        k(keyAt2);
                    } else {
                        return;
                    }
                }
            }
        }

        public final int h(int i10) {
            return i10 - (i10 % e.this.f3402b);
        }

        public final boolean i(int i10) {
            return this.f3421b.get(i10);
        }

        public final void j(String str, Object... objArr) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[BKGR] ");
            sb2.append(String.format(str, objArr));
        }

        public final void k(int i10) {
            this.f3421b.delete(i10);
            e.this.f3406f.b(this.f3422c, i10);
        }

        public final void l(int i10, int i11, int i12, boolean z10) {
            int i13 = i10;
            while (i13 <= i11) {
                e.this.f3407g.c(z10 ? (i11 + i10) - i13 : i13, i12);
                i13 += e.this.f3402b;
            }
        }
    }

    public static abstract class c<T> {
        @h1
        public abstract void a(@m0 T[] tArr, int i10, int i11);

        @h1
        public int b() {
            return 10;
        }

        @h1
        public void c(@m0 T[] tArr, int i10) {
        }

        @h1
        public abstract int d();
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public static final int f3427a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final int f3428b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f3429c = 2;

        @f1
        public void a(@m0 int[] iArr, @m0 int[] iArr2, int i10) {
            int i11 = iArr[1];
            int i12 = iArr[0];
            int i13 = (i11 - i12) + 1;
            int i14 = i13 / 2;
            iArr2[0] = i12 - (i10 == 1 ? i13 : i14);
            if (i10 != 2) {
                i13 = i14;
            }
            iArr2[1] = i11 + i13;
        }

        @f1
        public abstract void b(@m0 int[] iArr);

        @f1
        public abstract void c();

        @f1
        public abstract void d(int i10);
    }

    public e(@m0 Class<T> cls, int i10, @m0 c<T> cVar, @m0 d dVar) {
        a aVar = new a();
        this.f3417q = aVar;
        b bVar = new b();
        this.f3418r = bVar;
        this.f3401a = cls;
        this.f3402b = i10;
        this.f3403c = cVar;
        this.f3404d = dVar;
        this.f3405e = new f0<>(i10);
        u uVar = new u();
        this.f3406f = uVar.b(aVar);
        this.f3407g = uVar.a(bVar);
        f();
    }

    @o0
    public T a(int i10) {
        if (i10 < 0 || i10 >= this.f3413m) {
            throw new IndexOutOfBoundsException(i10 + " is not within 0 and " + this.f3413m);
        }
        T d10 = this.f3405e.d(i10);
        if (d10 == null && !c()) {
            this.f3416p.put(i10, 0);
        }
        return d10;
    }

    public int b() {
        return this.f3413m;
    }

    public final boolean c() {
        return this.f3415o != this.f3414n;
    }

    public void d(String str, Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[MAIN] ");
        sb2.append(String.format(str, objArr));
    }

    public void e() {
        if (!c()) {
            g();
            this.f3411k = true;
        }
    }

    public void f() {
        this.f3416p.clear();
        e0.a<T> aVar = this.f3407g;
        int i10 = this.f3415o + 1;
        this.f3415o = i10;
        aVar.d(i10);
    }

    public void g() {
        int i10;
        this.f3404d.b(this.f3408h);
        int[] iArr = this.f3408h;
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (i11 <= i12 && i11 >= 0 && i12 < this.f3413m) {
            if (this.f3411k) {
                int[] iArr2 = this.f3409i;
                if (i11 <= iArr2[1] && (i10 = iArr2[0]) <= i12) {
                    if (i11 < i10) {
                        this.f3412l = 1;
                    } else if (i11 > i10) {
                        this.f3412l = 2;
                    }
                    int[] iArr3 = this.f3409i;
                    iArr3[0] = i11;
                    iArr3[1] = i12;
                    this.f3404d.a(iArr, this.f3410j, this.f3412l);
                    int[] iArr4 = this.f3410j;
                    iArr4[0] = Math.min(this.f3408h[0], Math.max(iArr4[0], 0));
                    int[] iArr5 = this.f3410j;
                    iArr5[1] = Math.max(this.f3408h[1], Math.min(iArr5[1], this.f3413m - 1));
                    e0.a<T> aVar = this.f3407g;
                    int[] iArr6 = this.f3408h;
                    int i13 = iArr6[0];
                    int i14 = iArr6[1];
                    int[] iArr7 = this.f3410j;
                    aVar.a(i13, i14, iArr7[0], iArr7[1], this.f3412l);
                }
            }
            this.f3412l = 0;
            int[] iArr32 = this.f3409i;
            iArr32[0] = i11;
            iArr32[1] = i12;
            this.f3404d.a(iArr, this.f3410j, this.f3412l);
            int[] iArr42 = this.f3410j;
            iArr42[0] = Math.min(this.f3408h[0], Math.max(iArr42[0], 0));
            int[] iArr52 = this.f3410j;
            iArr52[1] = Math.max(this.f3408h[1], Math.min(iArr52[1], this.f3413m - 1));
            e0.a<T> aVar2 = this.f3407g;
            int[] iArr62 = this.f3408h;
            int i132 = iArr62[0];
            int i142 = iArr62[1];
            int[] iArr72 = this.f3410j;
            aVar2.a(i132, i142, iArr72[0], iArr72[1], this.f3412l);
        }
    }
}
