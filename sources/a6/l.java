package a6;

import i5.c0;
import i5.d0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import k5.i;
import w4.u;

public final class l implements Serializable {
    public static final long S = 1;
    public final Class<Enum<?>> O;
    public final Enum<?>[] P;
    public final u[] Q;
    public transient EnumMap<?, u> R;

    public l(Class<Enum<?>> cls, u[] uVarArr) {
        this.O = cls;
        this.P = (Enum[]) cls.getEnumConstants();
        this.Q = uVarArr;
    }

    public static l a(c0 c0Var, Class<Enum<?>> cls) {
        return c0Var.P0(d0.f9049e0) ? e(c0Var, cls) : d(c0Var, cls);
    }

    public static l b(Class<Enum<?>> cls, u[] uVarArr) {
        return new l(cls, uVarArr);
    }

    public static l c(i<?> iVar, Class<Enum<?>> cls, List<String> list) {
        int size = list.size();
        u[] uVarArr = new u[size];
        for (int i10 = 0; i10 < size; i10++) {
            uVarArr[i10] = iVar.e(list.get(i10));
        }
        return b(cls, uVarArr);
    }

    public static l d(i<?> iVar, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> r10 = h.r(cls);
        Enum[] enumArr = (Enum[]) r10.getEnumConstants();
        if (enumArr != null) {
            String[] v10 = iVar.m().v(r10, enumArr, new String[enumArr.length]);
            u[] uVarArr = new u[enumArr.length];
            int length = enumArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                Enum enumR = enumArr[i10];
                String str = v10[i10];
                if (str == null) {
                    str = enumR.name();
                }
                uVarArr[enumR.ordinal()] = iVar.e(str);
            }
            return b(cls, uVarArr);
        }
        throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
    }

    public static l e(i<?> iVar, Class<Enum<?>> cls) {
        Enum[] enumArr = (Enum[]) h.r(cls).getEnumConstants();
        if (enumArr != null) {
            ArrayList arrayList = new ArrayList(enumArr.length);
            for (Enum enumR : enumArr) {
                arrayList.add(enumR.toString());
            }
            return c(iVar, cls, arrayList);
        }
        throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
    }

    public List<Enum<?>> f() {
        return Arrays.asList(this.P);
    }

    public Class<Enum<?>> g() {
        return this.O;
    }

    public EnumMap<?, u> h() {
        EnumMap<?, u> enumMap = this.R;
        if (enumMap != null) {
            return enumMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Enum<?> enumR : this.P) {
            linkedHashMap.put(enumR, this.Q[enumR.ordinal()]);
        }
        return new EnumMap<>(linkedHashMap);
    }

    public u i(Enum<?> enumR) {
        return this.Q[enumR.ordinal()];
    }

    public Collection<u> j() {
        return Arrays.asList(this.Q);
    }
}
