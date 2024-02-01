package r4;

import r4.j;
import v3.a;

public class i<R> implements g<R> {

    /* renamed from: a  reason: collision with root package name */
    public final j.a f12113a;

    /* renamed from: b  reason: collision with root package name */
    public j<R> f12114b;

    public i(j.a aVar) {
        this.f12113a = aVar;
    }

    public f<R> a(a aVar, boolean z10) {
        if (aVar == a.MEMORY_CACHE || !z10) {
            return e.b();
        }
        if (this.f12114b == null) {
            this.f12114b = new j<>(this.f12113a);
        }
        return this.f12114b;
    }
}
