package androidx.media;

import androidx.media.q;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class p {

    /* renamed from: f  reason: collision with root package name */
    public static final int f3021f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f3022g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f3023h = 2;

    /* renamed from: a  reason: collision with root package name */
    public final int f3024a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3025b;

    /* renamed from: c  reason: collision with root package name */
    public int f3026c;

    /* renamed from: d  reason: collision with root package name */
    public b f3027d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3028e;

    public class a implements q.b {
        public a() {
        }

        public void a(int i10) {
            p.this.f(i10);
        }

        public void b(int i10) {
            p.this.e(i10);
        }
    }

    public static abstract class b {
        public abstract void a(p pVar);
    }

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public p(int i10, int i11, int i12) {
        this.f3024a = i10;
        this.f3025b = i11;
        this.f3026c = i12;
    }

    public final int a() {
        return this.f3026c;
    }

    public final int b() {
        return this.f3025b;
    }

    public final int c() {
        return this.f3024a;
    }

    public Object d() {
        if (this.f3028e == null) {
            this.f3028e = q.a(this.f3024a, this.f3025b, this.f3026c, new a());
        }
        return this.f3028e;
    }

    public void e(int i10) {
    }

    public void f(int i10) {
    }

    public void g(b bVar) {
        this.f3027d = bVar;
    }

    public final void h(int i10) {
        this.f3026c = i10;
        Object d10 = d();
        if (d10 != null) {
            q.b(d10, i10);
        }
        b bVar = this.f3027d;
        if (bVar != null) {
            bVar.a(this);
        }
    }
}
