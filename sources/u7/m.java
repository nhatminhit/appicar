package u7;

import d.o0;
import java.io.File;
import java.util.TreeSet;
import w7.a;
import w7.p;

public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final String f13836f = "CachedContent";

    /* renamed from: a  reason: collision with root package name */
    public final int f13837a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13838b;

    /* renamed from: c  reason: collision with root package name */
    public final TreeSet<w> f13839c;

    /* renamed from: d  reason: collision with root package name */
    public s f13840d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13841e;

    public m(int i10, String str) {
        this(i10, str, s.f13880f);
    }

    public m(int i10, String str, s sVar) {
        this.f13837a = i10;
        this.f13838b = str;
        this.f13840d = sVar;
        this.f13839c = new TreeSet<>();
    }

    public void a(w wVar) {
        this.f13839c.add(wVar);
    }

    public boolean b(r rVar) {
        s sVar = this.f13840d;
        s f10 = sVar.f(rVar);
        this.f13840d = f10;
        return !f10.equals(sVar);
    }

    public long c(long j10, long j11) {
        w e10 = e(j10);
        if (e10.b()) {
            return -Math.min(e10.d() ? Long.MAX_VALUE : e10.Q, j11);
        }
        long j12 = j10 + j11;
        long j13 = e10.P + e10.Q;
        if (j13 < j12) {
            for (w next : this.f13839c.tailSet(e10, false)) {
                long j14 = next.P;
                if (j14 <= j13) {
                    j13 = Math.max(j13, j14 + next.Q);
                    if (j13 >= j12) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Math.min(j13 - j10, j11);
    }

    public s d() {
        return this.f13840d;
    }

    public w e(long j10) {
        w l10 = w.l(this.f13838b, j10);
        w floor = this.f13839c.floor(l10);
        if (floor != null && floor.P + floor.Q > j10) {
            return floor;
        }
        w ceiling = this.f13839c.ceiling(l10);
        return ceiling == null ? w.m(this.f13838b, j10) : w.k(this.f13838b, j10, ceiling.P - j10);
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f13837a == mVar.f13837a && this.f13838b.equals(mVar.f13838b) && this.f13839c.equals(mVar.f13839c) && this.f13840d.equals(mVar.f13840d);
    }

    public TreeSet<w> f() {
        return this.f13839c;
    }

    public boolean g() {
        return this.f13839c.isEmpty();
    }

    public boolean h() {
        return this.f13841e;
    }

    public int hashCode() {
        return (((this.f13837a * 31) + this.f13838b.hashCode()) * 31) + this.f13840d.hashCode();
    }

    public boolean i(j jVar) {
        if (!this.f13839c.remove(jVar)) {
            return false;
        }
        jVar.S.delete();
        return true;
    }

    public w j(w wVar, long j10, boolean z10) {
        a.i(this.f13839c.remove(wVar));
        File file = wVar.S;
        if (z10) {
            File n10 = w.n(file.getParentFile(), this.f13837a, wVar.P, j10);
            if (file.renameTo(n10)) {
                file = n10;
            } else {
                p.l(f13836f, "Failed to rename " + file + " to " + n10);
            }
        }
        w e10 = wVar.e(file, j10);
        this.f13839c.add(e10);
        return e10;
    }

    public void k(boolean z10) {
        this.f13841e = z10;
    }
}
