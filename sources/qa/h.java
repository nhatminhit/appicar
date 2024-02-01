package qa;

public final class h extends q {
    public static final h Q;

    static {
        h hVar = new h();
        Q = hVar;
        hVar.setStackTrace(q.P);
    }

    public h() {
    }

    public h(Throwable th2) {
        super(th2);
    }

    public static h a() {
        return q.O ? new h() : Q;
    }

    public static h b(Throwable th2) {
        return q.O ? new h(th2) : Q;
    }
}
