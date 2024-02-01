package q4;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import d.m0;
import d.o0;
import r4.f;
import t4.k;

public class l extends e<Bitmap> {
    public final RemoteViews R;
    public final Context S;
    public final int T;
    public final String U;
    public final Notification V;
    public final int W;

    public l(Context context, int i10, int i11, int i12, RemoteViews remoteViews, Notification notification, int i13, String str) {
        super(i10, i11);
        this.S = (Context) k.e(context, "Context must not be null!");
        this.V = (Notification) k.e(notification, "Notification object can not be null!");
        this.R = (RemoteViews) k.e(remoteViews, "RemoteViews object can not be null!");
        this.W = i12;
        this.T = i13;
        this.U = str;
    }

    public l(Context context, int i10, RemoteViews remoteViews, Notification notification, int i11) {
        this(context, i10, remoteViews, notification, i11, (String) null);
    }

    public l(Context context, int i10, RemoteViews remoteViews, Notification notification, int i11, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, notification, i11, str);
    }

    /* renamed from: c */
    public void s(@m0 Bitmap bitmap, @o0 f<? super Bitmap> fVar) {
        d(bitmap);
    }

    public final void d(@o0 Bitmap bitmap) {
        this.R.setImageViewBitmap(this.W, bitmap);
        g();
    }

    public final void g() {
        ((NotificationManager) k.d((NotificationManager) this.S.getSystemService("notification"))).notify(this.U, this.T, this.V);
    }

    public void r(@o0 Drawable drawable) {
        d((Bitmap) null);
    }
}
