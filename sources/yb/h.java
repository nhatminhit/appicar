package yb;

import android.content.DialogInterface;
import com.journeyapps.barcodescanner.a;

public final /* synthetic */ class h implements DialogInterface.OnCancelListener {
    public final /* synthetic */ a O;

    public /* synthetic */ h(a aVar) {
        this.O = aVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.O.s(dialogInterface);
    }
}
