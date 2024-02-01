package u2;

import a3.d;
import d.m0;
import java.util.concurrent.Executor;
import u2.n2;

public final class y1 implements d.c {

    /* renamed from: a  reason: collision with root package name */
    public final d.c f13635a;

    /* renamed from: b  reason: collision with root package name */
    public final n2.f f13636b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f13637c;

    public y1(@m0 d.c cVar, @m0 n2.f fVar, @m0 Executor executor) {
        this.f13635a = cVar;
        this.f13636b = fVar;
        this.f13637c = executor;
    }

    @m0
    public d a(@m0 d.b bVar) {
        return new x1(this.f13635a.a(bVar), this.f13636b, this.f13637c);
    }
}
