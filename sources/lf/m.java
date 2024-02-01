package lf;

import fh.g;
import fh.h;
import java.util.List;
import oe.f;
import xe.l0;

public interface m {

    public static final class a {
        @g
        public static b a(@g m mVar) {
            return new b(mVar);
        }
    }

    public static final class b {
        @g

        /* renamed from: a  reason: collision with root package name */
        public final m f20835a;

        public b(@g m mVar) {
            l0.p(mVar, "match");
            this.f20835a = mVar;
        }

        @f
        public final String a() {
            return k().b().get(1);
        }

        @f
        public final String b() {
            return k().b().get(10);
        }

        @f
        public final String c() {
            return k().b().get(2);
        }

        @f
        public final String d() {
            return k().b().get(3);
        }

        @f
        public final String e() {
            return k().b().get(4);
        }

        @f
        public final String f() {
            return k().b().get(5);
        }

        @f
        public final String g() {
            return k().b().get(6);
        }

        @f
        public final String h() {
            return k().b().get(7);
        }

        @f
        public final String i() {
            return k().b().get(8);
        }

        @f
        public final String j() {
            return k().b().get(9);
        }

        @g
        public final m k() {
            return this.f20835a;
        }

        @g
        public final List<String> l() {
            return this.f20835a.b().subList(1, this.f20835a.b().size());
        }
    }

    @g
    b a();

    @g
    List<String> b();

    @g
    k c();

    @g
    gf.m d();

    @g
    String getValue();

    @h
    m next();
}
