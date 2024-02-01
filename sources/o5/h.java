package o5;

import java.util.Collection;
import w4.j;
import w4.l;

public class h extends g {

    /* renamed from: a0  reason: collision with root package name */
    public static final long f11070a0 = 1;

    @Deprecated
    public h(String str, j jVar, Class<?> cls, String str2, Collection<Object> collection) {
        super(str, jVar, cls, str2, collection);
    }

    public h(l lVar, String str, j jVar, Class<?> cls, String str2, Collection<Object> collection) {
        super(lVar, str, jVar, cls, str2, collection);
    }

    public static h H(l lVar, Object obj, String str, Collection<Object> collection) {
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        h hVar = new h(lVar, String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", new Object[]{str, cls.getName()}), lVar.W0(), cls, str, collection);
        hVar.v(obj, str);
        return hVar;
    }
}
