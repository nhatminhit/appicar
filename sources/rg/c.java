package rg;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import og.b0;
import og.f;
import og.j0;
import og.l0;
import ug.d;
import ug.e;

public final class c {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final j0 f22551a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final l0 f22552b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f22553a;

        /* renamed from: b  reason: collision with root package name */
        public final j0 f22554b;

        /* renamed from: c  reason: collision with root package name */
        public final l0 f22555c;

        /* renamed from: d  reason: collision with root package name */
        public Date f22556d;

        /* renamed from: e  reason: collision with root package name */
        public String f22557e;

        /* renamed from: f  reason: collision with root package name */
        public Date f22558f;

        /* renamed from: g  reason: collision with root package name */
        public String f22559g;

        /* renamed from: h  reason: collision with root package name */
        public Date f22560h;

        /* renamed from: i  reason: collision with root package name */
        public long f22561i;

        /* renamed from: j  reason: collision with root package name */
        public long f22562j;

        /* renamed from: k  reason: collision with root package name */
        public String f22563k;

        /* renamed from: l  reason: collision with root package name */
        public int f22564l = -1;

        public a(long j10, j0 j0Var, l0 l0Var) {
            this.f22553a = j10;
            this.f22554b = j0Var;
            this.f22555c = l0Var;
            if (l0Var != null) {
                this.f22561i = l0Var.k0();
                this.f22562j = l0Var.c0();
                b0 q10 = l0Var.q();
                int m10 = q10.m();
                for (int i10 = 0; i10 < m10; i10++) {
                    String h10 = q10.h(i10);
                    String o10 = q10.o(i10);
                    if ("Date".equalsIgnoreCase(h10)) {
                        this.f22556d = d.b(o10);
                        this.f22557e = o10;
                    } else if ("Expires".equalsIgnoreCase(h10)) {
                        this.f22560h = d.b(o10);
                    } else if ("Last-Modified".equalsIgnoreCase(h10)) {
                        this.f22558f = d.b(o10);
                        this.f22559g = o10;
                    } else if ("ETag".equalsIgnoreCase(h10)) {
                        this.f22563k = o10;
                    } else if ("Age".equalsIgnoreCase(h10)) {
                        this.f22564l = e.h(o10, -1);
                    }
                }
            }
        }

        public static boolean e(j0 j0Var) {
            return (j0Var.c("If-Modified-Since") == null && j0Var.c("If-None-Match") == null) ? false : true;
        }

        public final long a() {
            Date date = this.f22556d;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0, this.f22562j - date.getTime());
            }
            int i10 = this.f22564l;
            if (i10 != -1) {
                j10 = Math.max(j10, TimeUnit.SECONDS.toMillis((long) i10));
            }
            long j11 = this.f22562j;
            return j10 + (j11 - this.f22561i) + (this.f22553a - j11);
        }

        public final long b() {
            f f10 = this.f22555c.f();
            if (f10.e() != -1) {
                return TimeUnit.SECONDS.toMillis((long) f10.e());
            }
            if (this.f22560h != null) {
                Date date = this.f22556d;
                long time = this.f22560h.getTime() - (date != null ? date.getTime() : this.f22562j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f22558f == null || this.f22555c.e0().k().F() != null) {
                return 0;
            } else {
                Date date2 = this.f22556d;
                long time2 = (date2 != null ? date2.getTime() : this.f22561i) - this.f22558f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        public c c() {
            c d10 = d();
            return (d10.f22551a == null || !this.f22554b.b().l()) ? d10 : new c((j0) null, (l0) null);
        }

        public final c d() {
            if (this.f22555c == null) {
                return new c(this.f22554b, (l0) null);
            }
            if (this.f22554b.f() && this.f22555c.k() == null) {
                return new c(this.f22554b, (l0) null);
            }
            if (!c.a(this.f22555c, this.f22554b)) {
                return new c(this.f22554b, (l0) null);
            }
            f b10 = this.f22554b.b();
            if (b10.i() || e(this.f22554b)) {
                return new c(this.f22554b, (l0) null);
            }
            f f10 = this.f22555c.f();
            long a10 = a();
            long b11 = b();
            if (b10.e() != -1) {
                b11 = Math.min(b11, TimeUnit.SECONDS.toMillis((long) b10.e()));
            }
            long j10 = 0;
            long millis = b10.g() != -1 ? TimeUnit.SECONDS.toMillis((long) b10.g()) : 0;
            if (!f10.h() && b10.f() != -1) {
                j10 = TimeUnit.SECONDS.toMillis((long) b10.f());
            }
            if (!f10.i()) {
                long j11 = millis + a10;
                if (j11 < j10 + b11) {
                    l0.a P = this.f22555c.P();
                    if (j11 >= b11) {
                        P.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a10 > 86400000 && f()) {
                        P.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new c((j0) null, P.c());
                }
            }
            String str = this.f22563k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f22558f != null) {
                str = this.f22559g;
            } else if (this.f22556d == null) {
                return new c(this.f22554b, (l0) null);
            } else {
                str = this.f22557e;
            }
            b0.a j12 = this.f22554b.e().j();
            pg.a.f22062a.b(j12, str2, str);
            return new c(this.f22554b.h().i(j12.i()).b(), this.f22555c);
        }

        public final boolean f() {
            return this.f22555c.f().e() == -1 && this.f22560h == null;
        }
    }

    public c(j0 j0Var, l0 l0Var) {
        this.f22551a = j0Var;
        this.f22552b = l0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.f().c() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(og.l0 r3, og.j0 r4) {
        /*
            int r0 = r3.i()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.l(r0)
            if (r0 != 0) goto L_0x005a
            og.f r0 = r3.f()
            int r0 = r0.e()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            og.f r0 = r3.f()
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x005a
            og.f r0 = r3.f()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            og.f r3 = r3.f()
            boolean r3 = r3.j()
            if (r3 != 0) goto L_0x006f
            og.f r3 = r4.b()
            boolean r3 = r3.j()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.c.a(og.l0, og.j0):boolean");
    }
}
