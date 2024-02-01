package i5;

import a6.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import og.c0;
import v4.r;
import w4.i;
import w4.j;
import w4.n;

public class l extends n {
    public static final long S = 1;
    public static final int T = 1000;
    public LinkedList<a> Q;
    public transient Closeable R;

    public static class a implements Serializable {
        public static final long S = 2;
        public transient Object O;
        public String P;
        public int Q;
        public String R;

        public a() {
            this.Q = -1;
        }

        public a(Object obj) {
            this.Q = -1;
            this.O = obj;
        }

        public a(Object obj, int i10) {
            this.O = obj;
            this.Q = i10;
        }

        public a(Object obj, String str) {
            this.Q = -1;
            this.O = obj;
            if (str != null) {
                this.P = str;
                return;
            }
            throw new NullPointerException("Cannot pass null fieldName");
        }

        public String a() {
            char c10;
            if (this.R == null) {
                StringBuilder sb2 = new StringBuilder();
                Object obj = this.O;
                if (obj != null) {
                    Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i10 = 0;
                    while (cls.isArray()) {
                        cls = cls.getComponentType();
                        i10++;
                    }
                    String name = cls.getName();
                    while (true) {
                        sb2.append(name);
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        name = c0.f21474n;
                    }
                } else {
                    sb2.append("UNKNOWN");
                }
                sb2.append('[');
                if (this.P != null) {
                    c10 = '\"';
                    sb2.append('\"');
                    sb2.append(this.P);
                } else {
                    int i11 = this.Q;
                    if (i11 >= 0) {
                        sb2.append(i11);
                        sb2.append(']');
                        this.R = sb2.toString();
                    } else {
                        c10 = '?';
                    }
                }
                sb2.append(c10);
                sb2.append(']');
                this.R = sb2.toString();
            }
            return this.R;
        }

        public String b() {
            return this.P;
        }

        @r
        public Object c() {
            return this.O;
        }

        public int d() {
            return this.Q;
        }

        public void e(String str) {
            this.R = str;
        }

        public void f(String str) {
            this.P = str;
        }

        public void g(int i10) {
            this.Q = i10;
        }

        public Object h() {
            a();
            return this;
        }

        public String toString() {
            return a();
        }
    }

    public l(Closeable closeable, String str) {
        super(str);
        this.R = closeable;
        if (closeable instanceof w4.l) {
            this.O = ((w4.l) closeable).c2();
        }
    }

    public l(Closeable closeable, String str, Throwable th2) {
        super(str, th2);
        j c22;
        this.R = closeable;
        if (th2 instanceof n) {
            c22 = ((n) th2).b();
        } else if (closeable instanceof w4.l) {
            c22 = ((w4.l) closeable).c2();
        } else {
            return;
        }
        this.O = c22;
    }

    public l(Closeable closeable, String str, j jVar) {
        super(str, jVar);
        this.R = closeable;
    }

    @Deprecated
    public l(String str) {
        super(str);
    }

    @Deprecated
    public l(String str, Throwable th2) {
        super(str, th2);
    }

    @Deprecated
    public l(String str, j jVar) {
        super(str, jVar);
    }

    @Deprecated
    public l(String str, j jVar, Throwable th2) {
        super(str, jVar, th2);
    }

    public static l h(g gVar, String str) {
        return new l((Closeable) gVar.Z(), str);
    }

    public static l i(g gVar, String str, Throwable th2) {
        return new l((Closeable) gVar.Z(), str, th2);
    }

    public static l j(e0 e0Var, String str) {
        return new l((Closeable) e0Var.o0(), str);
    }

    public static l k(e0 e0Var, String str, Throwable th2) {
        return new l((Closeable) e0Var.o0(), str, th2);
    }

    public static l l(i iVar, String str) {
        return new l((Closeable) iVar, str, (Throwable) null);
    }

    public static l m(i iVar, String str, Throwable th2) {
        return new l((Closeable) iVar, str, th2);
    }

    public static l n(w4.l lVar, String str) {
        return new l((Closeable) lVar, str);
    }

    public static l o(w4.l lVar, String str, Throwable th2) {
        return new l((Closeable) lVar, str, th2);
    }

    public static l p(IOException iOException) {
        return new l((Closeable) null, String.format("Unexpected IOException (of type %s): %s", new Object[]{iOException.getClass().getName(), h.o(iOException)}));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.Closeable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i5.l w(java.lang.Throwable r4, i5.l.a r5) {
        /*
            boolean r0 = r4 instanceof i5.l
            if (r0 == 0) goto L_0x0007
            i5.l r4 = (i5.l) r4
            goto L_0x004a
        L_0x0007:
            java.lang.String r0 = a6.h.o(r4)
            if (r0 == 0) goto L_0x0013
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0031
        L_0x0013:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(was "
            r0.append(r1)
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0031:
            r1 = 0
            boolean r2 = r4 instanceof w4.n
            if (r2 == 0) goto L_0x0044
            r2 = r4
            w4.n r2 = (w4.n) r2
            java.lang.Object r2 = r2.e()
            boolean r3 = r2 instanceof java.io.Closeable
            if (r3 == 0) goto L_0x0044
            r1 = r2
            java.io.Closeable r1 = (java.io.Closeable) r1
        L_0x0044:
            i5.l r2 = new i5.l
            r2.<init>((java.io.Closeable) r1, (java.lang.String) r0, (java.lang.Throwable) r4)
            r4 = r2
        L_0x004a:
            r4.t(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.l.w(java.lang.Throwable, i5.l$a):i5.l");
    }

    public static l x(Throwable th2, Object obj, int i10) {
        return w(th2, new a(obj, i10));
    }

    public static l y(Throwable th2, Object obj, String str) {
        return w(th2, new a(obj, str));
    }

    @r
    public Object e() {
        return this.R;
    }

    public void f(StringBuilder sb2) {
        LinkedList<a> linkedList = this.Q;
        if (linkedList != null) {
            Iterator<a> it = linkedList.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                if (it.hasNext()) {
                    sb2.append("->");
                }
            }
        }
    }

    public String g() {
        String message = super.getMessage();
        if (this.Q == null) {
            return message;
        }
        StringBuilder sb2 = message == null ? new StringBuilder() : new StringBuilder(message);
        sb2.append(" (through reference chain: ");
        StringBuilder s10 = s(sb2);
        s10.append(')');
        return s10.toString();
    }

    public String getLocalizedMessage() {
        return g();
    }

    public String getMessage() {
        return g();
    }

    public List<a> q() {
        LinkedList<a> linkedList = this.Q;
        return linkedList == null ? Collections.emptyList() : Collections.unmodifiableList(linkedList);
    }

    public String r() {
        return s(new StringBuilder()).toString();
    }

    public StringBuilder s(StringBuilder sb2) {
        f(sb2);
        return sb2;
    }

    public void t(a aVar) {
        if (this.Q == null) {
            this.Q = new LinkedList<>();
        }
        if (this.Q.size() < 1000) {
            this.Q.addFirst(aVar);
        }
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public void u(Object obj, int i10) {
        t(new a(obj, i10));
    }

    public void v(Object obj, String str) {
        t(new a(obj, str));
    }
}
