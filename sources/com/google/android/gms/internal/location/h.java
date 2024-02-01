package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzb;
import d9.c;
import d9.p0;
import d9.v;
import f8.a;
import f8.j;
import g8.q;
import h9.m;
import j8.s;

public final class h extends j implements c {

    /* renamed from: m  reason: collision with root package name */
    public static final a.g f5868m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f5869n;

    static {
        a.g gVar = new a.g();
        f5868m = gVar;
        f5869n = new a("ActivityRecognition.API", new e(), gVar);
    }

    public h(Activity activity) {
        super(activity, f5869n, a.d.f7423w, j.a.f7467c);
    }

    public h(Context context) {
        super(context, f5869n, a.d.f7423w, j.a.f7467c);
    }

    public final m<Void> e(PendingIntent pendingIntent) {
        return U(q.a().c(new q3(pendingIntent)).f(2402).a());
    }

    public final m<Void> f(PendingIntent pendingIntent) {
        return U(q.a().c(new c(pendingIntent)).f(2411).a());
    }

    public final m<Void> h(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        activityTransitionRequest.Z0(X());
        return U(q.a().c(new b(activityTransitionRequest, pendingIntent)).f(2405).a());
    }

    public final m<Void> r(PendingIntent pendingIntent) {
        return U(q.a().c(new p3(pendingIntent)).f(2406).a());
    }

    public final m<Void> s(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        s.m(pendingIntent, "PendingIntent must be specified.");
        return O(q.a().c(new d(this, pendingIntent, sleepSegmentRequest)).e(p0.f6707b).f(2410).a());
    }

    public final m<Void> u(long j10, PendingIntent pendingIntent) {
        v vVar = new v();
        vVar.a(j10);
        zzb b10 = vVar.b();
        b10.X0(X());
        return U(q.a().c(new r3(b10, pendingIntent)).f(2401).a());
    }
}
