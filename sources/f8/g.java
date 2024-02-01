package f8;

import com.google.android.gms.common.api.Status;
import d.m0;
import d.o0;
import e8.a;
import j8.s;
import j8.w;

public class g implements u {
    public final Status O;
    public final boolean P;

    @a
    @w
    public g(@m0 Status status, boolean z10) {
        this.O = (Status) s.m(status, "Status must not be null");
        this.P = z10;
    }

    public boolean a() {
        return this.P;
    }

    public final boolean equals(@o0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.O.equals(gVar.O) && this.P == gVar.P;
    }

    @m0
    public Status g() {
        return this.O;
    }

    public final int hashCode() {
        return ((this.O.hashCode() + 527) * 31) + (this.P ? 1 : 0);
    }
}
