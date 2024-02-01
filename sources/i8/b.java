package i8;

import android.os.Bundle;
import d.m0;
import d.o0;
import e8.a;
import f8.q;
import java.io.Closeable;
import java.util.Iterator;

public interface b<T> extends Iterable<T>, q, Closeable {
    void a();

    void close();

    @a
    @o0
    Bundle d();

    @m0
    Iterator<T> d0();

    @m0
    T get(int i10);

    int getCount();

    @Deprecated
    boolean isClosed();

    @m0
    Iterator<T> iterator();
}
