package b6;

import d.o0;
import w7.a;

public final class v0 {

    /* renamed from: c  reason: collision with root package name */
    public static final v0 f4472c;

    /* renamed from: d  reason: collision with root package name */
    public static final v0 f4473d = new v0(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e  reason: collision with root package name */
    public static final v0 f4474e = new v0(Long.MAX_VALUE, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final v0 f4475f = new v0(0, Long.MAX_VALUE);

    /* renamed from: g  reason: collision with root package name */
    public static final v0 f4476g;

    /* renamed from: a  reason: collision with root package name */
    public final long f4477a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4478b;

    static {
        v0 v0Var = new v0(0, 0);
        f4472c = v0Var;
        f4476g = v0Var;
    }

    public v0(long j10, long j11) {
        boolean z10 = true;
        a.a(j10 >= 0);
        a.a(j11 < 0 ? false : z10);
        this.f4477a = j10;
        this.f4478b = j11;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f4477a == v0Var.f4477a && this.f4478b == v0Var.f4478b;
    }

    public int hashCode() {
        return (((int) this.f4477a) * 31) + ((int) this.f4478b);
    }
}
