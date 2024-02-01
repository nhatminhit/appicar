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

public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public final n2 f22839a;

    /* renamed from: b  reason: collision with root package name */
    public final u0<m> f22840b;

    /* renamed from: c  reason: collision with root package name */
    public final u2 f22841c;

    /* renamed from: d  reason: collision with root package name */
    public final u2 f22842d;

    public class a extends u0<m> {
        public a(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "INSERT OR ABORT INTO `MusicOffline` (`Id`,`nameFodder`,`source`) VALUES (nullif(?, 0),?,?)";
        }

        /* renamed from: r */
        public void g(h hVar, m mVar) {
            hVar.q0(1, (long) mVar.a());
            if (mVar.b() == null) {
                hVar.a1(2);
            } else {
                hVar.F(2, mVar.b());
            }
            if (mVar.c() == null) {
                hVar.a1(3);
            } else {
                hVar.F(3, mVar.c());
            }
        }
    }

    public class b extends u2 {
        public b(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  MusicOffline";
        }
    }

    public class c extends u2 {
        public c(n2 n2Var) {
            super(n2Var);
        }

        public String d() {
            return "DELETE From  MusicOffline WHERE nameFodder=? and source=?";
        }
    }

    public o(n2 n2Var) {
        this.f22839a = n2Var;
        this.f22840b = new a(n2Var);
        this.f22841c = new b(n2Var);
        this.f22842d = new c(n2Var);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public void a() {
        this.f22839a.d();
        h a10 = this.f22841c.a();
        this.f22839a.e();
        try {
            a10.K();
            this.f22839a.I();
        } finally {
            this.f22839a.k();
            this.f22841c.f(a10);
        }
    }

    public void b(String str, String str2) {
        this.f22839a.d();
        h a10 = this.f22842d.a();
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
        this.f22839a.e();
        try {
            a10.K();
            this.f22839a.I();
        } finally {
            this.f22839a.k();
            this.f22842d.f(a10);
        }
    }

    public List<m> c() {
        q2 h10 = q2.h("SELECT * FROM MusicOffline", 0);
        this.f22839a.d();
        Cursor d10 = x2.c.d(this.f22839a, h10, false, (CancellationSignal) null);
        try {
            int e10 = x2.b.e(d10, "Id");
            int e11 = x2.b.e(d10, "nameFodder");
            int e12 = x2.b.e(d10, b4.a.P);
            ArrayList arrayList = new ArrayList(d10.getCount());
            while (d10.moveToNext()) {
                m mVar = new m(d10.isNull(e11) ? null : d10.getString(e11), d10.isNull(e12) ? null : d10.getString(e12));
                mVar.d(d10.getInt(e10));
                arrayList.add(mVar);
            }
            return arrayList;
        } finally {
            d10.close();
            h10.a();
        }
    }

    public void d(m mVar) {
        this.f22839a.d();
        this.f22839a.e();
        try {
            this.f22840b.i(mVar);
            this.f22839a.I();
        } finally {
            this.f22839a.k();
        }
    }
}
