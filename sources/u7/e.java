package u7;

import d.o0;
import t7.b0;
import t7.j;
import t7.l;
import u7.d;

public final class e implements l.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f13809a;

    /* renamed from: b  reason: collision with root package name */
    public final l.a f13810b;

    /* renamed from: c  reason: collision with root package name */
    public final l.a f13811c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13812d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final j.a f13813e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public final d.b f13814f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public final i f13815g;

    public e(a aVar, l.a aVar2) {
        this(aVar, aVar2, 0);
    }

    public e(a aVar, l.a aVar2, int i10) {
        this(aVar, aVar2, new b0(), new c(aVar, b.f13766l), i10, (d.b) null);
    }

    public e(a aVar, l.a aVar2, l.a aVar3, @o0 j.a aVar4, int i10, @o0 d.b bVar) {
        this(aVar, aVar2, aVar3, aVar4, i10, bVar, (i) null);
    }

    public e(a aVar, l.a aVar2, l.a aVar3, @o0 j.a aVar4, int i10, @o0 d.b bVar, @o0 i iVar) {
        this.f13809a = aVar;
        this.f13810b = aVar2;
        this.f13811c = aVar3;
        this.f13813e = aVar4;
        this.f13812d = i10;
        this.f13814f = bVar;
        this.f13815g = iVar;
    }

    /* renamed from: f */
    public d a() {
        a aVar = this.f13809a;
        l a10 = this.f13810b.a();
        l a11 = this.f13811c.a();
        j.a aVar2 = this.f13813e;
        return new d(aVar, a10, a11, aVar2 == null ? null : aVar2.a(), this.f13812d, this.f13814f, this.f13815g);
    }
}
