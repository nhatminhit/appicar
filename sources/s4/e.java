package s4;

import d.m0;
import java.security.MessageDigest;
import t4.k;
import v3.f;

public final class e implements f {

    /* renamed from: c  reason: collision with root package name */
    public final Object f12629c;

    public e(@m0 Object obj) {
        this.f12629c = k.d(obj);
    }

    public void a(@m0 MessageDigest messageDigest) {
        messageDigest.update(this.f12629c.toString().getBytes(f.f14159b));
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f12629c.equals(((e) obj).f12629c);
        }
        return false;
    }

    public int hashCode() {
        return this.f12629c.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f12629c + '}';
    }
}
