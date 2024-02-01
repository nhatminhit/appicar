package m4;

import d.m0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import t4.m;

public class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Set<i> f10345a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f10346b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10347c;

    public void a(@m0 i iVar) {
        this.f10345a.remove(iVar);
    }

    public void b(@m0 i iVar) {
        this.f10345a.add(iVar);
        if (this.f10347c) {
            iVar.onDestroy();
        } else if (this.f10346b) {
            iVar.b();
        } else {
            iVar.a();
        }
    }

    public void c() {
        this.f10347c = true;
        for (T onDestroy : m.k(this.f10345a)) {
            onDestroy.onDestroy();
        }
    }

    public void d() {
        this.f10346b = true;
        for (T b10 : m.k(this.f10345a)) {
            b10.b();
        }
    }

    public void e() {
        this.f10346b = false;
        for (T a10 : m.k(this.f10345a)) {
            a10.a();
        }
    }
}
