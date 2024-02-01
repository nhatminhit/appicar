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

public final class a0 implements z {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f22785a;

    /* renamed from: b  reason: collision with root package name */
    public final u0<y> f22786b;

    /* renamed from: c  reason: collision with root package name */
    public final u2 f22787c;

    /* renamed from: d  reason: collision with root package name */
    public final u2 f22788d;

    public class a extends u0<y> {
        public a(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "INSERT OR ABORT INTO `Review` (`Id`,`IdReview`) VALUES (nullif(?, 0),?)";
        }

        /* renamed from: r */
        public void g(h hVar, y yVar) {
            hVar.q0(1, (long) yVar.a());
            if (yVar.b() == null) {
                hVar.a1(2);
            } else {
                hVar.F(2, yVar.b());
            }
        }
    }

    public class b extends u2 {
        public b(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  Review";
        }
    }

    public class c extends u2 {
        public c(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  Review WHERE IdReview=?";
        }
    }

    public a0(n2 n2Var) {
        this.f22785a = n2Var;
        this.f22786b = new a(n2Var);
        this.f22787c = new b(n2Var);
        this.f22788d = new c(n2Var);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public void a() {
        this.f22785a.d();
        h a10 = this.f22787c.a();
        this.f22785a.e();
        try {
            a10.K();
            this.f22785a.I();
        } finally {
            this.f22785a.k();
            this.f22787c.f(a10);
        }
    }

    public void b(String str) {
        this.f22785a.d();
        h a10 = this.f22788d.a();
        if (str == null) {
            a10.a1(1);
        } else {
            a10.F(1, str);
        }
        this.f22785a.e();
        try {
            a10.K();
            this.f22785a.I();
        } finally {
            this.f22785a.k();
            this.f22788d.f(a10);
        }
    }

    public List<String> c() {
        q2 h10 = q2.h("SELECT IdReview FROM Review", 0);
        this.f22785a.d();
        Cursor d10 = x2.c.d(this.f22785a, h10, false, (CancellationSignal) null);
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

    public void d(y yVar) {
        this.f22785a.d();
        this.f22785a.e();
        try {
            this.f22786b.i(yVar);
            this.f22785a.I();
        } finally {
            this.f22785a.k();
        }
    }
}
