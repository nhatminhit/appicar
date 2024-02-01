package nb;

import java.util.Objects;
import mb.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final mb.b f21188a;

    /* renamed from: b  reason: collision with root package name */
    public final mb.b f21189b;

    /* renamed from: c  reason: collision with root package name */
    public final c f21190c;

    public b(mb.b bVar, mb.b bVar2, c cVar) {
        this.f21188a = bVar;
        this.f21189b = bVar2;
        this.f21190c = cVar;
    }

    public c a() {
        return this.f21190c;
    }

    public mb.b b() {
        return this.f21188a;
    }

    public mb.b c() {
        return this.f21189b;
    }

    public boolean d() {
        return this.f21189b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f21188a, bVar.f21188a) && Objects.equals(this.f21189b, bVar.f21189b) && Objects.equals(this.f21190c, bVar.f21190c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f21188a) ^ Objects.hashCode(this.f21189b)) ^ Objects.hashCode(this.f21190c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f21188a);
        sb2.append(" , ");
        sb2.append(this.f21189b);
        sb2.append(" : ");
        c cVar = this.f21190c;
        sb2.append(cVar == null ? "null" : Integer.valueOf(cVar.c()));
        sb2.append(" ]");
        return sb2.toString();
    }
}
