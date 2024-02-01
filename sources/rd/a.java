package rd;

import gc.j0;
import gc.t;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import pd.a;
import qd.d;
import sd.c;

public abstract class a extends qd.d {
    public static final String A = "pollComplete";

    /* renamed from: x  reason: collision with root package name */
    public static final Logger f22424x = Logger.getLogger(a.class.getName());

    /* renamed from: y  reason: collision with root package name */
    public static final String f22425y = "polling";

    /* renamed from: z  reason: collision with root package name */
    public static final String f22426z = "poll";

    /* renamed from: w  reason: collision with root package name */
    public boolean f22427w;

    /* renamed from: rd.a$a  reason: collision with other inner class name */
    public class C0397a implements Runnable {
        public final /* synthetic */ Runnable O;

        /* renamed from: rd.a$a$a  reason: collision with other inner class name */
        public class C0398a implements Runnable {
            public final /* synthetic */ a O;

            public C0398a(a aVar) {
                this.O = aVar;
            }

            public void run() {
                a.f22424x.fine(j0.F);
                d.e unused = this.O.f22355l = d.e.R;
                C0397a.this.O.run();
            }
        }

        /* renamed from: rd.a$a$b */
        public class b implements a.C0385a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int[] f22428a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Runnable f22429b;

            public b(int[] iArr, Runnable runnable) {
                this.f22428a = iArr;
                this.f22429b = runnable;
            }

            public void c(Object... objArr) {
                a.f22424x.fine("pre-pause polling complete");
                int[] iArr = this.f22428a;
                int i10 = iArr[0] - 1;
                iArr[0] = i10;
                if (i10 == 0) {
                    this.f22429b.run();
                }
            }
        }

        /* renamed from: rd.a$a$c */
        public class c implements a.C0385a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int[] f22431a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Runnable f22432b;

            public c(int[] iArr, Runnable runnable) {
                this.f22431a = iArr;
                this.f22432b = runnable;
            }

            public void c(Object... objArr) {
                a.f22424x.fine("pre-pause writing complete");
                int[] iArr = this.f22431a;
                int i10 = iArr[0] - 1;
                iArr[0] = i10;
                if (i10 == 0) {
                    this.f22432b.run();
                }
            }
        }

        public C0397a(Runnable runnable) {
            this.O = runnable;
        }

        public void run() {
            a aVar = a.this;
            d.e unused = aVar.f22355l = d.e.R;
            C0398a aVar2 = new C0398a(aVar);
            if (a.this.f22427w || !a.this.f22345b) {
                int[] iArr = {0};
                if (a.this.f22427w) {
                    a.f22424x.fine("we are currently polling - waiting to pause");
                    iArr[0] = iArr[0] + 1;
                    a.this.h(a.A, new b(iArr, aVar2));
                }
                if (!a.this.f22345b) {
                    a.f22424x.fine("we are currently writing - waiting to pause");
                    iArr[0] = iArr[0] + 1;
                    a.this.h("drain", new c(iArr, aVar2));
                    return;
                }
                return;
            }
            aVar2.run();
        }
    }

    public class b implements c.C0422c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f22434a;

        public b(a aVar) {
            this.f22434a = aVar;
        }

        public boolean a(sd.b bVar, int i10, int i11) {
            if (this.f22434a.f22355l == d.e.OPENING && "open".equals(bVar.f22956a)) {
                this.f22434a.q();
            }
            if ("close".equals(bVar.f22956a)) {
                this.f22434a.m();
                return false;
            }
            this.f22434a.r(bVar);
            return true;
        }
    }

    public class c implements a.C0385a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f22436a;

        public c(a aVar) {
            this.f22436a = aVar;
        }

        public void c(Object... objArr) {
            a.f22424x.fine("writing close packet");
            this.f22436a.u(new sd.b[]{new sd.b("close")});
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ a O;

        public d(a aVar) {
            this.O = aVar;
        }

        public void run() {
            a aVar = this.O;
            aVar.f22345b = true;
            aVar.a("drain", new Object[0]);
        }
    }

    public class e implements c.d<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f22438a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Runnable f22439b;

        public e(a aVar, Runnable runnable) {
            this.f22438a = aVar;
            this.f22439b = runnable;
        }

        /* renamed from: b */
        public void a(String str) {
            this.f22438a.F(str, this.f22439b);
        }
    }

    public a(d.C0393d dVar) {
        super(dVar);
        this.f22346c = f22425y;
    }

    public abstract void E();

    public abstract void F(String str, Runnable runnable);

    public void G(Runnable runnable) {
        xd.a.h(new C0397a(runnable));
    }

    public final void H() {
        f22424x.fine(f22425y);
        this.f22427w = true;
        E();
        a(f22426z, new Object[0]);
    }

    public String I() {
        String str;
        String str2;
        Map map = this.f22347d;
        if (map == null) {
            map = new HashMap();
        }
        String str3 = this.f22348e ? t.f19111e : t.f19110d;
        if (this.f22349f) {
            map.put(this.f22353j, yd.a.c());
        }
        String b10 = vd.a.b(map);
        if (this.f22350g <= 0 || ((!t.f19111e.equals(str3) || this.f22350g == 443) && (!t.f19110d.equals(str3) || this.f22350g == 80))) {
            str = "";
        } else {
            str = ":" + this.f22350g;
        }
        if (b10.length() > 0) {
            b10 = "?" + b10;
        }
        boolean contains = this.f22352i.contains(":");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append("://");
        if (contains) {
            str2 = "[" + this.f22352i + "]";
        } else {
            str2 = this.f22352i;
        }
        sb2.append(str2);
        sb2.append(str);
        sb2.append(this.f22351h);
        sb2.append(b10);
        return sb2.toString();
    }

    public void k() {
        c cVar = new c(this);
        if (this.f22355l == d.e.OPEN) {
            f22424x.fine("transport open - closing");
            cVar.c(new Object[0]);
            return;
        }
        f22424x.fine("transport not open - deferring close");
        h("open", cVar);
    }

    public void l() {
        H();
    }

    public void n(String str) {
        v(str);
    }

    public void o(byte[] bArr) {
        v(bArr);
    }

    public void u(sd.b[] bVarArr) {
        this.f22345b = false;
        sd.c.g(bVarArr, new e(this, new d(this)));
    }

    public final void v(Object obj) {
        Logger logger = f22424x;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            logger.fine(String.format("polling got data %s", new Object[]{obj}));
        }
        sd.c.d((String) obj, new b(this));
        if (this.f22355l != d.e.CLOSED) {
            this.f22427w = false;
            a(A, new Object[0]);
            if (this.f22355l == d.e.OPEN) {
                H();
            } else if (logger.isLoggable(level)) {
                logger.fine(String.format("ignoring poll - transport state '%s'", new Object[]{this.f22355l}));
            }
        }
    }
}
