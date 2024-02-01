package y5;

import a6.s;
import com.fasterxml.jackson.databind.ser.f;
import com.fasterxml.jackson.databind.ser.j;
import com.fasterxml.jackson.databind.ser.p;
import i5.b;
import i5.c0;
import i5.e0;
import i5.l;
import i5.m;
import i5.o;
import i5.y;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import q5.h;
import q5.z;
import s5.e;
import s5.g;
import t5.c;
import v4.l0;
import v4.m0;
import v4.n;
import v4.s;
import x5.i;
import x5.u;

public abstract class d extends m0<Object> implements j, p, e, c {
    public static final y Z = new y("#object-ref");

    /* renamed from: a0  reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.ser.d[] f15520a0 = new com.fasterxml.jackson.databind.ser.d[0];
    public final i5.j R;
    public final com.fasterxml.jackson.databind.ser.d[] S;
    public final com.fasterxml.jackson.databind.ser.d[] T;
    public final com.fasterxml.jackson.databind.ser.a U;
    public final Object V;
    public final h W;
    public final i X;
    public final n.c Y;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15521a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                v4.n$c[] r0 = v4.n.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15521a = r0
                v4.n$c r1 = v4.n.c.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15521a     // Catch:{ NoSuchFieldError -> 0x001d }
                v4.n$c r1 = v4.n.c.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15521a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v4.n$c r1 = v4.n.c.NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.d.a.<clinit>():void");
        }
    }

    public d(i5.j jVar, f fVar, com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.ser.d[] dVarArr2) {
        super(jVar);
        this.R = jVar;
        this.S = dVarArr;
        this.T = dVarArr2;
        n.c cVar = null;
        if (fVar == null) {
            this.W = null;
            this.U = null;
            this.V = null;
            this.X = null;
        } else {
            this.W = fVar.j();
            this.U = fVar.c();
            this.V = fVar.f();
            this.X = fVar.h();
            n.d l10 = fVar.d().l((n.d) null);
            if (l10 != null) {
                cVar = l10.m();
            }
        }
        this.Y = cVar;
    }

    public d(d dVar) {
        this(dVar, dVar.S, dVar.T);
    }

    public d(d dVar, s sVar) {
        this(dVar, T(dVar.S, sVar), T(dVar.T, sVar));
    }

    /* JADX WARNING: type inference failed for: r11v11, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(y5.d r10, java.util.Set<java.lang.String> r11) {
        /*
            r9 = this;
            java.lang.Class<T> r0 = r10.O
            r9.<init>(r0)
            i5.j r0 = r10.R
            r9.R = r0
            com.fasterxml.jackson.databind.ser.d[] r0 = r10.S
            com.fasterxml.jackson.databind.ser.d[] r1 = r10.T
            int r2 = r0.length
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r4 = 0
            if (r1 != 0) goto L_0x0018
            r5 = r4
            goto L_0x001d
        L_0x0018:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
        L_0x001d:
            r6 = 0
        L_0x001e:
            if (r6 >= r2) goto L_0x003c
            r7 = r0[r6]
            if (r11 == 0) goto L_0x002f
            java.lang.String r8 = r7.getName()
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r3.add(r7)
            if (r1 == 0) goto L_0x0039
            r7 = r1[r6]
            r5.add(r7)
        L_0x0039:
            int r6 = r6 + 1
            goto L_0x001e
        L_0x003c:
            int r11 = r3.size()
            com.fasterxml.jackson.databind.ser.d[] r11 = new com.fasterxml.jackson.databind.ser.d[r11]
            java.lang.Object[] r11 = r3.toArray(r11)
            com.fasterxml.jackson.databind.ser.d[] r11 = (com.fasterxml.jackson.databind.ser.d[]) r11
            r9.S = r11
            if (r5 != 0) goto L_0x004d
            goto L_0x005a
        L_0x004d:
            int r11 = r5.size()
            com.fasterxml.jackson.databind.ser.d[] r11 = new com.fasterxml.jackson.databind.ser.d[r11]
            java.lang.Object[] r11 = r5.toArray(r11)
            r4 = r11
            com.fasterxml.jackson.databind.ser.d[] r4 = (com.fasterxml.jackson.databind.ser.d[]) r4
        L_0x005a:
            r9.T = r4
            q5.h r11 = r10.W
            r9.W = r11
            com.fasterxml.jackson.databind.ser.a r11 = r10.U
            r9.U = r11
            x5.i r11 = r10.X
            r9.X = r11
            java.lang.Object r11 = r10.V
            r9.V = r11
            v4.n$c r10 = r10.Y
            r9.Y = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.d.<init>(y5.d, java.util.Set):void");
    }

    public d(d dVar, i iVar) {
        this(dVar, iVar, dVar.V);
    }

    public d(d dVar, i iVar, Object obj) {
        super(dVar.O);
        this.R = dVar.R;
        this.S = dVar.S;
        this.T = dVar.T;
        this.W = dVar.W;
        this.U = dVar.U;
        this.X = iVar;
        this.V = obj;
        this.Y = dVar.Y;
    }

    public d(d dVar, com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.ser.d[] dVarArr2) {
        super(dVar.O);
        this.R = dVar.R;
        this.S = dVarArr;
        this.T = dVarArr2;
        this.W = dVar.W;
        this.U = dVar.U;
        this.X = dVar.X;
        this.V = dVar.V;
        this.Y = dVar.Y;
    }

    @Deprecated
    public d(d dVar, String[] strArr) {
        this(dVar, (Set<String>) a6.c.a(strArr));
    }

    public static final com.fasterxml.jackson.databind.ser.d[] T(com.fasterxml.jackson.databind.ser.d[] dVarArr, s sVar) {
        if (dVarArr == null || dVarArr.length == 0 || sVar == null || sVar == s.O) {
            return dVarArr;
        }
        int length = dVarArr.length;
        com.fasterxml.jackson.databind.ser.d[] dVarArr2 = new com.fasterxml.jackson.databind.ser.d[length];
        for (int i10 = 0; i10 < length; i10++) {
            com.fasterxml.jackson.databind.ser.d dVar = dVarArr[i10];
            if (dVar != null) {
                dVarArr2[i10] = dVar.Q(sVar);
            }
        }
        return dVarArr2;
    }

    @Deprecated
    public final String M(Object obj) {
        Object r10 = this.W.r(obj);
        return r10 == null ? "" : r10 instanceof String ? (String) r10 : r10.toString();
    }

    public void N(Object obj, w4.i iVar, e0 e0Var, u5.i iVar2, u uVar) throws IOException {
        i iVar3 = this.X;
        g5.c Q = Q(iVar2, obj, w4.p.START_OBJECT);
        iVar2.o(iVar, Q);
        uVar.b(iVar, e0Var, iVar3);
        if (this.V != null) {
            V(obj, iVar, e0Var);
        } else {
            U(obj, iVar, e0Var);
        }
        iVar2.v(iVar, Q);
    }

    public final void O(Object obj, w4.i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        i iVar3 = this.X;
        u Z2 = e0Var.Z(obj, iVar3.f15092c);
        if (!Z2.c(iVar, e0Var, iVar3)) {
            Object a10 = Z2.a(obj);
            if (iVar3.f15094e) {
                iVar3.f15093d.m(a10, iVar, e0Var);
            } else {
                N(obj, iVar, e0Var, iVar2, Z2);
            }
        }
    }

    public final void P(Object obj, w4.i iVar, e0 e0Var, boolean z10) throws IOException {
        i iVar2 = this.X;
        u Z2 = e0Var.Z(obj, iVar2.f15092c);
        if (!Z2.c(iVar, e0Var, iVar2)) {
            Object a10 = Z2.a(obj);
            if (iVar2.f15094e) {
                iVar2.f15093d.m(a10, iVar, e0Var);
                return;
            }
            if (z10) {
                iVar.W2(obj);
            }
            Z2.b(iVar, e0Var, iVar2);
            if (this.V != null) {
                V(obj, iVar, e0Var);
            } else {
                U(obj, iVar, e0Var);
            }
            if (z10) {
                iVar.g2();
            }
        }
    }

    public final g5.c Q(u5.i iVar, Object obj, w4.p pVar) {
        h hVar = this.W;
        if (hVar == null) {
            return iVar.g(obj, pVar);
        }
        Object r10 = hVar.r(obj);
        if (r10 == null) {
            r10 = "";
        }
        return iVar.h(obj, pVar, r10);
    }

    public abstract d R();

    public o<Object> S(e0 e0Var, com.fasterxml.jackson.databind.ser.d dVar) throws l {
        h i10;
        Object d02;
        b o10 = e0Var.o();
        o<Object> oVar = null;
        if (o10 == null || (i10 = dVar.i()) == null || (d02 = o10.d0(i10)) == null) {
            return null;
        }
        a6.j<Object, Object> m10 = e0Var.m(dVar.i(), d02);
        i5.j c10 = m10.c(e0Var.u());
        if (!c10.X()) {
            oVar = e0Var.g0(c10, dVar);
        }
        return new h0(m10, c10, oVar);
    }

    public void U(Object obj, w4.i iVar, e0 e0Var) throws IOException {
        String str = "[anySetter]";
        com.fasterxml.jackson.databind.ser.d[] dVarArr = (this.T == null || e0Var.n() == null) ? this.S : this.T;
        try {
            for (com.fasterxml.jackson.databind.ser.d dVar : dVarArr) {
                if (dVar != null) {
                    dVar.h(obj, iVar, e0Var);
                }
            }
            com.fasterxml.jackson.databind.ser.a aVar = this.U;
            if (aVar != null) {
                aVar.c(obj, iVar, e0Var);
            }
        } catch (Exception e10) {
            if (0 != dVarArr.length) {
                str = dVarArr[0].getName();
            }
            L(e0Var, e10, obj, str);
        } catch (StackOverflowError e11) {
            l lVar = new l((Closeable) iVar, "Infinite recursion (StackOverflowError)", (Throwable) e11);
            if (0 != dVarArr.length) {
                str = dVarArr[0].getName();
            }
            lVar.t(new l.a(obj, str));
            throw lVar;
        }
    }

    public void V(Object obj, w4.i iVar, e0 e0Var) throws IOException, w4.h {
        String str = "[anySetter]";
        com.fasterxml.jackson.databind.ser.d[] dVarArr = (this.T == null || e0Var.n() == null) ? this.S : this.T;
        com.fasterxml.jackson.databind.ser.n B = B(e0Var, this.V, obj);
        if (B == null) {
            U(obj, iVar, e0Var);
            return;
        }
        try {
            for (com.fasterxml.jackson.databind.ser.d dVar : dVarArr) {
                if (dVar != null) {
                    B.b(obj, iVar, e0Var, dVar);
                }
            }
            com.fasterxml.jackson.databind.ser.a aVar = this.U;
            if (aVar != null) {
                aVar.b(obj, iVar, e0Var, B);
            }
        } catch (Exception e10) {
            if (0 != dVarArr.length) {
                str = dVarArr[0].getName();
            }
            L(e0Var, e10, obj, str);
        } catch (StackOverflowError e11) {
            l lVar = new l((Closeable) iVar, "Infinite recursion (StackOverflowError)", (Throwable) e11);
            if (0 != dVarArr.length) {
                str = dVarArr[0].getName();
            }
            lVar.t(new l.a(obj, str));
            throw lVar;
        }
    }

    /* renamed from: W */
    public abstract d q(Object obj);

    public abstract d X(Set<String> set);

    @Deprecated
    public d Y(String[] strArr) {
        return X(a6.c.a(strArr));
    }

    public abstract d Z(i iVar);

    @Deprecated
    public m a(e0 e0Var, Type type) throws l {
        String id2;
        com.fasterxml.jackson.databind.node.u u10 = u("object", true);
        t5.b bVar = (t5.b) this.O.getAnnotation(t5.b.class);
        if (!(bVar == null || (id2 = bVar.id()) == null || id2.length() <= 0)) {
            u10.T1("id", id2);
        }
        com.fasterxml.jackson.databind.node.u A = u10.A();
        Object obj = this.V;
        com.fasterxml.jackson.databind.ser.n nVar = null;
        if (obj != null) {
            nVar = B(e0Var, obj, (Object) null);
        }
        int i10 = 0;
        while (true) {
            com.fasterxml.jackson.databind.ser.d[] dVarArr = this.S;
            if (i10 < dVarArr.length) {
                com.fasterxml.jackson.databind.ser.d dVar = dVarArr[i10];
                if (nVar == null) {
                    dVar.c(A, e0Var);
                } else {
                    nVar.a(dVar, A, e0Var);
                }
                i10++;
            } else {
                u10.n2("properties", A);
                return u10;
            }
        }
    }

    public d a0(com.fasterxml.jackson.databind.ser.d[] dVarArr, com.fasterxml.jackson.databind.ser.d[] dVarArr2) {
        return this;
    }

    public void b(e0 e0Var) throws l {
        com.fasterxml.jackson.databind.ser.d dVar;
        u5.i iVar;
        o<Object> Y2;
        com.fasterxml.jackson.databind.ser.d dVar2;
        com.fasterxml.jackson.databind.ser.d[] dVarArr = this.T;
        int length = dVarArr == null ? 0 : dVarArr.length;
        int length2 = this.S.length;
        for (int i10 = 0; i10 < length2; i10++) {
            com.fasterxml.jackson.databind.ser.d dVar3 = this.S[i10];
            if (!dVar3.U() && !dVar3.L() && (Y2 = e0Var.Y(dVar3)) != null) {
                dVar3.x(Y2);
                if (i10 < length && (dVar2 = this.T[i10]) != null) {
                    dVar2.x(Y2);
                }
            }
            if (!dVar3.M()) {
                o<Object> S2 = S(e0Var, dVar3);
                if (S2 == null) {
                    i5.j G = dVar3.G();
                    if (G == null) {
                        G = dVar3.e();
                        if (!G.q()) {
                            if (G.o() || G.b() > 0) {
                                dVar3.S(G);
                            }
                        }
                    }
                    o<Object> g02 = e0Var.g0(G, dVar3);
                    S2 = (!G.o() || (iVar = (u5.i) G.d().R()) == null || !(g02 instanceof com.fasterxml.jackson.databind.ser.i)) ? g02 : ((com.fasterxml.jackson.databind.ser.i) g02).R(iVar);
                }
                if (i10 >= length || (dVar = this.T[i10]) == null) {
                    dVar3.y(S2);
                } else {
                    dVar.y(S2);
                }
            }
        }
        com.fasterxml.jackson.databind.ser.a aVar = this.U;
        if (aVar != null) {
            aVar.d(e0Var);
        }
    }

    public o<?> d(e0 e0Var, i5.d dVar) throws l {
        n.c cVar;
        com.fasterxml.jackson.databind.ser.d[] dVarArr;
        int i10;
        Set<String> set;
        Object obj;
        d dVar2;
        i c10;
        Object obj2;
        com.fasterxml.jackson.databind.ser.d dVar3;
        z K;
        e0 e0Var2 = e0Var;
        i5.d dVar4 = dVar;
        b o10 = e0Var.o();
        h i11 = (dVar4 == null || o10 == null) ? null : dVar.i();
        c0 j02 = e0Var.q();
        n.d z10 = z(e0Var2, dVar4, this.O);
        int i12 = 2;
        if (z10 == null || !z10.r()) {
            cVar = null;
        } else {
            cVar = z10.m();
            if (!(cVar == n.c.ANY || cVar == this.Y)) {
                if (this.R.p()) {
                    int i13 = a.f15521a[cVar.ordinal()];
                    if (i13 == 1 || i13 == 2 || i13 == 3) {
                        return e0Var2.r0(m.O(this.R.g(), e0Var.q(), j02.O(this.R), z10), dVar4);
                    }
                } else if (cVar == n.c.NATURAL && ((!this.R.t() || !Map.class.isAssignableFrom(this.O)) && Map.Entry.class.isAssignableFrom(this.O))) {
                    i5.j C = this.R.C(Map.Entry.class);
                    return e0Var2.r0(new x5.h(this.R, C.B(0), C.B(1), false, (u5.i) null, dVar), dVar4);
                }
            }
        }
        i iVar = this.X;
        if (i11 != null) {
            s.a U2 = o10.U(i11);
            set = U2 != null ? U2.i() : null;
            z J = o10.J(i11);
            if (J == null) {
                if (!(iVar == null || (K = o10.K(i11, (z) null)) == null)) {
                    iVar = this.X.b(K.b());
                }
                dVarArr = null;
            } else {
                z K2 = o10.K(i11, J);
                Class<? extends l0<?>> c11 = K2.c();
                i5.j jVar = e0Var.u().e0(e0Var2.l(c11), l0.class)[0];
                if (c11 == m0.d.class) {
                    String d10 = K2.d().d();
                    int length = this.S.length;
                    i10 = 0;
                    while (true) {
                        if (i10 == length) {
                            i5.j jVar2 = this.R;
                            Object[] objArr = new Object[i12];
                            objArr[0] = g().getName();
                            objArr[1] = d10;
                            e0Var2.z(jVar2, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", objArr));
                        }
                        dVar3 = this.S[i10];
                        if (d10.equals(dVar3.getName())) {
                            break;
                        }
                        i10++;
                        i12 = 2;
                    }
                    dVarArr = null;
                    iVar = i.a(dVar3.e(), (y) null, new x5.j(K2, dVar3), K2.b());
                    obj = o10.w(i11);
                    if (obj == null || ((obj2 = this.V) != null && obj.equals(obj2))) {
                        obj = dVarArr;
                    }
                } else {
                    dVarArr = null;
                    iVar = i.a(jVar, K2.d(), e0Var2.x(i11, K2), K2.b());
                }
            }
            i10 = 0;
            obj = o10.w(i11);
            obj = dVarArr;
        } else {
            dVarArr = null;
            i10 = 0;
            obj = null;
            set = null;
        }
        if (i10 > 0) {
            com.fasterxml.jackson.databind.ser.d[] dVarArr2 = this.S;
            com.fasterxml.jackson.databind.ser.d[] dVarArr3 = (com.fasterxml.jackson.databind.ser.d[]) Arrays.copyOf(dVarArr2, dVarArr2.length);
            com.fasterxml.jackson.databind.ser.d dVar5 = dVarArr3[i10];
            System.arraycopy(dVarArr3, 0, dVarArr3, 1, i10);
            dVarArr3[0] = dVar5;
            com.fasterxml.jackson.databind.ser.d[] dVarArr4 = this.T;
            if (dVarArr4 != null) {
                com.fasterxml.jackson.databind.ser.d[] dVarArr5 = (com.fasterxml.jackson.databind.ser.d[]) Arrays.copyOf(dVarArr4, dVarArr4.length);
                com.fasterxml.jackson.databind.ser.d dVar6 = dVarArr5[i10];
                System.arraycopy(dVarArr5, 0, dVarArr5, 1, i10);
                dVarArr5[0] = dVar6;
                dVarArr = dVarArr5;
            }
            dVar2 = a0(dVarArr3, dVarArr);
        } else {
            dVar2 = this;
        }
        if (!(iVar == null || (c10 = iVar.c(e0Var2.g0(iVar.f15090a, dVar4))) == this.X)) {
            dVar2 = dVar2.Z(c10);
        }
        if (set != null && !set.isEmpty()) {
            dVar2 = dVar2.X(set);
        }
        if (obj != null) {
            dVar2 = dVar2.q(obj);
        }
        if (cVar == null) {
            cVar = this.Y;
        }
        return cVar == n.c.ARRAY ? dVar2.R() : dVar2;
    }

    public void e(g gVar, i5.j jVar) throws l {
        s5.l k10;
        if (gVar != null && (k10 = gVar.k(jVar)) != null) {
            e0 c10 = gVar.c();
            int i10 = 0;
            Class<?> cls = null;
            if (this.V != null) {
                com.fasterxml.jackson.databind.ser.n B = B(gVar.c(), this.V, (Object) null);
                int length = this.S.length;
                while (i10 < length) {
                    B.f(this.S[i10], k10, c10);
                    i10++;
                }
                return;
            }
            if (!(this.T == null || c10 == null)) {
                cls = c10.n();
            }
            com.fasterxml.jackson.databind.ser.d[] dVarArr = cls != null ? this.T : this.S;
            int length2 = dVarArr.length;
            while (i10 < length2) {
                com.fasterxml.jackson.databind.ser.d dVar = dVarArr[i10];
                if (dVar != null) {
                    dVar.b(k10, c10);
                }
                i10++;
            }
        }
    }

    public Iterator<com.fasterxml.jackson.databind.ser.o> k() {
        return Arrays.asList(this.S).iterator();
    }

    public abstract void m(Object obj, w4.i iVar, e0 e0Var) throws IOException;

    public void n(Object obj, w4.i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        i iVar3 = this.X;
        iVar.A1(obj);
        if (iVar3 != null) {
            O(obj, iVar, e0Var, iVar2);
            return;
        }
        g5.c Q = Q(iVar2, obj, w4.p.START_OBJECT);
        iVar2.o(iVar, Q);
        if (this.V != null) {
            V(obj, iVar, e0Var);
        } else {
            U(obj, iVar, e0Var);
        }
        iVar2.v(iVar, Q);
    }

    public boolean p() {
        return this.X != null;
    }
}
