package b6;

import b6.p0;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import w7.r;

public interface r0 extends p0.b {

    /* renamed from: b  reason: collision with root package name */
    public static final int f4440b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f4441c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f4442d = 2;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    boolean a();

    void e();

    int f();

    boolean g();

    int getState();

    void h();

    s0 i();

    boolean isReady();

    void k(Format[] formatArr, b7.r0 r0Var, long j10) throws i;

    void m(long j10, long j11) throws i;

    b7.r0 o();

    void p(float f10) throws i;

    void q() throws IOException;

    long r();

    void reset();

    void s(long j10) throws i;

    void setIndex(int i10);

    void start() throws i;

    void stop() throws i;

    boolean t();

    void u(t0 t0Var, Format[] formatArr, b7.r0 r0Var, long j10, boolean z10, long j11) throws i;

    r v();
}
