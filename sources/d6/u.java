package d6;

import b6.l0;
import d.o0;
import java.nio.ByteBuffer;

public interface u {

    /* renamed from: a  reason: collision with root package name */
    public static final long f6446a = Long.MIN_VALUE;

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(Throwable th2) {
            super(th2);
        }
    }

    public static final class b extends Exception {
        public final int O;

        public b(int i10, int i11, int i12, int i13) {
            super("AudioTrack init failed: " + i10 + ", Config(" + i11 + ", " + i12 + ", " + i13 + ")");
            this.O = i10;
        }
    }

    public interface c {
        void a(int i10);

        void b(int i10, long j10, long j11);

        void c();
    }

    public static final class d extends Exception {
        public final int O;

        public d(int i10) {
            super("AudioTrack write failed: " + i10);
            this.O = i10;
        }
    }

    boolean a();

    void b(c cVar);

    l0 c(l0 l0Var);

    l0 d();

    boolean e(int i10, int i11);

    void f();

    void flush();

    void g(float f10);

    void h(x xVar);

    void i(int i10, int i11, int i12, int i13, @o0 int[] iArr, int i14, int i15) throws a;

    void j() throws d;

    boolean k();

    void l(int i10);

    long m(boolean z10);

    void n();

    void o();

    boolean p(ByteBuffer byteBuffer, long j10) throws b, d;

    void pause();

    void q(int i10);

    void r(c cVar);

    void reset();
}
