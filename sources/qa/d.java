package qa;

public final class d extends q {
    public static final d Q;

    static {
        d dVar = new d();
        Q = dVar;
        dVar.setStackTrace(q.P);
    }

    public d() {
    }

    public d(Throwable th2) {
        super(th2);
    }

    public static d a() {
        return q.O ? new d() : Q;
    }

    public static d b(Throwable th2) {
        return q.O ? new d(th2) : Q;
    }
}
