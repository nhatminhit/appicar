package df;

import fh.g;
import hf.o;
import we.q;
import xe.l0;
import zd.u2;

public final class a {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final a f17826a = new a();

    /* renamed from: df.a$a  reason: collision with other inner class name */
    public static final class C0294a extends c<T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q<o<?>, T, T, u2> f17827b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0294a(T t10, q<? super o<?>, ? super T, ? super T, u2> qVar) {
            super(t10);
            this.f17827b = qVar;
        }

        public void c(@g o<?> oVar, T t10, T t11) {
            l0.p(oVar, "property");
            this.f17827b.y(oVar, t10, t11);
        }
    }

    public static final class b extends c<T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q<o<?>, T, T, Boolean> f17828b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(T t10, q<? super o<?>, ? super T, ? super T, Boolean> qVar) {
            super(t10);
            this.f17828b = qVar;
        }

        public boolean d(@g o<?> oVar, T t10, T t11) {
            l0.p(oVar, "property");
            return this.f17828b.y(oVar, t10, t11).booleanValue();
        }
    }

    @g
    public final <T> f<Object, T> a() {
        return new b();
    }

    @g
    public final <T> f<Object, T> b(T t10, @g q<? super o<?>, ? super T, ? super T, u2> qVar) {
        l0.p(qVar, "onChange");
        return new C0294a(t10, qVar);
    }

    @g
    public final <T> f<Object, T> c(T t10, @g q<? super o<?>, ? super T, ? super T, Boolean> qVar) {
        l0.p(qVar, "onChange");
        return new b(t10, qVar);
    }
}
