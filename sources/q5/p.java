package q5;

import a6.b;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

public final class p implements b {
    public HashMap<Class<?>, Annotation> O;

    public p() {
    }

    public p(HashMap<Class<?>, Annotation> hashMap) {
        this.O = hashMap;
    }

    public static p h(p pVar, p pVar2) {
        HashMap<Class<?>, Annotation> hashMap;
        HashMap<Class<?>, Annotation> hashMap2;
        if (pVar == null || (hashMap = pVar.O) == null || hashMap.isEmpty()) {
            return pVar2;
        }
        if (pVar2 == null || (hashMap2 = pVar2.O) == null || hashMap2.isEmpty()) {
            return pVar;
        }
        HashMap hashMap3 = new HashMap();
        for (Annotation next : pVar2.O.values()) {
            hashMap3.put(next.annotationType(), next);
        }
        for (Annotation next2 : pVar.O.values()) {
            hashMap3.put(next2.annotationType(), next2);
        }
        return new p(hashMap3);
    }

    public static p i(Class<?> cls, Annotation annotation) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(cls, annotation);
        return new p(hashMap);
    }

    public <A extends Annotation> A a(Class<A> cls) {
        HashMap<Class<?>, Annotation> hashMap = this.O;
        if (hashMap == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    public boolean b(Class<?> cls) {
        HashMap<Class<?>, Annotation> hashMap = this.O;
        if (hashMap == null) {
            return false;
        }
        return hashMap.containsKey(cls);
    }

    public boolean c(Class<? extends Annotation>[] clsArr) {
        if (this.O != null) {
            for (Class<? extends Annotation> containsKey : clsArr) {
                if (this.O.containsKey(containsKey)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(Annotation annotation) {
        if (this.O == null) {
            this.O = new HashMap<>();
        }
        Annotation put = this.O.put(annotation.annotationType(), annotation);
        return put == null || !put.equals(annotation);
    }

    public boolean e(Annotation annotation) {
        return d(annotation);
    }

    public boolean f(Annotation annotation) {
        HashMap<Class<?>, Annotation> hashMap = this.O;
        if (hashMap != null && hashMap.containsKey(annotation.annotationType())) {
            return false;
        }
        d(annotation);
        return true;
    }

    public Iterable<Annotation> g() {
        HashMap<Class<?>, Annotation> hashMap = this.O;
        return (hashMap == null || hashMap.size() == 0) ? Collections.emptyList() : this.O.values();
    }

    public int size() {
        HashMap<Class<?>, Annotation> hashMap = this.O;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    public String toString() {
        HashMap<Class<?>, Annotation> hashMap = this.O;
        return hashMap == null ? "[null]" : hashMap.toString();
    }
}
