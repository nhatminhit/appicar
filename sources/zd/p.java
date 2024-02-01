package zd;

import fh.g;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import oe.e;
import oe.f;
import oe.m;
import xe.l0;

public class p {
    @h1(version = "1.1")
    @e
    public static final void a(@g Throwable th2, @g Throwable th3) {
        l0.p(th2, "<this>");
        l0.p(th3, "exception");
        if (th2 != th3) {
            m.f21456a.a(th2, th3);
        }
    }

    @g
    public static final StackTraceElement[] b(@g Throwable th2) {
        l0.p(th2, "<this>");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        l0.m(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void c(Throwable th2) {
    }

    @g
    public static final List<Throwable> d(@g Throwable th2) {
        l0.p(th2, "<this>");
        return m.f21456a.d(th2);
    }

    @h1(version = "1.4")
    public static /* synthetic */ void e(Throwable th2) {
    }

    @f
    public static final void f(Throwable th2) {
        l0.p(th2, "<this>");
        th2.printStackTrace();
    }

    @f
    public static final void g(Throwable th2, PrintStream printStream) {
        l0.p(th2, "<this>");
        l0.p(printStream, "stream");
        th2.printStackTrace(printStream);
    }

    @f
    public static final void h(Throwable th2, PrintWriter printWriter) {
        l0.p(th2, "<this>");
        l0.p(printWriter, "writer");
        th2.printStackTrace(printWriter);
    }

    @g
    @h1(version = "1.4")
    public static final String i(@g Throwable th2) {
        l0.p(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        l0.o(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
