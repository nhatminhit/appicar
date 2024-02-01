package j8;

import android.app.Activity;
import android.content.Intent;

public final class i0 extends l0 {
    public final /* synthetic */ Intent O;
    public final /* synthetic */ Activity P;
    public final /* synthetic */ int Q;

    public i0(Intent intent, Activity activity, int i10) {
        this.O = intent;
        this.P = activity;
        this.Q = i10;
    }

    public final void a() {
        Intent intent = this.O;
        if (intent != null) {
            this.P.startActivityForResult(intent, this.Q);
        }
    }
}
