package y5;

import i5.e0;
import j5.a;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import w4.i;

@a
public class d0 extends l<Date> {
    public d0() {
        this((Boolean) null, (DateFormat) null);
    }

    public d0(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    /* renamed from: R */
    public long P(Date date) {
        if (date == null) {
            return 0;
        }
        return date.getTime();
    }

    /* renamed from: S */
    public void m(Date date, i iVar, e0 e0Var) throws IOException {
        if (N(e0Var)) {
            iVar.p2(P(date));
        } else if (this.S == null) {
            iVar.Z2(date.toString());
        } else {
            O(date, iVar, e0Var);
        }
    }

    /* renamed from: T */
    public d0 Q(Boolean bool, DateFormat dateFormat) {
        return new d0(bool, dateFormat);
    }
}
