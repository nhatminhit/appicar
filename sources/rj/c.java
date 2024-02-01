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

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f22792a;

    /* renamed from: b  reason: collision with root package name */
    public final u0<a> f22793b;

    /* renamed from: c  reason: collision with root package name */
    public final u2 f22794c;

    /* renamed from: d  reason: collision with root package name */
    public final u2 f22795d;

    public class a extends u0<a> {
        public a(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "INSERT OR ABORT INTO `car` (`Id`,`IdCar`) VALUES (nullif(?, 0),?)";
        }

        /* renamed from: r */
        public void g(h hVar, a aVar) {
            hVar.q0(1, (long) aVar.a());
            if (aVar.b() == null) {
                hVar.a1(2);
            } else {
                hVar.F(2, aVar.b());
            }
        }
    }

    public class b extends u2 {
        public b(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  car";
        }
    }

    /* renamed from: rj.c$c  reason: collision with other inner class name */
    public class C0419c extends u2 {
        public C0419c(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  car WHERE Idcar=?";
        }
    }

    public c(n2 n2Var) {
        this.f22792a = n2Var;
        this.f22793b = new a(n2Var);
        this.f22794c = new b(n2Var);
        this.f22795d = new C0419c(n2Var);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public void a() {
        this.f22792a.d();
        h a10 = this.f22794c.a();
        this.f22792a.e();
        try {
            a10.K();
            this.f22792a.I();
        } finally {
            this.f22792a.k();
            this.f22794c.f(a10);
        }
    }

    public void b(String str) {
        this.f22792a.d();
        h a10 = this.f22795d.a();
        if (str == null) {
            a10.a1(1);
        } else {
            a10.F(1, str);
        }
        this.f22792a.e();
        try {
            a10.K();
            this.f22792a.I();
        } finally {
            this.f22792a.k();
            this.f22795d.f(a10);
        }
    }

    public List<String> c() {
        q2 h10 = q2.h("SELECT IdCar FROM car ", 0);
        this.f22792a.d();
        Cursor d10 = x2.c.d(this.f22792a, h10, false, (CancellationSignal) null);
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

    public void d(a aVar) {
        this.f22792a.d();
        this.f22792a.e();
        try {
            this.f22793b.i(aVar);
            this.f22792a.I();
        } finally {
            this.f22792a.k();
        }
    }
}
