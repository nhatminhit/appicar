package f8;

import com.google.android.gms.common.api.Status;
import d.m0;
import f8.u;
import java.util.concurrent.TimeUnit;

public abstract class o<R extends u> {

    @e8.a
    public interface a {
        @e8.a
        void a(@m0 Status status);
    }

    @e8.a
    public void c(@m0 a aVar) {
        throw new UnsupportedOperationException();
    }

    @m0
    public abstract R d();

    @m0
    public abstract R e(long j10, @m0 TimeUnit timeUnit);

    public abstract void f();

    public abstract boolean g();

    public abstract void h(@m0 v<? super R> vVar);

    public abstract void i(@m0 v<? super R> vVar, long j10, @m0 TimeUnit timeUnit);

    @m0
    public <S extends u> y<S> j(@m0 x<? super R, ? extends S> xVar) {
        throw new UnsupportedOperationException();
    }
}
