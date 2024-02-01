package dh;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public c f18379a;

    /* renamed from: b  reason: collision with root package name */
    public c f18380b;

    public synchronized void a(c cVar) {
        if (cVar != null) {
            try {
                c cVar2 = this.f18380b;
                if (cVar2 != null) {
                    cVar2.f18378c = cVar;
                    this.f18380b = cVar;
                } else if (this.f18379a == null) {
                    this.f18380b = cVar;
                    this.f18379a = cVar;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }

    public synchronized c b() {
        c cVar;
        cVar = this.f18379a;
        if (cVar != null) {
            c cVar2 = cVar.f18378c;
            this.f18379a = cVar2;
            if (cVar2 == null) {
                this.f18380b = null;
            }
        }
        return cVar;
    }

    public synchronized c c(int i10) throws InterruptedException {
        if (this.f18379a == null) {
            wait((long) i10);
        }
        return b();
    }
}
