package w5;

import com.fasterxml.jackson.databind.ser.h;
import i5.k;
import i5.o;
import i5.p;
import i5.t;
import i5.z;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import l5.g;
import l5.y;
import u5.c;
import w4.b0;

public class d extends t implements Serializable {

    /* renamed from: b0  reason: collision with root package name */
    public static final long f14683b0 = 1;
    public final String O;
    public final b0 P;
    public e Q;
    public b R;
    public e S;
    public c T;
    public a U;
    public f V;
    public g W;
    public h X;
    public HashMap<Class<?>, Class<?>> Y;
    public LinkedHashSet<c> Z;

    /* renamed from: a0  reason: collision with root package name */
    public z f14684a0;

    public d() {
        String str;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f14684a0 = null;
        if (getClass() == d.class) {
            str = "SimpleModule-" + System.identityHashCode(this);
        } else {
            str = getClass().getName();
        }
        this.O = str;
        this.P = b0.o();
    }

    public d(String str) {
        this(str, b0.o());
    }

    public d(String str, b0 b0Var) {
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f14684a0 = null;
        this.O = str;
        this.P = b0Var;
    }

    public d(String str, b0 b0Var, List<o<?>> list) {
        this(str, b0Var, (Map<Class<?>, k<?>>) null, list);
    }

    public d(String str, b0 b0Var, Map<Class<?>, k<?>> map) {
        this(str, b0Var, map, (List<o<?>>) null);
    }

    public d(String str, b0 b0Var, Map<Class<?>, k<?>> map, List<o<?>> list) {
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f14684a0 = null;
        this.O = str;
        this.P = b0Var;
        if (map != null) {
            this.R = new b(map);
        }
        if (list != null) {
            this.Q = new e(list);
        }
    }

    public d(b0 b0Var) {
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f14684a0 = null;
        this.O = b0Var.b();
        this.P = b0Var;
    }

    public String b() {
        return this.O;
    }

    public Object c() {
        if (getClass() == d.class) {
            return null;
        }
        return super.c();
    }

    public void d(t.a aVar) {
        e eVar = this.Q;
        if (eVar != null) {
            aVar.f(eVar);
        }
        b bVar = this.R;
        if (bVar != null) {
            aVar.s(bVar);
        }
        e eVar2 = this.S;
        if (eVar2 != null) {
            aVar.u(eVar2);
        }
        c cVar = this.T;
        if (cVar != null) {
            aVar.z(cVar);
        }
        a aVar2 = this.U;
        if (aVar2 != null) {
            aVar.h(aVar2);
        }
        f fVar = this.V;
        if (fVar != null) {
            aVar.p(fVar);
        }
        g gVar = this.W;
        if (gVar != null) {
            aVar.q(gVar);
        }
        h hVar = this.X;
        if (hVar != null) {
            aVar.c(hVar);
        }
        LinkedHashSet<c> linkedHashSet = this.Z;
        if (linkedHashSet != null && linkedHashSet.size() > 0) {
            LinkedHashSet<c> linkedHashSet2 = this.Z;
            aVar.y((c[]) linkedHashSet2.toArray(new c[linkedHashSet2.size()]));
        }
        z zVar = this.f14684a0;
        if (zVar != null) {
            aVar.k(zVar);
        }
        HashMap<Class<?>, Class<?>> hashMap = this.Y;
        if (hashMap != null) {
            for (Map.Entry next : hashMap.entrySet()) {
                aVar.x((Class) next.getKey(), (Class) next.getValue());
            }
        }
    }

    public void e(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("Cannot pass `null` as %s", new Object[]{str}));
        }
    }

    public <T> d f(Class<T> cls, Class<? extends T> cls2) {
        e(cls, "abstract type to map");
        e(cls2, "concrete type to map to");
        if (this.U == null) {
            this.U = new a();
        }
        this.U = this.U.d(cls, cls2);
        return this;
    }

    public <T> d g(Class<T> cls, k<? extends T> kVar) {
        e(cls, "type to register deserializer for");
        e(kVar, "deserializer");
        if (this.R == null) {
            this.R = new b();
        }
        this.R.l(cls, kVar);
        return this;
    }

    public d h(Class<?> cls, p pVar) {
        e(cls, "type to register key deserializer for");
        e(pVar, "key deserializer");
        if (this.T == null) {
            this.T = new c();
        }
        this.T.b(cls, pVar);
        return this;
    }

    public <T> d i(Class<? extends T> cls, o<T> oVar) {
        e(cls, "type to register key serializer for");
        e(oVar, "key serializer");
        if (this.S == null) {
            this.S = new e();
        }
        this.S.k(cls, oVar);
        return this;
    }

    public d j(o<?> oVar) {
        e(oVar, "serializer");
        if (this.Q == null) {
            this.Q = new e();
        }
        this.Q.j(oVar);
        return this;
    }

    public <T> d k(Class<? extends T> cls, o<T> oVar) {
        e(cls, "type to register serializer for");
        e(oVar, "serializer");
        if (this.Q == null) {
            this.Q = new e();
        }
        this.Q.k(cls, oVar);
        return this;
    }

    public d l(Class<?> cls, y yVar) {
        e(cls, "class to register value instantiator for");
        e(yVar, "value instantiator");
        if (this.V == null) {
            this.V = new f();
        }
        this.V = this.V.b(cls, yVar);
        return this;
    }

    public d m(Collection<Class<?>> collection) {
        if (this.Z == null) {
            this.Z = new LinkedHashSet<>();
        }
        for (Class next : collection) {
            e(next, "subtype to register");
            this.Z.add(new c(next));
        }
        return this;
    }

    public d n(Class<?>... clsArr) {
        if (this.Z == null) {
            this.Z = new LinkedHashSet<>();
        }
        for (Class<?> cls : clsArr) {
            e(cls, "subtype to register");
            this.Z.add(new c(cls));
        }
        return this;
    }

    public d o(c... cVarArr) {
        if (this.Z == null) {
            this.Z = new LinkedHashSet<>();
        }
        for (c cVar : cVarArr) {
            e(cVar, "subtype to register");
            this.Z.add(cVar);
        }
        return this;
    }

    public void p(a aVar) {
        this.U = aVar;
    }

    public d q(g gVar) {
        this.W = gVar;
        return this;
    }

    public void r(b bVar) {
        this.R = bVar;
    }

    public void s(c cVar) {
        this.T = cVar;
    }

    public void t(e eVar) {
        this.S = eVar;
    }

    public d u(Class<?> cls, Class<?> cls2) {
        e(cls, "target type");
        e(cls2, "mixin class");
        if (this.Y == null) {
            this.Y = new HashMap<>();
        }
        this.Y.put(cls, cls2);
        return this;
    }

    public d v(z zVar) {
        this.f14684a0 = zVar;
        return this;
    }

    public b0 version() {
        return this.P;
    }

    public d w(h hVar) {
        this.X = hVar;
        return this;
    }

    public void x(e eVar) {
        this.Q = eVar;
    }

    public void y(f fVar) {
        this.V = fVar;
    }
}
