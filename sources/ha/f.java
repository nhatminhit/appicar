package ha;

import ja.a;
import ja.d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ka.l;
import ka.n;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public d f19494a;

    /* renamed from: b  reason: collision with root package name */
    public v f19495b;

    /* renamed from: c  reason: collision with root package name */
    public d f19496c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Type, g<?>> f19497d;

    /* renamed from: e  reason: collision with root package name */
    public final List<z> f19498e;

    /* renamed from: f  reason: collision with root package name */
    public final List<z> f19499f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f19500g;

    /* renamed from: h  reason: collision with root package name */
    public String f19501h;

    /* renamed from: i  reason: collision with root package name */
    public int f19502i;

    /* renamed from: j  reason: collision with root package name */
    public int f19503j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f19504k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f19505l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f19506m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f19507n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f19508o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f19509p;

    /* renamed from: q  reason: collision with root package name */
    public x f19510q;

    /* renamed from: r  reason: collision with root package name */
    public x f19511r;

    public f() {
        this.f19494a = d.V;
        this.f19495b = v.DEFAULT;
        this.f19496c = c.IDENTITY;
        this.f19497d = new HashMap();
        this.f19498e = new ArrayList();
        this.f19499f = new ArrayList();
        this.f19500g = false;
        this.f19502i = 2;
        this.f19503j = 2;
        this.f19504k = false;
        this.f19505l = false;
        this.f19506m = true;
        this.f19507n = false;
        this.f19508o = false;
        this.f19509p = false;
        this.f19510q = w.DOUBLE;
        this.f19511r = w.LAZILY_PARSED_NUMBER;
    }

    public f(e eVar) {
        this.f19494a = d.V;
        this.f19495b = v.DEFAULT;
        this.f19496c = c.IDENTITY;
        HashMap hashMap = new HashMap();
        this.f19497d = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f19498e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f19499f = arrayList2;
        this.f19500g = false;
        this.f19502i = 2;
        this.f19503j = 2;
        this.f19504k = false;
        this.f19505l = false;
        this.f19506m = true;
        this.f19507n = false;
        this.f19508o = false;
        this.f19509p = false;
        this.f19510q = w.DOUBLE;
        this.f19511r = w.LAZILY_PARSED_NUMBER;
        this.f19494a = eVar.f19471f;
        this.f19496c = eVar.f19472g;
        hashMap.putAll(eVar.f19473h);
        this.f19500g = eVar.f19474i;
        this.f19504k = eVar.f19475j;
        this.f19508o = eVar.f19476k;
        this.f19506m = eVar.f19477l;
        this.f19507n = eVar.f19478m;
        this.f19509p = eVar.f19479n;
        this.f19505l = eVar.f19480o;
        this.f19495b = eVar.f19484s;
        this.f19501h = eVar.f19481p;
        this.f19502i = eVar.f19482q;
        this.f19503j = eVar.f19483r;
        arrayList.addAll(eVar.f19485t);
        arrayList2.addAll(eVar.f19486u);
        this.f19510q = eVar.f19487v;
        this.f19511r = eVar.f19488w;
    }

    public f A(double d10) {
        this.f19494a = this.f19494a.x(d10);
        return this;
    }

    public f a(a aVar) {
        this.f19494a = this.f19494a.v(aVar, false, true);
        return this;
    }

    public f b(a aVar) {
        this.f19494a = this.f19494a.v(aVar, true, false);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.String r5, int r6, int r7, java.util.List<ha.z> r8) {
        /*
            r4 = this;
            boolean r0 = na.d.f21182a
            r1 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.String r2 = r5.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0026
            ka.d$b<java.util.Date> r6 = ka.d.b.f20013b
            ha.z r6 = r6.c(r5)
            if (r0 == 0) goto L_0x0024
            ka.d$b<? extends java.util.Date> r7 = na.d.f21184c
            ha.z r1 = r7.c(r5)
            ka.d$b<? extends java.util.Date> r7 = na.d.f21183b
            ha.z r5 = r7.c(r5)
            goto L_0x0045
        L_0x0024:
            r5 = r1
            goto L_0x0045
        L_0x0026:
            r5 = 2
            if (r6 == r5) goto L_0x0050
            if (r7 == r5) goto L_0x0050
            ka.d$b<java.util.Date> r5 = ka.d.b.f20013b
            ha.z r5 = r5.b(r6, r7)
            if (r0 == 0) goto L_0x0043
            ka.d$b<? extends java.util.Date> r1 = na.d.f21184c
            ha.z r1 = r1.b(r6, r7)
            ka.d$b<? extends java.util.Date> r2 = na.d.f21183b
            ha.z r6 = r2.b(r6, r7)
            r3 = r6
            r6 = r5
            r5 = r3
            goto L_0x0045
        L_0x0043:
            r6 = r5
            goto L_0x0024
        L_0x0045:
            r8.add(r6)
            if (r0 == 0) goto L_0x0050
            r8.add(r1)
            r8.add(r5)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.f.c(java.lang.String, int, int, java.util.List):void");
    }

    public e d() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f19498e.size() + this.f19499f.size() + 3);
        arrayList2.addAll(this.f19498e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f19499f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        c(this.f19501h, this.f19502i, this.f19503j, arrayList2);
        return new e(this.f19494a, this.f19496c, this.f19497d, this.f19500g, this.f19504k, this.f19508o, this.f19506m, this.f19507n, this.f19509p, this.f19505l, this.f19495b, this.f19501h, this.f19502i, this.f19503j, this.f19498e, this.f19499f, arrayList, this.f19510q, this.f19511r);
    }

    public f e() {
        this.f19506m = false;
        return this;
    }

    public f f() {
        this.f19494a = this.f19494a.g();
        return this;
    }

    public f g() {
        this.f19504k = true;
        return this;
    }

    public f h(int... iArr) {
        this.f19494a = this.f19494a.w(iArr);
        return this;
    }

    public f i() {
        this.f19494a = this.f19494a.n();
        return this;
    }

    public f j() {
        this.f19508o = true;
        return this;
    }

    public f k(Type type, Object obj) {
        boolean z10 = obj instanceof s;
        a.a(z10 || (obj instanceof j) || (obj instanceof g) || (obj instanceof y));
        if (obj instanceof g) {
            this.f19497d.put(type, (g) obj);
        }
        if (z10 || (obj instanceof j)) {
            this.f19498e.add(l.l(oa.a.c(type), obj));
        }
        if (obj instanceof y) {
            this.f19498e.add(n.c(oa.a.c(type), (y) obj));
        }
        return this;
    }

    public f l(z zVar) {
        this.f19498e.add(zVar);
        return this;
    }

    public f m(Class<?> cls, Object obj) {
        boolean z10 = obj instanceof s;
        a.a(z10 || (obj instanceof j) || (obj instanceof y));
        if ((obj instanceof j) || z10) {
            this.f19499f.add(l.m(cls, obj));
        }
        if (obj instanceof y) {
            this.f19498e.add(n.e(cls, (y) obj));
        }
        return this;
    }

    public f n() {
        this.f19500g = true;
        return this;
    }

    public f o() {
        this.f19505l = true;
        return this;
    }

    public f p(int i10) {
        this.f19502i = i10;
        this.f19501h = null;
        return this;
    }

    public f q(int i10, int i11) {
        this.f19502i = i10;
        this.f19503j = i11;
        this.f19501h = null;
        return this;
    }

    public f r(String str) {
        this.f19501h = str;
        return this;
    }

    public f s(a... aVarArr) {
        for (a v10 : aVarArr) {
            this.f19494a = this.f19494a.v(v10, true, true);
        }
        return this;
    }

    public f t(c cVar) {
        this.f19496c = cVar;
        return this;
    }

    public f u(d dVar) {
        this.f19496c = dVar;
        return this;
    }

    public f v() {
        this.f19509p = true;
        return this;
    }

    public f w(v vVar) {
        this.f19495b = vVar;
        return this;
    }

    public f x(x xVar) {
        this.f19511r = xVar;
        return this;
    }

    public f y(x xVar) {
        this.f19510q = xVar;
        return this;
    }

    public f z() {
        this.f19507n = true;
        return this;
    }
}
