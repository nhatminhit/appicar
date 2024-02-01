package me;

import fh.g;
import java.io.Serializable;
import java.lang.Enum;
import xe.l0;
import xe.w;

public final class d<E extends Enum<E>> implements Serializable {
    @g
    public static final a P = new a((w) null);
    @Deprecated
    public static final long Q = 0;
    @g
    public final Class<E> O;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public d(@g E[] eArr) {
        l0.p(eArr, "entries");
        Class<?> componentType = eArr.getClass().getComponentType();
        l0.m(componentType);
        this.O = componentType;
    }

    public final Object a() {
        Object[] enumConstants = this.O.getEnumConstants();
        l0.o(enumConstants, "c.enumConstants");
        return b.b((Enum[]) enumConstants);
    }
}
