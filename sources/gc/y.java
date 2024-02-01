package gc;

import android.app.Notification;
import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import gc.v;

public abstract class y extends a<c> {

    /* renamed from: m  reason: collision with root package name */
    public final RemoteViews f19153m;

    /* renamed from: n  reason: collision with root package name */
    public final int f19154n;

    /* renamed from: o  reason: collision with root package name */
    public c f19155o;

    public static class a extends y {

        /* renamed from: p  reason: collision with root package name */
        public final int[] f19156p;

        public a(v vVar, z zVar, RemoteViews remoteViews, int i10, int[] iArr, int i11, int i12, String str, Object obj, int i13) {
            super(vVar, zVar, remoteViews, i10, i13, i11, i12, obj, str);
            this.f19156p = iArr;
        }

        public /* bridge */ /* synthetic */ Object k() {
            return y.super.k();
        }

        public void p() {
            AppWidgetManager.getInstance(this.f18945a.f19122e).updateAppWidget(this.f19156p, this.f19153m);
        }
    }

    public static class b extends y {

        /* renamed from: p  reason: collision with root package name */
        public final int f19157p;

        /* renamed from: q  reason: collision with root package name */
        public final Notification f19158q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(v vVar, z zVar, RemoteViews remoteViews, int i10, int i11, Notification notification, int i12, int i13, String str, Object obj, int i14) {
            super(vVar, zVar, remoteViews, i10, i14, i12, i13, obj, str);
            this.f19157p = i11;
            this.f19158q = notification;
        }

        public /* bridge */ /* synthetic */ Object k() {
            return y.super.k();
        }

        public void p() {
            ((NotificationManager) j0.q(this.f18945a.f19122e, "notification")).notify(this.f19157p, this.f19158q);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final RemoteViews f19159a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19160b;

        public c(RemoteViews remoteViews, int i10) {
            this.f19159a = remoteViews;
            this.f19160b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f19160b == cVar.f19160b && this.f19159a.equals(cVar.f19159a);
        }

        public int hashCode() {
            return (this.f19159a.hashCode() * 31) + this.f19160b;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(v vVar, z zVar, RemoteViews remoteViews, int i10, int i11, int i12, int i13, Object obj, String str) {
        super(vVar, null, zVar, i12, i13, i11, (Drawable) null, str, obj, false);
        this.f19153m = remoteViews;
        this.f19154n = i10;
    }

    public void b(Bitmap bitmap, v.e eVar) {
        this.f19153m.setImageViewBitmap(this.f19154n, bitmap);
        p();
    }

    public void c() {
        int i10 = this.f18951g;
        if (i10 != 0) {
            o(i10);
        }
    }

    /* renamed from: n */
    public c k() {
        if (this.f19155o == null) {
            this.f19155o = new c(this.f19153m, this.f19154n);
        }
        return this.f19155o;
    }

    public void o(int i10) {
        this.f19153m.setImageViewResource(this.f19154n, i10);
        p();
    }

    public abstract void p();
}
