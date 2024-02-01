package q5;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import q5.f0;
import v4.h;
import v4.p0;

public interface f0<T extends f0<T>> {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11962a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v4.p0[] r0 = v4.p0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11962a = r0
                v4.p0 r1 = v4.p0.GETTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11962a     // Catch:{ NoSuchFieldError -> 0x001d }
                v4.p0 r1 = v4.p0.SETTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11962a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v4.p0 r1 = v4.p0.CREATOR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11962a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v4.p0 r1 = v4.p0.FIELD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11962a     // Catch:{ NoSuchFieldError -> 0x003e }
                v4.p0 r1 = v4.p0.IS_GETTER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f11962a     // Catch:{ NoSuchFieldError -> 0x0049 }
                v4.p0 r1 = v4.p0.ALL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.f0.a.<clinit>():void");
        }
    }

    public static class b implements f0<b>, Serializable {
        public static final long T = 1;
        public static final b U;
        public final h.c O;
        public final h.c P;
        public final h.c Q;
        public final h.c R;
        public final h.c S;

        static {
            h.c cVar = h.c.PUBLIC_ONLY;
            h.c cVar2 = h.c.ANY;
            U = new b(cVar, cVar, cVar2, cVar2, cVar);
        }

        public b(h.c cVar) {
            if (cVar == h.c.DEFAULT) {
                b bVar = U;
                this.O = bVar.O;
                this.P = bVar.P;
                this.Q = bVar.Q;
                this.R = bVar.R;
                cVar = bVar.S;
            } else {
                this.O = cVar;
                this.P = cVar;
                this.Q = cVar;
                this.R = cVar;
            }
            this.S = cVar;
        }

        public b(h.c cVar, h.c cVar2, h.c cVar3, h.c cVar4, h.c cVar5) {
            this.O = cVar;
            this.P = cVar2;
            this.Q = cVar3;
            this.R = cVar4;
            this.S = cVar5;
        }

        public b(h hVar) {
            this.O = hVar.getterVisibility();
            this.P = hVar.isGetterVisibility();
            this.Q = hVar.setterVisibility();
            this.R = hVar.creatorVisibility();
            this.S = hVar.fieldVisibility();
        }

        public static b v(h.b bVar) {
            return U.o(bVar);
        }

        public static b w() {
            return U;
        }

        /* renamed from: A */
        public b f(h.c cVar) {
            if (cVar == h.c.DEFAULT) {
                cVar = U.S;
            }
            h.c cVar2 = cVar;
            return this.S == cVar2 ? this : new b(this.O, this.P, this.Q, this.R, cVar2);
        }

        /* renamed from: B */
        public b r(h.c cVar) {
            if (cVar == h.c.DEFAULT) {
                cVar = U.O;
            }
            h.c cVar2 = cVar;
            return this.O == cVar2 ? this : new b(cVar2, this.P, this.Q, this.R, this.S);
        }

        /* renamed from: C */
        public b s(h.c cVar) {
            if (cVar == h.c.DEFAULT) {
                cVar = U.P;
            }
            h.c cVar2 = cVar;
            return this.P == cVar2 ? this : new b(this.O, cVar2, this.Q, this.R, this.S);
        }

        /* renamed from: D */
        public b o(h.b bVar) {
            if (bVar == null) {
                return this;
            }
            return u(t(this.O, bVar.j()), t(this.P, bVar.k()), t(this.Q, bVar.l()), t(this.R, bVar.h()), t(this.S, bVar.i()));
        }

        /* renamed from: E */
        public b h(h.c cVar) {
            if (cVar == h.c.DEFAULT) {
                cVar = U.Q;
            }
            h.c cVar2 = cVar;
            return this.Q == cVar2 ? this : new b(this.O, this.P, cVar2, this.R, this.S);
        }

        /* renamed from: F */
        public b m(p0 p0Var, h.c cVar) {
            switch (a.f11962a[p0Var.ordinal()]) {
                case 1:
                    return r(cVar);
                case 2:
                    return h(cVar);
                case 3:
                    return q(cVar);
                case 4:
                    return f(cVar);
                case 5:
                    return s(cVar);
                case 6:
                    return n(cVar);
                default:
                    return this;
            }
        }

        public boolean a(i iVar) {
            return p(iVar.c());
        }

        public boolean b(Field field) {
            return this.S.a(field);
        }

        public boolean c(h hVar) {
            return d(hVar.p());
        }

        public boolean d(Member member) {
            return this.R.a(member);
        }

        public boolean e(i iVar) {
            return j(iVar.c());
        }

        public boolean g(i iVar) {
            return i(iVar.c());
        }

        public boolean i(Method method) {
            return this.O.a(method);
        }

        public boolean j(Method method) {
            return this.Q.a(method);
        }

        public boolean k(f fVar) {
            return b(fVar.c());
        }

        public boolean p(Method method) {
            return this.P.a(method);
        }

        public final h.c t(h.c cVar, h.c cVar2) {
            return cVar2 == h.c.DEFAULT ? cVar : cVar2;
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", new Object[]{this.O, this.P, this.Q, this.R, this.S});
        }

        public b u(h.c cVar, h.c cVar2, h.c cVar3, h.c cVar4, h.c cVar5) {
            return (cVar == this.O && cVar2 == this.P && cVar3 == this.Q && cVar4 == this.R && cVar5 == this.S) ? this : new b(cVar, cVar2, cVar3, cVar4, cVar5);
        }

        /* renamed from: x */
        public b n(h.c cVar) {
            return cVar == h.c.DEFAULT ? U : new b(cVar);
        }

        /* renamed from: y */
        public b l(h hVar) {
            if (hVar == null) {
                return this;
            }
            return u(t(this.O, hVar.getterVisibility()), t(this.P, hVar.isGetterVisibility()), t(this.Q, hVar.setterVisibility()), t(this.R, hVar.creatorVisibility()), t(this.S, hVar.fieldVisibility()));
        }

        /* renamed from: z */
        public b q(h.c cVar) {
            if (cVar == h.c.DEFAULT) {
                cVar = U.R;
            }
            h.c cVar2 = cVar;
            return this.R == cVar2 ? this : new b(this.O, this.P, this.Q, cVar2, this.S);
        }
    }

    boolean a(i iVar);

    boolean b(Field field);

    boolean c(h hVar);

    boolean d(Member member);

    boolean e(i iVar);

    T f(h.c cVar);

    boolean g(i iVar);

    T h(h.c cVar);

    boolean i(Method method);

    boolean j(Method method);

    boolean k(f fVar);

    T l(h hVar);

    T m(p0 p0Var, h.c cVar);

    T n(h.c cVar);

    T o(h.b bVar);

    boolean p(Method method);

    T q(h.c cVar);

    T r(h.c cVar);

    T s(h.c cVar);
}
