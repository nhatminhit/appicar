package f8;

import com.google.android.gms.common.api.Status;
import d.m0;
import d.o0;

public class b extends Exception {
    @Deprecated
    @m0
    public final Status O;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(@d.m0 com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.f1()
            java.lang.String r1 = r4.g1()
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = r4.g1()
            goto L_0x0011
        L_0x000f:
            java.lang.String r1 = ""
        L_0x0011:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.O = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.b.<init>(com.google.android.gms.common.api.Status):void");
    }

    @m0
    public Status a() {
        return this.O;
    }

    public int b() {
        return this.O.f1();
    }

    @o0
    @Deprecated
    public String c() {
        return this.O.g1();
    }
}
