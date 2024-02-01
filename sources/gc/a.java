package gc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import gc.v;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final v f18945a;

    /* renamed from: b  reason: collision with root package name */
    public final z f18946b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<T> f18947c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f18948d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18949e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18950f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18951g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f18952h;

    /* renamed from: i  reason: collision with root package name */
    public final String f18953i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f18954j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f18955k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f18956l;

    /* renamed from: gc.a$a  reason: collision with other inner class name */
    public static class C0310a<M> extends WeakReference<M> {

        /* renamed from: a  reason: collision with root package name */
        public final a f18957a;

        public C0310a(a aVar, M m10, ReferenceQueue<? super M> referenceQueue) {
            super(m10, referenceQueue);
            this.f18957a = aVar;
        }
    }

    public a(v vVar, T t10, z zVar, int i10, int i11, int i12, Drawable drawable, String str, Object obj, boolean z10) {
        this.f18945a = vVar;
        this.f18946b = zVar;
        this.f18947c = t10 == null ? null : new C0310a(this, t10, vVar.f19128k);
        this.f18949e = i10;
        this.f18950f = i11;
        this.f18948d = z10;
        this.f18951g = i12;
        this.f18952h = drawable;
        this.f18953i = str;
        this.f18954j = obj == null ? this : obj;
    }

    public void a() {
        this.f18956l = true;
    }

    public abstract void b(Bitmap bitmap, v.e eVar);

    public abstract void c();

    public String d() {
        return this.f18953i;
    }

    public int e() {
        return this.f18949e;
    }

    public int f() {
        return this.f18950f;
    }

    public v g() {
        return this.f18945a;
    }

    public v.f h() {
        return this.f18946b.f19179r;
    }

    public z i() {
        return this.f18946b;
    }

    public Object j() {
        return this.f18954j;
    }

    public T k() {
        WeakReference<T> weakReference = this.f18947c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean l() {
        return this.f18956l;
    }

    public boolean m() {
        return this.f18955k;
    }
}
