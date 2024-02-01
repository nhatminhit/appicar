package y3;

import d.m0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import t4.h;
import v3.f;
import v3.i;
import v3.m;
import z3.b;

public final class x implements f {

    /* renamed from: k  reason: collision with root package name */
    public static final h<Class<?>, byte[]> f15455k = new h<>(50);

    /* renamed from: c  reason: collision with root package name */
    public final b f15456c;

    /* renamed from: d  reason: collision with root package name */
    public final f f15457d;

    /* renamed from: e  reason: collision with root package name */
    public final f f15458e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15459f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15460g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f15461h;

    /* renamed from: i  reason: collision with root package name */
    public final i f15462i;

    /* renamed from: j  reason: collision with root package name */
    public final m<?> f15463j;

    public x(b bVar, f fVar, f fVar2, int i10, int i11, m<?> mVar, Class<?> cls, i iVar) {
        this.f15456c = bVar;
        this.f15457d = fVar;
        this.f15458e = fVar2;
        this.f15459f = i10;
        this.f15460g = i11;
        this.f15463j = mVar;
        this.f15461h = cls;
        this.f15462i = iVar;
    }

    public void a(@m0 MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f15456c.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f15459f).putInt(this.f15460g).array();
        this.f15458e.a(messageDigest);
        this.f15457d.a(messageDigest);
        messageDigest.update(bArr);
        m<?> mVar = this.f15463j;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.f15462i.a(messageDigest);
        messageDigest.update(c());
        this.f15456c.put(bArr);
    }

    public final byte[] c() {
        h<Class<?>, byte[]> hVar = f15455k;
        byte[] k10 = hVar.k(this.f15461h);
        if (k10 != null) {
            return k10;
        }
        byte[] bytes = this.f15461h.getName().getBytes(f.f14159b);
        hVar.o(this.f15461h, bytes);
        return bytes;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f15460g == xVar.f15460g && this.f15459f == xVar.f15459f && t4.m.d(this.f15463j, xVar.f15463j) && this.f15461h.equals(xVar.f15461h) && this.f15457d.equals(xVar.f15457d) && this.f15458e.equals(xVar.f15458e) && this.f15462i.equals(xVar.f15462i);
    }

    public int hashCode() {
        int hashCode = (((((this.f15457d.hashCode() * 31) + this.f15458e.hashCode()) * 31) + this.f15459f) * 31) + this.f15460g;
        m<?> mVar = this.f15463j;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return (((hashCode * 31) + this.f15461h.hashCode()) * 31) + this.f15462i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f15457d + ", signature=" + this.f15458e + ", width=" + this.f15459f + ", height=" + this.f15460g + ", decodedResourceClass=" + this.f15461h + ", transformation='" + this.f15463j + '\'' + ", options=" + this.f15462i + '}';
    }
}
