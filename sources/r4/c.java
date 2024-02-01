package r4;

import android.graphics.drawable.Drawable;

public class c implements g<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f12099a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12100b;

    /* renamed from: c  reason: collision with root package name */
    public d f12101c;

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final int f12102c = 300;

        /* renamed from: a  reason: collision with root package name */
        public final int f12103a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f12104b;

        public a() {
            this(300);
        }

        public a(int i10) {
            this.f12103a = i10;
        }

        public c a() {
            return new c(this.f12103a, this.f12104b);
        }

        public a b(boolean z10) {
            this.f12104b = z10;
            return this;
        }
    }

    public c(int i10, boolean z10) {
        this.f12099a = i10;
        this.f12100b = z10;
    }

    public f<Drawable> a(v3.a aVar, boolean z10) {
        return aVar == v3.a.MEMORY_CACHE ? e.b() : b();
    }

    public final f<Drawable> b() {
        if (this.f12101c == null) {
            this.f12101c = new d(this.f12099a, this.f12100b);
        }
        return this.f12101c;
    }
}
