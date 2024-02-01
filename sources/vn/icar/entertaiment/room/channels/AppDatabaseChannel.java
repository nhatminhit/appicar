package vn.icar.entertaiment.room.channels;

import android.content.Context;
import rj.a;
import rj.b;
import rj.c0;
import rj.d0;
import rj.e;
import rj.f;
import rj.g0;
import rj.h0;
import rj.i;
import rj.j;
import rj.m;
import rj.n;
import rj.q;
import rj.r;
import rj.u;
import rj.v;
import rj.y;
import rj.z;
import u2.k2;
import u2.m0;
import u2.n2;

@m0(entities = {y.class, e.class, a.class, i.class, c0.class, q.class, u.class, m.class, g0.class}, version = 2)
public abstract class AppDatabaseChannel extends n2 {

    /* renamed from: p  reason: collision with root package name */
    public static final String f23805p = "ChannelsList.db";

    /* renamed from: q  reason: collision with root package name */
    public static AppDatabaseChannel f23806q;

    public static synchronized AppDatabaseChannel M(Context context) {
        AppDatabaseChannel appDatabaseChannel;
        Class<AppDatabaseChannel> cls = AppDatabaseChannel.class;
        synchronized (cls) {
            if (f23806q == null) {
                f23806q = k2.a(context.getApplicationContext(), cls, f23805p).d().m().e();
            }
            appDatabaseChannel = f23806q;
        }
        return appDatabaseChannel;
    }

    public abstract b K();

    public abstract f L();

    public abstract j N();

    public abstract n O();

    public abstract r P();

    public abstract v Q();

    public abstract z R();

    public abstract d0 S();

    public abstract h0 T();
}
