package w4;

import java.io.IOException;

public class n extends IOException {
    public static final long P = 123;
    public j O;

    public n(String str) {
        super(str);
    }

    public n(String str, Throwable th2) {
        this(str, (j) null, th2);
    }

    public n(String str, j jVar) {
        this(str, jVar, (Throwable) null);
    }

    public n(String str, j jVar, Throwable th2) {
        super(str);
        if (th2 != null) {
            initCause(th2);
        }
        this.O = jVar;
    }

    public n(Throwable th2) {
        this((String) null, (j) null, th2);
    }

    public void a() {
        this.O = null;
    }

    public j b() {
        return this.O;
    }

    public String c() {
        return null;
    }

    public String d() {
        return super.getMessage();
    }

    public Object e() {
        return null;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        j b10 = b();
        String c10 = c();
        if (b10 == null && c10 == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(message);
        if (c10 != null) {
            sb2.append(c10);
        }
        if (b10 != null) {
            sb2.append(10);
            sb2.append(" at ");
            sb2.append(b10.toString());
        }
        return sb2.toString();
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
