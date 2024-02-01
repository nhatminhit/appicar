package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.j;
import f8.a;
import g8.m;
import h9.n;
import j8.s;

public final /* synthetic */ class p3 implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PendingIntent f5904a;

    public /* synthetic */ p3(PendingIntent pendingIntent) {
        this.f5904a = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        PendingIntent pendingIntent = this.f5904a;
        a aVar = h.f5869n;
        g gVar = new g((n) obj2);
        s.m(gVar, "ResultHolder not provided.");
        ((g3) ((y2) obj).M()).H0(pendingIntent, new j(gVar));
    }
}
