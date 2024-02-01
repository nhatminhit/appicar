package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import d.m0;
import d.o0;
import d.s0;
import d.u;
import d.z;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m4.c;
import m4.d;
import m4.i;
import m4.m;
import m4.n;
import m4.o;
import p4.g;
import p4.h;
import q4.f;
import q4.p;
import y3.j;

public class l implements ComponentCallbacks2, i, g<k<Drawable>> {

    /* renamed from: a0  reason: collision with root package name */
    public static final h f4986a0 = ((h) h.d1(Bitmap.class).r0());

    /* renamed from: b0  reason: collision with root package name */
    public static final h f4987b0 = ((h) h.d1(k4.c.class).r0());

    /* renamed from: c0  reason: collision with root package name */
    public static final h f4988c0 = ((h) ((h) h.e1(j.f15394c).F0(h.LOW)).N0(true));
    public final b O;
    public final Context P;
    public final m4.h Q;
    @z("this")
    public final n R;
    @z("this")
    public final m S;
    @z("this")
    public final o T;
    public final Runnable U;
    public final Handler V;
    public final m4.c W;
    public final CopyOnWriteArrayList<g<Object>> X;
    @z("this")
    public h Y;
    public boolean Z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            l lVar = l.this;
            lVar.Q.b(lVar);
        }
    }

    public static class b extends f<View, Object> {
        public b(@m0 View view) {
            super(view);
        }

        public void f(@o0 Drawable drawable) {
        }

        public void k(@o0 Drawable drawable) {
        }

        public void s(@m0 Object obj, @o0 r4.f<? super Object> fVar) {
        }
    }

    public class c implements c.a {
        @z("RequestManager.this")

        /* renamed from: a  reason: collision with root package name */
        public final n f4989a;

        public c(@m0 n nVar) {
            this.f4989a = nVar;
        }

        public void f(boolean z10) {
            if (z10) {
                synchronized (l.this) {
                    this.f4989a.g();
                }
            }
        }
    }

    public l(@m0 b bVar, @m0 m4.h hVar, @m0 m mVar, @m0 Context context) {
        this(bVar, hVar, mVar, new n(), bVar.h(), context);
    }

    public l(b bVar, m4.h hVar, m mVar, n nVar, d dVar, Context context) {
        this.T = new o();
        a aVar = new a();
        this.U = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.V = handler;
        this.O = bVar;
        this.Q = hVar;
        this.S = mVar;
        this.R = nVar;
        this.P = context;
        m4.c a10 = dVar.a(context.getApplicationContext(), new c(nVar));
        this.W = a10;
        if (t4.m.s()) {
            handler.post(aVar);
        } else {
            hVar.b(this);
        }
        hVar.b(a10);
        this.X = new CopyOnWriteArrayList<>(bVar.j().c());
        Z(bVar.j().d());
        bVar.u(this);
    }

    public void A(@m0 View view) {
        B(new b(view));
    }

    public void B(@o0 p<?> pVar) {
        if (pVar != null) {
            c0(pVar);
        }
    }

    @d.j
    @m0
    public k<File> C(@o0 Object obj) {
        return D().n(obj);
    }

    @d.j
    @m0
    public k<File> D() {
        return v(File.class).a(f4988c0);
    }

    public List<g<Object>> E() {
        return this.X;
    }

    public synchronized h F() {
        return this.Y;
    }

    @m0
    public <T> m<?, T> G(Class<T> cls) {
        return this.O.j().e(cls);
    }

    public synchronized boolean H() {
        return this.R.d();
    }

    @d.j
    @m0
    /* renamed from: I */
    public k<Drawable> m(@o0 Bitmap bitmap) {
        return x().m(bitmap);
    }

    @d.j
    @m0
    /* renamed from: J */
    public k<Drawable> k(@o0 Drawable drawable) {
        return x().k(drawable);
    }

    @d.j
    @m0
    /* renamed from: K */
    public k<Drawable> g(@o0 Uri uri) {
        return x().g(uri);
    }

    @d.j
    @m0
    /* renamed from: L */
    public k<Drawable> j(@o0 File file) {
        return x().j(file);
    }

    @d.j
    @m0
    /* renamed from: M */
    public k<Drawable> p(@o0 @s0 @u Integer num) {
        return x().p(num);
    }

    @d.j
    @m0
    /* renamed from: N */
    public k<Drawable> n(@o0 Object obj) {
        return x().n(obj);
    }

    @d.j
    @m0
    /* renamed from: O */
    public k<Drawable> t(@o0 String str) {
        return x().t(str);
    }

    @d.j
    @Deprecated
    /* renamed from: P */
    public k<Drawable> d(@o0 URL url) {
        return x().d(url);
    }

    @d.j
    @m0
    /* renamed from: Q */
    public k<Drawable> i(@o0 byte[] bArr) {
        return x().i(bArr);
    }

    public synchronized void R() {
        this.R.e();
    }

    public synchronized void S() {
        R();
        for (l R2 : this.S.a()) {
            R2.R();
        }
    }

    public synchronized void T() {
        this.R.f();
    }

    public synchronized void U() {
        T();
        for (l T2 : this.S.a()) {
            T2.T();
        }
    }

    public synchronized void V() {
        this.R.h();
    }

    public synchronized void W() {
        t4.m.b();
        V();
        for (l V2 : this.S.a()) {
            V2.V();
        }
    }

    @m0
    public synchronized l X(@m0 h hVar) {
        Z(hVar);
        return this;
    }

    public void Y(boolean z10) {
        this.Z = z10;
    }

    public synchronized void Z(@m0 h hVar) {
        this.Y = (h) ((h) hVar.clone()).q();
    }

    public synchronized void a() {
        T();
        this.T.a();
    }

    public synchronized void a0(@m0 p<?> pVar, @m0 p4.d dVar) {
        this.T.g(pVar);
        this.R.i(dVar);
    }

    public synchronized void b() {
        V();
        this.T.b();
    }

    public synchronized boolean b0(@m0 p<?> pVar) {
        p4.d q10 = pVar.q();
        if (q10 == null) {
            return true;
        }
        if (!this.R.b(q10)) {
            return false;
        }
        this.T.i(pVar);
        pVar.h((p4.d) null);
        return true;
    }

    public l c(g<Object> gVar) {
        this.X.add(gVar);
        return this;
    }

    public final void c0(@m0 p<?> pVar) {
        boolean b02 = b0(pVar);
        p4.d q10 = pVar.q();
        if (!b02 && !this.O.v(pVar) && q10 != null) {
            pVar.h((p4.d) null);
            q10.clear();
        }
    }

    public final synchronized void d0(@m0 h hVar) {
        this.Y = (h) this.Y.a(hVar);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public synchronized void onDestroy() {
        this.T.onDestroy();
        for (p<?> B : this.T.d()) {
            B(B);
        }
        this.T.c();
        this.R.c();
        this.Q.a(this);
        this.Q.a(this.W);
        this.V.removeCallbacks(this.U);
        this.O.A(this);
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.Z) {
            S();
        }
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.R + ", treeNode=" + this.S + p7.a.f11639j;
    }

    @m0
    public synchronized l u(@m0 h hVar) {
        d0(hVar);
        return this;
    }

    @d.j
    @m0
    public <ResourceType> k<ResourceType> v(@m0 Class<ResourceType> cls) {
        return new k<>(this.O, this, cls, this.P);
    }

    @d.j
    @m0
    public k<Bitmap> w() {
        return v(Bitmap.class).a(f4986a0);
    }

    @d.j
    @m0
    public k<Drawable> x() {
        return v(Drawable.class);
    }

    @d.j
    @m0
    public k<File> y() {
        return v(File.class).a(h.x1(true));
    }

    @d.j
    @m0
    public k<k4.c> z() {
        return v(k4.c.class).a(f4987b0);
    }
}
