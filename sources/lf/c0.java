package lf;

import be.e0;
import be.o;
import be.s0;
import be.t;
import be.x;
import fh.g;
import fh.h;
import gf.k;
import gf.m;
import gf.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oe.f;
import p000if.u;
import we.l;
import we.p;
import xe.l0;
import xe.n0;
import zd.b1;
import zd.h1;
import zd.r;
import zd.r1;
import zd.t0;
import zd.u0;
import zd.y2;

public class c0 extends b0 {

    public static final class a extends t {
        public int O;
        public final /* synthetic */ CharSequence P;

        public a(CharSequence charSequence) {
            this.P = charSequence;
        }

        public char b() {
            CharSequence charSequence = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            return charSequence.charAt(i10);
        }

        public boolean hasNext() {
            return this.O < this.P.length();
        }
    }

    public static final class b extends n0 implements p<CharSequence, Integer, u0<? extends Integer, ? extends Integer>> {
        public final /* synthetic */ char[] P;
        public final /* synthetic */ boolean Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(char[] cArr, boolean z10) {
            super(2);
            this.P = cArr;
            this.Q = z10;
        }

        @h
        public final u0<Integer, Integer> c(@g CharSequence charSequence, int i10) {
            l0.p(charSequence, "$this$$receiver");
            int u32 = c0.u3(charSequence, this.P, i10, this.Q);
            if (u32 < 0) {
                return null;
            }
            return r1.a(Integer.valueOf(u32), 1);
        }

        public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
            return c((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    public static final class c extends n0 implements p<CharSequence, Integer, u0<? extends Integer, ? extends Integer>> {
        public final /* synthetic */ List<String> P;
        public final /* synthetic */ boolean Q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List<String> list, boolean z10) {
            super(2);
            this.P = list;
            this.Q = z10;
        }

        @h
        public final u0<Integer, Integer> c(@g CharSequence charSequence, int i10) {
            l0.p(charSequence, "$this$$receiver");
            u0 N2 = c0.e3(charSequence, this.P, i10, this.Q, false);
            if (N2 != null) {
                return r1.a(N2.e(), Integer.valueOf(((String) N2.f()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
            return c((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    public static final class d extends n0 implements l<m, String> {
        public final /* synthetic */ CharSequence P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(CharSequence charSequence) {
            super(1);
            this.P = charSequence;
        }

        @g
        /* renamed from: c */
        public final String A(@g m mVar) {
            l0.p(mVar, "it");
            return c0.k5(this.P, mVar);
        }
    }

    public static final class e extends n0 implements l<m, String> {
        public final /* synthetic */ CharSequence P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(CharSequence charSequence) {
            super(1);
            this.P = charSequence;
        }

        @g
        /* renamed from: c */
        public final String A(@g m mVar) {
            l0.p(mVar, "it");
            return c0.k5(this.P, mVar);
        }
    }

    @f
    public static final boolean A3(CharSequence charSequence) {
        return charSequence == null || b0.V1(charSequence);
    }

    public static /* synthetic */ String A4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return y4(str, c10, str2, str3);
    }

    @g
    public static final String A5(@g String str, @g String str2, @g String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "missingDelimiterValue");
        int G3 = G3(str, str2, 0, false, 6, (Object) null);
        if (G3 == -1) {
            return str3;
        }
        String substring = str.substring(0, G3);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @f
    public static final boolean B3(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static /* synthetic */ String B4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return z4(str, str2, str3, str4);
    }

    public static /* synthetic */ String B5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return z5(str, c10, str2);
    }

    @g
    public static final t C3(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return new a(charSequence);
    }

    @g
    public static final String C4(@g String str, char c10, @g String str2, @g String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "replacement");
        l0.p(str3, "missingDelimiterValue");
        int F3 = F3(str, c10, 0, false, 6, (Object) null);
        return F3 == -1 ? str3 : J4(str, 0, F3, str2).toString();
    }

    public static /* synthetic */ String C5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return A5(str, str2, str3);
    }

    public static final int D3(@g CharSequence charSequence, char c10, int i10, boolean z10) {
        l0.p(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return I3(charSequence, new char[]{c10}, i10, z10);
    }

    @g
    public static final String D4(@g String str, @g String str2, @g String str3, @g String str4) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "replacement");
        l0.p(str4, "missingDelimiterValue");
        int G3 = G3(str, str2, 0, false, 6, (Object) null);
        return G3 == -1 ? str4 : J4(str, 0, G3, str3).toString();
    }

    @h1(version = "1.5")
    public static final boolean D5(@g String str) {
        l0.p(str, "<this>");
        if (l0.g(str, "true")) {
            return true;
        }
        if (l0.g(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static final int E3(@g CharSequence charSequence, @g String str, int i10, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(str, "string");
        return (z10 || !(charSequence instanceof String)) ? p3(charSequence, str, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    public static /* synthetic */ String E4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return C4(str, c10, str2, str3);
    }

    @h1(version = "1.5")
    @h
    public static final Boolean E5(@g String str) {
        l0.p(str, "<this>");
        if (l0.g(str, "true")) {
            return Boolean.TRUE;
        }
        if (l0.g(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int F3(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = j3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return D3(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ String F4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return D4(str, str2, str3, str4);
    }

    @g
    public static final CharSequence F5(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean r10 = d.r(charSequence.charAt(!z10 ? i10 : length));
            if (!z10) {
                if (!r10) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!r10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static /* synthetic */ int G3(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = j3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return E3(charSequence, str, i10, z10);
    }

    @f
    public static final String G4(CharSequence charSequence, o oVar, String str) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        l0.p(str, "replacement");
        return oVar.o(charSequence, str);
    }

    @g
    public static final CharSequence G5(@g CharSequence charSequence, @g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean booleanValue = lVar.A(Character.valueOf(charSequence.charAt(!z10 ? i10 : length))).booleanValue();
            if (!z10) {
                if (!booleanValue) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!booleanValue) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int H3(@g CharSequence charSequence, @g Collection<String> collection, int i10, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(collection, "strings");
        u0<Integer, String> e32 = e3(charSequence, collection, i10, z10, true);
        if (e32 != null) {
            return e32.e().intValue();
        }
        return -1;
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @f
    @t0
    @ve.h(name = "replaceFirstCharWithChar")
    public static final String H4(String str, l<? super Character, Character> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "transform");
        if (!(str.length() > 0)) {
            return str;
        }
        char charValue = lVar.A(Character.valueOf(str.charAt(0))).charValue();
        String substring = str.substring(1);
        l0.o(substring, "this as java.lang.String).substring(startIndex)");
        return charValue + substring;
    }

    @g
    public static final CharSequence H5(@g CharSequence charSequence, @g char... cArr) {
        l0.p(charSequence, "<this>");
        l0.p(cArr, "chars");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean O8 = be.p.O8(cArr, charSequence.charAt(!z10 ? i10 : length));
            if (!z10) {
                if (!O8) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!O8) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int I3(@g CharSequence charSequence, @g char[] cArr, int i10, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int B = v.B(i10, j3(charSequence)); -1 < B; B--) {
                char charAt = charSequence.charAt(B);
                int length = cArr.length;
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (e.J(cArr[i11], charAt, z10)) {
                        z11 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    return B;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(be.p.xt(cArr), i10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @f
    @t0
    @ve.h(name = "replaceFirstCharWithCharSequence")
    public static final String I4(String str, l<? super Character, ? extends CharSequence> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "transform");
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lVar.A(Character.valueOf(str.charAt(0))));
        String substring = str.substring(1);
        l0.o(substring, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring);
        return sb2.toString();
    }

    @f
    public static final String I5(String str) {
        l0.p(str, "<this>");
        return F5(str).toString();
    }

    public static /* synthetic */ int J3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = j3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return H3(charSequence, collection, i10, z10);
    }

    @g
    public static final CharSequence J4(@g CharSequence charSequence, int i10, int i11, @g CharSequence charSequence2) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            l0.o(sb2, "this.append(value, startIndex, endIndex)");
            sb2.append(charSequence2);
            sb2.append(charSequence, i11, charSequence.length());
            l0.o(sb2, "this.append(value, startIndex, endIndex)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    @g
    public static final String J5(@g String str, @g l<? super Character, Boolean> lVar) {
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean booleanValue = lVar.A(Character.valueOf(str.charAt(!z10 ? i10 : length))).booleanValue();
            if (!z10) {
                if (!booleanValue) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!booleanValue) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static /* synthetic */ int K3(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = j3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return I3(charSequence, cArr, i10, z10);
    }

    @g
    public static final CharSequence K4(@g CharSequence charSequence, @g m mVar, @g CharSequence charSequence2) {
        l0.p(charSequence, "<this>");
        l0.p(mVar, "range");
        l0.p(charSequence2, "replacement");
        return J4(charSequence, mVar.c().intValue(), mVar.h().intValue() + 1, charSequence2);
    }

    @g
    public static final String K5(@g String str, @g char... cArr) {
        l0.p(str, "<this>");
        l0.p(cArr, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean O8 = be.p.O8(cArr, str.charAt(!z10 ? i10 : length));
            if (!z10) {
                if (!O8) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!O8) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    @g
    public static final p000if.m<String> L3(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return a5(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    @f
    public static final String L4(String str, int i10, int i11, CharSequence charSequence) {
        l0.p(str, "<this>");
        l0.p(charSequence, "replacement");
        return J4(str, i10, i11, charSequence).toString();
    }

    @g
    public static final CharSequence L5(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!d.r(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return "";
    }

    @g
    public static final List<String> M3(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return u.c3(L3(charSequence));
    }

    @f
    public static final String M4(String str, m mVar, CharSequence charSequence) {
        l0.p(str, "<this>");
        l0.p(mVar, "range");
        l0.p(charSequence, "replacement");
        return K4(str, mVar, charSequence).toString();
    }

    @g
    public static final CharSequence M5(@g CharSequence charSequence, @g l<? super Character, Boolean> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!lVar.A(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    @f
    public static final boolean N3(CharSequence charSequence, o oVar) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        return oVar.k(charSequence);
    }

    public static final void N4(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
        }
    }

    @g
    public static final CharSequence N5(@g CharSequence charSequence, @g char... cArr) {
        l0.p(charSequence, "<this>");
        l0.p(cArr, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!be.p.O8(cArr, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return "";
    }

    @g
    public static final String O2(@g CharSequence charSequence, @g CharSequence charSequence2, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i10 = 0;
        while (i10 < min && e.J(charSequence.charAt(i10), charSequence2.charAt(i10), z10)) {
            i10++;
        }
        int i11 = i10 - 1;
        if (k3(charSequence, i11) || k3(charSequence2, i11)) {
            i10--;
        }
        return charSequence.subSequence(0, i10).toString();
    }

    @f
    public static final String O3(String str) {
        return str == null ? "" : str;
    }

    @f
    public static final List<String> O4(CharSequence charSequence, o oVar, int i10) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        return oVar.p(charSequence, i10);
    }

    @f
    public static final String O5(String str) {
        l0.p(str, "<this>");
        return L5(str).toString();
    }

    public static /* synthetic */ String P2(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return O2(charSequence, charSequence2, z10);
    }

    @g
    public static final CharSequence P3(@g CharSequence charSequence, int i10, char c10) {
        l0.p(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        } else if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(charSequence);
            s0 o10 = new m(1, i10 - charSequence.length()).iterator();
            while (o10.hasNext()) {
                o10.nextInt();
                sb2.append(c10);
            }
            return sb2;
        }
    }

    @g
    public static final List<String> P4(@g CharSequence charSequence, @g char[] cArr, boolean z10, int i10) {
        l0.p(charSequence, "<this>");
        l0.p(cArr, "delimiters");
        if (cArr.length == 1) {
            return R4(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable<m> N = u.N(Z3(charSequence, cArr, 0, z10, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(x.Y(N, 10));
        for (m k52 : N) {
            arrayList.add(k5(charSequence, k52));
        }
        return arrayList;
    }

    @g
    public static final String P5(@g String str, @g l<? super Character, Boolean> lVar) {
        Object obj;
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!lVar.A(Character.valueOf(str.charAt(length))).booleanValue()) {
                    obj = str.subSequence(0, length + 1);
                    break;
                } else if (i10 < 0) {
                    break;
                } else {
                    length = i10;
                }
            }
            return obj.toString();
        }
        obj = "";
        return obj.toString();
    }

    @g
    public static final String Q2(@g CharSequence charSequence, @g CharSequence charSequence2, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int min = Math.min(length, length2);
        int i10 = 0;
        while (i10 < min && e.J(charSequence.charAt((length - i10) - 1), charSequence2.charAt((length2 - i10) - 1), z10)) {
            i10++;
        }
        if (k3(charSequence, (length - i10) - 1) || k3(charSequence2, (length2 - i10) - 1)) {
            i10--;
        }
        return charSequence.subSequence(length - i10, length).toString();
    }

    @g
    public static final String Q3(@g String str, int i10, char c10) {
        l0.p(str, "<this>");
        return P3(str, i10, c10).toString();
    }

    @g
    public static final List<String> Q4(@g CharSequence charSequence, @g String[] strArr, boolean z10, int i10) {
        l0.p(charSequence, "<this>");
        l0.p(strArr, "delimiters");
        boolean z11 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                return R4(charSequence, str, z10, i10);
            }
        }
        Iterable<m> N = u.N(a4(charSequence, strArr, 0, z10, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(x.Y(N, 10));
        for (m k52 : N) {
            arrayList.add(k5(charSequence, k52));
        }
        return arrayList;
    }

    @g
    public static final String Q5(@g String str, @g char... cArr) {
        Object obj;
        l0.p(str, "<this>");
        l0.p(cArr, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!be.p.O8(cArr, str.charAt(length))) {
                    obj = str.subSequence(0, length + 1);
                    break;
                } else if (i10 < 0) {
                    break;
                } else {
                    length = i10;
                }
            }
            return obj.toString();
        }
        obj = "";
        return obj.toString();
    }

    public static /* synthetic */ String R2(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Q2(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ CharSequence R3(CharSequence charSequence, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = p7.f.f11698i;
        }
        return P3(charSequence, i10, c10);
    }

    public static final List<String> R4(CharSequence charSequence, String str, boolean z10, int i10) {
        N4(i10);
        int i11 = 0;
        int o32 = o3(charSequence, str, 0, z10);
        if (o32 == -1 || i10 == 1) {
            return be.v.k(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i12 = 10;
        if (z11) {
            i12 = v.B(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, o32).toString());
            i11 = str.length() + o32;
            if ((z11 && arrayList.size() == i10 - 1) || (o32 = o3(charSequence, str, i11, z10)) == -1) {
                arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i11, o32).toString());
            i11 = str.length() + o32;
            break;
        } while ((o32 = o3(charSequence, str, i11, z10)) == -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    @g
    public static final CharSequence R5(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!d.r(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean S2(@g CharSequence charSequence, char c10, boolean z10) {
        l0.p(charSequence, "<this>");
        return r3(charSequence, c10, 0, z10, 2, (Object) null) >= 0;
    }

    public static /* synthetic */ String S3(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = p7.f.f11698i;
        }
        return Q3(str, i10, c10);
    }

    public static /* synthetic */ List S4(CharSequence charSequence, o oVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        return oVar.p(charSequence, i10);
    }

    @g
    public static final CharSequence S5(@g CharSequence charSequence, @g l<? super Character, Boolean> lVar) {
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

    public static final boolean T2(@g CharSequence charSequence, @g CharSequence charSequence2, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (s3(charSequence, (String) charSequence2, 0, z10, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (q3(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    @g
    public static final CharSequence T3(@g CharSequence charSequence, int i10, char c10) {
        l0.p(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        } else if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            s0 o10 = new m(1, i10 - charSequence.length()).iterator();
            while (o10.hasNext()) {
                o10.nextInt();
                sb2.append(c10);
            }
            sb2.append(charSequence);
            return sb2;
        }
    }

    public static /* synthetic */ List T4(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return P4(charSequence, cArr, z10, i10);
    }

    @g
    public static final CharSequence T5(@g CharSequence charSequence, @g char... cArr) {
        l0.p(charSequence, "<this>");
        l0.p(cArr, "chars");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!be.p.O8(cArr, charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    @f
    public static final boolean U2(CharSequence charSequence, o oVar) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        return oVar.b(charSequence);
    }

    @g
    public static final String U3(@g String str, int i10, char c10) {
        l0.p(str, "<this>");
        return T3(str, i10, c10).toString();
    }

    public static /* synthetic */ List U4(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return Q4(charSequence, strArr, z10, i10);
    }

    @f
    public static final String U5(String str) {
        l0.p(str, "<this>");
        return R5(str).toString();
    }

    public static /* synthetic */ boolean V2(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return S2(charSequence, c10, z10);
    }

    public static /* synthetic */ CharSequence V3(CharSequence charSequence, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = p7.f.f11698i;
        }
        return T3(charSequence, i10, c10);
    }

    @h1(version = "1.6")
    @y2(markerClass = {r.class})
    @f
    public static final p000if.m<String> V4(CharSequence charSequence, o oVar, int i10) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        return oVar.r(charSequence, i10);
    }

    @g
    public static final String V5(@g String str, @g l<? super Character, Boolean> lVar) {
        Object obj;
        l0.p(str, "<this>");
        l0.p(lVar, "predicate");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                obj = "";
                break;
            } else if (!lVar.A(Character.valueOf(str.charAt(i10))).booleanValue()) {
                obj = str.subSequence(i10, str.length());
                break;
            } else {
                i10++;
            }
        }
        return obj.toString();
    }

    public static /* synthetic */ boolean W2(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return T2(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String W3(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = p7.f.f11698i;
        }
        return U3(str, i10, c10);
    }

    @g
    public static final p000if.m<String> W4(@g CharSequence charSequence, @g char[] cArr, boolean z10, int i10) {
        l0.p(charSequence, "<this>");
        l0.p(cArr, "delimiters");
        return u.k1(Z3(charSequence, cArr, 0, z10, i10, 2, (Object) null), new e(charSequence));
    }

    @g
    public static final String W5(@g String str, @g char... cArr) {
        Object obj;
        l0.p(str, "<this>");
        l0.p(cArr, "chars");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                obj = "";
                break;
            } else if (!be.p.O8(cArr, str.charAt(i10))) {
                obj = str.subSequence(i10, str.length());
                break;
            } else {
                i10++;
            }
        }
        return obj.toString();
    }

    public static final boolean X2(@h CharSequence charSequence, @h CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return b0.L1((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!e.J(charSequence.charAt(i10), charSequence2.charAt(i10), true)) {
                return false;
            }
        }
        return true;
    }

    public static final p000if.m<m> X3(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        N4(i11);
        return new h(charSequence, i10, i11, new b(cArr, z10));
    }

    @g
    public static final p000if.m<String> X4(@g CharSequence charSequence, @g String[] strArr, boolean z10, int i10) {
        l0.p(charSequence, "<this>");
        l0.p(strArr, "delimiters");
        return u.k1(a4(charSequence, strArr, 0, z10, i10, 2, (Object) null), new d(charSequence));
    }

    public static final boolean Y2(@h CharSequence charSequence, @h CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return l0.g(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static final p000if.m<m> Y3(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        N4(i11);
        return new h(charSequence, i10, i11, new c(o.t(strArr), z10));
    }

    public static /* synthetic */ p000if.m Y4(CharSequence charSequence, o oVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        return oVar.r(charSequence, i10);
    }

    public static final boolean Z2(@g CharSequence charSequence, char c10, boolean z10) {
        l0.p(charSequence, "<this>");
        return charSequence.length() > 0 && e.J(charSequence.charAt(j3(charSequence)), c10, z10);
    }

    public static /* synthetic */ p000if.m Z3(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return X3(charSequence, cArr, i10, z10, i11);
    }

    public static /* synthetic */ p000if.m Z4(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return W4(charSequence, cArr, z10, i10);
    }

    public static final boolean a3(@g CharSequence charSequence, @g CharSequence charSequence2, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "suffix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return b0.K1((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return b4(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ p000if.m a4(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return Y3(charSequence, strArr, i10, z10, i11);
    }

    public static /* synthetic */ p000if.m a5(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return X4(charSequence, strArr, z10, i10);
    }

    public static /* synthetic */ boolean b3(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Z2(charSequence, c10, z10);
    }

    public static final boolean b4(@g CharSequence charSequence, int i10, @g CharSequence charSequence2, int i11, int i12, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!e.J(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b5(@g CharSequence charSequence, char c10, boolean z10) {
        l0.p(charSequence, "<this>");
        return charSequence.length() > 0 && e.J(charSequence.charAt(0), c10, z10);
    }

    public static /* synthetic */ boolean c3(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a3(charSequence, charSequence2, z10);
    }

    @g
    public static final CharSequence c4(@g CharSequence charSequence, @g CharSequence charSequence2) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "prefix");
        return g5(charSequence, charSequence2, false, 2, (Object) null) ? charSequence.subSequence(charSequence2.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final boolean c5(@g CharSequence charSequence, @g CharSequence charSequence2, int i10, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "prefix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return b0.u2((String) charSequence, (String) charSequence2, i10, false, 4, (Object) null);
        }
        return b4(charSequence, i10, charSequence2, 0, charSequence2.length(), z10);
    }

    @h
    public static final u0<Integer, String> d3(@g CharSequence charSequence, @g Collection<String> collection, int i10, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(collection, "strings");
        return e3(charSequence, collection, i10, z10, false);
    }

    @g
    public static final String d4(@g String str, @g CharSequence charSequence) {
        l0.p(str, "<this>");
        l0.p(charSequence, "prefix");
        if (!g5(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        l0.o(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final boolean d5(@g CharSequence charSequence, @g CharSequence charSequence2, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "prefix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return b0.v2((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return b4(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    public static final u0<Integer, String> e3(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        int i11;
        T t10;
        String str;
        T t11;
        if (z10 || collection.size() != 1) {
            k mVar = !z11 ? new m(v.u(i10, 0), charSequence.length()) : v.k0(v.B(i10, j3(charSequence)), 0);
            if (charSequence instanceof String) {
                i11 = mVar.l();
                int m10 = mVar.m();
                int n10 = mVar.n();
                if ((n10 > 0 && i11 <= m10) || (n10 < 0 && m10 <= i11)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t11 = null;
                                break;
                            }
                            t11 = it.next();
                            String str2 = (String) t11;
                            if (b0.e2(str2, 0, (String) charSequence, i11, str2.length(), z10)) {
                                break;
                            }
                        }
                        str = (String) t11;
                        if (str == null) {
                            if (i11 == m10) {
                                break;
                            }
                            i11 += n10;
                        } else {
                            break;
                        }
                    }
                }
                return null;
            }
            int l10 = mVar.l();
            int m11 = mVar.m();
            int n11 = mVar.n();
            if ((n11 > 0 && l10 <= m11) || (n11 < 0 && m11 <= l10)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it2.next();
                        String str3 = (String) t10;
                        if (b4(str3, 0, charSequence, i11, str3.length(), z10)) {
                            break;
                        }
                    }
                    str = (String) t10;
                    if (str == null) {
                        if (i11 == m11) {
                            break;
                        }
                        l10 = i11 + n11;
                    } else {
                        break;
                    }
                }
            }
            return null;
            return r1.a(Integer.valueOf(i11), str);
        }
        String str4 = (String) e0.a5(collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i12 = i10;
        int s32 = !z11 ? s3(charSequence2, str5, i12, false, 4, (Object) null) : G3(charSequence2, str5, i12, false, 4, (Object) null);
        if (s32 < 0) {
            return null;
        }
        return r1.a(Integer.valueOf(s32), str4);
    }

    @g
    public static final CharSequence e4(@g CharSequence charSequence, int i10, int i11) {
        l0.p(charSequence, "<this>");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
        } else if (i11 == i10) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(charSequence.length() - (i11 - i10));
            sb2.append(charSequence, 0, i10);
            l0.o(sb2, "this.append(value, startIndex, endIndex)");
            sb2.append(charSequence, i11, charSequence.length());
            l0.o(sb2, "this.append(value, startIndex, endIndex)");
            return sb2;
        }
    }

    public static /* synthetic */ boolean e5(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b5(charSequence, c10, z10);
    }

    public static /* synthetic */ u0 f3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return d3(charSequence, collection, i10, z10);
    }

    @g
    public static final CharSequence f4(@g CharSequence charSequence, @g m mVar) {
        l0.p(charSequence, "<this>");
        l0.p(mVar, "range");
        return e4(charSequence, mVar.c().intValue(), mVar.h().intValue() + 1);
    }

    public static /* synthetic */ boolean f5(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return c5(charSequence, charSequence2, i10, z10);
    }

    @h
    public static final u0<Integer, String> g3(@g CharSequence charSequence, @g Collection<String> collection, int i10, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(collection, "strings");
        return e3(charSequence, collection, i10, z10, true);
    }

    @f
    public static final String g4(String str, int i10, int i11) {
        l0.p(str, "<this>");
        return e4(str, i10, i11).toString();
    }

    public static /* synthetic */ boolean g5(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return d5(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ u0 h3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = j3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return g3(charSequence, collection, i10, z10);
    }

    @f
    public static final String h4(String str, m mVar) {
        l0.p(str, "<this>");
        l0.p(mVar, "range");
        return f4(str, mVar).toString();
    }

    @g
    public static final CharSequence h5(@g CharSequence charSequence, @g m mVar) {
        l0.p(charSequence, "<this>");
        l0.p(mVar, "range");
        return charSequence.subSequence(mVar.c().intValue(), mVar.h().intValue() + 1);
    }

    @g
    public static final m i3(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return new m(0, charSequence.length() - 1);
    }

    @g
    public static final CharSequence i4(@g CharSequence charSequence, @g CharSequence charSequence2) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "suffix");
        return c3(charSequence, charSequence2, false, 2, (Object) null) ? charSequence.subSequence(0, charSequence.length() - charSequence2.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @f
    @zd.k(message = "Use parameters named startIndex and endIndex.", replaceWith = @b1(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    public static final CharSequence i5(String str, int i10, int i11) {
        l0.p(str, "<this>");
        return str.subSequence(i10, i11);
    }

    public static final int j3(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @g
    public static final String j4(@g String str, @g CharSequence charSequence) {
        l0.p(str, "<this>");
        l0.p(charSequence, "suffix");
        if (!c3(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @f
    public static final String j5(CharSequence charSequence, int i10, int i11) {
        l0.p(charSequence, "<this>");
        return charSequence.subSequence(i10, i11).toString();
    }

    public static final boolean k3(@g CharSequence charSequence, int i10) {
        l0.p(charSequence, "<this>");
        return new m(0, charSequence.length() + -2).q(i10) && Character.isHighSurrogate(charSequence.charAt(i10)) && Character.isLowSurrogate(charSequence.charAt(i10 + 1));
    }

    @g
    public static final CharSequence k4(@g CharSequence charSequence, @g CharSequence charSequence2) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "delimiter");
        return l4(charSequence, charSequence2, charSequence2);
    }

    @g
    public static final String k5(@g CharSequence charSequence, @g m mVar) {
        l0.p(charSequence, "<this>");
        l0.p(mVar, "range");
        return charSequence.subSequence(mVar.c().intValue(), mVar.h().intValue() + 1).toString();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C, java.lang.CharSequence] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <C extends java.lang.CharSequence & R, R> R l3(C r1, we.a<? extends R> r2) {
        /*
            java.lang.String r0 = "defaultValue"
            xe.l0.p(r2, r0)
            boolean r0 = lf.b0.V1(r1)
            if (r0 == 0) goto L_0x000f
            java.lang.Object r1 = r2.n()
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.c0.l3(java.lang.CharSequence, we.a):java.lang.Object");
    }

    @g
    public static final CharSequence l4(@g CharSequence charSequence, @g CharSequence charSequence2, @g CharSequence charSequence3) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "suffix");
        return (charSequence.length() < charSequence2.length() + charSequence3.length() || !g5(charSequence, charSequence2, false, 2, (Object) null) || !c3(charSequence, charSequence3, false, 2, (Object) null)) ? charSequence.subSequence(0, charSequence.length()) : charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length());
    }

    @g
    public static final String l5(@g String str, @g m mVar) {
        l0.p(str, "<this>");
        l0.p(mVar, "range");
        String substring = str.substring(mVar.c().intValue(), mVar.h().intValue() + 1);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C, java.lang.CharSequence] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <C extends java.lang.CharSequence & R, R> R m3(C r1, we.a<? extends R> r2) {
        /*
            java.lang.String r0 = "defaultValue"
            xe.l0.p(r2, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.n()
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.c0.m3(java.lang.CharSequence, we.a):java.lang.Object");
    }

    @g
    public static final String m4(@g String str, @g CharSequence charSequence) {
        l0.p(str, "<this>");
        l0.p(charSequence, "delimiter");
        return n4(str, charSequence, charSequence);
    }

    public static /* synthetic */ String m5(CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = charSequence.length();
        }
        l0.p(charSequence, "<this>");
        return charSequence.subSequence(i10, i11).toString();
    }

    public static final int n3(@g CharSequence charSequence, char c10, int i10, boolean z10) {
        l0.p(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return u3(charSequence, new char[]{c10}, i10, z10);
    }

    @g
    public static final String n4(@g String str, @g CharSequence charSequence, @g CharSequence charSequence2) {
        l0.p(str, "<this>");
        l0.p(charSequence, "prefix");
        l0.p(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !g5(str, charSequence, false, 2, (Object) null) || !c3(str, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @g
    public static final String n5(@g String str, char c10, @g String str2) {
        l0.p(str, "<this>");
        l0.p(str2, "missingDelimiterValue");
        int r32 = r3(str, c10, 0, false, 6, (Object) null);
        if (r32 == -1) {
            return str2;
        }
        String substring = str.substring(r32 + 1, str.length());
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int o3(@g CharSequence charSequence, @g String str, int i10, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return q3(charSequence, str, i10, charSequence.length(), z10, false, 16, (Object) null);
    }

    @f
    public static final String o4(CharSequence charSequence, o oVar, String str) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        l0.p(str, "replacement");
        return oVar.m(charSequence, str);
    }

    @g
    public static final String o5(@g String str, @g String str2, @g String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "missingDelimiterValue");
        int s32 = s3(str, str2, 0, false, 6, (Object) null);
        if (s32 == -1) {
            return str3;
        }
        String substring = str.substring(s32 + str2.length(), str.length());
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int p3(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        k mVar = !z11 ? new m(v.u(i10, 0), v.B(i11, charSequence.length())) : v.k0(v.B(i10, j3(charSequence)), v.u(i11, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int l10 = mVar.l();
            int m10 = mVar.m();
            int n10 = mVar.n();
            if ((n10 <= 0 || l10 > m10) && (n10 >= 0 || m10 > l10)) {
                return -1;
            }
            while (true) {
                if (b4(charSequence2, 0, charSequence, l10, charSequence2.length(), z10)) {
                    return l10;
                }
                if (l10 == m10) {
                    return -1;
                }
                l10 += n10;
            }
        } else {
            int l11 = mVar.l();
            int m11 = mVar.m();
            int n11 = mVar.n();
            if ((n11 <= 0 || l11 > m11) && (n11 >= 0 || m11 > l11)) {
                return -1;
            }
            while (true) {
                if (b0.e2((String) charSequence2, 0, (String) charSequence, l11, charSequence2.length(), z10)) {
                    return l11;
                }
                if (l11 == m11) {
                    return -1;
                }
                l11 += n11;
            }
        }
    }

    @f
    public static final String p4(CharSequence charSequence, o oVar, l<? super m, ? extends CharSequence> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(oVar, "regex");
        l0.p(lVar, "transform");
        return oVar.n(charSequence, lVar);
    }

    public static /* synthetic */ String p5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return n5(str, c10, str2);
    }

    public static /* synthetic */ int q3(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return p3(charSequence, charSequence2, i10, i11, z10, z11);
    }

    @g
    public static final String q4(@g String str, char c10, @g String str2, @g String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "replacement");
        l0.p(str3, "missingDelimiterValue");
        int r32 = r3(str, c10, 0, false, 6, (Object) null);
        return r32 == -1 ? str3 : J4(str, r32 + 1, str.length(), str2).toString();
    }

    public static /* synthetic */ String q5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return o5(str, str2, str3);
    }

    public static /* synthetic */ int r3(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return n3(charSequence, c10, i10, z10);
    }

    @g
    public static final String r4(@g String str, @g String str2, @g String str3, @g String str4) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "replacement");
        l0.p(str4, "missingDelimiterValue");
        int s32 = s3(str, str2, 0, false, 6, (Object) null);
        return s32 == -1 ? str4 : J4(str, s32 + str2.length(), str.length(), str3).toString();
    }

    @g
    public static final String r5(@g String str, char c10, @g String str2) {
        l0.p(str, "<this>");
        l0.p(str2, "missingDelimiterValue");
        int F3 = F3(str, c10, 0, false, 6, (Object) null);
        if (F3 == -1) {
            return str2;
        }
        String substring = str.substring(F3 + 1, str.length());
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ int s3(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return o3(charSequence, str, i10, z10);
    }

    public static /* synthetic */ String s4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return q4(str, c10, str2, str3);
    }

    @g
    public static final String s5(@g String str, @g String str2, @g String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "missingDelimiterValue");
        int G3 = G3(str, str2, 0, false, 6, (Object) null);
        if (G3 == -1) {
            return str3;
        }
        String substring = str.substring(G3 + str2.length(), str.length());
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int t3(@g CharSequence charSequence, @g Collection<String> collection, int i10, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(collection, "strings");
        u0<Integer, String> e32 = e3(charSequence, collection, i10, z10, false);
        if (e32 != null) {
            return e32.e().intValue();
        }
        return -1;
    }

    public static /* synthetic */ String t4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return r4(str, str2, str3, str4);
    }

    public static /* synthetic */ String t5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return r5(str, c10, str2);
    }

    public static final int u3(@g CharSequence charSequence, @g char[] cArr, int i10, boolean z10) {
        boolean z11;
        l0.p(charSequence, "<this>");
        l0.p(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            s0 o10 = new m(v.u(i10, 0), j3(charSequence)).iterator();
            while (o10.hasNext()) {
                int nextInt = o10.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z11 = false;
                        continue;
                        break;
                    } else if (e.J(cArr[i11], charAt, z10)) {
                        z11 = true;
                        continue;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    return nextInt;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(be.p.xt(cArr), i10);
    }

    @g
    public static final String u4(@g String str, char c10, @g String str2, @g String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "replacement");
        l0.p(str3, "missingDelimiterValue");
        int F3 = F3(str, c10, 0, false, 6, (Object) null);
        return F3 == -1 ? str3 : J4(str, F3 + 1, str.length(), str2).toString();
    }

    public static /* synthetic */ String u5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return s5(str, str2, str3);
    }

    public static /* synthetic */ int v3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return t3(charSequence, collection, i10, z10);
    }

    @g
    public static final String v4(@g String str, @g String str2, @g String str3, @g String str4) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "replacement");
        l0.p(str4, "missingDelimiterValue");
        int G3 = G3(str, str2, 0, false, 6, (Object) null);
        return G3 == -1 ? str4 : J4(str, G3 + str2.length(), str.length(), str3).toString();
    }

    @g
    public static final String v5(@g String str, char c10, @g String str2) {
        l0.p(str, "<this>");
        l0.p(str2, "missingDelimiterValue");
        int r32 = r3(str, c10, 0, false, 6, (Object) null);
        if (r32 == -1) {
            return str2;
        }
        String substring = str.substring(0, r32);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ int w3(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return u3(charSequence, cArr, i10, z10);
    }

    public static /* synthetic */ String w4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return u4(str, c10, str2, str3);
    }

    @g
    public static final String w5(@g String str, @g String str2, @g String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "missingDelimiterValue");
        int s32 = s3(str, str2, 0, false, 6, (Object) null);
        if (s32 == -1) {
            return str3;
        }
        String substring = str.substring(0, s32);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @f
    public static final boolean x3(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    public static /* synthetic */ String x4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return v4(str, str2, str3, str4);
    }

    public static /* synthetic */ String x5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return v5(str, c10, str2);
    }

    @f
    public static final boolean y3(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return !b0.V1(charSequence);
    }

    @g
    public static final String y4(@g String str, char c10, @g String str2, @g String str3) {
        l0.p(str, "<this>");
        l0.p(str2, "replacement");
        l0.p(str3, "missingDelimiterValue");
        int r32 = r3(str, c10, 0, false, 6, (Object) null);
        return r32 == -1 ? str3 : J4(str, 0, r32, str2).toString();
    }

    public static /* synthetic */ String y5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return w5(str, str2, str3);
    }

    @f
    public static final boolean z3(CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    @g
    public static final String z4(@g String str, @g String str2, @g String str3, @g String str4) {
        l0.p(str, "<this>");
        l0.p(str2, "delimiter");
        l0.p(str3, "replacement");
        l0.p(str4, "missingDelimiterValue");
        int s32 = s3(str, str2, 0, false, 6, (Object) null);
        return s32 == -1 ? str4 : J4(str, 0, s32, str3).toString();
    }

    @g
    public static final String z5(@g String str, char c10, @g String str2) {
        l0.p(str, "<this>");
        l0.p(str2, "missingDelimiterValue");
        int F3 = F3(str, c10, 0, false, 6, (Object) null);
        if (F3 == -1) {
            return str2;
        }
        String substring = str.substring(0, F3);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
