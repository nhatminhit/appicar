package d8;

import com.google.android.gms.internal.common.h;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.o0;
import j8.s;
import java.util.List;

public final class x0 {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public String f6662a = null;

    /* renamed from: b  reason: collision with root package name */
    public long f6663b = -1;

    /* renamed from: c  reason: collision with root package name */
    public h f6664c = h.p();

    /* renamed from: d  reason: collision with root package name */
    public h f6665d = h.p();

    @CanIgnoreReturnValue
    public final x0 a(long j10) {
        this.f6663b = j10;
        return this;
    }

    @CanIgnoreReturnValue
    public final x0 b(List list) {
        s.l(list);
        this.f6665d = h.o(list);
        return this;
    }

    @CanIgnoreReturnValue
    public final x0 c(List list) {
        s.l(list);
        this.f6664c = h.o(list);
        return this;
    }

    @CanIgnoreReturnValue
    public final x0 d(String str) {
        this.f6662a = str;
        return this;
    }

    public final y e() {
        if (this.f6662a == null) {
            throw new IllegalStateException("packageName must be defined");
        } else if (this.f6663b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        } else if (!this.f6664c.isEmpty() || !this.f6665d.isEmpty()) {
            return new y(this.f6662a, this.f6663b, this.f6664c, this.f6665d, (x) null);
        } else {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
    }
}
