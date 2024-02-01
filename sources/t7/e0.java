package t7;

import d.o0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t7.l;
import w7.y;

public interface e0 extends l {

    /* renamed from: a  reason: collision with root package name */
    public static final y<String> f13062a = new c0();

    public static abstract class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final f f13063a = new f();

        public final e0 a() {
            return f(this.f13063a);
        }

        @Deprecated
        public final void b(String str, String str2) {
            this.f13063a.e(str, str2);
        }

        @Deprecated
        public final void c(String str) {
            this.f13063a.d(str);
        }

        @Deprecated
        public final void d() {
            this.f13063a.a();
        }

        public final f e() {
            return this.f13063a;
        }

        public abstract e0 f(f fVar);
    }

    public interface b extends l.a {
        e0 a();

        /* bridge */ /* synthetic */ l a();

        @Deprecated
        void b(String str, String str2);

        @Deprecated
        void c(String str);

        @Deprecated
        void d();

        f e();
    }

    public static class c extends IOException {
        public static final int Q = 1;
        public static final int R = 2;
        public static final int S = 3;
        public final int O;
        public final o P;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public c(IOException iOException, o oVar, int i10) {
            super(iOException);
            this.P = oVar;
            this.O = i10;
        }

        public c(String str, IOException iOException, o oVar, int i10) {
            super(str, iOException);
            this.P = oVar;
            this.O = i10;
        }

        public c(String str, o oVar, int i10) {
            super(str);
            this.P = oVar;
            this.O = i10;
        }

        public c(o oVar, int i10) {
            this.P = oVar;
            this.O = i10;
        }
    }

    public static final class d extends c {
        public final String T;

        public d(String str, o oVar) {
            super("Invalid content type: " + str, oVar, 1);
            this.T = str;
        }
    }

    public static final class e extends c {
        public final int T;
        @o0
        public final String U;
        public final Map<String, List<String>> V;

        public e(int i10, @o0 String str, Map<String, List<String>> map, o oVar) {
            super("Response code: " + i10, oVar, 1);
            this.T = i10;
            this.U = str;
            this.V = map;
        }

        @Deprecated
        public e(int i10, Map<String, List<String>> map, o oVar) {
            this(i10, (String) null, map, oVar);
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, String> f13064a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f13065b;

        public synchronized void a() {
            this.f13065b = null;
            this.f13064a.clear();
        }

        public synchronized void b(Map<String, String> map) {
            this.f13065b = null;
            this.f13064a.clear();
            this.f13064a.putAll(map);
        }

        public synchronized Map<String, String> c() {
            if (this.f13065b == null) {
                this.f13065b = Collections.unmodifiableMap(new HashMap(this.f13064a));
            }
            return this.f13065b;
        }

        public synchronized void d(String str) {
            this.f13065b = null;
            this.f13064a.remove(str);
        }

        public synchronized void e(String str, String str2) {
            this.f13065b = null;
            this.f13064a.put(str, str2);
        }

        public synchronized void f(Map<String, String> map) {
            this.f13065b = null;
            this.f13064a.putAll(map);
        }
    }

    long a(o oVar) throws c;

    Map<String, List<String>> b();

    void c(String str, String str2);

    void close() throws c;

    void e();

    void f(String str);

    int read(byte[] bArr, int i10, int i11) throws c;
}
