package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import d.m0;
import d.t0;
import d.x0;
import e1.n;
import k3.h;

public final class RemoteActionCompat implements h {
    @x0({x0.a.P})

    /* renamed from: a  reason: collision with root package name */
    public IconCompat f2191a;
    @x0({x0.a.P})

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f2192b;
    @x0({x0.a.P})

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f2193c;
    @x0({x0.a.P})

    /* renamed from: d  reason: collision with root package name */
    public PendingIntent f2194d;
    @x0({x0.a.P})

    /* renamed from: e  reason: collision with root package name */
    public boolean f2195e;
    @x0({x0.a.P})

    /* renamed from: f  reason: collision with root package name */
    public boolean f2196f;

    @x0({x0.a.P})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@m0 RemoteActionCompat remoteActionCompat) {
        n.g(remoteActionCompat);
        this.f2191a = remoteActionCompat.f2191a;
        this.f2192b = remoteActionCompat.f2192b;
        this.f2193c = remoteActionCompat.f2193c;
        this.f2194d = remoteActionCompat.f2194d;
        this.f2195e = remoteActionCompat.f2195e;
        this.f2196f = remoteActionCompat.f2196f;
    }

    public RemoteActionCompat(@m0 IconCompat iconCompat, @m0 CharSequence charSequence, @m0 CharSequence charSequence2, @m0 PendingIntent pendingIntent) {
        this.f2191a = (IconCompat) n.g(iconCompat);
        this.f2192b = (CharSequence) n.g(charSequence);
        this.f2193c = (CharSequence) n.g(charSequence2);
        this.f2194d = (PendingIntent) n.g(pendingIntent);
        this.f2195e = true;
        this.f2196f = true;
    }

    @t0(26)
    @m0
    public static RemoteActionCompat b(@m0 RemoteAction remoteAction) {
        n.g(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.o(remoteAction.getIcon()), remoteAction.getTitle(), remoteAction.getContentDescription(), remoteAction.getActionIntent());
        remoteActionCompat.o(remoteAction.isEnabled());
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.p(remoteAction.shouldShowIcon());
        }
        return remoteActionCompat;
    }

    @m0
    public PendingIntent c() {
        return this.f2194d;
    }

    @m0
    public CharSequence d() {
        return this.f2193c;
    }

    @m0
    public IconCompat e() {
        return this.f2191a;
    }

    @m0
    public CharSequence m() {
        return this.f2192b;
    }

    public boolean n() {
        return this.f2195e;
    }

    public void o(boolean z10) {
        this.f2195e = z10;
    }

    public void p(boolean z10) {
        this.f2196f = z10;
    }

    public boolean q() {
        return this.f2196f;
    }

    @t0(26)
    @m0
    public RemoteAction r() {
        RemoteAction remoteAction = new RemoteAction(this.f2191a.Q(), this.f2192b, this.f2193c, this.f2194d);
        remoteAction.setEnabled(n());
        if (Build.VERSION.SDK_INT >= 28) {
            remoteAction.setShouldShowIcon(q());
        }
        return remoteAction;
    }
}
