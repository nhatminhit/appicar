package b7;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import b7.y;
import com.google.android.exoplayer2.Format;
import d.j;
import d.o0;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import t7.o;

public interface i0 {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4527a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final y.a f4528b;

        /* renamed from: c  reason: collision with root package name */
        public final CopyOnWriteArrayList<C0068a> f4529c;

        /* renamed from: d  reason: collision with root package name */
        public final long f4530d;

        /* renamed from: b7.i0$a$a  reason: collision with other inner class name */
        public static final class C0068a {

            /* renamed from: a  reason: collision with root package name */
            public final Handler f4531a;

            /* renamed from: b  reason: collision with root package name */
            public final i0 f4532b;

            public C0068a(Handler handler, i0 i0Var) {
                this.f4531a = handler;
                this.f4532b = i0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (y.a) null, 0);
        }

        public a(CopyOnWriteArrayList<C0068a> copyOnWriteArrayList, int i10, @o0 y.a aVar, long j10) {
            this.f4529c = copyOnWriteArrayList;
            this.f4527a = i10;
            this.f4528b = aVar;
            this.f4530d = j10;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(i0 i0Var, c cVar) {
            i0Var.v(this.f4527a, this.f4528b, cVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(i0 i0Var, b bVar, c cVar) {
            i0Var.j(this.f4527a, this.f4528b, bVar, cVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(i0 i0Var, b bVar, c cVar) {
            i0Var.f(this.f4527a, this.f4528b, bVar, cVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(i0 i0Var, b bVar, c cVar, IOException iOException, boolean z10) {
            i0Var.w(this.f4527a, this.f4528b, bVar, cVar, iOException, z10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(i0 i0Var, b bVar, c cVar) {
            i0Var.E(this.f4527a, this.f4528b, bVar, cVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(i0 i0Var, y.a aVar) {
            i0Var.M(this.f4527a, aVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void t(i0 i0Var, y.a aVar) {
            i0Var.h(this.f4527a, aVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void u(i0 i0Var, y.a aVar) {
            i0Var.o(this.f4527a, aVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void v(i0 i0Var, y.a aVar, c cVar) {
            i0Var.P(this.f4527a, aVar, cVar);
        }

        public void A(o oVar, Uri uri, Map<String, List<String>> map, int i10, int i11, @o0 Format format, int i12, @o0 Object obj, long j10, long j11, long j12, long j13, long j14) {
            z(new b(oVar, uri, map, j12, j13, j14), new c(i10, i11, format, i12, obj, k(j10), k(j11)));
        }

        public void B(o oVar, Uri uri, Map<String, List<String>> map, int i10, long j10, long j11, long j12) {
            A(oVar, uri, map, i10, -1, (Format) null, 0, (Object) null, b6.c.f4201b, b6.c.f4201b, j10, j11, j12);
        }

        public void C(b bVar, c cVar, IOException iOException, boolean z10) {
            Iterator<C0068a> it = this.f4529c.iterator();
            while (it.hasNext()) {
                C0068a next = it.next();
                K(next.f4531a, new a0(this, next.f4532b, bVar, cVar, iOException, z10));
            }
        }

        public void D(o oVar, Uri uri, Map<String, List<String>> map, int i10, int i11, @o0 Format format, int i12, @o0 Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
            C(new b(oVar, uri, map, j12, j13, j14), new c(i10, i11, format, i12, obj, k(j10), k(j11)), iOException, z10);
        }

        public void E(o oVar, Uri uri, Map<String, List<String>> map, int i10, long j10, long j11, long j12, IOException iOException, boolean z10) {
            D(oVar, uri, map, i10, -1, (Format) null, 0, (Object) null, b6.c.f4201b, b6.c.f4201b, j10, j11, j12, iOException, z10);
        }

        public void F(b bVar, c cVar) {
            Iterator<C0068a> it = this.f4529c.iterator();
            while (it.hasNext()) {
                C0068a next = it.next();
                K(next.f4531a, new d0(this, next.f4532b, bVar, cVar));
            }
        }

        public void G(o oVar, int i10, int i11, @o0 Format format, int i12, @o0 Object obj, long j10, long j11, long j12) {
            o oVar2 = oVar;
            F(new b(oVar2, oVar2.f13130a, Collections.emptyMap(), j12, 0, 0), new c(i10, i11, format, i12, obj, k(j10), k(j11)));
        }

        public void H(o oVar, int i10, long j10) {
            G(oVar, i10, -1, (Format) null, 0, (Object) null, b6.c.f4201b, b6.c.f4201b, j10);
        }

        public void I() {
            y.a aVar = (y.a) w7.a.g(this.f4528b);
            Iterator<C0068a> it = this.f4529c.iterator();
            while (it.hasNext()) {
                C0068a next = it.next();
                K(next.f4531a, new b0(this, next.f4532b, aVar));
            }
        }

        public void J() {
            y.a aVar = (y.a) w7.a.g(this.f4528b);
            Iterator<C0068a> it = this.f4529c.iterator();
            while (it.hasNext()) {
                C0068a next = it.next();
                K(next.f4531a, new f0(this, next.f4532b, aVar));
            }
        }

        public final void K(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        public void L() {
            y.a aVar = (y.a) w7.a.g(this.f4528b);
            Iterator<C0068a> it = this.f4529c.iterator();
            while (it.hasNext()) {
                C0068a next = it.next();
                K(next.f4531a, new c0(this, next.f4532b, aVar));
            }
        }

        public void M(i0 i0Var) {
            Iterator<C0068a> it = this.f4529c.iterator();
            while (it.hasNext()) {
                C0068a next = it.next();
                if (next.f4532b == i0Var) {
                    this.f4529c.remove(next);
                }
            }
        }

        public void N(int i10, long j10, long j11) {
            long j12 = j10;
            O(new c(1, i10, (Format) null, 3, (Object) null, k(j10), k(j11)));
        }

        public void O(c cVar) {
            y.a aVar = (y.a) w7.a.g(this.f4528b);
            Iterator<C0068a> it = this.f4529c.iterator();
            while (it.hasNext()) {
                C0068a next = it.next();
                K(next.f4531a, new e0(this, next.f4532b, aVar, cVar));
            }
        }

        @j
        public a P(int i10, @o0 y.a aVar, long j10) {
            return new a(this.f4529c, i10, aVar, j10);
        }

        public void j(Handler handler, i0 i0Var) {
            w7.a.a((handler == null || i0Var == null) ? false : true);
            this.f4529c.add(new C0068a(handler, i0Var));
        }

        public final long k(long j10) {
            long c10 = b6.c.c(j10);
            return c10 == b6.c.f4201b ? b6.c.f4201b : this.f4530d + c10;
        }

        public void l(int i10, @o0 Format format, int i11, @o0 Object obj, long j10) {
            m(new c(1, i10, format, i11, obj, k(j10), b6.c.f4201b));
        }

        public void m(c cVar) {
            Iterator<C0068a> it = this.f4529c.iterator();
            while (it.hasNext()) {
                C0068a next = it.next();
                K(next.f4531a, new z(this, next.f4532b, cVar));
            }
        }

        public void w(b bVar, c cVar) {
            Iterator<C0068a> it = this.f4529c.iterator();
            while (it.hasNext()) {
                C0068a next = it.next();
                K(next.f4531a, new h0(this, next.f4532b, bVar, cVar));
            }
        }

        public void x(o oVar, Uri uri, Map<String, List<String>> map, int i10, int i11, @o0 Format format, int i12, @o0 Object obj, long j10, long j11, long j12, long j13, long j14) {
            w(new b(oVar, uri, map, j12, j13, j14), new c(i10, i11, format, i12, obj, k(j10), k(j11)));
        }

        public void y(o oVar, Uri uri, Map<String, List<String>> map, int i10, long j10, long j11, long j12) {
            x(oVar, uri, map, i10, -1, (Format) null, 0, (Object) null, b6.c.f4201b, b6.c.f4201b, j10, j11, j12);
        }

        public void z(b bVar, c cVar) {
            Iterator<C0068a> it = this.f4529c.iterator();
            while (it.hasNext()) {
                C0068a next = it.next();
                K(next.f4531a, new g0(this, next.f4532b, bVar, cVar));
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final o f4533a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f4534b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, List<String>> f4535c;

        /* renamed from: d  reason: collision with root package name */
        public final long f4536d;

        /* renamed from: e  reason: collision with root package name */
        public final long f4537e;

        /* renamed from: f  reason: collision with root package name */
        public final long f4538f;

        public b(o oVar, Uri uri, Map<String, List<String>> map, long j10, long j11, long j12) {
            this.f4533a = oVar;
            this.f4534b = uri;
            this.f4535c = map;
            this.f4536d = j10;
            this.f4537e = j11;
            this.f4538f = j12;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f4539a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4540b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final Format f4541c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4542d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public final Object f4543e;

        /* renamed from: f  reason: collision with root package name */
        public final long f4544f;

        /* renamed from: g  reason: collision with root package name */
        public final long f4545g;

        public c(int i10, int i11, @o0 Format format, int i12, @o0 Object obj, long j10, long j11) {
            this.f4539a = i10;
            this.f4540b = i11;
            this.f4541c = format;
            this.f4542d = i12;
            this.f4543e = obj;
            this.f4544f = j10;
            this.f4545g = j11;
        }
    }

    void E(int i10, @o0 y.a aVar, b bVar, c cVar);

    void M(int i10, y.a aVar);

    void P(int i10, y.a aVar, c cVar);

    void f(int i10, @o0 y.a aVar, b bVar, c cVar);

    void h(int i10, y.a aVar);

    void j(int i10, @o0 y.a aVar, b bVar, c cVar);

    void o(int i10, y.a aVar);

    void v(int i10, @o0 y.a aVar, c cVar);

    void w(int i10, @o0 y.a aVar, b bVar, c cVar, IOException iOException, boolean z10);
}
