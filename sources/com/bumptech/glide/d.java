package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.b;
import d.g1;
import d.m0;
import d.o0;
import d.z;
import java.util.List;
import java.util.Map;
import p4.g;
import p4.h;
import q4.k;
import q4.r;
import z3.b;

public class d extends ContextWrapper {
    @g1

    /* renamed from: k  reason: collision with root package name */
    public static final m<?, ?> f4947k = new a();

    /* renamed from: a  reason: collision with root package name */
    public final b f4948a;

    /* renamed from: b  reason: collision with root package name */
    public final j f4949b;

    /* renamed from: c  reason: collision with root package name */
    public final k f4950c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a f4951d;

    /* renamed from: e  reason: collision with root package name */
    public final List<g<Object>> f4952e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, m<?, ?>> f4953f;

    /* renamed from: g  reason: collision with root package name */
    public final y3.k f4954g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4955h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4956i;
    @o0
    @z("this")

    /* renamed from: j  reason: collision with root package name */
    public h f4957j;

    public d(@m0 Context context, @m0 z3.b bVar, @m0 j jVar, @m0 k kVar, @m0 b.a aVar, @m0 Map<Class<?>, m<?, ?>> map, @m0 List<g<Object>> list, @m0 y3.k kVar2, boolean z10, int i10) {
        super(context.getApplicationContext());
        this.f4948a = bVar;
        this.f4949b = jVar;
        this.f4950c = kVar;
        this.f4951d = aVar;
        this.f4952e = list;
        this.f4953f = map;
        this.f4954g = kVar2;
        this.f4955h = z10;
        this.f4956i = i10;
    }

    @m0
    public <X> r<ImageView, X> a(@m0 ImageView imageView, @m0 Class<X> cls) {
        return this.f4950c.a(imageView, cls);
    }

    @m0
    public z3.b b() {
        return this.f4948a;
    }

    public List<g<Object>> c() {
        return this.f4952e;
    }

    public synchronized h d() {
        if (this.f4957j == null) {
            this.f4957j = (h) this.f4951d.build().r0();
        }
        return this.f4957j;
    }

    @m0
    public <T> m<?, T> e(@m0 Class<T> cls) {
        m<?, T> mVar = this.f4953f.get(cls);
        if (mVar == null) {
            for (Map.Entry next : this.f4953f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) next.getValue();
                }
            }
        }
        return mVar == null ? f4947k : mVar;
    }

    @m0
    public y3.k f() {
        return this.f4954g;
    }

    public int g() {
        return this.f4956i;
    }

    @m0
    public j h() {
        return this.f4949b;
    }

    public boolean i() {
        return this.f4955h;
    }
}
