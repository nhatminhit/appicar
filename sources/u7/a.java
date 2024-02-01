package u7;

import d.o0;
import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final long f13765a = -1;

    /* renamed from: u7.a$a  reason: collision with other inner class name */
    public static class C0232a extends IOException {
        public C0232a(String str) {
            super(str);
        }

        public C0232a(String str, Throwable th2) {
            super(str, th2);
        }

        public C0232a(Throwable th2) {
            super(th2);
        }
    }

    public interface b {
        void b(a aVar, j jVar);

        void c(a aVar, j jVar);

        void d(a aVar, j jVar, j jVar2);
    }

    void a();

    long b();

    File c(String str, long j10, long j11) throws C0232a;

    q d(String str);

    NavigableSet<j> e(String str, b bVar);

    void f(j jVar);

    long g(String str, long j10, long j11);

    Set<String> h();

    void i(File file, long j10) throws C0232a;

    void j(String str, b bVar);

    long k();

    void l(String str, r rVar) throws C0232a;

    void m(j jVar) throws C0232a;

    boolean n(String str, long j10, long j11);

    j o(String str, long j10) throws InterruptedException, C0232a;

    @o0
    j p(String str, long j10) throws C0232a;

    NavigableSet<j> q(String str);
}
