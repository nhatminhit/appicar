package ec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fh.g;
import xe.l0;
import zd.u2;

public final class a extends BroadcastReceiver {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final we.a<u2> f18585a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final we.a<u2> f18586b;

    public a(@g we.a<u2> aVar, @g we.a<u2> aVar2) {
        l0.p(aVar, "onNetworkAvailable");
        l0.p(aVar2, "onNetworkUnavailable");
        this.f18585a = aVar;
        this.f18586b = aVar2;
    }

    public void onReceive(@g Context context, @g Intent intent) {
        l0.p(context, "context");
        l0.p(intent, "intent");
        (f.a(context) ? this.f18585a : this.f18586b).n();
    }
}
