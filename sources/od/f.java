package od;

public class f extends Exception {
    public f() {
    }

    public f(String str) {
        super(str);
    }

    public f(String str, Throwable th2) {
        super(str, th2);
    }

    public f(Throwable th2) {
        super(th2);
    }
}
