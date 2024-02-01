package t2;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;
import e1.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import t2.c;
import t2.e0;

public final class m<K> {

    /* renamed from: p  reason: collision with root package name */
    public static final int f12861p = -1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f12862q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f12863r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f12864s = 0;

    /* renamed from: t  reason: collision with root package name */
    public static final int f12865t = 2;

    /* renamed from: u  reason: collision with root package name */
    public static final int f12866u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f12867v = 2;

    /* renamed from: w  reason: collision with root package name */
    public static final int f12868w = 1;

    /* renamed from: x  reason: collision with root package name */
    public static final int f12869x = 3;

    /* renamed from: a  reason: collision with root package name */
    public final b<K> f12870a;

    /* renamed from: b  reason: collision with root package name */
    public final o<K> f12871b;

    /* renamed from: c  reason: collision with root package name */
    public final e0.c<K> f12872c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f<K>> f12873d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<SparseIntArray> f12874e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public final List<c> f12875f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final List<c> f12876g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final SparseBooleanArray f12877h = new SparseBooleanArray();

    /* renamed from: i  reason: collision with root package name */
    public final Set<K> f12878i = new LinkedHashSet();

    /* renamed from: j  reason: collision with root package name */
    public Point f12879j;

    /* renamed from: k  reason: collision with root package name */
    public e f12880k;

    /* renamed from: l  reason: collision with root package name */
    public e f12881l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12882m;

    /* renamed from: n  reason: collision with root package name */
    public int f12883n = -1;

    /* renamed from: o  reason: collision with root package name */
    public final RecyclerView.t f12884o;

    public class a extends RecyclerView.t {
        public a() {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            m.this.q(recyclerView, i10, i11);
        }
    }

    public static abstract class b<K> extends c.C0215c<K> {
        public abstract Point e(@m0 Point point);

        public abstract Rect f(int i10);

        public abstract int g(int i10);

        public abstract int h();

        public abstract int i();

        public abstract boolean j(int i10);

        public abstract void k(@m0 RecyclerView.t tVar);
    }

    public static class c implements Comparable<c> {
        public int O;
        public int P;

        public c(int i10, int i11) {
            this.O = i10;
            this.P = i11;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            return this.O - cVar.O;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.O == this.O && cVar.P == this.P;
        }

        public int hashCode() {
            return this.O ^ this.P;
        }

        public String toString() {
            return "(" + this.O + ", " + this.P + ")";
        }
    }

    public static class d implements Comparable<d> {
        public static final int T = 0;
        public static final int U = 1;
        public static final int V = 2;
        public static final int W = 3;
        public final int O;
        public c P;
        public c Q;
        public c R;
        public c S;

        /* JADX WARNING: type inference failed for: r6v0, types: [java.util.List, java.util.List<t2.m$c>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(java.util.List<t2.m.c> r6, int r7) {
            /*
                r5 = this;
                r5.<init>()
                t2.m$c r0 = new t2.m$c
                r0.<init>(r7, r7)
                int r0 = java.util.Collections.binarySearch(r6, r0)
                r1 = 3
                if (r0 < 0) goto L_0x001a
                r5.O = r1
                java.lang.Object r6 = r6.get(r0)
            L_0x0015:
                t2.m$c r6 = (t2.m.c) r6
            L_0x0017:
                r5.P = r6
                goto L_0x0075
            L_0x001a:
                int r0 = ~r0
                r2 = 0
                r3 = 1
                if (r0 != 0) goto L_0x002a
                r5.O = r3
                java.lang.Object r6 = r6.get(r2)
                t2.m$c r6 = (t2.m.c) r6
                r5.R = r6
                goto L_0x0075
            L_0x002a:
                int r4 = r6.size()
                if (r0 != r4) goto L_0x004b
                int r0 = r6.size()
                int r0 = r0 - r3
                java.lang.Object r6 = r6.get(r0)
                t2.m$c r6 = (t2.m.c) r6
                int r0 = r6.O
                if (r0 > r7) goto L_0x0046
                int r0 = r6.P
                if (r7 > r0) goto L_0x0046
                r5.O = r1
                goto L_0x0017
            L_0x0046:
                r5.O = r2
                r5.S = r6
                goto L_0x0075
            L_0x004b:
                int r2 = r0 + -1
                java.lang.Object r3 = r6.get(r2)
                t2.m$c r3 = (t2.m.c) r3
                int r4 = r3.O
                if (r4 > r7) goto L_0x0062
                int r3 = r3.P
                if (r7 > r3) goto L_0x0062
                r5.O = r1
                java.lang.Object r6 = r6.get(r2)
                goto L_0x0015
            L_0x0062:
                r7 = 2
                r5.O = r7
                java.lang.Object r7 = r6.get(r2)
                t2.m$c r7 = (t2.m.c) r7
                r5.P = r7
                java.lang.Object r6 = r6.get(r0)
                t2.m$c r6 = (t2.m.c) r6
                r5.Q = r6
            L_0x0075:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t2.m.d.<init>(java.util.List, int):void");
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            return b() - dVar.b();
        }

        public int b() {
            int i10 = this.O;
            return i10 == 1 ? this.R.O - 1 : i10 == 0 ? this.S.P + 1 : i10 == 2 ? this.P.P + 1 : this.P.O;
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && b() == ((d) obj).b();
        }

        public int hashCode() {
            int i10 = this.R.O ^ this.S.P;
            c cVar = this.P;
            return (i10 ^ cVar.P) ^ cVar.O;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final d f12886a;

        /* renamed from: b  reason: collision with root package name */
        public final d f12887b;

        public e(@m0 List<c> list, @m0 List<c> list2, Point point) {
            this.f12886a = new d(list, point.x);
            this.f12887b = new d(list2, point.y);
        }

        public e(@m0 d dVar, @m0 d dVar2) {
            this.f12886a = dVar;
            this.f12887b = dVar2;
        }

        public boolean equals(@o0 Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f12886a.equals(eVar.f12886a) && this.f12887b.equals(eVar.f12887b);
        }

        public int hashCode() {
            return this.f12886a.b() ^ this.f12887b.b();
        }
    }

    public static abstract class f<K> {
        public abstract void a(Set<K> set);
    }

    public m(b<K> bVar, o<K> oVar, e0.c<K> cVar) {
        boolean z10 = true;
        n.a(bVar != null);
        n.a(oVar != null);
        n.a(cVar == null ? false : z10);
        this.f12870a = bVar;
        this.f12871b = oVar;
        this.f12872c = cVar;
        a aVar = new a();
        this.f12884o = aVar;
        bVar.a(aVar);
    }

    public void a(f<K> fVar) {
        this.f12873d.add(fVar);
    }

    public final boolean b(@m0 e eVar, @m0 e eVar2) {
        return h(eVar.f12886a, eVar2.f12886a) && h(eVar.f12887b, eVar2.f12887b);
    }

    public final boolean c(K k10) {
        return this.f12872c.c(k10, true);
    }

    public final Rect d() {
        Rect rect = new Rect();
        rect.left = i(n(this.f12880k.f12886a, this.f12881l.f12886a), this.f12875f, true);
        rect.right = i(m(this.f12880k.f12886a, this.f12881l.f12886a), this.f12875f, false);
        rect.top = i(n(this.f12880k.f12887b, this.f12881l.f12887b), this.f12876g, true);
        rect.bottom = i(m(this.f12880k.f12887b, this.f12881l.f12887b), this.f12876g, false);
        return rect;
    }

    public final int e() {
        d dVar = this.f12880k.f12887b;
        boolean z10 = !dVar.equals(n(dVar, this.f12881l.f12887b));
        d dVar2 = this.f12880k.f12886a;
        return dVar2.equals(n(dVar2, this.f12881l.f12886a)) ? z10 | false ? 1 : 0 : z10 | true ? 1 : 0;
    }

    public final void f() {
        if (b(this.f12881l, this.f12880k)) {
            z(d());
            return;
        }
        this.f12878i.clear();
        this.f12883n = -1;
    }

    public e g(Point point) {
        return new e(new d(this.f12875f, point.x), new d(this.f12876g, point.y));
    }

    public final boolean h(@m0 d dVar, @m0 d dVar2) {
        int i10 = dVar.O;
        if (i10 == 1 && dVar2.O == 1) {
            return false;
        }
        if (i10 == 0 && dVar2.O == 0) {
            return false;
        }
        return i10 != 2 || dVar2.O != 2 || !dVar.P.equals(dVar2.P) || !dVar.Q.equals(dVar2.Q);
    }

    public final int i(@m0 d dVar, @m0 List<c> list, boolean z10) {
        int i10 = dVar.O;
        if (i10 == 0) {
            return list.get(list.size() - 1).P;
        }
        if (i10 == 1) {
            return list.get(0).O;
        }
        if (i10 == 2) {
            return z10 ? dVar.Q.O : dVar.P.P;
        }
        if (i10 == 3) {
            return dVar.P.O;
        }
        throw new RuntimeException("Invalid coordinate value.");
    }

    public int j() {
        return this.f12883n;
    }

    public final boolean k() {
        return this.f12875f.size() == 0 || this.f12876g.size() == 0;
    }

    public final boolean l(int i10, int i11, int i12, int i13, int i14, int i15) {
        int e10 = e();
        if (e10 == 0) {
            return i10 == i11 && i13 == i14;
        }
        if (e10 == 1) {
            return i10 == i11 && i13 == i15;
        }
        if (e10 == 2) {
            return i10 == i12 && i13 == i14;
        }
        if (e10 == 3) {
            return i13 == i15;
        }
        throw new RuntimeException("Invalid corner type.");
    }

    public final d m(@m0 d dVar, @m0 d dVar2) {
        return dVar.compareTo(dVar2) > 0 ? dVar : dVar2;
    }

    public final d n(@m0 d dVar, @m0 d dVar2) {
        return dVar.compareTo(dVar2) < 0 ? dVar : dVar2;
    }

    public final void o() {
        for (f<K> a10 : this.f12873d) {
            a10.a(this.f12878i);
        }
    }

    public void p() {
        this.f12873d.clear();
        this.f12870a.k(this.f12884o);
    }

    public void q(RecyclerView recyclerView, int i10, int i11) {
        if (this.f12882m) {
            Point point = this.f12879j;
            point.x += i10;
            point.y += i11;
            t();
            x();
        }
    }

    public final void r(Rect rect, int i10) {
        if (this.f12875f.size() != this.f12870a.h()) {
            s(this.f12875f, new c(rect.left, rect.right));
        }
        s(this.f12876g, new c(rect.top, rect.bottom));
        SparseIntArray sparseIntArray = this.f12874e.get(rect.left);
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray();
            this.f12874e.put(rect.left, sparseIntArray);
        }
        sparseIntArray.put(rect.top, i10);
    }

    public final void s(List<c> list, c cVar) {
        int binarySearch = Collections.binarySearch(list, cVar);
        if (binarySearch < 0) {
            list.add(~binarySearch, cVar);
        }
    }

    public final void t() {
        for (int i10 = 0; i10 < this.f12870a.i(); i10++) {
            int g10 = this.f12870a.g(i10);
            if (this.f12870a.j(g10) && this.f12872c.b(g10, true) && !this.f12877h.get(g10)) {
                this.f12877h.put(g10, true);
                r(this.f12870a.f(i10), g10);
            }
        }
    }

    public void u(Point point) {
        this.f12879j = this.f12870a.e(point);
        x();
    }

    public void v(Point point) {
        t();
        if (!k()) {
            this.f12882m = true;
            Point e10 = this.f12870a.e(point);
            this.f12879j = e10;
            this.f12880k = g(e10);
            this.f12881l = g(this.f12879j);
            f();
            o();
        }
    }

    public void w() {
        this.f12882m = false;
    }

    public final void x() {
        e eVar = this.f12881l;
        e g10 = g(this.f12879j);
        this.f12881l = g10;
        if (!g10.equals(eVar)) {
            f();
            o();
        }
    }

    public final void y(int i10, int i11, int i12, int i13) {
        this.f12878i.clear();
        for (int i14 = i10; i14 <= i11; i14++) {
            SparseIntArray sparseIntArray = this.f12874e.get(this.f12875f.get(i14).O);
            for (int i15 = i12; i15 <= i13; i15++) {
                int i16 = sparseIntArray.get(this.f12876g.get(i15).O, -1);
                if (i16 != -1) {
                    K a10 = this.f12871b.a(i16);
                    if (a10 != null && c(a10)) {
                        this.f12878i.add(a10);
                    }
                    if (l(i14, i10, i11, i15, i12, i13)) {
                        this.f12883n = i16;
                    }
                }
            }
        }
    }

    public final void z(Rect rect) {
        List<c> list = this.f12875f;
        int i10 = rect.left;
        int binarySearch = Collections.binarySearch(list, new c(i10, i10));
        n.b(binarySearch >= 0, "Rect doesn't intesect any known column.");
        int i11 = binarySearch;
        int i12 = i11;
        while (i11 < this.f12875f.size() && this.f12875f.get(i11).O <= rect.right) {
            i12 = i11;
            i11++;
        }
        List<c> list2 = this.f12876g;
        int i13 = rect.top;
        int binarySearch2 = Collections.binarySearch(list2, new c(i13, i13));
        if (binarySearch2 < 0) {
            this.f12883n = -1;
            return;
        }
        int i14 = binarySearch2;
        int i15 = i14;
        while (i14 < this.f12876g.size() && this.f12876g.get(i14).O <= rect.bottom) {
            i15 = i14;
            i14++;
        }
        y(binarySearch, i12, binarySearch2, i15);
    }
}
