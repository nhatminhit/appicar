package a6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class i implements Serializable {
    public static final long R = 1;
    public static final i S = new i(1, 0, new Object[4]);
    public final int O;
    public final int P;
    public final Object[] Q;

    public i(int i10, int i11, Object[] objArr) {
        this.O = i10;
        this.P = i11;
        this.Q = objArr;
    }

    public static <T> i b(Map<String, T> map) {
        if (map.isEmpty()) {
            return S;
        }
        int e10 = e(map.size());
        int i10 = e10 - 1;
        int i11 = (e10 >> 1) + e10;
        Object[] objArr = new Object[(i11 * 2)];
        int i12 = 0;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (str != null) {
                int hashCode = str.hashCode() & i10;
                int i13 = hashCode + hashCode;
                if (objArr[i13] != null) {
                    i13 = ((hashCode >> 1) + e10) << 1;
                    if (objArr[i13] != null) {
                        i13 = (i11 << 1) + i12;
                        i12 += 2;
                        if (i13 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i13] = str;
                objArr[i13 + 1] = next.getValue();
            }
        }
        return new i(i10, i12, objArr);
    }

    public static final int e(int i10) {
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

    public final Object a(String str, int i10, Object obj) {
        if (obj == null) {
            return null;
        }
        int i11 = this.O + 1;
        int i12 = ((i10 >> 1) + i11) << 1;
        Object obj2 = this.Q[i12];
        if (str.equals(obj2)) {
            return this.Q[i12 + 1];
        }
        if (obj2 != null) {
            int i13 = (i11 + (i11 >> 1)) << 1;
            int i14 = this.P + i13;
            while (i13 < i14) {
                Object obj3 = this.Q[i13];
                if (obj3 == str || str.equals(obj3)) {
                    return this.Q[i13 + 1];
                }
                i13 += 2;
            }
        }
        return null;
    }

    public Object c(String str) {
        int hashCode = str.hashCode() & this.O;
        int i10 = hashCode << 1;
        Object obj = this.Q[i10];
        return (obj == str || str.equals(obj)) ? this.Q[i10 + 1] : a(str, hashCode, obj);
    }

    public Object d(String str) {
        int length = this.Q.length;
        for (int i10 = 0; i10 < length; i10 += 2) {
            Object obj = this.Q[i10];
            if (obj != null && ((String) obj).equalsIgnoreCase(str)) {
                return this.Q[i10 + 1];
            }
        }
        return null;
    }

    public List<String> f() {
        int length = this.Q.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i10 = 0; i10 < length; i10 += 2) {
            Object obj = this.Q[i10];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
