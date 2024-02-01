package b7;

import b6.x0;
import b7.y;
import d.o0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import t7.b;
import t7.r0;

public final class k0 extends h<Integer> {

    /* renamed from: d0  reason: collision with root package name */
    public static final int f4546d0 = -1;
    public final y[] W;
    public final x0[] X;
    public final ArrayList<y> Y;
    public final j Z;

    /* renamed from: a0  reason: collision with root package name */
    public Object f4547a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f4548b0;

    /* renamed from: c0  reason: collision with root package name */
    public a f4549c0;

    public static final class a extends IOException {
        public static final int P = 0;
        public final int O;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: b7.k0$a$a  reason: collision with other inner class name */
        public @interface C0069a {
        }

        public a(int i10) {
            this.O = i10;
        }
    }

    public k0(j jVar, y... yVarArr) {
        this.W = yVarArr;
        this.Z = jVar;
        this.Y = new ArrayList<>(Arrays.asList(yVarArr));
        this.f4548b0 = -1;
        this.X = new x0[yVarArr.length];
    }

    public k0(y... yVarArr) {
        this(new m(), yVarArr);
    }

    @o0
    /* renamed from: A */
    public y.a s(Integer num, y.a aVar) {
        if (num.intValue() == 0) {
            return aVar;
        }
        return null;
    }

    /* renamed from: B */
    public void w(Integer num, y yVar, x0 x0Var, @o0 Object obj) {
        if (this.f4549c0 == null) {
            this.f4549c0 = z(x0Var);
        }
        if (this.f4549c0 == null) {
            this.Y.remove(yVar);
            this.X[num.intValue()] = x0Var;
            if (yVar == this.W[0]) {
                this.f4547a0 = obj;
            }
            if (this.Y.isEmpty()) {
                p(this.X[0], this.f4547a0);
            }
        }
    }

    public w c(y.a aVar, b bVar, long j10) {
        int length = this.W.length;
        w[] wVarArr = new w[length];
        int b10 = this.X[0].b(aVar.f4733a);
        for (int i10 = 0; i10 < length; i10++) {
            wVarArr[i10] = this.W[i10].c(aVar.a(this.X[i10].m(b10)), bVar, j10);
        }
        return new j0(this.Z, wVarArr);
    }

    @o0
    public Object g() {
        y[] yVarArr = this.W;
        if (yVarArr.length > 0) {
            return yVarArr[0].g();
        }
        return null;
    }

    public void h() throws IOException {
        a aVar = this.f4549c0;
        if (aVar == null) {
            super.h();
            return;
        }
        throw aVar;
    }

    public void i(w wVar) {
        j0 j0Var = (j0) wVar;
        int i10 = 0;
        while (true) {
            y[] yVarArr = this.W;
            if (i10 < yVarArr.length) {
                yVarArr[i10].i(j0Var.O[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public void o(@o0 r0 r0Var) {
        super.o(r0Var);
        for (int i10 = 0; i10 < this.W.length; i10++) {
            x(Integer.valueOf(i10), this.W[i10]);
        }
    }

    public void q() {
        super.q();
        Arrays.fill(this.X, (Object) null);
        this.f4547a0 = null;
        this.f4548b0 = -1;
        this.f4549c0 = null;
        this.Y.clear();
        Collections.addAll(this.Y, this.W);
    }

    public final a z(x0 x0Var) {
        int i10 = this.f4548b0;
        int i11 = x0Var.i();
        if (i10 == -1) {
            this.f4548b0 = i11;
            return null;
        } else if (i11 != this.f4548b0) {
            return new a(0);
        } else {
            return null;
        }
    }
}
