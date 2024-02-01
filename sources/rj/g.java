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

public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f22810a;

    /* renamed from: b  reason: collision with root package name */
    public final u0<e> f22811b;

    /* renamed from: c  reason: collision with root package name */
    public final u2 f22812c;

    /* renamed from: d  reason: collision with root package name */
    public final u2 f22813d;

    public class a extends u0<e> {
        public a(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "INSERT OR ABORT INTO `History` (`Id`,`IdHistory`) VALUES (nullif(?, 0),?)";
        }

        /* renamed from: r */
        public void g(h hVar, e eVar) {
            hVar.q0(1, (long) eVar.a());
            if (eVar.b() == null) {
                hVar.a1(2);
            } else {
                hVar.F(2, eVar.b());
            }
        }
    }

    public class b extends u2 {
        public b(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  History";
        }
    }

    public class c extends u2 {
        public c(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  History WHERE IdHistory=?";
        }
    }

    public g(n2 n2Var) {
        this.f22810a = n2Var;
        this.f22811b = new a(n2Var);
        this.f22812c = new b(n2Var);
        this.f22813d = new c(n2Var);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public void a() {
        this.f22810a.d();
        h a10 = this.f22812c.a();
        this.f22810a.e();
        try {
            a10.K();
            this.f22810a.I();
        } finally {
            this.f22810a.k();
            this.f22812c.f(a10);
        }
    }

    public void b(String str) {
        this.f22810a.d();
        h a10 = this.f22813d.a();
        if (str == null) {
            a10.a1(1);
        } else {
            a10.F(1, str);
        }
        this.f22810a.e();
        try {
            a10.K();
            this.f22810a.I();
        } finally {
            this.f22810a.k();
            this.f22813d.f(a10);
        }
    }

    public List<String> c() {
        q2 h10 = q2.h("SELECT IdHistory FROM History", 0);
        this.f22810a.d();
        Cursor d10 = x2.c.d(this.f22810a, h10, false, (CancellationSignal) null);
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

    public void d(e eVar) {
        this.f22810a.d();
        this.f22810a.e();
        try {
            this.f22811b.i(eVar);
            this.f22810a.I();
        } finally {
            this.f22810a.k();
        }
    }
}
