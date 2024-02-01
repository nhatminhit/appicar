package x7;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import d.o0;
import g6.e;

public interface q {

    public static final class a {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final Handler f15201a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final q f15202b;

        public a(@o0 Handler handler, @o0 q qVar) {
            this.f15201a = qVar != null ? (Handler) w7.a.g(handler) : null;
            this.f15202b = qVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(String str, long j10, long j11) {
            this.f15202b.g(str, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(e eVar) {
            eVar.a();
            this.f15202b.y(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(int i10, long j10) {
            this.f15202b.z(i10, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(e eVar) {
            this.f15202b.I(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(Format format) {
            this.f15202b.G(format);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(Surface surface) {
            this.f15202b.p(surface);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(int i10, int i11, int i12, float f10) {
            this.f15202b.c(i10, i11, i12, f10);
        }

        public void h(String str, long j10, long j11) {
            if (this.f15202b != null) {
                this.f15201a.post(new p(this, str, j10, j11));
            }
        }

        public void i(e eVar) {
            eVar.a();
            if (this.f15202b != null) {
                this.f15201a.post(new j(this, eVar));
            }
        }

        public void j(int i10, long j10) {
            if (this.f15202b != null) {
                this.f15201a.post(new m(this, i10, j10));
            }
        }

        public void k(e eVar) {
            if (this.f15202b != null) {
                this.f15201a.post(new k(this, eVar));
            }
        }

        public void l(Format format) {
            if (this.f15202b != null) {
                this.f15201a.post(new l(this, format));
            }
        }

        public void t(@o0 Surface surface) {
            if (this.f15202b != null) {
                this.f15201a.post(new o(this, surface));
            }
        }

        public void u(int i10, int i11, int i12, float f10) {
            if (this.f15202b != null) {
                this.f15201a.post(new n(this, i10, i11, i12, f10));
            }
        }
    }

    void G(Format format);

    void I(e eVar);

    void c(int i10, int i11, int i12, float f10);

    void g(String str, long j10, long j11);

    void p(@o0 Surface surface);

    void y(e eVar);

    void z(int i10, long j10);
}
