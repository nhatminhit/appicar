package r7;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.exoplayer2.ui.b;
import d.o0;
import d.u;
import java.util.List;

@Deprecated
public final class d {
    public static Notification a(Context context, @u int i10, String str, @o0 PendingIntent pendingIntent, @o0 String str2) {
        return new b(context, str).a(i10, pendingIntent, str2);
    }

    public static Notification b(Context context, @u int i10, String str, @o0 PendingIntent pendingIntent, @o0 String str2) {
        return new b(context, str).b(i10, pendingIntent, str2);
    }

    public static Notification c(Context context, @u int i10, String str, @o0 PendingIntent pendingIntent, @o0 String str2, List<z6.d> list) {
        return new b(context, str).e(i10, pendingIntent, str2, list);
    }
}
