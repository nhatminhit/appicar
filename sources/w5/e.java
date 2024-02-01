package w5;

import com.fasterxml.jackson.databind.ser.s;
import i5.c;
import i5.c0;
import i5.j;
import i5.o;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import u5.i;
import z5.a;
import z5.b;
import z5.d;
import z5.f;
import z5.g;

public class e extends s.a implements Serializable {
    public static final long R = 3;
    public HashMap<b, o<?>> O = null;
    public HashMap<b, o<?>> P = null;
    public boolean Q = false;

    public e() {
    }

    public e(List<o<?>> list) {
        l(list);
    }

    public o<?> a(c0 c0Var, j jVar, c cVar) {
        o<?> i10;
        o<?> oVar;
        Class g10 = jVar.g();
        b bVar = new b(g10);
        if (g10.isInterface()) {
            HashMap<b, o<?>> hashMap = this.P;
            if (!(hashMap == null || (oVar = hashMap.get(bVar)) == null)) {
                return oVar;
            }
        } else {
            HashMap<b, o<?>> hashMap2 = this.O;
            if (hashMap2 != null) {
                o<?> oVar2 = hashMap2.get(bVar);
                if (oVar2 != null) {
                    return oVar2;
                }
                if (this.Q && jVar.p()) {
                    bVar.b(Enum.class);
                    o<?> oVar3 = this.O.get(bVar);
                    if (oVar3 != null) {
                        return oVar3;
                    }
                }
                for (Class cls = g10; cls != null; cls = cls.getSuperclass()) {
                    bVar.b(cls);
                    o<?> oVar4 = this.O.get(bVar);
                    if (oVar4 != null) {
                        return oVar4;
                    }
                }
            }
        }
        if (this.P == null) {
            return null;
        }
        o<?> i11 = i(g10, bVar);
        if (i11 != null) {
            return i11;
        }
        if (g10.isInterface()) {
            return null;
        }
        do {
            g10 = g10.getSuperclass();
            if (g10 == null) {
                return null;
            }
            i10 = i(g10, bVar);
        } while (i10 == null);
        return i10;
    }

    public o<?> b(c0 c0Var, d dVar, c cVar, i iVar, o<Object> oVar) {
        return a(c0Var, dVar, cVar);
    }

    public o<?> d(c0 c0Var, z5.e eVar, c cVar, i iVar, o<Object> oVar) {
        return a(c0Var, eVar, cVar);
    }

    public o<?> e(c0 c0Var, g gVar, c cVar, o<Object> oVar, i iVar, o<Object> oVar2) {
        return a(c0Var, gVar, cVar);
    }

    public o<?> f(c0 c0Var, a aVar, c cVar, i iVar, o<Object> oVar) {
        return a(c0Var, aVar, cVar);
    }

    public o<?> g(c0 c0Var, f fVar, c cVar, o<Object> oVar, i iVar, o<Object> oVar2) {
        return a(c0Var, fVar, cVar);
    }

    public void h(Class<?> cls, o<?> oVar) {
        b bVar = new b(cls);
        if (cls.isInterface()) {
            if (this.P == null) {
                this.P = new HashMap<>();
            }
            this.P.put(bVar, oVar);
            return;
        }
        if (this.O == null) {
            this.O = new HashMap<>();
        }
        this.O.put(bVar, oVar);
        if (cls == Enum.class) {
            this.Q = true;
        }
    }

    public o<?> i(Class<?> cls, b bVar) {
        for (Class cls2 : cls.getInterfaces()) {
            bVar.b(cls2);
            o<?> oVar = this.P.get(bVar);
            if (oVar != null) {
                return oVar;
            }
            o<?> i10 = i(cls2, bVar);
            if (i10 != null) {
                return i10;
            }
        }
        return null;
    }

    public void j(o<?> oVar) {
        Class<?> g10 = oVar.g();
        if (g10 == null || g10 == Object.class) {
            throw new IllegalArgumentException("JsonSerializer of type " + oVar.getClass().getName() + " does not define valid handledType() -- must either register with method that takes type argument  or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'");
        }
        h(g10, oVar);
    }

    public <T> void k(Class<? extends T> cls, o<T> oVar) {
        h(cls, oVar);
    }

    public void l(List<o<?>> list) {
        for (o<?> j10 : list) {
            j(j10);
        }
    }
}
