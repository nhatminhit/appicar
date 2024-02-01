package na;

import ha.z;
import java.sql.Timestamp;
import java.util.Date;
import ka.d;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f21182a;

    /* renamed from: b  reason: collision with root package name */
    public static final d.b<? extends Date> f21183b;

    /* renamed from: c  reason: collision with root package name */
    public static final d.b<? extends Date> f21184c;

    /* renamed from: d  reason: collision with root package name */
    public static final z f21185d;

    /* renamed from: e  reason: collision with root package name */
    public static final z f21186e;

    /* renamed from: f  reason: collision with root package name */
    public static final z f21187f;

    public class a extends d.b<java.sql.Date> {
        public a(Class cls) {
            super(cls);
        }

        /* renamed from: g */
        public java.sql.Date f(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    public class b extends d.b<Timestamp> {
        public b(Class cls) {
            super(cls);
        }

        /* renamed from: g */
        public Timestamp f(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        z zVar;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f21182a = z10;
        if (z10) {
            f21183b = new a(java.sql.Date.class);
            f21184c = new b(Timestamp.class);
            f21185d = a.f21176b;
            f21186e = b.f21178b;
            zVar = c.f21180b;
        } else {
            zVar = null;
            f21183b = null;
            f21184c = null;
            f21185d = null;
            f21186e = null;
        }
        f21187f = zVar;
    }
}
