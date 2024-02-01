package hf;

import fh.g;
import fh.h;
import ve.e;
import ve.m;
import xe.l0;
import xe.w;
import zd.a1;
import zd.h1;
import zd.j0;

@h1(version = "1.1")
public final class u {
    @g

    /* renamed from: c  reason: collision with root package name */
    public static final a f19546c = new a((w) null);
    @g
    @e

    /* renamed from: d  reason: collision with root package name */
    public static final u f19547d = new u((v) null, (s) null);
    @h

    /* renamed from: a  reason: collision with root package name */
    public final v f19548a;
    @h

    /* renamed from: b  reason: collision with root package name */
    public final s f19549b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @a1
        public static /* synthetic */ void d() {
        }

        @g
        @m
        public final u a(@g s sVar) {
            l0.p(sVar, "type");
            return new u(v.IN, sVar);
        }

        @g
        @m
        public final u b(@g s sVar) {
            l0.p(sVar, "type");
            return new u(v.OUT, sVar);
        }

        @g
        public final u c() {
            return u.f19547d;
        }

        @g
        @m
        public final u e(@g s sVar) {
            l0.p(sVar, "type");
            return new u(v.INVARIANT, sVar);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19550a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                hf.v[] r0 = hf.v.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                hf.v r1 = hf.v.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                hf.v r1 = hf.v.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                hf.v r1 = hf.v.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f19550a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hf.u.b.<clinit>():void");
        }
    }

    public u(@h v vVar, @h s sVar) {
        String str;
        this.f19548a = vVar;
        this.f19549b = sVar;
        if (!((vVar == null) != (sVar == null) ? false : true)) {
            if (vVar == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + vVar + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @g
    @m
    public static final u c(@g s sVar) {
        return f19546c.a(sVar);
    }

    public static /* synthetic */ u e(u uVar, v vVar, s sVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vVar = uVar.f19548a;
        }
        if ((i10 & 2) != 0) {
            sVar = uVar.f19549b;
        }
        return uVar.d(vVar, sVar);
    }

    @g
    @m
    public static final u f(@g s sVar) {
        return f19546c.b(sVar);
    }

    @g
    @m
    public static final u i(@g s sVar) {
        return f19546c.e(sVar);
    }

    @h
    public final v a() {
        return this.f19548a;
    }

    @h
    public final s b() {
        return this.f19549b;
    }

    @g
    public final u d(@h v vVar, @h s sVar) {
        return new u(vVar, sVar);
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f19548a == uVar.f19548a && l0.g(this.f19549b, uVar.f19549b);
    }

    @h
    public final s g() {
        return this.f19549b;
    }

    @h
    public final v h() {
        return this.f19548a;
    }

    public int hashCode() {
        v vVar = this.f19548a;
        int i10 = 0;
        int hashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        s sVar = this.f19549b;
        if (sVar != null) {
            i10 = sVar.hashCode();
        }
        return hashCode + i10;
    }

    @g
    public String toString() {
        String str;
        StringBuilder sb2;
        v vVar = this.f19548a;
        int i10 = vVar == null ? -1 : b.f19550a[vVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f19549b);
        }
        if (i10 == 2) {
            sb2 = new StringBuilder();
            str = "in ";
        } else if (i10 == 3) {
            sb2 = new StringBuilder();
            str = "out ";
        } else {
            throw new j0();
        }
        sb2.append(str);
        sb2.append(this.f19549b);
        return sb2.toString();
    }
}
