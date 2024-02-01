package b8;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import d.o0;
import w8.d0;

@e8.a
public class a {
    @d0

    /* renamed from: b  reason: collision with root package name */
    public static int f4738b = 31;

    /* renamed from: a  reason: collision with root package name */
    public int f4739a = 1;

    @e8.a
    @CanIgnoreReturnValue
    @m0
    public a a(@o0 Object obj) {
        this.f4739a = (f4738b * this.f4739a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    @e8.a
    public int b() {
        return this.f4739a;
    }

    @CanIgnoreReturnValue
    @m0
    public final a c(boolean z10) {
        this.f4739a = (f4738b * this.f4739a) + (z10 ? 1 : 0);
        return this;
    }
}
