package g8;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import d.o0;
import f8.a;
import f8.a.b;
import h9.n;
import j8.s;
import w8.d;

@e8.a
public abstract class q<A extends a.b, ResultT> {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final Feature[] f8258a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8259b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8260c;

    @e8.a
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        public m f8261a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f8262b = true;

        /* renamed from: c  reason: collision with root package name */
        public Feature[] f8263c;

        /* renamed from: d  reason: collision with root package name */
        public int f8264d = 0;

        public a() {
        }

        public /* synthetic */ a(b2 b2Var) {
        }

        @e8.a
        @m0
        public q<A, ResultT> a() {
            s.b(this.f8261a != null, "execute parameter required");
            return new a2(this, this.f8263c, this.f8262b, this.f8264d);
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        @Deprecated
        public a<A, ResultT> b(@m0 d<A, n<ResultT>> dVar) {
            this.f8261a = new z1(dVar);
            return this;
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a<A, ResultT> c(@m0 m<A, n<ResultT>> mVar) {
            this.f8261a = mVar;
            return this;
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a<A, ResultT> d(boolean z10) {
            this.f8262b = z10;
            return this;
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a<A, ResultT> e(@m0 Feature... featureArr) {
            this.f8263c = featureArr;
            return this;
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a<A, ResultT> f(int i10) {
            this.f8264d = i10;
            return this;
        }
    }

    @e8.a
    @Deprecated
    public q() {
        this.f8258a = null;
        this.f8259b = false;
        this.f8260c = 0;
    }

    @e8.a
    public q(@o0 Feature[] featureArr, boolean z10, int i10) {
        this.f8258a = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.f8259b = z11;
        this.f8260c = i10;
    }

    @e8.a
    @m0
    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>((b2) null);
    }

    @e8.a
    public abstract void b(@m0 A a10, @m0 n<ResultT> nVar) throws RemoteException;

    @e8.a
    public boolean c() {
        return this.f8259b;
    }

    public final int d() {
        return this.f8260c;
    }

    @o0
    public final Feature[] e() {
        return this.f8258a;
    }
}
