package androidx.lifecycle;

import android.app.Application;
import d.j0;
import d.x0;
import fh.g;
import fh.h;
import i2.a;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import ve.e;
import ve.i;
import ve.m;
import w7.s;
import xe.l0;
import xe.r1;
import xe.w;

@r1({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
public class x0 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final a1 f2857a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final b f2858b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final i2.a f2859c;

    public static class a extends c {
        @g

        /* renamed from: f  reason: collision with root package name */
        public static final C0042a f2860f = new C0042a((w) null);
        @g

        /* renamed from: g  reason: collision with root package name */
        public static final String f2861g = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        @h

        /* renamed from: h  reason: collision with root package name */
        public static a f2862h;
        @g
        @e

        /* renamed from: i  reason: collision with root package name */
        public static final a.b<Application> f2863i = C0042a.C0043a.f2865a;
        @h

        /* renamed from: e  reason: collision with root package name */
        public final Application f2864e;

        /* renamed from: androidx.lifecycle.x0$a$a  reason: collision with other inner class name */
        public static final class C0042a {

            /* renamed from: androidx.lifecycle.x0$a$a$a  reason: collision with other inner class name */
            public static final class C0043a implements a.b<Application> {
                @g

                /* renamed from: a  reason: collision with root package name */
                public static final C0043a f2865a = new C0043a();
            }

            public C0042a() {
            }

            public /* synthetic */ C0042a(w wVar) {
                this();
            }

            @g
            public final b a(@g b1 b1Var) {
                l0.p(b1Var, "owner");
                return b1Var instanceof o ? ((o) b1Var).getDefaultViewModelProviderFactory() : c.f2868b.a();
            }

            @g
            @m
            public final a b(@g Application application) {
                l0.p(application, s.f14805d);
                if (a.f2862h == null) {
                    a.f2862h = new a(application);
                }
                a f10 = a.f2862h;
                l0.m(f10);
                return f10;
            }
        }

        public a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(@g Application application) {
            this(application, 0);
            l0.p(application, s.f14805d);
        }

        public a(Application application, int i10) {
            this.f2864e = application;
        }

        @g
        @m
        public static final a i(@g Application application) {
            return f2860f.b(application);
        }

        @g
        public <T extends v0> T a(@g Class<T> cls) {
            l0.p(cls, "modelClass");
            Application application = this.f2864e;
            if (application != null) {
                return h(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @g
        public <T extends v0> T b(@g Class<T> cls, @g i2.a aVar) {
            l0.p(cls, "modelClass");
            l0.p(aVar, "extras");
            if (this.f2864e != null) {
                return a(cls);
            }
            Application application = (Application) aVar.a(f2863i);
            if (application != null) {
                return h(cls, application);
            }
            if (!b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public final <T extends v0> T h(Class<T> cls, Application application) {
            if (!b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                T t10 = (v0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                l0.o(t10, "{\n                try {\n…          }\n            }");
                return t10;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }
    }

    public interface b {
        @g

        /* renamed from: a  reason: collision with root package name */
        public static final a f2866a = a.f2867a;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ a f2867a = new a();

            @g
            @m
            public final b a(@g i2.h<?>... hVarArr) {
                l0.p(hVarArr, "initializers");
                return new i2.b((i2.h[]) Arrays.copyOf(hVarArr, hVarArr.length));
            }
        }

        @g
        <T extends v0> T a(@g Class<T> cls);

        @g
        <T extends v0> T b(@g Class<T> cls, @g i2.a aVar);
    }

    public static class c implements b {
        @g

        /* renamed from: b  reason: collision with root package name */
        public static final a f2868b = new a((w) null);
        @h

        /* renamed from: c  reason: collision with root package name */
        public static c f2869c;
        @g
        @e

        /* renamed from: d  reason: collision with root package name */
        public static final a.b<String> f2870d = a.C0044a.f2871a;

        public static final class a {

            /* renamed from: androidx.lifecycle.x0$c$a$a  reason: collision with other inner class name */
            public static final class C0044a implements a.b<String> {
                @g

                /* renamed from: a  reason: collision with root package name */
                public static final C0044a f2871a = new C0044a();
            }

            public a() {
            }

            public /* synthetic */ a(w wVar) {
                this();
            }

            @m
            public static /* synthetic */ void b() {
            }

            @d.x0({x0.a.P})
            @g
            public final c a() {
                if (c.f2869c == null) {
                    c.f2869c = new c();
                }
                c c10 = c.f2869c;
                l0.m(c10);
                return c10;
            }
        }

        @d.x0({x0.a.P})
        @g
        public static final c e() {
            return f2868b.a();
        }

        @g
        public <T extends v0> T a(@g Class<T> cls) {
            l0.p(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                l0.o(newInstance, "{\n                modelC…wInstance()\n            }");
                return (v0) newInstance;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }

        public /* synthetic */ v0 b(Class cls, i2.a aVar) {
            return y0.b(this, cls, aVar);
        }
    }

    @d.x0({x0.a.P})
    public static class d {
        public void c(@g v0 v0Var) {
            l0.p(v0Var, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @i
    public x0(@g a1 a1Var, @g b bVar) {
        this(a1Var, bVar, (i2.a) null, 4, (w) null);
        l0.p(a1Var, "store");
        l0.p(bVar, "factory");
    }

    @i
    public x0(@g a1 a1Var, @g b bVar, @g i2.a aVar) {
        l0.p(a1Var, "store");
        l0.p(bVar, "factory");
        l0.p(aVar, "defaultCreationExtras");
        this.f2857a = a1Var;
        this.f2858b = bVar;
        this.f2859c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(a1 a1Var, b bVar, i2.a aVar, int i10, w wVar) {
        this(a1Var, bVar, (i10 & 4) != 0 ? a.C0151a.f9017b : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public x0(@g b1 b1Var) {
        this(b1Var.getViewModelStore(), a.f2860f.a(b1Var), z0.a(b1Var));
        l0.p(b1Var, "owner");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public x0(@g b1 b1Var, @g b bVar) {
        this(b1Var.getViewModelStore(), bVar, z0.a(b1Var));
        l0.p(b1Var, "owner");
        l0.p(bVar, "factory");
    }

    @g
    @j0
    public <T extends v0> T a(@g Class<T> cls) {
        l0.p(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @g
    @j0
    public <T extends v0> T b(@g String str, @g Class<T> cls) {
        T t10;
        l0.p(str, "key");
        l0.p(cls, "modelClass");
        T b10 = this.f2857a.b(str);
        if (cls.isInstance(b10)) {
            b bVar = this.f2858b;
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                l0.m(b10);
                dVar.c(b10);
            }
            l0.n(b10, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b10;
        }
        i2.e eVar = new i2.e(this.f2859c);
        eVar.c(c.f2870d, str);
        try {
            t10 = this.f2858b.b(cls, eVar);
        } catch (AbstractMethodError unused) {
            t10 = this.f2858b.a(cls);
        }
        this.f2857a.d(str, t10);
        return t10;
    }
}
