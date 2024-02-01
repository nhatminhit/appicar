package rj;

import a3.h;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u2.n2;
import u2.q2;
import u2.u0;
import u2.u2;

public final class s implements r {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f22848a;

    /* renamed from: b  reason: collision with root package name */
    public final u0<q> f22849b;

    /* renamed from: c  reason: collision with root package name */
    public final u2 f22850c;

    /* renamed from: d  reason: collision with root package name */
    public final u2 f22851d;

    public class a extends u0<q> {
        public a(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "INSERT OR ABORT INTO `News` (`Id`,`IdNews`) VALUES (nullif(?, 0),?)";
        }

        /* renamed from: r */
        public void g(h hVar, q qVar) {
            hVar.q0(1, (long) qVar.a());
            if (qVar.b() == null) {
                hVar.a1(2);
            } else {
                hVar.F(2, qVar.b());
            }
        }
    }

    public class b extends u2 {
        public b(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  News";
        }
    }

    public class c extends u2 {
        public c(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  News WHERE IdNews=?";
        }
    }

    public s(n2 n2Var) {
        this.f22848a = n2Var;
        this.f22849b = new a(n2Var);
        this.f22850c = new b(n2Var);
        this.f22851d = new c(n2Var);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public void a() {
        this.f22848a.d();
        h a10 = this.f22850c.a();
        this.f22848a.e();
        try {
            a10.K();
            this.f22848a.I();
        } finally {
            this.f22848a.k();
            this.f22850c.f(a10);
        }
    }

    public void b(String str) {
        this.f22848a.d();
        h a10 = this.f22851d.a();
        if (str == null) {
            a10.a1(1);
        } else {
            a10.F(1, str);
        }
        this.f22848a.e();
        try {
            a10.K();
            this.f22848a.I();
        } finally {
            this.f22848a.k();
            this.f22851d.f(a10);
        }
    }

    public List<String> c() {
        q2 h10 = q2.h("SELECT IdNews FROM News", 0);
        this.f22848a.d();
        Cursor d10 = x2.c.d(this.f22848a, h10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(d10.getCount());
            while (d10.moveToNext()) {
                arrayList.add(d10.isNull(0) ? null : d10.getString(0));
            }
            return arrayList;
        } finally {
            d10.close();
            h10.a();
        }
    }

    public void d(q qVar) {
        this.f22848a.d();
        this.f22848a.e();
        try {
            this.f22849b.i(qVar);
            this.f22848a.I();
        } finally {
            this.f22848a.k();
        }
    }
}
