package b7;

import android.os.Handler;
import b6.x0;
import d.o0;
import java.io.IOException;
import t7.r0;

public interface y {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f4733a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4734b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4735c;

        /* renamed from: d  reason: collision with root package name */
        public final long f4736d;

        /* renamed from: e  reason: collision with root package name */
        public final int f4737e;

        public a(Object obj) {
            this(obj, -1);
        }

        public a(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        public a(Object obj, int i10, int i11, long j10, int i12) {
            this.f4733a = obj;
            this.f4734b = i10;
            this.f4735c = i11;
            this.f4736d = j10;
            this.f4737e = i12;
        }

        public a(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public a(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public a a(Object obj) {
            if (this.f4733a.equals(obj)) {
                return this;
            }
            return new a(obj, this.f4734b, this.f4735c, this.f4736d, this.f4737e);
        }

        public boolean b() {
            return this.f4734b != -1;
        }

        public boolean equals(@o0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4733a.equals(aVar.f4733a) && this.f4734b == aVar.f4734b && this.f4735c == aVar.f4735c && this.f4736d == aVar.f4736d && this.f4737e == aVar.f4737e;
        }

        public int hashCode() {
            return ((((((((527 + this.f4733a.hashCode()) * 31) + this.f4734b) * 31) + this.f4735c) * 31) + ((int) this.f4736d)) * 31) + this.f4737e;
        }
    }

    public interface b {
        void j(y yVar, x0 x0Var, @o0 Object obj);
    }

    void b(b bVar);

    w c(a aVar, t7.b bVar, long j10);

    void e(b bVar, @o0 r0 r0Var);

    void f(Handler handler, i0 i0Var);

    @o0
    Object g();

    void h() throws IOException;

    void i(w wVar);

    void k(i0 i0Var);
}
