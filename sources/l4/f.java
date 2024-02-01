package l4;

import d.m0;
import java.util.ArrayList;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<?, ?>> f10120a = new ArrayList();

    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f10121a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f10122b;

        /* renamed from: c  reason: collision with root package name */
        public final e<Z, R> f10123c;

        public a(@m0 Class<Z> cls, @m0 Class<R> cls2, @m0 e<Z, R> eVar) {
            this.f10121a = cls;
            this.f10122b = cls2;
            this.f10123c = eVar;
        }

        public boolean a(@m0 Class<?> cls, @m0 Class<?> cls2) {
            return this.f10121a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f10122b);
        }
    }

    @m0
    public synchronized <Z, R> e<Z, R> a(@m0 Class<Z> cls, @m0 Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a next : this.f10120a) {
            if (next.a(cls, cls2)) {
                return next.f10123c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @m0
    public synchronized <Z, R> List<Class<R>> b(@m0 Class<Z> cls, @m0 Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> a10 : this.f10120a) {
            if (a10.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(@m0 Class<Z> cls, @m0 Class<R> cls2, @m0 e<Z, R> eVar) {
        this.f10120a.add(new a(cls, cls2, eVar));
    }
}
