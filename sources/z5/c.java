package z5;

import i5.j;
import java.util.ArrayList;
import java.util.Iterator;
import p7.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final c f15856a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f15857b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<j> f15858c;

    public c(Class<?> cls) {
        this((c) null, cls);
    }

    public c(c cVar, Class<?> cls) {
        this.f15856a = cVar;
        this.f15857b = cls;
    }

    public void a(j jVar) {
        if (this.f15858c == null) {
            this.f15858c = new ArrayList<>();
        }
        this.f15858c.add(jVar);
    }

    public c b(Class<?> cls) {
        return new c(this, cls);
    }

    public c c(Class<?> cls) {
        if (this.f15857b == cls) {
            return this;
        }
        for (c cVar = this.f15856a; cVar != null; cVar = cVar.f15856a) {
            if (cVar.f15857b == cls) {
                return cVar;
            }
        }
        return null;
    }

    public void d(j jVar) {
        ArrayList<j> arrayList = this.f15858c;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().n0(jVar);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ClassStack (self-refs: ");
        ArrayList<j> arrayList = this.f15858c;
        sb2.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb2.append(')');
        for (c cVar = this; cVar != null; cVar = cVar.f15856a) {
            sb2.append(f.f11698i);
            sb2.append(cVar.f15857b.getName());
        }
        sb2.append(']');
        return sb2.toString();
    }
}
