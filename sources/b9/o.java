package b9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import d.o0;
import i0.d;

public final class o extends d {
    @o0
    @Deprecated
    public static Intent v(Context context, @o0 BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (!m.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, true != m.a() ? 0 : 2);
    }
}
