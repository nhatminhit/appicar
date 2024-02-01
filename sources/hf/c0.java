package hf;

import fh.g;
import fh.h;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import xe.l0;
import xe.w;
import zd.r;

@r
public final class c0 implements WildcardType, y {
    @g
    public static final a Q = new a((w) null);
    @g
    public static final c0 R = new c0((Type) null, (Type) null);
    @h
    public final Type O;
    @h
    public final Type P;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @g
        public final c0 a() {
            return c0.R;
        }
    }

    public c0(@h Type type, @h Type type2) {
        this.O = type;
        this.P = type2;
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
        }
    }

    @g
    public Type[] getLowerBounds() {
        Type type = this.P;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    @g
    public String getTypeName() {
        StringBuilder sb2;
        Type type;
        if (this.P != null) {
            sb2 = new StringBuilder();
            sb2.append("? super ");
            type = this.P;
        } else {
            Type type2 = this.O;
            if (type2 == null || l0.g(type2, Object.class)) {
                return "?";
            }
            sb2 = new StringBuilder();
            sb2.append("? extends ");
            type = this.O;
        }
        sb2.append(b0.j(type));
        return sb2.toString();
    }

    @g
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.O;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @g
    public String toString() {
        return getTypeName();
    }
}
