package x5;

import i5.e0;
import i5.j;
import i5.l;
import i5.o;
import java.util.Arrays;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15095a;

    public static final class a extends k {

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f15096b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<?> f15097c;

        /* renamed from: d  reason: collision with root package name */
        public final o<Object> f15098d;

        /* renamed from: e  reason: collision with root package name */
        public final o<Object> f15099e;

        public a(k kVar, Class<?> cls, o<Object> oVar, Class<?> cls2, o<Object> oVar2) {
            super(kVar);
            this.f15096b = cls;
            this.f15098d = oVar;
            this.f15097c = cls2;
            this.f15099e = oVar2;
        }

        public k m(Class<?> cls, o<Object> oVar) {
            return new c(this, new f[]{new f(this.f15096b, this.f15098d), new f(this.f15097c, this.f15099e), new f(cls, oVar)});
        }

        public o<Object> n(Class<?> cls) {
            if (cls == this.f15096b) {
                return this.f15098d;
            }
            if (cls == this.f15097c) {
                return this.f15099e;
            }
            return null;
        }
    }

    public static final class b extends k {

        /* renamed from: b  reason: collision with root package name */
        public static final b f15100b = new b(false);

        /* renamed from: c  reason: collision with root package name */
        public static final b f15101c = new b(true);

        public b(boolean z10) {
            super(z10);
        }

        public k m(Class<?> cls, o<Object> oVar) {
            return new e(this, cls, oVar);
        }

        public o<Object> n(Class<?> cls) {
            return null;
        }
    }

    public static final class c extends k {

        /* renamed from: c  reason: collision with root package name */
        public static final int f15102c = 8;

        /* renamed from: b  reason: collision with root package name */
        public final f[] f15103b;

        public c(k kVar, f[] fVarArr) {
            super(kVar);
            this.f15103b = fVarArr;
        }

        public k m(Class<?> cls, o<Object> oVar) {
            f[] fVarArr = this.f15103b;
            int length = fVarArr.length;
            if (length == 8) {
                return this.f15095a ? new e(this, cls, oVar) : this;
            }
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, length + 1);
            fVarArr2[length] = new f(cls, oVar);
            return new c(this, fVarArr2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
            r1 = r0[6];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
            if (r1.f15108a != r4) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
            return r1.f15109b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            r1 = r0[5];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
            if (r1.f15108a != r4) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
            return r1.f15109b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
            r1 = r0[4];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
            if (r1.f15108a != r4) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
            return r1.f15109b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
            r0 = r0[3];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
            if (r0.f15108a != r4) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
            return r0.f15109b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public i5.o<java.lang.Object> n(java.lang.Class<?> r4) {
            /*
                r3 = this;
                x5.k$f[] r0 = r3.f15103b
                r1 = 0
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f15108a
                if (r2 != r4) goto L_0x000c
                i5.o<java.lang.Object> r4 = r1.f15109b
                return r4
            L_0x000c:
                r1 = 1
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f15108a
                if (r2 != r4) goto L_0x0016
                i5.o<java.lang.Object> r4 = r1.f15109b
                return r4
            L_0x0016:
                r1 = 2
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f15108a
                if (r2 != r4) goto L_0x0020
                i5.o<java.lang.Object> r4 = r1.f15109b
                return r4
            L_0x0020:
                int r1 = r0.length
                switch(r1) {
                    case 4: goto L_0x004d;
                    case 5: goto L_0x0043;
                    case 6: goto L_0x0039;
                    case 7: goto L_0x002f;
                    case 8: goto L_0x0025;
                    default: goto L_0x0024;
                }
            L_0x0024:
                goto L_0x0057
            L_0x0025:
                r1 = 7
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f15108a
                if (r2 != r4) goto L_0x002f
                i5.o<java.lang.Object> r4 = r1.f15109b
                return r4
            L_0x002f:
                r1 = 6
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f15108a
                if (r2 != r4) goto L_0x0039
                i5.o<java.lang.Object> r4 = r1.f15109b
                return r4
            L_0x0039:
                r1 = 5
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f15108a
                if (r2 != r4) goto L_0x0043
                i5.o<java.lang.Object> r4 = r1.f15109b
                return r4
            L_0x0043:
                r1 = 4
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f15108a
                if (r2 != r4) goto L_0x004d
                i5.o<java.lang.Object> r4 = r1.f15109b
                return r4
            L_0x004d:
                r1 = 3
                r0 = r0[r1]
                java.lang.Class<?> r1 = r0.f15108a
                if (r1 != r4) goto L_0x0057
                i5.o<java.lang.Object> r4 = r0.f15109b
                return r4
            L_0x0057:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: x5.k.c.n(java.lang.Class):i5.o");
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final o<Object> f15104a;

        /* renamed from: b  reason: collision with root package name */
        public final k f15105b;

        public d(o<Object> oVar, k kVar) {
            this.f15104a = oVar;
            this.f15105b = kVar;
        }
    }

    public static final class e extends k {

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f15106b;

        /* renamed from: c  reason: collision with root package name */
        public final o<Object> f15107c;

        public e(k kVar, Class<?> cls, o<Object> oVar) {
            super(kVar);
            this.f15106b = cls;
            this.f15107c = oVar;
        }

        public k m(Class<?> cls, o<Object> oVar) {
            return new a(this, this.f15106b, this.f15107c, cls, oVar);
        }

        public o<Object> n(Class<?> cls) {
            if (cls == this.f15106b) {
                return this.f15107c;
            }
            return null;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f15108a;

        /* renamed from: b  reason: collision with root package name */
        public final o<Object> f15109b;

        public f(Class<?> cls, o<Object> oVar) {
            this.f15108a = cls;
            this.f15109b = oVar;
        }
    }

    public k(k kVar) {
        this.f15095a = kVar.f15095a;
    }

    public k(boolean z10) {
        this.f15095a = z10;
    }

    public static k c() {
        return b.f15100b;
    }

    public static k d() {
        return b.f15101c;
    }

    @Deprecated
    public static k e() {
        return c();
    }

    public final d a(j jVar, o<Object> oVar) {
        return new d(oVar, m(jVar.g(), oVar));
    }

    public final d b(Class<?> cls, o<Object> oVar) {
        return new d(oVar, m(cls, oVar));
    }

    public final d f(Class<?> cls, e0 e0Var, i5.d dVar) throws l {
        o<Object> W = e0Var.W(cls, dVar);
        return new d(W, m(cls, W));
    }

    public final d g(j jVar, e0 e0Var, i5.d dVar) throws l {
        o<Object> a02 = e0Var.a0(jVar, dVar);
        return new d(a02, m(jVar.g(), a02));
    }

    public final d h(Class<?> cls, e0 e0Var, i5.d dVar) throws l {
        o<Object> b02 = e0Var.b0(cls, dVar);
        return new d(b02, m(cls, b02));
    }

    public final d i(j jVar, e0 e0Var) throws l {
        o<Object> d02 = e0Var.d0(jVar, false, (i5.d) null);
        return new d(d02, m(jVar.g(), d02));
    }

    public final d j(Class<?> cls, e0 e0Var) throws l {
        o<Object> e02 = e0Var.e0(cls, false, (i5.d) null);
        return new d(e02, m(cls, e02));
    }

    public final d k(j jVar, e0 e0Var, i5.d dVar) throws l {
        o<Object> T = e0Var.T(jVar, dVar);
        return new d(T, m(jVar.g(), T));
    }

    public final d l(Class<?> cls, e0 e0Var, i5.d dVar) throws l {
        o<Object> U = e0Var.U(cls, dVar);
        return new d(U, m(cls, U));
    }

    public abstract k m(Class<?> cls, o<Object> oVar);

    public abstract o<Object> n(Class<?> cls);
}
