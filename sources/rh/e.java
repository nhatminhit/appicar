package rh;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import rh.c;

@IgnoreJRERequirement
public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f22604a = new e();

    @IgnoreJRERequirement
    public static final class a<R> implements c<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f22605a;

        @IgnoreJRERequirement
        /* renamed from: rh.e$a$a  reason: collision with other inner class name */
        public class C0415a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<R> f22606a;

            public C0415a(CompletableFuture<R> completableFuture) {
                this.f22606a = completableFuture;
            }

            public void a(b<R> bVar, u<R> uVar) {
                if (uVar.g()) {
                    this.f22606a.complete(uVar.a());
                } else {
                    this.f22606a.completeExceptionally(new j(uVar));
                }
            }

            public void b(b<R> bVar, Throwable th2) {
                this.f22606a.completeExceptionally(th2);
            }
        }

        public a(Type type) {
            this.f22605a = type;
        }

        public Type a() {
            return this.f22605a;
        }

        /* renamed from: c */
        public CompletableFuture<R> b(b<R> bVar) {
            b bVar2 = new b(bVar);
            bVar.l(new C0415a(bVar2));
            return bVar2;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {
        public final b<?> O;

        public b(b<?> bVar) {
            this.O = bVar;
        }

        public boolean cancel(boolean z10) {
            if (z10) {
                this.O.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements c<R, CompletableFuture<u<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f22608a;

        @IgnoreJRERequirement
        public class a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<u<R>> f22609a;

            public a(CompletableFuture<u<R>> completableFuture) {
                this.f22609a = completableFuture;
            }

            public void a(b<R> bVar, u<R> uVar) {
                this.f22609a.complete(uVar);
            }

            public void b(b<R> bVar, Throwable th2) {
                this.f22609a.completeExceptionally(th2);
            }
        }

        public c(Type type) {
            this.f22608a = type;
        }

        public Type a() {
            return this.f22608a;
        }

        /* renamed from: c */
        public CompletableFuture<u<R>> b(b<R> bVar) {
            b bVar2 = new b(bVar);
            bVar.l(new a(bVar2));
            return bVar2;
        }
    }

    @Nullable
    public c<?, ?> a(Type type, Annotation[] annotationArr, v vVar) {
        if (c.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b10 = c.a.b(0, (ParameterizedType) type);
            if (c.a.c(b10) != u.class) {
                return new a(b10);
            }
            if (b10 instanceof ParameterizedType) {
                return new c(c.a.b(0, (ParameterizedType) b10));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
