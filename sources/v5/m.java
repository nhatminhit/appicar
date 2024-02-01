package v5;

import i5.j;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k5.i;
import q5.b;
import q5.h;
import u5.c;
import u5.e;

public class m extends e implements Serializable {
    public static final long P = 1;
    public LinkedHashSet<c> O;

    public m() {
    }

    public m(m mVar) {
        LinkedHashSet<c> linkedHashSet = mVar.O;
        this.O = linkedHashSet == null ? null : new LinkedHashSet<>(linkedHashSet);
    }

    public Collection<c> c(i<?> iVar, b bVar) {
        i5.b m10 = iVar.m();
        HashMap hashMap = new HashMap();
        if (this.O != null) {
            Class<?> g10 = bVar.g();
            Iterator<c> it = this.O.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (g10.isAssignableFrom(next.b())) {
                    k(q5.c.n(iVar, next.b()), next, iVar, m10, hashMap);
                }
            }
        }
        k(bVar, new c(bVar.g(), (String) null), iVar, m10, hashMap);
        return new ArrayList(hashMap.values());
    }

    public Collection<c> d(i<?> iVar, h hVar, j jVar) {
        List<c> n02;
        i5.b m10 = iVar.m();
        Class<?> g10 = jVar == null ? hVar.g() : jVar.g();
        HashMap hashMap = new HashMap();
        LinkedHashSet<c> linkedHashSet = this.O;
        if (linkedHashSet != null) {
            Iterator<c> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (g10.isAssignableFrom(next.b())) {
                    k(q5.c.n(iVar, next.b()), next, iVar, m10, hashMap);
                }
            }
        }
        if (!(hVar == null || (n02 = m10.n0(hVar)) == null)) {
            for (c next2 : n02) {
                k(q5.c.n(iVar, next2.b()), next2, iVar, m10, hashMap);
            }
        }
        k(q5.c.n(iVar, g10), new c(g10, (String) null), iVar, m10, hashMap);
        return new ArrayList(hashMap.values());
    }

    public Collection<c> e(i<?> iVar, b bVar) {
        Class<?> g10 = bVar.g();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        l(bVar, new c(g10, (String) null), iVar, hashSet, linkedHashMap);
        LinkedHashSet<c> linkedHashSet = this.O;
        if (linkedHashSet != null) {
            Iterator<c> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (g10.isAssignableFrom(next.b())) {
                    l(q5.c.n(iVar, next.b()), next, iVar, hashSet, linkedHashMap);
                }
            }
        }
        return m(g10, hashSet, linkedHashMap);
    }

    public Collection<c> f(i<?> iVar, h hVar, j jVar) {
        List<c> n02;
        i5.b m10 = iVar.m();
        Class<?> g10 = jVar.g();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        l(q5.c.n(iVar, g10), new c(g10, (String) null), iVar, hashSet, linkedHashMap);
        if (!(hVar == null || (n02 = m10.n0(hVar)) == null)) {
            for (c next : n02) {
                l(q5.c.n(iVar, next.b()), next, iVar, hashSet, linkedHashMap);
            }
        }
        LinkedHashSet<c> linkedHashSet = this.O;
        if (linkedHashSet != null) {
            Iterator<c> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                c next2 = it.next();
                if (g10.isAssignableFrom(next2.b())) {
                    l(q5.c.n(iVar, next2.b()), next2, iVar, hashSet, linkedHashMap);
                }
            }
        }
        return m(g10, hashSet, linkedHashMap);
    }

    public e g() {
        return new m(this);
    }

    public void h(Collection<Class<?>> collection) {
        c[] cVarArr = new c[collection.size()];
        int i10 = 0;
        for (Class<?> cVar : collection) {
            cVarArr[i10] = new c(cVar);
            i10++;
        }
        j(cVarArr);
    }

    public void i(Class<?>... clsArr) {
        c[] cVarArr = new c[clsArr.length];
        int length = clsArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            cVarArr[i10] = new c(clsArr[i10]);
        }
        j(cVarArr);
    }

    public void j(c... cVarArr) {
        if (this.O == null) {
            this.O = new LinkedHashSet<>();
        }
        for (c add : cVarArr) {
            this.O.add(add);
        }
    }

    public void k(b bVar, c cVar, i<?> iVar, i5.b bVar2, HashMap<c, c> hashMap) {
        String o02;
        if (!cVar.c() && (o02 = bVar2.o0(bVar)) != null) {
            cVar = new c(cVar.b(), o02);
        }
        c cVar2 = new c(cVar.b());
        if (!hashMap.containsKey(cVar2)) {
            hashMap.put(cVar2, cVar);
            List<c> n02 = bVar2.n0(bVar);
            if (n02 != null && !n02.isEmpty()) {
                for (c next : n02) {
                    k(q5.c.n(iVar, next.b()), next, iVar, bVar2, hashMap);
                }
            }
        } else if (cVar.c() && !hashMap.get(cVar2).c()) {
            hashMap.put(cVar2, cVar);
        }
    }

    public void l(b bVar, c cVar, i<?> iVar, Set<Class<?>> set, Map<String, c> map) {
        List<c> n02;
        String o02;
        i5.b m10 = iVar.m();
        if (!cVar.c() && (o02 = m10.o0(bVar)) != null) {
            cVar = new c(cVar.b(), o02);
        }
        if (cVar.c()) {
            map.put(cVar.a(), cVar);
        }
        if (set.add(cVar.b()) && (n02 = m10.n0(bVar)) != null && !n02.isEmpty()) {
            for (c next : n02) {
                l(q5.c.n(iVar, next.b()), next, iVar, set, map);
            }
        }
    }

    public Collection<c> m(Class<?> cls, Set<Class<?>> set, Map<String, c> map) {
        ArrayList arrayList = new ArrayList(map.values());
        for (c b10 : map.values()) {
            set.remove(b10.b());
        }
        for (Class<?> next : set) {
            if (next != cls || !Modifier.isAbstract(next.getModifiers())) {
                arrayList.add(new c(next));
            }
        }
        return arrayList;
    }
}
