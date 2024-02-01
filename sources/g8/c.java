package g8;

import d.m0;
import d.o0;
import e8.a;
import f8.a;
import f8.a.d;
import j8.q;

@a
public final class c<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    public final int f8189a;

    /* renamed from: b  reason: collision with root package name */
    public final f8.a f8190b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final a.d f8191c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final String f8192d;

    public c(f8.a aVar, @o0 a.d dVar, @o0 String str) {
        this.f8190b = aVar;
        this.f8191c = dVar;
        this.f8192d = str;
        this.f8189a = q.c(aVar, dVar, str);
    }

    @e8.a
    @m0
    public static <O extends a.d> c<O> a(@m0 f8.a<O> aVar, @o0 O o10, @o0 String str) {
        return new c<>(aVar, o10, str);
    }

    @m0
    public final String b() {
        return this.f8190b.d();
    }

    public final boolean equals(@o0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return q.b(this.f8190b, cVar.f8190b) && q.b(this.f8191c, cVar.f8191c) && q.b(this.f8192d, cVar.f8192d);
    }

    public final int hashCode() {
        return this.f8189a;
    }
}
