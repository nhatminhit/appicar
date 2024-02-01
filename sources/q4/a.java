package q4;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import d.m0;
import d.o0;
import r4.f;
import t4.k;

public class a extends e<Bitmap> {
    public final int[] R;
    public final ComponentName S;
    public final RemoteViews T;
    public final Context U;
    public final int V;

    public a(Context context, int i10, int i11, int i12, RemoteViews remoteViews, ComponentName componentName) {
        super(i10, i11);
        this.U = (Context) k.e(context, "Context can not be null!");
        this.T = (RemoteViews) k.e(remoteViews, "RemoteViews object can not be null!");
        this.S = (ComponentName) k.e(componentName, "ComponentName can not be null!");
        this.V = i12;
        this.R = null;
    }

    public a(Context context, int i10, int i11, int i12, RemoteViews remoteViews, int... iArr) {
        super(i10, i11);
        if (iArr.length != 0) {
            this.U = (Context) k.e(context, "Context can not be null!");
            this.T = (RemoteViews) k.e(remoteViews, "RemoteViews object can not be null!");
            this.R = (int[]) k.e(iArr, "WidgetIds can not be null!");
            this.V = i12;
            this.S = null;
            return;
        }
        throw new IllegalArgumentException("WidgetIds must have length > 0");
    }

    public a(Context context, int i10, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, componentName);
    }

    public a(Context context, int i10, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, iArr);
    }

    /* renamed from: c */
    public void s(@m0 Bitmap bitmap, @o0 f<? super Bitmap> fVar) {
        d(bitmap);
    }

    public final void d(@o0 Bitmap bitmap) {
        this.T.setImageViewBitmap(this.V, bitmap);
        g();
    }

    public final void g() {
        AppWidgetManager instance = AppWidgetManager.getInstance(this.U);
        ComponentName componentName = this.S;
        if (componentName != null) {
            instance.updateAppWidget(componentName, this.T);
        } else {
            instance.updateAppWidget(this.R, this.T);
        }
    }

    public void r(@o0 Drawable drawable) {
        d((Bitmap) null);
    }
}
