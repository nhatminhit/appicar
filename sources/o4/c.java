package o4;

import androidx.collection.a;
import d.o0;
import e1.m;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l4.g;
import t4.j;
import y3.i;
import y3.t;

public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final t<?, ?, ?> f11056c = new t(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), (m.a<List<Throwable>>) null)), (m.a<List<Throwable>>) null);

    /* renamed from: a  reason: collision with root package name */
    public final a<j, t<?, ?, ?>> f11057a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<j> f11058b = new AtomicReference<>();

    @o0
    public <Data, TResource, Transcode> t<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> tVar;
        j b10 = b(cls, cls2, cls3);
        synchronized (this.f11057a) {
            tVar = this.f11057a.get(b10);
        }
        this.f11058b.set(b10);
        return tVar;
    }

    public final j b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        j andSet = this.f11058b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new j();
        }
        andSet.b(cls, cls2, cls3);
        return andSet;
    }

    public boolean c(@o0 t<?, ?, ?> tVar) {
        return f11056c.equals(tVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, @o0 t<?, ?, ?> tVar) {
        synchronized (this.f11057a) {
            a<j, t<?, ?, ?>> aVar = this.f11057a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f11056c;
            }
            aVar.put(jVar, tVar);
        }
    }
}
