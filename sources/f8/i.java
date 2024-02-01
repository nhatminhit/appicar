package f8;

import android.os.Bundle;
import d.m0;
import d.o0;
import e8.a;
import f8.u;
import i8.a;
import i8.b;
import java.util.Iterator;

@a
public class i<T, R extends i8.a<T> & u> extends t<R> implements b<T> {
    @e8.a
    public i() {
    }

    @e8.a
    public i(@m0 R r10) {
        super(r10);
    }

    public final void a() {
        ((i8.a) c()).a();
    }

    public final void close() {
        ((i8.a) c()).close();
    }

    @o0
    public final Bundle d() {
        return ((i8.a) c()).d();
    }

    @m0
    public final Iterator<T> d0() {
        return ((i8.a) c()).d0();
    }

    @m0
    public final T get(int i10) {
        return ((i8.a) c()).get(i10);
    }

    public final int getCount() {
        return ((i8.a) c()).getCount();
    }

    public final boolean isClosed() {
        return ((i8.a) c()).isClosed();
    }

    @m0
    public final Iterator<T> iterator() {
        return ((i8.a) c()).iterator();
    }
}
