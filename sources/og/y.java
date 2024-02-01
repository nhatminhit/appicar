package og;

import ch.d;
import hh.c;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import pg.e;

public final class y extends k0 {

    /* renamed from: c  reason: collision with root package name */
    public static final e0 f21779c = e0.c(c.f19575h);

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f21780a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f21781b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f21782a;

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f21783b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public final Charset f21784c;

        public a() {
            this((Charset) null);
        }

        public a(@Nullable Charset charset) {
            this.f21782a = new ArrayList();
            this.f21783b = new ArrayList();
            this.f21784c = charset;
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f21782a.add(c0.c(str, c0.f21479s, false, false, true, true, this.f21784c));
                this.f21783b.add(c0.c(str2, c0.f21479s, false, false, true, true, this.f21784c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public a b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f21782a.add(c0.c(str, c0.f21479s, true, false, true, true, this.f21784c));
                this.f21783b.add(c0.c(str2, c0.f21479s, true, false, true, true, this.f21784c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public y c() {
            return new y(this.f21782a, this.f21783b);
        }
    }

    public y(List<String> list, List<String> list2) {
        this.f21780a = e.u(list);
        this.f21781b = e.u(list2);
    }

    public long a() {
        return p((d) null, true);
    }

    public e0 b() {
        return f21779c;
    }

    public void j(d dVar) throws IOException {
        p(dVar, false);
    }

    public String k(int i10) {
        return this.f21780a.get(i10);
    }

    public String l(int i10) {
        return this.f21781b.get(i10);
    }

    public String m(int i10) {
        return c0.A(k(i10), true);
    }

    public int n() {
        return this.f21780a.size();
    }

    public String o(int i10) {
        return c0.A(l(i10), true);
    }

    public final long p(@Nullable d dVar, boolean z10) {
        ch.c cVar = z10 ? new ch.c() : dVar.j();
        int size = this.f21780a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                cVar.writeByte(38);
            }
            cVar.D0(this.f21780a.get(i10));
            cVar.writeByte(61);
            cVar.D0(this.f21781b.get(i10));
        }
        if (!z10) {
            return 0;
        }
        long size2 = cVar.size();
        cVar.g();
        return size2;
    }
}
