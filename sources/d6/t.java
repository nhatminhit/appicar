package d6;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import d.o0;
import g6.e;

public interface t {

    public static final class a {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final Handler f6444a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final t f6445b;

        public a(@o0 Handler handler, @o0 t tVar) {
            this.f6444a = tVar != null ? (Handler) w7.a.g(handler) : null;
            this.f6445b = tVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(int i10) {
            this.f6445b.a(i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(int i10, long j10, long j11) {
            this.f6445b.J(i10, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(String str, long j10, long j11) {
            this.f6445b.s(str, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(e eVar) {
            eVar.a();
            this.f6445b.B(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(e eVar) {
            this.f6445b.D(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(Format format) {
            this.f6445b.H(format);
        }

        public void g(int i10) {
            if (this.f6445b != null) {
                this.f6444a.post(new s(this, i10));
            }
        }

        public void h(int i10, long j10, long j11) {
            if (this.f6445b != null) {
                this.f6444a.post(new o(this, i10, j10, j11));
            }
        }

        public void i(String str, long j10, long j11) {
            if (this.f6445b != null) {
                this.f6444a.post(new r(this, str, j10, j11));
            }
        }

        public void j(e eVar) {
            eVar.a();
            if (this.f6445b != null) {
                this.f6444a.post(new n(this, eVar));
            }
        }

        public void k(e eVar) {
            if (this.f6445b != null) {
                this.f6444a.post(new q(this, eVar));
            }
        }

        public void l(Format format) {
            if (this.f6445b != null) {
                this.f6444a.post(new p(this, format));
            }
        }
    }

    void B(e eVar);

    void D(e eVar);

    void H(Format format);

    void J(int i10, long j10, long j11);

    void a(int i10);

    void s(String str, long j10, long j11);
}
