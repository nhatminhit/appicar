package oa;

import ja.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super T> f21317a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f21318b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21319c;

    public a() {
        Type g10 = g(getClass());
        this.f21318b = g10;
        this.f21317a = b.k(g10);
        this.f21319c = g10.hashCode();
    }

    public a(Type type) {
        Type b10 = b.b((Type) ja.a.b(type));
        this.f21318b = b10;
        this.f21317a = b.k(b10);
        this.f21319c = b10.hashCode();
    }

    public static AssertionError a(Type type, Class<?>... clsArr) {
        StringBuilder sb2 = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> name : clsArr) {
            sb2.append(name.getName());
            sb2.append(", ");
        }
        sb2.append("but got: ");
        sb2.append(type.getClass().getName());
        sb2.append(", for type token: ");
        sb2.append(type.toString());
        sb2.append('.');
        return new AssertionError(sb2.toString());
    }

    public static <T> a<T> b(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> c(Type type) {
        return new a<>(type);
    }

    public static a<?> d(Type type) {
        return new a<>(b.a(type));
    }

    public static a<?> e(Type type, Type... typeArr) {
        return new a<>(b.o((Type) null, type, typeArr));
    }

    public static Type g(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public static boolean k(Type type, GenericArrayType genericArrayType) {
        Class<?> cls;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            cls = ((GenericArrayType) type).getGenericComponentType();
        } else {
            boolean z10 = type instanceof Class;
            cls = type;
            if (z10) {
                Class<?> cls2 = (Class) type;
                while (cls2.isArray()) {
                    cls2 = cls2.getComponentType();
                }
                cls = cls2;
            }
        }
        return l(cls, (ParameterizedType) genericComponentType, new HashMap());
    }

    public static boolean l(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> k10 = b.k(type);
        ParameterizedType parameterizedType2 = null;
        if (type instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType) type;
        }
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable[] typeParameters = k10.getTypeParameters();
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                Type type2 = actualTypeArguments[i10];
                TypeVariable typeVariable = typeParameters[i10];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (o(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type l10 : k10.getGenericInterfaces()) {
            if (l(l10, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return l(k10.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    public static boolean n(Type type, Type type2, Map<String, Type> map) {
        return type2.equals(type) || ((type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName())));
    }

    public static boolean o(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            if (!n(actualTypeArguments[i10], actualTypeArguments2[i10], map)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f21318b, ((a) obj).f21318b);
    }

    public final Class<? super T> f() {
        return this.f21317a;
    }

    public final Type h() {
        return this.f21318b;
    }

    public final int hashCode() {
        return this.f21319c;
    }

    @Deprecated
    public boolean i(Class<?> cls) {
        return j(cls);
    }

    @Deprecated
    public boolean j(Type type) {
        if (type == null) {
            return false;
        }
        if (this.f21318b.equals(type)) {
            return true;
        }
        Type type2 = this.f21318b;
        if (type2 instanceof Class) {
            return this.f21317a.isAssignableFrom(b.k(type));
        }
        if (type2 instanceof ParameterizedType) {
            return l(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.f21317a.isAssignableFrom(b.k(type)) && k(type, (GenericArrayType) this.f21318b);
        }
        throw a(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    @Deprecated
    public boolean m(a<?> aVar) {
        return j(aVar.h());
    }

    public final String toString() {
        return b.u(this.f21318b);
    }
}
