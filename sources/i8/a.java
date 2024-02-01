package i8;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import d.m0;
import d.o0;
import java.util.Iterator;

public abstract class a<T> implements b<T> {
    @e8.a
    @o0
    public final DataHolder O;

    @e8.a
    public a(@o0 DataHolder dataHolder) {
        this.O = dataHolder;
    }

    public void a() {
        DataHolder dataHolder = this.O;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    public final void close() {
        a();
    }

    @o0
    public final Bundle d() {
        DataHolder dataHolder = this.O;
        if (dataHolder == null) {
            return null;
        }
        return dataHolder.d();
    }

    @m0
    public Iterator<T> d0() {
        return new k(this);
    }

    @m0
    public abstract T get(int i10);

    public int getCount() {
        DataHolder dataHolder = this.O;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Deprecated
    public boolean isClosed() {
        DataHolder dataHolder = this.O;
        return dataHolder == null || dataHolder.isClosed();
    }

    @m0
    public Iterator<T> iterator() {
        return new c(this);
    }
}
