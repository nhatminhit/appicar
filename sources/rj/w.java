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

public final class w implements v {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f22857a;

    /* renamed from: b  reason: collision with root package name */
    public final u0<u> f22858b;

    /* renamed from: c  reason: collision with root package name */
    public final u2 f22859c;

    /* renamed from: d  reason: collision with root package name */
    public final u2 f22860d;

    public class a extends u0<u> {
        public a(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "INSERT OR ABORT INTO `PriorityChannel` (`Id`,`IdPriorityChannel`) VALUES (nullif(?, 0),?)";
        }

        /* renamed from: r */
        public void g(h hVar, u uVar) {
            hVar.q0(1, (long) uVar.a());
            if (uVar.b() == null) {
                hVar.a1(2);
            } else {
                hVar.F(2, uVar.b());
            }
        }
    }

    public class b extends u2 {
        public b(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  PriorityChannel";
        }
    }

    public class c extends u2 {
        public c(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  PriorityChannel WHERE IdPriorityChannel=?";
        }
    }

    public w(n2 n2Var) {
        this.f22857a = n2Var;
        this.f22858b = new a(n2Var);
        this.f22859c = new b(n2Var);
        this.f22860d = new c(n2Var);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public void a() {
        this.f22857a.d();
        h a10 = this.f22859c.a();
        this.f22857a.e();
        try {
            a10.K();
            this.f22857a.I();
        } finally {
            this.f22857a.k();
            this.f22859c.f(a10);
        }
    }

    public void b(String str) {
        this.f22857a.d();
        h a10 = this.f22860d.a();
        if (str == null) {
            a10.a1(1);
        } else {
            a10.F(1, str);
        }
        this.f22857a.e();
        try {
            a10.K();
            this.f22857a.I();
        } finally {
            this.f22857a.k();
            this.f22860d.f(a10);
        }
    }

    public void c(u uVar) {
        this.f22857a.d();
        this.f22857a.e();
        try {
            this.f22858b.i(uVar);
            this.f22857a.I();
        } finally {
            this.f22857a.k();
        }
    }

    public List<String> d() {
        q2 h10 = q2.h("SELECT IdPriorityChannel FROM PriorityChannel", 0);
        this.f22857a.d();
        Cursor d10 = x2.c.d(this.f22857a, h10, false, (CancellationSignal) null);
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
}
