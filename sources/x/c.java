package x;

import java.util.ArrayList;
import x.e;
import z.j;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f14975a;

    /* renamed from: b  reason: collision with root package name */
    public final e.C0237e f14976b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<Object> f14977c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public j f14978d;

    public c(e eVar, e.C0237e eVar2) {
        this.f14975a = eVar;
        this.f14976b = eVar2;
    }

    public c a(Object... objArr) {
        for (Object add : objArr) {
            this.f14977c.add(add);
        }
        return this;
    }

    public void b() {
    }

    public j c() {
        return this.f14978d;
    }

    public e.C0237e d() {
        return this.f14976b;
    }

    public void e(j jVar) {
        this.f14978d = jVar;
    }
}
