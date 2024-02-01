package h0;

import android.app.Service;
import android.os.Build;
import d.m0;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class x2 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8792a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f8793b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f8794c = 2;

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static void a(@m0 Service service, int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            service.stopForeground(i10);
            return;
        }
        boolean z10 = true;
        if ((i10 & 1) == 0) {
            z10 = false;
        }
        service.stopForeground(z10);
    }
}
