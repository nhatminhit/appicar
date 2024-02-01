package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import e1.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a implements v.a {

    /* renamed from: i  reason: collision with root package name */
    public static final int f3336i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f3337j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final boolean f3338k = false;

    /* renamed from: l  reason: collision with root package name */
    public static final String f3339l = "AHT";

    /* renamed from: a  reason: collision with root package name */
    public m.a<b> f3340a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f3341b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f3342c;

    /* renamed from: d  reason: collision with root package name */
    public final C0046a f3343d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f3344e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3345f;

    /* renamed from: g  reason: collision with root package name */
    public final v f3346g;

    /* renamed from: h  reason: collision with root package name */
    public int f3347h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    public interface C0046a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(int i10, int i11, Object obj);

        void d(b bVar);

        RecyclerView.e0 e(int i10);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    public static class b {

        /* renamed from: e  reason: collision with root package name */
        public static final int f3348e = 1;

        /* renamed from: f  reason: collision with root package name */
        public static final int f3349f = 2;

        /* renamed from: g  reason: collision with root package name */
        public static final int f3350g = 4;

        /* renamed from: h  reason: collision with root package name */
        public static final int f3351h = 8;

        /* renamed from: i  reason: collision with root package name */
        public static final int f3352i = 30;

        /* renamed from: a  reason: collision with root package name */
        public int f3353a;

        /* renamed from: b  reason: collision with root package name */
        public int f3354b;

        /* renamed from: c  reason: collision with root package name */
        public Object f3355c;

        /* renamed from: d  reason: collision with root package name */
        public int f3356d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f3353a = i10;
            this.f3354b = i11;
            this.f3356d = i12;
            this.f3355c = obj;
        }

        public String a() {
            int i10 = this.f3353a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f3353a;
            if (i10 != bVar.f3353a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f3356d - this.f3354b) == 1 && this.f3356d == bVar.f3354b && this.f3354b == bVar.f3356d) {
                return true;
            }
            if (this.f3356d != bVar.f3356d || this.f3354b != bVar.f3354b) {
                return false;
            }
            Object obj2 = this.f3355c;
            Object obj3 = bVar.f3355c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3353a * 31) + this.f3354b) * 31) + this.f3356d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f3354b + "c:" + this.f3356d + ",p:" + this.f3355c + "]";
        }
    }

    public a(C0046a aVar) {
        this(aVar, false);
    }

    public a(C0046a aVar, boolean z10) {
        this.f3340a = new m.b(30);
        this.f3341b = new ArrayList<>();
        this.f3342c = new ArrayList<>();
        this.f3347h = 0;
        this.f3343d = aVar;
        this.f3345f = z10;
        this.f3346g = new v(this);
    }

    public final int A(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        for (int size = this.f3342c.size() - 1; size >= 0; size--) {
            b bVar = this.f3342c.get(size);
            int i18 = bVar.f3353a;
            if (i18 == 8) {
                int i19 = bVar.f3354b;
                int i20 = bVar.f3356d;
                if (i19 < i20) {
                    i14 = i19;
                    i13 = i20;
                } else {
                    i13 = i19;
                    i14 = i20;
                }
                if (i10 < i14 || i10 > i13) {
                    if (i10 < i19) {
                        if (i11 == 1) {
                            bVar.f3354b = i19 + 1;
                            i15 = i20 + 1;
                        } else if (i11 == 2) {
                            bVar.f3354b = i19 - 1;
                            i15 = i20 - 1;
                        }
                        bVar.f3356d = i15;
                    }
                } else if (i14 == i19) {
                    if (i11 == 1) {
                        i17 = i20 + 1;
                    } else {
                        if (i11 == 2) {
                            i17 = i20 - 1;
                        }
                        i10++;
                    }
                    bVar.f3356d = i17;
                    i10++;
                } else {
                    if (i11 == 1) {
                        i16 = i19 + 1;
                    } else {
                        if (i11 == 2) {
                            i16 = i19 - 1;
                        }
                        i10--;
                    }
                    bVar.f3354b = i16;
                    i10--;
                }
            } else {
                int i21 = bVar.f3354b;
                if (i21 > i10) {
                    if (i11 == 1) {
                        i12 = i21 + 1;
                    } else if (i11 == 2) {
                        i12 = i21 - 1;
                    }
                    bVar.f3354b = i12;
                } else if (i18 == 1) {
                    i10 -= bVar.f3356d;
                } else if (i18 == 2) {
                    i10 += bVar.f3356d;
                }
            }
        }
        for (int size2 = this.f3342c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f3342c.get(size2);
            if (bVar2.f3353a == 8) {
                int i22 = bVar2.f3356d;
                if (i22 != bVar2.f3354b && i22 >= 0) {
                }
            } else if (bVar2.f3356d > 0) {
            }
            this.f3342c.remove(size2);
            a(bVar2);
        }
        return i10;
    }

    public void a(b bVar) {
        if (!this.f3345f) {
            bVar.f3355c = null;
            this.f3340a.a(bVar);
        }
    }

    public b b(int i10, int i11, int i12, Object obj) {
        b b10 = this.f3340a.b();
        if (b10 == null) {
            return new b(i10, i11, i12, obj);
        }
        b10.f3353a = i10;
        b10.f3354b = i11;
        b10.f3356d = i12;
        b10.f3355c = obj;
        return b10;
    }

    public a c(b... bVarArr) {
        Collections.addAll(this.f3341b, bVarArr);
        return this;
    }

    public final void d(b bVar) {
        w(bVar);
    }

    public final void e(b bVar) {
        w(bVar);
    }

    public int f(int i10) {
        int size = this.f3341b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f3341b.get(i11);
            int i12 = bVar.f3353a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f3354b;
                    if (i13 <= i10) {
                        int i14 = bVar.f3356d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f3354b;
                    if (i15 == i10) {
                        i10 = bVar.f3356d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f3356d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f3354b <= i10) {
                i10 += bVar.f3356d;
            }
        }
        return i10;
    }

    public final void g(b bVar) {
        char c10;
        boolean z10;
        boolean z11;
        int i10 = bVar.f3354b;
        int i11 = bVar.f3356d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f3343d.e(i12) != null || i(i12)) {
                if (c11 == 0) {
                    l(b(2, i10, i13, (Object) null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    w(b(2, i10, i13, (Object) null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f3356d) {
            a(bVar);
            bVar = b(2, i10, i13, (Object) null);
        }
        if (c11 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    public final void h(b bVar) {
        int i10 = bVar.f3354b;
        int i11 = bVar.f3356d + i10;
        int i12 = 0;
        boolean z10 = true;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f3343d.e(i10) != null || i(i10)) {
                if (!z10) {
                    l(b(4, i13, i12, bVar.f3355c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    w(b(4, i13, i12, bVar.f3355c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f3356d) {
            Object obj = bVar.f3355c;
            a(bVar);
            bVar = b(4, i13, i12, obj);
        }
        if (!z10) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    public final boolean i(int i10) {
        int size = this.f3342c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f3342c.get(i11);
            int i12 = bVar.f3353a;
            if (i12 == 8) {
                if (o(bVar.f3356d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f3354b;
                int i14 = bVar.f3356d + i13;
                while (i13 < i14) {
                    if (o(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void j() {
        int size = this.f3342c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3343d.d(this.f3342c.get(i10));
        }
        y(this.f3342c);
        this.f3347h = 0;
    }

    public void k() {
        j();
        int size = this.f3341b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f3341b.get(i10);
            int i11 = bVar.f3353a;
            if (i11 == 1) {
                this.f3343d.d(bVar);
                this.f3343d.g(bVar.f3354b, bVar.f3356d);
            } else if (i11 == 2) {
                this.f3343d.d(bVar);
                this.f3343d.h(bVar.f3354b, bVar.f3356d);
            } else if (i11 == 4) {
                this.f3343d.d(bVar);
                this.f3343d.c(bVar.f3354b, bVar.f3356d, bVar.f3355c);
            } else if (i11 == 8) {
                this.f3343d.d(bVar);
                this.f3343d.a(bVar.f3354b, bVar.f3356d);
            }
            Runnable runnable = this.f3344e;
            if (runnable != null) {
                runnable.run();
            }
        }
        y(this.f3341b);
        this.f3347h = 0;
    }

    public final void l(b bVar) {
        int i10;
        int i11 = bVar.f3353a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int A = A(bVar.f3354b, i11);
        int i12 = bVar.f3354b;
        int i13 = bVar.f3353a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 == 4) {
            i10 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f3356d; i15++) {
            int A2 = A(bVar.f3354b + (i10 * i15), bVar.f3353a);
            int i16 = bVar.f3353a;
            if (i16 == 2 ? A2 == A : i16 == 4 && A2 == A + 1) {
                i14++;
            } else {
                b b10 = b(i16, A, i14, bVar.f3355c);
                m(b10, i12);
                a(b10);
                if (bVar.f3353a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                A = A2;
            }
        }
        Object obj = bVar.f3355c;
        a(bVar);
        if (i14 > 0) {
            b b11 = b(bVar.f3353a, A, i14, obj);
            m(b11, i12);
            a(b11);
        }
    }

    public void m(b bVar, int i10) {
        this.f3343d.b(bVar);
        int i11 = bVar.f3353a;
        if (i11 == 2) {
            this.f3343d.h(i10, bVar.f3356d);
        } else if (i11 == 4) {
            this.f3343d.c(i10, bVar.f3356d, bVar.f3355c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public int n(int i10) {
        return o(i10, 0);
    }

    public int o(int i10, int i11) {
        int size = this.f3342c.size();
        while (i11 < size) {
            b bVar = this.f3342c.get(i11);
            int i12 = bVar.f3353a;
            if (i12 == 8) {
                int i13 = bVar.f3354b;
                if (i13 == i10) {
                    i10 = bVar.f3356d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f3356d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f3354b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f3356d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f3356d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean p(int i10) {
        return (i10 & this.f3347h) != 0;
    }

    public boolean q() {
        return this.f3341b.size() > 0;
    }

    public boolean r() {
        return !this.f3342c.isEmpty() && !this.f3341b.isEmpty();
    }

    public boolean s(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f3341b.add(b(4, i10, i11, obj));
        this.f3347h |= 4;
        return this.f3341b.size() == 1;
    }

    public boolean t(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3341b.add(b(1, i10, i11, (Object) null));
        this.f3347h |= 1;
        return this.f3341b.size() == 1;
    }

    public boolean u(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 == 1) {
            this.f3341b.add(b(8, i10, i11, (Object) null));
            this.f3347h |= 8;
            return this.f3341b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    public boolean v(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3341b.add(b(2, i10, i11, (Object) null));
        this.f3347h |= 2;
        return this.f3341b.size() == 1;
    }

    public final void w(b bVar) {
        this.f3342c.add(bVar);
        int i10 = bVar.f3353a;
        if (i10 == 1) {
            this.f3343d.g(bVar.f3354b, bVar.f3356d);
        } else if (i10 == 2) {
            this.f3343d.f(bVar.f3354b, bVar.f3356d);
        } else if (i10 == 4) {
            this.f3343d.c(bVar.f3354b, bVar.f3356d, bVar.f3355c);
        } else if (i10 == 8) {
            this.f3343d.a(bVar.f3354b, bVar.f3356d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void x() {
        this.f3346g.b(this.f3341b);
        int size = this.f3341b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f3341b.get(i10);
            int i11 = bVar.f3353a;
            if (i11 == 1) {
                d(bVar);
            } else if (i11 == 2) {
                g(bVar);
            } else if (i11 == 4) {
                h(bVar);
            } else if (i11 == 8) {
                e(bVar);
            }
            Runnable runnable = this.f3344e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3341b.clear();
    }

    public void y(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(list.get(i10));
        }
        list.clear();
    }

    public void z() {
        y(this.f3341b);
        y(this.f3342c);
        this.f3347h = 0;
    }
}
