package og;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import y4.c;

public final class f {

    /* renamed from: n  reason: collision with root package name */
    public static final f f21527n = new a().f().a();

    /* renamed from: o  reason: collision with root package name */
    public static final f f21528o = new a().i().d(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21529a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21530b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21531c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21532d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21533e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f21534f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f21535g;

    /* renamed from: h  reason: collision with root package name */
    public final int f21536h;

    /* renamed from: i  reason: collision with root package name */
    public final int f21537i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f21538j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f21539k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f21540l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public String f21541m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f21542a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f21543b;

        /* renamed from: c  reason: collision with root package name */
        public int f21544c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f21545d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f21546e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f21547f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f21548g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f21549h;

        public f a() {
            return new f(this);
        }

        public a b() {
            this.f21549h = true;
            return this;
        }

        public a c(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds((long) i10);
                this.f21544c = seconds > c.M0 ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxAge < 0: " + i10);
        }

        public a d(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds((long) i10);
                this.f21545d = seconds > c.M0 ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i10);
        }

        public a e(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds((long) i10);
                this.f21546e = seconds > c.M0 ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("minFresh < 0: " + i10);
        }

        public a f() {
            this.f21542a = true;
            return this;
        }

        public a g() {
            this.f21543b = true;
            return this;
        }

        public a h() {
            this.f21548g = true;
            return this;
        }

        public a i() {
            this.f21547f = true;
            return this;
        }
    }

    public f(a aVar) {
        this.f21529a = aVar.f21542a;
        this.f21530b = aVar.f21543b;
        this.f21531c = aVar.f21544c;
        this.f21532d = -1;
        this.f21533e = false;
        this.f21534f = false;
        this.f21535g = false;
        this.f21536h = aVar.f21545d;
        this.f21537i = aVar.f21546e;
        this.f21538j = aVar.f21547f;
        this.f21539k = aVar.f21548g;
        this.f21540l = aVar.f21549h;
    }

    public f(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, @Nullable String str) {
        this.f21529a = z10;
        this.f21530b = z11;
        this.f21531c = i10;
        this.f21532d = i11;
        this.f21533e = z12;
        this.f21534f = z13;
        this.f21535g = z14;
        this.f21536h = i12;
        this.f21537i = i13;
        this.f21538j = z15;
        this.f21539k = z16;
        this.f21540l = z17;
        this.f21541m = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static og.f m(og.b0 r22) {
        /*
            r0 = r22
            int r1 = r22.m()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x013f
            java.lang.String r2 = r0.h(r6)
            java.lang.String r4 = r0.o(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r4
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0138
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x0138
            java.lang.String r3 = "=,;"
            int r3 = ug.e.n(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0099
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0099
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            int r3 = r3 + 1
            int r0 = ug.e.o(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = ug.e.n(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009d
        L_0x0089:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = ug.e.n(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009d
        L_0x0099:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009d:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a9
            r5 = -1
            r9 = 1
            goto L_0x0133
        L_0x00a9:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b5
            r5 = -1
            r10 = 1
            goto L_0x0133
        L_0x00b5:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c4
            r5 = -1
            int r11 = ug.e.h(r0, r5)
            goto L_0x0133
        L_0x00c4:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d2
            r5 = -1
            int r12 = ug.e.h(r0, r5)
            goto L_0x0133
        L_0x00d2:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00dd
            r5 = -1
            r13 = 1
            goto L_0x0133
        L_0x00dd:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e8
            r5 = -1
            r14 = 1
            goto L_0x0133
        L_0x00e8:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f3
            r5 = -1
            r15 = 1
            goto L_0x0133
        L_0x00f3:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0104
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = ug.e.h(r0, r2)
            r5 = -1
            goto L_0x0133
        L_0x0104:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0112
            r5 = -1
            int r17 = ug.e.h(r0, r5)
            goto L_0x0133
        L_0x0112:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011e
            r18 = 1
            goto L_0x0133
        L_0x011e:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0129
            r19 = 1
            goto L_0x0133
        L_0x0129:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0133
            r20 = 1
        L_0x0133:
            r0 = r22
            r2 = r3
            goto L_0x003b
        L_0x0138:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x013f:
            if (r7 != 0) goto L_0x0144
            r21 = 0
            goto L_0x0146
        L_0x0144:
            r21 = r8
        L_0x0146:
            og.f r0 = new og.f
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: og.f.m(og.b0):og.f");
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f21529a) {
            sb2.append("no-cache, ");
        }
        if (this.f21530b) {
            sb2.append("no-store, ");
        }
        if (this.f21531c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f21531c);
            sb2.append(", ");
        }
        if (this.f21532d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f21532d);
            sb2.append(", ");
        }
        if (this.f21533e) {
            sb2.append("private, ");
        }
        if (this.f21534f) {
            sb2.append("public, ");
        }
        if (this.f21535g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f21536h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f21536h);
            sb2.append(", ");
        }
        if (this.f21537i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f21537i);
            sb2.append(", ");
        }
        if (this.f21538j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f21539k) {
            sb2.append("no-transform, ");
        }
        if (this.f21540l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }

    public boolean b() {
        return this.f21540l;
    }

    public boolean c() {
        return this.f21533e;
    }

    public boolean d() {
        return this.f21534f;
    }

    public int e() {
        return this.f21531c;
    }

    public int f() {
        return this.f21536h;
    }

    public int g() {
        return this.f21537i;
    }

    public boolean h() {
        return this.f21535g;
    }

    public boolean i() {
        return this.f21529a;
    }

    public boolean j() {
        return this.f21530b;
    }

    public boolean k() {
        return this.f21539k;
    }

    public boolean l() {
        return this.f21538j;
    }

    public int n() {
        return this.f21532d;
    }

    public String toString() {
        String str = this.f21541m;
        if (str != null) {
            return str;
        }
        String a10 = a();
        this.f21541m = a10;
        return a10;
    }
}
