package ee;

import be.b0;
import be.d0;
import be.e0;
import be.o;
import be.p0;
import be.q0;
import be.r1;
import be.s0;
import be.w;
import be.x;
import be.z0;
import fh.g;
import fh.h;
import gf.m;
import gf.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import oe.f;
import we.l;
import we.p;
import we.q;
import xe.l0;
import xe.n0;
import zd.a2;
import zd.b1;
import zd.b2;
import zd.e2;
import zd.f2;
import zd.h1;
import zd.j2;
import zd.k;
import zd.k2;
import zd.p2;
import zd.q2;
import zd.r;
import zd.t;
import zd.t0;
import zd.u0;
import zd.u2;
import zd.y2;

public class c extends b {

    public static final class a extends n0 implements we.a<Iterator<? extends e2>> {
        public final /* synthetic */ int[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int[] iArr) {
            super(0);
            this.P = iArr;
        }

        @g
        /* renamed from: c */
        public final Iterator<e2> n() {
            return f2.v(this.P);
        }
    }

    public static final class b extends n0 implements we.a<Iterator<? extends j2>> {
        public final /* synthetic */ long[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(long[] jArr) {
            super(0);
            this.P = jArr;
        }

        @g
        /* renamed from: c */
        public final Iterator<j2> n() {
            return k2.v(this.P);
        }
    }

    /* renamed from: ee.c$c  reason: collision with other inner class name */
    public static final class C0299c extends n0 implements we.a<Iterator<? extends a2>> {
        public final /* synthetic */ byte[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0299c(byte[] bArr) {
            super(0);
            this.P = bArr;
        }

        @g
        /* renamed from: c */
        public final Iterator<a2> n() {
            return b2.v(this.P);
        }
    }

    public static final class d extends n0 implements we.a<Iterator<? extends p2>> {
        public final /* synthetic */ short[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(short[] sArr) {
            super(0);
            this.P = sArr;
        }

        @g
        /* renamed from: c */
        public final Iterator<p2> n() {
            return q2.v(this.P);
        }
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long A0(long[] jArr) {
        l0.p(jArr, "$this$component1");
        return k2.p(jArr, 0);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte[] A1(byte[] bArr, int i10) {
        l0.p(bArr, "$this$copyOf");
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return b2.f(copyOf);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<j2> A2(long[] jArr, p<? super Integer, ? super j2, Boolean> pVar) {
        l0.p(jArr, "$this$filterIndexed");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = k2.r(jArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            long p10 = k2.p(jArr, i10);
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), j2.b(p10)).booleanValue()) {
                arrayList.add(j2.b(p10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R, C extends Collection<? super R>> C A3(byte[] bArr, C c10, p<? super Integer, ? super a2, ? extends Iterable<? extends R>> pVar) {
        l0.p(bArr, "$this$flatMapIndexedTo");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int r10 = b2.r(bArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), a2.b(b2.p(bArr, i10))));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.3")
    @t
    @h
    public static final e2 A4(@g int[] iArr, int i10) {
        l0.p(iArr, "$this$getOrNull");
        if (i10 < 0 || i10 > be.p.Ve(iArr)) {
            return null;
        }
        return e2.b(f2.p(iArr, i10));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R> List<R> A5(int[] iArr, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$map");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(f2.r(iArr));
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            arrayList.add(lVar.A(e2.b(f2.p(iArr, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R A6(short[] sArr, Comparator<? super R> comparator, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (q2.u(sArr)) {
            return null;
        }
        R A = lVar.A(p2.b(q2.p(sArr, 0)));
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(p2.b(q2.p(sArr, o10.nextInt())));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R A7(short[] sArr, Comparator<? super R> comparator, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$minOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!q2.u(sArr)) {
            R A = lVar.A(p2.b(q2.p(sArr, 0)));
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(p2.b(q2.p(sArr, o10.nextInt())));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte A8(byte[] bArr) {
        l0.p(bArr, "$this$random");
        return D8(bArr, ef.f.O);
    }

    @h1(version = "1.4")
    @t
    @f
    public static final void A9(int[] iArr, int i10, int i11) {
        l0.p(iArr, "$this$reverse");
        be.p.zr(iArr, i10, i11);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final a2 Aa(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$singleOrNull");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr);
        boolean z10 = false;
        a2 a2Var = null;
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            if (lVar.A(a2.b(p10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                a2Var = a2.b(p10);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return a2Var;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final long[] Ab(@g long[] jArr) {
        l0.p(jArr, "$this$sortedArrayDescending");
        if (k2.u(jArr)) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        long[] f10 = k2.f(copyOf);
        nb(f10);
        return f10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<e2> Ac(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$takeLastWhile");
        l0.p(lVar, "predicate");
        for (int Ve = be.p.Ve(iArr); -1 < Ve; Ve--) {
            if (!lVar.A(e2.b(f2.p(iArr, Ve))).booleanValue()) {
                return Q1(iArr, Ve + 1);
            }
        }
        return e0.Q5(f2.c(iArr));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short B0(short[] sArr) {
        l0.p(sArr, "$this$component1");
        return q2.p(sArr, 0);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long[] B1(long[] jArr) {
        l0.p(jArr, "$this$copyOf");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return k2.f(copyOf);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<p2> B2(short[] sArr, p<? super Integer, ? super p2, Boolean> pVar) {
        l0.p(sArr, "$this$filterIndexed");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = q2.r(sArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            short p10 = q2.p(sArr, i10);
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), p2.b(p10)).booleanValue()) {
                arrayList.add(p2.b(p10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R, C extends Collection<? super R>> C B3(long[] jArr, C c10, p<? super Integer, ? super j2, ? extends Iterable<? extends R>> pVar) {
        l0.p(jArr, "$this$flatMapIndexedTo");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int r10 = k2.r(jArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), j2.b(k2.p(jArr, i10))));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.3")
    @t
    @h
    public static final j2 B4(@g long[] jArr, int i10) {
        l0.p(jArr, "$this$getOrNull");
        if (i10 < 0 || i10 > be.p.We(jArr)) {
            return null;
        }
        return j2.b(k2.p(jArr, i10));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R> List<R> B5(short[] sArr, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$map");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(q2.r(sArr));
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            arrayList.add(lVar.A(p2.b(q2.p(sArr, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R B6(int[] iArr, Comparator<? super R> comparator, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$maxOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (f2.u(iArr)) {
            return null;
        }
        R A = lVar.A(e2.b(f2.p(iArr, 0)));
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(e2.b(f2.p(iArr, o10.nextInt())));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R B7(int[] iArr, Comparator<? super R> comparator, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$minOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!f2.u(iArr)) {
            R A = lVar.A(e2.b(f2.p(iArr, 0)));
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(e2.b(f2.p(iArr, o10.nextInt())));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    public static final long B8(@g long[] jArr, @g ef.f fVar) {
        l0.p(jArr, "$this$random");
        l0.p(fVar, "random");
        if (!k2.u(jArr)) {
            return k2.p(jArr, fVar.m(k2.r(jArr)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final void B9(short[] sArr) {
        l0.p(sArr, "$this$reverse");
        be.p.Er(sArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final j2 Ba(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$singleOrNull");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr);
        boolean z10 = false;
        j2 j2Var = null;
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            if (lVar.A(j2.b(p10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                j2Var = j2.b(p10);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return j2Var;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final short[] Bb(@g short[] sArr) {
        l0.p(sArr, "$this$sortedArrayDescending");
        if (q2.u(sArr)) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        short[] f10 = q2.f(copyOf);
        pb(f10);
        return f10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<p2> Bc(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$takeLastWhile");
        l0.p(lVar, "predicate");
        for (int Ye = be.p.Ye(sArr); -1 < Ye; Ye--) {
            if (!lVar.A(p2.b(q2.p(sArr, Ye))).booleanValue()) {
                return P1(sArr, Ye + 1);
            }
        }
        return e0.Q5(q2.c(sArr));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int C0(int[] iArr) {
        l0.p(iArr, "$this$component2");
        return f2.p(iArr, 1);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short[] C1(short[] sArr, int i10) {
        l0.p(sArr, "$this$copyOf");
        short[] copyOf = Arrays.copyOf(sArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return q2.f(copyOf);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super e2>> C C2(int[] iArr, C c10, p<? super Integer, ? super e2, Boolean> pVar) {
        l0.p(iArr, "$this$filterIndexedTo");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int r10 = f2.r(iArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            int p10 = f2.p(iArr, i10);
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), e2.b(p10)).booleanValue()) {
                c10.add(e2.b(p10));
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C C3(long[] jArr, C c10, l<? super j2, ? extends Iterable<? extends R>> lVar) {
        l0.p(jArr, "$this$flatMapTo");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            b0.o0(c10, (Iterable) lVar.A(j2.b(k2.p(jArr, i10))));
        }
        return c10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K, V> Map<K, List<V>> C4(long[] jArr, l<? super j2, ? extends K> lVar, l<? super j2, ? extends V> lVar2) {
        l0.p(jArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            Object A = lVar.A(j2.b(p10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(j2.b(p10)));
        }
        return linkedHashMap;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R> List<R> C5(byte[] bArr, p<? super Integer, ? super a2, ? extends R> pVar) {
        l0.p(bArr, "$this$mapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(b2.r(bArr));
        int r10 = b2.r(bArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), a2.b(b2.p(bArr, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @h
    public static final e2 C6(@g int[] iArr) {
        l0.p(iArr, "$this$maxOrNull");
        if (f2.u(iArr)) {
            return null;
        }
        int p10 = f2.p(iArr, 0);
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            int p11 = f2.p(iArr, o10.nextInt());
            if (Integer.compare(p10 ^ Integer.MIN_VALUE, p11 ^ Integer.MIN_VALUE) < 0) {
                p10 = p11;
            }
        }
        return e2.b(p10);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R C7(long[] jArr, Comparator<? super R> comparator, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$minOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (k2.u(jArr)) {
            return null;
        }
        R A = lVar.A(j2.b(k2.p(jArr, 0)));
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(j2.b(k2.p(jArr, o10.nextInt())));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long C8(long[] jArr) {
        l0.p(jArr, "$this$random");
        return B8(jArr, ef.f.O);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<e2> C9(@g int[] iArr) {
        l0.p(iArr, "$this$reversed");
        if (f2.u(iArr)) {
            return w.E();
        }
        List<e2> T5 = e0.T5(f2.c(iArr));
        d0.m1(T5);
        return T5;
    }

    @h1(version = "1.3")
    @t
    @h
    public static final j2 Ca(@g long[] jArr) {
        l0.p(jArr, "$this$singleOrNull");
        if (k2.r(jArr) == 1) {
            return j2.b(k2.p(jArr, 0));
        }
        return null;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<e2> Cb(@g int[] iArr) {
        l0.p(iArr, "$this$sortedDescending");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        int[] f10 = f2.f(copyOf);
        Wa(f10);
        return C9(f10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<a2> Cc(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$takeWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            if (!lVar.A(a2.b(p10)).booleanValue()) {
                break;
            }
            arrayList.add(a2.b(p10));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte D0(byte[] bArr) {
        l0.p(bArr, "$this$component2");
        return b2.p(bArr, 1);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int[] D1(int[] iArr, int i10) {
        l0.p(iArr, "$this$copyOf");
        int[] copyOf = Arrays.copyOf(iArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return f2.f(copyOf);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super p2>> C D2(short[] sArr, C c10, p<? super Integer, ? super p2, Boolean> pVar) {
        l0.p(sArr, "$this$filterIndexedTo");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int r10 = q2.r(sArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            short p10 = q2.p(sArr, i10);
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), p2.b(p10)).booleanValue()) {
                c10.add(p2.b(p10));
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C D3(short[] sArr, C c10, l<? super p2, ? extends Iterable<? extends R>> lVar) {
        l0.p(sArr, "$this$flatMapTo");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            b0.o0(c10, (Iterable) lVar.A(p2.b(q2.p(sArr, i10))));
        }
        return c10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K, V> Map<K, List<V>> D4(short[] sArr, l<? super p2, ? extends K> lVar, l<? super p2, ? extends V> lVar2) {
        l0.p(sArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            Object A = lVar.A(p2.b(p10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(p2.b(p10)));
        }
        return linkedHashMap;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R> List<R> D5(int[] iArr, p<? super Integer, ? super e2, ? extends R> pVar) {
        l0.p(iArr, "$this$mapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(f2.r(iArr));
        int r10 = f2.r(iArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), e2.b(f2.p(iArr, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @h
    public static final a2 D6(@g byte[] bArr) {
        l0.p(bArr, "$this$maxOrNull");
        if (b2.u(bArr)) {
            return null;
        }
        byte p10 = b2.p(bArr, 0);
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            byte p11 = b2.p(bArr, o10.nextInt());
            if (l0.t(p10 & 255, p11 & 255) < 0) {
                p10 = p11;
            }
        }
        return a2.b(p10);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R D7(byte[] bArr, Comparator<? super R> comparator, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$minOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (b2.u(bArr)) {
            return null;
        }
        R A = lVar.A(a2.b(b2.p(bArr, 0)));
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(a2.b(b2.p(bArr, o10.nextInt())));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.3")
    @t
    public static final byte D8(@g byte[] bArr, @g ef.f fVar) {
        l0.p(bArr, "$this$random");
        l0.p(fVar, "random");
        if (!b2.u(bArr)) {
            return b2.p(bArr, fVar.m(b2.r(bArr)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<a2> D9(@g byte[] bArr) {
        l0.p(bArr, "$this$reversed");
        if (b2.u(bArr)) {
            return w.E();
        }
        List<a2> T5 = e0.T5(b2.c(bArr));
        d0.m1(T5);
        return T5;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final e2 Da(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$singleOrNull");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr);
        boolean z10 = false;
        e2 e2Var = null;
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            if (lVar.A(e2.b(p10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                e2Var = e2.b(p10);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return e2Var;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<a2> Db(@g byte[] bArr) {
        l0.p(bArr, "$this$sortedDescending");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        byte[] f10 = b2.f(copyOf);
        db(f10);
        return D9(f10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<j2> Dc(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$takeWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            if (!lVar.A(j2.b(p10)).booleanValue()) {
                break;
            }
            arrayList.add(j2.b(p10));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long E0(long[] jArr) {
        l0.p(jArr, "$this$component2");
        return k2.p(jArr, 1);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long[] E1(long[] jArr, int i10) {
        l0.p(jArr, "$this$copyOf");
        long[] copyOf = Arrays.copyOf(jArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return k2.f(copyOf);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super a2>> C E2(byte[] bArr, C c10, p<? super Integer, ? super a2, Boolean> pVar) {
        l0.p(bArr, "$this$filterIndexedTo");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int r10 = b2.r(bArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            byte p10 = b2.p(bArr, i10);
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), a2.b(p10)).booleanValue()) {
                c10.add(a2.b(p10));
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C E3(int[] iArr, C c10, l<? super e2, ? extends Iterable<? extends R>> lVar) {
        l0.p(iArr, "$this$flatMapTo");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            b0.o0(c10, (Iterable) lVar.A(e2.b(f2.p(iArr, i10))));
        }
        return c10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K> Map<K, List<a2>> E4(byte[] bArr, l<? super a2, ? extends K> lVar) {
        l0.p(bArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            Object A = lVar.A(a2.b(p10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(a2.b(p10));
        }
        return linkedHashMap;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R> List<R> E5(long[] jArr, p<? super Integer, ? super j2, ? extends R> pVar) {
        l0.p(jArr, "$this$mapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(k2.r(jArr));
        int r10 = k2.r(jArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), j2.b(k2.p(jArr, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @h
    public static final j2 E6(@g long[] jArr) {
        l0.p(jArr, "$this$maxOrNull");
        if (k2.u(jArr)) {
            return null;
        }
        long p10 = k2.p(jArr, 0);
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            long p11 = k2.p(jArr, o10.nextInt());
            if (Long.compare(p10 ^ Long.MIN_VALUE, p11 ^ Long.MIN_VALUE) < 0) {
                p10 = p11;
            }
        }
        return j2.b(p10);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R E7(short[] sArr, Comparator<? super R> comparator, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$minOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (q2.u(sArr)) {
            return null;
        }
        R A = lVar.A(p2.b(q2.p(sArr, 0)));
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(p2.b(q2.p(sArr, o10.nextInt())));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short E8(short[] sArr) {
        l0.p(sArr, "$this$random");
        return F8(sArr, ef.f.O);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<j2> E9(@g long[] jArr) {
        l0.p(jArr, "$this$reversed");
        if (k2.u(jArr)) {
            return w.E();
        }
        List<j2> T5 = e0.T5(k2.c(jArr));
        d0.m1(T5);
        return T5;
    }

    @h1(version = "1.3")
    @t
    @h
    public static final p2 Ea(@g short[] sArr) {
        l0.p(sArr, "$this$singleOrNull");
        if (q2.r(sArr) == 1) {
            return p2.b(q2.p(sArr, 0));
        }
        return null;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<j2> Eb(@g long[] jArr) {
        l0.p(jArr, "$this$sortedDescending");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        long[] f10 = k2.f(copyOf);
        eb(f10);
        return E9(f10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<e2> Ec(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$takeWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            if (!lVar.A(e2.b(p10)).booleanValue()) {
                break;
            }
            arrayList.add(e2.b(p10));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short F0(short[] sArr) {
        l0.p(sArr, "$this$component2");
        return q2.p(sArr, 1);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short[] F1(short[] sArr) {
        l0.p(sArr, "$this$copyOf");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return q2.f(copyOf);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super j2>> C F2(long[] jArr, C c10, p<? super Integer, ? super j2, Boolean> pVar) {
        l0.p(jArr, "$this$filterIndexedTo");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int r10 = k2.r(jArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            long p10 = k2.p(jArr, i10);
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), j2.b(p10)).booleanValue()) {
                c10.add(j2.b(p10));
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C F3(byte[] bArr, C c10, l<? super a2, ? extends Iterable<? extends R>> lVar) {
        l0.p(bArr, "$this$flatMapTo");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            b0.o0(c10, (Iterable) lVar.A(a2.b(b2.p(bArr, i10))));
        }
        return c10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K, V> Map<K, List<V>> F4(int[] iArr, l<? super e2, ? extends K> lVar, l<? super e2, ? extends V> lVar2) {
        l0.p(iArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            Object A = lVar.A(e2.b(p10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(e2.b(p10)));
        }
        return linkedHashMap;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R> List<R> F5(short[] sArr, p<? super Integer, ? super p2, ? extends R> pVar) {
        l0.p(sArr, "$this$mapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(q2.r(sArr));
        int r10 = q2.r(sArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), p2.b(q2.p(sArr, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @h
    public static final p2 F6(@g short[] sArr) {
        l0.p(sArr, "$this$maxOrNull");
        if (q2.u(sArr)) {
            return null;
        }
        short p10 = q2.p(sArr, 0);
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            short p11 = q2.p(sArr, o10.nextInt());
            if (l0.t(p10 & p2.R, 65535 & p11) < 0) {
                p10 = p11;
            }
        }
        return p2.b(p10);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R F7(int[] iArr, Comparator<? super R> comparator, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$minOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (f2.u(iArr)) {
            return null;
        }
        R A = lVar.A(e2.b(f2.p(iArr, 0)));
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(e2.b(f2.p(iArr, o10.nextInt())));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.3")
    @t
    public static final short F8(@g short[] sArr, @g ef.f fVar) {
        l0.p(sArr, "$this$random");
        l0.p(fVar, "random");
        if (!q2.u(sArr)) {
            return q2.p(sArr, fVar.m(q2.r(sArr)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<p2> F9(@g short[] sArr) {
        l0.p(sArr, "$this$reversed");
        if (q2.u(sArr)) {
            return w.E();
        }
        List<p2> T5 = e0.T5(q2.c(sArr));
        d0.m1(T5);
        return T5;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final p2 Fa(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$singleOrNull");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr);
        boolean z10 = false;
        p2 p2Var = null;
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            if (lVar.A(p2.b(p10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                p2Var = p2.b(p10);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return p2Var;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<p2> Fb(@g short[] sArr) {
        l0.p(sArr, "$this$sortedDescending");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        short[] f10 = q2.f(copyOf);
        hb(f10);
        return F9(f10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<p2> Fc(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$takeWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            if (!lVar.A(p2.b(p10)).booleanValue()) {
                break;
            }
            arrayList.add(p2.b(p10));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int G0(int[] iArr) {
        l0.p(iArr, "$this$component3");
        return f2.p(iArr, 2);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long[] G1(long[] jArr, int i10, int i11) {
        l0.p(jArr, "$this$copyOfRange");
        return k2.f(o.L1(jArr, i10, i11));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<a2> G2(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$filterNot");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            if (!lVar.A(a2.b(p10)).booleanValue()) {
                arrayList.add(a2.b(p10));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super zd.j2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R G3(long[] r4, R r5, we.p<? super R, ? super zd.j2, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$fold"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = zd.k2.r(r4)
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0020
            long r2 = zd.k2.p(r4, r1)
            zd.j2 r2 = zd.j2.b(r2)
            java.lang.Object r5 = r6.g0(r5, r2)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0020:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.G3(long[], java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K> Map<K, List<j2>> G4(long[] jArr, l<? super j2, ? extends K> lVar) {
        l0.p(jArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            Object A = lVar.A(j2.b(p10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(j2.b(p10));
        }
        return linkedHashMap;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C G5(int[] iArr, C c10, p<? super Integer, ? super e2, ? extends R> pVar) {
        l0.p(iArr, "$this$mapIndexedTo");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int r10 = f2.r(iArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            c10.add(pVar.g0(Integer.valueOf(i11), e2.b(f2.p(iArr, i10))));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "maxOrThrow-U")
    public static final byte G6(@g byte[] bArr) {
        l0.p(bArr, "$this$max");
        if (!b2.u(bArr)) {
            byte p10 = b2.p(bArr, 0);
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                byte p11 = b2.p(bArr, o10.nextInt());
                if (l0.t(p10 & 255, p11 & 255) < 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @h
    public static final e2 G7(@g int[] iArr) {
        l0.p(iArr, "$this$minOrNull");
        if (f2.u(iArr)) {
            return null;
        }
        int p10 = f2.p(iArr, 0);
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            int p11 = f2.p(iArr, o10.nextInt());
            if (Integer.compare(p10 ^ Integer.MIN_VALUE, p11 ^ Integer.MIN_VALUE) > 0) {
                p10 = p11;
            }
        }
        return e2.b(p10);
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @f
    public static final e2 G8(int[] iArr) {
        l0.p(iArr, "$this$randomOrNull");
        return H8(iArr, ef.f.O);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int[] G9(int[] iArr) {
        l0.p(iArr, "$this$reversedArray");
        return f2.f(be.p.Vr(iArr));
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<j2> Ga(@g long[] jArr, @g Iterable<Integer> iterable) {
        l0.p(jArr, "$this$slice");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(j2.b(k2.p(jArr, intValue.intValue())));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int Gb(int[] iArr) {
        l0.p(iArr, "$this$sum");
        return e2.l(be.p.Bw(iArr));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte[] Gc(byte[] bArr) {
        l0.p(bArr, "$this$toByteArray");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte H0(byte[] bArr) {
        l0.p(bArr, "$this$component3");
        return b2.p(bArr, 2);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte[] H1(byte[] bArr, int i10, int i11) {
        l0.p(bArr, "$this$copyOfRange");
        return b2.f(o.G1(bArr, i10, i11));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<j2> H2(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$filterNot");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            if (!lVar.A(j2.b(p10)).booleanValue()) {
                arrayList.add(j2.b(p10));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.p, we.p<? super R, ? super zd.a2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R H3(byte[] r3, R r4, we.p<? super R, ? super zd.a2, ? extends R> r5) {
        /*
            java.lang.String r0 = "$this$fold"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = zd.b2.r(r3)
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0020
            byte r2 = zd.b2.p(r3, r1)
            zd.a2 r2 = zd.a2.b(r2)
            java.lang.Object r4 = r5.g0(r4, r2)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0020:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.H3(byte[], java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K, V> Map<K, List<V>> H4(byte[] bArr, l<? super a2, ? extends K> lVar, l<? super a2, ? extends V> lVar2) {
        l0.p(bArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            Object A = lVar.A(a2.b(p10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(a2.b(p10)));
        }
        return linkedHashMap;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C H5(short[] sArr, C c10, p<? super Integer, ? super p2, ? extends R> pVar) {
        l0.p(sArr, "$this$mapIndexedTo");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int r10 = q2.r(sArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            c10.add(pVar.g0(Integer.valueOf(i11), p2.b(q2.p(sArr, i10))));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "maxOrThrow-U")
    public static final int H6(@g int[] iArr) {
        l0.p(iArr, "$this$max");
        if (!f2.u(iArr)) {
            int p10 = f2.p(iArr, 0);
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                int p11 = f2.p(iArr, o10.nextInt());
                if (Integer.compare(p10 ^ Integer.MIN_VALUE, p11 ^ Integer.MIN_VALUE) < 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @h
    public static final a2 H7(@g byte[] bArr) {
        l0.p(bArr, "$this$minOrNull");
        if (b2.u(bArr)) {
            return null;
        }
        byte p10 = b2.p(bArr, 0);
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            byte p11 = b2.p(bArr, o10.nextInt());
            if (l0.t(p10 & 255, p11 & 255) > 0) {
                p10 = p11;
            }
        }
        return a2.b(p10);
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @h
    public static final e2 H8(@g int[] iArr, @g ef.f fVar) {
        l0.p(iArr, "$this$randomOrNull");
        l0.p(fVar, "random");
        if (f2.u(iArr)) {
            return null;
        }
        return e2.b(f2.p(iArr, fVar.m(f2.r(iArr))));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte[] H9(byte[] bArr) {
        l0.p(bArr, "$this$reversedArray");
        return b2.f(be.p.Rr(bArr));
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<e2> Ha(@g int[] iArr, @g Iterable<Integer> iterable) {
        l0.p(iArr, "$this$slice");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(e2.b(f2.p(iArr, intValue.intValue())));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int Hb(byte[] bArr) {
        l0.p(bArr, "$this$sum");
        int l10 = e2.l(0);
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            l10 = e2.l(l10 + e2.l(b2.p(bArr, i10) & 255));
        }
        return l10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int[] Hc(int[] iArr) {
        l0.p(iArr, "$this$toIntArray");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long I0(long[] jArr) {
        l0.p(jArr, "$this$component3");
        return k2.p(jArr, 2);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short[] I1(short[] sArr, int i10, int i11) {
        l0.p(sArr, "$this$copyOfRange");
        return q2.f(o.N1(sArr, i10, i11));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<e2> I2(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$filterNot");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            if (!lVar.A(e2.b(p10)).booleanValue()) {
                arrayList.add(e2.b(p10));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.p, we.p<? super R, ? super zd.e2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R I3(int[] r3, R r4, we.p<? super R, ? super zd.e2, ? extends R> r5) {
        /*
            java.lang.String r0 = "$this$fold"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = zd.f2.r(r3)
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0020
            int r2 = zd.f2.p(r3, r1)
            zd.e2 r2 = zd.e2.b(r2)
            java.lang.Object r4 = r5.g0(r4, r2)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0020:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.I3(int[], java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K> Map<K, List<e2>> I4(int[] iArr, l<? super e2, ? extends K> lVar) {
        l0.p(iArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            Object A = lVar.A(e2.b(p10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(e2.b(p10));
        }
        return linkedHashMap;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C I5(byte[] bArr, C c10, p<? super Integer, ? super a2, ? extends R> pVar) {
        l0.p(bArr, "$this$mapIndexedTo");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int r10 = b2.r(bArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            c10.add(pVar.g0(Integer.valueOf(i11), a2.b(b2.p(bArr, i10))));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "maxOrThrow-U")
    public static final long I6(@g long[] jArr) {
        l0.p(jArr, "$this$max");
        if (!k2.u(jArr)) {
            long p10 = k2.p(jArr, 0);
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                long p11 = k2.p(jArr, o10.nextInt());
                if (Long.compare(p10 ^ Long.MIN_VALUE, p11 ^ Long.MIN_VALUE) < 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @h
    public static final j2 I7(@g long[] jArr) {
        l0.p(jArr, "$this$minOrNull");
        if (k2.u(jArr)) {
            return null;
        }
        long p10 = k2.p(jArr, 0);
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            long p11 = k2.p(jArr, o10.nextInt());
            if (Long.compare(p10 ^ Long.MIN_VALUE, p11 ^ Long.MIN_VALUE) > 0) {
                p10 = p11;
            }
        }
        return j2.b(p10);
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @f
    public static final a2 I8(byte[] bArr) {
        l0.p(bArr, "$this$randomOrNull");
        return L8(bArr, ef.f.O);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long[] I9(long[] jArr) {
        l0.p(jArr, "$this$reversedArray");
        return k2.f(be.p.Wr(jArr));
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<p2> Ia(@g short[] sArr, @g Iterable<Integer> iterable) {
        l0.p(sArr, "$this$slice");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(p2.b(q2.p(sArr, intValue.intValue())));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long Ib(long[] jArr) {
        l0.p(jArr, "$this$sum");
        return j2.l(be.p.Dw(jArr));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long[] Ic(long[] jArr) {
        l0.p(jArr, "$this$toLongArray");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short J0(short[] sArr) {
        l0.p(sArr, "$this$component3");
        return q2.p(sArr, 2);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int[] J1(int[] iArr, int i10, int i11) {
        l0.p(iArr, "$this$copyOfRange");
        return f2.f(o.K1(iArr, i10, i11));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<p2> J2(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$filterNot");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            if (!lVar.A(p2.b(p10)).booleanValue()) {
                arrayList.add(p2.b(p10));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.p, we.p<? super R, ? super zd.p2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R J3(short[] r3, R r4, we.p<? super R, ? super zd.p2, ? extends R> r5) {
        /*
            java.lang.String r0 = "$this$fold"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = zd.q2.r(r3)
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0020
            short r2 = zd.q2.p(r3, r1)
            zd.p2 r2 = zd.p2.b(r2)
            java.lang.Object r4 = r5.g0(r4, r2)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0020:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.J3(short[], java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K> Map<K, List<p2>> J4(short[] sArr, l<? super p2, ? extends K> lVar) {
        l0.p(sArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            Object A = lVar.A(p2.b(p10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(p2.b(p10));
        }
        return linkedHashMap;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C J5(long[] jArr, C c10, p<? super Integer, ? super j2, ? extends R> pVar) {
        l0.p(jArr, "$this$mapIndexedTo");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int r10 = k2.r(jArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            c10.add(pVar.g0(Integer.valueOf(i11), j2.b(k2.p(jArr, i10))));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "maxOrThrow-U")
    public static final short J6(@g short[] sArr) {
        l0.p(sArr, "$this$max");
        if (!q2.u(sArr)) {
            short p10 = q2.p(sArr, 0);
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                short p11 = q2.p(sArr, o10.nextInt());
                if (l0.t(p10 & p2.R, 65535 & p11) < 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @h
    public static final p2 J7(@g short[] sArr) {
        l0.p(sArr, "$this$minOrNull");
        if (q2.u(sArr)) {
            return null;
        }
        short p10 = q2.p(sArr, 0);
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            short p11 = q2.p(sArr, o10.nextInt());
            if (l0.t(p10 & p2.R, 65535 & p11) > 0) {
                p10 = p11;
            }
        }
        return p2.b(p10);
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @h
    public static final j2 J8(@g long[] jArr, @g ef.f fVar) {
        l0.p(jArr, "$this$randomOrNull");
        l0.p(fVar, "random");
        if (k2.u(jArr)) {
            return null;
        }
        return j2.b(k2.p(jArr, fVar.m(k2.r(jArr))));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short[] J9(short[] sArr) {
        l0.p(sArr, "$this$reversedArray");
        return q2.f(be.p.Yr(sArr));
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<a2> Ja(@g byte[] bArr, @g Iterable<Integer> iterable) {
        l0.p(bArr, "$this$slice");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(a2.b(b2.p(bArr, intValue.intValue())));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int Jb(short[] sArr) {
        l0.p(sArr, "$this$sum");
        int l10 = e2.l(0);
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            l10 = e2.l(l10 + e2.l(q2.p(sArr, i10) & p2.R));
        }
        return l10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short[] Jc(short[] sArr) {
        l0.p(sArr, "$this$toShortArray");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int K0(int[] iArr) {
        l0.p(iArr, "$this$component4");
        return f2.p(iArr, 3);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int K1(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$count");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr);
        int i10 = 0;
        for (int i11 = 0; i11 < r10; i11++) {
            if (lVar.A(a2.b(b2.p(bArr, i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super j2>> C K2(long[] jArr, C c10, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$filterNotTo");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            if (!lVar.A(j2.b(p10)).booleanValue()) {
                c10.add(j2.b(p10));
            }
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super zd.a2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R K3(byte[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super zd.a2, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$foldIndexed"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = zd.b2.r(r5)
            r1 = 0
            r2 = r1
        L_0x0010:
            if (r1 >= r0) goto L_0x0028
            byte r3 = zd.b2.p(r5, r1)
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            zd.a2 r3 = zd.a2.b(r3)
            java.lang.Object r6 = r7.y(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x0010
        L_0x0028:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.K3(byte[], java.lang.Object, we.q):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K, M extends Map<? super K, List<e2>>> M K4(int[] iArr, M m10, l<? super e2, ? extends K> lVar) {
        l0.p(iArr, "$this$groupByTo");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            Object A = lVar.A(e2.b(p10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(e2.b(p10));
        }
        return m10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C K5(long[] jArr, C c10, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$mapTo");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            c10.add(lVar.A(j2.b(k2.p(jArr, i10))));
        }
        return c10;
    }

    @h1(version = "1.4")
    @t
    @h
    public static final a2 K6(@g byte[] bArr, @g Comparator<? super a2> comparator) {
        l0.p(bArr, "$this$maxWithOrNull");
        l0.p(comparator, "comparator");
        if (b2.u(bArr)) {
            return null;
        }
        byte p10 = b2.p(bArr, 0);
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            byte p11 = b2.p(bArr, o10.nextInt());
            if (comparator.compare(a2.b(p10), a2.b(p11)) < 0) {
                p10 = p11;
            }
        }
        return a2.b(p10);
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "minOrThrow-U")
    public static final byte K7(@g byte[] bArr) {
        l0.p(bArr, "$this$min");
        if (!b2.u(bArr)) {
            byte p10 = b2.p(bArr, 0);
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                byte p11 = b2.p(bArr, o10.nextInt());
                if (l0.t(p10 & 255, p11 & 255) > 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @f
    public static final j2 K8(long[] jArr) {
        l0.p(jArr, "$this$randomOrNull");
        return J8(jArr, ef.f.O);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.p, we.p<? super R, ? super zd.j2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> K9(long[] r5, R r6, we.p<? super R, ? super zd.j2, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$runningFold"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            boolean r0 = zd.k2.u(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.k2.r(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            r1 = 0
            int r2 = zd.k2.r(r5)
        L_0x0028:
            if (r1 >= r2) goto L_0x003c
            long r3 = zd.k2.p(r5, r1)
            zd.j2 r3 = zd.j2.b(r3)
            java.lang.Object r6 = r7.g0(r6, r3)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.K9(long[], java.lang.Object, we.p):java.util.List");
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<p2> Ka(@g short[] sArr, @g m mVar) {
        l0.p(sArr, "$this$slice");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : b.d(q2.f(o.N1(sArr, mVar.c().intValue(), mVar.h().intValue() + 1)));
    }

    @h1(version = "1.3")
    @zd.l(warningSince = "1.5")
    @t
    @f
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Kb(byte[] bArr, l<? super a2, e2> lVar) {
        l0.p(bArr, "$this$sumBy");
        l0.p(lVar, "selector");
        int r10 = b2.r(bArr);
        int i10 = 0;
        for (int i11 = 0; i11 < r10; i11++) {
            i10 = e2.l(i10 + lVar.A(a2.b(b2.p(bArr, i11))).l0());
        }
        return i10;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final e2[] Kc(@g int[] iArr) {
        l0.p(iArr, "$this$toTypedArray");
        int r10 = f2.r(iArr);
        e2[] e2VarArr = new e2[r10];
        for (int i10 = 0; i10 < r10; i10++) {
            e2VarArr[i10] = e2.b(f2.p(iArr, i10));
        }
        return e2VarArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte L0(byte[] bArr) {
        l0.p(bArr, "$this$component4");
        return b2.p(bArr, 3);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int L1(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$count");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr);
        int i10 = 0;
        for (int i11 = 0; i11 < r10; i11++) {
            if (lVar.A(j2.b(k2.p(jArr, i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super p2>> C L2(short[] sArr, C c10, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$filterNotTo");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            if (!lVar.A(p2.b(p10)).booleanValue()) {
                c10.add(p2.b(p10));
            }
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super zd.p2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R L3(short[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super zd.p2, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$foldIndexed"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = zd.q2.r(r5)
            r1 = 0
            r2 = r1
        L_0x0010:
            if (r1 >= r0) goto L_0x0028
            short r3 = zd.q2.p(r5, r1)
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            zd.p2 r3 = zd.p2.b(r3)
            java.lang.Object r6 = r7.y(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x0010
        L_0x0028:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.L3(short[], java.lang.Object, we.q):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K, M extends Map<? super K, List<a2>>> M L4(byte[] bArr, M m10, l<? super a2, ? extends K> lVar) {
        l0.p(bArr, "$this$groupByTo");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            Object A = lVar.A(a2.b(p10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(a2.b(p10));
        }
        return m10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C L5(short[] sArr, C c10, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$mapTo");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            c10.add(lVar.A(p2.b(q2.p(sArr, i10))));
        }
        return c10;
    }

    @h1(version = "1.4")
    @t
    @h
    public static final e2 L6(@g int[] iArr, @g Comparator<? super e2> comparator) {
        l0.p(iArr, "$this$maxWithOrNull");
        l0.p(comparator, "comparator");
        if (f2.u(iArr)) {
            return null;
        }
        int p10 = f2.p(iArr, 0);
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            int p11 = f2.p(iArr, o10.nextInt());
            if (comparator.compare(e2.b(p10), e2.b(p11)) < 0) {
                p10 = p11;
            }
        }
        return e2.b(p10);
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "minOrThrow-U")
    public static final int L7(@g int[] iArr) {
        l0.p(iArr, "$this$min");
        if (!f2.u(iArr)) {
            int p10 = f2.p(iArr, 0);
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                int p11 = f2.p(iArr, o10.nextInt());
                if (Integer.compare(p10 ^ Integer.MIN_VALUE, p11 ^ Integer.MIN_VALUE) > 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @h
    public static final a2 L8(@g byte[] bArr, @g ef.f fVar) {
        l0.p(bArr, "$this$randomOrNull");
        l0.p(fVar, "random");
        if (b2.u(bArr)) {
            return null;
        }
        return a2.b(b2.p(bArr, fVar.m(b2.r(bArr))));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super zd.a2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> L9(byte[] r4, R r5, we.p<? super R, ? super zd.a2, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$runningFold"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            boolean r0 = zd.b2.u(r4)
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = be.v.k(r5)
            return r4
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.b2.r(r4)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r5)
            r1 = 0
            int r2 = zd.b2.r(r4)
        L_0x0028:
            if (r1 >= r2) goto L_0x003c
            byte r3 = zd.b2.p(r4, r1)
            zd.a2 r3 = zd.a2.b(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.L9(byte[], java.lang.Object, we.p):java.util.List");
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<j2> La(@g long[] jArr, @g m mVar) {
        l0.p(jArr, "$this$slice");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : b.c(k2.f(o.L1(jArr, mVar.c().intValue(), mVar.h().intValue() + 1)));
    }

    @h1(version = "1.3")
    @zd.l(warningSince = "1.5")
    @t
    @f
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Lb(long[] jArr, l<? super j2, e2> lVar) {
        l0.p(jArr, "$this$sumBy");
        l0.p(lVar, "selector");
        int r10 = k2.r(jArr);
        int i10 = 0;
        for (int i11 = 0; i11 < r10; i11++) {
            i10 = e2.l(i10 + lVar.A(j2.b(k2.p(jArr, i11))).l0());
        }
        return i10;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final a2[] Lc(@g byte[] bArr) {
        l0.p(bArr, "$this$toTypedArray");
        int r10 = b2.r(bArr);
        a2[] a2VarArr = new a2[r10];
        for (int i10 = 0; i10 < r10; i10++) {
            a2VarArr[i10] = a2.b(b2.p(bArr, i10));
        }
        return a2VarArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long M0(long[] jArr) {
        l0.p(jArr, "$this$component4");
        return k2.p(jArr, 3);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int M1(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$count");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr);
        int i10 = 0;
        for (int i11 = 0; i11 < r10; i11++) {
            if (lVar.A(e2.b(f2.p(iArr, i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super e2>> C M2(int[] iArr, C c10, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$filterNotTo");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            if (!lVar.A(e2.b(p10)).booleanValue()) {
                c10.add(e2.b(p10));
            }
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super zd.j2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R M3(long[] r6, R r7, we.q<? super java.lang.Integer, ? super R, ? super zd.j2, ? extends R> r8) {
        /*
            java.lang.String r0 = "$this$foldIndexed"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r8, r0)
            int r0 = zd.k2.r(r6)
            r1 = 0
            r2 = r1
        L_0x0010:
            if (r1 >= r0) goto L_0x0028
            long r3 = zd.k2.p(r6, r1)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            zd.j2 r3 = zd.j2.b(r3)
            java.lang.Object r7 = r8.y(r2, r7, r3)
            int r1 = r1 + 1
            r2 = r5
            goto L_0x0010
        L_0x0028:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.M3(long[], java.lang.Object, we.q):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K, V, M extends Map<? super K, List<V>>> M M4(int[] iArr, M m10, l<? super e2, ? extends K> lVar, l<? super e2, ? extends V> lVar2) {
        l0.p(iArr, "$this$groupByTo");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            Object A = lVar.A(e2.b(p10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(e2.b(p10)));
        }
        return m10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C M5(int[] iArr, C c10, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$mapTo");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            c10.add(lVar.A(e2.b(f2.p(iArr, i10))));
        }
        return c10;
    }

    @h1(version = "1.4")
    @t
    @h
    public static final p2 M6(@g short[] sArr, @g Comparator<? super p2> comparator) {
        l0.p(sArr, "$this$maxWithOrNull");
        l0.p(comparator, "comparator");
        if (q2.u(sArr)) {
            return null;
        }
        short p10 = q2.p(sArr, 0);
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            short p11 = q2.p(sArr, o10.nextInt());
            if (comparator.compare(p2.b(p10), p2.b(p11)) < 0) {
                p10 = p11;
            }
        }
        return p2.b(p10);
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "minOrThrow-U")
    public static final long M7(@g long[] jArr) {
        l0.p(jArr, "$this$min");
        if (!k2.u(jArr)) {
            long p10 = k2.p(jArr, 0);
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                long p11 = k2.p(jArr, o10.nextInt());
                if (Long.compare(p10 ^ Long.MIN_VALUE, p11 ^ Long.MIN_VALUE) > 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @f
    public static final p2 M8(short[] sArr) {
        l0.p(sArr, "$this$randomOrNull");
        return N8(sArr, ef.f.O);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super zd.e2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> M9(int[] r4, R r5, we.p<? super R, ? super zd.e2, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$runningFold"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            boolean r0 = zd.f2.u(r4)
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = be.v.k(r5)
            return r4
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.f2.r(r4)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r5)
            r1 = 0
            int r2 = zd.f2.r(r4)
        L_0x0028:
            if (r1 >= r2) goto L_0x003c
            int r3 = zd.f2.p(r4, r1)
            zd.e2 r3 = zd.e2.b(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.M9(int[], java.lang.Object, we.p):java.util.List");
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<a2> Ma(@g byte[] bArr, @g m mVar) {
        l0.p(bArr, "$this$slice");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : b.b(b2.f(o.G1(bArr, mVar.c().intValue(), mVar.h().intValue() + 1)));
    }

    @h1(version = "1.3")
    @zd.l(warningSince = "1.5")
    @t
    @f
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Mb(int[] iArr, l<? super e2, e2> lVar) {
        l0.p(iArr, "$this$sumBy");
        l0.p(lVar, "selector");
        int r10 = f2.r(iArr);
        int i10 = 0;
        for (int i11 = 0; i11 < r10; i11++) {
            i10 = e2.l(i10 + lVar.A(e2.b(f2.p(iArr, i11))).l0());
        }
        return i10;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final j2[] Mc(@g long[] jArr) {
        l0.p(jArr, "$this$toTypedArray");
        int r10 = k2.r(jArr);
        j2[] j2VarArr = new j2[r10];
        for (int i10 = 0; i10 < r10; i10++) {
            j2VarArr[i10] = j2.b(k2.p(jArr, i10));
        }
        return j2VarArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short N0(short[] sArr) {
        l0.p(sArr, "$this$component4");
        return q2.p(sArr, 3);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int N1(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$count");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr);
        int i10 = 0;
        for (int i11 = 0; i11 < r10; i11++) {
            if (lVar.A(p2.b(q2.p(sArr, i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super a2>> C N2(byte[] bArr, C c10, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$filterNotTo");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            if (!lVar.A(a2.b(p10)).booleanValue()) {
                c10.add(a2.b(p10));
            }
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super zd.e2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R N3(int[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super zd.e2, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$foldIndexed"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = zd.f2.r(r5)
            r1 = 0
            r2 = r1
        L_0x0010:
            if (r1 >= r0) goto L_0x0028
            int r3 = zd.f2.p(r5, r1)
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            zd.e2 r3 = zd.e2.b(r3)
            java.lang.Object r6 = r7.y(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x0010
        L_0x0028:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.N3(int[], java.lang.Object, we.q):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K, V, M extends Map<? super K, List<V>>> M N4(long[] jArr, M m10, l<? super j2, ? extends K> lVar, l<? super j2, ? extends V> lVar2) {
        l0.p(jArr, "$this$groupByTo");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            Object A = lVar.A(j2.b(p10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(j2.b(p10)));
        }
        return m10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C N5(byte[] bArr, C c10, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$mapTo");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            c10.add(lVar.A(a2.b(b2.p(bArr, i10))));
        }
        return c10;
    }

    @h1(version = "1.4")
    @t
    @h
    public static final j2 N6(@g long[] jArr, @g Comparator<? super j2> comparator) {
        l0.p(jArr, "$this$maxWithOrNull");
        l0.p(comparator, "comparator");
        if (k2.u(jArr)) {
            return null;
        }
        long p10 = k2.p(jArr, 0);
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            long p11 = k2.p(jArr, o10.nextInt());
            if (comparator.compare(j2.b(p10), j2.b(p11)) < 0) {
                p10 = p11;
            }
        }
        return j2.b(p10);
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "minOrThrow-U")
    public static final short N7(@g short[] sArr) {
        l0.p(sArr, "$this$min");
        if (!q2.u(sArr)) {
            short p10 = q2.p(sArr, 0);
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                short p11 = q2.p(sArr, o10.nextInt());
                if (l0.t(p10 & p2.R, 65535 & p11) > 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @h
    public static final p2 N8(@g short[] sArr, @g ef.f fVar) {
        l0.p(sArr, "$this$randomOrNull");
        l0.p(fVar, "random");
        if (q2.u(sArr)) {
            return null;
        }
        return p2.b(q2.p(sArr, fVar.m(q2.r(sArr))));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super zd.p2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> N9(short[] r4, R r5, we.p<? super R, ? super zd.p2, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$runningFold"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            boolean r0 = zd.q2.u(r4)
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = be.v.k(r5)
            return r4
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.q2.r(r4)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r5)
            r1 = 0
            int r2 = zd.q2.r(r4)
        L_0x0028:
            if (r1 >= r2) goto L_0x003c
            short r3 = zd.q2.p(r4, r1)
            zd.p2 r3 = zd.p2.b(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.N9(short[], java.lang.Object, we.p):java.util.List");
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<e2> Na(@g int[] iArr, @g m mVar) {
        l0.p(iArr, "$this$slice");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : b.a(f2.f(o.K1(iArr, mVar.c().intValue(), mVar.h().intValue() + 1)));
    }

    @h1(version = "1.3")
    @zd.l(warningSince = "1.5")
    @t
    @f
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Nb(short[] sArr, l<? super p2, e2> lVar) {
        l0.p(sArr, "$this$sumBy");
        l0.p(lVar, "selector");
        int r10 = q2.r(sArr);
        int i10 = 0;
        for (int i11 = 0; i11 < r10; i11++) {
            i10 = e2.l(i10 + lVar.A(p2.b(q2.p(sArr, i11))).l0());
        }
        return i10;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final p2[] Nc(@g short[] sArr) {
        l0.p(sArr, "$this$toTypedArray");
        int r10 = q2.r(sArr);
        p2[] p2VarArr = new p2[r10];
        for (int i10 = 0; i10 < r10; i10++) {
            p2VarArr[i10] = p2.b(q2.p(sArr, i10));
        }
        return p2VarArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int O0(int[] iArr) {
        l0.p(iArr, "$this$component5");
        return f2.p(iArr, 4);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<a2> O1(@g byte[] bArr, int i10) {
        l0.p(bArr, "$this$drop");
        if (i10 >= 0) {
            return uc(bArr, v.u(b2.r(bArr) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super j2>> C O2(long[] jArr, C c10, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$filterTo");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            if (lVar.A(j2.b(p10)).booleanValue()) {
                c10.add(j2.b(p10));
            }
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super zd.j2, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R O3(long[] r4, R r5, we.p<? super zd.j2, ? super R, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$foldRight"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = be.p.We(r4)
        L_0x000e:
            if (r0 < 0) goto L_0x0020
            int r1 = r0 + -1
            long r2 = zd.k2.p(r4, r0)
            zd.j2 r0 = zd.j2.b(r2)
            java.lang.Object r5 = r6.g0(r0, r5)
            r0 = r1
            goto L_0x000e
        L_0x0020:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.O3(long[], java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K, M extends Map<? super K, List<j2>>> M O4(long[] jArr, M m10, l<? super j2, ? extends K> lVar) {
        l0.p(jArr, "$this$groupByTo");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            Object A = lVar.A(j2.b(p10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(j2.b(p10));
        }
        return m10;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> a2 O5(byte[] bArr, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$maxByOrNull");
        l0.p(lVar, "selector");
        if (b2.u(bArr)) {
            return null;
        }
        byte p10 = b2.p(bArr, 0);
        int Re = be.p.Re(bArr);
        if (Re == 0) {
            return a2.b(p10);
        }
        Comparable comparable = (Comparable) lVar.A(a2.b(p10));
        s0 o10 = new m(1, Re).iterator();
        while (o10.hasNext()) {
            byte p11 = b2.p(bArr, o10.nextInt());
            Comparable comparable2 = (Comparable) lVar.A(a2.b(p11));
            if (comparable.compareTo(comparable2) < 0) {
                p10 = p11;
                comparable = comparable2;
            }
        }
        return a2.b(p10);
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "maxWithOrThrow-U")
    public static final byte O6(@g byte[] bArr, @g Comparator<? super a2> comparator) {
        l0.p(bArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        if (!b2.u(bArr)) {
            byte p10 = b2.p(bArr, 0);
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                byte p11 = b2.p(bArr, o10.nextInt());
                if (comparator.compare(a2.b(p10), a2.b(p11)) < 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @h
    public static final a2 O7(@g byte[] bArr, @g Comparator<? super a2> comparator) {
        l0.p(bArr, "$this$minWithOrNull");
        l0.p(comparator, "comparator");
        if (b2.u(bArr)) {
            return null;
        }
        byte p10 = b2.p(bArr, 0);
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            byte p11 = b2.p(bArr, o10.nextInt());
            if (comparator.compare(a2.b(p10), a2.b(p11)) > 0) {
                p10 = p11;
            }
        }
        return a2.b(p10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte O8(byte[] bArr, p<? super a2, ? super a2, a2> pVar) {
        l0.p(bArr, "$this$reduce");
        l0.p(pVar, "operation");
        if (!b2.u(bArr)) {
            byte p10 = b2.p(bArr, 0);
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                p10 = pVar.g0(a2.b(p10), a2.b(b2.p(bArr, o10.nextInt()))).j0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super zd.a2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> O9(byte[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super zd.a2, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$runningFoldIndexed"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            boolean r0 = zd.b2.u(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.b2.r(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            r1 = 0
            int r2 = zd.b2.r(r5)
        L_0x0028:
            if (r1 >= r2) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            byte r4 = zd.b2.p(r5, r1)
            zd.a2 r4 = zd.a2.b(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.O9(byte[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.3")
    @t
    @g
    public static final int[] Oa(@g int[] iArr, @g Collection<Integer> collection) {
        l0.p(iArr, "$this$sliceArray");
        l0.p(collection, "indices");
        return f2.f(be.p.Gu(iArr, collection));
    }

    @h1(version = "1.3")
    @zd.l(warningSince = "1.5")
    @t
    @f
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double Ob(byte[] bArr, l<? super a2, Double> lVar) {
        l0.p(bArr, "$this$sumByDouble");
        l0.p(lVar, "selector");
        int r10 = b2.r(bArr);
        double d10 = 0.0d;
        for (int i10 = 0; i10 < r10; i10++) {
            d10 += lVar.A(a2.b(b2.p(bArr, i10))).doubleValue();
        }
        return d10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte[] Oc(byte[] bArr) {
        l0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return b2.f(copyOf);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte P0(byte[] bArr) {
        l0.p(bArr, "$this$component5");
        return b2.p(bArr, 4);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<p2> P1(@g short[] sArr, int i10) {
        l0.p(sArr, "$this$drop");
        if (i10 >= 0) {
            return vc(sArr, v.u(q2.r(sArr) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super p2>> C P2(short[] sArr, C c10, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$filterTo");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            if (lVar.A(p2.b(p10)).booleanValue()) {
                c10.add(p2.b(p10));
            }
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super zd.a2, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R P3(byte[] r2, R r3, we.p<? super zd.a2, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "$this$foldRight"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = be.p.Re(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x0020
            int r1 = r0 + -1
            byte r0 = zd.b2.p(r2, r0)
            zd.a2 r0 = zd.a2.b(r0)
            java.lang.Object r3 = r4.g0(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.P3(byte[], java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K, M extends Map<? super K, List<p2>>> M P4(short[] sArr, M m10, l<? super p2, ? extends K> lVar) {
        l0.p(sArr, "$this$groupByTo");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            Object A = lVar.A(p2.b(p10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(p2.b(p10));
        }
        return m10;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> j2 P5(long[] jArr, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxByOrNull");
        l0.p(lVar, "selector");
        if (k2.u(jArr)) {
            return null;
        }
        long p10 = k2.p(jArr, 0);
        int We = be.p.We(jArr);
        if (We == 0) {
            return j2.b(p10);
        }
        Comparable comparable = (Comparable) lVar.A(j2.b(p10));
        s0 o10 = new m(1, We).iterator();
        while (o10.hasNext()) {
            long p11 = k2.p(jArr, o10.nextInt());
            Comparable comparable2 = (Comparable) lVar.A(j2.b(p11));
            if (comparable.compareTo(comparable2) < 0) {
                p10 = p11;
                comparable = comparable2;
            }
        }
        return j2.b(p10);
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "maxWithOrThrow-U")
    public static final int P6(@g int[] iArr, @g Comparator<? super e2> comparator) {
        l0.p(iArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        if (!f2.u(iArr)) {
            int p10 = f2.p(iArr, 0);
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                int p11 = f2.p(iArr, o10.nextInt());
                if (comparator.compare(e2.b(p10), e2.b(p11)) < 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @h
    public static final e2 P7(@g int[] iArr, @g Comparator<? super e2> comparator) {
        l0.p(iArr, "$this$minWithOrNull");
        l0.p(comparator, "comparator");
        if (f2.u(iArr)) {
            return null;
        }
        int p10 = f2.p(iArr, 0);
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            int p11 = f2.p(iArr, o10.nextInt());
            if (comparator.compare(e2.b(p10), e2.b(p11)) > 0) {
                p10 = p11;
            }
        }
        return e2.b(p10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int P8(int[] iArr, p<? super e2, ? super e2, e2> pVar) {
        l0.p(iArr, "$this$reduce");
        l0.p(pVar, "operation");
        if (!f2.u(iArr)) {
            int p10 = f2.p(iArr, 0);
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                p10 = pVar.g0(e2.b(p10), e2.b(f2.p(iArr, o10.nextInt()))).l0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super zd.p2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> P9(short[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super zd.p2, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$runningFoldIndexed"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            boolean r0 = zd.q2.u(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.q2.r(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            r1 = 0
            int r2 = zd.q2.r(r5)
        L_0x0028:
            if (r1 >= r2) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            short r4 = zd.q2.p(r5, r1)
            zd.p2 r4 = zd.p2.b(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.P9(short[], java.lang.Object, we.q):java.util.List");
    }

    @g
    @h1(version = "1.3")
    @t
    public static final short[] Pa(@g short[] sArr, @g m mVar) {
        l0.p(sArr, "$this$sliceArray");
        l0.p(mVar, "indices");
        return q2.f(be.p.Lu(sArr, mVar));
    }

    @h1(version = "1.3")
    @zd.l(warningSince = "1.5")
    @t
    @f
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double Pb(long[] jArr, l<? super j2, Double> lVar) {
        l0.p(jArr, "$this$sumByDouble");
        l0.p(lVar, "selector");
        int r10 = k2.r(jArr);
        double d10 = 0.0d;
        for (int i10 = 0; i10 < r10; i10++) {
            d10 += lVar.A(j2.b(k2.p(jArr, i10))).doubleValue();
        }
        return d10;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final byte[] Pc(@g a2[] a2VarArr) {
        l0.p(a2VarArr, "<this>");
        int length = a2VarArr.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = a2VarArr[i10].j0();
        }
        return b2.f(bArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long Q0(long[] jArr) {
        l0.p(jArr, "$this$component5");
        return k2.p(jArr, 4);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<e2> Q1(@g int[] iArr, int i10) {
        l0.p(iArr, "$this$drop");
        if (i10 >= 0) {
            return wc(iArr, v.u(f2.r(iArr) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super e2>> C Q2(int[] iArr, C c10, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$filterTo");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            if (lVar.A(e2.b(p10)).booleanValue()) {
                c10.add(e2.b(p10));
            }
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super zd.e2, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Q3(int[] r2, R r3, we.p<? super zd.e2, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "$this$foldRight"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = be.p.Ve(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x0020
            int r1 = r0 + -1
            int r0 = zd.f2.p(r2, r0)
            zd.e2 r0 = zd.e2.b(r0)
            java.lang.Object r3 = r4.g0(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.Q3(int[], java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K, V, M extends Map<? super K, List<V>>> M Q4(short[] sArr, M m10, l<? super p2, ? extends K> lVar, l<? super p2, ? extends V> lVar2) {
        l0.p(sArr, "$this$groupByTo");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            Object A = lVar.A(p2.b(p10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(p2.b(p10)));
        }
        return m10;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> e2 Q5(int[] iArr, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$maxByOrNull");
        l0.p(lVar, "selector");
        if (f2.u(iArr)) {
            return null;
        }
        int p10 = f2.p(iArr, 0);
        int Ve = be.p.Ve(iArr);
        if (Ve == 0) {
            return e2.b(p10);
        }
        Comparable comparable = (Comparable) lVar.A(e2.b(p10));
        s0 o10 = new m(1, Ve).iterator();
        while (o10.hasNext()) {
            int p11 = f2.p(iArr, o10.nextInt());
            Comparable comparable2 = (Comparable) lVar.A(e2.b(p11));
            if (comparable.compareTo(comparable2) < 0) {
                p10 = p11;
                comparable = comparable2;
            }
        }
        return e2.b(p10);
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "maxWithOrThrow-U")
    public static final long Q6(@g long[] jArr, @g Comparator<? super j2> comparator) {
        l0.p(jArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        if (!k2.u(jArr)) {
            long p10 = k2.p(jArr, 0);
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                long p11 = k2.p(jArr, o10.nextInt());
                if (comparator.compare(j2.b(p10), j2.b(p11)) < 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @h
    public static final p2 Q7(@g short[] sArr, @g Comparator<? super p2> comparator) {
        l0.p(sArr, "$this$minWithOrNull");
        l0.p(comparator, "comparator");
        if (q2.u(sArr)) {
            return null;
        }
        short p10 = q2.p(sArr, 0);
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            short p11 = q2.p(sArr, o10.nextInt());
            if (comparator.compare(p2.b(p10), p2.b(p11)) > 0) {
                p10 = p11;
            }
        }
        return p2.b(p10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long Q8(long[] jArr, p<? super j2, ? super j2, j2> pVar) {
        l0.p(jArr, "$this$reduce");
        l0.p(pVar, "operation");
        if (!k2.u(jArr)) {
            long p10 = k2.p(jArr, 0);
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                p10 = pVar.g0(j2.b(p10), j2.b(k2.p(jArr, o10.nextInt()))).l0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super zd.j2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Q9(long[] r6, R r7, we.q<? super java.lang.Integer, ? super R, ? super zd.j2, ? extends R> r8) {
        /*
            java.lang.String r0 = "$this$runningFoldIndexed"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r8, r0)
            boolean r0 = zd.k2.u(r6)
            if (r0 == 0) goto L_0x0015
            java.util.List r6 = be.v.k(r7)
            return r6
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.k2.r(r6)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r7)
            r1 = 0
            int r2 = zd.k2.r(r6)
        L_0x0028:
            if (r1 >= r2) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            long r4 = zd.k2.p(r6, r1)
            zd.j2 r4 = zd.j2.b(r4)
            java.lang.Object r7 = r8.y(r3, r7, r4)
            r0.add(r7)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.Q9(long[], java.lang.Object, we.q):java.util.List");
    }

    @g
    @h1(version = "1.3")
    @t
    public static final long[] Qa(@g long[] jArr, @g m mVar) {
        l0.p(jArr, "$this$sliceArray");
        l0.p(mVar, "indices");
        return k2.f(be.p.Hu(jArr, mVar));
    }

    @h1(version = "1.3")
    @zd.l(warningSince = "1.5")
    @t
    @f
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double Qb(int[] iArr, l<? super e2, Double> lVar) {
        l0.p(iArr, "$this$sumByDouble");
        l0.p(lVar, "selector");
        int r10 = f2.r(iArr);
        double d10 = 0.0d;
        for (int i10 = 0; i10 < r10; i10++) {
            d10 += lVar.A(e2.b(f2.p(iArr, i10))).doubleValue();
        }
        return d10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int[] Qc(int[] iArr) {
        l0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return f2.f(copyOf);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short R0(short[] sArr) {
        l0.p(sArr, "$this$component5");
        return q2.p(sArr, 4);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<j2> R1(@g long[] jArr, int i10) {
        l0.p(jArr, "$this$drop");
        if (i10 >= 0) {
            return xc(jArr, v.u(k2.r(jArr) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super a2>> C R2(byte[] bArr, C c10, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$filterTo");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            if (lVar.A(a2.b(p10)).booleanValue()) {
                c10.add(a2.b(p10));
            }
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super zd.p2, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R R3(short[] r2, R r3, we.p<? super zd.p2, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "$this$foldRight"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = be.p.Ye(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x0020
            int r1 = r0 + -1
            short r0 = zd.q2.p(r2, r0)
            zd.p2 r0 = zd.p2.b(r0)
            java.lang.Object r3 = r4.g0(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.R3(short[], java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <K, V, M extends Map<? super K, List<V>>> M R4(byte[] bArr, M m10, l<? super a2, ? extends K> lVar, l<? super a2, ? extends V> lVar2) {
        l0.p(bArr, "$this$groupByTo");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            Object A = lVar.A(a2.b(p10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(a2.b(p10)));
        }
        return m10;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> p2 R5(short[] sArr, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxByOrNull");
        l0.p(lVar, "selector");
        if (q2.u(sArr)) {
            return null;
        }
        short p10 = q2.p(sArr, 0);
        int Ye = be.p.Ye(sArr);
        if (Ye == 0) {
            return p2.b(p10);
        }
        Comparable comparable = (Comparable) lVar.A(p2.b(p10));
        s0 o10 = new m(1, Ye).iterator();
        while (o10.hasNext()) {
            short p11 = q2.p(sArr, o10.nextInt());
            Comparable comparable2 = (Comparable) lVar.A(p2.b(p11));
            if (comparable.compareTo(comparable2) < 0) {
                p10 = p11;
                comparable = comparable2;
            }
        }
        return p2.b(p10);
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "maxWithOrThrow-U")
    public static final short R6(@g short[] sArr, @g Comparator<? super p2> comparator) {
        l0.p(sArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        if (!q2.u(sArr)) {
            short p10 = q2.p(sArr, 0);
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                short p11 = q2.p(sArr, o10.nextInt());
                if (comparator.compare(p2.b(p10), p2.b(p11)) < 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @h
    public static final j2 R7(@g long[] jArr, @g Comparator<? super j2> comparator) {
        l0.p(jArr, "$this$minWithOrNull");
        l0.p(comparator, "comparator");
        if (k2.u(jArr)) {
            return null;
        }
        long p10 = k2.p(jArr, 0);
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            long p11 = k2.p(jArr, o10.nextInt());
            if (comparator.compare(j2.b(p10), j2.b(p11)) > 0) {
                p10 = p11;
            }
        }
        return j2.b(p10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short R8(short[] sArr, p<? super p2, ? super p2, p2> pVar) {
        l0.p(sArr, "$this$reduce");
        l0.p(pVar, "operation");
        if (!q2.u(sArr)) {
            short p10 = q2.p(sArr, 0);
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                p10 = pVar.g0(p2.b(p10), p2.b(q2.p(sArr, o10.nextInt()))).j0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super zd.e2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> R9(int[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super zd.e2, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$runningFoldIndexed"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            boolean r0 = zd.f2.u(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.f2.r(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            r1 = 0
            int r2 = zd.f2.r(r5)
        L_0x0028:
            if (r1 >= r2) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r4 = zd.f2.p(r5, r1)
            zd.e2 r4 = zd.e2.b(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.R9(int[], java.lang.Object, we.q):java.util.List");
    }

    @g
    @h1(version = "1.3")
    @t
    public static final byte[] Ra(@g byte[] bArr, @g m mVar) {
        l0.p(bArr, "$this$sliceArray");
        l0.p(mVar, "indices");
        return b2.f(be.p.xu(bArr, mVar));
    }

    @h1(version = "1.3")
    @zd.l(warningSince = "1.5")
    @t
    @f
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double Rb(short[] sArr, l<? super p2, Double> lVar) {
        l0.p(sArr, "$this$sumByDouble");
        l0.p(lVar, "selector");
        int r10 = q2.r(sArr);
        double d10 = 0.0d;
        for (int i10 = 0; i10 < r10; i10++) {
            d10 += lVar.A(p2.b(q2.p(sArr, i10))).doubleValue();
        }
        return d10;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final int[] Rc(@g e2[] e2VarArr) {
        l0.p(e2VarArr, "<this>");
        int length = e2VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = e2VarArr[i10].l0();
        }
        return f2.f(iArr);
    }

    @h1(version = "1.4")
    @t
    public static final boolean S0(@h short[] sArr, @h short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<a2> S1(@g byte[] bArr, int i10) {
        l0.p(bArr, "$this$dropLast");
        if (i10 >= 0) {
            return qc(bArr, v.u(b2.r(bArr) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @h1(version = "1.3")
    @t
    @f
    public static final a2 S2(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$find");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            if (lVar.A(a2.b(p10)).booleanValue()) {
                return a2.b(p10);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super zd.a2, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R S3(byte[] r3, R r4, we.q<? super java.lang.Integer, ? super zd.a2, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "$this$foldRightIndexed"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = be.p.Re(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0023
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            byte r2 = zd.b2.p(r3, r0)
            zd.a2 r2 = zd.a2.b(r2)
            java.lang.Object r4 = r5.y(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.S3(byte[], java.lang.Object, we.q):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int S4(long[] jArr, long j10) {
        l0.p(jArr, "$this$indexOf");
        return be.p.ig(jArr, j10);
    }

    @h1(version = "1.7")
    @t
    @f
    @ve.h(name = "maxByOrThrow-U")
    public static final <R extends Comparable<? super R>> byte S5(byte[] bArr, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (!b2.u(bArr)) {
            byte p10 = b2.p(bArr, 0);
            int Re = be.p.Re(bArr);
            if (Re == 0) {
                return p10;
            }
            Comparable comparable = (Comparable) lVar.A(a2.b(p10));
            s0 o10 = new m(1, Re).iterator();
            while (o10.hasNext()) {
                byte p11 = b2.p(bArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(a2.b(p11));
                if (comparable.compareTo(comparable2) < 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> a2 S6(byte[] bArr, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$minByOrNull");
        l0.p(lVar, "selector");
        if (b2.u(bArr)) {
            return null;
        }
        byte p10 = b2.p(bArr, 0);
        int Re = be.p.Re(bArr);
        if (Re == 0) {
            return a2.b(p10);
        }
        Comparable comparable = (Comparable) lVar.A(a2.b(p10));
        s0 o10 = new m(1, Re).iterator();
        while (o10.hasNext()) {
            byte p11 = b2.p(bArr, o10.nextInt());
            Comparable comparable2 = (Comparable) lVar.A(a2.b(p11));
            if (comparable.compareTo(comparable2) > 0) {
                p10 = p11;
                comparable = comparable2;
            }
        }
        return a2.b(p10);
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "minWithOrThrow-U")
    public static final byte S7(@g byte[] bArr, @g Comparator<? super a2> comparator) {
        l0.p(bArr, "$this$minWith");
        l0.p(comparator, "comparator");
        if (!b2.u(bArr)) {
            byte p10 = b2.p(bArr, 0);
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                byte p11 = b2.p(bArr, o10.nextInt());
                if (comparator.compare(a2.b(p10), a2.b(p11)) > 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int S8(int[] iArr, q<? super Integer, ? super e2, ? super e2, e2> qVar) {
        l0.p(iArr, "$this$reduceIndexed");
        l0.p(qVar, "operation");
        if (!f2.u(iArr)) {
            int p10 = f2.p(iArr, 0);
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                p10 = qVar.y(Integer.valueOf(nextInt), e2.b(p10), e2.b(f2.p(iArr, nextInt))).l0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @t
    @f
    public static final List<a2> S9(byte[] bArr, p<? super a2, ? super a2, a2> pVar) {
        l0.p(bArr, "$this$runningReduce");
        l0.p(pVar, "operation");
        if (b2.u(bArr)) {
            return w.E();
        }
        byte p10 = b2.p(bArr, 0);
        ArrayList arrayList = new ArrayList(b2.r(bArr));
        arrayList.add(a2.b(p10));
        int r10 = b2.r(bArr);
        for (int i10 = 1; i10 < r10; i10++) {
            p10 = pVar.g0(a2.b(p10), a2.b(b2.p(bArr, i10))).j0();
            arrayList.add(a2.b(p10));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final long[] Sa(@g long[] jArr, @g Collection<Integer> collection) {
        l0.p(jArr, "$this$sliceArray");
        l0.p(collection, "indices");
        return k2.f(be.p.Iu(jArr, collection));
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double Sb(byte[] bArr, l<? super a2, Double> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int r10 = b2.r(bArr);
        double d10 = 0.0d;
        for (int i10 = 0; i10 < r10; i10++) {
            d10 += lVar.A(a2.b(b2.p(bArr, i10))).doubleValue();
        }
        return d10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long[] Sc(long[] jArr) {
        l0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return k2.f(copyOf);
    }

    @h1(version = "1.4")
    @t
    public static final boolean T0(@h int[] iArr, @h int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<p2> T1(@g short[] sArr, int i10) {
        l0.p(sArr, "$this$dropLast");
        if (i10 >= 0) {
            return rc(sArr, v.u(q2.r(sArr) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @h1(version = "1.3")
    @t
    @f
    public static final j2 T2(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$find");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            if (lVar.A(j2.b(p10)).booleanValue()) {
                return j2.b(p10);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super zd.p2, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R T3(short[] r3, R r4, we.q<? super java.lang.Integer, ? super zd.p2, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "$this$foldRightIndexed"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = be.p.Ye(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0023
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            short r2 = zd.q2.p(r3, r0)
            zd.p2 r2 = zd.p2.b(r2)
            java.lang.Object r4 = r5.y(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.T3(short[], java.lang.Object, we.q):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int T4(short[] sArr, short s10) {
        l0.p(sArr, "$this$indexOf");
        return be.p.kg(sArr, s10);
    }

    @h1(version = "1.7")
    @t
    @f
    @ve.h(name = "maxByOrThrow-U")
    public static final <R extends Comparable<? super R>> int T5(int[] iArr, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (!f2.u(iArr)) {
            int p10 = f2.p(iArr, 0);
            int Ve = be.p.Ve(iArr);
            if (Ve == 0) {
                return p10;
            }
            Comparable comparable = (Comparable) lVar.A(e2.b(p10));
            s0 o10 = new m(1, Ve).iterator();
            while (o10.hasNext()) {
                int p11 = f2.p(iArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(e2.b(p11));
                if (comparable.compareTo(comparable2) < 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> j2 T6(long[] jArr, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$minByOrNull");
        l0.p(lVar, "selector");
        if (k2.u(jArr)) {
            return null;
        }
        long p10 = k2.p(jArr, 0);
        int We = be.p.We(jArr);
        if (We == 0) {
            return j2.b(p10);
        }
        Comparable comparable = (Comparable) lVar.A(j2.b(p10));
        s0 o10 = new m(1, We).iterator();
        while (o10.hasNext()) {
            long p11 = k2.p(jArr, o10.nextInt());
            Comparable comparable2 = (Comparable) lVar.A(j2.b(p11));
            if (comparable.compareTo(comparable2) > 0) {
                p10 = p11;
                comparable = comparable2;
            }
        }
        return j2.b(p10);
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "minWithOrThrow-U")
    public static final int T7(@g int[] iArr, @g Comparator<? super e2> comparator) {
        l0.p(iArr, "$this$minWith");
        l0.p(comparator, "comparator");
        if (!f2.u(iArr)) {
            int p10 = f2.p(iArr, 0);
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                int p11 = f2.p(iArr, o10.nextInt());
                if (comparator.compare(e2.b(p10), e2.b(p11)) > 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte T8(byte[] bArr, q<? super Integer, ? super a2, ? super a2, a2> qVar) {
        l0.p(bArr, "$this$reduceIndexed");
        l0.p(qVar, "operation");
        if (!b2.u(bArr)) {
            byte p10 = b2.p(bArr, 0);
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                p10 = qVar.y(Integer.valueOf(nextInt), a2.b(p10), a2.b(b2.p(bArr, nextInt))).j0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @t
    @f
    public static final List<e2> T9(int[] iArr, p<? super e2, ? super e2, e2> pVar) {
        l0.p(iArr, "$this$runningReduce");
        l0.p(pVar, "operation");
        if (f2.u(iArr)) {
            return w.E();
        }
        int p10 = f2.p(iArr, 0);
        ArrayList arrayList = new ArrayList(f2.r(iArr));
        arrayList.add(e2.b(p10));
        int r10 = f2.r(iArr);
        for (int i10 = 1; i10 < r10; i10++) {
            p10 = pVar.g0(e2.b(p10), e2.b(f2.p(iArr, i10))).l0();
            arrayList.add(e2.b(p10));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final short[] Ta(@g short[] sArr, @g Collection<Integer> collection) {
        l0.p(sArr, "$this$sliceArray");
        l0.p(collection, "indices");
        return q2.f(be.p.Mu(sArr, collection));
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double Tb(int[] iArr, l<? super e2, Double> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int r10 = f2.r(iArr);
        double d10 = 0.0d;
        for (int i10 = 0; i10 < r10; i10++) {
            d10 += lVar.A(e2.b(f2.p(iArr, i10))).doubleValue();
        }
        return d10;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final long[] Tc(@g j2[] j2VarArr) {
        l0.p(j2VarArr, "<this>");
        int length = j2VarArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = j2VarArr[i10].l0();
        }
        return k2.f(jArr);
    }

    @h1(version = "1.3")
    @zd.l(hiddenSince = "1.4")
    @t
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean U0(int[] iArr, int[] iArr2) {
        l0.p(iArr, "$this$contentEquals");
        l0.p(iArr2, "other");
        return T0(iArr, iArr2);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<e2> U1(@g int[] iArr, int i10) {
        l0.p(iArr, "$this$dropLast");
        if (i10 >= 0) {
            return sc(iArr, v.u(f2.r(iArr) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @h1(version = "1.3")
    @t
    @f
    public static final e2 U2(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$find");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            if (lVar.A(e2.b(p10)).booleanValue()) {
                return e2.b(p10);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.q, we.q<? super java.lang.Integer, ? super zd.j2, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R U3(long[] r4, R r5, we.q<? super java.lang.Integer, ? super zd.j2, ? super R, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$foldRightIndexed"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = be.p.We(r4)
        L_0x000e:
            if (r0 < 0) goto L_0x0023
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            long r2 = zd.k2.p(r4, r0)
            zd.j2 r2 = zd.j2.b(r2)
            java.lang.Object r5 = r6.y(r1, r2, r5)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.U3(long[], java.lang.Object, we.q):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int U4(byte[] bArr, byte b10) {
        l0.p(bArr, "$this$indexOf");
        return be.p.dg(bArr, b10);
    }

    @h1(version = "1.7")
    @t
    @f
    @ve.h(name = "maxByOrThrow-U")
    public static final <R extends Comparable<? super R>> long U5(long[] jArr, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (!k2.u(jArr)) {
            long p10 = k2.p(jArr, 0);
            int We = be.p.We(jArr);
            if (We == 0) {
                return p10;
            }
            Comparable comparable = (Comparable) lVar.A(j2.b(p10));
            s0 o10 = new m(1, We).iterator();
            while (o10.hasNext()) {
                long p11 = k2.p(jArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(j2.b(p11));
                if (comparable.compareTo(comparable2) < 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> e2 U6(int[] iArr, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$minByOrNull");
        l0.p(lVar, "selector");
        if (f2.u(iArr)) {
            return null;
        }
        int p10 = f2.p(iArr, 0);
        int Ve = be.p.Ve(iArr);
        if (Ve == 0) {
            return e2.b(p10);
        }
        Comparable comparable = (Comparable) lVar.A(e2.b(p10));
        s0 o10 = new m(1, Ve).iterator();
        while (o10.hasNext()) {
            int p11 = f2.p(iArr, o10.nextInt());
            Comparable comparable2 = (Comparable) lVar.A(e2.b(p11));
            if (comparable.compareTo(comparable2) > 0) {
                p10 = p11;
                comparable = comparable2;
            }
        }
        return e2.b(p10);
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "minWithOrThrow-U")
    public static final long U7(@g long[] jArr, @g Comparator<? super j2> comparator) {
        l0.p(jArr, "$this$minWith");
        l0.p(comparator, "comparator");
        if (!k2.u(jArr)) {
            long p10 = k2.p(jArr, 0);
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                long p11 = k2.p(jArr, o10.nextInt());
                if (comparator.compare(j2.b(p10), j2.b(p11)) > 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short U8(short[] sArr, q<? super Integer, ? super p2, ? super p2, p2> qVar) {
        l0.p(sArr, "$this$reduceIndexed");
        l0.p(qVar, "operation");
        if (!q2.u(sArr)) {
            short p10 = q2.p(sArr, 0);
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                p10 = qVar.y(Integer.valueOf(nextInt), p2.b(p10), p2.b(q2.p(sArr, nextInt))).j0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @t
    @f
    public static final List<j2> U9(long[] jArr, p<? super j2, ? super j2, j2> pVar) {
        l0.p(jArr, "$this$runningReduce");
        l0.p(pVar, "operation");
        if (k2.u(jArr)) {
            return w.E();
        }
        long p10 = k2.p(jArr, 0);
        ArrayList arrayList = new ArrayList(k2.r(jArr));
        arrayList.add(j2.b(p10));
        int r10 = k2.r(jArr);
        for (int i10 = 1; i10 < r10; i10++) {
            p10 = pVar.g0(j2.b(p10), j2.b(k2.p(jArr, i10))).l0();
            arrayList.add(j2.b(p10));
        }
        return arrayList;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final int[] Ua(@g int[] iArr, @g m mVar) {
        l0.p(iArr, "$this$sliceArray");
        l0.p(mVar, "indices");
        return f2.f(be.p.Fu(iArr, mVar));
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double Ub(long[] jArr, l<? super j2, Double> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int r10 = k2.r(jArr);
        double d10 = 0.0d;
        for (int i10 = 0; i10 < r10; i10++) {
            d10 += lVar.A(j2.b(k2.p(jArr, i10))).doubleValue();
        }
        return d10;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final short[] Uc(@g p2[] p2VarArr) {
        l0.p(p2VarArr, "<this>");
        int length = p2VarArr.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = p2VarArr[i10].j0();
        }
        return q2.f(sArr);
    }

    @h1(version = "1.4")
    @t
    public static final boolean V0(@h byte[] bArr, @h byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<j2> V1(@g long[] jArr, int i10) {
        l0.p(jArr, "$this$dropLast");
        if (i10 >= 0) {
            return tc(jArr, v.u(k2.r(jArr) - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @h1(version = "1.3")
    @t
    @f
    public static final p2 V2(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$find");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            if (lVar.A(p2.b(p10)).booleanValue()) {
                return p2.b(p10);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super zd.e2, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @zd.t
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R V3(int[] r3, R r4, we.q<? super java.lang.Integer, ? super zd.e2, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "$this$foldRightIndexed"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = be.p.Ve(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0023
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r2 = zd.f2.p(r3, r0)
            zd.e2 r2 = zd.e2.b(r2)
            java.lang.Object r4 = r5.y(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.V3(int[], java.lang.Object, we.q):java.lang.Object");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int V4(int[] iArr, int i10) {
        l0.p(iArr, "$this$indexOf");
        return be.p.hg(iArr, i10);
    }

    @h1(version = "1.7")
    @t
    @f
    @ve.h(name = "maxByOrThrow-U")
    public static final <R extends Comparable<? super R>> short V5(short[] sArr, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (!q2.u(sArr)) {
            short p10 = q2.p(sArr, 0);
            int Ye = be.p.Ye(sArr);
            if (Ye == 0) {
                return p10;
            }
            Comparable comparable = (Comparable) lVar.A(p2.b(p10));
            s0 o10 = new m(1, Ye).iterator();
            while (o10.hasNext()) {
                short p11 = q2.p(sArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(p2.b(p11));
                if (comparable.compareTo(comparable2) < 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> p2 V6(short[] sArr, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$minByOrNull");
        l0.p(lVar, "selector");
        if (q2.u(sArr)) {
            return null;
        }
        short p10 = q2.p(sArr, 0);
        int Ye = be.p.Ye(sArr);
        if (Ye == 0) {
            return p2.b(p10);
        }
        Comparable comparable = (Comparable) lVar.A(p2.b(p10));
        s0 o10 = new m(1, Ye).iterator();
        while (o10.hasNext()) {
            short p11 = q2.p(sArr, o10.nextInt());
            Comparable comparable2 = (Comparable) lVar.A(p2.b(p11));
            if (comparable.compareTo(comparable2) > 0) {
                p10 = p11;
                comparable = comparable2;
            }
        }
        return p2.b(p10);
    }

    @h1(version = "1.7")
    @t
    @ve.h(name = "minWithOrThrow-U")
    public static final short V7(@g short[] sArr, @g Comparator<? super p2> comparator) {
        l0.p(sArr, "$this$minWith");
        l0.p(comparator, "comparator");
        if (!q2.u(sArr)) {
            short p10 = q2.p(sArr, 0);
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                short p11 = q2.p(sArr, o10.nextInt());
                if (comparator.compare(p2.b(p10), p2.b(p11)) > 0) {
                    p10 = p11;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long V8(long[] jArr, q<? super Integer, ? super j2, ? super j2, j2> qVar) {
        l0.p(jArr, "$this$reduceIndexed");
        l0.p(qVar, "operation");
        if (!k2.u(jArr)) {
            long p10 = k2.p(jArr, 0);
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                p10 = qVar.y(Integer.valueOf(nextInt), j2.b(p10), j2.b(k2.p(jArr, nextInt))).l0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @t
    @f
    public static final List<p2> V9(short[] sArr, p<? super p2, ? super p2, p2> pVar) {
        l0.p(sArr, "$this$runningReduce");
        l0.p(pVar, "operation");
        if (q2.u(sArr)) {
            return w.E();
        }
        short p10 = q2.p(sArr, 0);
        ArrayList arrayList = new ArrayList(q2.r(sArr));
        arrayList.add(p2.b(p10));
        int r10 = q2.r(sArr);
        for (int i10 = 1; i10 < r10; i10++) {
            p10 = pVar.g0(p2.b(p10), p2.b(q2.p(sArr, i10))).j0();
            arrayList.add(p2.b(p10));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final byte[] Va(@g byte[] bArr, @g Collection<Integer> collection) {
        l0.p(bArr, "$this$sliceArray");
        l0.p(collection, "indices");
        return b2.f(be.p.yu(bArr, collection));
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double Vb(short[] sArr, l<? super p2, Double> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int r10 = q2.r(sArr);
        double d10 = 0.0d;
        for (int i10 = 0; i10 < r10; i10++) {
            d10 += lVar.A(p2.b(q2.p(sArr, i10))).doubleValue();
        }
        return d10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short[] Vc(short[] sArr) {
        l0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return q2.f(copyOf);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean W(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$all");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            if (!lVar.A(a2.b(b2.p(bArr, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.3")
    @zd.l(hiddenSince = "1.4")
    @t
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean W0(byte[] bArr, byte[] bArr2) {
        l0.p(bArr, "$this$contentEquals");
        l0.p(bArr2, "other");
        return V0(bArr, bArr2);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<a2> W1(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$dropLastWhile");
        l0.p(lVar, "predicate");
        for (int Re = be.p.Re(bArr); -1 < Re; Re--) {
            if (!lVar.A(a2.b(b2.p(bArr, Re))).booleanValue()) {
                return qc(bArr, Re + 1);
            }
        }
        return w.E();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final a2 W2(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$findLast");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr) - 1;
        if (r10 >= 0) {
            while (true) {
                int i10 = r10 - 1;
                byte p10 = b2.p(bArr, r10);
                if (lVar.A(a2.b(p10)).booleanValue()) {
                    return a2.b(p10);
                }
                if (i10 < 0) {
                    break;
                }
                r10 = i10;
            }
        }
        return null;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final void W3(byte[] bArr, l<? super a2, u2> lVar) {
        l0.p(bArr, "$this$forEach");
        l0.p(lVar, "action");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            lVar.A(a2.b(b2.p(bArr, i10)));
        }
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int W4(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$indexOfFirst");
        l0.p(lVar, "predicate");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(a2.b(a2.l(bArr[i10]))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final double W5(byte[] bArr, l<? super a2, Double> lVar) {
        l0.p(bArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (!b2.u(bArr)) {
            double doubleValue = lVar.A(a2.b(b2.p(bArr, 0))).doubleValue();
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(a2.b(b2.p(bArr, o10.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.7")
    @t
    @f
    @ve.h(name = "minByOrThrow-U")
    public static final <R extends Comparable<? super R>> byte W6(byte[] bArr, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (!b2.u(bArr)) {
            byte p10 = b2.p(bArr, 0);
            int Re = be.p.Re(bArr);
            if (Re == 0) {
                return p10;
            }
            Comparable comparable = (Comparable) lVar.A(a2.b(p10));
            s0 o10 = new m(1, Re).iterator();
            while (o10.hasNext()) {
                byte p11 = b2.p(bArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(a2.b(p11));
                if (comparable.compareTo(comparable2) > 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean W7(int[] iArr) {
        l0.p(iArr, "$this$none");
        return f2.u(iArr);
    }

    @h1(version = "1.4")
    @t
    @f
    public static final e2 W8(int[] iArr, q<? super Integer, ? super e2, ? super e2, e2> qVar) {
        l0.p(iArr, "$this$reduceIndexedOrNull");
        l0.p(qVar, "operation");
        if (f2.u(iArr)) {
            return null;
        }
        int p10 = f2.p(iArr, 0);
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            p10 = qVar.y(Integer.valueOf(nextInt), e2.b(p10), e2.b(f2.p(iArr, nextInt))).l0();
        }
        return e2.b(p10);
    }

    @h1(version = "1.4")
    @t
    @f
    public static final List<e2> W9(int[] iArr, q<? super Integer, ? super e2, ? super e2, e2> qVar) {
        l0.p(iArr, "$this$runningReduceIndexed");
        l0.p(qVar, "operation");
        if (f2.u(iArr)) {
            return w.E();
        }
        int p10 = f2.p(iArr, 0);
        ArrayList arrayList = new ArrayList(f2.r(iArr));
        arrayList.add(e2.b(p10));
        int r10 = f2.r(iArr);
        for (int i10 = 1; i10 < r10; i10++) {
            p10 = qVar.y(Integer.valueOf(i10), e2.b(p10), e2.b(f2.p(iArr, i10))).l0();
            arrayList.add(e2.b(p10));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    public static final void Wa(@g int[] iArr) {
        l0.p(iArr, "$this$sort");
        if (f2.r(iArr) > 1) {
            r1.l(iArr, 0, f2.r(iArr));
        }
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int Wb(byte[] bArr, l<? super a2, Integer> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int r10 = b2.r(bArr);
        int i10 = 0;
        for (int i11 = 0; i11 < r10; i11++) {
            i10 += lVar.A(a2.b(b2.p(bArr, i11))).intValue();
        }
        return i10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final Iterable<p0<e2>> Wc(@g int[] iArr) {
        l0.p(iArr, "$this$withIndex");
        return new q0(new a(iArr));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean X(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$all");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            if (!lVar.A(j2.b(k2.p(jArr, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.4")
    @t
    public static final boolean X0(@h long[] jArr, @h long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<j2> X1(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$dropLastWhile");
        l0.p(lVar, "predicate");
        for (int We = be.p.We(jArr); -1 < We; We--) {
            if (!lVar.A(j2.b(k2.p(jArr, We))).booleanValue()) {
                return tc(jArr, We + 1);
            }
        }
        return w.E();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final j2 X2(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$findLast");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr) - 1;
        if (r10 >= 0) {
            while (true) {
                int i10 = r10 - 1;
                long p10 = k2.p(jArr, r10);
                if (lVar.A(j2.b(p10)).booleanValue()) {
                    return j2.b(p10);
                }
                if (i10 < 0) {
                    break;
                }
                r10 = i10;
            }
        }
        return null;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final void X3(long[] jArr, l<? super j2, u2> lVar) {
        l0.p(jArr, "$this$forEach");
        l0.p(lVar, "action");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            lVar.A(j2.b(k2.p(jArr, i10)));
        }
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int X4(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$indexOfFirst");
        l0.p(lVar, "predicate");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(j2.b(j2.l(jArr[i10]))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final float X5(byte[] bArr, l<? super a2, Float> lVar) {
        l0.p(bArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (!b2.u(bArr)) {
            float floatValue = lVar.A(a2.b(b2.p(bArr, 0))).floatValue();
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(a2.b(b2.p(bArr, o10.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.7")
    @t
    @f
    @ve.h(name = "minByOrThrow-U")
    public static final <R extends Comparable<? super R>> int X6(int[] iArr, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (!f2.u(iArr)) {
            int p10 = f2.p(iArr, 0);
            int Ve = be.p.Ve(iArr);
            if (Ve == 0) {
                return p10;
            }
            Comparable comparable = (Comparable) lVar.A(e2.b(p10));
            s0 o10 = new m(1, Ve).iterator();
            while (o10.hasNext()) {
                int p11 = f2.p(iArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(e2.b(p11));
                if (comparable.compareTo(comparable2) > 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean X7(byte[] bArr) {
        l0.p(bArr, "$this$none");
        return b2.u(bArr);
    }

    @h1(version = "1.4")
    @t
    @f
    public static final a2 X8(byte[] bArr, q<? super Integer, ? super a2, ? super a2, a2> qVar) {
        l0.p(bArr, "$this$reduceIndexedOrNull");
        l0.p(qVar, "operation");
        if (b2.u(bArr)) {
            return null;
        }
        byte p10 = b2.p(bArr, 0);
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            p10 = qVar.y(Integer.valueOf(nextInt), a2.b(p10), a2.b(b2.p(bArr, nextInt))).j0();
        }
        return a2.b(p10);
    }

    @h1(version = "1.4")
    @t
    @f
    public static final List<a2> X9(byte[] bArr, q<? super Integer, ? super a2, ? super a2, a2> qVar) {
        l0.p(bArr, "$this$runningReduceIndexed");
        l0.p(qVar, "operation");
        if (b2.u(bArr)) {
            return w.E();
        }
        byte p10 = b2.p(bArr, 0);
        ArrayList arrayList = new ArrayList(b2.r(bArr));
        arrayList.add(a2.b(p10));
        int r10 = b2.r(bArr);
        for (int i10 = 1; i10 < r10; i10++) {
            p10 = qVar.y(Integer.valueOf(i10), a2.b(p10), a2.b(b2.p(bArr, i10))).j0();
            arrayList.add(a2.b(p10));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    public static final void Xa(@g long[] jArr, int i10, int i11) {
        l0.p(jArr, "$this$sort");
        be.c.O.d(i10, i11, k2.r(jArr));
        r1.i(jArr, i10, i11);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int Xb(int[] iArr, l<? super e2, Integer> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int r10 = f2.r(iArr);
        int i10 = 0;
        for (int i11 = 0; i11 < r10; i11++) {
            i10 += lVar.A(e2.b(f2.p(iArr, i11))).intValue();
        }
        return i10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final Iterable<p0<a2>> Xc(@g byte[] bArr) {
        l0.p(bArr, "$this$withIndex");
        return new q0(new C0299c(bArr));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean Y(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$all");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            if (!lVar.A(e2.b(f2.p(iArr, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.3")
    @zd.l(hiddenSince = "1.4")
    @t
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean Y0(short[] sArr, short[] sArr2) {
        l0.p(sArr, "$this$contentEquals");
        l0.p(sArr2, "other");
        return S0(sArr, sArr2);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<e2> Y1(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$dropLastWhile");
        l0.p(lVar, "predicate");
        for (int Ve = be.p.Ve(iArr); -1 < Ve; Ve--) {
            if (!lVar.A(e2.b(f2.p(iArr, Ve))).booleanValue()) {
                return sc(iArr, Ve + 1);
            }
        }
        return w.E();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final e2 Y2(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$findLast");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr) - 1;
        if (r10 >= 0) {
            while (true) {
                int i10 = r10 - 1;
                int p10 = f2.p(iArr, r10);
                if (lVar.A(e2.b(p10)).booleanValue()) {
                    return e2.b(p10);
                }
                if (i10 < 0) {
                    break;
                }
                r10 = i10;
            }
        }
        return null;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final void Y3(int[] iArr, l<? super e2, u2> lVar) {
        l0.p(iArr, "$this$forEach");
        l0.p(lVar, "action");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            lVar.A(e2.b(f2.p(iArr, i10)));
        }
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int Y4(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$indexOfFirst");
        l0.p(lVar, "predicate");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(e2.b(e2.l(iArr[i10]))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R Y5(byte[] bArr, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (!b2.u(bArr)) {
            R r10 = (Comparable) lVar.A(a2.b(b2.p(bArr, 0)));
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(a2.b(b2.p(bArr, o10.nextInt())));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.7")
    @t
    @f
    @ve.h(name = "minByOrThrow-U")
    public static final <R extends Comparable<? super R>> long Y6(long[] jArr, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (!k2.u(jArr)) {
            long p10 = k2.p(jArr, 0);
            int We = be.p.We(jArr);
            if (We == 0) {
                return p10;
            }
            Comparable comparable = (Comparable) lVar.A(j2.b(p10));
            s0 o10 = new m(1, We).iterator();
            while (o10.hasNext()) {
                long p11 = k2.p(jArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(j2.b(p11));
                if (comparable.compareTo(comparable2) > 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean Y7(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$none");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            if (lVar.A(a2.b(b2.p(bArr, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final p2 Y8(short[] sArr, q<? super Integer, ? super p2, ? super p2, p2> qVar) {
        l0.p(sArr, "$this$reduceIndexedOrNull");
        l0.p(qVar, "operation");
        if (q2.u(sArr)) {
            return null;
        }
        short p10 = q2.p(sArr, 0);
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            p10 = qVar.y(Integer.valueOf(nextInt), p2.b(p10), p2.b(q2.p(sArr, nextInt))).j0();
        }
        return p2.b(p10);
    }

    @h1(version = "1.4")
    @t
    @f
    public static final List<p2> Y9(short[] sArr, q<? super Integer, ? super p2, ? super p2, p2> qVar) {
        l0.p(sArr, "$this$runningReduceIndexed");
        l0.p(qVar, "operation");
        if (q2.u(sArr)) {
            return w.E();
        }
        short p10 = q2.p(sArr, 0);
        ArrayList arrayList = new ArrayList(q2.r(sArr));
        arrayList.add(p2.b(p10));
        int r10 = q2.r(sArr);
        for (int i10 = 1; i10 < r10; i10++) {
            p10 = qVar.y(Integer.valueOf(i10), p2.b(p10), p2.b(q2.p(sArr, i10))).j0();
            arrayList.add(p2.b(p10));
        }
        return arrayList;
    }

    public static /* synthetic */ void Ya(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = k2.r(jArr);
        }
        Xa(jArr, i10, i11);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int Yb(long[] jArr, l<? super j2, Integer> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int r10 = k2.r(jArr);
        int i10 = 0;
        for (int i11 = 0; i11 < r10; i11++) {
            i10 += lVar.A(j2.b(k2.p(jArr, i11))).intValue();
        }
        return i10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final Iterable<p0<j2>> Yc(@g long[] jArr) {
        l0.p(jArr, "$this$withIndex");
        return new q0(new b(jArr));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean Z(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$all");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            if (!lVar.A(p2.b(q2.p(sArr, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.3")
    @zd.l(hiddenSince = "1.4")
    @t
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean Z0(long[] jArr, long[] jArr2) {
        l0.p(jArr, "$this$contentEquals");
        l0.p(jArr2, "other");
        return X0(jArr, jArr2);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<p2> Z1(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$dropLastWhile");
        l0.p(lVar, "predicate");
        for (int Ye = be.p.Ye(sArr); -1 < Ye; Ye--) {
            if (!lVar.A(p2.b(q2.p(sArr, Ye))).booleanValue()) {
                return rc(sArr, Ye + 1);
            }
        }
        return w.E();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final p2 Z2(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$findLast");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr) - 1;
        if (r10 >= 0) {
            while (true) {
                int i10 = r10 - 1;
                short p10 = q2.p(sArr, r10);
                if (lVar.A(p2.b(p10)).booleanValue()) {
                    return p2.b(p10);
                }
                if (i10 < 0) {
                    break;
                }
                r10 = i10;
            }
        }
        return null;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final void Z3(short[] sArr, l<? super p2, u2> lVar) {
        l0.p(sArr, "$this$forEach");
        l0.p(lVar, "action");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            lVar.A(p2.b(q2.p(sArr, i10)));
        }
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int Z4(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$indexOfFirst");
        l0.p(lVar, "predicate");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(p2.b(p2.l(sArr[i10]))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final double Z5(long[] jArr, l<? super j2, Double> lVar) {
        l0.p(jArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (!k2.u(jArr)) {
            double doubleValue = lVar.A(j2.b(k2.p(jArr, 0))).doubleValue();
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(j2.b(k2.p(jArr, o10.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.7")
    @t
    @f
    @ve.h(name = "minByOrThrow-U")
    public static final <R extends Comparable<? super R>> short Z6(short[] sArr, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (!q2.u(sArr)) {
            short p10 = q2.p(sArr, 0);
            int Ye = be.p.Ye(sArr);
            if (Ye == 0) {
                return p10;
            }
            Comparable comparable = (Comparable) lVar.A(p2.b(p10));
            s0 o10 = new m(1, Ye).iterator();
            while (o10.hasNext()) {
                short p11 = q2.p(sArr, o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(p2.b(p11));
                if (comparable.compareTo(comparable2) > 0) {
                    p10 = p11;
                    comparable = comparable2;
                }
            }
            return p10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean Z7(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$none");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            if (lVar.A(j2.b(k2.p(jArr, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final j2 Z8(long[] jArr, q<? super Integer, ? super j2, ? super j2, j2> qVar) {
        l0.p(jArr, "$this$reduceIndexedOrNull");
        l0.p(qVar, "operation");
        if (k2.u(jArr)) {
            return null;
        }
        long p10 = k2.p(jArr, 0);
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            p10 = qVar.y(Integer.valueOf(nextInt), j2.b(p10), j2.b(k2.p(jArr, nextInt))).l0();
        }
        return j2.b(p10);
    }

    @h1(version = "1.4")
    @t
    @f
    public static final List<j2> Z9(long[] jArr, q<? super Integer, ? super j2, ? super j2, j2> qVar) {
        l0.p(jArr, "$this$runningReduceIndexed");
        l0.p(qVar, "operation");
        if (k2.u(jArr)) {
            return w.E();
        }
        long p10 = k2.p(jArr, 0);
        ArrayList arrayList = new ArrayList(k2.r(jArr));
        arrayList.add(j2.b(p10));
        int r10 = k2.r(jArr);
        for (int i10 = 1; i10 < r10; i10++) {
            p10 = qVar.y(Integer.valueOf(i10), j2.b(p10), j2.b(k2.p(jArr, i10))).l0();
            arrayList.add(j2.b(p10));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    public static final void Za(@g byte[] bArr, int i10, int i11) {
        l0.p(bArr, "$this$sort");
        be.c.O.d(i10, i11, b2.r(bArr));
        r1.j(bArr, i10, i11);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int Zb(short[] sArr, l<? super p2, Integer> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int r10 = q2.r(sArr);
        int i10 = 0;
        for (int i11 = 0; i11 < r10; i11++) {
            i10 += lVar.A(p2.b(q2.p(sArr, i11))).intValue();
        }
        return i10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final Iterable<p0<p2>> Zc(@g short[] sArr) {
        l0.p(sArr, "$this$withIndex");
        return new q0(new d(sArr));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean a0(int[] iArr) {
        l0.p(iArr, "$this$any");
        return be.p.M5(iArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<a2> a2(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$dropWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = b2.r(bArr);
        boolean z10 = false;
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            if (z10) {
                arrayList.add(a2.b(p10));
            } else if (!lVar.A(a2.b(p10)).booleanValue()) {
                arrayList.add(a2.b(p10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int a3(int[] iArr) {
        l0.p(iArr, "$this$first");
        return e2.l(be.p.oc(iArr));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final void a4(byte[] bArr, p<? super Integer, ? super a2, u2> pVar) {
        l0.p(bArr, "$this$forEachIndexed");
        l0.p(pVar, "action");
        int r10 = b2.r(bArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            pVar.g0(Integer.valueOf(i11), a2.b(b2.p(bArr, i10)));
            i10++;
            i11++;
        }
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int a5(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$indexOfLast");
        l0.p(lVar, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i10 = length - 1;
            if (lVar.A(a2.b(a2.l(bArr[length]))).booleanValue()) {
                return length;
            }
            if (i10 < 0) {
                return -1;
            }
            length = i10;
        }
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final float a6(long[] jArr, l<? super j2, Float> lVar) {
        l0.p(jArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (!k2.u(jArr)) {
            float floatValue = lVar.A(j2.b(k2.p(jArr, 0))).floatValue();
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(j2.b(k2.p(jArr, o10.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final double a7(byte[] bArr, l<? super a2, Double> lVar) {
        l0.p(bArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (!b2.u(bArr)) {
            double doubleValue = lVar.A(a2.b(b2.p(bArr, 0))).doubleValue();
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(a2.b(b2.p(bArr, o10.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean a8(long[] jArr) {
        l0.p(jArr, "$this$none");
        return k2.u(jArr);
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @f
    public static final a2 a9(byte[] bArr, p<? super a2, ? super a2, a2> pVar) {
        l0.p(bArr, "$this$reduceOrNull");
        l0.p(pVar, "operation");
        if (b2.u(bArr)) {
            return null;
        }
        byte p10 = b2.p(bArr, 0);
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            p10 = pVar.g0(a2.b(p10), a2.b(b2.p(bArr, o10.nextInt()))).j0();
        }
        return a2.b(p10);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.p, we.p<? super R, ? super zd.j2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> aa(long[] r5, R r6, we.p<? super R, ? super zd.j2, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$scan"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            boolean r0 = zd.k2.u(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = be.v.k(r6)
            goto L_0x003d
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.k2.r(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            r1 = 0
            int r2 = zd.k2.r(r5)
        L_0x0028:
            if (r1 >= r2) goto L_0x003c
            long r3 = zd.k2.p(r5, r1)
            zd.j2 r3 = zd.j2.b(r3)
            java.lang.Object r6 = r7.g0(r6, r3)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003c:
            r5 = r0
        L_0x003d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.aa(long[], java.lang.Object, we.p):java.util.List");
    }

    public static /* synthetic */ void ab(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = b2.r(bArr);
        }
        Za(bArr, i10, i11);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long ac(byte[] bArr, l<? super a2, Long> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int r10 = b2.r(bArr);
        long j10 = 0;
        for (int i10 = 0; i10 < r10; i10++) {
            j10 += lVar.A(a2.b(b2.p(bArr, i10))).longValue();
        }
        return j10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> ad(int[] iArr, Iterable<? extends R> iterable, p<? super e2, ? super R, ? extends V> pVar) {
        l0.p(iArr, "$this$zip");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int r10 = f2.r(iArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), r10));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= r10) {
                break;
            }
            arrayList.add(pVar.g0(e2.b(f2.p(iArr, i10)), next));
            i10++;
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean b0(byte[] bArr) {
        l0.p(bArr, "$this$any");
        return be.p.E5(bArr);
    }

    @h1(version = "1.4")
    @t
    public static final int b1(@h byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<j2> b2(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$dropWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = k2.r(jArr);
        boolean z10 = false;
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            if (z10) {
                arrayList.add(j2.b(p10));
            } else if (!lVar.A(j2.b(p10)).booleanValue()) {
                arrayList.add(j2.b(p10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte b3(byte[] bArr) {
        l0.p(bArr, "$this$first");
        return a2.l(be.p.gc(bArr));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final void b4(int[] iArr, p<? super Integer, ? super e2, u2> pVar) {
        l0.p(iArr, "$this$forEachIndexed");
        l0.p(pVar, "action");
        int r10 = f2.r(iArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            pVar.g0(Integer.valueOf(i11), e2.b(f2.p(iArr, i10)));
            i10++;
            i11++;
        }
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int b5(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$indexOfLast");
        l0.p(lVar, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i10 = length - 1;
            if (lVar.A(j2.b(j2.l(jArr[length]))).booleanValue()) {
                return length;
            }
            if (i10 < 0) {
                return -1;
            }
            length = i10;
        }
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R b6(long[] jArr, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (!k2.u(jArr)) {
            R r10 = (Comparable) lVar.A(j2.b(k2.p(jArr, 0)));
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(j2.b(k2.p(jArr, o10.nextInt())));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final float b7(byte[] bArr, l<? super a2, Float> lVar) {
        l0.p(bArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (!b2.u(bArr)) {
            float floatValue = lVar.A(a2.b(b2.p(bArr, 0))).floatValue();
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(a2.b(b2.p(bArr, o10.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean b8(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$none");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            if (lVar.A(e2.b(f2.p(iArr, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @f
    public static final e2 b9(int[] iArr, p<? super e2, ? super e2, e2> pVar) {
        l0.p(iArr, "$this$reduceOrNull");
        l0.p(pVar, "operation");
        if (f2.u(iArr)) {
            return null;
        }
        int p10 = f2.p(iArr, 0);
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            p10 = pVar.g0(e2.b(p10), e2.b(f2.p(iArr, o10.nextInt()))).l0();
        }
        return e2.b(p10);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super zd.a2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> ba(byte[] r4, R r5, we.p<? super R, ? super zd.a2, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$scan"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            boolean r0 = zd.b2.u(r4)
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = be.v.k(r5)
            goto L_0x003d
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.b2.r(r4)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r5)
            r1 = 0
            int r2 = zd.b2.r(r4)
        L_0x0028:
            if (r1 >= r2) goto L_0x003c
            byte r3 = zd.b2.p(r4, r1)
            zd.a2 r3 = zd.a2.b(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003c:
            r4 = r0
        L_0x003d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.ba(byte[], java.lang.Object, we.p):java.util.List");
    }

    @h1(version = "1.4")
    @t
    public static final void bb(@g short[] sArr, int i10, int i11) {
        l0.p(sArr, "$this$sort");
        be.c.O.d(i10, i11, q2.r(sArr));
        r1.k(sArr, i10, i11);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long bc(int[] iArr, l<? super e2, Long> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int r10 = f2.r(iArr);
        long j10 = 0;
        for (int i10 = 0; i10 < r10; i10++) {
            j10 += lVar.A(e2.b(f2.p(iArr, i10))).longValue();
        }
        return j10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> bd(long[] jArr, R[] rArr, p<? super j2, ? super R, ? extends V> pVar) {
        l0.p(jArr, "$this$zip");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(k2.r(jArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(j2.b(k2.p(jArr, i10)), rArr[i10]));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean c0(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$any");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            if (lVar.A(a2.b(b2.p(bArr, i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<e2> c2(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$dropWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = f2.r(iArr);
        boolean z10 = false;
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            if (z10) {
                arrayList.add(e2.b(p10));
            } else if (!lVar.A(e2.b(p10)).booleanValue()) {
                arrayList.add(e2.b(p10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte c3(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$first");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            if (lVar.A(a2.b(p10)).booleanValue()) {
                return p10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final void c4(long[] jArr, p<? super Integer, ? super j2, u2> pVar) {
        l0.p(jArr, "$this$forEachIndexed");
        l0.p(pVar, "action");
        int r10 = k2.r(jArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            pVar.g0(Integer.valueOf(i11), j2.b(k2.p(jArr, i10)));
            i10++;
            i11++;
        }
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int c5(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$indexOfLast");
        l0.p(lVar, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i10 = length - 1;
            if (lVar.A(e2.b(e2.l(iArr[length]))).booleanValue()) {
                return length;
            }
            if (i10 < 0) {
                return -1;
            }
            length = i10;
        }
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final double c6(int[] iArr, l<? super e2, Double> lVar) {
        l0.p(iArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (!f2.u(iArr)) {
            double doubleValue = lVar.A(e2.b(f2.p(iArr, 0))).doubleValue();
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(e2.b(f2.p(iArr, o10.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R c7(byte[] bArr, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (!b2.u(bArr)) {
            R r10 = (Comparable) lVar.A(a2.b(b2.p(bArr, 0)));
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(a2.b(b2.p(bArr, o10.nextInt())));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean c8(short[] sArr) {
        l0.p(sArr, "$this$none");
        return q2.u(sArr);
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @f
    public static final j2 c9(long[] jArr, p<? super j2, ? super j2, j2> pVar) {
        l0.p(jArr, "$this$reduceOrNull");
        l0.p(pVar, "operation");
        if (k2.u(jArr)) {
            return null;
        }
        long p10 = k2.p(jArr, 0);
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            p10 = pVar.g0(j2.b(p10), j2.b(k2.p(jArr, o10.nextInt()))).l0();
        }
        return j2.b(p10);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super zd.e2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> ca(int[] r4, R r5, we.p<? super R, ? super zd.e2, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$scan"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            boolean r0 = zd.f2.u(r4)
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = be.v.k(r5)
            goto L_0x003d
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.f2.r(r4)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r5)
            r1 = 0
            int r2 = zd.f2.r(r4)
        L_0x0028:
            if (r1 >= r2) goto L_0x003c
            int r3 = zd.f2.p(r4, r1)
            zd.e2 r3 = zd.e2.b(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003c:
            r4 = r0
        L_0x003d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.ca(int[], java.lang.Object, we.p):java.util.List");
    }

    public static /* synthetic */ void cb(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = q2.r(sArr);
        }
        bb(sArr, i10, i11);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long cc(long[] jArr, l<? super j2, Long> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int r10 = k2.r(jArr);
        long j10 = 0;
        for (int i10 = 0; i10 < r10; i10++) {
            j10 += lVar.A(j2.b(k2.p(jArr, i10))).longValue();
        }
        return j10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final <R> List<u0<e2, R>> cd(@g int[] iArr, @g R[] rArr) {
        l0.p(iArr, "$this$zip");
        l0.p(rArr, "other");
        int min = Math.min(f2.r(iArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            int p10 = f2.p(iArr, i10);
            arrayList.add(zd.r1.a(e2.b(p10), rArr[i10]));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean d0(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$any");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            if (lVar.A(j2.b(k2.p(jArr, i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<p2> d2(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$dropWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = q2.r(sArr);
        boolean z10 = false;
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            if (z10) {
                arrayList.add(p2.b(p10));
            } else if (!lVar.A(p2.b(p10)).booleanValue()) {
                arrayList.add(p2.b(p10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long d3(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$first");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            if (lVar.A(j2.b(p10)).booleanValue()) {
                return p10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final void d4(short[] sArr, p<? super Integer, ? super p2, u2> pVar) {
        l0.p(sArr, "$this$forEachIndexed");
        l0.p(pVar, "action");
        int r10 = q2.r(sArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            pVar.g0(Integer.valueOf(i11), p2.b(q2.p(sArr, i10)));
            i10++;
            i11++;
        }
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int d5(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$indexOfLast");
        l0.p(lVar, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i10 = length - 1;
            if (lVar.A(p2.b(p2.l(sArr[length]))).booleanValue()) {
                return length;
            }
            if (i10 < 0) {
                return -1;
            }
            length = i10;
        }
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final float d6(int[] iArr, l<? super e2, Float> lVar) {
        l0.p(iArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (!f2.u(iArr)) {
            float floatValue = lVar.A(e2.b(f2.p(iArr, 0))).floatValue();
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(e2.b(f2.p(iArr, o10.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final double d7(long[] jArr, l<? super j2, Double> lVar) {
        l0.p(jArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (!k2.u(jArr)) {
            double doubleValue = lVar.A(j2.b(k2.p(jArr, 0))).doubleValue();
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(j2.b(k2.p(jArr, o10.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean d8(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$none");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            if (lVar.A(p2.b(q2.p(sArr, i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @f
    public static final p2 d9(short[] sArr, p<? super p2, ? super p2, p2> pVar) {
        l0.p(sArr, "$this$reduceOrNull");
        l0.p(pVar, "operation");
        if (q2.u(sArr)) {
            return null;
        }
        short p10 = q2.p(sArr, 0);
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            p10 = pVar.g0(p2.b(p10), p2.b(q2.p(sArr, o10.nextInt()))).j0();
        }
        return p2.b(p10);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super zd.p2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> da(short[] r4, R r5, we.p<? super R, ? super zd.p2, ? extends R> r6) {
        /*
            java.lang.String r0 = "$this$scan"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            boolean r0 = zd.q2.u(r4)
            if (r0 == 0) goto L_0x0015
            java.util.List r4 = be.v.k(r5)
            goto L_0x003d
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.q2.r(r4)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r5)
            r1 = 0
            int r2 = zd.q2.r(r4)
        L_0x0028:
            if (r1 >= r2) goto L_0x003c
            short r3 = zd.q2.p(r4, r1)
            zd.p2 r3 = zd.p2.b(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003c:
            r4 = r0
        L_0x003d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.da(short[], java.lang.Object, we.p):java.util.List");
    }

    @h1(version = "1.3")
    @t
    public static final void db(@g byte[] bArr) {
        l0.p(bArr, "$this$sort");
        if (b2.r(bArr) > 1) {
            r1.j(bArr, 0, b2.r(bArr));
        }
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long dc(short[] sArr, l<? super p2, Long> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int r10 = q2.r(sArr);
        long j10 = 0;
        for (int i10 = 0; i10 < r10; i10++) {
            j10 += lVar.A(p2.b(q2.p(sArr, i10))).longValue();
        }
        return j10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final <R> List<u0<j2, R>> dd(@g long[] jArr, @g Iterable<? extends R> iterable) {
        l0.p(jArr, "$this$zip");
        l0.p(iterable, "other");
        int r10 = k2.r(jArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), r10));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= r10) {
                break;
            }
            arrayList.add(zd.r1.a(j2.b(k2.p(jArr, i10)), next));
            i10++;
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean e0(long[] jArr) {
        l0.p(jArr, "$this$any");
        return be.p.O5(jArr);
    }

    @h1(version = "1.4")
    @t
    public static final int e1(@h int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short e2(short[] sArr, int i10, l<? super Integer, p2> lVar) {
        l0.p(sArr, "$this$elementAtOrElse");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > be.p.Ye(sArr)) ? lVar.A(Integer.valueOf(i10)).j0() : q2.p(sArr, i10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long e3(long[] jArr) {
        l0.p(jArr, "$this$first");
        return j2.l(be.p.qc(jArr));
    }

    @g
    public static final m e4(@g int[] iArr) {
        l0.p(iArr, "$this$indices");
        return be.p.Me(iArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int e5(int[] iArr) {
        l0.p(iArr, "$this$last");
        return e2.l(be.p.Xh(iArr));
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R e6(int[] iArr, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (!f2.u(iArr)) {
            R r10 = (Comparable) lVar.A(e2.b(f2.p(iArr, 0)));
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(e2.b(f2.p(iArr, o10.nextInt())));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final float e7(long[] jArr, l<? super j2, Float> lVar) {
        l0.p(jArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (!k2.u(jArr)) {
            float floatValue = lVar.A(j2.b(k2.p(jArr, 0))).floatValue();
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(j2.b(k2.p(jArr, o10.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    public static final byte[] e8(byte[] bArr, l<? super a2, u2> lVar) {
        l0.p(bArr, "$this$onEach");
        l0.p(lVar, "action");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            lVar.A(a2.b(b2.p(bArr, i10)));
        }
        return bArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte e9(byte[] bArr, p<? super a2, ? super a2, a2> pVar) {
        l0.p(bArr, "$this$reduceRight");
        l0.p(pVar, "operation");
        int Re = be.p.Re(bArr);
        if (Re >= 0) {
            byte p10 = b2.p(bArr, Re);
            for (int i10 = Re - 1; i10 >= 0; i10--) {
                p10 = pVar.g0(a2.b(b2.p(bArr, i10)), a2.b(p10)).j0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super zd.a2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> ea(byte[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super zd.a2, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$scanIndexed"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            boolean r0 = zd.b2.u(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = be.v.k(r6)
            goto L_0x0041
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.b2.r(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            r1 = 0
            int r2 = zd.b2.r(r5)
        L_0x0028:
            if (r1 >= r2) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            byte r4 = zd.b2.p(r5, r1)
            zd.a2 r4 = zd.a2.b(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x0040:
            r5 = r0
        L_0x0041:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.ea(byte[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.3")
    @t
    public static final void eb(@g long[] jArr) {
        l0.p(jArr, "$this$sort");
        if (k2.r(jArr) > 1) {
            r1.i(jArr, 0, k2.r(jArr));
        }
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @ve.h(name = "sumOfUByte")
    public static final int ec(@g a2[] a2VarArr) {
        l0.p(a2VarArr, "<this>");
        int i10 = 0;
        for (a2 j02 : a2VarArr) {
            i10 = e2.l(i10 + e2.l(j02.j0() & 255));
        }
        return i10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final <R> List<u0<e2, R>> ed(@g int[] iArr, @g Iterable<? extends R> iterable) {
        l0.p(iArr, "$this$zip");
        l0.p(iterable, "other");
        int r10 = f2.r(iArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), r10));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= r10) {
                break;
            }
            arrayList.add(zd.r1.a(e2.b(f2.p(iArr, i10)), next));
            i10++;
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean f0(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$any");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            if (lVar.A(e2.b(f2.p(iArr, i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @h1(version = "1.4")
    @t
    public static final int f1(@h short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int f2(int[] iArr, int i10, l<? super Integer, e2> lVar) {
        l0.p(iArr, "$this$elementAtOrElse");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > be.p.Ve(iArr)) ? lVar.A(Integer.valueOf(i10)).l0() : f2.p(iArr, i10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int f3(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$first");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            if (lVar.A(e2.b(p10)).booleanValue()) {
                return p10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.3")
    @t
    public static /* synthetic */ void f4(int[] iArr) {
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte f5(byte[] bArr) {
        l0.p(bArr, "$this$last");
        return a2.l(be.p.Ph(bArr));
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final double f6(short[] sArr, l<? super p2, Double> lVar) {
        l0.p(sArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (!q2.u(sArr)) {
            double doubleValue = lVar.A(p2.b(q2.p(sArr, 0))).doubleValue();
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(p2.b(q2.p(sArr, o10.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R f7(long[] jArr, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (!k2.u(jArr)) {
            R r10 = (Comparable) lVar.A(j2.b(k2.p(jArr, 0)));
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(j2.b(k2.p(jArr, o10.nextInt())));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    public static final long[] f8(long[] jArr, l<? super j2, u2> lVar) {
        l0.p(jArr, "$this$onEach");
        l0.p(lVar, "action");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            lVar.A(j2.b(k2.p(jArr, i10)));
        }
        return jArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int f9(int[] iArr, p<? super e2, ? super e2, e2> pVar) {
        l0.p(iArr, "$this$reduceRight");
        l0.p(pVar, "operation");
        int Ve = be.p.Ve(iArr);
        if (Ve >= 0) {
            int p10 = f2.p(iArr, Ve);
            for (int i10 = Ve - 1; i10 >= 0; i10--) {
                p10 = pVar.g0(e2.b(f2.p(iArr, i10)), e2.b(p10)).l0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super zd.p2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> fa(short[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super zd.p2, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$scanIndexed"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            boolean r0 = zd.q2.u(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = be.v.k(r6)
            goto L_0x0041
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.q2.r(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            r1 = 0
            int r2 = zd.q2.r(r5)
        L_0x0028:
            if (r1 >= r2) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            short r4 = zd.q2.p(r5, r1)
            zd.p2 r4 = zd.p2.b(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x0040:
            r5 = r0
        L_0x0041:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.fa(short[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.4")
    @t
    public static final void fb(@g int[] iArr, int i10, int i11) {
        l0.p(iArr, "$this$sort");
        be.c.O.d(i10, i11, f2.r(iArr));
        r1.l(iArr, i10, i11);
    }

    @t0
    @h1(version = "1.5")
    @t
    @y2(markerClass = {t.class})
    @f
    @ve.h(name = "sumOfUInt")
    public static final int fc(byte[] bArr, l<? super a2, e2> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            l10 = e2.l(l10 + lVar.A(a2.b(b2.p(bArr, i10))).l0());
        }
        return l10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <V> List<V> fd(byte[] bArr, byte[] bArr2, p<? super a2, ? super a2, ? extends V> pVar) {
        l0.p(bArr, "$this$zip");
        l0.p(bArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(b2.r(bArr), b2.r(bArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(a2.b(b2.p(bArr, i10)), a2.b(b2.p(bArr2, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean g0(short[] sArr) {
        l0.p(sArr, "$this$any");
        return be.p.S5(sArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long g2(long[] jArr, int i10, l<? super Integer, j2> lVar) {
        l0.p(jArr, "$this$elementAtOrElse");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > be.p.We(jArr)) ? lVar.A(Integer.valueOf(i10)).l0() : k2.p(jArr, i10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short g3(short[] sArr) {
        l0.p(sArr, "$this$first");
        return p2.l(be.p.uc(sArr));
    }

    @g
    public static final m g4(@g byte[] bArr) {
        l0.p(bArr, "$this$indices");
        return be.p.Ie(bArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte g5(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$last");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr) - 1;
        if (r10 >= 0) {
            while (true) {
                int i10 = r10 - 1;
                byte p10 = b2.p(bArr, r10);
                if (!lVar.A(a2.b(p10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    r10 = i10;
                } else {
                    return p10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final float g6(short[] sArr, l<? super p2, Float> lVar) {
        l0.p(sArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (!q2.u(sArr)) {
            float floatValue = lVar.A(p2.b(q2.p(sArr, 0))).floatValue();
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(p2.b(q2.p(sArr, o10.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final double g7(int[] iArr, l<? super e2, Double> lVar) {
        l0.p(iArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (!f2.u(iArr)) {
            double doubleValue = lVar.A(e2.b(f2.p(iArr, 0))).doubleValue();
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(e2.b(f2.p(iArr, o10.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    public static final int[] g8(int[] iArr, l<? super e2, u2> lVar) {
        l0.p(iArr, "$this$onEach");
        l0.p(lVar, "action");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            lVar.A(e2.b(f2.p(iArr, i10)));
        }
        return iArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long g9(long[] jArr, p<? super j2, ? super j2, j2> pVar) {
        l0.p(jArr, "$this$reduceRight");
        l0.p(pVar, "operation");
        int We = be.p.We(jArr);
        if (We >= 0) {
            long p10 = k2.p(jArr, We);
            for (int i10 = We - 1; i10 >= 0; i10--) {
                p10 = pVar.g0(j2.b(k2.p(jArr, i10)), j2.b(p10)).l0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super zd.j2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> ga(long[] r6, R r7, we.q<? super java.lang.Integer, ? super R, ? super zd.j2, ? extends R> r8) {
        /*
            java.lang.String r0 = "$this$scanIndexed"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r8, r0)
            boolean r0 = zd.k2.u(r6)
            if (r0 == 0) goto L_0x0015
            java.util.List r6 = be.v.k(r7)
            goto L_0x0041
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.k2.r(r6)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r7)
            r1 = 0
            int r2 = zd.k2.r(r6)
        L_0x0028:
            if (r1 >= r2) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            long r4 = zd.k2.p(r6, r1)
            zd.j2 r4 = zd.j2.b(r4)
            java.lang.Object r7 = r8.y(r3, r7, r4)
            r0.add(r7)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x0040:
            r6 = r0
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.ga(long[], java.lang.Object, we.q):java.util.List");
    }

    public static /* synthetic */ void gb(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = f2.r(iArr);
        }
        fb(iArr, i10, i11);
    }

    @t0
    @h1(version = "1.5")
    @t
    @y2(markerClass = {t.class})
    @f
    @ve.h(name = "sumOfUInt")
    public static final int gc(int[] iArr, l<? super e2, e2> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            l10 = e2.l(l10 + lVar.A(e2.b(f2.p(iArr, i10))).l0());
        }
        return l10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final <R> List<u0<p2, R>> gd(@g short[] sArr, @g Iterable<? extends R> iterable) {
        l0.p(sArr, "$this$zip");
        l0.p(iterable, "other");
        int r10 = q2.r(sArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), r10));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= r10) {
                break;
            }
            arrayList.add(zd.r1.a(p2.b(q2.p(sArr, i10)), next));
            i10++;
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final boolean h0(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$any");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            if (lVar.A(p2.b(q2.p(sArr, i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @h1(version = "1.4")
    @t
    public static final int h1(@h long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte h2(byte[] bArr, int i10, l<? super Integer, a2> lVar) {
        l0.p(bArr, "$this$elementAtOrElse");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > be.p.Re(bArr)) ? lVar.A(Integer.valueOf(i10)).j0() : b2.p(bArr, i10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short h3(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$first");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            if (lVar.A(p2.b(p10)).booleanValue()) {
                return p10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.3")
    @t
    public static /* synthetic */ void h4(byte[] bArr) {
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long h5(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$last");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr) - 1;
        if (r10 >= 0) {
            while (true) {
                int i10 = r10 - 1;
                long p10 = k2.p(jArr, r10);
                if (!lVar.A(j2.b(p10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    r10 = i10;
                } else {
                    return p10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R h6(short[] sArr, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (!q2.u(sArr)) {
            R r10 = (Comparable) lVar.A(p2.b(q2.p(sArr, 0)));
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(p2.b(q2.p(sArr, o10.nextInt())));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final float h7(int[] iArr, l<? super e2, Float> lVar) {
        l0.p(iArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (!f2.u(iArr)) {
            float floatValue = lVar.A(e2.b(f2.p(iArr, 0))).floatValue();
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(e2.b(f2.p(iArr, o10.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    public static final short[] h8(short[] sArr, l<? super p2, u2> lVar) {
        l0.p(sArr, "$this$onEach");
        l0.p(lVar, "action");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            lVar.A(p2.b(q2.p(sArr, i10)));
        }
        return sArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short h9(short[] sArr, p<? super p2, ? super p2, p2> pVar) {
        l0.p(sArr, "$this$reduceRight");
        l0.p(pVar, "operation");
        int Ye = be.p.Ye(sArr);
        if (Ye >= 0) {
            short p10 = q2.p(sArr, Ye);
            for (int i10 = Ye - 1; i10 >= 0; i10--) {
                p10 = pVar.g0(p2.b(q2.p(sArr, i10)), p2.b(p10)).j0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super zd.e2, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.t
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> ha(int[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super zd.e2, ? extends R> r7) {
        /*
            java.lang.String r0 = "$this$scanIndexed"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            boolean r0 = zd.f2.u(r5)
            if (r0 == 0) goto L_0x0015
            java.util.List r5 = be.v.k(r6)
            goto L_0x0041
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = zd.f2.r(r5)
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.add(r6)
            r1 = 0
            int r2 = zd.f2.r(r5)
        L_0x0028:
            if (r1 >= r2) goto L_0x0040
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r4 = zd.f2.p(r5, r1)
            zd.e2 r4 = zd.e2.b(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0028
        L_0x0040:
            r5 = r0
        L_0x0041:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.ha(int[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.3")
    @t
    public static final void hb(@g short[] sArr) {
        l0.p(sArr, "$this$sort");
        if (q2.r(sArr) > 1) {
            r1.k(sArr, 0, q2.r(sArr));
        }
    }

    @t0
    @h1(version = "1.5")
    @t
    @y2(markerClass = {t.class})
    @f
    @ve.h(name = "sumOfUInt")
    public static final int hc(long[] jArr, l<? super j2, e2> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            l10 = e2.l(l10 + lVar.A(j2.b(k2.p(jArr, i10))).l0());
        }
        return l10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final <R> List<u0<a2, R>> hd(@g byte[] bArr, @g Iterable<? extends R> iterable) {
        l0.p(bArr, "$this$zip");
        l0.p(iterable, "other");
        int r10 = b2.r(bArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), r10));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= r10) {
                break;
            }
            arrayList.add(zd.r1.a(a2.b(b2.p(bArr, i10)), next));
            i10++;
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte[] i0(byte[] bArr) {
        l0.p(bArr, "$this$asByteArray");
        return bArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final a2 i2(byte[] bArr, int i10) {
        l0.p(bArr, "$this$elementAtOrNull");
        return y4(bArr, i10);
    }

    @h1(version = "1.3")
    @t
    @h
    public static final e2 i3(@g int[] iArr) {
        l0.p(iArr, "$this$firstOrNull");
        if (f2.u(iArr)) {
            return null;
        }
        return e2.b(f2.p(iArr, 0));
    }

    @g
    public static final m i4(@g long[] jArr) {
        l0.p(jArr, "$this$indices");
        return be.p.Ne(jArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long i5(long[] jArr) {
        l0.p(jArr, "$this$last");
        return j2.l(be.p.Zh(jArr));
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R i6(byte[] bArr, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (b2.u(bArr)) {
            return null;
        }
        R r10 = (Comparable) lVar.A(a2.b(b2.p(bArr, 0)));
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(a2.b(b2.p(bArr, o10.nextInt())));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R i7(int[] iArr, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (!f2.u(iArr)) {
            R r10 = (Comparable) lVar.A(e2.b(f2.p(iArr, 0)));
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(e2.b(f2.p(iArr, o10.nextInt())));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    public static final byte[] i8(byte[] bArr, p<? super Integer, ? super a2, u2> pVar) {
        l0.p(bArr, "$this$onEachIndexed");
        l0.p(pVar, "action");
        int r10 = b2.r(bArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            pVar.g0(Integer.valueOf(i11), a2.b(b2.p(bArr, i10)));
            i10++;
            i11++;
        }
        return bArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int i9(int[] iArr, q<? super Integer, ? super e2, ? super e2, e2> qVar) {
        l0.p(iArr, "$this$reduceRightIndexed");
        l0.p(qVar, "operation");
        int Ve = be.p.Ve(iArr);
        if (Ve >= 0) {
            int p10 = f2.p(iArr, Ve);
            for (int i10 = Ve - 1; i10 >= 0; i10--) {
                p10 = qVar.y(Integer.valueOf(i10), e2.b(f2.p(iArr, i10)), e2.b(p10)).l0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @t
    public static final void ia(@g int[] iArr) {
        l0.p(iArr, "$this$shuffle");
        ja(iArr, ef.f.O);
    }

    @h1(version = "1.3")
    @t
    public static final void ib(@g int[] iArr) {
        l0.p(iArr, "$this$sortDescending");
        if (f2.r(iArr) > 1) {
            Wa(iArr);
            be.p.yr(iArr);
        }
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @ve.h(name = "sumOfUInt")
    public static final int ic(@g e2[] e2VarArr) {
        l0.p(e2VarArr, "<this>");
        int i10 = 0;
        for (e2 l02 : e2VarArr) {
            i10 = e2.l(i10 + l02.l0());
        }
        return i10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <V> List<V> id(int[] iArr, int[] iArr2, p<? super e2, ? super e2, ? extends V> pVar) {
        l0.p(iArr, "$this$zip");
        l0.p(iArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(f2.r(iArr), f2.r(iArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(e2.b(f2.p(iArr, i10)), e2.b(f2.p(iArr2, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int[] j0(int[] iArr) {
        l0.p(iArr, "$this$asIntArray");
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r9 = be.e0.h3(zd.b2.c(r9), ", ", "[", "]", 0, (java.lang.CharSequence) null, (we.l) null, 56, (java.lang.Object) null);
     */
    @fh.g
    @zd.h1(version = "1.4")
    @zd.t
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String j1(@fh.h byte[] r9) {
        /*
            if (r9 == 0) goto L_0x0018
            zd.b2 r0 = zd.b2.c(r9)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r9 = be.e0.h3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r9 = "null"
        L_0x001a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.j1(byte[]):java.lang.String");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final p2 j2(short[] sArr, int i10) {
        l0.p(sArr, "$this$elementAtOrNull");
        return z4(sArr, i10);
    }

    @h1(version = "1.3")
    @t
    @h
    public static final a2 j3(@g byte[] bArr) {
        l0.p(bArr, "$this$firstOrNull");
        if (b2.u(bArr)) {
            return null;
        }
        return a2.b(b2.p(bArr, 0));
    }

    @h1(version = "1.3")
    @t
    public static /* synthetic */ void j4(long[] jArr) {
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int j5(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$last");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr) - 1;
        if (r10 >= 0) {
            while (true) {
                int i10 = r10 - 1;
                int p10 = f2.p(iArr, r10);
                if (!lVar.A(e2.b(p10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    r10 = i10;
                } else {
                    return p10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Double j6(byte[] bArr, l<? super a2, Double> lVar) {
        l0.p(bArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (b2.u(bArr)) {
            return null;
        }
        double doubleValue = lVar.A(a2.b(b2.p(bArr, 0))).doubleValue();
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(a2.b(b2.p(bArr, o10.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final double j7(short[] sArr, l<? super p2, Double> lVar) {
        l0.p(sArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (!q2.u(sArr)) {
            double doubleValue = lVar.A(p2.b(q2.p(sArr, 0))).doubleValue();
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(p2.b(q2.p(sArr, o10.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    public static final int[] j8(int[] iArr, p<? super Integer, ? super e2, u2> pVar) {
        l0.p(iArr, "$this$onEachIndexed");
        l0.p(pVar, "action");
        int r10 = f2.r(iArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            pVar.g0(Integer.valueOf(i11), e2.b(f2.p(iArr, i10)));
            i10++;
            i11++;
        }
        return iArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte j9(byte[] bArr, q<? super Integer, ? super a2, ? super a2, a2> qVar) {
        l0.p(bArr, "$this$reduceRightIndexed");
        l0.p(qVar, "operation");
        int Re = be.p.Re(bArr);
        if (Re >= 0) {
            byte p10 = b2.p(bArr, Re);
            for (int i10 = Re - 1; i10 >= 0; i10--) {
                p10 = qVar.y(Integer.valueOf(i10), a2.b(b2.p(bArr, i10)), a2.b(p10)).j0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @t
    public static final void ja(@g int[] iArr, @g ef.f fVar) {
        l0.p(iArr, "$this$shuffle");
        l0.p(fVar, "random");
        for (int Ve = be.p.Ve(iArr); Ve > 0; Ve--) {
            int m10 = fVar.m(Ve + 1);
            int p10 = f2.p(iArr, Ve);
            f2.w(iArr, Ve, f2.p(iArr, m10));
            f2.w(iArr, m10, p10);
        }
    }

    @h1(version = "1.4")
    @t
    public static final void jb(@g long[] jArr, int i10, int i11) {
        l0.p(jArr, "$this$sortDescending");
        Xa(jArr, i10, i11);
        be.p.Br(jArr, i10, i11);
    }

    @t0
    @h1(version = "1.5")
    @t
    @y2(markerClass = {t.class})
    @f
    @ve.h(name = "sumOfUInt")
    public static final int jc(short[] sArr, l<? super p2, e2> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            l10 = e2.l(l10 + lVar.A(p2.b(q2.p(sArr, i10))).l0());
        }
        return l10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> jd(byte[] bArr, R[] rArr, p<? super a2, ? super R, ? extends V> pVar) {
        l0.p(bArr, "$this$zip");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(b2.r(bArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(a2.b(b2.p(bArr, i10)), rArr[i10]));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long[] k0(long[] jArr) {
        l0.p(jArr, "$this$asLongArray");
        return jArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final e2 k2(int[] iArr, int i10) {
        l0.p(iArr, "$this$elementAtOrNull");
        return A4(iArr, i10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final a2 k3(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$firstOrNull");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            if (lVar.A(a2.b(p10)).booleanValue()) {
                return a2.b(p10);
            }
        }
        return null;
    }

    @g
    public static final m k4(@g short[] sArr) {
        l0.p(sArr, "$this$indices");
        return be.p.Pe(sArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short k5(short[] sArr) {
        l0.p(sArr, "$this$last");
        return p2.l(be.p.di(sArr));
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Float k6(byte[] bArr, l<? super a2, Float> lVar) {
        l0.p(bArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (b2.u(bArr)) {
            return null;
        }
        float floatValue = lVar.A(a2.b(b2.p(bArr, 0))).floatValue();
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(a2.b(b2.p(bArr, o10.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final float k7(short[] sArr, l<? super p2, Float> lVar) {
        l0.p(sArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (!q2.u(sArr)) {
            float floatValue = lVar.A(p2.b(q2.p(sArr, 0))).floatValue();
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(p2.b(q2.p(sArr, o10.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    public static final long[] k8(long[] jArr, p<? super Integer, ? super j2, u2> pVar) {
        l0.p(jArr, "$this$onEachIndexed");
        l0.p(pVar, "action");
        int r10 = k2.r(jArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            pVar.g0(Integer.valueOf(i11), j2.b(k2.p(jArr, i10)));
            i10++;
            i11++;
        }
        return jArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short k9(short[] sArr, q<? super Integer, ? super p2, ? super p2, p2> qVar) {
        l0.p(sArr, "$this$reduceRightIndexed");
        l0.p(qVar, "operation");
        int Ye = be.p.Ye(sArr);
        if (Ye >= 0) {
            short p10 = q2.p(sArr, Ye);
            for (int i10 = Ye - 1; i10 >= 0; i10--) {
                p10 = qVar.y(Integer.valueOf(i10), p2.b(q2.p(sArr, i10)), p2.b(p10)).j0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @t
    public static final void ka(@g byte[] bArr) {
        l0.p(bArr, "$this$shuffle");
        na(bArr, ef.f.O);
    }

    @h1(version = "1.4")
    @t
    public static final void kb(@g byte[] bArr, int i10, int i11) {
        l0.p(bArr, "$this$sortDescending");
        Za(bArr, i10, i11);
        be.p.rr(bArr, i10, i11);
    }

    @t0
    @h1(version = "1.5")
    @t
    @y2(markerClass = {t.class})
    @f
    @ve.h(name = "sumOfULong")
    public static final long kc(byte[] bArr, l<? super a2, j2> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            l10 = j2.l(l10 + lVar.A(a2.b(b2.p(bArr, i10))).l0());
        }
        return l10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <V> List<V> kd(long[] jArr, long[] jArr2, p<? super j2, ? super j2, ? extends V> pVar) {
        l0.p(jArr, "$this$zip");
        l0.p(jArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(k2.r(jArr), k2.r(jArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(j2.b(k2.p(jArr, i10)), j2.b(k2.p(jArr2, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short[] l0(short[] sArr) {
        l0.p(sArr, "$this$asShortArray");
        return sArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final j2 l2(long[] jArr, int i10) {
        l0.p(jArr, "$this$elementAtOrNull");
        return B4(jArr, i10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final j2 l3(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$firstOrNull");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            if (lVar.A(j2.b(p10)).booleanValue()) {
                return j2.b(p10);
            }
        }
        return null;
    }

    @h1(version = "1.3")
    @t
    public static /* synthetic */ void l4(short[] sArr) {
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short l5(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$last");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr) - 1;
        if (r10 >= 0) {
            while (true) {
                int i10 = r10 - 1;
                short p10 = q2.p(sArr, r10);
                if (!lVar.A(p2.b(p10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    r10 = i10;
                } else {
                    return p10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R l6(long[] jArr, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (k2.u(jArr)) {
            return null;
        }
        R r10 = (Comparable) lVar.A(j2.b(k2.p(jArr, 0)));
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(j2.b(k2.p(jArr, o10.nextInt())));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R l7(short[] sArr, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (!q2.u(sArr)) {
            R r10 = (Comparable) lVar.A(p2.b(q2.p(sArr, 0)));
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(p2.b(q2.p(sArr, o10.nextInt())));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    public static final short[] l8(short[] sArr, p<? super Integer, ? super p2, u2> pVar) {
        l0.p(sArr, "$this$onEachIndexed");
        l0.p(pVar, "action");
        int r10 = q2.r(sArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            pVar.g0(Integer.valueOf(i11), p2.b(q2.p(sArr, i10)));
            i10++;
            i11++;
        }
        return sArr;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long l9(long[] jArr, q<? super Integer, ? super j2, ? super j2, j2> qVar) {
        l0.p(jArr, "$this$reduceRightIndexed");
        l0.p(qVar, "operation");
        int We = be.p.We(jArr);
        if (We >= 0) {
            long p10 = k2.p(jArr, We);
            for (int i10 = We - 1; i10 >= 0; i10--) {
                p10 = qVar.y(Integer.valueOf(i10), j2.b(k2.p(jArr, i10)), j2.b(p10)).l0();
            }
            return p10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @t
    public static final void la(@g long[] jArr, @g ef.f fVar) {
        l0.p(jArr, "$this$shuffle");
        l0.p(fVar, "random");
        for (int We = be.p.We(jArr); We > 0; We--) {
            int m10 = fVar.m(We + 1);
            long p10 = k2.p(jArr, We);
            k2.w(jArr, We, k2.p(jArr, m10));
            k2.w(jArr, m10, p10);
        }
    }

    @h1(version = "1.4")
    @t
    public static final void lb(@g short[] sArr, int i10, int i11) {
        l0.p(sArr, "$this$sortDescending");
        bb(sArr, i10, i11);
        be.p.Fr(sArr, i10, i11);
    }

    @t0
    @h1(version = "1.5")
    @t
    @y2(markerClass = {t.class})
    @f
    @ve.h(name = "sumOfULong")
    public static final long lc(int[] iArr, l<? super e2, j2> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            l10 = j2.l(l10 + lVar.A(e2.b(f2.p(iArr, i10))).l0());
        }
        return l10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> ld(long[] jArr, Iterable<? extends R> iterable, p<? super j2, ? super R, ? extends V> pVar) {
        l0.p(jArr, "$this$zip");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int r10 = k2.r(jArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), r10));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= r10) {
                break;
            }
            arrayList.add(pVar.g0(j2.b(k2.p(jArr, i10)), next));
            i10++;
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte[] m0(byte[] bArr) {
        l0.p(bArr, "<this>");
        return b2.f(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r9 = be.e0.h3(zd.f2.c(r9), ", ", "[", "]", 0, (java.lang.CharSequence) null, (we.l) null, 56, (java.lang.Object) null);
     */
    @fh.g
    @zd.h1(version = "1.4")
    @zd.t
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m1(@fh.h int[] r9) {
        /*
            if (r9 == 0) goto L_0x0018
            zd.f2 r0 = zd.f2.c(r9)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r9 = be.e0.h3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r9 = "null"
        L_0x001a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.m1(int[]):java.lang.String");
    }

    @h1(version = "1.3")
    @t
    public static final void m2(@g int[] iArr, int i10, int i11, int i12) {
        l0.p(iArr, "$this$fill");
        o.l2(iArr, i10, i11, i12);
    }

    @h1(version = "1.3")
    @t
    @h
    public static final j2 m3(@g long[] jArr) {
        l0.p(jArr, "$this$firstOrNull");
        if (k2.u(jArr)) {
            return null;
        }
        return j2.b(k2.p(jArr, 0));
    }

    public static final int m4(@g int[] iArr) {
        l0.p(iArr, "$this$lastIndex");
        return be.p.Ve(iArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int m5(long[] jArr, long j10) {
        l0.p(jArr, "$this$lastIndexOf");
        return be.p.mi(jArr, j10);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Double m6(long[] jArr, l<? super j2, Double> lVar) {
        l0.p(jArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (k2.u(jArr)) {
            return null;
        }
        double doubleValue = lVar.A(j2.b(k2.p(jArr, 0))).doubleValue();
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(j2.b(k2.p(jArr, o10.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R m7(byte[] bArr, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (b2.u(bArr)) {
            return null;
        }
        R r10 = (Comparable) lVar.A(a2.b(b2.p(bArr, 0)));
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(a2.b(b2.p(bArr, o10.nextInt())));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long[] m8(long[] jArr, long j10) {
        l0.p(jArr, "$this$plus");
        return k2.f(o.U3(jArr, j10));
    }

    @h1(version = "1.4")
    @t
    @f
    public static final e2 m9(int[] iArr, q<? super Integer, ? super e2, ? super e2, e2> qVar) {
        l0.p(iArr, "$this$reduceRightIndexedOrNull");
        l0.p(qVar, "operation");
        int Ve = be.p.Ve(iArr);
        if (Ve < 0) {
            return null;
        }
        int p10 = f2.p(iArr, Ve);
        for (int i10 = Ve - 1; i10 >= 0; i10--) {
            p10 = qVar.y(Integer.valueOf(i10), e2.b(f2.p(iArr, i10)), e2.b(p10)).l0();
        }
        return e2.b(p10);
    }

    @h1(version = "1.4")
    @t
    public static final void ma(@g long[] jArr) {
        l0.p(jArr, "$this$shuffle");
        la(jArr, ef.f.O);
    }

    @h1(version = "1.3")
    @t
    public static final void mb(@g byte[] bArr) {
        l0.p(bArr, "$this$sortDescending");
        if (b2.r(bArr) > 1) {
            db(bArr);
            be.p.qr(bArr);
        }
    }

    @t0
    @h1(version = "1.5")
    @t
    @y2(markerClass = {t.class})
    @f
    @ve.h(name = "sumOfULong")
    public static final long mc(long[] jArr, l<? super j2, j2> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            l10 = j2.l(l10 + lVar.A(j2.b(k2.p(jArr, i10))).l0());
        }
        return l10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> md(byte[] bArr, Iterable<? extends R> iterable, p<? super a2, ? super R, ? extends V> pVar) {
        l0.p(bArr, "$this$zip");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int r10 = b2.r(bArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), r10));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= r10) {
                break;
            }
            arrayList.add(pVar.g0(a2.b(b2.p(bArr, i10)), next));
            i10++;
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int[] n0(int[] iArr) {
        l0.p(iArr, "<this>");
        return f2.f(iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r9 = be.e0.h3(zd.q2.c(r9), ", ", "[", "]", 0, (java.lang.CharSequence) null, (we.l) null, 56, (java.lang.Object) null);
     */
    @fh.g
    @zd.h1(version = "1.4")
    @zd.t
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String n1(@fh.h short[] r9) {
        /*
            if (r9 == 0) goto L_0x0018
            zd.q2 r0 = zd.q2.c(r9)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r9 = be.e0.h3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r9 = "null"
        L_0x001a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.n1(short[]):java.lang.String");
    }

    public static /* synthetic */ void n2(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = f2.r(iArr);
        }
        m2(iArr, i10, i11, i12);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final e2 n3(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$firstOrNull");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            if (lVar.A(e2.b(p10)).booleanValue()) {
                return e2.b(p10);
            }
        }
        return null;
    }

    @h1(version = "1.3")
    @t
    public static /* synthetic */ void n4(int[] iArr) {
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int n5(short[] sArr, short s10) {
        l0.p(sArr, "$this$lastIndexOf");
        return be.p.oi(sArr, s10);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Float n6(long[] jArr, l<? super j2, Float> lVar) {
        l0.p(jArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (k2.u(jArr)) {
            return null;
        }
        float floatValue = lVar.A(j2.b(k2.p(jArr, 0))).floatValue();
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(j2.b(k2.p(jArr, o10.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Double n7(byte[] bArr, l<? super a2, Double> lVar) {
        l0.p(bArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (b2.u(bArr)) {
            return null;
        }
        double doubleValue = lVar.A(a2.b(b2.p(bArr, 0))).doubleValue();
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(a2.b(b2.p(bArr, o10.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final int[] n8(@g int[] iArr, @g Collection<e2> collection) {
        l0.p(iArr, "$this$plus");
        l0.p(collection, "elements");
        int r10 = f2.r(iArr);
        int[] copyOf = Arrays.copyOf(iArr, f2.r(iArr) + collection.size());
        l0.o(copyOf, "copyOf(this, newSize)");
        for (e2 l02 : collection) {
            copyOf[r10] = l02.l0();
            r10++;
        }
        return f2.f(copyOf);
    }

    @h1(version = "1.4")
    @t
    @f
    public static final a2 n9(byte[] bArr, q<? super Integer, ? super a2, ? super a2, a2> qVar) {
        l0.p(bArr, "$this$reduceRightIndexedOrNull");
        l0.p(qVar, "operation");
        int Re = be.p.Re(bArr);
        if (Re < 0) {
            return null;
        }
        byte p10 = b2.p(bArr, Re);
        for (int i10 = Re - 1; i10 >= 0; i10--) {
            p10 = qVar.y(Integer.valueOf(i10), a2.b(b2.p(bArr, i10)), a2.b(p10)).j0();
        }
        return a2.b(p10);
    }

    @h1(version = "1.4")
    @t
    public static final void na(@g byte[] bArr, @g ef.f fVar) {
        l0.p(bArr, "$this$shuffle");
        l0.p(fVar, "random");
        for (int Re = be.p.Re(bArr); Re > 0; Re--) {
            int m10 = fVar.m(Re + 1);
            byte p10 = b2.p(bArr, Re);
            b2.w(bArr, Re, b2.p(bArr, m10));
            b2.w(bArr, m10, p10);
        }
    }

    @h1(version = "1.3")
    @t
    public static final void nb(@g long[] jArr) {
        l0.p(jArr, "$this$sortDescending");
        if (k2.r(jArr) > 1) {
            eb(jArr);
            be.p.Ar(jArr);
        }
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @ve.h(name = "sumOfULong")
    public static final long nc(@g j2[] j2VarArr) {
        l0.p(j2VarArr, "<this>");
        long j10 = 0;
        for (j2 l02 : j2VarArr) {
            j10 = j2.l(j10 + l02.l0());
        }
        return j10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> nd(int[] iArr, R[] rArr, p<? super e2, ? super R, ? extends V> pVar) {
        l0.p(iArr, "$this$zip");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(f2.r(iArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(e2.b(f2.p(iArr, i10)), rArr[i10]));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long[] o0(long[] jArr) {
        l0.p(jArr, "<this>");
        return k2.f(jArr);
    }

    @h1(version = "1.3")
    @t
    public static final void o2(@g short[] sArr, short s10, int i10, int i11) {
        l0.p(sArr, "$this$fill");
        o.o2(sArr, s10, i10, i11);
    }

    @h1(version = "1.3")
    @t
    @h
    public static final p2 o3(@g short[] sArr) {
        l0.p(sArr, "$this$firstOrNull");
        if (q2.u(sArr)) {
            return null;
        }
        return p2.b(q2.p(sArr, 0));
    }

    public static final int o4(@g byte[] bArr) {
        l0.p(bArr, "$this$lastIndex");
        return be.p.Re(bArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int o5(byte[] bArr, byte b10) {
        l0.p(bArr, "$this$lastIndexOf");
        return be.p.hi(bArr, b10);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R o6(int[] iArr, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (f2.u(iArr)) {
            return null;
        }
        R r10 = (Comparable) lVar.A(e2.b(f2.p(iArr, 0)));
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(e2.b(f2.p(iArr, o10.nextInt())));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Float o7(byte[] bArr, l<? super a2, Float> lVar) {
        l0.p(bArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (b2.u(bArr)) {
            return null;
        }
        float floatValue = lVar.A(a2.b(b2.p(bArr, 0))).floatValue();
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(a2.b(b2.p(bArr, o10.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short[] o8(short[] sArr, short s10) {
        l0.p(sArr, "$this$plus");
        return q2.f(o.b4(sArr, s10));
    }

    @h1(version = "1.4")
    @t
    @f
    public static final p2 o9(short[] sArr, q<? super Integer, ? super p2, ? super p2, p2> qVar) {
        l0.p(sArr, "$this$reduceRightIndexedOrNull");
        l0.p(qVar, "operation");
        int Ye = be.p.Ye(sArr);
        if (Ye < 0) {
            return null;
        }
        short p10 = q2.p(sArr, Ye);
        for (int i10 = Ye - 1; i10 >= 0; i10--) {
            p10 = qVar.y(Integer.valueOf(i10), p2.b(q2.p(sArr, i10)), p2.b(p10)).j0();
        }
        return p2.b(p10);
    }

    @h1(version = "1.4")
    @t
    public static final void oa(@g short[] sArr) {
        l0.p(sArr, "$this$shuffle");
        pa(sArr, ef.f.O);
    }

    @h1(version = "1.4")
    @t
    public static final void ob(@g int[] iArr, int i10, int i11) {
        l0.p(iArr, "$this$sortDescending");
        fb(iArr, i10, i11);
        be.p.zr(iArr, i10, i11);
    }

    @t0
    @h1(version = "1.5")
    @t
    @y2(markerClass = {t.class})
    @f
    @ve.h(name = "sumOfULong")
    public static final long oc(short[] sArr, l<? super p2, j2> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            l10 = j2.l(l10 + lVar.A(p2.b(q2.p(sArr, i10))).l0());
        }
        return l10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<u0<e2, e2>> od(@g int[] iArr, @g int[] iArr2) {
        l0.p(iArr, "$this$zip");
        l0.p(iArr2, "other");
        int min = Math.min(f2.r(iArr), f2.r(iArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(zd.r1.a(e2.b(f2.p(iArr, i10)), e2.b(f2.p(iArr2, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short[] p0(short[] sArr) {
        l0.p(sArr, "<this>");
        return q2.f(sArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r9 = be.e0.h3(zd.k2.c(r9), ", ", "[", "]", 0, (java.lang.CharSequence) null, (we.l) null, 56, (java.lang.Object) null);
     */
    @fh.g
    @zd.h1(version = "1.4")
    @zd.t
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String p1(@fh.h long[] r9) {
        /*
            if (r9 == 0) goto L_0x0018
            zd.k2 r0 = zd.k2.c(r9)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            java.lang.String r9 = be.e0.h3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r9 = "null"
        L_0x001a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.c.p1(long[]):java.lang.String");
    }

    public static /* synthetic */ void p2(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = q2.r(sArr);
        }
        o2(sArr, s10, i10, i11);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final p2 p3(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$firstOrNull");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            if (lVar.A(p2.b(p10)).booleanValue()) {
                return p2.b(p10);
            }
        }
        return null;
    }

    @h1(version = "1.3")
    @t
    public static /* synthetic */ void p4(byte[] bArr) {
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int p5(int[] iArr, int i10) {
        l0.p(iArr, "$this$lastIndexOf");
        return be.p.li(iArr, i10);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Double p6(int[] iArr, l<? super e2, Double> lVar) {
        l0.p(iArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (f2.u(iArr)) {
            return null;
        }
        double doubleValue = lVar.A(e2.b(f2.p(iArr, 0))).doubleValue();
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(e2.b(f2.p(iArr, o10.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R p7(long[] jArr, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (k2.u(jArr)) {
            return null;
        }
        R r10 = (Comparable) lVar.A(j2.b(k2.p(jArr, 0)));
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(j2.b(k2.p(jArr, o10.nextInt())));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int[] p8(int[] iArr, int[] iArr2) {
        l0.p(iArr, "$this$plus");
        l0.p(iArr2, "elements");
        return f2.f(o.T3(iArr, iArr2));
    }

    @h1(version = "1.4")
    @t
    @f
    public static final j2 p9(long[] jArr, q<? super Integer, ? super j2, ? super j2, j2> qVar) {
        l0.p(jArr, "$this$reduceRightIndexedOrNull");
        l0.p(qVar, "operation");
        int We = be.p.We(jArr);
        if (We < 0) {
            return null;
        }
        long p10 = k2.p(jArr, We);
        for (int i10 = We - 1; i10 >= 0; i10--) {
            p10 = qVar.y(Integer.valueOf(i10), j2.b(k2.p(jArr, i10)), j2.b(p10)).l0();
        }
        return j2.b(p10);
    }

    @h1(version = "1.4")
    @t
    public static final void pa(@g short[] sArr, @g ef.f fVar) {
        l0.p(sArr, "$this$shuffle");
        l0.p(fVar, "random");
        for (int Ye = be.p.Ye(sArr); Ye > 0; Ye--) {
            int m10 = fVar.m(Ye + 1);
            short p10 = q2.p(sArr, Ye);
            q2.w(sArr, Ye, q2.p(sArr, m10));
            q2.w(sArr, m10, p10);
        }
    }

    @h1(version = "1.3")
    @t
    public static final void pb(@g short[] sArr) {
        l0.p(sArr, "$this$sortDescending");
        if (q2.r(sArr) > 1) {
            hb(sArr);
            be.p.Er(sArr);
        }
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @ve.h(name = "sumOfUShort")
    public static final int pc(@g p2[] p2VarArr) {
        l0.p(p2VarArr, "<this>");
        int i10 = 0;
        for (p2 j02 : p2VarArr) {
            i10 = e2.l(i10 + e2.l(j02.j0() & p2.R));
        }
        return i10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> pd(short[] sArr, R[] rArr, p<? super p2, ? super R, ? extends V> pVar) {
        l0.p(sArr, "$this$zip");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(q2.r(sArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(p2.b(q2.p(sArr, i10)), rArr[i10]));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <V> Map<a2, V> q0(byte[] bArr, l<? super a2, ? extends V> lVar) {
        l0.p(bArr, "$this$associateWith");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(b2.r(bArr)), 16));
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            linkedHashMap.put(a2.b(p10), lVar.A(a2.b(p10)));
        }
        return linkedHashMap;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long[] q1(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        l0.p(jArr, "$this$copyInto");
        l0.p(jArr2, "destination");
        o.b1(jArr, jArr2, i10, i11, i12);
        return jArr2;
    }

    @h1(version = "1.3")
    @t
    public static final void q2(@g long[] jArr, long j10, int i10, int i11) {
        l0.p(jArr, "$this$fill");
        o.m2(jArr, j10, i10, i11);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R> List<R> q3(byte[] bArr, l<? super a2, ? extends Iterable<? extends R>> lVar) {
        l0.p(bArr, "$this$flatMap");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            b0.o0(arrayList, (Iterable) lVar.A(a2.b(b2.p(bArr, i10))));
        }
        return arrayList;
    }

    public static final int q4(@g long[] jArr) {
        l0.p(jArr, "$this$lastIndex");
        return be.p.We(jArr);
    }

    @h1(version = "1.3")
    @t
    @h
    public static final e2 q5(@g int[] iArr) {
        l0.p(iArr, "$this$lastOrNull");
        if (f2.u(iArr)) {
            return null;
        }
        return e2.b(f2.p(iArr, f2.r(iArr) - 1));
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Float q6(int[] iArr, l<? super e2, Float> lVar) {
        l0.p(iArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (f2.u(iArr)) {
            return null;
        }
        float floatValue = lVar.A(e2.b(f2.p(iArr, 0))).floatValue();
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(e2.b(f2.p(iArr, o10.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Double q7(long[] jArr, l<? super j2, Double> lVar) {
        l0.p(jArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (k2.u(jArr)) {
            return null;
        }
        double doubleValue = lVar.A(j2.b(k2.p(jArr, 0))).doubleValue();
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(j2.b(k2.p(jArr, o10.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte[] q8(byte[] bArr, byte b10) {
        l0.p(bArr, "$this$plus");
        return b2.f(o.F3(bArr, b10));
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @f
    public static final a2 q9(byte[] bArr, p<? super a2, ? super a2, a2> pVar) {
        l0.p(bArr, "$this$reduceRightOrNull");
        l0.p(pVar, "operation");
        int Re = be.p.Re(bArr);
        if (Re < 0) {
            return null;
        }
        byte p10 = b2.p(bArr, Re);
        for (int i10 = Re - 1; i10 >= 0; i10--) {
            p10 = pVar.g0(a2.b(b2.p(bArr, i10)), a2.b(p10)).j0();
        }
        return a2.b(p10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int qa(int[] iArr) {
        l0.p(iArr, "$this$single");
        return e2.l(be.p.Dt(iArr));
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<e2> qb(@g int[] iArr) {
        l0.p(iArr, "$this$sorted");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        int[] f10 = f2.f(copyOf);
        Wa(f10);
        return b.a(f10);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<a2> qc(@g byte[] bArr, int i10) {
        l0.p(bArr, "$this$take");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= b2.r(bArr)) {
                return e0.Q5(b2.c(bArr));
            }
            if (i10 == 1) {
                return be.v.k(a2.b(b2.p(bArr, 0)));
            }
            ArrayList arrayList = new ArrayList(i10);
            int r10 = b2.r(bArr);
            int i11 = 0;
            for (int i12 = 0; i12 < r10; i12++) {
                arrayList.add(a2.b(b2.p(bArr, i12)));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @h1(version = "1.3")
    @t
    @g
    public static final <R> List<u0<j2, R>> qd(@g long[] jArr, @g R[] rArr) {
        l0.p(jArr, "$this$zip");
        l0.p(rArr, "other");
        int min = Math.min(k2.r(jArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            long p10 = k2.p(jArr, i10);
            arrayList.add(zd.r1.a(j2.b(p10), rArr[i10]));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <V> Map<j2, V> r0(long[] jArr, l<? super j2, ? extends V> lVar) {
        l0.p(jArr, "$this$associateWith");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(k2.r(jArr)), 16));
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            linkedHashMap.put(j2.b(p10), lVar.A(j2.b(p10)));
        }
        return linkedHashMap;
    }

    public static /* synthetic */ long[] r1(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = k2.r(jArr);
        }
        l0.p(jArr, "$this$copyInto");
        l0.p(jArr2, "destination");
        o.b1(jArr, jArr2, i10, i11, i12);
        return jArr2;
    }

    public static /* synthetic */ void r2(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = k2.r(jArr);
        }
        q2(jArr, j10, i10, i11);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R> List<R> r3(long[] jArr, l<? super j2, ? extends Iterable<? extends R>> lVar) {
        l0.p(jArr, "$this$flatMap");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            b0.o0(arrayList, (Iterable) lVar.A(j2.b(k2.p(jArr, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    public static /* synthetic */ void r4(long[] jArr) {
    }

    @h1(version = "1.3")
    @t
    @h
    public static final a2 r5(@g byte[] bArr) {
        l0.p(bArr, "$this$lastOrNull");
        if (b2.u(bArr)) {
            return null;
        }
        return a2.b(b2.p(bArr, b2.r(bArr) - 1));
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R r6(short[] sArr, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (q2.u(sArr)) {
            return null;
        }
        R r10 = (Comparable) lVar.A(p2.b(q2.p(sArr, 0)));
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(p2.b(q2.p(sArr, o10.nextInt())));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Float r7(long[] jArr, l<? super j2, Float> lVar) {
        l0.p(jArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (k2.u(jArr)) {
            return null;
        }
        float floatValue = lVar.A(j2.b(k2.p(jArr, 0))).floatValue();
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(j2.b(k2.p(jArr, o10.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte[] r8(byte[] bArr, byte[] bArr2) {
        l0.p(bArr, "$this$plus");
        l0.p(bArr2, "elements");
        return b2.f(o.H3(bArr, bArr2));
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @f
    public static final e2 r9(int[] iArr, p<? super e2, ? super e2, e2> pVar) {
        l0.p(iArr, "$this$reduceRightOrNull");
        l0.p(pVar, "operation");
        int Ve = be.p.Ve(iArr);
        if (Ve < 0) {
            return null;
        }
        int p10 = f2.p(iArr, Ve);
        for (int i10 = Ve - 1; i10 >= 0; i10--) {
            p10 = pVar.g0(e2.b(f2.p(iArr, i10)), e2.b(p10)).l0();
        }
        return e2.b(p10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte ra(byte[] bArr) {
        l0.p(bArr, "$this$single");
        return a2.l(be.p.vt(bArr));
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<a2> rb(@g byte[] bArr) {
        l0.p(bArr, "$this$sorted");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        byte[] f10 = b2.f(copyOf);
        db(f10);
        return b.b(f10);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<p2> rc(@g short[] sArr, int i10) {
        l0.p(sArr, "$this$take");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= q2.r(sArr)) {
                return e0.Q5(q2.c(sArr));
            }
            if (i10 == 1) {
                return be.v.k(p2.b(q2.p(sArr, 0)));
            }
            ArrayList arrayList = new ArrayList(i10);
            int r10 = q2.r(sArr);
            int i11 = 0;
            for (int i12 = 0; i12 < r10; i12++) {
                arrayList.add(p2.b(q2.p(sArr, i12)));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <V> List<V> rd(short[] sArr, short[] sArr2, p<? super p2, ? super p2, ? extends V> pVar) {
        l0.p(sArr, "$this$zip");
        l0.p(sArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(q2.r(sArr), q2.r(sArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(p2.b(q2.p(sArr, i10)), p2.b(q2.p(sArr2, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <V> Map<e2, V> s0(int[] iArr, l<? super e2, ? extends V> lVar) {
        l0.p(iArr, "$this$associateWith");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(f2.r(iArr)), 16));
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            linkedHashMap.put(e2.b(p10), lVar.A(e2.b(p10)));
        }
        return linkedHashMap;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short[] s1(short[] sArr, short[] sArr2, int i10, int i11, int i12) {
        l0.p(sArr, "$this$copyInto");
        l0.p(sArr2, "destination");
        o.d1(sArr, sArr2, i10, i11, i12);
        return sArr2;
    }

    @h1(version = "1.3")
    @t
    public static final void s2(@g byte[] bArr, byte b10, int i10, int i11) {
        l0.p(bArr, "$this$fill");
        o.h2(bArr, b10, i10, i11);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R> List<R> s3(int[] iArr, l<? super e2, ? extends Iterable<? extends R>> lVar) {
        l0.p(iArr, "$this$flatMap");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            b0.o0(arrayList, (Iterable) lVar.A(e2.b(f2.p(iArr, i10))));
        }
        return arrayList;
    }

    public static final int s4(@g short[] sArr) {
        l0.p(sArr, "$this$lastIndex");
        return be.p.Ye(sArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final a2 s5(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$lastOrNull");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr) - 1;
        if (r10 < 0) {
            return null;
        }
        while (true) {
            int i10 = r10 - 1;
            byte p10 = b2.p(bArr, r10);
            if (lVar.A(a2.b(p10)).booleanValue()) {
                return a2.b(p10);
            }
            if (i10 < 0) {
                return null;
            }
            r10 = i10;
        }
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Double s6(short[] sArr, l<? super p2, Double> lVar) {
        l0.p(sArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (q2.u(sArr)) {
            return null;
        }
        double doubleValue = lVar.A(p2.b(q2.p(sArr, 0))).doubleValue();
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(p2.b(q2.p(sArr, o10.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R s7(int[] iArr, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (f2.u(iArr)) {
            return null;
        }
        R r10 = (Comparable) lVar.A(e2.b(f2.p(iArr, 0)));
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(e2.b(f2.p(iArr, o10.nextInt())));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final long[] s8(@g long[] jArr, @g Collection<j2> collection) {
        l0.p(jArr, "$this$plus");
        l0.p(collection, "elements");
        int r10 = k2.r(jArr);
        long[] copyOf = Arrays.copyOf(jArr, k2.r(jArr) + collection.size());
        l0.o(copyOf, "copyOf(this, newSize)");
        for (j2 l02 : collection) {
            copyOf[r10] = l02.l0();
            r10++;
        }
        return k2.f(copyOf);
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @f
    public static final j2 s9(long[] jArr, p<? super j2, ? super j2, j2> pVar) {
        l0.p(jArr, "$this$reduceRightOrNull");
        l0.p(pVar, "operation");
        int We = be.p.We(jArr);
        if (We < 0) {
            return null;
        }
        long p10 = k2.p(jArr, We);
        for (int i10 = We - 1; i10 >= 0; i10--) {
            p10 = pVar.g0(j2.b(k2.p(jArr, i10)), j2.b(p10)).l0();
        }
        return j2.b(p10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte sa(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$single");
        l0.p(lVar, "predicate");
        int r10 = b2.r(bArr);
        a2 a2Var = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            if (lVar.A(a2.b(p10)).booleanValue()) {
                if (!z10) {
                    a2Var = a2.b(p10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            return a2Var.j0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<j2> sb(@g long[] jArr) {
        l0.p(jArr, "$this$sorted");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        long[] f10 = k2.f(copyOf);
        eb(f10);
        return b.c(f10);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<e2> sc(@g int[] iArr, int i10) {
        l0.p(iArr, "$this$take");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= f2.r(iArr)) {
                return e0.Q5(f2.c(iArr));
            }
            if (i10 == 1) {
                return be.v.k(e2.b(f2.p(iArr, 0)));
            }
            ArrayList arrayList = new ArrayList(i10);
            int r10 = f2.r(iArr);
            int i11 = 0;
            for (int i12 = 0; i12 < r10; i12++) {
                arrayList.add(e2.b(f2.p(iArr, i12)));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> sd(short[] sArr, Iterable<? extends R> iterable, p<? super p2, ? super R, ? extends V> pVar) {
        l0.p(sArr, "$this$zip");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int r10 = q2.r(sArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), r10));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= r10) {
                break;
            }
            arrayList.add(pVar.g0(p2.b(q2.p(sArr, i10)), next));
            i10++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <V> Map<p2, V> t0(short[] sArr, l<? super p2, ? extends V> lVar) {
        l0.p(sArr, "$this$associateWith");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(q2.r(sArr)), 16));
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            linkedHashMap.put(p2.b(p10), lVar.A(p2.b(p10)));
        }
        return linkedHashMap;
    }

    public static /* synthetic */ short[] t1(short[] sArr, short[] sArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = q2.r(sArr);
        }
        l0.p(sArr, "$this$copyInto");
        l0.p(sArr2, "destination");
        o.d1(sArr, sArr2, i10, i11, i12);
        return sArr2;
    }

    public static /* synthetic */ void t2(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = b2.r(bArr);
        }
        s2(bArr, b10, i10, i11);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R> List<R> t3(short[] sArr, l<? super p2, ? extends Iterable<? extends R>> lVar) {
        l0.p(sArr, "$this$flatMap");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            b0.o0(arrayList, (Iterable) lVar.A(p2.b(q2.p(sArr, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    public static /* synthetic */ void t4(short[] sArr) {
    }

    @h1(version = "1.3")
    @t
    @f
    public static final j2 t5(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$lastOrNull");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr) - 1;
        if (r10 < 0) {
            return null;
        }
        while (true) {
            int i10 = r10 - 1;
            long p10 = k2.p(jArr, r10);
            if (lVar.A(j2.b(p10)).booleanValue()) {
                return j2.b(p10);
            }
            if (i10 < 0) {
                return null;
            }
            r10 = i10;
        }
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Float t6(short[] sArr, l<? super p2, Float> lVar) {
        l0.p(sArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (q2.u(sArr)) {
            return null;
        }
        float floatValue = lVar.A(p2.b(q2.p(sArr, 0))).floatValue();
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(p2.b(q2.p(sArr, o10.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Double t7(int[] iArr, l<? super e2, Double> lVar) {
        l0.p(iArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (f2.u(iArr)) {
            return null;
        }
        double doubleValue = lVar.A(e2.b(f2.p(iArr, 0))).doubleValue();
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(e2.b(f2.p(iArr, o10.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short[] t8(short[] sArr, short[] sArr2) {
        l0.p(sArr, "$this$plus");
        l0.p(sArr2, "elements");
        return q2.f(o.c4(sArr, sArr2));
    }

    @h1(version = "1.4")
    @t
    @y2(markerClass = {r.class})
    @f
    public static final p2 t9(short[] sArr, p<? super p2, ? super p2, p2> pVar) {
        l0.p(sArr, "$this$reduceRightOrNull");
        l0.p(pVar, "operation");
        int Ye = be.p.Ye(sArr);
        if (Ye < 0) {
            return null;
        }
        short p10 = q2.p(sArr, Ye);
        for (int i10 = Ye - 1; i10 >= 0; i10--) {
            p10 = pVar.g0(p2.b(q2.p(sArr, i10)), p2.b(p10)).j0();
        }
        return p2.b(p10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long ta(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$single");
        l0.p(lVar, "predicate");
        int r10 = k2.r(jArr);
        j2 j2Var = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            if (lVar.A(j2.b(p10)).booleanValue()) {
                if (!z10) {
                    j2Var = j2.b(p10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            return j2Var.l0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<p2> tb(@g short[] sArr) {
        l0.p(sArr, "$this$sorted");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        short[] f10 = q2.f(copyOf);
        hb(f10);
        return b.d(f10);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<j2> tc(@g long[] jArr, int i10) {
        l0.p(jArr, "$this$take");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= k2.r(jArr)) {
                return e0.Q5(k2.c(jArr));
            }
            if (i10 == 1) {
                return be.v.k(j2.b(k2.p(jArr, 0)));
            }
            ArrayList arrayList = new ArrayList(i10);
            int r10 = k2.r(jArr);
            int i11 = 0;
            for (int i12 = 0; i12 < r10; i12++) {
                arrayList.add(j2.b(k2.p(jArr, i12)));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<u0<a2, a2>> td(@g byte[] bArr, @g byte[] bArr2) {
        l0.p(bArr, "$this$zip");
        l0.p(bArr2, "other");
        int min = Math.min(b2.r(bArr), b2.r(bArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(zd.r1.a(a2.b(b2.p(bArr, i10)), a2.b(b2.p(bArr2, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <V, M extends Map<? super e2, ? super V>> M u0(int[] iArr, M m10, l<? super e2, ? extends V> lVar) {
        l0.p(iArr, "$this$associateWithTo");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            m10.put(e2.b(p10), lVar.A(e2.b(p10)));
        }
        return m10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte[] u1(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        l0.p(bArr, "$this$copyInto");
        l0.p(bArr2, "destination");
        o.W0(bArr, bArr2, i10, i11, i12);
        return bArr2;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<a2> u2(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$filter");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            if (lVar.A(a2.b(p10)).booleanValue()) {
                arrayList.add(a2.b(p10));
            }
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> List<R> u3(byte[] bArr, p<? super Integer, ? super a2, ? extends Iterable<? extends R>> pVar) {
        l0.p(bArr, "$this$flatMapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int r10 = b2.r(bArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), a2.b(b2.p(bArr, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short u4(short[] sArr, int i10, l<? super Integer, p2> lVar) {
        l0.p(sArr, "$this$getOrElse");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > be.p.Ye(sArr)) ? lVar.A(Integer.valueOf(i10)).j0() : q2.p(sArr, i10);
    }

    @h1(version = "1.3")
    @t
    @h
    public static final j2 u5(@g long[] jArr) {
        l0.p(jArr, "$this$lastOrNull");
        if (k2.u(jArr)) {
            return null;
        }
        return j2.b(k2.p(jArr, k2.r(jArr) - 1));
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R u6(long[] jArr, Comparator<? super R> comparator, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!k2.u(jArr)) {
            R A = lVar.A(j2.b(k2.p(jArr, 0)));
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(j2.b(k2.p(jArr, o10.nextInt())));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Float u7(int[] iArr, l<? super e2, Float> lVar) {
        l0.p(iArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (f2.u(iArr)) {
            return null;
        }
        float floatValue = lVar.A(e2.b(f2.p(iArr, 0))).floatValue();
        s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(e2.b(f2.p(iArr, o10.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final short[] u8(@g short[] sArr, @g Collection<p2> collection) {
        l0.p(sArr, "$this$plus");
        l0.p(collection, "elements");
        int r10 = q2.r(sArr);
        short[] copyOf = Arrays.copyOf(sArr, q2.r(sArr) + collection.size());
        l0.o(copyOf, "copyOf(this, newSize)");
        for (p2 j02 : collection) {
            copyOf[r10] = j02.j0();
            r10++;
        }
        return q2.f(copyOf);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final void u9(int[] iArr) {
        l0.p(iArr, "$this$reverse");
        be.p.yr(iArr);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long ua(long[] jArr) {
        l0.p(jArr, "$this$single");
        return j2.l(be.p.Ft(jArr));
    }

    @g
    @h1(version = "1.3")
    @t
    public static final int[] ub(@g int[] iArr) {
        l0.p(iArr, "$this$sortedArray");
        if (f2.u(iArr)) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        int[] f10 = f2.f(copyOf);
        Wa(f10);
        return f10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<a2> uc(@g byte[] bArr, int i10) {
        l0.p(bArr, "$this$takeLast");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int r10 = b2.r(bArr);
            if (i10 >= r10) {
                return e0.Q5(b2.c(bArr));
            }
            if (i10 == 1) {
                return be.v.k(a2.b(b2.p(bArr, r10 - 1)));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = r10 - i10; i11 < r10; i11++) {
                arrayList.add(a2.b(b2.p(bArr, i11)));
            }
            return arrayList;
        }
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<u0<p2, p2>> ud(@g short[] sArr, @g short[] sArr2) {
        l0.p(sArr, "$this$zip");
        l0.p(sArr2, "other");
        int min = Math.min(q2.r(sArr), q2.r(sArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(zd.r1.a(p2.b(q2.p(sArr, i10)), p2.b(q2.p(sArr2, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <V, M extends Map<? super a2, ? super V>> M v0(byte[] bArr, M m10, l<? super a2, ? extends V> lVar) {
        l0.p(bArr, "$this$associateWithTo");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            byte p10 = b2.p(bArr, i10);
            m10.put(a2.b(p10), lVar.A(a2.b(p10)));
        }
        return m10;
    }

    public static /* synthetic */ byte[] v1(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = b2.r(bArr);
        }
        l0.p(bArr, "$this$copyInto");
        l0.p(bArr2, "destination");
        o.W0(bArr, bArr2, i10, i11, i12);
        return bArr2;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<j2> v2(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$filter");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            if (lVar.A(j2.b(p10)).booleanValue()) {
                arrayList.add(j2.b(p10));
            }
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> List<R> v3(int[] iArr, p<? super Integer, ? super e2, ? extends Iterable<? extends R>> pVar) {
        l0.p(iArr, "$this$flatMapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int r10 = f2.r(iArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), e2.b(f2.p(iArr, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int v4(int[] iArr, int i10, l<? super Integer, e2> lVar) {
        l0.p(iArr, "$this$getOrElse");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > be.p.Ve(iArr)) ? lVar.A(Integer.valueOf(i10)).l0() : f2.p(iArr, i10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final e2 v5(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$lastOrNull");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr) - 1;
        if (r10 < 0) {
            return null;
        }
        while (true) {
            int i10 = r10 - 1;
            int p10 = f2.p(iArr, r10);
            if (lVar.A(e2.b(p10)).booleanValue()) {
                return e2.b(p10);
            }
            if (i10 < 0) {
                return null;
            }
            r10 = i10;
        }
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R v6(byte[] bArr, Comparator<? super R> comparator, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$maxOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!b2.u(bArr)) {
            R A = lVar.A(a2.b(b2.p(bArr, 0)));
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(a2.b(b2.p(bArr, o10.nextInt())));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R extends Comparable<? super R>> R v7(short[] sArr, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (q2.u(sArr)) {
            return null;
        }
        R r10 = (Comparable) lVar.A(p2.b(q2.p(sArr, 0)));
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(p2.b(q2.p(sArr, o10.nextInt())));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int[] v8(int[] iArr, int i10) {
        l0.p(iArr, "$this$plus");
        return f2.f(o.R3(iArr, i10));
    }

    @h1(version = "1.4")
    @t
    @f
    public static final void v9(long[] jArr, int i10, int i11) {
        l0.p(jArr, "$this$reverse");
        be.p.Br(jArr, i10, i11);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int va(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$single");
        l0.p(lVar, "predicate");
        int r10 = f2.r(iArr);
        e2 e2Var = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            if (lVar.A(e2.b(p10)).booleanValue()) {
                if (!z10) {
                    e2Var = e2.b(p10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            return e2Var.l0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g
    @h1(version = "1.3")
    @t
    public static final byte[] vb(@g byte[] bArr) {
        l0.p(bArr, "$this$sortedArray");
        if (b2.u(bArr)) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        byte[] f10 = b2.f(copyOf);
        db(f10);
        return f10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<p2> vc(@g short[] sArr, int i10) {
        l0.p(sArr, "$this$takeLast");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int r10 = q2.r(sArr);
            if (i10 >= r10) {
                return e0.Q5(q2.c(sArr));
            }
            if (i10 == 1) {
                return be.v.k(p2.b(q2.p(sArr, r10 - 1)));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = r10 - i10; i11 < r10; i11++) {
                arrayList.add(p2.b(q2.p(sArr, i11)));
            }
            return arrayList;
        }
    }

    @h1(version = "1.3")
    @t
    @g
    public static final <R> List<u0<a2, R>> vd(@g byte[] bArr, @g R[] rArr) {
        l0.p(bArr, "$this$zip");
        l0.p(rArr, "other");
        int min = Math.min(b2.r(bArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            byte p10 = b2.p(bArr, i10);
            arrayList.add(zd.r1.a(a2.b(p10), rArr[i10]));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <V, M extends Map<? super j2, ? super V>> M w0(long[] jArr, M m10, l<? super j2, ? extends V> lVar) {
        l0.p(jArr, "$this$associateWithTo");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            long p10 = k2.p(jArr, i10);
            m10.put(j2.b(p10), lVar.A(j2.b(p10)));
        }
        return m10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int[] w1(int[] iArr, int[] iArr2, int i10, int i11, int i12) {
        l0.p(iArr, "$this$copyInto");
        l0.p(iArr2, "destination");
        o.a1(iArr, iArr2, i10, i11, i12);
        return iArr2;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<e2> w2(int[] iArr, l<? super e2, Boolean> lVar) {
        l0.p(iArr, "$this$filter");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = f2.r(iArr);
        for (int i10 = 0; i10 < r10; i10++) {
            int p10 = f2.p(iArr, i10);
            if (lVar.A(e2.b(p10)).booleanValue()) {
                arrayList.add(e2.b(p10));
            }
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> List<R> w3(long[] jArr, p<? super Integer, ? super j2, ? extends Iterable<? extends R>> pVar) {
        l0.p(jArr, "$this$flatMapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int r10 = k2.r(jArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), j2.b(k2.p(jArr, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long w4(long[] jArr, int i10, l<? super Integer, j2> lVar) {
        l0.p(jArr, "$this$getOrElse");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > be.p.We(jArr)) ? lVar.A(Integer.valueOf(i10)).l0() : k2.p(jArr, i10);
    }

    @h1(version = "1.3")
    @t
    @h
    public static final p2 w5(@g short[] sArr) {
        l0.p(sArr, "$this$lastOrNull");
        if (q2.u(sArr)) {
            return null;
        }
        return p2.b(q2.p(sArr, q2.r(sArr) - 1));
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R w6(short[] sArr, Comparator<? super R> comparator, l<? super p2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!q2.u(sArr)) {
            R A = lVar.A(p2.b(q2.p(sArr, 0)));
            s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(p2.b(q2.p(sArr, o10.nextInt())));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Double w7(short[] sArr, l<? super p2, Double> lVar) {
        l0.p(sArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (q2.u(sArr)) {
            return null;
        }
        double doubleValue = lVar.A(p2.b(q2.p(sArr, 0))).doubleValue();
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(p2.b(q2.p(sArr, o10.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final long[] w8(long[] jArr, long[] jArr2) {
        l0.p(jArr, "$this$plus");
        l0.p(jArr2, "elements");
        return k2.f(o.W3(jArr, jArr2));
    }

    @h1(version = "1.4")
    @t
    @f
    public static final void w9(byte[] bArr, int i10, int i11) {
        l0.p(bArr, "$this$reverse");
        be.p.rr(bArr, i10, i11);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short wa(short[] sArr) {
        l0.p(sArr, "$this$single");
        return p2.l(be.p.Jt(sArr));
    }

    @g
    @h1(version = "1.3")
    @t
    public static final long[] wb(@g long[] jArr) {
        l0.p(jArr, "$this$sortedArray");
        if (k2.u(jArr)) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        long[] f10 = k2.f(copyOf);
        eb(f10);
        return f10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<e2> wc(@g int[] iArr, int i10) {
        l0.p(iArr, "$this$takeLast");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int r10 = f2.r(iArr);
            if (i10 >= r10) {
                return e0.Q5(f2.c(iArr));
            }
            if (i10 == 1) {
                return be.v.k(e2.b(f2.p(iArr, r10 - 1)));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = r10 - i10; i11 < r10; i11++) {
                arrayList.add(e2.b(f2.p(iArr, i11)));
            }
            return arrayList;
        }
    }

    @h1(version = "1.3")
    @t
    @g
    public static final <R> List<u0<p2, R>> wd(@g short[] sArr, @g R[] rArr) {
        l0.p(sArr, "$this$zip");
        l0.p(rArr, "other");
        int min = Math.min(q2.r(sArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            short p10 = q2.p(sArr, i10);
            arrayList.add(zd.r1.a(p2.b(p10), rArr[i10]));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    public static final <V, M extends Map<? super p2, ? super V>> M x0(short[] sArr, M m10, l<? super p2, ? extends V> lVar) {
        l0.p(sArr, "$this$associateWithTo");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            m10.put(p2.b(p10), lVar.A(p2.b(p10)));
        }
        return m10;
    }

    public static /* synthetic */ int[] x1(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = f2.r(iArr);
        }
        l0.p(iArr, "$this$copyInto");
        l0.p(iArr2, "destination");
        o.a1(iArr, iArr2, i10, i11, i12);
        return iArr2;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<p2> x2(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$filter");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = q2.r(sArr);
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            if (lVar.A(p2.b(p10)).booleanValue()) {
                arrayList.add(p2.b(p10));
            }
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> List<R> x3(short[] sArr, p<? super Integer, ? super p2, ? extends Iterable<? extends R>> pVar) {
        l0.p(sArr, "$this$flatMapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int r10 = q2.r(sArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), p2.b(q2.p(sArr, i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte x4(byte[] bArr, int i10, l<? super Integer, a2> lVar) {
        l0.p(bArr, "$this$getOrElse");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > be.p.Re(bArr)) ? lVar.A(Integer.valueOf(i10)).j0() : b2.p(bArr, i10);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final p2 x5(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$lastOrNull");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr) - 1;
        if (r10 < 0) {
            return null;
        }
        while (true) {
            int i10 = r10 - 1;
            short p10 = q2.p(sArr, r10);
            if (lVar.A(p2.b(p10)).booleanValue()) {
                return p2.b(p10);
            }
            if (i10 < 0) {
                return null;
            }
            r10 = i10;
        }
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R x6(int[] iArr, Comparator<? super R> comparator, l<? super e2, ? extends R> lVar) {
        l0.p(iArr, "$this$maxOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!f2.u(iArr)) {
            R A = lVar.A(e2.b(f2.p(iArr, 0)));
            s0 o10 = new m(1, be.p.Ve(iArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(e2.b(f2.p(iArr, o10.nextInt())));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final Float x7(short[] sArr, l<? super p2, Float> lVar) {
        l0.p(sArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (q2.u(sArr)) {
            return null;
        }
        float floatValue = lVar.A(p2.b(q2.p(sArr, 0))).floatValue();
        s0 o10 = new m(1, be.p.Ye(sArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(p2.b(q2.p(sArr, o10.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.3")
    @t
    @g
    public static final byte[] x8(@g byte[] bArr, @g Collection<a2> collection) {
        l0.p(bArr, "$this$plus");
        l0.p(collection, "elements");
        int r10 = b2.r(bArr);
        byte[] copyOf = Arrays.copyOf(bArr, b2.r(bArr) + collection.size());
        l0.o(copyOf, "copyOf(this, newSize)");
        for (a2 j02 : collection) {
            copyOf[r10] = j02.j0();
            r10++;
        }
        return b2.f(copyOf);
    }

    @h1(version = "1.4")
    @t
    @f
    public static final void x9(short[] sArr, int i10, int i11) {
        l0.p(sArr, "$this$reverse");
        be.p.Fr(sArr, i10, i11);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final short xa(short[] sArr, l<? super p2, Boolean> lVar) {
        l0.p(sArr, "$this$single");
        l0.p(lVar, "predicate");
        int r10 = q2.r(sArr);
        p2 p2Var = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < r10; i10++) {
            short p10 = q2.p(sArr, i10);
            if (lVar.A(p2.b(p10)).booleanValue()) {
                if (!z10) {
                    p2Var = p2.b(p10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            return p2Var.j0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g
    @h1(version = "1.3")
    @t
    public static final short[] xb(@g short[] sArr) {
        l0.p(sArr, "$this$sortedArray");
        if (q2.u(sArr)) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        short[] f10 = q2.f(copyOf);
        hb(f10);
        return f10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<j2> xc(@g long[] jArr, int i10) {
        l0.p(jArr, "$this$takeLast");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int r10 = k2.r(jArr);
            if (i10 >= r10) {
                return e0.Q5(k2.c(jArr));
            }
            if (i10 == 1) {
                return be.v.k(j2.b(k2.p(jArr, r10 - 1)));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = r10 - i10; i11 < r10; i11++) {
                arrayList.add(j2.b(k2.p(jArr, i11)));
            }
            return arrayList;
        }
    }

    @h1(version = "1.3")
    @t
    @g
    public static final List<u0<j2, j2>> xd(@g long[] jArr, @g long[] jArr2) {
        l0.p(jArr, "$this$zip");
        l0.p(jArr2, "other");
        int min = Math.min(k2.r(jArr), k2.r(jArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(zd.r1.a(j2.b(k2.p(jArr, i10)), j2.b(k2.p(jArr2, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int y0(int[] iArr) {
        l0.p(iArr, "$this$component1");
        return f2.p(iArr, 0);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int[] y1(int[] iArr) {
        l0.p(iArr, "$this$copyOf");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return f2.f(copyOf);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<a2> y2(byte[] bArr, p<? super Integer, ? super a2, Boolean> pVar) {
        l0.p(bArr, "$this$filterIndexed");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = b2.r(bArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            byte p10 = b2.p(bArr, i10);
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), a2.b(p10)).booleanValue()) {
                arrayList.add(a2.b(p10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R, C extends Collection<? super R>> C y3(int[] iArr, C c10, p<? super Integer, ? super e2, ? extends Iterable<? extends R>> pVar) {
        l0.p(iArr, "$this$flatMapIndexedTo");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int r10 = f2.r(iArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), e2.b(f2.p(iArr, i10))));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.3")
    @t
    @h
    public static final a2 y4(@g byte[] bArr, int i10) {
        l0.p(bArr, "$this$getOrNull");
        if (i10 < 0 || i10 > be.p.Re(bArr)) {
            return null;
        }
        return a2.b(b2.p(bArr, i10));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R> List<R> y5(byte[] bArr, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$map");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(b2.r(bArr));
        int r10 = b2.r(bArr);
        for (int i10 = 0; i10 < r10; i10++) {
            arrayList.add(lVar.A(a2.b(b2.p(bArr, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R y6(long[] jArr, Comparator<? super R> comparator, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (k2.u(jArr)) {
            return null;
        }
        R A = lVar.A(j2.b(k2.p(jArr, 0)));
        s0 o10 = new m(1, be.p.We(jArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(j2.b(k2.p(jArr, o10.nextInt())));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R y7(long[] jArr, Comparator<? super R> comparator, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$minOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!k2.u(jArr)) {
            R A = lVar.A(j2.b(k2.p(jArr, 0)));
            s0 o10 = new m(1, be.p.We(jArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(j2.b(k2.p(jArr, o10.nextInt())));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    @f
    public static final int y8(int[] iArr) {
        l0.p(iArr, "$this$random");
        return z8(iArr, ef.f.O);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final void y9(byte[] bArr) {
        l0.p(bArr, "$this$reverse");
        be.p.qr(bArr);
    }

    @h1(version = "1.3")
    @t
    @h
    public static final e2 ya(@g int[] iArr) {
        l0.p(iArr, "$this$singleOrNull");
        if (f2.r(iArr) == 1) {
            return e2.b(f2.p(iArr, 0));
        }
        return null;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final int[] yb(@g int[] iArr) {
        l0.p(iArr, "$this$sortedArrayDescending");
        if (f2.u(iArr)) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        int[] f10 = f2.f(copyOf);
        ib(f10);
        return f10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<a2> yc(byte[] bArr, l<? super a2, Boolean> lVar) {
        l0.p(bArr, "$this$takeLastWhile");
        l0.p(lVar, "predicate");
        for (int Re = be.p.Re(bArr); -1 < Re; Re--) {
            if (!lVar.A(a2.b(b2.p(bArr, Re))).booleanValue()) {
                return O1(bArr, Re + 1);
            }
        }
        return e0.Q5(b2.c(bArr));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte z0(byte[] bArr) {
        l0.p(bArr, "$this$component1");
        return b2.p(bArr, 0);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final byte[] z1(byte[] bArr) {
        l0.p(bArr, "$this$copyOf");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return b2.f(copyOf);
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<e2> z2(int[] iArr, p<? super Integer, ? super e2, Boolean> pVar) {
        l0.p(iArr, "$this$filterIndexed");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int r10 = f2.r(iArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            int p10 = f2.p(iArr, i10);
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), e2.b(p10)).booleanValue()) {
                arrayList.add(e2.b(p10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R, C extends Collection<? super R>> C z3(short[] sArr, C c10, p<? super Integer, ? super p2, ? extends Iterable<? extends R>> pVar) {
        l0.p(sArr, "$this$flatMapIndexedTo");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int r10 = q2.r(sArr);
        int i10 = 0;
        int i11 = 0;
        while (i10 < r10) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), p2.b(q2.p(sArr, i10))));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.3")
    @t
    @h
    public static final p2 z4(@g short[] sArr, int i10) {
        l0.p(sArr, "$this$getOrNull");
        if (i10 < 0 || i10 > be.p.Ye(sArr)) {
            return null;
        }
        return p2.b(q2.p(sArr, i10));
    }

    @h1(version = "1.3")
    @t
    @f
    public static final <R> List<R> z5(long[] jArr, l<? super j2, ? extends R> lVar) {
        l0.p(jArr, "$this$map");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(k2.r(jArr));
        int r10 = k2.r(jArr);
        for (int i10 = 0; i10 < r10; i10++) {
            arrayList.add(lVar.A(j2.b(k2.p(jArr, i10))));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R z6(byte[] bArr, Comparator<? super R> comparator, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$maxOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (b2.u(bArr)) {
            return null;
        }
        R A = lVar.A(a2.b(b2.p(bArr, 0)));
        s0 o10 = new m(1, be.p.Re(bArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(a2.b(b2.p(bArr, o10.nextInt())));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.4")
    @t
    @f
    @t0
    public static final <R> R z7(byte[] bArr, Comparator<? super R> comparator, l<? super a2, ? extends R> lVar) {
        l0.p(bArr, "$this$minOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!b2.u(bArr)) {
            R A = lVar.A(a2.b(b2.p(bArr, 0)));
            s0 o10 = new m(1, be.p.Re(bArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(a2.b(b2.p(bArr, o10.nextInt())));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @t
    public static final int z8(@g int[] iArr, @g ef.f fVar) {
        l0.p(iArr, "$this$random");
        l0.p(fVar, "random");
        if (!f2.u(iArr)) {
            return f2.p(iArr, fVar.m(f2.r(iArr)));
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.3")
    @t
    @f
    public static final void z9(long[] jArr) {
        l0.p(jArr, "$this$reverse");
        be.p.Ar(jArr);
    }

    @h1(version = "1.3")
    @t
    @h
    public static final a2 za(@g byte[] bArr) {
        l0.p(bArr, "$this$singleOrNull");
        if (b2.r(bArr) == 1) {
            return a2.b(b2.p(bArr, 0));
        }
        return null;
    }

    @g
    @h1(version = "1.3")
    @t
    public static final byte[] zb(@g byte[] bArr) {
        l0.p(bArr, "$this$sortedArrayDescending");
        if (b2.u(bArr)) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        byte[] f10 = b2.f(copyOf);
        mb(f10);
        return f10;
    }

    @h1(version = "1.3")
    @t
    @f
    public static final List<j2> zc(long[] jArr, l<? super j2, Boolean> lVar) {
        l0.p(jArr, "$this$takeLastWhile");
        l0.p(lVar, "predicate");
        for (int We = be.p.We(jArr); -1 < We; We--) {
            if (!lVar.A(j2.b(k2.p(jArr, We))).booleanValue()) {
                return R1(jArr, We + 1);
            }
        }
        return e0.Q5(k2.c(jArr));
    }
}
