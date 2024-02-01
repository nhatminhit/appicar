package h7;

import d.o0;
import g6.h;
import java.nio.ByteBuffer;

public abstract class c extends h<i, j, g> implements f {

    /* renamed from: n  reason: collision with root package name */
    public final String f8896n;

    public c(String str) {
        super(new i[2], new j[2]);
        this.f8896n = str;
        v(1024);
    }

    @o0
    /* renamed from: A */
    public final g k(i iVar, j jVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = iVar.Q;
            j jVar2 = jVar;
            jVar2.r(iVar.R, z(byteBuffer.array(), byteBuffer.limit(), z10), iVar.W);
            jVar.k(Integer.MIN_VALUE);
            return null;
        } catch (g e10) {
            return e10;
        }
    }

    /* renamed from: B */
    public final void s(j jVar) {
        super.s(jVar);
    }

    public void b(long j10) {
    }

    public final String getName() {
        return this.f8896n;
    }

    /* renamed from: w */
    public final i h() {
        return new i();
    }

    /* renamed from: x */
    public final j i() {
        return new d(this);
    }

    /* renamed from: y */
    public final g j(Throwable th2) {
        return new g("Unexpected decode error", th2);
    }

    public abstract e z(byte[] bArr, int i10, boolean z10) throws g;
}
