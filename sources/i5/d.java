package i5;

import a6.t;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;
import k5.i;
import q5.h;
import s5.l;
import v4.n;
import v4.u;

public interface d extends t {
    public static final u.b A = u.b.d();

    /* renamed from: z  reason: collision with root package name */
    public static final n.d f9044z = new n.d();

    public static class a implements d {
        public y a() {
            return y.V;
        }

        public void b(l lVar, e0 e0Var) throws l {
        }

        public x d() {
            return x.Y;
        }

        public j e() {
            return z5.n.l0();
        }

        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return null;
        }

        public String getName() {
            return "";
        }

        public h i() {
            return null;
        }

        public boolean j() {
            return false;
        }

        @Deprecated
        public n.d k(b bVar) {
            return n.d.c();
        }

        public <A extends Annotation> A l(Class<A> cls) {
            return null;
        }

        public boolean m() {
            return false;
        }

        public u.b n(i<?> iVar, Class<?> cls) {
            return null;
        }

        public y o() {
            return null;
        }

        public List<y> p(i<?> iVar) {
            return Collections.emptyList();
        }

        public n.d q(i<?> iVar, Class<?> cls) {
            return n.d.c();
        }
    }

    public static class b implements d, Serializable {
        public static final long T = 1;
        public final y O;
        public final j P;
        public final y Q;
        public final x R;
        public final h S;

        public b(b bVar, j jVar) {
            this(bVar.O, jVar, bVar.Q, bVar.S, bVar.R);
        }

        @Deprecated
        public b(y yVar, j jVar, y yVar2, a6.b bVar, h hVar, x xVar) {
            this(yVar, jVar, yVar2, hVar, xVar);
        }

        public b(y yVar, j jVar, y yVar2, h hVar, x xVar) {
            this.O = yVar;
            this.P = jVar;
            this.Q = yVar2;
            this.R = xVar;
            this.S = hVar;
        }

        public y a() {
            return this.O;
        }

        public void b(l lVar, e0 e0Var) {
            throw new UnsupportedOperationException("Instances of " + getClass().getName() + " should not get visited");
        }

        public b c(j jVar) {
            return new b(this, jVar);
        }

        public x d() {
            return this.R;
        }

        public j e() {
            return this.P;
        }

        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            h hVar = this.S;
            if (hVar == null) {
                return null;
            }
            return hVar.d(cls);
        }

        public String getName() {
            return this.O.d();
        }

        public h i() {
            return this.S;
        }

        public boolean j() {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r2 = r2.x(r0);
         */
        @java.lang.Deprecated
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public v4.n.d k(i5.b r2) {
            /*
                r1 = this;
                q5.h r0 = r1.S
                if (r0 == 0) goto L_0x000d
                if (r2 == 0) goto L_0x000d
                v4.n$d r2 = r2.x(r0)
                if (r2 == 0) goto L_0x000d
                return r2
            L_0x000d:
                v4.n$d r2 = i5.d.f9044z
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.d.b.k(i5.b):v4.n$d");
        }

        public <A extends Annotation> A l(Class<A> cls) {
            return null;
        }

        public boolean m() {
            return this.R.l();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
            r2 = r2.V((r0 = r1.S));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public v4.u.b n(k5.i<?> r2, java.lang.Class<?> r3) {
            /*
                r1 = this;
                i5.j r0 = r1.P
                java.lang.Class r0 = r0.g()
                v4.u$b r3 = r2.s(r3, r0)
                i5.b r2 = r2.m()
                if (r2 == 0) goto L_0x0021
                q5.h r0 = r1.S
                if (r0 != 0) goto L_0x0015
                goto L_0x0021
            L_0x0015:
                v4.u$b r2 = r2.V(r0)
                if (r2 != 0) goto L_0x001c
                return r3
            L_0x001c:
                v4.u$b r2 = r3.o(r2)
                return r2
            L_0x0021:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.d.b.n(k5.i, java.lang.Class):v4.u$b");
        }

        public y o() {
            return this.Q;
        }

        public List<y> p(i<?> iVar) {
            return Collections.emptyList();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r2 = r2.x((r0 = r1.S));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public v4.n.d q(k5.i<?> r2, java.lang.Class<?> r3) {
            /*
                r1 = this;
                v4.n$d r3 = r2.w(r3)
                i5.b r2 = r2.m()
                if (r2 == 0) goto L_0x001b
                q5.h r0 = r1.S
                if (r0 != 0) goto L_0x000f
                goto L_0x001b
            L_0x000f:
                v4.n$d r2 = r2.x(r0)
                if (r2 != 0) goto L_0x0016
                return r3
            L_0x0016:
                v4.n$d r2 = r3.A(r2)
                return r2
            L_0x001b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.d.b.q(k5.i, java.lang.Class):v4.n$d");
        }
    }

    y a();

    void b(l lVar, e0 e0Var) throws l;

    x d();

    j e();

    <A extends Annotation> A getAnnotation(Class<A> cls);

    String getName();

    h i();

    boolean j();

    @Deprecated
    n.d k(b bVar);

    <A extends Annotation> A l(Class<A> cls);

    boolean m();

    u.b n(i<?> iVar, Class<?> cls);

    y o();

    List<y> p(i<?> iVar);

    n.d q(i<?> iVar, Class<?> cls);
}
