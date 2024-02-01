package a0;

import a0.f;

public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f50m;

    public g(p pVar) {
        super(pVar);
        this.f42e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    public void e(int i10) {
        if (!this.f47j) {
            this.f47j = true;
            this.f44g = i10;
            for (d next : this.f48k) {
                next.a(next);
            }
        }
    }
}
