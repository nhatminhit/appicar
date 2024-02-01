package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.location.SleepSegmentRequest;
import g8.m;
import h9.n;

public final /* synthetic */ class d implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f5858a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PendingIntent f5859b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SleepSegmentRequest f5860c;

    public /* synthetic */ d(h hVar, PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        this.f5858a = hVar;
        this.f5859b = pendingIntent;
        this.f5860c = sleepSegmentRequest;
    }

    public final void accept(Object obj, Object obj2) {
        h hVar = this.f5858a;
        ((g3) ((y2) obj).M()).o0(this.f5859b, this.f5860c, new f(hVar, (n) obj2));
    }
}
