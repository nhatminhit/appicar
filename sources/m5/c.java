package m5;

import a6.h;
import a6.s;
import i5.g;
import i5.l;
import i5.q;
import i5.y;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import k5.i;
import l5.v;
import w4.n;

public class c implements Iterable<v>, Serializable {
    public static final long X = 2;
    public final boolean O;
    public int P;
    public int Q;
    public int R;
    public Object[] S;
    public final v[] T;
    public final Map<String, List<y>> U;
    public final Map<String, String> V;
    public final Locale W;

    public c(c cVar, v vVar, int i10, int i11) {
        this.O = cVar.O;
        this.W = cVar.W;
        this.P = cVar.P;
        this.Q = cVar.Q;
        this.R = cVar.R;
        this.U = cVar.U;
        this.V = cVar.V;
        Object[] objArr = cVar.S;
        this.S = Arrays.copyOf(objArr, objArr.length);
        v[] vVarArr = cVar.T;
        v[] vVarArr2 = (v[]) Arrays.copyOf(vVarArr, vVarArr.length);
        this.T = vVarArr2;
        this.S[i10] = vVar;
        vVarArr2[i11] = vVar;
    }

    public c(c cVar, v vVar, String str, int i10) {
        this.O = cVar.O;
        this.W = cVar.W;
        this.P = cVar.P;
        this.Q = cVar.Q;
        this.R = cVar.R;
        this.U = cVar.U;
        this.V = cVar.V;
        Object[] objArr = cVar.S;
        this.S = Arrays.copyOf(objArr, objArr.length);
        v[] vVarArr = cVar.T;
        int length = vVarArr.length;
        v[] vVarArr2 = (v[]) Arrays.copyOf(vVarArr, length + 1);
        this.T = vVarArr2;
        vVarArr2[length] = vVar;
        int i11 = this.P + 1;
        int i12 = i10 << 1;
        Object[] objArr2 = this.S;
        if (objArr2[i12] != null) {
            i12 = ((i10 >> 1) + i11) << 1;
            if (objArr2[i12] != null) {
                int i13 = this.R;
                i12 = ((i11 + (i11 >> 1)) << 1) + i13;
                this.R = i13 + 2;
                if (i12 >= objArr2.length) {
                    this.S = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this.S;
        objArr3[i12] = str;
        objArr3[i12 + 1] = vVar;
    }

    public c(c cVar, boolean z10) {
        this.O = z10;
        this.W = cVar.W;
        this.U = cVar.U;
        this.V = cVar.V;
        v[] vVarArr = cVar.T;
        v[] vVarArr2 = (v[]) Arrays.copyOf(vVarArr, vVarArr.length);
        this.T = vVarArr2;
        y(Arrays.asList(vVarArr2));
    }

    @Deprecated
    public c(boolean z10, Collection<v> collection) {
        this(z10, collection, (Map<String, List<y>>) Collections.emptyMap(), Locale.getDefault());
    }

    @Deprecated
    public c(boolean z10, Collection<v> collection, Map<String, List<y>> map) {
        this(z10, collection, map, Locale.getDefault());
    }

    public c(boolean z10, Collection<v> collection, Map<String, List<y>> map, Locale locale) {
        this.O = z10;
        this.T = (v[]) collection.toArray(new v[collection.size()]);
        this.U = map;
        this.W = locale;
        this.V = b(map, z10, locale);
        y(collection);
    }

    @Deprecated
    public static c o(Collection<v> collection, boolean z10) {
        return p(collection, z10, Collections.emptyMap());
    }

    @Deprecated
    public static c p(Collection<v> collection, boolean z10, Map<String, List<y>> map) {
        return new c(z10, collection, map);
    }

    public static c q(i<?> iVar, Collection<v> collection, Map<String, List<y>> map) {
        return new c(iVar.T(q.ACCEPT_CASE_INSENSITIVE_PROPERTIES), collection, map, iVar.H());
    }

    public static final int u(int i10) {
        if (i10 <= 5) {
            return 8;
        }
        if (i10 <= 12) {
            return 16;
        }
        int i11 = 32;
        while (i11 < i10 + (i10 >> 2)) {
            i11 += i11;
        }
        return i11;
    }

    public void A(v vVar) {
        ArrayList arrayList = new ArrayList(this.Q);
        String w10 = w(vVar);
        int length = this.S.length;
        boolean z10 = false;
        for (int i10 = 1; i10 < length; i10 += 2) {
            Object[] objArr = this.S;
            v vVar2 = (v) objArr[i10];
            if (vVar2 != null) {
                if (z10 || !(z10 = w10.equals(objArr[i10 - 1]))) {
                    arrayList.add(vVar2);
                } else {
                    this.T[f(vVar2)] = null;
                }
            }
        }
        if (z10) {
            y(arrayList);
            return;
        }
        throw new NoSuchElementException("No entry '" + vVar.getName() + "' found, can't remove");
    }

    public c B(s sVar) {
        if (sVar == null || sVar == s.O) {
            return this;
        }
        ArrayList arrayList = new ArrayList(r0);
        for (v vVar : this.T) {
            if (vVar != null) {
                vVar = m(vVar, sVar);
            }
            arrayList.add(vVar);
        }
        return new c(this.O, arrayList, this.U);
    }

    @Deprecated
    public void C(v vVar) {
        String w10 = w(vVar);
        int h10 = h(w10);
        if (h10 >= 0) {
            Object[] objArr = this.S;
            objArr[h10] = vVar;
            this.T[f((v) objArr[h10])] = vVar;
            return;
        }
        throw new NoSuchElementException("No entry '" + w10 + "' found, can't replace");
    }

    public void D(v vVar, v vVar2) {
        int length = this.S.length;
        for (int i10 = 1; i10 <= length; i10 += 2) {
            Object[] objArr = this.S;
            if (objArr[i10] == vVar) {
                objArr[i10] = vVar2;
                this.T[f(vVar)] = vVar2;
                return;
            }
        }
        throw new NoSuchElementException("No entry '" + vVar.getName() + "' found, can't replace");
    }

    public c E(boolean z10) {
        return this.O == z10 ? this : new c(this, z10);
    }

    public c F(v vVar) {
        String w10 = w(vVar);
        int length = this.S.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            v vVar2 = (v) this.S[i10];
            if (vVar2 != null && vVar2.getName().equals(w10)) {
                return new c(this, vVar, i10, f(vVar2));
            }
        }
        return new c(this, vVar, w10, j(w10));
    }

    public c G(Collection<String> collection) {
        if (collection.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList(r0);
        for (v vVar : this.T) {
            if (vVar != null && !collection.contains(vVar.getName())) {
                arrayList.add(vVar);
            }
        }
        return new c(this.O, arrayList, this.U);
    }

    public void H(Throwable th2, Object obj, String str, g gVar) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        h.o0(th2);
        boolean z10 = gVar == null || gVar.v0(i5.h.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z10 || !(th2 instanceof n)) {
                throw ((IOException) th2);
            }
        } else if (!z10) {
            h.q0(th2);
        }
        throw l.y(th2, obj, str);
    }

    public final Map<String, String> b(Map<String, List<y>> map, boolean z10, Locale locale) {
        if (map == null || map.isEmpty()) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (z10) {
                str = str.toLowerCase(locale);
            }
            for (y d10 : (List) next.getValue()) {
                String d11 = d10.d();
                if (z10) {
                    d11 = d11.toLowerCase(locale);
                }
                hashMap.put(d11, str);
            }
        }
        return hashMap;
    }

    public final v c(String str, int i10, Object obj) {
        if (obj == null) {
            return i(this.V.get(str));
        }
        int i11 = this.P + 1;
        int i12 = ((i10 >> 1) + i11) << 1;
        Object obj2 = this.S[i12];
        if (str.equals(obj2)) {
            return (v) this.S[i12 + 1];
        }
        if (obj2 != null) {
            int i13 = (i11 + (i11 >> 1)) << 1;
            int i14 = this.R + i13;
            while (i13 < i14) {
                Object obj3 = this.S[i13];
                if (obj3 == str || str.equals(obj3)) {
                    return (v) this.S[i13 + 1];
                }
                i13 += 2;
            }
        }
        return i(this.V.get(str));
    }

    public final v e(String str, int i10, Object obj) {
        Object obj2;
        int i11 = this.P + 1;
        int i12 = ((i10 >> 1) + i11) << 1;
        Object obj3 = this.S[i12];
        if (str.equals(obj3)) {
            obj2 = this.S[i12 + 1];
        } else if (obj3 == null) {
            return null;
        } else {
            int i13 = (i11 + (i11 >> 1)) << 1;
            int i14 = this.R + i13;
            while (i13 < i14) {
                Object obj4 = this.S[i13];
                if (obj4 == str || str.equals(obj4)) {
                    obj2 = this.S[i13 + 1];
                } else {
                    i13 += 2;
                }
            }
            return null;
        }
        return (v) obj2;
    }

    public final int f(v vVar) {
        int length = this.T.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.T[i10] == vVar) {
                return i10;
            }
        }
        throw new IllegalStateException("Illegal state: property '" + vVar.getName() + "' missing from _propsInOrder");
    }

    public final int h(String str) {
        int j10 = j(str);
        int i10 = j10 << 1;
        if (str.equals(this.S[i10])) {
            return i10 + 1;
        }
        int i11 = this.P + 1;
        int i12 = ((j10 >> 1) + i11) << 1;
        if (str.equals(this.S[i12])) {
            return i12 + 1;
        }
        int i13 = (i11 + (i11 >> 1)) << 1;
        int i14 = this.R + i13;
        while (i13 < i14) {
            if (str.equals(this.S[i13])) {
                return i13 + 1;
            }
            i13 += 2;
        }
        return -1;
    }

    public final v i(String str) {
        if (str == null) {
            return null;
        }
        int j10 = j(str);
        int i10 = j10 << 1;
        Object obj = this.S[i10];
        if (str.equals(obj)) {
            return (v) this.S[i10 + 1];
        }
        if (obj == null) {
            return null;
        }
        return e(str, j10, obj);
    }

    public Iterator<v> iterator() {
        return l().iterator();
    }

    public final int j(String str) {
        return str.hashCode() & this.P;
    }

    public final List<v> l() {
        ArrayList arrayList = new ArrayList(this.Q);
        int length = this.S.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            v vVar = (v) this.S[i10];
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r3 = r0.v(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l5.v m(l5.v r2, a6.s r3) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0003
            return r2
        L_0x0003:
            java.lang.String r0 = r2.getName()
            java.lang.String r0 = r3.d(r0)
            l5.v r2 = r2.U(r0)
            i5.k r0 = r2.E()
            if (r0 == 0) goto L_0x001f
            i5.k r3 = r0.v(r3)
            if (r3 == r0) goto L_0x001f
            l5.v r2 = r2.V(r3)
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.c.m(l5.v, a6.s):l5.v");
    }

    public c n() {
        int length = this.S.length;
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11 += 2) {
            v vVar = (v) this.S[i11];
            if (vVar != null) {
                vVar.r(i10);
                i10++;
            }
        }
        return this;
    }

    public v r(int i10) {
        int length = this.S.length;
        for (int i11 = 1; i11 < length; i11 += 2) {
            v vVar = (v) this.S[i11];
            if (vVar != null && i10 == vVar.D()) {
                return vVar;
            }
        }
        return null;
    }

    public v s(String str) {
        if (str != null) {
            if (this.O) {
                str = str.toLowerCase(this.W);
            }
            int hashCode = str.hashCode() & this.P;
            int i10 = hashCode << 1;
            Object obj = this.S[i10];
            return (obj == str || str.equals(obj)) ? (v) this.S[i10 + 1] : c(str, hashCode, obj);
        }
        throw new IllegalArgumentException("Cannot pass null property name");
    }

    public int size() {
        return this.Q;
    }

    public boolean t(w4.l lVar, g gVar, Object obj, String str) throws IOException {
        v s10 = s(str);
        if (s10 == null) {
            return false;
        }
        try {
            s10.t(lVar, gVar, obj);
            return true;
        } catch (Exception e10) {
            H(e10, obj, str, gVar);
            return true;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Properties=[");
        Iterator<v> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            v next = it.next();
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(next.getName());
            sb2.append('(');
            sb2.append(next.e());
            sb2.append(')');
            i10 = i11;
        }
        sb2.append(']');
        if (!this.U.isEmpty()) {
            sb2.append("(aliases: ");
            sb2.append(this.U);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public v[] v() {
        return this.T;
    }

    public final String w(v vVar) {
        boolean z10 = this.O;
        String name = vVar.getName();
        return z10 ? name.toLowerCase(this.W) : name;
    }

    public boolean x() {
        return !this.U.isEmpty();
    }

    public void y(Collection<v> collection) {
        int size = collection.size();
        this.Q = size;
        int u10 = u(size);
        this.P = u10 - 1;
        int i10 = (u10 >> 1) + u10;
        Object[] objArr = new Object[(i10 * 2)];
        int i11 = 0;
        for (v next : collection) {
            if (next != null) {
                String w10 = w(next);
                int j10 = j(w10);
                int i12 = j10 << 1;
                if (objArr[i12] != null) {
                    i12 = ((j10 >> 1) + u10) << 1;
                    if (objArr[i12] != null) {
                        i12 = (i10 << 1) + i11;
                        i11 += 2;
                        if (i12 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i12] = w10;
                objArr[i12 + 1] = next;
            }
        }
        this.S = objArr;
        this.R = i11;
    }

    public boolean z() {
        return this.O;
    }
}
