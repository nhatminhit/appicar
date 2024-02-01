package u4;

import d.m0;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f13730a = false;

    public static class b extends c {

        /* renamed from: b  reason: collision with root package name */
        public volatile RuntimeException f13731b;

        public b() {
            super();
        }

        public void b(boolean z10) {
            this.f13731b = z10 ? new RuntimeException("Released") : null;
        }

        public void c() {
            if (this.f13731b != null) {
                throw new IllegalStateException("Already released", this.f13731b);
            }
        }
    }

    /* renamed from: u4.c$c  reason: collision with other inner class name */
    public static class C0229c extends c {

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f13732b;

        public C0229c() {
            super();
        }

        public void b(boolean z10) {
            this.f13732b = z10;
        }

        public void c() {
            if (this.f13732b) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public c() {
    }

    @m0
    public static c a() {
        return new C0229c();
    }

    public abstract void b(boolean z10);

    public abstract void c();
}
