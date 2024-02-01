package y5;

import i5.e0;
import j5.a;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import w4.i;

@a
public class k extends l<Date> {
    public static final k U = new k();

    public k() {
        this((Boolean) null, (DateFormat) null);
    }

    public k(Boolean bool, DateFormat dateFormat) {
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
        } else {
            O(date, iVar, e0Var);
        }
    }

    /* renamed from: T */
    public k Q(Boolean bool, DateFormat dateFormat) {
        return new k(bool, dateFormat);
    }
}
