package p5;

import a6.h;
import com.fasterxml.jackson.databind.ser.s;
import i5.c;
import i5.c0;
import i5.f;
import i5.j;
import i5.l;
import i5.o;
import java.io.Serializable;
import l5.q;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class k implements Serializable {
    public static final long O = 1;
    public static final String P = "javax.xml.";
    public static final String Q = "com.fasterxml.jackson.databind.ext.CoreXMLSerializers";
    public static final String R = "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers";
    public static final String S = "com.fasterxml.jackson.databind.ext.DOMSerializer";
    public static final String T = "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer";
    public static final String U = "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer";
    public static final Class<?> V = Node.class;
    public static final Class<?> W;
    public static final e X;
    public static final k Y = new k();

    static {
        e eVar = null;
        Class<Document> cls = Document.class;
        W = cls;
        try {
            eVar = e.d();
        } catch (Throwable unused) {
        }
        X = eVar;
    }

    public i5.k<?> a(j jVar, f fVar, c cVar) throws l {
        Object e10;
        i5.k<?> b10;
        Class<?> g10 = jVar.g();
        e eVar = X;
        if (eVar != null && (b10 = eVar.b(g10)) != null) {
            return b10;
        }
        Class<?> cls = V;
        if (cls != null && cls.isAssignableFrom(g10)) {
            return (i5.k) e(U);
        }
        Class<?> cls2 = W;
        if (cls2 != null && cls2.isAssignableFrom(g10)) {
            return (i5.k) e(T);
        }
        if ((g10.getName().startsWith(P) || d(g10, P)) && (e10 = e(R)) != null) {
            return ((q) e10).f(jVar, fVar, cVar);
        }
        return null;
    }

    public o<?> b(c0 c0Var, j jVar, c cVar) {
        Object e10;
        o<?> c10;
        Class<?> g10 = jVar.g();
        Class<?> cls = V;
        if (cls != null && cls.isAssignableFrom(g10)) {
            return (o) e(S);
        }
        e eVar = X;
        if (eVar != null && (c10 = eVar.c(g10)) != null) {
            return c10;
        }
        if ((g10.getName().startsWith(P) || d(g10, P)) && (e10 = e(Q)) != null) {
            return ((s) e10).a(c0Var, jVar, cVar);
        }
        return null;
    }

    public boolean c(Class<?> cls) {
        Class<?> cls2 = V;
        if (cls2 != null && cls2.isAssignableFrom(cls)) {
            return true;
        }
        Class<?> cls3 = W;
        return (cls3 != null && cls3.isAssignableFrom(cls)) || cls.getName().startsWith(P) || d(cls, P);
    }

    public final boolean d(Class<?> cls, String str) {
        boolean startsWith;
        do {
            Class<? super Object> superclass = r3.getSuperclass();
            Class<? super Object> cls2 = cls;
            if (superclass == null || superclass == Object.class) {
                return false;
            }
            startsWith = superclass.getName().startsWith(str);
            cls2 = superclass;
        } while (!startsWith);
        return true;
    }

    public final Object e(String str) {
        try {
            return h.l(Class.forName(str), false);
        } catch (Exception | LinkageError unused) {
            return null;
        }
    }
}
