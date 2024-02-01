package og;

import ch.d;
import ch.f;
import d5.k;
import hh.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import og.b0;
import pg.e;

public final class f0 extends k0 {

    /* renamed from: f  reason: collision with root package name */
    public static final e0 f21550f = e0.c("multipart/mixed");

    /* renamed from: g  reason: collision with root package name */
    public static final e0 f21551g = e0.c("multipart/alternative");

    /* renamed from: h  reason: collision with root package name */
    public static final e0 f21552h = e0.c("multipart/digest");

    /* renamed from: i  reason: collision with root package name */
    public static final e0 f21553i = e0.c("multipart/parallel");

    /* renamed from: j  reason: collision with root package name */
    public static final e0 f21554j = e0.c(c.f19574g);

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f21555k = {k.F0, 32};

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f21556l = {t3.c.T, 10};

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f21557m = {i7.a.f9186b0, i7.a.f9186b0};

    /* renamed from: a  reason: collision with root package name */
    public final f f21558a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f21559b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f21560c;

    /* renamed from: d  reason: collision with root package name */
    public final List<b> f21561d;

    /* renamed from: e  reason: collision with root package name */
    public long f21562e = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final f f21563a;

        /* renamed from: b  reason: collision with root package name */
        public e0 f21564b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f21565c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        public a(String str) {
            this.f21564b = f0.f21550f;
            this.f21565c = new ArrayList();
            this.f21563a = f.o(str);
        }

        public a a(String str, String str2) {
            return d(b.d(str, str2));
        }

        public a b(String str, @Nullable String str2, k0 k0Var) {
            return d(b.e(str, str2, k0Var));
        }

        public a c(@Nullable b0 b0Var, k0 k0Var) {
            return d(b.b(b0Var, k0Var));
        }

        public a d(b bVar) {
            if (bVar != null) {
                this.f21565c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public a e(k0 k0Var) {
            return d(b.c(k0Var));
        }

        public f0 f() {
            if (!this.f21565c.isEmpty()) {
                return new f0(this.f21563a, this.f21564b, this.f21565c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public a g(e0 e0Var) {
            if (e0Var == null) {
                throw new NullPointerException("type == null");
            } else if (e0Var.f().equals("multipart")) {
                this.f21564b = e0Var;
                return this;
            } else {
                throw new IllegalArgumentException("multipart != " + e0Var);
            }
        }
    }

    public static final class b {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final b0 f21566a;

        /* renamed from: b  reason: collision with root package name */
        public final k0 f21567b;

        public b(@Nullable b0 b0Var, k0 k0Var) {
            this.f21566a = b0Var;
            this.f21567b = k0Var;
        }

        public static b b(@Nullable b0 b0Var, k0 k0Var) {
            if (k0Var == null) {
                throw new NullPointerException("body == null");
            } else if (b0Var != null && b0Var.d(c.f19573f) != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (b0Var == null || b0Var.d("Content-Length") == null) {
                return new b(b0Var, k0Var);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static b c(k0 k0Var) {
            return b((b0) null, k0Var);
        }

        public static b d(String str, String str2) {
            return e(str, (String) null, k0.e((e0) null, str2));
        }

        public static b e(String str, @Nullable String str2, k0 k0Var) {
            if (str != null) {
                StringBuilder sb2 = new StringBuilder("form-data; name=");
                f0.k(sb2, str);
                if (str2 != null) {
                    sb2.append("; filename=");
                    f0.k(sb2, str2);
                }
                return b(new b0.a().h("Content-Disposition", sb2.toString()).i(), k0Var);
            }
            throw new NullPointerException("name == null");
        }

        public k0 a() {
            return this.f21567b;
        }

        @Nullable
        public b0 f() {
            return this.f21566a;
        }
    }

    public f0(f fVar, e0 e0Var, List<b> list) {
        this.f21558a = fVar;
        this.f21559b = e0Var;
        this.f21560c = e0.c(e0Var + "; boundary=" + fVar.a0());
        this.f21561d = e.u(list);
    }

    public static void k(StringBuilder sb2, String str) {
        String str2;
        sb2.append('\"');
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == 10) {
                str2 = "%0A";
            } else if (charAt == 13) {
                str2 = "%0D";
            } else if (charAt != '\"') {
                sb2.append(charAt);
            } else {
                str2 = "%22";
            }
            sb2.append(str2);
        }
        sb2.append('\"');
    }

    public long a() throws IOException {
        long j10 = this.f21562e;
        if (j10 != -1) {
            return j10;
        }
        long q10 = q((d) null, true);
        this.f21562e = q10;
        return q10;
    }

    public e0 b() {
        return this.f21560c;
    }

    public void j(d dVar) throws IOException {
        q(dVar, false);
    }

    public String l() {
        return this.f21558a.a0();
    }

    public b m(int i10) {
        return this.f21561d.get(i10);
    }

    public List<b> n() {
        return this.f21561d;
    }

    public int o() {
        return this.f21561d.size();
    }

    public e0 p() {
        return this.f21559b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: ch.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: ch.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ch.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: ch.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ch.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long q(@javax.annotation.Nullable ch.d r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            ch.c r13 = new ch.c
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<og.f0$b> r1 = r12.f21561d
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00a4
            java.util.List<og.f0$b> r6 = r12.f21561d
            java.lang.Object r6 = r6.get(r5)
            og.f0$b r6 = (og.f0.b) r6
            og.b0 r7 = r6.f21566a
            og.k0 r6 = r6.f21567b
            byte[] r8 = f21557m
            r13.write(r8)
            ch.f r8 = r12.f21558a
            r13.T(r8)
            byte[] r8 = f21556l
            r13.write(r8)
            if (r7 == 0) goto L_0x0058
            int r8 = r7.m()
            r9 = r2
        L_0x0038:
            if (r9 >= r8) goto L_0x0058
            java.lang.String r10 = r7.h(r9)
            ch.d r10 = r13.D0(r10)
            byte[] r11 = f21555k
            ch.d r10 = r10.write(r11)
            java.lang.String r11 = r7.o(r9)
            ch.d r10 = r10.D0(r11)
            byte[] r11 = f21556l
            r10.write(r11)
            int r9 = r9 + 1
            goto L_0x0038
        L_0x0058:
            og.e0 r7 = r6.b()
            if (r7 == 0) goto L_0x0071
            java.lang.String r8 = "Content-Type: "
            ch.d r8 = r13.D0(r8)
            java.lang.String r7 = r7.toString()
            ch.d r7 = r8.D0(r7)
            byte[] r8 = f21556l
            r7.write(r8)
        L_0x0071:
            long r7 = r6.a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008b
            java.lang.String r9 = "Content-Length: "
            ch.d r9 = r13.D0(r9)
            ch.d r9 = r9.G1(r7)
            byte[] r10 = f21556l
            r9.write(r10)
            goto L_0x0091
        L_0x008b:
            if (r14 == 0) goto L_0x0091
            r0.g()
            return r9
        L_0x0091:
            byte[] r9 = f21556l
            r13.write(r9)
            if (r14 == 0) goto L_0x009a
            long r3 = r3 + r7
            goto L_0x009d
        L_0x009a:
            r6.j(r13)
        L_0x009d:
            r13.write(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a4:
            byte[] r1 = f21557m
            r13.write(r1)
            ch.f r2 = r12.f21558a
            r13.T(r2)
            r13.write(r1)
            byte[] r1 = f21556l
            r13.write(r1)
            if (r14 == 0) goto L_0x00c0
            long r13 = r0.size()
            long r3 = r3 + r13
            r0.g()
        L_0x00c0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: og.f0.q(ch.d, boolean):long");
    }
}
