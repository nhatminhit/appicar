package w4;

public class h extends n {
    public static final long R = 123;
    public transient i Q;

    @Deprecated
    public h(String str) {
        super(str, (j) null);
    }

    @Deprecated
    public h(String str, Throwable th2) {
        super(str, (j) null, th2);
    }

    public h(String str, Throwable th2, i iVar) {
        super(str, (j) null, th2);
        this.Q = iVar;
    }

    public h(String str, i iVar) {
        super(str, (j) null);
        this.Q = iVar;
    }

    @Deprecated
    public h(Throwable th2) {
        super(th2);
    }

    public h(Throwable th2, i iVar) {
        super(th2);
        this.Q = iVar;
    }

    /* renamed from: f */
    public i e() {
        return this.Q;
    }

    public h g(i iVar) {
        this.Q = iVar;
        return this;
    }
}
