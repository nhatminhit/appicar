package lf;

import be.e0;
import be.w;
import be.x;
import fh.g;
import java.util.ArrayList;
import java.util.List;
import we.l;
import xe.l0;
import xe.n0;

public class u extends t {

    public static final class a extends n0 implements l<String, String> {
        public static final a P = new a();

        public a() {
            super(1);
        }

        @g
        /* renamed from: c */
        public final String A(@g String str) {
            l0.p(str, "line");
            return str;
        }
    }

    public static final class b extends n0 implements l<String, String> {
        public final /* synthetic */ String P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.P = str;
        }

        @g
        /* renamed from: c */
        public final String A(@g String str) {
            l0.p(str, "line");
            return this.P + str;
        }
    }

    public static final class c extends n0 implements l<String, String> {
        public final /* synthetic */ String P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.P = str;
        }

        @g
        /* renamed from: c */
        public final String A(@g String str) {
            l0.p(str, "it");
            if (b0.V1(str)) {
                return str.length() < this.P.length() ? this.P : str;
            }
            return this.P + str;
        }
    }

    public static final l<String, String> g(String str) {
        return str.length() == 0 ? a.P : new b(str);
    }

    public static final int h(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!d.r(str.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        return i10 == -1 ? str.length() : i10;
    }

    @g
    public static final String i(@g String str, @g String str2) {
        l0.p(str, "<this>");
        l0.p(str2, "indent");
        return p000if.u.e1(p000if.u.k1(c0.L3(str), new c(str2)), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
    }

    public static /* synthetic */ String j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    public static final String k(List<String> list, int i10, l<? super String, String> lVar, l<? super String, String> lVar2) {
        String A;
        int G = w.G(list);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (T next : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                w.W();
            }
            String str = (String) next;
            if ((i11 == 0 || i11 == G) && b0.V1(str)) {
                str = null;
            } else {
                String A2 = lVar2.A(str);
                if (!(A2 == null || (A = lVar.A(A2)) == null)) {
                    str = A;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i11 = i12;
        }
        String sb2 = ((StringBuilder) e0.f3(arrayList, new StringBuilder(i10), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124, (Object) null)).toString();
        l0.o(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    @g
    public static final String l(@g String str, @g String str2) {
        String A;
        l0.p(str, "<this>");
        l0.p(str2, "newIndent");
        List<String> M3 = c0.M3(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : M3) {
            if (!b0.V1((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(x.Y(arrayList, 10));
        for (String h10 : arrayList) {
            arrayList2.add(Integer.valueOf(h(h10)));
        }
        Integer num = (Integer) e0.c4(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * M3.size());
        l<String, String> g10 = g(str2);
        int G = w.G(M3);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : M3) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.W();
            }
            String str3 = (String) next2;
            if ((i10 == 0 || i10 == G) && b0.V1(str3)) {
                str3 = null;
            } else {
                String B6 = e0.B6(str3, intValue);
                if (!(B6 == null || (A = g10.A(B6)) == null)) {
                    str3 = A;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        String sb2 = ((StringBuilder) e0.f3(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124, (Object) null)).toString();
        l0.o(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static /* synthetic */ String m(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        return l(str, str2);
    }

    @g
    public static final String n(@g String str, @g String str2, @g String str3) {
        int i10;
        String A;
        l0.p(str, "<this>");
        l0.p(str2, "newIndent");
        l0.p(str3, "marginPrefix");
        if (!b0.V1(str3)) {
            List<String> M3 = c0.M3(str);
            int length = str.length() + (str2.length() * M3.size());
            l<String, String> g10 = g(str2);
            int G = w.G(M3);
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            for (T next : M3) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    w.W();
                }
                String str4 = (String) next;
                String str5 = null;
                if ((i11 == 0 || i11 == G) && b0.V1(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length2) {
                            i10 = -1;
                            break;
                        } else if (!d.r(str4.charAt(i13))) {
                            i10 = i13;
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i10 != -1) {
                        int i14 = i10;
                        if (b0.u2(str4, str3, i10, false, 4, (Object) null)) {
                            l0.n(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(i14 + str3.length());
                            l0.o(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (!(str5 == null || (A = g10.A(str5)) == null)) {
                        str4 = A;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i11 = i12;
            }
            String sb2 = ((StringBuilder) e0.f3(arrayList, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124, (Object) null)).toString();
            l0.o(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static /* synthetic */ String o(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        if ((i10 & 2) != 0) {
            str3 = "|";
        }
        return n(str, str2, str3);
    }

    @g
    @oe.g
    public static final String p(@g String str) {
        l0.p(str, "<this>");
        return l(str, "");
    }

    @g
    @oe.g
    public static final String q(@g String str, @g String str2) {
        l0.p(str, "<this>");
        l0.p(str2, "marginPrefix");
        return n(str, "", str2);
    }

    public static /* synthetic */ String r(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return q(str, str2);
    }
}
