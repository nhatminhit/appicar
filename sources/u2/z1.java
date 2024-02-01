package u2;

import a3.e;
import java.util.ArrayList;
import java.util.List;

public final class z1 implements e {
    public List<Object> O = new ArrayList();

    public void B0(int i10, byte[] bArr) {
        f(i10, bArr);
    }

    public void F(int i10, String str) {
        f(i10, str);
    }

    public void R(int i10, double d10) {
        f(i10, Double.valueOf(d10));
    }

    public void a1(int i10) {
        f(i10, (Object) null);
    }

    public List<Object> c() {
        return this.O;
    }

    public void close() {
    }

    public final void f(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.O.size()) {
            for (int size = this.O.size(); size <= i11; size++) {
                this.O.add((Object) null);
            }
        }
        this.O.set(i11, obj);
    }

    public void q0(int i10, long j10) {
        f(i10, Long.valueOf(j10));
    }

    public void z1() {
        this.O.clear();
    }
}
