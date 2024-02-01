package z3;

import android.graphics.Bitmap;
import d.g1;
import d.o0;
import d.t0;
import java.util.NavigableMap;
import t4.m;

@t0(19)
public final class p implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final int f15847d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final b f15848a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final h<a, Bitmap> f15849b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    public final NavigableMap<Integer, Integer> f15850c = new n();

    @g1
    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public final b f15851a;

        /* renamed from: b  reason: collision with root package name */
        public int f15852b;

        public a(b bVar) {
            this.f15851a = bVar;
        }

        public void a() {
            this.f15851a.c(this);
        }

        public void b(int i10) {
            this.f15852b = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f15852b == ((a) obj).f15852b;
        }

        public int hashCode() {
            return this.f15852b;
        }

        public String toString() {
            return p.g(this.f15852b);
        }
    }

    @g1
    public static class b extends d<a> {
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i10) {
            a aVar = (a) super.b();
            aVar.b(i10);
            return aVar;
        }
    }

    public static String g(int i10) {
        return "[" + i10 + "]";
    }

    public static String h(Bitmap bitmap) {
        return g(m.h(bitmap));
    }

    public String a(int i10, int i11, Bitmap.Config config) {
        return g(m.g(i10, i11, config));
    }

    public int b(Bitmap bitmap) {
        return m.h(bitmap);
    }

    public String c(Bitmap bitmap) {
        return h(bitmap);
    }

    public void d(Bitmap bitmap) {
        a e10 = this.f15848a.e(m.h(bitmap));
        this.f15849b.d(e10, bitmap);
        Integer num = this.f15850c.get(Integer.valueOf(e10.f15852b));
        NavigableMap<Integer, Integer> navigableMap = this.f15850c;
        Integer valueOf = Integer.valueOf(e10.f15852b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        navigableMap.put(valueOf, Integer.valueOf(i10));
    }

    public final void e(Integer num) {
        Integer num2 = this.f15850c.get(num);
        if (num2.intValue() == 1) {
            this.f15850c.remove(num);
        } else {
            this.f15850c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @o0
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        int g10 = m.g(i10, i11, config);
        a e10 = this.f15848a.e(g10);
        Integer ceilingKey = this.f15850c.ceilingKey(Integer.valueOf(g10));
        if (!(ceilingKey == null || ceilingKey.intValue() == g10 || ceilingKey.intValue() > g10 * 8)) {
            this.f15848a.c(e10);
            e10 = this.f15848a.e(ceilingKey.intValue());
        }
        Bitmap a10 = this.f15849b.a(e10);
        if (a10 != null) {
            a10.reconfigure(i10, i11, config);
            e(ceilingKey);
        }
        return a10;
    }

    @o0
    public Bitmap removeLast() {
        Bitmap f10 = this.f15849b.f();
        if (f10 != null) {
            e(Integer.valueOf(m.h(f10)));
        }
        return f10;
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f15849b + "\n  SortedSizes" + this.f15850c;
    }
}
