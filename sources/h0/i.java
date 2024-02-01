package h0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import d.m0;

public final class i {
    public static void a(@m0 AlarmManager alarmManager, long j10, @m0 PendingIntent pendingIntent, @m0 PendingIntent pendingIntent2) {
        alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j10, pendingIntent), pendingIntent2);
    }

    public static void b(@m0 AlarmManager alarmManager, int i10, long j10, @m0 PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i10, j10, pendingIntent);
    }

    public static void c(@m0 AlarmManager alarmManager, int i10, long j10, @m0 PendingIntent pendingIntent) {
        alarmManager.setExact(i10, j10, pendingIntent);
    }

    public static void d(@m0 AlarmManager alarmManager, int i10, long j10, @m0 PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(i10, j10, pendingIntent);
    }
}
