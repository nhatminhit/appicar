package w7;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import d.a1;
import d.o0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressLint({"InlinedApi"})
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final int f14870a = -1000;

    /* renamed from: b  reason: collision with root package name */
    public static final int f14871b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f14872c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f14873d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f14874e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f14875f = 4;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Deprecated
    public static void a(Context context, String str, @a1 int i10, int i11) {
        b(context, str, i10, 0, i11);
    }

    public static void b(Context context, String str, @a1 int i10, @a1 int i11, int i12) {
        if (q0.f14786a >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i10), i12);
            if (i11 != 0) {
                notificationChannel.setDescription(context.getString(i11));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static void c(Context context, int i10, @o0 Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notification != null) {
            notificationManager.notify(i10, notification);
        } else {
            notificationManager.cancel(i10);
        }
    }
}
