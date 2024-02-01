package y3;

import d.m0;
import java.security.MessageDigest;
import java.util.Map;
import t4.k;
import v3.f;
import v3.i;
import v3.m;

public class n implements f {

    /* renamed from: c  reason: collision with root package name */
    public final Object f15440c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15441d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15442e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f15443f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f15444g;

    /* renamed from: h  reason: collision with root package name */
    public final f f15445h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<Class<?>, m<?>> f15446i;

    /* renamed from: j  reason: collision with root package name */
    public final i f15447j;

    /* renamed from: k  reason: collision with root package name */
    public int f15448k;

    public n(Object obj, f fVar, int i10, int i11, Map<Class<?>, m<?>> map, Class<?> cls, Class<?> cls2, i iVar) {
        this.f15440c = k.d(obj);
        this.f15445h = (f) k.e(fVar, "Signature must not be null");
        this.f15441d = i10;
        this.f15442e = i11;
        this.f15446i = (Map) k.d(map);
        this.f15443f = (Class) k.e(cls, "Resource class must not be null");
        this.f15444g = (Class) k.e(cls2, "Transcode class must not be null");
        this.f15447j = (i) k.d(iVar);
    }

    public void a(@m0 MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f15440c.equals(nVar.f15440c) && this.f15445h.equals(nVar.f15445h) && this.f15442e == nVar.f15442e && this.f15441d == nVar.f15441d && this.f15446i.equals(nVar.f15446i) && this.f15443f.equals(nVar.f15443f) && this.f15444g.equals(nVar.f15444g) && this.f15447j.equals(nVar.f15447j);
    }

    public int hashCode() {
        if (this.f15448k == 0) {
            int hashCode = this.f15440c.hashCode();
            this.f15448k = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f15445h.hashCode()) * 31) + this.f15441d) * 31) + this.f15442e;
            this.f15448k = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f15446i.hashCode();
            this.f15448k = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f15443f.hashCode();
            this.f15448k = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f15444g.hashCode();
            this.f15448k = hashCode5;
            this.f15448k = (hashCode5 * 31) + this.f15447j.hashCode();
        }
        return this.f15448k;
    }

    public String toString() {
        return "EngineKey{model=" + this.f15440c + ", width=" + this.f15441d + ", height=" + this.f15442e + ", resourceClass=" + this.f15443f + ", transcodeClass=" + this.f15444g + ", signature=" + this.f15445h + ", hashCode=" + this.f15448k + ", transformations=" + this.f15446i + ", options=" + this.f15447j + '}';
    }
}
