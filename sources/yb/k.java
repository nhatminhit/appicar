package yb;

import java.util.ArrayList;
import java.util.List;
import qa.c;
import qa.j;
import qa.p;
import qa.r;
import qa.t;
import qa.u;

public class k implements u {

    /* renamed from: a  reason: collision with root package name */
    public p f24704a;

    /* renamed from: b  reason: collision with root package name */
    public List<t> f24705b = new ArrayList();

    public k(p pVar) {
        this.f24704a = pVar;
    }

    public void a(t tVar) {
        this.f24705b.add(tVar);
    }

    public r b(c cVar) {
        r rVar;
        this.f24705b.clear();
        try {
            p pVar = this.f24704a;
            rVar = pVar instanceof qa.k ? ((qa.k) pVar).d(cVar) : pVar.b(cVar);
        } catch (Exception unused) {
            rVar = null;
        } catch (Throwable th2) {
            this.f24704a.reset();
            throw th2;
        }
        this.f24704a.reset();
        return rVar;
    }

    public r c(j jVar) {
        return b(f(jVar));
    }

    public List<t> d() {
        return new ArrayList(this.f24705b);
    }

    public p e() {
        return this.f24704a;
    }

    public c f(j jVar) {
        return new c(new ya.j(jVar));
    }
}
