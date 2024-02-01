package i5;

import b5.c;
import b5.d;
import java.io.IOException;
import w4.f;

public class s extends f {

    /* renamed from: i0  reason: collision with root package name */
    public static final long f9116i0 = -1;

    public s() {
        this((u) null);
    }

    public s(u uVar) {
        super((w4.s) uVar);
        if (uVar == null) {
            J0(new u((f) this));
        }
    }

    public s(f fVar, u uVar) {
        super(fVar, (w4.s) uVar);
        if (uVar == null) {
            J0(new u((f) this));
        }
    }

    public d A0(c cVar) throws IOException {
        if (getClass() == s.class) {
            return B0(cVar);
        }
        return null;
    }

    /* renamed from: N0 */
    public final u w0() {
        return (u) this.U;
    }

    public f e0() {
        G(s.class);
        return new s(this, (u) null);
    }

    public String x() {
        return f.f14619c0;
    }
}
