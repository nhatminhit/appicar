package hf;

import be.p;
import fh.g;
import fh.h;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import we.l;
import xe.h0;
import xe.l0;
import zd.r;

@r
public final class x implements ParameterizedType, y {
    @g
    public final Class<?> O;
    @h
    public final Type P;
    @g
    public final Type[] Q;

    public /* synthetic */ class a extends h0 implements l<Type, String> {
        public static final a X = new a();

        public a() {
            super(1, b0.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @g
        /* renamed from: z0 */
        public final String A(@g Type type) {
            l0.p(type, "p0");
            return b0.j(type);
        }
    }

    public x(@g Class<?> cls, @h Type type, @g List<? extends Type> list) {
        l0.p(cls, "rawType");
        l0.p(list, "typeArguments");
        this.O = cls;
        this.P = type;
        this.Q = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return l0.g(this.O, parameterizedType.getRawType()) && l0.g(this.P, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }
    }

    @g
    public Type[] getActualTypeArguments() {
        return this.Q;
    }

    @h
    public Type getOwnerType() {
        return this.P;
    }

    @g
    public Type getRawType() {
        return this.O;
    }

    @g
    public String getTypeName() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        Type type = this.P;
        if (type != null) {
            sb2.append(b0.j(type));
            sb2.append("$");
            str = this.O.getSimpleName();
        } else {
            str = b0.j(this.O);
        }
        sb2.append(str);
        Type[] typeArr = this.Q;
        if (!(typeArr.length == 0)) {
            p.uh(typeArr, sb2, (CharSequence) null, "<", ">", 0, (CharSequence) null, a.X, 50, (Object) null);
        }
        String sb3 = sb2.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public int hashCode() {
        int hashCode = this.O.hashCode();
        Type type = this.P;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @g
    public String toString() {
        return getTypeName();
    }
}
