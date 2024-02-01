package j8;

import android.content.Intent;
import androidx.fragment.app.Fragment;

public final class j0 extends l0 {
    public final /* synthetic */ Intent O;
    public final /* synthetic */ Fragment P;
    public final /* synthetic */ int Q;

    public j0(Intent intent, Fragment fragment, int i10) {
        this.O = intent;
        this.P = fragment;
        this.Q = i10;
    }

    public final void a() {
        Intent intent = this.O;
        if (intent != null) {
            this.P.startActivityForResult(intent, this.Q);
        }
    }
}
