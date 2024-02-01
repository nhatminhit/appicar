package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import d.m0;
import d.o0;
import d4.n;
import d4.o;
import d4.p;
import e1.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o4.f;
import v3.k;
import v3.l;
import w3.e;
import y3.i;
import y3.t;
import y3.v;

public class j {

    /* renamed from: k  reason: collision with root package name */
    public static final String f4969k = "Gif";

    /* renamed from: l  reason: collision with root package name */
    public static final String f4970l = "Bitmap";

    /* renamed from: m  reason: collision with root package name */
    public static final String f4971m = "BitmapDrawable";

    /* renamed from: n  reason: collision with root package name */
    public static final String f4972n = "legacy_prepend_all";

    /* renamed from: o  reason: collision with root package name */
    public static final String f4973o = "legacy_append";

    /* renamed from: a  reason: collision with root package name */
    public final p f4974a;

    /* renamed from: b  reason: collision with root package name */
    public final o4.a f4975b;

    /* renamed from: c  reason: collision with root package name */
    public final o4.e f4976c;

    /* renamed from: d  reason: collision with root package name */
    public final f f4977d;

    /* renamed from: e  reason: collision with root package name */
    public final w3.f f4978e;

    /* renamed from: f  reason: collision with root package name */
    public final l4.f f4979f;

    /* renamed from: g  reason: collision with root package name */
    public final o4.b f4980g;

    /* renamed from: h  reason: collision with root package name */
    public final o4.d f4981h = new o4.d();

    /* renamed from: i  reason: collision with root package name */
    public final o4.c f4982i = new o4.c();

    /* renamed from: j  reason: collision with root package name */
    public final m.a<List<Throwable>> f4983j;

    public static class a extends RuntimeException {
        public a(@m0 String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(@m0 Class<?> cls, @m0 Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(@m0 Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(@m0 M m10, @m0 List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }
    }

    public static class d extends a {
        public d(@m0 Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(@m0 Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public j() {
        m.a<List<Throwable>> f10 = u4.a.f();
        this.f4983j = f10;
        this.f4974a = new p(f10);
        this.f4975b = new o4.a();
        this.f4976c = new o4.e();
        this.f4977d = new f();
        this.f4978e = new w3.f();
        this.f4979f = new l4.f();
        this.f4980g = new o4.b();
        z(Arrays.asList(new String[]{f4969k, f4970l, f4971m}));
    }

    @m0
    public <Model, Data> j a(@m0 Class<Model> cls, @m0 Class<Data> cls2, @m0 o<Model, Data> oVar) {
        this.f4974a.a(cls, cls2, oVar);
        return this;
    }

    @m0
    public <Data, TResource> j b(@m0 Class<Data> cls, @m0 Class<TResource> cls2, @m0 k<Data, TResource> kVar) {
        e(f4973o, cls, cls2, kVar);
        return this;
    }

    @m0
    public <Data> j c(@m0 Class<Data> cls, @m0 v3.d<Data> dVar) {
        this.f4975b.a(cls, dVar);
        return this;
    }

    @m0
    public <TResource> j d(@m0 Class<TResource> cls, @m0 l<TResource> lVar) {
        this.f4977d.a(cls, lVar);
        return this;
    }

    @m0
    public <Data, TResource> j e(@m0 String str, @m0 Class<Data> cls, @m0 Class<TResource> cls2, @m0 k<Data, TResource> kVar) {
        this.f4976c.a(str, kVar, cls, cls2);
        return this;
    }

    @m0
    public final <Data, TResource, Transcode> List<i<Data, TResource, Transcode>> f(@m0 Class<Data> cls, @m0 Class<TResource> cls2, @m0 Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f4976c.d(cls, cls2)) {
            for (Class next2 : this.f4979f.b(next, cls3)) {
                arrayList.add(new i(cls, next, next2, this.f4976c.b(cls, next), this.f4979f.a(next, next2), this.f4983j));
            }
        }
        return arrayList;
    }

    @m0
    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b10 = this.f4980g.b();
        if (!b10.isEmpty()) {
            return b10;
        }
        throw new b();
    }

    @o0
    public <Data, TResource, Transcode> t<Data, TResource, Transcode> h(@m0 Class<Data> cls, @m0 Class<TResource> cls2, @m0 Class<Transcode> cls3) {
        t<Data, TResource, Transcode> a10 = this.f4982i.a(cls, cls2, cls3);
        if (this.f4982i.c(a10)) {
            return null;
        }
        if (a10 == null) {
            List<i<Data, TResource, Transcode>> f10 = f(cls, cls2, cls3);
            if (f10.isEmpty()) {
                a10 = null;
            } else {
                a10 = new t<>(cls, cls2, cls3, f10, this.f4983j);
            }
            this.f4982i.d(cls, cls2, cls3, a10);
        }
        return a10;
    }

    @m0
    public <Model> List<n<Model, ?>> i(@m0 Model model) {
        return this.f4974a.e(model);
    }

    @m0
    public <Model, TResource, Transcode> List<Class<?>> j(@m0 Class<Model> cls, @m0 Class<TResource> cls2, @m0 Class<Transcode> cls3) {
        List<Class<?>> b10 = this.f4981h.b(cls, cls2, cls3);
        if (b10 == null) {
            b10 = new ArrayList<>();
            for (Class<?> d10 : this.f4974a.d(cls)) {
                for (Class next : this.f4976c.d(d10, cls2)) {
                    if (!this.f4979f.b(next, cls3).isEmpty() && !b10.contains(next)) {
                        b10.add(next);
                    }
                }
            }
            this.f4981h.c(cls, cls2, cls3, Collections.unmodifiableList(b10));
        }
        return b10;
    }

    @m0
    public <X> l<X> k(@m0 v<X> vVar) throws d {
        l<X> b10 = this.f4977d.b(vVar.d());
        if (b10 != null) {
            return b10;
        }
        throw new d(vVar.d());
    }

    @m0
    public <X> w3.e<X> l(@m0 X x10) {
        return this.f4978e.a(x10);
    }

    @m0
    public <X> v3.d<X> m(@m0 X x10) throws e {
        v3.d<X> b10 = this.f4975b.b(x10.getClass());
        if (b10 != null) {
            return b10;
        }
        throw new e(x10.getClass());
    }

    public boolean n(@m0 v<?> vVar) {
        return this.f4977d.b(vVar.d()) != null;
    }

    @m0
    public <Model, Data> j o(@m0 Class<Model> cls, @m0 Class<Data> cls2, @m0 o<Model, Data> oVar) {
        this.f4974a.g(cls, cls2, oVar);
        return this;
    }

    @m0
    public <Data, TResource> j p(@m0 Class<Data> cls, @m0 Class<TResource> cls2, @m0 k<Data, TResource> kVar) {
        s(f4972n, cls, cls2, kVar);
        return this;
    }

    @m0
    public <Data> j q(@m0 Class<Data> cls, @m0 v3.d<Data> dVar) {
        this.f4975b.c(cls, dVar);
        return this;
    }

    @m0
    public <TResource> j r(@m0 Class<TResource> cls, @m0 l<TResource> lVar) {
        this.f4977d.c(cls, lVar);
        return this;
    }

    @m0
    public <Data, TResource> j s(@m0 String str, @m0 Class<Data> cls, @m0 Class<TResource> cls2, @m0 k<Data, TResource> kVar) {
        this.f4976c.e(str, kVar, cls, cls2);
        return this;
    }

    @m0
    public j t(@m0 ImageHeaderParser imageHeaderParser) {
        this.f4980g.a(imageHeaderParser);
        return this;
    }

    @m0
    public <TResource, Transcode> j u(@m0 Class<TResource> cls, @m0 Class<Transcode> cls2, @m0 l4.e<TResource, Transcode> eVar) {
        this.f4979f.c(cls, cls2, eVar);
        return this;
    }

    @Deprecated
    @m0
    public <Data> j v(@m0 Class<Data> cls, @m0 v3.d<Data> dVar) {
        return c(cls, dVar);
    }

    @Deprecated
    @m0
    public <TResource> j w(@m0 Class<TResource> cls, @m0 l<TResource> lVar) {
        return d(cls, lVar);
    }

    @m0
    public j x(@m0 e.a<?> aVar) {
        this.f4978e.b(aVar);
        return this;
    }

    @m0
    public <Model, Data> j y(@m0 Class<Model> cls, @m0 Class<Data> cls2, @m0 o<? extends Model, ? extends Data> oVar) {
        this.f4974a.i(cls, cls2, oVar);
        return this;
    }

    @m0
    public final j z(@m0 List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, f4972n);
        arrayList.add(f4973o);
        this.f4976c.f(arrayList);
        return this;
    }
}
