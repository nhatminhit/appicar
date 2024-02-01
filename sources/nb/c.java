package nb;

import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f21191a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21192b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f21193c;

    public c(List<b> list, int i10, boolean z10) {
        this.f21191a = new ArrayList(list);
        this.f21192b = i10;
        this.f21193c = z10;
    }

    public List<b> a() {
        return this.f21191a;
    }

    public int b() {
        return this.f21192b;
    }

    public boolean c(List<b> list) {
        return this.f21191a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f21191a.equals(cVar.f21191a) && this.f21193c == cVar.f21193c;
    }

    public int hashCode() {
        return this.f21191a.hashCode() ^ Boolean.valueOf(this.f21193c).hashCode();
    }

    public String toString() {
        return "{ " + this.f21191a + " }";
    }
}
