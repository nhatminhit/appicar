package v4;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@a
public @interface h {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14167a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f14168b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0083 */
        static {
            /*
                v4.p0[] r0 = v4.p0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14168b = r0
                r1 = 1
                v4.p0 r2 = v4.p0.CREATOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f14168b     // Catch:{ NoSuchFieldError -> 0x001d }
                v4.p0 r3 = v4.p0.FIELD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f14168b     // Catch:{ NoSuchFieldError -> 0x0028 }
                v4.p0 r4 = v4.p0.GETTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f14168b     // Catch:{ NoSuchFieldError -> 0x0033 }
                v4.p0 r5 = v4.p0.IS_GETTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f14168b     // Catch:{ NoSuchFieldError -> 0x003e }
                v4.p0 r6 = v4.p0.T     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f14168b     // Catch:{ NoSuchFieldError -> 0x0049 }
                v4.p0 r6 = v4.p0.SETTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = f14168b     // Catch:{ NoSuchFieldError -> 0x0054 }
                v4.p0 r6 = v4.p0.ALL     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                v4.h$c[] r5 = v4.h.c.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f14167a = r5
                v4.h$c r6 = v4.h.c.ANY     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r1 = f14167a     // Catch:{ NoSuchFieldError -> 0x006f }
                v4.h$c r5 = v4.h.c.S     // Catch:{ NoSuchFieldError -> 0x006f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = f14167a     // Catch:{ NoSuchFieldError -> 0x0079 }
                v4.h$c r1 = v4.h.c.NON_PRIVATE     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = f14167a     // Catch:{ NoSuchFieldError -> 0x0083 }
                v4.h$c r1 = v4.h.c.PROTECTED_AND_PUBLIC     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f14167a     // Catch:{ NoSuchFieldError -> 0x008d }
                v4.h$c r1 = v4.h.c.PUBLIC_ONLY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v4.h.a.<clinit>():void");
        }
    }

    public static class b implements b<h>, Serializable {
        public static final long T = 1;
        public static final c U;
        public static final b V;
        public static final b W;
        public final c O;
        public final c P;
        public final c Q;
        public final c R;
        public final c S;

        static {
            c cVar = c.PUBLIC_ONLY;
            U = cVar;
            V = new b(cVar, cVar, cVar, c.ANY, cVar);
            c cVar2 = c.DEFAULT;
            W = new b(cVar2, cVar2, cVar2, cVar2, cVar2);
        }

        public b(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
            this.O = cVar;
            this.P = cVar2;
            this.Q = cVar3;
            this.R = cVar4;
            this.S = cVar5;
        }

        public static boolean b(b bVar, b bVar2) {
            return bVar.O == bVar2.O && bVar.P == bVar2.P && bVar.Q == bVar2.Q && bVar.R == bVar2.R && bVar.S == bVar2.S;
        }

        public static b c(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
            if (cVar == U) {
                b bVar = V;
                if (cVar2 == bVar.P && cVar3 == bVar.Q && cVar4 == bVar.R && cVar5 == bVar.S) {
                    return bVar;
                }
                return null;
            }
            c cVar6 = c.DEFAULT;
            if (cVar == cVar6 && cVar2 == cVar6 && cVar3 == cVar6 && cVar4 == cVar6 && cVar5 == cVar6) {
                return W;
            }
            return null;
        }

        public static b d(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
            b c10 = c(cVar, cVar2, cVar3, cVar4, cVar5);
            return c10 == null ? new b(cVar, cVar2, cVar3, cVar4, cVar5) : c10;
        }

        public static b e(p0 p0Var, c cVar) {
            c cVar2;
            c cVar3;
            c cVar4;
            c cVar5 = c.DEFAULT;
            int i10 = a.f14168b[p0Var.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    cVar2 = cVar5;
                    cVar4 = cVar2;
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        cVar2 = cVar;
                        cVar = cVar5;
                    } else if (i10 == 6) {
                        cVar4 = cVar;
                        cVar2 = cVar5;
                        cVar = cVar2;
                        cVar3 = cVar;
                    } else if (i10 != 7) {
                        cVar2 = cVar5;
                        cVar = cVar2;
                    } else {
                        cVar2 = cVar;
                        cVar5 = cVar2;
                        cVar4 = cVar5;
                    }
                    cVar4 = cVar;
                } else {
                    cVar2 = cVar5;
                    cVar4 = cVar2;
                    cVar3 = cVar4;
                    cVar5 = cVar;
                    cVar = cVar3;
                }
                cVar3 = cVar4;
            } else {
                cVar3 = cVar;
                cVar2 = cVar5;
                cVar = cVar2;
                cVar4 = cVar;
            }
            return d(cVar, cVar5, cVar2, cVar4, cVar3);
        }

        public static b f() {
            return V;
        }

        public static b g(h hVar) {
            return d(hVar.fieldVisibility(), hVar.getterVisibility(), hVar.isGetterVisibility(), hVar.setterVisibility(), hVar.creatorVisibility());
        }

        public static b m(b bVar, b bVar2) {
            return bVar == null ? bVar2 : bVar.t(bVar2);
        }

        public static b n() {
            return W;
        }

        public Class<h> a() {
            return h.class;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            return obj.getClass() == getClass() && b(this, (b) obj);
        }

        public c h() {
            return this.S;
        }

        public int hashCode() {
            return ((this.O.ordinal() + 1) ^ (((this.P.ordinal() * 3) - (this.Q.ordinal() * 7)) + (this.R.ordinal() * 11))) ^ (this.S.ordinal() * 13);
        }

        public c i() {
            return this.O;
        }

        public c j() {
            return this.P;
        }

        public c k() {
            return this.Q;
        }

        public c l() {
            return this.R;
        }

        public Object o() {
            b c10 = c(this.O, this.P, this.Q, this.R, this.S);
            return c10 == null ? this : c10;
        }

        public b p(c cVar) {
            return d(this.O, this.P, this.Q, this.R, cVar);
        }

        public b q(c cVar) {
            return d(cVar, this.P, this.Q, this.R, this.S);
        }

        public b r(c cVar) {
            return d(this.O, cVar, this.Q, this.R, this.S);
        }

        public b s(c cVar) {
            return d(this.O, this.P, cVar, this.R, this.S);
        }

        public b t(b bVar) {
            if (bVar == null || bVar == W || bVar == this || b(this, bVar)) {
                return this;
            }
            c cVar = bVar.O;
            c cVar2 = c.DEFAULT;
            if (cVar == cVar2) {
                cVar = this.O;
            }
            c cVar3 = bVar.P;
            if (cVar3 == cVar2) {
                cVar3 = this.P;
            }
            c cVar4 = bVar.Q;
            if (cVar4 == cVar2) {
                cVar4 = this.Q;
            }
            c cVar5 = bVar.R;
            if (cVar5 == cVar2) {
                cVar5 = this.R;
            }
            c cVar6 = bVar.S;
            if (cVar6 == cVar2) {
                cVar6 = this.S;
            }
            return d(cVar, cVar3, cVar4, cVar5, cVar6);
        }

        public String toString() {
            return String.format("JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)", new Object[]{this.O, this.P, this.Q, this.R, this.S});
        }

        public b u(c cVar) {
            return d(this.O, this.P, this.Q, cVar, this.S);
        }
    }

    public enum c {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        S,
        DEFAULT;

        public boolean a(Member member) {
            int i10 = a.f14167a[ordinal()];
            if (i10 == 1) {
                return true;
            }
            if (i10 == 3) {
                return !Modifier.isPrivate(member.getModifiers());
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    return false;
                }
            } else if (Modifier.isProtected(member.getModifiers())) {
                return true;
            }
            return Modifier.isPublic(member.getModifiers());
        }
    }

    c creatorVisibility() default c.DEFAULT;

    c fieldVisibility() default c.DEFAULT;

    c getterVisibility() default c.DEFAULT;

    c isGetterVisibility() default c.DEFAULT;

    c setterVisibility() default c.DEFAULT;
}
