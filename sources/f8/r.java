package f8;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.common.api.Status;
import d.m0;

public class r extends b {
    public r(@m0 Status status) {
        super(status);
    }

    @m0
    public PendingIntent d() {
        return a().Z0();
    }

    public void e(@m0 Activity activity, int i10) throws IntentSender.SendIntentException {
        a().A1(activity, i10);
    }
}
