package rh;

import ch.b0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import og.j0;
import rh.c;

public final class g extends c.a {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Executor f22611a;

    public class a implements c<Object, b<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Type f22612a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Executor f22613b;

        public a(Type type, Executor executor) {
            this.f22612a = type;
            this.f22613b = executor;
        }

        public Type a() {
            return this.f22612a;
        }

        /* renamed from: c */
        public b<Object> b(b<Object> bVar) {
            Executor executor = this.f22613b;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    public static final class b<T> implements b<T> {
        public final Executor O;
        public final b<T> P;

        public class a implements d<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f22615a;

            public a(d dVar) {
                this.f22615a = dVar;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void e(d dVar, Throwable th2) {
                dVar.b(b.this, th2);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void f(d dVar, u uVar) {
                if (b.this.P.h()) {
                    dVar.b(b.this, new IOException("Canceled"));
                } else {
                    dVar.a(b.this, uVar);
                }
            }

            public void a(b<T> bVar, u<T> uVar) {
                b.this.O.execute(new h(this, this.f22615a, uVar));
            }

            public void b(b<T> bVar, Throwable th2) {
                b.this.O.execute(new i(this, this.f22615a, th2));
            }
        }

        public b(Executor executor, b<T> bVar) {
            this.O = executor;
            this.P = bVar;
        }

        public b0 b() {
            return this.P.b();
        }

        public j0 c() {
            return this.P.c();
        }

        public void cancel() {
            this.P.cancel();
        }

        public b<T> clone() {
            return new b(this.O, this.P.clone());
        }

        public u<T> e() throws IOException {
            return this.P.e();
        }

        public boolean f() {
            return this.P.f();
        }

        public boolean h() {
            return this.P.h();
        }

        public void l(d<T> dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.P.l(new a(dVar));
        }
    }

    public g(@Nullable Executor executor) {
        this.f22611a = executor;
    }

    @Nullable
    public c<?, ?> a(Type type, Annotation[] annotationArr, v vVar) {
        Executor executor = null;
        if (c.a.c(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g10 = z.g(0, (ParameterizedType) type);
            if (!z.l(annotationArr, x.class)) {
                executor = this.f22611a;
            }
            return new a(g10, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
