package qa;

public abstract class q extends Exception {
    public static final boolean O = (System.getProperty("surefire.test.class.path") != null);
    public static final StackTraceElement[] P = new StackTraceElement[0];

    public q() {
    }

    public q(Throwable th2) {
        super(th2);
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
