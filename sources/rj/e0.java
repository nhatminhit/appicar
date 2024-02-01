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

public final class e0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f22803a;

    /* renamed from: b  reason: collision with root package name */
    public final u0<c0> f22804b;

    /* renamed from: c  reason: collision with root package name */
    public final u2 f22805c;

    /* renamed from: d  reason: collision with root package name */
    public final u2 f22806d;

    public class a extends u0<c0> {
        public a(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "INSERT OR ABORT INTO `Story` (`Id`,`IdStory`) VALUES (nullif(?, 0),?)";
        }

        /* renamed from: r */
        public void g(h hVar, c0 c0Var) {
            hVar.q0(1, (long) c0Var.a());
            if (c0Var.b() == null) {
                hVar.a1(2);
            } else {
                hVar.F(2, c0Var.b());
            }
        }
    }

    public class b extends u2 {
        public b(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE  From  Story";
        }
    }

    public class c extends u2 {
        public c(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  Story WHERE IdStory=?";
        }
    }

    public e0(n2 n2Var) {
        this.f22803a = n2Var;
        this.f22804b = new a(n2Var);
        this.f22805c = new b(n2Var);
        this.f22806d = new c(n2Var);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public void a() {
        this.f22803a.d();
        h a10 = this.f22805c.a();
        this.f22803a.e();
        try {
            a10.K();
            this.f22803a.I();
        } finally {
            this.f22803a.k();
            this.f22805c.f(a10);
        }
    }

    public void b(String str) {
        this.f22803a.d();
        h a10 = this.f22806d.a();
        if (str == null) {
            a10.a1(1);
        } else {
            a10.F(1, str);
        }
        this.f22803a.e();
        try {
            a10.K();
            this.f22803a.I();
        } finally {
            this.f22803a.k();
            this.f22806d.f(a10);
        }
    }

    public List<String> c() {
        q2 h10 = q2.h("SELECT IdStory FROM Story", 0);
        this.f22803a.d();
        Cursor d10 = x2.c.d(this.f22803a, h10, false, (CancellationSignal) null);
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

    public void d(c0 c0Var) {
        this.f22803a.d();
        this.f22803a.e();
        try {
            this.f22804b.i(c0Var);
            this.f22803a.I();
        } finally {
            this.f22803a.k();
        }
    }
}
