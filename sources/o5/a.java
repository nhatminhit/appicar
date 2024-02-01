package o5;

import java.util.Collection;
import w4.j;
import w4.l;

public class a extends g {

    /* renamed from: a0  reason: collision with root package name */
    public static final long f11069a0 = 1;

    @Deprecated
    public a(String str, j jVar, Class<?> cls, String str2, Collection<Object> collection) {
        super(str, jVar, cls, str2, collection);
    }

    public a(l lVar, String str, j jVar, Class<?> cls, String str2, Collection<Object> collection) {
        super(lVar, str, jVar, cls, str2, collection);
    }

    public static a H(l lVar, Object obj, String str, Collection<Object> collection) {
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        a aVar = new a(lVar, String.format("Ignored field \"%s\" (class %s) encountered; mapper configured not to allow this", new Object[]{str, cls.getName()}), lVar.W0(), cls, str, collection);
        aVar.v(obj, str);
        return aVar;
    }
}
