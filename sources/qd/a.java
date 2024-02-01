package qd;

public class a extends Exception {
    public String O;
    public Object P;

    public a() {
    }

    public a(String str) {
        super(str);
    }

    public a(String str, Throwable th2) {
        super(str, th2);
    }

    public a(Throwable th2) {
        super(th2);
    }
}
