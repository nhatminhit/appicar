package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.location.zzb;
import f8.a;
import g8.m;
import h9.n;
import j8.s;

public final /* synthetic */ class r3 implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzb f5914a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PendingIntent f5915b;

    public /* synthetic */ r3(zzb zzb, PendingIntent pendingIntent) {
        this.f5914a = zzb;
        this.f5915b = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        zzb zzb = this.f5914a;
        PendingIntent pendingIntent = this.f5915b;
        a aVar = h.f5869n;
        g gVar = new g((n) obj2);
        s.m(zzb, "ActivityRecognitionRequest can't be null.");
        s.m(pendingIntent, "PendingIntent must be specified.");
        s.m(gVar, "ResultHolder not provided.");
        ((g3) ((y2) obj).M()).M(zzb, pendingIntent, new j(gVar));
    }
}
