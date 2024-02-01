package p2;

import android.app.Notification;
import android.app.Notification$DecoratedMediaCustomViewStyle;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.media.o;
import d.t0;
import d.x0;
import h0.u0;
import h0.w;

public class a {

    /* renamed from: p2.a$a  reason: collision with other inner class name */
    public static class C0195a extends b {
        public int E(int i10) {
            return i10 <= 3 ? o.g.notification_template_big_media_narrow_custom : o.g.notification_template_big_media_custom;
        }

        public int F() {
            return this.f8696a.s() != null ? o.g.notification_template_media_custom : super.F();
        }

        public final void L(RemoteViews remoteViews) {
            remoteViews.setInt(o.e.status_bar_latest_event_content, "setBackgroundColor", this.f8696a.r() != 0 ? this.f8696a.r() : this.f8696a.f8617a.getResources().getColor(o.b.notification_material_background_media_default_color));
        }

        @x0({x0.a.LIBRARY_GROUP})
        public void b(w wVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                wVar.a().setStyle(A(new Notification$DecoratedMediaCustomViewStyle()));
            } else {
                super.b(wVar);
            }
        }

        @x0({x0.a.LIBRARY_GROUP})
        public RemoteViews v(w wVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews p10 = this.f8696a.p() != null ? this.f8696a.p() : this.f8696a.s();
            if (p10 == null) {
                return null;
            }
            RemoteViews B = B();
            e(B, p10);
            L(B);
            return B;
        }

        @x0({x0.a.LIBRARY_GROUP})
        public RemoteViews w(w wVar) {
            RemoteViews remoteViews = null;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            boolean z10 = true;
            boolean z11 = this.f8696a.s() != null;
            if (!z11 && this.f8696a.p() == null) {
                z10 = false;
            }
            if (z10) {
                remoteViews = C();
                if (z11) {
                    e(remoteViews, this.f8696a.s());
                }
                L(remoteViews);
            }
            return remoteViews;
        }

        @x0({x0.a.LIBRARY_GROUP})
        public RemoteViews x(w wVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews v10 = this.f8696a.v() != null ? this.f8696a.v() : this.f8696a.s();
            if (v10 == null) {
                return null;
            }
            RemoteViews B = B();
            e(B, v10);
            L(B);
            return B;
        }
    }

    public static class b extends u0.p {

        /* renamed from: i  reason: collision with root package name */
        public static final int f11359i = 3;

        /* renamed from: j  reason: collision with root package name */
        public static final int f11360j = 5;

        /* renamed from: e  reason: collision with root package name */
        public int[] f11361e = null;

        /* renamed from: f  reason: collision with root package name */
        public MediaSessionCompat.Token f11362f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f11363g;

        /* renamed from: h  reason: collision with root package name */
        public PendingIntent f11364h;

        public b() {
        }

        public b(u0.g gVar) {
            z(gVar);
        }

        public static MediaSessionCompat.Token G(Notification notification) {
            Parcelable parcelable;
            Bundle n10 = u0.n(notification);
            if (n10 == null || (parcelable = n10.getParcelable(u0.Z)) == null) {
                return null;
            }
            return MediaSessionCompat.Token.b(parcelable);
        }

        @t0(21)
        public Notification.MediaStyle A(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.f11361e;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.f11362f;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.f());
            }
            return mediaStyle;
        }

        public RemoteViews B() {
            int min = Math.min(this.f8696a.f8618b.size(), 5);
            RemoteViews c10 = c(false, E(min), false);
            c10.removeAllViews(o.e.media_actions);
            if (min > 0) {
                for (int i10 = 0; i10 < min; i10++) {
                    c10.addView(o.e.media_actions, D(this.f8696a.f8618b.get(i10)));
                }
            }
            if (this.f11363g) {
                int i11 = o.e.cancel_action;
                c10.setViewVisibility(i11, 0);
                c10.setInt(i11, "setAlpha", this.f8696a.f8617a.getResources().getInteger(o.f.cancel_button_image_alpha));
                c10.setOnClickPendingIntent(i11, this.f11364h);
            } else {
                c10.setViewVisibility(o.e.cancel_action, 8);
            }
            return c10;
        }

        public RemoteViews C() {
            RemoteViews c10 = c(false, F(), true);
            int size = this.f8696a.f8618b.size();
            int[] iArr = this.f11361e;
            int min = iArr == null ? 0 : Math.min(iArr.length, 3);
            c10.removeAllViews(o.e.media_actions);
            if (min > 0) {
                int i10 = 0;
                while (i10 < min) {
                    if (i10 < size) {
                        c10.addView(o.e.media_actions, D(this.f8696a.f8618b.get(this.f11361e[i10])));
                        i10++;
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i10), Integer.valueOf(size - 1)}));
                    }
                }
            }
            if (this.f11363g) {
                c10.setViewVisibility(o.e.end_padder, 8);
                int i11 = o.e.cancel_action;
                c10.setViewVisibility(i11, 0);
                c10.setOnClickPendingIntent(i11, this.f11364h);
                c10.setInt(i11, "setAlpha", this.f8696a.f8617a.getResources().getInteger(o.f.cancel_button_image_alpha));
            } else {
                c10.setViewVisibility(o.e.end_padder, 0);
                c10.setViewVisibility(o.e.cancel_action, 8);
            }
            return c10;
        }

        public final RemoteViews D(u0.b bVar) {
            boolean z10 = bVar.a() == null;
            RemoteViews remoteViews = new RemoteViews(this.f8696a.f8617a.getPackageName(), o.g.notification_media_action);
            int i10 = o.e.action0;
            remoteViews.setImageViewResource(i10, bVar.e());
            if (!z10) {
                remoteViews.setOnClickPendingIntent(i10, bVar.a());
            }
            remoteViews.setContentDescription(i10, bVar.j());
            return remoteViews;
        }

        public int E(int i10) {
            return i10 <= 3 ? o.g.notification_template_big_media_narrow : o.g.notification_template_big_media;
        }

        public int F() {
            return o.g.notification_template_media;
        }

        public b H(PendingIntent pendingIntent) {
            this.f11364h = pendingIntent;
            return this;
        }

        public b I(MediaSessionCompat.Token token) {
            this.f11362f = token;
            return this;
        }

        public b J(int... iArr) {
            this.f11361e = iArr;
            return this;
        }

        public b K(boolean z10) {
            return this;
        }

        @x0({x0.a.LIBRARY_GROUP})
        public void b(w wVar) {
            wVar.a().setStyle(A(new Notification.MediaStyle()));
        }

        @x0({x0.a.LIBRARY_GROUP})
        public RemoteViews v(w wVar) {
            return null;
        }

        @x0({x0.a.LIBRARY_GROUP})
        public RemoteViews w(w wVar) {
            return null;
        }
    }
}
