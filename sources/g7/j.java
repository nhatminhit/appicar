package g7;

import android.net.Uri;
import b7.i0;
import d.o0;
import e7.f;
import java.io.IOException;
import t7.g0;

public interface j {

    public interface a {
        j a(f fVar, g0 g0Var, i iVar);
    }

    public interface b {
        void g();

        boolean j(Uri uri, long j10);
    }

    public static final class c extends IOException {
        public final Uri O;

        public c(Uri uri) {
            this.O = uri;
        }
    }

    public static final class d extends IOException {
        public final Uri O;

        public d(Uri uri) {
            this.O = uri;
        }
    }

    public interface e {
        void a(f fVar);
    }

    void a(b bVar);

    boolean b(Uri uri);

    void c(Uri uri) throws IOException;

    void d(Uri uri, i0.a aVar, e eVar);

    long e();

    boolean f();

    @o0
    e h();

    void i() throws IOException;

    void l(Uri uri);

    @o0
    f m(Uri uri, boolean z10);

    void n(b bVar);

    void stop();
}
