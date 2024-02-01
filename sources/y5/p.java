package y5;

import com.fasterxml.jackson.databind.ser.j;
import g5.c;
import i5.e0;
import java.io.IOException;
import java.net.InetAddress;
import w4.i;

public class p extends l0<InetAddress> implements j {
    public final boolean R;

    public p() {
        this(false);
    }

    public p(boolean z10) {
        super(InetAddress.class);
        this.R = z10;
    }

    /* renamed from: M */
    public void m(InetAddress inetAddress, i iVar, e0 e0Var) throws IOException {
        String str;
        if (this.R) {
            str = inetAddress.getHostAddress();
        } else {
            str = inetAddress.toString().trim();
            int indexOf = str.indexOf(47);
            if (indexOf >= 0) {
                str = indexOf == 0 ? str.substring(1) : str.substring(0, indexOf);
            }
        }
        iVar.Z2(str);
    }

    /* renamed from: N */
    public void n(InetAddress inetAddress, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c o10 = iVar2.o(iVar, iVar2.f(inetAddress, InetAddress.class, w4.p.VALUE_STRING));
        m(inetAddress, iVar, e0Var);
        iVar2.v(iVar, o10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5.o<?> d(i5.e0 r2, i5.d r3) throws i5.l {
        /*
            r1 = this;
            java.lang.Class r0 = r1.g()
            v4.n$d r2 = r1.z(r2, r3, r0)
            if (r2 == 0) goto L_0x001a
            v4.n$c r2 = r2.m()
            boolean r3 = r2.a()
            if (r3 != 0) goto L_0x0018
            v4.n$c r3 = v4.n.c.ARRAY
            if (r2 != r3) goto L_0x001a
        L_0x0018:
            r2 = 1
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            boolean r3 = r1.R
            if (r2 == r3) goto L_0x0025
            y5.p r3 = new y5.p
            r3.<init>(r2)
            return r3
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.p.d(i5.e0, i5.d):i5.o");
    }
}
