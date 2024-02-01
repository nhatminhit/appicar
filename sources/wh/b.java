package wh;

import android.os.Build;
import android.util.Log;
import fh.f;
import fh.g;
import fh.h;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c[] f24286a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<c> f24287b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static volatile c[] f24288c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f24289d = new a();

    public static class a extends c {
        public void A(Throwable th2) {
            for (c A : b.f24288c) {
                A.A(th2);
            }
        }

        public void B(Throwable th2, String str, Object... objArr) {
            for (c B : b.f24288c) {
                B.B(th2, str, objArr);
            }
        }

        public void a(String str, Object... objArr) {
            for (c a10 : b.f24288c) {
                a10.a(str, objArr);
            }
        }

        public void b(Throwable th2) {
            for (c b10 : b.f24288c) {
                b10.b(th2);
            }
        }

        public void c(Throwable th2, String str, Object... objArr) {
            for (c c10 : b.f24288c) {
                c10.c(th2, str, objArr);
            }
        }

        public void d(String str, Object... objArr) {
            for (c d10 : b.f24288c) {
                d10.d(str, objArr);
            }
        }

        public void e(Throwable th2) {
            for (c e10 : b.f24288c) {
                e10.e(th2);
            }
        }

        public void f(Throwable th2, String str, Object... objArr) {
            for (c f10 : b.f24288c) {
                f10.f(th2, str, objArr);
            }
        }

        public void j(String str, Object... objArr) {
            for (c j10 : b.f24288c) {
                j10.j(str, objArr);
            }
        }

        public void k(Throwable th2) {
            for (c k10 : b.f24288c) {
                k10.k(th2);
            }
        }

        public void l(Throwable th2, String str, Object... objArr) {
            for (c l10 : b.f24288c) {
                l10.l(th2, str, objArr);
            }
        }

        public void o(int i10, String str, @g String str2, Throwable th2) {
            throw new AssertionError("Missing override for log method.");
        }

        public void p(int i10, String str, Object... objArr) {
            for (c p10 : b.f24288c) {
                p10.p(i10, str, objArr);
            }
        }

        public void q(int i10, Throwable th2) {
            for (c q10 : b.f24288c) {
                q10.q(i10, th2);
            }
        }

        public void r(int i10, Throwable th2, String str, Object... objArr) {
            for (c r10 : b.f24288c) {
                r10.r(i10, th2, str, objArr);
            }
        }

        public void t(String str, Object... objArr) {
            for (c t10 : b.f24288c) {
                t10.t(str, objArr);
            }
        }

        public void u(Throwable th2) {
            for (c u10 : b.f24288c) {
                u10.u(th2);
            }
        }

        public void v(Throwable th2, String str, Object... objArr) {
            for (c v10 : b.f24288c) {
                v10.v(th2, str, objArr);
            }
        }

        public void w(String str, Object... objArr) {
            for (c w10 : b.f24288c) {
                w10.w(str, objArr);
            }
        }

        public void x(Throwable th2) {
            for (c x10 : b.f24288c) {
                x10.x(th2);
            }
        }

        public void y(Throwable th2, String str, Object... objArr) {
            for (c y10 : b.f24288c) {
                y10.y(th2, str, objArr);
            }
        }

        public void z(String str, Object... objArr) {
            for (c z10 : b.f24288c) {
                z10.z(str, objArr);
            }
        }
    }

    /* renamed from: wh.b$b  reason: collision with other inner class name */
    public static class C0481b extends c {

        /* renamed from: b  reason: collision with root package name */
        public static final int f24290b = 4000;

        /* renamed from: c  reason: collision with root package name */
        public static final int f24291c = 23;

        /* renamed from: d  reason: collision with root package name */
        public static final int f24292d = 5;

        /* renamed from: e  reason: collision with root package name */
        public static final Pattern f24293e = Pattern.compile("(\\$\\d+)+$");

        @h
        public String C(@g StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Matcher matcher = f24293e.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String substring = className.substring(className.lastIndexOf(46) + 1);
            return (substring.length() <= 23 || Build.VERSION.SDK_INT >= 24) ? substring : substring.substring(0, 23);
        }

        public final String i() {
            String i10 = super.i();
            if (i10 != null) {
                return i10;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 5) {
                return C(stackTrace[5]);
            }
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }

        public void o(int i10, String str, @g String str2, Throwable th2) {
            int min;
            if (str2.length() >= 4000) {
                int i11 = 0;
                int length = str2.length();
                while (i11 < length) {
                    int indexOf = str2.indexOf(10, i11);
                    if (indexOf == -1) {
                        indexOf = length;
                    }
                    while (true) {
                        min = Math.min(indexOf, i11 + 4000);
                        String substring = str2.substring(i11, min);
                        if (i10 == 7) {
                            Log.wtf(str, substring);
                        } else {
                            Log.println(i10, str, substring);
                        }
                        if (min >= indexOf) {
                            break;
                        }
                        i11 = min;
                    }
                    i11 = min + 1;
                }
            } else if (i10 == 7) {
                Log.wtf(str, str2);
            } else {
                Log.println(i10, str, str2);
            }
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadLocal<String> f24294a = new ThreadLocal<>();

        public void A(Throwable th2) {
            s(7, th2, (String) null, new Object[0]);
        }

        public void B(Throwable th2, String str, Object... objArr) {
            s(7, th2, str, objArr);
        }

        public void a(String str, Object... objArr) {
            s(3, (Throwable) null, str, objArr);
        }

        public void b(Throwable th2) {
            s(3, th2, (String) null, new Object[0]);
        }

        public void c(Throwable th2, String str, Object... objArr) {
            s(3, th2, str, objArr);
        }

        public void d(String str, Object... objArr) {
            s(6, (Throwable) null, str, objArr);
        }

        public void e(Throwable th2) {
            s(6, th2, (String) null, new Object[0]);
        }

        public void f(Throwable th2, String str, Object... objArr) {
            s(6, th2, str, objArr);
        }

        public String g(@g String str, @g Object[] objArr) {
            return String.format(str, objArr);
        }

        public final String h(Throwable th2) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        @h
        public String i() {
            String str = this.f24294a.get();
            if (str != null) {
                this.f24294a.remove();
            }
            return str;
        }

        public void j(String str, Object... objArr) {
            s(4, (Throwable) null, str, objArr);
        }

        public void k(Throwable th2) {
            s(4, th2, (String) null, new Object[0]);
        }

        public void l(Throwable th2, String str, Object... objArr) {
            s(4, th2, str, objArr);
        }

        @Deprecated
        public boolean m(int i10) {
            return true;
        }

        public boolean n(@h String str, int i10) {
            return m(i10);
        }

        public abstract void o(int i10, @h String str, @g String str2, @h Throwable th2);

        public void p(int i10, String str, Object... objArr) {
            s(i10, (Throwable) null, str, objArr);
        }

        public void q(int i10, Throwable th2) {
            s(i10, th2, (String) null, new Object[0]);
        }

        public void r(int i10, Throwable th2, String str, Object... objArr) {
            s(i10, th2, str, objArr);
        }

        public final void s(int i10, Throwable th2, String str, Object... objArr) {
            String i11 = i();
            if (n(i11, i10)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = g(str, objArr);
                    }
                    if (th2 != null) {
                        str = str + "\n" + h(th2);
                    }
                } else if (th2 != null) {
                    str = h(th2);
                } else {
                    return;
                }
                o(i10, i11, str, th2);
            }
        }

        public void t(String str, Object... objArr) {
            s(2, (Throwable) null, str, objArr);
        }

        public void u(Throwable th2) {
            s(2, th2, (String) null, new Object[0]);
        }

        public void v(Throwable th2, String str, Object... objArr) {
            s(2, th2, str, objArr);
        }

        public void w(String str, Object... objArr) {
            s(5, (Throwable) null, str, objArr);
        }

        public void x(Throwable th2) {
            s(5, th2, (String) null, new Object[0]);
        }

        public void y(Throwable th2, String str, Object... objArr) {
            s(5, th2, str, objArr);
        }

        public void z(String str, Object... objArr) {
            s(7, (Throwable) null, str, objArr);
        }
    }

    static {
        c[] cVarArr = new c[0];
        f24286a = cVarArr;
        f24288c = cVarArr;
    }

    public b() {
        throw new AssertionError("No instances.");
    }

    public static void A(@f String str, Object... objArr) {
        f24289d.z(str, objArr);
    }

    public static void B(Throwable th2) {
        f24289d.A(th2);
    }

    public static void C(Throwable th2, @f String str, Object... objArr) {
        f24289d.B(th2, str, objArr);
    }

    @g
    public static c a() {
        return f24289d;
    }

    public static void b(@f String str, Object... objArr) {
        f24289d.a(str, objArr);
    }

    public static void c(Throwable th2) {
        f24289d.b(th2);
    }

    public static void d(Throwable th2, @f String str, Object... objArr) {
        f24289d.c(th2, str, objArr);
    }

    public static void e(@f String str, Object... objArr) {
        f24289d.d(str, objArr);
    }

    public static void f(Throwable th2) {
        f24289d.e(th2);
    }

    public static void g(Throwable th2, @f String str, Object... objArr) {
        f24289d.f(th2, str, objArr);
    }

    @g
    public static List<c> h() {
        List<c> unmodifiableList;
        List<c> list = f24287b;
        synchronized (list) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        }
        return unmodifiableList;
    }

    public static void i(@f String str, Object... objArr) {
        f24289d.j(str, objArr);
    }

    public static void j(Throwable th2) {
        f24289d.k(th2);
    }

    public static void k(Throwable th2, @f String str, Object... objArr) {
        f24289d.l(th2, str, objArr);
    }

    public static void l(int i10, @f String str, Object... objArr) {
        f24289d.p(i10, str, objArr);
    }

    public static void m(int i10, Throwable th2) {
        f24289d.q(i10, th2);
    }

    public static void n(int i10, Throwable th2, @f String str, Object... objArr) {
        f24289d.r(i10, th2, str, objArr);
    }

    public static void o(@g c cVar) {
        if (cVar == null) {
            throw new NullPointerException("tree == null");
        } else if (cVar != f24289d) {
            List<c> list = f24287b;
            synchronized (list) {
                list.add(cVar);
                f24288c = (c[]) list.toArray(new c[list.size()]);
            }
        } else {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
    }

    public static void p(@g c... cVarArr) {
        if (cVarArr != null) {
            int length = cVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                c cVar = cVarArr[i10];
                if (cVar == null) {
                    throw new NullPointerException("trees contains null");
                } else if (cVar != f24289d) {
                    i10++;
                } else {
                    throw new IllegalArgumentException("Cannot plant Timber into itself.");
                }
            }
            List<c> list = f24287b;
            synchronized (list) {
                Collections.addAll(list, cVarArr);
                f24288c = (c[]) list.toArray(new c[list.size()]);
            }
            return;
        }
        throw new NullPointerException("trees == null");
    }

    @g
    public static c q(String str) {
        for (c cVar : f24288c) {
            cVar.f24294a.set(str);
        }
        return f24289d;
    }

    public static int r() {
        int size;
        List<c> list = f24287b;
        synchronized (list) {
            size = list.size();
        }
        return size;
    }

    public static void s(@g c cVar) {
        List<c> list = f24287b;
        synchronized (list) {
            if (list.remove(cVar)) {
                f24288c = (c[]) list.toArray(new c[list.size()]);
            } else {
                throw new IllegalArgumentException("Cannot uproot tree which is not planted: " + cVar);
            }
        }
    }

    public static void t() {
        List<c> list = f24287b;
        synchronized (list) {
            list.clear();
            f24288c = f24286a;
        }
    }

    public static void u(@f String str, Object... objArr) {
        f24289d.t(str, objArr);
    }

    public static void v(Throwable th2) {
        f24289d.u(th2);
    }

    public static void w(Throwable th2, @f String str, Object... objArr) {
        f24289d.v(th2, str, objArr);
    }

    public static void x(@f String str, Object... objArr) {
        f24289d.w(str, objArr);
    }

    public static void y(Throwable th2) {
        f24289d.x(th2);
    }

    public static void z(Throwable th2, @f String str, Object... objArr) {
        f24289d.y(th2, str, objArr);
    }
}
