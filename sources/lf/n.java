package lf;

import be.c;
import be.e0;
import be.w;
import fh.g;
import fh.h;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import lf.m;
import oe.m;
import p000if.u;
import we.l;
import xe.l0;
import xe.n0;

public final class n implements m {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final Matcher f20836a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f20837b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final k f20838c = new b(this);
    @h

    /* renamed from: d  reason: collision with root package name */
    public List<String> f20839d;

    public static final class a extends c<String> {
        public final /* synthetic */ n P;

        public a(n nVar) {
            this.P = nVar;
        }

        public int b() {
            return this.P.f().groupCount() + 1;
        }

        public /* bridge */ boolean c(String str) {
            return super.contains(str);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return c((String) obj);
        }

        @g
        /* renamed from: e */
        public String get(int i10) {
            String group = this.P.f().group(i10);
            return group == null ? "" : group;
        }

        public /* bridge */ int f(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int h(String str) {
            return super.lastIndexOf(str);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return f((String) obj);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return h((String) obj);
        }
    }

    public static final class b extends be.a<j> implements l {
        public final /* synthetic */ n O;

        public static final class a extends n0 implements l<Integer, j> {
            public final /* synthetic */ b P;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(1);
                this.P = bVar;
            }

            public /* bridge */ /* synthetic */ Object A(Object obj) {
                return c(((Number) obj).intValue());
            }

            @h
            public final j c(int i10) {
                return this.P.get(i10);
            }
        }

        public b(n nVar) {
            this.O = nVar;
        }

        public int b() {
            return this.O.f().groupCount() + 1;
        }

        public /* bridge */ boolean c(j jVar) {
            return super.contains(jVar);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj == null ? true : obj instanceof j)) {
                return false;
            }
            return c((j) obj);
        }

        @h
        public j g(@g String str) {
            l0.p(str, "name");
            return m.f21456a.c(this.O.f(), str);
        }

        @h
        public j get(int i10) {
            gf.m d10 = p.j(this.O.f(), i10);
            if (d10.c().intValue() < 0) {
                return null;
            }
            String group = this.O.f().group(i10);
            l0.o(group, "matchResult.group(index)");
            return new j(group, d10);
        }

        public boolean isEmpty() {
            return false;
        }

        @g
        public Iterator<j> iterator() {
            return u.k1(e0.v1(w.F(this)), new a(this)).iterator();
        }
    }

    public n(@g Matcher matcher, @g CharSequence charSequence) {
        l0.p(matcher, "matcher");
        l0.p(charSequence, "input");
        this.f20836a = matcher;
        this.f20837b = charSequence;
    }

    @g
    public m.b a() {
        return m.a.a(this);
    }

    @g
    public List<String> b() {
        if (this.f20839d == null) {
            this.f20839d = new a(this);
        }
        List<String> list = this.f20839d;
        l0.m(list);
        return list;
    }

    @g
    public k c() {
        return this.f20838c;
    }

    @g
    public gf.m d() {
        return p.i(f());
    }

    public final MatchResult f() {
        return this.f20836a;
    }

    @g
    public String getValue() {
        String group = f().group();
        l0.o(group, "matchResult.group()");
        return group;
    }

    @h
    public m next() {
        int end = f().end() + (f().end() == f().start() ? 1 : 0);
        if (end > this.f20837b.length()) {
            return null;
        }
        Matcher matcher = this.f20836a.pattern().matcher(this.f20837b);
        l0.o(matcher, "matcher.pattern().matcher(input)");
        return p.f(matcher, end, this.f20837b);
    }
}
