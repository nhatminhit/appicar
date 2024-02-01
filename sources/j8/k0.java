package j8;

import android.content.Intent;
import g8.h;

public final class k0 extends l0 {
    public final /* synthetic */ Intent O;
    public final /* synthetic */ h P;

    public k0(Intent intent, h hVar, int i10) {
        this.O = intent;
        this.P = hVar;
    }

    public final void a() {
        Intent intent = this.O;
        if (intent != null) {
            this.P.startActivityForResult(intent, 2);
        }
    }
}
