package f8;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.u;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.h1;
import d.j0;
import d.m0;
import d.o0;
import f8.a;
import f8.a.d;
import g8.b;
import g8.c;
import g8.o;
import g8.q;
import g8.w;
import g8.y1;
import h9.m;
import h9.n;
import j8.e;
import j8.s;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import w8.v;

public abstract class j<O extends a.d> implements l<O> {

    /* renamed from: c  reason: collision with root package name */
    public final Context f7457c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final String f7458d;

    /* renamed from: e  reason: collision with root package name */
    public final a f7459e;

    /* renamed from: f  reason: collision with root package name */
    public final a.d f7460f;

    /* renamed from: g  reason: collision with root package name */
    public final c f7461g;

    /* renamed from: h  reason: collision with root package name */
    public final Looper f7462h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7463i;
    @NotOnlyInitialized

    /* renamed from: j  reason: collision with root package name */
    public final k f7464j;

    /* renamed from: k  reason: collision with root package name */
    public final o f7465k;
    @m0

    /* renamed from: l  reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.d f7466l;

    @e8.a
    public static class a {
        @e8.a
        @m0

        /* renamed from: c  reason: collision with root package name */
        public static final a f7467c = new C0129a().a();
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final o f7468a;
        @m0

        /* renamed from: b  reason: collision with root package name */
        public final Looper f7469b;

        @e8.a
        /* renamed from: f8.j$a$a  reason: collision with other inner class name */
        public static class C0129a {

            /* renamed from: a  reason: collision with root package name */
            public o f7470a;

            /* renamed from: b  reason: collision with root package name */
            public Looper f7471b;

            @e8.a
            @m0
            public a a() {
                if (this.f7470a == null) {
                    this.f7470a = new b();
                }
                if (this.f7471b == null) {
                    this.f7471b = Looper.getMainLooper();
                }
                return new a(this.f7470a, this.f7471b);
            }

            @e8.a
            @CanIgnoreReturnValue
            @m0
            public C0129a b(@m0 Looper looper) {
                s.m(looper, "Looper must not be null.");
                this.f7471b = looper;
                return this;
            }

            @e8.a
            @CanIgnoreReturnValue
            @m0
            public C0129a c(@m0 o oVar) {
                s.m(oVar, "StatusExceptionMapper must not be null.");
                this.f7470a = oVar;
                return this;
            }
        }

        @e8.a
        public a(o oVar, Account account, Looper looper) {
            this.f7468a = oVar;
            this.f7469b = looper;
        }
    }

    @e8.a
    @j0
    public j(@m0 Activity activity, @m0 a<O> aVar, @m0 O o10, @m0 a aVar2) {
        this((Context) activity, activity, (a) aVar, (a.d) o10, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @e8.a
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(@d.m0 android.app.Activity r2, @d.m0 f8.a<O> r3, @d.m0 O r4, @d.m0 g8.o r5) {
        /*
            r1 = this;
            f8.j$a$a r0 = new f8.j$a$a
            r0.<init>()
            r0.c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.b(r5)
            f8.j$a r5 = r0.a()
            r1.<init>((android.app.Activity) r2, r3, r4, (f8.j.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.j.<init>(android.app.Activity, f8.a, f8.a$d, g8.o):void");
    }

    public j(@m0 Context context, @o0 Activity activity, a aVar, a.d dVar, a aVar2) {
        s.m(context, "Null context is not permitted.");
        s.m(aVar, "Api must not be null.");
        s.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f7457c = context.getApplicationContext();
        String str = null;
        if (v.q()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f7458d = str;
        this.f7459e = aVar;
        this.f7460f = dVar;
        this.f7462h = aVar2.f7469b;
        c a10 = c.a(aVar, dVar, str);
        this.f7461g = a10;
        this.f7464j = new com.google.android.gms.common.api.internal.v(this);
        com.google.android.gms.common.api.internal.d z10 = com.google.android.gms.common.api.internal.d.z(this.f7457c);
        this.f7466l = z10;
        this.f7463i = z10.n();
        this.f7465k = aVar2.f7468a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            w.v(activity, z10, a10);
        }
        z10.c(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @e8.a
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(@d.m0 android.content.Context r2, @d.m0 f8.a<O> r3, @d.m0 O r4, @d.m0 android.os.Looper r5, @d.m0 g8.o r6) {
        /*
            r1 = this;
            f8.j$a$a r0 = new f8.j$a$a
            r0.<init>()
            r0.b(r5)
            r0.c(r6)
            f8.j$a r5 = r0.a()
            r1.<init>((android.content.Context) r2, r3, r4, (f8.j.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.j.<init>(android.content.Context, f8.a, f8.a$d, android.os.Looper, g8.o):void");
    }

    @e8.a
    public j(@m0 Context context, @m0 a<O> aVar, @m0 O o10, @m0 a aVar2) {
        this(context, (Activity) null, (a) aVar, (a.d) o10, aVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @e8.a
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(@d.m0 android.content.Context r2, @d.m0 f8.a<O> r3, @d.m0 O r4, @d.m0 g8.o r5) {
        /*
            r1 = this;
            f8.j$a$a r0 = new f8.j$a$a
            r0.<init>()
            r0.c(r5)
            f8.j$a r5 = r0.a()
            r1.<init>((android.content.Context) r2, r3, r4, (f8.j.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.j.<init>(android.content.Context, f8.a, f8.a$d, g8.o):void");
    }

    @m0
    public final c<O> G() {
        return this.f7461g;
    }

    @e8.a
    @m0
    public k I() {
        return this.f7464j;
    }

    @e8.a
    @m0
    public e.a J() {
        Account account;
        GoogleSignInAccount Q;
        GoogleSignInAccount Q2;
        e.a aVar = new e.a();
        a.d dVar = this.f7460f;
        if (!(dVar instanceof a.d.b) || (Q2 = ((a.d.b) dVar).Q()) == null) {
            a.d dVar2 = this.f7460f;
            account = dVar2 instanceof a.d.C0127a ? ((a.d.C0127a) dVar2).Y() : null;
        } else {
            account = Q2.Y();
        }
        aVar.d(account);
        a.d dVar3 = this.f7460f;
        aVar.c((!(dVar3 instanceof a.d.b) || (Q = ((a.d.b) dVar3).Q()) == null) ? Collections.emptySet() : Q.L1());
        aVar.e(this.f7457c.getClass().getName());
        aVar.b(this.f7457c.getPackageName());
        return aVar;
    }

    @e8.a
    @m0
    public m<Boolean> K() {
        return this.f7466l.C(this);
    }

    @e8.a
    @m0
    public <A extends a.b, T extends b.a<? extends u, A>> T L(@m0 T t10) {
        e0(2, t10);
        return t10;
    }

    @e8.a
    @m0
    public <TResult, A extends a.b> m<TResult> M(@m0 q<A, TResult> qVar) {
        return f0(2, qVar);
    }

    @e8.a
    @m0
    public <A extends a.b, T extends b.a<? extends u, A>> T N(@m0 T t10) {
        e0(0, t10);
        return t10;
    }

    @e8.a
    @m0
    public <TResult, A extends a.b> m<TResult> O(@m0 q<A, TResult> qVar) {
        return f0(0, qVar);
    }

    @e8.a
    @m0
    @Deprecated
    public <A extends a.b, T extends h<A, ?>, U extends k<A, ?>> m<Void> P(@m0 T t10, @m0 U u10) {
        s.l(t10);
        s.l(u10);
        s.m(t10.b(), "Listener has already been released.");
        s.m(u10.a(), "Listener has already been released.");
        s.b(j8.q.b(t10.b(), u10.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f7466l.D(this, t10, u10, d0.O);
    }

    @e8.a
    @m0
    public <A extends a.b> m<Void> Q(@m0 i<A, ?> iVar) {
        s.l(iVar);
        s.m(iVar.f5672a.b(), "Listener has already been released.");
        s.m(iVar.f5673b.a(), "Listener has already been released.");
        return this.f7466l.D(this, iVar.f5672a, iVar.f5673b, iVar.f5674c);
    }

    @e8.a
    @m0
    public m<Boolean> R(@m0 f.a<?> aVar) {
        return S(aVar, 0);
    }

    @e8.a
    @m0
    public m<Boolean> S(@m0 f.a<?> aVar, int i10) {
        s.m(aVar, "Listener key cannot be null.");
        return this.f7466l.E(this, aVar, i10);
    }

    @e8.a
    @m0
    public <A extends a.b, T extends b.a<? extends u, A>> T T(@m0 T t10) {
        e0(1, t10);
        return t10;
    }

    @e8.a
    @m0
    public <TResult, A extends a.b> m<TResult> U(@m0 q<A, TResult> qVar) {
        return f0(1, qVar);
    }

    @e8.a
    @m0
    public O V() {
        return this.f7460f;
    }

    @e8.a
    @m0
    public Context W() {
        return this.f7457c;
    }

    @e8.a
    @o0
    public String X() {
        return this.f7458d;
    }

    @e8.a
    @o0
    @Deprecated
    public String Y() {
        return this.f7458d;
    }

    @e8.a
    @m0
    public Looper Z() {
        return this.f7462h;
    }

    @e8.a
    @m0
    public <L> f<L> a0(@m0 L l10, @m0 String str) {
        return g.a(l10, this.f7462h, str);
    }

    public final int b0() {
        return this.f7463i;
    }

    @h1
    public final a.f c0(Looper looper, u uVar) {
        Looper looper2 = looper;
        a.f c10 = ((a.C0126a) s.l(this.f7459e.a())).c(this.f7457c, looper2, J().a(), this.f7460f, uVar, uVar);
        String X = X();
        if (X != null && (c10 instanceof j8.d)) {
            ((j8.d) c10).X(X);
        }
        if (X != null && (c10 instanceof g8.i)) {
            ((g8.i) c10).A(X);
        }
        return c10;
    }

    public final y1 d0(Context context, Handler handler) {
        return new y1(context, handler, J().a());
    }

    public final b.a e0(int i10, @m0 b.a aVar) {
        aVar.s();
        this.f7466l.J(this, i10, aVar);
        return aVar;
    }

    public final m f0(int i10, @m0 q qVar) {
        n nVar = new n();
        this.f7466l.K(this, i10, qVar, nVar, this.f7465k);
        return nVar.a();
    }
}
