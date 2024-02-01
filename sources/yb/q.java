package yb;

import qa.c;
import qa.j;
import qa.p;

public class q extends k {

    /* renamed from: c  reason: collision with root package name */
    public boolean f24723c = true;

    public q(p pVar) {
        super(pVar);
    }

    public c f(j jVar) {
        if (this.f24723c) {
            this.f24723c = false;
            return new c(new ya.j(jVar.f()));
        }
        this.f24723c = true;
        return new c(new ya.j(jVar));
    }
}
