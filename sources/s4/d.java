package s4;

import d.m0;
import d.o0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import v3.f;

public class d implements f {
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final String f12626c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12627d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12628e;

    public d(@o0 String str, long j10, int i10) {
        this.f12626c = str == null ? "" : str;
        this.f12627d = j10;
        this.f12628e = i10;
    }

    public void a(@m0 MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f12627d).putInt(this.f12628e).array());
        messageDigest.update(this.f12626c.getBytes(f.f14159b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12627d == dVar.f12627d && this.f12628e == dVar.f12628e && this.f12626c.equals(dVar.f12626c);
    }

    public int hashCode() {
        long j10 = this.f12627d;
        return (((this.f12626c.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f12628e;
    }
}
