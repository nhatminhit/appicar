package l2;

import android.os.Bundle;
import android.os.Looper;
import androidx.collection.j;
import androidx.lifecycle.a1;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import d.j0;
import d.m0;
import d.o0;
import e1.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import l2.a;
import m2.c;
import y3.q;

public class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f10095c = "LoaderManager";

    /* renamed from: d  reason: collision with root package name */
    public static boolean f10096d = false;
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final y f10097a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final c f10098b;

    public static class a<D> extends g0<D> implements c.C0180c<D> {

        /* renamed from: m  reason: collision with root package name */
        public final int f10099m;
        @o0

        /* renamed from: n  reason: collision with root package name */
        public final Bundle f10100n;
        @m0

        /* renamed from: o  reason: collision with root package name */
        public final m2.c<D> f10101o;

        /* renamed from: p  reason: collision with root package name */
        public y f10102p;

        /* renamed from: q  reason: collision with root package name */
        public C0173b<D> f10103q;

        /* renamed from: r  reason: collision with root package name */
        public m2.c<D> f10104r;

        public a(int i10, @o0 Bundle bundle, @m0 m2.c<D> cVar, @o0 m2.c<D> cVar2) {
            this.f10099m = i10;
            this.f10100n = bundle;
            this.f10101o = cVar;
            this.f10104r = cVar2;
            cVar.u(i10, this);
        }

        public void a(@m0 m2.c<D> cVar, @o0 D d10) {
            if (b.f10096d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onLoadComplete: ");
                sb2.append(this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                r(d10);
                return;
            }
            boolean z10 = b.f10096d;
            o(d10);
        }

        public void m() {
            if (b.f10096d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Starting: ");
                sb2.append(this);
            }
            this.f10101o.y();
        }

        public void n() {
            if (b.f10096d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Stopping: ");
                sb2.append(this);
            }
            this.f10101o.z();
        }

        public void p(@m0 h0<? super D> h0Var) {
            super.p(h0Var);
            this.f10102p = null;
            this.f10103q = null;
        }

        public void r(D d10) {
            super.r(d10);
            m2.c<D> cVar = this.f10104r;
            if (cVar != null) {
                cVar.w();
                this.f10104r = null;
            }
        }

        @j0
        public m2.c<D> s(boolean z10) {
            if (b.f10096d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Destroying: ");
                sb2.append(this);
            }
            this.f10101o.b();
            this.f10101o.a();
            C0173b<D> bVar = this.f10103q;
            if (bVar != null) {
                p(bVar);
                if (z10) {
                    bVar.c();
                }
            }
            this.f10101o.B(this);
            if ((bVar == null || bVar.b()) && !z10) {
                return this.f10101o;
            }
            this.f10101o.w();
            return this.f10104r;
        }

        public void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f10099m);
            printWriter.print(" mArgs=");
            printWriter.println(this.f10100n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f10101o);
            m2.c<D> cVar = this.f10101o;
            cVar.g(str + q.a.R, fileDescriptor, printWriter, strArr);
            if (this.f10103q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f10103q);
                C0173b<D> bVar = this.f10103q;
                bVar.a(str + q.a.R, printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(u().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f10099m);
            sb2.append(" : ");
            d.a(this.f10101o, sb2);
            sb2.append("}}");
            return sb2.toString();
        }

        @m0
        public m2.c<D> u() {
            return this.f10101o;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
            r0 = r2.f10103q;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean v() {
            /*
                r2 = this;
                boolean r0 = r2.h()
                r1 = 0
                if (r0 != 0) goto L_0x0008
                return r1
            L_0x0008:
                l2.b$b<D> r0 = r2.f10103q
                if (r0 == 0) goto L_0x0013
                boolean r0 = r0.b()
                if (r0 != 0) goto L_0x0013
                r1 = 1
            L_0x0013:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.b.a.v():boolean");
        }

        public void w() {
            y yVar = this.f10102p;
            C0173b<D> bVar = this.f10103q;
            if (yVar != null && bVar != null) {
                super.p(bVar);
                k(yVar, bVar);
            }
        }

        @j0
        @m0
        public m2.c<D> x(@m0 y yVar, @m0 a.C0172a<D> aVar) {
            C0173b<D> bVar = new C0173b<>(this.f10101o, aVar);
            k(yVar, bVar);
            C0173b<D> bVar2 = this.f10103q;
            if (bVar2 != null) {
                p(bVar2);
            }
            this.f10102p = yVar;
            this.f10103q = bVar;
            return this.f10101o;
        }
    }

    /* renamed from: l2.b$b  reason: collision with other inner class name */
    public static class C0173b<D> implements h0<D> {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final m2.c<D> f10105a;
        @m0

        /* renamed from: b  reason: collision with root package name */
        public final a.C0172a<D> f10106b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10107c = false;

        public C0173b(@m0 m2.c<D> cVar, @m0 a.C0172a<D> aVar) {
            this.f10105a = cVar;
            this.f10106b = aVar;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f10107c);
        }

        public boolean b() {
            return this.f10107c;
        }

        @j0
        public void c() {
            if (this.f10107c) {
                if (b.f10096d) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Resetting: ");
                    sb2.append(this.f10105a);
                }
                this.f10106b.a(this.f10105a);
            }
        }

        public void f(@o0 D d10) {
            if (b.f10096d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  onLoadFinished in ");
                sb2.append(this.f10105a);
                sb2.append(": ");
                sb2.append(this.f10105a.d(d10));
            }
            this.f10106b.b(this.f10105a, d10);
            this.f10107c = true;
        }

        public String toString() {
            return this.f10106b.toString();
        }
    }

    public static class c extends v0 {

        /* renamed from: f  reason: collision with root package name */
        public static final x0.b f10108f = new a();

        /* renamed from: d  reason: collision with root package name */
        public j<a> f10109d = new j<>();

        /* renamed from: e  reason: collision with root package name */
        public boolean f10110e = false;

        public static class a implements x0.b {
            @m0
            public <T extends v0> T a(@m0 Class<T> cls) {
                return new c();
            }

            public /* synthetic */ v0 b(Class cls, i2.a aVar) {
                return y0.b(this, cls, aVar);
            }
        }

        @m0
        public static c i(a1 a1Var) {
            return (c) new x0(a1Var, f10108f).a(c.class);
        }

        public void e() {
            super.e();
            int E = this.f10109d.E();
            for (int i10 = 0; i10 < E; i10++) {
                this.f10109d.F(i10).s(true);
            }
            this.f10109d.d();
        }

        public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f10109d.E() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f10109d.E(); i10++) {
                    a F = this.f10109d.F(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f10109d.t(i10));
                    printWriter.print(": ");
                    printWriter.println(F.toString());
                    F.t(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void h() {
            this.f10110e = false;
        }

        public <D> a<D> j(int i10) {
            return this.f10109d.n(i10);
        }

        public boolean k() {
            int E = this.f10109d.E();
            for (int i10 = 0; i10 < E; i10++) {
                if (this.f10109d.F(i10).v()) {
                    return true;
                }
            }
            return false;
        }

        public boolean l() {
            return this.f10110e;
        }

        public void m() {
            int E = this.f10109d.E();
            for (int i10 = 0; i10 < E; i10++) {
                this.f10109d.F(i10).w();
            }
        }

        public void n(int i10, @m0 a aVar) {
            this.f10109d.u(i10, aVar);
        }

        public void o(int i10) {
            this.f10109d.x(i10);
        }

        public void p() {
            this.f10110e = true;
        }
    }

    public b(@m0 y yVar, @m0 a1 a1Var) {
        this.f10097a = yVar;
        this.f10098b = c.i(a1Var);
    }

    @j0
    public void a(int i10) {
        if (this.f10098b.l()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f10096d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("destroyLoader in ");
                sb2.append(this);
                sb2.append(" of ");
                sb2.append(i10);
            }
            a j10 = this.f10098b.j(i10);
            if (j10 != null) {
                j10.s(true);
                this.f10098b.o(i10);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f10098b.g(str, fileDescriptor, printWriter, strArr);
    }

    @o0
    public <D> m2.c<D> e(int i10) {
        if (!this.f10098b.l()) {
            a j10 = this.f10098b.j(i10);
            if (j10 != null) {
                return j10.u();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public boolean f() {
        return this.f10098b.k();
    }

    @j0
    @m0
    public <D> m2.c<D> g(int i10, @o0 Bundle bundle, @m0 a.C0172a<D> aVar) {
        if (this.f10098b.l()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a j10 = this.f10098b.j(i10);
            if (f10096d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("initLoader in ");
                sb2.append(this);
                sb2.append(": args=");
                sb2.append(bundle);
            }
            if (j10 == null) {
                return j(i10, bundle, aVar, (m2.c) null);
            }
            if (f10096d) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("  Re-using existing loader ");
                sb3.append(j10);
            }
            return j10.x(this.f10097a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public void h() {
        this.f10098b.m();
    }

    @j0
    @m0
    public <D> m2.c<D> i(int i10, @o0 Bundle bundle, @m0 a.C0172a<D> aVar) {
        if (this.f10098b.l()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f10096d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("restartLoader in ");
                sb2.append(this);
                sb2.append(": args=");
                sb2.append(bundle);
            }
            a j10 = this.f10098b.j(i10);
            m2.c cVar = null;
            if (j10 != null) {
                cVar = j10.s(false);
            }
            return j(i10, bundle, aVar, cVar);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    /* JADX INFO: finally extract failed */
    @j0
    @m0
    public final <D> m2.c<D> j(int i10, @o0 Bundle bundle, @m0 a.C0172a<D> aVar, @o0 m2.c<D> cVar) {
        try {
            this.f10098b.p();
            m2.c<D> c10 = aVar.c(i10, bundle);
            if (c10 != null) {
                if (c10.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(c10.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c10);
                    }
                }
                a aVar2 = new a(i10, bundle, c10, cVar);
                if (f10096d) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Created new loader ");
                    sb2.append(aVar2);
                }
                this.f10098b.n(i10, aVar2);
                this.f10098b.h();
                return aVar2.x(this.f10097a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th2) {
            this.f10098b.h();
            throw th2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        d.a(this.f10097a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
