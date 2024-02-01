package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.exoplayer2.ui.d;
import d.a1;
import d.o0;
import d.u;
import h0.u0;

public final class b {
    @a1

    /* renamed from: c  reason: collision with root package name */
    public static final int f5532c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5533a;

    /* renamed from: b  reason: collision with root package name */
    public final u0.g f5534b;

    public b(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f5533a = applicationContext;
        this.f5534b = new u0.g(applicationContext, str);
    }

    public Notification a(@u int i10, @o0 PendingIntent pendingIntent, @o0 String str) {
        return c(i10, pendingIntent, str, d.h.exo_download_completed);
    }

    public Notification b(@u int i10, @o0 PendingIntent pendingIntent, @o0 String str) {
        return c(i10, pendingIntent, str, d.h.exo_download_failed);
    }

    public final Notification c(@u int i10, @o0 PendingIntent pendingIntent, @o0 String str, @a1 int i11) {
        return d(i10, pendingIntent, str, i11, 0, 0, false, false, true);
    }

    public final Notification d(@u int i10, @o0 PendingIntent pendingIntent, @o0 String str, @a1 int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        this.f5534b.r0(i10);
        u0.e eVar = null;
        this.f5534b.O(i11 == 0 ? null : this.f5533a.getResources().getString(i11));
        this.f5534b.M(pendingIntent);
        u0.g gVar = this.f5534b;
        if (str != null) {
            eVar = new u0.e().A(str);
        }
        gVar.x0(eVar);
        this.f5534b.j0(i12, i13, z10);
        this.f5534b.g0(z11);
        this.f5534b.p0(z12);
        return this.f5534b.h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification e(@d.u int r20, @d.o0 android.app.PendingIntent r21, @d.o0 java.lang.String r22, java.util.List<z6.d> r23) {
        /*
            r19 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r7 = r0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r8 = r6
        L_0x0009:
            int r9 = r23.size()
            if (r3 >= r9) goto L_0x0045
            r9 = r23
            java.lang.Object r10 = r9.get(r3)
            z6.d r10 = (z6.d) r10
            int r11 = r10.f15945b
            r12 = 5
            if (r11 != r12) goto L_0x001e
            r5 = r0
            goto L_0x0042
        L_0x001e:
            r12 = 7
            if (r11 == r12) goto L_0x0025
            r12 = 2
            if (r11 == r12) goto L_0x0025
            goto L_0x0042
        L_0x0025:
            float r4 = r10.b()
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0031
            float r2 = r2 + r4
            r7 = r1
        L_0x0031:
            long r10 = r10.a()
            r12 = 0
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x003d
            r4 = r0
            goto L_0x003e
        L_0x003d:
            r4 = r1
        L_0x003e:
            r8 = r8 | r4
            int r6 = r6 + 1
            r4 = r0
        L_0x0042:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0045:
            if (r4 == 0) goto L_0x004b
            int r3 = com.google.android.exoplayer2.ui.d.h.exo_download_downloading
        L_0x0049:
            r13 = r3
            goto L_0x0051
        L_0x004b:
            if (r5 == 0) goto L_0x0050
            int r3 = com.google.android.exoplayer2.ui.d.h.exo_download_removing
            goto L_0x0049
        L_0x0050:
            r13 = r1
        L_0x0051:
            if (r4 == 0) goto L_0x0060
            float r3 = (float) r6
            float r2 = r2 / r3
            int r2 = (int) r2
            if (r7 == 0) goto L_0x005b
            if (r8 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            r16 = r0
            r15 = r2
            goto L_0x0063
        L_0x0060:
            r16 = r0
            r15 = r1
        L_0x0063:
            r14 = 100
            r17 = 1
            r18 = 0
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            android.app.Notification r0 = r9.d(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.b.e(int, android.app.PendingIntent, java.lang.String, java.util.List):android.app.Notification");
    }
}
