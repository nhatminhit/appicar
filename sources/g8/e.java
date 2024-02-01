package g8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import d.m0;
import e8.a;
import f8.q;
import f8.u;

@a
public abstract class e implements u, q {
    @a
    @m0
    public final Status O;
    @a
    @m0
    public final DataHolder P;

    @a
    public e(@m0 DataHolder dataHolder) {
        this(dataHolder, new Status(dataHolder.p1()));
    }

    @a
    public e(@m0 DataHolder dataHolder, @m0 Status status) {
        this.O = status;
        this.P = dataHolder;
    }

    @a
    public void a() {
        DataHolder dataHolder = this.P;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @a
    @m0
    public Status g() {
        return this.O;
    }
}
