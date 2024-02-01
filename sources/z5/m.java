package z5;

import a6.h;
import i5.j;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class m implements Serializable {
    public static final long S = 1;
    public static final String[] T;
    public static final j[] U;
    public static final m V;
    public final String[] O;
    public final j[] P;
    public final String[] Q;
    public final int R;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f15876a;

        /* renamed from: b  reason: collision with root package name */
        public final j[] f15877b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15878c;

        public a(Class<?> cls, j[] jVarArr, int i10) {
            this.f15876a = cls;
            this.f15877b = jVarArr;
            this.f15878c = i10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f15878c == aVar.f15878c && this.f15876a == aVar.f15876a) {
                j[] jVarArr = aVar.f15877b;
                int length = this.f15877b.length;
                if (length == jVarArr.length) {
                    for (int i10 = 0; i10 < length; i10++) {
                        if (!this.f15877b[i10].equals(jVarArr[i10])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f15878c;
        }

        public String toString() {
            return this.f15876a.getName() + "<>";
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final TypeVariable<?>[] f15879a = AbstractList.class.getTypeParameters();

        /* renamed from: b  reason: collision with root package name */
        public static final TypeVariable<?>[] f15880b = Collection.class.getTypeParameters();

        /* renamed from: c  reason: collision with root package name */
        public static final TypeVariable<?>[] f15881c = Iterable.class.getTypeParameters();

        /* renamed from: d  reason: collision with root package name */
        public static final TypeVariable<?>[] f15882d = List.class.getTypeParameters();

        /* renamed from: e  reason: collision with root package name */
        public static final TypeVariable<?>[] f15883e = ArrayList.class.getTypeParameters();

        /* renamed from: f  reason: collision with root package name */
        public static final TypeVariable<?>[] f15884f = Map.class.getTypeParameters();

        /* renamed from: g  reason: collision with root package name */
        public static final TypeVariable<?>[] f15885g = HashMap.class.getTypeParameters();

        /* renamed from: h  reason: collision with root package name */
        public static final TypeVariable<?>[] f15886h = LinkedHashMap.class.getTypeParameters();

        public static TypeVariable<?>[] a(Class<?> cls) {
            return cls == Collection.class ? f15880b : cls == List.class ? f15882d : cls == ArrayList.class ? f15883e : cls == AbstractList.class ? f15879a : cls == Iterable.class ? f15881c : cls.getTypeParameters();
        }

        public static TypeVariable<?>[] b(Class<?> cls) {
            return cls == Map.class ? f15884f : cls == HashMap.class ? f15885g : cls == LinkedHashMap.class ? f15886h : cls.getTypeParameters();
        }
    }

    static {
        String[] strArr = new String[0];
        T = strArr;
        j[] jVarArr = new j[0];
        U = jVarArr;
        V = new m(strArr, jVarArr, (String[]) null);
    }

    public m(String[] strArr, j[] jVarArr, String[] strArr2) {
        strArr = strArr == null ? T : strArr;
        this.O = strArr;
        jVarArr = jVarArr == null ? U : jVarArr;
        this.P = jVarArr;
        if (strArr.length == jVarArr.length) {
            int length = jVarArr.length;
            int i10 = 1;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this.P[i11].hashCode();
            }
            this.Q = strArr2;
            this.R = i10;
            return;
        }
        throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + jVarArr.length + ")");
    }

    public static m b(Class<?> cls, j jVar) {
        TypeVariable[] a10 = b.a(cls);
        int length = a10 == null ? 0 : a10.length;
        if (length == 1) {
            return new m(new String[]{a10[0].getName()}, new j[]{jVar}, (String[]) null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static m c(Class<?> cls, j jVar, j jVar2) {
        TypeVariable[] b10 = b.b(cls);
        int length = b10 == null ? 0 : b10.length;
        if (length == 2) {
            return new m(new String[]{b10[0].getName(), b10[1].getName()}, new j[]{jVar, jVar2}, (String[]) null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }

    public static m d(Class<?> cls, List<j> list) {
        return e(cls, (list == null || list.isEmpty()) ? U : (j[]) list.toArray(U));
    }

    public static m e(Class<?> cls, j[] jVarArr) {
        String[] strArr;
        if (jVarArr == null) {
            jVarArr = U;
        } else {
            int length = jVarArr.length;
            if (length == 1) {
                return b(cls, jVarArr[0]);
            }
            if (length == 2) {
                return c(cls, jVarArr[0], jVarArr[1]);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = T;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                strArr[i10] = typeParameters[i10].getName();
            }
        }
        if (strArr.length == jVarArr.length) {
            return new m(strArr, jVarArr, (String[]) null);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot create TypeBindings for class ");
        sb2.append(cls.getName());
        sb2.append(" with ");
        sb2.append(jVarArr.length);
        sb2.append(" type parameter");
        sb2.append(jVarArr.length == 1 ? "" : "s");
        sb2.append(": class expects ");
        sb2.append(strArr.length);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static m f(Class<?> cls, j jVar) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return V;
        }
        if (length == 1) {
            return new m(new String[]{typeParameters[0].getName()}, new j[]{jVar}, (String[]) null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static m g(Class<?> cls, j[] jVarArr) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return V;
        }
        if (jVarArr == null) {
            jVarArr = U;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = typeParameters[i10].getName();
        }
        if (length == jVarArr.length) {
            return new m(strArr, jVarArr, (String[]) null);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot create TypeBindings for class ");
        sb2.append(cls.getName());
        sb2.append(" with ");
        sb2.append(jVarArr.length);
        sb2.append(" type parameter");
        sb2.append(jVarArr.length == 1 ? "" : "s");
        sb2.append(": class expects ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static m h() {
        return V;
    }

    public Object a(Class<?> cls) {
        return new a(cls, this.P, this.R);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!h.O(obj, getClass())) {
            return false;
        }
        m mVar = (m) obj;
        int length = this.P.length;
        if (length != mVar.p()) {
            return false;
        }
        j[] jVarArr = mVar.P;
        for (int i10 = 0; i10 < length; i10++) {
            if (!jVarArr[i10].equals(this.P[i10])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.R;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = ((z5.j) r4).m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.j i(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String[] r0 = r3.O
            int r0 = r0.length
            r1 = 0
        L_0x0004:
            if (r1 >= r0) goto L_0x0026
            java.lang.String[] r2 = r3.O
            r2 = r2[r1]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0023
            i5.j[] r4 = r3.P
            r4 = r4[r1]
            boolean r0 = r4 instanceof z5.j
            if (r0 == 0) goto L_0x0022
            r0 = r4
            z5.j r0 = (z5.j) r0
            i5.j r0 = r0.m0()
            if (r0 == 0) goto L_0x0022
            r4 = r0
        L_0x0022:
            return r4
        L_0x0023:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0026:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.m.i(java.lang.String):i5.j");
    }

    public String j(int i10) {
        if (i10 < 0) {
            return null;
        }
        String[] strArr = this.O;
        if (i10 >= strArr.length) {
            return null;
        }
        return strArr[i10];
    }

    public j k(int i10) {
        if (i10 < 0) {
            return null;
        }
        j[] jVarArr = this.P;
        if (i10 >= jVarArr.length) {
            return null;
        }
        return jVarArr[i10];
    }

    public List<j> l() {
        j[] jVarArr = this.P;
        return jVarArr.length == 0 ? Collections.emptyList() : Arrays.asList(jVarArr);
    }

    public boolean m(String str) {
        String[] strArr = this.Q;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this.Q[length]));
        return true;
    }

    public boolean n() {
        return this.P.length == 0;
    }

    public Object o() {
        String[] strArr = this.O;
        return (strArr == null || strArr.length == 0) ? V : this;
    }

    public int p() {
        return this.P.length;
    }

    public j[] q() {
        return this.P;
    }

    public m r(String str) {
        String[] strArr = this.Q;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr, length + 1);
        strArr2[length] = str;
        return new m(this.O, this.P, strArr2);
    }

    public String toString() {
        if (this.P.length == 0) {
            return "<>";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('<');
        int length = this.P.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 > 0) {
                sb2.append(',');
            }
            sb2.append(this.P[i10].L());
        }
        sb2.append('>');
        return sb2.toString();
    }
}
