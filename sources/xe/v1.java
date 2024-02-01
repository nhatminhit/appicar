package xe;

import fh.g;
import fh.h;
import hf.s;
import hf.t;
import hf.v;
import java.util.List;
import zd.h1;

@h1(version = "1.4")
public final class v1 implements t {
    @g
    public static final a T = new a((w) null);
    @h
    public final Object O;
    @g
    public final String P;
    @g
    public final v Q;
    public final boolean R;
    @h
    public volatile List<? extends s> S;

    public static final class a {

        /* renamed from: xe.v1$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0488a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f24568a;

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
                    f24568a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: xe.v1.a.C0488a.<clinit>():void");
            }
        }

        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @g
        public final String a(@g t tVar) {
            String str;
            l0.p(tVar, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C0488a.f24568a[tVar.n().ordinal()];
            if (i10 != 2) {
                if (i10 == 3) {
                    str = "out ";
                }
                sb2.append(tVar.getName());
                String sb3 = sb2.toString();
                l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
            }
            str = "in ";
            sb2.append(str);
            sb2.append(tVar.getName());
            String sb32 = sb2.toString();
            l0.o(sb32, "StringBuilder().apply(builderAction).toString()");
            return sb32;
        }
    }

    public v1(@h Object obj, @g String str, @g v vVar, boolean z10) {
        l0.p(str, "name");
        l0.p(vVar, "variance");
        this.O = obj;
        this.P = str;
        this.Q = vVar;
        this.R = z10;
    }

    public static /* synthetic */ void a() {
    }

    public final void b(@g List<? extends s> list) {
        l0.p(list, "upperBounds");
        if (this.S == null) {
            this.S = list;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            return l0.g(this.O, v1Var.O) && l0.g(getName(), v1Var.getName());
        }
    }

    public boolean g() {
        return this.R;
    }

    @g
    public String getName() {
        return this.P;
    }

    @g
    public List<s> getUpperBounds() {
        List<? extends s> list = this.S;
        if (list != null) {
            return list;
        }
        List<? extends s> k10 = be.v.k(l1.o(Object.class));
        this.S = k10;
        return k10;
    }

    public int hashCode() {
        Object obj = this.O;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @g
    public v n() {
        return this.Q;
    }

    @g
    public String toString() {
        return T.a(this);
    }
}
