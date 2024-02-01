package m4;

import d.m0;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import q4.p;
import t4.m;

public final class o implements i {
    public final Set<p<?>> O = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        for (T a10 : m.k(this.O)) {
            a10.a();
        }
    }

    public void b() {
        for (T b10 : m.k(this.O)) {
            b10.b();
        }
    }

    public void c() {
        this.O.clear();
    }

    @m0
    public List<p<?>> d() {
        return m.k(this.O);
    }

    public void g(@m0 p<?> pVar) {
        this.O.add(pVar);
    }

    public void i(@m0 p<?> pVar) {
        this.O.remove(pVar);
    }

    public void onDestroy() {
        for (T onDestroy : m.k(this.O)) {
            onDestroy.onDestroy();
        }
    }
}
