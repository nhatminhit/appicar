package a6;

import i5.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import q5.h;

public class k implements Serializable {
    public static final long S = 1;
    public final Class<Enum<?>> O;
    public final Enum<?>[] P;
    public final HashMap<String, Enum<?>> Q;
    public final Enum<?> R;

    public k(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> hashMap, Enum<?> enumR) {
        this.O = cls;
        this.P = enumArr;
        this.Q = hashMap;
        this.R = enumR;
    }

    public static k a(Class<Enum<?>> cls, b bVar) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            String[] v10 = bVar.v(cls, enumArr, new String[enumArr.length]);
            String[][] strArr = new String[v10.length][];
            bVar.t(cls, enumArr, strArr);
            HashMap hashMap = new HashMap();
            int length = enumArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                Enum enumR = enumArr[i10];
                String str = v10[i10];
                if (str == null) {
                    str = enumR.name();
                }
                hashMap.put(str, enumR);
                String[] strArr2 = strArr[i10];
                if (strArr2 != null) {
                    for (String str2 : strArr2) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, enumR);
                        }
                    }
                }
            }
            return new k(cls, enumArr, hashMap, bVar.m(cls));
        }
        throw new IllegalArgumentException("No enum constants for class " + cls.getName());
    }

    public static k c(Class<?> cls, b bVar) {
        return a(cls, bVar);
    }

    public static k d(Class<?> cls, h hVar, b bVar) {
        return f(cls, hVar, bVar);
    }

    public static k e(Class<?> cls, b bVar) {
        return h(cls, bVar);
    }

    public static k f(Class<Enum<?>> cls, h hVar, b bVar) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        HashMap hashMap = new HashMap();
        int length = enumArr.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum enumR = enumArr[length];
            try {
                Object r10 = hVar.r(enumR);
                if (r10 != null) {
                    hashMap.put(r10.toString(), enumR);
                }
            } catch (Exception e10) {
                throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + enumR + ": " + e10.getMessage());
            }
        }
        return new k(cls, enumArr, hashMap, bVar != null ? bVar.m(cls) : null);
    }

    @Deprecated
    public static k g(Class<Enum<?>> cls) {
        return h(cls, (b) null);
    }

    public static k h(Class<Enum<?>> cls, b bVar) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        HashMap hashMap = new HashMap();
        String[][] strArr = new String[enumArr.length][];
        bVar.t(cls, enumArr, strArr);
        int length = enumArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return new k(cls, enumArr, hashMap, bVar.m(cls));
            }
            Enum enumR = enumArr[length];
            hashMap.put(enumR.toString(), enumR);
            String[] strArr2 = strArr[length];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    if (!hashMap.containsKey(str)) {
                        hashMap.put(str, enumR);
                    }
                }
            }
        }
    }

    public i b() {
        return i.b(this.Q);
    }

    public Enum<?> i(String str) {
        return this.Q.get(str);
    }

    public Enum<?> j() {
        return this.R;
    }

    public Enum<?> k(int i10) {
        if (i10 < 0) {
            return null;
        }
        Enum<?>[] enumArr = this.P;
        if (i10 >= enumArr.length) {
            return null;
        }
        return enumArr[i10];
    }

    public Class<Enum<?>> l() {
        return this.O;
    }

    public Collection<String> m() {
        return this.Q.keySet();
    }

    public List<Enum<?>> n() {
        ArrayList arrayList = new ArrayList(this.P.length);
        for (Enum<?> add : this.P) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public Enum<?>[] o() {
        return this.P;
    }

    public int p() {
        return this.P.length - 1;
    }
}
