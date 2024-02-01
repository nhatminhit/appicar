package m5;

import java.io.IOException;
import java.util.Map;
import l5.u;
import l5.v;
import w4.n;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public final x f10451a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10452b;

    public static final class a extends x {

        /* renamed from: c  reason: collision with root package name */
        public final u f10453c;

        /* renamed from: d  reason: collision with root package name */
        public final String f10454d;

        public a(x xVar, Object obj, u uVar, String str) {
            super(xVar, obj);
            this.f10453c = uVar;
            this.f10454d = str;
        }

        public void a(Object obj) throws IOException, n {
            this.f10453c.j(obj, this.f10454d, this.f10452b);
        }
    }

    public static final class b extends x {

        /* renamed from: c  reason: collision with root package name */
        public final Object f10455c;

        public b(x xVar, Object obj, Object obj2) {
            super(xVar, obj);
            this.f10455c = obj2;
        }

        public void a(Object obj) throws IOException, n {
            ((Map) obj).put(this.f10455c, this.f10452b);
        }
    }

    public static final class c extends x {

        /* renamed from: c  reason: collision with root package name */
        public final v f10456c;

        public c(x xVar, Object obj, v vVar) {
            super(xVar, obj);
            this.f10456c = vVar;
        }

        public void a(Object obj) throws IOException, n {
            this.f10456c.M(obj, this.f10452b);
        }
    }

    public x(x xVar, Object obj) {
        this.f10451a = xVar;
        this.f10452b = obj;
    }

    public abstract void a(Object obj) throws IOException, n;
}
