package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.location.ActivityTransitionRequest;
import f8.a;
import g8.m;
import h9.n;
import j8.s;

public final /* synthetic */ class b implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ActivityTransitionRequest f5851a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PendingIntent f5852b;

    public /* synthetic */ b(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        this.f5851a = activityTransitionRequest;
        this.f5852b = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        ActivityTransitionRequest activityTransitionRequest = this.f5851a;
        PendingIntent pendingIntent = this.f5852b;
        a aVar = h.f5869n;
        g gVar = new g((n) obj2);
        s.m(activityTransitionRequest, "activityTransitionRequest must be specified.");
        s.m(pendingIntent, "PendingIntent must be specified.");
        s.m(gVar, "ResultHolder not provided.");
        ((g3) ((y2) obj).M()).m1(activityTransitionRequest, pendingIntent, new j(gVar));
    }
}
