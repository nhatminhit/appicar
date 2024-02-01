package g8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.d;
import f8.b;
import h9.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final Map f8280a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final Map f8281b = Collections.synchronizedMap(new WeakHashMap());

    public final void c(BasePendingResult basePendingResult, boolean z10) {
        this.f8280a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.c(new t(this, basePendingResult));
    }

    public final void d(n nVar, boolean z10) {
        this.f8281b.put(nVar, Boolean.valueOf(z10));
        nVar.a().e(new u(this, nVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(int r4, @d.o0 java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L_0x0010
            java.lang.String r4 = " due to service disconnection."
        L_0x000c:
            r0.append(r4)
            goto L_0x0016
        L_0x0010:
            r2 = 3
            if (r4 != r2) goto L_0x0016
            java.lang.String r4 = " due to dead object exception."
            goto L_0x000c
        L_0x0016:
            if (r5 == 0) goto L_0x0020
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L_0x0020:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r5 = 20
            java.lang.String r0 = r0.toString()
            r4.<init>((int) r5, (java.lang.String) r0)
            r3.h(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.v.e(int, java.lang.String):void");
    }

    public final void f() {
        h(false, d.f5653f0);
    }

    public final boolean g() {
        return !this.f8280a.isEmpty() || !this.f8281b.isEmpty();
    }

    public final void h(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f8280a) {
            hashMap = new HashMap(this.f8280a);
        }
        synchronized (this.f8281b) {
            hashMap2 = new HashMap(this.f8281b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).l(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((n) entry2.getKey()).d(new b(status));
            }
        }
    }
}
