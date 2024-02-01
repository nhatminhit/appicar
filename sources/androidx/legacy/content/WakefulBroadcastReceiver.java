package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

@Deprecated
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2740a = "androidx.contentpager.content.wakelockid";

    /* renamed from: b  reason: collision with root package name */
    public static final SparseArray<PowerManager.WakeLock> f2741b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public static int f2742c = 1;

    public static boolean a(Intent intent) {
        int intExtra = intent.getIntExtra(f2740a, 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f2741b;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No active wake lock id #");
            sb2.append(intExtra);
            return true;
        }
    }

    public static ComponentName b(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f2741b;
        synchronized (sparseArray) {
            int i10 = f2742c;
            int i11 = i10 + 1;
            f2742c = i11;
            if (i11 <= 0) {
                f2742c = 1;
            }
            intent.putExtra(f2740a, i10);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            sparseArray.put(i10, newWakeLock);
            return startService;
        }
    }
}
