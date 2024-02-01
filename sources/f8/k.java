package f8;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.f;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import d.o0;
import d8.e;
import f8.a;
import g8.d;
import g8.g;
import g8.g2;
import g8.j;
import g8.n;
import j8.g0;
import j8.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import w8.d0;
import y3.q;

@Deprecated
public abstract class k {
    @e8.a
    @m0

    /* renamed from: a  reason: collision with root package name */
    public static final String f7472a = "<<default account>>";

    /* renamed from: b  reason: collision with root package name */
    public static final int f7473b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f7474c = 2;
    @GuardedBy("sAllClients")

    /* renamed from: d  reason: collision with root package name */
    public static final Set f7475d = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public static final class a {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public Account f7476a;

        /* renamed from: b  reason: collision with root package name */
        public final Set f7477b;

        /* renamed from: c  reason: collision with root package name */
        public final Set f7478c;

        /* renamed from: d  reason: collision with root package name */
        public int f7479d;

        /* renamed from: e  reason: collision with root package name */
        public View f7480e;

        /* renamed from: f  reason: collision with root package name */
        public String f7481f;

        /* renamed from: g  reason: collision with root package name */
        public String f7482g;

        /* renamed from: h  reason: collision with root package name */
        public final Map f7483h;

        /* renamed from: i  reason: collision with root package name */
        public final Context f7484i;

        /* renamed from: j  reason: collision with root package name */
        public final Map f7485j;

        /* renamed from: k  reason: collision with root package name */
        public g f7486k;

        /* renamed from: l  reason: collision with root package name */
        public int f7487l;
        @o0

        /* renamed from: m  reason: collision with root package name */
        public c f7488m;

        /* renamed from: n  reason: collision with root package name */
        public Looper f7489n;

        /* renamed from: o  reason: collision with root package name */
        public e f7490o;

        /* renamed from: p  reason: collision with root package name */
        public a.C0126a f7491p;

        /* renamed from: q  reason: collision with root package name */
        public final ArrayList f7492q;

        /* renamed from: r  reason: collision with root package name */
        public final ArrayList f7493r;

        public a(@m0 Context context) {
            this.f7477b = new HashSet();
            this.f7478c = new HashSet();
            this.f7483h = new androidx.collection.a();
            this.f7485j = new androidx.collection.a();
            this.f7487l = -1;
            this.f7490o = e.x();
            this.f7491p = f9.e.f7500c;
            this.f7492q = new ArrayList();
            this.f7493r = new ArrayList();
            this.f7484i = context;
            this.f7489n = context.getMainLooper();
            this.f7481f = context.getPackageName();
            this.f7482g = context.getClass().getName();
        }

        public a(@m0 Context context, @m0 b bVar, @m0 c cVar) {
            this(context);
            s.m(bVar, "Must provide a connected listener");
            this.f7492q.add(bVar);
            s.m(cVar, "Must provide a connection failed listener");
            this.f7493r.add(cVar);
        }

        @CanIgnoreReturnValue
        @m0
        public a a(@m0 a<? extends a.d.e> aVar) {
            s.m(aVar, "Api must not be null");
            this.f7485j.put(aVar, (Object) null);
            List<Scope> a10 = ((a.e) s.m(aVar.c(), "Base client builder must not be null")).a(null);
            this.f7478c.addAll(a10);
            this.f7477b.addAll(a10);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public <O extends a.d.c> a b(@m0 a<O> aVar, @m0 O o10) {
            s.m(aVar, "Api must not be null");
            s.m(o10, "Null options are not permitted for this Api");
            this.f7485j.put(aVar, o10);
            List<Scope> a10 = ((a.e) s.m(aVar.c(), "Base client builder must not be null")).a(o10);
            this.f7478c.addAll(a10);
            this.f7477b.addAll(a10);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public <O extends a.d.c> a c(@m0 a<O> aVar, @m0 O o10, @m0 Scope... scopeArr) {
            s.m(aVar, "Api must not be null");
            s.m(o10, "Null options are not permitted for this Api");
            this.f7485j.put(aVar, o10);
            q(aVar, o10, scopeArr);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public <T extends a.d.e> a d(@m0 a<? extends a.d.e> aVar, @m0 Scope... scopeArr) {
            s.m(aVar, "Api must not be null");
            this.f7485j.put(aVar, (Object) null);
            q(aVar, (a.d) null, scopeArr);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a e(@m0 b bVar) {
            s.m(bVar, "Listener must not be null");
            this.f7492q.add(bVar);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a f(@m0 c cVar) {
            s.m(cVar, "Listener must not be null");
            this.f7493r.add(cVar);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a g(@m0 Scope scope) {
            s.m(scope, "Scope must not be null");
            this.f7477b.add(scope);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: f8.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        @d.m0
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public f8.k h() {
            /*
                r22 = this;
                r1 = r22
                java.util.Map r0 = r1.f7485j
                boolean r0 = r0.isEmpty()
                r2 = 1
                r0 = r0 ^ r2
                java.lang.String r3 = "must call addApi() to add at least one API"
                j8.s.b(r0, r3)
                j8.e r0 = r22.p()
                java.util.Map r3 = r0.n()
                androidx.collection.a r11 = new androidx.collection.a
                r11.<init>()
                androidx.collection.a r14 = new androidx.collection.a
                r14.<init>()
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Map r4 = r1.f7485j
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r12 = r4.iterator()
                r13 = 0
                r4 = 0
                r16 = r4
                r17 = r13
            L_0x0036:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto L_0x00c1
                java.lang.Object r4 = r12.next()
                r10 = r4
                f8.a r10 = (f8.a) r10
                java.util.Map r4 = r1.f7485j
                java.lang.Object r18 = r4.get(r10)
                java.lang.Object r4 = r3.get(r10)
                if (r4 == 0) goto L_0x0051
                r4 = r2
                goto L_0x0052
            L_0x0051:
                r4 = r13
            L_0x0052:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
                r11.put(r10, r5)
                g8.v2 r9 = new g8.v2
                r9.<init>(r10, r4)
                r15.add(r9)
                f8.a$a r4 = r10.a()
                java.lang.Object r4 = j8.s.l(r4)
                r19 = r4
                f8.a$a r19 = (f8.a.C0126a) r19
                android.content.Context r5 = r1.f7484i
                android.os.Looper r6 = r1.f7489n
                r4 = r19
                r7 = r0
                r8 = r18
                r20 = r9
                r21 = r10
                r10 = r20
                f8.a$f r4 = r4.c(r5, r6, r7, r8, r9, r10)
                f8.a$c r5 = r21.b()
                r14.put(r5, r4)
                int r5 = r19.b()
                if (r5 != r2) goto L_0x0094
                if (r18 == 0) goto L_0x0092
                r17 = r2
                goto L_0x0094
            L_0x0092:
                r17 = r13
            L_0x0094:
                boolean r4 = r4.g()
                if (r4 == 0) goto L_0x0036
                if (r16 != 0) goto L_0x009f
                r16 = r21
                goto L_0x0036
            L_0x009f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r21.d()
                java.lang.String r3 = r16.d()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = " cannot be used with "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                throw r0
            L_0x00c1:
                if (r16 == 0) goto L_0x010f
                if (r17 != 0) goto L_0x00ef
                android.accounts.Account r3 = r1.f7476a
                if (r3 != 0) goto L_0x00cb
                r3 = r2
                goto L_0x00cc
            L_0x00cb:
                r3 = r13
            L_0x00cc:
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
                j8.s.t(r3, r5, r4)
                java.util.Set r3 = r1.f7477b
                java.util.Set r4 = r1.f7478c
                boolean r3 = r3.equals(r4)
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
                j8.s.t(r3, r5, r4)
                goto L_0x010f
            L_0x00ef:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r16.d()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "With using "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.<init>(r2)
                throw r0
            L_0x010f:
                java.util.Collection r3 = r14.values()
                int r16 = com.google.android.gms.common.api.internal.q.K(r3, r2)
                com.google.android.gms.common.api.internal.q r2 = new com.google.android.gms.common.api.internal.q
                android.content.Context r5 = r1.f7484i
                java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
                r6.<init>()
                android.os.Looper r7 = r1.f7489n
                d8.e r9 = r1.f7490o
                f8.a$a r10 = r1.f7491p
                java.util.ArrayList r12 = r1.f7492q
                java.util.ArrayList r13 = r1.f7493r
                int r3 = r1.f7487l
                r4 = r2
                r8 = r0
                r0 = r15
                r15 = r3
                r17 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.util.Set r3 = f8.k.f7475d
                monitor-enter(r3)
                java.util.Set r0 = f8.k.f7475d     // Catch:{ all -> 0x0154 }
                r0.add(r2)     // Catch:{ all -> 0x0154 }
                monitor-exit(r3)     // Catch:{ all -> 0x0154 }
                int r0 = r1.f7487l
                if (r0 < 0) goto L_0x0153
                g8.g r0 = r1.f7486k
                g8.m2 r0 = g8.m2.u(r0)
                int r3 = r1.f7487l
                f8.k$c r4 = r1.f7488m
                r0.v(r3, r2, r4)
            L_0x0153:
                return r2
            L_0x0154:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0154 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f8.k.a.h():f8.k");
        }

        @m0
        public a i(@m0 FragmentActivity fragmentActivity, int i10, @o0 c cVar) {
            g gVar = new g((Activity) fragmentActivity);
            s.b(i10 >= 0, "clientId must be non-negative");
            this.f7487l = i10;
            this.f7488m = cVar;
            this.f7486k = gVar;
            return this;
        }

        @m0
        public a j(@m0 FragmentActivity fragmentActivity, @o0 c cVar) {
            i(fragmentActivity, 0, cVar);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a k(@m0 String str) {
            this.f7476a = str == null ? null : new Account(str, j8.a.f9695a);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a l(int i10) {
            this.f7479d = i10;
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a m(@m0 Handler handler) {
            s.m(handler, "Handler must not be null");
            this.f7489n = handler.getLooper();
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a n(@m0 View view) {
            s.m(view, "View must not be null");
            this.f7480e = view;
            return this;
        }

        @m0
        public a o() {
            k("<<default account>>");
            return this;
        }

        @d0
        @m0
        public final j8.e p() {
            f9.a aVar = f9.a.X;
            Map map = this.f7485j;
            a aVar2 = f9.e.f7504g;
            if (map.containsKey(aVar2)) {
                aVar = (f9.a) this.f7485j.get(aVar2);
            }
            return new j8.e(this.f7476a, this.f7477b, this.f7483h, this.f7479d, this.f7480e, this.f7481f, this.f7482g, aVar, false);
        }

        public final void q(a aVar, @o0 a.d dVar, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((a.e) s.m(aVar.c(), "Base client builder must not be null")).a(dVar));
            for (Scope add : scopeArr) {
                hashSet.add(add);
            }
            this.f7483h.put(aVar, new g0(hashSet));
        }
    }

    @Deprecated
    public interface b extends d {

        /* renamed from: x  reason: collision with root package name */
        public static final int f7494x = 1;

        /* renamed from: y  reason: collision with root package name */
        public static final int f7495y = 2;
    }

    @Deprecated
    public interface c extends j {
    }

    public static void k(@m0 String str, @m0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @m0 String[] strArr) {
        Set<k> set = f7475d;
        synchronized (set) {
            String str2 = str + q.a.R;
            int i10 = 0;
            for (k j10 : set) {
                printWriter.append(str).append("GoogleApiClient#").println(i10);
                j10.j(str2, fileDescriptor, printWriter, strArr);
                i10++;
            }
        }
    }

    @e8.a
    @m0
    public static Set<k> n() {
        Set<k> set = f7475d;
        synchronized (set) {
        }
        return set;
    }

    public abstract void A();

    public abstract void B(@m0 b bVar);

    public abstract void C(@m0 c cVar);

    @e8.a
    @m0
    public <L> f<L> D(@m0 L l10) {
        throw new UnsupportedOperationException();
    }

    public abstract void E(@m0 FragmentActivity fragmentActivity);

    public abstract void F(@m0 b bVar);

    public abstract void G(@m0 c cVar);

    public void H(g2 g2Var) {
        throw new UnsupportedOperationException();
    }

    public void I(g2 g2Var) {
        throw new UnsupportedOperationException();
    }

    @m0
    public abstract ConnectionResult d();

    @m0
    public abstract ConnectionResult e(long j10, @m0 TimeUnit timeUnit);

    @m0
    public abstract o<Status> f();

    public abstract void g();

    public void h(int i10) {
        throw new UnsupportedOperationException();
    }

    public abstract void i();

    public abstract void j(@m0 String str, @m0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @m0 String[] strArr);

    @e8.a
    @m0
    public <A extends a.b, R extends u, T extends b.a<R, A>> T l(@m0 T t10) {
        throw new UnsupportedOperationException();
    }

    @e8.a
    @m0
    public <A extends a.b, T extends b.a<? extends u, A>> T m(@m0 T t10) {
        throw new UnsupportedOperationException();
    }

    @e8.a
    @m0
    public <C extends a.f> C o(@m0 a.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    @m0
    public abstract ConnectionResult p(@m0 a<?> aVar);

    @e8.a
    @m0
    public Context q() {
        throw new UnsupportedOperationException();
    }

    @e8.a
    @m0
    public Looper r() {
        throw new UnsupportedOperationException();
    }

    @e8.a
    public boolean s(@m0 a<?> aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean t(@m0 a<?> aVar);

    public abstract boolean u();

    public abstract boolean v();

    public abstract boolean w(@m0 b bVar);

    public abstract boolean x(@m0 c cVar);

    @e8.a
    public boolean y(@m0 n nVar) {
        throw new UnsupportedOperationException();
    }

    @e8.a
    public void z() {
        throw new UnsupportedOperationException();
    }
}
