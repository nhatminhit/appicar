package u7;

import java.util.Comparator;
import java.util.TreeSet;
import u7.a;

public final class t implements f, Comparator<j> {
    public final long O;
    public final TreeSet<j> P = new TreeSet<>(this);
    public long Q;

    public t(long j10) {
        this.O = j10;
    }

    public void a(a aVar, String str, long j10, long j11) {
        if (j11 != -1) {
            h(aVar, j11);
        }
    }

    public void b(a aVar, j jVar) {
        this.P.add(jVar);
        this.Q += jVar.Q;
        h(aVar, 0);
    }

    public void c(a aVar, j jVar) {
        this.P.remove(jVar);
        this.Q -= jVar.Q;
    }

    public void d(a aVar, j jVar, j jVar2) {
        c(aVar, jVar);
        b(aVar, jVar2);
    }

    public void e() {
    }

    public boolean f() {
        return true;
    }

    /* renamed from: g */
    public int compare(j jVar, j jVar2) {
        long j10 = jVar.T;
        long j11 = jVar2.T;
        return j10 - j11 == 0 ? jVar.compareTo(jVar2) : j10 < j11 ? -1 : 1;
    }

    public final void h(a aVar, long j10) {
        while (this.Q + j10 > this.O && !this.P.isEmpty()) {
            try {
                aVar.m(this.P.first());
            } catch (a.C0232a unused) {
            }
        }
    }
}
