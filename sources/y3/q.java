package y3;

import d.m0;
import d.o0;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v3.f;

public final class q extends Exception {
    public static final long U = 1;
    public static final StackTraceElement[] V = new StackTraceElement[0];
    public final List<Throwable> O;
    public f P;
    public v3.a Q;
    public Class<?> R;
    public String S;
    @o0
    public Exception T;

    public static final class a implements Appendable {
        public static final String Q = "";
        public static final String R = "  ";
        public final Appendable O;
        public boolean P = true;

        public a(Appendable appendable) {
            this.O = appendable;
        }

        @m0
        public final CharSequence a(@o0 CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c10) throws IOException {
            boolean z10 = false;
            if (this.P) {
                this.P = false;
                this.O.append(R);
            }
            if (c10 == 10) {
                z10 = true;
            }
            this.P = z10;
            this.O.append(c10);
            return this;
        }

        public Appendable append(@o0 CharSequence charSequence) throws IOException {
            CharSequence a10 = a(charSequence);
            return append(a10, 0, a10.length());
        }

        public Appendable append(@o0 CharSequence charSequence, int i10, int i11) throws IOException {
            CharSequence a10 = a(charSequence);
            boolean z10 = false;
            if (this.P) {
                this.P = false;
                this.O.append(R);
            }
            if (a10.length() > 0 && a10.charAt(i11 - 1) == 10) {
                z10 = true;
            }
            this.P = z10;
            this.O.append(a10, i10, i11);
            return this;
        }
    }

    public q(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public q(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    public q(String str, List<Throwable> list) {
        this.S = str;
        setStackTrace(V);
        this.O = list;
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i10);
            if (th2 instanceof q) {
                ((q) th2).i(appendable);
            } else {
                d(th2, appendable);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void a(Throwable th2, List<Throwable> list) {
        if (th2 instanceof q) {
            for (Throwable a10 : ((q) th2).e()) {
                a(a10, list);
            }
            return;
        }
        list.add(th2);
    }

    public List<Throwable> e() {
        return this.O;
    }

    @o0
    public Exception f() {
        return this.T;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> g() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.S);
        String str4 = "";
        if (this.R != null) {
            str = ", " + this.R;
        } else {
            str = str4;
        }
        sb2.append(str);
        if (this.Q != null) {
            str2 = ", " + this.Q;
        } else {
            str2 = str4;
        }
        sb2.append(str2);
        if (this.P != null) {
            str4 = ", " + this.P;
        }
        sb2.append(str4);
        List<Throwable> g10 = g();
        if (g10.isEmpty()) {
            return sb2.toString();
        }
        if (g10.size() == 1) {
            str3 = "\nThere was 1 cause:";
        } else {
            sb2.append("\nThere were ");
            sb2.append(g10.size());
            str3 = " causes:";
        }
        sb2.append(str3);
        for (Throwable next : g10) {
            sb2.append(10);
            sb2.append(next.getClass().getName());
            sb2.append('(');
            sb2.append(next.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public void h(String str) {
        List<Throwable> g10 = g();
        int size = g10.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Throwable th2 = g10.get(i10);
            i10 = i11;
        }
    }

    public final void i(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public void j(f fVar, v3.a aVar) {
        k(fVar, aVar, (Class<?>) null);
    }

    public void k(f fVar, v3.a aVar, Class<?> cls) {
        this.P = fVar;
        this.Q = aVar;
        this.R = cls;
    }

    public void l(@o0 Exception exc) {
        this.T = exc;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        i(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        i(printWriter);
    }
}
