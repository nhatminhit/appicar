package y3;

import d.m0;
import java.security.MessageDigest;
import v3.f;

public final class d implements f {

    /* renamed from: c  reason: collision with root package name */
    public final f f15332c;

    /* renamed from: d  reason: collision with root package name */
    public final f f15333d;

    public d(f fVar, f fVar2) {
        this.f15332c = fVar;
        this.f15333d = fVar2;
    }

    public void a(@m0 MessageDigest messageDigest) {
        this.f15332c.a(messageDigest);
        this.f15333d.a(messageDigest);
    }

    public f c() {
        return this.f15332c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f15332c.equals(dVar.f15332c) && this.f15333d.equals(dVar.f15333d);
    }

    public int hashCode() {
        return (this.f15332c.hashCode() * 31) + this.f15333d.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f15332c + ", signature=" + this.f15333d + '}';
    }
}
