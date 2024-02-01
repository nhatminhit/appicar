package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import d.x0;
import k3.e;

@x0({x0.a.O})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(e eVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2191a = (IconCompat) eVar.h0(remoteActionCompat.f2191a, 1);
        remoteActionCompat.f2192b = eVar.w(remoteActionCompat.f2192b, 2);
        remoteActionCompat.f2193c = eVar.w(remoteActionCompat.f2193c, 3);
        remoteActionCompat.f2194d = (PendingIntent) eVar.W(remoteActionCompat.f2194d, 4);
        remoteActionCompat.f2195e = eVar.m(remoteActionCompat.f2195e, 5);
        remoteActionCompat.f2196f = eVar.m(remoteActionCompat.f2196f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, e eVar) {
        eVar.j0(false, false);
        eVar.m1(remoteActionCompat.f2191a, 1);
        eVar.z0(remoteActionCompat.f2192b, 2);
        eVar.z0(remoteActionCompat.f2193c, 3);
        eVar.X0(remoteActionCompat.f2194d, 4);
        eVar.n0(remoteActionCompat.f2195e, 5);
        eVar.n0(remoteActionCompat.f2196f, 6);
    }
}
