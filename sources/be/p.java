package be;

import fe.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import xe.l0;
import xe.n0;
import zd.b1;
import zd.e2;
import zd.h1;
import zd.j2;
import zd.r1;
import zd.t0;
import zd.u0;
import zd.u2;
import zd.y2;

public class p extends o {

    public static final class a implements Iterable<T>, ye.a {
        public final /* synthetic */ Object[] O;

        public a(Object[] objArr) {
            this.O = objArr;
        }

        @fh.g
        public Iterator<T> iterator() {
            return xe.i.a(this.O);
        }
    }

    public static final class a0 extends n0 implements we.a<Iterator<? extends Boolean>> {
        public final /* synthetic */ boolean[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a0(boolean[] zArr) {
            super(0);
            this.P = zArr;
        }

        @fh.g
        /* renamed from: c */
        public final Iterator<Boolean> n() {
            return xe.j.a(this.P);
        }
    }

    public static final class b implements Iterable<Byte>, ye.a {
        public final /* synthetic */ byte[] O;

        public b(byte[] bArr) {
            this.O = bArr;
        }

        @fh.g
        public Iterator<Byte> iterator() {
            return xe.j.b(this.O);
        }
    }

    public static final class b0 extends n0 implements we.a<Iterator<? extends Character>> {
        public final /* synthetic */ char[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b0(char[] cArr) {
            super(0);
            this.P = cArr;
        }

        @fh.g
        /* renamed from: c */
        public final Iterator<Character> n() {
            return xe.j.c(this.P);
        }
    }

    public static final class c implements Iterable<Short>, ye.a {
        public final /* synthetic */ short[] O;

        public c(short[] sArr) {
            this.O = sArr;
        }

        @fh.g
        public Iterator<Short> iterator() {
            return xe.j.h(this.O);
        }
    }

    public static final class d implements Iterable<Integer>, ye.a {
        public final /* synthetic */ int[] O;

        public d(int[] iArr) {
            this.O = iArr;
        }

        @fh.g
        public Iterator<Integer> iterator() {
            return xe.j.f(this.O);
        }
    }

    public static final class e implements Iterable<Long>, ye.a {
        public final /* synthetic */ long[] O;

        public e(long[] jArr) {
            this.O = jArr;
        }

        @fh.g
        public Iterator<Long> iterator() {
            return xe.j.g(this.O);
        }
    }

    public static final class f implements Iterable<Float>, ye.a {
        public final /* synthetic */ float[] O;

        public f(float[] fArr) {
            this.O = fArr;
        }

        @fh.g
        public Iterator<Float> iterator() {
            return xe.j.e(this.O);
        }
    }

    public static final class g implements Iterable<Double>, ye.a {
        public final /* synthetic */ double[] O;

        public g(double[] dArr) {
            this.O = dArr;
        }

        @fh.g
        public Iterator<Double> iterator() {
            return xe.j.d(this.O);
        }
    }

    public static final class h implements Iterable<Boolean>, ye.a {
        public final /* synthetic */ boolean[] O;

        public h(boolean[] zArr) {
            this.O = zArr;
        }

        @fh.g
        public Iterator<Boolean> iterator() {
            return xe.j.a(this.O);
        }
    }

    public static final class i implements Iterable<Character>, ye.a {
        public final /* synthetic */ char[] O;

        public i(char[] cArr) {
            this.O = cArr;
        }

        @fh.g
        public Iterator<Character> iterator() {
            return xe.j.c(this.O);
        }
    }

    public static final class j implements p000if.m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object[] f16219a;

        public j(Object[] objArr) {
            this.f16219a = objArr;
        }

        @fh.g
        public Iterator<T> iterator() {
            return xe.i.a(this.f16219a);
        }
    }

    public static final class k implements p000if.m<Byte> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f16220a;

        public k(byte[] bArr) {
            this.f16220a = bArr;
        }

        @fh.g
        public Iterator<Byte> iterator() {
            return xe.j.b(this.f16220a);
        }
    }

    public static final class l implements p000if.m<Short> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ short[] f16221a;

        public l(short[] sArr) {
            this.f16221a = sArr;
        }

        @fh.g
        public Iterator<Short> iterator() {
            return xe.j.h(this.f16221a);
        }
    }

    public static final class m implements p000if.m<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f16222a;

        public m(int[] iArr) {
            this.f16222a = iArr;
        }

        @fh.g
        public Iterator<Integer> iterator() {
            return xe.j.f(this.f16222a);
        }
    }

    public static final class n implements p000if.m<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long[] f16223a;

        public n(long[] jArr) {
            this.f16223a = jArr;
        }

        @fh.g
        public Iterator<Long> iterator() {
            return xe.j.g(this.f16223a);
        }
    }

    public static final class o implements p000if.m<Float> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float[] f16224a;

        public o(float[] fArr) {
            this.f16224a = fArr;
        }

        @fh.g
        public Iterator<Float> iterator() {
            return xe.j.e(this.f16224a);
        }
    }

    /* renamed from: be.p$p  reason: collision with other inner class name */
    public static final class C0262p implements p000if.m<Double> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ double[] f16225a;

        public C0262p(double[] dArr) {
            this.f16225a = dArr;
        }

        @fh.g
        public Iterator<Double> iterator() {
            return xe.j.d(this.f16225a);
        }
    }

    public static final class q implements p000if.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f16226a;

        public q(boolean[] zArr) {
            this.f16226a = zArr;
        }

        @fh.g
        public Iterator<Boolean> iterator() {
            return xe.j.a(this.f16226a);
        }
    }

    public static final class r implements p000if.m<Character> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ char[] f16227a;

        public r(char[] cArr) {
            this.f16227a = cArr;
        }

        @fh.g
        public Iterator<Character> iterator() {
            return xe.j.c(this.f16227a);
        }
    }

    public static final class s implements l0<T, K> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ T[] f16228a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ we.l<T, K> f16229b;

        public s(T[] tArr, we.l<? super T, ? extends K> lVar) {
            this.f16228a = tArr;
            this.f16229b = lVar;
        }

        public K a(T t10) {
            return this.f16229b.A(t10);
        }

        @fh.g
        public Iterator<T> b() {
            return xe.i.a(this.f16228a);
        }
    }

    public static final class t extends n0 implements we.a<Iterator<? extends T>> {
        public final /* synthetic */ T[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(T[] tArr) {
            super(0);
            this.P = tArr;
        }

        @fh.g
        /* renamed from: c */
        public final Iterator<T> n() {
            return xe.i.a(this.P);
        }
    }

    public static final class u extends n0 implements we.a<Iterator<? extends Byte>> {
        public final /* synthetic */ byte[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(byte[] bArr) {
            super(0);
            this.P = bArr;
        }

        @fh.g
        /* renamed from: c */
        public final Iterator<Byte> n() {
            return xe.j.b(this.P);
        }
    }

    public static final class v extends n0 implements we.a<Iterator<? extends Short>> {
        public final /* synthetic */ short[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(short[] sArr) {
            super(0);
            this.P = sArr;
        }

        @fh.g
        /* renamed from: c */
        public final Iterator<Short> n() {
            return xe.j.h(this.P);
        }
    }

    public static final class w extends n0 implements we.a<Iterator<? extends Integer>> {
        public final /* synthetic */ int[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(int[] iArr) {
            super(0);
            this.P = iArr;
        }

        @fh.g
        /* renamed from: c */
        public final Iterator<Integer> n() {
            return xe.j.f(this.P);
        }
    }

    public static final class x extends n0 implements we.a<Iterator<? extends Long>> {
        public final /* synthetic */ long[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public x(long[] jArr) {
            super(0);
            this.P = jArr;
        }

        @fh.g
        /* renamed from: c */
        public final Iterator<Long> n() {
            return xe.j.g(this.P);
        }
    }

    public static final class y extends n0 implements we.a<Iterator<? extends Float>> {
        public final /* synthetic */ float[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public y(float[] fArr) {
            super(0);
            this.P = fArr;
        }

        @fh.g
        /* renamed from: c */
        public final Iterator<Float> n() {
            return xe.j.e(this.P);
        }
    }

    public static final class z extends n0 implements we.a<Iterator<? extends Double>> {
        public final /* synthetic */ double[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public z(double[] dArr) {
            super(0);
            this.P = dArr;
        }

        @fh.g
        /* renamed from: c */
        public final Iterator<Double> n() {
            return xe.j.d(this.P);
        }
    }

    public static final boolean A5(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        for (long valueOf : jArr) {
            if (!lVar.A(Long.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fh.g
    public static final <K, V> Map<K, V> A6(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends K> lVar, @fh.g we.l<? super Character, ? extends V> lVar2) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(cArr.length), 16));
        for (char c10 : cArr) {
            linkedHashMap.put(lVar.A(Character.valueOf(c10)), lVar2.A(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V, M extends Map<? super Character, ? super V>> M A7(char[] cArr, M m10, we.l<? super Character, ? extends V> lVar) {
        l0.p(cArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        for (char c10 : cArr) {
            m10.put(Character.valueOf(c10), lVar.A(Character.valueOf(c10)));
        }
        return m10;
    }

    @oe.f
    public static final long A8(long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr[3];
    }

    @fh.g
    public static final <K> List<Float> A9(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends K> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (hashSet.add(lVar.A(Float.valueOf(f10)))) {
                arrayList.add(Float.valueOf(f10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <R> List<u0<Float, R>> AA(@fh.g float[] fArr, @fh.g Iterable<? extends R> iterable) {
        l0.p(fArr, "<this>");
        l0.p(iterable, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(r1.a(Float.valueOf(fArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @oe.f
    public static final Byte Aa(byte[] bArr, int i10) {
        l0.p(bArr, "<this>");
        return kf(bArr, i10);
    }

    @fh.g
    public static final <C extends Collection<? super Integer>> C Ab(@fh.g int[] iArr, @fh.g C c10, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (int i10 : iArr) {
            if (!lVar.A(Integer.valueOf(i10)).booleanValue()) {
                c10.add(Integer.valueOf(i10));
            }
        }
        return c10;
    }

    @fh.h
    public static final Boolean Ac(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C Ad(@fh.g float[] fArr, @fh.g C c10, @fh.g we.l<? super Float, ? extends Iterable<? extends R>> lVar) {
        l0.p(fArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (float valueOf : fArr) {
            b0.o0(c10, (Iterable) lVar.A(Float.valueOf(valueOf)));
        }
        return c10;
    }

    public static final void Ae(@fh.g char[] cArr, @fh.g we.p<? super Integer, ? super Character, u2> pVar) {
        l0.p(cArr, "<this>");
        l0.p(pVar, "action");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
    }

    @fh.g
    public static final <K> Map<K, List<Integer>> Af(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends K> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            Object A = lVar.A(Integer.valueOf(i10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(Integer.valueOf(i10));
        }
        return linkedHashMap;
    }

    public static final int Ag(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (lVar.A(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final String Ah(@fh.g float[] fArr, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Float, ? extends CharSequence> lVar) {
        l0.p(fArr, "<this>");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        String sb2 = ((StringBuilder) ih(fArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l0.o(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @fh.h
    public static final Integer Ai(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Float Aj(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int Ue = Ue(fArr);
        if (Ue == 0) {
            return Float.valueOf(f10);
        }
        Comparable comparable = (Comparable) lVar.A(Float.valueOf(f10));
        s0 o10 = new gf.m(1, Ue).iterator();
        while (o10.hasNext()) {
            float f11 = fArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Float.valueOf(f11));
            if (comparable.compareTo(comparable2) < 0) {
                f10 = f11;
                comparable = comparable2;
            }
        }
        return Float.valueOf(f10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double Ak(double[] dArr, we.l<? super Double, Double> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Double.valueOf(dArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(Double.valueOf(dArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.7")
    @fh.g
    @ve.h(name = "maxOrThrow")
    public static final <T extends Comparable<? super T>> T Al(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (!(tArr.length == 0)) {
            T t10 = tArr[0];
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            while (o10.hasNext()) {
                T t11 = tArr[o10.nextInt()];
                if (t10.compareTo(t11) < 0) {
                    t10 = t11;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float Am(long[] jArr, we.l<? super Long, Float> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (!(jArr.length == 0)) {
            float floatValue = lVar.A(Long.valueOf(jArr[0])).floatValue();
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(Long.valueOf(jArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R An(float[] fArr, Comparator<? super R> comparator, we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R A = lVar.A(Float.valueOf(fArr[0]));
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Float.valueOf(fArr[o10.nextInt()]));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    public static final boolean Ao(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr.length == 0;
    }

    @h1(version = "1.3")
    public static final short Ap(@fh.g short[] sArr, @fh.g ef.f fVar) {
        l0.p(sArr, "<this>");
        l0.p(fVar, "random");
        if (!(sArr.length == 0)) {
            return sArr[fVar.m(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Float Aq(@fh.g float[] fArr, @fh.g we.p<? super Float, ? super Float, Float> pVar) {
        l0.p(fArr, "<this>");
        l0.p(pVar, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            f10 = pVar.g0(Float.valueOf(f10), Float.valueOf(fArr[o10.nextInt()])).floatValue();
        }
        return Float.valueOf(f10);
    }

    public static final void Ar(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length >= 0) {
            int We = We(jArr);
            s0 o10 = new gf.m(0, length).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                long j10 = jArr[nextInt];
                jArr[nextInt] = jArr[We];
                jArr[We] = j10;
                We--;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Boolean> As(boolean[] zArr, we.p<? super Boolean, ? super Boolean, Boolean> pVar) {
        l0.p(zArr, "<this>");
        l0.p(pVar, "operation");
        if (zArr.length == 0) {
            return w.E();
        }
        boolean z10 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z10));
        int length = zArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            z10 = pVar.g0(Boolean.valueOf(z10), Boolean.valueOf(zArr[i10])).booleanValue();
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static final double At(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        Double d10 = null;
        boolean z10 = false;
        for (double d11 : dArr) {
            if (lVar.A(Double.valueOf(d11)).booleanValue()) {
                if (!z10) {
                    d10 = Double.valueOf(d11);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            l0.n(d10, "null cannot be cast to non-null type kotlin.Double");
            return d10.doubleValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final char[] Au(@fh.g char[] cArr, @fh.g Collection<Integer> collection) {
        l0.p(cArr, "<this>");
        l0.p(collection, "indices");
        char[] cArr2 = new char[collection.size()];
        int i10 = 0;
        for (Integer intValue : collection) {
            cArr2[i10] = cArr[intValue.intValue()];
            i10++;
        }
        return cArr2;
    }

    @fh.g
    public static final float[] Av(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        Xu(copyOf);
        return copyOf;
    }

    public static final int Aw(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 += b10;
        }
        return i10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long Ax(short[] sArr, we.l<? super Short, Long> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        long j10 = 0;
        for (short valueOf : sArr) {
            j10 += lVar.A(Short.valueOf(valueOf)).longValue();
        }
        return j10;
    }

    @fh.g
    public static final List<Float> Ay(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (!lVar.A(Float.valueOf(f10)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    @fh.g
    public static final Set<Float> Az(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        return (Set) My(fArr, new LinkedHashSet(z0.j(fArr.length)));
    }

    public static final <T> boolean B5(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        for (T A : tArr) {
            if (!lVar.A(A).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fh.g
    public static final <K> Map<K, Double> B6(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends K> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(dArr.length), 16));
        for (double d10 : dArr) {
            linkedHashMap.put(lVar.A(Double.valueOf(d10)), Double.valueOf(d10));
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V, M extends Map<? super Double, ? super V>> M B7(double[] dArr, M m10, we.l<? super Double, ? extends V> lVar) {
        l0.p(dArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        for (double d10 : dArr) {
            m10.put(Double.valueOf(d10), lVar.A(Double.valueOf(d10)));
        }
        return m10;
    }

    @oe.f
    public static final <T> T B8(T[] tArr) {
        l0.p(tArr, "<this>");
        return tArr[3];
    }

    @fh.g
    public static final <K> List<Integer> B9(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends K> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (hashSet.add(lVar.A(Integer.valueOf(i10)))) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <R, V> List<V> BA(@fh.g float[] fArr, @fh.g Iterable<? extends R> iterable, @fh.g we.p<? super Float, ? super R, ? extends V> pVar) {
        l0.p(fArr, "<this>");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(pVar.g0(Float.valueOf(fArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @oe.f
    public static final Character Ba(char[] cArr, int i10) {
        l0.p(cArr, "<this>");
        return lf(cArr, i10);
    }

    @fh.g
    public static final <C extends Collection<? super Long>> C Bb(@fh.g long[] jArr, @fh.g C c10, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (long j10 : jArr) {
            if (!lVar.A(Long.valueOf(j10)).booleanValue()) {
                c10.add(Long.valueOf(j10));
            }
        }
        return c10;
    }

    @fh.h
    public static final Boolean Bc(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        for (boolean z10 : zArr) {
            if (lVar.A(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C Bd(@fh.g int[] iArr, @fh.g C c10, @fh.g we.l<? super Integer, ? extends Iterable<? extends R>> lVar) {
        l0.p(iArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (int valueOf : iArr) {
            b0.o0(c10, (Iterable) lVar.A(Integer.valueOf(valueOf)));
        }
        return c10;
    }

    public static final void Be(@fh.g double[] dArr, @fh.g we.p<? super Integer, ? super Double, u2> pVar) {
        l0.p(dArr, "<this>");
        l0.p(pVar, "action");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
    }

    @fh.g
    public static final <K, V> Map<K, List<V>> Bf(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends K> lVar, @fh.g we.l<? super Integer, ? extends V> lVar2) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            Object A = lVar.A(Integer.valueOf(i10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    public static final <T> int Bg(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (lVar.A(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final String Bh(@fh.g int[] iArr, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Integer, ? extends CharSequence> lVar) {
        l0.p(iArr, "<this>");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        String sb2 = ((StringBuilder) jh(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l0.o(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @fh.h
    public static final Integer Bi(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            int i11 = iArr[length];
            if (lVar.A(Integer.valueOf(i11)).booleanValue()) {
                return Integer.valueOf(i11);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Integer Bj(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int Ve = Ve(iArr);
        if (Ve == 0) {
            return Integer.valueOf(i10);
        }
        Comparable comparable = (Comparable) lVar.A(Integer.valueOf(i10));
        s0 o10 = new gf.m(1, Ve).iterator();
        while (o10.hasNext()) {
            int i11 = iArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Integer.valueOf(i11));
            if (comparable.compareTo(comparable2) < 0) {
                i10 = i11;
                comparable = comparable2;
            }
        }
        return Integer.valueOf(i10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double Bk(float[] fArr, we.l<? super Float, Double> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Float.valueOf(fArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(Float.valueOf(fArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final short Bl(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (!(sArr.length == 0)) {
            short s10 = sArr[0];
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                short s11 = sArr[o10.nextInt()];
                if (s10 < s11) {
                    s10 = s11;
                }
            }
            return s10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> float Bm(T[] tArr, we.l<? super T, Float> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (!(tArr.length == 0)) {
            float floatValue = lVar.A(tArr[0]).floatValue();
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(tArr[o10.nextInt()]).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R Bn(int[] iArr, Comparator<? super R> comparator, we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R A = lVar.A(Integer.valueOf(iArr[0]));
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Integer.valueOf(iArr[o10.nextInt()]));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    public static final boolean Bo(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        for (int valueOf : iArr) {
            if (lVar.A(Integer.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.3")
    @oe.f
    public static final boolean Bp(boolean[] zArr) {
        l0.p(zArr, "<this>");
        return Cp(zArr, ef.f.O);
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Integer Bq(@fh.g int[] iArr, @fh.g we.p<? super Integer, ? super Integer, Integer> pVar) {
        l0.p(iArr, "<this>");
        l0.p(pVar, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            i10 = pVar.g0(Integer.valueOf(i10), Integer.valueOf(iArr[o10.nextInt()])).intValue();
        }
        return Integer.valueOf(i10);
    }

    @h1(version = "1.4")
    public static final void Br(@fh.g long[] jArr, int i10, int i11) {
        l0.p(jArr, "<this>");
        c.O.d(i10, i11, jArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 != i12) {
            int i13 = i11 - 1;
            while (i10 < i12) {
                long j10 = jArr[i10];
                jArr[i10] = jArr[i13];
                jArr[i13] = j10;
                i13--;
                i10++;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Byte> Bs(byte[] bArr, we.q<? super Integer, ? super Byte, ? super Byte, Byte> qVar) {
        l0.p(bArr, "<this>");
        l0.p(qVar, "operation");
        if (bArr.length == 0) {
            return w.E();
        }
        byte b10 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b10));
        int length = bArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            b10 = qVar.y(Integer.valueOf(i10), Byte.valueOf(b10), Byte.valueOf(bArr[i10])).byteValue();
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static final float Bt(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return fArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    @fh.g
    public static final double[] Bu(@fh.g double[] dArr, @fh.g gf.m mVar) {
        l0.p(dArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? new double[0] : o.I1(dArr, mVar.c().intValue(), mVar.h().intValue() + 1);
    }

    @fh.g
    public static final int[] Bv(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        Zu(copyOf);
        return copyOf;
    }

    public static final int Bw(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long Bx(boolean[] zArr, we.l<? super Boolean, Long> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        long j10 = 0;
        for (boolean valueOf : zArr) {
            j10 += lVar.A(Boolean.valueOf(valueOf)).longValue();
        }
        return j10;
    }

    @fh.g
    public static final List<Integer> By(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (!lVar.A(Integer.valueOf(i10)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    @fh.g
    public static final Set<Integer> Bz(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        return (Set) Ny(iArr, new LinkedHashSet(z0.j(iArr.length)));
    }

    public static final boolean C5(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        for (short valueOf : sArr) {
            if (!lVar.A(Short.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fh.g
    public static final <K, V> Map<K, V> C6(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends K> lVar, @fh.g we.l<? super Double, ? extends V> lVar2) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(dArr.length), 16));
        for (double d10 : dArr) {
            linkedHashMap.put(lVar.A(Double.valueOf(d10)), lVar2.A(Double.valueOf(d10)));
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V, M extends Map<? super Float, ? super V>> M C7(float[] fArr, M m10, we.l<? super Float, ? extends V> lVar) {
        l0.p(fArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        for (float f10 : fArr) {
            m10.put(Float.valueOf(f10), lVar.A(Float.valueOf(f10)));
        }
        return m10;
    }

    @oe.f
    public static final short C8(short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr[3];
    }

    @fh.g
    public static final <K> List<Long> C9(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends K> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (hashSet.add(lVar.A(Long.valueOf(j10)))) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final List<u0<Float, Float>> CA(@fh.g float[] fArr, @fh.g float[] fArr2) {
        l0.p(fArr, "<this>");
        l0.p(fArr2, "other");
        int min = Math.min(fArr.length, fArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(r1.a(Float.valueOf(fArr[i10]), Float.valueOf(fArr2[i10])));
        }
        return arrayList;
    }

    @oe.f
    public static final Double Ca(double[] dArr, int i10) {
        l0.p(dArr, "<this>");
        return mf(dArr, i10);
    }

    @fh.g
    public static final <T, C extends Collection<? super T>> C Cb(@fh.g T[] tArr, @fh.g C c10, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (T t10 : tArr) {
            if (!lVar.A(t10).booleanValue()) {
                c10.add(t10);
            }
        }
        return c10;
    }

    @fh.h
    public static final Byte Cc(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C Cd(@fh.g long[] jArr, @fh.g C c10, @fh.g we.l<? super Long, ? extends Iterable<? extends R>> lVar) {
        l0.p(jArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (long valueOf : jArr) {
            b0.o0(c10, (Iterable) lVar.A(Long.valueOf(valueOf)));
        }
        return c10;
    }

    public static final void Ce(@fh.g float[] fArr, @fh.g we.p<? super Integer, ? super Float, u2> pVar) {
        l0.p(fArr, "<this>");
        l0.p(pVar, "action");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Float.valueOf(fArr[i10]));
            i10++;
            i11++;
        }
    }

    @fh.g
    public static final <K> Map<K, List<Long>> Cf(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends K> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j10 : jArr) {
            Object A = lVar.A(Long.valueOf(j10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(Long.valueOf(j10));
        }
        return linkedHashMap;
    }

    public static final int Cg(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (lVar.A(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final String Ch(@fh.g long[] jArr, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Long, ? extends CharSequence> lVar) {
        l0.p(jArr, "<this>");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        String sb2 = ((StringBuilder) kh(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l0.o(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @fh.h
    public static final Long Ci(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Long Cj(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int We = We(jArr);
        if (We == 0) {
            return Long.valueOf(j10);
        }
        Comparable comparable = (Comparable) lVar.A(Long.valueOf(j10));
        s0 o10 = new gf.m(1, We).iterator();
        while (o10.hasNext()) {
            long j11 = jArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Long.valueOf(j11));
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double Ck(int[] iArr, we.l<? super Integer, Double> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Integer.valueOf(iArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(Integer.valueOf(iArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Boolean Cl(@fh.g boolean[] zArr, @fh.g Comparator<? super Boolean> comparator) {
        l0.p(zArr, "<this>");
        l0.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        s0 o10 = new gf.m(1, Ze(zArr)).iterator();
        while (o10.hasNext()) {
            boolean z11 = zArr[o10.nextInt()];
            if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) < 0) {
                z10 = z11;
            }
        }
        return Boolean.valueOf(z10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float Cm(short[] sArr, we.l<? super Short, Float> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (!(sArr.length == 0)) {
            float floatValue = lVar.A(Short.valueOf(sArr[0])).floatValue();
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(Short.valueOf(sArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R Cn(long[] jArr, Comparator<? super R> comparator, we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R A = lVar.A(Long.valueOf(jArr[0]));
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Long.valueOf(jArr[o10.nextInt()]));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    public static final boolean Co(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr.length == 0;
    }

    @h1(version = "1.3")
    public static final boolean Cp(@fh.g boolean[] zArr, @fh.g ef.f fVar) {
        l0.p(zArr, "<this>");
        l0.p(fVar, "random");
        if (!(zArr.length == 0)) {
            return zArr[fVar.m(zArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Long Cq(@fh.g long[] jArr, @fh.g we.p<? super Long, ? super Long, Long> pVar) {
        l0.p(jArr, "<this>");
        l0.p(pVar, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            j10 = pVar.g0(Long.valueOf(j10), Long.valueOf(jArr[o10.nextInt()])).longValue();
        }
        return Long.valueOf(j10);
    }

    public static final <T> void Cr(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length >= 0) {
            int Xe = Xe(tArr);
            s0 o10 = new gf.m(0, length).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                T t10 = tArr[nextInt];
                tArr[nextInt] = tArr[Xe];
                tArr[Xe] = t10;
                Xe--;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Character> Cs(char[] cArr, we.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(cArr, "<this>");
        l0.p(qVar, "operation");
        if (cArr.length == 0) {
            return w.E();
        }
        char c10 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c10));
        int length = cArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            c10 = qVar.y(Integer.valueOf(i10), Character.valueOf(c10), Character.valueOf(cArr[i10])).charValue();
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    public static final float Ct(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        Float f10 = null;
        boolean z10 = false;
        for (float f11 : fArr) {
            if (lVar.A(Float.valueOf(f11)).booleanValue()) {
                if (!z10) {
                    f10 = Float.valueOf(f11);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            l0.n(f10, "null cannot be cast to non-null type kotlin.Float");
            return f10.floatValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final double[] Cu(@fh.g double[] dArr, @fh.g Collection<Integer> collection) {
        l0.p(dArr, "<this>");
        l0.p(collection, "indices");
        double[] dArr2 = new double[collection.size()];
        int i10 = 0;
        for (Integer intValue : collection) {
            dArr2[i10] = dArr[intValue.intValue()];
            i10++;
        }
        return dArr2;
    }

    @fh.g
    public static final long[] Cv(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        bv(copyOf);
        return copyOf;
    }

    public static final int Cw(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        int i10 = 0;
        for (short s10 : sArr) {
            i10 += s10;
        }
        return i10;
    }

    @ve.h(name = "sumOfShort")
    public static final int Cx(@fh.g Short[] shArr) {
        l0.p(shArr, "<this>");
        int i10 = 0;
        for (Short shortValue : shArr) {
            i10 += shortValue.shortValue();
        }
        return i10;
    }

    @fh.g
    public static final List<Long> Cy(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (!lVar.A(Long.valueOf(j10)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    @fh.g
    public static final Set<Long> Cz(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        return (Set) Oy(jArr, new LinkedHashSet(z0.j(jArr.length)));
    }

    public static final boolean D5(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        for (boolean valueOf : zArr) {
            if (!lVar.A(Boolean.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fh.g
    public static final <K> Map<K, Float> D6(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends K> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(fArr.length), 16));
        for (float f10 : fArr) {
            linkedHashMap.put(lVar.A(Float.valueOf(f10)), Float.valueOf(f10));
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V, M extends Map<? super Integer, ? super V>> M D7(int[] iArr, M m10, we.l<? super Integer, ? extends V> lVar) {
        l0.p(iArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        for (int i10 : iArr) {
            m10.put(Integer.valueOf(i10), lVar.A(Integer.valueOf(i10)));
        }
        return m10;
    }

    @oe.f
    public static final boolean D8(boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr[3];
    }

    @fh.g
    public static final <T, K> List<T> D9(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends K> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (hashSet.add(lVar.A(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <V> List<V> DA(@fh.g float[] fArr, @fh.g float[] fArr2, @fh.g we.p<? super Float, ? super Float, ? extends V> pVar) {
        l0.p(fArr, "<this>");
        l0.p(fArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(fArr.length, fArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Float.valueOf(fArr[i10]), Float.valueOf(fArr2[i10])));
        }
        return arrayList;
    }

    @oe.f
    public static final Float Da(float[] fArr, int i10) {
        l0.p(fArr, "<this>");
        return nf(fArr, i10);
    }

    @fh.g
    public static final <C extends Collection<? super Short>> C Db(@fh.g short[] sArr, @fh.g C c10, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (short s10 : sArr) {
            if (!lVar.A(Short.valueOf(s10)).booleanValue()) {
                c10.add(Short.valueOf(s10));
            }
        }
        return c10;
    }

    @fh.h
    public static final Byte Dc(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        for (byte b10 : bArr) {
            if (lVar.A(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
        }
        return null;
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C Dd(@fh.g T[] tArr, @fh.g C c10, @fh.g we.l<? super T, ? extends Iterable<? extends R>> lVar) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (T A : tArr) {
            b0.o0(c10, (Iterable) lVar.A(A));
        }
        return c10;
    }

    public static final void De(@fh.g int[] iArr, @fh.g we.p<? super Integer, ? super Integer, u2> pVar) {
        l0.p(iArr, "<this>");
        l0.p(pVar, "action");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
    }

    @fh.g
    public static final <K, V> Map<K, List<V>> Df(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends K> lVar, @fh.g we.l<? super Long, ? extends V> lVar2) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j10 : jArr) {
            Object A = lVar.A(Long.valueOf(j10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    public static final int Dg(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (lVar.A(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <T> String Dh(@fh.g T[] tArr, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super T, ? extends CharSequence> lVar) {
        l0.p(tArr, "<this>");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        String sb2 = ((StringBuilder) lh(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l0.o(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @fh.h
    public static final Long Di(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            long j10 = jArr[length];
            if (lVar.A(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @h1(version = "1.4")
    @fh.h
    public static final <T, R extends Comparable<? super R>> T Dj(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int Xe = Xe(tArr);
        if (Xe == 0) {
            return t10;
        }
        Comparable comparable = (Comparable) lVar.A(t10);
        s0 o10 = new gf.m(1, Xe).iterator();
        while (o10.hasNext()) {
            T t11 = tArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(t11);
            if (comparable.compareTo(comparable2) < 0) {
                t10 = t11;
                comparable = comparable2;
            }
        }
        return t10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double Dk(long[] jArr, we.l<? super Long, Double> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Long.valueOf(jArr[0])).doubleValue();
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(Long.valueOf(jArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Byte Dl(@fh.g byte[] bArr, @fh.g Comparator<? super Byte> comparator) {
        l0.p(bArr, "<this>");
        l0.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            byte b11 = bArr[o10.nextInt()];
            if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) < 0) {
                b10 = b11;
            }
        }
        return Byte.valueOf(b10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float Dm(boolean[] zArr, we.l<? super Boolean, Float> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (!(zArr.length == 0)) {
            float floatValue = lVar.A(Boolean.valueOf(zArr[0])).floatValue();
            s0 o10 = new gf.m(1, Ze(zArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(Boolean.valueOf(zArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R> R Dn(T[] tArr, Comparator<? super R> comparator, we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R A = lVar.A(tArr[0]);
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(tArr[o10.nextInt()]);
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    public static final boolean Do(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        for (long valueOf : jArr) {
            if (lVar.A(Long.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @oe.f
    public static final Boolean Dp(boolean[] zArr) {
        l0.p(zArr, "<this>");
        return Ep(zArr, ef.f.O);
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final <S, T extends S> S Dq(@fh.g T[] tArr, @fh.g we.p<? super S, ? super T, ? extends S> pVar) {
        l0.p(tArr, "<this>");
        l0.p(pVar, "operation");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        Object obj = t10;
        while (o10.hasNext()) {
            obj = pVar.g0(obj, tArr[o10.nextInt()]);
        }
        return obj;
    }

    @h1(version = "1.4")
    public static final <T> void Dr(@fh.g T[] tArr, int i10, int i11) {
        l0.p(tArr, "<this>");
        c.O.d(i10, i11, tArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 != i12) {
            int i13 = i11 - 1;
            while (i10 < i12) {
                T t10 = tArr[i10];
                tArr[i10] = tArr[i13];
                tArr[i13] = t10;
                i13--;
                i10++;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Double> Ds(double[] dArr, we.q<? super Integer, ? super Double, ? super Double, Double> qVar) {
        l0.p(dArr, "<this>");
        l0.p(qVar, "operation");
        if (dArr.length == 0) {
            return w.E();
        }
        double d10 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d10));
        int length = dArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            d10 = qVar.y(Integer.valueOf(i10), Double.valueOf(d10), Double.valueOf(dArr[i10])).doubleValue();
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static final int Dt(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return iArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    @fh.g
    public static final float[] Du(@fh.g float[] fArr, @fh.g gf.m mVar) {
        l0.p(fArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? new float[0] : o.J1(fArr, mVar.c().intValue(), mVar.h().intValue() + 1);
    }

    @fh.g
    public static final <T extends Comparable<? super T>> T[] Dv(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        T[] tArr2 = (Comparable[]) copyOf;
        o.I4(tArr2, fe.g.x());
        return tArr2;
    }

    public static final long Dw(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        return j10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfUInt")
    public static final int Dx(byte[] bArr, we.l<? super Byte, e2> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        for (byte valueOf : bArr) {
            l10 = e2.l(l10 + lVar.A(Byte.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final <T> List<T> Dy(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (!lVar.A(t10).booleanValue()) {
                break;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }

    @fh.g
    public static final <T> Set<T> Dz(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return (Set) Py(tArr, new LinkedHashSet(z0.j(tArr.length)));
    }

    public static final boolean E5(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @fh.g
    public static final <K, V> Map<K, V> E6(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends K> lVar, @fh.g we.l<? super Float, ? extends V> lVar2) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(fArr.length), 16));
        for (float f10 : fArr) {
            linkedHashMap.put(lVar.A(Float.valueOf(f10)), lVar2.A(Float.valueOf(f10)));
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V, M extends Map<? super Long, ? super V>> M E7(long[] jArr, M m10, we.l<? super Long, ? extends V> lVar) {
        l0.p(jArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        for (long j10 : jArr) {
            m10.put(Long.valueOf(j10), lVar.A(Long.valueOf(j10)));
        }
        return m10;
    }

    @oe.f
    public static final byte E8(byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr[4];
    }

    @fh.g
    public static final <K> List<Short> E9(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends K> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (hashSet.add(lVar.A(Short.valueOf(s10)))) {
                arrayList.add(Short.valueOf(s10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <R> List<u0<Float, R>> EA(@fh.g float[] fArr, @fh.g R[] rArr) {
        l0.p(fArr, "<this>");
        l0.p(rArr, "other");
        int min = Math.min(fArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            float f10 = fArr[i10];
            arrayList.add(r1.a(Float.valueOf(f10), rArr[i10]));
        }
        return arrayList;
    }

    @oe.f
    public static final Integer Ea(int[] iArr, int i10) {
        l0.p(iArr, "<this>");
        return of(iArr, i10);
    }

    @fh.g
    public static final <C extends Collection<? super Boolean>> C Eb(@fh.g boolean[] zArr, @fh.g C c10, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (boolean z10 : zArr) {
            if (!lVar.A(Boolean.valueOf(z10)).booleanValue()) {
                c10.add(Boolean.valueOf(z10));
            }
        }
        return c10;
    }

    @fh.h
    public static final Character Ec(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C Ed(@fh.g short[] sArr, @fh.g C c10, @fh.g we.l<? super Short, ? extends Iterable<? extends R>> lVar) {
        l0.p(sArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (short valueOf : sArr) {
            b0.o0(c10, (Iterable) lVar.A(Short.valueOf(valueOf)));
        }
        return c10;
    }

    public static final void Ee(@fh.g long[] jArr, @fh.g we.p<? super Integer, ? super Long, u2> pVar) {
        l0.p(jArr, "<this>");
        l0.p(pVar, "action");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
    }

    @fh.g
    public static final <T, K> Map<K, List<T>> Ef(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends K> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : tArr) {
            Object A = lVar.A(t10);
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(t10);
        }
        return linkedHashMap;
    }

    @fh.g
    public static final Set<Byte> Eg(@fh.g byte[] bArr, @fh.g Iterable<Byte> iterable) {
        l0.p(bArr, "<this>");
        l0.p(iterable, "other");
        Set<Byte> xz = xz(bArr);
        b0.P0(xz, iterable);
        return xz;
    }

    @fh.g
    public static final String Eh(@fh.g short[] sArr, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Short, ? extends CharSequence> lVar) {
        l0.p(sArr, "<this>");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        String sb2 = ((StringBuilder) mh(sArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l0.o(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @fh.h
    public static final <T> T Ei(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Short Ej(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int Ye = Ye(sArr);
        if (Ye == 0) {
            return Short.valueOf(s10);
        }
        Comparable comparable = (Comparable) lVar.A(Short.valueOf(s10));
        s0 o10 = new gf.m(1, Ye).iterator();
        while (o10.hasNext()) {
            short s11 = sArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Short.valueOf(s11));
            if (comparable.compareTo(comparable2) < 0) {
                s10 = s11;
                comparable = comparable2;
            }
        }
        return Short.valueOf(s10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> Double Ek(T[] tArr, we.l<? super T, Double> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(tArr[0]).doubleValue();
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(tArr[o10.nextInt()]).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Character El(@fh.g char[] cArr, @fh.g Comparator<? super Character> comparator) {
        l0.p(cArr, "<this>");
        l0.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            char c11 = cArr[o10.nextInt()];
            if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) < 0) {
                c10 = c11;
            }
        }
        return Character.valueOf(c10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Em(byte[] bArr, we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (!(bArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Byte.valueOf(bArr[0]));
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Byte.valueOf(bArr[o10.nextInt()]));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R En(short[] sArr, Comparator<? super R> comparator, we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R A = lVar.A(Short.valueOf(sArr[0]));
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Short.valueOf(sArr[o10.nextInt()]));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    public static final <T> boolean Eo(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return tArr.length == 0;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Boolean Ep(@fh.g boolean[] zArr, @fh.g ef.f fVar) {
        l0.p(zArr, "<this>");
        l0.p(fVar, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[fVar.m(zArr.length)]);
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Short Eq(@fh.g short[] sArr, @fh.g we.p<? super Short, ? super Short, Short> pVar) {
        l0.p(sArr, "<this>");
        l0.p(pVar, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            s10 = pVar.g0(Short.valueOf(s10), Short.valueOf(sArr[o10.nextInt()])).shortValue();
        }
        return Short.valueOf(s10);
    }

    public static final void Er(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length >= 0) {
            int Ye = Ye(sArr);
            s0 o10 = new gf.m(0, length).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                short s10 = sArr[nextInt];
                sArr[nextInt] = sArr[Ye];
                sArr[Ye] = s10;
                Ye--;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Float> Es(float[] fArr, we.q<? super Integer, ? super Float, ? super Float, Float> qVar) {
        l0.p(fArr, "<this>");
        l0.p(qVar, "operation");
        if (fArr.length == 0) {
            return w.E();
        }
        float f10 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f10));
        int length = fArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            f10 = qVar.y(Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(fArr[i10])).floatValue();
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static final int Et(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        Integer num = null;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (lVar.A(Integer.valueOf(i10)).booleanValue()) {
                if (!z10) {
                    num = Integer.valueOf(i10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            l0.n(num, "null cannot be cast to non-null type kotlin.Int");
            return num.intValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final float[] Eu(@fh.g float[] fArr, @fh.g Collection<Integer> collection) {
        l0.p(fArr, "<this>");
        l0.p(collection, "indices");
        float[] fArr2 = new float[collection.size()];
        int i10 = 0;
        for (Integer intValue : collection) {
            fArr2[i10] = fArr[intValue.intValue()];
            i10++;
        }
        return fArr2;
    }

    @fh.g
    public static final short[] Ev(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        fv(copyOf);
        return copyOf;
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Ew(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Integer> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (byte valueOf : bArr) {
            i10 += lVar.A(Byte.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfUInt")
    public static final int Ex(char[] cArr, we.l<? super Character, e2> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        for (char valueOf : cArr) {
            l10 = e2.l(l10 + lVar.A(Character.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final List<Short> Ey(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (!lVar.A(Short.valueOf(s10)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    @fh.g
    public static final Set<Short> Ez(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        return (Set) Qy(sArr, new LinkedHashSet(z0.j(sArr.length)));
    }

    public static final boolean F5(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        for (byte valueOf : bArr) {
            if (lVar.A(Byte.valueOf(valueOf)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @fh.g
    public static final <K> Map<K, Integer> F6(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends K> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(iArr.length), 16));
        for (int i10 : iArr) {
            linkedHashMap.put(lVar.A(Integer.valueOf(i10)), Integer.valueOf(i10));
        }
        return linkedHashMap;
    }

    @fh.g
    @h1(version = "1.4")
    public static final <K, V, M extends Map<? super K, ? super V>> M F7(@fh.g K[] kArr, @fh.g M m10, @fh.g we.l<? super K, ? extends V> lVar) {
        l0.p(kArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        for (K k10 : kArr) {
            m10.put(k10, lVar.A(k10));
        }
        return m10;
    }

    @oe.f
    public static final char F8(char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr[4];
    }

    @fh.g
    public static final <K> List<Boolean> F9(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends K> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (hashSet.add(lVar.A(Boolean.valueOf(z10)))) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <R, V> List<V> FA(@fh.g float[] fArr, @fh.g R[] rArr, @fh.g we.p<? super Float, ? super R, ? extends V> pVar) {
        l0.p(fArr, "<this>");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(fArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Float.valueOf(fArr[i10]), rArr[i10]));
        }
        return arrayList;
    }

    @oe.f
    public static final Long Fa(long[] jArr, int i10) {
        l0.p(jArr, "<this>");
        return pf(jArr, i10);
    }

    @fh.g
    public static final <C extends Collection<? super Byte>> C Fb(@fh.g byte[] bArr, @fh.g C c10, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (byte b10 : bArr) {
            if (lVar.A(Byte.valueOf(b10)).booleanValue()) {
                c10.add(Byte.valueOf(b10));
            }
        }
        return c10;
    }

    @fh.h
    public static final Character Fc(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        for (char c10 : cArr) {
            if (lVar.A(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
        }
        return null;
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C Fd(@fh.g boolean[] zArr, @fh.g C c10, @fh.g we.l<? super Boolean, ? extends Iterable<? extends R>> lVar) {
        l0.p(zArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (boolean valueOf : zArr) {
            b0.o0(c10, (Iterable) lVar.A(Boolean.valueOf(valueOf)));
        }
        return c10;
    }

    public static final <T> void Fe(@fh.g T[] tArr, @fh.g we.p<? super Integer, ? super T, u2> pVar) {
        l0.p(tArr, "<this>");
        l0.p(pVar, "action");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), tArr[i10]);
            i10++;
            i11++;
        }
    }

    @fh.g
    public static final <T, K, V> Map<K, List<V>> Ff(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends K> lVar, @fh.g we.l<? super T, ? extends V> lVar2) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : tArr) {
            Object A = lVar.A(t10);
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(t10));
        }
        return linkedHashMap;
    }

    @fh.g
    public static final Set<Character> Fg(@fh.g char[] cArr, @fh.g Iterable<Character> iterable) {
        l0.p(cArr, "<this>");
        l0.p(iterable, "other");
        Set<Character> yz = yz(cArr);
        b0.P0(yz, iterable);
        return yz;
    }

    @fh.g
    public static final String Fh(@fh.g boolean[] zArr, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Boolean, ? extends CharSequence> lVar) {
        l0.p(zArr, "<this>");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        String sb2 = ((StringBuilder) nh(zArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l0.o(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @fh.h
    public static final <T> T Fi(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            T t10 = tArr[length];
            if (lVar.A(t10).booleanValue()) {
                return t10;
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @h1(version = "1.7")
    @ve.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> byte Fj(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (!(bArr.length == 0)) {
            byte b10 = bArr[0];
            int Re = Re(bArr);
            if (Re == 0) {
                return b10;
            }
            Comparable comparable = (Comparable) lVar.A(Byte.valueOf(b10));
            s0 o10 = new gf.m(1, Re).iterator();
            while (o10.hasNext()) {
                byte b11 = bArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Byte.valueOf(b11));
                if (comparable.compareTo(comparable2) < 0) {
                    b10 = b11;
                    comparable = comparable2;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double Fk(short[] sArr, we.l<? super Short, Double> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Short.valueOf(sArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(Short.valueOf(sArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Double Fl(@fh.g double[] dArr, @fh.g Comparator<? super Double> comparator) {
        l0.p(dArr, "<this>");
        l0.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            double d11 = dArr[o10.nextInt()];
            if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) < 0) {
                d10 = d11;
            }
        }
        return Double.valueOf(d10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Fm(char[] cArr, we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (!(cArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Character.valueOf(cArr[0]));
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Character.valueOf(cArr[o10.nextInt()]));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R Fn(boolean[] zArr, Comparator<? super R> comparator, we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R A = lVar.A(Boolean.valueOf(zArr[0]));
        s0 o10 = new gf.m(1, Ze(zArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Boolean.valueOf(zArr[o10.nextInt()]));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    public static final <T> boolean Fo(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        for (T A : tArr) {
            if (lVar.A(A).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @oe.f
    public static final Byte Fp(byte[] bArr) {
        l0.p(bArr, "<this>");
        return Gp(bArr, ef.f.O);
    }

    public static final byte Fq(@fh.g byte[] bArr, @fh.g we.p<? super Byte, ? super Byte, Byte> pVar) {
        l0.p(bArr, "<this>");
        l0.p(pVar, "operation");
        int Re = Re(bArr);
        if (Re >= 0) {
            byte b10 = bArr[Re];
            for (int i10 = Re - 1; i10 >= 0; i10--) {
                b10 = pVar.g0(Byte.valueOf(bArr[i10]), Byte.valueOf(b10)).byteValue();
            }
            return b10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    public static final void Fr(@fh.g short[] sArr, int i10, int i11) {
        l0.p(sArr, "<this>");
        c.O.d(i10, i11, sArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 != i12) {
            int i13 = i11 - 1;
            while (i10 < i12) {
                short s10 = sArr[i10];
                sArr[i10] = sArr[i13];
                sArr[i13] = s10;
                i13--;
                i10++;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Integer> Fs(int[] iArr, we.q<? super Integer, ? super Integer, ? super Integer, Integer> qVar) {
        l0.p(iArr, "<this>");
        l0.p(qVar, "operation");
        if (iArr.length == 0) {
            return w.E();
        }
        int i10 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i10));
        int length = iArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            i10 = qVar.y(Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(iArr[i11])).intValue();
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static final long Ft(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return jArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    @fh.g
    public static final int[] Fu(@fh.g int[] iArr, @fh.g gf.m mVar) {
        l0.p(iArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? new int[0] : o.K1(iArr, mVar.c().intValue(), mVar.h().intValue() + 1);
    }

    @fh.g
    public static final <T> T[] Fv(@fh.g T[] tArr, @fh.g Comparator<? super T> comparator) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.I4(copyOf, comparator);
        return copyOf;
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Fw(@fh.g char[] cArr, @fh.g we.l<? super Character, Integer> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (char valueOf : cArr) {
            i10 += lVar.A(Character.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfUInt")
    public static final int Fx(double[] dArr, we.l<? super Double, e2> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        for (double valueOf : dArr) {
            l10 = e2.l(l10 + lVar.A(Double.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final List<Boolean> Fy(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (!lVar.A(Boolean.valueOf(z10)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    @fh.g
    public static final Set<Boolean> Fz(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return (Set) Ry(zArr, new LinkedHashSet(z0.j(zArr.length)));
    }

    public static final boolean G5(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @fh.g
    public static final <K, V> Map<K, V> G6(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends K> lVar, @fh.g we.l<? super Integer, ? extends V> lVar2) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(iArr.length), 16));
        for (int i10 : iArr) {
            linkedHashMap.put(lVar.A(Integer.valueOf(i10)), lVar2.A(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V, M extends Map<? super Short, ? super V>> M G7(short[] sArr, M m10, we.l<? super Short, ? extends V> lVar) {
        l0.p(sArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        for (short s10 : sArr) {
            m10.put(Short.valueOf(s10), lVar.A(Short.valueOf(s10)));
        }
        return m10;
    }

    @oe.f
    public static final double G8(double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr[4];
    }

    @fh.g
    public static final List<Byte> G9(@fh.g byte[] bArr, int i10) {
        l0.p(bArr, "<this>");
        if (i10 >= 0) {
            return fy(bArr, gf.v.u(bArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R> List<u0<Integer, R>> GA(@fh.g int[] iArr, @fh.g Iterable<? extends R> iterable) {
        l0.p(iArr, "<this>");
        l0.p(iterable, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(r1.a(Integer.valueOf(iArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @oe.f
    public static final <T> T Ga(T[] tArr, int i10) {
        l0.p(tArr, "<this>");
        return qf(tArr, i10);
    }

    @fh.g
    public static final <C extends Collection<? super Character>> C Gb(@fh.g char[] cArr, @fh.g C c10, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (char c11 : cArr) {
            if (lVar.A(Character.valueOf(c11)).booleanValue()) {
                c10.add(Character.valueOf(c11));
            }
        }
        return c10;
    }

    @fh.h
    public static final Double Gc(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.p, we.p<? super R, ? super java.lang.Byte, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Gd(@fh.g byte[] r3, R r4, @fh.g we.p<? super R, ? super java.lang.Byte, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = r3.length
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x001b
            byte r2 = r3[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            java.lang.Object r4 = r5.g0(r4, r2)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Gd(byte[], java.lang.Object, we.p):java.lang.Object");
    }

    public static final void Ge(@fh.g short[] sArr, @fh.g we.p<? super Integer, ? super Short, u2> pVar) {
        l0.p(sArr, "<this>");
        l0.p(pVar, "action");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
    }

    @fh.g
    public static final <K> Map<K, List<Short>> Gf(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends K> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s10 : sArr) {
            Object A = lVar.A(Short.valueOf(s10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(Short.valueOf(s10));
        }
        return linkedHashMap;
    }

    @fh.g
    public static final Set<Double> Gg(@fh.g double[] dArr, @fh.g Iterable<Double> iterable) {
        l0.p(dArr, "<this>");
        l0.p(iterable, "other");
        Set<Double> zz = zz(dArr);
        b0.P0(zz, iterable);
        return zz;
    }

    public static /* synthetic */ String Gh(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return xh(bArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    @fh.h
    public static final Short Gi(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @h1(version = "1.7")
    @ve.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char Gj(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (!(cArr.length == 0)) {
            char c10 = cArr[0];
            int Se = Se(cArr);
            if (Se == 0) {
                return c10;
            }
            Comparable comparable = (Comparable) lVar.A(Character.valueOf(c10));
            s0 o10 = new gf.m(1, Se).iterator();
            while (o10.hasNext()) {
                char c11 = cArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Character.valueOf(c11));
                if (comparable.compareTo(comparable2) < 0) {
                    c10 = c11;
                    comparable = comparable2;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double Gk(boolean[] zArr, we.l<? super Boolean, Double> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Boolean.valueOf(zArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Ze(zArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(Boolean.valueOf(zArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Float Gl(@fh.g float[] fArr, @fh.g Comparator<? super Float> comparator) {
        l0.p(fArr, "<this>");
        l0.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            float f11 = fArr[o10.nextInt()];
            if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) < 0) {
                f10 = f11;
            }
        }
        return Float.valueOf(f10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Gm(double[] dArr, we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (!(dArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Double.valueOf(dArr[0]));
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Double.valueOf(dArr[o10.nextInt()]));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final Byte Gn(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            byte b11 = bArr[o10.nextInt()];
            if (b10 > b11) {
                b10 = b11;
            }
        }
        return Byte.valueOf(b10);
    }

    public static final boolean Go(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr.length == 0;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Byte Gp(@fh.g byte[] bArr, @fh.g ef.f fVar) {
        l0.p(bArr, "<this>");
        l0.p(fVar, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[fVar.m(bArr.length)]);
    }

    public static final char Gq(@fh.g char[] cArr, @fh.g we.p<? super Character, ? super Character, Character> pVar) {
        l0.p(cArr, "<this>");
        l0.p(pVar, "operation");
        int Se = Se(cArr);
        if (Se >= 0) {
            char c10 = cArr[Se];
            for (int i10 = Se - 1; i10 >= 0; i10--) {
                c10 = pVar.g0(Character.valueOf(cArr[i10]), Character.valueOf(c10)).charValue();
            }
            return c10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void Gr(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length >= 0) {
            int Ze = Ze(zArr);
            s0 o10 = new gf.m(0, length).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                boolean z10 = zArr[nextInt];
                zArr[nextInt] = zArr[Ze];
                zArr[Ze] = z10;
                Ze--;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Long> Gs(long[] jArr, we.q<? super Integer, ? super Long, ? super Long, Long> qVar) {
        l0.p(jArr, "<this>");
        l0.p(qVar, "operation");
        if (jArr.length == 0) {
            return w.E();
        }
        long j10 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j10));
        int length = jArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            j10 = qVar.y(Integer.valueOf(i10), Long.valueOf(j10), Long.valueOf(jArr[i10])).longValue();
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static final long Gt(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        Long l10 = null;
        boolean z10 = false;
        for (long j10 : jArr) {
            if (lVar.A(Long.valueOf(j10)).booleanValue()) {
                if (!z10) {
                    l10 = Long.valueOf(j10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            l0.n(l10, "null cannot be cast to non-null type kotlin.Long");
            return l10.longValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final int[] Gu(@fh.g int[] iArr, @fh.g Collection<Integer> collection) {
        l0.p(iArr, "<this>");
        l0.p(collection, "indices");
        int[] iArr2 = new int[collection.size()];
        int i10 = 0;
        for (Integer intValue : collection) {
            iArr2[i10] = iArr[intValue.intValue()];
            i10++;
        }
        return iArr2;
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Byte> Gv(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        return gw(bArr, new g.a(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Gw(@fh.g double[] dArr, @fh.g we.l<? super Double, Integer> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (double valueOf : dArr) {
            i10 += lVar.A(Double.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfUInt")
    public static final int Gx(float[] fArr, we.l<? super Float, e2> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        for (float valueOf : fArr) {
            l10 = e2.l(l10 + lVar.A(Float.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final boolean[] Gy(@fh.g Boolean[] boolArr) {
        l0.p(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = boolArr[i10].booleanValue();
        }
        return zArr;
    }

    @fh.g
    public static final Set<Byte> Gz(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? (Set) Jy(bArr, new LinkedHashSet(z0.j(bArr.length))) : k1.f(Byte.valueOf(bArr[0])) : l1.k();
    }

    public static final boolean H5(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        for (char valueOf : cArr) {
            if (lVar.A(Character.valueOf(valueOf)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @fh.g
    public static final <K> Map<K, Long> H6(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends K> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(jArr.length), 16));
        for (long j10 : jArr) {
            linkedHashMap.put(lVar.A(Long.valueOf(j10)), Long.valueOf(j10));
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V, M extends Map<? super Boolean, ? super V>> M H7(boolean[] zArr, M m10, we.l<? super Boolean, ? extends V> lVar) {
        l0.p(zArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        for (boolean z10 : zArr) {
            m10.put(Boolean.valueOf(z10), lVar.A(Boolean.valueOf(z10)));
        }
        return m10;
    }

    @oe.f
    public static final float H8(float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr[4];
    }

    @fh.g
    public static final List<Character> H9(@fh.g char[] cArr, int i10) {
        l0.p(cArr, "<this>");
        if (i10 >= 0) {
            return gy(cArr, gf.v.u(cArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R, V> List<V> HA(@fh.g int[] iArr, @fh.g Iterable<? extends R> iterable, @fh.g we.p<? super Integer, ? super R, ? extends V> pVar) {
        l0.p(iArr, "<this>");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(pVar.g0(Integer.valueOf(iArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @oe.f
    public static final Short Ha(short[] sArr, int i10) {
        l0.p(sArr, "<this>");
        return rf(sArr, i10);
    }

    @fh.g
    public static final <C extends Collection<? super Double>> C Hb(@fh.g double[] dArr, @fh.g C c10, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (double d10 : dArr) {
            if (lVar.A(Double.valueOf(d10)).booleanValue()) {
                c10.add(Double.valueOf(d10));
            }
        }
        return c10;
    }

    @fh.h
    public static final Double Hc(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        for (double d10 : dArr) {
            if (lVar.A(Double.valueOf(d10)).booleanValue()) {
                return Double.valueOf(d10);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.p, we.p<? super R, ? super java.lang.Character, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Hd(@fh.g char[] r3, R r4, @fh.g we.p<? super R, ? super java.lang.Character, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = r3.length
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x001b
            char r2 = r3[r1]
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r4 = r5.g0(r4, r2)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Hd(char[], java.lang.Object, we.p):java.lang.Object");
    }

    public static final void He(@fh.g boolean[] zArr, @fh.g we.p<? super Integer, ? super Boolean, u2> pVar) {
        l0.p(zArr, "<this>");
        l0.p(pVar, "action");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
    }

    @fh.g
    public static final <K, V> Map<K, List<V>> Hf(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends K> lVar, @fh.g we.l<? super Short, ? extends V> lVar2) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s10 : sArr) {
            Object A = lVar.A(Short.valueOf(s10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Short.valueOf(s10)));
        }
        return linkedHashMap;
    }

    @fh.g
    public static final Set<Float> Hg(@fh.g float[] fArr, @fh.g Iterable<Float> iterable) {
        l0.p(fArr, "<this>");
        l0.p(iterable, "other");
        Set<Float> Az = Az(fArr);
        b0.P0(Az, iterable);
        return Az;
    }

    public static /* synthetic */ String Hh(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return yh(cArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    @fh.h
    public static final Short Hi(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            short s10 = sArr[length];
            if (lVar.A(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @h1(version = "1.7")
    @ve.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> double Hj(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (!(dArr.length == 0)) {
            double d10 = dArr[0];
            int Te = Te(dArr);
            if (Te == 0) {
                return d10;
            }
            Comparable comparable = (Comparable) lVar.A(Double.valueOf(d10));
            s0 o10 = new gf.m(1, Te).iterator();
            while (o10.hasNext()) {
                double d11 = dArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Double.valueOf(d11));
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                    d10 = d11;
                }
            }
            return d10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float Hk(byte[] bArr, we.l<? super Byte, Float> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Byte.valueOf(bArr[0])).floatValue();
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(Byte.valueOf(bArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Integer Hl(@fh.g int[] iArr, @fh.g Comparator<? super Integer> comparator) {
        l0.p(iArr, "<this>");
        l0.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            int i11 = iArr[o10.nextInt()];
            if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i11)) < 0) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Hm(float[] fArr, we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (!(fArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Float.valueOf(fArr[0]));
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Float.valueOf(fArr[o10.nextInt()]));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final Character Hn(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            char c11 = cArr[o10.nextInt()];
            if (l0.t(c10, c11) > 0) {
                c10 = c11;
            }
        }
        return Character.valueOf(c10);
    }

    public static final boolean Ho(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        for (short valueOf : sArr) {
            if (lVar.A(Short.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @oe.f
    public static final Character Hp(char[] cArr) {
        l0.p(cArr, "<this>");
        return Ip(cArr, ef.f.O);
    }

    public static final double Hq(@fh.g double[] dArr, @fh.g we.p<? super Double, ? super Double, Double> pVar) {
        l0.p(dArr, "<this>");
        l0.p(pVar, "operation");
        int Te = Te(dArr);
        if (Te >= 0) {
            double d10 = dArr[Te];
            for (int i10 = Te - 1; i10 >= 0; i10--) {
                d10 = pVar.g0(Double.valueOf(dArr[i10]), Double.valueOf(d10)).doubleValue();
            }
            return d10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    public static final void Hr(@fh.g boolean[] zArr, int i10, int i11) {
        l0.p(zArr, "<this>");
        c.O.d(i10, i11, zArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 != i12) {
            int i13 = i11 - 1;
            while (i10 < i12) {
                boolean z10 = zArr[i10];
                zArr[i10] = zArr[i13];
                zArr[i13] = z10;
                i13--;
                i10++;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @fh.g
    @zd.h1(version = "1.4")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> java.util.List<S> Hs(@fh.g T[] r6, @fh.g we.q<? super java.lang.Integer, ? super S, ? super T, ? extends S> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r6 = be.w.E()
            return r6
        L_0x0019:
            r0 = r6[r1]
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r6.length
            r1.<init>(r3)
            r1.add(r0)
            int r3 = r6.length
        L_0x0025:
            if (r2 >= r3) goto L_0x0037
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = r6[r2]
            java.lang.Object r0 = r7.y(r4, r0, r5)
            r1.add(r0)
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Hs(java.lang.Object[], we.q):java.util.List");
    }

    public static final <T> T Ht(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return tArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    @fh.g
    public static final long[] Hu(@fh.g long[] jArr, @fh.g gf.m mVar) {
        l0.p(jArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? new long[0] : o.L1(jArr, mVar.c().intValue(), mVar.h().intValue() + 1);
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Character> Hv(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        return hw(cArr, new g.a(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Hw(@fh.g float[] fArr, @fh.g we.l<? super Float, Integer> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (float valueOf : fArr) {
            i10 += lVar.A(Float.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfUInt")
    public static final int Hx(int[] iArr, we.l<? super Integer, e2> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        for (int valueOf : iArr) {
            l10 = e2.l(l10 + lVar.A(Integer.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final byte[] Hy(@fh.g Byte[] bArr) {
        l0.p(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = bArr[i10].byteValue();
        }
        return bArr2;
    }

    @fh.g
    public static final Set<Character> Hz(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? (Set) Ky(cArr, new LinkedHashSet(z0.j(gf.v.B(cArr.length, 128)))) : k1.f(Character.valueOf(cArr[0])) : l1.k();
    }

    public static final boolean I5(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @fh.g
    public static final <K, V> Map<K, V> I6(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends K> lVar, @fh.g we.l<? super Long, ? extends V> lVar2) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(jArr.length), 16));
        for (long j10 : jArr) {
            linkedHashMap.put(lVar.A(Long.valueOf(j10)), lVar2.A(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    public static final double I7(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (byte b10 : bArr) {
            d10 += (double) b10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @oe.f
    public static final int I8(int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr[4];
    }

    @fh.g
    public static final List<Double> I9(@fh.g double[] dArr, int i10) {
        l0.p(dArr, "<this>");
        if (i10 >= 0) {
            return hy(dArr, gf.v.u(dArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final List<u0<Integer, Integer>> IA(@fh.g int[] iArr, @fh.g int[] iArr2) {
        l0.p(iArr, "<this>");
        l0.p(iArr2, "other");
        int min = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(r1.a(Integer.valueOf(iArr[i10]), Integer.valueOf(iArr2[i10])));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Byte> Ia(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (lVar.A(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <C extends Collection<? super Float>> C Ib(@fh.g float[] fArr, @fh.g C c10, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (float f10 : fArr) {
            if (lVar.A(Float.valueOf(f10)).booleanValue()) {
                c10.add(Float.valueOf(f10));
            }
        }
        return c10;
    }

    @fh.h
    public static final Float Ic(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Double, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Id(@fh.g double[] r4, R r5, @fh.g we.p<? super R, ? super java.lang.Double, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x001b
            r2 = r4[r1]
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object r5 = r6.g0(r5, r2)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Id(double[], java.lang.Object, we.p):java.lang.Object");
    }

    @fh.g
    public static final gf.m Ie(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        return new gf.m(0, Re(bArr));
    }

    @fh.g
    public static final <K> Map<K, List<Boolean>> If(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends K> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z10 : zArr) {
            Object A = lVar.A(Boolean.valueOf(z10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(Boolean.valueOf(z10));
        }
        return linkedHashMap;
    }

    @fh.g
    public static final Set<Integer> Ig(@fh.g int[] iArr, @fh.g Iterable<Integer> iterable) {
        l0.p(iArr, "<this>");
        l0.p(iterable, "other");
        Set<Integer> Bz = Bz(iArr);
        b0.P0(Bz, iterable);
        return Bz;
    }

    public static /* synthetic */ String Ih(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return zh(dArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    @fh.g
    public static final <R> List<R> Ii(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte valueOf : bArr) {
            arrayList.add(lVar.A(Byte.valueOf(valueOf)));
        }
        return arrayList;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> float Ij(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (!(fArr.length == 0)) {
            float f10 = fArr[0];
            int Ue = Ue(fArr);
            if (Ue == 0) {
                return f10;
            }
            Comparable comparable = (Comparable) lVar.A(Float.valueOf(f10));
            s0 o10 = new gf.m(1, Ue).iterator();
            while (o10.hasNext()) {
                float f11 = fArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Float.valueOf(f11));
                if (comparable.compareTo(comparable2) < 0) {
                    f10 = f11;
                    comparable = comparable2;
                }
            }
            return f10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float Ik(char[] cArr, we.l<? super Character, Float> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Character.valueOf(cArr[0])).floatValue();
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(Character.valueOf(cArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Long Il(@fh.g long[] jArr, @fh.g Comparator<? super Long> comparator) {
        l0.p(jArr, "<this>");
        l0.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            long j11 = jArr[o10.nextInt()];
            if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) < 0) {
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Im(int[] iArr, we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (!(iArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Integer.valueOf(iArr[0]));
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Integer.valueOf(iArr[o10.nextInt()]));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final <T extends Comparable<? super T>> T In(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        while (o10.hasNext()) {
            T t11 = tArr[o10.nextInt()];
            if (t10.compareTo(t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    public static final boolean Io(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr.length == 0;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Character Ip(@fh.g char[] cArr, @fh.g ef.f fVar) {
        l0.p(cArr, "<this>");
        l0.p(fVar, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[fVar.m(cArr.length)]);
    }

    public static final float Iq(@fh.g float[] fArr, @fh.g we.p<? super Float, ? super Float, Float> pVar) {
        l0.p(fArr, "<this>");
        l0.p(pVar, "operation");
        int Ue = Ue(fArr);
        if (Ue >= 0) {
            float f10 = fArr[Ue];
            for (int i10 = Ue - 1; i10 >= 0; i10--) {
                f10 = pVar.g0(Float.valueOf(fArr[i10]), Float.valueOf(f10)).floatValue();
            }
            return f10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final List<Byte> Ir(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return w.E();
        }
        List<Byte> oz = oz(bArr);
        d0.m1(oz);
        return oz;
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Short> Is(short[] sArr, we.q<? super Integer, ? super Short, ? super Short, Short> qVar) {
        l0.p(sArr, "<this>");
        l0.p(qVar, "operation");
        if (sArr.length == 0) {
            return w.E();
        }
        short s10 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s10));
        int length = sArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            s10 = qVar.y(Integer.valueOf(i10), Short.valueOf(s10), Short.valueOf(sArr[i10])).shortValue();
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static final <T> T It(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : tArr) {
            if (lVar.A(t11).booleanValue()) {
                if (!z10) {
                    z10 = true;
                    t10 = t11;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final long[] Iu(@fh.g long[] jArr, @fh.g Collection<Integer> collection) {
        l0.p(jArr, "<this>");
        l0.p(collection, "indices");
        long[] jArr2 = new long[collection.size()];
        int i10 = 0;
        for (Integer intValue : collection) {
            jArr2[i10] = jArr[intValue.intValue()];
            i10++;
        }
        return jArr2;
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Double> Iv(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        return iw(dArr, new g.a(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Iw(@fh.g int[] iArr, @fh.g we.l<? super Integer, Integer> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (int valueOf : iArr) {
            i10 += lVar.A(Integer.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfUInt")
    public static final int Ix(long[] jArr, we.l<? super Long, e2> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        for (long valueOf : jArr) {
            l10 = e2.l(l10 + lVar.A(Long.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final char[] Iy(@fh.g Character[] chArr) {
        l0.p(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = chArr[i10].charValue();
        }
        return cArr;
    }

    @fh.g
    public static final Set<Double> Iz(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? (Set) Ly(dArr, new LinkedHashSet(z0.j(dArr.length))) : k1.f(Double.valueOf(dArr[0])) : l1.k();
    }

    public static final boolean J5(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        for (double valueOf : dArr) {
            if (lVar.A(Double.valueOf(valueOf)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @fh.g
    public static final <T, K> Map<K, T> J6(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends K> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(tArr.length), 16));
        for (T t10 : tArr) {
            linkedHashMap.put(lVar.A(t10), t10);
        }
        return linkedHashMap;
    }

    public static final double J7(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (double d11 : dArr) {
            d10 += d11;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @oe.f
    public static final long J8(long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr[4];
    }

    @fh.g
    public static final List<Float> J9(@fh.g float[] fArr, int i10) {
        l0.p(fArr, "<this>");
        if (i10 >= 0) {
            return iy(fArr, gf.v.u(fArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <V> List<V> JA(@fh.g int[] iArr, @fh.g int[] iArr2, @fh.g we.p<? super Integer, ? super Integer, ? extends V> pVar) {
        l0.p(iArr, "<this>");
        l0.p(iArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Integer.valueOf(iArr[i10]), Integer.valueOf(iArr2[i10])));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Character> Ja(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (lVar.A(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <C extends Collection<? super Integer>> C Jb(@fh.g int[] iArr, @fh.g C c10, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (int i10 : iArr) {
            if (lVar.A(Integer.valueOf(i10)).booleanValue()) {
                c10.add(Integer.valueOf(i10));
            }
        }
        return c10;
    }

    @fh.h
    public static final Float Jc(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        for (float f10 : fArr) {
            if (lVar.A(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.p, we.p<? super R, ? super java.lang.Float, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Jd(@fh.g float[] r3, R r4, @fh.g we.p<? super R, ? super java.lang.Float, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = r3.length
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x001b
            r2 = r3[r1]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r4 = r5.g0(r4, r2)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Jd(float[], java.lang.Object, we.p):java.lang.Object");
    }

    @fh.g
    public static final gf.m Je(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        return new gf.m(0, Se(cArr));
    }

    @fh.g
    public static final <K, V> Map<K, List<V>> Jf(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends K> lVar, @fh.g we.l<? super Boolean, ? extends V> lVar2) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z10 : zArr) {
            Object A = lVar.A(Boolean.valueOf(z10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    @fh.g
    public static final Set<Long> Jg(@fh.g long[] jArr, @fh.g Iterable<Long> iterable) {
        l0.p(jArr, "<this>");
        l0.p(iterable, "other");
        Set<Long> Cz = Cz(jArr);
        b0.P0(Cz, iterable);
        return Cz;
    }

    public static /* synthetic */ String Jh(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return Ah(fArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    @fh.g
    public static final <R> List<R> Ji(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char valueOf : cArr) {
            arrayList.add(lVar.A(Character.valueOf(valueOf)));
        }
        return arrayList;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> int Jj(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (!(iArr.length == 0)) {
            int i10 = iArr[0];
            int Ve = Ve(iArr);
            if (Ve == 0) {
                return i10;
            }
            Comparable comparable = (Comparable) lVar.A(Integer.valueOf(i10));
            s0 o10 = new gf.m(1, Ve).iterator();
            while (o10.hasNext()) {
                int i11 = iArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Integer.valueOf(i11));
                if (comparable.compareTo(comparable2) < 0) {
                    i10 = i11;
                    comparable = comparable2;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float Jk(double[] dArr, we.l<? super Double, Float> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Double.valueOf(dArr[0])).floatValue();
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(Double.valueOf(dArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final <T> T Jl(@fh.g T[] tArr, @fh.g Comparator<? super T> comparator) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        while (o10.hasNext()) {
            T t11 = tArr[o10.nextInt()];
            if (comparator.compare(t10, t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Jm(long[] jArr, we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (!(jArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Long.valueOf(jArr[0]));
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Long.valueOf(jArr[o10.nextInt()]));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final Double Jn(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            d10 = Math.min(d10, dArr[o10.nextInt()]);
        }
        return Double.valueOf(d10);
    }

    public static final boolean Jo(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        for (boolean valueOf : zArr) {
            if (lVar.A(Boolean.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @oe.f
    public static final Double Jp(double[] dArr) {
        l0.p(dArr, "<this>");
        return Kp(dArr, ef.f.O);
    }

    public static final int Jq(@fh.g int[] iArr, @fh.g we.p<? super Integer, ? super Integer, Integer> pVar) {
        l0.p(iArr, "<this>");
        l0.p(pVar, "operation");
        int Ve = Ve(iArr);
        if (Ve >= 0) {
            int i10 = iArr[Ve];
            for (int i11 = Ve - 1; i11 >= 0; i11--) {
                i10 = pVar.g0(Integer.valueOf(iArr[i11]), Integer.valueOf(i10)).intValue();
            }
            return i10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final List<Character> Jr(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return w.E();
        }
        List<Character> pz = pz(cArr);
        d0.m1(pz);
        return pz;
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Boolean> Js(boolean[] zArr, we.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> qVar) {
        l0.p(zArr, "<this>");
        l0.p(qVar, "operation");
        if (zArr.length == 0) {
            return w.E();
        }
        boolean z10 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z10));
        int length = zArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            z10 = qVar.y(Integer.valueOf(i10), Boolean.valueOf(z10), Boolean.valueOf(zArr[i10])).booleanValue();
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static final short Jt(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return sArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    @fh.g
    public static final <T> T[] Ju(@fh.g T[] tArr, @fh.g gf.m mVar) {
        l0.p(tArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? o.M1(tArr, 0, 0) : o.M1(tArr, mVar.c().intValue(), mVar.h().intValue() + 1);
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Float> Jv(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        return jw(fArr, new g.a(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Jw(@fh.g long[] jArr, @fh.g we.l<? super Long, Integer> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (long valueOf : jArr) {
            i10 += lVar.A(Long.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfUInt")
    public static final <T> int Jx(T[] tArr, we.l<? super T, e2> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        for (T A : tArr) {
            l10 = e2.l(l10 + lVar.A(A).l0());
        }
        return l10;
    }

    @fh.g
    public static final <C extends Collection<? super Byte>> C Jy(@fh.g byte[] bArr, @fh.g C c10) {
        l0.p(bArr, "<this>");
        l0.p(c10, "destination");
        for (byte valueOf : bArr) {
            c10.add(Byte.valueOf(valueOf));
        }
        return c10;
    }

    @fh.g
    public static final Set<Float> Jz(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? (Set) My(fArr, new LinkedHashSet(z0.j(fArr.length))) : k1.f(Float.valueOf(fArr[0])) : l1.k();
    }

    public static final boolean K5(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @fh.g
    public static final <T, K, V> Map<K, V> K6(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends K> lVar, @fh.g we.l<? super T, ? extends V> lVar2) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(tArr.length), 16));
        for (T t10 : tArr) {
            linkedHashMap.put(lVar.A(t10), lVar2.A(t10));
        }
        return linkedHashMap;
    }

    public static final double K7(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (float f10 : fArr) {
            d10 += (double) f10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @oe.f
    public static final <T> T K8(T[] tArr) {
        l0.p(tArr, "<this>");
        return tArr[4];
    }

    @fh.g
    public static final List<Integer> K9(@fh.g int[] iArr, int i10) {
        l0.p(iArr, "<this>");
        if (i10 >= 0) {
            return jy(iArr, gf.v.u(iArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R> List<u0<Integer, R>> KA(@fh.g int[] iArr, @fh.g R[] rArr) {
        l0.p(iArr, "<this>");
        l0.p(rArr, "other");
        int min = Math.min(iArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = iArr[i10];
            arrayList.add(r1.a(Integer.valueOf(i11), rArr[i10]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Double> Ka(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (lVar.A(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <C extends Collection<? super Long>> C Kb(@fh.g long[] jArr, @fh.g C c10, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (long j10 : jArr) {
            if (lVar.A(Long.valueOf(j10)).booleanValue()) {
                c10.add(Long.valueOf(j10));
            }
        }
        return c10;
    }

    @fh.h
    public static final Integer Kc(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.p, we.p<? super R, ? super java.lang.Integer, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Kd(@fh.g int[] r3, R r4, @fh.g we.p<? super R, ? super java.lang.Integer, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = r3.length
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x001b
            r2 = r3[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r5.g0(r4, r2)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Kd(int[], java.lang.Object, we.p):java.lang.Object");
    }

    @fh.g
    public static final gf.m Ke(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        return new gf.m(0, Te(dArr));
    }

    @fh.g
    public static final <K, M extends Map<? super K, List<Byte>>> M Kf(@fh.g byte[] bArr, @fh.g M m10, @fh.g we.l<? super Byte, ? extends K> lVar) {
        l0.p(bArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (byte b10 : bArr) {
            Object A = lVar.A(Byte.valueOf(b10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(Byte.valueOf(b10));
        }
        return m10;
    }

    @fh.g
    public static final <T> Set<T> Kg(@fh.g T[] tArr, @fh.g Iterable<? extends T> iterable) {
        l0.p(tArr, "<this>");
        l0.p(iterable, "other");
        Set<T> Dz = Dz(tArr);
        b0.P0(Dz, iterable);
        return Dz;
    }

    public static /* synthetic */ String Kh(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return Bh(iArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    @fh.g
    public static final <R> List<R> Ki(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double valueOf : dArr) {
            arrayList.add(lVar.A(Double.valueOf(valueOf)));
        }
        return arrayList;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> long Kj(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (!(jArr.length == 0)) {
            long j10 = jArr[0];
            int We = We(jArr);
            if (We == 0) {
                return j10;
            }
            Comparable comparable = (Comparable) lVar.A(Long.valueOf(j10));
            s0 o10 = new gf.m(1, We).iterator();
            while (o10.hasNext()) {
                long j11 = jArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Long.valueOf(j11));
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                    j10 = j11;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float Kk(float[] fArr, we.l<? super Float, Float> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Float.valueOf(fArr[0])).floatValue();
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(Float.valueOf(fArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Short Kl(@fh.g short[] sArr, @fh.g Comparator<? super Short> comparator) {
        l0.p(sArr, "<this>");
        l0.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            short s11 = sArr[o10.nextInt()];
            if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) < 0) {
                s10 = s11;
            }
        }
        return Short.valueOf(s10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R extends Comparable<? super R>> R Km(T[] tArr, we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (!(tArr.length == 0)) {
            R r10 = (Comparable) lVar.A(tArr[0]);
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(tArr[o10.nextInt()]);
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final Double Kn(@fh.g Double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        s0 o10 = new gf.m(1, Xe(dArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, dArr[o10.nextInt()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @oe.f
    public static final byte[] Ko(byte[] bArr, we.l<? super Byte, u2> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "action");
        for (byte valueOf : bArr) {
            lVar.A(Byte.valueOf(valueOf));
        }
        return bArr;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Double Kp(@fh.g double[] dArr, @fh.g ef.f fVar) {
        l0.p(dArr, "<this>");
        l0.p(fVar, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[fVar.m(dArr.length)]);
    }

    public static final long Kq(@fh.g long[] jArr, @fh.g we.p<? super Long, ? super Long, Long> pVar) {
        l0.p(jArr, "<this>");
        l0.p(pVar, "operation");
        int We = We(jArr);
        if (We >= 0) {
            long j10 = jArr[We];
            for (int i10 = We - 1; i10 >= 0; i10--) {
                j10 = pVar.g0(Long.valueOf(jArr[i10]), Long.valueOf(j10)).longValue();
            }
            return j10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final List<Double> Kr(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return w.E();
        }
        List<Double> qz = qz(dArr);
        d0.m1(qz);
        return qz;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Byte, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Ks(byte[] r4, R r5, we.p<? super R, ? super java.lang.Byte, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            goto L_0x0037
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            byte r3 = r4[r1]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            r4 = r0
        L_0x0037:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Ks(byte[], java.lang.Object, we.p):java.util.List");
    }

    public static final short Kt(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        Short sh2 = null;
        boolean z10 = false;
        for (short s10 : sArr) {
            if (lVar.A(Short.valueOf(s10)).booleanValue()) {
                if (!z10) {
                    sh2 = Short.valueOf(s10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            l0.n(sh2, "null cannot be cast to non-null type kotlin.Short");
            return sh2.shortValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final <T> T[] Ku(@fh.g T[] tArr, @fh.g Collection<Integer> collection) {
        l0.p(tArr, "<this>");
        l0.p(collection, "indices");
        T[] a10 = m.a(tArr, collection.size());
        int i10 = 0;
        for (Integer intValue : collection) {
            a10[i10] = tArr[intValue.intValue()];
            i10++;
        }
        return a10;
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Integer> Kv(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        return kw(iArr, new g.a(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> int Kw(@fh.g T[] tArr, @fh.g we.l<? super T, Integer> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (T A : tArr) {
            i10 += lVar.A(A).intValue();
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfUInt")
    public static final int Kx(short[] sArr, we.l<? super Short, e2> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        for (short valueOf : sArr) {
            l10 = e2.l(l10 + lVar.A(Short.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final <C extends Collection<? super Character>> C Ky(@fh.g char[] cArr, @fh.g C c10) {
        l0.p(cArr, "<this>");
        l0.p(c10, "destination");
        for (char valueOf : cArr) {
            c10.add(Character.valueOf(valueOf));
        }
        return c10;
    }

    @fh.g
    public static final Set<Integer> Kz(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? (Set) Ny(iArr, new LinkedHashSet(z0.j(iArr.length))) : k1.f(Integer.valueOf(iArr[0])) : l1.k();
    }

    public static final boolean L5(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        for (float valueOf : fArr) {
            if (lVar.A(Float.valueOf(valueOf)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @fh.g
    public static final <K> Map<K, Short> L6(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends K> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(sArr.length), 16));
        for (short s10 : sArr) {
            linkedHashMap.put(lVar.A(Short.valueOf(s10)), Short.valueOf(s10));
        }
        return linkedHashMap;
    }

    public static final double L7(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (int i11 : iArr) {
            d10 += (double) i11;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @oe.f
    public static final short L8(short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr[4];
    }

    @fh.g
    public static final List<Long> L9(@fh.g long[] jArr, int i10) {
        l0.p(jArr, "<this>");
        if (i10 >= 0) {
            return ky(jArr, gf.v.u(jArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R, V> List<V> LA(@fh.g int[] iArr, @fh.g R[] rArr, @fh.g we.p<? super Integer, ? super R, ? extends V> pVar) {
        l0.p(iArr, "<this>");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(iArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Integer.valueOf(iArr[i10]), rArr[i10]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Float> La(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (lVar.A(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <T, C extends Collection<? super T>> C Lb(@fh.g T[] tArr, @fh.g C c10, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (T t10 : tArr) {
            if (lVar.A(t10).booleanValue()) {
                c10.add(t10);
            }
        }
        return c10;
    }

    @fh.h
    public static final Integer Lc(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        for (int i10 : iArr) {
            if (lVar.A(Integer.valueOf(i10)).booleanValue()) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Long, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Ld(@fh.g long[] r4, R r5, @fh.g we.p<? super R, ? super java.lang.Long, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x001b
            r2 = r4[r1]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r5 = r6.g0(r5, r2)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Ld(long[], java.lang.Object, we.p):java.lang.Object");
    }

    @fh.g
    public static final gf.m Le(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        return new gf.m(0, Ue(fArr));
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, List<V>>> M Lf(@fh.g byte[] bArr, @fh.g M m10, @fh.g we.l<? super Byte, ? extends K> lVar, @fh.g we.l<? super Byte, ? extends V> lVar2) {
        l0.p(bArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (byte b10 : bArr) {
            Object A = lVar.A(Byte.valueOf(b10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Byte.valueOf(b10)));
        }
        return m10;
    }

    @fh.g
    public static final Set<Short> Lg(@fh.g short[] sArr, @fh.g Iterable<Short> iterable) {
        l0.p(sArr, "<this>");
        l0.p(iterable, "other");
        Set<Short> Ez = Ez(sArr);
        b0.P0(Ez, iterable);
        return Ez;
    }

    public static /* synthetic */ String Lh(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return Ch(jArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    @fh.g
    public static final <R> List<R> Li(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(lVar.A(Float.valueOf(valueOf)));
        }
        return arrayList;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T Lj(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (!(tArr.length == 0)) {
            T t10 = tArr[0];
            int Xe = Xe(tArr);
            if (Xe == 0) {
                return t10;
            }
            Comparable comparable = (Comparable) lVar.A(t10);
            s0 o10 = new gf.m(1, Xe).iterator();
            while (o10.hasNext()) {
                T t11 = tArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(t11);
                if (comparable.compareTo(comparable2) < 0) {
                    t10 = t11;
                    comparable = comparable2;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float Lk(int[] iArr, we.l<? super Integer, Float> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Integer.valueOf(iArr[0])).floatValue();
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(Integer.valueOf(iArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "maxWithOrThrow")
    public static final byte Ll(@fh.g byte[] bArr, @fh.g Comparator<? super Byte> comparator) {
        l0.p(bArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(bArr.length == 0)) {
            byte b10 = bArr[0];
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                byte b11 = bArr[o10.nextInt()];
                if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) < 0) {
                    b10 = b11;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Lm(short[] sArr, we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (!(sArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Short.valueOf(sArr[0]));
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Short.valueOf(sArr[o10.nextInt()]));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final Float Ln(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            f10 = Math.min(f10, fArr[o10.nextInt()]);
        }
        return Float.valueOf(f10);
    }

    @h1(version = "1.4")
    @oe.f
    public static final char[] Lo(char[] cArr, we.l<? super Character, u2> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "action");
        for (char valueOf : cArr) {
            lVar.A(Character.valueOf(valueOf));
        }
        return cArr;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @oe.f
    public static final Float Lp(float[] fArr) {
        l0.p(fArr, "<this>");
        return Mp(fArr, ef.f.O);
    }

    public static final <S, T extends S> S Lq(@fh.g T[] tArr, @fh.g we.p<? super T, ? super S, ? extends S> pVar) {
        l0.p(tArr, "<this>");
        l0.p(pVar, "operation");
        int Xe = Xe(tArr);
        if (Xe >= 0) {
            int i10 = Xe - 1;
            Object obj = tArr[Xe];
            while (i10 >= 0) {
                Object g02 = pVar.g0(tArr[i10], obj);
                i10--;
                obj = g02;
            }
            return obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final List<Float> Lr(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return w.E();
        }
        List<Float> rz = rz(fArr);
        d0.m1(rz);
        return rz;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Character, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Ls(char[] r4, R r5, we.p<? super R, ? super java.lang.Character, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            goto L_0x0037
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            char r3 = r4[r1]
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            r4 = r0
        L_0x0037:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Ls(char[], java.lang.Object, we.p):java.util.List");
    }

    public static final boolean Lt(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return zArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    @fh.g
    public static final short[] Lu(@fh.g short[] sArr, @fh.g gf.m mVar) {
        l0.p(sArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? new short[0] : o.N1(sArr, mVar.c().intValue(), mVar.h().intValue() + 1);
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Long> Lv(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        return lw(jArr, new g.a(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Lw(@fh.g short[] sArr, @fh.g we.l<? super Short, Integer> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (short valueOf : sArr) {
            i10 += lVar.A(Short.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfUInt")
    public static final int Lx(boolean[] zArr, we.l<? super Boolean, e2> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        for (boolean valueOf : zArr) {
            l10 = e2.l(l10 + lVar.A(Boolean.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final <C extends Collection<? super Double>> C Ly(@fh.g double[] dArr, @fh.g C c10) {
        l0.p(dArr, "<this>");
        l0.p(c10, "destination");
        for (double valueOf : dArr) {
            c10.add(Double.valueOf(valueOf));
        }
        return c10;
    }

    @fh.g
    public static final Set<Long> Lz(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? (Set) Oy(jArr, new LinkedHashSet(z0.j(jArr.length))) : k1.f(Long.valueOf(jArr[0])) : l1.k();
    }

    public static final boolean M5(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @fh.g
    public static final <K, V> Map<K, V> M6(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends K> lVar, @fh.g we.l<? super Short, ? extends V> lVar2) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(sArr.length), 16));
        for (short s10 : sArr) {
            linkedHashMap.put(lVar.A(Short.valueOf(s10)), lVar2.A(Short.valueOf(s10)));
        }
        return linkedHashMap;
    }

    public static final double M7(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (long j10 : jArr) {
            d10 += (double) j10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @oe.f
    public static final boolean M8(boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr[4];
    }

    @fh.g
    public static final <T> List<T> M9(@fh.g T[] tArr, int i10) {
        l0.p(tArr, "<this>");
        if (i10 >= 0) {
            return ly(tArr, gf.v.u(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R> List<u0<Long, R>> MA(@fh.g long[] jArr, @fh.g Iterable<? extends R> iterable) {
        l0.p(jArr, "<this>");
        l0.p(iterable, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(r1.a(Long.valueOf(jArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @fh.g
    public static final List<Integer> Ma(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (lVar.A(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <C extends Collection<? super Short>> C Mb(@fh.g short[] sArr, @fh.g C c10, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (short s10 : sArr) {
            if (lVar.A(Short.valueOf(s10)).booleanValue()) {
                c10.add(Short.valueOf(s10));
            }
        }
        return c10;
    }

    @fh.h
    public static final Long Mc(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.p, we.p<? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R Md(@fh.g T[] r3, R r4, @fh.g we.p<? super R, ? super T, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = r3.length
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x0017
            r2 = r3[r1]
            java.lang.Object r4 = r5.g0(r4, r2)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0017:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Md(java.lang.Object[], java.lang.Object, we.p):java.lang.Object");
    }

    @fh.g
    public static final gf.m Me(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        return new gf.m(0, Ve(iArr));
    }

    @fh.g
    public static final <K, M extends Map<? super K, List<Character>>> M Mf(@fh.g char[] cArr, @fh.g M m10, @fh.g we.l<? super Character, ? extends K> lVar) {
        l0.p(cArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (char c10 : cArr) {
            Object A = lVar.A(Character.valueOf(c10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(Character.valueOf(c10));
        }
        return m10;
    }

    @fh.g
    public static final Set<Boolean> Mg(@fh.g boolean[] zArr, @fh.g Iterable<Boolean> iterable) {
        l0.p(zArr, "<this>");
        l0.p(iterable, "other");
        Set<Boolean> Fz = Fz(zArr);
        b0.P0(Fz, iterable);
        return Fz;
    }

    public static /* synthetic */ String Mh(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return Dh(objArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    @fh.g
    public static final <R> List<R> Mi(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(lVar.A(Integer.valueOf(valueOf)));
        }
        return arrayList;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> short Mj(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (!(sArr.length == 0)) {
            short s10 = sArr[0];
            int Ye = Ye(sArr);
            if (Ye == 0) {
                return s10;
            }
            Comparable comparable = (Comparable) lVar.A(Short.valueOf(s10));
            s0 o10 = new gf.m(1, Ye).iterator();
            while (o10.hasNext()) {
                short s11 = sArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Short.valueOf(s11));
                if (comparable.compareTo(comparable2) < 0) {
                    s10 = s11;
                    comparable = comparable2;
                }
            }
            return s10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float Mk(long[] jArr, we.l<? super Long, Float> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Long.valueOf(jArr[0])).floatValue();
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(Long.valueOf(jArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "maxWithOrThrow")
    public static final char Ml(@fh.g char[] cArr, @fh.g Comparator<? super Character> comparator) {
        l0.p(cArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(cArr.length == 0)) {
            char c10 = cArr[0];
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                char c11 = cArr[o10.nextInt()];
                if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) < 0) {
                    c10 = c11;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Mm(boolean[] zArr, we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (!(zArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Boolean.valueOf(zArr[0]));
            s0 o10 = new gf.m(1, Ze(zArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Boolean.valueOf(zArr[o10.nextInt()]));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final Float Mn(@fh.g Float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        s0 o10 = new gf.m(1, Xe(fArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, fArr[o10.nextInt()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @oe.f
    public static final double[] Mo(double[] dArr, we.l<? super Double, u2> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "action");
        for (double valueOf : dArr) {
            lVar.A(Double.valueOf(valueOf));
        }
        return dArr;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Float Mp(@fh.g float[] fArr, @fh.g ef.f fVar) {
        l0.p(fArr, "<this>");
        l0.p(fVar, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fVar.m(fArr.length)]);
    }

    public static final short Mq(@fh.g short[] sArr, @fh.g we.p<? super Short, ? super Short, Short> pVar) {
        l0.p(sArr, "<this>");
        l0.p(pVar, "operation");
        int Ye = Ye(sArr);
        if (Ye >= 0) {
            short s10 = sArr[Ye];
            for (int i10 = Ye - 1; i10 >= 0; i10--) {
                s10 = pVar.g0(Short.valueOf(sArr[i10]), Short.valueOf(s10)).shortValue();
            }
            return s10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final List<Integer> Mr(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return w.E();
        }
        List<Integer> sz = sz(iArr);
        d0.m1(sz);
        return sz;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.p, we.p<? super R, ? super java.lang.Double, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Ms(double[] r5, R r6, we.p<? super R, ? super java.lang.Double, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            goto L_0x0037
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            r3 = r5[r1]
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Object r6 = r7.g0(r6, r3)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            r5 = r0
        L_0x0037:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Ms(double[], java.lang.Object, we.p):java.util.List");
    }

    public static final boolean Mt(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        Boolean bool = null;
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (lVar.A(Boolean.valueOf(z11)).booleanValue()) {
                if (!z10) {
                    bool = Boolean.valueOf(z11);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            l0.n(bool, "null cannot be cast to non-null type kotlin.Boolean");
            return bool.booleanValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final short[] Mu(@fh.g short[] sArr, @fh.g Collection<Integer> collection) {
        l0.p(sArr, "<this>");
        l0.p(collection, "indices");
        short[] sArr2 = new short[collection.size()];
        int i10 = 0;
        for (Integer intValue : collection) {
            sArr2[i10] = sArr[intValue.intValue()];
            i10++;
        }
        return sArr2;
    }

    @fh.g
    public static final <T, R extends Comparable<? super R>> List<T> Mv(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        return mw(tArr, new g.a(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Mw(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Integer> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (boolean valueOf : zArr) {
            i10 += lVar.A(Boolean.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfULong")
    public static final long Mx(byte[] bArr, we.l<? super Byte, j2> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        for (byte valueOf : bArr) {
            l10 = j2.l(l10 + lVar.A(Byte.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final <C extends Collection<? super Float>> C My(@fh.g float[] fArr, @fh.g C c10) {
        l0.p(fArr, "<this>");
        l0.p(c10, "destination");
        for (float valueOf : fArr) {
            c10.add(Float.valueOf(valueOf));
        }
        return c10;
    }

    @fh.g
    public static final <T> Set<T> Mz(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) Py(tArr, new LinkedHashSet(z0.j(tArr.length))) : k1.f(tArr[0]) : l1.k();
    }

    public static final boolean N5(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        for (int valueOf : iArr) {
            if (lVar.A(Integer.valueOf(valueOf)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @fh.g
    public static final <K> Map<K, Boolean> N6(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends K> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(zArr.length), 16));
        for (boolean z10 : zArr) {
            linkedHashMap.put(lVar.A(Boolean.valueOf(z10)), Boolean.valueOf(z10));
        }
        return linkedHashMap;
    }

    public static final double N7(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (short s10 : sArr) {
            d10 += (double) s10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static final boolean N8(@fh.g byte[] bArr, byte b10) {
        l0.p(bArr, "<this>");
        return dg(bArr, b10) >= 0;
    }

    @fh.g
    public static final List<Short> N9(@fh.g short[] sArr, int i10) {
        l0.p(sArr, "<this>");
        if (i10 >= 0) {
            return my(sArr, gf.v.u(sArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R, V> List<V> NA(@fh.g long[] jArr, @fh.g Iterable<? extends R> iterable, @fh.g we.p<? super Long, ? super R, ? extends V> pVar) {
        l0.p(jArr, "<this>");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(pVar.g0(Long.valueOf(jArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @fh.g
    public static final List<Long> Na(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (lVar.A(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <C extends Collection<? super Boolean>> C Nb(@fh.g boolean[] zArr, @fh.g C c10, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (boolean z10 : zArr) {
            if (lVar.A(Boolean.valueOf(z10)).booleanValue()) {
                c10.add(Boolean.valueOf(z10));
            }
        }
        return c10;
    }

    @fh.h
    public static final Long Nc(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        for (long j10 : jArr) {
            if (lVar.A(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.p, we.p<? super R, ? super java.lang.Short, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Nd(@fh.g short[] r3, R r4, @fh.g we.p<? super R, ? super java.lang.Short, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = r3.length
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x001b
            short r2 = r3[r1]
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            java.lang.Object r4 = r5.g0(r4, r2)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Nd(short[], java.lang.Object, we.p):java.lang.Object");
    }

    @fh.g
    public static final gf.m Ne(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        return new gf.m(0, We(jArr));
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, List<V>>> M Nf(@fh.g char[] cArr, @fh.g M m10, @fh.g we.l<? super Character, ? extends K> lVar, @fh.g we.l<? super Character, ? extends V> lVar2) {
        l0.p(cArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (char c10 : cArr) {
            Object A = lVar.A(Character.valueOf(c10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Character.valueOf(c10)));
        }
        return m10;
    }

    @oe.f
    public static final boolean Ng(byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr.length == 0;
    }

    public static /* synthetic */ String Nh(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return Eh(sArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    @fh.g
    public static final <R> List<R> Ni(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(lVar.A(Long.valueOf(valueOf)));
        }
        return arrayList;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> boolean Nj(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (!(zArr.length == 0)) {
            boolean z10 = zArr[0];
            int Ze = Ze(zArr);
            if (Ze == 0) {
                return z10;
            }
            Comparable comparable = (Comparable) lVar.A(Boolean.valueOf(z10));
            s0 o10 = new gf.m(1, Ze).iterator();
            while (o10.hasNext()) {
                boolean z11 = zArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Boolean.valueOf(z11));
                if (comparable.compareTo(comparable2) < 0) {
                    z10 = z11;
                    comparable = comparable2;
                }
            }
            return z10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> Float Nk(T[] tArr, we.l<? super T, Float> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(tArr[0]).floatValue();
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(tArr[o10.nextInt()]).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "maxWithOrThrow")
    public static final double Nl(@fh.g double[] dArr, @fh.g Comparator<? super Double> comparator) {
        l0.p(dArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(dArr.length == 0)) {
            double d10 = dArr[0];
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                double d11 = dArr[o10.nextInt()];
                if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) < 0) {
                    d10 = d11;
                }
            }
            return d10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Nm(byte[] bArr, we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Byte.valueOf(bArr[0]));
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Byte.valueOf(bArr[o10.nextInt()]));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Integer Nn(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            int i11 = iArr[o10.nextInt()];
            if (i10 > i11) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    @h1(version = "1.4")
    @oe.f
    public static final float[] No(float[] fArr, we.l<? super Float, u2> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "action");
        for (float valueOf : fArr) {
            lVar.A(Float.valueOf(valueOf));
        }
        return fArr;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @oe.f
    public static final Integer Np(int[] iArr) {
        l0.p(iArr, "<this>");
        return Op(iArr, ef.f.O);
    }

    public static final boolean Nq(@fh.g boolean[] zArr, @fh.g we.p<? super Boolean, ? super Boolean, Boolean> pVar) {
        l0.p(zArr, "<this>");
        l0.p(pVar, "operation");
        int Ze = Ze(zArr);
        if (Ze >= 0) {
            boolean z10 = zArr[Ze];
            for (int i10 = Ze - 1; i10 >= 0; i10--) {
                z10 = pVar.g0(Boolean.valueOf(zArr[i10]), Boolean.valueOf(z10)).booleanValue();
            }
            return z10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final List<Long> Nr(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return w.E();
        }
        List<Long> tz = tz(jArr);
        d0.m1(tz);
        return tz;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Float, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Ns(float[] r4, R r5, we.p<? super R, ? super java.lang.Float, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            goto L_0x0037
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            r3 = r4[r1]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            r4 = r0
        L_0x0037:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Ns(float[], java.lang.Object, we.p):java.util.List");
    }

    @fh.h
    public static final Boolean Nt(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    @fh.g
    public static final boolean[] Nu(@fh.g boolean[] zArr, @fh.g gf.m mVar) {
        l0.p(zArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? new boolean[0] : o.O1(zArr, mVar.c().intValue(), mVar.h().intValue() + 1);
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Short> Nv(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        return nw(sArr, new g.a(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double Nw(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Double> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (byte valueOf : bArr) {
            d10 += lVar.A(Byte.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfULong")
    public static final long Nx(char[] cArr, we.l<? super Character, j2> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        for (char valueOf : cArr) {
            l10 = j2.l(l10 + lVar.A(Character.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final <C extends Collection<? super Integer>> C Ny(@fh.g int[] iArr, @fh.g C c10) {
        l0.p(iArr, "<this>");
        l0.p(c10, "destination");
        for (int valueOf : iArr) {
            c10.add(Integer.valueOf(valueOf));
        }
        return c10;
    }

    @fh.g
    public static final Set<Short> Nz(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? (Set) Qy(sArr, new LinkedHashSet(z0.j(sArr.length))) : k1.f(Short.valueOf(sArr[0])) : l1.k();
    }

    public static final boolean O5(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @fh.g
    public static final <K, V> Map<K, V> O6(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends K> lVar, @fh.g we.l<? super Boolean, ? extends V> lVar2) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(zArr.length), 16));
        for (boolean z10 : zArr) {
            linkedHashMap.put(lVar.A(Boolean.valueOf(z10)), lVar2.A(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    @ve.h(name = "averageOfByte")
    public static final double O7(@fh.g Byte[] bArr) {
        l0.p(bArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Byte byteValue : bArr) {
            d10 += (double) byteValue.byteValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static final boolean O8(@fh.g char[] cArr, char c10) {
        l0.p(cArr, "<this>");
        return eg(cArr, c10) >= 0;
    }

    @fh.g
    public static final List<Boolean> O9(@fh.g boolean[] zArr, int i10) {
        l0.p(zArr, "<this>");
        if (i10 >= 0) {
            return ny(zArr, gf.v.u(zArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final List<u0<Long, Long>> OA(@fh.g long[] jArr, @fh.g long[] jArr2) {
        l0.p(jArr, "<this>");
        l0.p(jArr2, "other");
        int min = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(r1.a(Long.valueOf(jArr[i10]), Long.valueOf(jArr2[i10])));
        }
        return arrayList;
    }

    @fh.g
    public static final <T> List<T> Oa(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (lVar.A(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @oe.f
    public static final Boolean Ob(boolean[] zArr, we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        for (boolean z10 : zArr) {
            if (lVar.A(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }

    @fh.h
    public static final <T> T Oc(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.p, we.p<? super R, ? super java.lang.Boolean, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Od(@fh.g boolean[] r3, R r4, @fh.g we.p<? super R, ? super java.lang.Boolean, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = r3.length
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x001b
            boolean r2 = r3[r1]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r4 = r5.g0(r4, r2)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Od(boolean[], java.lang.Object, we.p):java.lang.Object");
    }

    @fh.g
    public static final <T> gf.m Oe(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return new gf.m(0, Xe(tArr));
    }

    @fh.g
    public static final <K, M extends Map<? super K, List<Double>>> M Of(@fh.g double[] dArr, @fh.g M m10, @fh.g we.l<? super Double, ? extends K> lVar) {
        l0.p(dArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (double d10 : dArr) {
            Object A = lVar.A(Double.valueOf(d10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(Double.valueOf(d10));
        }
        return m10;
    }

    @oe.f
    public static final boolean Og(char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr.length == 0;
    }

    public static /* synthetic */ String Oh(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return Fh(zArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    @fh.g
    public static final <T, R> List<R> Oi(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T A : tArr) {
            arrayList.add(lVar.A(A));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double Oj(byte[] bArr, we.l<? super Byte, Double> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (!(bArr.length == 0)) {
            double doubleValue = lVar.A(Byte.valueOf(bArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(Byte.valueOf(bArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float Ok(short[] sArr, we.l<? super Short, Float> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Short.valueOf(sArr[0])).floatValue();
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(Short.valueOf(sArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "maxWithOrThrow")
    public static final float Ol(@fh.g float[] fArr, @fh.g Comparator<? super Float> comparator) {
        l0.p(fArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(fArr.length == 0)) {
            float f10 = fArr[0];
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                float f11 = fArr[o10.nextInt()];
                if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) < 0) {
                    f10 = f11;
                }
            }
            return f10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Om(char[] cArr, we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Character.valueOf(cArr[0]));
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Character.valueOf(cArr[o10.nextInt()]));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Long On(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            long j11 = jArr[o10.nextInt()];
            if (j10 > j11) {
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @h1(version = "1.4")
    @oe.f
    public static final int[] Oo(int[] iArr, we.l<? super Integer, u2> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "action");
        for (int valueOf : iArr) {
            lVar.A(Integer.valueOf(valueOf));
        }
        return iArr;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Integer Op(@fh.g int[] iArr, @fh.g ef.f fVar) {
        l0.p(iArr, "<this>");
        l0.p(fVar, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[fVar.m(iArr.length)]);
    }

    public static final byte Oq(@fh.g byte[] bArr, @fh.g we.q<? super Integer, ? super Byte, ? super Byte, Byte> qVar) {
        l0.p(bArr, "<this>");
        l0.p(qVar, "operation");
        int Re = Re(bArr);
        if (Re >= 0) {
            byte b10 = bArr[Re];
            for (int i10 = Re - 1; i10 >= 0; i10--) {
                b10 = qVar.y(Integer.valueOf(i10), Byte.valueOf(bArr[i10]), Byte.valueOf(b10)).byteValue();
            }
            return b10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final <T> List<T> Or(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return w.E();
        }
        List<T> uz = uz(tArr);
        d0.m1(uz);
        return uz;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Integer, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Os(int[] r4, R r5, we.p<? super R, ? super java.lang.Integer, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            goto L_0x0037
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            r3 = r4[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            r4 = r0
        L_0x0037:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Os(int[], java.lang.Object, we.p):java.util.List");
    }

    @fh.h
    public static final Boolean Ot(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        boolean z10 = false;
        Boolean bool = null;
        for (boolean z11 : zArr) {
            if (lVar.A(Boolean.valueOf(z11)).booleanValue()) {
                if (z10) {
                    return null;
                }
                bool = Boolean.valueOf(z11);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return bool;
    }

    @fh.g
    public static final boolean[] Ou(@fh.g boolean[] zArr, @fh.g Collection<Integer> collection) {
        l0.p(zArr, "<this>");
        l0.p(collection, "indices");
        boolean[] zArr2 = new boolean[collection.size()];
        int i10 = 0;
        for (Integer intValue : collection) {
            zArr2[i10] = zArr[intValue.intValue()];
            i10++;
        }
        return zArr2;
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Boolean> Ov(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        return ow(zArr, new g.a(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double Ow(@fh.g char[] cArr, @fh.g we.l<? super Character, Double> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (char valueOf : cArr) {
            d10 += lVar.A(Character.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfULong")
    public static final long Ox(double[] dArr, we.l<? super Double, j2> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        for (double valueOf : dArr) {
            l10 = j2.l(l10 + lVar.A(Double.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final <C extends Collection<? super Long>> C Oy(@fh.g long[] jArr, @fh.g C c10) {
        l0.p(jArr, "<this>");
        l0.p(c10, "destination");
        for (long valueOf : jArr) {
            c10.add(Long.valueOf(valueOf));
        }
        return c10;
    }

    @fh.g
    public static final Set<Boolean> Oz(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? (Set) Ry(zArr, new LinkedHashSet(z0.j(zArr.length))) : k1.f(Boolean.valueOf(zArr[0])) : l1.k();
    }

    public static final boolean P5(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        for (long valueOf : jArr) {
            if (lVar.A(Long.valueOf(valueOf)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @fh.g
    public static final <K, M extends Map<? super K, ? super Byte>> M P6(@fh.g byte[] bArr, @fh.g M m10, @fh.g we.l<? super Byte, ? extends K> lVar) {
        l0.p(bArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (byte b10 : bArr) {
            m10.put(lVar.A(Byte.valueOf(b10)), Byte.valueOf(b10));
        }
        return m10;
    }

    @ve.h(name = "averageOfDouble")
    public static final double P7(@fh.g Double[] dArr) {
        l0.p(dArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Double doubleValue : dArr) {
            d10 += doubleValue.doubleValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @zd.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @zd.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @b1(expression = "any { it == element }", imports = {}))
    public static final /* synthetic */ boolean P8(double[] dArr, double d10) {
        l0.p(dArr, "<this>");
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dArr[i10] == d10) {
                return true;
            }
        }
        return false;
    }

    @fh.g
    public static final List<Byte> P9(@fh.g byte[] bArr, int i10) {
        l0.p(bArr, "<this>");
        if (i10 >= 0) {
            return Vx(bArr, gf.v.u(bArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <V> List<V> PA(@fh.g long[] jArr, @fh.g long[] jArr2, @fh.g we.p<? super Long, ? super Long, ? extends V> pVar) {
        l0.p(jArr, "<this>");
        l0.p(jArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Long.valueOf(jArr[i10]), Long.valueOf(jArr2[i10])));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Short> Pa(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (lVar.A(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            }
        }
        return arrayList;
    }

    @oe.f
    public static final Byte Pb(byte[] bArr, we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        for (byte b10 : bArr) {
            if (lVar.A(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
        }
        return null;
    }

    @fh.h
    public static final <T> T Pc(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        for (T t10 : tArr) {
            if (lVar.A(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Byte, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Pd(@fh.g byte[] r5, R r6, @fh.g we.q<? super java.lang.Integer, ? super R, ? super java.lang.Byte, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L_0x000d:
            if (r1 >= r0) goto L_0x0023
            byte r3 = r5[r1]
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            java.lang.Object r6 = r7.y(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x000d
        L_0x0023:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Pd(byte[], java.lang.Object, we.q):java.lang.Object");
    }

    @fh.g
    public static final gf.m Pe(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        return new gf.m(0, Ye(sArr));
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, List<V>>> M Pf(@fh.g double[] dArr, @fh.g M m10, @fh.g we.l<? super Double, ? extends K> lVar, @fh.g we.l<? super Double, ? extends V> lVar2) {
        l0.p(dArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (double d10 : dArr) {
            Object A = lVar.A(Double.valueOf(d10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Double.valueOf(d10)));
        }
        return m10;
    }

    @oe.f
    public static final boolean Pg(double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr.length == 0;
    }

    public static final byte Ph(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (!(bArr.length == 0)) {
            return bArr[Re(bArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @fh.g
    public static final <R> List<R> Pi(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short valueOf : sArr) {
            arrayList.add(lVar.A(Short.valueOf(valueOf)));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double Pj(char[] cArr, we.l<? super Character, Double> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (!(cArr.length == 0)) {
            double doubleValue = lVar.A(Character.valueOf(cArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(Character.valueOf(cArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float Pk(boolean[] zArr, we.l<? super Boolean, Float> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Boolean.valueOf(zArr[0])).floatValue();
        s0 o10 = new gf.m(1, Ze(zArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(Boolean.valueOf(zArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "maxWithOrThrow")
    public static final int Pl(@fh.g int[] iArr, @fh.g Comparator<? super Integer> comparator) {
        l0.p(iArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(iArr.length == 0)) {
            int i10 = iArr[0];
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                int i11 = iArr[o10.nextInt()];
                if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i11)) < 0) {
                    i10 = i11;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Pm(double[] dArr, we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Double.valueOf(dArr[0]));
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Double.valueOf(dArr[o10.nextInt()]));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Short Pn(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            short s11 = sArr[o10.nextInt()];
            if (s10 > s11) {
                s10 = s11;
            }
        }
        return Short.valueOf(s10);
    }

    @h1(version = "1.4")
    @oe.f
    public static final long[] Po(long[] jArr, we.l<? super Long, u2> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "action");
        for (long valueOf : jArr) {
            lVar.A(Long.valueOf(valueOf));
        }
        return jArr;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @oe.f
    public static final Long Pp(long[] jArr) {
        l0.p(jArr, "<this>");
        return Qp(jArr, ef.f.O);
    }

    public static final char Pq(@fh.g char[] cArr, @fh.g we.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(cArr, "<this>");
        l0.p(qVar, "operation");
        int Se = Se(cArr);
        if (Se >= 0) {
            char c10 = cArr[Se];
            for (int i10 = Se - 1; i10 >= 0; i10--) {
                c10 = qVar.y(Integer.valueOf(i10), Character.valueOf(cArr[i10]), Character.valueOf(c10)).charValue();
            }
            return c10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final List<Short> Pr(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return w.E();
        }
        List<Short> vz = vz(sArr);
        d0.m1(vz);
        return vz;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.p, we.p<? super R, ? super java.lang.Long, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Ps(long[] r5, R r6, we.p<? super R, ? super java.lang.Long, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            goto L_0x0037
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            r3 = r5[r1]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r6 = r7.g0(r6, r3)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            r5 = r0
        L_0x0037:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Ps(long[], java.lang.Object, we.p):java.util.List");
    }

    @fh.h
    public static final Byte Pt(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> void Pu(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (tArr.length > 1) {
            o.I4(tArr, new g.a(lVar));
        }
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Byte> Pv(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        return gw(bArr, new g.c(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double Pw(@fh.g double[] dArr, @fh.g we.l<? super Double, Double> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (double valueOf : dArr) {
            d10 += lVar.A(Double.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfULong")
    public static final long Px(float[] fArr, we.l<? super Float, j2> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        for (float valueOf : fArr) {
            l10 = j2.l(l10 + lVar.A(Float.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final <T, C extends Collection<? super T>> C Py(@fh.g T[] tArr, @fh.g C c10) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        for (T add : tArr) {
            c10.add(add);
        }
        return c10;
    }

    @fh.g
    public static final short[] Pz(@fh.g Short[] shArr) {
        l0.p(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = shArr[i10].shortValue();
        }
        return sArr;
    }

    public static final <T> boolean Q5(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M Q6(@fh.g byte[] bArr, @fh.g M m10, @fh.g we.l<? super Byte, ? extends K> lVar, @fh.g we.l<? super Byte, ? extends V> lVar2) {
        l0.p(bArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (byte b10 : bArr) {
            m10.put(lVar.A(Byte.valueOf(b10)), lVar2.A(Byte.valueOf(b10)));
        }
        return m10;
    }

    @ve.h(name = "averageOfFloat")
    public static final double Q7(@fh.g Float[] fArr) {
        l0.p(fArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Float floatValue : fArr) {
            d10 += (double) floatValue.floatValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @zd.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @zd.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @b1(expression = "any { it == element }", imports = {}))
    public static final /* synthetic */ boolean Q8(float[] fArr, float f10) {
        l0.p(fArr, "<this>");
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (fArr[i10] == f10) {
                return true;
            }
        }
        return false;
    }

    @fh.g
    public static final List<Character> Q9(@fh.g char[] cArr, int i10) {
        l0.p(cArr, "<this>");
        if (i10 >= 0) {
            return Wx(cArr, gf.v.u(cArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R> List<u0<Long, R>> QA(@fh.g long[] jArr, @fh.g R[] rArr) {
        l0.p(jArr, "<this>");
        l0.p(rArr, "other");
        int min = Math.min(jArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            long j10 = jArr[i10];
            arrayList.add(r1.a(Long.valueOf(j10), rArr[i10]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Boolean> Qa(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (lVar.A(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    @oe.f
    public static final Character Qb(char[] cArr, we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        for (char c10 : cArr) {
            if (lVar.A(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
        }
        return null;
    }

    @fh.h
    public static final Short Qc(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Qd(@fh.g char[] r5, R r6, @fh.g we.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L_0x000d:
            if (r1 >= r0) goto L_0x0023
            char r3 = r5[r1]
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            java.lang.Object r6 = r7.y(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x000d
        L_0x0023:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Qd(char[], java.lang.Object, we.q):java.lang.Object");
    }

    @fh.g
    public static final gf.m Qe(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return new gf.m(0, Ze(zArr));
    }

    @fh.g
    public static final <K, M extends Map<? super K, List<Float>>> M Qf(@fh.g float[] fArr, @fh.g M m10, @fh.g we.l<? super Float, ? extends K> lVar) {
        l0.p(fArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (float f10 : fArr) {
            Object A = lVar.A(Float.valueOf(f10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(Float.valueOf(f10));
        }
        return m10;
    }

    @oe.f
    public static final boolean Qg(float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr.length == 0;
    }

    public static final byte Qh(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                byte b10 = bArr[length];
                if (!lVar.A(Byte.valueOf(b10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return b10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final <R> List<R> Qi(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean valueOf : zArr) {
            arrayList.add(lVar.A(Boolean.valueOf(valueOf)));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double Qj(double[] dArr, we.l<? super Double, Double> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (!(dArr.length == 0)) {
            double doubleValue = lVar.A(Double.valueOf(dArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(Double.valueOf(dArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R Qk(byte[] bArr, Comparator<? super R> comparator, we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(bArr.length == 0)) {
            R A = lVar.A(Byte.valueOf(bArr[0]));
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Byte.valueOf(bArr[o10.nextInt()]));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.7")
    @ve.h(name = "maxWithOrThrow")
    public static final long Ql(@fh.g long[] jArr, @fh.g Comparator<? super Long> comparator) {
        l0.p(jArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(jArr.length == 0)) {
            long j10 = jArr[0];
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                long j11 = jArr[o10.nextInt()];
                if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) < 0) {
                    j10 = j11;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Qm(float[] fArr, we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Float.valueOf(fArr[0]));
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Float.valueOf(fArr[o10.nextInt()]));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final byte Qn(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (!(bArr.length == 0)) {
            byte b10 = bArr[0];
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                byte b11 = bArr[o10.nextInt()];
                if (b10 > b11) {
                    b10 = b11;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    public static final <T> T[] Qo(T[] tArr, we.l<? super T, u2> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "action");
        for (T A : tArr) {
            lVar.A(A);
        }
        return tArr;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Long Qp(@fh.g long[] jArr, @fh.g ef.f fVar) {
        l0.p(jArr, "<this>");
        l0.p(fVar, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[fVar.m(jArr.length)]);
    }

    public static final double Qq(@fh.g double[] dArr, @fh.g we.q<? super Integer, ? super Double, ? super Double, Double> qVar) {
        l0.p(dArr, "<this>");
        l0.p(qVar, "operation");
        int Te = Te(dArr);
        if (Te >= 0) {
            double d10 = dArr[Te];
            for (int i10 = Te - 1; i10 >= 0; i10--) {
                d10 = qVar.y(Integer.valueOf(i10), Double.valueOf(dArr[i10]), Double.valueOf(d10)).doubleValue();
            }
            return d10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final List<Boolean> Qr(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return w.E();
        }
        List<Boolean> wz = wz(zArr);
        d0.m1(wz);
        return wz;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.util.List<R> Qs(@fh.g T[] r4, R r5, @fh.g we.p<? super R, ? super T, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            goto L_0x0033
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0032
            r3 = r4[r1]
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0032:
            r4 = r0
        L_0x0033:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Qs(java.lang.Object[], java.lang.Object, we.p):java.util.List");
    }

    @fh.h
    public static final Byte Qt(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        boolean z10 = false;
        Byte b10 = null;
        for (byte b11 : bArr) {
            if (lVar.A(Byte.valueOf(b11)).booleanValue()) {
                if (z10) {
                    return null;
                }
                b10 = Byte.valueOf(b11);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return b10;
    }

    public static final <T, R extends Comparable<? super R>> void Qu(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (tArr.length > 1) {
            o.I4(tArr, new g.c(lVar));
        }
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Character> Qv(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        return hw(cArr, new g.c(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double Qw(@fh.g float[] fArr, @fh.g we.l<? super Float, Double> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (float valueOf : fArr) {
            d10 += lVar.A(Float.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfULong")
    public static final long Qx(int[] iArr, we.l<? super Integer, j2> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        for (int valueOf : iArr) {
            l10 = j2.l(l10 + lVar.A(Integer.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final <C extends Collection<? super Short>> C Qy(@fh.g short[] sArr, @fh.g C c10) {
        l0.p(sArr, "<this>");
        l0.p(c10, "destination");
        for (short valueOf : sArr) {
            c10.add(Short.valueOf(valueOf));
        }
        return c10;
    }

    @fh.g
    public static final Set<Byte> Qz(@fh.g byte[] bArr, @fh.g Iterable<Byte> iterable) {
        l0.p(bArr, "<this>");
        l0.p(iterable, "other");
        Set<Byte> xz = xz(bArr);
        b0.o0(xz, iterable);
        return xz;
    }

    public static final <T> boolean R5(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        for (T A : tArr) {
            if (lVar.A(A).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @fh.g
    public static final <K, M extends Map<? super K, ? super Character>> M R6(@fh.g char[] cArr, @fh.g M m10, @fh.g we.l<? super Character, ? extends K> lVar) {
        l0.p(cArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (char c10 : cArr) {
            m10.put(lVar.A(Character.valueOf(c10)), Character.valueOf(c10));
        }
        return m10;
    }

    @ve.h(name = "averageOfInt")
    public static final double R7(@fh.g Integer[] numArr) {
        l0.p(numArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Integer intValue : numArr) {
            d10 += (double) intValue.intValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static final boolean R8(@fh.g int[] iArr, int i10) {
        l0.p(iArr, "<this>");
        return hg(iArr, i10) >= 0;
    }

    @fh.g
    public static final List<Double> R9(@fh.g double[] dArr, int i10) {
        l0.p(dArr, "<this>");
        if (i10 >= 0) {
            return Xx(dArr, gf.v.u(dArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R, V> List<V> RA(@fh.g long[] jArr, @fh.g R[] rArr, @fh.g we.p<? super Long, ? super R, ? extends V> pVar) {
        l0.p(jArr, "<this>");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(jArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Long.valueOf(jArr[i10]), rArr[i10]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Byte> Ra(@fh.g byte[] bArr, @fh.g we.p<? super Integer, ? super Byte, Boolean> pVar) {
        l0.p(bArr, "<this>");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @oe.f
    public static final Double Rb(double[] dArr, we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        for (double d10 : dArr) {
            if (lVar.A(Double.valueOf(d10)).booleanValue()) {
                return Double.valueOf(d10);
            }
        }
        return null;
    }

    @fh.h
    public static final Short Rc(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        for (short s10 : sArr) {
            if (lVar.A(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Double, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Rd(@fh.g double[] r6, R r7, @fh.g we.q<? super java.lang.Integer, ? super R, ? super java.lang.Double, ? extends R> r8) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r8, r0)
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L_0x000d:
            if (r1 >= r0) goto L_0x0023
            r3 = r6[r1]
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Object r7 = r8.y(r2, r7, r3)
            int r1 = r1 + 1
            r2 = r5
            goto L_0x000d
        L_0x0023:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Rd(double[], java.lang.Object, we.q):java.lang.Object");
    }

    public static final int Re(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr.length - 1;
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, List<V>>> M Rf(@fh.g float[] fArr, @fh.g M m10, @fh.g we.l<? super Float, ? extends K> lVar, @fh.g we.l<? super Float, ? extends V> lVar2) {
        l0.p(fArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (float f10 : fArr) {
            Object A = lVar.A(Float.valueOf(f10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Float.valueOf(f10)));
        }
        return m10;
    }

    @oe.f
    public static final boolean Rg(int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr.length == 0;
    }

    public static final char Rh(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (!(cArr.length == 0)) {
            return cArr[Se(cArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @fh.g
    public static final <R> List<R> Ri(@fh.g byte[] bArr, @fh.g we.p<? super Integer, ? super Byte, ? extends R> pVar) {
        l0.p(bArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double Rj(float[] fArr, we.l<? super Float, Double> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (!(fArr.length == 0)) {
            double doubleValue = lVar.A(Float.valueOf(fArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(Float.valueOf(fArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R Rk(char[] cArr, Comparator<? super R> comparator, we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(cArr.length == 0)) {
            R A = lVar.A(Character.valueOf(cArr[0]));
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Character.valueOf(cArr[o10.nextInt()]));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.7")
    @ve.h(name = "maxWithOrThrow")
    public static final <T> T Rl(@fh.g T[] tArr, @fh.g Comparator<? super T> comparator) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(tArr.length == 0)) {
            T t10 = tArr[0];
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            while (o10.hasNext()) {
                T t11 = tArr[o10.nextInt()];
                if (comparator.compare(t10, t11) < 0) {
                    t10 = t11;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Rm(int[] iArr, we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Integer.valueOf(iArr[0]));
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Integer.valueOf(iArr[o10.nextInt()]));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final char Rn(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (!(cArr.length == 0)) {
            char c10 = cArr[0];
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                char c11 = cArr[o10.nextInt()];
                if (l0.t(c10, c11) > 0) {
                    c10 = c11;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    public static final short[] Ro(short[] sArr, we.l<? super Short, u2> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "action");
        for (short valueOf : sArr) {
            lVar.A(Short.valueOf(valueOf));
        }
        return sArr;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @oe.f
    public static final <T> T Rp(T[] tArr) {
        l0.p(tArr, "<this>");
        return Sp(tArr, ef.f.O);
    }

    public static final float Rq(@fh.g float[] fArr, @fh.g we.q<? super Integer, ? super Float, ? super Float, Float> qVar) {
        l0.p(fArr, "<this>");
        l0.p(qVar, "operation");
        int Ue = Ue(fArr);
        if (Ue >= 0) {
            float f10 = fArr[Ue];
            for (int i10 = Ue - 1; i10 >= 0; i10--) {
                f10 = qVar.y(Integer.valueOf(i10), Float.valueOf(fArr[i10]), Float.valueOf(f10)).floatValue();
            }
            return f10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final byte[] Rr(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int Re = Re(bArr);
        s0 o10 = new gf.m(0, Re).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            bArr2[Re - nextInt] = bArr[nextInt];
        }
        return bArr2;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Short, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Rs(short[] r4, R r5, we.p<? super R, ? super java.lang.Short, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            goto L_0x0037
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            short r3 = r4[r1]
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            r4 = r0
        L_0x0037:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Rs(short[], java.lang.Object, we.p):java.util.List");
    }

    @fh.h
    public static final Character Rt(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    public static final void Ru(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (bArr.length > 1) {
            o.h4(bArr);
            qr(bArr);
        }
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Double> Rv(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        return iw(dArr, new g.c(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double Rw(@fh.g int[] iArr, @fh.g we.l<? super Integer, Double> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (int valueOf : iArr) {
            d10 += lVar.A(Integer.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfULong")
    public static final long Rx(long[] jArr, we.l<? super Long, j2> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        for (long valueOf : jArr) {
            l10 = j2.l(l10 + lVar.A(Long.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final <C extends Collection<? super Boolean>> C Ry(@fh.g boolean[] zArr, @fh.g C c10) {
        l0.p(zArr, "<this>");
        l0.p(c10, "destination");
        for (boolean valueOf : zArr) {
            c10.add(Boolean.valueOf(valueOf));
        }
        return c10;
    }

    @fh.g
    public static final Set<Character> Rz(@fh.g char[] cArr, @fh.g Iterable<Character> iterable) {
        l0.p(cArr, "<this>");
        l0.p(iterable, "other");
        Set<Character> yz = yz(cArr);
        b0.o0(yz, iterable);
        return yz;
    }

    public static final boolean S5(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M S6(@fh.g char[] cArr, @fh.g M m10, @fh.g we.l<? super Character, ? extends K> lVar, @fh.g we.l<? super Character, ? extends V> lVar2) {
        l0.p(cArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (char c10 : cArr) {
            m10.put(lVar.A(Character.valueOf(c10)), lVar2.A(Character.valueOf(c10)));
        }
        return m10;
    }

    @ve.h(name = "averageOfLong")
    public static final double S7(@fh.g Long[] lArr) {
        l0.p(lArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Long longValue : lArr) {
            d10 += (double) longValue.longValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static final boolean S8(@fh.g long[] jArr, long j10) {
        l0.p(jArr, "<this>");
        return ig(jArr, j10) >= 0;
    }

    @fh.g
    public static final List<Float> S9(@fh.g float[] fArr, int i10) {
        l0.p(fArr, "<this>");
        if (i10 >= 0) {
            return Yx(fArr, gf.v.u(fArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <T, R> List<u0<T, R>> SA(@fh.g T[] tArr, @fh.g Iterable<? extends R> iterable) {
        l0.p(tArr, "<this>");
        l0.p(iterable, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(r1.a(tArr[i10], next));
            i10++;
        }
        return arrayList;
    }

    @fh.g
    public static final List<Character> Sa(@fh.g char[] cArr, @fh.g we.p<? super Integer, ? super Character, Boolean> pVar) {
        l0.p(cArr, "<this>");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char c10 = cArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @oe.f
    public static final Float Sb(float[] fArr, we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        for (float f10 : fArr) {
            if (lVar.A(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
        }
        return null;
    }

    @fh.g
    public static final <R> List<R> Sc(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends Iterable<? extends R>> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte valueOf : bArr) {
            b0.o0(arrayList, (Iterable) lVar.A(Byte.valueOf(valueOf)));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Float, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Sd(@fh.g float[] r5, R r6, @fh.g we.q<? super java.lang.Integer, ? super R, ? super java.lang.Float, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L_0x000d:
            if (r1 >= r0) goto L_0x0023
            r3 = r5[r1]
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r6 = r7.y(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x000d
        L_0x0023:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Sd(float[], java.lang.Object, we.q):java.lang.Object");
    }

    public static final int Se(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr.length - 1;
    }

    @fh.g
    public static final <K, M extends Map<? super K, List<Integer>>> M Sf(@fh.g int[] iArr, @fh.g M m10, @fh.g we.l<? super Integer, ? extends K> lVar) {
        l0.p(iArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (int i10 : iArr) {
            Object A = lVar.A(Integer.valueOf(i10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(Integer.valueOf(i10));
        }
        return m10;
    }

    @oe.f
    public static final boolean Sg(long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr.length == 0;
    }

    public static final char Sh(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char c10 = cArr[length];
                if (!lVar.A(Character.valueOf(c10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return c10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final <R> List<R> Si(@fh.g char[] cArr, @fh.g we.p<? super Integer, ? super Character, ? extends R> pVar) {
        l0.p(cArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double Sj(int[] iArr, we.l<? super Integer, Double> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (!(iArr.length == 0)) {
            double doubleValue = lVar.A(Integer.valueOf(iArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(Integer.valueOf(iArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R Sk(double[] dArr, Comparator<? super R> comparator, we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(dArr.length == 0)) {
            R A = lVar.A(Double.valueOf(dArr[0]));
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Double.valueOf(dArr[o10.nextInt()]));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.7")
    @ve.h(name = "maxWithOrThrow")
    public static final short Sl(@fh.g short[] sArr, @fh.g Comparator<? super Short> comparator) {
        l0.p(sArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(sArr.length == 0)) {
            short s10 = sArr[0];
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                short s11 = sArr[o10.nextInt()];
                if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) < 0) {
                    s10 = s11;
                }
            }
            return s10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Sm(long[] jArr, we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Long.valueOf(jArr[0]));
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Long.valueOf(jArr[o10.nextInt()]));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final double Sn(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (!(dArr.length == 0)) {
            double d10 = dArr[0];
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                d10 = Math.min(d10, dArr[o10.nextInt()]);
            }
            return d10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    public static final boolean[] So(boolean[] zArr, we.l<? super Boolean, u2> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "action");
        for (boolean valueOf : zArr) {
            lVar.A(Boolean.valueOf(valueOf));
        }
        return zArr;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final <T> T Sp(@fh.g T[] tArr, @fh.g ef.f fVar) {
        l0.p(tArr, "<this>");
        l0.p(fVar, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[fVar.m(tArr.length)];
    }

    public static final int Sq(@fh.g int[] iArr, @fh.g we.q<? super Integer, ? super Integer, ? super Integer, Integer> qVar) {
        l0.p(iArr, "<this>");
        l0.p(qVar, "operation");
        int Ve = Ve(iArr);
        if (Ve >= 0) {
            int i10 = iArr[Ve];
            for (int i11 = Ve - 1; i11 >= 0; i11--) {
                i10 = qVar.y(Integer.valueOf(i11), Integer.valueOf(iArr[i11]), Integer.valueOf(i10)).intValue();
            }
            return i10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final char[] Sr(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int Se = Se(cArr);
        s0 o10 = new gf.m(0, Se).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            cArr2[Se - nextInt] = cArr[nextInt];
        }
        return cArr2;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Boolean, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Ss(boolean[] r4, R r5, we.p<? super R, ? super java.lang.Boolean, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            goto L_0x0037
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            boolean r3 = r4[r1]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            r4 = r0
        L_0x0037:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Ss(boolean[], java.lang.Object, we.p):java.util.List");
    }

    @fh.h
    public static final Character St(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        boolean z10 = false;
        Character ch2 = null;
        for (char c10 : cArr) {
            if (lVar.A(Character.valueOf(c10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                ch2 = Character.valueOf(c10);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return ch2;
    }

    @h1(version = "1.4")
    public static final void Su(@fh.g byte[] bArr, int i10, int i11) {
        l0.p(bArr, "<this>");
        o.i4(bArr, i10, i11);
        rr(bArr, i10, i11);
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Float> Sv(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        return jw(fArr, new g.c(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double Sw(@fh.g long[] jArr, @fh.g we.l<? super Long, Double> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (long valueOf : jArr) {
            d10 += lVar.A(Long.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfULong")
    public static final <T> long Sx(T[] tArr, we.l<? super T, j2> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        for (T A : tArr) {
            l10 = j2.l(l10 + lVar.A(A).l0());
        }
        return l10;
    }

    @fh.g
    public static final double[] Sy(@fh.g Double[] dArr) {
        l0.p(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = dArr[i10].doubleValue();
        }
        return dArr2;
    }

    @fh.g
    public static final Set<Double> Sz(@fh.g double[] dArr, @fh.g Iterable<Double> iterable) {
        l0.p(dArr, "<this>");
        l0.p(iterable, "other");
        Set<Double> zz = zz(dArr);
        b0.o0(zz, iterable);
        return zz;
    }

    public static final boolean T5(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        for (short valueOf : sArr) {
            if (lVar.A(Short.valueOf(valueOf)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @fh.g
    public static final <K, M extends Map<? super K, ? super Double>> M T6(@fh.g double[] dArr, @fh.g M m10, @fh.g we.l<? super Double, ? extends K> lVar) {
        l0.p(dArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (double d10 : dArr) {
            m10.put(lVar.A(Double.valueOf(d10)), Double.valueOf(d10));
        }
        return m10;
    }

    @ve.h(name = "averageOfShort")
    public static final double T7(@fh.g Short[] shArr) {
        l0.p(shArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Short shortValue : shArr) {
            d10 += (double) shortValue.shortValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static final <T> boolean T8(@fh.g T[] tArr, T t10) {
        l0.p(tArr, "<this>");
        return jg(tArr, t10) >= 0;
    }

    @fh.g
    public static final List<Integer> T9(@fh.g int[] iArr, int i10) {
        l0.p(iArr, "<this>");
        if (i10 >= 0) {
            return Zx(iArr, gf.v.u(iArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <T, R, V> List<V> TA(@fh.g T[] tArr, @fh.g Iterable<? extends R> iterable, @fh.g we.p<? super T, ? super R, ? extends V> pVar) {
        l0.p(tArr, "<this>");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(pVar.g0(tArr[i10], next));
            i10++;
        }
        return arrayList;
    }

    @fh.g
    public static final List<Double> Ta(@fh.g double[] dArr, @fh.g we.p<? super Integer, ? super Double, Boolean> pVar) {
        l0.p(dArr, "<this>");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            double d10 = dArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @oe.f
    public static final Integer Tb(int[] iArr, we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        for (int i10 : iArr) {
            if (lVar.A(Integer.valueOf(i10)).booleanValue()) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    @fh.g
    public static final <R> List<R> Tc(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends Iterable<? extends R>> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (char valueOf : cArr) {
            b0.o0(arrayList, (Iterable) lVar.A(Character.valueOf(valueOf)));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Integer, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Td(@fh.g int[] r5, R r6, @fh.g we.q<? super java.lang.Integer, ? super R, ? super java.lang.Integer, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L_0x000d:
            if (r1 >= r0) goto L_0x0023
            r3 = r5[r1]
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r6 = r7.y(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x000d
        L_0x0023:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Td(int[], java.lang.Object, we.q):java.lang.Object");
    }

    public static final int Te(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr.length - 1;
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, List<V>>> M Tf(@fh.g int[] iArr, @fh.g M m10, @fh.g we.l<? super Integer, ? extends K> lVar, @fh.g we.l<? super Integer, ? extends V> lVar2) {
        l0.p(iArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (int i10 : iArr) {
            Object A = lVar.A(Integer.valueOf(i10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Integer.valueOf(i10)));
        }
        return m10;
    }

    @oe.f
    public static final <T> boolean Tg(T[] tArr) {
        l0.p(tArr, "<this>");
        return tArr.length == 0;
    }

    public static final double Th(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (!(dArr.length == 0)) {
            return dArr[Te(dArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @fh.g
    public static final <R> List<R> Ti(@fh.g double[] dArr, @fh.g we.p<? super Integer, ? super Double, ? extends R> pVar) {
        l0.p(dArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double Tj(long[] jArr, we.l<? super Long, Double> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (!(jArr.length == 0)) {
            double doubleValue = lVar.A(Long.valueOf(jArr[0])).doubleValue();
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(Long.valueOf(jArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R Tk(float[] fArr, Comparator<? super R> comparator, we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(fArr.length == 0)) {
            R A = lVar.A(Float.valueOf(fArr[0]));
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Float.valueOf(fArr[o10.nextInt()]));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.7")
    @ve.h(name = "maxWithOrThrow")
    public static final boolean Tl(@fh.g boolean[] zArr, @fh.g Comparator<? super Boolean> comparator) {
        l0.p(zArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(zArr.length == 0)) {
            boolean z10 = zArr[0];
            s0 o10 = new gf.m(1, Ze(zArr)).iterator();
            while (o10.hasNext()) {
                boolean z11 = zArr[o10.nextInt()];
                if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) < 0) {
                    z10 = z11;
                }
            }
            return z10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R extends Comparable<? super R>> R Tm(T[] tArr, we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(tArr[0]);
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(tArr[o10.nextInt()]);
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final double Tn(@fh.g Double[] dArr) {
        l0.p(dArr, "<this>");
        if (!(dArr.length == 0)) {
            double doubleValue = dArr[0].doubleValue();
            s0 o10 = new gf.m(1, Xe(dArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, dArr[o10.nextInt()].doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    public static final byte[] To(byte[] bArr, we.p<? super Integer, ? super Byte, u2> pVar) {
        l0.p(bArr, "<this>");
        l0.p(pVar, "action");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
        return bArr;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @oe.f
    public static final Short Tp(short[] sArr) {
        l0.p(sArr, "<this>");
        return Up(sArr, ef.f.O);
    }

    public static final long Tq(@fh.g long[] jArr, @fh.g we.q<? super Integer, ? super Long, ? super Long, Long> qVar) {
        l0.p(jArr, "<this>");
        l0.p(qVar, "operation");
        int We = We(jArr);
        if (We >= 0) {
            long j10 = jArr[We];
            for (int i10 = We - 1; i10 >= 0; i10--) {
                j10 = qVar.y(Integer.valueOf(i10), Long.valueOf(jArr[i10]), Long.valueOf(j10)).longValue();
            }
            return j10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final double[] Tr(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int Te = Te(dArr);
        s0 o10 = new gf.m(0, Te).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            dArr2[Te - nextInt] = dArr[nextInt];
        }
        return dArr2;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Byte, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Ts(byte[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Byte, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            goto L_0x003b
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            byte r4 = r5[r1]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            r5 = r0
        L_0x003b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Ts(byte[], java.lang.Object, we.q):java.util.List");
    }

    @fh.h
    public static final Double Tt(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    public static final void Tu(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (cArr.length > 1) {
            o.j4(cArr);
            sr(cArr);
        }
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Integer> Tv(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        return kw(iArr, new g.c(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> double Tw(@fh.g T[] tArr, @fh.g we.l<? super T, Double> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (T A : tArr) {
            d10 += lVar.A(A).doubleValue();
        }
        return d10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfULong")
    public static final long Tx(short[] sArr, we.l<? super Short, j2> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        for (short valueOf : sArr) {
            l10 = j2.l(l10 + lVar.A(Short.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final float[] Ty(@fh.g Float[] fArr) {
        l0.p(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = fArr[i10].floatValue();
        }
        return fArr2;
    }

    @fh.g
    public static final Set<Float> Tz(@fh.g float[] fArr, @fh.g Iterable<Float> iterable) {
        l0.p(fArr, "<this>");
        l0.p(iterable, "other");
        Set<Float> Az = Az(fArr);
        b0.o0(Az, iterable);
        return Az;
    }

    public static final boolean U5(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M U6(@fh.g double[] dArr, @fh.g M m10, @fh.g we.l<? super Double, ? extends K> lVar, @fh.g we.l<? super Double, ? extends V> lVar2) {
        l0.p(dArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (double d10 : dArr) {
            m10.put(lVar.A(Double.valueOf(d10)), lVar2.A(Double.valueOf(d10)));
        }
        return m10;
    }

    @oe.f
    public static final byte U7(byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr[0];
    }

    public static final boolean U8(@fh.g short[] sArr, short s10) {
        l0.p(sArr, "<this>");
        return kg(sArr, s10) >= 0;
    }

    @fh.g
    public static final List<Long> U9(@fh.g long[] jArr, int i10) {
        l0.p(jArr, "<this>");
        if (i10 >= 0) {
            return ay(jArr, gf.v.u(jArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <T, R> List<u0<T, R>> UA(@fh.g T[] tArr, @fh.g R[] rArr) {
        l0.p(tArr, "<this>");
        l0.p(rArr, "other");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(r1.a(tArr[i10], rArr[i10]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Float> Ua(@fh.g float[] fArr, @fh.g we.p<? super Integer, ? super Float, Boolean> pVar) {
        l0.p(fArr, "<this>");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            float f10 = fArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @oe.f
    public static final Long Ub(long[] jArr, we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        for (long j10 : jArr) {
            if (lVar.A(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
        }
        return null;
    }

    @fh.g
    public static final <R> List<R> Uc(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends Iterable<? extends R>> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (double valueOf : dArr) {
            b0.o0(arrayList, (Iterable) lVar.A(Double.valueOf(valueOf)));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Long, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Ud(@fh.g long[] r6, R r7, @fh.g we.q<? super java.lang.Integer, ? super R, ? super java.lang.Long, ? extends R> r8) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r8, r0)
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L_0x000d:
            if (r1 >= r0) goto L_0x0023
            r3 = r6[r1]
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r7 = r8.y(r2, r7, r3)
            int r1 = r1 + 1
            r2 = r5
            goto L_0x000d
        L_0x0023:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Ud(long[], java.lang.Object, we.q):java.lang.Object");
    }

    public static final int Ue(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr.length - 1;
    }

    @fh.g
    public static final <K, M extends Map<? super K, List<Long>>> M Uf(@fh.g long[] jArr, @fh.g M m10, @fh.g we.l<? super Long, ? extends K> lVar) {
        l0.p(jArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (long j10 : jArr) {
            Object A = lVar.A(Long.valueOf(j10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(Long.valueOf(j10));
        }
        return m10;
    }

    @oe.f
    public static final boolean Ug(short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr.length == 0;
    }

    public static final double Uh(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                double d10 = dArr[length];
                if (!lVar.A(Double.valueOf(d10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return d10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final <R> List<R> Ui(@fh.g float[] fArr, @fh.g we.p<? super Integer, ? super Float, ? extends R> pVar) {
        l0.p(fArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> double Uj(T[] tArr, we.l<? super T, Double> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (!(tArr.length == 0)) {
            double doubleValue = lVar.A(tArr[0]).doubleValue();
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(tArr[o10.nextInt()]).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R Uk(int[] iArr, Comparator<? super R> comparator, we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(iArr.length == 0)) {
            R A = lVar.A(Integer.valueOf(iArr[0]));
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Integer.valueOf(iArr[o10.nextInt()]));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Boolean Ul(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int Ze = Ze(zArr);
        if (Ze == 0) {
            return Boolean.valueOf(z10);
        }
        Comparable comparable = (Comparable) lVar.A(Boolean.valueOf(z10));
        s0 o10 = new gf.m(1, Ze).iterator();
        while (o10.hasNext()) {
            boolean z11 = zArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Boolean.valueOf(z11));
            if (comparable.compareTo(comparable2) > 0) {
                z10 = z11;
                comparable = comparable2;
            }
        }
        return Boolean.valueOf(z10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Um(short[] sArr, we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Short.valueOf(sArr[0]));
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Short.valueOf(sArr[o10.nextInt()]));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final float Un(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (!(fArr.length == 0)) {
            float f10 = fArr[0];
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                f10 = Math.min(f10, fArr[o10.nextInt()]);
            }
            return f10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    public static final char[] Uo(char[] cArr, we.p<? super Integer, ? super Character, u2> pVar) {
        l0.p(cArr, "<this>");
        l0.p(pVar, "action");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
        return cArr;
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Short Up(@fh.g short[] sArr, @fh.g ef.f fVar) {
        l0.p(sArr, "<this>");
        l0.p(fVar, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[fVar.m(sArr.length)]);
    }

    public static final <S, T extends S> S Uq(@fh.g T[] tArr, @fh.g we.q<? super Integer, ? super T, ? super S, ? extends S> qVar) {
        l0.p(tArr, "<this>");
        l0.p(qVar, "operation");
        int Xe = Xe(tArr);
        if (Xe >= 0) {
            int i10 = Xe - 1;
            Object obj = tArr[Xe];
            while (i10 >= 0) {
                i10--;
                obj = qVar.y(Integer.valueOf(i10), tArr[i10], obj);
            }
            return obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final float[] Ur(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int Ue = Ue(fArr);
        s0 o10 = new gf.m(0, Ue).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            fArr2[Ue - nextInt] = fArr[nextInt];
        }
        return fArr2;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Us(char[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            goto L_0x003b
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            char r4 = r5[r1]
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            r5 = r0
        L_0x003b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Us(char[], java.lang.Object, we.q):java.util.List");
    }

    @fh.h
    public static final Double Ut(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        boolean z10 = false;
        Double d10 = null;
        for (double d11 : dArr) {
            if (lVar.A(Double.valueOf(d11)).booleanValue()) {
                if (z10) {
                    return null;
                }
                d10 = Double.valueOf(d11);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return d10;
    }

    @h1(version = "1.4")
    public static final void Uu(@fh.g char[] cArr, int i10, int i11) {
        l0.p(cArr, "<this>");
        o.k4(cArr, i10, i11);
        tr(cArr, i10, i11);
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Long> Uv(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        return lw(jArr, new g.c(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double Uw(@fh.g short[] sArr, @fh.g we.l<? super Short, Double> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (short valueOf : sArr) {
            d10 += lVar.A(Short.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {zd.t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfULong")
    public static final long Ux(boolean[] zArr, we.l<? super Boolean, j2> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        for (boolean valueOf : zArr) {
            l10 = j2.l(l10 + lVar.A(Boolean.valueOf(valueOf)).l0());
        }
        return l10;
    }

    @fh.g
    public static final HashSet<Byte> Uy(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        return (HashSet) Jy(bArr, new HashSet(z0.j(bArr.length)));
    }

    @fh.g
    public static final Set<Integer> Uz(@fh.g int[] iArr, @fh.g Iterable<Integer> iterable) {
        l0.p(iArr, "<this>");
        l0.p(iterable, "other");
        Set<Integer> Bz = Bz(iArr);
        b0.o0(Bz, iterable);
        return Bz;
    }

    public static final boolean V5(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        for (boolean valueOf : zArr) {
            if (lVar.A(Boolean.valueOf(valueOf)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @fh.g
    public static final <K, M extends Map<? super K, ? super Float>> M V6(@fh.g float[] fArr, @fh.g M m10, @fh.g we.l<? super Float, ? extends K> lVar) {
        l0.p(fArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (float f10 : fArr) {
            m10.put(lVar.A(Float.valueOf(f10)), Float.valueOf(f10));
        }
        return m10;
    }

    @oe.f
    public static final char V7(char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr[0];
    }

    public static final boolean V8(@fh.g boolean[] zArr, boolean z10) {
        l0.p(zArr, "<this>");
        return lg(zArr, z10) >= 0;
    }

    @fh.g
    public static final <T> List<T> V9(@fh.g T[] tArr, int i10) {
        l0.p(tArr, "<this>");
        if (i10 >= 0) {
            return cy(tArr, gf.v.u(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <T, R, V> List<V> VA(@fh.g T[] tArr, @fh.g R[] rArr, @fh.g we.p<? super T, ? super R, ? extends V> pVar) {
        l0.p(tArr, "<this>");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(tArr[i10], rArr[i10]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Integer> Va(@fh.g int[] iArr, @fh.g we.p<? super Integer, ? super Integer, Boolean> pVar) {
        l0.p(iArr, "<this>");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            int i13 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Integer.valueOf(i12)).booleanValue()) {
                arrayList.add(Integer.valueOf(i12));
            }
            i10++;
            i11 = i13;
        }
        return arrayList;
    }

    @oe.f
    public static final <T> T Vb(T[] tArr, we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        for (T t10 : tArr) {
            if (lVar.A(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    @fh.g
    public static final <R> List<R> Vc(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends Iterable<? extends R>> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (float valueOf : fArr) {
            b0.o0(arrayList, (Iterable) lVar.A(Float.valueOf(valueOf)));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R Vd(@fh.g T[] r5, R r6, @fh.g we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L_0x000d:
            if (r1 >= r0) goto L_0x001f
            r3 = r5[r1]
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r6 = r7.y(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x000d
        L_0x001f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Vd(java.lang.Object[], java.lang.Object, we.q):java.lang.Object");
    }

    public static final int Ve(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr.length - 1;
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, List<V>>> M Vf(@fh.g long[] jArr, @fh.g M m10, @fh.g we.l<? super Long, ? extends K> lVar, @fh.g we.l<? super Long, ? extends V> lVar2) {
        l0.p(jArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (long j10 : jArr) {
            Object A = lVar.A(Long.valueOf(j10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Long.valueOf(j10)));
        }
        return m10;
    }

    @oe.f
    public static final boolean Vg(boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr.length == 0;
    }

    public static final float Vh(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (!(fArr.length == 0)) {
            return fArr[Ue(fArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @fh.g
    public static final <R> List<R> Vi(@fh.g int[] iArr, @fh.g we.p<? super Integer, ? super Integer, ? extends R> pVar) {
        l0.p(iArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double Vj(short[] sArr, we.l<? super Short, Double> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (!(sArr.length == 0)) {
            double doubleValue = lVar.A(Short.valueOf(sArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(Short.valueOf(sArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R Vk(long[] jArr, Comparator<? super R> comparator, we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(jArr.length == 0)) {
            R A = lVar.A(Long.valueOf(jArr[0]));
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Long.valueOf(jArr[o10.nextInt()]));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Byte Vl(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int Re = Re(bArr);
        if (Re == 0) {
            return Byte.valueOf(b10);
        }
        Comparable comparable = (Comparable) lVar.A(Byte.valueOf(b10));
        s0 o10 = new gf.m(1, Re).iterator();
        while (o10.hasNext()) {
            byte b11 = bArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Byte.valueOf(b11));
            if (comparable.compareTo(comparable2) > 0) {
                b10 = b11;
                comparable = comparable2;
            }
        }
        return Byte.valueOf(b10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Vm(boolean[] zArr, we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Boolean.valueOf(zArr[0]));
        s0 o10 = new gf.m(1, Ze(zArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Boolean.valueOf(zArr[o10.nextInt()]));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final float Vn(@fh.g Float[] fArr) {
        l0.p(fArr, "<this>");
        if (!(fArr.length == 0)) {
            float floatValue = fArr[0].floatValue();
            s0 o10 = new gf.m(1, Xe(fArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, fArr[o10.nextInt()].floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    public static final double[] Vo(double[] dArr, we.p<? super Integer, ? super Double, u2> pVar) {
        l0.p(dArr, "<this>");
        l0.p(pVar, "action");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
        return dArr;
    }

    public static final byte Vp(@fh.g byte[] bArr, @fh.g we.p<? super Byte, ? super Byte, Byte> pVar) {
        l0.p(bArr, "<this>");
        l0.p(pVar, "operation");
        if (!(bArr.length == 0)) {
            byte b10 = bArr[0];
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                b10 = pVar.g0(Byte.valueOf(b10), Byte.valueOf(bArr[o10.nextInt()])).byteValue();
            }
            return b10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short Vq(@fh.g short[] sArr, @fh.g we.q<? super Integer, ? super Short, ? super Short, Short> qVar) {
        l0.p(sArr, "<this>");
        l0.p(qVar, "operation");
        int Ye = Ye(sArr);
        if (Ye >= 0) {
            short s10 = sArr[Ye];
            for (int i10 = Ye - 1; i10 >= 0; i10--) {
                s10 = qVar.y(Integer.valueOf(i10), Short.valueOf(sArr[i10]), Short.valueOf(s10)).shortValue();
            }
            return s10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final int[] Vr(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int Ve = Ve(iArr);
        s0 o10 = new gf.m(0, Ve).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            iArr2[Ve - nextInt] = iArr[nextInt];
        }
        return iArr2;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Double, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Vs(double[] r6, R r7, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Double, ? extends R> r8) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r8, r0)
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r6 = be.v.k(r7)
            goto L_0x003b
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r6.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r7)
            int r2 = r6.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r6[r1]
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object r7 = r8.y(r3, r7, r4)
            r0.add(r7)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            r6 = r0
        L_0x003b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Vs(double[], java.lang.Object, we.q):java.util.List");
    }

    @fh.h
    public static final Float Vt(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    public static final void Vu(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length > 1) {
            o.l4(dArr);
            ur(dArr);
        }
    }

    @fh.g
    public static final <T, R extends Comparable<? super R>> List<T> Vv(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        return mw(tArr, new g.c(lVar));
    }

    @zd.l(warningSince = "1.5")
    @zd.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double Vw(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Double> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (boolean valueOf : zArr) {
            d10 += lVar.A(Boolean.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final List<Byte> Vx(@fh.g byte[] bArr, int i10) {
        l0.p(bArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= bArr.length) {
                return ez(bArr);
            }
            if (i10 == 1) {
                return v.k(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (byte valueOf : bArr) {
                arrayList.add(Byte.valueOf(valueOf));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @fh.g
    public static final HashSet<Character> Vy(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        return (HashSet) Ky(cArr, new HashSet(z0.j(gf.v.B(cArr.length, 128))));
    }

    @fh.g
    public static final Set<Long> Vz(@fh.g long[] jArr, @fh.g Iterable<Long> iterable) {
        l0.p(jArr, "<this>");
        l0.p(iterable, "other");
        Set<Long> Cz = Cz(jArr);
        b0.o0(Cz, iterable);
        return Cz;
    }

    @fh.g
    public static final Iterable<Byte> W5(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr.length == 0 ? w.E() : new b(bArr);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M W6(@fh.g float[] fArr, @fh.g M m10, @fh.g we.l<? super Float, ? extends K> lVar, @fh.g we.l<? super Float, ? extends V> lVar2) {
        l0.p(fArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (float f10 : fArr) {
            m10.put(lVar.A(Float.valueOf(f10)), lVar2.A(Float.valueOf(f10)));
        }
        return m10;
    }

    @oe.f
    public static final double W7(double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr[0];
    }

    @oe.f
    public static final int W8(byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr.length;
    }

    @fh.g
    public static final List<Short> W9(@fh.g short[] sArr, int i10) {
        l0.p(sArr, "<this>");
        if (i10 >= 0) {
            return dy(sArr, gf.v.u(sArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R> List<u0<Short, R>> WA(@fh.g short[] sArr, @fh.g Iterable<? extends R> iterable) {
        l0.p(sArr, "<this>");
        l0.p(iterable, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(r1.a(Short.valueOf(sArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @fh.g
    public static final List<Long> Wa(@fh.g long[] jArr, @fh.g we.p<? super Integer, ? super Long, Boolean> pVar) {
        l0.p(jArr, "<this>");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            long j10 = jArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @oe.f
    public static final Short Wb(short[] sArr, we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        for (short s10 : sArr) {
            if (lVar.A(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
        }
        return null;
    }

    @fh.g
    public static final <R> List<R> Wc(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends Iterable<? extends R>> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (int valueOf : iArr) {
            b0.o0(arrayList, (Iterable) lVar.A(Integer.valueOf(valueOf)));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Short, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Wd(@fh.g short[] r5, R r6, @fh.g we.q<? super java.lang.Integer, ? super R, ? super java.lang.Short, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L_0x000d:
            if (r1 >= r0) goto L_0x0023
            short r3 = r5[r1]
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            java.lang.Object r6 = r7.y(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x000d
        L_0x0023:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Wd(short[], java.lang.Object, we.q):java.lang.Object");
    }

    public static final int We(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr.length - 1;
    }

    @fh.g
    public static final <T, K, M extends Map<? super K, List<T>>> M Wf(@fh.g T[] tArr, @fh.g M m10, @fh.g we.l<? super T, ? extends K> lVar) {
        l0.p(tArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (T t10 : tArr) {
            Object A = lVar.A(t10);
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(t10);
        }
        return m10;
    }

    @oe.f
    public static final boolean Wg(byte[] bArr) {
        l0.p(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final float Wh(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                float f10 = fArr[length];
                if (!lVar.A(Float.valueOf(f10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return f10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final <R> List<R> Wi(@fh.g long[] jArr, @fh.g we.p<? super Integer, ? super Long, ? extends R> pVar) {
        l0.p(jArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double Wj(boolean[] zArr, we.l<? super Boolean, Double> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (!(zArr.length == 0)) {
            double doubleValue = lVar.A(Boolean.valueOf(zArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Ze(zArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(Boolean.valueOf(zArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R> R Wk(T[] tArr, Comparator<? super R> comparator, we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(tArr.length == 0)) {
            R A = lVar.A(tArr[0]);
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(tArr[o10.nextInt()]);
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Character Wl(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int Se = Se(cArr);
        if (Se == 0) {
            return Character.valueOf(c10);
        }
        Comparable comparable = (Comparable) lVar.A(Character.valueOf(c10));
        s0 o10 = new gf.m(1, Se).iterator();
        while (o10.hasNext()) {
            char c11 = cArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Character.valueOf(c11));
            if (comparable.compareTo(comparable2) > 0) {
                c10 = c11;
                comparable = comparable2;
            }
        }
        return Character.valueOf(c10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double Wm(byte[] bArr, we.l<? super Byte, Double> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Byte.valueOf(bArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(Byte.valueOf(bArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final int Wn(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (!(iArr.length == 0)) {
            int i10 = iArr[0];
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                int i11 = iArr[o10.nextInt()];
                if (i10 > i11) {
                    i10 = i11;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    public static final float[] Wo(float[] fArr, we.p<? super Integer, ? super Float, u2> pVar) {
        l0.p(fArr, "<this>");
        l0.p(pVar, "action");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Float.valueOf(fArr[i10]));
            i10++;
            i11++;
        }
        return fArr;
    }

    public static final char Wp(@fh.g char[] cArr, @fh.g we.p<? super Character, ? super Character, Character> pVar) {
        l0.p(cArr, "<this>");
        l0.p(pVar, "operation");
        if (!(cArr.length == 0)) {
            char c10 = cArr[0];
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                c10 = pVar.g0(Character.valueOf(c10), Character.valueOf(cArr[o10.nextInt()])).charValue();
            }
            return c10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean Wq(@fh.g boolean[] zArr, @fh.g we.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> qVar) {
        l0.p(zArr, "<this>");
        l0.p(qVar, "operation");
        int Ze = Ze(zArr);
        if (Ze >= 0) {
            boolean z10 = zArr[Ze];
            for (int i10 = Ze - 1; i10 >= 0; i10--) {
                z10 = qVar.y(Integer.valueOf(i10), Boolean.valueOf(zArr[i10]), Boolean.valueOf(z10)).booleanValue();
            }
            return z10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @fh.g
    public static final long[] Wr(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int We = We(jArr);
        s0 o10 = new gf.m(0, We).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            jArr2[We - nextInt] = jArr[nextInt];
        }
        return jArr2;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Float, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Ws(float[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Float, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            goto L_0x003b
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r5[r1]
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            r5 = r0
        L_0x003b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Ws(float[], java.lang.Object, we.q):java.util.List");
    }

    @fh.h
    public static final Float Wt(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        boolean z10 = false;
        Float f10 = null;
        for (float f11 : fArr) {
            if (lVar.A(Float.valueOf(f11)).booleanValue()) {
                if (z10) {
                    return null;
                }
                f10 = Float.valueOf(f11);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return f10;
    }

    @h1(version = "1.4")
    public static final void Wu(@fh.g double[] dArr, int i10, int i11) {
        l0.p(dArr, "<this>");
        o.m4(dArr, i10, i11);
        vr(dArr, i10, i11);
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Short> Wv(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        return nw(sArr, new g.c(lVar));
    }

    @ve.h(name = "sumOfByte")
    public static final int Ww(@fh.g Byte[] bArr) {
        l0.p(bArr, "<this>");
        int i10 = 0;
        for (Byte byteValue : bArr) {
            i10 += byteValue.byteValue();
        }
        return i10;
    }

    @fh.g
    public static final List<Character> Wx(@fh.g char[] cArr, int i10) {
        l0.p(cArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= cArr.length) {
                return fz(cArr);
            }
            if (i10 == 1) {
                return v.k(Character.valueOf(cArr[0]));
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (char valueOf : cArr) {
                arrayList.add(Character.valueOf(valueOf));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @fh.g
    public static final HashSet<Double> Wy(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        return (HashSet) Ly(dArr, new HashSet(z0.j(dArr.length)));
    }

    @fh.g
    public static final <T> Set<T> Wz(@fh.g T[] tArr, @fh.g Iterable<? extends T> iterable) {
        l0.p(tArr, "<this>");
        l0.p(iterable, "other");
        Set<T> Dz = Dz(tArr);
        b0.o0(Dz, iterable);
        return Dz;
    }

    @fh.g
    public static final Iterable<Character> X5(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr.length == 0 ? w.E() : new i(cArr);
    }

    @fh.g
    public static final <K, M extends Map<? super K, ? super Integer>> M X6(@fh.g int[] iArr, @fh.g M m10, @fh.g we.l<? super Integer, ? extends K> lVar) {
        l0.p(iArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (int i10 : iArr) {
            m10.put(lVar.A(Integer.valueOf(i10)), Integer.valueOf(i10));
        }
        return m10;
    }

    @oe.f
    public static final float X7(float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr[0];
    }

    public static final int X8(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (byte valueOf : bArr) {
            if (lVar.A(Byte.valueOf(valueOf)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @fh.g
    public static final List<Boolean> X9(@fh.g boolean[] zArr, int i10) {
        l0.p(zArr, "<this>");
        if (i10 >= 0) {
            return ey(zArr, gf.v.u(zArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R, V> List<V> XA(@fh.g short[] sArr, @fh.g Iterable<? extends R> iterable, @fh.g we.p<? super Short, ? super R, ? extends V> pVar) {
        l0.p(sArr, "<this>");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(pVar.g0(Short.valueOf(sArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @fh.g
    public static final <T> List<T> Xa(@fh.g T[] tArr, @fh.g we.p<? super Integer, ? super T, Boolean> pVar) {
        l0.p(tArr, "<this>");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), t10).booleanValue()) {
                arrayList.add(t10);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @oe.f
    public static final Boolean Xb(boolean[] zArr, we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                boolean z10 = zArr[length];
                if (lVar.A(Boolean.valueOf(z10)).booleanValue()) {
                    return Boolean.valueOf(z10);
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return null;
    }

    @fh.g
    public static final <R> List<R> Xc(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends Iterable<? extends R>> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (long valueOf : jArr) {
            b0.o0(arrayList, (Iterable) lVar.A(Long.valueOf(valueOf)));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Boolean, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Xd(@fh.g boolean[] r5, R r6, @fh.g we.q<? super java.lang.Integer, ? super R, ? super java.lang.Boolean, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L_0x000d:
            if (r1 >= r0) goto L_0x0023
            boolean r3 = r5[r1]
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r6 = r7.y(r2, r6, r3)
            int r1 = r1 + 1
            r2 = r4
            goto L_0x000d
        L_0x0023:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Xd(boolean[], java.lang.Object, we.q):java.lang.Object");
    }

    public static final <T> int Xe(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return tArr.length - 1;
    }

    @fh.g
    public static final <T, K, V, M extends Map<? super K, List<V>>> M Xf(@fh.g T[] tArr, @fh.g M m10, @fh.g we.l<? super T, ? extends K> lVar, @fh.g we.l<? super T, ? extends V> lVar2) {
        l0.p(tArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (T t10 : tArr) {
            Object A = lVar.A(t10);
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(t10));
        }
        return m10;
    }

    @oe.f
    public static final boolean Xg(char[] cArr) {
        l0.p(cArr, "<this>");
        return !(cArr.length == 0);
    }

    public static final int Xh(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (!(iArr.length == 0)) {
            return iArr[Ve(iArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @fh.g
    public static final <T, R> List<R> Xi(@fh.g T[] tArr, @fh.g we.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(tArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float Xj(byte[] bArr, we.l<? super Byte, Float> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (!(bArr.length == 0)) {
            float floatValue = lVar.A(Byte.valueOf(bArr[0])).floatValue();
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(Byte.valueOf(bArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R Xk(short[] sArr, Comparator<? super R> comparator, we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(sArr.length == 0)) {
            R A = lVar.A(Short.valueOf(sArr[0]));
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Short.valueOf(sArr[o10.nextInt()]));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Double Xl(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int Te = Te(dArr);
        if (Te == 0) {
            return Double.valueOf(d10);
        }
        Comparable comparable = (Comparable) lVar.A(Double.valueOf(d10));
        s0 o10 = new gf.m(1, Te).iterator();
        while (o10.hasNext()) {
            double d11 = dArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Double.valueOf(d11));
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
                d10 = d11;
            }
        }
        return Double.valueOf(d10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double Xm(char[] cArr, we.l<? super Character, Double> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Character.valueOf(cArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(Character.valueOf(cArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final long Xn(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (!(jArr.length == 0)) {
            long j10 = jArr[0];
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                long j11 = jArr[o10.nextInt()];
                if (j10 > j11) {
                    j10 = j11;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    public static final int[] Xo(int[] iArr, we.p<? super Integer, ? super Integer, u2> pVar) {
        l0.p(iArr, "<this>");
        l0.p(pVar, "action");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
        return iArr;
    }

    public static final double Xp(@fh.g double[] dArr, @fh.g we.p<? super Double, ? super Double, Double> pVar) {
        l0.p(dArr, "<this>");
        l0.p(pVar, "operation");
        if (!(dArr.length == 0)) {
            double d10 = dArr[0];
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                d10 = pVar.g0(Double.valueOf(d10), Double.valueOf(dArr[o10.nextInt()])).doubleValue();
            }
            return d10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Boolean Xq(@fh.g boolean[] zArr, @fh.g we.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> qVar) {
        l0.p(zArr, "<this>");
        l0.p(qVar, "operation");
        int Ze = Ze(zArr);
        if (Ze < 0) {
            return null;
        }
        boolean z10 = zArr[Ze];
        for (int i10 = Ze - 1; i10 >= 0; i10--) {
            z10 = qVar.y(Integer.valueOf(i10), Boolean.valueOf(zArr[i10]), Boolean.valueOf(z10)).booleanValue();
        }
        return Boolean.valueOf(z10);
    }

    @fh.g
    public static final <T> T[] Xr(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] a10 = m.a(tArr, tArr.length);
        int Xe = Xe(tArr);
        s0 o10 = new gf.m(0, Xe).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            a10[Xe - nextInt] = tArr[nextInt];
        }
        return a10;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Integer, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Xs(int[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Integer, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            goto L_0x003b
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r5[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            r5 = r0
        L_0x003b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Xs(int[], java.lang.Object, we.q):java.util.List");
    }

    @fh.h
    public static final Integer Xt(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    public static final void Xu(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length > 1) {
            o.n4(fArr);
            wr(fArr);
        }
    }

    @fh.g
    public static final <R extends Comparable<? super R>> List<Boolean> Xv(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        return ow(zArr, new g.c(lVar));
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double Xw(byte[] bArr, we.l<? super Byte, Double> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (byte valueOf : bArr) {
            d10 += lVar.A(Byte.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final List<Double> Xx(@fh.g double[] dArr, int i10) {
        l0.p(dArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= dArr.length) {
                return gz(dArr);
            }
            if (i10 == 1) {
                return v.k(Double.valueOf(dArr[0]));
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (double valueOf : dArr) {
                arrayList.add(Double.valueOf(valueOf));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @fh.g
    public static final HashSet<Float> Xy(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        return (HashSet) My(fArr, new HashSet(z0.j(fArr.length)));
    }

    @fh.g
    public static final Set<Short> Xz(@fh.g short[] sArr, @fh.g Iterable<Short> iterable) {
        l0.p(sArr, "<this>");
        l0.p(iterable, "other");
        Set<Short> Ez = Ez(sArr);
        b0.o0(Ez, iterable);
        return Ez;
    }

    @fh.g
    public static final Iterable<Double> Y5(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr.length == 0 ? w.E() : new g(dArr);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M Y6(@fh.g int[] iArr, @fh.g M m10, @fh.g we.l<? super Integer, ? extends K> lVar, @fh.g we.l<? super Integer, ? extends V> lVar2) {
        l0.p(iArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (int i10 : iArr) {
            m10.put(lVar.A(Integer.valueOf(i10)), lVar2.A(Integer.valueOf(i10)));
        }
        return m10;
    }

    @oe.f
    public static final int Y7(int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr[0];
    }

    @oe.f
    public static final int Y8(char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr.length;
    }

    @fh.g
    public static final List<Byte> Y9(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Re = Re(bArr); -1 < Re; Re--) {
            if (!lVar.A(Byte.valueOf(bArr[Re])).booleanValue()) {
                return Vx(bArr, Re + 1);
            }
        }
        return w.E();
    }

    @fh.g
    public static final <R> List<u0<Short, R>> YA(@fh.g short[] sArr, @fh.g R[] rArr) {
        l0.p(sArr, "<this>");
        l0.p(rArr, "other");
        int min = Math.min(sArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            short s10 = sArr[i10];
            arrayList.add(r1.a(Short.valueOf(s10), rArr[i10]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Short> Ya(@fh.g short[] sArr, @fh.g we.p<? super Integer, ? super Short, Boolean> pVar) {
        l0.p(sArr, "<this>");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            short s10 = sArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @oe.f
    public static final Byte Yb(byte[] bArr, we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                byte b10 = bArr[length];
                if (lVar.A(Byte.valueOf(b10)).booleanValue()) {
                    return Byte.valueOf(b10);
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return null;
    }

    @fh.g
    public static final <T, R> List<R> Yc(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends Iterable<? extends R>> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (T A : tArr) {
            b0.o0(arrayList, (Iterable) lVar.A(A));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super java.lang.Byte, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Yd(@fh.g byte[] r2, R r3, @fh.g we.p<? super java.lang.Byte, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = Re(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x001e
            int r1 = r0 + -1
            byte r0 = r2[r0]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            java.lang.Object r3 = r4.g0(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Yd(byte[], java.lang.Object, we.p):java.lang.Object");
    }

    public static final int Ye(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr.length - 1;
    }

    @fh.g
    public static final <K, M extends Map<? super K, List<Short>>> M Yf(@fh.g short[] sArr, @fh.g M m10, @fh.g we.l<? super Short, ? extends K> lVar) {
        l0.p(sArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (short s10 : sArr) {
            Object A = lVar.A(Short.valueOf(s10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(Short.valueOf(s10));
        }
        return m10;
    }

    @oe.f
    public static final boolean Yg(double[] dArr) {
        l0.p(dArr, "<this>");
        return !(dArr.length == 0);
    }

    public static final int Yh(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                int i11 = iArr[length];
                if (!lVar.A(Integer.valueOf(i11)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return i11;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final <R> List<R> Yi(@fh.g short[] sArr, @fh.g we.p<? super Integer, ? super Short, ? extends R> pVar) {
        l0.p(sArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float Yj(char[] cArr, we.l<? super Character, Float> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (!(cArr.length == 0)) {
            float floatValue = lVar.A(Character.valueOf(cArr[0])).floatValue();
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(Character.valueOf(cArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R Yk(boolean[] zArr, Comparator<? super R> comparator, we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(zArr.length == 0)) {
            R A = lVar.A(Boolean.valueOf(zArr[0]));
            s0 o10 = new gf.m(1, Ze(zArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Boolean.valueOf(zArr[o10.nextInt()]));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Float Yl(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int Ue = Ue(fArr);
        if (Ue == 0) {
            return Float.valueOf(f10);
        }
        Comparable comparable = (Comparable) lVar.A(Float.valueOf(f10));
        s0 o10 = new gf.m(1, Ue).iterator();
        while (o10.hasNext()) {
            float f11 = fArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Float.valueOf(f11));
            if (comparable.compareTo(comparable2) > 0) {
                f10 = f11;
                comparable = comparable2;
            }
        }
        return Float.valueOf(f10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double Ym(double[] dArr, we.l<? super Double, Double> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Double.valueOf(dArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(Double.valueOf(dArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.7")
    @fh.g
    @ve.h(name = "minOrThrow")
    public static final <T extends Comparable<? super T>> T Yn(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (!(tArr.length == 0)) {
            T t10 = tArr[0];
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            while (o10.hasNext()) {
                T t11 = tArr[o10.nextInt()];
                if (t10.compareTo(t11) > 0) {
                    t10 = t11;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    public static final long[] Yo(long[] jArr, we.p<? super Integer, ? super Long, u2> pVar) {
        l0.p(jArr, "<this>");
        l0.p(pVar, "action");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
        return jArr;
    }

    public static final float Yp(@fh.g float[] fArr, @fh.g we.p<? super Float, ? super Float, Float> pVar) {
        l0.p(fArr, "<this>");
        l0.p(pVar, "operation");
        if (!(fArr.length == 0)) {
            float f10 = fArr[0];
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                f10 = pVar.g0(Float.valueOf(f10), Float.valueOf(fArr[o10.nextInt()])).floatValue();
            }
            return f10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Byte Yq(@fh.g byte[] bArr, @fh.g we.q<? super Integer, ? super Byte, ? super Byte, Byte> qVar) {
        l0.p(bArr, "<this>");
        l0.p(qVar, "operation");
        int Re = Re(bArr);
        if (Re < 0) {
            return null;
        }
        byte b10 = bArr[Re];
        for (int i10 = Re - 1; i10 >= 0; i10--) {
            b10 = qVar.y(Integer.valueOf(i10), Byte.valueOf(bArr[i10]), Byte.valueOf(b10)).byteValue();
        }
        return Byte.valueOf(b10);
    }

    @fh.g
    public static final short[] Yr(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int Ye = Ye(sArr);
        s0 o10 = new gf.m(0, Ye).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            sArr2[Ye - nextInt] = sArr[nextInt];
        }
        return sArr2;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Long, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> Ys(long[] r6, R r7, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Long, ? extends R> r8) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r8, r0)
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r6 = be.v.k(r7)
            goto L_0x003b
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r6.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r7)
            int r2 = r6.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r6[r1]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r7 = r8.y(r3, r7, r4)
            r0.add(r7)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            r6 = r0
        L_0x003b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Ys(long[], java.lang.Object, we.q):java.util.List");
    }

    @fh.h
    public static final Integer Yt(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        boolean z10 = false;
        Integer num = null;
        for (int i10 : iArr) {
            if (lVar.A(Integer.valueOf(i10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                num = Integer.valueOf(i10);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return num;
    }

    @h1(version = "1.4")
    public static final void Yu(@fh.g float[] fArr, int i10, int i11) {
        l0.p(fArr, "<this>");
        o.o4(fArr, i10, i11);
        xr(fArr, i10, i11);
    }

    @fh.g
    public static final List<Byte> Yv(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.h4(copyOf);
        return Ir(copyOf);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double Yw(char[] cArr, we.l<? super Character, Double> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (char valueOf : cArr) {
            d10 += lVar.A(Character.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final List<Float> Yx(@fh.g float[] fArr, int i10) {
        l0.p(fArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= fArr.length) {
                return hz(fArr);
            }
            if (i10 == 1) {
                return v.k(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (float valueOf : fArr) {
                arrayList.add(Float.valueOf(valueOf));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @fh.g
    public static final HashSet<Integer> Yy(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        return (HashSet) Ny(iArr, new HashSet(z0.j(iArr.length)));
    }

    @fh.g
    public static final Set<Boolean> Yz(@fh.g boolean[] zArr, @fh.g Iterable<Boolean> iterable) {
        l0.p(zArr, "<this>");
        l0.p(iterable, "other");
        Set<Boolean> Fz = Fz(zArr);
        b0.o0(Fz, iterable);
        return Fz;
    }

    @fh.g
    public static final Iterable<Float> Z5(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr.length == 0 ? w.E() : new f(fArr);
    }

    @fh.g
    public static final <K, M extends Map<? super K, ? super Long>> M Z6(@fh.g long[] jArr, @fh.g M m10, @fh.g we.l<? super Long, ? extends K> lVar) {
        l0.p(jArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (long j10 : jArr) {
            m10.put(lVar.A(Long.valueOf(j10)), Long.valueOf(j10));
        }
        return m10;
    }

    @oe.f
    public static final long Z7(long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr[0];
    }

    public static final int Z8(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (char valueOf : cArr) {
            if (lVar.A(Character.valueOf(valueOf)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @fh.g
    public static final List<Character> Z9(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Se = Se(cArr); -1 < Se; Se--) {
            if (!lVar.A(Character.valueOf(cArr[Se])).booleanValue()) {
                return Wx(cArr, Se + 1);
            }
        }
        return w.E();
    }

    @fh.g
    public static final <R, V> List<V> ZA(@fh.g short[] sArr, @fh.g R[] rArr, @fh.g we.p<? super Short, ? super R, ? extends V> pVar) {
        l0.p(sArr, "<this>");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(sArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Short.valueOf(sArr[i10]), rArr[i10]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Boolean> Za(@fh.g boolean[] zArr, @fh.g we.p<? super Integer, ? super Boolean, Boolean> pVar) {
        l0.p(zArr, "<this>");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            boolean z10 = zArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @oe.f
    public static final Character Zb(char[] cArr, we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char c10 = cArr[length];
                if (lVar.A(Character.valueOf(c10)).booleanValue()) {
                    return Character.valueOf(c10);
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return null;
    }

    @fh.g
    public static final <R> List<R> Zc(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends Iterable<? extends R>> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (short valueOf : sArr) {
            b0.o0(arrayList, (Iterable) lVar.A(Short.valueOf(valueOf)));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super java.lang.Character, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R Zd(@fh.g char[] r2, R r3, @fh.g we.p<? super java.lang.Character, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = Se(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x001e
            int r1 = r0 + -1
            char r0 = r2[r0]
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r3 = r4.g0(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Zd(char[], java.lang.Object, we.p):java.lang.Object");
    }

    public static final int Ze(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr.length - 1;
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, List<V>>> M Zf(@fh.g short[] sArr, @fh.g M m10, @fh.g we.l<? super Short, ? extends K> lVar, @fh.g we.l<? super Short, ? extends V> lVar2) {
        l0.p(sArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (short s10 : sArr) {
            Object A = lVar.A(Short.valueOf(s10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Short.valueOf(s10)));
        }
        return m10;
    }

    @oe.f
    public static final boolean Zg(float[] fArr) {
        l0.p(fArr, "<this>");
        return !(fArr.length == 0);
    }

    public static final long Zh(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (!(jArr.length == 0)) {
            return jArr[We(jArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @fh.g
    public static final <R> List<R> Zi(@fh.g boolean[] zArr, @fh.g we.p<? super Integer, ? super Boolean, ? extends R> pVar) {
        l0.p(zArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float Zj(double[] dArr, we.l<? super Double, Float> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (!(dArr.length == 0)) {
            float floatValue = lVar.A(Double.valueOf(dArr[0])).floatValue();
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(Double.valueOf(dArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R Zk(byte[] bArr, Comparator<? super R> comparator, we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R A = lVar.A(Byte.valueOf(bArr[0]));
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Byte.valueOf(bArr[o10.nextInt()]));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Integer Zl(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int Ve = Ve(iArr);
        if (Ve == 0) {
            return Integer.valueOf(i10);
        }
        Comparable comparable = (Comparable) lVar.A(Integer.valueOf(i10));
        s0 o10 = new gf.m(1, Ve).iterator();
        while (o10.hasNext()) {
            int i11 = iArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Integer.valueOf(i11));
            if (comparable.compareTo(comparable2) > 0) {
                i10 = i11;
                comparable = comparable2;
            }
        }
        return Integer.valueOf(i10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double Zm(float[] fArr, we.l<? super Float, Double> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Float.valueOf(fArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(Float.valueOf(fArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final short Zn(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (!(sArr.length == 0)) {
            short s10 = sArr[0];
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                short s11 = sArr[o10.nextInt()];
                if (s10 > s11) {
                    s10 = s11;
                }
            }
            return s10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    public static final <T> T[] Zo(T[] tArr, we.p<? super Integer, ? super T, u2> pVar) {
        l0.p(tArr, "<this>");
        l0.p(pVar, "action");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), tArr[i10]);
            i10++;
            i11++;
        }
        return tArr;
    }

    public static final int Zp(@fh.g int[] iArr, @fh.g we.p<? super Integer, ? super Integer, Integer> pVar) {
        l0.p(iArr, "<this>");
        l0.p(pVar, "operation");
        if (!(iArr.length == 0)) {
            int i10 = iArr[0];
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                i10 = pVar.g0(Integer.valueOf(i10), Integer.valueOf(iArr[o10.nextInt()])).intValue();
            }
            return i10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Character Zq(@fh.g char[] cArr, @fh.g we.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(cArr, "<this>");
        l0.p(qVar, "operation");
        int Se = Se(cArr);
        if (Se < 0) {
            return null;
        }
        char c10 = cArr[Se];
        for (int i10 = Se - 1; i10 >= 0; i10--) {
            c10 = qVar.y(Integer.valueOf(i10), Character.valueOf(cArr[i10]), Character.valueOf(c10)).charValue();
        }
        return Character.valueOf(c10);
    }

    @fh.g
    public static final boolean[] Zr(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int Ze = Ze(zArr);
        s0 o10 = new gf.m(0, Ze).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            zArr2[Ze - nextInt] = zArr[nextInt];
        }
        return zArr2;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.util.List<R> Zs(@fh.g T[] r5, R r6, @fh.g we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            goto L_0x0037
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r5[r1]
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            r5 = r0
        L_0x0037:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.Zs(java.lang.Object[], java.lang.Object, we.q):java.util.List");
    }

    @fh.h
    public static final Long Zt(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    public static final void Zu(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (iArr.length > 1) {
            o.p4(iArr);
            yr(iArr);
        }
    }

    @fh.g
    public static final List<Character> Zv(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.j4(copyOf);
        return Jr(copyOf);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double Zw(double[] dArr, we.l<? super Double, Double> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (double valueOf : dArr) {
            d10 += lVar.A(Double.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final List<Integer> Zx(@fh.g int[] iArr, int i10) {
        l0.p(iArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= iArr.length) {
                return iz(iArr);
            }
            if (i10 == 1) {
                return v.k(Integer.valueOf(iArr[0]));
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (int valueOf : iArr) {
                arrayList.add(Integer.valueOf(valueOf));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @fh.g
    public static final HashSet<Long> Zy(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        return (HashSet) Oy(jArr, new HashSet(z0.j(jArr.length)));
    }

    @fh.g
    public static final Iterable<p0<Byte>> Zz(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        return new q0(new u(bArr));
    }

    @fh.g
    public static final Iterable<Integer> a6(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr.length == 0 ? w.E() : new d(iArr);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M a7(@fh.g long[] jArr, @fh.g M m10, @fh.g we.l<? super Long, ? extends K> lVar, @fh.g we.l<? super Long, ? extends V> lVar2) {
        l0.p(jArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (long j10 : jArr) {
            m10.put(lVar.A(Long.valueOf(j10)), lVar2.A(Long.valueOf(j10)));
        }
        return m10;
    }

    @oe.f
    public static final <T> T a8(T[] tArr) {
        l0.p(tArr, "<this>");
        return tArr[0];
    }

    @oe.f
    public static final int a9(double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr.length;
    }

    @fh.g
    public static final Iterable<p0<Character>> aA(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        return new q0(new b0(cArr));
    }

    @fh.g
    public static final List<u0<Short, Short>> aB(@fh.g short[] sArr, @fh.g short[] sArr2) {
        l0.p(sArr, "<this>");
        l0.p(sArr2, "other");
        int min = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(r1.a(Short.valueOf(sArr[i10]), Short.valueOf(sArr2[i10])));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Double> aa(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Te = Te(dArr); -1 < Te; Te--) {
            if (!lVar.A(Double.valueOf(dArr[Te])).booleanValue()) {
                return Xx(dArr, Te + 1);
            }
        }
        return w.E();
    }

    @fh.g
    public static final <C extends Collection<? super Byte>> C ab(@fh.g byte[] bArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Byte, Boolean> pVar) {
        l0.p(bArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Byte.valueOf(b10)).booleanValue()) {
                c10.add(Byte.valueOf(b10));
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    @oe.f
    public static final Double ac(double[] dArr, we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                double d10 = dArr[length];
                if (lVar.A(Double.valueOf(d10)).booleanValue()) {
                    return Double.valueOf(d10);
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return null;
    }

    @fh.g
    public static final <R> List<R> ad(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends Iterable<? extends R>> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean valueOf : zArr) {
            b0.o0(arrayList, (Iterable) lVar.A(Boolean.valueOf(valueOf)));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super java.lang.Double, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R ae(@fh.g double[] r4, R r5, @fh.g we.p<? super java.lang.Double, ? super R, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = Te(r4)
        L_0x000e:
            if (r0 < 0) goto L_0x001e
            int r1 = r0 + -1
            r2 = r4[r0]
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            java.lang.Object r5 = r6.g0(r0, r5)
            r0 = r1
            goto L_0x000e
        L_0x001e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ae(double[], java.lang.Object, we.p):java.lang.Object");
    }

    @oe.f
    public static final byte af(byte[] bArr, int i10, we.l<? super Integer, Byte> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Re(bArr)) ? lVar.A(Integer.valueOf(i10)).byteValue() : bArr[i10];
    }

    @fh.g
    public static final <K, M extends Map<? super K, List<Boolean>>> M ag(@fh.g boolean[] zArr, @fh.g M m10, @fh.g we.l<? super Boolean, ? extends K> lVar) {
        l0.p(zArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (boolean z10 : zArr) {
            Object A = lVar.A(Boolean.valueOf(z10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(Boolean.valueOf(z10));
        }
        return m10;
    }

    @oe.f
    public static final boolean ah(int[] iArr) {
        l0.p(iArr, "<this>");
        return !(iArr.length == 0);
    }

    public static final long ai(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                long j10 = jArr[length];
                if (!lVar.A(Long.valueOf(j10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return j10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final <T, R> List<R> aj(@fh.g T[] tArr, @fh.g we.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(tArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            Object g02 = pVar.g0(Integer.valueOf(i11), tArr[i10]);
            if (g02 != null) {
                arrayList.add(g02);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float ak(float[] fArr, we.l<? super Float, Float> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (!(fArr.length == 0)) {
            float floatValue = lVar.A(Float.valueOf(fArr[0])).floatValue();
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(Float.valueOf(fArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R al(char[] cArr, Comparator<? super R> comparator, we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R A = lVar.A(Character.valueOf(cArr[0]));
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Character.valueOf(cArr[o10.nextInt()]));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Long am(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int We = We(jArr);
        if (We == 0) {
            return Long.valueOf(j10);
        }
        Comparable comparable = (Comparable) lVar.A(Long.valueOf(j10));
        s0 o10 = new gf.m(1, We).iterator();
        while (o10.hasNext()) {
            long j11 = jArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Long.valueOf(j11));
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double an(int[] iArr, we.l<? super Integer, Double> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Integer.valueOf(iArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(Integer.valueOf(iArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Boolean ao(@fh.g boolean[] zArr, @fh.g Comparator<? super Boolean> comparator) {
        l0.p(zArr, "<this>");
        l0.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        s0 o10 = new gf.m(1, Ze(zArr)).iterator();
        while (o10.hasNext()) {
            boolean z11 = zArr[o10.nextInt()];
            if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) > 0) {
                z10 = z11;
            }
        }
        return Boolean.valueOf(z10);
    }

    @h1(version = "1.4")
    @oe.f
    public static final short[] ap(short[] sArr, we.p<? super Integer, ? super Short, u2> pVar) {
        l0.p(sArr, "<this>");
        l0.p(pVar, "action");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
        return sArr;
    }

    public static final long aq(@fh.g long[] jArr, @fh.g we.p<? super Long, ? super Long, Long> pVar) {
        l0.p(jArr, "<this>");
        l0.p(pVar, "operation");
        if (!(jArr.length == 0)) {
            long j10 = jArr[0];
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                j10 = pVar.g0(Long.valueOf(j10), Long.valueOf(jArr[o10.nextInt()])).longValue();
            }
            return j10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Double ar(@fh.g double[] dArr, @fh.g we.q<? super Integer, ? super Double, ? super Double, Double> qVar) {
        l0.p(dArr, "<this>");
        l0.p(qVar, "operation");
        int Te = Te(dArr);
        if (Te < 0) {
            return null;
        }
        double d10 = dArr[Te];
        for (int i10 = Te - 1; i10 >= 0; i10--) {
            d10 = qVar.y(Integer.valueOf(i10), Double.valueOf(dArr[i10]), Double.valueOf(d10)).doubleValue();
        }
        return Double.valueOf(d10);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Byte, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> as(byte[] r4, R r5, we.p<? super R, ? super java.lang.Byte, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            return r4
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            byte r3 = r4[r1]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.as(byte[], java.lang.Object, we.p):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Short, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> at(short[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Short, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            goto L_0x003b
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            short r4 = r5[r1]
            java.lang.Short r4 = java.lang.Short.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            r5 = r0
        L_0x003b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.at(short[], java.lang.Object, we.q):java.util.List");
    }

    @fh.h
    public static final Long au(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        boolean z10 = false;
        Long l10 = null;
        for (long j10 : jArr) {
            if (lVar.A(Long.valueOf(j10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                l10 = Long.valueOf(j10);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return l10;
    }

    @h1(version = "1.4")
    public static final void av(@fh.g int[] iArr, int i10, int i11) {
        l0.p(iArr, "<this>");
        o.q4(iArr, i10, i11);
        zr(iArr, i10, i11);
    }

    @fh.g
    public static final List<Double> aw(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.l4(copyOf);
        return Kr(copyOf);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double ax(float[] fArr, we.l<? super Float, Double> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (float valueOf : fArr) {
            d10 += lVar.A(Float.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final List<Long> ay(@fh.g long[] jArr, int i10) {
        l0.p(jArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= jArr.length) {
                return jz(jArr);
            }
            if (i10 == 1) {
                return v.k(Long.valueOf(jArr[0]));
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (long valueOf : jArr) {
                arrayList.add(Long.valueOf(valueOf));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @fh.g
    public static final <T> HashSet<T> az(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return (HashSet) Py(tArr, new HashSet(z0.j(tArr.length)));
    }

    @fh.g
    public static final Iterable<Long> b6(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr.length == 0 ? w.E() : new e(jArr);
    }

    @fh.g
    public static final <T, K, M extends Map<? super K, ? super T>> M b7(@fh.g T[] tArr, @fh.g M m10, @fh.g we.l<? super T, ? extends K> lVar) {
        l0.p(tArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (T t10 : tArr) {
            m10.put(lVar.A(t10), t10);
        }
        return m10;
    }

    @oe.f
    public static final short b8(short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr[0];
    }

    public static final int b9(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (double valueOf : dArr) {
            if (lVar.A(Double.valueOf(valueOf)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @fh.g
    public static final Iterable<p0<Double>> bA(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        return new q0(new z(dArr));
    }

    @fh.g
    public static final <V> List<V> bB(@fh.g short[] sArr, @fh.g short[] sArr2, @fh.g we.p<? super Short, ? super Short, ? extends V> pVar) {
        l0.p(sArr, "<this>");
        l0.p(sArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Short.valueOf(sArr[i10]), Short.valueOf(sArr2[i10])));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Float> ba(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Ue = Ue(fArr); -1 < Ue; Ue--) {
            if (!lVar.A(Float.valueOf(fArr[Ue])).booleanValue()) {
                return Yx(fArr, Ue + 1);
            }
        }
        return w.E();
    }

    @fh.g
    public static final <C extends Collection<? super Character>> C bb(@fh.g char[] cArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Character, Boolean> pVar) {
        l0.p(cArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char c11 = cArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Character.valueOf(c11)).booleanValue()) {
                c10.add(Character.valueOf(c11));
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    @oe.f
    public static final Float bc(float[] fArr, we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                float f10 = fArr[length];
                if (lVar.A(Float.valueOf(f10)).booleanValue()) {
                    return Float.valueOf(f10);
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return null;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterable")
    public static final <R> List<R> bd(byte[] bArr, we.p<? super Integer, ? super Byte, ? extends Iterable<? extends R>> pVar) {
        l0.p(bArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super java.lang.Float, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R be(@fh.g float[] r2, R r3, @fh.g we.p<? super java.lang.Float, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = Ue(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x001e
            int r1 = r0 + -1
            r0 = r2[r0]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r3 = r4.g0(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.be(float[], java.lang.Object, we.p):java.lang.Object");
    }

    @oe.f
    public static final char bf(char[] cArr, int i10, we.l<? super Integer, Character> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Se(cArr)) ? lVar.A(Integer.valueOf(i10)).charValue() : cArr[i10];
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, List<V>>> M bg(@fh.g boolean[] zArr, @fh.g M m10, @fh.g we.l<? super Boolean, ? extends K> lVar, @fh.g we.l<? super Boolean, ? extends V> lVar2) {
        l0.p(zArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (boolean z10 : zArr) {
            Object A = lVar.A(Boolean.valueOf(z10));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Boolean.valueOf(z10)));
        }
        return m10;
    }

    @oe.f
    public static final boolean bh(long[] jArr) {
        l0.p(jArr, "<this>");
        return !(jArr.length == 0);
    }

    public static final <T> T bi(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[Xe(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C bj(@fh.g T[] tArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            Object g02 = pVar.g0(Integer.valueOf(i11), tArr[i10]);
            if (g02 != null) {
                c10.add(g02);
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float bk(int[] iArr, we.l<? super Integer, Float> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (!(iArr.length == 0)) {
            float floatValue = lVar.A(Integer.valueOf(iArr[0])).floatValue();
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(Integer.valueOf(iArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R bl(double[] dArr, Comparator<? super R> comparator, we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R A = lVar.A(Double.valueOf(dArr[0]));
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Double.valueOf(dArr[o10.nextInt()]));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.4")
    @fh.h
    public static final <T, R extends Comparable<? super R>> T bm(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int Xe = Xe(tArr);
        if (Xe == 0) {
            return t10;
        }
        Comparable comparable = (Comparable) lVar.A(t10);
        s0 o10 = new gf.m(1, Xe).iterator();
        while (o10.hasNext()) {
            T t11 = tArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(t11);
            if (comparable.compareTo(comparable2) > 0) {
                t10 = t11;
                comparable = comparable2;
            }
        }
        return t10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double bn(long[] jArr, we.l<? super Long, Double> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Long.valueOf(jArr[0])).doubleValue();
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(Long.valueOf(jArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Byte bo(@fh.g byte[] bArr, @fh.g Comparator<? super Byte> comparator) {
        l0.p(bArr, "<this>");
        l0.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            byte b11 = bArr[o10.nextInt()];
            if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) > 0) {
                b10 = b11;
            }
        }
        return Byte.valueOf(b10);
    }

    @h1(version = "1.4")
    @oe.f
    public static final boolean[] bp(boolean[] zArr, we.p<? super Integer, ? super Boolean, u2> pVar) {
        l0.p(zArr, "<this>");
        l0.p(pVar, "action");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
        return zArr;
    }

    public static final <S, T extends S> S bq(@fh.g T[] tArr, @fh.g we.p<? super S, ? super T, ? extends S> pVar) {
        l0.p(tArr, "<this>");
        l0.p(pVar, "operation");
        if (!(tArr.length == 0)) {
            T t10 = tArr[0];
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            Object obj = t10;
            while (o10.hasNext()) {
                obj = pVar.g0(obj, tArr[o10.nextInt()]);
            }
            return obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Float br(@fh.g float[] fArr, @fh.g we.q<? super Integer, ? super Float, ? super Float, Float> qVar) {
        l0.p(fArr, "<this>");
        l0.p(qVar, "operation");
        int Ue = Ue(fArr);
        if (Ue < 0) {
            return null;
        }
        float f10 = fArr[Ue];
        for (int i10 = Ue - 1; i10 >= 0; i10--) {
            f10 = qVar.y(Integer.valueOf(i10), Float.valueOf(fArr[i10]), Float.valueOf(f10)).floatValue();
        }
        return Float.valueOf(f10);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Character, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> bs(char[] r4, R r5, we.p<? super R, ? super java.lang.Character, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            return r4
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            char r3 = r4[r1]
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.bs(char[], java.lang.Object, we.p):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Boolean, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> bt(boolean[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Boolean, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            goto L_0x003b
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r4 = r5[r1]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            r5 = r0
        L_0x003b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.bt(boolean[], java.lang.Object, we.q):java.util.List");
    }

    @fh.h
    public static final <T> T bu(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final void bv(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (jArr.length > 1) {
            o.r4(jArr);
            Ar(jArr);
        }
    }

    @fh.g
    public static final List<Float> bw(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.n4(copyOf);
        return Lr(copyOf);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double bx(int[] iArr, we.l<? super Integer, Double> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (int valueOf : iArr) {
            d10 += lVar.A(Integer.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final HashSet<Short> bz(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        return (HashSet) Qy(sArr, new HashSet(z0.j(sArr.length)));
    }

    @fh.g
    public static final <T> Iterable<T> c6(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return tArr.length == 0 ? w.E() : new a(tArr);
    }

    @fh.g
    public static final <T, K, V, M extends Map<? super K, ? super V>> M c7(@fh.g T[] tArr, @fh.g M m10, @fh.g we.l<? super T, ? extends K> lVar, @fh.g we.l<? super T, ? extends V> lVar2) {
        l0.p(tArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (T t10 : tArr) {
            m10.put(lVar.A(t10), lVar2.A(t10));
        }
        return m10;
    }

    @oe.f
    public static final boolean c8(boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr[0];
    }

    @oe.f
    public static final int c9(float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr.length;
    }

    @fh.g
    public static final Iterable<p0<Float>> cA(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        return new q0(new y(fArr));
    }

    @fh.g
    public static final <R> List<u0<Boolean, R>> cB(@fh.g boolean[] zArr, @fh.g Iterable<? extends R> iterable) {
        l0.p(zArr, "<this>");
        l0.p(iterable, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(r1.a(Boolean.valueOf(zArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @fh.g
    public static final List<Integer> ca(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Ve = Ve(iArr); -1 < Ve; Ve--) {
            if (!lVar.A(Integer.valueOf(iArr[Ve])).booleanValue()) {
                return Zx(iArr, Ve + 1);
            }
        }
        return w.E();
    }

    @fh.g
    public static final <C extends Collection<? super Double>> C cb(@fh.g double[] dArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Double, Boolean> pVar) {
        l0.p(dArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            double d10 = dArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Double.valueOf(d10)).booleanValue()) {
                c10.add(Double.valueOf(d10));
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    @oe.f
    public static final Integer cc(int[] iArr, we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                int i11 = iArr[length];
                if (lVar.A(Integer.valueOf(i11)).booleanValue()) {
                    return Integer.valueOf(i11);
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return null;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterable")
    public static final <R> List<R> cd(char[] cArr, we.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> pVar) {
        l0.p(cArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super java.lang.Integer, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R ce(@fh.g int[] r2, R r3, @fh.g we.p<? super java.lang.Integer, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = Ve(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x001e
            int r1 = r0 + -1
            r0 = r2[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r4.g0(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ce(int[], java.lang.Object, we.p):java.lang.Object");
    }

    @oe.f
    public static final double cf(double[] dArr, int i10, we.l<? super Integer, Double> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Te(dArr)) ? lVar.A(Integer.valueOf(i10)).doubleValue() : dArr[i10];
    }

    @fh.g
    @h1(version = "1.1")
    public static final <T, K> l0<T, K> cg(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends K> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "keySelector");
        return new s(tArr, lVar);
    }

    @oe.f
    public static final <T> boolean ch(T[] tArr) {
        l0.p(tArr, "<this>");
        return !(tArr.length == 0);
    }

    public static final <T> T ci(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                T t10 = tArr[length];
                if (!lVar.A(t10).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return t10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C cj(@fh.g byte[] bArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Byte, ? extends R> pVar) {
        l0.p(bArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            c10.add(pVar.g0(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float ck(long[] jArr, we.l<? super Long, Float> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (!(jArr.length == 0)) {
            float floatValue = lVar.A(Long.valueOf(jArr[0])).floatValue();
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(Long.valueOf(jArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R cl(float[] fArr, Comparator<? super R> comparator, we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R A = lVar.A(Float.valueOf(fArr[0]));
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Float.valueOf(fArr[o10.nextInt()]));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Short cm(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int Ye = Ye(sArr);
        if (Ye == 0) {
            return Short.valueOf(s10);
        }
        Comparable comparable = (Comparable) lVar.A(Short.valueOf(s10));
        s0 o10 = new gf.m(1, Ye).iterator();
        while (o10.hasNext()) {
            short s11 = sArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Short.valueOf(s11));
            if (comparable.compareTo(comparable2) > 0) {
                s10 = s11;
                comparable = comparable2;
            }
        }
        return Short.valueOf(s10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> Double cn(T[] tArr, we.l<? super T, Double> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(tArr[0]).doubleValue();
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(tArr[o10.nextInt()]).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Character co(@fh.g char[] cArr, @fh.g Comparator<? super Character> comparator) {
        l0.p(cArr, "<this>");
        l0.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            char c11 = cArr[o10.nextInt()];
            if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) > 0) {
                c10 = c11;
            }
        }
        return Character.valueOf(c10);
    }

    @fh.g
    public static final u0<List<Byte>, List<Byte>> cp(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b10 : bArr) {
            boolean booleanValue = lVar.A(Byte.valueOf(b10)).booleanValue();
            Byte valueOf = Byte.valueOf(b10);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new u0<>(arrayList, arrayList2);
    }

    public static final short cq(@fh.g short[] sArr, @fh.g we.p<? super Short, ? super Short, Short> pVar) {
        l0.p(sArr, "<this>");
        l0.p(pVar, "operation");
        if (!(sArr.length == 0)) {
            short s10 = sArr[0];
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                s10 = pVar.g0(Short.valueOf(s10), Short.valueOf(sArr[o10.nextInt()])).shortValue();
            }
            return s10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Integer cr(@fh.g int[] iArr, @fh.g we.q<? super Integer, ? super Integer, ? super Integer, Integer> qVar) {
        l0.p(iArr, "<this>");
        l0.p(qVar, "operation");
        int Ve = Ve(iArr);
        if (Ve < 0) {
            return null;
        }
        int i10 = iArr[Ve];
        for (int i11 = Ve - 1; i11 >= 0; i11--) {
            i10 = qVar.y(Integer.valueOf(i11), Integer.valueOf(iArr[i11]), Integer.valueOf(i10)).intValue();
        }
        return Integer.valueOf(i10);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.p, we.p<? super R, ? super java.lang.Double, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> cs(double[] r5, R r6, we.p<? super R, ? super java.lang.Double, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            r3 = r5[r1]
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Object r6 = r7.g0(r6, r3)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.cs(double[], java.lang.Object, we.p):java.util.List");
    }

    @h1(version = "1.4")
    public static final void ct(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        dt(bArr, ef.f.O);
    }

    @fh.h
    public static final <T> T cu(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        boolean z10 = false;
        T t10 = null;
        for (T t11 : tArr) {
            if (lVar.A(t11).booleanValue()) {
                if (z10) {
                    return null;
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (!z10) {
            return null;
        }
        return t10;
    }

    @h1(version = "1.4")
    public static final void cv(@fh.g long[] jArr, int i10, int i11) {
        l0.p(jArr, "<this>");
        o.s4(jArr, i10, i11);
        Br(jArr, i10, i11);
    }

    @fh.g
    public static final List<Integer> cw(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.p4(copyOf);
        return Mr(copyOf);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double cx(long[] jArr, we.l<? super Long, Double> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (long valueOf : jArr) {
            d10 += lVar.A(Long.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final <T> List<T> cy(@fh.g T[] tArr, int i10) {
        l0.p(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= tArr.length) {
                return kz(tArr);
            }
            if (i10 == 1) {
                return v.k(tArr[0]);
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (T add : tArr) {
                arrayList.add(add);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @fh.g
    public static final HashSet<Boolean> cz(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return (HashSet) Ry(zArr, new HashSet(z0.j(zArr.length)));
    }

    @fh.g
    public static final Iterable<Short> d6(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr.length == 0 ? w.E() : new c(sArr);
    }

    @fh.g
    public static final <K, M extends Map<? super K, ? super Short>> M d7(@fh.g short[] sArr, @fh.g M m10, @fh.g we.l<? super Short, ? extends K> lVar) {
        l0.p(sArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (short s10 : sArr) {
            m10.put(lVar.A(Short.valueOf(s10)), Short.valueOf(s10));
        }
        return m10;
    }

    @oe.f
    public static final byte d8(byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr[1];
    }

    public static final int d9(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (float valueOf : fArr) {
            if (lVar.A(Float.valueOf(valueOf)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @fh.g
    public static final Iterable<p0<Integer>> dA(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        return new q0(new w(iArr));
    }

    @fh.g
    public static final <R, V> List<V> dB(@fh.g boolean[] zArr, @fh.g Iterable<? extends R> iterable, @fh.g we.p<? super Boolean, ? super R, ? extends V> pVar) {
        l0.p(zArr, "<this>");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(pVar.g0(Boolean.valueOf(zArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @fh.g
    public static final List<Long> da(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        for (int We = We(jArr); -1 < We; We--) {
            if (!lVar.A(Long.valueOf(jArr[We])).booleanValue()) {
                return ay(jArr, We + 1);
            }
        }
        return w.E();
    }

    @fh.g
    public static final <C extends Collection<? super Float>> C db(@fh.g float[] fArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Float, Boolean> pVar) {
        l0.p(fArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            float f10 = fArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Float.valueOf(f10)).booleanValue()) {
                c10.add(Float.valueOf(f10));
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    @oe.f
    public static final Long dc(long[] jArr, we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                long j10 = jArr[length];
                if (lVar.A(Long.valueOf(j10)).booleanValue()) {
                    return Long.valueOf(j10);
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return null;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterable")
    public static final <R> List<R> dd(double[] dArr, we.p<? super Integer, ? super Double, ? extends Iterable<? extends R>> pVar) {
        l0.p(dArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super java.lang.Long, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R de(@fh.g long[] r4, R r5, @fh.g we.p<? super java.lang.Long, ? super R, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = We(r4)
        L_0x000e:
            if (r0 < 0) goto L_0x001e
            int r1 = r0 + -1
            r2 = r4[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r5 = r6.g0(r0, r5)
            r0 = r1
            goto L_0x000e
        L_0x001e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.de(long[], java.lang.Object, we.p):java.lang.Object");
    }

    @oe.f
    public static final float df(float[] fArr, int i10, we.l<? super Integer, Float> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Ue(fArr)) ? lVar.A(Integer.valueOf(i10)).floatValue() : fArr[i10];
    }

    public static final int dg(@fh.g byte[] bArr, byte b10) {
        l0.p(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @oe.f
    public static final boolean dh(short[] sArr) {
        l0.p(sArr, "<this>");
        return !(sArr.length == 0);
    }

    public static final short di(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (!(sArr.length == 0)) {
            return sArr[Ye(sArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C dj(@fh.g char[] cArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Character, ? extends R> pVar) {
        l0.p(cArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            c10.add(pVar.g0(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> float dk(T[] tArr, we.l<? super T, Float> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (!(tArr.length == 0)) {
            float floatValue = lVar.A(tArr[0]).floatValue();
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(tArr[o10.nextInt()]).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R dl(int[] iArr, Comparator<? super R> comparator, we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R A = lVar.A(Integer.valueOf(iArr[0]));
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Integer.valueOf(iArr[o10.nextInt()]));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.7")
    @ve.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> byte dm(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (!(bArr.length == 0)) {
            byte b10 = bArr[0];
            int Re = Re(bArr);
            if (Re == 0) {
                return b10;
            }
            Comparable comparable = (Comparable) lVar.A(Byte.valueOf(b10));
            s0 o10 = new gf.m(1, Re).iterator();
            while (o10.hasNext()) {
                byte b11 = bArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Byte.valueOf(b11));
                if (comparable.compareTo(comparable2) > 0) {
                    b10 = b11;
                    comparable = comparable2;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double dn(short[] sArr, we.l<? super Short, Double> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Short.valueOf(sArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(Short.valueOf(sArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @fh.h
    /* renamed from: do  reason: not valid java name */
    public static final Double m0do(@fh.g double[] dArr, @fh.g Comparator<? super Double> comparator) {
        l0.p(dArr, "<this>");
        l0.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            double d11 = dArr[o10.nextInt()];
            if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) > 0) {
                d10 = d11;
            }
        }
        return Double.valueOf(d10);
    }

    @fh.g
    public static final u0<List<Character>, List<Character>> dp(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c10 : cArr) {
            boolean booleanValue = lVar.A(Character.valueOf(c10)).booleanValue();
            Character valueOf = Character.valueOf(c10);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new u0<>(arrayList, arrayList2);
    }

    public static final boolean dq(@fh.g boolean[] zArr, @fh.g we.p<? super Boolean, ? super Boolean, Boolean> pVar) {
        l0.p(zArr, "<this>");
        l0.p(pVar, "operation");
        if (!(zArr.length == 0)) {
            boolean z10 = zArr[0];
            s0 o10 = new gf.m(1, Ze(zArr)).iterator();
            while (o10.hasNext()) {
                z10 = pVar.g0(Boolean.valueOf(z10), Boolean.valueOf(zArr[o10.nextInt()])).booleanValue();
            }
            return z10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Long dr(@fh.g long[] jArr, @fh.g we.q<? super Integer, ? super Long, ? super Long, Long> qVar) {
        l0.p(jArr, "<this>");
        l0.p(qVar, "operation");
        int We = We(jArr);
        if (We < 0) {
            return null;
        }
        long j10 = jArr[We];
        for (int i10 = We - 1; i10 >= 0; i10--) {
            j10 = qVar.y(Integer.valueOf(i10), Long.valueOf(jArr[i10]), Long.valueOf(j10)).longValue();
        }
        return Long.valueOf(j10);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Float, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> ds(float[] r4, R r5, we.p<? super R, ? super java.lang.Float, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            return r4
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            r3 = r4[r1]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ds(float[], java.lang.Object, we.p):java.util.List");
    }

    @h1(version = "1.4")
    public static final void dt(@fh.g byte[] bArr, @fh.g ef.f fVar) {
        l0.p(bArr, "<this>");
        l0.p(fVar, "random");
        for (int Re = Re(bArr); Re > 0; Re--) {
            int m10 = fVar.m(Re + 1);
            byte b10 = bArr[Re];
            bArr[Re] = bArr[m10];
            bArr[m10] = b10;
        }
    }

    @fh.h
    public static final Short du(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> void dv(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        o.I4(tArr, fe.g.x());
    }

    @fh.g
    public static final List<Long> dw(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.r4(copyOf);
        return Nr(copyOf);
    }

    @ve.h(name = "sumOfDouble")
    public static final double dx(@fh.g Double[] dArr) {
        l0.p(dArr, "<this>");
        double d10 = 0.0d;
        for (Double doubleValue : dArr) {
            d10 += doubleValue.doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final List<Short> dy(@fh.g short[] sArr, int i10) {
        l0.p(sArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= sArr.length) {
                return lz(sArr);
            }
            if (i10 == 1) {
                return v.k(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (short valueOf : sArr) {
                arrayList.add(Short.valueOf(valueOf));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @fh.g
    public static final int[] dz(@fh.g Integer[] numArr) {
        l0.p(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    @fh.g
    public static final Iterable<Boolean> e6(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr.length == 0 ? w.E() : new h(zArr);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M e7(@fh.g short[] sArr, @fh.g M m10, @fh.g we.l<? super Short, ? extends K> lVar, @fh.g we.l<? super Short, ? extends V> lVar2) {
        l0.p(sArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (short s10 : sArr) {
            m10.put(lVar.A(Short.valueOf(s10)), lVar2.A(Short.valueOf(s10)));
        }
        return m10;
    }

    @oe.f
    public static final char e8(char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr[1];
    }

    @oe.f
    public static final int e9(int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr.length;
    }

    @fh.g
    public static final Iterable<p0<Long>> eA(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        return new q0(new x(jArr));
    }

    @fh.g
    public static final <R> List<u0<Boolean, R>> eB(@fh.g boolean[] zArr, @fh.g R[] rArr) {
        l0.p(zArr, "<this>");
        l0.p(rArr, "other");
        int min = Math.min(zArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            boolean z10 = zArr[i10];
            arrayList.add(r1.a(Boolean.valueOf(z10), rArr[i10]));
        }
        return arrayList;
    }

    @fh.g
    public static final <T> List<T> ea(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Xe = Xe(tArr); -1 < Xe; Xe--) {
            if (!lVar.A(tArr[Xe]).booleanValue()) {
                return cy(tArr, Xe + 1);
            }
        }
        return w.E();
    }

    @fh.g
    public static final <C extends Collection<? super Integer>> C eb(@fh.g int[] iArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Integer, Boolean> pVar) {
        l0.p(iArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            int i13 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Integer.valueOf(i12)).booleanValue()) {
                c10.add(Integer.valueOf(i12));
            }
            i10++;
            i11 = i13;
        }
        return c10;
    }

    @oe.f
    public static final <T> T ec(T[] tArr, we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                T t10 = tArr[length];
                if (lVar.A(t10).booleanValue()) {
                    return t10;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return null;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterable")
    public static final <R> List<R> ed(float[] fArr, we.p<? super Integer, ? super Float, ? extends Iterable<? extends R>> pVar) {
        l0.p(fArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super T, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R ee(@fh.g T[] r2, R r3, @fh.g we.p<? super T, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = Xe(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x001a
            int r1 = r0 + -1
            r0 = r2[r0]
            java.lang.Object r3 = r4.g0(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x001a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ee(java.lang.Object[], java.lang.Object, we.p):java.lang.Object");
    }

    @oe.f
    public static final int ef(int[] iArr, int i10, we.l<? super Integer, Integer> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Ve(iArr)) ? lVar.A(Integer.valueOf(i10)).intValue() : iArr[i10];
    }

    public static final int eg(@fh.g char[] cArr, char c10) {
        l0.p(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @oe.f
    public static final boolean eh(boolean[] zArr) {
        l0.p(zArr, "<this>");
        return !(zArr.length == 0);
    }

    public static final short ei(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                short s10 = sArr[length];
                if (!lVar.A(Short.valueOf(s10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return s10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C ej(@fh.g double[] dArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Double, ? extends R> pVar) {
        l0.p(dArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            c10.add(pVar.g0(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float ek(short[] sArr, we.l<? super Short, Float> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (!(sArr.length == 0)) {
            float floatValue = lVar.A(Short.valueOf(sArr[0])).floatValue();
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(Short.valueOf(sArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R el(long[] jArr, Comparator<? super R> comparator, we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R A = lVar.A(Long.valueOf(jArr[0]));
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Long.valueOf(jArr[o10.nextInt()]));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.7")
    @ve.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char em(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (!(cArr.length == 0)) {
            char c10 = cArr[0];
            int Se = Se(cArr);
            if (Se == 0) {
                return c10;
            }
            Comparable comparable = (Comparable) lVar.A(Character.valueOf(c10));
            s0 o10 = new gf.m(1, Se).iterator();
            while (o10.hasNext()) {
                char c11 = cArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Character.valueOf(c11));
                if (comparable.compareTo(comparable2) > 0) {
                    c10 = c11;
                    comparable = comparable2;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double en(boolean[] zArr, we.l<? super Boolean, Double> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Boolean.valueOf(zArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Ze(zArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(Boolean.valueOf(zArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Float eo(@fh.g float[] fArr, @fh.g Comparator<? super Float> comparator) {
        l0.p(fArr, "<this>");
        l0.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            float f11 = fArr[o10.nextInt()];
            if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) > 0) {
                f10 = f11;
            }
        }
        return Float.valueOf(f10);
    }

    @fh.g
    public static final u0<List<Double>, List<Double>> ep(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d10 : dArr) {
            boolean booleanValue = lVar.A(Double.valueOf(d10)).booleanValue();
            Double valueOf = Double.valueOf(d10);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new u0<>(arrayList, arrayList2);
    }

    public static final byte eq(@fh.g byte[] bArr, @fh.g we.q<? super Integer, ? super Byte, ? super Byte, Byte> qVar) {
        l0.p(bArr, "<this>");
        l0.p(qVar, "operation");
        if (!(bArr.length == 0)) {
            byte b10 = bArr[0];
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                b10 = qVar.y(Integer.valueOf(nextInt), Byte.valueOf(b10), Byte.valueOf(bArr[nextInt])).byteValue();
            }
            return b10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final <S, T extends S> S er(@fh.g T[] tArr, @fh.g we.q<? super Integer, ? super T, ? super S, ? extends S> qVar) {
        l0.p(tArr, "<this>");
        l0.p(qVar, "operation");
        int Xe = Xe(tArr);
        if (Xe < 0) {
            return null;
        }
        int i10 = Xe - 1;
        Object obj = tArr[Xe];
        while (i10 >= 0) {
            i10--;
            obj = qVar.y(Integer.valueOf(i10), tArr[i10], obj);
        }
        return obj;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Integer, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> es(int[] r4, R r5, we.p<? super R, ? super java.lang.Integer, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            return r4
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            r3 = r4[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.es(int[], java.lang.Object, we.p):java.util.List");
    }

    @h1(version = "1.4")
    public static final void et(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        ft(cArr, ef.f.O);
    }

    @fh.h
    public static final Short eu(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        boolean z10 = false;
        Short sh2 = null;
        for (short s10 : sArr) {
            if (lVar.A(Short.valueOf(s10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                sh2 = Short.valueOf(s10);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return sh2;
    }

    @h1(version = "1.4")
    public static final <T extends Comparable<? super T>> void ev(@fh.g T[] tArr, int i10, int i11) {
        l0.p(tArr, "<this>");
        o.J4(tArr, fe.g.x(), i10, i11);
    }

    @fh.g
    public static final <T extends Comparable<? super T>> List<T> ew(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return mw(tArr, fe.g.x());
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final <T> double ex(T[] tArr, we.l<? super T, Double> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (T A : tArr) {
            d10 += lVar.A(A).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final List<Boolean> ey(@fh.g boolean[] zArr, int i10) {
        l0.p(zArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            if (i10 >= zArr.length) {
                return mz(zArr);
            }
            if (i10 == 1) {
                return v.k(Boolean.valueOf(zArr[0]));
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (boolean valueOf : zArr) {
                arrayList.add(Boolean.valueOf(valueOf));
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @fh.g
    public static final List<Byte> ez(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? oz(bArr) : v.k(Byte.valueOf(bArr[0])) : w.E();
    }

    @fh.g
    public static final p000if.m<Byte> f6(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr.length == 0 ? p000if.s.g() : new k(bArr);
    }

    @fh.g
    public static final <K, M extends Map<? super K, ? super Boolean>> M f7(@fh.g boolean[] zArr, @fh.g M m10, @fh.g we.l<? super Boolean, ? extends K> lVar) {
        l0.p(zArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (boolean z10 : zArr) {
            m10.put(lVar.A(Boolean.valueOf(z10)), Boolean.valueOf(z10));
        }
        return m10;
    }

    @oe.f
    public static final double f8(double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr[1];
    }

    public static final int f9(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (int valueOf : iArr) {
            if (lVar.A(Integer.valueOf(valueOf)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @fh.g
    public static final <T> Iterable<p0<T>> fA(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return new q0(new t(tArr));
    }

    @fh.g
    public static final <R, V> List<V> fB(@fh.g boolean[] zArr, @fh.g R[] rArr, @fh.g we.p<? super Boolean, ? super R, ? extends V> pVar) {
        l0.p(zArr, "<this>");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(zArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Boolean.valueOf(zArr[i10]), rArr[i10]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Short> fa(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Ye = Ye(sArr); -1 < Ye; Ye--) {
            if (!lVar.A(Short.valueOf(sArr[Ye])).booleanValue()) {
                return dy(sArr, Ye + 1);
            }
        }
        return w.E();
    }

    @fh.g
    public static final <C extends Collection<? super Long>> C fb(@fh.g long[] jArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Long, Boolean> pVar) {
        l0.p(jArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            long j10 = jArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Long.valueOf(j10)).booleanValue()) {
                c10.add(Long.valueOf(j10));
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    @oe.f
    public static final Short fc(short[] sArr, we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                short s10 = sArr[length];
                if (lVar.A(Short.valueOf(s10)).booleanValue()) {
                    return Short.valueOf(s10);
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return null;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterable")
    public static final <R> List<R> fd(int[] iArr, we.p<? super Integer, ? super Integer, ? extends Iterable<? extends R>> pVar) {
        l0.p(iArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super java.lang.Short, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R fe(@fh.g short[] r2, R r3, @fh.g we.p<? super java.lang.Short, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = Ye(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x001e
            int r1 = r0 + -1
            short r0 = r2[r0]
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            java.lang.Object r3 = r4.g0(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.fe(short[], java.lang.Object, we.p):java.lang.Object");
    }

    @oe.f
    public static final long ff(long[] jArr, int i10, we.l<? super Integer, Long> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > We(jArr)) ? lVar.A(Integer.valueOf(i10)).longValue() : jArr[i10];
    }

    @zd.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @zd.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @b1(expression = "indexOfFirst { it == element }", imports = {}))
    public static final /* synthetic */ int fg(double[] dArr, double d10) {
        l0.p(dArr, "<this>");
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (d10 == dArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <A extends Appendable> A fh(@fh.g byte[] bArr, @fh.g A a10, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Byte, ? extends CharSequence> lVar) {
        l0.p(bArr, "<this>");
        l0.p(a10, "buffer");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? (CharSequence) lVar.A(Byte.valueOf(b10)) : String.valueOf(b10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final boolean fi(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        if (!(zArr.length == 0)) {
            return zArr[Ze(zArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C fj(@fh.g float[] fArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Float, ? extends R> pVar) {
        l0.p(fArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            c10.add(pVar.g0(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float fk(boolean[] zArr, we.l<? super Boolean, Float> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (!(zArr.length == 0)) {
            float floatValue = lVar.A(Boolean.valueOf(zArr[0])).floatValue();
            s0 o10 = new gf.m(1, Ze(zArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(Boolean.valueOf(zArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R> R fl(T[] tArr, Comparator<? super R> comparator, we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R A = lVar.A(tArr[0]);
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(tArr[o10.nextInt()]);
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.7")
    @ve.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> double fm(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (!(dArr.length == 0)) {
            double d10 = dArr[0];
            int Te = Te(dArr);
            if (Te == 0) {
                return d10;
            }
            Comparable comparable = (Comparable) lVar.A(Double.valueOf(d10));
            s0 o10 = new gf.m(1, Te).iterator();
            while (o10.hasNext()) {
                double d11 = dArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Double.valueOf(d11));
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                    d10 = d11;
                }
            }
            return d10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float fn(byte[] bArr, we.l<? super Byte, Float> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Byte.valueOf(bArr[0])).floatValue();
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(Byte.valueOf(bArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Integer fo(@fh.g int[] iArr, @fh.g Comparator<? super Integer> comparator) {
        l0.p(iArr, "<this>");
        l0.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            int i11 = iArr[o10.nextInt()];
            if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i11)) > 0) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    @fh.g
    public static final u0<List<Float>, List<Float>> fp(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f10 : fArr) {
            boolean booleanValue = lVar.A(Float.valueOf(f10)).booleanValue();
            Float valueOf = Float.valueOf(f10);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new u0<>(arrayList, arrayList2);
    }

    public static final char fq(@fh.g char[] cArr, @fh.g we.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(cArr, "<this>");
        l0.p(qVar, "operation");
        if (!(cArr.length == 0)) {
            char c10 = cArr[0];
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                c10 = qVar.y(Integer.valueOf(nextInt), Character.valueOf(c10), Character.valueOf(cArr[nextInt])).charValue();
            }
            return c10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Short fr(@fh.g short[] sArr, @fh.g we.q<? super Integer, ? super Short, ? super Short, Short> qVar) {
        l0.p(sArr, "<this>");
        l0.p(qVar, "operation");
        int Ye = Ye(sArr);
        if (Ye < 0) {
            return null;
        }
        short s10 = sArr[Ye];
        for (int i10 = Ye - 1; i10 >= 0; i10--) {
            s10 = qVar.y(Integer.valueOf(i10), Short.valueOf(sArr[i10]), Short.valueOf(s10)).shortValue();
        }
        return Short.valueOf(s10);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.p, we.p<? super R, ? super java.lang.Long, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> fs(long[] r5, R r6, we.p<? super R, ? super java.lang.Long, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            r3 = r5[r1]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r6 = r7.g0(r6, r3)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.fs(long[], java.lang.Object, we.p):java.util.List");
    }

    @h1(version = "1.4")
    public static final void ft(@fh.g char[] cArr, @fh.g ef.f fVar) {
        l0.p(cArr, "<this>");
        l0.p(fVar, "random");
        for (int Se = Se(cArr); Se > 0; Se--) {
            int m10 = fVar.m(Se + 1);
            char c10 = cArr[Se];
            cArr[Se] = cArr[m10];
            cArr[m10] = c10;
        }
    }

    @fh.g
    public static final List<Byte> fu(@fh.g byte[] bArr, @fh.g gf.m mVar) {
        l0.p(bArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : o.n(o.G1(bArr, mVar.c().intValue(), mVar.h().intValue() + 1));
    }

    public static final void fv(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (sArr.length > 1) {
            o.x4(sArr);
            Er(sArr);
        }
    }

    @fh.g
    public static final List<Short> fw(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.x4(copyOf);
        return Pr(copyOf);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double fx(short[] sArr, we.l<? super Short, Double> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (short valueOf : sArr) {
            d10 += lVar.A(Short.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final List<Byte> fy(@fh.g byte[] bArr, int i10) {
        l0.p(bArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int length = bArr.length;
            if (i10 >= length) {
                return ez(bArr);
            }
            if (i10 == 1) {
                return v.k(Byte.valueOf(bArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(Byte.valueOf(bArr[i11]));
            }
            return arrayList;
        }
    }

    @fh.g
    public static final List<Character> fz(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? pz(cArr) : v.k(Character.valueOf(cArr[0])) : w.E();
    }

    @fh.g
    public static final p000if.m<Character> g6(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr.length == 0 ? p000if.s.g() : new r(cArr);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M g7(@fh.g boolean[] zArr, @fh.g M m10, @fh.g we.l<? super Boolean, ? extends K> lVar, @fh.g we.l<? super Boolean, ? extends V> lVar2) {
        l0.p(zArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (boolean z10 : zArr) {
            m10.put(lVar.A(Boolean.valueOf(z10)), lVar2.A(Boolean.valueOf(z10)));
        }
        return m10;
    }

    @oe.f
    public static final float g8(float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr[1];
    }

    @oe.f
    public static final int g9(long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr.length;
    }

    @fh.g
    public static final Iterable<p0<Short>> gA(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        return new q0(new v(sArr));
    }

    @fh.g
    public static final List<u0<Boolean, Boolean>> gB(@fh.g boolean[] zArr, @fh.g boolean[] zArr2) {
        l0.p(zArr, "<this>");
        l0.p(zArr2, "other");
        int min = Math.min(zArr.length, zArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(r1.a(Boolean.valueOf(zArr[i10]), Boolean.valueOf(zArr2[i10])));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Boolean> ga(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Ze = Ze(zArr); -1 < Ze; Ze--) {
            if (!lVar.A(Boolean.valueOf(zArr[Ze])).booleanValue()) {
                return ey(zArr, Ze + 1);
            }
        }
        return w.E();
    }

    @fh.g
    public static final <T, C extends Collection<? super T>> C gb(@fh.g T[] tArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super T, Boolean> pVar) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), t10).booleanValue()) {
                c10.add(t10);
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    public static final byte gc(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (!(bArr.length == 0)) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterable")
    public static final <R> List<R> gd(long[] jArr, we.p<? super Integer, ? super Long, ? extends Iterable<? extends R>> pVar) {
        l0.p(jArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super java.lang.Boolean, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R ge(@fh.g boolean[] r2, R r3, @fh.g we.p<? super java.lang.Boolean, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = Ze(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x001e
            int r1 = r0 + -1
            boolean r0 = r2[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r3 = r4.g0(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x001e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ge(boolean[], java.lang.Object, we.p):java.lang.Object");
    }

    @oe.f
    public static final <T> T gf(T[] tArr, int i10, we.l<? super Integer, ? extends T> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Xe(tArr)) ? lVar.A(Integer.valueOf(i10)) : tArr[i10];
    }

    @zd.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @zd.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @b1(expression = "indexOfFirst { it == element }", imports = {}))
    public static final /* synthetic */ int gg(float[] fArr, float f10) {
        l0.p(fArr, "<this>");
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (f10 == fArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <A extends Appendable> A gh(@fh.g char[] cArr, @fh.g A a10, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Character, ? extends CharSequence> lVar) {
        l0.p(cArr, "<this>");
        l0.p(a10, "buffer");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (char c10 : cArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                a10.append((CharSequence) lVar.A(Character.valueOf(c10)));
            } else {
                a10.append(c10);
            }
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final boolean gi(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                boolean z10 = zArr[length];
                if (!lVar.A(Boolean.valueOf(z10)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return z10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C gj(@fh.g int[] iArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Integer, ? extends R> pVar) {
        l0.p(iArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            c10.add(pVar.g0(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R gk(byte[] bArr, we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (!(bArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Byte.valueOf(bArr[0]));
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Byte.valueOf(bArr[o10.nextInt()]));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R gl(short[] sArr, Comparator<? super R> comparator, we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R A = lVar.A(Short.valueOf(sArr[0]));
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Short.valueOf(sArr[o10.nextInt()]));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.7")
    @ve.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> float gm(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (!(fArr.length == 0)) {
            float f10 = fArr[0];
            int Ue = Ue(fArr);
            if (Ue == 0) {
                return f10;
            }
            Comparable comparable = (Comparable) lVar.A(Float.valueOf(f10));
            s0 o10 = new gf.m(1, Ue).iterator();
            while (o10.hasNext()) {
                float f11 = fArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Float.valueOf(f11));
                if (comparable.compareTo(comparable2) > 0) {
                    f10 = f11;
                    comparable = comparable2;
                }
            }
            return f10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float gn(char[] cArr, we.l<? super Character, Float> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Character.valueOf(cArr[0])).floatValue();
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(Character.valueOf(cArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Long go(@fh.g long[] jArr, @fh.g Comparator<? super Long> comparator) {
        l0.p(jArr, "<this>");
        l0.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            long j11 = jArr[o10.nextInt()];
            if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) > 0) {
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @fh.g
    public static final u0<List<Integer>, List<Integer>> gp(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 : iArr) {
            boolean booleanValue = lVar.A(Integer.valueOf(i10)).booleanValue();
            Integer valueOf = Integer.valueOf(i10);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new u0<>(arrayList, arrayList2);
    }

    public static final double gq(@fh.g double[] dArr, @fh.g we.q<? super Integer, ? super Double, ? super Double, Double> qVar) {
        l0.p(dArr, "<this>");
        l0.p(qVar, "operation");
        if (!(dArr.length == 0)) {
            double d10 = dArr[0];
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                d10 = qVar.y(Integer.valueOf(nextInt), Double.valueOf(d10), Double.valueOf(dArr[nextInt])).doubleValue();
            }
            return d10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Boolean gr(@fh.g boolean[] zArr, @fh.g we.p<? super Boolean, ? super Boolean, Boolean> pVar) {
        l0.p(zArr, "<this>");
        l0.p(pVar, "operation");
        int Ze = Ze(zArr);
        if (Ze < 0) {
            return null;
        }
        boolean z10 = zArr[Ze];
        for (int i10 = Ze - 1; i10 >= 0; i10--) {
            z10 = pVar.g0(Boolean.valueOf(zArr[i10]), Boolean.valueOf(z10)).booleanValue();
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @fh.g
    @zd.h1(version = "1.4")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.util.List<R> gs(@fh.g T[] r4, R r5, @fh.g we.p<? super R, ? super T, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            return r4
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0032
            r3 = r4[r1]
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.gs(java.lang.Object[], java.lang.Object, we.p):java.util.List");
    }

    @h1(version = "1.4")
    public static final void gt(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        ht(dArr, ef.f.O);
    }

    @fh.g
    public static final List<Byte> gu(@fh.g byte[] bArr, @fh.g Iterable<Integer> iterable) {
        l0.p(bArr, "<this>");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(Byte.valueOf(bArr[intValue.intValue()]));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    public static final void gv(@fh.g short[] sArr, int i10, int i11) {
        l0.p(sArr, "<this>");
        o.y4(sArr, i10, i11);
        Fr(sArr, i10, i11);
    }

    @fh.g
    public static final List<Byte> gw(@fh.g byte[] bArr, @fh.g Comparator<? super Byte> comparator) {
        l0.p(bArr, "<this>");
        l0.p(comparator, "comparator");
        Byte[] o52 = o.o5(bArr);
        o.I4(o52, comparator);
        return o.t(o52);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double gx(boolean[] zArr, we.l<? super Boolean, Double> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (boolean valueOf : zArr) {
            d10 += lVar.A(Boolean.valueOf(valueOf)).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final List<Character> gy(@fh.g char[] cArr, int i10) {
        l0.p(cArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int length = cArr.length;
            if (i10 >= length) {
                return fz(cArr);
            }
            if (i10 == 1) {
                return v.k(Character.valueOf(cArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(Character.valueOf(cArr[i11]));
            }
            return arrayList;
        }
    }

    @fh.g
    public static final List<Double> gz(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? qz(dArr) : v.k(Double.valueOf(dArr[0])) : w.E();
    }

    @fh.g
    public static final p000if.m<Double> h6(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr.length == 0 ? p000if.s.g() : new C0262p(dArr);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M h7(@fh.g byte[] bArr, @fh.g M m10, @fh.g we.l<? super Byte, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(bArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (byte valueOf : bArr) {
            u0 u0Var = (u0) lVar.A(Byte.valueOf(valueOf));
            m10.put(u0Var.e(), u0Var.f());
        }
        return m10;
    }

    @oe.f
    public static final int h8(int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr[1];
    }

    public static final int h9(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (long valueOf : jArr) {
            if (lVar.A(Long.valueOf(valueOf)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @fh.g
    public static final Iterable<p0<Boolean>> hA(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return new q0(new a0(zArr));
    }

    @fh.g
    public static final <V> List<V> hB(@fh.g boolean[] zArr, @fh.g boolean[] zArr2, @fh.g we.p<? super Boolean, ? super Boolean, ? extends V> pVar) {
        l0.p(zArr, "<this>");
        l0.p(zArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(zArr.length, zArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Boolean.valueOf(zArr[i10]), Boolean.valueOf(zArr2[i10])));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Byte> ha(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (z10) {
                arrayList.add(Byte.valueOf(b10));
            } else if (!lVar.A(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <C extends Collection<? super Short>> C hb(@fh.g short[] sArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Short, Boolean> pVar) {
        l0.p(sArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            short s10 = sArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Short.valueOf(s10)).booleanValue()) {
                c10.add(Short.valueOf(s10));
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    public static final byte hc(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        for (byte b10 : bArr) {
            if (lVar.A(Byte.valueOf(b10)).booleanValue()) {
                return b10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterable")
    public static final <T, R> List<R> hd(T[] tArr, we.p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        l0.p(tArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super java.lang.Byte, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R he(@fh.g byte[] r3, R r4, @fh.g we.q<? super java.lang.Integer, ? super java.lang.Byte, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = Re(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0021
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            byte r2 = r3[r0]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            java.lang.Object r4 = r5.y(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0021:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.he(byte[], java.lang.Object, we.q):java.lang.Object");
    }

    @oe.f
    public static final short hf(short[] sArr, int i10, we.l<? super Integer, Short> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Ye(sArr)) ? lVar.A(Integer.valueOf(i10)).shortValue() : sArr[i10];
    }

    public static final int hg(@fh.g int[] iArr, int i10) {
        l0.p(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    @fh.g
    public static final <A extends Appendable> A hh(@fh.g double[] dArr, @fh.g A a10, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Double, ? extends CharSequence> lVar) {
        l0.p(dArr, "<this>");
        l0.p(a10, "buffer");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (double d10 : dArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? (CharSequence) lVar.A(Double.valueOf(d10)) : String.valueOf(d10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final int hi(@fh.g byte[] bArr, byte b10) {
        l0.p(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (b10 == bArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C hj(@fh.g long[] jArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Long, ? extends R> pVar) {
        l0.p(jArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            c10.add(pVar.g0(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R hk(char[] cArr, we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (!(cArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Character.valueOf(cArr[0]));
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Character.valueOf(cArr[o10.nextInt()]));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R hl(boolean[] zArr, Comparator<? super R> comparator, we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R A = lVar.A(Boolean.valueOf(zArr[0]));
        s0 o10 = new gf.m(1, Ze(zArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Boolean.valueOf(zArr[o10.nextInt()]));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @h1(version = "1.7")
    @ve.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> int hm(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (!(iArr.length == 0)) {
            int i10 = iArr[0];
            int Ve = Ve(iArr);
            if (Ve == 0) {
                return i10;
            }
            Comparable comparable = (Comparable) lVar.A(Integer.valueOf(i10));
            s0 o10 = new gf.m(1, Ve).iterator();
            while (o10.hasNext()) {
                int i11 = iArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Integer.valueOf(i11));
                if (comparable.compareTo(comparable2) > 0) {
                    i10 = i11;
                    comparable = comparable2;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float hn(double[] dArr, we.l<? super Double, Float> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Double.valueOf(dArr[0])).floatValue();
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(Double.valueOf(dArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final <T> T ho(@fh.g T[] tArr, @fh.g Comparator<? super T> comparator) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        while (o10.hasNext()) {
            T t11 = tArr[o10.nextInt()];
            if (comparator.compare(t10, t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @fh.g
    public static final u0<List<Long>, List<Long>> hp(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j10 : jArr) {
            boolean booleanValue = lVar.A(Long.valueOf(j10)).booleanValue();
            Long valueOf = Long.valueOf(j10);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new u0<>(arrayList, arrayList2);
    }

    public static final float hq(@fh.g float[] fArr, @fh.g we.q<? super Integer, ? super Float, ? super Float, Float> qVar) {
        l0.p(fArr, "<this>");
        l0.p(qVar, "operation");
        if (!(fArr.length == 0)) {
            float f10 = fArr[0];
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                f10 = qVar.y(Integer.valueOf(nextInt), Float.valueOf(f10), Float.valueOf(fArr[nextInt])).floatValue();
            }
            return f10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Byte hr(@fh.g byte[] bArr, @fh.g we.p<? super Byte, ? super Byte, Byte> pVar) {
        l0.p(bArr, "<this>");
        l0.p(pVar, "operation");
        int Re = Re(bArr);
        if (Re < 0) {
            return null;
        }
        byte b10 = bArr[Re];
        for (int i10 = Re - 1; i10 >= 0; i10--) {
            b10 = pVar.g0(Byte.valueOf(bArr[i10]), Byte.valueOf(b10)).byteValue();
        }
        return Byte.valueOf(b10);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Short, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> hs(short[] r4, R r5, we.p<? super R, ? super java.lang.Short, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            return r4
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            short r3 = r4[r1]
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.hs(short[], java.lang.Object, we.p):java.util.List");
    }

    @h1(version = "1.4")
    public static final void ht(@fh.g double[] dArr, @fh.g ef.f fVar) {
        l0.p(dArr, "<this>");
        l0.p(fVar, "random");
        for (int Te = Te(dArr); Te > 0; Te--) {
            int m10 = fVar.m(Te + 1);
            double d10 = dArr[Te];
            dArr[Te] = dArr[m10];
            dArr[m10] = d10;
        }
    }

    @fh.g
    public static final List<Character> hu(@fh.g char[] cArr, @fh.g gf.m mVar) {
        l0.p(cArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : o.o(o.H1(cArr, mVar.c().intValue(), mVar.h().intValue() + 1));
    }

    @fh.g
    public static final List<Byte> hv(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        Byte[] o52 = o.o5(bArr);
        o.v4((Comparable[]) o52);
        return o.t(o52);
    }

    @fh.g
    public static final List<Character> hw(@fh.g char[] cArr, @fh.g Comparator<? super Character> comparator) {
        l0.p(cArr, "<this>");
        l0.p(comparator, "comparator");
        Character[] p52 = o.p5(cArr);
        o.I4(p52, comparator);
        return o.t(p52);
    }

    @ve.h(name = "sumOfFloat")
    public static final float hx(@fh.g Float[] fArr) {
        l0.p(fArr, "<this>");
        float f10 = 0.0f;
        for (Float floatValue : fArr) {
            f10 += floatValue.floatValue();
        }
        return f10;
    }

    @fh.g
    public static final List<Double> hy(@fh.g double[] dArr, int i10) {
        l0.p(dArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int length = dArr.length;
            if (i10 >= length) {
                return gz(dArr);
            }
            if (i10 == 1) {
                return v.k(Double.valueOf(dArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(Double.valueOf(dArr[i11]));
            }
            return arrayList;
        }
    }

    @fh.g
    public static final List<Float> hz(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? rz(fArr) : v.k(Float.valueOf(fArr[0])) : w.E();
    }

    @fh.g
    public static final p000if.m<Float> i6(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr.length == 0 ? p000if.s.g() : new o(fArr);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M i7(@fh.g char[] cArr, @fh.g M m10, @fh.g we.l<? super Character, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(cArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (char valueOf : cArr) {
            u0 u0Var = (u0) lVar.A(Character.valueOf(valueOf));
            m10.put(u0Var.e(), u0Var.f());
        }
        return m10;
    }

    @oe.f
    public static final long i8(long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr[1];
    }

    @oe.f
    public static final <T> int i9(T[] tArr) {
        l0.p(tArr, "<this>");
        return tArr.length;
    }

    @fh.g
    public static final <R> List<u0<Byte, R>> iA(@fh.g byte[] bArr, @fh.g Iterable<? extends R> iterable) {
        l0.p(bArr, "<this>");
        l0.p(iterable, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(r1.a(Byte.valueOf(bArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @fh.g
    public static final List<Character> ia(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (char c10 : cArr) {
            if (z10) {
                arrayList.add(Character.valueOf(c10));
            } else if (!lVar.A(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <C extends Collection<? super Boolean>> C ib(@fh.g boolean[] zArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Boolean, Boolean> pVar) {
        l0.p(zArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            boolean z10 = zArr[i10];
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Boolean.valueOf(z10)).booleanValue()) {
                c10.add(Boolean.valueOf(z10));
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    public static final char ic(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (!(cArr.length == 0)) {
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterable")
    public static final <R> List<R> id(short[] sArr, we.p<? super Integer, ? super Short, ? extends Iterable<? extends R>> pVar) {
        l0.p(sArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super java.lang.Character, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R ie(@fh.g char[] r3, R r4, @fh.g we.q<? super java.lang.Integer, ? super java.lang.Character, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = Se(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0021
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            char r2 = r3[r0]
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r4 = r5.y(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0021:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ie(char[], java.lang.Object, we.q):java.lang.Object");
    }

    @oe.f
    /* renamed from: if  reason: not valid java name */
    public static final boolean m1if(boolean[] zArr, int i10, we.l<? super Integer, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Ze(zArr)) ? lVar.A(Integer.valueOf(i10)).booleanValue() : zArr[i10];
    }

    public static final int ig(@fh.g long[] jArr, long j10) {
        l0.p(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <A extends Appendable> A ih(@fh.g float[] fArr, @fh.g A a10, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Float, ? extends CharSequence> lVar) {
        l0.p(fArr, "<this>");
        l0.p(a10, "buffer");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (float f10 : fArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? (CharSequence) lVar.A(Float.valueOf(f10)) : String.valueOf(f10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final int ii(@fh.g char[] cArr, char c10) {
        l0.p(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (c10 == cArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C ij(@fh.g T[] tArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            c10.add(pVar.g0(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R ik(double[] dArr, we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (!(dArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Double.valueOf(dArr[0]));
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Double.valueOf(dArr[o10.nextInt()]));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final Byte il(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            byte b11 = bArr[o10.nextInt()];
            if (b10 < b11) {
                b10 = b11;
            }
        }
        return Byte.valueOf(b10);
    }

    @h1(version = "1.7")
    @ve.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> long im(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (!(jArr.length == 0)) {
            long j10 = jArr[0];
            int We = We(jArr);
            if (We == 0) {
                return j10;
            }
            Comparable comparable = (Comparable) lVar.A(Long.valueOf(j10));
            s0 o10 = new gf.m(1, We).iterator();
            while (o10.hasNext()) {
                long j11 = jArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Long.valueOf(j11));
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                    j10 = j11;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float in(float[] fArr, we.l<? super Float, Float> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Float.valueOf(fArr[0])).floatValue();
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(Float.valueOf(fArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Short io(@fh.g short[] sArr, @fh.g Comparator<? super Short> comparator) {
        l0.p(sArr, "<this>");
        l0.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            short s11 = sArr[o10.nextInt()];
            if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) > 0) {
                s10 = s11;
            }
        }
        return Short.valueOf(s10);
    }

    @fh.g
    public static final <T> u0<List<T>, List<T>> ip(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : tArr) {
            if (lVar.A(t10).booleanValue()) {
                arrayList.add(t10);
            } else {
                arrayList2.add(t10);
            }
        }
        return new u0<>(arrayList, arrayList2);
    }

    public static final int iq(@fh.g int[] iArr, @fh.g we.q<? super Integer, ? super Integer, ? super Integer, Integer> qVar) {
        l0.p(iArr, "<this>");
        l0.p(qVar, "operation");
        if (!(iArr.length == 0)) {
            int i10 = iArr[0];
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                i10 = qVar.y(Integer.valueOf(nextInt), Integer.valueOf(i10), Integer.valueOf(iArr[nextInt])).intValue();
            }
            return i10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Character ir(@fh.g char[] cArr, @fh.g we.p<? super Character, ? super Character, Character> pVar) {
        l0.p(cArr, "<this>");
        l0.p(pVar, "operation");
        int Se = Se(cArr);
        if (Se < 0) {
            return null;
        }
        char c10 = cArr[Se];
        for (int i10 = Se - 1; i10 >= 0; i10--) {
            c10 = pVar.g0(Character.valueOf(cArr[i10]), Character.valueOf(c10)).charValue();
        }
        return Character.valueOf(c10);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Boolean, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> is(boolean[] r4, R r5, we.p<? super R, ? super java.lang.Boolean, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r4 = be.v.k(r5)
            return r4
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
            int r2 = r4.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            boolean r3 = r4[r1]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r5 = r6.g0(r5, r3)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.is(boolean[], java.lang.Object, we.p):java.util.List");
    }

    @fh.g
    public static final List<Character> iu(@fh.g char[] cArr, @fh.g Iterable<Integer> iterable) {
        l0.p(cArr, "<this>");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(Character.valueOf(cArr[intValue.intValue()]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Character> iv(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        Character[] p52 = o.p5(cArr);
        o.v4((Comparable[]) p52);
        return o.t(p52);
    }

    @fh.g
    public static final List<Double> iw(@fh.g double[] dArr, @fh.g Comparator<? super Double> comparator) {
        l0.p(dArr, "<this>");
        l0.p(comparator, "comparator");
        Double[] q52 = o.q5(dArr);
        o.I4(q52, comparator);
        return o.t(q52);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int ix(byte[] bArr, we.l<? super Byte, Integer> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (byte valueOf : bArr) {
            i10 += lVar.A(Byte.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @fh.g
    public static final List<Float> iy(@fh.g float[] fArr, int i10) {
        l0.p(fArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int length = fArr.length;
            if (i10 >= length) {
                return hz(fArr);
            }
            if (i10 == 1) {
                return v.k(Float.valueOf(fArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(Float.valueOf(fArr[i11]));
            }
            return arrayList;
        }
    }

    @fh.g
    public static final List<Integer> iz(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? sz(iArr) : v.k(Integer.valueOf(iArr[0])) : w.E();
    }

    @fh.g
    public static final p000if.m<Integer> j6(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr.length == 0 ? p000if.s.g() : new m(iArr);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M j7(@fh.g double[] dArr, @fh.g M m10, @fh.g we.l<? super Double, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(dArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (double valueOf : dArr) {
            u0 u0Var = (u0) lVar.A(Double.valueOf(valueOf));
            m10.put(u0Var.e(), u0Var.f());
        }
        return m10;
    }

    @oe.f
    public static final <T> T j8(T[] tArr) {
        l0.p(tArr, "<this>");
        return tArr[1];
    }

    public static final <T> int j9(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (T A : tArr) {
            if (lVar.A(A).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @fh.g
    public static final <R, V> List<V> jA(@fh.g byte[] bArr, @fh.g Iterable<? extends R> iterable, @fh.g we.p<? super Byte, ? super R, ? extends V> pVar) {
        l0.p(bArr, "<this>");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(pVar.g0(Byte.valueOf(bArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @fh.g
    public static final List<Double> ja(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (double d10 : dArr) {
            if (z10) {
                arrayList.add(Double.valueOf(d10));
            } else if (!lVar.A(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
                z10 = true;
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R> List<R> jb(Object[] objArr) {
        l0.p(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            l0.y(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final char jc(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        for (char c10 : cArr) {
            if (lVar.A(Character.valueOf(c10)).booleanValue()) {
                return c10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterable")
    public static final <R> List<R> jd(boolean[] zArr, we.p<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> pVar) {
        l0.p(zArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.q, we.q<? super java.lang.Integer, ? super java.lang.Double, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R je(@fh.g double[] r4, R r5, @fh.g we.q<? super java.lang.Integer, ? super java.lang.Double, ? super R, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = Te(r4)
        L_0x000e:
            if (r0 < 0) goto L_0x0021
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = r4[r0]
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object r5 = r6.y(r1, r2, r5)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0021:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.je(double[], java.lang.Object, we.q):java.lang.Object");
    }

    @fh.h
    public static final Boolean jf(@fh.g boolean[] zArr, int i10) {
        l0.p(zArr, "<this>");
        if (i10 < 0 || i10 > Ze(zArr)) {
            return null;
        }
        return Boolean.valueOf(zArr[i10]);
    }

    public static final <T> int jg(@fh.g T[] tArr, T t10) {
        l0.p(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (l0.g(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @fh.g
    public static final <A extends Appendable> A jh(@fh.g int[] iArr, @fh.g A a10, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Integer, ? extends CharSequence> lVar) {
        l0.p(iArr, "<this>");
        l0.p(a10, "buffer");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? (CharSequence) lVar.A(Integer.valueOf(i12)) : String.valueOf(i12));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    @zd.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @zd.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @b1(expression = "indexOfLast { it == element }", imports = {}))
    public static final /* synthetic */ int ji(double[] dArr, double d10) {
        l0.p(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (d10 == dArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C jj(@fh.g short[] sArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Short, ? extends R> pVar) {
        l0.p(sArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            c10.add(pVar.g0(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R jk(float[] fArr, we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (!(fArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Float.valueOf(fArr[0]));
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Float.valueOf(fArr[o10.nextInt()]));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final Character jl(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            char c11 = cArr[o10.nextInt()];
            if (l0.t(c10, c11) < 0) {
                c10 = c11;
            }
        }
        return Character.valueOf(c10);
    }

    @h1(version = "1.7")
    @ve.h(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T jm(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (!(tArr.length == 0)) {
            T t10 = tArr[0];
            int Xe = Xe(tArr);
            if (Xe == 0) {
                return t10;
            }
            Comparable comparable = (Comparable) lVar.A(t10);
            s0 o10 = new gf.m(1, Xe).iterator();
            while (o10.hasNext()) {
                T t11 = tArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(t11);
                if (comparable.compareTo(comparable2) > 0) {
                    t10 = t11;
                    comparable = comparable2;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float jn(int[] iArr, we.l<? super Integer, Float> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Integer.valueOf(iArr[0])).floatValue();
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(Integer.valueOf(iArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "minWithOrThrow")
    public static final byte jo(@fh.g byte[] bArr, @fh.g Comparator<? super Byte> comparator) {
        l0.p(bArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(bArr.length == 0)) {
            byte b10 = bArr[0];
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                byte b11 = bArr[o10.nextInt()];
                if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) > 0) {
                    b10 = b11;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final u0<List<Short>, List<Short>> jp(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s10 : sArr) {
            boolean booleanValue = lVar.A(Short.valueOf(s10)).booleanValue();
            Short valueOf = Short.valueOf(s10);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new u0<>(arrayList, arrayList2);
    }

    public static final long jq(@fh.g long[] jArr, @fh.g we.q<? super Integer, ? super Long, ? super Long, Long> qVar) {
        l0.p(jArr, "<this>");
        l0.p(qVar, "operation");
        if (!(jArr.length == 0)) {
            long j10 = jArr[0];
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                j10 = qVar.y(Integer.valueOf(nextInt), Long.valueOf(j10), Long.valueOf(jArr[nextInt])).longValue();
            }
            return j10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Double jr(@fh.g double[] dArr, @fh.g we.p<? super Double, ? super Double, Double> pVar) {
        l0.p(dArr, "<this>");
        l0.p(pVar, "operation");
        int Te = Te(dArr);
        if (Te < 0) {
            return null;
        }
        double d10 = dArr[Te];
        for (int i10 = Te - 1; i10 >= 0; i10--) {
            d10 = pVar.g0(Double.valueOf(dArr[i10]), Double.valueOf(d10)).doubleValue();
        }
        return Double.valueOf(d10);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Byte, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> js(byte[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Byte, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            byte r4 = r5[r1]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.js(byte[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.4")
    public static final void jt(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        kt(fArr, ef.f.O);
    }

    @fh.g
    public static final List<Double> ju(@fh.g double[] dArr, @fh.g gf.m mVar) {
        l0.p(dArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : o.p(o.I1(dArr, mVar.c().intValue(), mVar.h().intValue() + 1));
    }

    @fh.g
    public static final List<Double> jv(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        Double[] q52 = o.q5(dArr);
        o.v4((Comparable[]) q52);
        return o.t(q52);
    }

    @fh.g
    public static final List<Float> jw(@fh.g float[] fArr, @fh.g Comparator<? super Float> comparator) {
        l0.p(fArr, "<this>");
        l0.p(comparator, "comparator");
        Float[] r52 = o.r5(fArr);
        o.I4(r52, comparator);
        return o.t(r52);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int jx(char[] cArr, we.l<? super Character, Integer> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (char valueOf : cArr) {
            i10 += lVar.A(Character.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @fh.g
    public static final List<Integer> jy(@fh.g int[] iArr, int i10) {
        l0.p(iArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int length = iArr.length;
            if (i10 >= length) {
                return iz(iArr);
            }
            if (i10 == 1) {
                return v.k(Integer.valueOf(iArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(Integer.valueOf(iArr[i11]));
            }
            return arrayList;
        }
    }

    @fh.g
    public static final List<Long> jz(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? tz(jArr) : v.k(Long.valueOf(jArr[0])) : w.E();
    }

    @fh.g
    public static final p000if.m<Long> k6(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr.length == 0 ? p000if.s.g() : new n(jArr);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M k7(@fh.g float[] fArr, @fh.g M m10, @fh.g we.l<? super Float, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(fArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (float valueOf : fArr) {
            u0 u0Var = (u0) lVar.A(Float.valueOf(valueOf));
            m10.put(u0Var.e(), u0Var.f());
        }
        return m10;
    }

    @oe.f
    public static final short k8(short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr[1];
    }

    @oe.f
    public static final int k9(short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr.length;
    }

    @fh.g
    public static final List<u0<Byte, Byte>> kA(@fh.g byte[] bArr, @fh.g byte[] bArr2) {
        l0.p(bArr, "<this>");
        l0.p(bArr2, "other");
        int min = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(r1.a(Byte.valueOf(bArr[i10]), Byte.valueOf(bArr2[i10])));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Float> ka(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (float f10 : fArr) {
            if (z10) {
                arrayList.add(Float.valueOf(f10));
            } else if (!lVar.A(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
                z10 = true;
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C kb(Object[] objArr, C c10) {
        l0.p(objArr, "<this>");
        l0.p(c10, "destination");
        for (Object obj : objArr) {
            l0.y(3, "R");
            if (obj instanceof Object) {
                c10.add(obj);
            }
        }
        return c10;
    }

    public static final double kc(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (!(dArr.length == 0)) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterableTo")
    public static final <R, C extends Collection<? super R>> C kd(byte[] bArr, C c10, we.p<? super Integer, ? super Byte, ? extends Iterable<? extends R>> pVar) {
        l0.p(bArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super java.lang.Float, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R ke(@fh.g float[] r3, R r4, @fh.g we.q<? super java.lang.Integer, ? super java.lang.Float, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = Ue(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0021
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = r3[r0]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r4 = r5.y(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0021:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ke(float[], java.lang.Object, we.q):java.lang.Object");
    }

    @fh.h
    public static final Byte kf(@fh.g byte[] bArr, int i10) {
        l0.p(bArr, "<this>");
        if (i10 < 0 || i10 > Re(bArr)) {
            return null;
        }
        return Byte.valueOf(bArr[i10]);
    }

    public static final int kg(@fh.g short[] sArr, short s10) {
        l0.p(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <A extends Appendable> A kh(@fh.g long[] jArr, @fh.g A a10, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Long, ? extends CharSequence> lVar) {
        l0.p(jArr, "<this>");
        l0.p(a10, "buffer");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? (CharSequence) lVar.A(Long.valueOf(j10)) : String.valueOf(j10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    @zd.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    @zd.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @b1(expression = "indexOfLast { it == element }", imports = {}))
    public static final /* synthetic */ int ki(float[] fArr, float f10) {
        l0.p(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (f10 == fArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C kj(@fh.g boolean[] zArr, @fh.g C c10, @fh.g we.p<? super Integer, ? super Boolean, ? extends R> pVar) {
        l0.p(zArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            c10.add(pVar.g0(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R kk(int[] iArr, we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (!(iArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Integer.valueOf(iArr[0]));
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Integer.valueOf(iArr[o10.nextInt()]));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final <T extends Comparable<? super T>> T kl(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        while (o10.hasNext()) {
            T t11 = tArr[o10.nextInt()];
            if (t10.compareTo(t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @h1(version = "1.7")
    @ve.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> short km(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (!(sArr.length == 0)) {
            short s10 = sArr[0];
            int Ye = Ye(sArr);
            if (Ye == 0) {
                return s10;
            }
            Comparable comparable = (Comparable) lVar.A(Short.valueOf(s10));
            s0 o10 = new gf.m(1, Ye).iterator();
            while (o10.hasNext()) {
                short s11 = sArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Short.valueOf(s11));
                if (comparable.compareTo(comparable2) > 0) {
                    s10 = s11;
                    comparable = comparable2;
                }
            }
            return s10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float kn(long[] jArr, we.l<? super Long, Float> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Long.valueOf(jArr[0])).floatValue();
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(Long.valueOf(jArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "minWithOrThrow")
    public static final char ko(@fh.g char[] cArr, @fh.g Comparator<? super Character> comparator) {
        l0.p(cArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(cArr.length == 0)) {
            char c10 = cArr[0];
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                char c11 = cArr[o10.nextInt()];
                if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) > 0) {
                    c10 = c11;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final u0<List<Boolean>, List<Boolean>> kp(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z10 : zArr) {
            boolean booleanValue = lVar.A(Boolean.valueOf(z10)).booleanValue();
            Boolean valueOf = Boolean.valueOf(z10);
            if (booleanValue) {
                arrayList.add(valueOf);
            } else {
                arrayList2.add(valueOf);
            }
        }
        return new u0<>(arrayList, arrayList2);
    }

    public static final <S, T extends S> S kq(@fh.g T[] tArr, @fh.g we.q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        l0.p(tArr, "<this>");
        l0.p(qVar, "operation");
        if (!(tArr.length == 0)) {
            T t10 = tArr[0];
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            Object obj = t10;
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                obj = qVar.y(Integer.valueOf(nextInt), obj, tArr[nextInt]);
            }
            return obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Float kr(@fh.g float[] fArr, @fh.g we.p<? super Float, ? super Float, Float> pVar) {
        l0.p(fArr, "<this>");
        l0.p(pVar, "operation");
        int Ue = Ue(fArr);
        if (Ue < 0) {
            return null;
        }
        float f10 = fArr[Ue];
        for (int i10 = Ue - 1; i10 >= 0; i10--) {
            f10 = pVar.g0(Float.valueOf(fArr[i10]), Float.valueOf(f10)).floatValue();
        }
        return Float.valueOf(f10);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> ks(char[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            char r4 = r5[r1]
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ks(char[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.4")
    public static final void kt(@fh.g float[] fArr, @fh.g ef.f fVar) {
        l0.p(fArr, "<this>");
        l0.p(fVar, "random");
        for (int Ue = Ue(fArr); Ue > 0; Ue--) {
            int m10 = fVar.m(Ue + 1);
            float f10 = fArr[Ue];
            fArr[Ue] = fArr[m10];
            fArr[m10] = f10;
        }
    }

    @fh.g
    public static final List<Double> ku(@fh.g double[] dArr, @fh.g Iterable<Integer> iterable) {
        l0.p(dArr, "<this>");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(Double.valueOf(dArr[intValue.intValue()]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Float> kv(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        Float[] r52 = o.r5(fArr);
        o.v4((Comparable[]) r52);
        return o.t(r52);
    }

    @fh.g
    public static final List<Integer> kw(@fh.g int[] iArr, @fh.g Comparator<? super Integer> comparator) {
        l0.p(iArr, "<this>");
        l0.p(comparator, "comparator");
        Integer[] s52 = o.s5(iArr);
        o.I4(s52, comparator);
        return o.t(s52);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int kx(double[] dArr, we.l<? super Double, Integer> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (double valueOf : dArr) {
            i10 += lVar.A(Double.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @fh.g
    public static final List<Long> ky(@fh.g long[] jArr, int i10) {
        l0.p(jArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int length = jArr.length;
            if (i10 >= length) {
                return jz(jArr);
            }
            if (i10 == 1) {
                return v.k(Long.valueOf(jArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(Long.valueOf(jArr[i11]));
            }
            return arrayList;
        }
    }

    @fh.g
    public static final <T> List<T> kz(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? uz(tArr) : v.k(tArr[0]) : w.E();
    }

    @fh.g
    public static final <T> p000if.m<T> l6(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return tArr.length == 0 ? p000if.s.g() : new j(tArr);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M l7(@fh.g int[] iArr, @fh.g M m10, @fh.g we.l<? super Integer, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(iArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (int valueOf : iArr) {
            u0 u0Var = (u0) lVar.A(Integer.valueOf(valueOf));
            m10.put(u0Var.e(), u0Var.f());
        }
        return m10;
    }

    @oe.f
    public static final boolean l8(boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr[1];
    }

    public static final int l9(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (short valueOf : sArr) {
            if (lVar.A(Short.valueOf(valueOf)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @fh.g
    public static final <V> List<V> lA(@fh.g byte[] bArr, @fh.g byte[] bArr2, @fh.g we.p<? super Byte, ? super Byte, ? extends V> pVar) {
        l0.p(bArr, "<this>");
        l0.p(bArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Byte.valueOf(bArr[i10]), Byte.valueOf(bArr2[i10])));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Integer> la(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (int i10 : iArr) {
            if (z10) {
                arrayList.add(Integer.valueOf(i10));
            } else if (!lVar.A(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @fh.g
    public static final List<Byte> lb(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (!lVar.A(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    public static final double lc(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        for (double d10 : dArr) {
            if (lVar.A(Double.valueOf(d10)).booleanValue()) {
                return d10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterableTo")
    public static final <R, C extends Collection<? super R>> C ld(char[] cArr, C c10, we.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> pVar) {
        l0.p(cArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super java.lang.Integer, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R le(@fh.g int[] r3, R r4, @fh.g we.q<? super java.lang.Integer, ? super java.lang.Integer, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = Ve(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0021
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = r3[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r5.y(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0021:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.le(int[], java.lang.Object, we.q):java.lang.Object");
    }

    @fh.h
    public static final Character lf(@fh.g char[] cArr, int i10) {
        l0.p(cArr, "<this>");
        if (i10 < 0 || i10 > Se(cArr)) {
            return null;
        }
        return Character.valueOf(cArr[i10]);
    }

    public static final int lg(@fh.g boolean[] zArr, boolean z10) {
        l0.p(zArr, "<this>");
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10 == zArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <T, A extends Appendable> A lh(@fh.g T[] tArr, @fh.g A a10, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super T, ? extends CharSequence> lVar) {
        l0.p(tArr, "<this>");
        l0.p(a10, "buffer");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            lf.t.b(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final int li(@fh.g int[] iArr, int i10) {
        l0.p(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    @fh.g
    public static final <T, R> List<R> lj(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (T A : tArr) {
            Object A2 = lVar.A(A);
            if (A2 != null) {
                arrayList.add(A2);
            }
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R lk(long[] jArr, we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (!(jArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Long.valueOf(jArr[0]));
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Long.valueOf(jArr[o10.nextInt()]));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final Double ll(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            d10 = Math.max(d10, dArr[o10.nextInt()]);
        }
        return Double.valueOf(d10);
    }

    @h1(version = "1.7")
    @ve.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> boolean lm(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (!(zArr.length == 0)) {
            boolean z10 = zArr[0];
            int Ze = Ze(zArr);
            if (Ze == 0) {
                return z10;
            }
            Comparable comparable = (Comparable) lVar.A(Boolean.valueOf(z10));
            s0 o10 = new gf.m(1, Ze).iterator();
            while (o10.hasNext()) {
                boolean z11 = zArr[o10.nextInt()];
                Comparable comparable2 = (Comparable) lVar.A(Boolean.valueOf(z11));
                if (comparable.compareTo(comparable2) > 0) {
                    z10 = z11;
                    comparable = comparable2;
                }
            }
            return z10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> Float ln(T[] tArr, we.l<? super T, Float> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(tArr[0]).floatValue();
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(tArr[o10.nextInt()]).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "minWithOrThrow")
    public static final double lo(@fh.g double[] dArr, @fh.g Comparator<? super Double> comparator) {
        l0.p(dArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(dArr.length == 0)) {
            double d10 = dArr[0];
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                double d11 = dArr[o10.nextInt()];
                if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) > 0) {
                    d10 = d11;
                }
            }
            return d10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @oe.f
    public static final byte lp(byte[] bArr) {
        l0.p(bArr, "<this>");
        return mp(bArr, ef.f.O);
    }

    public static final short lq(@fh.g short[] sArr, @fh.g we.q<? super Integer, ? super Short, ? super Short, Short> qVar) {
        l0.p(sArr, "<this>");
        l0.p(qVar, "operation");
        if (!(sArr.length == 0)) {
            short s10 = sArr[0];
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                s10 = qVar.y(Integer.valueOf(nextInt), Short.valueOf(s10), Short.valueOf(sArr[nextInt])).shortValue();
            }
            return s10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Integer lr(@fh.g int[] iArr, @fh.g we.p<? super Integer, ? super Integer, Integer> pVar) {
        l0.p(iArr, "<this>");
        l0.p(pVar, "operation");
        int Ve = Ve(iArr);
        if (Ve < 0) {
            return null;
        }
        int i10 = iArr[Ve];
        for (int i11 = Ve - 1; i11 >= 0; i11--) {
            i10 = pVar.g0(Integer.valueOf(iArr[i11]), Integer.valueOf(i10)).intValue();
        }
        return Integer.valueOf(i10);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Double, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> ls(double[] r6, R r7, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Double, ? extends R> r8) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r8, r0)
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r6 = be.v.k(r7)
            return r6
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r6.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r7)
            int r2 = r6.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r6[r1]
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object r7 = r8.y(r3, r7, r4)
            r0.add(r7)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ls(double[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.4")
    public static final void lt(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        mt(iArr, ef.f.O);
    }

    @fh.g
    public static final List<Float> lu(@fh.g float[] fArr, @fh.g gf.m mVar) {
        l0.p(fArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : o.q(o.J1(fArr, mVar.c().intValue(), mVar.h().intValue() + 1));
    }

    @fh.g
    public static final List<Integer> lv(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        Integer[] s52 = o.s5(iArr);
        o.v4((Comparable[]) s52);
        return o.t(s52);
    }

    @fh.g
    public static final List<Long> lw(@fh.g long[] jArr, @fh.g Comparator<? super Long> comparator) {
        l0.p(jArr, "<this>");
        l0.p(comparator, "comparator");
        Long[] t52 = o.t5(jArr);
        o.I4(t52, comparator);
        return o.t(t52);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int lx(float[] fArr, we.l<? super Float, Integer> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (float valueOf : fArr) {
            i10 += lVar.A(Float.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @fh.g
    public static final <T> List<T> ly(@fh.g T[] tArr, int i10) {
        l0.p(tArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int length = tArr.length;
            if (i10 >= length) {
                return kz(tArr);
            }
            if (i10 == 1) {
                return v.k(tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(tArr[i11]);
            }
            return arrayList;
        }
    }

    @fh.g
    public static final List<Short> lz(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? vz(sArr) : v.k(Short.valueOf(sArr[0])) : w.E();
    }

    @fh.g
    public static final p000if.m<Short> m6(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr.length == 0 ? p000if.s.g() : new l(sArr);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M m7(@fh.g long[] jArr, @fh.g M m10, @fh.g we.l<? super Long, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(jArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (long valueOf : jArr) {
            u0 u0Var = (u0) lVar.A(Long.valueOf(valueOf));
            m10.put(u0Var.e(), u0Var.f());
        }
        return m10;
    }

    @oe.f
    public static final byte m8(byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr[2];
    }

    @oe.f
    public static final int m9(boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr.length;
    }

    @fh.g
    public static final <R> List<u0<Byte, R>> mA(@fh.g byte[] bArr, @fh.g R[] rArr) {
        l0.p(bArr, "<this>");
        l0.p(rArr, "other");
        int min = Math.min(bArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            byte b10 = bArr[i10];
            arrayList.add(r1.a(Byte.valueOf(b10), rArr[i10]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Long> ma(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (long j10 : jArr) {
            if (z10) {
                arrayList.add(Long.valueOf(j10));
            } else if (!lVar.A(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @fh.g
    public static final List<Character> mb(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (!lVar.A(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    public static final float mc(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (!(fArr.length == 0)) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterableTo")
    public static final <R, C extends Collection<? super R>> C md(double[] dArr, C c10, we.p<? super Integer, ? super Double, ? extends Iterable<? extends R>> pVar) {
        l0.p(dArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.q, we.q<? super java.lang.Integer, ? super java.lang.Long, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R me(@fh.g long[] r4, R r5, @fh.g we.q<? super java.lang.Integer, ? super java.lang.Long, ? super R, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = We(r4)
        L_0x000e:
            if (r0 < 0) goto L_0x0021
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = r4[r0]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r5 = r6.y(r1, r2, r5)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0021:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.me(long[], java.lang.Object, we.q):java.lang.Object");
    }

    @fh.h
    public static final Double mf(@fh.g double[] dArr, int i10) {
        l0.p(dArr, "<this>");
        if (i10 < 0 || i10 > Te(dArr)) {
            return null;
        }
        return Double.valueOf(dArr[i10]);
    }

    public static final int mg(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(Byte.valueOf(bArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <A extends Appendable> A mh(@fh.g short[] sArr, @fh.g A a10, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Short, ? extends CharSequence> lVar) {
        l0.p(sArr, "<this>");
        l0.p(a10, "buffer");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (short s10 : sArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? (CharSequence) lVar.A(Short.valueOf(s10)) : String.valueOf(s10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final int mi(@fh.g long[] jArr, long j10) {
        l0.p(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (j10 == jArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C mj(@fh.g T[] tArr, @fh.g C c10, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (T A : tArr) {
            Object A2 = lVar.A(A);
            if (A2 != null) {
                c10.add(A2);
            }
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R extends Comparable<? super R>> R mk(T[] tArr, we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (!(tArr.length == 0)) {
            R r10 = (Comparable) lVar.A(tArr[0]);
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(tArr[o10.nextInt()]);
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final Double ml(@fh.g Double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        s0 o10 = new gf.m(1, Xe(dArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, dArr[o10.nextInt()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double mm(byte[] bArr, we.l<? super Byte, Double> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (!(bArr.length == 0)) {
            double doubleValue = lVar.A(Byte.valueOf(bArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(Byte.valueOf(bArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float mn(short[] sArr, we.l<? super Short, Float> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Short.valueOf(sArr[0])).floatValue();
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(Short.valueOf(sArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "minWithOrThrow")
    public static final float mo(@fh.g float[] fArr, @fh.g Comparator<? super Float> comparator) {
        l0.p(fArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(fArr.length == 0)) {
            float f10 = fArr[0];
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                float f11 = fArr[o10.nextInt()];
                if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) > 0) {
                    f10 = f11;
                }
            }
            return f10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    public static final byte mp(@fh.g byte[] bArr, @fh.g ef.f fVar) {
        l0.p(bArr, "<this>");
        l0.p(fVar, "random");
        if (!(bArr.length == 0)) {
            return bArr[fVar.m(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final boolean mq(@fh.g boolean[] zArr, @fh.g we.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> qVar) {
        l0.p(zArr, "<this>");
        l0.p(qVar, "operation");
        if (!(zArr.length == 0)) {
            boolean z10 = zArr[0];
            s0 o10 = new gf.m(1, Ze(zArr)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                z10 = qVar.y(Integer.valueOf(nextInt), Boolean.valueOf(z10), Boolean.valueOf(zArr[nextInt])).booleanValue();
            }
            return z10;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Long mr(@fh.g long[] jArr, @fh.g we.p<? super Long, ? super Long, Long> pVar) {
        l0.p(jArr, "<this>");
        l0.p(pVar, "operation");
        int We = We(jArr);
        if (We < 0) {
            return null;
        }
        long j10 = jArr[We];
        for (int i10 = We - 1; i10 >= 0; i10--) {
            j10 = pVar.g0(Long.valueOf(jArr[i10]), Long.valueOf(j10)).longValue();
        }
        return Long.valueOf(j10);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Float, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> ms(float[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Float, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r5[r1]
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ms(float[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.4")
    public static final void mt(@fh.g int[] iArr, @fh.g ef.f fVar) {
        l0.p(iArr, "<this>");
        l0.p(fVar, "random");
        for (int Ve = Ve(iArr); Ve > 0; Ve--) {
            int m10 = fVar.m(Ve + 1);
            int i10 = iArr[Ve];
            iArr[Ve] = iArr[m10];
            iArr[m10] = i10;
        }
    }

    @fh.g
    public static final List<Float> mu(@fh.g float[] fArr, @fh.g Iterable<Integer> iterable) {
        l0.p(fArr, "<this>");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(Float.valueOf(fArr[intValue.intValue()]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Long> mv(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        Long[] t52 = o.t5(jArr);
        o.v4((Comparable[]) t52);
        return o.t(t52);
    }

    @fh.g
    public static final <T> List<T> mw(@fh.g T[] tArr, @fh.g Comparator<? super T> comparator) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        return o.t(Fv(tArr, comparator));
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int mx(int[] iArr, we.l<? super Integer, Integer> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (int valueOf : iArr) {
            i10 += lVar.A(Integer.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @fh.g
    public static final List<Short> my(@fh.g short[] sArr, int i10) {
        l0.p(sArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int length = sArr.length;
            if (i10 >= length) {
                return lz(sArr);
            }
            if (i10 == 1) {
                return v.k(Short.valueOf(sArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(Short.valueOf(sArr[i11]));
            }
            return arrayList;
        }
    }

    @fh.g
    public static final List<Boolean> mz(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? wz(zArr) : v.k(Boolean.valueOf(zArr[0])) : w.E();
    }

    @fh.g
    public static final p000if.m<Boolean> n6(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr.length == 0 ? p000if.s.g() : new q(zArr);
    }

    @fh.g
    public static final <T, K, V, M extends Map<? super K, ? super V>> M n7(@fh.g T[] tArr, @fh.g M m10, @fh.g we.l<? super T, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(tArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (T A : tArr) {
            u0 u0Var = (u0) lVar.A(A);
            m10.put(u0Var.e(), u0Var.f());
        }
        return m10;
    }

    @oe.f
    public static final char n8(char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr[2];
    }

    public static final int n9(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (boolean valueOf : zArr) {
            if (lVar.A(Boolean.valueOf(valueOf)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @fh.g
    public static final <R, V> List<V> nA(@fh.g byte[] bArr, @fh.g R[] rArr, @fh.g we.p<? super Byte, ? super R, ? extends V> pVar) {
        l0.p(bArr, "<this>");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(bArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Byte.valueOf(bArr[i10]), rArr[i10]));
        }
        return arrayList;
    }

    @fh.g
    public static final <T> List<T> na(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (T t10 : tArr) {
            if (z10) {
                arrayList.add(t10);
            } else if (!lVar.A(t10).booleanValue()) {
                arrayList.add(t10);
                z10 = true;
            }
        }
        return arrayList;
    }

    @fh.g
    public static final List<Double> nb(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (!lVar.A(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            }
        }
        return arrayList;
    }

    public static final float nc(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        for (float f10 : fArr) {
            if (lVar.A(Float.valueOf(f10)).booleanValue()) {
                return f10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterableTo")
    public static final <R, C extends Collection<? super R>> C nd(float[] fArr, C c10, we.p<? super Integer, ? super Float, ? extends Iterable<? extends R>> pVar) {
        l0.p(fArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super T, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R ne(@fh.g T[] r3, R r4, @fh.g we.q<? super java.lang.Integer, ? super T, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = Xe(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x001d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = r3[r0]
            java.lang.Object r4 = r5.y(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x001d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ne(java.lang.Object[], java.lang.Object, we.q):java.lang.Object");
    }

    @fh.h
    public static final Float nf(@fh.g float[] fArr, int i10) {
        l0.p(fArr, "<this>");
        if (i10 < 0 || i10 > Ue(fArr)) {
            return null;
        }
        return Float.valueOf(fArr[i10]);
    }

    public static final int ng(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(Character.valueOf(cArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <A extends Appendable> A nh(@fh.g boolean[] zArr, @fh.g A a10, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Boolean, ? extends CharSequence> lVar) {
        l0.p(zArr, "<this>");
        l0.p(a10, "buffer");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (boolean z10 : zArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a10.append(lVar != null ? (CharSequence) lVar.A(Boolean.valueOf(z10)) : String.valueOf(z10));
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> int ni(@fh.g T[] tArr, T t10) {
        l0.p(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (l0.g(t10, tArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C nj(@fh.g byte[] bArr, @fh.g C c10, @fh.g we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (byte valueOf : bArr) {
            c10.add(lVar.A(Byte.valueOf(valueOf)));
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R nk(short[] sArr, we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (!(sArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Short.valueOf(sArr[0]));
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Short.valueOf(sArr[o10.nextInt()]));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final Float nl(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            f10 = Math.max(f10, fArr[o10.nextInt()]);
        }
        return Float.valueOf(f10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double nm(char[] cArr, we.l<? super Character, Double> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (!(cArr.length == 0)) {
            double doubleValue = lVar.A(Character.valueOf(cArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(Character.valueOf(cArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float nn(boolean[] zArr, we.l<? super Boolean, Float> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = lVar.A(Boolean.valueOf(zArr[0])).floatValue();
        s0 o10 = new gf.m(1, Ze(zArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(Boolean.valueOf(zArr[o10.nextInt()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "minWithOrThrow")
    public static final int no(@fh.g int[] iArr, @fh.g Comparator<? super Integer> comparator) {
        l0.p(iArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(iArr.length == 0)) {
            int i10 = iArr[0];
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                int i11 = iArr[o10.nextInt()];
                if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i11)) > 0) {
                    i10 = i11;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @oe.f
    public static final char np(char[] cArr) {
        l0.p(cArr, "<this>");
        return op(cArr, ef.f.O);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Boolean nq(@fh.g boolean[] zArr, @fh.g we.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> qVar) {
        l0.p(zArr, "<this>");
        l0.p(qVar, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        s0 o10 = new gf.m(1, Ze(zArr)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            z10 = qVar.y(Integer.valueOf(nextInt), Boolean.valueOf(z10), Boolean.valueOf(zArr[nextInt])).booleanValue();
        }
        return Boolean.valueOf(z10);
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final <S, T extends S> S nr(@fh.g T[] tArr, @fh.g we.p<? super T, ? super S, ? extends S> pVar) {
        l0.p(tArr, "<this>");
        l0.p(pVar, "operation");
        int Xe = Xe(tArr);
        if (Xe < 0) {
            return null;
        }
        int i10 = Xe - 1;
        Object obj = tArr[Xe];
        while (i10 >= 0) {
            Object g02 = pVar.g0(tArr[i10], obj);
            i10--;
            obj = g02;
        }
        return obj;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Integer, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> ns(int[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Integer, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r5[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ns(int[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.4")
    public static final void nt(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        ot(jArr, ef.f.O);
    }

    @fh.g
    public static final List<Integer> nu(@fh.g int[] iArr, @fh.g gf.m mVar) {
        l0.p(iArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : o.r(o.K1(iArr, mVar.c().intValue(), mVar.h().intValue() + 1));
    }

    @fh.g
    public static final <T extends Comparable<? super T>> List<T> nv(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return o.t(vv(tArr));
    }

    @fh.g
    public static final List<Short> nw(@fh.g short[] sArr, @fh.g Comparator<? super Short> comparator) {
        l0.p(sArr, "<this>");
        l0.p(comparator, "comparator");
        Short[] u52 = o.u5(sArr);
        o.I4(u52, comparator);
        return o.t(u52);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int nx(long[] jArr, we.l<? super Long, Integer> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (long valueOf : jArr) {
            i10 += lVar.A(Long.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @fh.g
    public static final List<Boolean> ny(@fh.g boolean[] zArr, int i10) {
        l0.p(zArr, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return w.E();
        } else {
            int length = zArr.length;
            if (i10 >= length) {
                return mz(zArr);
            }
            if (i10 == 1) {
                return v.k(Boolean.valueOf(zArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(Boolean.valueOf(zArr[i11]));
            }
            return arrayList;
        }
    }

    @fh.g
    public static final long[] nz(@fh.g Long[] lArr) {
        l0.p(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = lArr[i10].longValue();
        }
        return jArr;
    }

    @fh.g
    public static final <K, V> Map<K, V> o6(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(bArr.length), 16));
        for (byte valueOf : bArr) {
            u0 u0Var = (u0) lVar.A(Byte.valueOf(valueOf));
            linkedHashMap.put(u0Var.e(), u0Var.f());
        }
        return linkedHashMap;
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M o7(@fh.g short[] sArr, @fh.g M m10, @fh.g we.l<? super Short, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(sArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (short valueOf : sArr) {
            u0 u0Var = (u0) lVar.A(Short.valueOf(valueOf));
            m10.put(u0Var.e(), u0Var.f());
        }
        return m10;
    }

    @oe.f
    public static final double o8(double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr[2];
    }

    @fh.g
    public static final List<Byte> o9(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        return e0.Q5(xz(bArr));
    }

    @fh.g
    public static final <R> List<u0<Character, R>> oA(@fh.g char[] cArr, @fh.g Iterable<? extends R> iterable) {
        l0.p(cArr, "<this>");
        l0.p(iterable, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(r1.a(Character.valueOf(cArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @fh.g
    public static final List<Short> oa(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (short s10 : sArr) {
            if (z10) {
                arrayList.add(Short.valueOf(s10));
            } else if (!lVar.A(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @fh.g
    public static final List<Float> ob(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (!lVar.A(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            }
        }
        return arrayList;
    }

    public static final int oc(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (!(iArr.length == 0)) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterableTo")
    public static final <R, C extends Collection<? super R>> C od(int[] iArr, C c10, we.p<? super Integer, ? super Integer, ? extends Iterable<? extends R>> pVar) {
        l0.p(iArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super java.lang.Short, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R oe(@fh.g short[] r3, R r4, @fh.g we.q<? super java.lang.Integer, ? super java.lang.Short, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = Ye(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0021
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            short r2 = r3[r0]
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            java.lang.Object r4 = r5.y(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0021:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.oe(short[], java.lang.Object, we.q):java.lang.Object");
    }

    @fh.h
    public static final Integer of(@fh.g int[] iArr, int i10) {
        l0.p(iArr, "<this>");
        if (i10 < 0 || i10 > Ve(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static final int og(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(Double.valueOf(dArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable oh(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return fh(bArr, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    public static final int oi(@fh.g short[] sArr, short s10) {
        l0.p(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (s10 == sArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C oj(@fh.g char[] cArr, @fh.g C c10, @fh.g we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (char valueOf : cArr) {
            c10.add(lVar.A(Character.valueOf(valueOf)));
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R ok(boolean[] zArr, we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (!(zArr.length == 0)) {
            R r10 = (Comparable) lVar.A(Boolean.valueOf(zArr[0]));
            s0 o10 = new gf.m(1, Ze(zArr)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Boolean.valueOf(zArr[o10.nextInt()]));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @fh.h
    public static final Float ol(@fh.g Float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        s0 o10 = new gf.m(1, Xe(fArr)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, fArr[o10.nextInt()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double om(double[] dArr, we.l<? super Double, Double> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (!(dArr.length == 0)) {
            double doubleValue = lVar.A(Double.valueOf(dArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(Double.valueOf(dArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R on(byte[] bArr, Comparator<? super R> comparator, we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(bArr.length == 0)) {
            R A = lVar.A(Byte.valueOf(bArr[0]));
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Byte.valueOf(bArr[o10.nextInt()]));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.7")
    @ve.h(name = "minWithOrThrow")
    public static final long oo(@fh.g long[] jArr, @fh.g Comparator<? super Long> comparator) {
        l0.p(jArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(jArr.length == 0)) {
            long j10 = jArr[0];
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                long j11 = jArr[o10.nextInt()];
                if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) > 0) {
                    j10 = j11;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    public static final char op(@fh.g char[] cArr, @fh.g ef.f fVar) {
        l0.p(cArr, "<this>");
        l0.p(fVar, "random");
        if (!(cArr.length == 0)) {
            return cArr[fVar.m(cArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Byte oq(@fh.g byte[] bArr, @fh.g we.q<? super Integer, ? super Byte, ? super Byte, Byte> qVar) {
        l0.p(bArr, "<this>");
        l0.p(qVar, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            b10 = qVar.y(Integer.valueOf(nextInt), Byte.valueOf(b10), Byte.valueOf(bArr[nextInt])).byteValue();
        }
        return Byte.valueOf(b10);
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Short or(@fh.g short[] sArr, @fh.g we.p<? super Short, ? super Short, Short> pVar) {
        l0.p(sArr, "<this>");
        l0.p(pVar, "operation");
        int Ye = Ye(sArr);
        if (Ye < 0) {
            return null;
        }
        short s10 = sArr[Ye];
        for (int i10 = Ye - 1; i10 >= 0; i10--) {
            s10 = pVar.g0(Short.valueOf(sArr[i10]), Short.valueOf(s10)).shortValue();
        }
        return Short.valueOf(s10);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Long, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> os(long[] r6, R r7, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Long, ? extends R> r8) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r8, r0)
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r6 = be.v.k(r7)
            return r6
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r6.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r7)
            int r2 = r6.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r6[r1]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r7 = r8.y(r3, r7, r4)
            r0.add(r7)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.os(long[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.4")
    public static final void ot(@fh.g long[] jArr, @fh.g ef.f fVar) {
        l0.p(jArr, "<this>");
        l0.p(fVar, "random");
        for (int We = We(jArr); We > 0; We--) {
            int m10 = fVar.m(We + 1);
            long j10 = jArr[We];
            jArr[We] = jArr[m10];
            jArr[m10] = j10;
        }
    }

    @fh.g
    public static final List<Integer> ou(@fh.g int[] iArr, @fh.g Iterable<Integer> iterable) {
        l0.p(iArr, "<this>");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(Integer.valueOf(iArr[intValue.intValue()]));
        }
        return arrayList;
    }

    @fh.g
    public static final List<Short> ov(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        Short[] u52 = o.u5(sArr);
        o.v4((Comparable[]) u52);
        return o.t(u52);
    }

    @fh.g
    public static final List<Boolean> ow(@fh.g boolean[] zArr, @fh.g Comparator<? super Boolean> comparator) {
        l0.p(zArr, "<this>");
        l0.p(comparator, "comparator");
        Boolean[] n52 = o.n5(zArr);
        o.I4(n52, comparator);
        return o.t(n52);
    }

    @ve.h(name = "sumOfInt")
    public static final int ox(@fh.g Integer[] numArr) {
        l0.p(numArr, "<this>");
        int i10 = 0;
        for (Integer intValue : numArr) {
            i10 += intValue.intValue();
        }
        return i10;
    }

    @fh.g
    public static final List<Byte> oy(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Re = Re(bArr); -1 < Re; Re--) {
            if (!lVar.A(Byte.valueOf(bArr[Re])).booleanValue()) {
                return G9(bArr, Re + 1);
            }
        }
        return ez(bArr);
    }

    @fh.g
    public static final List<Byte> oz(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte valueOf : bArr) {
            arrayList.add(Byte.valueOf(valueOf));
        }
        return arrayList;
    }

    @fh.g
    public static final <K, V> Map<K, V> p6(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(cArr.length), 16));
        for (char valueOf : cArr) {
            u0 u0Var = (u0) lVar.A(Character.valueOf(valueOf));
            linkedHashMap.put(u0Var.e(), u0Var.f());
        }
        return linkedHashMap;
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M p7(@fh.g boolean[] zArr, @fh.g M m10, @fh.g we.l<? super Boolean, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(zArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (boolean valueOf : zArr) {
            u0 u0Var = (u0) lVar.A(Boolean.valueOf(valueOf));
            m10.put(u0Var.e(), u0Var.f());
        }
        return m10;
    }

    @oe.f
    public static final float p8(float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr[2];
    }

    @fh.g
    public static final List<Character> p9(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        return e0.Q5(yz(cArr));
    }

    @fh.g
    public static final <R, V> List<V> pA(@fh.g char[] cArr, @fh.g Iterable<? extends R> iterable, @fh.g we.p<? super Character, ? super R, ? extends V> pVar) {
        l0.p(cArr, "<this>");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(pVar.g0(Character.valueOf(cArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @fh.g
    public static final List<Boolean> pa(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (z10) {
                arrayList.add(Boolean.valueOf(z11));
            } else if (!lVar.A(Boolean.valueOf(z11)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z11));
                z10 = true;
            }
        }
        return arrayList;
    }

    @fh.g
    public static final List<Integer> pb(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (!lVar.A(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    public static final int pc(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        for (int i10 : iArr) {
            if (lVar.A(Integer.valueOf(i10)).booleanValue()) {
                return i10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterableTo")
    public static final <R, C extends Collection<? super R>> C pd(long[] jArr, C c10, we.p<? super Integer, ? super Long, ? extends Iterable<? extends R>> pVar) {
        l0.p(jArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super java.lang.Boolean, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R pe(@fh.g boolean[] r3, R r4, @fh.g we.q<? super java.lang.Integer, ? super java.lang.Boolean, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = Ze(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0021
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r2 = r3[r0]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r4 = r5.y(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0021:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.pe(boolean[], java.lang.Object, we.q):java.lang.Object");
    }

    @fh.h
    public static final Long pf(@fh.g long[] jArr, int i10) {
        l0.p(jArr, "<this>");
        if (i10 < 0 || i10 > We(jArr)) {
            return null;
        }
        return Long.valueOf(jArr[i10]);
    }

    public static final int pg(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(Float.valueOf(fArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable ph(char[] cArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return gh(cArr, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    public static final int pi(@fh.g boolean[] zArr, boolean z10) {
        l0.p(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (z10 == zArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C pj(@fh.g double[] dArr, @fh.g C c10, @fh.g we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (double valueOf : dArr) {
            c10.add(lVar.A(Double.valueOf(valueOf)));
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R pk(byte[] bArr, we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Byte.valueOf(bArr[0]));
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Byte.valueOf(bArr[o10.nextInt()]));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Integer pl(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            int i11 = iArr[o10.nextInt()];
            if (i10 < i11) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double pm(float[] fArr, we.l<? super Float, Double> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (!(fArr.length == 0)) {
            double doubleValue = lVar.A(Float.valueOf(fArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(Float.valueOf(fArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R pn(char[] cArr, Comparator<? super R> comparator, we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(cArr.length == 0)) {
            R A = lVar.A(Character.valueOf(cArr[0]));
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Character.valueOf(cArr[o10.nextInt()]));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.7")
    @ve.h(name = "minWithOrThrow")
    public static final <T> T po(@fh.g T[] tArr, @fh.g Comparator<? super T> comparator) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(tArr.length == 0)) {
            T t10 = tArr[0];
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            while (o10.hasNext()) {
                T t11 = tArr[o10.nextInt()];
                if (comparator.compare(t10, t11) > 0) {
                    t10 = t11;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @oe.f
    public static final double pp(double[] dArr) {
        l0.p(dArr, "<this>");
        return qp(dArr, ef.f.O);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Character pq(@fh.g char[] cArr, @fh.g we.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(cArr, "<this>");
        l0.p(qVar, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            c10 = qVar.y(Integer.valueOf(nextInt), Character.valueOf(c10), Character.valueOf(cArr[nextInt])).charValue();
        }
        return Character.valueOf(c10);
    }

    @fh.g
    public static final <T> T[] pr(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        int length = tArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (tArr[i10] != null) {
                i10++;
            } else {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @fh.g
    @zd.h1(version = "1.4")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.util.List<R> ps(@fh.g T[] r5, R r6, @fh.g we.q<? super java.lang.Integer, ? super R, ? super T, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x0036
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r5[r1]
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ps(java.lang.Object[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.4")
    public static final <T> void pt(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        qt(tArr, ef.f.O);
    }

    @fh.g
    public static final List<Long> pu(@fh.g long[] jArr, @fh.g gf.m mVar) {
        l0.p(jArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : o.s(o.L1(jArr, mVar.c().intValue(), mVar.h().intValue() + 1));
    }

    @fh.g
    public static final byte[] pv(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.h4(copyOf);
        return copyOf;
    }

    @fh.g
    public static final Set<Byte> pw(@fh.g byte[] bArr, @fh.g Iterable<Byte> iterable) {
        l0.p(bArr, "<this>");
        l0.p(iterable, "other");
        Set<Byte> xz = xz(bArr);
        b0.F0(xz, iterable);
        return xz;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfInt")
    public static final <T> int px(T[] tArr, we.l<? super T, Integer> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (T A : tArr) {
            i10 += lVar.A(A).intValue();
        }
        return i10;
    }

    @fh.g
    public static final List<Character> py(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Se = Se(cArr); -1 < Se; Se--) {
            if (!lVar.A(Character.valueOf(cArr[Se])).booleanValue()) {
                return H9(cArr, Se + 1);
            }
        }
        return fz(cArr);
    }

    @fh.g
    public static final List<Character> pz(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char valueOf : cArr) {
            arrayList.add(Character.valueOf(valueOf));
        }
        return arrayList;
    }

    @fh.g
    public static final <K, V> Map<K, V> q6(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(dArr.length), 16));
        for (double valueOf : dArr) {
            u0 u0Var = (u0) lVar.A(Double.valueOf(valueOf));
            linkedHashMap.put(u0Var.e(), u0Var.f());
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V> Map<Byte, V> q7(byte[] bArr, we.l<? super Byte, ? extends V> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(bArr.length), 16));
        for (byte b10 : bArr) {
            linkedHashMap.put(Byte.valueOf(b10), lVar.A(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    @oe.f
    public static final int q8(int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr[2];
    }

    @fh.g
    public static final List<Double> q9(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        return e0.Q5(zz(dArr));
    }

    @fh.g
    public static final List<u0<Character, Character>> qA(@fh.g char[] cArr, @fh.g char[] cArr2) {
        l0.p(cArr, "<this>");
        l0.p(cArr2, "other");
        int min = Math.min(cArr.length, cArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(r1.a(Character.valueOf(cArr[i10]), Character.valueOf(cArr2[i10])));
        }
        return arrayList;
    }

    @oe.f
    public static final byte qa(byte[] bArr, int i10, we.l<? super Integer, Byte> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Re(bArr)) ? lVar.A(Integer.valueOf(i10)).byteValue() : bArr[i10];
    }

    @fh.g
    public static final List<Long> qb(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (!lVar.A(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    public static final long qc(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (!(jArr.length == 0)) {
            return jArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterableTo")
    public static final <T, R, C extends Collection<? super R>> C qd(T[] tArr, C c10, we.p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return c10;
    }

    public static final void qe(@fh.g byte[] bArr, @fh.g we.l<? super Byte, u2> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "action");
        for (byte valueOf : bArr) {
            lVar.A(Byte.valueOf(valueOf));
        }
    }

    @fh.h
    public static final <T> T qf(@fh.g T[] tArr, int i10) {
        l0.p(tArr, "<this>");
        if (i10 < 0 || i10 > Xe(tArr)) {
            return null;
        }
        return tArr[i10];
    }

    public static final int qg(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(Integer.valueOf(iArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable qh(double[] dArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return hh(dArr, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    @fh.h
    public static final Boolean qi(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C qj(@fh.g float[] fArr, @fh.g C c10, @fh.g we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (float valueOf : fArr) {
            c10.add(lVar.A(Float.valueOf(valueOf)));
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R qk(char[] cArr, we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Character.valueOf(cArr[0]));
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Character.valueOf(cArr[o10.nextInt()]));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Long ql(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            long j11 = jArr[o10.nextInt()];
            if (j10 < j11) {
                j10 = j11;
            }
        }
        return Long.valueOf(j10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double qm(int[] iArr, we.l<? super Integer, Double> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (!(iArr.length == 0)) {
            double doubleValue = lVar.A(Integer.valueOf(iArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(Integer.valueOf(iArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R qn(double[] dArr, Comparator<? super R> comparator, we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(dArr.length == 0)) {
            R A = lVar.A(Double.valueOf(dArr[0]));
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Double.valueOf(dArr[o10.nextInt()]));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.7")
    @ve.h(name = "minWithOrThrow")
    public static final short qo(@fh.g short[] sArr, @fh.g Comparator<? super Short> comparator) {
        l0.p(sArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(sArr.length == 0)) {
            short s10 = sArr[0];
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                short s11 = sArr[o10.nextInt()];
                if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) > 0) {
                    s10 = s11;
                }
            }
            return s10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    public static final double qp(@fh.g double[] dArr, @fh.g ef.f fVar) {
        l0.p(dArr, "<this>");
        l0.p(fVar, "random");
        if (!(dArr.length == 0)) {
            return dArr[fVar.m(dArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Double qq(@fh.g double[] dArr, @fh.g we.q<? super Integer, ? super Double, ? super Double, Double> qVar) {
        l0.p(dArr, "<this>");
        l0.p(qVar, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            d10 = qVar.y(Integer.valueOf(nextInt), Double.valueOf(d10), Double.valueOf(dArr[nextInt])).doubleValue();
        }
        return Double.valueOf(d10);
    }

    public static final void qr(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length >= 0) {
            int Re = Re(bArr);
            s0 o10 = new gf.m(0, length).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                byte b10 = bArr[nextInt];
                bArr[nextInt] = bArr[Re];
                bArr[Re] = b10;
                Re--;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Short, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> qs(short[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Short, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            short r4 = r5[r1]
            java.lang.Short r4 = java.lang.Short.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.qs(short[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.4")
    public static final <T> void qt(@fh.g T[] tArr, @fh.g ef.f fVar) {
        l0.p(tArr, "<this>");
        l0.p(fVar, "random");
        for (int Xe = Xe(tArr); Xe > 0; Xe--) {
            int m10 = fVar.m(Xe + 1);
            T t10 = tArr[Xe];
            tArr[Xe] = tArr[m10];
            tArr[m10] = t10;
        }
    }

    @fh.g
    public static final List<Long> qu(@fh.g long[] jArr, @fh.g Iterable<Integer> iterable) {
        l0.p(jArr, "<this>");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(Long.valueOf(jArr[intValue.intValue()]));
        }
        return arrayList;
    }

    @fh.g
    public static final char[] qv(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.j4(copyOf);
        return copyOf;
    }

    @fh.g
    public static final Set<Character> qw(@fh.g char[] cArr, @fh.g Iterable<Character> iterable) {
        l0.p(cArr, "<this>");
        l0.p(iterable, "other");
        Set<Character> yz = yz(cArr);
        b0.F0(yz, iterable);
        return yz;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int qx(short[] sArr, we.l<? super Short, Integer> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (short valueOf : sArr) {
            i10 += lVar.A(Short.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @fh.g
    public static final List<Double> qy(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Te = Te(dArr); -1 < Te; Te--) {
            if (!lVar.A(Double.valueOf(dArr[Te])).booleanValue()) {
                return I9(dArr, Te + 1);
            }
        }
        return gz(dArr);
    }

    @fh.g
    public static final List<Double> qz(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double valueOf : dArr) {
            arrayList.add(Double.valueOf(valueOf));
        }
        return arrayList;
    }

    @fh.g
    public static final <K, V> Map<K, V> r6(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(fArr.length), 16));
        for (float valueOf : fArr) {
            u0 u0Var = (u0) lVar.A(Float.valueOf(valueOf));
            linkedHashMap.put(u0Var.e(), u0Var.f());
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V> Map<Character, V> r7(char[] cArr, we.l<? super Character, ? extends V> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(gf.v.B(cArr.length, 128)), 16));
        for (char c10 : cArr) {
            linkedHashMap.put(Character.valueOf(c10), lVar.A(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    @oe.f
    public static final long r8(long[] jArr) {
        l0.p(jArr, "<this>");
        return jArr[2];
    }

    @fh.g
    public static final List<Float> r9(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        return e0.Q5(Az(fArr));
    }

    @fh.g
    public static final <V> List<V> rA(@fh.g char[] cArr, @fh.g char[] cArr2, @fh.g we.p<? super Character, ? super Character, ? extends V> pVar) {
        l0.p(cArr, "<this>");
        l0.p(cArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(cArr.length, cArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Character.valueOf(cArr[i10]), Character.valueOf(cArr2[i10])));
        }
        return arrayList;
    }

    @oe.f
    public static final char ra(char[] cArr, int i10, we.l<? super Integer, Character> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Se(cArr)) ? lVar.A(Integer.valueOf(i10)).charValue() : cArr[i10];
    }

    @fh.g
    public static final <T> List<T> rb(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (!lVar.A(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final long rc(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        for (long j10 : jArr) {
            if (lVar.A(Long.valueOf(j10)).booleanValue()) {
                return j10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterableTo")
    public static final <R, C extends Collection<? super R>> C rd(short[] sArr, C c10, we.p<? super Integer, ? super Short, ? extends Iterable<? extends R>> pVar) {
        l0.p(sArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    public static final void re(@fh.g char[] cArr, @fh.g we.l<? super Character, u2> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "action");
        for (char valueOf : cArr) {
            lVar.A(Character.valueOf(valueOf));
        }
    }

    @fh.h
    public static final Short rf(@fh.g short[] sArr, int i10) {
        l0.p(sArr, "<this>");
        if (i10 < 0 || i10 > Ye(sArr)) {
            return null;
        }
        return Short.valueOf(sArr[i10]);
    }

    public static final int rg(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(Long.valueOf(jArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable rh(float[] fArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return ih(fArr, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    @fh.h
    public static final Boolean ri(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            boolean z10 = zArr[length];
            if (lVar.A(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C rj(@fh.g int[] iArr, @fh.g C c10, @fh.g we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (int valueOf : iArr) {
            c10.add(lVar.A(Integer.valueOf(valueOf)));
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R rk(double[] dArr, we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Double.valueOf(dArr[0]));
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Double.valueOf(dArr[o10.nextInt()]));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Short rl(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            short s11 = sArr[o10.nextInt()];
            if (s10 < s11) {
                s10 = s11;
            }
        }
        return Short.valueOf(s10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double rm(long[] jArr, we.l<? super Long, Double> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (!(jArr.length == 0)) {
            double doubleValue = lVar.A(Long.valueOf(jArr[0])).doubleValue();
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(Long.valueOf(jArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R rn(float[] fArr, Comparator<? super R> comparator, we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(fArr.length == 0)) {
            R A = lVar.A(Float.valueOf(fArr[0]));
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Float.valueOf(fArr[o10.nextInt()]));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.7")
    @ve.h(name = "minWithOrThrow")
    public static final boolean ro(@fh.g boolean[] zArr, @fh.g Comparator<? super Boolean> comparator) {
        l0.p(zArr, "<this>");
        l0.p(comparator, "comparator");
        if (!(zArr.length == 0)) {
            boolean z10 = zArr[0];
            s0 o10 = new gf.m(1, Ze(zArr)).iterator();
            while (o10.hasNext()) {
                boolean z11 = zArr[o10.nextInt()];
                if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) > 0) {
                    z10 = z11;
                }
            }
            return z10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.3")
    @oe.f
    public static final float rp(float[] fArr) {
        l0.p(fArr, "<this>");
        return sp(fArr, ef.f.O);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Float rq(@fh.g float[] fArr, @fh.g we.q<? super Integer, ? super Float, ? super Float, Float> qVar) {
        l0.p(fArr, "<this>");
        l0.p(qVar, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            f10 = qVar.y(Integer.valueOf(nextInt), Float.valueOf(f10), Float.valueOf(fArr[nextInt])).floatValue();
        }
        return Float.valueOf(f10);
    }

    @h1(version = "1.4")
    public static final void rr(@fh.g byte[] bArr, int i10, int i11) {
        l0.p(bArr, "<this>");
        c.O.d(i10, i11, bArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 != i12) {
            int i13 = i11 - 1;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                bArr[i10] = bArr[i13];
                bArr[i13] = b10;
                i13--;
                i10++;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Boolean, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> rs(boolean[] r5, R r6, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Boolean, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x0019:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length
        L_0x0024:
            if (r1 >= r2) goto L_0x003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r4 = r5[r1]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x0024
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.rs(boolean[], java.lang.Object, we.q):java.util.List");
    }

    @h1(version = "1.4")
    public static final void rt(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        st(sArr, ef.f.O);
    }

    @fh.g
    public static final <T> List<T> ru(@fh.g T[] tArr, @fh.g gf.m mVar) {
        l0.p(tArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : o.t(o.M1(tArr, mVar.c().intValue(), mVar.h().intValue() + 1));
    }

    @fh.g
    public static final double[] rv(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.l4(copyOf);
        return copyOf;
    }

    @fh.g
    public static final Set<Double> rw(@fh.g double[] dArr, @fh.g Iterable<Double> iterable) {
        l0.p(dArr, "<this>");
        l0.p(iterable, "other");
        Set<Double> zz = zz(dArr);
        b0.F0(zz, iterable);
        return zz;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int rx(boolean[] zArr, we.l<? super Boolean, Integer> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (boolean valueOf : zArr) {
            i10 += lVar.A(Boolean.valueOf(valueOf)).intValue();
        }
        return i10;
    }

    @fh.g
    public static final List<Float> ry(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Ue = Ue(fArr); -1 < Ue; Ue--) {
            if (!lVar.A(Float.valueOf(fArr[Ue])).booleanValue()) {
                return J9(fArr, Ue + 1);
            }
        }
        return hz(fArr);
    }

    @fh.g
    public static final List<Float> rz(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    @fh.g
    public static final <K, V> Map<K, V> s6(@fh.g int[] iArr, @fh.g we.l<? super Integer, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(iArr.length), 16));
        for (int valueOf : iArr) {
            u0 u0Var = (u0) lVar.A(Integer.valueOf(valueOf));
            linkedHashMap.put(u0Var.e(), u0Var.f());
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V> Map<Double, V> s7(double[] dArr, we.l<? super Double, ? extends V> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(dArr.length), 16));
        for (double d10 : dArr) {
            linkedHashMap.put(Double.valueOf(d10), lVar.A(Double.valueOf(d10)));
        }
        return linkedHashMap;
    }

    @oe.f
    public static final <T> T s8(T[] tArr) {
        l0.p(tArr, "<this>");
        return tArr[2];
    }

    @fh.g
    public static final List<Integer> s9(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        return e0.Q5(Bz(iArr));
    }

    @fh.g
    public static final <R> List<u0<Character, R>> sA(@fh.g char[] cArr, @fh.g R[] rArr) {
        l0.p(cArr, "<this>");
        l0.p(rArr, "other");
        int min = Math.min(cArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            char c10 = cArr[i10];
            arrayList.add(r1.a(Character.valueOf(c10), rArr[i10]));
        }
        return arrayList;
    }

    @oe.f
    public static final double sa(double[] dArr, int i10, we.l<? super Integer, Double> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Te(dArr)) ? lVar.A(Integer.valueOf(i10)).doubleValue() : dArr[i10];
    }

    @fh.g
    public static final List<Short> sb(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (!lVar.A(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            }
        }
        return arrayList;
    }

    public static final <T> T sc(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterableTo")
    public static final <R, C extends Collection<? super R>> C sd(boolean[] zArr, C c10, we.p<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> pVar) {
        l0.p(zArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return c10;
    }

    public static final void se(@fh.g double[] dArr, @fh.g we.l<? super Double, u2> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "action");
        for (double valueOf : dArr) {
            lVar.A(Double.valueOf(valueOf));
        }
    }

    @fh.g
    public static final <K> Map<K, List<Byte>> sf(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends K> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b10 : bArr) {
            Object A = lVar.A(Byte.valueOf(b10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(Byte.valueOf(b10));
        }
        return linkedHashMap;
    }

    public static final <T> int sg(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(tArr[i10]).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable sh(int[] iArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return jh(iArr, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    @fh.h
    public static final Byte si(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C sj(@fh.g long[] jArr, @fh.g C c10, @fh.g we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (long valueOf : jArr) {
            c10.add(lVar.A(Long.valueOf(valueOf)));
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R sk(float[] fArr, we.l<? super Float, ? extends R> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Float.valueOf(fArr[0]));
        s0 o10 = new gf.m(1, Ue(fArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Float.valueOf(fArr[o10.nextInt()]));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final byte sl(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (!(bArr.length == 0)) {
            byte b10 = bArr[0];
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                byte b11 = bArr[o10.nextInt()];
                if (b10 < b11) {
                    b10 = b11;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T> double sm(T[] tArr, we.l<? super T, Double> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (!(tArr.length == 0)) {
            double doubleValue = lVar.A(tArr[0]).doubleValue();
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(tArr[o10.nextInt()]).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R sn(int[] iArr, Comparator<? super R> comparator, we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(iArr.length == 0)) {
            R A = lVar.A(Integer.valueOf(iArr[0]));
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Integer.valueOf(iArr[o10.nextInt()]));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    public static final boolean so(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr.length == 0;
    }

    @h1(version = "1.3")
    public static final float sp(@fh.g float[] fArr, @fh.g ef.f fVar) {
        l0.p(fArr, "<this>");
        l0.p(fVar, "random");
        if (!(fArr.length == 0)) {
            return fArr[fVar.m(fArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Integer sq(@fh.g int[] iArr, @fh.g we.q<? super Integer, ? super Integer, ? super Integer, Integer> qVar) {
        l0.p(iArr, "<this>");
        l0.p(qVar, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            i10 = qVar.y(Integer.valueOf(nextInt), Integer.valueOf(i10), Integer.valueOf(iArr[nextInt])).intValue();
        }
        return Integer.valueOf(i10);
    }

    public static final void sr(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length >= 0) {
            int Se = Se(cArr);
            s0 o10 = new gf.m(0, length).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                char c10 = cArr[nextInt];
                cArr[nextInt] = cArr[Se];
                cArr[Se] = c10;
                Se--;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Byte> ss(byte[] bArr, we.p<? super Byte, ? super Byte, Byte> pVar) {
        l0.p(bArr, "<this>");
        l0.p(pVar, "operation");
        if (bArr.length == 0) {
            return w.E();
        }
        byte b10 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b10));
        int length = bArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            b10 = pVar.g0(Byte.valueOf(b10), Byte.valueOf(bArr[i10])).byteValue();
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    public static final void st(@fh.g short[] sArr, @fh.g ef.f fVar) {
        l0.p(sArr, "<this>");
        l0.p(fVar, "random");
        for (int Ye = Ye(sArr); Ye > 0; Ye--) {
            int m10 = fVar.m(Ye + 1);
            short s10 = sArr[Ye];
            sArr[Ye] = sArr[m10];
            sArr[m10] = s10;
        }
    }

    @fh.g
    public static final <T> List<T> su(@fh.g T[] tArr, @fh.g Iterable<Integer> iterable) {
        l0.p(tArr, "<this>");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(tArr[intValue.intValue()]);
        }
        return arrayList;
    }

    @fh.g
    public static final float[] sv(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.n4(copyOf);
        return copyOf;
    }

    @fh.g
    public static final Set<Float> sw(@fh.g float[] fArr, @fh.g Iterable<Float> iterable) {
        l0.p(fArr, "<this>");
        l0.p(iterable, "other");
        Set<Float> Az = Az(fArr);
        b0.F0(Az, iterable);
        return Az;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long sx(byte[] bArr, we.l<? super Byte, Long> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        long j10 = 0;
        for (byte valueOf : bArr) {
            j10 += lVar.A(Byte.valueOf(valueOf)).longValue();
        }
        return j10;
    }

    @fh.g
    public static final List<Integer> sy(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Ve = Ve(iArr); -1 < Ve; Ve--) {
            if (!lVar.A(Integer.valueOf(iArr[Ve])).booleanValue()) {
                return K9(iArr, Ve + 1);
            }
        }
        return iz(iArr);
    }

    @fh.g
    public static final List<Integer> sz(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    @fh.g
    public static final <K, V> Map<K, V> t6(@fh.g long[] jArr, @fh.g we.l<? super Long, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(jArr.length), 16));
        for (long valueOf : jArr) {
            u0 u0Var = (u0) lVar.A(Long.valueOf(valueOf));
            linkedHashMap.put(u0Var.e(), u0Var.f());
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V> Map<Float, V> t7(float[] fArr, we.l<? super Float, ? extends V> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(fArr.length), 16));
        for (float f10 : fArr) {
            linkedHashMap.put(Float.valueOf(f10), lVar.A(Float.valueOf(f10)));
        }
        return linkedHashMap;
    }

    @oe.f
    public static final short t8(short[] sArr) {
        l0.p(sArr, "<this>");
        return sArr[2];
    }

    @fh.g
    public static final List<Long> t9(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        return e0.Q5(Cz(jArr));
    }

    @fh.g
    public static final <R, V> List<V> tA(@fh.g char[] cArr, @fh.g R[] rArr, @fh.g we.p<? super Character, ? super R, ? extends V> pVar) {
        l0.p(cArr, "<this>");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(cArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Character.valueOf(cArr[i10]), rArr[i10]));
        }
        return arrayList;
    }

    @oe.f
    public static final float ta(float[] fArr, int i10, we.l<? super Integer, Float> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Ue(fArr)) ? lVar.A(Integer.valueOf(i10)).floatValue() : fArr[i10];
    }

    @fh.g
    public static final List<Boolean> tb(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (!lVar.A(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    public static final <T> T tc(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        for (T t10 : tArr) {
            if (lVar.A(t10).booleanValue()) {
                return t10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedSequence")
    public static final <T, R> List<R> td(T[] tArr, we.p<? super Integer, ? super T, ? extends p000if.m<? extends R>> pVar) {
        l0.p(tArr, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.n0(arrayList, (p000if.m) pVar.g0(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final void te(@fh.g float[] fArr, @fh.g we.l<? super Float, u2> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "action");
        for (float valueOf : fArr) {
            lVar.A(Float.valueOf(valueOf));
        }
    }

    @fh.g
    public static final <K, V> Map<K, List<V>> tf(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends K> lVar, @fh.g we.l<? super Byte, ? extends V> lVar2) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b10 : bArr) {
            Object A = lVar.A(Byte.valueOf(b10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    public static final int tg(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(Short.valueOf(sArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable th(long[] jArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return kh(jArr, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    @fh.h
    public static final Byte ti(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            byte b10 = bArr[length];
            if (lVar.A(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @fh.g
    public static final <T, R, C extends Collection<? super R>> C tj(@fh.g T[] tArr, @fh.g C c10, @fh.g we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (T A : tArr) {
            c10.add(lVar.A(A));
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R tk(int[] iArr, we.l<? super Integer, ? extends R> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Integer.valueOf(iArr[0]));
        s0 o10 = new gf.m(1, Ve(iArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Integer.valueOf(iArr[o10.nextInt()]));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final char tl(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (!(cArr.length == 0)) {
            char c10 = cArr[0];
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                char c11 = cArr[o10.nextInt()];
                if (l0.t(c10, c11) < 0) {
                    c10 = c11;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double tm(short[] sArr, we.l<? super Short, Double> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (!(sArr.length == 0)) {
            double doubleValue = lVar.A(Short.valueOf(sArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(Short.valueOf(sArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R tn(long[] jArr, Comparator<? super R> comparator, we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(jArr.length == 0)) {
            R A = lVar.A(Long.valueOf(jArr[0]));
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Long.valueOf(jArr[o10.nextInt()]));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    public static final boolean to(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        for (byte valueOf : bArr) {
            if (lVar.A(Byte.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.3")
    @oe.f
    public static final int tp(int[] iArr) {
        l0.p(iArr, "<this>");
        return up(iArr, ef.f.O);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Long tq(@fh.g long[] jArr, @fh.g we.q<? super Integer, ? super Long, ? super Long, Long> qVar) {
        l0.p(jArr, "<this>");
        l0.p(qVar, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            j10 = qVar.y(Integer.valueOf(nextInt), Long.valueOf(j10), Long.valueOf(jArr[nextInt])).longValue();
        }
        return Long.valueOf(j10);
    }

    @h1(version = "1.4")
    public static final void tr(@fh.g char[] cArr, int i10, int i11) {
        l0.p(cArr, "<this>");
        c.O.d(i10, i11, cArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 != i12) {
            int i13 = i11 - 1;
            while (i10 < i12) {
                char c10 = cArr[i10];
                cArr[i10] = cArr[i13];
                cArr[i13] = c10;
                i13--;
                i10++;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Character> ts(char[] cArr, we.p<? super Character, ? super Character, Character> pVar) {
        l0.p(cArr, "<this>");
        l0.p(pVar, "operation");
        if (cArr.length == 0) {
            return w.E();
        }
        char c10 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c10));
        int length = cArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            c10 = pVar.g0(Character.valueOf(c10), Character.valueOf(cArr[i10])).charValue();
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    public static final void tt(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        ut(zArr, ef.f.O);
    }

    @fh.g
    public static final List<Short> tu(@fh.g short[] sArr, @fh.g gf.m mVar) {
        l0.p(sArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : o.u(o.N1(sArr, mVar.c().intValue(), mVar.h().intValue() + 1));
    }

    @fh.g
    public static final int[] tv(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.p4(copyOf);
        return copyOf;
    }

    @fh.g
    public static final Set<Integer> tw(@fh.g int[] iArr, @fh.g Iterable<Integer> iterable) {
        l0.p(iArr, "<this>");
        l0.p(iterable, "other");
        Set<Integer> Bz = Bz(iArr);
        b0.F0(Bz, iterable);
        return Bz;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long tx(char[] cArr, we.l<? super Character, Long> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        long j10 = 0;
        for (char valueOf : cArr) {
            j10 += lVar.A(Character.valueOf(valueOf)).longValue();
        }
        return j10;
    }

    @fh.g
    public static final List<Long> ty(@fh.g long[] jArr, @fh.g we.l<? super Long, Boolean> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "predicate");
        for (int We = We(jArr); -1 < We; We--) {
            if (!lVar.A(Long.valueOf(jArr[We])).booleanValue()) {
                return L9(jArr, We + 1);
            }
        }
        return jz(jArr);
    }

    @fh.g
    public static final List<Long> tz(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    @fh.g
    public static final <T, K, V> Map<K, V> u6(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(tArr.length), 16));
        for (T A : tArr) {
            u0 u0Var = (u0) lVar.A(A);
            linkedHashMap.put(u0Var.e(), u0Var.f());
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V> Map<Integer, V> u7(int[] iArr, we.l<? super Integer, ? extends V> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(iArr.length), 16));
        for (int i10 : iArr) {
            linkedHashMap.put(Integer.valueOf(i10), lVar.A(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    @oe.f
    public static final boolean u8(boolean[] zArr) {
        l0.p(zArr, "<this>");
        return zArr[2];
    }

    @fh.g
    public static final <T> List<T> u9(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return e0.Q5(Dz(tArr));
    }

    @fh.g
    public static final <R> List<u0<Double, R>> uA(@fh.g double[] dArr, @fh.g Iterable<? extends R> iterable) {
        l0.p(dArr, "<this>");
        l0.p(iterable, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(r1.a(Double.valueOf(dArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @oe.f
    public static final int ua(int[] iArr, int i10, we.l<? super Integer, Integer> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Ve(iArr)) ? lVar.A(Integer.valueOf(i10)).intValue() : iArr[i10];
    }

    @fh.g
    public static final <T> List<T> ub(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return (List) vb(tArr, new ArrayList());
    }

    public static final short uc(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (!(sArr.length == 0)) {
            return sArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedSequenceTo")
    public static final <T, R, C extends Collection<? super R>> C ud(T[] tArr, C c10, we.p<? super Integer, ? super T, ? extends p000if.m<? extends R>> pVar) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            b0.n0(c10, (p000if.m) pVar.g0(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return c10;
    }

    public static final void ue(@fh.g int[] iArr, @fh.g we.l<? super Integer, u2> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "action");
        for (int valueOf : iArr) {
            lVar.A(Integer.valueOf(valueOf));
        }
    }

    @fh.g
    public static final <K> Map<K, List<Character>> uf(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends K> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c10 : cArr) {
            Object A = lVar.A(Character.valueOf(c10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(Character.valueOf(c10));
        }
        return linkedHashMap;
    }

    public static final int ug(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(Boolean.valueOf(zArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable uh(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return lh(objArr, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    @fh.h
    public static final Character ui(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C uj(@fh.g short[] sArr, @fh.g C c10, @fh.g we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (short valueOf : sArr) {
            c10.add(lVar.A(Short.valueOf(valueOf)));
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R uk(long[] jArr, we.l<? super Long, ? extends R> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Long.valueOf(jArr[0]));
        s0 o10 = new gf.m(1, We(jArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Long.valueOf(jArr[o10.nextInt()]));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final double ul(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (!(dArr.length == 0)) {
            double d10 = dArr[0];
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                d10 = Math.max(d10, dArr[o10.nextInt()]);
            }
            return d10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double um(boolean[] zArr, we.l<? super Boolean, Double> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (!(zArr.length == 0)) {
            double doubleValue = lVar.A(Boolean.valueOf(zArr[0])).doubleValue();
            s0 o10 = new gf.m(1, Ze(zArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(Boolean.valueOf(zArr[o10.nextInt()])).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R> R un(T[] tArr, Comparator<? super R> comparator, we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(tArr.length == 0)) {
            R A = lVar.A(tArr[0]);
            s0 o10 = new gf.m(1, Xe(tArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(tArr[o10.nextInt()]);
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    public static final boolean uo(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr.length == 0;
    }

    @h1(version = "1.3")
    public static final int up(@fh.g int[] iArr, @fh.g ef.f fVar) {
        l0.p(iArr, "<this>");
        l0.p(fVar, "random");
        if (!(iArr.length == 0)) {
            return iArr[fVar.m(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final <S, T extends S> S uq(@fh.g T[] tArr, @fh.g we.q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        l0.p(tArr, "<this>");
        l0.p(qVar, "operation");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        Object obj = t10;
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            obj = qVar.y(Integer.valueOf(nextInt), obj, tArr[nextInt]);
        }
        return obj;
    }

    public static final void ur(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length >= 0) {
            int Te = Te(dArr);
            s0 o10 = new gf.m(0, length).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                double d10 = dArr[nextInt];
                dArr[nextInt] = dArr[Te];
                dArr[Te] = d10;
                Te--;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Double> us(double[] dArr, we.p<? super Double, ? super Double, Double> pVar) {
        l0.p(dArr, "<this>");
        l0.p(pVar, "operation");
        if (dArr.length == 0) {
            return w.E();
        }
        double d10 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d10));
        int length = dArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            d10 = pVar.g0(Double.valueOf(d10), Double.valueOf(dArr[i10])).doubleValue();
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    public static final void ut(@fh.g boolean[] zArr, @fh.g ef.f fVar) {
        l0.p(zArr, "<this>");
        l0.p(fVar, "random");
        for (int Ze = Ze(zArr); Ze > 0; Ze--) {
            int m10 = fVar.m(Ze + 1);
            boolean z10 = zArr[Ze];
            zArr[Ze] = zArr[m10];
            zArr[m10] = z10;
        }
    }

    @fh.g
    public static final List<Short> uu(@fh.g short[] sArr, @fh.g Iterable<Integer> iterable) {
        l0.p(sArr, "<this>");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(Short.valueOf(sArr[intValue.intValue()]));
        }
        return arrayList;
    }

    @fh.g
    public static final long[] uv(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.r4(copyOf);
        return copyOf;
    }

    @fh.g
    public static final Set<Long> uw(@fh.g long[] jArr, @fh.g Iterable<Long> iterable) {
        l0.p(jArr, "<this>");
        l0.p(iterable, "other");
        Set<Long> Cz = Cz(jArr);
        b0.F0(Cz, iterable);
        return Cz;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long ux(double[] dArr, we.l<? super Double, Long> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        long j10 = 0;
        for (double valueOf : dArr) {
            j10 += lVar.A(Double.valueOf(valueOf)).longValue();
        }
        return j10;
    }

    @fh.g
    public static final <T> List<T> uy(@fh.g T[] tArr, @fh.g we.l<? super T, Boolean> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Xe = Xe(tArr); -1 < Xe; Xe--) {
            if (!lVar.A(tArr[Xe]).booleanValue()) {
                return M9(tArr, Xe + 1);
            }
        }
        return kz(tArr);
    }

    @fh.g
    public static final <T> List<T> uz(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        return new ArrayList(w.s(tArr));
    }

    public static final boolean v5(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        for (byte valueOf : bArr) {
            if (!lVar.A(Byte.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fh.g
    public static final <K, V> Map<K, V> v6(@fh.g short[] sArr, @fh.g we.l<? super Short, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(sArr.length), 16));
        for (short valueOf : sArr) {
            u0 u0Var = (u0) lVar.A(Short.valueOf(valueOf));
            linkedHashMap.put(u0Var.e(), u0Var.f());
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V> Map<Long, V> v7(long[] jArr, we.l<? super Long, ? extends V> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(jArr.length), 16));
        for (long j10 : jArr) {
            linkedHashMap.put(Long.valueOf(j10), lVar.A(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    @oe.f
    public static final byte v8(byte[] bArr) {
        l0.p(bArr, "<this>");
        return bArr[3];
    }

    @fh.g
    public static final List<Short> v9(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        return e0.Q5(Ez(sArr));
    }

    @fh.g
    public static final <R, V> List<V> vA(@fh.g double[] dArr, @fh.g Iterable<? extends R> iterable, @fh.g we.p<? super Double, ? super R, ? extends V> pVar) {
        l0.p(dArr, "<this>");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(pVar.g0(Double.valueOf(dArr[i10]), next));
            i10++;
        }
        return arrayList;
    }

    @oe.f
    public static final long va(long[] jArr, int i10, we.l<? super Integer, Long> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > We(jArr)) ? lVar.A(Integer.valueOf(i10)).longValue() : jArr[i10];
    }

    @fh.g
    public static final <C extends Collection<? super T>, T> C vb(@fh.g T[] tArr, @fh.g C c10) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static final short vc(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        for (short s10 : sArr) {
            if (lVar.A(Short.valueOf(s10)).booleanValue()) {
                return s10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @h1(version = "1.4")
    @fh.g
    @t0
    @ve.h(name = "flatMapSequence")
    public static final <T, R> List<R> vd(@fh.g T[] tArr, @fh.g we.l<? super T, ? extends p000if.m<? extends R>> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (T A : tArr) {
            b0.n0(arrayList, (p000if.m) lVar.A(A));
        }
        return arrayList;
    }

    public static final void ve(@fh.g long[] jArr, @fh.g we.l<? super Long, u2> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "action");
        for (long valueOf : jArr) {
            lVar.A(Long.valueOf(valueOf));
        }
    }

    @fh.g
    public static final <K, V> Map<K, List<V>> vf(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends K> lVar, @fh.g we.l<? super Character, ? extends V> lVar2) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c10 : cArr) {
            Object A = lVar.A(Character.valueOf(c10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    public static final int vg(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (lVar.A(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable vh(short[] sArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return mh(sArr, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    @fh.h
    public static final Character vi(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char c10 = cArr[length];
            if (lVar.A(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C vj(@fh.g boolean[] zArr, @fh.g C c10, @fh.g we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (boolean valueOf : zArr) {
            c10.add(lVar.A(Boolean.valueOf(valueOf)));
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <T, R extends Comparable<? super R>> R vk(T[] tArr, we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(tArr[0]);
        s0 o10 = new gf.m(1, Xe(tArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(tArr[o10.nextInt()]);
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final double vl(@fh.g Double[] dArr) {
        l0.p(dArr, "<this>");
        if (!(dArr.length == 0)) {
            double doubleValue = dArr[0].doubleValue();
            s0 o10 = new gf.m(1, Xe(dArr)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, dArr[o10.nextInt()].doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float vm(byte[] bArr, we.l<? super Byte, Float> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (!(bArr.length == 0)) {
            float floatValue = lVar.A(Byte.valueOf(bArr[0])).floatValue();
            s0 o10 = new gf.m(1, Re(bArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(Byte.valueOf(bArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R vn(short[] sArr, Comparator<? super R> comparator, we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(sArr.length == 0)) {
            R A = lVar.A(Short.valueOf(sArr[0]));
            s0 o10 = new gf.m(1, Ye(sArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Short.valueOf(sArr[o10.nextInt()]));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    public static final boolean vo(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        for (char valueOf : cArr) {
            if (lVar.A(Character.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.3")
    @oe.f
    public static final long vp(long[] jArr) {
        l0.p(jArr, "<this>");
        return wp(jArr, ef.f.O);
    }

    @h1(version = "1.4")
    @fh.h
    public static final Short vq(@fh.g short[] sArr, @fh.g we.q<? super Integer, ? super Short, ? super Short, Short> qVar) {
        l0.p(sArr, "<this>");
        l0.p(qVar, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            s10 = qVar.y(Integer.valueOf(nextInt), Short.valueOf(s10), Short.valueOf(sArr[nextInt])).shortValue();
        }
        return Short.valueOf(s10);
    }

    @h1(version = "1.4")
    public static final void vr(@fh.g double[] dArr, int i10, int i11) {
        l0.p(dArr, "<this>");
        c.O.d(i10, i11, dArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 != i12) {
            int i13 = i11 - 1;
            while (i10 < i12) {
                double d10 = dArr[i10];
                dArr[i10] = dArr[i13];
                dArr[i13] = d10;
                i13--;
                i10++;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Float> vs(float[] fArr, we.p<? super Float, ? super Float, Float> pVar) {
        l0.p(fArr, "<this>");
        l0.p(pVar, "operation");
        if (fArr.length == 0) {
            return w.E();
        }
        float f10 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f10));
        int length = fArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            f10 = pVar.g0(Float.valueOf(f10), Float.valueOf(fArr[i10])).floatValue();
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static final byte vt(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return bArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    @fh.g
    public static final List<Boolean> vu(@fh.g boolean[] zArr, @fh.g gf.m mVar) {
        l0.p(zArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? w.E() : o.v(o.O1(zArr, mVar.c().intValue(), mVar.h().intValue() + 1));
    }

    @fh.g
    public static final <T extends Comparable<? super T>> T[] vv(@fh.g T[] tArr) {
        l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        T[] tArr2 = (Comparable[]) copyOf;
        o.v4(tArr2);
        return tArr2;
    }

    @fh.g
    public static final <T> Set<T> vw(@fh.g T[] tArr, @fh.g Iterable<? extends T> iterable) {
        l0.p(tArr, "<this>");
        l0.p(iterable, "other");
        Set<T> Dz = Dz(tArr);
        b0.F0(Dz, iterable);
        return Dz;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long vx(float[] fArr, we.l<? super Float, Long> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        long j10 = 0;
        for (float valueOf : fArr) {
            j10 += lVar.A(Float.valueOf(valueOf)).longValue();
        }
        return j10;
    }

    @fh.g
    public static final List<Short> vy(@fh.g short[] sArr, @fh.g we.l<? super Short, Boolean> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Ye = Ye(sArr); -1 < Ye; Ye--) {
            if (!lVar.A(Short.valueOf(sArr[Ye])).booleanValue()) {
                return N9(sArr, Ye + 1);
            }
        }
        return lz(sArr);
    }

    @fh.g
    public static final List<Short> vz(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short valueOf : sArr) {
            arrayList.add(Short.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final boolean w5(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        for (char valueOf : cArr) {
            if (!lVar.A(Character.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fh.g
    public static final <K, V> Map<K, V> w6(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(zArr.length), 16));
        for (boolean valueOf : zArr) {
            u0 u0Var = (u0) lVar.A(Boolean.valueOf(valueOf));
            linkedHashMap.put(u0Var.e(), u0Var.f());
        }
        return linkedHashMap;
    }

    @fh.g
    @h1(version = "1.4")
    public static final <K, V> Map<K, V> w7(@fh.g K[] kArr, @fh.g we.l<? super K, ? extends V> lVar) {
        l0.p(kArr, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(kArr.length), 16));
        for (K k10 : kArr) {
            linkedHashMap.put(k10, lVar.A(k10));
        }
        return linkedHashMap;
    }

    @oe.f
    public static final char w8(char[] cArr) {
        l0.p(cArr, "<this>");
        return cArr[3];
    }

    @fh.g
    public static final List<Boolean> w9(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        return e0.Q5(Fz(zArr));
    }

    @fh.g
    public static final List<u0<Double, Double>> wA(@fh.g double[] dArr, @fh.g double[] dArr2) {
        l0.p(dArr, "<this>");
        l0.p(dArr2, "other");
        int min = Math.min(dArr.length, dArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(r1.a(Double.valueOf(dArr[i10]), Double.valueOf(dArr2[i10])));
        }
        return arrayList;
    }

    @oe.f
    public static final <T> T wa(T[] tArr, int i10, we.l<? super Integer, ? extends T> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Xe(tArr)) ? lVar.A(Integer.valueOf(i10)) : tArr[i10];
    }

    @fh.g
    public static final <C extends Collection<? super Byte>> C wb(@fh.g byte[] bArr, @fh.g C c10, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (byte b10 : bArr) {
            if (!lVar.A(Byte.valueOf(b10)).booleanValue()) {
                c10.add(Byte.valueOf(b10));
            }
        }
        return c10;
    }

    public static final boolean wc(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        if (!(zArr.length == 0)) {
            return zArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @fh.g
    @t0
    @ve.h(name = "flatMapSequenceTo")
    public static final <T, R, C extends Collection<? super R>> C wd(@fh.g T[] tArr, @fh.g C c10, @fh.g we.l<? super T, ? extends p000if.m<? extends R>> lVar) {
        l0.p(tArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (T A : tArr) {
            b0.n0(c10, (p000if.m) lVar.A(A));
        }
        return c10;
    }

    public static final <T> void we(@fh.g T[] tArr, @fh.g we.l<? super T, u2> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "action");
        for (T A : tArr) {
            lVar.A(A);
        }
    }

    @fh.g
    public static final <K> Map<K, List<Double>> wf(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends K> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d10 : dArr) {
            Object A = lVar.A(Double.valueOf(d10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(Double.valueOf(d10));
        }
        return linkedHashMap;
    }

    public static final int wg(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (lVar.A(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static /* synthetic */ Appendable wh(boolean[] zArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, we.l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return nh(zArr, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    @fh.h
    public static final Double wi(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Boolean wj(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int Ze = Ze(zArr);
        if (Ze == 0) {
            return Boolean.valueOf(z10);
        }
        Comparable comparable = (Comparable) lVar.A(Boolean.valueOf(z10));
        s0 o10 = new gf.m(1, Ze).iterator();
        while (o10.hasNext()) {
            boolean z11 = zArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Boolean.valueOf(z11));
            if (comparable.compareTo(comparable2) < 0) {
                z10 = z11;
                comparable = comparable2;
            }
        }
        return Boolean.valueOf(z10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R wk(short[] sArr, we.l<? super Short, ? extends R> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Short.valueOf(sArr[0]));
        s0 o10 = new gf.m(1, Ye(sArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Short.valueOf(sArr[o10.nextInt()]));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final float wl(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (!(fArr.length == 0)) {
            float f10 = fArr[0];
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                f10 = Math.max(f10, fArr[o10.nextInt()]);
            }
            return f10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float wm(char[] cArr, we.l<? super Character, Float> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (!(cArr.length == 0)) {
            float floatValue = lVar.A(Character.valueOf(cArr[0])).floatValue();
            s0 o10 = new gf.m(1, Se(cArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(Character.valueOf(cArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R wn(boolean[] zArr, Comparator<? super R> comparator, we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(zArr.length == 0)) {
            R A = lVar.A(Boolean.valueOf(zArr[0]));
            s0 o10 = new gf.m(1, Ze(zArr)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Boolean.valueOf(zArr[o10.nextInt()]));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    public static final boolean wo(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr.length == 0;
    }

    @h1(version = "1.3")
    public static final long wp(@fh.g long[] jArr, @fh.g ef.f fVar) {
        l0.p(jArr, "<this>");
        l0.p(fVar, "random");
        if (!(jArr.length == 0)) {
            return jArr[fVar.m(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Boolean wq(@fh.g boolean[] zArr, @fh.g we.p<? super Boolean, ? super Boolean, Boolean> pVar) {
        l0.p(zArr, "<this>");
        l0.p(pVar, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        s0 o10 = new gf.m(1, Ze(zArr)).iterator();
        while (o10.hasNext()) {
            z10 = pVar.g0(Boolean.valueOf(z10), Boolean.valueOf(zArr[o10.nextInt()])).booleanValue();
        }
        return Boolean.valueOf(z10);
    }

    public static final void wr(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length >= 0) {
            int Ue = Ue(fArr);
            s0 o10 = new gf.m(0, length).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                float f10 = fArr[nextInt];
                fArr[nextInt] = fArr[Ue];
                fArr[Ue] = f10;
                Ue--;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Integer> ws(int[] iArr, we.p<? super Integer, ? super Integer, Integer> pVar) {
        l0.p(iArr, "<this>");
        l0.p(pVar, "operation");
        if (iArr.length == 0) {
            return w.E();
        }
        int i10 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i10));
        int length = iArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            i10 = pVar.g0(Integer.valueOf(i10), Integer.valueOf(iArr[i11])).intValue();
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static final byte wt(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        Byte b10 = null;
        boolean z10 = false;
        for (byte b11 : bArr) {
            if (lVar.A(Byte.valueOf(b11)).booleanValue()) {
                if (!z10) {
                    b10 = Byte.valueOf(b11);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            l0.n(b10, "null cannot be cast to non-null type kotlin.Byte");
            return b10.byteValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final List<Boolean> wu(@fh.g boolean[] zArr, @fh.g Iterable<Integer> iterable) {
        l0.p(zArr, "<this>");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(Boolean.valueOf(zArr[intValue.intValue()]));
        }
        return arrayList;
    }

    @fh.g
    public static final short[] wv(@fh.g short[] sArr) {
        l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.x4(copyOf);
        return copyOf;
    }

    @fh.g
    public static final Set<Short> ww(@fh.g short[] sArr, @fh.g Iterable<Short> iterable) {
        l0.p(sArr, "<this>");
        l0.p(iterable, "other");
        Set<Short> Ez = Ez(sArr);
        b0.F0(Ez, iterable);
        return Ez;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long wx(int[] iArr, we.l<? super Integer, Long> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        long j10 = 0;
        for (int valueOf : iArr) {
            j10 += lVar.A(Integer.valueOf(valueOf)).longValue();
        }
        return j10;
    }

    @fh.g
    public static final List<Boolean> wy(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        for (int Ze = Ze(zArr); -1 < Ze; Ze--) {
            if (!lVar.A(Boolean.valueOf(zArr[Ze])).booleanValue()) {
                return O9(zArr, Ze + 1);
            }
        }
        return mz(zArr);
    }

    @fh.g
    public static final List<Boolean> wz(@fh.g boolean[] zArr) {
        l0.p(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean valueOf : zArr) {
            arrayList.add(Boolean.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final boolean x5(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        for (double valueOf : dArr) {
            if (!lVar.A(Double.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fh.g
    public static final <K> Map<K, Byte> x6(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends K> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(bArr.length), 16));
        for (byte b10 : bArr) {
            linkedHashMap.put(lVar.A(Byte.valueOf(b10)), Byte.valueOf(b10));
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V> Map<Short, V> x7(short[] sArr, we.l<? super Short, ? extends V> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(sArr.length), 16));
        for (short s10 : sArr) {
            linkedHashMap.put(Short.valueOf(s10), lVar.A(Short.valueOf(s10)));
        }
        return linkedHashMap;
    }

    @oe.f
    public static final double x8(double[] dArr) {
        l0.p(dArr, "<this>");
        return dArr[3];
    }

    @fh.g
    public static final <K> List<Byte> x9(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends K> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (hashSet.add(lVar.A(Byte.valueOf(b10)))) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <V> List<V> xA(@fh.g double[] dArr, @fh.g double[] dArr2, @fh.g we.p<? super Double, ? super Double, ? extends V> pVar) {
        l0.p(dArr, "<this>");
        l0.p(dArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(dArr.length, dArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Double.valueOf(dArr[i10]), Double.valueOf(dArr2[i10])));
        }
        return arrayList;
    }

    @oe.f
    public static final short xa(short[] sArr, int i10, we.l<? super Integer, Short> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Ye(sArr)) ? lVar.A(Integer.valueOf(i10)).shortValue() : sArr[i10];
    }

    @fh.g
    public static final <C extends Collection<? super Character>> C xb(@fh.g char[] cArr, @fh.g C c10, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (char c11 : cArr) {
            if (!lVar.A(Character.valueOf(c11)).booleanValue()) {
                c10.add(Character.valueOf(c11));
            }
        }
        return c10;
    }

    public static final boolean xc(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "predicate");
        for (boolean z10 : zArr) {
            if (lVar.A(Boolean.valueOf(z10)).booleanValue()) {
                return z10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C xd(@fh.g byte[] bArr, @fh.g C c10, @fh.g we.l<? super Byte, ? extends Iterable<? extends R>> lVar) {
        l0.p(bArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (byte valueOf : bArr) {
            b0.o0(c10, (Iterable) lVar.A(Byte.valueOf(valueOf)));
        }
        return c10;
    }

    public static final void xe(@fh.g short[] sArr, @fh.g we.l<? super Short, u2> lVar) {
        l0.p(sArr, "<this>");
        l0.p(lVar, "action");
        for (short valueOf : sArr) {
            lVar.A(Short.valueOf(valueOf));
        }
    }

    @fh.g
    public static final <K, V> Map<K, List<V>> xf(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends K> lVar, @fh.g we.l<? super Double, ? extends V> lVar2) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d10 : dArr) {
            Object A = lVar.A(Double.valueOf(d10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Double.valueOf(d10)));
        }
        return linkedHashMap;
    }

    public static final int xg(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (lVar.A(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final String xh(@fh.g byte[] bArr, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Byte, ? extends CharSequence> lVar) {
        l0.p(bArr, "<this>");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        String sb2 = ((StringBuilder) fh(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l0.o(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @fh.h
    public static final Double xi(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            double d10 = dArr[length];
            if (lVar.A(Double.valueOf(d10)).booleanValue()) {
                return Double.valueOf(d10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Byte xj(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int Re = Re(bArr);
        if (Re == 0) {
            return Byte.valueOf(b10);
        }
        Comparable comparable = (Comparable) lVar.A(Byte.valueOf(b10));
        s0 o10 = new gf.m(1, Re).iterator();
        while (o10.hasNext()) {
            byte b11 = bArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Byte.valueOf(b11));
            if (comparable.compareTo(comparable2) < 0) {
                b10 = b11;
                comparable = comparable2;
            }
        }
        return Byte.valueOf(b10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R xk(boolean[] zArr, we.l<? super Boolean, ? extends R> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Boolean.valueOf(zArr[0]));
        s0 o10 = new gf.m(1, Ze(zArr)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Boolean.valueOf(zArr[o10.nextInt()]));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final float xl(@fh.g Float[] fArr) {
        l0.p(fArr, "<this>");
        if (!(fArr.length == 0)) {
            float floatValue = fArr[0].floatValue();
            s0 o10 = new gf.m(1, Xe(fArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, fArr[o10.nextInt()].floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float xm(double[] dArr, we.l<? super Double, Float> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (!(dArr.length == 0)) {
            float floatValue = lVar.A(Double.valueOf(dArr[0])).floatValue();
            s0 o10 = new gf.m(1, Te(dArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(Double.valueOf(dArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R xn(byte[] bArr, Comparator<? super R> comparator, we.l<? super Byte, ? extends R> lVar) {
        l0.p(bArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R A = lVar.A(Byte.valueOf(bArr[0]));
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Byte.valueOf(bArr[o10.nextInt()]));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    public static final boolean xo(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        for (double valueOf : dArr) {
            if (lVar.A(Double.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.3")
    @oe.f
    public static final <T> T xp(T[] tArr) {
        l0.p(tArr, "<this>");
        return yp(tArr, ef.f.O);
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Byte xq(@fh.g byte[] bArr, @fh.g we.p<? super Byte, ? super Byte, Byte> pVar) {
        l0.p(bArr, "<this>");
        l0.p(pVar, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            b10 = pVar.g0(Byte.valueOf(b10), Byte.valueOf(bArr[o10.nextInt()])).byteValue();
        }
        return Byte.valueOf(b10);
    }

    @h1(version = "1.4")
    public static final void xr(@fh.g float[] fArr, int i10, int i11) {
        l0.p(fArr, "<this>");
        c.O.d(i10, i11, fArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 != i12) {
            int i13 = i11 - 1;
            while (i10 < i12) {
                float f10 = fArr[i10];
                fArr[i10] = fArr[i13];
                fArr[i13] = f10;
                i13--;
                i10++;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Long> xs(long[] jArr, we.p<? super Long, ? super Long, Long> pVar) {
        l0.p(jArr, "<this>");
        l0.p(pVar, "operation");
        if (jArr.length == 0) {
            return w.E();
        }
        long j10 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j10));
        int length = jArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            j10 = pVar.g0(Long.valueOf(j10), Long.valueOf(jArr[i10])).longValue();
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static final char xt(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    @fh.g
    public static final byte[] xu(@fh.g byte[] bArr, @fh.g gf.m mVar) {
        l0.p(bArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? new byte[0] : o.G1(bArr, mVar.c().intValue(), mVar.h().intValue() + 1);
    }

    @fh.g
    public static final byte[] xv(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        Ru(copyOf);
        return copyOf;
    }

    @fh.g
    public static final Set<Boolean> xw(@fh.g boolean[] zArr, @fh.g Iterable<Boolean> iterable) {
        l0.p(zArr, "<this>");
        l0.p(iterable, "other");
        Set<Boolean> Fz = Fz(zArr);
        b0.F0(Fz, iterable);
        return Fz;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long xx(long[] jArr, we.l<? super Long, Long> lVar) {
        l0.p(jArr, "<this>");
        l0.p(lVar, "selector");
        long j10 = 0;
        for (long valueOf : jArr) {
            j10 += lVar.A(Long.valueOf(valueOf)).longValue();
        }
        return j10;
    }

    @fh.g
    public static final List<Byte> xy(@fh.g byte[] bArr, @fh.g we.l<? super Byte, Boolean> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (!lVar.A(Byte.valueOf(b10)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    @fh.g
    public static final Set<Byte> xz(@fh.g byte[] bArr) {
        l0.p(bArr, "<this>");
        return (Set) Jy(bArr, new LinkedHashSet(z0.j(bArr.length)));
    }

    public static final boolean y5(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        for (float valueOf : fArr) {
            if (!lVar.A(Float.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fh.g
    public static final <K, V> Map<K, V> y6(@fh.g byte[] bArr, @fh.g we.l<? super Byte, ? extends K> lVar, @fh.g we.l<? super Byte, ? extends V> lVar2) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(bArr.length), 16));
        for (byte b10 : bArr) {
            linkedHashMap.put(lVar.A(Byte.valueOf(b10)), lVar2.A(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V> Map<Boolean, V> y7(boolean[] zArr, we.l<? super Boolean, ? extends V> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(zArr.length), 16));
        for (boolean z10 : zArr) {
            linkedHashMap.put(Boolean.valueOf(z10), lVar.A(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    @oe.f
    public static final float y8(float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr[3];
    }

    @fh.g
    public static final <K> List<Character> y9(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends K> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (hashSet.add(lVar.A(Character.valueOf(c10)))) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <R> List<u0<Double, R>> yA(@fh.g double[] dArr, @fh.g R[] rArr) {
        l0.p(dArr, "<this>");
        l0.p(rArr, "other");
        int min = Math.min(dArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            double d10 = dArr[i10];
            arrayList.add(r1.a(Double.valueOf(d10), rArr[i10]));
        }
        return arrayList;
    }

    @oe.f
    public static final boolean ya(boolean[] zArr, int i10, we.l<? super Integer, Boolean> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > Ze(zArr)) ? lVar.A(Integer.valueOf(i10)).booleanValue() : zArr[i10];
    }

    @fh.g
    public static final <C extends Collection<? super Double>> C yb(@fh.g double[] dArr, @fh.g C c10, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (double d10 : dArr) {
            if (!lVar.A(Double.valueOf(d10)).booleanValue()) {
                c10.add(Double.valueOf(d10));
            }
        }
        return c10;
    }

    @h1(version = "1.5")
    @oe.f
    public static final <T, R> R yc(T[] tArr, we.l<? super T, ? extends R> lVar) {
        R r10;
        l0.p(tArr, "<this>");
        l0.p(lVar, "transform");
        int length = tArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                r10 = lVar.A(tArr[i10]);
                if (r10 != null) {
                    break;
                }
                i10++;
            } else {
                r10 = null;
                break;
            }
        }
        if (r10 != null) {
            return r10;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C yd(@fh.g char[] cArr, @fh.g C c10, @fh.g we.l<? super Character, ? extends Iterable<? extends R>> lVar) {
        l0.p(cArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (char valueOf : cArr) {
            b0.o0(c10, (Iterable) lVar.A(Character.valueOf(valueOf)));
        }
        return c10;
    }

    public static final void ye(@fh.g boolean[] zArr, @fh.g we.l<? super Boolean, u2> lVar) {
        l0.p(zArr, "<this>");
        l0.p(lVar, "action");
        for (boolean valueOf : zArr) {
            lVar.A(Boolean.valueOf(valueOf));
        }
    }

    @fh.g
    public static final <K> Map<K, List<Float>> yf(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends K> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f10 : fArr) {
            Object A = lVar.A(Float.valueOf(f10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(Float.valueOf(f10));
        }
        return linkedHashMap;
    }

    public static final int yg(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (lVar.A(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final String yh(@fh.g char[] cArr, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Character, ? extends CharSequence> lVar) {
        l0.p(cArr, "<this>");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        String sb2 = ((StringBuilder) gh(cArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l0.o(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @fh.h
    public static final Float yi(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Character yj(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int Se = Se(cArr);
        if (Se == 0) {
            return Character.valueOf(c10);
        }
        Comparable comparable = (Comparable) lVar.A(Character.valueOf(c10));
        s0 o10 = new gf.m(1, Se).iterator();
        while (o10.hasNext()) {
            char c11 = cArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Character.valueOf(c11));
            if (comparable.compareTo(comparable2) < 0) {
                c10 = c11;
                comparable = comparable2;
            }
        }
        return Character.valueOf(c10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double yk(byte[] bArr, we.l<? super Byte, Double> lVar) {
        l0.p(bArr, "<this>");
        l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Byte.valueOf(bArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Re(bArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(Byte.valueOf(bArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final int yl(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        if (!(iArr.length == 0)) {
            int i10 = iArr[0];
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                int i11 = iArr[o10.nextInt()];
                if (i10 < i11) {
                    i10 = i11;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float ym(float[] fArr, we.l<? super Float, Float> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "selector");
        if (!(fArr.length == 0)) {
            float floatValue = lVar.A(Float.valueOf(fArr[0])).floatValue();
            s0 o10 = new gf.m(1, Ue(fArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(Float.valueOf(fArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R yn(char[] cArr, Comparator<? super R> comparator, we.l<? super Character, ? extends R> lVar) {
        l0.p(cArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R A = lVar.A(Character.valueOf(cArr[0]));
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Character.valueOf(cArr[o10.nextInt()]));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    public static final boolean yo(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        return fArr.length == 0;
    }

    @h1(version = "1.3")
    public static final <T> T yp(@fh.g T[] tArr, @fh.g ef.f fVar) {
        l0.p(tArr, "<this>");
        l0.p(fVar, "random");
        if (!(tArr.length == 0)) {
            return tArr[fVar.m(tArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Character yq(@fh.g char[] cArr, @fh.g we.p<? super Character, ? super Character, Character> pVar) {
        l0.p(cArr, "<this>");
        l0.p(pVar, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            c10 = pVar.g0(Character.valueOf(c10), Character.valueOf(cArr[o10.nextInt()])).charValue();
        }
        return Character.valueOf(c10);
    }

    public static final void yr(@fh.g int[] iArr) {
        l0.p(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length >= 0) {
            int Ve = Ve(iArr);
            s0 o10 = new gf.m(0, length).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                int i10 = iArr[nextInt];
                iArr[nextInt] = iArr[Ve];
                iArr[Ve] = i10;
                Ve--;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super S, ? super T, ? extends S>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> java.util.List<S> ys(@fh.g T[] r5, @fh.g we.p<? super S, ? super T, ? extends S> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0019
            java.util.List r5 = be.w.E()
            return r5
        L_0x0019:
            r0 = r5[r1]
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r5.length
            r1.<init>(r3)
            r1.add(r0)
            int r3 = r5.length
        L_0x0025:
            if (r2 >= r3) goto L_0x0033
            r4 = r5[r2]
            java.lang.Object r0 = r6.g0(r0, r4)
            r1.add(r0)
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: be.p.ys(java.lang.Object[], we.p):java.util.List");
    }

    public static final char yt(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        Character ch2 = null;
        boolean z10 = false;
        for (char c10 : cArr) {
            if (lVar.A(Character.valueOf(c10)).booleanValue()) {
                if (!z10) {
                    ch2 = Character.valueOf(c10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            l0.n(ch2, "null cannot be cast to non-null type kotlin.Char");
            return ch2.charValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @fh.g
    public static final byte[] yu(@fh.g byte[] bArr, @fh.g Collection<Integer> collection) {
        l0.p(bArr, "<this>");
        l0.p(collection, "indices");
        byte[] bArr2 = new byte[collection.size()];
        int i10 = 0;
        for (Integer intValue : collection) {
            bArr2[i10] = bArr[intValue.intValue()];
            i10++;
        }
        return bArr2;
    }

    @fh.g
    public static final char[] yv(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        Tu(copyOf);
        return copyOf;
    }

    public static final double yw(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        double d10 = 0.0d;
        for (double d11 : dArr) {
            d10 += d11;
        }
        return d10;
    }

    @ve.h(name = "sumOfLong")
    public static final long yx(@fh.g Long[] lArr) {
        l0.p(lArr, "<this>");
        long j10 = 0;
        for (Long longValue : lArr) {
            j10 += longValue.longValue();
        }
        return j10;
    }

    @fh.g
    public static final List<Character> yy(@fh.g char[] cArr, @fh.g we.l<? super Character, Boolean> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (!lVar.A(Character.valueOf(c10)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    @fh.g
    public static final Set<Character> yz(@fh.g char[] cArr) {
        l0.p(cArr, "<this>");
        return (Set) Ky(cArr, new LinkedHashSet(z0.j(gf.v.B(cArr.length, 128))));
    }

    public static final boolean z5(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        for (int valueOf : iArr) {
            if (!lVar.A(Integer.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fh.g
    public static final <K> Map<K, Character> z6(@fh.g char[] cArr, @fh.g we.l<? super Character, ? extends K> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gf.v.u(z0.j(cArr.length), 16));
        for (char c10 : cArr) {
            linkedHashMap.put(lVar.A(Character.valueOf(c10)), Character.valueOf(c10));
        }
        return linkedHashMap;
    }

    @h1(version = "1.4")
    @oe.f
    public static final <V, M extends Map<? super Byte, ? super V>> M z7(byte[] bArr, M m10, we.l<? super Byte, ? extends V> lVar) {
        l0.p(bArr, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        for (byte b10 : bArr) {
            m10.put(Byte.valueOf(b10), lVar.A(Byte.valueOf(b10)));
        }
        return m10;
    }

    @oe.f
    public static final int z8(int[] iArr) {
        l0.p(iArr, "<this>");
        return iArr[3];
    }

    @fh.g
    public static final <K> List<Double> z9(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends K> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (hashSet.add(lVar.A(Double.valueOf(d10)))) {
                arrayList.add(Double.valueOf(d10));
            }
        }
        return arrayList;
    }

    @fh.g
    public static final <R, V> List<V> zA(@fh.g double[] dArr, @fh.g R[] rArr, @fh.g we.p<? super Double, ? super R, ? extends V> pVar) {
        l0.p(dArr, "<this>");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(dArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Double.valueOf(dArr[i10]), rArr[i10]));
        }
        return arrayList;
    }

    @oe.f
    public static final Boolean za(boolean[] zArr, int i10) {
        l0.p(zArr, "<this>");
        return jf(zArr, i10);
    }

    @fh.g
    public static final <C extends Collection<? super Float>> C zb(@fh.g float[] fArr, @fh.g C c10, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (float f10 : fArr) {
            if (!lVar.A(Float.valueOf(f10)).booleanValue()) {
                c10.add(Float.valueOf(f10));
            }
        }
        return c10;
    }

    @h1(version = "1.5")
    @oe.f
    public static final <T, R> R zc(T[] tArr, we.l<? super T, ? extends R> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "transform");
        for (T A : tArr) {
            R A2 = lVar.A(A);
            if (A2 != null) {
                return A2;
            }
        }
        return null;
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C zd(@fh.g double[] dArr, @fh.g C c10, @fh.g we.l<? super Double, ? extends Iterable<? extends R>> lVar) {
        l0.p(dArr, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (double valueOf : dArr) {
            b0.o0(c10, (Iterable) lVar.A(Double.valueOf(valueOf)));
        }
        return c10;
    }

    public static final void ze(@fh.g byte[] bArr, @fh.g we.p<? super Integer, ? super Byte, u2> pVar) {
        l0.p(bArr, "<this>");
        l0.p(pVar, "action");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            pVar.g0(Integer.valueOf(i11), Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
    }

    @fh.g
    public static final <K, V> Map<K, List<V>> zf(@fh.g float[] fArr, @fh.g we.l<? super Float, ? extends K> lVar, @fh.g we.l<? super Float, ? extends V> lVar2) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f10 : fArr) {
            Object A = lVar.A(Float.valueOf(f10));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Float.valueOf(f10)));
        }
        return linkedHashMap;
    }

    public static final int zg(@fh.g int[] iArr, @fh.g we.l<? super Integer, Boolean> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (lVar.A(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    @fh.g
    public static final String zh(@fh.g double[] dArr, @fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g CharSequence charSequence3, int i10, @fh.g CharSequence charSequence4, @fh.h we.l<? super Double, ? extends CharSequence> lVar) {
        l0.p(dArr, "<this>");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        String sb2 = ((StringBuilder) hh(dArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        l0.o(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @fh.h
    public static final Float zi(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            float f10 = fArr[length];
            if (lVar.A(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Double zj(@fh.g double[] dArr, @fh.g we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int Te = Te(dArr);
        if (Te == 0) {
            return Double.valueOf(d10);
        }
        Comparable comparable = (Comparable) lVar.A(Double.valueOf(d10));
        s0 o10 = new gf.m(1, Te).iterator();
        while (o10.hasNext()) {
            double d11 = dArr[o10.nextInt()];
            Comparable comparable2 = (Comparable) lVar.A(Double.valueOf(d11));
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
                d10 = d11;
            }
        }
        return Double.valueOf(d10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double zk(char[] cArr, we.l<? super Character, Double> lVar) {
        l0.p(cArr, "<this>");
        l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.A(Character.valueOf(cArr[0])).doubleValue();
        s0 o10 = new gf.m(1, Se(cArr)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(Character.valueOf(cArr[o10.nextInt()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final long zl(@fh.g long[] jArr) {
        l0.p(jArr, "<this>");
        if (!(jArr.length == 0)) {
            long j10 = jArr[0];
            s0 o10 = new gf.m(1, We(jArr)).iterator();
            while (o10.hasNext()) {
                long j11 = jArr[o10.nextInt()];
                if (j10 < j11) {
                    j10 = j11;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float zm(int[] iArr, we.l<? super Integer, Float> lVar) {
        l0.p(iArr, "<this>");
        l0.p(lVar, "selector");
        if (!(iArr.length == 0)) {
            float floatValue = lVar.A(Integer.valueOf(iArr[0])).floatValue();
            s0 o10 = new gf.m(1, Ve(iArr)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(Integer.valueOf(iArr[o10.nextInt()])).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R zn(double[] dArr, Comparator<? super R> comparator, we.l<? super Double, ? extends R> lVar) {
        l0.p(dArr, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R A = lVar.A(Double.valueOf(dArr[0]));
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Double.valueOf(dArr[o10.nextInt()]));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    public static final boolean zo(@fh.g float[] fArr, @fh.g we.l<? super Float, Boolean> lVar) {
        l0.p(fArr, "<this>");
        l0.p(lVar, "predicate");
        for (float valueOf : fArr) {
            if (lVar.A(Float.valueOf(valueOf)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @h1(version = "1.3")
    @oe.f
    public static final short zp(short[] sArr) {
        l0.p(sArr, "<this>");
        return Ap(sArr, ef.f.O);
    }

    @h1(version = "1.4")
    @y2(markerClass = {zd.r.class})
    @fh.h
    public static final Double zq(@fh.g double[] dArr, @fh.g we.p<? super Double, ? super Double, Double> pVar) {
        l0.p(dArr, "<this>");
        l0.p(pVar, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        s0 o10 = new gf.m(1, Te(dArr)).iterator();
        while (o10.hasNext()) {
            d10 = pVar.g0(Double.valueOf(d10), Double.valueOf(dArr[o10.nextInt()])).doubleValue();
        }
        return Double.valueOf(d10);
    }

    @h1(version = "1.4")
    public static final void zr(@fh.g int[] iArr, int i10, int i11) {
        l0.p(iArr, "<this>");
        c.O.d(i10, i11, iArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 != i12) {
            int i13 = i11 - 1;
            while (i10 < i12) {
                int i14 = iArr[i10];
                iArr[i10] = iArr[i13];
                iArr[i13] = i14;
                i13--;
                i10++;
            }
        }
    }

    @h1(version = "1.4")
    @oe.f
    public static final List<Short> zs(short[] sArr, we.p<? super Short, ? super Short, Short> pVar) {
        l0.p(sArr, "<this>");
        l0.p(pVar, "operation");
        if (sArr.length == 0) {
            return w.E();
        }
        short s10 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s10));
        int length = sArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            s10 = pVar.g0(Short.valueOf(s10), Short.valueOf(sArr[i10])).shortValue();
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static final double zt(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return dArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    @fh.g
    public static final char[] zu(@fh.g char[] cArr, @fh.g gf.m mVar) {
        l0.p(cArr, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? new char[0] : o.H1(cArr, mVar.c().intValue(), mVar.h().intValue() + 1);
    }

    @fh.g
    public static final double[] zv(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        Vu(copyOf);
        return copyOf;
    }

    public static final float zw(@fh.g float[] fArr) {
        l0.p(fArr, "<this>");
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        return f10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfLong")
    public static final <T> long zx(T[] tArr, we.l<? super T, Long> lVar) {
        l0.p(tArr, "<this>");
        l0.p(lVar, "selector");
        long j10 = 0;
        for (T A : tArr) {
            j10 += lVar.A(A).longValue();
        }
        return j10;
    }

    @fh.g
    public static final List<Double> zy(@fh.g double[] dArr, @fh.g we.l<? super Double, Boolean> lVar) {
        l0.p(dArr, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (!lVar.A(Double.valueOf(d10)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    @fh.g
    public static final Set<Double> zz(@fh.g double[] dArr) {
        l0.p(dArr, "<this>");
        return (Set) Ly(dArr, new LinkedHashSet(z0.j(dArr.length)));
    }
}
