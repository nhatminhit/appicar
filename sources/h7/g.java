package h7;

public class g extends Exception {
    public g(Exception exc) {
        super(exc);
    }

    public g(String str) {
        super(str);
    }

    public g(String str, Throwable th2) {
        super(str, th2);
    }
}
