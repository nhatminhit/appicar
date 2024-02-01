package xe;

import be.e0;
import be.w;
import fh.g;
import fh.h;
import hf.d;
import hf.s;
import hf.u;
import java.lang.annotation.Annotation;
import java.util.List;
import we.l;
import zd.h1;
import zd.j0;

@h1(version = "1.4")
public final class w1 implements s {
    @g
    public static final a S = new a((w) null);
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 4;
    @g
    public final hf.g O;
    @g
    public final List<u> P;
    @h
    public final s Q;
    public final int R;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24569a;

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
                f24569a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xe.w1.b.<clinit>():void");
        }
    }

    public static final class c extends n0 implements l<u, CharSequence> {
        public final /* synthetic */ w1 P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(w1 w1Var) {
            super(1);
            this.P = w1Var;
        }

        @g
        /* renamed from: c */
        public final CharSequence A(@g u uVar) {
            l0.p(uVar, "it");
            return this.P.n(uVar);
        }
    }

    @h1(version = "1.6")
    public w1(@g hf.g gVar, @g List<u> list, @h s sVar, int i10) {
        l0.p(gVar, "classifier");
        l0.p(list, "arguments");
        this.O = gVar;
        this.P = list;
        this.Q = sVar;
        this.R = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public w1(@g hf.g gVar, @g List<u> list, boolean z10) {
        this(gVar, list, (s) null, z10 ? 1 : 0);
        l0.p(gVar, "classifier");
        l0.p(list, "arguments");
    }

    @h1(version = "1.6")
    public static /* synthetic */ void C() {
    }

    @h1(version = "1.6")
    public static /* synthetic */ void z() {
    }

    @h
    public final s A() {
        return this.Q;
    }

    @g
    public List<u> U() {
        return this.P;
    }

    @g
    public hf.g W() {
        return this.O;
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            return l0.g(W(), w1Var.W()) && l0.g(U(), w1Var.U()) && l0.g(this.Q, w1Var.Q) && this.R == w1Var.R;
        }
    }

    @g
    public List<Annotation> getAnnotations() {
        return w.E();
    }

    public int hashCode() {
        return (((W().hashCode() * 31) + U().hashCode()) * 31) + this.R;
    }

    public final String n(u uVar) {
        String str;
        StringBuilder sb2;
        String str2;
        if (uVar.h() == null) {
            return "*";
        }
        s g10 = uVar.g();
        w1 w1Var = g10 instanceof w1 ? (w1) g10 : null;
        if (w1Var == null || (str = w1Var.o(true)) == null) {
            str = String.valueOf(uVar.g());
        }
        int i10 = b.f24569a[uVar.h().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 == 2) {
            sb2 = new StringBuilder();
            str2 = "in ";
        } else if (i10 == 3) {
            sb2 = new StringBuilder();
            str2 = "out ";
        } else {
            throw new j0();
        }
        sb2.append(str2);
        sb2.append(str);
        return sb2.toString();
    }

    public final String o(boolean z10) {
        String str;
        hf.g W = W();
        Class cls = null;
        d dVar = W instanceof d ? (d) W : null;
        if (dVar != null) {
            cls = ve.a.d(dVar);
        }
        if (cls == null) {
            str = W().toString();
        } else if ((this.R & 4) != 0) {
            str = "kotlin.Nothing";
        } else if (cls.isArray()) {
            str = t(cls);
        } else if (!z10 || !cls.isPrimitive()) {
            str = cls.getName();
        } else {
            hf.g W2 = W();
            l0.n(W2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            str = ve.a.g((d) W2).getName();
        }
        String str2 = "";
        String h32 = U().isEmpty() ? str2 : e0.h3(U(), ", ", "<", ">", 0, (CharSequence) null, new c(this), 24, (Object) null);
        if (x()) {
            str2 = "?";
        }
        String str3 = str + h32 + str2;
        s sVar = this.Q;
        if (!(sVar instanceof w1)) {
            return str3;
        }
        String o10 = ((w1) sVar).o(true);
        if (l0.g(o10, str3)) {
            return str3;
        }
        if (l0.g(o10, str3 + '?')) {
            return str3 + '!';
        }
        return '(' + str3 + ".." + o10 + ')';
    }

    public final String t(Class<?> cls) {
        return l0.g(cls, boolean[].class) ? "kotlin.BooleanArray" : l0.g(cls, char[].class) ? "kotlin.CharArray" : l0.g(cls, byte[].class) ? "kotlin.ByteArray" : l0.g(cls, short[].class) ? "kotlin.ShortArray" : l0.g(cls, int[].class) ? "kotlin.IntArray" : l0.g(cls, float[].class) ? "kotlin.FloatArray" : l0.g(cls, long[].class) ? "kotlin.LongArray" : l0.g(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @g
    public String toString() {
        return o(false) + l1.f24529b;
    }

    public boolean x() {
        return (this.R & 1) != 0;
    }

    public final int y() {
        return this.R;
    }
}
