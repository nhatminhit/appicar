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

public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f22829a;

    /* renamed from: b  reason: collision with root package name */
    public final u0<i> f22830b;

    /* renamed from: c  reason: collision with root package name */
    public final u2 f22831c;

    /* renamed from: d  reason: collision with root package name */
    public final u2 f22832d;

    public class a extends u0<i> {
        public a(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "INSERT OR ABORT INTO `Kid` (`Id`,`IdKid`) VALUES (nullif(?, 0),?)";
        }

        /* renamed from: r */
        public void g(h hVar, i iVar) {
            hVar.q0(1, (long) iVar.a());
            if (iVar.b() == null) {
                hVar.a1(2);
            } else {
                hVar.F(2, iVar.b());
            }
        }
    }

    public class b extends u2 {
        public b(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  Kid";
        }
    }

    public class c extends u2 {
        public c(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  Kid WHERE IdKid=?";
        }
    }

    public k(n2 n2Var) {
        this.f22829a = n2Var;
        this.f22830b = new a(n2Var);
        this.f22831c = new b(n2Var);
        this.f22832d = new c(n2Var);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public void a() {
        this.f22829a.d();
        h a10 = this.f22831c.a();
        this.f22829a.e();
        try {
            a10.K();
            this.f22829a.I();
        } finally {
            this.f22829a.k();
            this.f22831c.f(a10);
        }
    }

    public void b(String str) {
        this.f22829a.d();
        h a10 = this.f22832d.a();
        if (str == null) {
            a10.a1(1);
        } else {
            a10.F(1, str);
        }
        this.f22829a.e();
        try {
            a10.K();
            this.f22829a.I();
        } finally {
            this.f22829a.k();
            this.f22832d.f(a10);
        }
    }

    public List<String> c() {
        q2 h10 = q2.h("SELECT IdKid FROM Kid", 0);
        this.f22829a.d();
        Cursor d10 = x2.c.d(this.f22829a, h10, false, (CancellationSignal) null);
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

    public void d(i iVar) {
        this.f22829a.d();
        this.f22829a.e();
        try {
            this.f22830b.i(iVar);
            this.f22829a.I();
        } finally {
            this.f22829a.k();
        }
    }
}
