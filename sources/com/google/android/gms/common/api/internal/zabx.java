package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import d.o0;
import g8.f1;

public final class zabx extends BroadcastReceiver {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public Context f5740a;

    /* renamed from: b  reason: collision with root package name */
    public final f1 f5741b;

    public zabx(f1 f1Var) {
        this.f5741b = f1Var;
    }

    public final void a(Context context) {
        this.f5740a = context;
    }

    public final synchronized void b() {
        Context context = this.f5740a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f5740a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f5741b.a();
            b();
        }
    }
}
