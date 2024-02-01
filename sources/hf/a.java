package hf;

import fh.g;
import fh.h;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import og.c0;
import xe.l0;
import zd.r;

@r
public final class a implements GenericArrayType, y {
    @g
    public final Type O;

    public a(@g Type type) {
        l0.p(type, "elementType");
        this.O = type;
    }

    public boolean equals(@h Object obj) {
        return (obj instanceof GenericArrayType) && l0.g(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @g
    public Type getGenericComponentType() {
        return this.O;
    }

    @g
    public String getTypeName() {
        return b0.j(this.O) + c0.f21474n;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @g
    public String toString() {
        return getTypeName();
    }
}
