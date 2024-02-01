package z8;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public final class n implements View.OnClickListener {
    public final /* synthetic */ Context O;
    public final /* synthetic */ Intent P;

    public n(Context context, Intent intent) {
        this.O = context;
        this.P = intent;
    }

    public final void onClick(View view) {
        try {
            this.O.startActivity(this.P);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
