package o4;

import androidx.collection.a;
import d.m0;
import d.o0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import t4.j;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<j> f11059a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    public final a<j, List<Class<?>>> f11060b = new a<>();

    public void a() {
        synchronized (this.f11060b) {
            this.f11060b.clear();
        }
    }

    @o0
    public List<Class<?>> b(@m0 Class<?> cls, @m0 Class<?> cls2, @m0 Class<?> cls3) {
        List<Class<?>> list;
        j andSet = this.f11059a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new j(cls, cls2, cls3);
        } else {
            andSet.b(cls, cls2, cls3);
        }
        synchronized (this.f11060b) {
            list = this.f11060b.get(andSet);
        }
        this.f11059a.set(andSet);
        return list;
    }

    public void c(@m0 Class<?> cls, @m0 Class<?> cls2, @m0 Class<?> cls3, @m0 List<Class<?>> list) {
        synchronized (this.f11060b) {
            this.f11060b.put(new j(cls, cls2, cls3), list);
        }
    }
}
