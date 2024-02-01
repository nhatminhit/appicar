package j8;

import d.o0;

public abstract class o1 {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public Object f9784a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9785b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f9786c;

    public o1(d dVar, Object obj) {
        this.f9786c = dVar;
        this.f9784a = obj;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f9784a;
            if (this.f9785b) {
                String obj2 = toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Callback proxy ");
                sb2.append(obj2);
                sb2.append(" being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.f9785b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f9784a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f9786c.f9714f0) {
            this.f9786c.f9714f0.remove(this);
        }
    }
}
