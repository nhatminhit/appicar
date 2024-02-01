package y5;

import i5.e0;
import j5.a;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import w4.i;

@a
public class h extends l<Calendar> {
    public static final h U = new h();

    public h() {
        this((Boolean) null, (DateFormat) null);
    }

    public h(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    /* renamed from: R */
    public long P(Calendar calendar) {
        if (calendar == null) {
            return 0;
        }
        return calendar.getTimeInMillis();
    }

    /* renamed from: S */
    public void m(Calendar calendar, i iVar, e0 e0Var) throws IOException {
        if (N(e0Var)) {
            iVar.p2(P(calendar));
        } else {
            O(calendar.getTime(), iVar, e0Var);
        }
    }

    /* renamed from: T */
    public h Q(Boolean bool, DateFormat dateFormat) {
        return new h(bool, dateFormat);
    }
}
