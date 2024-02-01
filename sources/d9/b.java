package d9;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import d.m0;
import d.w0;
import f8.k;
import f8.o;

@Deprecated
public interface b {
    @w0(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @m0
    o<Status> a(@m0 k kVar, long j10, @m0 PendingIntent pendingIntent);

    @w0(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @m0
    o<Status> b(@m0 k kVar, @m0 PendingIntent pendingIntent);
}
