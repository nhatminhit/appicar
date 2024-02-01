package uf;

import fh.g;
import fh.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ke.c;
import kotlin.Metadata;
import pf.r;
import vf.d;
import xe.l0;
import zd.d1;
import zd.f1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Luf/w0;", "Lvf/d;", "Luf/u0;", "flow", "", "c", "(Luf/u0;)Z", "", "Lie/d;", "Lzd/u2;", "e", "(Luf/u0;)[Lie/d;", "f", "()V", "g", "()Z", "d", "(Lie/d;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class w0 extends d<u0<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23369a = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_state");
    @g
    public volatile /* synthetic */ Object _state = null;

    /* renamed from: c */
    public boolean a(@g u0<?> u0Var) {
        if (this._state != null) {
            return false;
        }
        this._state = v0.f23366a;
        return true;
    }

    @h
    public final Object d(@g ie.d<? super u2> dVar) {
        r rVar = new r(c.d(dVar), 1);
        rVar.Z();
        if (!f1.a(f23369a, this, v0.f23366a, rVar)) {
            d1.a aVar = d1.P;
            rVar.x(d1.b(u2.f25116a));
        }
        Object z10 = rVar.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10 == ke.d.h() ? z10 : u2.f25116a;
    }

    @g
    /* renamed from: e */
    public ie.d<u2>[] b(@g u0<?> u0Var) {
        this._state = null;
        return vf.c.f23627a;
    }

    public final void f() {
        while (true) {
            Object obj = this._state;
            if (obj != null && obj != v0.f23367b) {
                if (obj == v0.f23366a) {
                    if (f1.a(f23369a, this, obj, v0.f23367b)) {
                        return;
                    }
                } else if (f1.a(f23369a, this, obj, v0.f23366a)) {
                    d1.a aVar = d1.P;
                    ((r) obj).x(d1.b(u2.f25116a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean g() {
        Object andSet = f23369a.getAndSet(this, v0.f23366a);
        l0.m(andSet);
        return andSet == v0.f23367b;
    }
}
