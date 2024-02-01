package j6;

import d.o0;

public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final r f9615c = new r(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f9616a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9617b;

    public r(long j10, long j11) {
        this.f9616a = j10;
        this.f9617b = j11;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f9616a == rVar.f9616a && this.f9617b == rVar.f9617b;
    }

    public int hashCode() {
        return (((int) this.f9616a) * 31) + ((int) this.f9617b);
    }

    public String toString() {
        return "[timeUs=" + this.f9616a + ", position=" + this.f9617b + "]";
    }
}
