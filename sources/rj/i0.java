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

public final class i0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f22822a;

    /* renamed from: b  reason: collision with root package name */
    public final u0<g0> f22823b;

    /* renamed from: c  reason: collision with root package name */
    public final u2 f22824c;

    /* renamed from: d  reason: collision with root package name */
    public final u2 f22825d;

    public class a extends u0<g0> {
        public a(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "INSERT OR ABORT INTO `VideoOffline` (`Id`,`nameFodder`,`source`) VALUES (nullif(?, 0),?,?)";
        }

        /* renamed from: r */
        public void g(h hVar, g0 g0Var) {
            hVar.q0(1, (long) g0Var.a());
            if (g0Var.b() == null) {
                hVar.a1(2);
            } else {
                hVar.F(2, g0Var.b());
            }
            if (g0Var.c() == null) {
                hVar.a1(3);
            } else {
                hVar.F(3, g0Var.c());
            }
        }
    }

    public class b extends u2 {
        public b(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  VideoOffline";
        }
    }

    public class c extends u2 {
        public c(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  VideoOffline WHERE nameFodder=? and source=?";
        }
    }

    public i0(n2 n2Var) {
        this.f22822a = n2Var;
        this.f22823b = new a(n2Var);
        this.f22824c = new b(n2Var);
        this.f22825d = new c(n2Var);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public void a() {
        this.f22822a.d();
        h a10 = this.f22824c.a();
        this.f22822a.e();
        try {
            a10.K();
            this.f22822a.I();
        } finally {
            this.f22822a.k();
            this.f22824c.f(a10);
        }
    }

    public void b(String str, String str2) {
        this.f22822a.d();
        h a10 = this.f22825d.a();
        if (str == null) {
            a10.a1(1);
        } else {
            a10.F(1, str);
        }
        if (str2 == null) {
            a10.a1(2);
        } else {
            a10.F(2, str2);
        }
        this.f22822a.e();
        try {
            a10.K();
            this.f22822a.I();
        } finally {
            this.f22822a.k();
            this.f22825d.f(a10);
        }
    }

    public void c(g0 g0Var) {
        this.f22822a.d();
        this.f22822a.e();
        try {
            this.f22823b.i(g0Var);
            this.f22822a.I();
        } finally {
            this.f22822a.k();
        }
    }

    public List<g0> d() {
        q2 h10 = q2.h("SELECT * FROM VideoOffline", 0);
        this.f22822a.d();
        Cursor d10 = x2.c.d(this.f22822a, h10, false, (CancellationSignal) null);
        try {
            int e10 = x2.b.e(d10, "Id");
            int e11 = x2.b.e(d10, "nameFodder");
            int e12 = x2.b.e(d10, b4.a.P);
            ArrayList arrayList = new ArrayList(d10.getCount());
            while (d10.moveToNext()) {
                g0 g0Var = new g0(d10.isNull(e11) ? null : d10.getString(e11), d10.isNull(e12) ? null : d10.getString(e12));
                g0Var.d(d10.getInt(e10));
                arrayList.add(g0Var);
            }
            return arrayList;
        } finally {
            d10.close();
            h10.a();
        }
    }
}
