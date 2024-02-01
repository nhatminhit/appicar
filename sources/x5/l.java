package x5;

import a6.d0;
import i5.j;
import i5.o;
import java.util.HashMap;
import java.util.Map;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final a[] f15110a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15111b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15112c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final o<Object> f15113a;

        /* renamed from: b  reason: collision with root package name */
        public final a f15114b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<?> f15115c;

        /* renamed from: d  reason: collision with root package name */
        public final j f15116d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f15117e;

        public a(a aVar, d0 d0Var, o<Object> oVar) {
            this.f15114b = aVar;
            this.f15113a = oVar;
            this.f15117e = d0Var.c();
            this.f15115c = d0Var.a();
            this.f15116d = d0Var.b();
        }

        public boolean a(j jVar) {
            return this.f15117e && jVar.equals(this.f15116d);
        }

        public boolean b(Class<?> cls) {
            return this.f15115c == cls && this.f15117e;
        }

        public boolean c(j jVar) {
            return !this.f15117e && jVar.equals(this.f15116d);
        }

        public boolean d(Class<?> cls) {
            return this.f15115c == cls && !this.f15117e;
        }
    }

    public l(Map<d0, o<Object>> map) {
        int a10 = a(map.size());
        this.f15111b = a10;
        this.f15112c = a10 - 1;
        a[] aVarArr = new a[a10];
        for (Map.Entry next : map.entrySet()) {
            d0 d0Var = (d0) next.getKey();
            int hashCode = d0Var.hashCode() & this.f15112c;
            aVarArr[hashCode] = new a(aVarArr[hashCode], d0Var, (o) next.getValue());
        }
        this.f15110a = aVarArr;
    }

    public static final int a(int i10) {
        int i11 = 8;
        while (i11 < (i10 <= 64 ? i10 + i10 : i10 + (i10 >> 2))) {
            i11 += i11;
        }
        return i11;
    }

    public static l b(HashMap<d0, o<Object>> hashMap) {
        return new l(hashMap);
    }

    public int c() {
        return this.f15111b;
    }

    public o<Object> d(j jVar) {
        a aVar = this.f15110a[d0.h(jVar) & this.f15112c];
        if (aVar == null) {
            return null;
        }
        if (aVar.a(jVar)) {
            return aVar.f15113a;
        }
        do {
            aVar = aVar.f15114b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.a(jVar));
        return aVar.f15113a;
    }

    public o<Object> e(Class<?> cls) {
        a aVar = this.f15110a[d0.i(cls) & this.f15112c];
        if (aVar == null) {
            return null;
        }
        if (aVar.b(cls)) {
            return aVar.f15113a;
        }
        do {
            aVar = aVar.f15114b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.b(cls));
        return aVar.f15113a;
    }

    public o<Object> f(j jVar) {
        a aVar = this.f15110a[d0.j(jVar) & this.f15112c];
        if (aVar == null) {
            return null;
        }
        if (aVar.c(jVar)) {
            return aVar.f15113a;
        }
        do {
            aVar = aVar.f15114b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.c(jVar));
        return aVar.f15113a;
    }

    public o<Object> g(Class<?> cls) {
        a aVar = this.f15110a[d0.k(cls) & this.f15112c];
        if (aVar == null) {
            return null;
        }
        if (aVar.d(cls)) {
            return aVar.f15113a;
        }
        do {
            aVar = aVar.f15114b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.d(cls));
        return aVar.f15113a;
    }
}
