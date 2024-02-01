package x5;

import a6.b;
import com.fasterxml.jackson.databind.ser.t;
import i5.e0;
import i5.j;
import i5.o;
import q5.s;
import u5.i;
import v4.u;

public class a extends t {

    /* renamed from: n0  reason: collision with root package name */
    public static final long f15076n0 = 1;

    /* renamed from: m0  reason: collision with root package name */
    public final String f15077m0;

    public a(String str, s sVar, b bVar, j jVar) {
        this(str, sVar, bVar, jVar, sVar.t());
    }

    public a(String str, s sVar, b bVar, j jVar, u.b bVar2) {
        super(sVar, bVar, jVar, (o<?>) null, (i) null, (j) null, bVar2, (Class<?>[]) null);
        this.f15077m0 = str;
    }

    public a(a aVar) {
        super(aVar);
        this.f15077m0 = aVar.f15077m0;
    }

    public static a a0(String str, s sVar, b bVar, j jVar) {
        return new a(str, sVar, bVar, jVar);
    }

    public Object Y(Object obj, w4.i iVar, e0 e0Var) throws Exception {
        return e0Var.p(this.f15077m0);
    }

    public t Z(k5.i<?> iVar, q5.b bVar, s sVar, j jVar) {
        throw new IllegalStateException("Should not be called on this type");
    }
}
