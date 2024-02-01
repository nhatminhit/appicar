package d9;

import android.app.PendingIntent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import d.m0;
import d.w0;
import f8.a;
import f8.l;
import h9.m;

public interface c extends l<a.d.C0128d> {
    @w0(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @m0
    m<Void> e(@m0 PendingIntent pendingIntent);

    @m0
    m<Void> f(@m0 PendingIntent pendingIntent);

    @w0(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @m0
    m<Void> h(@m0 ActivityTransitionRequest activityTransitionRequest, @m0 PendingIntent pendingIntent);

    @w0(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @m0
    m<Void> r(@m0 PendingIntent pendingIntent);

    @w0(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @m0
    m<Void> s(@m0 PendingIntent pendingIntent, @m0 SleepSegmentRequest sleepSegmentRequest);

    @w0(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @m0
    m<Void> u(long j10, @m0 PendingIntent pendingIntent);
}
