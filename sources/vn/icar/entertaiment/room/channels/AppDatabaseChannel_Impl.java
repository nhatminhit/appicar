package vn.icar.entertaiment.room.channels;

import a3.c;
import a3.d;
import aj.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import rj.a0;
import rj.b;
import rj.d0;
import rj.e0;
import rj.f;
import rj.g;
import rj.h0;
import rj.i0;
import rj.j;
import rj.k;
import rj.n;
import rj.o;
import rj.r;
import rj.s;
import rj.v;
import rj.w;
import rj.z;
import u2.n0;
import u2.n2;
import u2.o2;
import u2.p2;
import x2.h;

public final class AppDatabaseChannel_Impl extends AppDatabaseChannel {

    /* renamed from: r  reason: collision with root package name */
    public volatile z f23807r;

    /* renamed from: s  reason: collision with root package name */
    public volatile d0 f23808s;

    /* renamed from: t  reason: collision with root package name */
    public volatile r f23809t;

    /* renamed from: u  reason: collision with root package name */
    public volatile j f23810u;

    /* renamed from: v  reason: collision with root package name */
    public volatile f f23811v;

    /* renamed from: w  reason: collision with root package name */
    public volatile b f23812w;

    /* renamed from: x  reason: collision with root package name */
    public volatile v f23813x;

    /* renamed from: y  reason: collision with root package name */
    public volatile n f23814y;

    /* renamed from: z  reason: collision with root package name */
    public volatile h0 f23815z;

    public class a extends p2.a {
        public a(int i10) {
            super(i10);
        }

        public void a(c cVar) {
            cVar.E("CREATE TABLE IF NOT EXISTS `Review` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `IdReview` TEXT)");
            cVar.E("CREATE TABLE IF NOT EXISTS `History` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `IdHistory` TEXT)");
            cVar.E("CREATE TABLE IF NOT EXISTS `car` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `IdCar` TEXT)");
            cVar.E("CREATE TABLE IF NOT EXISTS `Kid` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `IdKid` TEXT)");
            cVar.E("CREATE TABLE IF NOT EXISTS `Story` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `IdStory` TEXT)");
            cVar.E("CREATE TABLE IF NOT EXISTS `News` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `IdNews` TEXT)");
            cVar.E("CREATE TABLE IF NOT EXISTS `PriorityChannel` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `IdPriorityChannel` TEXT)");
            cVar.E("CREATE TABLE IF NOT EXISTS `MusicOffline` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nameFodder` TEXT, `source` TEXT)");
            cVar.E("CREATE TABLE IF NOT EXISTS `VideoOffline` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nameFodder` TEXT, `source` TEXT)");
            cVar.E(o2.f13583f);
            cVar.E("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b20a50fc8beb1dab8c643ef9adebe028')");
        }

        public void b(c cVar) {
            cVar.E("DROP TABLE IF EXISTS `Review`");
            cVar.E("DROP TABLE IF EXISTS `History`");
            cVar.E("DROP TABLE IF EXISTS `car`");
            cVar.E("DROP TABLE IF EXISTS `Kid`");
            cVar.E("DROP TABLE IF EXISTS `Story`");
            cVar.E("DROP TABLE IF EXISTS `News`");
            cVar.E("DROP TABLE IF EXISTS `PriorityChannel`");
            cVar.E("DROP TABLE IF EXISTS `MusicOffline`");
            cVar.E("DROP TABLE IF EXISTS `VideoOffline`");
            if (AppDatabaseChannel_Impl.this.f13547h != null) {
                int size = AppDatabaseChannel_Impl.this.f13547h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((n2.b) AppDatabaseChannel_Impl.this.f13547h.get(i10)).b(cVar);
                }
            }
        }

        public void c(c cVar) {
            if (AppDatabaseChannel_Impl.this.f13547h != null) {
                int size = AppDatabaseChannel_Impl.this.f13547h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((n2.b) AppDatabaseChannel_Impl.this.f13547h.get(i10)).a(cVar);
                }
            }
        }

        public void d(c cVar) {
            c unused = AppDatabaseChannel_Impl.this.f13540a = cVar;
            AppDatabaseChannel_Impl.this.y(cVar);
            if (AppDatabaseChannel_Impl.this.f13547h != null) {
                int size = AppDatabaseChannel_Impl.this.f13547h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((n2.b) AppDatabaseChannel_Impl.this.f13547h.get(i10)).c(cVar);
                }
            }
        }

        public void e(c cVar) {
        }

        public void f(c cVar) {
            x2.c.b(cVar);
        }

        public p2.b g(c cVar) {
            c cVar2 = cVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("Id", new h.a("Id", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("IdReview", new h.a("IdReview", "TEXT", false, 0, (String) null, 1));
            h hVar = new h("Review", hashMap, new HashSet(0), new HashSet(0));
            h a10 = h.a(cVar2, "Review");
            if (!hVar.equals(a10)) {
                return new p2.b(false, "Review(vn.icar.entertaiment.room.channels.Review).\n Expected:\n" + hVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("Id", new h.a("Id", "INTEGER", true, 1, (String) null, 1));
            hashMap2.put("IdHistory", new h.a("IdHistory", "TEXT", false, 0, (String) null, 1));
            h hVar2 = new h("History", hashMap2, new HashSet(0), new HashSet(0));
            h a11 = h.a(cVar2, "History");
            if (!hVar2.equals(a11)) {
                return new p2.b(false, "History(vn.icar.entertaiment.room.channels.History).\n Expected:\n" + hVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("Id", new h.a("Id", "INTEGER", true, 1, (String) null, 1));
            hashMap3.put("IdCar", new h.a("IdCar", "TEXT", false, 0, (String) null, 1));
            h hVar3 = new h(a.e.f16178j, hashMap3, new HashSet(0), new HashSet(0));
            h a12 = h.a(cVar2, a.e.f16178j);
            if (!hVar3.equals(a12)) {
                return new p2.b(false, "car(vn.icar.entertaiment.room.channels.Car).\n Expected:\n" + hVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("Id", new h.a("Id", "INTEGER", true, 1, (String) null, 1));
            hashMap4.put("IdKid", new h.a("IdKid", "TEXT", false, 0, (String) null, 1));
            h hVar4 = new h("Kid", hashMap4, new HashSet(0), new HashSet(0));
            h a13 = h.a(cVar2, "Kid");
            if (!hVar4.equals(a13)) {
                return new p2.b(false, "Kid(vn.icar.entertaiment.room.channels.Kid).\n Expected:\n" + hVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("Id", new h.a("Id", "INTEGER", true, 1, (String) null, 1));
            hashMap5.put("IdStory", new h.a("IdStory", "TEXT", false, 0, (String) null, 1));
            h hVar5 = new h("Story", hashMap5, new HashSet(0), new HashSet(0));
            h a14 = h.a(cVar2, "Story");
            if (!hVar5.equals(a14)) {
                return new p2.b(false, "Story(vn.icar.entertaiment.room.channels.Story).\n Expected:\n" + hVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("Id", new h.a("Id", "INTEGER", true, 1, (String) null, 1));
            hashMap6.put("IdNews", new h.a("IdNews", "TEXT", false, 0, (String) null, 1));
            h hVar6 = new h("News", hashMap6, new HashSet(0), new HashSet(0));
            h a15 = h.a(cVar2, "News");
            if (!hVar6.equals(a15)) {
                return new p2.b(false, "News(vn.icar.entertaiment.room.channels.News).\n Expected:\n" + hVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("Id", new h.a("Id", "INTEGER", true, 1, (String) null, 1));
            hashMap7.put("IdPriorityChannel", new h.a("IdPriorityChannel", "TEXT", false, 0, (String) null, 1));
            h hVar7 = new h("PriorityChannel", hashMap7, new HashSet(0), new HashSet(0));
            h a16 = h.a(cVar2, "PriorityChannel");
            if (!hVar7.equals(a16)) {
                return new p2.b(false, "PriorityChannel(vn.icar.entertaiment.room.channels.PriorityChannel).\n Expected:\n" + hVar7 + "\n Found:\n" + a16);
            }
            HashMap hashMap8 = new HashMap(3);
            hashMap8.put("Id", new h.a("Id", "INTEGER", true, 1, (String) null, 1));
            hashMap8.put("nameFodder", new h.a("nameFodder", "TEXT", false, 0, (String) null, 1));
            hashMap8.put(b4.a.P, new h.a(b4.a.P, "TEXT", false, 0, (String) null, 1));
            h hVar8 = new h("MusicOffline", hashMap8, new HashSet(0), new HashSet(0));
            h a17 = h.a(cVar2, "MusicOffline");
            if (!hVar8.equals(a17)) {
                return new p2.b(false, "MusicOffline(vn.icar.entertaiment.room.channels.MusicOffline).\n Expected:\n" + hVar8 + "\n Found:\n" + a17);
            }
            HashMap hashMap9 = new HashMap(3);
            hashMap9.put("Id", new h.a("Id", "INTEGER", true, 1, (String) null, 1));
            hashMap9.put("nameFodder", new h.a("nameFodder", "TEXT", false, 0, (String) null, 1));
            hashMap9.put(b4.a.P, new h.a(b4.a.P, "TEXT", false, 0, (String) null, 1));
            h hVar9 = new h("VideoOffline", hashMap9, new HashSet(0), new HashSet(0));
            h a18 = h.a(cVar2, "VideoOffline");
            if (hVar9.equals(a18)) {
                return new p2.b(true, (String) null);
            }
            return new p2.b(false, "VideoOffline(vn.icar.entertaiment.room.channels.VideoOffline).\n Expected:\n" + hVar9 + "\n Found:\n" + a18);
        }
    }

    public b K() {
        b bVar;
        if (this.f23812w != null) {
            return this.f23812w;
        }
        synchronized (this) {
            if (this.f23812w == null) {
                this.f23812w = new rj.c(this);
            }
            bVar = this.f23812w;
        }
        return bVar;
    }

    public f L() {
        f fVar;
        if (this.f23811v != null) {
            return this.f23811v;
        }
        synchronized (this) {
            if (this.f23811v == null) {
                this.f23811v = new g(this);
            }
            fVar = this.f23811v;
        }
        return fVar;
    }

    public j N() {
        j jVar;
        if (this.f23810u != null) {
            return this.f23810u;
        }
        synchronized (this) {
            if (this.f23810u == null) {
                this.f23810u = new k(this);
            }
            jVar = this.f23810u;
        }
        return jVar;
    }

    public n O() {
        n nVar;
        if (this.f23814y != null) {
            return this.f23814y;
        }
        synchronized (this) {
            if (this.f23814y == null) {
                this.f23814y = new o(this);
            }
            nVar = this.f23814y;
        }
        return nVar;
    }

    public r P() {
        r rVar;
        if (this.f23809t != null) {
            return this.f23809t;
        }
        synchronized (this) {
            if (this.f23809t == null) {
                this.f23809t = new s(this);
            }
            rVar = this.f23809t;
        }
        return rVar;
    }

    public v Q() {
        v vVar;
        if (this.f23813x != null) {
            return this.f23813x;
        }
        synchronized (this) {
            if (this.f23813x == null) {
                this.f23813x = new w(this);
            }
            vVar = this.f23813x;
        }
        return vVar;
    }

    public z R() {
        z zVar;
        if (this.f23807r != null) {
            return this.f23807r;
        }
        synchronized (this) {
            if (this.f23807r == null) {
                this.f23807r = new a0(this);
            }
            zVar = this.f23807r;
        }
        return zVar;
    }

    public d0 S() {
        d0 d0Var;
        if (this.f23808s != null) {
            return this.f23808s;
        }
        synchronized (this) {
            if (this.f23808s == null) {
                this.f23808s = new e0(this);
            }
            d0Var = this.f23808s;
        }
        return d0Var;
    }

    public h0 T() {
        h0 h0Var;
        if (this.f23815z != null) {
            return this.f23815z;
        }
        synchronized (this) {
            if (this.f23815z == null) {
                this.f23815z = new i0(this);
            }
            h0Var = this.f23815z;
        }
        return h0Var;
    }

    public void f() {
        super.c();
        c writableDatabase = super.o().getWritableDatabase();
        try {
            super.e();
            writableDatabase.E("DELETE FROM `Review`");
            writableDatabase.E("DELETE FROM `History`");
            writableDatabase.E("DELETE FROM `car`");
            writableDatabase.E("DELETE FROM `Kid`");
            writableDatabase.E("DELETE FROM `Story`");
            writableDatabase.E("DELETE FROM `News`");
            writableDatabase.E("DELETE FROM `PriorityChannel`");
            writableDatabase.E("DELETE FROM `MusicOffline`");
            writableDatabase.E("DELETE FROM `VideoOffline`");
            super.I();
        } finally {
            super.k();
            writableDatabase.G0("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.n1()) {
                writableDatabase.E("VACUUM");
            }
        }
    }

    public androidx.room.c i() {
        return new androidx.room.c(this, new HashMap(0), new HashMap(0), "Review", "History", a.e.f16178j, "Kid", "Story", "News", "PriorityChannel", "MusicOffline", "VideoOffline");
    }

    public d j(n0 n0Var) {
        return n0Var.f13520a.a(d.b.a(n0Var.f13521b).c(n0Var.f13522c).b(new p2(n0Var, new a(2), "b20a50fc8beb1dab8c643ef9adebe028", "47f22b166a99df23c6b4834e8e9f5008")).a());
    }

    public Map<Class<?>, List<Class<?>>> q() {
        HashMap hashMap = new HashMap();
        hashMap.put(z.class, a0.e());
        hashMap.put(d0.class, e0.e());
        hashMap.put(r.class, s.e());
        hashMap.put(j.class, k.e());
        hashMap.put(f.class, g.e());
        hashMap.put(b.class, rj.c.e());
        hashMap.put(v.class, w.e());
        hashMap.put(n.class, o.e());
        hashMap.put(h0.class, i0.e());
        return hashMap;
    }
}
