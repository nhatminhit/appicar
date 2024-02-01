package g8;

import com.google.android.gms.common.Feature;
import d.o0;
import f6.e;
import j8.q;

public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    public final c f8195a;

    /* renamed from: b  reason: collision with root package name */
    public final Feature f8196b;

    public /* synthetic */ c1(c cVar, Feature feature, b1 b1Var) {
        this.f8195a = cVar;
        this.f8196b = feature;
    }

    public final boolean equals(@o0 Object obj) {
        if (obj != null && (obj instanceof c1)) {
            c1 c1Var = (c1) obj;
            return q.b(this.f8195a, c1Var.f8195a) && q.b(this.f8196b, c1Var.f8196b);
        }
    }

    public final int hashCode() {
        return q.c(this.f8195a, this.f8196b);
    }

    public final String toString() {
        return q.d(this).a("key", this.f8195a).a(e.f7414f, this.f8196b).toString();
    }
}
