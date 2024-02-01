package m5;

import i5.g;
import i5.j;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import l5.w;
import v4.l0;
import v4.n0;

public class z {

    /* renamed from: a  reason: collision with root package name */
    public Object f10466a;

    /* renamed from: b  reason: collision with root package name */
    public final l0.a f10467b;

    /* renamed from: c  reason: collision with root package name */
    public LinkedList<a> f10468c;

    /* renamed from: d  reason: collision with root package name */
    public n0 f10469d;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final w f10470a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f10471b;

        public a(w wVar, j jVar) {
            this.f10470a = wVar;
            this.f10471b = jVar.g();
        }

        public a(w wVar, Class<?> cls) {
            this.f10470a = wVar;
            this.f10471b = cls;
        }

        public Class<?> a() {
            return this.f10471b;
        }

        public w4.j b() {
            return this.f10470a.b();
        }

        public abstract void c(Object obj, Object obj2) throws IOException;

        public boolean d(Object obj) {
            return obj.equals(this.f10470a.B());
        }
    }

    public z(l0.a aVar) {
        this.f10467b = aVar;
    }

    public void a(a aVar) {
        if (this.f10468c == null) {
            this.f10468c = new LinkedList<>();
        }
        this.f10468c.add(aVar);
    }

    public void b(Object obj) throws IOException {
        this.f10469d.a(this.f10467b, obj);
        this.f10466a = obj;
        Object obj2 = this.f10467b.Q;
        LinkedList<a> linkedList = this.f10468c;
        if (linkedList != null) {
            Iterator<a> it = linkedList.iterator();
            this.f10468c = null;
            while (it.hasNext()) {
                it.next().c(obj2, obj);
            }
        }
    }

    public l0.a c() {
        return this.f10467b;
    }

    public n0 d() {
        return this.f10469d;
    }

    public boolean e() {
        LinkedList<a> linkedList = this.f10468c;
        return linkedList != null && !linkedList.isEmpty();
    }

    public Iterator<a> f() {
        LinkedList<a> linkedList = this.f10468c;
        return linkedList == null ? Collections.emptyList().iterator() : linkedList.iterator();
    }

    public Object g() {
        Object b10 = this.f10469d.b(this.f10467b);
        this.f10466a = b10;
        return b10;
    }

    public void h(n0 n0Var) {
        this.f10469d = n0Var;
    }

    public boolean i(g gVar) {
        return false;
    }

    public String toString() {
        return String.valueOf(this.f10467b);
    }
}
