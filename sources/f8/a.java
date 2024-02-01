package f8;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import d.m0;
import d.o0;
import f8.a.d;
import f8.k;
import g8.j;
import j8.d;
import j8.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import w8.d0;

public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    public final C0126a f7420a;

    /* renamed from: b  reason: collision with root package name */
    public final g f7421b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7422c;

    @e8.a
    @d0
    /* renamed from: f8.a$a  reason: collision with other inner class name */
    public static abstract class C0126a<T extends f, O> extends e<T, O> {
        @e8.a
        @m0
        @Deprecated
        public T c(@m0 Context context, @m0 Looper looper, @m0 j8.e eVar, @m0 O o10, @m0 k.b bVar, @m0 k.c cVar) {
            return d(context, looper, eVar, o10, bVar, cVar);
        }

        @e8.a
        @m0
        public T d(@m0 Context context, @m0 Looper looper, @m0 j8.e eVar, @m0 O o10, @m0 g8.d dVar, @m0 j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    @e8.a
    public interface b {
    }

    @e8.a
    public static class c<C extends b> {
    }

    public interface d {
        @m0

        /* renamed from: w  reason: collision with root package name */
        public static final C0128d f7423w = new C0128d((a0) null);

        /* renamed from: f8.a$d$a  reason: collision with other inner class name */
        public interface C0127a extends c, e {
            @m0
            Account Y();
        }

        public interface b extends c {
            @o0
            GoogleSignInAccount Q();
        }

        public interface c extends d {
        }

        /* renamed from: f8.a$d$d  reason: collision with other inner class name */
        public static final class C0128d implements e {
            public C0128d() {
            }

            public /* synthetic */ C0128d(a0 a0Var) {
            }
        }

        public interface e extends d {
        }

        public interface f extends c, e {
        }
    }

    @e8.a
    @d0
    public static abstract class e<T extends b, O> {
        @e8.a

        /* renamed from: a  reason: collision with root package name */
        public static final int f7424a = 1;
        @e8.a

        /* renamed from: b  reason: collision with root package name */
        public static final int f7425b = 2;
        @e8.a

        /* renamed from: c  reason: collision with root package name */
        public static final int f7426c = Integer.MAX_VALUE;

        @e8.a
        @m0
        public List<Scope> a(@o0 O o10) {
            return Collections.emptyList();
        }

        @e8.a
        public int b() {
            return Integer.MAX_VALUE;
        }
    }

    @e8.a
    public interface f extends b {
        @e8.a
        boolean a();

        @e8.a
        boolean b();

        @e8.a
        void d();

        @e8.a
        void e(@m0 d.c cVar);

        @e8.a
        boolean g();

        @e8.a
        @m0
        Set<Scope> h();

        @e8.a
        void i(@o0 com.google.android.gms.common.internal.b bVar, @o0 Set<Scope> set);

        @e8.a
        void j(@m0 String str);

        @e8.a
        boolean k();

        @e8.a
        @m0
        String l();

        @e8.a
        @m0
        Feature[] m();

        @e8.a
        void n(@m0 String str, @o0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @o0 String[] strArr);

        @e8.a
        boolean o();

        @e8.a
        int p();

        @e8.a
        void q(@m0 d.e eVar);

        @e8.a
        @m0
        Feature[] r();

        @e8.a
        @o0
        String t();

        @e8.a
        @m0
        Intent u();

        @e8.a
        boolean v();

        @e8.a
        @o0
        IBinder w();
    }

    @e8.a
    @d0
    public static final class g<C extends f> extends c<C> {
    }

    @e8.a
    public <C extends f> a(@m0 String str, @m0 C0126a<C, O> aVar, @m0 g<C> gVar) {
        s.m(aVar, "Cannot construct an Api with a null ClientBuilder");
        s.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f7422c = str;
        this.f7420a = aVar;
        this.f7421b = gVar;
    }

    @m0
    public final C0126a a() {
        return this.f7420a;
    }

    @m0
    public final c b() {
        return this.f7421b;
    }

    @m0
    public final e c() {
        return this.f7420a;
    }

    @m0
    public final String d() {
        return this.f7422c;
    }
}
