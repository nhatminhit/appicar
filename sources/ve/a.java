package ve;

import fh.g;
import fh.h;
import hf.d;
import java.lang.annotation.Annotation;
import oe.f;
import xe.l0;
import xe.l1;
import xe.t;
import zd.b1;
import zd.h1;
import zd.k;
import zd.m;

@h(name = "JvmClassMappingKt")
public final class a {
    @g
    public static final <T extends Annotation> d<? extends T> a(@g T t10) {
        l0.p(t10, "<this>");
        Class<? extends Annotation> annotationType = t10.annotationType();
        l0.o(annotationType, "this as java.lang.annota…otation).annotationType()");
        d<? extends T> i10 = i(annotationType);
        l0.n(i10, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return i10;
    }

    public static final <E extends Enum<E>> Class<E> b(Enum<E> enumR) {
        l0.p(enumR, "<this>");
        Class<E> declaringClass = enumR.getDeclaringClass();
        l0.o(declaringClass, "this as java.lang.Enum<E>).declaringClass");
        return declaringClass;
    }

    @h1(version = "1.7")
    @f
    public static /* synthetic */ void c(Enum enumR) {
    }

    @g
    @h(name = "getJavaClass")
    public static final <T> Class<T> d(@g d<T> dVar) {
        l0.p(dVar, "<this>");
        Class<?> o10 = ((t) dVar).o();
        l0.n(o10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return o10;
    }

    @g
    public static final <T> Class<T> e(@g T t10) {
        l0.p(t10, "<this>");
        Class<?> cls = t10.getClass();
        l0.n(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    public static /* synthetic */ void f(d dVar) {
    }

    @g
    public static final <T> Class<T> g(@g d<T> dVar) {
        l0.p(dVar, "<this>");
        Class o10 = ((t) dVar).o();
        if (!o10.isPrimitive()) {
            l0.n(o10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return o10;
        }
        String name = o10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    o10 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    o10 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    o10 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    o10 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    o10 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    o10 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    o10 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    o10 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    o10 = Short.class;
                    break;
                }
                break;
        }
        l0.n(o10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return o10;
    }

    @h
    public static final <T> Class<T> h(@g d<T> dVar) {
        l0.p(dVar, "<this>");
        Class<?> o10 = ((t) dVar).o();
        if (o10.isPrimitive()) {
            l0.n(o10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return o10;
        }
        String name = o10.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    @g
    @h(name = "getKotlinClass")
    public static final <T> d<T> i(@g Class<T> cls) {
        l0.p(cls, "<this>");
        return l1.d(cls);
    }

    @g
    @h(name = "getRuntimeClassOfKClassInstance")
    public static final <T> Class<d<T>> j(@g d<T> dVar) {
        l0.p(dVar, "<this>");
        Class<?> cls = dVar.getClass();
        l0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    @k(level = m.P, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @b1(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void k(d dVar) {
    }

    public static final /* synthetic */ boolean l(Object[] objArr) {
        l0.p(objArr, "<this>");
        l0.y(4, w1.a.X4);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }
}
