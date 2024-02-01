package u2;

import a3.c;
import a3.d;
import android.database.Cursor;
import d.m0;
import d.o0;
import d.x0;
import java.util.List;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class p2 extends d.a {
    @o0

    /* renamed from: c  reason: collision with root package name */
    public n0 f13585c;
    @m0

    /* renamed from: d  reason: collision with root package name */
    public final a f13586d;
    @m0

    /* renamed from: e  reason: collision with root package name */
    public final String f13587e;
    @m0

    /* renamed from: f  reason: collision with root package name */
    public final String f13588f;

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13589a;

        public a(int i10) {
            this.f13589a = i10;
        }

        public abstract void a(c cVar);

        public abstract void b(c cVar);

        public abstract void c(c cVar);

        public abstract void d(c cVar);

        public void e(c cVar) {
        }

        public void f(c cVar) {
        }

        @m0
        public b g(@m0 c cVar) {
            h(cVar);
            return new b(true, (String) null);
        }

        @Deprecated
        public void h(c cVar) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13590a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final String f13591b;

        public b(boolean z10, @o0 String str) {
            this.f13590a = z10;
            this.f13591b = str;
        }
    }

    public p2(@m0 n0 n0Var, @m0 a aVar, @m0 String str) {
        this(n0Var, aVar, "", str);
    }

    public p2(@m0 n0 n0Var, @m0 a aVar, @m0 String str, @m0 String str2) {
        super(aVar.f13589a);
        this.f13585c = n0Var;
        this.f13586d = aVar;
        this.f13587e = str;
        this.f13588f = str2;
    }

    public static boolean j(c cVar) {
        Cursor G0 = cVar.G0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (G0.moveToFirst() && G0.getInt(0) == 0) {
                z10 = true;
            }
            return z10;
        } finally {
            G0.close();
        }
    }

    public static boolean k(c cVar) {
        Cursor G0 = cVar.G0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (G0.moveToFirst() && G0.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            G0.close();
        }
    }

    public void b(c cVar) {
        super.b(cVar);
    }

    public void d(c cVar) {
        boolean j10 = j(cVar);
        this.f13586d.a(cVar);
        if (!j10) {
            b g10 = this.f13586d.g(cVar);
            if (!g10.f13590a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f13591b);
            }
        }
        l(cVar);
        this.f13586d.c(cVar);
    }

    public void e(c cVar, int i10, int i11) {
        g(cVar, i10, i11);
    }

    public void f(c cVar) {
        super.f(cVar);
        h(cVar);
        this.f13586d.d(cVar);
        this.f13585c = null;
    }

    public void g(c cVar, int i10, int i11) {
        boolean z10;
        List<v2.c> c10;
        n0 n0Var = this.f13585c;
        if (n0Var == null || (c10 = n0Var.f13523d.c(i10, i11)) == null) {
            z10 = false;
        } else {
            this.f13586d.f(cVar);
            for (v2.c a10 : c10) {
                a10.a(cVar);
            }
            b g10 = this.f13586d.g(cVar);
            if (g10.f13590a) {
                this.f13586d.e(cVar);
                l(cVar);
                z10 = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g10.f13591b);
            }
        }
        if (!z10) {
            n0 n0Var2 = this.f13585c;
            if (n0Var2 == null || n0Var2.a(i10, i11)) {
                throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f13586d.b(cVar);
            this.f13586d.a(cVar);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void h(c cVar) {
        if (k(cVar)) {
            String str = null;
            Cursor G = cVar.G(new a3.b(o2.f13584g));
            try {
                if (G.moveToFirst()) {
                    str = G.getString(0);
                }
                G.close();
                if (!this.f13587e.equals(str) && !this.f13588f.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th2) {
                G.close();
                throw th2;
            }
        } else {
            b g10 = this.f13586d.g(cVar);
            if (g10.f13590a) {
                this.f13586d.e(cVar);
                l(cVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f13591b);
        }
    }

    public final void i(c cVar) {
        cVar.E(o2.f13583f);
    }

    public final void l(c cVar) {
        i(cVar);
        cVar.E(o2.a(this.f13587e));
    }
}
