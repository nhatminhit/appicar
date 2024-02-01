package lf;

import be.b0;
import be.k1;
import be.l1;
import be.o1;
import be.p0;
import be.q0;
import be.s0;
import be.w;
import be.x;
import be.z0;
import gf.v;
import java.util.ArrayList;
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
import p000if.m;
import p000if.s;
import p000if.u;
import we.l;
import we.p;
import we.q;
import xe.l0;
import xe.n0;
import zd.b1;
import zd.e2;
import zd.h1;
import zd.j2;
import zd.k;
import zd.r;
import zd.r1;
import zd.t;
import zd.t0;
import zd.u0;
import zd.u2;
import zd.y2;

public class e0 extends d0 {

    public static final class a implements Iterable<Character>, ye.a {
        public final /* synthetic */ CharSequence O;

        public a(CharSequence charSequence) {
            this.O = charSequence;
        }

        @fh.g
        public Iterator<Character> iterator() {
            return c0.C3(this.O);
        }
    }

    public static final class b implements m<Character> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CharSequence f20788a;

        public b(CharSequence charSequence) {
            this.f20788a = charSequence;
        }

        @fh.g
        public Iterator<Character> iterator() {
            return c0.C3(this.f20788a);
        }
    }

    public static final class c extends n0 implements l<CharSequence, String> {
        public static final c P = new c();

        public c() {
            super(1);
        }

        @fh.g
        /* renamed from: c */
        public final String A(@fh.g CharSequence charSequence) {
            l0.p(charSequence, "it");
            return charSequence.toString();
        }
    }

    public static final class d implements be.l0<Character, K> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CharSequence f20789a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<Character, K> f20790b;

        public d(CharSequence charSequence, l<? super Character, ? extends K> lVar) {
            this.f20789a = charSequence;
            this.f20790b = lVar;
        }

        public /* bridge */ /* synthetic */ Object a(Object obj) {
            return c(((Character) obj).charValue());
        }

        @fh.g
        public Iterator<Character> b() {
            return c0.C3(this.f20789a);
        }

        public K c(char c10) {
            return this.f20790b.A(Character.valueOf(c10));
        }
    }

    public static final class e extends n0 implements l<CharSequence, String> {
        public static final e P = new e();

        public e() {
            super(1);
        }

        @fh.g
        /* renamed from: c */
        public final String A(@fh.g CharSequence charSequence) {
            l0.p(charSequence, "it");
            return charSequence.toString();
        }
    }

    public static final class f extends n0 implements l<CharSequence, String> {
        public static final f P = new f();

        public f() {
            super(1);
        }

        @fh.g
        /* renamed from: c */
        public final String A(@fh.g CharSequence charSequence) {
            l0.p(charSequence, "it");
            return charSequence.toString();
        }
    }

    public static final class g extends n0 implements l<Integer, R> {
        public final /* synthetic */ int P;
        public final /* synthetic */ CharSequence Q;
        public final /* synthetic */ l<CharSequence, R> R;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(int i10, CharSequence charSequence, l<? super CharSequence, ? extends R> lVar) {
            super(1);
            this.P = i10;
            this.Q = charSequence;
            this.R = lVar;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            return c(((Number) obj).intValue());
        }

        public final R c(int i10) {
            int i11 = this.P + i10;
            if (i11 < 0 || i11 > this.Q.length()) {
                i11 = this.Q.length();
            }
            return this.R.A(this.Q.subSequence(i10, i11));
        }
    }

    public static final class h extends n0 implements we.a<Iterator<? extends Character>> {
        public final /* synthetic */ CharSequence P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(CharSequence charSequence) {
            super(0);
            this.P = charSequence;
        }

        @fh.g
        /* renamed from: c */
        public final Iterator<Character> n() {
            return c0.C3(this.P);
        }
    }

    @fh.g
    public static final CharSequence A6(@fh.g CharSequence charSequence, int i10) {
        l0.p(charSequence, "<this>");
        if (i10 >= 0) {
            return charSequence.subSequence(v.B(i10, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R> List<R> A7(@fh.g CharSequence charSequence, @fh.g p<? super Integer, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            int i12 = i11 + 1;
            Object g02 = pVar.g0(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            if (g02 != null) {
                arrayList.add(g02);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @fh.g
    public static final CharSequence A8(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        l0.o(reverse, "StringBuilder(this).reverse()");
        return reverse;
    }

    @fh.g
    public static final String B6(@fh.g String str, int i10) {
        l0.p(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(v.B(i10, str.length()));
            l0.o(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C B7(@fh.g CharSequence charSequence, @fh.g C c10, @fh.g p<? super Integer, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            int i12 = i11 + 1;
            Object g02 = pVar.g0(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            if (g02 != null) {
                c10.add(g02);
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    @oe.f
    public static final String B8(String str) {
        l0.p(str, "<this>");
        return A8(str).toString();
    }

    @fh.g
    public static final CharSequence C6(@fh.g CharSequence charSequence, int i10) {
        l0.p(charSequence, "<this>");
        if (i10 >= 0) {
            return X8(charSequence, v.u(charSequence.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C C7(@fh.g CharSequence charSequence, @fh.g C c10, @fh.g p<? super Integer, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            c10.add(pVar.g0(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Character, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @fh.g
    @zd.h1(version = "1.4")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> C8(@fh.g java.lang.CharSequence r4, R r5, @fh.g we.p<? super R, ? super java.lang.Character, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x001c
            java.util.List r4 = be.v.k(r5)
            return r4
        L_0x001c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length()
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
        L_0x0029:
            int r2 = r4.length()
            if (r1 >= r2) goto L_0x0041
            char r2 = r4.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r5 = r6.g0(r5, r2)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e0.C8(java.lang.CharSequence, java.lang.Object, we.p):java.util.List");
    }

    @fh.g
    public static final String D6(@fh.g String str, int i10) {
        l0.p(str, "<this>");
        if (i10 >= 0) {
            return Y8(str, v.u(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R> List<R> D7(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Object A = lVar.A(Character.valueOf(charSequence.charAt(i10)));
            if (A != null) {
                arrayList.add(A);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @fh.g
    @zd.h1(version = "1.4")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> D8(@fh.g java.lang.CharSequence r5, R r6, @fh.g we.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x001c
            java.util.List r5 = be.v.k(r6)
            return r5
        L_0x001c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length()
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length()
        L_0x002d:
            if (r1 >= r2) goto L_0x0045
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            char r4 = r5.charAt(r1)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e0.D8(java.lang.CharSequence, java.lang.Object, we.q):java.util.List");
    }

    @fh.g
    public static final CharSequence E6(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int j32 = c0.j3(charSequence); -1 < j32; j32--) {
            if (!lVar.A(Character.valueOf(charSequence.charAt(j32))).booleanValue()) {
                return charSequence.subSequence(0, j32 + 1);
            }
        }
        return "";
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C E7(@fh.g CharSequence charSequence, @fh.g C c10, @fh.g l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Object A = lVar.A(Character.valueOf(charSequence.charAt(i10)));
            if (A != null) {
                c10.add(A);
            }
        }
        return c10;
    }

    @fh.g
    @h1(version = "1.4")
    public static final List<Character> E8(@fh.g CharSequence charSequence, @fh.g p<? super Character, ? super Character, Character> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        if (charSequence.length() == 0) {
            return w.E();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i10 = 1; i10 < length; i10++) {
            charAt = pVar.g0(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i10))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    @fh.g
    public static final String F6(@fh.g String str, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        for (int j32 = c0.j3(str); -1 < j32; j32--) {
            if (!lVar.A(Character.valueOf(str.charAt(j32))).booleanValue()) {
                String substring = str.substring(0, j32 + 1);
                l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return "";
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C F7(@fh.g CharSequence charSequence, @fh.g C c10, @fh.g l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            c10.add(lVar.A(Character.valueOf(charSequence.charAt(i10))));
        }
        return c10;
    }

    @fh.g
    @h1(version = "1.4")
    public static final List<Character> F8(@fh.g CharSequence charSequence, @fh.g q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        if (charSequence.length() == 0) {
            return w.E();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i10 = 1; i10 < length; i10++) {
            charAt = qVar.y(Integer.valueOf(i10), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i10))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    @fh.g
    public static final CharSequence G6(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!lVar.A(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    @h1(version = "1.4")
    @fh.h
    public static final <R extends Comparable<? super R>> Character G7(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int j32 = c0.j3(charSequence);
        if (j32 == 0) {
            return Character.valueOf(charAt);
        }
        Comparable comparable = (Comparable) lVar.A(Character.valueOf(charAt));
        s0 o10 = new gf.m(1, j32).iterator();
        while (o10.hasNext()) {
            char charAt2 = charSequence.charAt(o10.nextInt());
            Comparable comparable2 = (Comparable) lVar.A(Character.valueOf(charAt2));
            if (comparable.compareTo(comparable2) < 0) {
                charAt = charAt2;
                comparable = comparable2;
            }
        }
        return Character.valueOf(charAt);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.p, we.p<? super R, ? super java.lang.Character, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> G8(@fh.g java.lang.CharSequence r4, R r5, @fh.g we.p<? super R, ? super java.lang.Character, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x001c
            java.util.List r4 = be.v.k(r5)
            goto L_0x0042
        L_0x001c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r4.length()
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r5)
        L_0x0029:
            int r2 = r4.length()
            if (r1 >= r2) goto L_0x0041
            char r2 = r4.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r5 = r6.g0(r5, r2)
            r0.add(r5)
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0041:
            r4 = r0
        L_0x0042:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e0.G8(java.lang.CharSequence, java.lang.Object, we.p):java.util.List");
    }

    @fh.g
    public static final String H6(@fh.g String str, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!lVar.A(Character.valueOf(str.charAt(i10))).booleanValue()) {
                String substring = str.substring(i10);
                l0.o(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return "";
    }

    @h1(version = "1.7")
    @ve.h(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char H7(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            int j32 = c0.j3(charSequence);
            if (j32 == 0) {
                return charAt;
            }
            Comparable comparable = (Comparable) lVar.A(Character.valueOf(charAt));
            s0 o10 = new gf.m(1, j32).iterator();
            while (o10.hasNext()) {
                char charAt2 = charSequence.charAt(o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(Character.valueOf(charAt2));
                if (comparable.compareTo(comparable2) < 0) {
                    charAt = charAt2;
                    comparable = comparable2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.4")
    @zd.y2(markerClass = {zd.r.class})
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.util.List<R> H8(@fh.g java.lang.CharSequence r5, R r6, @fh.g we.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R> r7) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r5, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r7, r0)
            int r0 = r5.length()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x001c
            java.util.List r5 = be.v.k(r6)
            goto L_0x0046
        L_0x001c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r5.length()
            int r3 = r3 + r2
            r0.<init>(r3)
            r0.add(r6)
            int r2 = r5.length()
        L_0x002d:
            if (r1 >= r2) goto L_0x0045
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            char r4 = r5.charAt(r1)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r6 = r7.y(r3, r6, r4)
            r0.add(r6)
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0045:
            r5 = r0
        L_0x0046:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e0.H8(java.lang.CharSequence, java.lang.Object, we.q):java.util.List");
    }

    @oe.f
    public static final char I6(CharSequence charSequence, int i10, l<? super Integer, Character> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > c0.j3(charSequence)) ? lVar.A(Integer.valueOf(i10)).charValue() : charSequence.charAt(i10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double I7(CharSequence charSequence, l<? super Character, Double> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (!(charSequence.length() == 0)) {
            double doubleValue = lVar.A(Character.valueOf(charSequence.charAt(0))).doubleValue();
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    public static final char I8(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (length == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }

    @oe.f
    public static final Character J6(CharSequence charSequence, int i10) {
        l0.p(charSequence, "<this>");
        return m7(charSequence, i10);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float J7(CharSequence charSequence, l<? super Character, Float> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (!(charSequence.length() == 0)) {
            float floatValue = lVar.A(Character.valueOf(charSequence.charAt(0))).floatValue();
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.max(floatValue, lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    public static final char J8(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        Character ch2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            if (lVar.A(Character.valueOf(charAt)).booleanValue()) {
                if (!z10) {
                    ch2 = Character.valueOf(charAt);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (z10) {
            l0.n(ch2, "null cannot be cast to non-null type kotlin.Char");
            return ch2.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @fh.g
    public static final CharSequence K6(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = charSequence.charAt(i10);
            if (lVar.A(Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            }
        }
        return sb2;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R K7(CharSequence charSequence, l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (!(charSequence.length() == 0)) {
            R r10 = (Comparable) lVar.A(Character.valueOf(charSequence.charAt(0)));
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt())));
                if (r10.compareTo(r11) < 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @fh.h
    public static final Character K8(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    @fh.g
    public static final String L6(@fh.g String str, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (lVar.A(Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        l0.o(sb3, "filterTo(StringBuilder(), predicate).toString()");
        return sb3;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R L7(CharSequence charSequence, l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Character.valueOf(charSequence.charAt(0)));
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt())));
            if (r10.compareTo(r11) < 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @fh.h
    public static final Character L8(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        boolean z10 = false;
        Character ch2 = null;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            if (lVar.A(Character.valueOf(charAt)).booleanValue()) {
                if (z10) {
                    return null;
                }
                ch2 = Character.valueOf(charAt);
                z10 = true;
            }
        }
        if (!z10) {
            return null;
        }
        return ch2;
    }

    @fh.g
    public static final CharSequence M6(@fh.g CharSequence charSequence, @fh.g p<? super Integer, ? super Character, Boolean> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char charAt = charSequence.charAt(i10);
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            }
            i10++;
            i11 = i12;
        }
        return sb2;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double M7(CharSequence charSequence, l<? super Character, Double> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = lVar.A(Character.valueOf(charSequence.charAt(0))).doubleValue();
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @fh.g
    public static final CharSequence M8(@fh.g CharSequence charSequence, @fh.g gf.m mVar) {
        l0.p(charSequence, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? "" : c0.h5(charSequence, mVar);
    }

    @fh.g
    public static final String N6(@fh.g String str, @fh.g p<? super Integer, ? super Character, Boolean> pVar) {
        l0.p(str, "<this>");
        l0.p(pVar, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            }
            i10++;
            i11 = i12;
        }
        String sb3 = sb2.toString();
        l0.o(sb3, "filterIndexedTo(StringBu…(), predicate).toString()");
        return sb3;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float N7(CharSequence charSequence, l<? super Character, Float> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = lVar.A(Character.valueOf(charSequence.charAt(0))).floatValue();
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.max(floatValue, lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @fh.g
    public static final CharSequence N8(@fh.g CharSequence charSequence, @fh.g Iterable<Integer> iterable) {
        l0.p(charSequence, "<this>");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(Y);
        for (Integer intValue : iterable) {
            sb2.append(charSequence.charAt(intValue.intValue()));
        }
        return sb2;
    }

    @fh.g
    public static final <C extends Appendable> C O6(@fh.g CharSequence charSequence, @fh.g C c10, @fh.g p<? super Integer, ? super Character, Boolean> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "predicate");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char charAt = charSequence.charAt(i10);
            int i12 = i11 + 1;
            if (pVar.g0(Integer.valueOf(i11), Character.valueOf(charAt)).booleanValue()) {
                c10.append(charAt);
            }
            i10++;
            i11 = i12;
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R O7(CharSequence charSequence, Comparator<? super R> comparator, l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(charSequence.length() == 0)) {
            R A = lVar.A(Character.valueOf(charSequence.charAt(0)));
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt())));
                if (comparator.compare(A, A2) < 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final String O8(@fh.g String str, @fh.g gf.m mVar) {
        l0.p(str, "<this>");
        l0.p(mVar, "indices");
        return mVar.isEmpty() ? "" : c0.l5(str, mVar);
    }

    @fh.g
    public static final CharSequence P6(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            if (!lVar.A(Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            }
        }
        return sb2;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R P7(CharSequence charSequence, Comparator<? super R> comparator, l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R A = lVar.A(Character.valueOf(charSequence.charAt(0)));
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt())));
            if (comparator.compare(A, A2) < 0) {
                A = A2;
            }
        }
        return A;
    }

    @oe.f
    public static final String P8(String str, Iterable<Integer> iterable) {
        l0.p(str, "<this>");
        l0.p(iterable, "indices");
        return N8(str, iterable).toString();
    }

    @fh.g
    public static final String Q6(@fh.g String str, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (!lVar.A(Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        l0.o(sb3, "filterNotTo(StringBuilder(), predicate).toString()");
        return sb3;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Character Q7(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            char charAt2 = charSequence.charAt(o10.nextInt());
            if (l0.t(charAt, charAt2) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @zd.l(warningSince = "1.5")
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final int Q8(@fh.g CharSequence charSequence, @fh.g l<? super Character, Integer> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            i10 += lVar.A(Character.valueOf(charSequence.charAt(i11))).intValue();
        }
        return i10;
    }

    @fh.g
    public static final <C extends Appendable> C R6(@fh.g CharSequence charSequence, @fh.g C c10, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            if (!lVar.A(Character.valueOf(charAt)).booleanValue()) {
                c10.append(charAt);
            }
        }
        return c10;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxOrThrow")
    public static final char R7(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                char charAt2 = charSequence.charAt(o10.nextInt());
                if (l0.t(charAt, charAt2) < 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @zd.l(warningSince = "1.5")
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    public static final double R8(@fh.g CharSequence charSequence, @fh.g l<? super Character, Double> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            d10 += lVar.A(Character.valueOf(charSequence.charAt(i10))).doubleValue();
        }
        return d10;
    }

    @fh.g
    public static final <C extends Appendable> C S6(@fh.g CharSequence charSequence, @fh.g C c10, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = charSequence.charAt(i10);
            if (lVar.A(Character.valueOf(charAt)).booleanValue()) {
                c10.append(charAt);
            }
        }
        return c10;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Character S7(@fh.g CharSequence charSequence, @fh.g Comparator<? super Character> comparator) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            char charAt2 = charSequence.charAt(o10.nextInt());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfDouble")
    public static final double S8(CharSequence charSequence, l<? super Character, Double> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        double d10 = 0.0d;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            d10 += lVar.A(Character.valueOf(charSequence.charAt(i10))).doubleValue();
        }
        return d10;
    }

    @oe.f
    public static final Character T6(CharSequence charSequence, l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            if (lVar.A(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @h1(version = "1.7")
    @ve.h(name = "maxWithOrThrow")
    public static final char T7(@fh.g CharSequence charSequence, @fh.g Comparator<? super Character> comparator) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                char charAt2 = charSequence.charAt(o10.nextInt());
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfInt")
    public static final int T8(CharSequence charSequence, l<? super Character, Integer> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            i10 += lVar.A(Character.valueOf(charSequence.charAt(i11))).intValue();
        }
        return i10;
    }

    @oe.f
    public static final Character U6(CharSequence charSequence, l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char charAt = charSequence.charAt(length);
                if (lVar.A(Character.valueOf(charAt)).booleanValue()) {
                    return Character.valueOf(charAt);
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
    @fh.h
    public static final <R extends Comparable<? super R>> Character U7(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int j32 = c0.j3(charSequence);
        if (j32 == 0) {
            return Character.valueOf(charAt);
        }
        Comparable comparable = (Comparable) lVar.A(Character.valueOf(charAt));
        s0 o10 = new gf.m(1, j32).iterator();
        while (o10.hasNext()) {
            char charAt2 = charSequence.charAt(o10.nextInt());
            Comparable comparable2 = (Comparable) lVar.A(Character.valueOf(charAt2));
            if (comparable.compareTo(comparable2) > 0) {
                charAt = charAt2;
                comparable = comparable2;
            }
        }
        return Character.valueOf(charAt);
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "sumOfLong")
    public static final long U8(CharSequence charSequence, l<? super Character, Long> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        long j10 = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            j10 += lVar.A(Character.valueOf(charSequence.charAt(i10))).longValue();
        }
        return j10;
    }

    public static final char V6(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @h1(version = "1.7")
    @ve.h(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char V7(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            int j32 = c0.j3(charSequence);
            if (j32 == 0) {
                return charAt;
            }
            Comparable comparable = (Comparable) lVar.A(Character.valueOf(charAt));
            s0 o10 = new gf.m(1, j32).iterator();
            while (o10.hasNext()) {
                char charAt2 = charSequence.charAt(o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(Character.valueOf(charAt2));
                if (comparable.compareTo(comparable2) > 0) {
                    charAt = charAt2;
                    comparable = comparable2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfUInt")
    public static final int V8(CharSequence charSequence, l<? super Character, e2> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        int l10 = e2.l(0);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            l10 = e2.l(l10 + lVar.A(Character.valueOf(charSequence.charAt(i10))).l0());
        }
        return l10;
    }

    public static final char W6(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            if (lVar.A(Character.valueOf(charAt)).booleanValue()) {
                return charAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final double W7(CharSequence charSequence, l<? super Character, Double> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (!(charSequence.length() == 0)) {
            double doubleValue = lVar.A(Character.valueOf(charSequence.charAt(0))).doubleValue();
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt()))).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @oe.f
    @t0
    @ve.h(name = "sumOfULong")
    public static final long W8(CharSequence charSequence, l<? super Character, j2> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        long l10 = j2.l(0);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            l10 = j2.l(l10 + lVar.A(Character.valueOf(charSequence.charAt(i10))).l0());
        }
        return l10;
    }

    @h1(version = "1.5")
    @oe.f
    public static final <R> R X6(CharSequence charSequence, l<? super Character, ? extends R> lVar) {
        R r10;
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        int i10 = 0;
        while (true) {
            if (i10 >= charSequence.length()) {
                r10 = null;
                break;
            }
            r10 = lVar.A(Character.valueOf(charSequence.charAt(i10)));
            if (r10 != null) {
                break;
            }
            i10++;
        }
        if (r10 != null) {
            return r10;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final float X7(CharSequence charSequence, l<? super Character, Float> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (!(charSequence.length() == 0)) {
            float floatValue = lVar.A(Character.valueOf(charSequence.charAt(0))).floatValue();
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                floatValue = Math.min(floatValue, lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt()))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final CharSequence X8(@fh.g CharSequence charSequence, int i10) {
        l0.p(charSequence, "<this>");
        if (i10 >= 0) {
            return charSequence.subSequence(0, v.B(i10, charSequence.length()));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @h1(version = "1.5")
    @oe.f
    public static final <R> R Y6(CharSequence charSequence, l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            R A = lVar.A(Character.valueOf(charSequence.charAt(i10)));
            if (A != null) {
                return A;
            }
        }
        return null;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Y7(CharSequence charSequence, l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (!(charSequence.length() == 0)) {
            R r10 = (Comparable) lVar.A(Character.valueOf(charSequence.charAt(0)));
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                R r11 = (Comparable) lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt())));
                if (r10.compareTo(r11) > 0) {
                    r10 = r11;
                }
            }
            return r10;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final String Y8(@fh.g String str, int i10) {
        l0.p(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(0, v.B(i10, str.length()));
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @fh.h
    public static final Character Z6(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R extends Comparable<? super R>> R Z7(CharSequence charSequence, l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R r10 = (Comparable) lVar.A(Character.valueOf(charSequence.charAt(0)));
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            R r11 = (Comparable) lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt())));
            if (r10.compareTo(r11) > 0) {
                r10 = r11;
            }
        }
        return r10;
    }

    @fh.g
    public static final CharSequence Z8(@fh.g CharSequence charSequence, int i10) {
        l0.p(charSequence, "<this>");
        if (i10 >= 0) {
            int length = charSequence.length();
            return charSequence.subSequence(length - v.B(i10, length), length);
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @fh.h
    public static final Character a7(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            if (lVar.A(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Double a8(CharSequence charSequence, l<? super Character, Double> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = lVar.A(Character.valueOf(charSequence.charAt(0))).doubleValue();
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @fh.g
    public static final String a9(@fh.g String str, int i10) {
        l0.p(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String substring = str.substring(length - v.B(i10, length));
            l0.o(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @fh.g
    public static final <R> List<R> b7(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends Iterable<? extends R>> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            b0.o0(arrayList, (Iterable) lVar.A(Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final Float b8(CharSequence charSequence, l<? super Character, Float> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = lVar.A(Character.valueOf(charSequence.charAt(0))).floatValue();
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            floatValue = Math.min(floatValue, lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @fh.g
    public static final CharSequence b9(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int j32 = c0.j3(charSequence); -1 < j32; j32--) {
            if (!lVar.A(Character.valueOf(charSequence.charAt(j32))).booleanValue()) {
                return charSequence.subSequence(j32 + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterable")
    public static final <R> List<R> c7(CharSequence charSequence, p<? super Integer, ? super Character, ? extends Iterable<? extends R>> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            b0.o0(arrayList, (Iterable) pVar.g0(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R c8(CharSequence charSequence, Comparator<? super R> comparator, l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (!(charSequence.length() == 0)) {
            R A = lVar.A(Character.valueOf(charSequence.charAt(0)));
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                R A2 = lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt())));
                if (comparator.compare(A, A2) > 0) {
                    A = A2;
                }
            }
            return A;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final String c9(@fh.g String str, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        for (int j32 = c0.j3(str); -1 < j32; j32--) {
            if (!lVar.A(Character.valueOf(str.charAt(j32))).booleanValue()) {
                String substring = str.substring(j32 + 1);
                l0.o(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return str;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    @ve.h(name = "flatMapIndexedIterableTo")
    public static final <R, C extends Collection<? super R>> C d7(CharSequence charSequence, C c10, p<? super Integer, ? super Character, ? extends Iterable<? extends R>> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(c10, "destination");
        l0.p(pVar, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            b0.o0(c10, (Iterable) pVar.g0(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return c10;
    }

    @h1(version = "1.4")
    @oe.f
    @t0
    public static final <R> R d8(CharSequence charSequence, Comparator<? super R> comparator, l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R A = lVar.A(Character.valueOf(charSequence.charAt(0)));
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            R A2 = lVar.A(Character.valueOf(charSequence.charAt(o10.nextInt())));
            if (comparator.compare(A, A2) > 0) {
                A = A2;
            }
        }
        return A;
    }

    @fh.g
    public static final CharSequence d9(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!lVar.A(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return charSequence.subSequence(0, i10);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @fh.g
    public static final <R, C extends Collection<? super R>> C e7(@fh.g CharSequence charSequence, @fh.g C c10, @fh.g l<? super Character, ? extends Iterable<? extends R>> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(c10, "destination");
        l0.p(lVar, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            b0.o0(c10, (Iterable) lVar.A(Character.valueOf(charSequence.charAt(i10))));
        }
        return c10;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Character e8(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            char charAt2 = charSequence.charAt(o10.nextInt());
            if (l0.t(charAt, charAt2) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @fh.g
    public static final String e9(@fh.g String str, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!lVar.A(Character.valueOf(str.charAt(i10))).booleanValue()) {
                String substring = str.substring(0, i10);
                l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return str;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super R, ? super java.lang.Character, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R f7(@fh.g java.lang.CharSequence r2, R r3, @fh.g we.p<? super R, ? super java.lang.Character, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            r0 = 0
        L_0x000b:
            int r1 = r2.length()
            if (r0 >= r1) goto L_0x0020
            char r1 = r2.charAt(r0)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.Object r3 = r4.g0(r3, r1)
            int r0 = r0 + 1
            goto L_0x000b
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e0.f7(java.lang.CharSequence, java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.7")
    @ve.h(name = "minOrThrow")
    public static final char f8(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                char charAt2 = charSequence.charAt(o10.nextInt());
                if (l0.t(charAt, charAt2) > 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final <C extends Collection<? super Character>> C f9(@fh.g CharSequence charSequence, @fh.g C c10) {
        l0.p(charSequence, "<this>");
        l0.p(c10, "destination");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            c10.add(Character.valueOf(charSequence.charAt(i10)));
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [we.q, we.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R g7(@fh.g java.lang.CharSequence r4, R r5, @fh.g we.q<? super java.lang.Integer, ? super R, ? super java.lang.Character, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r6, r0)
            r0 = 0
            r1 = r0
        L_0x000c:
            int r2 = r4.length()
            if (r0 >= r2) goto L_0x0028
            char r2 = r4.charAt(r0)
            int r3 = r1 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r5 = r6.y(r1, r5, r2)
            int r0 = r0 + 1
            r1 = r3
            goto L_0x000c
        L_0x0028:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e0.g7(java.lang.CharSequence, java.lang.Object, we.q):java.lang.Object");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Character g8(@fh.g CharSequence charSequence, @fh.g Comparator<? super Character> comparator) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            char charAt2 = charSequence.charAt(o10.nextInt());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    @fh.g
    public static final HashSet<Character> g9(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return (HashSet) f9(charSequence, new HashSet(z0.j(v.B(charSequence.length(), 128))));
    }

    public static final boolean h6(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!lVar.A(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [we.p, we.p<? super java.lang.Character, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R h7(@fh.g java.lang.CharSequence r2, R r3, @fh.g we.p<? super java.lang.Character, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r4, r0)
            int r0 = lf.c0.j3(r2)
        L_0x000e:
            if (r0 < 0) goto L_0x0020
            int r1 = r0 + -1
            char r0 = r2.charAt(r0)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r3 = r4.g0(r0, r3)
            r0 = r1
            goto L_0x000e
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e0.h7(java.lang.CharSequence, java.lang.Object, we.p):java.lang.Object");
    }

    @h1(version = "1.7")
    @ve.h(name = "minWithOrThrow")
    public static final char h8(@fh.g CharSequence charSequence, @fh.g Comparator<? super Character> comparator) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                char charAt2 = charSequence.charAt(o10.nextInt());
                if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                    charAt = charAt2;
                }
            }
            return charAt;
        }
        throw new NoSuchElementException();
    }

    @fh.g
    public static final List<Character> h9(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? i9(charSequence) : be.v.k(Character.valueOf(charSequence.charAt(0))) : w.E();
    }

    public static final boolean i6(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [we.q, we.q<? super java.lang.Integer, ? super java.lang.Character, ? super R, ? extends R>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> R i7(@fh.g java.lang.CharSequence r3, R r4, @fh.g we.q<? super java.lang.Integer, ? super java.lang.Character, ? super R, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "operation"
            xe.l0.p(r5, r0)
            int r0 = lf.c0.j3(r3)
        L_0x000e:
            if (r0 < 0) goto L_0x0023
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            char r2 = r3.charAt(r0)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r4 = r5.y(r1, r2, r4)
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.e0.i7(java.lang.CharSequence, java.lang.Object, we.q):java.lang.Object");
    }

    public static final boolean i8(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @fh.g
    public static final List<Character> i9(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return (List) f9(charSequence, new ArrayList(charSequence.length()));
    }

    public static final boolean j6(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (lVar.A(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final void j7(@fh.g CharSequence charSequence, @fh.g l<? super Character, u2> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "action");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            lVar.A(Character.valueOf(charSequence.charAt(i10)));
        }
    }

    public static final boolean j8(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (lVar.A(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @fh.g
    public static final Set<Character> j9(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? (Set) f9(charSequence, new LinkedHashSet(z0.j(v.B(charSequence.length(), 128)))) : k1.f(Character.valueOf(charSequence.charAt(0))) : l1.k();
    }

    @fh.g
    public static final Iterable<Character> k6(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return w.E();
            }
        }
        return new a(charSequence);
    }

    public static final void k7(@fh.g CharSequence charSequence, @fh.g p<? super Integer, ? super Character, u2> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "action");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            pVar.g0(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            i10++;
            i11++;
        }
    }

    @fh.g
    @h1(version = "1.1")
    public static final <S extends CharSequence> S k8(@fh.g S s10, @fh.g l<? super Character, u2> lVar) {
        l0.p(s10, "<this>");
        l0.p(lVar, "action");
        for (int i10 = 0; i10 < s10.length(); i10++) {
            lVar.A(Character.valueOf(s10.charAt(i10)));
        }
        return s10;
    }

    @fh.g
    @h1(version = "1.2")
    public static final List<String> k9(@fh.g CharSequence charSequence, int i10, int i11, boolean z10) {
        l0.p(charSequence, "<this>");
        return l9(charSequence, i10, i11, z10, e.P);
    }

    @fh.g
    public static final m<Character> l6(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence instanceof String) {
            if (charSequence.length() == 0) {
                return s.g();
            }
        }
        return new b(charSequence);
    }

    @oe.f
    public static final char l7(CharSequence charSequence, int i10, l<? super Integer, Character> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "defaultValue");
        return (i10 < 0 || i10 > c0.j3(charSequence)) ? lVar.A(Integer.valueOf(i10)).charValue() : charSequence.charAt(i10);
    }

    @fh.g
    @h1(version = "1.4")
    public static final <S extends CharSequence> S l8(@fh.g S s10, @fh.g p<? super Integer, ? super Character, u2> pVar) {
        l0.p(s10, "<this>");
        l0.p(pVar, "action");
        int i10 = 0;
        int i11 = 0;
        while (i10 < s10.length()) {
            pVar.g0(Integer.valueOf(i11), Character.valueOf(s10.charAt(i10)));
            i10++;
            i11++;
        }
        return s10;
    }

    @fh.g
    @h1(version = "1.2")
    public static final <R> List<R> l9(@fh.g CharSequence charSequence, int i10, int i11, boolean z10, @fh.g l<? super CharSequence, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        o1.a(i10, i11);
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList((length / i11) + (length % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < length)) {
                break;
            }
            int i13 = i12 + i10;
            if (i13 < 0 || i13 > length) {
                if (!z10) {
                    break;
                }
                i13 = length;
            }
            arrayList.add(lVar.A(charSequence.subSequence(i12, i13)));
            i12 += i11;
        }
        return arrayList;
    }

    @fh.g
    public static final <K, V> Map<K, V> m6(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            u0 u0Var = (u0) lVar.A(Character.valueOf(charSequence.charAt(i10)));
            linkedHashMap.put(u0Var.e(), u0Var.f());
        }
        return linkedHashMap;
    }

    @fh.h
    public static final Character m7(@fh.g CharSequence charSequence, int i10) {
        l0.p(charSequence, "<this>");
        if (i10 < 0 || i10 > c0.j3(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i10));
    }

    @fh.g
    public static final u0<CharSequence, CharSequence> m8(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            if (lVar.A(Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            } else {
                sb3.append(charAt);
            }
        }
        return new u0<>(sb2, sb3);
    }

    public static /* synthetic */ List m9(CharSequence charSequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return k9(charSequence, i10, i11, z10);
    }

    @fh.g
    public static final <K> Map<K, Character> n6(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends K> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            linkedHashMap.put(lVar.A(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @fh.g
    public static final <K> Map<K, List<Character>> n7(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends K> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            Object A = lVar.A(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    @fh.g
    public static final u0<String, String> n8(@fh.g String str, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (lVar.A(Character.valueOf(charAt)).booleanValue()) {
                sb2.append(charAt);
            } else {
                sb3.append(charAt);
            }
        }
        String sb4 = sb2.toString();
        l0.o(sb4, "first.toString()");
        String sb5 = sb3.toString();
        l0.o(sb5, "second.toString()");
        return new u0<>(sb4, sb5);
    }

    public static /* synthetic */ List n9(CharSequence charSequence, int i10, int i11, boolean z10, l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return l9(charSequence, i10, i11, z10, lVar);
    }

    @fh.g
    public static final <K, V> Map<K, V> o6(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends K> lVar, @fh.g l<? super Character, ? extends V> lVar2) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            linkedHashMap.put(lVar.A(Character.valueOf(charAt)), lVar2.A(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @fh.g
    public static final <K, V> Map<K, List<V>> o7(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends K> lVar, @fh.g l<? super Character, ? extends V> lVar2) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            Object A = lVar.A(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(A);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    @h1(version = "1.3")
    @oe.f
    public static final char o8(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return p8(charSequence, ef.f.O);
    }

    @fh.g
    @h1(version = "1.2")
    public static final m<String> o9(@fh.g CharSequence charSequence, int i10, int i11, boolean z10) {
        l0.p(charSequence, "<this>");
        return p9(charSequence, i10, i11, z10, f.P);
    }

    @fh.g
    public static final <K, M extends Map<? super K, ? super Character>> M p6(@fh.g CharSequence charSequence, @fh.g M m10, @fh.g l<? super Character, ? extends K> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            m10.put(lVar.A(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return m10;
    }

    @fh.g
    public static final <K, M extends Map<? super K, List<Character>>> M p7(@fh.g CharSequence charSequence, @fh.g M m10, @fh.g l<? super Character, ? extends K> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            Object A = lVar.A(Character.valueOf(charAt));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return m10;
    }

    @h1(version = "1.3")
    public static final char p8(@fh.g CharSequence charSequence, @fh.g ef.f fVar) {
        l0.p(charSequence, "<this>");
        l0.p(fVar, "random");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(fVar.m(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @fh.g
    @h1(version = "1.2")
    public static final <R> m<R> p9(@fh.g CharSequence charSequence, int i10, int i11, boolean z10, @fh.g l<? super CharSequence, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        o1.a(i10, i11);
        return u.k1(be.e0.v1(v.B1(z10 ? c0.i3(charSequence) : v.W1(0, (charSequence.length() - i10) + 1), i11)), new g(i10, charSequence, lVar));
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M q6(@fh.g CharSequence charSequence, @fh.g M m10, @fh.g l<? super Character, ? extends K> lVar, @fh.g l<? super Character, ? extends V> lVar2) {
        l0.p(charSequence, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            m10.put(lVar.A(Character.valueOf(charAt)), lVar2.A(Character.valueOf(charAt)));
        }
        return m10;
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, List<V>>> M q7(@fh.g CharSequence charSequence, @fh.g M m10, @fh.g l<? super Character, ? extends K> lVar, @fh.g l<? super Character, ? extends V> lVar2) {
        l0.p(charSequence, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            Object A = lVar.A(Character.valueOf(charAt));
            Object obj = m10.get(A);
            if (obj == null) {
                obj = new ArrayList();
                m10.put(A, obj);
            }
            ((List) obj).add(lVar2.A(Character.valueOf(charAt)));
        }
        return m10;
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @oe.f
    public static final Character q8(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return r8(charSequence, ef.f.O);
    }

    public static /* synthetic */ m q9(CharSequence charSequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return o9(charSequence, i10, i11, z10);
    }

    @fh.g
    public static final <K, V, M extends Map<? super K, ? super V>> M r6(@fh.g CharSequence charSequence, @fh.g M m10, @fh.g l<? super Character, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            u0 u0Var = (u0) lVar.A(Character.valueOf(charSequence.charAt(i10)));
            m10.put(u0Var.e(), u0Var.f());
        }
        return m10;
    }

    @fh.g
    @h1(version = "1.1")
    public static final <K> be.l0<Character, K> r7(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends K> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "keySelector");
        return new d(charSequence, lVar);
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @fh.h
    public static final Character r8(@fh.g CharSequence charSequence, @fh.g ef.f fVar) {
        l0.p(charSequence, "<this>");
        l0.p(fVar, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(fVar.m(charSequence.length())));
    }

    public static /* synthetic */ m r9(CharSequence charSequence, int i10, int i11, boolean z10, l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return p9(charSequence, i10, i11, z10, lVar);
    }

    @fh.g
    @h1(version = "1.3")
    public static final <V> Map<Character, V> s6(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends V> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(v.B(charSequence.length(), 128)), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            linkedHashMap.put(Character.valueOf(charAt), lVar.A(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    public static final int s7(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (lVar.A(Character.valueOf(charSequence.charAt(i10))).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final char s8(@fh.g CharSequence charSequence, @fh.g p<? super Character, ? super Character, Character> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                charAt = pVar.g0(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(o10.nextInt()))).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @fh.g
    public static final Iterable<p0<Character>> s9(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return new q0(new h(charSequence));
    }

    @fh.g
    @h1(version = "1.3")
    public static final <V, M extends Map<? super Character, ? super V>> M t6(@fh.g CharSequence charSequence, @fh.g M m10, @fh.g l<? super Character, ? extends V> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(m10, "destination");
        l0.p(lVar, "valueSelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char charAt = charSequence.charAt(i10);
            m10.put(Character.valueOf(charAt), lVar.A(Character.valueOf(charAt)));
        }
        return m10;
    }

    public static final int t7(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (lVar.A(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
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

    public static final char t8(@fh.g CharSequence charSequence, @fh.g q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        if (!(charSequence.length() == 0)) {
            char charAt = charSequence.charAt(0);
            s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                charAt = qVar.y(Integer.valueOf(nextInt), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(nextInt))).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @fh.g
    public static final List<u0<Character, Character>> t9(@fh.g CharSequence charSequence, @fh.g CharSequence charSequence2) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        int min = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(r1.a(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(charSequence2.charAt(i10))));
        }
        return arrayList;
    }

    @fh.g
    @h1(version = "1.2")
    public static final List<String> u6(@fh.g CharSequence charSequence, int i10) {
        l0.p(charSequence, "<this>");
        return k9(charSequence, i10, i10, true);
    }

    public static final char u7(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(c0.j3(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @h1(version = "1.4")
    @fh.h
    public static final Character u8(@fh.g CharSequence charSequence, @fh.g q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            int nextInt = o10.nextInt();
            charAt = qVar.y(Integer.valueOf(nextInt), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(nextInt))).charValue();
        }
        return Character.valueOf(charAt);
    }

    @fh.g
    public static final <V> List<V> u9(@fh.g CharSequence charSequence, @fh.g CharSequence charSequence2, @fh.g p<? super Character, ? super Character, ? extends V> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(charSequence.length(), charSequence2.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(pVar.g0(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(charSequence2.charAt(i10))));
        }
        return arrayList;
    }

    @fh.g
    @h1(version = "1.2")
    public static final <R> List<R> v6(@fh.g CharSequence charSequence, int i10, @fh.g l<? super CharSequence, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        return l9(charSequence, i10, i10, true, lVar);
    }

    public static final char v7(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char charAt = charSequence.charAt(length);
                if (!lVar.A(Character.valueOf(charAt)).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return charAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @fh.h
    public static final Character v8(@fh.g CharSequence charSequence, @fh.g p<? super Character, ? super Character, Character> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        s0 o10 = new gf.m(1, c0.j3(charSequence)).iterator();
        while (o10.hasNext()) {
            charAt = pVar.g0(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(o10.nextInt()))).charValue();
        }
        return Character.valueOf(charAt);
    }

    @fh.g
    @h1(version = "1.2")
    public static final List<u0<Character, Character>> v9(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            i10++;
            arrayList.add(r1.a(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @fh.g
    @h1(version = "1.2")
    public static final m<String> w6(@fh.g CharSequence charSequence, int i10) {
        l0.p(charSequence, "<this>");
        return x6(charSequence, i10, c.P);
    }

    @fh.h
    public static final Character w7(@fh.g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final char w8(@fh.g CharSequence charSequence, @fh.g p<? super Character, ? super Character, Character> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        int j32 = c0.j3(charSequence);
        if (j32 >= 0) {
            char charAt = charSequence.charAt(j32);
            for (int i10 = j32 - 1; i10 >= 0; i10--) {
                charAt = pVar.g0(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @fh.g
    @h1(version = "1.2")
    public static final <R> List<R> w9(@fh.g CharSequence charSequence, @fh.g p<? super Character, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (i10 < length) {
            i10++;
            arrayList.add(pVar.g0(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @fh.g
    @h1(version = "1.2")
    public static final <R> m<R> x6(@fh.g CharSequence charSequence, int i10, @fh.g l<? super CharSequence, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        return p9(charSequence, i10, i10, true, lVar);
    }

    @fh.h
    public static final Character x7(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char charAt = charSequence.charAt(length);
            if (lVar.A(Character.valueOf(charAt)).booleanValue()) {
                return Character.valueOf(charAt);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    public static final char x8(@fh.g CharSequence charSequence, @fh.g q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        int j32 = c0.j3(charSequence);
        if (j32 >= 0) {
            char charAt = charSequence.charAt(j32);
            for (int i10 = j32 - 1; i10 >= 0; i10--) {
                charAt = qVar.y(Integer.valueOf(i10), Character.valueOf(charSequence.charAt(i10)), Character.valueOf(charAt)).charValue();
            }
            return charAt;
        }
        throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
    }

    @oe.f
    public static final int y6(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return charSequence.length();
    }

    @fh.g
    public static final <R> List<R> y7(@fh.g CharSequence charSequence, @fh.g l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            arrayList.add(lVar.A(Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @fh.h
    public static final Character y8(@fh.g CharSequence charSequence, @fh.g q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        l0.p(charSequence, "<this>");
        l0.p(qVar, "operation");
        int j32 = c0.j3(charSequence);
        if (j32 < 0) {
            return null;
        }
        char charAt = charSequence.charAt(j32);
        for (int i10 = j32 - 1; i10 >= 0; i10--) {
            charAt = qVar.y(Integer.valueOf(i10), Character.valueOf(charSequence.charAt(i10)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }

    public static final int z6(@fh.g CharSequence charSequence, @fh.g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (lVar.A(Character.valueOf(charSequence.charAt(i11))).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @fh.g
    public static final <R> List<R> z7(@fh.g CharSequence charSequence, @fh.g p<? super Integer, ? super Character, ? extends R> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            arrayList.add(pVar.g0(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @fh.h
    public static final Character z8(@fh.g CharSequence charSequence, @fh.g p<? super Character, ? super Character, Character> pVar) {
        l0.p(charSequence, "<this>");
        l0.p(pVar, "operation");
        int j32 = c0.j3(charSequence);
        if (j32 < 0) {
            return null;
        }
        char charAt = charSequence.charAt(j32);
        for (int i10 = j32 - 1; i10 >= 0; i10--) {
            charAt = pVar.g0(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(charAt)).charValue();
        }
        return Character.valueOf(charAt);
    }
}
