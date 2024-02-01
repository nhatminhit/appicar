package c6;

import android.view.Surface;
import b6.i;
import b6.l0;
import b6.x0;
import b7.i0;
import b7.y;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import d.o0;
import g6.e;
import java.io.IOException;
import q7.m;

public interface c {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f4882a;

        /* renamed from: b  reason: collision with root package name */
        public final x0 f4883b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4884c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public final y.a f4885d;

        /* renamed from: e  reason: collision with root package name */
        public final long f4886e;

        /* renamed from: f  reason: collision with root package name */
        public final long f4887f;

        /* renamed from: g  reason: collision with root package name */
        public final long f4888g;

        public a(long j10, x0 x0Var, int i10, @o0 y.a aVar, long j11, long j12, long j13) {
            this.f4882a = j10;
            this.f4883b = x0Var;
            this.f4884c = i10;
            this.f4885d = aVar;
            this.f4886e = j11;
            this.f4887f = j12;
            this.f4888g = j13;
        }
    }

    void A(a aVar, boolean z10, int i10);

    void B(a aVar, int i10);

    void C(a aVar);

    void D(a aVar, int i10, long j10);

    void E(a aVar);

    void F(a aVar, int i10, int i11, int i12, float f10);

    void G(a aVar, int i10, e eVar);

    void H(a aVar);

    void I(a aVar, @o0 Surface surface);

    void J(a aVar, d6.c cVar);

    void K(a aVar, Exception exc);

    void L(a aVar, i0.b bVar, i0.c cVar);

    void M(a aVar, Metadata metadata);

    void N(a aVar, i0.c cVar);

    void a(a aVar, i0.b bVar, i0.c cVar);

    void b(a aVar);

    void c(a aVar, int i10, String str, long j10);

    void d(a aVar, int i10, long j10, long j11);

    void e(a aVar, int i10, long j10, long j11);

    void f(a aVar, float f10);

    void g(a aVar, boolean z10);

    void h(a aVar, l0 l0Var);

    void i(a aVar, int i10, Format format);

    void j(a aVar, int i10);

    void k(a aVar);

    void l(a aVar, int i10);

    void m(a aVar);

    void n(a aVar, i0.b bVar, i0.c cVar);

    void o(a aVar);

    void p(a aVar, i0.b bVar, i0.c cVar, IOException iOException, boolean z10);

    void q(a aVar, int i10, e eVar);

    void r(a aVar, TrackGroupArray trackGroupArray, m mVar);

    void s(a aVar, int i10, int i11);

    void t(a aVar, int i10);

    void u(a aVar, i iVar);

    void v(a aVar);

    void w(a aVar, i0.c cVar);

    void x(a aVar, boolean z10);

    void y(a aVar);

    void z(a aVar);
}
