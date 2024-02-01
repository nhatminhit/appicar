package jh;

import gh.d;
import ih.c;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh.f;

public class b implements Iterable<a>, Cloneable {
    public static final String R = "data-";
    public static final char S = '/';
    public static final int T = 2;
    public static final int U = 2;
    public static final String[] V = new String[0];
    public static final int W = -1;
    public static final String X = "";
    public int O = 0;
    public String[] P;
    public String[] Q;

    public class a implements Iterator<a> {
        public int O = 0;

        public a() {
        }

        /* renamed from: a */
        public a next() {
            b bVar = b.this;
            String[] strArr = bVar.P;
            int i10 = this.O;
            a aVar = new a(strArr[i10], bVar.Q[i10], bVar);
            this.O++;
            return aVar;
        }

        public boolean hasNext() {
            while (this.O < b.this.O) {
                b bVar = b.this;
                if (!bVar.K(bVar.P[this.O])) {
                    break;
                }
                this.O++;
            }
            return this.O < b.this.O;
        }

        public void remove() {
            b bVar = b.this;
            int i10 = this.O - 1;
            this.O = i10;
            bVar.R(i10);
        }
    }

    /* renamed from: jh.b$b  reason: collision with other inner class name */
    public static class C0338b extends AbstractMap<String, String> {
        public final b O;

        /* renamed from: jh.b$b$a */
        public class a implements Iterator<Map.Entry<String, String>> {
            public Iterator<a> O;
            public a P;

            public a() {
                this.O = C0338b.this.O.iterator();
            }

            public /* synthetic */ a(C0338b bVar, a aVar) {
                this();
            }

            /* renamed from: a */
            public Map.Entry<String, String> next() {
                return new a(this.P.getKey().substring(5), this.P.getValue());
            }

            public boolean hasNext() {
                while (this.O.hasNext()) {
                    a next = this.O.next();
                    this.P = next;
                    if (next.q()) {
                        return true;
                    }
                }
                return false;
            }

            public void remove() {
                C0338b.this.O.S(this.P.getKey());
            }
        }

        /* renamed from: jh.b$b$b  reason: collision with other inner class name */
        public class C0339b extends AbstractSet<Map.Entry<String, String>> {
            public C0339b() {
            }

            public /* synthetic */ C0339b(C0338b bVar, a aVar) {
                this();
            }

            public Iterator<Map.Entry<String, String>> iterator() {
                return new a(C0338b.this, (a) null);
            }

            public int size() {
                int i10 = 0;
                while (new a(C0338b.this, (a) null).hasNext()) {
                    i10++;
                }
                return i10;
            }
        }

        public C0338b(b bVar) {
            this.O = bVar;
        }

        public /* synthetic */ C0338b(b bVar, a aVar) {
            this(bVar);
        }

        /* renamed from: c */
        public String put(String str, String str2) {
            String n10 = b.w(str);
            String z10 = this.O.D(n10) ? this.O.z(n10) : null;
            this.O.M(n10, str2);
            return z10;
        }

        public Set<Map.Entry<String, String>> entrySet() {
            return new C0339b(this, (a) null);
        }
    }

    public b() {
        String[] strArr = V;
        this.P = strArr;
        this.Q = strArr;
    }

    public static String J(String str) {
        return '/' + str;
    }

    public static String t(String str) {
        return str == null ? "" : str;
    }

    public static String[] v(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
        return strArr2;
    }

    public static String w(String str) {
        return R + str;
    }

    public String A(String str) {
        int I = I(str);
        return I == -1 ? "" : t(this.Q[I]);
    }

    public boolean B(String str) {
        int H = H(str);
        return (H == -1 || this.Q[H] == null) ? false : true;
    }

    public boolean C(String str) {
        int I = I(str);
        return (I == -1 || this.Q[I] == null) ? false : true;
    }

    public boolean D(String str) {
        return H(str) != -1;
    }

    public boolean E(String str) {
        return I(str) != -1;
    }

    public String F() {
        StringBuilder b10 = c.b();
        try {
            G(b10, new f("").I2());
            return c.o(b10);
        } catch (IOException e10) {
            throw new d((Throwable) e10);
        }
    }

    public final void G(Appendable appendable, f.a aVar) throws IOException {
        int i10 = this.O;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!K(this.P[i11])) {
                String str = this.P[i11];
                String str2 = this.Q[i11];
                appendable.append(p7.f.f11698i).append(str);
                if (!a.u(str, str2, aVar)) {
                    appendable.append("=\"");
                    if (str2 == null) {
                        str2 = "";
                    }
                    i.g(appendable, str2, aVar, true, false, false);
                    appendable.append('\"');
                }
            }
        }
    }

    public int H(String str) {
        hh.d.j(str);
        for (int i10 = 0; i10 < this.O; i10++) {
            if (str.equals(this.P[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final int I(String str) {
        hh.d.j(str);
        for (int i10 = 0; i10 < this.O; i10++) {
            if (str.equalsIgnoreCase(this.P[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean K(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    public void L() {
        for (int i10 = 0; i10 < this.O; i10++) {
            String[] strArr = this.P;
            strArr[i10] = ih.b.a(strArr[i10]);
        }
    }

    public b M(String str, String str2) {
        hh.d.j(str);
        int H = H(str);
        if (H != -1) {
            this.Q[H] = str2;
        } else {
            p(str, str2);
        }
        return this;
    }

    public b O(String str, boolean z10) {
        if (z10) {
            Q(str, (String) null);
        } else {
            S(str);
        }
        return this;
    }

    public b P(a aVar) {
        hh.d.j(aVar);
        M(aVar.getKey(), aVar.getValue());
        aVar.Q = this;
        return this;
    }

    public void Q(String str, String str2) {
        int I = I(str);
        if (I != -1) {
            this.Q[I] = str2;
            if (!this.P[I].equals(str)) {
                this.P[I] = str;
                return;
            }
            return;
        }
        p(str, str2);
    }

    public final void R(int i10) {
        hh.d.b(i10 >= this.O);
        int i11 = (this.O - i10) - 1;
        if (i11 > 0) {
            String[] strArr = this.P;
            int i12 = i10 + 1;
            System.arraycopy(strArr, i12, strArr, i10, i11);
            String[] strArr2 = this.Q;
            System.arraycopy(strArr2, i12, strArr2, i10, i11);
        }
        int i13 = this.O - 1;
        this.O = i13;
        this.P[i13] = null;
        this.Q[i13] = null;
    }

    public void S(String str) {
        int H = H(str);
        if (H != -1) {
            R(H);
        }
    }

    public void T(String str) {
        int I = I(str);
        if (I != -1) {
            R(I);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.O == bVar.O && Arrays.equals(this.P, bVar.P)) {
            return Arrays.equals(this.Q, bVar.Q);
        }
        return false;
    }

    public int hashCode() {
        return (((this.O * 31) + Arrays.hashCode(this.P)) * 31) + Arrays.hashCode(this.Q);
    }

    public boolean isEmpty() {
        return this.O == 0;
    }

    public Iterator<a> iterator() {
        return new a();
    }

    public b p(String str, String str2) {
        s(this.O + 1);
        String[] strArr = this.P;
        int i10 = this.O;
        strArr[i10] = str;
        this.Q[i10] = str2;
        this.O = i10 + 1;
        return this;
    }

    public void q(b bVar) {
        if (bVar.size() != 0) {
            s(this.O + bVar.O);
            Iterator<a> it = bVar.iterator();
            while (it.hasNext()) {
                P(it.next());
            }
        }
    }

    public List<a> r() {
        ArrayList arrayList = new ArrayList(this.O);
        for (int i10 = 0; i10 < this.O; i10++) {
            if (!K(this.P[i10])) {
                arrayList.add(new a(this.P[i10], this.Q[i10], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void s(int i10) {
        hh.d.d(i10 >= this.O);
        String[] strArr = this.P;
        int length = strArr.length;
        if (length < i10) {
            int i11 = 2;
            if (length >= 2) {
                i11 = 2 * this.O;
            }
            if (i10 <= i11) {
                i10 = i11;
            }
            this.P = v(strArr, i10);
            this.Q = v(this.Q, i10);
        }
    }

    public int size() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.O; i11++) {
            if (!K(this.P[i11])) {
                i10++;
            }
        }
        return i10;
    }

    public String toString() {
        return F();
    }

    /* renamed from: u */
    public b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.O = this.O;
            this.P = v(this.P, this.O);
            this.Q = v(this.Q, this.O);
            return bVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Map<String, String> x() {
        return new C0338b(this, (a) null);
    }

    public int y(kh.f fVar) {
        String str;
        int i10 = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean d10 = fVar.d();
        int i11 = 0;
        while (i10 < this.P.length) {
            int i12 = i10 + 1;
            int i13 = i12;
            while (true) {
                String[] strArr = this.P;
                if (i13 >= strArr.length || (str = strArr[i13]) == null) {
                    i10 = i12;
                } else {
                    if (!d10 || !strArr[i10].equals(str)) {
                        if (!d10) {
                            String[] strArr2 = this.P;
                            if (!strArr2[i10].equalsIgnoreCase(strArr2[i13])) {
                            }
                        }
                        i13++;
                    }
                    i11++;
                    R(i13);
                    i13--;
                    i13++;
                }
            }
            i10 = i12;
        }
        return i11;
    }

    public String z(String str) {
        int H = H(str);
        return H == -1 ? "" : t(this.Q[H]);
    }
}
